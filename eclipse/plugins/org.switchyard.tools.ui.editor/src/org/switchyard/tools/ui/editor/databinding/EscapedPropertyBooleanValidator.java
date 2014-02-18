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
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.databinding;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.switchyard.tools.ui.editor.Activator;

/**
 * PropInteger validator which errors if property strings are not formatted correctly
 * and value is not a valid BigInteger.
 */
public class EscapedPropertyBooleanValidator extends EscapedPropertyValidator {

    /**
     * Constructor.
     * @param message Message to display (or null)
     */
    public EscapedPropertyBooleanValidator(String message) {
        super(message);
    }
    
    @Override
    public IStatus validate(Object value) {
        if (value != null) {
            if (value instanceof Boolean) {
                return Status.OK_STATUS;
            } else if (value instanceof String) {
                String s = (String) value;
                if (s.equalsIgnoreCase("true") || s.equalsIgnoreCase("false")) {
                    return Status.OK_STATUS;
                } else {
                    return validEscapedPropertyString(value);
                }
            } else {
                if (getMessage() != null) {
                    return new Status(Status.ERROR, Activator.PLUGIN_ID, getMessage());
                }
                return new Status(Status.ERROR, Activator.PLUGIN_ID, MESSAGE);
            }
        }
        return Status.OK_STATUS;
    }
}

