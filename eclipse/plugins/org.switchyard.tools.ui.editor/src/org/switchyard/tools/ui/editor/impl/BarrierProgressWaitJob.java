/*******************************************************************************
 * Copyright (c) 2013 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.switchyard.tools.ui.editor.impl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

/**
 * This class is a Job with the purpose of specifically waiting on a barrier
 * array to have a non-null value in the index 0 slot, OR, to have a canceled
 * progress monitor.
 * 
 * This job does not guarantee an immediate return when an interrupt is
 * received. The job does its best to clean up itself after an interrupt is
 * received, but it is up to the delegating runnable to handle such interrupts
 * in an appropriate time.
 * 
 * The purpose of this job is to ensure that a workflow exists to return as fast
 * as possible when a progress monitor is canceled. This class is most useful
 * for tasks that may block for a duration and may not have an opportunity to
 * check for interrupts or a canceled flag. This job will segregate those
 * threads into the background and clean them up in time, but primarily to
 * ensure the fast return time upon cancelation.
 * 
 * Proper use of this job is as follows:
 * 
 * BarrierProgressWaitJob j = new BarrierProgressWaitJob(name, runnable);
 * j.schedule(); // This join will also poll the provided monitor for
 * cancelations j.monitorSafeJoin(monitor); if( j.getReturnValue() != null)
 * return (ReturnType)j.getReturnValue();
 *
 * This job guarantees that a call to monitorSafeJoin() will return within 200ms
 * of a cancelation in the progress monitor, or immediately upon the completion
 * of the delegate runnable's execution, whichever comes first.
 * 
 * In the event that a cancelation is registered, and the delegate runnable
 * completes within the 200 ms, the Job may be recognized as both canceled and
 * still have a valid return value from the delegate runnable. Clients should
 * decide whether they wish to prioritize their logic for a canceled call, or
 * use the return value.
 * 
 * TODO: REMOVE THIS CLASS once we move to a higher version of the JBTIS TP. The
 * actual class is org.jboss.tools.foundation.core.jobs.BarrierProgressWaitJob
 * and we should be using that in anything Luna or higher
 */
public class BarrierProgressWaitJob extends Job {

    /**
     * An interface for use with this job type.
     */
    public interface IRunnableWithProgress {

        /**
         * Run the given runnable and hold the return value for inspection
         * later.
         * 
         * @param monitor Incoming progress monitor
         * @return Object outgoing object
         * @throws Exception exception thrown
         */
        public Object run(IProgressMonitor monitor) throws Exception;
        
    }

    private IRunnableWithProgress _runnable;
    private Object[] _barrier;
    private boolean _throwableCaught = false;

    /**
     * Constructor.
     * @param name Job name
     * @param runnable incoming runnable
     */
    public BarrierProgressWaitJob(String name, IRunnableWithProgress runnable) {
        super(name);
        setSystem(true);
        this._runnable = runnable;
        _barrier = new Object[1];
    }

    /* (non-Javadoc)
     * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
     * @param monitor Incoming monitor
     * @return IStatus status to return
     */
    protected IStatus run(IProgressMonitor monitor) {
        try {
            Object ret = _runnable.run(monitor);
            synchronized (_barrier) {
                _barrier[0] = ret;
                _barrier.notify();
                return Status.OK_STATUS;
            }
        } catch (Exception e) {
            this._throwableCaught = true;
            synchronized (_barrier) {
                _barrier.notify();
                _barrier[0] = e;
                return Status.OK_STATUS;
            }
        }
    }

    /**
     * While the Job is running and doing the work, ensure that the progress
     * monitor provided as a parameter is respected when canceled.
     * 
     * This method effectively waits for either the Job to complete, or for the
     * provided progress monitor to be canceled. In the event of the latter,
     * 
     * This method guarantees a return time equal to that of the delegate
     * method, or, a return within 200 ms of the progress monitor being canceled
     * 
     * @param monitor Incoming monitor
     */
    public void monitorSafeJoin(IProgressMonitor monitor) {
        // Since we're waiting for the barrier OR the monitor,
        // we must wait only for small intervals, then check the monitor, then
        // loop. This ensures that if the monitor is canceled, we respond within 200
        // ms.
        boolean done = false;
        while (!done) {
            synchronized (_barrier) {
                try {
                    _barrier.wait(200);
                } catch (InterruptedException e) {
                    // ignore
                    e.printStackTrace();
                }
                if (_barrier[0] != null || monitor.isCanceled()) {
                    done = true;
                }
            }
        }
        // If this monitor is canceled, cancel the job immediately
        if (monitor.isCanceled()) {
            cancel();
        }
    }

    /**
     * This job has been set to canceled. Interrupt the thread doing the work.
     */
    protected void canceling() {
        getThread().interrupt();
    }

    /**
     * Get any throwable which may have been caught during execution.
     * 
     * @return Throwable any exception
     */
    public Throwable getThrowable() {
        if (_throwableCaught && _barrier[0] instanceof Throwable) {
            return (Exception) _barrier[0];
        }
        return null;
    }

    /**
     * Get the return value of the delegate runnable.
     * 
     * @return Object the outgoing value
     */
    public Object getReturnValue() {
        return _throwableCaught ? null : _barrier[0];
    }
}
