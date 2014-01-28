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
package org.switchyard.tools.ui.common.impl;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.common.ISwitchYardProject;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager.ISwitchYardProjectListener.Type;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * SwitchYardProjectManager
 * 
 * <p/>
 * Manages a cached set of SwitchYard project instances.
 * 
 * @author Rob Cernich
 */
public final class SwitchYardProjectManager {

    /** Identifies the Job family for the project refresh job. */
    public static final Object SWITCHYARD_PROJECT_REFRESH_JOB_FAMILY = new Object();

    /**
     * Listener interface for SwitchYard project updates.
     */
    public interface ISwitchYardProjectListener {
        /**
         * The type of udpate.
         */
        public enum Type {
            /** The project's Maven configuration has been updated. */
            POM,
            /** The switchyard.xml file used by the project has been updated. */
            CONFIG,
            /** The project was deleted or closed. */
            REMOVED
        }

        /**
         * Notiify listener that the SwichYard project has been updated.
         * 
         * @param project the project.
         * @param types the type of updates.
         */
        public void projectUpdated(ISwitchYardProject project, Set<Type> types);
    }

    /**
     * @return the SwitchYard project manager instance.
     */
    public static SwitchYardProjectManager instance() {
        return INSTANCE;
    }

    private static final SwitchYardProjectManager INSTANCE = new SwitchYardProjectManager();
    private Map<IProject, SwitchYardProject> _cache = new HashMap<IProject, SwitchYardProject>();
    private Set<ISwitchYardProjectListener> _listeners = new LinkedHashSet<ISwitchYardProjectListener>();
    private IResourceDeltaVisitor _configFileChangedVisitor = new ConfigFileChangedResourceDeltaVisitor();
    private IResourceDeltaVisitor _projectDeletedVisitor = new ProjectDeletedResourceDeltaVisitor();

    /**
     * Create a new SwitchYardProjectManager.
     */
    private SwitchYardProjectManager() {
        ResourcesPlugin.getWorkspace().addResourceChangeListener(new IResourceChangeListener() {
            @Override
            public void resourceChanged(IResourceChangeEvent event) {
                final IResourceDelta delta = event.getDelta();
                if (delta == null) {
                    return;
                }
                try {
                    delta.accept(_projectDeletedVisitor);
                } catch (CoreException e) {
                    Activator.getDefault().getLog().log(e.getStatus());
                }
            }
        });

        ResourcesPlugin.getWorkspace().addResourceChangeListener(new IResourceChangeListener() {
            @Override
            public void resourceChanged(IResourceChangeEvent event) {
                final IResourceDelta delta = event.getDelta();
                if (delta == null) {
                    return;
                }
                try {
                    delta.accept(_configFileChangedVisitor);
                } catch (CoreException e) {
                    Activator.getDefault().getLog().log(e.getStatus());
                }
            }
        }, IResourceChangeEvent.POST_BUILD);
    }

    /**
     * Returns a ISwitchYardProject instance for the specified project. If the
     * specified project is not a SwitchYard project, null is returned.
     * 
     * @param project the project.
     * @return the corresponding ISwitchYardProject.
     */
    public ISwitchYardProject getSwitchYardProject(IProject project) {
        if (_cache.containsKey(project)) {
            return _cache.get(project);
        }
        SwitchYardProject switchYardProject = new SwitchYardProject(this, project);
        _cache.put(project, switchYardProject);
        if (switchYardProject.needsLoading()) {
            scheduleRefresh(switchYardProject, EnumSet.of(Type.POM, Type.CONFIG));
        }
        return switchYardProject;
    }

    /**
     * @param listener the listener.
     */
    public synchronized void addListener(ISwitchYardProjectListener listener) {
        _listeners.add(listener);
    }

    /**
     * @param listener the listener.
     */
    public synchronized void removeListener(ISwitchYardProjectListener listener) {
        _listeners.remove(listener);
    }

    /* package */void notify(SwitchYardProject project, Set<Type> types) {
        List<ISwitchYardProjectListener> listeners;
        synchronized (this) {
            listeners = new ArrayList<ISwitchYardProjectListener>(_listeners);
        }
        for (ISwitchYardProjectListener listener : listeners) {
            try {
                listener.projectUpdated(project, types);
            } catch (Exception e) {
                e.fillInStackTrace();
            }
        }
    }

    /**
     * @param project the project to check.
     * 
     * @return true if a refresh is schedule for the project.
     */
    public boolean refreshScheduled(ISwitchYardProject project) {
        return _pendingUpdates.containsKey(project);
    }

    private void scheduleRefresh(SwitchYardProject switchYardProject, Set<Type> updateTypes) {
        Set<Type> existing = _pendingUpdates.putIfAbsent(switchYardProject, updateTypes);
        if (existing == null) {
            // we schedule it out a bit in case the maven subsystem takes care
            // of loading the project for us.
            _projectUpdateJob.schedule(1000);
        } else {
            updateTypes.addAll(existing);
            _pendingUpdates.put(switchYardProject, updateTypes);
        }
    }

