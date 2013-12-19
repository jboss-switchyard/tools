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
import org.eclipse.jdt.debug.core.IJavaObject;

/**
 * SwitchYardServiceDomainVariable
 * <p/>
 * A variable representing a SwitchYard service domain.
 */
public class SwitchYardServiceDomainVariable extends SimpleInterfaceVariable {

    protected static final String TYPE = "org.switchyard.ServiceDomain";

    /**
     * @param source the source value
     * @return a new object wrapping the supplied source
     * @throws CoreException if something goes awry
     */
    public static IValue newValue(IJavaObject source) throws CoreException {
        return new SwitchYardServiceDomainValue(source);
    }

    /**
     * Create a new SwitchYardServiceDomainVariable.
     * 
     * @param underlyingObject the underlying Exchange object.
     */
    public SwitchYardServiceDomainVariable(IJavaObject underlyingObject) {
        super(
                underlyingObject,
                "Domain",
                "getConsumer() == null ? getProvider() == null ? null : getProvider().getDomain() : getConsumer().getDomain()",
                null, TYPE);
    }

    private static final class SwitchYardServiceDomainValue extends JavaInterfaceValue {

        private IVariable[] _variables;

        private SwitchYardServiceDomainValue(IJavaObject delegate) {
            super(delegate);
        }

        @Override
        public IVariable[] getVariables() throws DebugException {
            if (_variables == null) {
                final List<IVariable> variables = new ArrayList<IVariable>();
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Name",
                        "javax.xml.namespace.QName", true));
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Services",
                        "java.util.List<org.switchyard.Service>", true));
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Properties",
                        "java.util.Map<java.lang.String,java.lang.Object>", true));
                _variables = variables.toArray(new IVariable[variables.size()]);
            }
            return _variables;
        }
    }
}
