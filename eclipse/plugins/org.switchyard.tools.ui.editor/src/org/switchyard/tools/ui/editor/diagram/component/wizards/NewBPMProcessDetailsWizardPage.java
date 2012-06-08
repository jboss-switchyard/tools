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
package org.switchyard.tools.ui.editor.diagram.component.wizards;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.bpm.AuditType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMFactory;
import org.switchyard.tools.ui.editor.util.JavaUtil;

/**
 * NewBPMProcessDetailsWizardPage
 * 
 * <p/>
 * Collects high level details about the process to be created, e.g. name, I/O,
 * persistence, auditing.
 * 
 * @author Rob Cernich
 */
public class NewBPMProcessDetailsWizardPage extends WizardPage {

    private String _processName;
    private Text _processNameText;
    private String _packageName;
    private Text _packageNameText;
    private String _processId;
    private Text _processIdText;
    private boolean _persistent;
    private Button _persistentCheckbox;
    private boolean _agent;
    private Button _agentCheckbox;
    private String _messageInName;
    private Text _messageInNameText;
    private String _messageOutName;
    private Text _messageOutNameText;
    private boolean _auditingEnabled;
    private Button _auditingEnabledCheckbox;
    private AuditType _auditSettings = BPMFactory.eINSTANCE.createAuditType();
    private Text _auditLogText;
    private Text _auditIntervalText;
    private ComboViewer _auditTypeList;
    private String _oldServiceName;
    private String _oldPackageName;

    /**
     * Create a new NewBPMProcessDetailsWizardPage.
     * 
     * @param pageName the page name
     */
    public NewBPMProcessDetailsWizardPage(String pageName) {
        super(pageName);
        setTitle("Business Process Details");
        setDescription("Please specify details about the business process.");
    }

