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
package org.switchyard.tools.ui.operations;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.m2e.core.ui.internal.UpdateMavenProjectJob;
import org.switchyard.tools.ui.common.ISwitchYardProjectWorkingCopy;

/**
 * UpdateProjectPomOperation
 * 
 * Updates a project's pom to include required dependencies and scanners.
 * 
 * @author Rob Cernich
 */
public class UpdateProjectPomOperation implements IWorkspaceRunnable {

    private final ISwitchYardProjectWorkingCopy _workingCopy;

    /**
     * Create a new UpdateProjectPomOperation.
     * 
     * @param workingCopy the working copy containing the changes.
     */
    public UpdateProjectPomOperation(ISwitchYardProjectWorkingCopy workingCopy) {
        _workingCopy = workingCopy;
    }

    @Override
    public void run(IProgressMonitor monitor) throws CoreException {
        try {
            _workingCopy.commit(monitor);
            refreshProject(monitor);
        } finally {
            monitor.done();
        }
    }

    private void refreshProject(IProgressMonitor monitor) throws CoreException {
        // update the project so we ensure a Project->Clean is done so the
        // MANIFEST.MF is built and we don't run into trouble deploying the
        // project on a Fuse server.
        IProject project = _workingCopy.getProject();
        if (project != null) {
            // update the maven project so we start in a deployable state
            // with a valid MANIFEST.MF built as part of the build process.
            Job updateJob = new UpdateMavenProjectJob(new IProject[] {project });
            updateJob.schedule();
        }
    }
}
