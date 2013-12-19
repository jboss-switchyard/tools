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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.jdt.debug.core.IJavaObject;
import org.eclipse.jdt.debug.core.IJavaValue;
import org.eclipse.jdt.internal.debug.core.logicalstructures.JavaLogicalStructure;

/**
 * SwitchYardCamelExchangeVariable
 * <p/>
 * A variable representing a Camel exchange.
 */
@SuppressWarnings("restriction")
public class SwitchYardCamelExchangeVariable extends SwitchYardExchangeVariable {

    protected static final String TYPE = "org.apache.camel.Exchange";

    /**
     * @param source the source value
     * @return a new object wrapping the supplied source
     * @throws CoreException if something goes wrong
     */
    public static IValue newValue(IJavaObject source) throws CoreException {
        return SwitchYardExchangeVariable.newValue((IJavaObject) new JavaLogicalStructure(source.getReferenceTypeName(), true,
                "new org.switchyard.bus.camel.CamelExchange(this)", null, null)
                .getLogicalStructure(source));
    }

    /**
     * Create a new SwitchYardCamelExchangeVariable.
     * 
     * @param underlyingObject the underlying Exchange object.
     */
    public SwitchYardCamelExchangeVariable(IJavaObject underlyingObject) {
        super(underlyingObject);
    }

    @Override
    protected IJavaValue getRawValue() throws CoreException {
        return (IJavaValue) new JavaLogicalStructure(getUnderlyingObject().getReferenceTypeName(), true,
                "new org.switchyard.bus.camel.CamelExchange(this)", null, null)
                .getLogicalStructure(getUnderlyingObject());
    }

}
