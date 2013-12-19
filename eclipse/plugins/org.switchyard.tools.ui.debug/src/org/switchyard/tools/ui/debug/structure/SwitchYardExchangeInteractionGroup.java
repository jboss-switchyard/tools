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
import org.eclipse.jdt.debug.core.IJavaValue;

/**
 * SwitchYardTransactionSettingsGroup
 * <p/>
 * Contains interaction details for the current SwitchYard exchange.
 */
public class SwitchYardExchangeInteractionGroup extends BaseVariableGroup {

    /**
     * Create a new SwitchYardTransactionSettingsGroup.
     * 
     * @param underlyingObject the Exchange value.
     */
    public SwitchYardExchangeInteractionGroup(IJavaObject underlyingObject) {
        super(underlyingObject, "Interaction Details", SwitchYardExchangeVariable.TYPE);
    }

    @Override
    protected IValue wrapJavaValue(IJavaValue actualValue) {
        return new SwitchYardExchangeInteractionValue((IJavaObject) actualValue);
    }

    private static final class SwitchYardExchangeInteractionValue extends JavaInterfaceValue {

        private IVariable[] _variables;

        private SwitchYardExchangeInteractionValue(IJavaObject delegate) {
            super(delegate);
        }

        @Override
        public String getValueString() throws DebugException {
            return "";
        }

        @Override
        public IVariable[] getVariables() throws DebugException {
            if (_variables == null) {
                final List<IVariable> variables = new ArrayList<IVariable>();
                variables.add(new SwitchYardServiceReferenceVariable((IJavaObject) getDelegate()));
                variables.add(new SwitchYardServiceVariable((IJavaObject) getDelegate()));
                variables.add(new SwitchYardExchangeContractVariable((IJavaObject) getDelegate()));
                _variables = variables.toArray(new IVariable[variables.size()]);
            }
            return _variables;
        }
    }
}
