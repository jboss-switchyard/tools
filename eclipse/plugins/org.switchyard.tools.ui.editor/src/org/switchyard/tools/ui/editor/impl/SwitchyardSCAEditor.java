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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.change.FeatureChange;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.RunnableWithResult;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.validation.marker.MarkerUtil;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.model.IModelConstraint;
import org.eclipse.emf.validation.service.ConstraintFactory;
import org.eclipse.emf.validation.service.ConstraintRegistry;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.editor.DefaultMarkerBehavior;
import org.eclipse.graphiti.ui.editor.DefaultPersistencyBehavior;
import org.eclipse.graphiti.ui.editor.DefaultRefreshBehavior;
import org.eclipse.graphiti.ui.editor.DefaultUpdateBehavior;
import org.eclipse.graphiti.ui.editor.DiagramBehavior;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.graphiti.ui.editor.IDiagramContainerUI;
import org.eclipse.graphiti.ui.internal.services.GraphitiUiInternal;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.internal.WorkbenchMessages;
import org.switchyard.tools.models.switchyard1_0.bean.BeanPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.clojure.ClojurePackage;
import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceFactoryImpl;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceImpl;
import org.switchyard.tools.models.switchyard1_0.transform.TransformPackage;
import org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage;
import org.switchyard.tools.ui.common.ISwitchYardProject;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager.ISwitchYardProjectListener;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.diagram.PropertiesDialogFeature;
import org.switchyard.tools.ui.editor.diagram.SynchronizeGeneratedModelFeature;
import org.switchyard.tools.ui.editor.model.merge.MergedModelAdapterFactory;
import org.switchyard.tools.ui.editor.model.merge.MergedModelUtil;
import org.switchyard.tools.ui.validation.SwitchYardProjectValidator;
import org.switchyard.tools.ui.validation.ValidationProblem;
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
    private ISwitchYardProjectListener _switchYardProjectListener;
    private boolean _needsSynchronization;

    private static SwitchyardSCAEditor activeEditor;

    private SwitchyardSCAEditorAdapter _editorAdapter;

    /**
     * Adapter class that is associated with the editor's resource set.
     */
    public final class SwitchyardSCAEditorAdapter implements Adapter {

        private SwitchyardSCAEditorAdapter() {
        }

        @Override
        public Notifier getTarget() {
            return null;
        }

        @Override
        public void setTarget(Notifier newTarget) {
        }

        @Override
        public boolean isAdapterForType(Object type) {
            return (type == SwitchyardSCAEditorAdapter.class);
        }

        @Override
        public void notifyChanged(Notification notification) {
        }

        /**
         * @return the SwitchYard editor associated with the target.
         */
        public SwitchyardSCAEditor getSwitchyardEditor() {
            return SwitchyardSCAEditor.this;
        }

        /**
         * @return the model file associated with the editor.
         */
        public IFile getModelFile() {
            return _modelFile;
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
    protected DiagramBehavior createDiagramBehavior() {
        SwitchYardDiagramBehavior diagramBehavior =  new SwitchYardDiagramBehavior(this);
        diagramBehavior.setParentPart(this);
        diagramBehavior.initDefaultBehaviors();
        return diagramBehavior;
    }

    @Override
    protected void createActions() {
        super.createActions();
        
        getActionRegistry().registerAction(new PropertiesDialogAction(this));
    }

    private Set<EObject> loadValidationStatus(List<IMarker> markers) {
        if (markers == null) {
            return Collections.emptySet();
        }
        // make sure the validator constraints have been loaded otherwise
        // connection errors will show up on the source figure instead of the
        // connection
        ModelValidationService.getInstance().loadXmlConstraintDeclarations();
        final MergedModelAdapterFactory mergeAdapter = MergedModelUtil.getAdapterFactory(getResourceSet());
        Set<EObject> touched = new LinkedHashSet<EObject>();
        for (IMarker marker : markers) {
            EObject markedObject = getTargetObject(marker, mergeAdapter);
            if (markedObject == null) {
                continue;
            }
            ValidationStatusAdapter statusAdapter = (ValidationStatusAdapter) EcoreUtil.getRegisteredAdapter(
                    markedObject, ValidationStatusAdapter.class);
            if (statusAdapter != null) {
                statusAdapter.addValidationStatus(convertMarker(marker, markedObject, mergeAdapter));
                touched.add(markedObject);
            }
        }
        return touched;
    }

    private EObject getTargetObject(IMarker marker, MergedModelAdapterFactory mergeAdapter) {
        final String uriString = marker.getAttribute(EValidator.URI_ATTRIBUTE, null);
        final URI uri = uriString == null ? null : URI.createURI(uriString);
        if (uri == null) {
            return null;
        }
        final EObject generated = getEditingDomain().getResourceSet().getEObject(uri, false);
        if (generated != null && mergeAdapter != null) {
            final EObject source = mergeAdapter.getSource(generated);
            if (source != null) {
                return source;
            }
        }
        return generated;
    }

    private IStatus convertMarker(IMarker marker, EObject target, MergedModelAdapterFactory mergeAdapter) {
        final String message = marker.getAttribute(IMarker.MESSAGE, "");
        final String constraintId = marker.getAttribute(MarkerUtil.RULE_ATTRIBUTE, null);
        final IConstraintDescriptor icd = constraintId == null ? null : ConstraintRegistry.getInstance().getDescriptor(
                constraintId);
        final IModelConstraint imc = icd == null ? null : ConstraintFactory.getInstance().newConstraint(icd);
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
        final int code = marker.getAttribute(ValidationProblem.PROBLEM_CODE, 0);
        if (imc == null) {
            return new Status(severity, Activator.PLUGIN_ID, code, message, null);
        }
        List<EObject> locus = getTargetObjects(getEditingDomain(), marker);
        for (ListIterator<EObject> it = locus.listIterator(); it.hasNext();) {
            final EObject item = it.next();
            final EObject source = mergeAdapter == null ? null : mergeAdapter.getSource(item);
            if (source != null) {
                // swap out with the source object
                it.set(source);
            }
        }
        return new ConstraintStatus(imc, target, severity, code, message, locus == null ? null
                : new LinkedHashSet<EObject>((List<? extends EObject>) locus));
    }

    private URI convertModelURIToDiagramURI(URI modelUri) {
        IPath diagramFilePath = _modelFile.getProject().getFullPath().append(".xml")
                .append(_modelFile.getFullPath().removeFirstSegments(1)).addFileExtension("diagram");
        _diagramFile = _modelFile.getWorkspace().getRoot().getFile(diagramFilePath);
        return URI.createPlatformResourceURI(diagramFilePath.toString(), true);
    }

    /**
     * Copied from EditUIMarkerHelper.getTargetObjects(): removed creation of
     * wrapper objects.
     */
    private List<EObject> getTargetObjects(Object object, IMarker marker) {
        final List<EObject> result = new ArrayList<EObject>();
        final EditingDomain editingDomain = getEditingDomain();
        final String uriAttribute = marker.getAttribute(EValidator.URI_ATTRIBUTE, null);
        if (uriAttribute != null) {
            final URI uri = URI.createURI(uriAttribute);
            final EObject eObject = editingDomain.getResourceSet().getEObject(uri, true);
            if (eObject != null) {
                result.add(eObject);
            }
        }
        final String relatedURIsAttribute = marker.getAttribute(EValidator.RELATED_URIS_ATTRIBUTE, null);
        if (relatedURIsAttribute != null) {
            for (String relatedURI : relatedURIsAttribute.split(" ")) {
                final URI uri = URI.createURI(URI.decode(relatedURI));
                final EObject eObject = editingDomain.getResourceSet().getEObject(uri, true);
                if (eObject != null) {
                    result.add(eObject);
                }
            }
        }
        return result;
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
        removeSwitchYardProjectListener();

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
        final EObject target = getTargetObject(marker, MergedModelUtil.getAdapterFactory(getResourceSet()));
        if (target == null) {
            return;
        }
        final PictogramElement pe = getDiagramTypeProvider().getFeatureProvider().getPictogramElementForBusinessObject(
                target);
        if (pe == null) {
            return;
        }
        final IStatus status = convertMarker(marker, target, MergedModelUtil.getAdapterFactory(getResourceSet()));
        if (pe instanceof AnchorContainer && status instanceof IConstraintStatus) {
            if (ValidationProblem.isConnectionProblem(((IConstraintStatus) status).getCode())) {
                for (EObject other : ((IConstraintStatus) status).getResultLocus()) {
                    if (other == target) {
                        continue;
                    }
                    for (Anchor anchor : ((AnchorContainer) pe).getAnchors()) {
                        for (Connection connection : anchor.getOutgoingConnections()) {
                            if (getDiagramTypeProvider().getFeatureProvider().getBusinessObjectForPictogramElement(
                                    connection.getEnd()) == other) {
                                selectPictogramElements(new PictogramElement[] {connection });
                                return;
                            }
                        }
                    }
                }
            }
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

    /**
     * @return true if the generated configuration file has been modified.
     */
    public boolean needToSynchronizeGeneratedModel() {
        return _needsSynchronization;
    }

    /**
     * Synchronize with the generated model.
     * 
     * @return true if changes were made.
     */
    public boolean synchronizeGeneratedModel() {
        _needsSynchronization = false;

        final ResourceSet rs = getResourceSet();
        final MergedModelAdapterFactory mergeAdapter = MergedModelUtil.getAdapterFactory(rs);
        if (mergeAdapter == null || _modelFile == null || _modelFile.getProject() == null) {
            return false;
        }
        ISwitchYardProject project = SwitchYardProjectManager.instance().getSwitchYardProject(_modelFile.getProject());
        if (project == null) {
            return false;
        }
        boolean modified = false;
        Diagram diagram = getDiagramTypeProvider().getDiagram();
        if (mergeAdapter.processUpdatesToGenerated(project.getOutputSwitchYardConfigurationFile())) {
            /*
             * make sure the diagram is marked as dirty so the user can save any
             * updated references.
             */
            diagram.eResource().setModified(true);
            modified = true;
        }
        // update the diagram, if needed
        IUpdateContext context = new UpdateContext(diagram);
        IUpdateFeature feature = getDiagramTypeProvider().getFeatureProvider().getUpdateFeature(context);
        if (feature != null && feature.canExecute(context) && feature.updateNeeded(context).toBoolean()) {
            feature.update(context);
            modified = modified || feature.hasDoneChanges();
        }
        // reload the markers and refresh the diagram
        try {
            loadValidationStatus(Arrays.asList(_modelFile.findMarkers(SwitchYardProjectValidator.SWITCHYARD_MARKER_ID,
                    true, IResource.DEPTH_ZERO)));
            getDiagramBehavior().refresh();
        } catch (CoreException e) {
            e.fillInStackTrace();
        }
        return modified;
    }

    private void addWorkspaceListener() {
        if (_workspaceListener == null) {
            _workspaceListener = new IResourceChangeListener() {
                @Override
                public void resourceChanged(final IResourceChangeEvent event) {
                    getEditorSite().getShell().getDisplay().asyncExec(new Runnable() {
                        @Override
                        public void run() {
                            if (getEditingDomain() == null) {
                                // we've been closed
                                return;
                            }
                            try {
                                TransactionUtil.runExclusive(getEditingDomain(), new RunnableWithResult.Impl<Object>() {
                                    public void run() {
                                        processMarkerDeltas(event.getDelta().findMember(_modelFile.getFullPath()));
                                    }
                                });
                            } catch (InterruptedException e) {
                                e.fillInStackTrace();
                            }
                        }
                    });
                }
            };
        }
        _modelFile.getWorkspace().addResourceChangeListener(_workspaceListener, IResourceChangeEvent.POST_BUILD);
    }

    private void removeWorkspaceListener() {
        if (_workspaceListener != null) {
            _modelFile.getWorkspace().removeResourceChangeListener(_workspaceListener);
        }
    }

    private void addSwitchYardProjectListener() {
        if (_switchYardProjectListener == null) {
            _switchYardProjectListener = new ISwitchYardProjectListener() {
                @Override
                public void projectUpdated(final ISwitchYardProject project, Set<Type> types) {
                    if (getGraphicalControl().isDisposed() || !types.contains(Type.CONFIG)) {
                        return;
                    } else if (_modelFile.equals(project.getSwitchYardConfigurationFile())) {
                        _needsSynchronization = true;
                        if (isDirty() || getDiagramBehavior().isDirectEditingActive()) {
                            /*
                             * don't do anything if the editor is dirty. this
                             * could hork the in memory generated model.
                             */
                            return;
                        }
                        getEditorSite().getShell().getDisplay().asyncExec(new Runnable() {
                            public void run() {
                                getDiagramBehavior().executeFeature(new SynchronizeGeneratedModelFeature(getDiagramTypeProvider()
                                        .getFeatureProvider(), true), new CustomContext());
                            }
                        });
                    }
                }
            };
            SwitchYardProjectManager.instance().addListener(_switchYardProjectListener);
        }
    }

    private void removeSwitchYardProjectListener() {
        if (_switchYardProjectListener != null) {
            SwitchYardProjectManager.instance().removeListener(_switchYardProjectListener);
            _switchYardProjectListener = null;
        }
    }

    private void processMarkerDeltas(final IResourceDelta modelFileDelta) {
        if (modelFileDelta == null || getGraphicalControl() == null || getGraphicalControl().isDisposed()) {
            return;
        }
        final IMarkerDelta[] markerDeltas = modelFileDelta.getMarkerDeltas();
        if (markerDeltas == null || markerDeltas.length == 0) {
            return;
        }

        final List<IMarker> newMarkers = new ArrayList<IMarker>();
        final Set<IMarker> deletedMarkers = new HashSet<IMarker>();
        boolean hasRemoved = false;
        for (IMarkerDelta markerDelta : markerDeltas) {
            switch (markerDelta.getKind()) {
            case IResourceDelta.ADDED:
                newMarkers.add(markerDelta.getMarker());
                break;
            case IResourceDelta.CHANGED:
                newMarkers.add(markerDelta.getMarker());
                deletedMarkers.add(markerDelta.getMarker());
                break;
            case IResourceDelta.REMOVED:
                hasRemoved = true;
                break;
            }
        }

        final Set<EObject> updatedObjects = new LinkedHashSet<EObject>();
        final MergedModelAdapterFactory mergeAdapter = MergedModelUtil.getAdapterFactory(getEditingDomain()
                .getResourceSet());
        if (hasRemoved) {
            for (Resource resource : getEditingDomain().getResourceSet().getResources()) {
                if ("switchyard".equals(resource.getURI().scheme())) {
                    for (Iterator<EObject> it = resource.getAllContents(); it.hasNext();) {
                        final ValidationStatusAdapter adapter;
                        final EObject touched;
                        EObject generated = it.next();
                        EObject source = mergeAdapter == null ? null : mergeAdapter.getSource(generated);
                        if (source == null) {
                            adapter = (ValidationStatusAdapter) EcoreUtil.getRegisteredAdapter(generated,
                                    ValidationStatusAdapter.class);
                            touched = generated;
                        } else {
                            adapter = (ValidationStatusAdapter) EcoreUtil.getRegisteredAdapter(source,
                                    ValidationStatusAdapter.class);
                            touched = source;
                        }
                        if (adapter != null) {
                            adapter.clearValidationStatus();
                            updatedObjects.add(touched);
                        }
                    }
                }
            }
        } else {
            for (IMarker marker : deletedMarkers) {
                final EObject eobject = getTargetObject(marker, mergeAdapter);
                if (eobject == null) {
                    continue;
                }
                final ValidationStatusAdapter adapter = (ValidationStatusAdapter) EcoreUtil.getRegisteredAdapter(
                        eobject, ValidationStatusAdapter.class);
                if (adapter == null) {
                    continue;
                }
                adapter.clearValidationStatus();
                updatedObjects.add(eobject);
            }
        }
        updatedObjects.addAll(loadValidationStatus(newMarkers));
        final IFeatureProvider featureProvider = getDiagramTypeProvider().getFeatureProvider();
        for (EObject eobject : updatedObjects) {
            PictogramElement pe = featureProvider.getPictogramElementForBusinessObject(eobject);
            if (pe != null) {
                getDiagramBehavior().getRefreshBehavior().refreshRenderingDecorators(pe);
            }
        }
    }

    private ResourceSet getResourceSet() {
        return getEditingDomain().getResourceSet();
    }

    private final class SwitchYardPersistencyBehavior extends DefaultPersistencyBehavior {
        private SwitchYardPersistencyBehavior(DiagramBehavior editor) {
            super(editor);
        }

        private MergedModelAdapterFactory _mergedModelAdapterFactory;

        @Override
        public Diagram loadDiagram(URI modelUri) {
            if (modelUri == null) {
                return null;
            }
            _modelUri = modelUri;

            // load switchyard.xml
            final SwitchyardResourceImpl switchYardResource = (SwitchyardResourceImpl) getEditingDomain()
                    .getResourceSet().createResource(modelUri.trimFragment(),
                            SwitchyardResourceFactoryImpl.CONTENT_TYPE);

            _modelFile = WorkspaceSynchronizer.getFile(switchYardResource);

            if (_modelFile == null || !_modelFile.exists()) {
                return null;
            }

            switchYardResource.setGeneratedResource(loadGeneratedResource(_modelFile));

            try {
                switchYardResource.load(getEditingDomain().getResourceSet().getLoadOptions());
            } catch (IOException e) {
                ErrorUtils.showErrorWithLogging(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error loading file: "
                        + _modelFile.getName() + ".  " + e.getLocalizedMessage(), e));
            }

            _mergedModelAdapterFactory = new MergedModelAdapterFactory(switchYardResource);
            getEditingDomain().getResourceSet().getAdapterFactories().add(_mergedModelAdapterFactory);

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
                        switchYardResource.setTrackingModification(true);
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
                        switchYardResource.setTrackingModification(true);
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

        private Resource loadGeneratedResource(IFile sourceFile) {
            ISwitchYardProject switchYardProject = SwitchYardProjectManager.instance().getSwitchYardProject(
                    sourceFile.getProject());
            if (switchYardProject.needsLoading()) {
                switchYardProject.load(new NullProgressMonitor());
            }
            if (!sourceFile.equals(switchYardProject.getSwitchYardConfigurationFile())) {
                return null;
            }
            IFile generatedFile = switchYardProject.getOutputSwitchYardConfigurationFile();
            if (generatedFile == null) {
                return null;
            }
            Resource generatedResource = getEditingDomain().getResourceSet().createResource(
                    URI.createPlatformResourceURI(generatedFile.getFullPath().toString(), true),
                    SwitchyardResourceFactoryImpl.CONTENT_TYPE);

            /*
             * we don't want to propagate changes made to the generated file
             * (e.g. synchronizing on save)
             */
            // generatedResource.eSetDeliver(false);

            try {
                generatedResource.load(null);
            } catch (IOException e) {
                // the file may not exist
                e.fillInStackTrace();
            }

            // nuke the URI
            generatedResource.setURI(URI.createGenericURI("switchyard", "generated", null));

            // we don't want this resource being saved
            generatedResource.setTrackingModification(true);

            // mark as read-only
            if (getEditingDomain() instanceof AdapterFactoryEditingDomain) {
                ((AdapterFactoryEditingDomain) getEditingDomain()).getResourceToReadOnlyMap().put(generatedResource,
                        true);
            }

            // add the project listener
            addSwitchYardProjectListener();

            return generatedResource;
        }

        @Override
        protected Set<Resource> save(TransactionalEditingDomain editingDomain, Map<Resource, Map<?, ?>> saveOptions,
                IProgressMonitor monitor) {
            for (Resource resource : saveOptions.keySet()) {
                if ("switchyard".equals(resource.getURI().scheme())) {
                    // prevent notifications
                    resource.eSetDeliver(false);
                    // prevent the "generated" resource from being saved
                    resource.setModified(false);
                    resource.eSetDeliver(true);
                    break;
                }
            }
            return super.save(editingDomain, saveOptions, monitor);
        }

    }

    private final class SwitchYardUpdateBehavior extends DefaultUpdateBehavior {

        private final ResourceSetListener _listener = new ResourceSetListenerImpl() {
            @Override
            public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
                if (event.getNotifications() == null) {
                    return null;
                }
                final EMap<EObject, EList<FeatureChange>> objectChanges = event.getTransaction().getChangeDescription()
                        .getObjectChanges();
                for (Notification notification : event.getNotifications()) {
                    if (notification.getNotifier() instanceof EObject) {
                        final EObject notifier = (EObject) notification.getNotifier();
                        if (notifier.eResource() != null && event.getEditingDomain().isReadOnly(notifier.eResource())) {
                            for (Map.Entry<EObject, EList<FeatureChange>> change : objectChanges) {
                                if (change.getKey() == notifier) {
                                    throw new RollbackException(new Status(Status.CANCEL, Activator.PLUGIN_ID,
                                            "Cannot modify generated configuration."));
                                }
                            }
                        }
                    }
                }
                return null;
            }

            @Override
            public boolean isPrecommitOnly() {
                return true;
            }
        };

        private SwitchYardUpdateBehavior(DiagramBehavior diagramEditor) {
            super(diagramEditor);
        }

        @Override
        protected void initializeEditingDomain(TransactionalEditingDomain domain) {
            ResourceSet resourceSet = domain.getResourceSet();

            // add the adapter factory for tracking validation status
            resourceSet.getAdapterFactories().add(new ValidationStatusAdapterFactory());

            // add the editor adapter
            _editorAdapter = new SwitchyardSCAEditorAdapter();
            resourceSet.eAdapters().add(_editorAdapter);

            if (domain instanceof AdapterFactoryEditingDomain
                    && ((AdapterFactoryEditingDomain) domain).getResourceToReadOnlyMap() == null) {
                ((AdapterFactoryEditingDomain) domain).setResourceToReadOnlyMap(new HashMap<Resource, Boolean>());
            }

            domain.addResourceSetListener(_listener);
            super.initializeEditingDomain(domain);
        }

        @Override
        public void dispose() {
            getEditingDomain().getResourceSet().eAdapters().remove(_editorAdapter);
            getEditingDomain().removeResourceSetListener(_listener);
            super.dispose();
        }

    }

    private class PropertiesDialogAction extends SelectionAction {
        public PropertiesDialogAction(IWorkbenchPart part) {
            super(part);
            setId(ActionFactory.PROPERTIES.getId());
            setActionDefinitionId(ActionFactory.PROPERTIES.getCommandId());
            setText(WorkbenchMessages.Workbench_properties);
        }

        @Override
        protected boolean calculateEnabled() {
            PropertiesDialogFeature feature = new PropertiesDialogFeature(getDiagramTypeProvider().getFeatureProvider());
            CustomContext context = new CustomContext(getSelectedPictogramElements());
            return feature.canExecute(context);
        }

        @Override
        public void run() {
            PropertiesDialogFeature feature = new PropertiesDialogFeature(getDiagramTypeProvider().getFeatureProvider());
            CustomContext context = new CustomContext(getSelectedPictogramElements());
            getDiagramBehavior().executeFeature(feature, context);
        }
    }
    
    private final class SwitchYardDiagramBehavior extends DiagramBehavior {

        public SwitchYardDiagramBehavior(IDiagramContainerUI diagramContainer) {
            super(diagramContainer);
        }
        
        @Override
        protected void initDefaultBehaviors() {
            // this needs to be exposed to our create method in SwitchyardSCAEditor
            super.initDefaultBehaviors();
        }

        @Override
        protected void setParentPart(IWorkbenchPart parentPart) {
            // this needs to be exposed to our create method in SwitchyardSCAEditor
            super.setParentPart(parentPart);
        }

        @Override
        protected DefaultPersistencyBehavior createPersistencyBehavior() {
            return new SwitchYardPersistencyBehavior(this);
        }

        @Override
        protected DefaultMarkerBehavior createMarkerBehavior() {
            return new DefaultMarkerBehavior(this) {
                @Override
                public Diagnostic analyzeResourceProblems(Resource resource, Exception exception) {
                    // we have an external validator that creates problem markers
                    return Diagnostic.OK_INSTANCE;
                }
            };
        }

        @Override
        protected DefaultRefreshBehavior createRefreshBehavior() {
            return new DefaultRefreshBehavior(this) {
                @Override
                public void refreshRenderingDecorators(PictogramElement pe) {
                    super.refreshRenderingDecorators(pe);
                    if (pe instanceof AnchorContainer) {
                        for (Anchor anchor : ((AnchorContainer) pe).getAnchors()) {
                            for (Connection connection : anchor.getOutgoingConnections()) {
                                for (ConnectionDecorator decorator : connection.getConnectionDecorators()) {
                                    super.refreshRenderingDecorators(decorator);
                                }
                            }
                        }
                    }
                }

                @Override
                protected void autoUpdate() {
                    super.autoUpdate();
                    // clear dirty flag after auto-update
                    diagramBehavior.getEditingDomain().getCommandStack().flush();
                    diagramBehavior.getDiagramContainer().updateDirtyState();
                }
            };
        }

        @Override
        protected DefaultUpdateBehavior createUpdateBehavior() {
            return new SwitchYardUpdateBehavior(this);
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
        resourceSet.getPackageRegistry().put("urn:switchyard-component-clojure:config:1.0", ClojurePackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-component-camel:config:1.0", CamelPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("urn:switchyard-component-bpm:config:1.0", BPMPackage.eINSTANCE);
    }

}
