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

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.switchyard.tools.ui.editor.Activator;

/**
 * Validator which errors if String value is null or empty.
 * 
 * @author bfitzpat
 */
public class StringEmptyValidator implements IValidator {

    private final String _message;
    private int _statusLevel = Status.ERROR;

    /**
     * Constructor.
     * 
     * @param message Validation message
     */
    public StringEmptyValidator(String message) {
        _message = message;
    }
    
    /**
     * Constructor.
     * 
     * @param message Validation message
     * @param level Status level - either Status.ERROR or Status.WARNING
     */
    public StringEmptyValidator(String message, int level) {
        this(message);
        _statusLevel = level;
    }

    @Override
    public IStatus validate(Object value) {
        if (value == null) {
            return new Status(_statusLevel, Activator.PLUGIN_ID, _message);
        }
        if (value instanceof String) {
            String s = (String) value;
            if (!s.trim().isEmpty()) {
                return Status.OK_STATUS;
            } else {
                return new Status(_statusLevel, Activator.PLUGIN_ID, _message);
            }
        }
        // if it's not a string, then ignore it
        return Status.OK_STATUS;
    }
}
