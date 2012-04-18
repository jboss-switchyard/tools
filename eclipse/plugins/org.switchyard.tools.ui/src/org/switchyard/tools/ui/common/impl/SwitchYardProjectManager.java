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
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.common.ISwitchYardProject;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager.ISwitchYardProjectListener.Type;

/**
 * SwitchYardProjectManager
 * 
 * <p/>
 * Manages a cached set of SwitchYard project instances.
 * 
 * @author Rob Cernich
 */
public final class SwitchYardProjectManager implements IResourceChangeListener, IResourceDeltaVisitor {

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

    /**
     * Create a new SwitchYardProjectManager.
     */
    private SwitchYardProjectManager() {
        ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
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
        scheduleRefresh(switchYardProject, EnumSet.of(Type.POM, Type.CONFIG));
        return switchYardProject;
    }

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
                || (delta.getFlags() & IResourceDelta.OPEN) == IResourceDelta.OPEN) {
            SwitchYardProject syp = _cache.remove(project);
            _pendingUpdates.remove(syp);
            notify(syp, EnumSet.of(Type.REMOVED));
            return false;
        }
        SwitchYardProject switchYardProject = _cache.get(project);
        Set<Type> updateTypes = EnumSet.noneOf(Type.class);
        if (delta.findMember(new Path("pom.xml")) != null
                || switchYardProject.getOutputSwitchYardConfigurationFile() == null) {
            updateTypes.add(Type.POM);
        }
        if (switchYardProject.getOutputSwitchYardConfigurationFile() != null
                && delta.findMember(switchYardProject.getOutputSwitchYardConfigurationFile().getProjectRelativePath()) != null) {
            updateTypes.add(Type.CONFIG);
        }
        if (updateTypes.size() > 0) {
            scheduleRefresh(switchYardProject, updateTypes);
        }
        return false;
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

    @Override
    public void resourceChanged(IResourceChangeEvent event) {
        final IResourceDelta delta = event.getDelta();
        if (delta == null) {
            return;
        }
        try {
            delta.accept(this);
        } catch (CoreException e) {
            Activator.getDefault().getLog().log(e.getStatus());
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
            _projectUpdateJob.schedule(100);
        } else {
            updateTypes.addAll(existing);
            _pendingUpdates.put(switchYardProject, updateTypes);
        }
    }

    private ConcurrentMap<SwitchYardProject, Set<Type>> _pendingUpdates = new ConcurrentHashMap<SwitchYardProject, Set<Type>>();
    private Job _projectUpdateJob = new Job("Updating SwitchYard project meta-data.") {
        @Override
        protected IStatus run(IProgressMonitor monitor) {
            monitor.beginTask("Updating SwitchYard project meta-data: ", IProgressMonitor.UNKNOWN);
            try {
                do {
                    for (Iterator<Entry<SwitchYardProject, Set<Type>>> it = _pendingUpdates.entrySet().iterator(); it
                            .hasNext();) {
                        Entry<SwitchYardProject, Set<Type>> entry = it.next();
                        SwitchYardProject switchYardProject = entry.getKey();
                        monitor.subTask(switchYardProject.getProject().getName());
                        SubProgressMonitor subMontior = new SubProgressMonitor(monitor, 100);
                        getJobManager().beginRule(switchYardProject.getProject(), monitor);
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
                                            "Error loading SwitchYard project meta-data: "
                                                    + switchYardProject.getProject(), e));
                        } finally {
                            getJobManager().endRule(switchYardProject.getProject());
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
}
