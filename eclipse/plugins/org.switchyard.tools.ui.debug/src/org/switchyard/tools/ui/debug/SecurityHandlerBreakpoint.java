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
package org.switchyard.tools.ui.debug;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

/**
 * SecurityHandlerBreakpoint
 * <p/>
 * Breakpoint for SwitchYard SECURITY_PROCESS and SECURITY_CLEANUP.
 */
public class SecurityHandlerBreakpoint extends ServiceHandlerBreakpoint {

    private static final String MARKER_ID = SwitchYardDebugUtil.BASE_BREAKPOINT_MARKER_ID;
    private static final String TYPE = "org.switchyard.handlers.SecurityHandler";
    private static final String EXCHANGE_VARIABLE = "exchange";

    /**
     * Create a new SecurityHandlerBreakpoint.
     */
    public SecurityHandlerBreakpoint() {
        super(TYPE, EXCHANGE_VARIABLE);
    }

    /**
     * Create a new SecurityHandlerBreakpoint.
     * 
     * @param resource the associated resource
     * @param configuration the configuration for this breakpoint
     * @param register true to register this breakpoint with the debug
     *            subsystem.
     * @throws CoreException if something goes awry
     */
    public SecurityHandlerBreakpoint(final IResource resource, final IInteractionConfiguration configuration,
            final boolean register) throws CoreException {
        super(resource, configuration, register, TYPE, EXCHANGE_VARIABLE, MARKER_ID);
    }

}
