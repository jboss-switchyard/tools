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

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.switchyard.tools.ui.editor.Activator;

/**
 * RegexValidator
 * <p/>
 * Validates text for valid regular expression.
 */
public class RegexValidator implements IValidator {

    @Override
    public IStatus validate(Object value) {
        if (value == null || ((String) value).trim().isEmpty()) {
            return Status.OK_STATUS;
        }
        try {
            Pattern.compile((String) value);
        } catch (PatternSyntaxException exception) {
            return new Status(Status.ERROR, Activator.PLUGIN_ID, exception.getLocalizedMessage());
        }
        return Status.OK_STATUS;
    }

}