    private ConcurrentMap<SwitchYardProject, Set<Type>> _pendingUpdates = new ConcurrentHashMap<SwitchYardProject, Set<Type>>();
    private Job _projectUpdateJob = new UpdateMetadataJob();

    private final class UpdateMetadataJob extends Job {
        private UpdateMetadataJob() {
            super(Messages.SwitchYardProjectManager_UpdatingProjectMetadataJob);
            // we want this to be lower priority, in the hopes the maven
            // subsystem will do all the work, making this a short runner.
            setPriority(BUILD);
        }

        @Override
        protected IStatus run(IProgressMonitor monitor) {
            monitor.beginTask(Messages.SwitchYardProjectManager_UpdatingProjectMetadataJob2, IProgressMonitor.UNKNOWN);
            try {
                do {
                    for (Iterator<Entry<SwitchYardProject, Set<Type>>> it = _pendingUpdates.entrySet().iterator(); it
                            .hasNext();) {
                        Entry<SwitchYardProject, Set<Type>> entry = it.next();
                        SwitchYardProject switchYardProject = entry.getKey();
                        monitor.subTask(switchYardProject.getProject().getName());
                        SubProgressMonitor subMontior = new SubProgressMonitor(monitor, 100);
                        try {
                            it.remove();
                            Set<Type> updateTypes = entry.getValue();
                            if (updateTypes.contains(Type.POM)) {
                                switchYardProject.load(subMontior);
                            } else if (updateTypes.contains(Type.CONFIG)) {
                                SwitchYardProjectManager.this.notify(switchYardProject, updateTypes);
                            }
                        } catch (Exception e) {
                            Activator
                                    .getDefault()
                                    .getLog()
                                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                                            Messages.SwitchYardProjectManager_ErrorLoadingMetadataMessage
                                                    + switchYardProject.getProject(), e));
                        } finally {
                            subMontior.done();
                        }
                        if (monitor.isCanceled()) {
                            return Status.CANCEL_STATUS;
                        }
                    }
                } while (_pendingUpdates.size() > 0);
            } catch (OperationCanceledException e) {
                return Status.CANCEL_STATUS;
            } finally {
                monitor.done();
            }
            return Status.OK_STATUS;
        }

        @Override
        public boolean belongsTo(Object family) {
            return family == SWITCHYARD_PROJECT_REFRESH_JOB_FAMILY || super.belongsTo(family);
        }

        @Override
        public boolean shouldRun() {
            return _pendingUpdates.size() > 0;
        }
    };

    private final class ConfigFileChangedResourceDeltaVisitor implements IResourceDeltaVisitor {
        @Override
        public boolean visit(IResourceDelta delta) throws CoreException {
            final IResource resource = delta.getResource();
            if (resource == null) {
                return false;
            }
            switch (resource.getType()) {
            case IResource.ROOT:
                return true;
            case IResource.PROJECT:
                break;
            default:
                return false;
            }
            IProject project = (IProject) resource;
            if (!_cache.containsKey(project)) {
                return false;
            }
            SwitchYardProject switchYardProject = _cache.get(project);
            if (switchYardProject.getOutputSwitchYardConfigurationFile() != null) {
                final IResourceDelta configDelta = delta.findMember(switchYardProject
                        .getOutputSwitchYardConfigurationFile().getProjectRelativePath());
                if (configDelta != null && (configDelta.getFlags() & IResourceDelta.MARKERS) != IResourceDelta.MARKERS) {
                    SwitchYardProjectManager.this.notify(switchYardProject, EnumSet.of(Type.CONFIG));
                }
            }
            return false;
        }
    }

    private final class ProjectDeletedResourceDeltaVisitor implements IResourceDeltaVisitor {
        @Override
        public boolean visit(IResourceDelta delta) throws CoreException {
            final IResource resource = delta.getResource();
            if (resource == null) {
                return false;
            }
            switch (resource.getType()) {
            case IResource.ROOT:
                return true;
            case IResource.PROJECT:
                break;
            default:
                return false;
            }
            IProject project = (IProject) resource;
            if (!_cache.containsKey(project)) {
                return false;
            }
            if (delta.getKind() == IResourceDelta.REMOVED
                    || ((delta.getFlags() & IResourceDelta.OPEN) == IResourceDelta.OPEN && !project.isOpen())) {
                SwitchYardProject syp = _cache.remove(project);
                _pendingUpdates.remove(syp);
                SwitchYardProjectManager.this.notify(syp, EnumSet.of(Type.REMOVED));
                syp.dispose();
                return false;
            }
            return false;
        }
    }

}
