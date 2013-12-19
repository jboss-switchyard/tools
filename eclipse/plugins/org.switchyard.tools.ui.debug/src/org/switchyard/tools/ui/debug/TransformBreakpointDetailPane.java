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
 ******************************************************************************/
package org.switchyard.tools.ui.debug;

import org.eclipse.jdt.internal.debug.ui.breakpoints.AbstractDetailPane;
import org.eclipse.jdt.internal.debug.ui.breakpoints.AbstractJavaBreakpointEditor;
import org.eclipse.swt.widgets.Composite;

/**
 * TransformBreakpointDetailPane
 * <p/>
 * Detail pane for SwitchYard transform breakpoints.
 */
@SuppressWarnings("restriction")
public class TransformBreakpointDetailPane extends AbstractDetailPane {

    /** The ID for this detail pane. */
    public static final String ID = TransformBreakpointDetailPane.class.getCanonicalName();

    /**
     * Create a new TransformBreakpointDetailPane.
     */
    public TransformBreakpointDetailPane() {
        super("SwitchYard Transform Breakpoint", "SwitchYard transform breakpoint properties.", ID);
        addAutosaveProperties(new int[] {TransformBreakpointEditor.TRANSFORMS_PROP,
                TransformBreakpointEditor.TRIGGER_PROP });
    }

    @Override
    protected AbstractJavaBreakpointEditor createEditor(Composite parent) {
        return new TransformBreakpointEditor();
    }
}
