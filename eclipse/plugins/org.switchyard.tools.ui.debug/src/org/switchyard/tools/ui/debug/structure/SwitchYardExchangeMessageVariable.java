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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.jdt.debug.core.IJavaClassType;
import org.eclipse.jdt.debug.core.IJavaInterfaceType;
import org.eclipse.jdt.debug.core.IJavaObject;
import org.eclipse.jdt.debug.core.IJavaType;
import org.eclipse.jdt.debug.core.IJavaValue;
import org.eclipse.jdt.internal.debug.core.logicalstructures.JavaLogicalStructure;

/**
 * SwitchYardExchangeMessageVariable
 * <p/>
 * Root variable for SwitchYard view, when only a Message is available (i.e. no
 * Exchange). This variable adds the Exchange as a child of the message
 * variable, if one is available.
 */
@SuppressWarnings("restriction")
public class SwitchYardExchangeMessageVariable extends JavaInterfaceVariable {

    protected static final String TYPE = "org.switchyard.Message";

    /**
     * Create a new SwitchYardExchangeMessageVariable.
     * 
     * @param underlyingObject the underlying Exchange object.
     */
    public SwitchYardExchangeMessageVariable(IJavaObject underlyingObject) {
        super(underlyingObject, "Message", null, null, TYPE);
    }

    @Override
    protected IValue wrapJavaValue(IJavaValue actualValue) {
        return new SwitchYardExchangeValue((IJavaObject) actualValue);
    }

    private static final class SwitchYardExchangeValue extends JavaInterfaceValue {

        private IVariable[] _variables;

        private SwitchYardExchangeValue(IJavaObject delegate) {
            super(delegate);
        }

        @Override
        public IVariable[] getVariables() throws DebugException {
            if (_variables == null) {
                final List<IVariable> variables = new ArrayList<IVariable>();
                variables.add(new SwitchYardMessageVariable((IJavaObject) getDelegate()) {
                    @Override
                    protected IJavaValue getRawValue() throws CoreException {
                        return getUnderlyingObject();
                    }
                });
                if (isCamelMessage(getDelegate().getJavaType())) {
                    variables.add(new SwitchYardCamelExchangeVariable((IJavaObject) getDelegate()) {
                        @Override
                        protected IJavaValue getRawValue() throws CoreException {
                            return (IJavaValue) new JavaLogicalStructure(getUnderlyingObject().getReferenceTypeName(),
                                    true, "new org.switchyard.bus.camel.CamelExchange(getExchange())", null, null)
                                    .getLogicalStructure(getUnderlyingObject());
                        }
                    });
                }
                _variables = variables.toArray(new IVariable[variables.size()]);
            }
            return _variables;
        }

        private boolean isCamelMessage(IJavaType javaType) throws DebugException {
            if (javaType instanceof IJavaClassType) {
                for (IJavaInterfaceType intf : ((IJavaClassType) javaType).getAllInterfaces()) {
                    if ("org.apache.camel.Message".equals(intf.getName())) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
