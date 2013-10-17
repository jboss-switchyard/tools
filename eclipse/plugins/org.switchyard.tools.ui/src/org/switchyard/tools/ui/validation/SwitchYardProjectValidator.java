/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.validation;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.validation.marker.MarkerUtil;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.wst.validation.AbstractValidator;
import org.eclipse.wst.validation.ValidationEvent;
import org.eclipse.wst.validation.ValidationResult;
import org.eclipse.wst.validation.ValidationState;
import org.eclipse.wst.validation.ValidatorMessage;
import org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceFactoryImpl;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.common.ISwitchYardProject;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * SwitchYardProjectValidator
 * 
 * <p/>
 * WST V2 validator supporting SwitchYard projects.
 */
public class SwitchYardProjectValidator extends AbstractValidator {

    /** ID for SwitchYard specific problem markers. */
    public static final String SWITCHYARD_MARKER_ID = "org.switchyard.tools.ui.problemMarker"; //$NON-NLS-1$

    /**
     * Get the SwitchYard model object from the resource.
     * 
     * @param resource the resource
     * @return the SwitchYard model in the resource; null if not present
     */
    public static SwitchYardType getSwitchYard(Resource resource) {
        if (resource == null || resource.getContents().isEmpty()) {
            return null;
        }
        EObject docroot = resource.getContents().get(0);
        if (docroot instanceof DocumentRoot) {
            return ((DocumentRoot) docroot).getSwitchyard();
        } else if (docroot instanceof SwitchYardType) {
            return (SwitchYardType) docroot;
        }
        return null;
    }

    @Override
    public ValidationResult validate(ValidationEvent event, ValidationState state, IProgressMonitor monitor) {
        ValidationResult result = new ValidationResult();

        if ((event.getKind() & IResourceDelta.REMOVED) != 0 || event.getResource().isDerived(IResource.CHECK_ANCESTORS)) {
            return result;
        }

        ISwitchYardProject switchYardProject = SwitchYardProjectManager.instance().getSwitchYardProject(
                event.getResource().getProject());
        if (switchYardProject.needsLoading()) {
            switchYardProject.load(new NullProgressMonitor());
        }
        IResource switchYardOutput = switchYardProject.getOutputSwitchYardConfigurationFile();
        if (event.getResource().equals(switchYardProject.getSwitchYardConfigurationFile())) {
            if (switchYardOutput == null) {
                // couldn't locate the output file, so just validate the input.
                switchYardOutput = event.getResource();
            } else {
                /*
                 * TODO: see if we need to add the pom.xml as a dependency (to
                 * make sure we revalidate capability usage). i assume a build
                 * will be kicked off if the pom changes, which should produce a
                 * new output switchyard.xml, so...
                 */
                result.setDependsOn(new IResource[] {switchYardOutput });
                if (!switchYardOutput.exists()
                        || switchYardOutput.getModificationStamp() < event.getResource().getModificationStamp()
                        || (event.getDependsOn() != null
                                && (event.getDependsOn().getKind() & IResourceDelta.REMOVED) != 0 && event
                                .getDependsOn().findMember(switchYardOutput.getFullPath()) != null)) {
                    // prevent a build until the output file is updated
                    return result;
                }
            }
        } else {
            switchYardOutput = event.getResource();
        }

        try {
            // remove switchyard markers
            event.getResource().deleteMarkers(SWITCHYARD_MARKER_ID, true, IResource.DEPTH_ZERO);
        } catch (CoreException e) {
            Activator.getDefault().getLog().log(e.getStatus());
        }

        ResourceSet rs = new ResourceSetImpl();
        Resource resource = rs.createResource(
                URI.createPlatformResourceURI(switchYardOutput.getFullPath().toString(), false),
                SwitchyardResourceFactoryImpl.CONTENT_TYPE);
        try {
            resource.load(null);
        } catch (IOException e) {
            e.fillInStackTrace();
        }
        try {
            if (resource.getContents().isEmpty()) {
                ValidatorMessage message = ValidatorMessage.create(Messages.SwitchYardProjectValidator_validatorMessage_InvalidSYXMLFile, event.getResource());
                message.setType(SWITCHYARD_MARKER_ID);
                result.add(message);
            } else {
                IBatchValidator validator = ModelValidationService.getInstance().newValidator(EvaluationMode.BATCH);
                ValidationAdapter adapter = new ValidationAdapter(switchYardOutput, result.getDependsOn());
                resource.eAdapters().add(adapter);
                processStatus(validator.validate(resource.getContents(), monitor), event.getResource(), result,
                        !switchYardOutput.equals(event.getResource()));
                result.setDependsOn(adapter._dependencies.toArray(new IResource[adapter._dependencies.size()]));
            }
            return result;
        } finally {
            resource.unload();
        }
    }

