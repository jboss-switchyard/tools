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
 * SwitchYardExchangeContractVariable
 * <p/>
 * A variable representing a SwitchYard ExchangeContract.
 */
public class SwitchYardExchangeContractVariable extends SimpleInterfaceVariable {

    protected static final String TYPE = "org.switchyard.metadata.ExchangeContract";

    /**
     * @param source the source value
     * @return a new object wrapping the supplied source
     */
    public static IValue newValue(IJavaObject source) {
        return new SwitchYardExchangeContractValue(source);
    }

    /**
     * Create a new SwitchYardExchangeContractVariable.
     * 
     * @param underlyingObject the underlying Exchange object.
     */
    public SwitchYardExchangeContractVariable(IJavaObject underlyingObject) {
        super(underlyingObject, "Contract", TYPE, true);
    }

    private static final class SwitchYardExchangeContractValue extends JavaInterfaceValue {

        private IVariable[] _variables;

        private SwitchYardExchangeContractValue(IJavaObject delegate) {
            super(delegate);
        }

        @Override
        public IVariable[] getVariables() throws DebugException {
            if (_variables == null) {
                final List<IVariable> variables = new ArrayList<IVariable>();
                variables
                        .add(new SwitchYardServiceOperationVariable((IJavaObject) getDelegate(), "Consumer Operation"));
                variables
                        .add(new SwitchYardServiceOperationVariable((IJavaObject) getDelegate(), "Provider Operation"));
                _variables = variables.toArray(new IVariable[variables.size()]);
            }
            return _variables;
        }
    }
}
