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
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.graphiti.ui.editor.DiagramEditorContextMenuProvider;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabFolder2Listener;
import org.eclipse.swt.custom.CTabFolderEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.part.MultiPageEditorSite;
import org.eclipse.ui.part.MultiPageSelectionProvider;
import org.eclipse.wst.sse.ui.StructuredTextEditor;
import org.switchyard.tools.models.switchyard1_0.switchyard.DomainType;
import org.switchyard.tools.models.switchyard1_0.switchyard.HandlerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.HandlersType;
import org.switchyard.tools.models.switchyard1_0.switchyard.PropertiesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.PropertyType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.ui.editor.diagram.shared.DomainPropertyInputDialog;
import org.switchyard.tools.ui.editor.diagram.shared.DomainPropertyTable;
import org.switchyard.tools.ui.editor.model.merge.MergedModelUtil;
import org.switchyard.tools.ui.editor.model.merge.SwitchYardMergedModelAdapter;
import org.w3c.dom.Attr;
import org.w3c.dom.Node;

/**
 * @author bfitzpat
 * 
 */
public class MultiPageEditor extends MultiPageEditorPart implements IGotoMarker, ResourceSetListener {

    /** The text editor used in page 0. */
    private SwitchyardSCAEditor _diagramEditor;
    private StructuredTextEditor _sourceViewer;
    private Composite _domainPage;
    // private TextEditor _textEditor;
    private CTabFolder _tabFolder;
    private int _defaultTabHeight;
    private Button _messageTraceCheckbox;
    private TransactionalEditingDomain _editDomain = null;
    private SwitchYardType _syRoot = null;
    private DomainPropertyTable _domainProperties = null;
    private DomainPropertyTable _securityProperties = null;
    private Text _callbackHandlerText;
    private Text _moduleNameText;
    private Text _runAsText;
    private Text _rolesAllowedText;
    private ModuleNameTextValueChangeListener _moduleNameListener;
    private ISWTObservableValue _moduleNameFocusObserver;
    private RolesAllowedTextValueChangeListener _rolesAllowedListener;
    private ISWTObservableValue _rolesAllowedFocusObserver;
    private RunAsTextValueChangeListener _runAsListener;
    private ISWTObservableValue _runAsFocusObserver;

    /**
     * Creates a multi-page editor example.
     */
    public MultiPageEditor() {
        super();
    }

    /**
     * The <code>MultiPageEditorPart</code> implementation of this
     * <code>IWorkbenchPart</code> method disposes all nested editors.
     * Subclasses may extend.
     */
    @Override
    public void dispose() {
        removeDomainListener();
        removeObservableListeners();
        super.dispose();
    }

    private void addDomainListener() {
        if (_editDomain == null) {
            _editDomain = (TransactionalEditingDomainImpl) getDiagramEditor().getEditingDomain();
            _editDomain.addResourceSetListener(this);
        }
    }

    private void removeDomainListener() {
        if (_editDomain != null) {
            _editDomain.removeResourceSetListener(this);
        }
    }
    
