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
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain.Lifecycle;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.graphiti.ui.editor.DiagramEditorInput;
import org.eclipse.graphiti.ui.internal.editor.GFPaletteRoot;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceFactoryImpl;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceImpl;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.core.ModelHandler;
import org.switchyard.tools.ui.editor.core.ModelHandlerLocator;
import org.switchyard.tools.ui.editor.diagram.di.DIImport;

/**
 * @author bfitzpat
 * 
 */
@SuppressWarnings("restriction")
public class SwitchyardSCAEditor extends DiagramEditor {

    /**
     * Editor ID.
     */
    public static final String EDITOR_ID = "org.switchyard.tools.ui.editor.switchyard.editor";

    /**
     * Property contributor id.
     */
    public static final String CONTRIBUTOR_ID = "org.switchyard.tools.ui.editor.diagram.PropertyContributor";

    private ModelHandler _modelHandler;
    private URI _modelUri;
    private URI _diagramUri;

    private IFile _modelFile;
    private IFile _diagramFile;

    private IWorkbenchListener _workbenchListener;
    private ISelectionListener _selectionListener;
    private boolean _workbenchShutdown = false;
    private static SwitchyardSCAEditor activeEditor;

    private SwitchyardSCAEditingDomainListener _editingDomainListener;

    // private Bpmn2Preferences preferences;
    // private TargetRuntime targetRuntime;

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
        // if (activeEditor!=null) {
        // TargetRuntime.setActiveProject(modelFile.getProject());
        // TargetRuntime.setCurrentRuntime( getTargetRuntime() );
        // }
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

        try {
            if (input instanceof IFileEditorInput) {
                _modelFile = ((IFileEditorInput) input).getFile();
                // loadPreferences(modelFile.getProject());

                input = createNewDiagramEditorInput();

            } else if (input instanceof DiagramEditorInput) {
                getModelPathFromInput((DiagramEditorInput) input);

                // loadPreferences(modelFile.getProject());
                // if (input instanceof SwitchyardSCADiagramEditorInput)
                // // This was incorrectly constructed input, we ditch the old
                // one and make a new and clean one instead
                // // This code path comes in from the New File Wizard
                input = createNewDiagramEditorInput();
            }
        } catch (CoreException e) {
            Activator.showErrorWithLogging(e);
        }

        // add a listener so we get notified if the workbench is shutting down.
        // in this case we don't want to delete the temp file!
        addWorkbenchListener();
        setActiveEditor(this);

