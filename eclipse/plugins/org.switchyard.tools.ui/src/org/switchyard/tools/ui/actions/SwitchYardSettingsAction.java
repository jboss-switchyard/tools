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
package org.switchyard.tools.ui.actions;

import static org.switchyard.tools.ui.facets.ISwitchYardFacetConstants.SWITCHYARD_BASIC_PRESET_ID;
import static org.switchyard.tools.ui.facets.ISwitchYardFacetConstants.SWITCHYARD_FACET;
import static org.switchyard.tools.ui.facets.ISwitchYardFacetConstants.SWITCHYARD_JAR_PRESET_ID;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.project.IMavenProjectFacade;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.project.facet.core.IFacetedProject;
import org.eclipse.wst.common.project.facet.core.IFacetedProjectWorkingCopy;
import org.eclipse.wst.common.project.facet.core.IPreset;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;
import org.eclipse.wst.common.project.facet.core.ProjectFacetsManager;
import org.eclipse.wst.common.project.facet.ui.ModifyFacetedProjectWizard;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.explorer.ISwitchYardNode;
import org.switchyard.tools.ui.facets.ISwitchYardFacetConstants;
import org.switchyard.tools.ui.facets.SwitchYardFacetInstallWizardPage;

/**
 * SwitchYardSettingsAction
 * 
 * <p/>
 * Action implementation for opening SwitchYard settings. If the project is not
 * a SwitchYard project, the user is asked if they would like to add the
 * SwitchYard facet.
 * 
 * @author Rob Cernich
 */
public class SwitchYardSettingsAction extends ActionDelegate implements IObjectActionDelegate {

    private IProject _project;
    private IWorkbenchPart _targetPart;

    @Override
    public void setActivePart(IAction action, IWorkbenchPart targetPart) {
        _targetPart = targetPart;
    }

    @Override
    public void run(IAction action) {
        try {
            internalRun();
        } catch (CoreException e) {
            Activator.getDefault().getLog().log(e.getStatus());
        }
    }

    private void internalRun() throws CoreException {
        if (_project == null || _targetPart == null) {
            return;
        }

        // check to see if this is a faceted project
        IFacetedProject ifp = ProjectFacetsManager.create(_project);
        if (ifp == null) {
            // prompt user to add SwitchYard and convert to faceted project.
            if (MessageDialog
                    .openQuestion(
                            _targetPart.getSite().getShell(),
                            "Add SwitchYard Capabilities?",
                            "The selected project is not a SwitchYard project.\n\nDo you wish to add SwitchYard capabilities?\n\n* Note, this will convert the project to Faceted Form.")) {
                convertToFacetedProject();
            }
            return;
        } else if (!ifp.hasProjectFacet(SWITCHYARD_FACET)) {
            // check to see if SwitchYard is installed
            if (MessageDialog.openQuestion(_targetPart.getSite().getShell(), "Add SwitchYard Capabilities?",
                    "The selected project is not a SwitchYard project.\n\nDo you wish to add SwitchYard capabilities?")) {
                installSwitchYardFacet(ifp.createWorkingCopy());
            }
            return;
        }

        displayPropertyDialog();
    }

    private void convertToFacetedProject() throws CoreException {
        IFacetedProject ifp = ProjectFacetsManager.create(_project, true, new NullProgressMonitor());
        installSwitchYardFacet(ifp.createWorkingCopy());
    }

    private void installSwitchYardFacet(final IFacetedProjectWorkingCopy fpwc) {
        try {
            boolean installed = false;
            final String installPresetId;
            if (isJarPackaging()) {
                installPresetId = SWITCHYARD_JAR_PRESET_ID;
            } else {
                installPresetId = SWITCHYARD_BASIC_PRESET_ID;
            }
            for (IPreset preset : fpwc.getAvailablePresets()) {
                if (installPresetId.equals(preset.getId())) {
                    // this should setup the java facet correctly
                    for (IProjectFacetVersion pfv : preset.getProjectFacets()) {
                        fpwc.addProjectFacet(pfv);
                    }
                    installed = true;
                    break;
                }
            }
            if (!installed) {
                // TODO: maybe show an error saying we couldn't install the sy
                // facet.
                return;
            }
            if (fpwc.getProjectFacetAction(SWITCHYARD_FACET) != null) {
                Object config = fpwc.getProjectFacetAction(SWITCHYARD_FACET).getConfig();
                if (config instanceof IDataModel
                        && !((IDataModel) config).isPropertySet(ISwitchYardFacetConstants.RUNTIME_VERSION)) {
                    // display the wizard if the project doesn't have SY
                    // capabilities
                    ModifyFacetedProjectWizard modifyWizard = new ModifyFacetedProjectWizard(fpwc) {
                        @Override
                        public IWizardPage[] getPages() {
                            // we only need to configure switchyard
                            for (IWizardPage page : super.getPages()) {
                                if (page instanceof SwitchYardFacetInstallWizardPage) {
                                    return new IWizardPage[] {page };
                                }
                            }
                            return new IWizardPage[0];
                        }
                    };
                    modifyWizard.setShowFacetsSelectionPage(false);
                    WizardDialog dialog = new WizardDialog(_targetPart.getSite().getShell(), modifyWizard);
                    dialog.setBlockOnOpen(true);
                    dialog.open();
                    // no need to go to open the property page, since the user
                    // just edited the settings
                    return;
                }
            }

            // install the facet
            try {
                PlatformUI.getWorkbench().getProgressService().run(false, true, new IRunnableWithProgress() {
                    @Override
                    public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                        try {
                            fpwc.commitChanges(monitor);
                        } catch (CoreException e) {
                            throw new InvocationTargetException(e);
                        }
                    }
                });
            } catch (Exception e) {
                if (e.getCause() instanceof CoreException) {
                    Activator.getDefault().getLog().log(((CoreException) e.getCause()).getStatus());
                } else {
                    Activator
                            .getDefault()
                            .getLog()
                            .log(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error initializing SwitchYard facet.",
                                    e));
                }
            }
            displayPropertyDialog();
        } finally {
            fpwc.dispose();
        }
    }

    private boolean isJarPackaging() {
        final IMavenProjectFacade mavenFacade = MavenPlugin.getMavenProjectRegistry().getProject(_project);
        return mavenFacade == null || "jar".equals(mavenFacade.getPackaging());
    }

    @Override
    public void selectionChanged(IAction action, ISelection selection) {
        super.selectionChanged(action, selection);
        _project = null;
        if (selection.isEmpty() || !(selection instanceof IStructuredSelection)) {
            return;
        }
        Object obj = ((IStructuredSelection) selection).getFirstElement();
        if (obj instanceof IProject) {
            _project = (IProject) obj;
        } else if (obj instanceof ISwitchYardNode) {
            _project = ((ISwitchYardNode) obj).getRoot().getProject();
        }
    }

    @Override
    public void dispose() {
        _project = null;
        _targetPart = null;
        super.dispose();
    }

    private void displayPropertyDialog() {
        // display project properties dialog, open to SwitchYard Settings
        PreferencesUtil.createPropertyDialogOn(_targetPart.getSite().getShell(), _project,
                "org.switchyard.tools.ui.configuration.page", null, null, PreferencesUtil.OPTION_NONE).open();
    }
}
