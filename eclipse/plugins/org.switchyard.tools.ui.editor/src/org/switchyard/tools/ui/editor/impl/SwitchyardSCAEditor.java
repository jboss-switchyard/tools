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
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.editor.DefaultPersistencyBehavior;
import org.eclipse.graphiti.ui.editor.DefaultUpdateBehavior;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.graphiti.ui.internal.services.GraphitiUiInternal;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.ActionFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceFactoryImpl;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceImpl;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.core.ModelHandler;
import org.switchyard.tools.ui.editor.core.ModelHandlerLocator;

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
    private IFile _targetModelFile;
    private IFile _diagramFile;

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
                Resource switchYardResource = getEditingDomain().getResourceSet().createResource(modelUri,
                        "org.switchyard.tools.ui.editor.content-type.xml");

                _modelFile = WorkspaceSynchronizer.getFile(switchYardResource);

                try {
                    switchYardResource.load(getEditingDomain().getResourceSet().getLoadOptions());
                } catch (IOException e) {
                    ErrorUtils.showErrorWithLogging(new Status(Status.ERROR, Activator.PLUGIN_ID,
                            "Could not load file: " + modelUri + ".  " + e.getLocalizedMessage()));
                    return null;
                }

                // get the diagram url
                _diagramUri = convertModelURIToDiagramURI(modelUri);

                _modelHandler = ModelHandlerLocator.createModelHandler(_modelUri,
                        (SwitchyardResourceImpl) switchYardResource);
                ModelHandlerLocator.put(_diagramUri, _modelHandler);

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
                        protected void doExecute() {
                            diagramResource.getContents().add(newDiagram);
                        }
                    });
                }

                // nuke the existing diagram
                final Diagram finalDiagram = diagram;
                getEditingDomain().getCommandStack().execute(new RecordingCommand(getEditingDomain()) {
                    @Override
                    protected void doExecute() {
                        finalDiagram.getChildren().clear();
                        finalDiagram.getAnchors().clear();
                        finalDiagram.getConnections().clear();
                        finalDiagram.getPictogramLinks().clear();
                        finalDiagram.getPictogramLinks().add(finalDiagram.getLink());
                    }
                });
                getEditingDomain().getCommandStack().flush();
                return diagram;
            }
        };
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
                super.initializeEditingDomain(domain);

                ResourceSet resourceSet = domain.getResourceSet();
                // ExtendedMetaData extendedMetaData = new
                // BasicExtendedMetaData(resourceSet.getPackageRegistry());
                // resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,
                // extendedMetaData);
                resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
                        .put(Resource.Factory.Registry.DEFAULT_EXTENSION, new SwitchyardResourceFactoryImpl());

                // Register the package to make it available during loading.
                ModelHandler.registerPackages(resourceSet);

                _editorAdapter = new SwitchyardSCAEditorAdapter();
                resourceSet.eAdapters().add(_editorAdapter);
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
    protected void initActionRegistry(ZoomManager zoomManager) {
        super.initActionRegistry(zoomManager);

        // XXX: not sure if the following is correct or not.
        // register common actions with the site.
        IAction action = getActionRegistry().getAction(ActionFactory.UNDO.getId());
        action.setActionDefinitionId(ActionFactory.UNDO.getCommandId());
        // getEditorSite().getKeyBindingService().registerAction(action);

        action = getActionRegistry().getAction(ActionFactory.REDO.getId());
        action.setActionDefinitionId(ActionFactory.REDO.getCommandId());
        // getEditorSite().getKeyBindingService().registerAction(action);
    }

    @Override
    public void selectionChanged(IWorkbenchPart part, ISelection selection) {
        if (part == SwitchyardSCAEditor.this) {
            setActiveEditor(SwitchyardSCAEditor.this);
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

        super.dispose();
        ModelHandlerLocator.releaseModel(_modelUri);
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
     * @return Model Handler instance
     */
    public ModelHandler getModelHandler() {
        return _modelHandler;
    }
}
