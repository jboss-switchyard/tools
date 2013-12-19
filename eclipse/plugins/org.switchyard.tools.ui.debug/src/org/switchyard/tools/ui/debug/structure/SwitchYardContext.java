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

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.jdt.debug.core.IJavaClassType;
import org.eclipse.jdt.debug.core.IJavaInterfaceType;
import org.eclipse.jdt.debug.core.IJavaObject;
import org.eclipse.jdt.debug.core.IJavaStackFrame;
import org.eclipse.jdt.debug.core.IJavaThread;
import org.eclipse.jdt.debug.core.IJavaType;
import org.eclipse.jdt.debug.core.IJavaVariable;
import org.switchyard.tools.ui.debug.SwitchYardDebugUtil;

/**
 * SwitchYardContext
 * <p/>
 * Converts a Java stack frame for use with SwitchYard debug model. This context
 * searches the stack frames on the thread for an Exchange or a Message.
 */
public class SwitchYardContext extends DebugElement implements IVariable {

    private final IJavaThread _delegate;
    private IVariable _switchYardVariable;

    /**
     * Create a new SwitchYardContext.
     * 
     * @param thread the source thread
     */
    public SwitchYardContext(IJavaThread thread) {
        super(thread.getDebugTarget());
        _delegate = thread;
    }

    @Override
    public String getModelIdentifier() {
        return SwitchYardDebugUtil.MODEL_IDENTIFIER;
    }

    @Override
    public IDebugTarget getDebugTarget() {
        return _delegate.getDebugTarget();
    }

    @Override
    public ILaunch getLaunch() {
        return _delegate.getLaunch();
    }

    /**
     * @return the thread to which this context is associated.
     */
    public IJavaThread getThread() {
        return _delegate;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public Object getAdapter(Class adapter) {
        if (adapter == IJavaStackFrame.class) {
            // hack to make this work with the jdt column provider factory
            try {
                return (IJavaStackFrame) getThread().getTopStackFrame();
            } catch (DebugException e) {
                return null;
            }
        }
        return super.getAdapter(adapter);
    }

    @Override
    public String getReferenceTypeName() throws DebugException {
        return "SwitchYard System Context";
    }

    @Override
    public void setValue(String expression) throws DebugException {
    }

    @Override
    public void setValue(IValue value) throws DebugException {
    }

    @Override
    public boolean supportsValueModification() {
        return false;
    }

    @Override
    public boolean verifyValue(String expression) throws DebugException {
        return false;
    }

    @Override
    public boolean verifyValue(IValue value) throws DebugException {
        return false;
    }

    @Override
    public String getName() throws DebugException {
        return "SwitchYard System Context";
    }

    @Override
    public boolean hasValueChanged() throws DebugException {
        return false;
    }

    @Override
    public IValue getValue() throws DebugException {
        if (_switchYardVariable == null) {
            for (IStackFrame frame : getThread().getStackFrames()) {
                for (IVariable variable : frame.getVariables()) {
                    if (!(variable instanceof IJavaVariable)) {
                        continue;
                    }
                    final IJavaType type = ((IJavaVariable) variable).getJavaType();
                    if (type instanceof IJavaClassType) {
                        for (IJavaInterfaceType iface : ((IJavaClassType) type).getAllInterfaces()) {
                            final String typeName = iface.getName();
                            if ("org.switchyard.Exchange".equals(typeName)) {
                                // SwitchYard exchange
                                _switchYardVariable = new SwitchYardExchangeVariable((IJavaObject) variable.getValue());
                                return _switchYardVariable.getValue();
                            } else if ("org.apache.camel.Exchange".equals(typeName)) {
                                // Camel exchange
                                _switchYardVariable = new SwitchYardCamelExchangeVariable(
                                        (IJavaObject) variable.getValue());
                                return _switchYardVariable.getValue();
                            } else if ("org.switchyard.Message".equals(typeName)) {
                                // SwitchYard message
                                _switchYardVariable = new SwitchYardExchangeMessageVariable(
                                        (IJavaObject) variable.getValue());
                                return _switchYardVariable.getValue();
                            }
                        }
                    } else if (type instanceof IJavaInterfaceType) {
                        if ("org.switchyard.Exchange".equals(((IJavaInterfaceType) type).getName())) {
                            // SwitchYard exchange
                            _switchYardVariable = new SwitchYardExchangeVariable((IJavaObject) variable.getValue());
                            return _switchYardVariable.getValue();
                        } else if ("org.apache.camel.Exchange".equals(((IJavaInterfaceType) type).getName())) {
                            // Camel exchange
                            _switchYardVariable = new SwitchYardCamelExchangeVariable((IJavaObject) variable.getValue());
                            return _switchYardVariable.getValue();
                        } else if ("org.switchyard.Message".equals(((IJavaInterfaceType) type).getName())) {
                            // SwitchYard message
                            _switchYardVariable = new SwitchYardExchangeMessageVariable(
                                    (IJavaObject) variable.getValue());
                            return _switchYardVariable.getValue();
                        }
                    }
                }
            }
        }
        if (_switchYardVariable == null) {
            return null;
        }
        return _switchYardVariable.getValue();
    }
}
