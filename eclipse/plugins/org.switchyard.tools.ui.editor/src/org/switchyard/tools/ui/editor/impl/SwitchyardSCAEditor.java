/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.util.EditUIMarkerHelper;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.validation.marker.MarkerUtil;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.emf.validation.model.IModelConstraint;
import org.eclipse.emf.validation.service.ConstraintFactory;
import org.eclipse.emf.validation.service.ConstraintRegistry;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.editor.DefaultPersistencyBehavior;
import org.eclipse.graphiti.ui.editor.DefaultUpdateBehavior;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.graphiti.ui.internal.services.GraphitiUiInternal;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IGotoMarker;
import org.open.oasis.docs.ns.opencsa.sca.bpel.BPELPackage;
import org.switchyard.tools.models.switchyard1_0.bean.BeanPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.clojure.ClojurePackage;
import org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage;
import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.transform.TransformPackage;
import org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.validation.SwitchYardProjectValidator;
import org.switchyard.tools.ui.validation.ValidationStatusAdapter;
import org.switchyard.tools.ui.validation.ValidationStatusAdapterFactory;

/**
 * @author bfitzpat
 * 
 */
@SuppressWarnings("restriction")
public class SwitchyardSCAEditor extends DiagramEditor implements IGotoMarker {

    /**
     * Editor ID.
     */
    public static final String EDITOR_ID = "org.switchyard.tools.ui.editor.switchyard.editor";

    /**
     * Property contributor id.
     */
    public static final String CONTRIBUTOR_ID = "org.switchyard.tools.ui.editor.diagram.PropertyContributor";

    private URI _modelUri;
    private URI _diagramUri;

    private IFile _modelFile;
    private IFile _targetModelFile;
    private IFile _diagramFile;
    private IResourceChangeListener _workspaceListener;

    private static SwitchyardSCAEditor activeEditor;

    private SwitchyardSCAEditorAdapter _editorAdapter;

    protected class SwitchyardSCAEditorAdapter implements Adapter {
        public Notifier getTarget() {
            return null;
        }

        public void setTarget(Notifier newTarget) {
        }

        public boolean isAdapterForType(Object type) {
            return (type == SwitchyardSCAEditorAdapter.class);
        }

        public void notifyChanged(Notification notification) {
        }

        public SwitchyardSCAEditor getSwitchyardEditor() {
            return SwitchyardSCAEditor.this;
        }
    }

    /**
     * Given a ResourceSet, this helper identifies the BPELEditor (if any) that
     * created it.
     * 
     * @param object instance to check for editor
     * @return this editor
     */
    public static SwitchyardSCAEditor getEditor(EObject object) {
        if (object != null && object.eResource() != null) {
            return getEditor(object.eResource().getResourceSet());
        }
        return null;
    }

    /**
     * @return this editor
     */
    public static SwitchyardSCAEditor getActiveEditor() {
        return activeEditor;
    }

    private void setActiveEditor(SwitchyardSCAEditor editor) {
        activeEditor = editor;
    }

