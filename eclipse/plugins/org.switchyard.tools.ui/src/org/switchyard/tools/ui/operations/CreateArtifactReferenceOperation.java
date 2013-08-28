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
package org.switchyard.tools.ui.operations;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.xml.namespace.QName;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.ui.ide.undo.CreateFileOperation;
import org.switchyard.config.OutputKey;
import org.switchyard.config.model.ModelPuller;
import org.switchyard.config.model.switchyard.ArtifactModel;
import org.switchyard.config.model.switchyard.ArtifactsModel;
import org.switchyard.config.model.switchyard.SwitchYardModel;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.common.ISwitchYardProject;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * CreateArtifactReferenceOperation
 * 
 * <p/>
 * Creates a new &lt;artifact&gt; element in a switchyard.xml file.
 * 
 * @author Rob Cernich
 */
public class CreateArtifactReferenceOperation implements IWorkspaceRunnable {

    private ISwitchYardProject _switchYardProject;
    private String _name;
    private String _url;
    private IWorkspaceRunnable _downloadOperation;
    private IAdaptable _uiInfo;

    /**
     * Create a new CreateArtifactReferenceOperation.
     * 
     * @param switchYardProject the Switchyard project (used to resolve the
     *            configuration file).
     * @param name the artifact name
     * @param url the artifact url
     * @param downloadOperation the operation used to download the artifact; may
     *            be null.
     * @param uiInfo adaptable for UI Shell, may be null.
     */
    public CreateArtifactReferenceOperation(ISwitchYardProject switchYardProject, String name, String url,
            IWorkspaceRunnable downloadOperation, IAdaptable uiInfo) {
        _switchYardProject = switchYardProject;
        _name = name;
        _url = url;
        _downloadOperation = downloadOperation;
    }

    @Override
    public void run(IProgressMonitor monitor) throws CoreException {
        monitor.beginTask(Messages.CreateArtifactReferenceOperation_taskLabel_addingArtifactReferenceToProject, 200);
        try {
            IProgressMonitor subMonitor = new SubProgressMonitor(monitor, 100,
                    SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
            try {
                monitor.subTask(Messages.CreateArtifactReferenceOperation_taskLabel_updatingSYXMLFile);
                updateSwitchYardFile(subMonitor);
            } catch (CoreException e) {
                throw e;
            } catch (Exception e) {
                throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
                        Messages.CreateArtifactReferenceOperation_exceptionMessage_errorUpdatingSYXMLFile, e));
            } finally {
                subMonitor.done();
                subMonitor.setTaskName(""); //$NON-NLS-1$
            }

            if (_downloadOperation == null) {
                return;
            }

            subMonitor = new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
            monitor.subTask(Messages.CreateArtifactReferenceOperation_taskLabel_downloadingArtifactResource);
            try {
                _downloadOperation.run(subMonitor);
            } catch (CoreException e) {
                throw new CoreException(new Status(Status.WARNING, Activator.PLUGIN_ID,
                        Messages.CreateArtifactReferenceOperation_exceptionMessage_errorWhileDownloadingArtifact, e));
            }
        } finally {
            monitor.subTask(""); //$NON-NLS-1$
            monitor.done();
        }
    }

    private void updateSwitchYardFile(IProgressMonitor monitor) throws CoreException, ExecutionException, IOException {
        monitor.beginTask(Messages.CreateArtifactReferenceOperation_taskLabel_updatingSYXMLFile, 200);

        monitor.subTask(Messages.CreateArtifactReferenceOperation_taskLabel_loadingSYXMLFile);
        SwitchYardModel switchYardModel = _switchYardProject.loadSwitchYardModel(new NullProgressMonitor());
        monitor.worked(100);
        
        IFile switchYardFile = _switchYardProject.getSwitchYardConfigurationFile();
        ArtifactsModel artifacts = switchYardModel.getArtifacts();
        if (artifacts == null) {
            artifacts = new ModelPuller<ArtifactsModel>().pull(new QName(SwitchYardModel.DEFAULT_NAMESPACE,
                    ArtifactsModel.ARTIFACTS));
            switchYardModel.setArtifacts(artifacts);
        }
        ArtifactModel artifact = new ModelPuller<ArtifactModel>().pull(new QName(SwitchYardModel.DEFAULT_NAMESPACE,
                ArtifactModel.ARTIFACT));
        artifact.setName(_name);
        artifact.setURL(_url);
        artifacts.addArtifact(artifact);
        
        monitor.subTask(Messages.CreateArtifactReferenceOperation_taskLabel_writingUpdatedSYXML);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        switchYardModel.getModelConfiguration().write(baos, new OutputKey[0]);
        if (switchYardFile.exists()) {
            switchYardFile.setContents(new ByteArrayInputStream(baos.toByteArray()), true, true,
                    new SubProgressMonitor(monitor, 100));
        } else {
            try {
                new CreateFileOperation(switchYardFile, null, new ByteArrayInputStream(baos.toByteArray()),
                        Messages.CreateArtifactReferenceOperation_operationLabel_creatingSYXMLFile).execute(new SubProgressMonitor(monitor, 100), _uiInfo);
            } catch (ExecutionException e) {
                if (e.getCause() instanceof CoreException) {
                    throw (CoreException) e.getCause();
                }
                throw e;
            }
        }

    }
}
