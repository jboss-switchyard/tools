/******************************************************************************* 
 * Copyright (c) 2012-2014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
  ******************************************************************************/
package org.switchyard.tools.ui.editor.impl;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabFolder2Listener;
import org.eclipse.swt.custom.CTabFolderEvent;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
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
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.ide.ResourceUtil;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.part.MultiPageEditorSite;
import org.eclipse.ui.part.MultiPageSelectionProvider;
import org.eclipse.wst.sse.ui.StructuredTextEditor;
import org.switchyard.tools.models.switchyard1_0.switchyard.DomainType;
import org.switchyard.tools.models.switchyard1_0.switchyard.PropertiesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.PropertyType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.shared.DomainPropertyInputDialog;
import org.switchyard.tools.ui.editor.diagram.shared.DomainPropertyTable;
import org.switchyard.tools.ui.editor.diagram.shared.PropertiesFileLoadDialog;
import org.switchyard.tools.ui.editor.impl.security.SecurityInstanceTable;
import org.switchyard.tools.ui.editor.model.merge.MergedModelUtil;
import org.switchyard.tools.ui.editor.model.merge.SwitchYardMergedModelAdapter;
import org.w3c.dom.Attr;
import org.w3c.dom.Node;

/**
 * @author bfitzpat
 * 
 */
public class MultiPageEditor extends MultiPageEditorPart implements IGotoMarker, ResourceSetListener {

    private static final String MESSAGE_TRACE_KEY = "org.switchyard.handlers.messageTrace.enabled"; //$NON-NLS-1$

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
    private SecurityInstanceTable _securityInstanceTable;
    private FormToolkit _toolkit;

    private Text _propFileText;

