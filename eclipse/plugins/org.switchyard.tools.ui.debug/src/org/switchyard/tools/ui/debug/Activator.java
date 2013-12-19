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
package org.switchyard.tools.ui.debug;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.jdt.debug.core.IJavaDebugTarget;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 */
public class Activator extends AbstractUIPlugin {

    /** The PLUGIN_ID. */
    public static final String PLUGIN_ID = "org.switchyard.tools.ui.debug"; //$NON-NLS-1$

    // The shared instance
    private static Activator plugin;

    private IDebugEventSetListener _debugListener;

    /**
     * The constructor.
     */
    public Activator() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
     * )
     */
    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
        addDebugEventListener();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
     * )
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        removeDebugEventListener();
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }

    private void addDebugEventListener() {
        if (_debugListener == null) {
            _debugListener = new SwitchYardDebugEventSetListener();
            DebugPlugin.getDefault().addDebugEventListener(_debugListener);
        }
    }

    private void removeDebugEventListener() {
        if (_debugListener != null) {
            DebugPlugin.getDefault().removeDebugEventListener(_debugListener);
            _debugListener = null;
        }
    }

    private static final class SwitchYardDebugEventSetListener implements IDebugEventSetListener {
        @Override
        public void handleDebugEvents(DebugEvent[] events) {
            for (DebugEvent event : events) {
                if (event.getKind() == DebugEvent.CREATE && event.getSource() instanceof IJavaDebugTarget) {
                    final IJavaDebugTarget target = (IJavaDebugTarget) event.getSource();
                    if (!ILaunchManager.DEBUG_MODE.equals(target.getLaunch().getLaunchMode())) {
                        continue;
                    }
                    final IBreakpoint[] breakpoints = DebugPlugin.getDefault().getBreakpointManager()
                            .getBreakpoints(SwitchYardDebugUtil.MODEL_IDENTIFIER);
                    if (breakpoints == null || breakpoints.length == 0) {
                        continue;
                    }
                    IResource[] resources = null;
                    try {
                        resources = target.getLaunch().getLaunchConfiguration().getMappedResources();
                    } catch (CoreException e) {
                        e.printStackTrace();
                    }
                    if (resources == null) {
                        // add them all
                        for (IBreakpoint breakpoint : breakpoints) {
                            try {
                                if (breakpoint.isEnabled()) {
                                    target.breakpointAdded(breakpoint);
                                }
                            } catch (CoreException e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        /*
                         * some optimization as the breakpoints put a load on
                         * debugging.
                         */
                        final Set<IProject> projectSet = new HashSet<IProject>();
                        for (IResource resource : resources) {
                            addProjectBreakpoints(resource.getProject(), breakpoints, target, projectSet);
                        }
                    }
                }
            }
        }

        private void addProjectBreakpoints(IProject project, IBreakpoint[] breakpoints, IJavaDebugTarget target,
                Set<IProject> seen) {
            if (!seen.add(project)) {
                return;
            }
            if (!project.isAccessible()) {
                return;
            }
            for (IBreakpoint breakpoint : breakpoints) {
                final IProject breakpointProject = breakpoint.getMarker().getResource().getProject();
                if (project.equals(breakpointProject)) {
                    try {
                        if (breakpoint.isEnabled()) {
                            target.breakpointAdded(breakpoint);
                        }
                    } catch (CoreException e) {
                        e.printStackTrace();
                    }
                }
            }
            try {
                final IProjectDescription description = project.getDescription();
                for (IProject referenced : description.getDynamicReferences()) {
                    addProjectBreakpoints(referenced, breakpoints, target, seen);
                }
                for (IProject referenced : description.getReferencedProjects()) {
                    addProjectBreakpoints(referenced, breakpoints, target, seen);
                }
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
    }
}
