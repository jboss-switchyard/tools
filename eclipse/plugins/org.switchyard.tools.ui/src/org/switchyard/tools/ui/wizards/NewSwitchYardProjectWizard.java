/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved. 
 * See the copyright.txt in the distribution for a 
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use, 
 * modify, copy, or redistribute it subject to the terms and conditions 
 * of the GNU Lesser General Public License, v. 2.1. 
 * This program is distributed in the hope that it will be useful, but WITHOUT A 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details. 
 * You should have received a copy of the GNU Lesser General Public License, 
 * v.2.1 along with this distribution; if not, write to the Free Software 
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 */
package org.switchyard.tools.ui.wizards;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;

import org.eclipse.core.resources.IProject;
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
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.ide.undo.WorkspaceUndoUtil;
import org.sonatype.aether.version.Version;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.operations.CreateSwitchYardProjectOperation;

/**
 * NewSwitchYardProjectWizard
 * 
 * Creates a new SwitchYard project.
 * 
 * @author Rob Cernich
 */
public class NewSwitchYardProjectWizard extends Wizard implements INewWizard {

    // TODO: use preferences
    private static final String DEFAULT_PROJECT_NAME = "switchyard-example";
    private static final String DEFAULT_PROJECT_VERSION = "0.0.1-SNAPSHOT";
    private static final String DEFAULT_RUNTIME_VERSION = "0.3.0-SNAPSHOT";

    private WizardNewProjectCreationPage _newProjectPage;
    private ProjectConfigurationWizardPage _configurationPage;
    private IStructuredSelection _selection;

    /**
     * Constructor for NewSwitchYardProjectWizard.
     */
    public NewSwitchYardProjectWizard() {
        super();
        setNeedsProgressMonitor(true);
        setWindowTitle("New SwitchYard Project");
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        this._selection = selection;
    }

    /**
     * @return the currently specified project name.
     */
    public String getProjectName() {
        return _newProjectPage.getProjectName();
    }

    @Override
    public void addPages() {
        _newProjectPage = new WizardNewProjectCreationPage("NewProjectPage") {
            public void createControl(Composite parent) {
                super.createControl(parent);
                createWorkingSetGroup((Composite) getControl(), _selection, new String[] {
                        "org.eclipse.ui.resourceWorkingSetPage", //$NON-NLS-1$
                        "org.eclipse.jdt.ui.JavaWorkingSetPage" });
                Dialog.applyDialogFont(getControl());
            }
        };
        _newProjectPage.setTitle("New SwitchYard Project");
        _newProjectPage.setDescription("Please specify project name and location.");
        _newProjectPage.setInitialProjectName(getInitialProjectName());
        addPage(_newProjectPage);

        _configurationPage = new ProjectConfigurationWizardPage();
        addPage(_configurationPage);
    }

    @Override
    public boolean performFinish() {
        // get a project handle
        final IProject newProjectHandle = _newProjectPage.getProjectHandle();

        // get a project descriptor
        URI location = null;
        if (!_newProjectPage.useDefaults()) {
            location = _newProjectPage.getLocationURI();
        }

        final String packageName = _configurationPage.getPackageName();
        final String groupId = _configurationPage.getGroupId();
        final Version runtimeVersion = _configurationPage.getRuntimeVersion();
        final String runtimeVersionString = runtimeVersion == null ? DEFAULT_RUNTIME_VERSION : runtimeVersion.toString();

        // create the new project operation
        final CreateSwitchYardProjectOperation op = new CreateSwitchYardProjectOperation(newProjectHandle, location,
                packageName, groupId, DEFAULT_PROJECT_VERSION, runtimeVersionString, WorkspaceUndoUtil.getUIInfoAdapter(getShell()));

        // run the new project creation operation
        try {
            getContainer().run(true, true, new IRunnableWithProgress() {
                
                @Override
                public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                    try {
                        ResourcesPlugin.getWorkspace().run(op, monitor);
                    } catch (CoreException e) {
                        throw new InvocationTargetException(e);
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
                        .log(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error creating SwitchYard project.",
                                realException));
            }
            MessageDialog.openError(getShell(), "Error Creating Project", realException.getMessage());
            return newProjectHandle.exists();
        }

        return true;
    }

    private String getInitialProjectName() {
        String initialProjectName = DEFAULT_PROJECT_NAME;
        int i = 1;
        while (ResourcesPlugin.getWorkspace().getRoot().getProject(initialProjectName).exists()) {
            initialProjectName = DEFAULT_PROJECT_NAME + i;
        }
        return initialProjectName;
    }

}
