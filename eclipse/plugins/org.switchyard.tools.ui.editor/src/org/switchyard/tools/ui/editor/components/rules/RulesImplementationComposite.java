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
package org.switchyard.tools.ui.editor.components.rules;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.models.switchyard1_0.rules.ActionType1;
import org.switchyard.tools.models.switchyard1_0.rules.AuditType;
import org.switchyard.tools.models.switchyard1_0.rules.EventListenerType;
import org.switchyard.tools.models.switchyard1_0.rules.MappingType;
import org.switchyard.tools.models.switchyard1_0.rules.ResourceType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesFactory;
import org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IImplementationComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.OpenFileUtil;

/**
 * @author bfitzpat
 * 
 */
public class RulesImplementationComposite extends AbstractSwitchyardComposite implements IImplementationComposite {

    private Component _component;
//    private ComponentService _serviceInterface;
    private Link _newRulesLink;
    private Text _rulesFileText;
    private Button _browseRulesButton;
    private ComponentService _service;
    private Composite _panel;
    private Implementation _implementation = null;
    private IJavaProject _project;
    // private String _packageName;
    // private Text _packageNameText;
    private boolean _agent;
    private Button _agentCheckbox;
    private boolean _auditingEnabled;
    private Button _auditingEnabledCheckbox;
    private AuditType _auditSettings = RulesFactory.eINSTANCE.createAuditType();
    private Text _auditLogText;
    private Text _auditIntervalText;
    private Combo _auditTypeList;
    private RulesActionTable _actionTable;
    private RulesGlobalTable _globalsTable;
    private RulesFactsTable _factsTable;
    private RulesEventListenerTable _eventListenerTable;
    private TabbedPropertySheetWidgetFactory _factory = new TabbedPropertySheetWidgetFactory();

    /**
     * Constructor.
     */
    public RulesImplementationComposite() {
        // empty
    }

    /**
     * @param parent composite parent
     * @param style any style bits
     */
    public void createContents(Composite parent, int style) {

        _panel = new Composite(parent, SWT.NONE);
        _panel.setLayout(new GridLayout(3, false));
        _factory.adapt(_panel);

        _newRulesLink = new Link(_panel, SWT.NONE);
        _newRulesLink.setText("<a>Rules File:</a>");
        _newRulesLink.setBackground(_panel.getBackground());
        _newRulesLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                String oldResult = _rulesFileText.getText().trim();
                IFile modelFile = SwitchyardSCAEditor.getEditor(_implementation).getModelFile();
                IPath rulesPath = modelFile.getParent().getParent().getProjectRelativePath();
                rulesPath = rulesPath.append(oldResult);
                IProject project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
                if (project.exists(rulesPath)) {
                    IResource rulesFile = project.findMember(rulesPath);
                    OpenFileUtil.openFile(rulesFile);
//                } else {
//                    openNewWizard();
                }
            }
        });

