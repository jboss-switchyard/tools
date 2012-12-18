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
package org.switchyard.tools.ui.editor.components.rules;

import java.math.BigInteger;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
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
import org.switchyard.tools.models.switchyard1_0.rules.LoggerType;
import org.switchyard.tools.models.switchyard1_0.rules.LoggerType1;
import org.switchyard.tools.models.switchyard1_0.rules.RulesFactory;
import org.switchyard.tools.ui.JavaUtil;

/**
 * NewRulesDetailsWizardPage
 * 
 * <p/>
 * Collects high level details about the rules resource to be created, e.g.
 * package, input, auditing.
 * 
 * @author Rob Cernich
 */
public class NewRulesDetailsWizardPage extends WizardPage {

    private String _packageName;
    private Text _packageNameText;
    private boolean _agent;
    private Button _agentCheckbox;
    private String _messageName;
    private Text _messageNameText;
    private boolean _auditingEnabled;
    private Button _auditingEnabledCheckbox;
    private LoggerType1 _auditSettings = RulesFactory.eINSTANCE.createLoggerType1();
    private Text _auditLogText;
    private Text _auditIntervalText;
    private ComboViewer _auditTypeList;
    private String _oldPackageName;

    /**
     * Create a new NewRulesDetailsWizardPage.
     * 
     * @param pageName the page name
     */
    public NewRulesDetailsWizardPage(String pageName) {
        super(pageName);
        setTitle("Rules Implementation Details");
        setDescription("Please specify details about the rules implementation.");
    }

    @Override
    public void createControl(Composite parent) {
        Composite contents = new Composite(parent, SWT.NONE);
        contents.setLayout(new GridLayout(2, false));

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

        createLabel(contents, "Input Variable:");
        _messageNameText = new Text(contents, SWT.SINGLE | SWT.BORDER);
        _messageNameText
                .setToolTipText("The name of the variable the input message contents will be stored; may be empty.");
        _messageNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _messageNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                _messageName = _messageNameText.getText();
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

        createAuditSettingsGroup(contents);

        initControls();
        validate();
        setErrorMessage(null);

        setControl(contents);
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
                    _auditSettings.setInterval(BigInteger.valueOf(Integer.parseInt(_auditIntervalText.getText())));
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
                if (element instanceof LoggerType) {
                    return ((LoggerType) element).getLiteral();
                }
                return super.getText(element);
            }
        });
        _auditTypeList.setContentProvider(ArrayContentProvider.getInstance());
        _auditTypeList.setInput(LoggerType.values());
    }

    private Label createLabel(Composite parent, String text) {
        Label label = new Label(parent, SWT.NONE);
        label.setText(text);
        return label;
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
    public String getMessageName() {
        return nullForEmpty(_messageName);
    }

    /**
     * @param messageName The process variable name to be used for storing
     *            inbound message content.
     */
    public void setMessageName(String messageName) {
        if (_messageNameText == null) {
            _messageName = messageName;
        } else {
            _messageNameText.setText(messageName);
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
    public LoggerType1 getAuditSettings() {
        return _auditSettings;
    }

    /**
     * @param auditSettings the new audit settings
     */
    public void setAuditSettings(LoggerType1 auditSettings) {
        if (_auditingEnabledCheckbox == null) {
            _auditSettings = auditSettings;
        } else {
            _auditLogText.setText(emptyForNull(auditSettings.getLog()));
            _auditIntervalText.setText(auditSettings.getInterval() == null ? "" : auditSettings.getInterval()
                    .toString());
            _auditTypeList.setSelection(new StructuredSelection(auditSettings.getType()), true);
        }
    }

    /**
     * Update the default values based on the setting in the file page.
     * 
     * @param project the currently targeted Java project.
     */
    public void update(IJavaProject project) {
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
        setAuditSettings(_auditSettings == null ? RulesFactory.eINSTANCE.createLoggerType1() : _auditSettings);
        setAuditingEnabled(_auditingEnabled);
        // setMessageName(emptyForNull(_messageName));
        setPackageName(emptyForNull(_packageName));
    }

    private void validate() {
        setErrorMessage(null);
        // TODO: we probably need to verify the content as well
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
        setPageComplete(getErrorMessage() == null);
    }

    private void updateAuditControls() {
        _auditIntervalText.setEnabled(_auditingEnabled);
        _auditLogText.setEnabled(_auditingEnabled);
        _auditTypeList.getControl().setEnabled(_auditingEnabled);
    }
}
