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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.ide.undo.WorkspaceUndoUtil;
import org.sonatype.aether.version.Version;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.i18n.Messages;
import org.switchyard.tools.ui.operations.CreateSwitchYardProjectOperation;
import org.switchyard.tools.ui.operations.CreateSwitchYardProjectOperation.NewSwitchYardProjectMetaData;

/**
 * NewSwitchYardProjectWizard
 * 
 * Creates a new SwitchYard project.
 * 
 * @author Rob Cernich
 */
public class NewSwitchYardProjectWizard extends Wizard implements INewWizard {

    // TODO: use preferences
    /** The default runtime version. */
    public static final String DEFAULT_RUNTIME_VERSION = "1.0.0.Final"; //$NON-NLS-1$
    private static final String DEFAULT_PROJECT_NAME = "switchyard-example"; //$NON-NLS-1$
    private static final String DEFAULT_PROJECT_VERSION = "0.0.1-SNAPSHOT"; //$NON-NLS-1$

    private WizardNewProjectCreationPage _newProjectPage;
    private ProjectConfigurationWizardPage _configurationPage;
    private IStructuredSelection _selection;
    private IWorkbench _workbench;

    /**
     * Constructor for NewSwitchYardProjectWizard.
     */
    public NewSwitchYardProjectWizard() {
        super();
        setNeedsProgressMonitor(true);
        setWindowTitle(Messages.NewSwitchYardProjectWizard_windowTitle);
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        _selection = selection;
        _workbench = workbench;
    }

    /**
     * @return the currently specified project name.
     */
    public String getProjectName() {
        return _newProjectPage.getProjectName();
    }

    @Override
    public void addPages() {
        _newProjectPage = new WizardNewProjectCreationPage("NewProjectPage") { //$NON-NLS-1$
            public void createControl(Composite parent) {
                super.createControl(parent);
                createWorkingSetGroup((Composite) getControl(), _selection, new String[] {
                        "org.eclipse.ui.resourceWorkingSetPage", //$NON-NLS-1$
                        "org.eclipse.jdt.ui.JavaWorkingSetPage" }); //$NON-NLS-1$
                Dialog.applyDialogFont(getControl());
            }
        };
        _newProjectPage.setTitle(Messages.NewSwitchYardProjectWizard_projectPageTitle);
        _newProjectPage.setDescription(Messages.NewSwitchYardProjectWizard_projectPageDescription);
        _newProjectPage.setInitialProjectName(getInitialProjectName());
        addPage(_newProjectPage);

        _configurationPage = new ProjectConfigurationWizardPage();
        addPage(_configurationPage);
    }

    @Override
    public boolean performFinish() {
        final NewSwitchYardProjectMetaData projectMetaData = new NewSwitchYardProjectMetaData();
        // get a project handle
        projectMetaData.setNewProjectHandle(_newProjectPage.getProjectHandle());

        // get a project descriptor
        if (!_newProjectPage.useDefaults()) {
            projectMetaData.setProjectLocation(_newProjectPage.getLocationURI());
        }

        projectMetaData.setPackageName(_configurationPage.getPackageName());
        projectMetaData.setNamespace(_configurationPage.getNamespace());
        projectMetaData.setGroupId(_configurationPage.getGroupId());
        projectMetaData.setProjectVersion(DEFAULT_PROJECT_VERSION);
        final Version runtimeVersion = _configurationPage.getRuntimeVersion();
        projectMetaData.setRuntimeVersion(runtimeVersion == null ? DEFAULT_RUNTIME_VERSION : runtimeVersion.toString());
        projectMetaData.setComponents(_configurationPage.getSelectedComponents());

        // create the new project operation
        final CreateSwitchYardProjectOperation op = new CreateSwitchYardProjectOperation(projectMetaData,
                WorkspaceUndoUtil.getUIInfoAdapter(getShell()));

        // run the new project creation operation
        try {
            final Display display = _workbench.getDisplay();
            final IWorkbenchPage activePage = _workbench.getActiveWorkbenchWindow().getActivePage();
            getContainer().run(true, true, new IRunnableWithProgress() {

                @Override
                public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                    try {
                        ResourcesPlugin.getWorkspace().run(op, monitor);
                    } catch (CoreException e) {
                        throw new InvocationTargetException(e);
                    }
                    if (activePage != null) {
                        display.asyncExec(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    IDE.openEditor(activePage, op.getSwitchYardFile(), true);
                                } catch (PartInitException e) {
                                    Activator
                                            .getDefault()
                                            .getLog()
                                            .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                                                    Messages.NewSwitchYardProjectWizard_logError_errorOpeningSYXML, e));
                                }
                            }
                        });
                    }
                }
            });
        } catch (InterruptedException e) {
            return false;
        } catch (InvocationTargetException e) {
            Throwable realException = e.getTargetException();
            if (realException instanceof CoreException) {
                Activator.getDefault().getLog().log(((CoreException) realException).getStatus());
            } else {
                Activator
                        .getDefault()
                        .getLog()
                        .log(new Status(Status.ERROR, Activator.PLUGIN_ID, Messages.NewSwitchYardProjectWizard_logError_errorCreatingSYProject,
                                realException));
            }
            MessageDialog.openError(getShell(), Messages.NewSwitchYardProjectWizard_errorMessage_errorCreatingProject, realException.getMessage());
            return projectMetaData.getNewProjectHandle().exists();
        }

        return true;
    }

    private String getInitialProjectName() {
        String initialProjectName = DEFAULT_PROJECT_NAME;
        int i = 1;
        while (ResourcesPlugin.getWorkspace().getRoot().getProject(initialProjectName).exists()) {
            initialProjectName = DEFAULT_PROJECT_NAME + i++;
        }
        return initialProjectName;
    }

}