//        createLabel(_panel,  "Rules File:");
        _rulesFileText = _factory.createText(_panel, "", SWT.READ_ONLY | SWT.BORDER);
        _rulesFileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _rulesFileText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                if (_implementation != null && !inUpdate()) {
                    validate();
                    handleModify(_rulesFileText);
                    fireChangedEvent(_rulesFileText);
                }
            }

        });

        _browseRulesButton = _factory.createButton(_panel, "Browse...", SWT.PUSH);
        _browseRulesButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                handleBrowse();
            }

        });

        Composite actionDetails = new Composite(_panel, SWT.NONE);
        actionDetails.setLayout(new GridLayout(2, false));
        actionDetails.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
        _factory.adapt(actionDetails);

        // createLabel(actionDetails, "Package Name:");
        // _packageNameText = _factory.createText(actionDetails, "", SWT.SINGLE
        // | SWT.BORDER);
        // _packageNameText.setLayoutData(new
        // GridData(GridData.FILL_HORIZONTAL));
        // _packageNameText.addModifyListener(new ModifyListener() {
        // @Override
        // public void modifyText(ModifyEvent event) {
        // _packageName = _packageNameText.getText();
        // validate();
        // }
        // });

        createAuditSettingsGroup(actionDetails);

        createActionGroup(actionDetails);

        createGlobalsGroup(actionDetails);

        createFactsGroup(actionDetails);
        
        createEventListenerGroup(actionDetails);
    }

    private void createActionGroup(Composite contents) {
        final Group actionTableGroup = new Group(contents, SWT.NONE);
        actionTableGroup.setLayout(new GridLayout(2, false));
        actionTableGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        actionTableGroup.setText("Actions");
        _factory.adapt(actionTableGroup);

        _actionTable = new RulesActionTable(actionTableGroup, SWT.NONE);
        _actionTable.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 3));
        _actionTable.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (_implementation != null && !inUpdate() && hasChanged()) {
                    validate();
                    handleModify(_actionTable);
                    fireChangedEvent(_actionTable);
                }
            }
        });
    }

    private void createGlobalsGroup(Composite contents) {
        final Group globalsTableGroup = new Group(contents, SWT.NONE);
        globalsTableGroup.setLayout(new GridLayout(2, false));
        globalsTableGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        globalsTableGroup.setText("Globals");
        _factory.adapt(globalsTableGroup);

        _globalsTable = new RulesGlobalTable(globalsTableGroup, SWT.NONE);
        _globalsTable.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 3));
        _globalsTable.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (_implementation != null && !inUpdate() && hasChanged()) {
                    validate();
                    handleModify(_globalsTable);
                    fireChangedEvent(_globalsTable);
                }
            }
        });
    }

    private void createFactsGroup(Composite contents) {
        final Group factsTableGroup = new Group(contents, SWT.NONE);
        factsTableGroup.setLayout(new GridLayout(2, false));
        factsTableGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        factsTableGroup.setText("Facts");
        _factory.adapt(factsTableGroup);

        _factsTable = new RulesFactsTable(factsTableGroup, SWT.NONE);
        _factsTable.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 3));
        _factsTable.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (_implementation != null && !inUpdate() && hasChanged()) {
                    validate();
                    handleModify(_factsTable);
                    fireChangedEvent(_factsTable);
                }
            }
        });
    }

    private void createEventListenerGroup(Composite contents) {
        final Group eventListenerTableGroup = new Group(contents, SWT.NONE);
        eventListenerTableGroup.setLayout(new GridLayout(2, false));
        eventListenerTableGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        eventListenerTableGroup.setText("Event Listeners");
        _factory.adapt(eventListenerTableGroup);

        _eventListenerTable = new RulesEventListenerTable(eventListenerTableGroup, SWT.NONE);
        _eventListenerTable.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 3));
        _eventListenerTable.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (_implementation != null && !inUpdate() && hasChanged()) {
                    validate();
                    handleModify(_eventListenerTable);
                    fireChangedEvent(_eventListenerTable);
                }
            }
        });
    }

    private void createAuditSettingsGroup(Composite contents) {
        final Group auditSettingsGroup = new Group(contents, SWT.NONE);
        auditSettingsGroup.setLayout(new GridLayout(2, false));
        auditSettingsGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        auditSettingsGroup.setText("Audit Settings");
        _factory.adapt(auditSettingsGroup);

        _auditingEnabledCheckbox = _factory.createButton(auditSettingsGroup, "Enable auditing", SWT.CHECK);
        _auditingEnabledCheckbox.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        _auditingEnabledCheckbox.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                _auditingEnabled = _auditingEnabledCheckbox.getSelection();
                updateAuditControls();
                if (!inUpdate()) {
                    handleModify(_auditingEnabledCheckbox);
                }
                setAuditSettings(((RulesImplementationType)_implementation).getAudit());
                validate();
            }
        });

        createLabel(auditSettingsGroup, "Log Name:");
        _auditLogText = _factory.createText(auditSettingsGroup, "", SWT.SINGLE | SWT.BORDER);
        _auditLogText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _auditLogText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                _auditSettings.setLog(nullForEmpty(_auditLogText.getText()));
                if (!inUpdate()) {
                    handleModify(_auditLogText);
                }
                validate();
            }
        });

        createLabel(auditSettingsGroup, "Interval:");
        _auditIntervalText = _factory.createText(auditSettingsGroup, "", SWT.SINGLE | SWT.BORDER);
        _auditIntervalText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _auditIntervalText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                try {
                    _auditSettings.setInterval(Integer.parseInt(_auditIntervalText.getText()));
                    if (!inUpdate()) {
                        handleModify(_auditIntervalText);
                    }
                } catch (NumberFormatException e) {
                    e.fillInStackTrace();
                }
                validate();
            }
        });

        _auditTypeList = createLabelAndCombo(auditSettingsGroup, "Log Type:", true);
        _factory.adapt(_auditTypeList, false, false);
        loadComboFromEnum(_auditTypeList, org.switchyard.tools.models.switchyard1_0.commonrules.AuditType.VALUES);
        _auditTypeList.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                widgetDefaultSelected(e);
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                if (!inUpdate()) {
                    handleModify(_auditTypeList);
                }
            }
        });
        org.switchyard.tools.models.switchyard1_0.commonrules.AuditType.values();
    }

    private void loadComboFromEnum(Combo combo,
            List<org.switchyard.tools.models.switchyard1_0.commonrules.AuditType> values) {
        for (org.switchyard.tools.models.switchyard1_0.commonrules.AuditType enumval : values) {
            combo.add(enumval.getLiteral(), enumval.getValue());
        }
    }

    private Label createLabel(Composite parent, String text) {
        Label label = _factory.createLabel(parent, text);
        return label;
    }

    class AddResourceTypeOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_implementation != null) {
                RulesImplementationType rulesImpl = (RulesImplementationType) _implementation;
                if (rulesImpl.getResource() != null && rulesImpl.getResource().isEmpty()) {
                    ResourceType resType = RulesFactory.eINSTANCE.createResourceType();
                    resType.setType("DRL");
                    rulesImpl.getResource().add(resType);
                }
            }
        }
    }

    class AddAuditTypeOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_implementation != null) {
                RulesImplementationType rulesImpl = (RulesImplementationType) _implementation;
                if (rulesImpl.getAudit() == null) {
                    rulesImpl.setAudit(RulesFactory.eINSTANCE.createAuditType());
                }
            }
        }
    }

    class RemoveAuditTypeOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_implementation != null) {
                RulesImplementationType rulesImpl = (RulesImplementationType) _implementation;
                if (rulesImpl.getAudit() != null) {
                    rulesImpl.setAudit(null);
                }
            }
        }
    }

    protected void updateRulesLocationFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        RulesImplementationType rulesImpl = (RulesImplementationType) this._implementation;
        ops.add(new AddResourceTypeOp());
        ops.add(new BasicEObjectOperation(rulesImpl.getResource().get(0), featureId, value));
        wrapOperation(rulesImpl, ops);
    }

    protected void updateAuditFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        RulesImplementationType rulesImpl = (RulesImplementationType) this._implementation;
        ops.add(new AddAuditTypeOp());
        ops.add(new BasicEObjectOperation(rulesImpl.getAudit(), featureId, value));
        wrapOperation(rulesImpl, ops);
    }

    protected void addAuditFeature() {
        RulesImplementationType rulesImpl = (RulesImplementationType) this._implementation;
        if (rulesImpl.getAudit() == null) {
            ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
            ops.add(new AddAuditTypeOp());
            wrapOperation(rulesImpl, ops);
        }
    }

    protected void removeAuditFeature() {
        RulesImplementationType rulesImpl = (RulesImplementationType) this._implementation;
        if (rulesImpl.getAudit() != null) {
            ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
            ops.add(new RemoveAuditTypeOp());
            wrapOperation(rulesImpl, ops);
        }
    }

    protected void handleModify(Control control) {
        if (control.equals(_rulesFileText)) {
            final String rulesFileText = _rulesFileText.getText().trim();
            validate();
            if (_implementation instanceof RulesImplementationType) {
                if (_rulesFileText != null && !_rulesFileText.isDisposed() && _rulesFileText.isEnabled()) {
                    updateRulesLocationFeature("location", rulesFileText);
                }
            }
        } else if (control.equals(_auditIntervalText)) {
            updateAuditFeature("interval", getAuditSettings().getInterval());
        } else if (control.equals(_auditingEnabledCheckbox)) {
            if (_auditingEnabled) {
                addAuditFeature();
            } else {
                removeAuditFeature();
            }
        } else if (control.equals(_auditLogText)) {
            updateAuditFeature("log", getAuditSettings().getLog());
        } else if (control.equals(_auditTypeList)) {
            updateAuditFeature("type",
                    org.switchyard.tools.models.switchyard1_0.commonrules.AuditType.get(_auditTypeList
                            .getSelectionIndex()));
        }
        setHasChanged(false);
    }

    protected boolean validate() {
        setErrorMessage(null);
        if (_rulesFileText == null) {
            setErrorMessage("Please select a rules file.");
        }
        if (isAuditingEnabled()) {
            final String intervalText = _auditIntervalText.getText();
            if (intervalText.length() != 0) {
                try {
                    Integer.parseInt(intervalText);
                } catch (NumberFormatException e) {
                    setErrorMessage(e.getLocalizedMessage());
                }
            }
        }
        return (getErrorMessage() == null);
    }

    /**
     * @return interface
     */
    public Implementation getImplementation() {
        return _implementation;
    }

    /**
     * @param impl implementation coming in
     */
    public void setImplementation(Implementation impl) {
        this._implementation = impl;
        if (this._implementation != null && this._implementation instanceof RulesImplementationType) {
            RulesImplementationType rulesImpl = (RulesImplementationType) this._implementation;
            if (rulesImpl.eContainer() instanceof Component) {
                this._component = (Component) rulesImpl.eContainer();
                if (!this._component.getService().isEmpty()) {
                    this._service = this._component.getService().get(0);
                }
            } else if (rulesImpl.eContainer() instanceof ComponentService) {
                _service = (ComponentService) rulesImpl.eContainer();
//                _serviceInterface = _service;
                if (_service.eContainer() instanceof Component) {
                    _component = (Component) _service.eContainer();
                }
            }
            setInUpdate(true);
            _auditingEnabled = rulesImpl.getAudit() != null;
            _auditingEnabledCheckbox.setSelection(_auditingEnabled);
            if (rulesImpl.getAudit() != null) {
                setAuditSettings(rulesImpl.getAudit());
            } else {
                setAuditSettings(null);
            }
            updateAuditControls();
            if (rulesImpl.getResource() != null && !rulesImpl.getResource().isEmpty()) {
                ResourceType resType = rulesImpl.getResource().get(0);
                String location = resType.getLocation();
                setTextValue(_rulesFileText, location);
            }
            _actionTable.setTargetObject(rulesImpl);
            if (rulesImpl.getAction() != null && !rulesImpl.getAction().isEmpty()) {
                EList<ActionType1> actions = rulesImpl.getAction();
                _actionTable.setSelection(actions);
            }
            _globalsTable.setTargetObject(rulesImpl);
            if (rulesImpl.getGlobals() != null && !rulesImpl.getGlobals().getMapping().isEmpty()) {
                EList<MappingType> actions = rulesImpl.getGlobals().getMapping();
                _globalsTable.setSelection(actions);
            }
            _factsTable.setTargetObject(rulesImpl);
            if (rulesImpl.getFacts() != null && !rulesImpl.getFacts().getMapping().isEmpty()) {
                EList<MappingType> actions = rulesImpl.getFacts().getMapping();
                _factsTable.setSelection(actions);
            }
            _eventListenerTable.setTargetObject(rulesImpl);
            if (rulesImpl.getEventListener() != null && !rulesImpl.getEventListener().isEmpty()) {
                EList<EventListenerType> actions = rulesImpl.getEventListener();
                _eventListenerTable.setSelection(actions);
            }
            setInUpdate(false);
        }
        addObservableListeners();
    }

    /**
     * @return panel
     */
    public Composite getPanel() {
        return _panel;
    }

    private void handleBrowse() {
        IContainer container;
        if (_project == null) {
            container = ResourcesPlugin.getWorkspace().getRoot();
        } else {
            container = _project.getProject();
        }
        ClasspathResourceSelectionDialog dialog = new ClasspathResourceSelectionDialog(getShell(), container, "drl");
        if (dialog.open() == SelectionDialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length > 0 && result[0] instanceof IResource) {
                IResource rulesFile = (IResource) result[0];
                String rulesFilePath = JavaUtil.getJavaPathForResource(rulesFile).toString();
                _implementation = RulesFactory.eINSTANCE.createRulesImplementationType();
                RulesImplementationType rulesImplementation = (RulesImplementationType) _implementation;
                rulesImplementation.getResource().add(NewRulesComponentWizard.createRulesResource(rulesFilePath));

                // we have no way of inferring the service interface
                _service = null;

                // update the text box, which should trigger a validate
                _rulesFileText.setText(rulesFilePath);
            }
        }
    }

