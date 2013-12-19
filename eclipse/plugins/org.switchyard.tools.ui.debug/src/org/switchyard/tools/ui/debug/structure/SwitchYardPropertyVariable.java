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
 * SwitchYardPropertyVariable
 * <p/>
 * A variable representing a SwitchYard property.
 */
public class SwitchYardPropertyVariable extends SimpleInterfaceVariable {

    protected static final String TYPE = "org.switchyard.Property";

    /**
     * @param source the source value
     * @return a new object wrapping the supplied source
     */
    public static IValue newValue(IJavaObject source) {
        return new SwitchYardPropertyValue(source);
    }

    /**
     * Create a new SwitchYardPropertyVariable.
     * 
     * @param underlyingObject the underlying Exchange object.
     */
    public SwitchYardPropertyVariable(IJavaObject underlyingObject) {
        super(underlyingObject, "Property", null, null, TYPE);
    }

    private static final class SwitchYardPropertyValue extends JavaInterfaceValue {

        private IVariable[] _variables;

        private SwitchYardPropertyValue(IJavaObject delegate) {
            super(delegate);
        }

        @Override
        public IVariable[] getVariables() throws DebugException {
            if (_variables == null) {
                final List<IVariable> variables = new ArrayList<IVariable>();
                variables
                        .add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Name", "java.lang.String", true));
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Value", "java.lang.Object",
                        true));
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Scope", "org.switchyard.Scope",
                        true));
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Labels",
                        "java.util.Set<java.lang.String>", true));
                _variables = variables.toArray(new IVariable[variables.size()]);
            }
            return _variables;
        }
    }
}
