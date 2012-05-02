/*******************************************************************************
 * Copyright (c) 2010 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      Sonatype, Inc. - initial API and implementation
 *******************************************************************************/

package org.switchyard.tools.ui.common.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.internal.IMavenConstants;
import org.eclipse.m2e.core.project.IMavenProjectFacade;
import org.eclipse.m2e.core.project.IProjectConfigurationManager;
import org.eclipse.m2e.core.project.MavenUpdateRequest;
import org.eclipse.m2e.core.ui.internal.Messages;
import org.eclipse.m2e.core.ui.internal.actions.OpenMavenConsoleAction;
import org.eclipse.m2e.core.ui.internal.util.M2EUIUtils;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.progress.IProgressConstants;

/**
 * Copied from org.eclipse.m2e.core.ui.internal.UpdateConfigurationJob.
 */
@SuppressWarnings("restriction")
public class UpdateConfigurationJob extends WorkspaceJob {

    private final IProject[] _projects;
    private final boolean _offline;
    private final boolean _forceUpdate;

    /* package */UpdateConfigurationJob(IProject[] projects) {
        this(projects, MavenPlugin.getMavenConfiguration().isOffline(), false /* _forceUpdate */);
    }

    /* package */UpdateConfigurationJob(IProject[] projects, boolean offline, boolean forceUpdate) {
        super(Messages.UpdateSourcesAction_job_update_conf);
        this._projects = projects;
        this._offline = offline;
        this._forceUpdate = forceUpdate;

        setRule(MavenPlugin.getProjectConfigurationManager().getRule());
    }

    @Override
    public IStatus runInWorkspace(IProgressMonitor monitor) {
        IProjectConfigurationManager configurationManager = MavenPlugin.getProjectConfigurationManager();

        setProperty(IProgressConstants.ACTION_PROPERTY, new OpenMavenConsoleAction());
        monitor.beginTask(getName(), _projects.length);

        MultiStatus status = null;
        // project names to the errors encountered when updating them
        Map<String, Throwable> updateErrors = new HashMap<String, Throwable>();

        for (IProject project : _projects) {
            if (monitor.isCanceled()) {
                throw new OperationCanceledException();
            }

            monitor.subTask(project.getName());
            IMavenProjectFacade projectFacade = MavenPlugin.getMavenProjectRegistry().create(project, monitor);
            if (projectFacade != null) {
                try {
                    MavenUpdateRequest request = new MavenUpdateRequest(project, _offline, _forceUpdate);
                    configurationManager.updateProjectConfiguration(request, new SubProgressMonitor(monitor, 1));
                } catch (CoreException ex) {
                    if (status == null) {
                        status = new MultiStatus(IMavenConstants.PLUGIN_ID, IStatus.ERROR, //
                                Messages.UpdateSourcesAction_error_cannot_update, null);
                    }
                    status.add(ex.getStatus());
                    updateErrors.put(project.getName(), ex);
                } catch (IllegalArgumentException e) {
                    status = new MultiStatus(IMavenConstants.PLUGIN_ID, IStatus.ERROR, //
                            Messages.UpdateSourcesAction_error_cannot_update, null);
                    updateErrors.put(project.getName(), e);
                }
            }
        }
        if (updateErrors.size() > 0) {
            handleErrors(updateErrors);
        }

        return status != null ? status : Status.OK_STATUS;
    }

    private void handleErrors(final Map<String, Throwable> updateErrors) {
        final Display display = Display.getDefault();
        if (display != null) {
            display.asyncExec(new Runnable() {
                public void run() {
                    M2EUIUtils.showErrorsForProjectsDialog(display.getActiveShell(),
                            Messages.UpdateSourcesAction_error_title, Messages.UpdateSourcesAction_error_message,
                            updateErrors);
                }
            });
        }
    }
}
