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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.Messages;

/**
 * Validator which errors if property strings are not formatted correctly.
 * 
 * @author bfitzpat
 */
public class AbstractEscapedPropertyValidator implements IValidator {

    private static final Pattern INNER_DOLLAR_START_PATTERN = Pattern.compile("\\$\\{"); //$NON-NLS-1$
    private static final String MESSAGE = Messages.EscapedPropertyValidator_Must_Match_Escaped_Property_Pattern;
    private static final Pattern OUTER_CURLY_PATTERN = Pattern.compile("\\}"); //$NON-NLS-1$
    
    /**
     * Constructor.
     */
    public AbstractEscapedPropertyValidator() {
    }
    
    @Override
    public IStatus validate(Object value) {
        if (value instanceof String) {
            String s = (String) value;
            int leftSides = 0;
            Matcher idc_start_mat = INNER_DOLLAR_START_PATTERN.matcher(s);
            boolean foundSingle = idc_start_mat.find();
            while (foundSingle) {
                leftSides++;
                foundSingle = idc_start_mat.find(idc_start_mat.end());
            }
            
            int rightSides = 0;
            Matcher idc_end_mat = OUTER_CURLY_PATTERN.matcher(s);
            boolean foundOuter = idc_end_mat.find();
            while (foundOuter) {
                rightSides++;
                foundOuter = idc_end_mat.find(idc_end_mat.end());
            }
            
            if (leftSides == rightSides) {
                return Status.OK_STATUS;
            } else {
                return new Status(Status.ERROR, Activator.PLUGIN_ID, MESSAGE);
            }
        } else {
            throw new RuntimeException(
                    Messages.EscapedPropertyValidator_Only_Call_For_String_Data);
        }
    }
}

