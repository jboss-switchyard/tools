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

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.Messages;

/**
 * UrlSpacesValidator
 * <p/>
 * Validates url to make sure .
 */
public class URLValidator implements IValidator {

    private final String _message;

    /**
     * Constructor.
     * 
     * @param message Validation message
     */
    public URLValidator(String message) {
        _message = message;
    }

    @Override
    public IStatus validate(Object value) {
        String urlString = null;
        if (value != null && value instanceof String) {
            urlString = (String) value;
            if (urlString.trim().length() > 0) {
                if (urlString.trim().length() < urlString.length()) {
                    return new Status(Status.ERROR, 
                            Activator.PLUGIN_ID, Messages.error_spacesInUrl);
                }
                try {
                    new URL(urlString);
                } catch (MalformedURLException e) {
                    return new Status(Status.WARNING, 
                            Activator.PLUGIN_ID, _message + " (" + e.getLocalizedMessage() + ")");
                }
            }
        }
        return Status.OK_STATUS;
    }

}
