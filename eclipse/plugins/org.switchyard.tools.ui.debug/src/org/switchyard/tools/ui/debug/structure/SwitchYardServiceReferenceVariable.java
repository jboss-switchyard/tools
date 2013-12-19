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
 * SwitchYardServiceReferenceVariable
 * <p/>
 * A variable representing a SwitchYard service reference.
 */
public class SwitchYardServiceReferenceVariable extends SimpleInterfaceVariable {

    protected static final String TYPE = "org.switchyard.ServiceReference";

    /**
     * @param source the source value
     * @return a new object wrapping the supplied source
     */
    public static IValue newValue(IJavaObject source) {
        return new SwitchYardServiceReferenceValue(source);
    }

    /**
     * Create a new SwitchYardServiceReferenceVariable.
     * 
     * @param underlyingObject the underlying Exchange object.
     */
    public SwitchYardServiceReferenceVariable(IJavaObject underlyingObject) {
        super(underlyingObject, "Consumer", TYPE, true);
    }

    private static final class SwitchYardServiceReferenceValue extends JavaInterfaceValue {

        private IVariable[] _variables;

        private SwitchYardServiceReferenceValue(IJavaObject delegate) {
            super(delegate);
        }

        @Override
        public IVariable[] getVariables() throws DebugException {
            if (_variables == null) {
                final List<IVariable> variables = new ArrayList<IVariable>();
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Name",
                        "javax.xml.namespace.QName", true));
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Target Service Name",
                        "javax.xml.namespace.QName", true));
                variables.add(new SwitchYardServiceInterfaceVariable((IJavaObject) getDelegate()));
                variables.add(new SwitchYardServiceMetadataVariable((IJavaObject) getDelegate()));
                _variables = variables.toArray(new IVariable[variables.size()]);
            }
            return _variables;
        }
    }
}
