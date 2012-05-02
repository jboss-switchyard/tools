/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
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

import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.ui.PlatformUI;

/**
 * @author bfitzpat
 *
 */
public final class CalculateUtil {
    
    private CalculateUtil(){
        // empty
    }
    
    private static class CalculateRunnable implements Runnable {
        private final String _text;
        private final Font _font;
        private IDimension _dimension;

        /**
         * @param text string for actual text
         * @param font font for text
         */
        public CalculateRunnable(String text, Font font) {
            this._text = text;
            this._font = font;
        }

        @Override
        public void run() {
            _dimension = GraphitiUi.getUiLayoutService().calculateTextSize(_text, _font);
        }

        /**
         * @return
         */
        public IDimension getDimension() {
            return _dimension;
        }
    }

    /**
     * @param text string of text
     * @param font font for text
     * @return dimensions for text
     */
    public static IDimension calculateTextSize(String text, Font font) {
        CalculateRunnable runnable = new CalculateRunnable(text, font);

        PlatformUI.getWorkbench().getDisplay().syncExec(runnable);

        return runnable.getDimension();
    }
}
