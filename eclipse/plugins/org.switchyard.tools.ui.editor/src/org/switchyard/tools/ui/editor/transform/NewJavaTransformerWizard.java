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
package org.switchyard.tools.ui.editor.transform;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.ide.undo.WorkspaceUndoUtil;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.editor.Messages;

/**
 * NewJavaTransformerWizard
 * 
 * <p/>
 * New wizard for creating Java based transformer implementations.
 */
public class NewJavaTransformerWizard extends BasicNewResourceWizard implements INewTransformWizard {

    private NewJavaTransformerClassPage _page;
    private IFile _newClassFile;
    private boolean _openAfterCreate = false;

    /**
     * Create a new NewJavaTransformerWizard.
     */
    public NewJavaTransformerWizard() {
        setWindowTitle(Messages.title_newJavaTransformerClass);
        setNeedsProgressMonitor(true);
        _page = new NewJavaTransformerClassPage();
    }

    @Override
    public void init(IProject project) {
        _page.init(project);
        super.init(PlatformUI.getWorkbench(), new StructuredSelection(project));
    }

    @Override
    public void addPages() {
        addPage(_page);
    }

    @Override
    public void setSelectedTransforms(Collection<TransformType> transforms) {
        _page.setSelectedTransforms(transforms);
    }

    @Override
    public Collection<TransformType> getCreatedTransforms() {
        return Collections.emptyList();
    }

    @Override
    public boolean performFinish() {
        final CreateJavaTransformerOperation op = new CreateJavaTransformerOperation(_page,
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
                        .log(new Status(Status.ERROR, Activator.PLUGIN_ID, Messages.error_errorCreatingJavaTransformerClass,
                                realException));
            }
            MessageDialog.openError(getShell(), Messages.title_errorCreatingJavaTransformer, realException.getMessage());
            if (!_page.getModifiedResource().exists()) {
                return false;
            }
        } catch (InterruptedException e) {
            return false;
        }

        // reveal and open the file
        final IResource resource = _page.getModifiedResource();
        if (resource instanceof IFile) {
            _newClassFile = (IFile) resource;
        }
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
                        } catch (PartInitException e) {
                            Activator
                                    .getDefault()
                                    .getLog()
                                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                                            Messages.error_errorOpeningNewJavaTransformer, e));
                        }
                    }
                });
            }
        }
        return true;
    }

}
