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
package org.switchyard.tools.ui.editor.components.bpm;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.models.switchyard1_0.bpm.ActionType1;
import org.switchyard.tools.models.switchyard1_0.bpm.AuditType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMFactory;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.models.switchyard1_0.bpm.EventListenerType;
import org.switchyard.tools.models.switchyard1_0.bpm.MappingType;
import org.switchyard.tools.models.switchyard1_0.bpm.TaskHandlerType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IImplementationComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class BPMImplementationComposite extends AbstractSwitchyardComposite implements IImplementationComposite {

    private Component _component;
    private ComponentService _serviceInterface;
    private ComponentService _service;
//    private Link _newBPMNLink;
    private Text _bpmnFileText;
    private Button _browseBPMNButton;
    private Composite _panel;
    private Implementation _implementation = null;
    private IJavaProject _project;
    private TabbedPropertySheetWidgetFactory _factory = new TabbedPropertySheetWidgetFactory();
    private boolean _auditingEnabled;
    private Button _auditingEnabledCheckbox;
    private AuditType _auditSettings = BPMFactory.eINSTANCE.createAuditType();
    private Text _auditLogText;
    private Text _auditIntervalText;
    private Combo _auditTypeList;
    private BPMActionTable _actionTable;
    private String _processId;
    private Text _processIdText;
    private boolean _persistent;
    private Button _persistentCheckbox;
    private BPMEventListenerTable _eventListenerTable;
    private BPMParametersTable _parametersTable;
    private BPMResultsTable _resultsTable;
    private BPMTaskHandlerTable _taskHandlerTable;
    private String _messageInName;
    private Text _messageInNameText;
    private String _messageOutName;
    private Text _messageOutNameText;
    
    /**
     * Constructor.
     */
    public BPMImplementationComposite() {
        // empty
    }

    /**
     * @param parent composite parent
     * @param style any style bits
     */
    public void createContents(Composite parent, int style) {

        _panel = new Composite(parent, SWT.NONE);
        _panel.setLayout(new GridLayout(3, false));

//        _newBPMNLink = new Link(_panel, SWT.NONE);
//        _newBPMNLink.setText("<a>BPMN File:</a>");
//        _newBPMNLink.addSelectionListener(new SelectionAdapter() {
//            @Override
//            public void widgetSelected(SelectionEvent event) {
//                openNewWizard();
//            }
//
//        });

        createLabel(_panel, "BPMN File:");
        _bpmnFileText = _factory.createText(_panel, "", SWT.READ_ONLY | SWT.BORDER);
        _bpmnFileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _bpmnFileText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                if (_implementation != null && !inUpdate()) {
                    handleModify((Control)event.getSource());
                }
            }

        });

        _browseBPMNButton = _factory.createButton(_panel, "Browse...", SWT.PUSH);
        _browseBPMNButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                handleBrowse();
            }

        });

        createLabel(_panel, "Process ID:");
        _processIdText = _factory.createText(_panel, "", SWT.SINGLE | SWT.BORDER);
        _processIdText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _processIdText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                _processId = _processIdText.getText();
                if (_implementation != null && !inUpdate()) {
                    handleModify((Control)event.getSource());
                }
            }
        });

        _persistentCheckbox = _factory.createButton(_panel, "Persist process state in database", SWT.CHECK);
        _persistentCheckbox.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        _persistentCheckbox.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                _persistent = _persistentCheckbox.getSelection();
                if (_implementation != null && !inUpdate()) {
                    handleModify((Control)event.getSource());
                }
            }
        });

        Composite actionDetails = new Composite(_panel, SWT.NONE);
        actionDetails.setLayout(new GridLayout(2, false));
        actionDetails.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
        _factory.adapt(actionDetails);

        createProcessPropertiesGroup(actionDetails);
        createAuditSettingsGroup(actionDetails);
        createParametersGroup(actionDetails);
        createTaskHandlerGroup(actionDetails);
        createActionGroup(actionDetails);
        createEventListenerGroup(actionDetails);
        createResultsGroup(actionDetails);
        
    }

    private void createActionGroup(Composite contents) {
        final Group actionTableGroup = new Group(contents, SWT.NONE);
        actionTableGroup.setLayout(new GridLayout(2, false));
        actionTableGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        actionTableGroup.setText("Actions");
        _factory.adapt(actionTableGroup);

        _actionTable = new BPMActionTable(actionTableGroup, SWT.NONE);
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

    private void createEventListenerGroup(Composite contents) {
        final Group eventListenerTableGroup = new Group(contents, SWT.NONE);
        eventListenerTableGroup.setLayout(new GridLayout(2, false));
        eventListenerTableGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        eventListenerTableGroup.setText("Event Listeners");
        _factory.adapt(eventListenerTableGroup);

        _eventListenerTable = new BPMEventListenerTable(eventListenerTableGroup, SWT.NONE);
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

    private void createParametersGroup(Composite contents) {
        final Group parametersTableGroup = new Group(contents, SWT.NONE);
        parametersTableGroup.setLayout(new GridLayout(2, false));
        parametersTableGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        parametersTableGroup.setText("Parameters");
        _factory.adapt(parametersTableGroup);

        _parametersTable = new BPMParametersTable(parametersTableGroup, SWT.NONE);
        _parametersTable.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 3));
        _parametersTable.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (_implementation != null && !inUpdate() && hasChanged()) {
                    validate();
                    handleModify(_parametersTable);
                    fireChangedEvent(_parametersTable);
                }
            }
        });
    }

    private void createResultsGroup(Composite contents) {
        final Group resultsTableGroup = new Group(contents, SWT.NONE);
        resultsTableGroup.setLayout(new GridLayout(2, false));
        resultsTableGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        resultsTableGroup.setText("Results");
        _factory.adapt(resultsTableGroup);

        _resultsTable = new BPMResultsTable(resultsTableGroup, SWT.NONE);
        _resultsTable.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 3));
        _resultsTable.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (_implementation != null && !inUpdate() && hasChanged()) {
                    validate();
                    handleModify(_resultsTable);
                    fireChangedEvent(_resultsTable);
                }
            }
        });
    }

    private void createTaskHandlerGroup(Composite contents) {
        final Group taskHandlerTableGroup = new Group(contents, SWT.NONE);
        taskHandlerTableGroup.setLayout(new GridLayout(2, false));
        taskHandlerTableGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        taskHandlerTableGroup.setText("Task Handlers");
        _factory.adapt(taskHandlerTableGroup);

        _taskHandlerTable = new BPMTaskHandlerTable(taskHandlerTableGroup, SWT.NONE);
        _taskHandlerTable.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 3));
        _taskHandlerTable.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (_implementation != null && !inUpdate() && hasChanged()) {
                    validate();
                    handleModify(_taskHandlerTable);
                    fireChangedEvent(_taskHandlerTable);
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
                if (_implementation != null && !inUpdate()) {
                    handleModify(_auditingEnabledCheckbox);
                }
                setAuditSettings(((BPMImplementationType)_implementation).getAudit());
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
                if (_implementation != null && !inUpdate()) {
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
                    if (_implementation != null && !inUpdate()) {
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
                if (_implementation != null && !inUpdate()) {
                    handleModify(_auditTypeList);
                }
            }
        });
        org.switchyard.tools.models.switchyard1_0.commonrules.AuditType.values();
    }

    private void createProcessPropertiesGroup(Composite contents) {
        Group processPropertiesGroup = new Group(contents, SWT.NONE);
        processPropertiesGroup.setLayout(new GridLayout(2, false));
        processPropertiesGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        processPropertiesGroup.setText("Process Property Names");
        _factory.adapt(processPropertiesGroup);

        createLabel(processPropertiesGroup, "Input Message:");
        _messageInNameText = _factory.createText(processPropertiesGroup, "", SWT.SINGLE | SWT.BORDER);
        _messageInNameText
                .setToolTipText("The name for the property in which the input message contents will be stored.  (default, \"messageContentIn\")");
        _messageInNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _messageInNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                _messageInName = _messageInNameText.getText();
                if (_implementation != null && !inUpdate()) {
                    handleModify((Control)event.getSource());
                }
            }
        });

        createLabel(processPropertiesGroup, "Output Message:");
        _messageOutNameText = _factory.createText(processPropertiesGroup, "", SWT.SINGLE | SWT.BORDER);
        _messageOutNameText
                .setToolTipText("The name for the property in which the output message contents will be stored.  (default, \"messageContentOut\")");
        _messageOutNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _messageOutNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                _messageOutName = _messageOutNameText.getText();
                if (_implementation != null && !inUpdate()) {
                    handleModify((Control)event.getSource());
                }
            }
        });
    }

    protected void handleModify(Control control) {
        if (_implementation instanceof BPMImplementationType) {
            if (control.equals(_bpmnFileText)) {
                String bpmnFile = _bpmnFileText.getText().trim();
                updateFeature(_implementation, "processDefinition", bpmnFile);
            } else if (control.equals(_processIdText)) {
                updateFeature(_implementation, "processId", _processId);
            } else if (control.equals(_persistentCheckbox)) {
                updateFeature(_implementation, "persistent", _persistent);
            } else if (control.equals(_messageInNameText)) {
                updateFeature(_implementation, "messageContentInName", _messageInName);
            } else if (control.equals(_messageOutNameText)) {
                updateFeature(_implementation, "messageContentOutName", _messageOutName);
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
            validate();
            setHasChanged(false);
        }
    }
    
    protected boolean validate() {
        setErrorMessage(null);
        if (_bpmnFileText == null) {
            setErrorMessage("Please select a BPM file.");
        } else if (getProcessId() == null) {
            setErrorMessage("Please specify a process ID.");
        } else if (isAuditingEnabled()) {
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
        if (this._implementation != null && this._implementation instanceof BPMImplementationType) {
            BPMImplementationType bpmImpl = (BPMImplementationType) this._implementation;
            if (bpmImpl.eContainer() instanceof ComponentService) {
                _service = (ComponentService) bpmImpl.eContainer();
                _serviceInterface = _service;
                if (_service.eContainer() instanceof Component) {
                    _component = (Component) _service.eContainer();
                }
            }
            setInUpdate(true);
            setTextValue(_processIdText, bpmImpl.getProcessId());
            setTextValue(_bpmnFileText, bpmImpl.getProcessDefinition());
            setTextValue(_messageInNameText, bpmImpl.getMessageContentInName());
            setTextValue(_messageOutNameText, bpmImpl.getMessageContentOutName());
            _auditingEnabled = bpmImpl.getAudit() != null;
            _auditingEnabledCheckbox.setSelection(_auditingEnabled);
            if (bpmImpl.getAudit() != null) {
                setAuditSettings(bpmImpl.getAudit());
            } else {
                setAuditSettings(null);
            }
            updateAuditControls();
            _actionTable.setTargetObject(bpmImpl);
            if (bpmImpl.getAction() != null && !bpmImpl.getAction().isEmpty()) {
                EList<ActionType1> actions = bpmImpl.getAction();
                _actionTable.setSelection(actions);
            }
            _eventListenerTable.setTargetObject(bpmImpl);
            if (bpmImpl.getEventListener() != null && !bpmImpl.getEventListener().isEmpty()) {
                EList<EventListenerType> actions = bpmImpl.getEventListener();
                _eventListenerTable.setSelection(actions);
            }
            _parametersTable.setTargetObject(bpmImpl);
            if (bpmImpl.getParameters() != null && !bpmImpl.getParameters().getMapping().isEmpty()) {
                EList<MappingType> actions = bpmImpl.getParameters().getMapping();
                _parametersTable.setSelection(actions);
            }
            _resultsTable.setTargetObject(bpmImpl);
            if (bpmImpl.getResults() != null && !bpmImpl.getResults().getMapping().isEmpty()) {
                EList<MappingType> actions = bpmImpl.getResults().getMapping();
                _resultsTable.setSelection(actions);
            }
            _taskHandlerTable.setTargetObject(bpmImpl);
            if (bpmImpl.getTaskHandler() != null && !bpmImpl.getTaskHandler().isEmpty()) {
                EList<TaskHandlerType> actions = bpmImpl.getTaskHandler();
                _taskHandlerTable.setSelection(actions);
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
        ClasspathResourceSelectionDialog dialog = new ClasspathResourceSelectionDialog(getShell(), container, "bpmn");
        if (dialog.open() == SelectionDialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length > 0 && result[0] instanceof IResource) {
                IResource bpmnFile = (IResource) result[0];
                String bpmnFilePath = JavaUtil.getJavaPathForResource(bpmnFile).toString();

                // update the text box, which should trigger a validate
                _bpmnFileText.setText(bpmnFilePath);
                handleModify(_bpmnFileText);
            }
        }
    }

    private void openNewWizard() {
        NewBPMComponentWizard wizard = new NewBPMComponentWizard(false);
        SwitchyardSCAEditor editor = SwitchyardSCAEditor.getActiveEditor();
        IResource resource = JavaUtil.getFirstResourceRoot(_project);
        IStructuredSelection selection = resource == null ? StructuredSelection.EMPTY : new StructuredSelection(
                resource);
        IWorkbench workbench = editor == null ? PlatformUI.getWorkbench() : editor.getEditorSite().getWorkbenchWindow()
                .getWorkbench();
        wizard.init(workbench, selection);
        wizard.init(_component == null ? null : (org.eclipse.soa.sca.sca1_1.model.sca.Composite) _component.eContainer());
        wizard.forceServiceInterfaceType(_serviceInterface);
        WizardDialog dialog = new WizardDialog(getShell(), wizard);
        if (dialog.open() == WizardDialog.OK) {
            _implementation = (BPMImplementationType) wizard.getCreatedObject().getImplementation();
            BPMImplementationType bpmImpl = (BPMImplementationType) this._implementation;
            _service = wizard.getService();
            _bpmnFileText.setText(bpmImpl.getProcessDefinition());
        }
    }
    
    private Shell getShell() {
        return Display.getCurrent().getActiveShell();    
    }

    private Label createLabel(Composite parent, String text) {
        Label label = _factory.createLabel(parent, text);
        return label;
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

    private void loadComboFromEnum(Combo combo,
            List<org.switchyard.tools.models.switchyard1_0.commonrules.AuditType> values) {
        for (org.switchyard.tools.models.switchyard1_0.commonrules.AuditType enumval : values) {
            combo.add(enumval.getLiteral(), enumval.getValue());
        }
    }

    /**
     * @return the process ID.
     */
    public String getProcessId() {
        return nullForEmpty(_processId);
    }

    /**
     * @param processId The process ID to set.
     */
    public void setProcessId(String processId) {
        if (_processIdText == null) {
            _processId = processId;
        } else {
            _processIdText.setText(processId);
        }
    }

    /**
     * @return is persistent.
     */
    public boolean isPersistent() {
        return _persistent;
    }

    /**
     * @param persistent Persistent or not.
     */
    public void setPersistent(boolean persistent) {
        if (_persistentCheckbox == null) {
            _persistent = persistent;
        } else {
            _persistentCheckbox.setSelection(persistent);
        }
    }

    /**
     * @return the process variable name to be used for storing inbound message
     *         content.
     */
    public String getMessageInName() {
        return nullForEmpty(_messageInName);
    }

    /**
     * @param messageInName The process variable name to be used for storing
     *            inbound message content.
     */
    public void setMessageInName(String messageInName) {
        if (_messageInNameText == null) {
            _messageInName = messageInName;
        } else {
            _messageInNameText.setText(messageInName);
        }
    }

    /**
     * @return the process variable name to be used for storing outbound message
     *         content.
     */
    public String getMessageOutName() {
        return nullForEmpty(_messageOutName);
    }

    /**
     * @param messageOutName The process variable name to be used for storing
     *            outbound message content.
     */
    public void setMessageOutName(String messageOutName) {
        if (_messageOutNameText == null) {
            _messageOutName = messageOutName;
        } else {
            _messageOutNameText.setText(messageOutName);
        }
    }

    protected void updateAuditFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        BPMImplementationType bpmImpl = (BPMImplementationType) this._implementation;
        ops.add(new AddAuditTypeOp());
        ops.add(new BasicEObjectOperation(bpmImpl.getAudit(), featureId, value));
        wrapOperation(bpmImpl, ops);
    }

    protected void addAuditFeature() {
        BPMImplementationType bpmImpl = (BPMImplementationType) this._implementation;
        if (bpmImpl.getAudit() == null) {
            ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
            ops.add(new AddAuditTypeOp());
            wrapOperation(bpmImpl, ops);
        }
    }

    protected void removeAuditFeature() {
        BPMImplementationType bpmImpl = (BPMImplementationType) this._implementation;
        if (bpmImpl.getAudit() != null) {
            ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
            ops.add(new RemoveAuditTypeOp());
            wrapOperation(bpmImpl, ops);
        }
    }

    class AddAuditTypeOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_implementation != null) {
                BPMImplementationType bpmImpl = (BPMImplementationType) _implementation;
                if (bpmImpl.getAudit() == null) {
                    bpmImpl.setAudit(BPMFactory.eINSTANCE.createAuditType());
                }
            }
        }
    }

    class RemoveAuditTypeOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_implementation != null) {
                BPMImplementationType bpmImpl = (BPMImplementationType) _implementation;
                if (bpmImpl.getAudit() != null) {
                    bpmImpl.setAudit(null);
                }
            }
        }
    }
}
