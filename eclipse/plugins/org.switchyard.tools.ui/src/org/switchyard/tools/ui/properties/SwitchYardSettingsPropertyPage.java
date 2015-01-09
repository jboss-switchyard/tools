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
package org.switchyard.tools.ui.properties;

import static org.switchyard.tools.ui.facets.ISwitchYardFacetConstants.FSW_RUNTIME_ID;
import static org.switchyard.tools.ui.facets.ISwitchYardFacetConstants.SWITCHYARD_RUNTIME_ID;

import java.util.Iterator;
import java.util.Set;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.apache.maven.artifact.versioning.ArtifactVersion;
import org.apache.maven.artifact.versioning.DefaultArtifactVersion;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.DependencyManagement;
import org.apache.maven.model.Model;
import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPropertyPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.PropertyPage;
import org.eclipse.wst.common.project.facet.core.IFacetedProject;
import org.eclipse.wst.common.project.facet.core.IFacetedProjectWorkingCopy;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;
import org.eclipse.wst.common.project.facet.core.ProjectFacetsManager;
import org.eclipse.wst.common.project.facet.core.runtime.IRuntime;
import org.eclipse.wst.common.project.facet.core.runtime.IRuntimeComponent;
import org.eclipse.wst.common.project.facet.ui.internal.SharedWorkingCopyManager;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.M2EUtils;
import org.switchyard.tools.ui.common.ILayoutUtilities;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension.Category;
import org.switchyard.tools.ui.common.ISwitchYardProjectWorkingCopy;
import org.switchyard.tools.ui.common.SwitchYardComponentExtensionManager;
import org.switchyard.tools.ui.common.SwitchYardSettingsGroup;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager;
import org.switchyard.tools.ui.i18n.Messages;
import org.switchyard.tools.ui.operations.UpdateProjectPomOperation;

