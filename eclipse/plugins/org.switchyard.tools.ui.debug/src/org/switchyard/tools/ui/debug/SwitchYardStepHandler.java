/******************************************************************************* 
 * Copyright (c) 2014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.debug;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.jdt.debug.core.IJavaThread;

/**
 * SwitchYardStepHandler
 * <p/>
 * Implements behavior for stepping through SwitchYard service bus processors
 * (intercept->addressing->transaction->security...).
 */
public class SwitchYardStepHandler implements IDebugEventSetListener {

    /** Marker used to identify a step breakpoint. */
    public static final String STEP_MARKER = SwitchYardStepHandler.class.getCanonicalName();

    private final IJavaThread _thread;
    private ServiceInteractionBreakpoint _breakpoint;

    /**
     * Create a new SwitchYardStepHandler.
     * 
     * @param thread the thread to be stepped.
     */
    public SwitchYardStepHandler(IJavaThread thread) {
        _thread = thread;
    }

    /**
     * Register appropriate break events corresponding to entry points for each
     * step in the bus and resume the thread. (Breakpoint locations are derived
     * from the route declared in CamelExchangeBusRoute.)
     * 
     * @throws CoreException if something goes awry.
     */
    public void step() throws CoreException {
        final IDebugTarget debugTarget = _thread.getDebugTarget();
        _breakpoint = new ServiceInteractionBreakpoint(ResourcesPlugin.getWorkspace().getRoot(),
                InteractionConfigurationBuilder.create().build(), false);
        _breakpoint.setThreadFilter(_thread);
        _breakpoint.getMarker().setAttribute(STEP_MARKER, true);
        debugTarget.breakpointAdded(_breakpoint);
        DebugPlugin.getDefault().addDebugEventListener(this);
        // resume
        try {
            _thread.resume();
        } catch (Exception e) {
            cleanup();
        }
    }

    @Override
    public void handleDebugEvents(DebugEvent[] events) {
        for (DebugEvent event : events) {
            final Object source = event.getSource();
            if (source != _thread && source != _thread.getDebugTarget()) {
                continue;
            }
            if (event.getKind() == DebugEvent.SUSPEND || event.getKind() == DebugEvent.TERMINATE) {
                // nuke the breakpoint
                cleanup();
            }
        }
    }

    private void cleanup() {
        DebugPlugin.getDefault().removeDebugEventListener(this);
        final IDebugTarget target = _thread.getDebugTarget();
        if (_breakpoint != null) {
            target.breakpointRemoved(_breakpoint, null);
            Job cleanupJob = new Job("Cleanup SwitchYard Bus Step Breakpoints") {
                @Override
                protected IStatus run(IProgressMonitor monitor) {
                    try {
                        _breakpoint.delete();
                    } catch (CoreException e) {
                        e.printStackTrace();
                    }
                    _breakpoint = null;
                    return Status.OK_STATUS;
                }
            };
            cleanupJob.setRule(ResourcesPlugin.getWorkspace().getRoot());
            cleanupJob.schedule();
        }
    }
}
