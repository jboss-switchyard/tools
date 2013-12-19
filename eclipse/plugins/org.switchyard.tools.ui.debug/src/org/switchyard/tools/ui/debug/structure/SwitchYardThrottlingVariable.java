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

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.jdt.debug.core.IJavaObject;

/**
 * SwitchYardThrottlingVariable
 * <p/>
 * A variable representing a SwitchYard service throttling details.
 */
public class SwitchYardThrottlingVariable extends SimpleInterfaceVariable {

    protected static final String TYPE = "org.switchyard.metadata.qos.Throttling";

    /**
     * @param source the source value
     * @return a new object wrapping the supplied source
     */
    public static IValue newValue(IJavaObject source) {
        return new SwitchYardThrottlingValue(source);
    }

    /**
     * Create a new SwitchYardThrottlingVariable.
     * 
     * @param underlyingObject the underlying Exchange object.
     */
    public SwitchYardThrottlingVariable(IJavaObject underlyingObject) {
        super(underlyingObject, "Throttling", TYPE, true);
    }

    private static final class SwitchYardThrottlingValue extends JavaInterfaceValue {

        private IVariable[] _variables;

        private SwitchYardThrottlingValue(IJavaObject delegate) {
            super(delegate);
        }

        @Override
        public IVariable[] getVariables() throws DebugException {
            if (_variables == null) {
                final List<IVariable> variables = new ArrayList<IVariable>();
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Max Requests", "int", true));
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Time Period", "long", true));
                _variables = variables.toArray(new IVariable[variables.size()]);
            }
            return _variables;
        }
    }
}