/**
 * SwitchYardSettingsPropertyPage
 * 
 * <p/>
 * Property page implementation for SwitchYard settings.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings("restriction")
public class SwitchYardSettingsPropertyPage extends PropertyPage implements IWorkbenchPropertyPage, ILayoutUtilities {

    private SwitchYardSettingsGroup _settingsGroup;
    private ISwitchYardProjectWorkingCopy _switchYardProject;
    private IFacetedProject _ifp;
    private IFacetedProjectWorkingCopy _ifpwc;
    private Set<IRuntime> _configuredRuntimes;
    private Button _useSwitchYardDependencyBOMCheckbox;

    /**
     * Create a new SwitchYardSettingsPropertyPage.
     */
    public SwitchYardSettingsPropertyPage() {
        super();
        noDefaultAndApplyButton();
    }

    @Override
    protected Control createContents(Composite parent) {
        Composite content = new Composite(parent, SWT.NONE);
        content.setLayout(new GridLayout());
        content.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        _settingsGroup = new SwitchYardSettingsGroup(content, this, PlatformUI.getWorkbench().getProgressService());
        _settingsGroup.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                String errmsg = null;
                if (pomUsesSwitchYardBOM()) {
                    if (!isSelectedRuntimeVersion2OrHigher()) {
                        // only valid versions with BOM dependency support are 2.0+
                        errmsg = "SwitchYard projects using BOM dependencies must use Runtime Version 2.0 or higher.";
                    }
                }
                if (!isSelectedConfigurationVersionOkForRuntime()) {
                    String configVersion = getMajorMinorFromVersion(getRuntimeVersion().toString());
                    errmsg = "The Configuration Version must be " + configVersion + " or lower to work with Library Version " + getRuntimeVersion().toString() + ".";
                }
                setErrorMessage(errmsg);
                getContainer().updateMessage();
            }
        });

        Label label = new Label(content, SWT.RIGHT);
        _useSwitchYardDependencyBOMCheckbox = new Button(content, SWT.CHECK);
        _useSwitchYardDependencyBOMCheckbox.setText("Uses SwitchYard BOM for dependency management");
        GridData cb2GD = new GridData(GridData.FILL_HORIZONTAL);
        _useSwitchYardDependencyBOMCheckbox.setLayoutData(cb2GD);
        label.setEnabled(false);
        _useSwitchYardDependencyBOMCheckbox.setEnabled(false);

        initControls();

        return content;
    }

    @Override
    public void dispose() {
        if (_switchYardProject != null) {
            _switchYardProject.dispose();
        }

        if (_ifpwc != null) {
            SharedWorkingCopyManager.releaseWorkingCopy(_ifp);
        }

        super.dispose();
    }

    @Override
    public boolean performOk() {
        BusyIndicator.showWhile(getShell().getDisplay(), new Runnable() {
            public void run() {
                try {
                    new UpdateProjectPomOperation(_switchYardProject).run(new NullProgressMonitor());
                } catch (CoreException e) {
                    Activator.getDefault().getLog().log(e.getStatus());
                }
                if (_ifpwc != null) {
                    if (_ifpwc.isDirty()) {
                        try {
                            _ifpwc.commitChanges(new NullProgressMonitor());
                        } catch (CoreException e) {
                            Activator.getDefault().getLog().log(e.getStatus());
                        }
                    }
                }
            }
        });
        return true;
    }

    private void initControls() {
        
        _switchYardProject = SwitchYardProjectManager.instance().getSwitchYardProject(getProject()).createWorkingCopy();
        if (_switchYardProject.needsLoading()) {
            BusyIndicator.showWhile(getShell().getDisplay(), new Runnable() {
                @Override
                public void run() {
                    _switchYardProject.load(new NullProgressMonitor());
                }
            });
        }
        try {
            _ifp = ProjectFacetsManager.create(_switchYardProject.getProject());
            _ifpwc = SharedWorkingCopyManager.getWorkingCopy(_ifp);
            _configuredRuntimes = _ifpwc.getTargetedRuntimes();
        } catch (CoreException e) {
            Activator.getDefault().getLog().log(e.getStatus());
        }

        _settingsGroup.setProject(_ifpwc);

        initTargetRuntime();
        initRuntimeVersion();
        initComponentsTable();
        
        _useSwitchYardDependencyBOMCheckbox.setSelection(pomUsesSwitchYardBOM());

        String errmsg = null;
        if (!pomDefinesSwitchYardVersion()) {
            _settingsGroup.setRuntimeControlEnablement(false);
        } else if (pomUsesSwitchYardBOM()) {
            if (!isSelectedRuntimeVersion2OrHigher()) {
                // only valid versions with BOM dependency support are 2.0+
                errmsg = Messages.ProjectConfigurationWizardPage_errorMessage_bomRequiresVersion2;
            }
        } else if (!isSelectedConfigurationVersionOkForRuntime()) {
            String configVersion = getMajorMinorFromVersion(getRuntimeVersion().toString());
            errmsg = "The Configuration Version must be " + configVersion + " or lower to work with Library Version " + getRuntimeVersion().toString() + ".";
        }
        setErrorMessage(errmsg);
        getContainer().updateMessage();
    }

    private ArtifactVersion getRuntimeVersion() {
        ISelection runtimeVersionListSelection = _settingsGroup.getRuntimeVersionsList().getSelection();
        if (runtimeVersionListSelection.isEmpty()) {
            return null;
        }
        return (ArtifactVersion) ((IStructuredSelection) runtimeVersionListSelection).getFirstElement();
    }
    
    private IProjectFacetVersion getConfigurationVersion() {
        return _settingsGroup.getSelectedConfigurationVersion();
    }

    private boolean isSelectedConfigurationVersionOkForRuntime() {
        String configVersionStr = getConfigurationVersion().getVersionString();
        String majorMinorConfig = getMajorMinorFromVersion(configVersionStr);
        if (majorMinorConfig != null) {
            float configVersion = convertVersionStringToLong(configVersionStr);
            if (configVersion > -1) {
                String runtimeVersionStr = getRuntimeVersion().toString();
                String majorMinorRuntime = getMajorMinorFromVersion(runtimeVersionStr);
                if (majorMinorRuntime != null) {
                    float runtimeVersion = convertVersionStringToLong(majorMinorRuntime);
                    if (runtimeVersion > -1) {
                        if (configVersion <= runtimeVersion) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private void initTargetRuntime() {
        if (_ifpwc == null) {
            _settingsGroup.getTargetRuntimesList().setSelection(
                    new StructuredSelection(SwitchYardSettingsGroup.NULL_RUNTIME));
            _settingsGroup.getTargetRuntimesList().getControl().setEnabled(false);
            return;
        }
        final IRuntime runtime = _ifpwc.getPrimaryRuntime();
        if (runtime == null) {
            _settingsGroup.getTargetRuntimesList().setSelection(
                    new StructuredSelection(SwitchYardSettingsGroup.NULL_RUNTIME));
        } else {
            for (IRuntimeComponent component : runtime.getRuntimeComponents()) {
                if (SWITCHYARD_RUNTIME_ID.equals(component.getRuntimeComponentType().getId())
                        || FSW_RUNTIME_ID.equals(component.getRuntimeComponentType().getId())) {
                    _settingsGroup.getTargetRuntimesList().setSelection(new StructuredSelection(component), true);
                }
            }
        }
        _settingsGroup.getTargetRuntimesList().addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                IStructuredSelection selection = (IStructuredSelection) event.getSelection();
                if (selection.isEmpty() || selection.getFirstElement() == SwitchYardSettingsGroup.NULL_RUNTIME) {
                    final IRuntime primaryRuntime = _ifpwc.getPrimaryRuntime();
                    if (primaryRuntime != null && !_configuredRuntimes.contains(primaryRuntime)) {
                        _ifpwc.removeTargetedRuntime(primaryRuntime);
                    }
                } else {
                    final IRuntime runtime = ((IRuntimeComponent) selection.getFirstElement()).getRuntime();
                    _ifpwc.addTargetedRuntime(runtime);
                    _ifpwc.setPrimaryRuntime(runtime);
                }
            }
        });
    }

    private void initRuntimeVersion() {
        ArtifactVersion version = null;
        String versionString = _switchYardProject.getVersion();
        if (versionString != null && versionString.length() > 0) {
            version = new DefaultArtifactVersion(versionString);
        }
        if (version != null) {
            _settingsGroup.getRuntimeVersionsList().setSelection(new StructuredSelection(version), true);
        }
        _settingsGroup.getRuntimeVersionsList().getControl()
                .setEnabled(!_switchYardProject.isUsingDependencyManagement());
        _settingsGroup.getRuntimeVersionsList().addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                ISelection selection = event.getSelection();
                if (selection == null || selection.isEmpty() || !(selection instanceof IStructuredSelection)) {
                    return;
                }
                _switchYardProject.setRuntimeVersion(((IStructuredSelection) selection).getFirstElement().toString());
            }
        });
    }

    private void initComponentsTable() {
        _settingsGroup.setCheckedComponents(_switchYardProject.getComponents(), true);
        _settingsGroup.getComponentsTable().addCheckStateListener(new ICheckStateListener() {
            @Override
            public void checkStateChanged(CheckStateChangedEvent event) {
                if (event.getElement() instanceof ISwitchYardComponentExtension) {
                    if (event.getChecked()) {
                        _switchYardProject.addComponent((ISwitchYardComponentExtension) event.getElement());
                    } else {
                        _switchYardProject.removeComponent((ISwitchYardComponentExtension) event.getElement());
                    }
                } else if (event.getElement() instanceof Category) {
                    if (event.getChecked()) {
                        _switchYardProject.addComponents(SwitchYardComponentExtensionManager.instance()
                                .getComponentExtensions((Category) event.getElement()));
                    } else {
                        _switchYardProject.removeComponents(SwitchYardComponentExtensionManager.instance()
                                .getComponentExtensions((Category) event.getElement()));
                    }
                }
            }
        });
    }

    private IProject getProject() {
        return (IProject) getElement().getAdapter(IProject.class);
    }

    @Override
    public GridData setButtonLayoutData(Button button) {
        return super.setButtonLayoutData(button);
    }
    
    private boolean pomDefinesSwitchYardVersion() {
        return _switchYardProject.getMavenProject().getProperties()
                .containsKey(M2EUtils.SWITCHYARD_VERSION);
    }
    
    private boolean pomUsesSwitchYardBOM() {
        final MavenProject project = _switchYardProject.getMavenProject();
        final Model originalModel = project.getOriginalModel();
        final DependencyManagement depMgmt = originalModel.getDependencyManagement();
        if (depMgmt != null && !depMgmt.getDependencies().isEmpty()) {
            Iterator<Dependency> depIter = depMgmt.getDependencies().iterator();
            while (depIter.hasNext()) {
                Dependency tempDep = depIter.next();
                if (tempDep.getArtifactId().equals(M2EUtils.SWITCHYARD_BOM_ARTIFACT_ID)) {
                    return true;
                }
            }
        }
        return false;
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
    
    private boolean isSelectedRuntimeVersion2OrHigher() {
        String runtimeVersionStr = getRuntimeVersion().toString();
        String majorMinorConfig = getMajorMinorFromVersion(runtimeVersionStr);
        if (majorMinorConfig != null) {
            float runtimeVersion = convertVersionStringToLong(majorMinorConfig);
            if (runtimeVersion > -1) {
                if (runtimeVersion >= 2.0) {
                    return true;
                }
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

    @Override
    public void setErrorMessage(String newMessage) {
        setValid(newMessage == null);
        super.setErrorMessage(newMessage);
    }
}
