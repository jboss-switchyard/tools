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
package org.switchyard.tools.ui.editor.databinding;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.switchyard.tools.ui.editor.Activator;

/**
 * Validator which errors if value is null.
 */
public class RequiredValidator implements IValidator {

    private final String _message;

    /**
     * Constructor.
     * 
     * @param message Validation message
     */
    public RequiredValidator(String message) {
        _message = message;
    }

    @Override
    public IStatus validate(Object value) {
        if (value == null) {
            return new Status(Status.ERROR, Activator.PLUGIN_ID, _message);
        }
        return Status.OK_STATUS;
    }
}
