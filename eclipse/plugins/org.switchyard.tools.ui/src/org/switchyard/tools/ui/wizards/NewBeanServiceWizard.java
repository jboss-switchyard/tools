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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.ide.undo.WorkspaceUndoUtil;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.operations.CreateBeanServiceOperation;

/**
 * NewBeanServiceWizard.
 * 
 * Creates a new CDI bean service.
 * 
 * @author Rob Cernich
 */
public class NewBeanServiceWizard extends AbstractSwitchYardServiceWizard {

    private NewBeanServiceClassWizardPage _newClassPage;

    /**
     * Create a new NewBeanServiceWizard.
     */
    public NewBeanServiceWizard() {
        setNeedsProgressMonitor(true);
    }

    @Override
    public void addPages() {
        _newClassPage = new NewBeanServiceClassWizardPage();
        _newClassPage.init(selection);
        addPage(_newClassPage);

        super.addPages();
    }

    @Override
    protected String getServiceInterfaceName() {
        return _newClassPage.getServiceInterface();
    }

    @Override
    protected IJavaProject getJavaProject() {
        return _newClassPage.getJavaProject();
    }

    @Override
    protected boolean getCreateTestClass() {
        return _newClassPage.getCreateTestClass();
    }

    @Override
    public boolean performFinish() {
        final CreateBeanServiceOperation op = new CreateBeanServiceOperation(_newClassPage,
                _newClassPage.getCreateTestClass() ? getNewServiceTestClassWizardPage() : null,
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
        final IResource testResource = getCreateTestClass() ? getNewServiceTestClassWizardPage().getModifiedResource() : null;
        if (resource instanceof IFile && resource.exists()) {
            selectAndReveal(resource);
            final IWorkbenchPage activePage = getWorkbench().getActiveWorkbenchWindow().getActivePage();
            if (activePage != null) {
                getShell().getDisplay().asyncExec(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            IDE.openEditor(activePage, (IFile) resource, true);
                            if (testResource instanceof IFile && testResource.exists()) {
                                IDE.openEditor(activePage, (IFile) testResource, true);
                            }
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
