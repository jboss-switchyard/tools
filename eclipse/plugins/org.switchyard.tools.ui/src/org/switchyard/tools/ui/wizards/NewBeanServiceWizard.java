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
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
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
    private IFile _newClassFile;
    private boolean _updateSwitchYardFile;
    private boolean _openAfterCreate;

    /**
     * Create a new NewBeanServiceWizard.
     */
    public NewBeanServiceWizard() {
        this(true, true);
    }

    /**
     * Create a new NewBeanServiceWizard.
     * 
     * @param udpateSwitchYardFile true if the switchyard.xml file should be
     *            updated upon completion.
     * @param openAfterCreate true if the new file should be opened in an
     *            editor.
     */
    public NewBeanServiceWizard(boolean udpateSwitchYardFile, boolean openAfterCreate) {
        _updateSwitchYardFile = udpateSwitchYardFile;
        _openAfterCreate = openAfterCreate;
        setNeedsProgressMonitor(true);
    }

    @Override
    public void addPages() {
        _newClassPage = new NewBeanServiceClassWizardPage();
        _newClassPage.init(selection);
        addPage(_newClassPage);

        super.addPages();
    }

    /**
     * @return the generated class file.
     */
    public IFile getNewClassFile() {
        return _newClassFile;
    }

    /**
     * @return the generated class.
     */
    public IType getNewClass() {
        return _newClassPage.getCreatedType();
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
                _newClassPage.getCreateTestClass() ? getNewServiceTestClassWizardPage() : null, _updateSwitchYardFile,
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
        if (resource instanceof IFile) {
            _newClassFile = (IFile) resource;
        }
        final IResource testResource = getCreateTestClass() ? getNewServiceTestClassWizardPage().getModifiedResource()
                : null;
        if (_newClassFile != null && _newClassFile.exists()) {
            selectAndReveal(_newClassFile);
            if (!_openAfterCreate) {
                return true;
            }
            final IWorkbenchPage activePage = getWorkbench().getActiveWorkbenchWindow().getActivePage();
            if (activePage != null) {
                getShell().getDisplay().asyncExec(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            IDE.openEditor(activePage, _newClassFile, true);
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
