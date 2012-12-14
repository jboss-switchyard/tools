/*************************************************************************************
 * Copyright (c) 2011 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.wizards;

import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.JavaConventions;
import org.eclipse.jdt.internal.ui.dialogs.StatusUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.sonatype.aether.version.Version;
import org.switchyard.tools.ui.common.ILayoutUtilities;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension;
import org.switchyard.tools.ui.common.SwitchYardSettingsGroup;

/**
 * ProjectConfigurationWizardPage
 * 
 * Collects information about SwitchYard project configuration, e.g. components,
 * handlers, etc.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings("restriction")
public class ProjectConfigurationWizardPage extends WizardPage implements ILayoutUtilities {

    /** TODO: use preferences */
    private static final String DEFAULT_GROUP_ID = "com.example.switchyard";

    private Text _artifactIdText;
    private Text _groupIdText;
    private Text _packageNameText;
    private SwitchYardSettingsGroup _settingsGroup;
    private boolean _isInitialized;
    private String _groupId = "";
    private String _packageName = "";

    /**
     * Create a new ProjectConfigurationWizardPage.
     */
    public ProjectConfigurationWizardPage() {
        super(ProjectConfigurationWizardPage.class.getSimpleName());
        setTitle("SwitchYard Project Configuration");
        setDescription("Please specify project details.");
    }

    /**
     * @return the group id.
     */
    public String getGroupId() {
        return _groupId;
    }

    /**
     * @return the package name.
     */
    public String getPackageName() {
        return _packageName;
    }

    /**
     * @return the selected SwitchYard runtime version.
     */
    public Version getRuntimeVersion() {
        ISelection runtimeVersionListSelection = _settingsGroup.getRuntimeVersionsList().getSelection();
        if (runtimeVersionListSelection.isEmpty()) {
            return null;
        }
        return (Version) ((IStructuredSelection) runtimeVersionListSelection).getFirstElement();
    }

    /**
     * @return the components selected by the user.
     */
    public Set<ISwitchYardComponentExtension> getSelectedComponents() {
        return _settingsGroup.getSelectedComponents();
    }

    @Override
    public void createControl(Composite parent) {
        initializeDialogUnits(parent);

        Composite content = new Composite(parent, SWT.NONE);
        content.setLayout(new GridLayout());

        Composite projectDetails = new Composite(content, SWT.NONE);
        projectDetails.setLayout(new GridLayout(2, false));
        projectDetails.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        // artifact id
        Label label = new Label(projectDetails, SWT.RIGHT);
        label.setText("Artifact Id:");
        _artifactIdText = new Text(projectDetails, SWT.SINGLE | SWT.BORDER);
        _artifactIdText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _artifactIdText.setEnabled(false);

        // group id
        label = new Label(projectDetails, SWT.RIGHT);
        label.setText("Group Id:");
        _groupIdText = new Text(projectDetails, SWT.SINGLE | SWT.BORDER);
        _groupIdText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _groupIdText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                String oldGroupId = _groupId;
                _groupId = _groupIdText.getText();
                updatePackageName(oldGroupId, _groupId);
                validate();
            }
        });

        // package name
        label = new Label(projectDetails, SWT.RIGHT);
        label.setText("Package Name:");
        _packageNameText = new Text(projectDetails, SWT.SINGLE | SWT.BORDER);
        _packageNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _packageNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                _packageName = _packageNameText.getText();
                validate();
            }
        });

        // runtime version
        Composite settingsContent = new Composite(content, SWT.NONE);
        settingsContent.setLayout(new GridLayout());
        settingsContent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        _settingsGroup = new SwitchYardSettingsGroup(settingsContent, this, getContainer());

        setControl(content);
        setPageComplete(false);
    }

    @Override
    public void setVisible(boolean visible) {
        if (visible) {
            String projectName = ((NewSwitchYardProjectWizard) getWizard()).getProjectName();
            if (!_isInitialized) {
                initRuntimeVersionsList();
                _packageNameText.setText(normalizePackageName(projectName));
                _groupIdText.setText(DEFAULT_GROUP_ID);
                validate();
                // clear out any error the first time we are displayed
                setErrorMessage(null);
                _isInitialized = true;
            }
            _artifactIdText.setText(projectName);
        }
        super.setVisible(visible);
    }

    private void initRuntimeVersionsList() {
        List<Version> versions = _settingsGroup.getAvailableVersions();
        if (versions == null || versions.size() == 0) {
            _settingsGroup.getRuntimeVersionsList().setSelection(
                    new StructuredSelection(NewSwitchYardProjectWizard.DEFAULT_RUNTIME_VERSION));
        } else {
            // TODO: allow use of preferred version or allow association of
            // server runtime version.
            _settingsGroup.getRuntimeVersionsList().setSelection(new StructuredSelection(versions.get(0)), true);
        }
    }

    private void validate() {
        IStatus packageNameStatus = JavaConventions.validatePackageName(_packageName, "1.6", "1.6");
        if (packageNameStatus.isOK()) {
            setMessage(null);
            setErrorMessage(null);
        } else {
            StatusUtil.applyToStatusLine(this, packageNameStatus);
        }
        setPageComplete(getErrorMessage() == null);
    }

    private void updatePackageName(String oldGroupId, String newGroupId) {
        // strip off trailing .'s
        while (oldGroupId.endsWith(".")) {
            oldGroupId = oldGroupId.substring(0, oldGroupId.length() - 1);
        }
        while (newGroupId.endsWith(".")) {
            newGroupId = newGroupId.substring(0, newGroupId.length() - 1);
        }

        // normalize the id's (e.g. replace invalid Java package name chars with
        // _)
        oldGroupId = normalizePackageName(oldGroupId);
        newGroupId = normalizePackageName(newGroupId);

        // make sure it changed
        if (oldGroupId.equals(newGroupId)) {
            return;
        }

        // make sure the package name actually starts with the old group id
        // before we update it
        if (!_packageName.startsWith(oldGroupId)) {
            return;
        }
        if (oldGroupId.length() == 0) {
            // new group id
            if (_packageName.length() == 0) {
                _packageNameText.setText(newGroupId);
            } else {
                _packageNameText.setText(newGroupId + '.' + _packageName);
            }
        } else if (_packageName.equals(oldGroupId)) {
            // package name is tracking group id exactly
            _packageNameText.setText(newGroupId);
        } else if (_packageName.charAt(oldGroupId.length()) == '.') {
            // package name is prefixed with group id
            _packageNameText.setText(newGroupId + _packageName.substring(oldGroupId.length()));
        } else {
            // need to insert a . between the two
            _packageNameText.setText(newGroupId + '.' + _packageName.substring(oldGroupId.length()));
        }
    }

    /**
     * Remove any non-word characters from the proposed name (e.g. -, *, etc.).
     */
    private String normalizePackageName(String proposedPackageName) {
        return proposedPackageName.replaceAll("[^\\w\\.]", "_");
    }

    @Override
    public GridData setButtonLayoutData(Button button) {
        return super.setButtonLayoutData(button);
    }

}
