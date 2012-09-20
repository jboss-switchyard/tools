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

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
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

/**
 * SwitchYardProjectValidator
 * 
 * <p/>
 * WST V2 validator supporting SwitchYard projects.
 */
public class SwitchYardProjectValidator extends AbstractValidator {

    /** ID for SwitchYard specific problem markers. */
    public static final String SWITCHYARD_MARKER_ID = "org.switchyard.tools.ui.problemMarker";

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
                result.setDependsOn(new IResource[] {switchYardOutput });
                if (!switchYardOutput.exists()
                        || switchYardOutput.getModificationStamp() < event.getResource().getModificationStamp()
                        || (event.getDependsOn() != null && (event.getDependsOn().getKind() & IResourceDelta.REMOVED) != 0)) {
                    // prevent a build until the output file is updated
                    return result;
                }
            }
        } else {
            switchYardOutput = event.getResource();
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
                ValidatorMessage message = ValidatorMessage.create("Invalid switchyard.xml file", event.getResource());
                message.setType(SWITCHYARD_MARKER_ID);
                result.add(message);
            } else {
                IBatchValidator validator = ModelValidationService.getInstance().newValidator(EvaluationMode.BATCH);
                processStatus(validator.validate(resource.getContents(), monitor), event.getResource(), result,
                        !switchYardOutput.equals(event.getResource()));
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
                    relatedUris.append(getURIStringForObject(eobject, patchURIs)).append(" ");
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
            return URI.createGenericURI("switchyard", "generated", objectURI.fragment()).toString();
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

}
