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
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.debug.core.IJavaObject;

/**
 * SwitchYardMessageVariable
 * <p/>
 * A variable representing a SwitchYard message.
 */
public class SwitchYardMessageVariable extends SimpleInterfaceVariable {

    protected static final String TYPE = "org.switchyard.Message";

    /**
     * @param source the source value
     * @return a new object wrapping the supplied source
     */
    public static IValue newValue(IJavaObject source) {
        return new SwitchYardMessageValue(source);
    }

    /**
     * Create a new SwitchYardMessageVariable.
     * 
     * @param underlyingObject the underlying Exchange object.
     */
    public SwitchYardMessageVariable(IJavaObject underlyingObject) {
        super(underlyingObject, "Message", TYPE, true);
    }

    private static final class SwitchYardMessageValue extends JavaInterfaceValue {

        private IVariable[] _variables;

        private SwitchYardMessageValue(IJavaObject delegate) {
            super(delegate);
        }

        @Override
        public IVariable[] getVariables() throws DebugException {
            if (_variables == null) {
                final List<IVariable> variables = new ArrayList<IVariable>();
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Content", "java.lang.Object",
                        false) {
                    @Override
                    protected String getSetterMethodSignature() {
                        try {
                            return Signature.createMethodSignature(
                                    new String[] {Signature.createTypeSignature(getReferenceTypeName(), true) },
                                    Signature.createTypeSignature(TYPE, true)).replace('.', '/');
                        } catch (DebugException e) {
                            return super.getSetterMethodSignature();
                        }
                    }
                });
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Type",
                        "getContext().getPropertyValue(org.switchyard.Exchange.CONTENT_TYPE)", null,
                        "javax.xml.namespace.QName"));
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "ID",
                        "getContext().getPropertyValue(org.switchyard.Exchange.MESSAGE_ID)", null, "java.lang.String"));
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Relates To",
                        "getContext().getPropertyValue(org.switchyard.Exchange.RELATES_TO)", null, "java.lang.String"));
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Properties",
                        "getContext().getProperties(org.switchyard.Scope.MESSAGE)", null,
                        "java.util.Set<org.switchyard.Property>"));
                variables.add(new SimpleInterfaceVariable((IJavaObject) getDelegate(), "Attachments",
                        "getAttachmentMap()", null, "java.util.Map<java.lang.String,javax.activation.DataSource>"));
                _variables = variables.toArray(new IVariable[variables.size()]);
            }
            return _variables;
        }
    }
}
