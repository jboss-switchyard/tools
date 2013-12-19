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
 * SwitchYardPolicyVariable
 * <p/>
 * A variable representing a SwitchYard policy.
 */
public class SwitchYardPolicyVariable extends SimpleInterfaceVariable {

    protected static final String TYPE = "org.switchyard.policy.Policy";

    /**
     * @param source the source value
     * @return a new object wrapping the supplied source
     */
    public static IValue newValue(IJavaObject source) {
        return new SwitchYardPolicyValue(source);
    }

    /**
     * Create a new SwitchYardPolicyVariable.
     * 
     * @param underlyingObject the underlying Exchange object.
     * @param variableName the name of this value
     */
    public SwitchYardPolicyVariable(IJavaObject underlyingObject, String variableName) {
        super(underlyingObject, variableName, null, null, TYPE);
    }

    private static final class SwitchYardPolicyValue extends JavaInterfaceValue {

        private IVariable[] _variables;

        private SwitchYardPolicyValue(IJavaObject delegate) {
            super(delegate);
        }

        @Override
        public IVariable[] getVariables() throws DebugException {
            if (_variables == null) {
                final List<IVariable> variables = new ArrayList<IVariable>();
                variables
                        .add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Name", "java.lang.String", true));
                variables.add(new SwitchYardPolicyVariable((IJavaObject) getDelegate(), "Policy Dependency"));
                _variables = variables.toArray(new IVariable[variables.size()]);
            }
            return _variables;
        }
    }
}