    @Override
    public void createControl(Composite parent) {
        Composite contents = new Composite(parent, SWT.NONE);
        contents.setLayout(new GridLayout(2, false));

        createLabel(contents, "Process Name:");
        _processNameText = new Text(contents, SWT.SINGLE | SWT.BORDER);
        _processNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _processNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                _processName = _processNameText.getText();
                validate();
            }
        });

        createLabel(contents, "Package Name:");
        _packageNameText = new Text(contents, SWT.SINGLE | SWT.BORDER);
        _packageNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _packageNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                _packageName = _packageNameText.getText();
                validate();
            }
        });

        createLabel(contents, "Process ID:");
        _processIdText = new Text(contents, SWT.SINGLE | SWT.BORDER);
        _processIdText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _processIdText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                _processId = _processIdText.getText();
                validate();
            }
        });

        _persistentCheckbox = new Button(contents, SWT.CHECK);
        _persistentCheckbox.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        _persistentCheckbox.setText("Persist process state in database");
        _persistentCheckbox.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                _persistent = _persistentCheckbox.getSelection();
                validate();
            }
        });

        // TODO: enable once we figure out what "agent" means
        // _agentCheckbox = new Button(contents, SWT.CHECK);
        // _agentCheckbox.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
        // false, 2, 1));
        // _agentCheckbox.setText("Use KnowledgeAgent");
        // _agentCheckbox.addSelectionListener(new SelectionAdapter() {
        // @Override
        // public void widgetSelected(SelectionEvent event) {
        // _agent = _agentCheckbox.getSelection();
        // validate();
        // }
        // });

        createProcessPropertiesGroup(contents);

        createAuditSettingsGroup(contents);

        initControls();
        validate();
        setErrorMessage(null);

        setControl(contents);
    }

    private void createProcessPropertiesGroup(Composite contents) {
        Group processPropertiesGroup = new Group(contents, SWT.NONE);
        processPropertiesGroup.setLayout(new GridLayout(2, false));
        processPropertiesGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        processPropertiesGroup.setText("Process Property Names");

        createLabel(processPropertiesGroup, "Input Message:");
        _messageInNameText = new Text(processPropertiesGroup, SWT.SINGLE | SWT.BORDER);
        _messageInNameText
                .setToolTipText("The name for the property in which the input message contents will be stored.  (default, \"messageContentIn\")");
        _messageInNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _messageInNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                _messageInName = _messageInNameText.getText();
                validate();
            }
        });

        createLabel(processPropertiesGroup, "Output Message:");
        _messageOutNameText = new Text(processPropertiesGroup, SWT.SINGLE | SWT.BORDER);
        _messageOutNameText
                .setToolTipText("The name for the property in which the output message contents will be stored.  (default, \"messageContentOut\")");
        _messageOutNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _messageOutNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                _messageOutName = _messageOutNameText.getText();
                validate();
            }
        });
    }

    private void createAuditSettingsGroup(Composite contents) {
        final Group auditSettingsGroup = new Group(contents, SWT.NONE);
        auditSettingsGroup.setLayout(new GridLayout(2, false));
        auditSettingsGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        auditSettingsGroup.setText("Audit Settings");

        _auditingEnabledCheckbox = new Button(auditSettingsGroup, SWT.CHECK);
        _auditingEnabledCheckbox.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        _auditingEnabledCheckbox.setText("Enable auditing");
        _auditingEnabledCheckbox.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                _auditingEnabled = _auditingEnabledCheckbox.getSelection();
                updateAuditControls();
                validate();
            }
        });

        createLabel(auditSettingsGroup, "Log Name:");
        _auditLogText = new Text(auditSettingsGroup, SWT.SINGLE | SWT.BORDER);
        _auditLogText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _auditLogText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                _auditSettings.setLog(nullForEmpty(_auditLogText.getText()));
                validate();
            }
        });

        createLabel(auditSettingsGroup, "Interval:");
        _auditIntervalText = new Text(auditSettingsGroup, SWT.SINGLE | SWT.BORDER);
        _auditIntervalText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _auditIntervalText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                try {
                    _auditSettings.setInterval(Integer.parseInt(_auditIntervalText.getText()));
                } catch (NumberFormatException e) {
                    e.fillInStackTrace();
                }
                validate();
            }
        });

        createLabel(auditSettingsGroup, "Log Type:");
        _auditTypeList = new ComboViewer(auditSettingsGroup, SWT.DROP_DOWN);
        _auditTypeList.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                if (element instanceof org.switchyard.tools.models.switchyard1_0.commonrules.AuditType) {
                    return ((org.switchyard.tools.models.switchyard1_0.commonrules.AuditType) element).getLiteral();
                }
                return super.getText(element);
            }
        });
        _auditTypeList.setContentProvider(ArrayContentProvider.getInstance());
        _auditTypeList.setInput(org.switchyard.tools.models.switchyard1_0.commonrules.AuditType.values());
    }

    private Label createLabel(Composite parent, String text) {
        Label label = new Label(parent, SWT.NONE);
        label.setText(text);
        return label;
    }

    /**
     * @return the process name.
     */
    public String getProcessName() {
        return nullForEmpty(_processName);
    }

    /**
     * @param processName The process name to set.
     */
    public void setProcessName(String processName) {
        if (_processNameText == null) {
            _processName = processName;
        } else {
            _processNameText.setText(processName);
        }
    }

    /**
     * @return the package name.
     */
    public String getPackageName() {
        return emptyForNull(_packageName);
    }

    /**
     * @param packageName The package name to set.
     */
    public void setPackageName(String packageName) {
        if (_packageNameText == null) {
            _packageName = packageName;
        } else {
            _packageNameText.setText(packageName);
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

    /**
     * @return true if auditing is enabled.
     */
    public boolean isAuditingEnabled() {
        return _auditingEnabled;
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
        if (_auditingEnabledCheckbox == null) {
            _auditSettings = auditSettings;
        } else {
            _auditLogText.setText(emptyForNull(auditSettings.getLog()));
            _auditIntervalText.setText(Integer.toString(auditSettings.getInterval()));
            _auditTypeList.setSelection(new StructuredSelection(auditSettings.getType()), true);
        }
    }

    /**
     * Update the default values based on the setting in the file page.
     * 
     * @param project the currently targeted Java project.
     * @param bpmnFileName the current file name.
     * @param service the current service name.
     */
    public void update(IJavaProject project, String bpmnFileName, ComponentService service) {
        final String newServiceName = emptyForNull(service.getName());
        if (updateDefault(_oldServiceName, newServiceName, _processIdText.getText())) {
            setProcessId(newServiceName);
        }
        if (updateDefault(_oldServiceName, newServiceName, _processNameText.getText())) {
            setProcessName(newServiceName);
        }
        _oldServiceName = newServiceName;

        final String newPackageName;
        if (project == null) {
            newPackageName = "";
        } else {
            IJavaElement element = JavaUtil.getInitialPackageForProject(project);
            if (element.getElementType() == IJavaElement.PACKAGE_FRAGMENT) {
                newPackageName = ((IPackageFragment) element).getElementName();
            } else {
                newPackageName = "";
            }
        }
        if (updateDefault(_oldPackageName, newPackageName, _packageNameText.getText())) {
            setPackageName(newPackageName);
        }
        _oldPackageName = newPackageName;
    }

    private boolean updateDefault(String oldValue, String newValue, String currentValue) {
        return !currentValue.equals(newValue)
                && (oldValue == null || oldValue.length() == 0 || currentValue.length() == 0 || oldValue
                        .equals(currentValue));
    }

    private String emptyForNull(String string) {
        return string == null ? "" : string;
    }

    private String nullForEmpty(String string) {
        return string == null ? null : string.length() == 0 ? null : string;
    }

    private void initControls() {
        setAuditSettings(_auditSettings == null ? BPMFactory.eINSTANCE.createAuditType() : _auditSettings);
        setAuditingEnabled(_auditingEnabled);
        setMessageInName(emptyForNull(_messageInName));
        setMessageOutName(emptyForNull(_messageOutName));
        setPackageName(emptyForNull(_packageName));
        setPersistent(_persistent);
        setProcessId(emptyForNull(_processId));
        setProcessName(emptyForNull(_processName));
    }

    private void validate() {
        setErrorMessage(null);
        // TODO: we probably need to verify the content as well
        if (getProcessId() == null) {
            setErrorMessage("Please specify a process ID.");
        } else if (getProcessName() == null) {
            setErrorMessage("Please specify a process name.");
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
        setPageComplete(getErrorMessage() == null);
    }

    private void updateAuditControls() {
        _auditIntervalText.setEnabled(_auditingEnabled);
        _auditLogText.setEnabled(_auditingEnabled);
        _auditTypeList.getControl().setEnabled(_auditingEnabled);
    }
}
