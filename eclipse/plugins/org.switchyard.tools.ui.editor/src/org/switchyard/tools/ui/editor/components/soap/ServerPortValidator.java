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
package org.switchyard.tools.ui.editor.components.soap;

import java.util.regex.Pattern;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.databinding.EscapedPropertyValidator;

/**
 * Property validator which checks for [hostname]:[port] format of the Server Port.
 * Valid values include 
 * 1234
 * :1234
 * host:1234
 * ${propValue}
 * :${propValue}
 * host:${propValue}
 * null
 */
public class ServerPortValidator extends EscapedPropertyValidator {

    /**
     * Constructor.
     * @param message Message to display (or null)
     */
    public ServerPortValidator(String message) {
        super(message);
    }

    @Override
    public IStatus validate(Object value) {
        if (value != null) {
            if (value instanceof String) {
                String strValue = (String) value;
                IStatus isEscapedProperty = validEscapedPropertyString(strValue);
                Pattern numberStartsWithColon = Pattern.compile("[^:]*:\\d+"); 
                if (numberStartsWithColon.matcher(strValue).matches()) {
                    return Status.OK_STATUS;
                } else if (isEscapedProperty.equals(Status.OK_STATUS)) {
                    // ${escapedProperty}:${escapedProperty}
                    Pattern pattern2 = Pattern.compile("^?\\$\\{.+\\}$:?\\$\\{.+\\}$");
                    if (pattern2.matcher(strValue).matches()) {
                        return Status.OK_STATUS;
                    }
                    // {host}:${escapedProperty}
                    Pattern pattern3 = Pattern.compile("^.*:?\\$\\{.+\\}$");
                    if (pattern3.matcher(strValue).matches()) {
                        return Status.OK_STATUS;
                    }
                    // ${escapedProperty}:{portNumber}
                    Pattern pattern4 = Pattern.compile("^?\\$\\{.+\\}:\\d+$");
                    if (pattern4.matcher(strValue).matches()) {
                        return Status.OK_STATUS;
                    }
                    // anything else, we have issues
                    if (getMessage() != null) {
                        return new Status(Status.WARNING, Activator.PLUGIN_ID, getMessage());
                    }
                    return new Status(Status.WARNING, Activator.PLUGIN_ID, MESSAGE);
                } else if (!isEscapedProperty.equals(Status.OK_STATUS)) {
                    return isEscapedProperty;
                }
            } else {
                if (getMessage() != null) {
                    return new Status(Status.WARNING, Activator.PLUGIN_ID, getMessage());
                }
                return new Status(Status.WARNING, Activator.PLUGIN_ID, MESSAGE);
            }
        }
        return Status.OK_STATUS;
    }

}
