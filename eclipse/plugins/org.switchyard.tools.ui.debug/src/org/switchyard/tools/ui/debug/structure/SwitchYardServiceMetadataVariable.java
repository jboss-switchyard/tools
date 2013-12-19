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
 * SwitchYardServiceMetadataVariable
 * <p/>
 * A variable representing a SwitchYard service's metadata.
 */
public class SwitchYardServiceMetadataVariable extends SimpleInterfaceVariable {

    protected static final String TYPE = "org.switchyard.ServiceMetadata";

    /**
     * @param source the source value
     * @return a new object wrapping the supplied source
     */
    public static IValue newValue(IJavaObject source) {
        return new SwitchYardServiceMetaDataValue(source);
    }

    /**
     * Create a new SwitchYardServiceMetadataVariable.
     * 
     * @param underlyingObject the underlying Exchange object.
     */
    public SwitchYardServiceMetadataVariable(IJavaObject underlyingObject) {
        super(underlyingObject, "Service Metadata", TYPE, true);
    }

    private static final class SwitchYardServiceMetaDataValue extends JavaInterfaceValue {

        private IVariable[] _variables;

        private SwitchYardServiceMetaDataValue(IJavaObject delegate) {
            super(delegate);
        }

        @Override
        public IVariable[] getVariables() throws DebugException {
            if (_variables == null) {
                final List<IVariable> variables = new ArrayList<IVariable>();
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Required Policies",
                        "java.util.List<org.switchyard.policy.Policy>", true));
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Provided Policies",
                        "java.util.List<org.switchyard.policy.Policy>", true));
                variables.add(new SwitchYardServiceSecurityVariable((IJavaObject) getDelegate()));
                variables.add(new SwitchYardThrottlingVariable((IJavaObject) getDelegate()));
                _variables = variables.toArray(new IVariable[variables.size()]);
            }
            return _variables;
        }
    }
}
