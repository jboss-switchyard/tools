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
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.switchyard.tools.ui.editor.Activator;

/**
 * Processes a list of validator, merging their status.
 */
public class CompoundValidator implements IValidator {
    private final IValidator[] _validators;

    /**
     * Constructor.
     * 
     * @param validators list of validators
     */
    public CompoundValidator(final IValidator... validators) {
        _validators = validators;
    }

    /**
     * @param value Value to be validated
     * @return merged status of all validators
     */
    public IStatus validate(final Object value) {
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
        for (IValidator validator : _validators) {
            result.merge(validator.validate(value));
        }
        return result.isOK() ? Status.OK_STATUS : result;
    }
}
