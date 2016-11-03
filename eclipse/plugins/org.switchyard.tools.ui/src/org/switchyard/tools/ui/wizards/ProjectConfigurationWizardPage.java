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

import java.util.Collection;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.apache.maven.artifact.versioning.ArtifactVersion;
import org.apache.maven.artifact.versioning.DefaultArtifactVersion;
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
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;
import org.eclipse.wst.common.project.facet.core.runtime.IRuntimeComponent;
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
    private Button _isBundleCheckbox;
    private Button _useSwitchYardDependencyBOMCheckbox;
    private SwitchYardSettingsGroup _settingsGroup;
    private boolean _isInitialized;
    private String _groupId = ""; //$NON-NLS-1$
    private String _packageName = ""; //$NON-NLS-1$
    private String _namespace = ""; //$NON-NLS-1$
    private boolean _isBundled = false;
    private boolean _doesUseSwitchYardDependencyBOM;

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
     * @return the bundled state (true/false)
     */
    public boolean isBundled() {
        return _isBundled;
    }

    /**
     * @return the SwitchYard Dependency BOM state (true/false)
     */
    public boolean isSwitchYardBOMEnabled() {
        return _doesUseSwitchYardDependencyBOM;
    }

    /**
     * @return the selected SwitchYard runtime version.
     */
    public ArtifactVersion getRuntimeVersion() {
        ISelection runtimeVersionListSelection = _settingsGroup.getRuntimeVersionsList().getSelection();
        if (runtimeVersionListSelection.isEmpty()) {
            return null;
        }
        return (ArtifactVersion) ((IStructuredSelection) runtimeVersionListSelection).getFirstElement();
    }

    /**
     * @return the selected Kie runtime version.
     */
    public ArtifactVersion getKieVersion() {
        ISelection kieVersionListSelection = _settingsGroup.getKieVersionsList().getSelection();
        if (kieVersionListSelection.isEmpty()) {
            return null;
        }
        return (ArtifactVersion) ((IStructuredSelection) kieVersionListSelection).getFirstElement();
    }

    /**
     * @return the selected Integration runtime version.
     */
    public ArtifactVersion getIntegrationVersion() {
        ISelection integVersionListSelection = _settingsGroup.getIntegrationVersionsList().getSelection();
        if (integVersionListSelection.isEmpty()) {
            return null;
        }
        return (ArtifactVersion) ((IStructuredSelection) integVersionListSelection).getFirstElement();
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
    
    /**
     * @return boolean true/false if the configure integration checkbox is selected.
     */
    public boolean isUsingIntegrationPack() {
        return _settingsGroup.getConfigureIntegrationCheckbox().getSelection();
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
        
        label = new Label(projectDetails, SWT.RIGHT);
        _isBundleCheckbox = new Button(projectDetails, SWT.CHECK);
        _isBundleCheckbox.setText(Messages.ProjectConfigurationWizardPage_OSGIBundleCheckbox);
        GridData cbGD = new GridData(GridData.FILL_HORIZONTAL);
        _isBundleCheckbox.setLayoutData(cbGD);
        _isBundleCheckbox.addSelectionListener(new SelectionListener() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                _isBundled = _isBundleCheckbox.getSelection();
                validate();
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                // empty
            }
        });

        label = new Label(projectDetails, SWT.RIGHT);
        _useSwitchYardDependencyBOMCheckbox = new Button(projectDetails, SWT.CHECK);
        _useSwitchYardDependencyBOMCheckbox.setText(Messages.ProjectConfigurationWizardPage_BOMCheckbox);
        GridData cb2GD = new GridData(GridData.FILL_HORIZONTAL);
        _useSwitchYardDependencyBOMCheckbox.setLayoutData(cb2GD);
        _useSwitchYardDependencyBOMCheckbox.addSelectionListener(new SelectionListener() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                _doesUseSwitchYardDependencyBOM = _useSwitchYardDependencyBOMCheckbox.getSelection();
                validate();
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                // empty
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
        
        _settingsGroup.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                boolean testRuntimeVersion = isSelectedRuntimeV2();
                boolean testConfigVersion = isSelectedConfigurationVersionOkForRuntime();
                boolean isKaraf = isKarafRuntime();
                _useSwitchYardDependencyBOMCheckbox.setEnabled(testRuntimeVersion);
                _doesUseSwitchYardDependencyBOM = testRuntimeVersion;
                _useSwitchYardDependencyBOMCheckbox.setSelection(_doesUseSwitchYardDependencyBOM && testConfigVersion);
                _isBundleCheckbox.setSelection(isKaraf);
                _isBundled = isKaraf;

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
                _useSwitchYardDependencyBOMCheckbox.setSelection(_doesUseSwitchYardDependencyBOM);
                _useSwitchYardDependencyBOMCheckbox.setEnabled(_doesUseSwitchYardDependencyBOM);
                validate();
                // clear out any error the first time we are displayed
                setErrorMessage(null);
                _isInitialized = true;
            } else if (!_packageNameText.getText().contentEquals(normalizePackageName(projectName))) {
                _packageNameText.setText(normalizePackageName(projectName));
                _namespaceText.setText("urn::" + projectName + ":1.0"); //$NON-NLS-1$ //$NON-NLS-2$
            }
            _artifactIdText.setText(projectName);
        }
        super.setVisible(visible);
    }

    private void initRuntimeVersionsList() {
        Collection<ArtifactVersion> versions = _settingsGroup.getAvailableVersions();
        // TODO: allow use of preferred version or allow association of
        // server runtime version.
        if (getRuntimeVersion() == null) {
            _settingsGroup.getRuntimeVersionsList().setSelection(
                    new StructuredSelection(new DefaultArtifactVersion(
                            NewSwitchYardProjectWizard.DEFAULT_RUNTIME_VERSION)));
        }
    }

    private void validate() {
        setMessage(null);
        setErrorMessage(null);

        IStatus packageNameStatus = JavaConventions.validatePackageName(_packageName, "1.6", "1.6"); //$NON-NLS-1$ //$NON-NLS-2$
        if (!packageNameStatus.isOK()) {
            StatusUtil.applyToStatusLine(this, packageNameStatus);
        } else if (getErrorMessage() == null) {
            final ArtifactVersion version = getRuntimeVersion();
            if (version == null) {
                setErrorMessage(Messages.ProjectConfigurationWizardPage_errorMessage_pleaseSpecifySwitchYardVersion);
            }
            
            final boolean isUsingIntegrationPack = isUsingIntegrationPack();
            if (isUsingIntegrationPack) {
                final ArtifactVersion integVersion = _settingsGroup.getIntegrationVersion();
                if (integVersion == null) {
                    setErrorMessage("Please specify a valid Integration Pack Version to continue.");
                }
                final ArtifactVersion kieVersion = _settingsGroup.getKieVersion();
                if (kieVersion == null) {
                    setErrorMessage("Please specify a valid Kie Version to continue.");
                }
            }
            
            /*
             * else {
             * Don't validate artifact resolution here as this can cause a lot
             * of junk to build up in the local repository. You basically get a
             * resolution for every key stroke, which we really don't want. It
             * might be better to put this into the wizard's performFinish()
             * logic and fail there instead of here. }
             */
            
            if (!isSelectedConfigurationVersionOkForRuntime()) {
                if (getRuntimeVersion() != null) {
                    String configVersion = getMajorMinorFromVersion(getRuntimeVersion().toString());
                    setErrorMessage("The Configuration Version must be " + configVersion + " or lower to work with Library Version " + getRuntimeVersion().toString() + ".");
                } else {
                    setErrorMessage("The Configuration and Library Versions must be set to work with the SwitchYard Runtime.");
                }
            }

            // if the version < 2.0 and they want to use the BOM, it's not allowed
            if (_doesUseSwitchYardDependencyBOM) {
                if (!isSelectedRuntimeV2()) {
                    setErrorMessage(Messages.ProjectConfigurationWizardPage_errorMessage_bomRequiresVersion2);
                }
            }
        }
        setPageComplete(getErrorMessage() == null);
    }

    private boolean isKarafRuntime() {
        IRuntimeComponent runtime = _settingsGroup.getSelectedTargetRuntime();
        if (runtime != null) {
            String label = runtime.getProperty("switchyard.label");
            if (label.contains("SwitchYard: Karaf Extension")) {
                return true;
            } else if (label.contains("SwitchYard: Integration Extension")) {
                return true;
            }
        }
        return false;
    }

    private boolean isSelectedRuntimeV2() {
        ArtifactVersion artversion = getRuntimeVersion();
        if (artversion != null) {
            String versionString = artversion.toString();
            if (versionString.indexOf('.') > -1) {
                String majorVersionString = versionString.substring(0, versionString.indexOf('.'));
                try {
                    long major = Long.decode(majorVersionString);
                    boolean isIntegration = false;
                    if (getTargetRuntime() != null) {
                        String label = getTargetRuntime().getProperty("switchyard.label");
                        isIntegration = label.contains("Integration"); // hack
                    }
                    if (isIntegration && major < 2) {
                        return true;
                    }
                    if (major < 2) {
                        return false;
                    }
                } catch (NumberFormatException nfe) {
                    return false;
                }
                return true;
            }
        }
        
        return false;
    }

    private float convertVersionStringToLong(String strVersion) {
        float version;
        try {
            version = Float.parseFloat(strVersion);
        } catch (NumberFormatException nfe) {
            version = -1;
        }
        return version;
    }
    
    private String getMajorMinorFromVersion(String inString) {
        try {
            String[] versionSplit = inString.split("\\.");
            if (versionSplit.length > 1) {
                return versionSplit[0] + "." + versionSplit[1];
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }
    
    private boolean isSelectedConfigurationVersionOkForRuntime() {
        String configVersionStr = getConfigurationVersion().getVersionString();
        String majorMinorConfig = getMajorMinorFromVersion(configVersionStr);
        if (majorMinorConfig != null) {
            float configVersion = convertVersionStringToLong(configVersionStr);
            if (configVersion > -1) {
                if (getRuntimeVersion() != null) {
                    String runtimeVersionStr = getRuntimeVersion().toString();
                    String majorMinorRuntime = getMajorMinorFromVersion(runtimeVersionStr);
                    if (majorMinorRuntime != null) {
                        float runtimeVersion = convertVersionStringToLong(majorMinorRuntime);
                        boolean isIntegration = false;
                        if (getTargetRuntime() != null) {
                            String label = getTargetRuntime().getProperty("switchyard.label");
                            isIntegration = label.contains("Integration"); // hack
                        }
                        if (runtimeVersion > -1 && !isIntegration) {
                            if (configVersion <= runtimeVersion) {
                                return true;
                            }
                        } else if (isIntegration) {
                            if (runtimeVersion > -1) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
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
