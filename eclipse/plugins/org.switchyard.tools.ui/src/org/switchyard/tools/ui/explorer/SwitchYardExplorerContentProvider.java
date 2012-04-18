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
package org.switchyard.tools.ui.explorer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.switchyard.tools.ui.common.ISwitchYardProject;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager.ISwitchYardProjectListener;
import org.switchyard.tools.ui.explorer.impl.SwitchYardRootNode;

/**
 * SwitchYardExplorerContentProvider
 * 
 * <p/>
 * Provider for SwitchYard content in the project explorer.
 * 
 * @author Rob Cernich
 */
public class SwitchYardExplorerContentProvider implements ITreeContentProvider, ISwitchYardProjectListener {

    private Map<IProject, SwitchYardRootNode> _cache = new HashMap<IProject, SwitchYardRootNode>();

    private TreeViewer _viewer;

    /**
     * Create a new SwitchYardExplorerContentProvider.
     */
    public SwitchYardExplorerContentProvider() {
        super();
        Job.getJobManager().addJobChangeListener(_jobListener);
        SwitchYardProjectManager.instance().addListener(this);
    }

    @Override
    public synchronized void dispose() {
        _viewer = null;

        SwitchYardProjectManager.instance().removeListener(this);
        Job.getJobManager().removeJobChangeListener(_jobListener);

        _switchYardNodeRefreshJob.cancel();
        _pendingUpdates.clear();

        for (SwitchYardRootNode node : _cache.values()) {
            node.dispose();
        }
        _cache.clear();
    }

    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        if (viewer instanceof TreeViewer) {
            _viewer = (TreeViewer) viewer;
        } else {
            _viewer = null;
        }
    }

    @Override
    public Object[] getElements(Object inputElement) {
        return getChildren(inputElement);
    }

    @Override
    public Object[] getChildren(Object parentElement) {
        if (parentElement instanceof IProject) {
            return new Object[] {getOrCreateRootNode((IProject) parentElement) };
        } else if (parentElement instanceof ISwitchYardRootNode) {
            ISwitchYardRootNode root = (ISwitchYardRootNode) parentElement;
            return new Object[] {root.getServicesNode(), root.getReferencesNode(), root.getComponentsNode(),
                    root.getArtifactsNode() };
        } else if (parentElement instanceof IServicesNode) {
            return ((IServicesNode) parentElement).getServices().toArray();
        } else if (parentElement instanceof IReferencesNode) {
            return ((IReferencesNode) parentElement).getReferences().toArray();
        } else if (parentElement instanceof IComponentsNode) {
            return ((IComponentsNode) parentElement).getComponents().toArray();
        } else if (parentElement instanceof IArtifactsNode) {
            return ((IArtifactsNode) parentElement).getArtifacts().toArray();
        } else if (parentElement instanceof IComponentNode) {
            IComponentNode component = (IComponentNode) parentElement;
            List<IComponentService> services = component.getServices();
            List<IComponentReference> references = component.getReferences();
            List<Object> children = new ArrayList<Object>(services.size() + references.size());
            children.addAll(services);
            children.addAll(references);
            return children.toArray();
        } else if (parentElement instanceof IServiceNode) {
            return ((IServiceNode) parentElement).getGateways().toArray();
        } else if (parentElement instanceof IReferenceNode) {
            return ((IReferenceNode) parentElement).getGateways().toArray();
        }
        return new Object[0];
    }

    @Override
    public Object getParent(Object element) {
        if (element instanceof ISwitchYardRootNode) {
            return ((ISwitchYardRootNode) element).getProject();
        } else if (element instanceof ISwitchYardNode) {
            return ((ISwitchYardNode) element).getParent();
        }
        return null;
    }

    @Override
    public boolean hasChildren(Object element) {
        if (element instanceof ISwitchYardRootNode) {
            return true;
        }
        return getChildren(element).length > 0;
    }

    @Override
    public synchronized void projectUpdated(ISwitchYardProject project, Set<Type> types) {
        if (!_cache.containsKey(project.getProject()) || (types.size() == 1 && types.contains(Type.POM))) {
            return;
        } else if (types.contains(Type.REMOVED)) {
            SwitchYardRootNode node = _cache.remove(project);
            _pendingUpdates.remove(node);
            node.dispose();
            return;
        }
        scheduleRefresh(_cache.get(project.getProject()));
    }

    private synchronized SwitchYardRootNode getOrCreateRootNode(IProject project) {
        if (_cache.containsKey(project)) {
            return _cache.get(project);
        }
        SwitchYardRootNode rootNode = new SwitchYardRootNode(project);
        _cache.put(project, rootNode);
        scheduleRefresh(rootNode);
        return rootNode;
    }

    private void scheduleRefresh(SwitchYardRootNode node) {
        if (node == null) {
            return;
        }
        _pendingUpdates.putIfAbsent(node, PENDING);
        _switchYardNodeRefreshJob.schedule(100);
    }

    private static final Object PENDING = new Object();
    private ConcurrentMap<SwitchYardRootNode, Object> _pendingUpdates = new ConcurrentHashMap<SwitchYardRootNode, Object>();
    private Job _switchYardNodeRefreshJob = new Job("Refreshing SwitchYard project configuration.") {
        @Override
        protected IStatus run(IProgressMonitor monitor) {
            monitor.beginTask("Refreshing SwitchYard project configuration: ", IProgressMonitor.UNKNOWN);
            IStatus status = Status.OK_STATUS;
            try {
                final Set<SwitchYardRootNode> updatedNodes = new LinkedHashSet<SwitchYardRootNode>();
                do {
                    for (Iterator<SwitchYardRootNode> it = _pendingUpdates.keySet().iterator(); it.hasNext();) {
                        SwitchYardRootNode switchYardNode = it.next();
                        monitor.subTask(switchYardNode.getProject().getName());
                        SubProgressMonitor subMontior = new SubProgressMonitor(monitor, 100);
                        Job.getJobManager().beginRule(switchYardNode.getProject(), monitor);
                        try {
                            it.remove();
                            switchYardNode.reload(subMontior);
                            updatedNodes.add(switchYardNode);
                        } catch (Exception e) {
                            e.fillInStackTrace();
                        } finally {
                            Job.getJobManager().endRule(switchYardNode.getProject());
                            subMontior.done();
                        }
                        if (monitor.isCanceled()) {
                            status = Status.CANCEL_STATUS;
                            break;
                        }
                    }
                } while (status.isOK() && _pendingUpdates.size() > 0);
                final TreeViewer viewer = SwitchYardExplorerContentProvider.this._viewer;
                if (viewer == null) {
                    _pendingUpdates.clear();
                } else {
                    viewer.getControl().getDisplay().asyncExec(new Runnable() {
                        public void run() {
                            if (viewer.getControl().isDisposed()) {
                                return;
                            }
                            // refreshing individual nodes does not work
                            // correctly. Eclipse 3.7, GTK.
                            viewer.refresh();
                        }
                    });
                }
            } finally {
                monitor.done();
            }
            return status;
        }

        @Override
        public boolean shouldSchedule() {
            return shouldRun();
        }

        @Override
        public boolean shouldRun() {
            return _pendingUpdates.size() > 0
                    && Job.getJobManager().find(SwitchYardProjectManager.SWITCHYARD_PROJECT_REFRESH_JOB_FAMILY).length == 0;
        }
    };

    private IJobChangeListener _jobListener = new JobChangeAdapter() {
        @Override
        public void done(IJobChangeEvent event) {
            if (event.getJob().belongsTo(SwitchYardProjectManager.SWITCHYARD_PROJECT_REFRESH_JOB_FAMILY)) {
                if (_pendingUpdates.size() > 0) {
                    _switchYardNodeRefreshJob.schedule();
                }
            }
        }

        @Override
        public void scheduled(IJobChangeEvent event) {
            if (event.getJob().belongsTo(SwitchYardProjectManager.SWITCHYARD_PROJECT_REFRESH_JOB_FAMILY)) {
                _switchYardNodeRefreshJob.cancel();
            }
        }

    };
}
