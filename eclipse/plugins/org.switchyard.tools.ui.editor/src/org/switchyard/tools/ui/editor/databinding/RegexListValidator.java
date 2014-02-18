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

import java.util.StringTokenizer;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.switchyard.tools.ui.editor.Activator;

/**
 * RegexListValidator
 * <p/>
 * Validates text for valid comma separated list of regular expressions.
 */
public class RegexListValidator implements IValidator {

    private static final RegexValidator VALIDATOR = new RegexValidator();

    @Override
    public IStatus validate(Object value) {
        if (value == null || ((String) value).trim().isEmpty()) {
            return Status.OK_STATUS;
        }
        final MultiStatus result = new MultiStatus(Activator.PLUGIN_ID, 0, "", null) {
            @Override
            public void add(IStatus status) {
                // update the message to the most severe
                if (status.getSeverity() > getSeverity()) {
                    setMessage(status.getMessage() != null ? status.getMessage() : "");
                }
                super.add(status);
            }
        };
        for (StringTokenizer st = new StringTokenizer((String) value, ","); st.hasMoreTokens();) {
            result.merge(VALIDATOR.validate(st.nextToken()));
        }
        return result.isOK() ? Status.OK_STATUS : result;
    }

}
