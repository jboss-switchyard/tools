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
 * Integer validator which errors if not empty
 * and value is not a valid Integer.
 */
public class IntegerValidator extends AbstractValidator {

    /**
     * Constructor.
     * @param message Message to display (or null)
     */
    public IntegerValidator(String message) {
        super(message);
    }
    
    @Override
    public IStatus validate(Object value) {
        if (value != null) {
            if (value instanceof Integer) {
                return Status.OK_STATUS;
            } else if (value instanceof String) {
                return new Status(Status.ERROR, Activator.PLUGIN_ID, getMessage());
            }
        }
        return Status.OK_STATUS;
    }
}

