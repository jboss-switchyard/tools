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

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.graphiti.ui.editor.DiagramEditorContextMenuProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabFolder2Listener;
import org.eclipse.swt.custom.CTabFolderEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.part.MultiPageEditorSite;
import org.eclipse.ui.part.MultiPageSelectionProvider;
import org.eclipse.wst.sse.ui.StructuredTextEditor;
import org.w3c.dom.Attr;
import org.w3c.dom.Node;

/**
 * @author bfitzpat
 * 
 */
public class MultiPageEditor extends MultiPageEditorPart implements IResourceChangeListener {

    /** The text editor used in page 0. */
    private SwitchyardSCAEditor _diagramEditor;
    private StructuredTextEditor _sourceViewer;
    // private TextEditor _textEditor;
    private CTabFolder _tabFolder;
    private int _defaultTabHeight;

    /**
     * Creates a multi-page editor example.
     */
    public MultiPageEditor() {
        super();
        ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
    }

    /**
     * The <code>MultiPageEditorPart</code> implementation of this
     * <code>IWorkbenchPart</code> method disposes all nested editors.
     * Subclasses may extend.
     */
    @Override
    public void dispose() {
        ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
        super.dispose();
    }

    /**
     * Method declared on IEditorPart.
     * 
     * @param marker Marker to look for
     */
    public void gotoMarker(IMarker marker) {
        setActivePage(0);
        IDE.gotoMarker(getEditor(0), marker);
    }

    /*
     * (non-Javadoc) The <code>MultiPageEditorExample</code> implementation of
     * this method checks that the input is an instance of
     * <code>IFileEditorInput</code>.
     * 
     * @see
     * org.eclipse.ui.forms.editor.FormEditor#init(org.eclipse.ui.IEditorSite,
     * org.eclipse.ui.IEditorInput)
     */
    @Override
    public void init(IEditorSite site, IEditorInput editorInput) throws PartInitException {
        if (!(editorInput instanceof IFileEditorInput)) {
            throw new PartInitException("Invalid Input: Must be IFileEditorInput");
        }
        super.init(site, editorInput);
    }

    /*
     * (non-Javadoc) Closes all project files on project close.
     * 
     * @see
     * org.eclipse.core.resources.IResourceChangeListener#resourceChanged(org
     * .eclipse.core.resources.IResourceChangeEvent)
     */
    @Override
    public void resourceChanged(final IResourceChangeEvent event) {
        if (event.getType() == IResourceChangeEvent.PRE_CLOSE) {
            Display.getDefault().asyncExec(new Runnable() {
                public void run() {
                    IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
                    for (int i = 0; i < pages.length; i++) {
                        if (((FileEditorInput) _diagramEditor.getEditorInput()).getFile().getProject()
                                .equals(event.getResource())) {
                            IEditorPart editorPart = pages[i].findEditor(_diagramEditor.getEditorInput());
                            pages[i].closeEditor(editorPart, true);
                        }
                    }
                }
            });
        }
    }

    /**
     * @author bfitzpat
     *
     */
    public class DesignEditor extends SwitchyardSCAEditor {

        @Override
        protected void createActions() {
            super.createActions();
            ActionRegistry registry = getActionRegistry();
            IAction action = new WorkbenchPartAction(_diagramEditor) {

                @Override
                protected void init() {
                    super.init();
                    setId("show.or.hide.source.view");
                }

                @Override
                public String getText() {
                    return _sourceViewer == null ? "Show Source View" : "Hide Source View";
                }

                @Override
                protected boolean calculateEnabled() {
                    return true;
                }

                public void run() {
                    if (_sourceViewer == null) {
                        createSourceViewer();
                        setActivePage(_tabFolder.getItemCount() - 1);
                    } else {
                        removeSourceViewer();
                    }
                }
            };
            registry.registerAction(action);
        }

        @SuppressWarnings("restriction")
        @Override
        protected ContextMenuProvider createContextMenuProvider() {
            return new DiagramEditorContextMenuProvider(getGraphicalViewer(), getActionRegistry(),
                    getConfigurationProvider()) {
                @Override
                public void buildContextMenu(IMenuManager manager) {
                    super.buildContextMenu(manager);
                    IAction action = getActionRegistry().getAction("show.or.hide.source.view");
                    action.setText(action.getText());
                    manager.add(action);
                }
            };
        }
    }

    /**
     * @author bfitzpat
     *
     */
    public class SourceViewer extends StructuredTextEditor {

        private ActionRegistry _actionRegistry = null;

        @Override
        @SuppressWarnings("rawtypes")
        public Object getAdapter(Class required) {
            if (required == ActionRegistry.class) {
                return getActionRegistry();
            }
            if (required == SwitchyardSCAEditor.class) {
                return _diagramEditor;
            }
            return super.getAdapter(required);
        }

        @Override
        public boolean isEditable() {
            return false;
        }

        @Override
        public void dispose() {
            super.dispose();
            MultiPageEditor.this._sourceViewer = null;
        }

        protected ActionRegistry getActionRegistry() {
            if (_actionRegistry == null) {
                _actionRegistry = new ActionRegistry();
            }
            return _actionRegistry;
        }
    }

