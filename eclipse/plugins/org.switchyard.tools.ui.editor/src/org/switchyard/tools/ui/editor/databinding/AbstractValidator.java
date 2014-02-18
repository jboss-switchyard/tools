/******************************************************************************* 
 * Copyright (c) 2014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package org.switchyard.tools.ui.editor.databinding;

import org.eclipse.core.databinding.validation.IValidator;

/**
 * Base validator which stashes a message.
 */
public abstract class AbstractValidator implements IValidator {

    private final String _message;

    /**
     * Constructor.
     * 
     * @param message Validation message
     */
    public AbstractValidator(String message) {
        _message = message;
    }
    
    protected String getMessage() {
        return _message;
    }

}
