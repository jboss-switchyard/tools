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
package org.switchyard.tools.ui.bpel;

import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * BPELProcessDetailsWizardPage
 * 
 * <p/>
 * Collects high level details about the process to be created, e.g. name, I/O,
 * persistence, auditing.
 * 
 * @author Rob Cernich
 */
public class BPELProcessDetailsWizardPage extends WizardPage {

    private String _processName;
    private Text _processNameText;
    private String _processNamespace;
    private Text _processNamespaceText;
    private String _oldProcessName;

    /**
     * Create a new BPELProcessDetailsWizardPage.
     * 
     * @param pageName the page name
     */
    public BPELProcessDetailsWizardPage(String pageName) {
        super(pageName);
        setTitle("Business Process Details");
        setDescription("Please specify details about the business process.");
    }

    @Override
    public void createControl(Composite parent) {
        Composite contents = new Composite(parent, SWT.NONE);
        contents.setLayout(new GridLayout(2, false));

        createLabel(contents, "Name:");
        _processNameText = new Text(contents, SWT.SINGLE | SWT.BORDER);
        _processNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _processNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                _processName = _processNameText.getText();
                validate();
            }
        });

        createLabel(contents, "Namespace:");
        _processNamespaceText = new Text(contents, SWT.SINGLE | SWT.BORDER);
        _processNamespaceText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _processNamespaceText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                _processNamespace = _processNamespaceText.getText();
                validate();
            }
        });

        initControls();
        validate();
        setErrorMessage(null);

        setControl(contents);
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
     * @return the process namespace.
     */
    public String getProcessNamespace() {
        return emptyForNull(_processNamespace);
    }

    /**
     * @param processNamespace The process namespace to set.
     */
    public void setProcessNamespace(String processNamespace) {
        if (_processNamespaceText == null) {
            _processNamespace = processNamespace;
        } else {
            _processNamespaceText.setText(processNamespace);
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
        final String newServiceName = emptyForNull(new Path(bpmnFileName).removeFileExtension().lastSegment());
        if (updateDefault(_oldProcessName, newServiceName, _processNameText.getText())) {
            setProcessName(newServiceName);
        }
        _oldProcessName = newServiceName;
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
        setProcessNamespace(emptyForNull(_processNamespace));
        setProcessName(emptyForNull(_processName));
    }

    private void validate() {
        setErrorMessage(null);
        // TODO: we probably need to verify the content as well
        if (getProcessName() == null) {
            setErrorMessage("Please specify a name.");
        } else if (getProcessNamespace() == null) {
            setErrorMessage("Please specify a namespace.");
        }
        setPageComplete(getErrorMessage() == null);
    }

}