//    private void openNewWizard() {
//        NewRulesResourceWizard wizard = new NewRulesResourceWizard();
//        
//        wizard.init(this._component);
//        wizard.setImplementation((RulesImplementationType) this._implementation);
//        SwitchyardSCAEditor editor = SwitchyardSCAEditor.getEditor(this._component);
//        IResource resource = editor.getModelFile();
//        IStructuredSelection selection = resource == null ? StructuredSelection.EMPTY : new StructuredSelection(
//                resource);
//        IWorkbench workbench = editor == null ? PlatformUI.getWorkbench() : editor.getEditorSite().getWorkbenchWindow()
//                .getWorkbench();
//        wizard.init(workbench, selection);
//        WizardDialog dialog = new WizardDialog(getShell(), wizard);
//        if (dialog.open() == WizardDialog.OK) {
//            IFile createdFile = wizard.getFile();
//            String rulesFilePath = JavaUtil.getJavaPathForResource(createdFile).toString();
//            setTextValue(this._rulesFileText, rulesFilePath);
//        }
//    }

    private Shell getShell() {
        return Display.getCurrent().getActiveShell();
    }

    private String emptyForNull(String string) {
        return string == null ? "" : string;
    }

    private String nullForEmpty(String string) {
        return string == null ? null : string.length() == 0 ? null : string;
    }

    private void updateAuditControls() {
        _auditIntervalText.setEnabled(_auditingEnabled);
        _auditLogText.setEnabled(_auditingEnabled);
        _auditTypeList.setEnabled(_auditingEnabled);
    }

    /**
     * @return true if auditing is enabled
     */
    public boolean isAuditingEnabled() {
        return _auditingEnabled;
    }

    // /**
    // * @return the package name.
    // */
    // public String getPackageName() {
    // return emptyForNull(_packageName);
    // }
    //
    // /**
    // * @param packageName The package name to set.
    // */
    // public void setPackageName(String packageName) {
    // if (_packageNameText == null) {
    // _packageName = packageName;
    // } else {
    // _packageNameText.setText(packageName);
    // }
    // }

    /**
     * @return is agent.
     */
    public boolean isAgent() {
        return _agent;
    }

    /**
     * @param agent Use KnowledgeAgent or not.
     */
    public void setAgent(boolean agent) {
        if (_agentCheckbox == null) {
            _agent = agent;
        } else {
            _agentCheckbox.setSelection(agent);
        }
    }

    /**
     * @return the audit settings.
     */
    public AuditType getAuditSettings() {
        return _auditSettings;
    }

    /**
     * @param auditSettings the new audit settings
     */
    public void setAuditSettings(AuditType auditSettings) {
        setInUpdate(true);
        if (auditSettings == null) {
            _auditLogText.setText("");
            _auditIntervalText.setText("");
            _auditTypeList.setText("");
            setInUpdate(false);
            return;
        }
        if (_auditingEnabledCheckbox == null) {
            _auditSettings = auditSettings;
        } else {
            _auditLogText.setText(emptyForNull(auditSettings.getLog()));
            _auditIntervalText.setText(Integer.toString(auditSettings.getInterval()));
            _auditTypeList.select(auditSettings.getType().getValue());
        }
        setInUpdate(false);
    }

    /**
     * @param auditingEnabled true to enable auditing.
     */
    public void setAuditingEnabled(boolean auditingEnabled) {
        if (_auditingEnabledCheckbox == null) {
            _auditingEnabled = auditingEnabled;
        } else {
            _auditingEnabledCheckbox.setSelection(auditingEnabled);
            updateAuditControls();
        }
    }
}
