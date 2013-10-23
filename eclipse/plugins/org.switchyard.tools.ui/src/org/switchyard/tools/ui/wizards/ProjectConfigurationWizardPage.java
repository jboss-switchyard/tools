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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.JavaConventions;
import org.eclipse.jdt.internal.ui.dialogs.StatusUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
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
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;
import org.eclipse.wst.common.project.facet.core.runtime.IRuntimeComponent;
import org.sonatype.aether.util.version.GenericVersionScheme;
import org.sonatype.aether.version.InvalidVersionSpecificationException;
import org.sonatype.aether.version.Version;
import org.switchyard.tools.ui.common.ILayoutUtilities;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension;
import org.switchyard.tools.ui.common.SwitchYardSettingsGroup;
import org.switchyard.tools.ui.i18n.Messages;

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
    private static final String DEFAULT_GROUP_ID = "com.example.switchyard"; //$NON-NLS-1$

    private Text _artifactIdText;
    private Text _groupIdText;
    private Text _namespaceText;
    private Text _packageNameText;
    private SwitchYardSettingsGroup _settingsGroup;
    private boolean _isInitialized;
    private String _groupId = ""; //$NON-NLS-1$
    private String _packageName = ""; //$NON-NLS-1$
    private String _namespace = ""; //$NON-NLS-1$

    /**
     * Create a new ProjectConfigurationWizardPage.
     */
    public ProjectConfigurationWizardPage() {
        super(ProjectConfigurationWizardPage.class.getSimpleName());
        setTitle(Messages.ProjectConfigurationWizardPage_wizardPageTitle);
        setDescription(Messages.ProjectConfigurationWizardPage_wizardPageDescription);
    }

    /**
     * @return the group id.
     */
    public String getGroupId() {
        return _groupId;
    }

    /**
     * @return the namespace.
     */
    public String getNamespace() {
        return _namespace;
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
     * @return the selected target runtime.
     */
    public IRuntimeComponent getTargetRuntime() {
        return _settingsGroup.getSelectedTargetRuntime();
    }

    /**
     * @return the selected configuration version.
     */
    public IProjectFacetVersion getConfigurationVersion() {
        return _settingsGroup.getSelectedConfigurationVersion();
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
        label.setText(Messages.ProjectConfigurationWizardPage_labelArtifactID);
        _artifactIdText = new Text(projectDetails, SWT.SINGLE | SWT.BORDER);
        _artifactIdText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _artifactIdText.setEnabled(false);

        // group id
        label = new Label(projectDetails, SWT.RIGHT);
        label.setText(Messages.ProjectConfigurationWizardPage_labelGroupID);
        _groupIdText = new Text(projectDetails, SWT.SINGLE | SWT.BORDER);
        _groupIdText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _groupIdText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                String oldGroupId = _groupId;
                _groupId = _groupIdText.getText();
                updatePackageName(oldGroupId, _groupId);
                updateNamespaceGroup(oldGroupId, _groupId);
                validate();
            }
        });

        // application namespace
        label = new Label(projectDetails, SWT.RIGHT);
        label.setText(Messages.ProjectConfigurationWizardPage_labelTNS);
        _namespaceText = new Text(projectDetails, SWT.SINGLE | SWT.BORDER);
        _namespaceText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _namespaceText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                _namespace = _namespaceText.getText();
                validate();
            }
        });

        // package name
        label = new Label(projectDetails, SWT.RIGHT);
        label.setText(Messages.ProjectConfigurationWizardPage_labelPackageName);
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
        _settingsGroup.getRuntimeVersionsList().addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                validate();
            }
        });

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
                _namespaceText.setText("urn::" + projectName + ":1.0"); //$NON-NLS-1$ //$NON-NLS-2$
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
        try {
            // TODO: allow use of preferred version or allow association of
            // server runtime version.
            if (getRuntimeVersion() == null) {
                _settingsGroup.getRuntimeVersionsList().setSelection(
                        new StructuredSelection(new GenericVersionScheme()
                                .parseVersion(NewSwitchYardProjectWizard.DEFAULT_RUNTIME_VERSION)));
            }
        } catch (InvalidVersionSpecificationException e) {
            e.printStackTrace();
            if (versions != null && versions.size() > 0) {
                _settingsGroup.getRuntimeVersionsList().setSelection(new StructuredSelection(versions.get(0)), true);
            }
        }
    }

    private void validate() {
        setMessage(null);
        setErrorMessage(null);

        IStatus packageNameStatus = JavaConventions.validatePackageName(_packageName, "1.6", "1.6"); //$NON-NLS-1$ //$NON-NLS-2$
        if (!packageNameStatus.isOK()) {
            StatusUtil.applyToStatusLine(this, packageNameStatus);
        } else if (getErrorMessage() == null) {
            final Version version = getRuntimeVersion();
            if (version == null) {
                setErrorMessage(Messages.ProjectConfigurationWizardPage_errorMessage_pleaseSpecifySwitchYardVersion);
            }
            /*
             * else {
             * Don't validate artifact resolution here as this can cause a lot
             * of junk to build up in the local repository. You basically get a
             * resolution for every key stroke, which we really don't want. It
             * might be better to put this into the wizard's performFinish()
             * logic and fail there instead of here. }
             */
        }
        setPageComplete(getErrorMessage() == null);
    }

    private void updateNamespaceGroup(String oldGroupId, String newGroupId) {
        // strip off trailing .'s
        while (oldGroupId.endsWith(".")) { //$NON-NLS-1$
            oldGroupId = oldGroupId.substring(0, oldGroupId.length() - 1);
        }
        while (newGroupId.endsWith(".")) { //$NON-NLS-1$
            newGroupId = newGroupId.substring(0, newGroupId.length() - 1);
        }

        // make sure it changed
        if (oldGroupId.equals(newGroupId)) {
            return;
        }

        Matcher matcher = Pattern.compile("urn:([^:]*)(:.*)").matcher(_namespace); //$NON-NLS-1$
        if (matcher.matches()) {
            final String namespaceGroup = matcher.group(1);
            if (oldGroupId.equals(namespaceGroup)) {
                _namespaceText.setText("urn:" + newGroupId + matcher.group(2)); //$NON-NLS-1$
            }
        }
    }

    private void updatePackageName(String oldGroupId, String newGroupId) {
        // strip off trailing .'s
        while (oldGroupId.endsWith(Messages.ProjectConfigurationWizardPage_18)) {
            oldGroupId = oldGroupId.substring(0, oldGroupId.length() - 1);
        }
        while (newGroupId.endsWith(".")) { //$NON-NLS-1$
            newGroupId = newGroupId.substring(0, newGroupId.length() - 1);
        }

        /*
         * normalize the id's (e.g. replace invalid Java package name chars with
         * _)
         */
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
            _packageNameText.setText(newGroupId
                    + _packageName.substring(oldGroupId.length() + (newGroupId.length() == 0 ? 1 : 0)));
        } else {
            // need to insert a . between the two
            _packageNameText.setText(newGroupId + '.' + _packageName.substring(oldGroupId.length()));
        }
    }

    /**
     * Remove any non-word characters from the proposed name (e.g. -, *, etc.).
     */
    private String normalizePackageName(String proposedPackageName) {
        return proposedPackageName.replaceAll("[^\\w\\.]", "_"); //$NON-NLS-1$ //$NON-NLS-2$
    }

    @Override
    public GridData setButtonLayoutData(Button button) {
        return super.setButtonLayoutData(button);
    }

}
