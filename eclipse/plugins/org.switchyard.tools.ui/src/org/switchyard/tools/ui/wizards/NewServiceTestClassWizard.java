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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.ide.undo.WorkspaceUndoUtil;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.operations.CreateServiceTestOperation;

/**
 * NewServiceTestClassWizard.
 * 
 * Creates a new service test class.
 * 
 * @author Rob Cernich
 */
public class NewServiceTestClassWizard extends BasicNewResourceWizard {

    private NewServiceTestClassWizardPage _newClassPage;

    /**
     * Create a new NewServiceTestClassWizard.
     */
    public NewServiceTestClassWizard() {
        setNeedsProgressMonitor(true);
    }

    @Override
    public void addPages() {
        _newClassPage = new NewServiceTestClassWizardPage();
        _newClassPage.init(selection);
        addPage(_newClassPage);
    }

    @Override
    public boolean performFinish() {
        final CreateServiceTestOperation op = new CreateServiceTestOperation(_newClassPage,
                WorkspaceUndoUtil.getUIInfoAdapter(getShell()));
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
        } catch (InvocationTargetException e) {
            Throwable realException = e.getTargetException();
            if (realException instanceof CoreException) {
                Activator.getDefault().getLog().log(((CoreException) realException).getStatus());
            } else {
                Activator
                        .getDefault()
                        .getLog()
                        .log(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error creating bean service class.",
                                realException));
            }
            MessageDialog.openError(getShell(), "Error Creating Bean Service", realException.getMessage());
            if (!_newClassPage.getModifiedResource().exists()) {
                return false;
            }
        } catch (InterruptedException e) {
            return false;
        }

        // reveal and open the file
        final IResource resource = _newClassPage.getModifiedResource();
        if (resource instanceof IFile && resource.exists()) {
            selectAndReveal(resource);
            final IWorkbenchPage activePage = getWorkbench().getActiveWorkbenchWindow().getActivePage();
            if (activePage != null) {
                getShell().getDisplay().asyncExec(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            IDE.openEditor(activePage, (IFile) resource, true);
                        } catch (PartInitException e) {
                            Activator
                                    .getDefault()
                                    .getLog()
                                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                                            "Error opening bean service source.", e));
                        }
                    }
                });
            }
        }
        return true;
    }

}