        super.init(site, input);
        addSelectionListener();
    }

    /**
     * ID for tabbed property sheets.
     * 
     * @return the contributor id
     */
    @Override
    public String getContributorId() {
        return CONTRIBUTOR_ID;
    }

    private void getModelPathFromInput(DiagramEditorInput input) {
        URI uri = input.getDiagram().eResource().getURI();
        String uriString = uri.trimFragment().toPlatformString(true);
        _modelFile = SwitchyardSCADiagramCreator.getModelFile(new Path(uriString));
    }

    /**
     * Beware, creates a new input and changes this editor!
     */
    private SwitchyardSCADiagramEditorInput createNewDiagramEditorInput() throws CoreException {
        IPath fullPath = _modelFile.getFullPath();
        _modelUri = URI.createPlatformResourceURI(fullPath.toString(), true);

        IFolder folder = SwitchyardSCADiagramCreator.getTempFolder(fullPath);
        _diagramFile = SwitchyardSCADiagramCreator.getTempFile(fullPath, folder);

        // Create new temporary diagram file
        SwitchyardSCADiagramCreator creator = new SwitchyardSCADiagramCreator();
        creator.setDiagramFile(_diagramFile);

        SwitchyardSCADiagramEditorInput input = creator.createDiagram(false);
        _diagramUri = creator.getUri();

        return input;
    }

    @Override
    public void doSave(IProgressMonitor monitor) {
        _modelHandler.save();
        ((BasicCommandStack) getEditingDomain().getCommandStack()).saveIsDone();
    }

    @Override
    protected void setInput(IEditorInput input) {
        super.setInput(input);

        // Hook a transaction exception handler so we can get diagnostics about
        // EMF validation errors.
        getEditingDomainListener();

        BasicCommandStack basicCommandStack = (BasicCommandStack) getEditingDomain().getCommandStack();

        if (input instanceof DiagramEditorInput) {
            ResourceSet resourceSet = getEditingDomain().getResourceSet();

            ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
            getEditingDomain().getResourceSet().getLoadOptions()
                    .put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
            getEditingDomain().getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap()
                    .put(Resource.Factory.Registry.DEFAULT_EXTENSION, new SwitchyardResourceFactoryImpl());

            // Register the package to make it available during loading.
            ModelHandler.registerPackages(resourceSet);

            SwitchyardResourceImpl switchyardResource = (SwitchyardResourceImpl) resourceSet.createResource(_modelUri,
                    "org.switchyard.tools.ui.editor.content-type.xml");

            // resourceSet.setURIConverter(new
            // ProxyURIConverterImplExtension());
            _editorAdapter = new SwitchyardSCAEditorAdapter();
            resourceSet.eAdapters().add(_editorAdapter);

            _modelHandler = ModelHandlerLocator.createModelHandler(_modelUri, switchyardResource);
            ModelHandlerLocator.put(_diagramUri, _modelHandler);

            try {
                if (_modelFile.exists()) {
                    switchyardResource.load(null);
                } else {
                    doSave(null);
                }
            } catch (IOException e) {
                Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
                ErrorUtils.showErrorWithLogging(status);
            }
            basicCommandStack.execute(new RecordingCommand(getEditingDomain()) {

                @Override
                protected void doExecute() {
                    importDiagram();
                }
            });
        }
        basicCommandStack.saveIsDone();
        basicCommandStack.flush();
    }

    private void importDiagram() {
        // make sure this guy is active, otherwise it's not selectable
        Diagram diagram = getDiagramTypeProvider().getDiagram();
        IFeatureProvider featureProvider = getDiagramTypeProvider().getFeatureProvider();
        diagram.setActive(true);
        // SwitchyardSCADiagramEditorInput input =
        // (SwitchyardSCADiagramEditorInput) getEditorInput();
        // if (input.getDiagram() != null) {
        // BPMNDiagram bpmnDiagram =
        // modelHandler.createDiagramType(diagramType);
        // featureProvider.link(diagram, bpmnDiagram);
        // SwitchyardSCAEditor.this.doSave(null);
        // }

        DIImport di = new DIImport();
        di.setDiagram(diagram);
        di.setDomain(getEditingDomain());
        di.setModelHandler(_modelHandler);
        di.setFeatureProvider(featureProvider);
        di.generateFromDI();

        // this needs to happen AFTER the diagram has been imported because we
        // need
        // to be able to determine the diagram type from the file's contents in
        // order
        // to build the right tool palette for the target runtime and model
        // enablements.
        GFPaletteRoot pr = (GFPaletteRoot) getPaletteRoot();
        pr.updatePaletteEntries();
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
    @SuppressWarnings("deprecation")
    protected void initActionRegistry(ZoomManager zoomManager) {
        super.initActionRegistry(zoomManager);

        // XXX: not sure if the following is correct or not.
        // register common actions with the site.
        IAction action = getActionRegistry().getAction(ActionFactory.UNDO.getId());
        action.setActionDefinitionId(ActionFactory.UNDO.getCommandId());
        getEditorSite().getKeyBindingService().registerAction(action);

        action = getActionRegistry().getAction(ActionFactory.REDO.getId());
        action.setActionDefinitionId(ActionFactory.REDO.getCommandId());
        getEditorSite().getKeyBindingService().registerAction(action);
    }

    private void addWorkbenchListener() {
        if (_workbenchListener == null) {
            _workbenchListener = new IWorkbenchListener() {
                @Override
                public boolean preShutdown(IWorkbench workbench, boolean forced) {
                    _workbenchShutdown = true;
                    return true;
                }

                @Override
                public void postShutdown(IWorkbench workbench) {
                }

            };
            PlatformUI.getWorkbench().addWorkbenchListener(_workbenchListener);
        }
    }

    private void removeWorkbenchListener() {
        if (_workbenchListener != null) {
            PlatformUI.getWorkbench().removeWorkbenchListener(_workbenchListener);
            _workbenchListener = null;
        }
    }

    private void addSelectionListener() {
        if (_selectionListener == null) {
            _selectionListener = new ISelectionListener() {

                @Override
                public void selectionChanged(IWorkbenchPart part, ISelection selection) {
                    if (part == SwitchyardSCAEditor.this) {
                        setActiveEditor(SwitchyardSCAEditor.this);
                    }
                }

            };
            getSite().getPage().addSelectionListener(_selectionListener);
        }
    }

    private void removeSelectionListener() {
        if (_selectionListener != null) {
            getSite().getPage().removeSelectionListener(_selectionListener);
        }
    }

    /**
     * @return domain listener
     */
    public SwitchyardSCAEditingDomainListener getEditingDomainListener() {
        if (_editingDomainListener == null) {
            TransactionalEditingDomainImpl editingDomain = (TransactionalEditingDomainImpl) getEditingDomain();
            if (editingDomain == null) {
                return null;
            }
            _editingDomainListener = new SwitchyardSCAEditingDomainListener(this);

            Lifecycle domainLifeCycle = (Lifecycle) editingDomain.getAdapter(Lifecycle.class);
            domainLifeCycle.addTransactionalEditingDomainListener(_editingDomainListener);
        }
        return _editingDomainListener;
    }

    /**
     * @return basic diagnostics
     */
    public BasicDiagnostic getDiagnostics() {
        return getEditingDomainListener().getDiagnostics();
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
        getResourceSet().eAdapters().remove(getEditorAdapter());
        removeSelectionListener();
        if (instances == 0) {
            setActiveEditor(null);
        }

        super.dispose();
        ModelHandlerLocator.releaseModel(_modelUri);
        // get rid of temp files and folders, button only if the workbench is
        // being shut down.
        // when the workbench is restarted, we need to have those temp files
        // around!
        if (!_workbenchShutdown) {
            SwitchyardSCADiagramCreator.dispose(_diagramFile);
        }
        removeWorkbenchListener();
        // getPreferences().dispose();
    }

    /**
     * @return file
     */
    public IFile getModelFile() {
        return _modelFile;
    }

    /**
     * @return Model Handler instance
     */
    public ModelHandler getModelHandler() {
        return _modelHandler;
    }
}
