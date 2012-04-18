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
package org.switchyard.tools.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.ide.undo.WorkspaceUndoUtil;
import org.switchyard.config.model.ModelPuller;
import org.switchyard.config.model.switchyard.ArtifactsModel;
import org.switchyard.config.model.switchyard.SwitchYardModel;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.common.ISwitchYardProject;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager;
import org.switchyard.tools.ui.operations.CreateArtifactReferenceOperation;

/**
 * NewArtifactReferenceWizard
 * 
 * <p/>
 * Creates a new &lt;artifact&gt; element in a switchyard.xml file.
 * 
 * This is the base wizard used by extensions.
 * 
 * @author Rob Cernich
 */
public abstract class NewArtifactReferenceWizard extends Wizard implements IWorkbenchWizard {

    private boolean _supportsDownload;
    private IWorkbench _workbench;
    private IProject _project;
    private ISwitchYardProject _switchYardProject;
    private SwitchYardModel _switchYardModel;
    private ArtifactDetailsWizardPage _artifactDetailsPage;

    protected NewArtifactReferenceWizard(boolean supportsDownload) {
        super();
        _supportsDownload = supportsDownload;
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        _workbench = workbench;
        _project = (IProject) selection.getFirstElement();
    }

    @Override
    public void createPageControls(Composite pageContainer) {
        super.createPageControls(pageContainer);
        // take the opportunity to initialize state
        loadSwitchYardModel();
    }

    @Override
    public boolean performFinish() {
        IWorkspaceRunnable downloadOperation = null;
        if (_artifactDetailsPage != null && _artifactDetailsPage.isDownloadArtifact()) {
            downloadOperation = createDownloadOperation();
        }
        final CreateArtifactReferenceOperation op = new CreateArtifactReferenceOperation(_switchYardProject,
                getArtifactName(), getArtifactURL(), downloadOperation, WorkspaceUndoUtil.getUIInfoAdapter(getShell()));
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
            boolean partialSuccess = false;
            Throwable realException = e.getTargetException();
            if (realException instanceof CoreException) {
                partialSuccess = ((CoreException) realException).getStatus().getSeverity() < Status.ERROR;
                Activator.getDefault().getLog().log(((CoreException) realException).getStatus());
            } else {
                Activator
                        .getDefault()
                        .getLog()
                        .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                                "Error adding artifact reference to SwitchYard project.", realException));
            }
            MessageDialog.openError(getShell(), "Error Adding Artifact Reference", realException.getMessage());
            return partialSuccess;
        }

        return true;
    }

    /**
     * @return an runnable that will download the repository artifact.
     */
    protected IWorkspaceRunnable createDownloadOperation() {
        return null;
    }

    /**
     * Provides access to the project's ArtifactsModel. This may be used by the
     * wizard or its pages for constraining properties for new artifacts (e.g.
     * to prevent duplicate names or URLs).
     * 
     * @return the ArtifactsModel defined by this project.
     */
    public ArtifactsModel getArtifacts() {
        return _switchYardModel.getArtifacts();
    }

    /**
     * Provides access to the URL of a selected provider resource. This may be
     * used by the ArtifactDetailsWizardPage to initialize properties of the
     * artifact being created.
     * 
     * @return the URL of the selected provider resource.
     */
    protected String getProviderURL() {
        return null;
    }

    /**
     * Provides access to the URL of a selected provider resource. This may be
     * used by the ArtifactDetailsWizardPage to initialize properties of the
     * artifact being created.
     * 
     * @return the name of the selected provider resource.
     */
    protected String getProviderName() {
        return null;
    }

    /**
     * @return the artifact details page, creating the page if necessary.
     */
    protected ArtifactDetailsWizardPage getArtifactDetailsPage() {
        if (_artifactDetailsPage == null) {
            _artifactDetailsPage = new ArtifactDetailsWizardPage(_supportsDownload);
        }
        return _artifactDetailsPage;
    }

    protected String getArtifactName() {
        if (_artifactDetailsPage == null) {
            return null;
        }
        return _artifactDetailsPage.getArtifactName();
    }

    protected String getArtifactURL() {
        if (_artifactDetailsPage == null) {
            return null;
        }
        return _artifactDetailsPage.getArtifactURL();
    }

    @Override
    public IWizardPage getNextPage(IWizardPage page) {
        page = super.getNextPage(page);
        if (page == _artifactDetailsPage && _artifactDetailsPage != null) {
            updateArtifactDetails();
        }
        return page;
    }

    protected IWorkbench getWorkbench() {
        return _workbench;
    }

    protected IProject getProject() {
        return _project;
    }

    /**
     * Update the name and URL controls to match the provider information.
     */
    protected void updateArtifactDetails() {
        String temp = getProviderName();
        if (temp != null && temp.length() > 0) {
            _artifactDetailsPage.setArtifactName(temp);
        }
        temp = getProviderURL();
        if (temp != null && temp.length() > 0) {
            _artifactDetailsPage.setArtifactURL(temp);
        }
    }

    @Override
    public boolean canFinish() {
        if (_artifactDetailsPage == null) {
            return super.canFinish();
        }
        IWizardPage currentPage = getContainer().getCurrentPage();
        for (IWizardPage page : getPages()) {
            if (page == _artifactDetailsPage) {
                break;
            } else if (page == currentPage) {
                // make sure we show the artifact details page
                return false;
            }
        }
        return super.canFinish();
    }

    private void loadSwitchYardModel() {
        _switchYardProject = SwitchYardProjectManager.instance().getSwitchYardProject(_project);
        try {
            getContainer().run(false, true, new IRunnableWithProgress() {
                @Override
                public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                    try {
                        _switchYardModel = _switchYardProject.loadSwitchYardModel(monitor);
                    } catch (Exception e) {
                        throw new InvocationTargetException(e);
                    }
                }
            });
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        if (_switchYardModel == null) {
            _switchYardModel = new ModelPuller<SwitchYardModel>().pull(new QName(SwitchYardModel.DEFAULT_NAMESPACE,
                    SwitchYardModel.SWITCHYARD));
        }
    }
}
