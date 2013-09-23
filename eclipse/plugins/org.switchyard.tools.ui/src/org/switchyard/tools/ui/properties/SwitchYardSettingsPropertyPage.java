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

import java.util.Set;

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
import org.eclipse.ui.IWorkbenchPropertyPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.PropertyPage;
import org.eclipse.wst.common.project.facet.core.IFacetedProject;
import org.eclipse.wst.common.project.facet.core.IFacetedProjectWorkingCopy;
import org.eclipse.wst.common.project.facet.core.ProjectFacetsManager;
import org.eclipse.wst.common.project.facet.core.runtime.IRuntime;
import org.eclipse.wst.common.project.facet.core.runtime.IRuntimeComponent;
import org.eclipse.wst.common.project.facet.ui.internal.SharedWorkingCopyManager;
import org.sonatype.aether.util.version.GenericVersionScheme;
import org.sonatype.aether.version.InvalidVersionSpecificationException;
import org.sonatype.aether.version.Version;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.common.ILayoutUtilities;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension.Category;
import org.switchyard.tools.ui.common.ISwitchYardProjectWorkingCopy;
import org.switchyard.tools.ui.common.SwitchYardComponentExtensionManager;
import org.switchyard.tools.ui.common.SwitchYardSettingsGroup;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager;
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
        _settingsGroup.getTargetRuntimesList().getControl()
                .setEnabled(!_switchYardProject.isUsingDependencyManagement());
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
        Version version = null;
        String versionString = _switchYardProject.getVersion();
        if (versionString != null && versionString.length() > 0) {
            try {
                version = new GenericVersionScheme().parseVersion(versionString);
            } catch (InvalidVersionSpecificationException e) {
                e.fillInStackTrace();
            }
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

}
