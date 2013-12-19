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

import org.eclipse.debug.core.model.IValue;
import org.eclipse.jdt.debug.core.IJavaObject;
import org.eclipse.jdt.debug.core.IJavaValue;
import org.eclipse.jdt.debug.core.JDIDebugModel;

/**
 * JavaInterfaceVariable
 * <p/>
 * Implements IJavaVariable by delegating to get/set methods on the parent
 * value.
 */
public class SimpleInterfaceVariable extends JavaInterfaceVariable {

    /**
     * Create a new JavaInterfaceVariable.
     * 
     * Delegates to the other constructor whereby the get expression is
     * <code>get&lt;variableName&gt;()</code> and setter method is
     * <code>set&lt;variableName&gt;</code>
     * 
     * @param underlyingObject the underlying object
     * @param variableName the name of this value
     * @param valueType the type of value represented by this variable; must
     *            match the parameter type of the setter method.
     * @param readOnly true if this is a read-only variable
     */
    public SimpleInterfaceVariable(final IJavaObject underlyingObject, final String variableName,
            final String valueType, final boolean readOnly) {
        super(underlyingObject, variableName, valueType, readOnly);
    }

    /**
     * Create a new JavaInterfaceVariable.
     * 
     * @param underlyingObject the underlying object
     * @param variableName the name of this value
     * @param getterExpression the expression used to get the value for this
     *            variable
     * @param setterMethod the method used to set the value for this variable;
     *            null indicates read-only
     * @param valueType the type of value represented by this variable; must
     *            match the parameter type of the setter method.
     */
    public SimpleInterfaceVariable(final IJavaObject underlyingObject, final String variableName,
            final String getterExpression, final String setterMethod, final String valueType) {
        super(underlyingObject, variableName, getterExpression, setterMethod, valueType);
    }

    protected IValue wrapJavaValue(IJavaValue actualValue) {
        return actualValue;
    }

    @Override
    public String getModelIdentifier() {
        return JDIDebugModel.getPluginIdentifier();
    }

}