    /**
     * Method declared on IEditorPart.
     * 
     * @param marker Marker to look for
     */
    @Override
    public void gotoMarker(IMarker marker) {
        if (getActivePage() < 0) {
            setActivePage(0);
        }
        IDE.gotoMarker(getEditor(getActivePage()), marker);
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

    private SwitchYardType getSwitchYardRoot() {
        SwitchYardType switchYardRoot = MergedModelUtil.getSwitchYard(getDiagramEditor().getResourceSet()
                .getResources().get(0));
        SwitchYardMergedModelAdapter mergedAdapter = MergedModelUtil.getAdapter(switchYardRoot,
                SwitchYardMergedModelAdapter.class);
        return mergedAdapter.getSwitchYard();
    }

    /**
     * Get the diagramEditor.
     * 
     * @return the diagramEditor.
     */
    public SwitchyardSCAEditor getDiagramEditor() {
        return _diagramEditor;
    }

    /**
     * Get the sourceViewer.
     * 
     * @return the sourceViewer.
     */
    public StructuredTextEditor getSourceViewer() {
        return _sourceViewer;
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

        @Override
        protected ContextMenuProvider createContextMenuProvider() {
            return new DiagramEditorContextMenuProvider(getGraphicalViewer(), getActionRegistry(),
                    getDiagramTypeProvider()) {
                @Override
                public void buildContextMenu(IMenuManager manager) {
                    super.buildContextMenu(manager);
                    IAction action = getActionRegistry().getAction("show.or.hide.source.view");
                    action.setText(action.getText());
                    manager.add(action);
                }
            };
        }

        @Override
        public void selectionChanged(IWorkbenchPart part, ISelection selection) {
            super.selectionChanged(part, selection);
            // GraphicalEditor doesn't seem to account for multi page editors.
            if (!this.equals(getSite().getPage().getActiveEditor())
                    && this.equals(MultiPageEditor.this.getActiveEditor())) {
                updateActions(getSelectionActions());
            }
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

    private void addMessageTraceHandler() {
        if (_syRoot != null) {
            DomainType domain = _syRoot.getDomain();
            if (domain == null) {
                domain = SwitchyardFactory.eINSTANCE.createDomainType();
                _syRoot.setDomain(domain);
            }
            HandlersType handlers = domain.getHandlers();
            if (handlers == null) {
                handlers = SwitchyardFactory.eINSTANCE.createHandlersType();
                domain.setHandlers(handlers);
            }
            if (handlers != null) {
                EList<HandlerType> handlersList = handlers.getHandler();
                HandlerType messageTraceHandler = SwitchyardFactory.eINSTANCE.createHandlerType();
                messageTraceHandler.setClass("org.switchyard.handlers.MessageTrace");
                messageTraceHandler.setName("MessageTrace");
                handlersList.add(messageTraceHandler);
            }
        }
    }

    private EList<PropertyType> getDomainPropertyList() {
        if (_syRoot != null) {
            DomainType domain = _syRoot.getDomain();
            if (domain != null) {
                PropertiesType properties = domain.getProperties();
                if (properties != null) {
                    EList<PropertyType> propertyList = properties.getProperty();
                    return propertyList;
                }
            }
        }
        return null;
    }

    private EList<PropertyType> getSecurityPropertyList() {
        if (_syRoot != null) {
            DomainType domain = _syRoot.getDomain();
            if (domain != null && domain.getSecurity() != null) {
                SecurityType security = domain.getSecurity();
                PropertiesType properties = security.getProperties();
                if (properties != null) {
                    EList<PropertyType> propertyList = properties.getProperty();
                    return propertyList;
                }
            }
        }
        return null;
    }

    private void removeDomainProperty(final PropertyType property) {
        if (_syRoot != null) {
            DomainType domain = _syRoot.getDomain();
            if (domain != null) {
                final PropertiesType properties = domain.getProperties();
                if (properties != null) {
                    _editDomain.getCommandStack().execute(new RecordingCommand(_editDomain) {
                        @Override
                        protected void doExecute() {
                            properties.getProperty().remove(property);
                        }
                    });
                }
            }
        }
    }

    private void addDomainProperty(final String name, final String value) {
        if (_syRoot != null) {
            final SwitchYardType finalRoot = _syRoot;
            _editDomain.getCommandStack().execute(new RecordingCommand(_editDomain) {
                @Override
                protected void doExecute() {
                    DomainType domain = finalRoot.getDomain();
                    if (domain == null) {
                        domain = SwitchyardFactory.eINSTANCE.createDomainType();
                        _syRoot.setDomain(domain);
                    }
                    PropertiesType properties = domain.getProperties();
                    if (properties == null) {
                        properties = SwitchyardFactory.eINSTANCE.createPropertiesType();
                        domain.setProperties(properties);
                    }
                    EList<PropertyType> propertyList = properties.getProperty();
                    PropertyType newProperty = SwitchyardFactory.eINSTANCE.createPropertyType();
                    newProperty.setName(name);
                    newProperty.setValue(value);
                    propertyList.add(newProperty);
                }
            });
        }
    }

    private void removeSecurityProperty(final PropertyType property) {
        if (_syRoot != null) {
            DomainType domain = _syRoot.getDomain();
            if (domain != null) {
                SecurityType security = domain.getSecurity();
                if (security != null) {
                    final PropertiesType properties = security.getProperties();
                    if (properties != null) {
                        _editDomain.getCommandStack().execute(new RecordingCommand(_editDomain) {
                            @Override
                            protected void doExecute() {
                                properties.getProperty().remove(property);
                            }
                        });
                    }
                }
            }
        }
    }

    private void addSecurityProperty(final String name, final String value) {
        if (_syRoot != null) {
            final SwitchYardType finalRoot = _syRoot;
            _editDomain.getCommandStack().execute(new RecordingCommand(_editDomain) {
                @Override
                protected void doExecute() {
                    DomainType domain = finalRoot.getDomain();
                    if (domain == null) {
                        domain = SwitchyardFactory.eINSTANCE.createDomainType();
                        finalRoot.setDomain(domain);
                    }
                    SecurityType security = domain.getSecurity();
                    if (security == null) {
                        security = SwitchyardFactory.eINSTANCE.createSecurityType();
                        domain.setSecurity(security);
                    }
                    PropertiesType properties = security.getProperties();
                    if (properties == null) {
                        properties = SwitchyardFactory.eINSTANCE.createPropertiesType();
                        security.setProperties(properties);
                    }
                    EList<PropertyType> propertyList = properties.getProperty();
                    PropertyType newProperty = SwitchyardFactory.eINSTANCE.createPropertyType();
                    newProperty.setName(name);
                    newProperty.setValue(value);
                    propertyList.add(newProperty);
                }
            });
        }
    }

    private void removeMessageTraceHandler() {
        if (_syRoot != null) {
            DomainType domain = _syRoot.getDomain();
            if (domain != null) {
                HandlersType handlers = domain.getHandlers();
                if (handlers != null) {
                    EList<HandlerType> handlersList = handlers.getHandler();
                    HandlerType handlerToRemove = null;
                    for (HandlerType handler : handlersList) {
                        if (handler.getName().equalsIgnoreCase("MessageTrace")
                                && handler.getClass_().equalsIgnoreCase("org.switchyard.handlers.MessageTrace")) {
                            handlerToRemove = handler;
                            break;
                        }
                    }
                    handlersList.remove(handlerToRemove);
                }
            }
        }
    }

    private DomainType getDomain(final SwitchYardType root) {
        DomainType domain = root.getDomain();
        if (domain == null) {
            domain = SwitchyardFactory.eINSTANCE.createDomainType();
            root.setDomain(domain);
        }
        return root.getDomain();
    }
    
    private SecurityType getSecurity(final DomainType domain) {
        SecurityType security = domain.getSecurity();
        if (security == null) {
            security = SwitchyardFactory.eINSTANCE.createSecurityType();
            domain.setSecurity(security);
        }
        return domain.getSecurity();
    }
    
    private void updateRolesAllowed(final String value) {
        if (_syRoot != null) {
            final SwitchYardType finalRoot = _syRoot;
            _editDomain.getCommandStack().execute(new RecordingCommand(_editDomain) {
                @Override
                protected void doExecute() {
                    DomainType domain = getDomain(finalRoot);
                    SecurityType security = getSecurity(domain);
                    security.setRolesAllowed(value);
                }
            });
        }
    }

    private void updateRunAs(final String value) {
        if (_syRoot != null) {
            final SwitchYardType finalRoot = _syRoot;
            _editDomain.getCommandStack().execute(new RecordingCommand(_editDomain) {
                @Override
                protected void doExecute() {
                    DomainType domain = getDomain(finalRoot);
                    SecurityType security = getSecurity(domain);
                    security.setRunAs(value);
                }
            });
        }
    }
    
    private void updateModuleName(final String value) {
        if (_syRoot != null) {
            final SwitchYardType finalRoot = _syRoot;
            _editDomain.getCommandStack().execute(new RecordingCommand(_editDomain) {
                @Override
                protected void doExecute() {
                    DomainType domain = getDomain(finalRoot);
                    SecurityType security = getSecurity(domain);
                    security.setModuleName(value);
                }
            });
        }
    }

    private void updateCallbackHandler(final String value) {
        if (_syRoot != null) {
            final SwitchYardType finalRoot = _syRoot;
            _editDomain.getCommandStack().execute(new RecordingCommand(_editDomain) {
                @Override
                protected void doExecute() {
                    DomainType domain = finalRoot.getDomain();
                    if (domain == null) {
                        domain = SwitchyardFactory.eINSTANCE.createDomainType();
                        finalRoot.setDomain(domain);
                    }
                    SecurityType security = domain.getSecurity();
                    if (security == null) {
                        security = SwitchyardFactory.eINSTANCE.createSecurityType();
                        domain.setSecurity(security);
                    }
                    security.setCallbackHandler(value);
                }
            });
        }
    }

    private void updateMessageTraceHandler(final boolean value) {
        if (_syRoot != null) {
            boolean handlerExists = testForMessageTraceHandler();
            if (handlerExists && !value) {
                _editDomain.getCommandStack().execute(new RecordingCommand(_editDomain) {
                    @Override
                    protected void doExecute() {
                        removeMessageTraceHandler();
                    }
                });
            } else if (!handlerExists && value) {
                _editDomain.getCommandStack().execute(new RecordingCommand(_editDomain) {
                    @Override
                    protected void doExecute() {
                        addMessageTraceHandler();
                    }
                });
            }
        }
    }

    private boolean testForMessageTraceHandler() {
        if (_syRoot != null) {
            DomainType domain = _syRoot.getDomain();
            if (domain != null) {
                HandlersType handlers = domain.getHandlers();
                if (handlers != null) {
                    EList<HandlerType> handlersList = handlers.getHandler();
                    for (HandlerType handler : handlersList) {
                        if (handler.getName().equalsIgnoreCase("MessageTrace")
                                && handler.getClass_().equalsIgnoreCase("org.switchyard.handlers.MessageTrace")) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private void createDomainSettingsSection(FormToolkit toolkit, Composite parent) {
        // Creating the Main Domain Settings section
        Section section = toolkit.createSection(_domainPage, Section.TITLE_BAR);
        section.setText("Domain Settings"); //$NON-NLS-1$
        section.setLayout(new GridLayout(1, false));
        section.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));

        // Composite for storing controls of the main section
        Composite client = toolkit.createComposite(section, SWT.WRAP);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        layout.marginWidth = 2;
        layout.marginHeight = 2;
        client.setLayout(layout);

        _messageTraceCheckbox = toolkit.createButton(client, "Enable Message Trace", SWT.CHECK | SWT.LEFT); //$NON-NLS-1$
        _messageTraceCheckbox.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false));
        _messageTraceCheckbox.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                widgetDefaultSelected(e);
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                if (_syRoot != null) {
                    updateMessageTraceHandler(_messageTraceCheckbox.getSelection());
                }
            }
        });

        _messageTraceCheckbox.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                // ignore
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.keyCode == SWT.CR) {
                    updateMessageTraceHandler(_messageTraceCheckbox.getSelection());
                }
            }
        });

        Section section2 = toolkit.createSection(_domainPage, Section.TITLE_BAR);
        section2.setText("Domain Properties"); //$NON-NLS-1$
        section2.setLayout(new GridLayout(1, false));
        section2.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));

        // Composite for storing controls of the main section
        Composite client2 = toolkit.createComposite(section2, SWT.WRAP);
        GridLayout layout2 = new GridLayout();
        layout2.numColumns = 2;
        layout2.marginWidth = 2;
        layout2.marginHeight = 2;
        client2.setLayout(layout2);

        _domainProperties = new DomainPropertyTable(client2, SWT.NONE) {

            @Override
            protected void removeFromList() {
                final PropertyType toRemove = _domainProperties.getTableSelection();
                if (toRemove != null) {
                    removeDomainProperty(toRemove);
                }
            }

            @Override
            protected void addPropertyTypeToList() {
                final DomainPropertyInputDialog dialog = new DomainPropertyInputDialog(Display.getCurrent()
                        .getActiveShell());
                int rtn_value = dialog.open();
                if (rtn_value == DomainPropertyInputDialog.OK) {
                    final String name = dialog.getPropertyName();
                    final String value = dialog.getPropertyValue();
                    addDomainProperty(name, value);
                }

            }
        };
        _domainProperties.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 5));

        section2.setClient(client2);
        section.setClient(client);
    }

    private void handleBrowse() {
        IJavaSearchScope scope = null;
        IProject project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
        IJavaProject javaProject = JavaCore.create(project);
        if (javaProject == null) {
            scope = SearchEngine.createWorkspaceScope();
        } else {
            scope = SearchEngine.createJavaSearchScope(new IJavaElement[] {javaProject });
        }
        try {
            SelectionDialog dialog = JavaUI.createTypeDialog(Display.getCurrent().getActiveShell(), null, scope,
                    IJavaElementSearchConstants.CONSIDER_CLASSES, false);
            if (dialog.open() == SelectionDialog.OK) {
                Object[] result = dialog.getResult();
                if (result.length > 0 && result[0] instanceof IType) {
                    IType clazz = (IType) result[0];
                    String className = clazz.getFullyQualifiedName();
                    if (_syRoot != null) {
                        DomainType domain = _syRoot.getDomain();
                        if (domain != null && domain.getSecurity() != null) {
                            if (domain.getSecurity().getCallbackHandler() != null) {
                                boolean isSame = domain.getSecurity().getCallbackHandler().contentEquals(className);
                                if (!isSame) {
                                    _callbackHandlerText.setText(className);
                                    updateCallbackHandler(className);
                                }
                            } else {
                                _callbackHandlerText.setText(className);
                                updateCallbackHandler(className);
                            }
                        } else {
                            _callbackHandlerText.setText(className);
                            updateCallbackHandler(className);
                        }
                    }
                }
            }
        } catch (JavaModelException e) {
            e.printStackTrace();
        }
    }

    private void updateListener(DomainPropertyTextValueChangeListener listener, 
            ISWTObservableValue focus, Text control) {
        if (listener != null && focus != null) {
            focus.removeValueChangeListener(listener);
        }
        if (focus == null) {
            focus = SWTObservables.observeText(control, SWT.FocusOut);
        }
        focus.addValueChangeListener(listener);
    }

    private void removeListener(DomainPropertyTextValueChangeListener listener, 
            ISWTObservableValue focus) {
        if (listener != null && focus != null) {
            focus.removeValueChangeListener(listener);
            focus.dispose();
            listener = null;
        }
    }
    
    private void addObservableListeners() {
        if (_moduleNameListener == null) {
            _moduleNameListener = new ModuleNameTextValueChangeListener();
        }
        updateListener(_moduleNameListener, _moduleNameFocusObserver, _moduleNameText);
        if (_rolesAllowedListener == null) {
            _rolesAllowedListener = new RolesAllowedTextValueChangeListener();
        }
        updateListener(_rolesAllowedListener, _rolesAllowedFocusObserver, _rolesAllowedText);
        if (_runAsListener == null) {
            _runAsListener = new RunAsTextValueChangeListener();
        }
        updateListener(_runAsListener, _runAsFocusObserver, _runAsText);
    }
    
    private void removeObservableListeners() {
        removeListener(_moduleNameListener, _moduleNameFocusObserver);
        removeListener(_rolesAllowedListener, _rolesAllowedFocusObserver);
        removeListener(_runAsListener, _runAsFocusObserver);
    }
    
    private void createDomainSecuritySettingsSection(FormToolkit toolkit, Composite parent) {
        Section section3 = toolkit.createSection(_domainPage, Section.TITLE_BAR);
        section3.setText("Security Properties"); //$NON-NLS-1$
        section3.setLayout(new GridLayout(1, false));
        section3.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));

        // Composite for storing controls of the main section
        Composite client3 = toolkit.createComposite(section3, SWT.WRAP);
        GridLayout layout3 = new GridLayout();
        layout3.numColumns = 3;
        layout3.marginWidth = 2;
        layout3.marginHeight = 2;
        client3.setLayout(layout3);

        toolkit.createLabel(client3, "Callback Handler Class");
        _callbackHandlerText = toolkit.createText(client3, "", SWT.READ_ONLY);
        _callbackHandlerText.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false));

        Button _callbackHandlerBrowseBtn = toolkit.createButton(client3, "Browse...", SWT.PUSH);
        _callbackHandlerBrowseBtn.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                handleBrowse();
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
            }
        });

        toolkit.createLabel(client3, "Module Name");
        _moduleNameText = toolkit.createText(client3, "");
        _moduleNameText.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 1));

        toolkit.createLabel(client3, "Roles Allowed");
        _rolesAllowedText = toolkit.createText(client3, "");
        _rolesAllowedText.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 1));

        toolkit.createLabel(client3, "Run As");
        _runAsText = toolkit.createText(client3, "");
        _runAsText.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 1));

        Label separator = toolkit.createLabel(client3, null, SWT.HORIZONTAL);
        separator.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 3, 1));
        
        _securityProperties = new DomainPropertyTable(client3, SWT.NONE) {

            @Override
            protected void removeFromList() {
                final PropertyType toRemove = _securityProperties.getTableSelection();
                if (toRemove != null) {
                    removeSecurityProperty(toRemove);
                }
            }

            @Override
            protected void addPropertyTypeToList() {
                final DomainPropertyInputDialog dialog = new DomainPropertyInputDialog(Display.getCurrent()
                        .getActiveShell());
                int rtn_value = dialog.open();
                if (rtn_value == DomainPropertyInputDialog.OK) {
                    final String name = dialog.getPropertyName();
                    final String value = dialog.getPropertyValue();
                    addSecurityProperty(name, value);
                }

            }
        };
        _securityProperties.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 3, 5));

        section3.setClient(client3);
    }

    private void createDomainPage() {
        if (_domainPage == null) {

            FormToolkit toolkit = new FormToolkit(getContainer().getDisplay());
            _domainPage = toolkit.createComposite(getContainer());
            _domainPage.setLayout(new GridLayout(1, false));

            createDomainSettingsSection(toolkit, _domainPage);
            createDomainSecuritySettingsSection(toolkit, _domainPage);

            int index = addPage(_domainPage);
            setPageText(index, "Domain");
            refresh();
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

                addDomainListener();
                _syRoot = getSwitchYardRoot();
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
                    // Element elem = (Element) node;
                    // TODO: Somehow map the element back to a pictogram
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
        // if (newPageIndex > 0 && newPageIndex == _tabFolder.getItemCount() -
        // 1) {
        // // TODO: sync source viewer's DOM with model
        // }
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
        createDomainPage();
        createSourceViewer();
    }

    class ModuleNameTextValueChangeListener extends DomainPropertyTextValueChangeListener {
        
        @Override
        protected void updateField(Text control) {
            String value = control.getText();
            if (value.trim().isEmpty()) {
                value = null;
            }
            updateModuleName(value);
        }
    }

    class RolesAllowedTextValueChangeListener extends DomainPropertyTextValueChangeListener {
        @Override
        protected void updateField(Text control) {
            String value = control.getText();
            if (value.trim().isEmpty()) {
                value = null;
            }
            updateRolesAllowed(value);
        }
    }

    class RunAsTextValueChangeListener extends DomainPropertyTextValueChangeListener {
        @Override
        protected void updateField(Text control) {
            String value = control.getText();
            if (value.trim().isEmpty()) {
                value = null;
            }
            updateRunAs(value);
        }
    }

    private void refresh() {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                _messageTraceCheckbox.setSelection(testForMessageTraceHandler());
                _domainProperties.setSelection(getDomainPropertyList());
                _securityProperties.setSelection(getSecurityPropertyList());
                if (_syRoot != null) {
                    DomainType domain = _syRoot.getDomain();
                    if (domain != null) {
                        _domainProperties.setTargetObject(domain);
                        if (domain.getSecurity() != null) {
                            _securityProperties.setTargetObject(domain.getSecurity());
                            if (domain.getSecurity().getCallbackHandler() != null) {
                                _callbackHandlerText.setText(domain.getSecurity().getCallbackHandler());
                            }
                            if (domain.getSecurity().getModuleName() != null) {
                                _moduleNameText.setText(domain.getSecurity().getModuleName());
                            }
                            if (domain.getSecurity().getRolesAllowed() != null) {
                                _rolesAllowedText.setText(domain.getSecurity().getRolesAllowed());
                            }
                            if (domain.getSecurity().getRunAs() != null) {
                                _runAsText.setText(domain.getSecurity().getRunAs());
                            }
                            addObservableListeners();
                        }
                    }
                }
            }
        });
    }
    
    @Override
    public NotificationFilter getFilter() {
        return null;
    }

    @Override
    public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
        return null;
    }

    @Override
    public void resourceSetChanged(ResourceSetChangeEvent event) {
        refresh();
    }

    @Override
    public boolean isAggregatePrecommitListener() {
        return false;
    }

    @Override
    public boolean isPrecommitOnly() {
        return false;
    }

    @Override
    public boolean isPostcommitOnly() {
        return false;
    }

}
