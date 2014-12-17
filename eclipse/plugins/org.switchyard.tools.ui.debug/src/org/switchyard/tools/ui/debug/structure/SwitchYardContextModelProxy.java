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
package org.switchyard.tools.ui.debug.structure;

import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.model.IDebugElement;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.ISuspendResume;
import org.eclipse.debug.internal.ui.viewers.model.provisional.IModelDelta;
import org.eclipse.debug.internal.ui.viewers.model.provisional.ModelDelta;
import org.eclipse.debug.internal.ui.viewers.update.DebugEventHandler;
import org.eclipse.debug.internal.ui.viewers.update.EventHandlerModelProxy;
import org.eclipse.jdt.debug.core.IJavaStackFrame;
import org.eclipse.jface.viewers.Viewer;

/**
 * SwitchYardContextModelProxy
 * <p/>
 * IModelProxy implementation for SwitchYardContext.
 */
@SuppressWarnings("restriction")
public class SwitchYardContextModelProxy extends EventHandlerModelProxy {

    private final SwitchYardContext _context;

    /**
     * Create a new SwitchYardContextModelProxy.
     * 
     * @param context the SwitchYardContext
     */
    public SwitchYardContextModelProxy(final SwitchYardContext context) {
        super();
        _context = context;
    }

    @Override
    public void installed(Viewer viewer) {
        super.installed(viewer);
//        ModelDelta delta = new ModelDelta(_context, IModelDelta.CONTENT);
//        fireModelChanged(delta);
    }

    protected DebugEventHandler[] createEventHandlers() {
        return new DebugEventHandler[] {new DebugEventHandler(this) {
            protected boolean handlesEvent(DebugEvent event) {
                return true;
            }

            protected void refreshRoot(DebugEvent event) {
                if (event.getDetail() != DebugEvent.EVALUATION_IMPLICIT) {
                    // Don't refresh everytime an implicit evaluation finishes
                    if (event.getSource() instanceof ISuspendResume) {
                        if (!((ISuspendResume) event.getSource()).isSuspended()) {
                            // no longer suspended
                            return;
                        }
                    }

                    final ModelDelta delta = new ModelDelta(_context.getAdapter(IJavaStackFrame.class), IModelDelta.CONTENT);
                    fireDelta(delta);
                }
            }
        } };
    }

    @Override
    protected synchronized boolean containsEvent(DebugEvent event) {
        if (!isDisposed()) {
            Object source = event.getSource();
            if (source instanceof IDebugElement) {
                IDebugTarget debugTarget = ((IDebugElement) source).getDebugTarget();
                if (debugTarget != null) {
                    // a debug target can be null for an IExpression
                    return debugTarget.equals(_context.getDebugTarget());
                }
            }
        }
        return false;
    }

}