    /**
     * @param resourceSet resource set
     * @return editor instance
     */
    public static SwitchyardSCAEditor getEditor(ResourceSet resourceSet) {
        Iterator<Adapter> it = resourceSet.eAdapters().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof SwitchyardSCAEditorAdapter) {
                return ((SwitchyardSCAEditorAdapter) next).getSwitchyardEditor();
            }
        }
        return null;
    }

    protected SwitchyardSCAEditorAdapter getEditorAdapter() {
        return _editorAdapter;
    }

    @Override
    public void init(IEditorSite site, IEditorInput input) throws PartInitException {
        setActiveEditor(this);
        super.init(site, input);
    }

    @Override
    protected DefaultPersistencyBehavior createPersistencyBehavior() {
        return new DefaultPersistencyBehavior(this) {
            @Override
            public Diagram loadDiagram(URI modelUri) {
                if (modelUri == null) {
                    return null;
                }
                _modelUri = modelUri;

                // load switchyard.xml
                final Resource switchYardResource = getEditingDomain().getResourceSet().createResource(
                        modelUri.trimFragment(), "org.switchyard.tools.ui.editor.content-type.xml");

                _modelFile = WorkspaceSynchronizer.getFile(switchYardResource);

                try {
                    switchYardResource.load(getEditingDomain().getResourceSet().getLoadOptions());
                } catch (IOException e) {
                    ErrorUtils.showErrorWithLogging(new Status(Status.ERROR, Activator.PLUGIN_ID,
                            "Could not load file: " + modelUri + ".  " + e.getLocalizedMessage()));
                    return null;
                }

                // read in the markers
                try {
                    loadValidationStatus(Arrays.asList(_modelFile.findMarkers(
                            SwitchYardProjectValidator.SWITCHYARD_MARKER_ID, true, IResource.DEPTH_ZERO)));
                } catch (CoreException e) {
                    Activator.logStatus(e.getStatus());
                }

                // get the diagram url
                _diagramUri = convertModelURIToDiagramURI(modelUri);

                // make sure the correct resource type gets created (not sure if
                // this is necessary)
                final Resource diagramResource = getEditingDomain().getResourceSet().createResource(_diagramUri,
                        "org.eclipse.graphiti.content.diagram");

                // load the diagram
                Diagram diagram = super.loadDiagram(GraphitiUiInternal.getEmfService().mapDiagramFileUriToDiagramUri(
                        _diagramUri));
                if (diagram == null) {
                    // create the diagram
                    diagram = Graphiti.getPeCreateService().createDiagram("org.switchyard.tools.ui.editor.diagram",
                            _modelFile.getName(), true);

                    // link the switchyard model to the diagram
                    PictogramLink link = PictogramsFactory.eINSTANCE.createPictogramLink();
                    link.setPictogramElement(diagram);
                    link.getBusinessObjects().addAll(switchYardResource.getContents());
                    diagram.getPictogramLinks().add(link);

                    // add the diagram to the resource
                    final Diagram newDiagram = diagram;
                    getEditingDomain().getCommandStack().execute(new RecordingCommand(getEditingDomain()) {
                        @Override
                        public String getLabel() {
                            return "Create Diagram";
                        }

                        @Override
                        protected void doExecute() {
                            diagramResource.getContents().add(newDiagram);
                        }
                    });
                } else {
                    final Diagram finalDiagram = diagram;
                    // clean out links that can't be resolved
                    getEditingDomain().getCommandStack().execute(new RecordingCommand(getEditingDomain()) {
                        @Override
                        public String getLabel() {
                            return "Remove Dangling References";
                        }

                        @Override
                        protected void doExecute() {
                            for (PictogramLink link : finalDiagram.getPictogramLinks()) {
                                for (EObject object : new ArrayList<EObject>(link.getBusinessObjects())) {
                                    if (object.eContainer() == null && object.eResource() == null) {
                                        link.getBusinessObjects().remove(object);
                                    }
                                }
                            }
                            // make sure the diagram is linked to the switchyard
                            // model
                            PictogramLink diagramLink = finalDiagram.getLink();
                            if (diagramLink == null) {
                                diagramLink = PictogramsFactory.eINSTANCE.createPictogramLink();
                                diagramLink.setPictogramElement(finalDiagram);
                                finalDiagram.getPictogramLinks().add(diagramLink);
                            }
                            diagramLink.getBusinessObjects().addAll(switchYardResource.getContents());
                        }
                    });
                }

                // won't allow undo of any previous actions
                getEditingDomain().getCommandStack().flush();

                addWorkspaceListener();

                return diagram;
            }
        };
    }

    private Set<EObject> loadValidationStatus(List<IMarker> markers) {
        if (markers == null) {
            return Collections.emptySet();
        }
        Set<EObject> touched = new LinkedHashSet<EObject>();
        for (IMarker marker : markers) {
            final EObject markedObject = getTargetObject(marker);
            if (markedObject == null) {
                continue;
            }
            ValidationStatusAdapter statusAdapter = (ValidationStatusAdapter) EcoreUtil.getRegisteredAdapter(
                    markedObject, ValidationStatusAdapter.class);
            statusAdapter.addValidationStatus(convertMarker(marker, markedObject));
            touched.add(markedObject);
        }
        return touched;
    }

    private EObject getTargetObject(IMarker marker) {
        final String uriString = marker.getAttribute(EValidator.URI_ATTRIBUTE, null);
        final URI uri = uriString == null ? null : URI.createURI(uriString);
        if (uri == null) {
            return null;
        }
        return getEditingDomain().getResourceSet().getEObject(uri, false);
    }

    @SuppressWarnings("unchecked")
    private IStatus convertMarker(IMarker marker, EObject target) {
        final String message = marker.getAttribute(IMarker.MESSAGE, "");
        final String constraintId = marker.getAttribute(MarkerUtil.RULE_ATTRIBUTE, null);
        final IConstraintDescriptor icd = constraintId == null ? null : ConstraintRegistry.getInstance().getDescriptor(
                constraintId);
        final IModelConstraint imc = icd == null ? null : ConstraintFactory.getInstance().newConstraint(icd);
        if (imc == null) {
            final int severity;
            switch (marker.getAttribute(IMarker.SEVERITY, -1)) {
            case IMarker.SEVERITY_INFO:
                severity = IStatus.INFO;
                break;
            case IMarker.SEVERITY_WARNING:
                severity = IStatus.WARNING;
                break;
            case IMarker.SEVERITY_ERROR:
                severity = IStatus.ERROR;
                break;
            default:
                severity = IStatus.OK;
            }
            return new Status(severity, Activator.PLUGIN_ID, message);
        }
        List<?> locus = new EditUIMarkerHelper().getTargetObjects(getEditingDomain(), marker);
        for (Iterator<?> it = locus.iterator(); it.hasNext();) {
            if (!(it.next() instanceof EObject)) {
                it.remove();
            }
        }
        return new ConstraintStatus(imc, target, message, locus == null ? null : new LinkedHashSet<EObject>(
                (List<? extends EObject>) locus));
    }

    private URI convertModelURIToDiagramURI(URI modelUri) {
        IPath diagramFilePath = _modelFile.getProject().getFullPath().append(".xml")
                .append(_modelFile.getFullPath().removeFirstSegments(1)).addFileExtension("diagram");
        _diagramFile = _modelFile.getWorkspace().getRoot().getFile(diagramFilePath);
        return URI.createPlatformResourceURI(diagramFilePath.toString(), true);
    }

    @Override
    protected DefaultUpdateBehavior createUpdateBehavior() {
        return new DefaultUpdateBehavior(this) {
            @Override
            protected void initializeEditingDomain(TransactionalEditingDomain domain) {
                ResourceSet resourceSet = domain.getResourceSet();

                // add the adapter factory for tracking validation status
                resourceSet.getAdapterFactories().add(new ValidationStatusAdapterFactory());

                // add the editor adapter
                _editorAdapter = new SwitchyardSCAEditorAdapter();
                resourceSet.eAdapters().add(_editorAdapter);

                super.initializeEditingDomain(domain);
            }

            @Override
            public void dispose() {
                getEditingDomain().getResourceSet().eAdapters().remove(_editorAdapter);
                super.dispose();
            }
        };
    }

    @Override
    protected PictogramElement[] getPictogramElementsForSelection() {
        // filter out invisible elements when setting selection
        ArrayList<PictogramElement> visibleList = new ArrayList<PictogramElement>();
        PictogramElement[] pictogramElements = super.getPictogramElementsForSelection();
        if (pictogramElements == null) {
            return null;
        }
        for (PictogramElement pe : pictogramElements) {
            if (pe.isVisible()) {
                visibleList.add(pe);
            }
        }
        return visibleList.toArray(new PictogramElement[visibleList.size()]);
    }

    @Override
    public void selectionChanged(IWorkbenchPart part, ISelection selection) {
        if (part == this) {
            setActiveEditor(this);
        }
        super.selectionChanged(part, selection);
    }

    @Override
    public void dispose() {
        // clear ID mapping tables if no more instances of editor are active
        int instances = 0;
        IWorkbenchPage[] pages = getEditorSite().getWorkbenchWindow().getPages();
        for (IWorkbenchPage p : pages) {
            IEditorReference[] refs = p.getEditorReferences();
            instances += refs.length;
        }
        // ModelUtil.clearIDs(modelHandler.getResource(), instances==0);
        // getResourceSet().eAdapters().remove(getEditorAdapter());
        if (instances == 0) {
            setActiveEditor(null);
        }

        removeWorkspaceListener();

        super.dispose();
        // get rid of temp files and folders, button only if the workbench is
        // being shut down.
        // when the workbench is restarted, we need to have those temp files
        // around!
        // if (!_workbenchShutdown) {
        // SwitchyardSCADiagramCreator.dispose(_diagramFile);
        // }
        // removeWorkbenchListener();
        // getPreferences().dispose();
    }

    @Override
    public void gotoMarker(IMarker marker) {
        final EObject target = getTargetObject(marker);
        if (target == null) {
            return;
        }
        final PictogramElement pe = getDiagramTypeProvider().getFeatureProvider().getPictogramElementForBusinessObject(
                target);
        if (pe == null) {
            return;
        }
        selectPictogramElements(new PictogramElement[] {pe });
    }

    /**
     * @return file
     */
    public IFile getModelFile() {
        return _modelFile;
    }

    /**
     * @return target model file
     */
    public IFile getTargetModelFile() {
        if (_targetModelFile == null) {
            IPath targetPath = new Path("target/classes/META-INF/switchyard.xml");
            try {
                _modelFile.getProject().refreshLocal(IProject.DEPTH_INFINITE, null);
                IFile target = _modelFile.getProject().getFile(targetPath);
                if (target != null) {
                    _targetModelFile = target;
                }
            } catch (CoreException e) {
                e.fillInStackTrace();
            }
        }
        return _targetModelFile;
    }

    private void addWorkspaceListener() {
        if (_workspaceListener == null) {
            _workspaceListener = new IResourceChangeListener() {
                @Override
                public void resourceChanged(IResourceChangeEvent event) {
                    final IResourceDelta modelFileDelta = event.getDelta().findMember(_modelFile.getFullPath());
                    if (modelFileDelta == null) {
                        return;
                    }
                    final IMarkerDelta[] markerDeltas = modelFileDelta.getMarkerDeltas();
                    if (markerDeltas == null || markerDeltas.length == 0) {
                        return;
                    }

                    final List<IMarker> newMarkers = new ArrayList<IMarker>();
                    final Set<String> deletedMarkers = new HashSet<String>();
                    for (IMarkerDelta markerDelta : markerDeltas) {
                        switch (markerDelta.getKind()) {
                        case IResourceDelta.ADDED:
                            newMarkers.add(markerDelta.getMarker());
                            break;
                        case IResourceDelta.CHANGED:
                            newMarkers.add(markerDelta.getMarker());
                            // fall through
                        case IResourceDelta.REMOVED:
                            final String uri = markerDelta.getAttribute(EValidator.URI_ATTRIBUTE, null);
                            if (uri != null) {
                                deletedMarkers.add(uri);
                            }
                        }
                    }

                    final Set<EObject> updatedObjects = new LinkedHashSet<EObject>();
                    for (String uri : deletedMarkers) {
                        final EObject eobject = getEditingDomain().getResourceSet().getEObject(URI.createURI(uri),
                                false);
                        if (eobject == null) {
                            continue;
                        }
                        final ValidationStatusAdapter adapter = (ValidationStatusAdapter) EcoreUtil
                                .getRegisteredAdapter(eobject, ValidationStatusAdapter.class);
                        if (adapter == null) {
                            continue;
                        }
                        adapter.clearValidationStatus();
                        updatedObjects.add(eobject);
                    }
                    updatedObjects.addAll(loadValidationStatus(newMarkers));
                    getEditorSite().getShell().getDisplay().asyncExec(new Runnable() {
                        public void run() {
                            for (EObject eobject : updatedObjects) {
                                PictogramElement pe = getDiagramTypeProvider().getFeatureProvider()
                                        .getPictogramElementForBusinessObject(eobject);
                                if (pe != null) {
                                    getRefreshBehavior().refreshRenderingDecorators(pe);
                                }
                            }
                        }
                    });
                }
            };
        }
        _modelFile.getWorkspace().addResourceChangeListener(_workspaceListener, IResourceChangeEvent.POST_BUILD);
    }

    private void removeWorkspaceListener() {
        _modelFile.getWorkspace().removeResourceChangeListener(_workspaceListener);
    }

    /**
     * @param resourceSet register all the EMF packages for the SY resource set
     */
    public static void registerPackages(ResourceSet resourceSet) {
        resourceSet.getPackageRegistry().put("http://docs.oasis-open.org/ns/opencsa/sca/200912", ScaPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-config:switchyard:1.0", SwitchyardPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-config:transform:1.0", TransformPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-component-bean:config:1.0", BeanPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-config:validate:1.0", ValidatePackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-component-soap:config:1.0", SOAPPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-component-rules:config:1.0", RulesPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-component-hornetq:config:1.0", HornetQPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-component-common-rules:config:1.0",
                CommonRulesPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-component-clojure:config:1.0", ClojurePackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-component-camel:config:1.0", CamelPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-component-bpm:config:1.0", BPMPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("http://docs.oasis-open.org/ns/opencsa/sca/200903", BPELPackage.eINSTANCE);
    }

}
