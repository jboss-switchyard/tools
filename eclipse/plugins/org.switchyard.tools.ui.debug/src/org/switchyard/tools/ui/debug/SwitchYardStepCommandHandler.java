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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.jdt.debug.core.IJavaStackFrame;
import org.eclipse.jdt.debug.core.IJavaThread;

/**
 * SwitchYardStepCommandHandler
 * <p/>
 * Command handler for SwitchYard system bus "step".
 */
public class SwitchYardStepCommandHandler extends AbstractHandler implements IHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        final IAdaptable adaptable = DebugUITools.getDebugContext();
        final IStackFrame stackFrame = (IStackFrame) DebugPlugin.getAdapter(adaptable, IStackFrame.class);
        if (stackFrame == null || !stackFrame.isSuspended()) {
            return null;
        }
        final IThread thread = stackFrame.getThread();
        if (thread instanceof IJavaThread) {
            try {
                new SwitchYardStepHandler((IJavaThread) thread).step();
            } catch (CoreException e) {
                throw new ExecutionException("Error initializing breakpoints for step.", e);
            }
        }
        return null;
    }

    @Override
    public boolean isEnabled() {
        final IAdaptable adaptable = DebugUITools.getDebugContext();
        final IStackFrame stackFrame = (IStackFrame) DebugPlugin.getAdapter(adaptable, IStackFrame.class);
        return stackFrame != null && stackFrame instanceof IJavaStackFrame && stackFrame.isSuspended()
                && switchYardCode(stackFrame);
    }

    private boolean switchYardCode(IStackFrame stackFrame) {
        try {
            boolean hasSwitchYardCode = false;
            for (IStackFrame frame : stackFrame.getThread().getStackFrames()) {
                final String typeName = ((IJavaStackFrame) frame).getReferenceType().getName();
                if (typeName == null) {
                    continue;
                }
                /*
                 * if it's switchyard code, but not the last processor, it's ok
                 * to enable.
                 */
                if ("org.switchyard.bus.camel.processors.ConsumerCallbackProcessor".equals(typeName)) {
                    return false;
                } else if (typeName.startsWith("org.switchyard.")) {
                    hasSwitchYardCode = true;
                }
            }
            return hasSwitchYardCode;
        } catch (DebugException e) {
            return false;
        }
    }

}
