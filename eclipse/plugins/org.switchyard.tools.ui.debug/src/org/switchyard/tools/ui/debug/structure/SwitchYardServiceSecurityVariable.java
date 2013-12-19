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
 * SwitchYardServiceSecurityVariable
 * <p/>
 * A variable representing a SwitchYard service's security metadata.
 */
public class SwitchYardServiceSecurityVariable extends SimpleInterfaceVariable {

    protected static final String TYPE = "org.switchyard.ServiceSecurity";

    /**
     * @param source the source value
     * @return a new object wrapping the supplied source
     */
    public static IValue newValue(IJavaObject source) {
        return new SwitchYardServiceSecurityValue(source);
    }

    /**
     * Create a new SwitchYardServiceSecurityVariable.
     * 
     * @param underlyingObject the underlying Exchange object.
     */
    public SwitchYardServiceSecurityVariable(IJavaObject underlyingObject) {
        super(underlyingObject, "Security", TYPE, true);
    }

    private static final class SwitchYardServiceSecurityValue extends JavaInterfaceValue {

        private IVariable[] _variables;

        private SwitchYardServiceSecurityValue(IJavaObject delegate) {
            super(delegate);
        }

        @Override
        public IVariable[] getVariables() throws DebugException {
            if (_variables == null) {
                final List<IVariable> variables = new ArrayList<IVariable>();
                variables
                        .add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Name", "java.lang.String", true));
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Security Domain",
                        "java.lang.String", true));
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Run As", "java.lang.String",
                        true));
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Roles Allowed",
                        "java.collections.Set<java.lang.String>", true));
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Callback Handler",
                        "java.lang.String", true));
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Properties",
                        "java.collections.Map<java.lang.String,java.lang.String>", true));
                _variables = variables.toArray(new IVariable[variables.size()]);
            }
            return _variables;
        }
    }
}
