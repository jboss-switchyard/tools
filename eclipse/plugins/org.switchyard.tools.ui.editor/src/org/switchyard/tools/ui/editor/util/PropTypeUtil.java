/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
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
package org.switchyard.tools.ui.editor.util;

import java.math.BigInteger;

/**
 * @author bfitzpat
 * 
 */
public final class PropTypeUtil {

    private PropTypeUtil() {
        // private constructor
    }
    
    /**
     * @param value Integer, String, Long, BigInteger, or Boolean
     * @return String value
     */
    public static String getPropValueString(Object value) {
        if (value != null) {
            if (value instanceof String) {
                return (String)value;
            } else if (value instanceof Integer) {
                return ((Integer)value).toString();
            } else if (value instanceof Long) {
                return ((Long)value).toString();
            } else if (value instanceof BigInteger) {
                return ((BigInteger)value).toString();
            } else if (value instanceof Boolean) {
                return ((Boolean)value).toString();
            }
        }
        return null;
    }
    
    /**
     * @param value Boolean
     * @return true/false
     */
    public static boolean getBooleanPropValue(Object value) {
        if (value != null && value instanceof Boolean) {
            return ((Boolean)value).booleanValue();
        }
        return false;
    }
        
}