    private ControlDecoration _propFileTextDecorator;
    
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
        if (_toolkit != null) {
            _toolkit.dispose();
            _toolkit = null;
        }
        removeDomainListener();
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
            throw new PartInitException(Messages.error_notIFileEditorInput);
        }
        super.init(site, editorInput);
        if (getEditorInput() != null) {
            IFile file = ((IFileEditorInput) getEditorInput()).getFile();
            setPartName(file.getName());
        }

    }

    private SwitchYardType getSwitchYardRoot() {
        SwitchYardType switchYardRoot = MergedModelUtil.getSwitchYard(getDiagramEditor().getEditingDomain()
                .getResourceSet().getResources().get(0));
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
                    setId("show.or.hide.source.view"); //$NON-NLS-1$
                }

                @Override
                public String getText() {
                    return _sourceViewer == null ? Messages.label_showSourceView : Messages.label_hideSourceView;
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
        public void close() {
            MultiPageEditor.this.getSite().getPage().closeEditor(MultiPageEditor.this, false);
        }

        @Override
        public void refreshTitle() {
            final IPath resourcePath = new Path(getDiagramEditorInput().getUri().toPlatformString(true));
            MultiPageEditor.this.setPartName(resourcePath.lastSegment());
        }

        @Override
        protected void resourceMoved(IFile modelFile) {
            // update the file associated with the multipage editor
            MultiPageEditor.this.setInput(new FileEditorInput(modelFile));
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
            PropertiesType properties = domain.getProperties();
            if (properties == null) {
                properties = SwitchyardFactory.eINSTANCE.createPropertiesType();
                domain.setProperties(properties);
            }
            for (PropertyType property : properties.getProperty()) {
                if (MESSAGE_TRACE_KEY.equals(property.getName())) {
                    property.setValue(Boolean.toString(true));
                    return;
                }
            }
            PropertyType messageTraceProperty = SwitchyardFactory.eINSTANCE.createPropertyType();
            messageTraceProperty.setName(MESSAGE_TRACE_KEY);
            messageTraceProperty.setValue(Boolean.toString(true));
            properties.getProperty().add(messageTraceProperty);
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

    private void removeMessageTraceHandler() {
        if (_syRoot != null) {
            DomainType domain = _syRoot.getDomain();
            if (domain != null) {
                PropertiesType properties = domain.getProperties();
                if (properties != null) {
                    for (PropertyType property : properties.getProperty()) {
                        if (MESSAGE_TRACE_KEY.equals(property.getName())) {
                            property.setValue(Boolean.toString(false));
                            return;
                        }
                    }
                }
            }
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
                PropertiesType properties = domain.getProperties();
                if (properties != null) {
                    for (PropertyType property : properties.getProperty()) {
                        if (MESSAGE_TRACE_KEY.equals(property.getName())) {
                            return Boolean.valueOf(property.getValue());
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
        layout2.numColumns = 3;
        layout2.marginWidth = 2;
        layout2.marginHeight = 2;
        client2.setLayout(layout2);
        
        addDomainPropertiesLoadControls(toolkit, client2);
        
        _domainProperties = new DomainPropertyTable(client2, SWT.MULTI) {
            @Override
            protected void removeFromList() {
                final IStructuredSelection ssel = _domainProperties.getStructuredSelection();
                if (ssel != null && !ssel.isEmpty() && ssel.size() > 1) {
                    if (ssel != null && _editDomain != null) {
                        _editDomain.getCommandStack().execute(new RecordingCommand(_editDomain) {
                            @Override
                            protected void doExecute() {
                                Iterator<?> iter = ssel.iterator();
                                while (iter.hasNext()) {
                                    PropertyType toRemove = (PropertyType) iter.next();
                                    removeDomainProperty(toRemove);
                                }
                            } 
                        });
                    }
                } else if (ssel != null && ssel.size() == 1) {
                    final PropertyType toRemove = _domainProperties.getTableSelection();
                    if (toRemove != null) {
                        removeDomainProperty(toRemove);
                    }
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
        _domainProperties.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 3, 5));

        section2.setClient(client2);
        section.setClient(client);
    }
    
    private void addDomainPropertiesLoadControls(FormToolkit toolkit, Composite parent) {
        Label propFileLabel = toolkit.createLabel(parent, "Properties File:");
        propFileLabel.setLayoutData(new GridData());
        
        _propFileText = toolkit.createText(parent, "", SWT.BORDER);
        _propFileText.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false));
        _propFileTextDecorator = new ControlDecoration(_propFileText, SWT.TOP | SWT.LEFT);
        _propFileText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                updateDomainPropertiesLoadValue(_propFileText.getText());
                IStatus validStatus = validate();
                if (validStatus != Status.OK_STATUS) {
                    if (validStatus.getSeverity() == Status.ERROR) {
                        FieldDecoration errorFieldIndicator = FieldDecorationRegistry.getDefault().
                                getFieldDecoration(FieldDecorationRegistry.DEC_ERROR);
                        _propFileTextDecorator.setImage(errorFieldIndicator.getImage());
                    } else if (validStatus.getSeverity() == Status.WARNING) {
                        FieldDecoration warningFieldIndicator = FieldDecorationRegistry.getDefault().
                                getFieldDecoration(FieldDecorationRegistry.DEC_WARNING);
                        _propFileTextDecorator.setImage(warningFieldIndicator.getImage());
                    }
                    _propFileTextDecorator.setDescriptionText(validStatus.getMessage());
                } else {
                    _propFileTextDecorator.setImage(null);
                    _propFileTextDecorator.setDescriptionText(null);
                }
            }
        });
        
        Button propFileBrowseBtn = toolkit.createButton(parent, "...", SWT.PUSH);
        propFileBrowseBtn.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, false, false));
        propFileBrowseBtn.addSelectionListener(new SelectionListener(){
            @Override
            public void widgetSelected(SelectionEvent e) {
                final PropertiesFileLoadDialog dialog = new PropertiesFileLoadDialog(Display.getCurrent().getActiveShell());
                if (!_propFileText.getText().isEmpty()) {
                    dialog.setPropertiesFileValue(_propFileText.getText());
                }
                int rtn_value = dialog.open();
                if (rtn_value == PropertiesFileLoadDialog.OK) {
                    String value = dialog.getPropertiesFileValue();
                    if (value == null) {
                        value = "";
                    }
                    _propFileText.setText(value);
                    updateDomainPropertiesLoadValue(_propFileText.getText());
                }
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
            }
        });
    }

    private void updateDomainPropertiesLoadValue(final String value) {
        if (_syRoot != null) {
            if (_editDomain != null) {
                _editDomain.getCommandStack().execute(new RecordingCommand(_editDomain) {
                    @Override
                    protected void doExecute() {
                        DomainType domain = _syRoot.getDomain();
                        if (domain == null) {
                            domain = SwitchyardFactory.eINSTANCE.createDomainType();
                            _syRoot.setDomain(domain);
                        }
                        PropertiesType properties = domain.getProperties();
                        if (properties == null) {
                            properties = SwitchyardFactory.eINSTANCE.createPropertiesType();
                            domain.setProperties(properties);
                        }
                        properties.setLoad(value);
                    }
                });
            } else {
                DomainType domain = _syRoot.getDomain();
                if (domain == null) {
                    domain = SwitchyardFactory.eINSTANCE.createDomainType();
                    _syRoot.setDomain(domain);
                }
                PropertiesType properties = domain.getProperties();
                if (properties == null) {
                    properties = SwitchyardFactory.eINSTANCE.createPropertiesType();
                    domain.setProperties(properties);
                }
                properties.setLoad(value);
            }
        }
    }
    
    private void createDomainSecuritySettingsSection(FormToolkit toolkit, Composite parent) {
        Section section3 = toolkit.createSection(_domainPage, Section.TITLE_BAR);
        section3.setText("Security Configurations"); //$NON-NLS-1$
        section3.setLayout(new GridLayout(1, false));
        section3.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));

        // Composite for storing controls of the main section
        Composite client3 = toolkit.createComposite(section3, SWT.WRAP);
        GridLayout layout3 = new GridLayout(1, false);
        client3.setLayout(layout3);
        
        _securityInstanceTable = new SecurityInstanceTable(client3, SWT.NONE);
        _securityInstanceTable.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 1, 5));
        _securityInstanceTable.setSwitchYardRoot(_syRoot);
        _securityInstanceTable.setEditingDomain(_editDomain);

        section3.setClient(client3);
    }

    private void createDomainPage() {
        if (_domainPage == null) {

            if (_toolkit == null) {
                _toolkit = new FormToolkit(getContainer().getDisplay());
            }

            final ScrolledComposite sc1 = new ScrolledComposite(getContainer(), SWT.H_SCROLL | SWT.V_SCROLL);
            sc1.setAlwaysShowScrollBars(false);
            sc1.setExpandHorizontal(true);
            sc1.setExpandVertical(true);
            sc1.setLayoutData(new GridData(GridData.FILL_BOTH));
            
            _domainPage = _toolkit.createComposite(sc1);
            _domainPage.setLayout(new GridLayout(1, false));

            createDomainSettingsSection(_toolkit, _domainPage);
            createDomainSecuritySettingsSection(_toolkit, _domainPage);

            sc1.setContent(_domainPage);
            sc1.setMinSize(_domainPage.computeSize(SWT.DEFAULT, SWT.DEFAULT));

            int index = addPage(sc1);
            setPageText(index, Messages.title_domain);
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
                setPageText(pageIndex, Messages.title_design);

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
                setPageText(pageIndex, Messages.title_source);
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

    private void refresh() {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                IEditorInput input = getSourceViewer().getEditorInput();
                if (input instanceof IFileEditorInput) {
                    IFile oldFile = ((IFileEditorInput)input).getFile();
                    boolean doesFileExist = oldFile.exists();
                    if (!doesFileExist) {
                        // close the editor, it's been deleted
                        IEditorPart editorPart = ResourceUtil.findEditor(getSite().getPage(), oldFile);
                        getSite().getPage().closeEditor(editorPart, false);
                        return;
                    }
                }
                if (!_messageTraceCheckbox.isDisposed()) {
                    _messageTraceCheckbox.setSelection(testForMessageTraceHandler());
                }
                if (!_domainProperties.isDisposed()) {
                    _domainProperties.setSelection(getDomainPropertyList());
                }
                if (_syRoot != null) {
                    DomainType domain = _syRoot.getDomain();
                    if (domain != null) {
                        if (!_domainProperties.isDisposed()) {
                            _domainProperties.setTargetObject(domain);
                        }
                        if (!_securityInstanceTable.isDisposed()) {
                            _securityInstanceTable.setSecurity(domain.getSecurities());
                        }
                        if (!_propFileText.isDisposed() && domain.getProperties() != null && domain.getProperties().getLoad() != null) {
                            _propFileText.setText(domain.getProperties().getLoad());
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

    /* (non-Javadoc)
     * @see org.switchyard.tools.ui.editor.property.AbstractModelComposite#validate()
     */
    private IStatus validate() {
        if (_syRoot != null && _syRoot.getDomain() != null 
                && _syRoot.getDomain().getProperties() != null 
                && _syRoot.getDomain().getProperties().getLoad() != null) {
            String loadPath = _syRoot.getDomain().getProperties().getLoad();
            IStatus loadStatus = PropertiesFileLoadDialog.validatePropertiesLoadValue(loadPath);
            if (loadStatus != Status.OK_STATUS) {
                return loadStatus;
            }
        }
        
        return Status.OK_STATUS;
    }

}