    private void processStatus(IStatus status, IResource resource, ValidationResult result, boolean patchURIs) {
        if (status.isMultiStatus()) {
            for (IStatus child : status.getChildren()) {
                processStatus(child, resource, result, patchURIs);
            }
        } else if (!status.isOK()) {
            result.add(createValidationMessage(status, resource, patchURIs));
        }
    }

    private ValidatorMessage createValidationMessage(IStatus status, IResource resource, boolean patchURIs) {
        ValidatorMessage message = ValidatorMessage.create(status.getMessage(), resource);
        switch (status.getSeverity()) {
        case IStatus.INFO:
            message.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
            break;
        case IStatus.WARNING:
            message.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
            break;
        case IStatus.ERROR:
        case IStatus.CANCEL:
            message.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
            break;
        }

        if (status instanceof IConstraintStatus) {
            IConstraintStatus ics = (IConstraintStatus) status;
            message.setAttribute(EValidator.URI_ATTRIBUTE, getURIStringForObject(ics.getTarget(), patchURIs));
            message.setAttribute(MarkerUtil.RULE_ATTRIBUTE, ics.getConstraint().getDescriptor().getId());
            message.setAttribute(ValidationProblem.PROBLEM_CODE, ics.getCode());
            if (ics.getResultLocus().size() > 0) {
                StringBuffer relatedUris = new StringBuffer();
                for (EObject eobject : ics.getResultLocus()) {
                    relatedUris.append(getURIStringForObject(eobject, patchURIs)).append(" "); //$NON-NLS-1$
                }
                relatedUris.deleteCharAt(relatedUris.length() - 1);
                message.setAttribute(EValidator.RELATED_URIS_ATTRIBUTE, relatedUris.toString());
            }
        }

        message.setType(SWITCHYARD_MARKER_ID);

        return message;
    }

    private String getURIStringForObject(EObject object, boolean patchURI) {
        final URI objectURI = EcoreUtil.getURI(object);
        if (patchURI) {
            return URI.createGenericURI("switchyard", "generated", objectURI.fragment()).toString(); //$NON-NLS-1$ //$NON-NLS-2$
        }
        return objectURI.toString();
    }

    @Override
    public void clean(IProject project, ValidationState state, IProgressMonitor monitor) {
        super.clean(project, state, monitor);
        try {
            project.deleteMarkers(SWITCHYARD_MARKER_ID, true, IProject.DEPTH_INFINITE);
        } catch (CoreException e) {
            Activator.getDefault().getLog().log(e.getStatus());
        }
    }

    /**
     * EMF adapter which provides contextual information for use by SwitchYard
     * constraint validators.
     */
    public static final class ValidationAdapter extends AdapterImpl {
        private final Set<IResource> _dependencies = new LinkedHashSet<IResource>();
        private final IProject _project;
        private IJavaProject _javaProject;

        /**
         * @param project containing project
         */
        public ValidationAdapter(IProject project) {
            this(project, null);
        }

        private ValidationAdapter(IResource switchYardFile, IResource[] dependencies) {
            this(switchYardFile.getProject(), dependencies);
        }
        
        private ValidationAdapter(IProject project, IResource[] dependencies) {
            _project = project;
            if (dependencies != null) {
                _dependencies.addAll(Arrays.asList(dependencies));
            }
        }

        /**
         * @return the project within which the switchyard.xml file is contained.
         */
        public IProject getProject() {
            return _project;
        }

        /**
         * @return the Java project associated with the switchyard.xml file
         *         being validated.
         */
        public synchronized IJavaProject getJavaProject() {
            if (_javaProject == null) {
                _javaProject = JavaCore.create(_project);
            }
            return _javaProject;
        }

        /**
         * Add a resource that, when updated, should trigger a validation of the
         * switchyard.xml file.
         * 
         * @param dependency a dependency of the switchyard.xml file.
         */
        public void addDependency(IResource dependency) {
            if (dependency != null) {
                _dependencies.add(dependency);
            }
        }

        @Override
        public boolean isAdapterForType(Object type) {
            return type == getClass();
        }
    }
}
