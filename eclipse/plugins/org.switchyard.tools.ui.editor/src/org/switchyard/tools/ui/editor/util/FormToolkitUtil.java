/******************************************************************************* 
 * Copyright (c) 2015 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package org.switchyard.tools.ui.editor.util;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.FormColors;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * Handles some weirdness with linux borders and SWT.
 * @author brianf
 *
 */
public final class FormToolkitUtil {
    
    /*
     * Empty constructor. 
     */
    private FormToolkitUtil() {
        // empty
    }

    /**
     * Gets a properly set up toolkit with borders.
     * @return updated Toolkit
     */
    public static FormToolkit getFormToolkit() {
        FormColors colors = new FormColors(Display.getCurrent());
        colors.setBackground(null);
        colors.setForeground(null);
        FormToolkit toolkit = new FormToolkit(colors);
        if (toolkit.getBorderStyle() == SWT.NULL) {
            toolkit.setBorderStyle(SWT.BORDER);
        }
        return toolkit;
    }
    
    /**
     * Updates the toolkit passed-in to adjust the border setting.
     * @param toolkit incoming toolkit.
     */
    public static void updateFormToolkit(FormToolkit toolkit) {
        if (toolkit.getBorderStyle() == SWT.NULL) {
            toolkit.setBorderStyle(SWT.BORDER);
        }
    }

}
