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

/**
 * BaseVariableGroup
 * <p/>
 * Represents a logical grouping of variables contained within the parent
 * variable.
 */
public abstract class BaseVariableGroup extends JavaInterfaceVariable {

    /**
     * Create a new BaseVariableGroup.
     * 
     * @param underlyingObject the underlying object
     * @param groupName the name of this variable
     * @param valueType the type of value represented by this variable.
     */
    public BaseVariableGroup(IJavaObject underlyingObject, String groupName, String valueType) {
        super(underlyingObject, groupName, null, null, valueType);
    }

    protected abstract IValue wrapJavaValue(IJavaValue actualValue);

}
