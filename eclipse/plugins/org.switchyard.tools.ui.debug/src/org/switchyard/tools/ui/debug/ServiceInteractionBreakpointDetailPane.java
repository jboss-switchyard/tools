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
 * ServiceInteractionBreakpointDetailPane
 * <p/>
 * Detail pane for SwitchYard service breakpoints.
 */
@SuppressWarnings("restriction")
public class ServiceInteractionBreakpointDetailPane extends AbstractDetailPane {

    /** The ID for this detail pane. */
    public static final String ID = ServiceInteractionBreakpointDetailPane.class.getCanonicalName();

    /**
     * Create a new ServiceInteractionBreakpointDetailPane.
     */
    public ServiceInteractionBreakpointDetailPane() {
        super("SwitchYard Service Breakpoint", "SwitchYard service breakpoint properties.", ID);
        addAutosaveProperties(new int[] {ServiceInteractionBreakpointEditor.ASPECT_PROP,
                ServiceInteractionBreakpointEditor.TRIGGER_PROP });
    }

    @Override
    protected AbstractJavaBreakpointEditor createEditor(Composite parent) {
        return new ServiceInteractionBreakpointEditor();
    }
}