    protected void createDesignEditor() {
        if (_diagramEditor == null) {
            _diagramEditor = new DesignEditor();

            try {
                int pageIndex = _tabFolder.getItemCount();
                if (_sourceViewer != null) {
                    --pageIndex;
                }
                addPage(pageIndex, _diagramEditor, MultiPageEditor.this.getEditorInput());
                _defaultTabHeight = _tabFolder.getTabHeight();
                setPageText(pageIndex, "Design");

                _defaultTabHeight = _tabFolder.getTabHeight();

                updateTabs();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected void createSourceViewer() {
        if (_sourceViewer == null) {
            _sourceViewer = new SourceViewer();

            try {
                int pageIndex = _tabFolder.getItemCount();
                FileEditorInput input = new FileEditorInput(_diagramEditor.getModelFile());
                addPage(pageIndex, _sourceViewer, input);
                _tabFolder.getItem(pageIndex).setShowClose(true);

                setPageText(pageIndex, "Source");
                updateTabs();
            } catch (Exception e) {
                e.printStackTrace();
                if (_sourceViewer != null) {
                    _sourceViewer.dispose();
                }
            }
        }
    }

    @Override
    public void removePage(int pageIndex) {
        Object page = _tabFolder.getItem(pageIndex).getData();
        if (page instanceof EditorPart) {
            // make sure the editor gets disposed - neither CTabFolder nor super
            // does this for us!
            ((EditorPart) page).dispose();
        }
        super.removePage(pageIndex);
        updateTabs();
    }

    /**
     * Remove the source viewer page.
     */
    public void removeSourceViewer() {
        // there will only be one source page and it will always be the last
        // page in the tab folder
        if (_sourceViewer != null) {
            int pageIndex = _tabFolder.getItemCount() - 1;
            if (pageIndex > 0) {
                removePage(pageIndex);
            }
        }
    }

    private void updateTabs() {
        if (_tabFolder.getItemCount() == 1) {
            _tabFolder.setTabHeight(0);
        } else {
            _tabFolder.setTabHeight(_defaultTabHeight);
        }
        _tabFolder.layout();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.
     * IProgressMonitor)
     */
    @Override
    public void doSave(IProgressMonitor monitor) {
        _diagramEditor.doSave(monitor);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.EditorPart#doSaveAs()
     */
    @Override
    public void doSaveAs() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
     */
    @Override
    public boolean isSaveAsAllowed() {
        return false;
    }

    @Override
    protected IEditorSite createSite(IEditorPart editor) {
        return new MultiPageEditorSite(this, editor) {
            @Override
            protected void handleSelectionChanged(SelectionChangedEvent event) {
                ISelectionProvider parentProvider = getMultiPageEditor().getSite().getSelectionProvider();
                if (parentProvider instanceof MultiPageSelectionProvider) {
                    SelectionChangedEvent newEvent = getNewEvent(parentProvider, event);
                    MultiPageSelectionProvider prov = (MultiPageSelectionProvider) parentProvider;
                    prov.fireSelectionChanged(newEvent);
                }
            }

            @Override
            protected void handlePostSelectionChanged(SelectionChangedEvent event) {
                ISelectionProvider parentProvider = getMultiPageEditor().getSite().getSelectionProvider();
                if (parentProvider instanceof MultiPageSelectionProvider) {
                    SelectionChangedEvent newEvent = getNewEvent(parentProvider, event);
                    MultiPageSelectionProvider prov = (MultiPageSelectionProvider) parentProvider;
                    prov.firePostSelectionChanged(newEvent);
                }
            }

            protected SelectionChangedEvent getNewEvent(ISelectionProvider parentProvider, SelectionChangedEvent event) {
                ISelection selection = event.getSelection();
                if (selection instanceof IStructuredSelection) {
                    IStructuredSelection ss = (IStructuredSelection) selection;
                    Object o = ss.getFirstElement();
                    if (o instanceof Node) {
                        selection = getNewSelection((Node) o);
                    }
                }
                if (selection != null) {
                    return new SelectionChangedEvent(parentProvider, selection);
                }
                return event;
            }

            protected StructuredSelection getNewSelection(Node node) {
                int type = node.getNodeType();
                if (type == 1) {
                    // node type = element
                    //Element elem = (Element) node;
                    //TODO: Somehow map the element back to a pictogram
                    return getNewSelection(node.getParentNode());
                } else if (type == 2) {
                    // node type = attribute
                    // search the attribute's owner
                    Attr attr = (Attr) node;
                    return getNewSelection(attr.getOwnerElement());
                } else if (type == 3) {
                    // node type = text
                    return getNewSelection(node.getParentNode());
                }
                return null;
            }

        };
    }

    @Override
    public String getTitle() {
        if (_diagramEditor != null) {
            return _diagramEditor.getTitle();
        }
        return super.getTitle();
    }

    @Override
    public String getPartName() {
        if (_diagramEditor != null) {
            return _diagramEditor.getPartName();
        }
        return super.getPartName();
    }

    @Override
    protected void pageChange(int newPageIndex) {
        super.pageChange(newPageIndex);
//        if (newPageIndex > 0 && newPageIndex == _tabFolder.getItemCount() - 1) {
//            // TODO: sync source viewer's DOM with model
//        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.MultiPageEditorPart#createPages()
     */
    @Override
    protected void createPages() {
        _tabFolder = (CTabFolder) getContainer();
        _tabFolder.addCTabFolder2Listener(new CTabFolder2Listener() {

            @Override
            public void close(CTabFolderEvent event) {
                if (event.item.getData() == _sourceViewer) {
                    removeSourceViewer();
                }
            }

            @Override
            public void minimize(CTabFolderEvent event) {
            }

            @Override
            public void maximize(CTabFolderEvent event) {
            }

            @Override
            public void restore(CTabFolderEvent event) {
            }

            @Override
            public void showList(CTabFolderEvent event) {
            }

        });
        createDesignEditor();
        createSourceViewer();
    }

}
