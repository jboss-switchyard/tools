/******************************************************************************* 
 * Copyright (c) 2015 Red Hat, Inc. 
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

import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.swt.widgets.Control;

/**
 * @author brianf
 *
 */
public class StringEmptyControlAwareValidator extends StringEmptyValidator {
    private Control _control = null;
    
    /**
     * Validates only if the control is also enabled and visible.
     * @param message Message to use.
     * @param control Control to test.
     */
    public StringEmptyControlAwareValidator(String message, Control control) {
        super(message);
        _control = control;
    }
    
    @Override
    public IStatus validate(Object value) {
        if (_control != null) {
            if (!_control.isEnabled() || !_control.getParent().isEnabled()) {
                return ValidationStatus.ok();
            }
        }
        return super.validate(value);
    }

}
