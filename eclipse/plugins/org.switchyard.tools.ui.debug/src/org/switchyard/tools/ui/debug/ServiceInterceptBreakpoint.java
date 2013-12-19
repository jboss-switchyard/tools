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
import org.switchyard.tools.ui.debug.SwitchYardDebugUtil.ServiceType;

/**
 * ServiceInterceptBreakpoint
 * <p/>
 * Breakpoint for SwitchYard INTERCEPT_PROCESSOR.
 */
public class ServiceInterceptBreakpoint extends CamelProcessorBreakpoint {

    private static final String MARKER_ID = SwitchYardDebugUtil.BASE_BREAKPOINT_MARKER_ID;
    private static final String TYPE = "org.switchyard.bus.camel.processors.InterceptProcessor";
    private static final String EXCHANGE_VARIABLE = "ex";

    /**
     * Create a new ServiceInterceptBreakpoint.
     */
    public ServiceInterceptBreakpoint() {
        super(TYPE, EXCHANGE_VARIABLE);
    }

    /**
     * Create a new ServiceInterceptBreakpoint.
     * 
     * @param resource the associated resource
     * @param configuration the configuration for this breakpoint
     * @param register true to register this breakpoint with the debug
     *            subsystem.
     * @throws CoreException if something goes awry
     */
    public ServiceInterceptBreakpoint(final IResource resource, final IInteractionConfiguration configuration,
            final boolean register) throws CoreException {
        super(resource, configuration, register, TYPE, EXCHANGE_VARIABLE, MARKER_ID);
        createDelegates();
    }

    @Override
    protected String createCondition() {
        final String condition = super.createCondition();
        if (condition == null) {
            // no condition means neither consumer or provider
            return condition;
        }
        final String targetCondition = createTargetCondition();
        if (targetCondition == null) {
            return condition;
        }
        final StringBuffer buffer = new StringBuffer();
        // type (provider/consumer)
        buffer.append(targetCondition);
        buffer.append("\n        && ");
        buffer.append(condition);
        buffer.insert(0, '(');
        buffer.append(')');
        return buffer.toString();
    }

    /**
     * @return the type of intercepts that should be targeted (PROVIDER or
     *         CONSUMER).
     */
    protected ServiceType getTargetType() {
        final IInteractionConfiguration config = getInteractionConfiguration();
        final ServiceType type;
        if (config.getConsumerName() == null) {
            if (config.getProviderName() == null) {
                // neither
                type = null;
            } else {
                type = ServiceType.PROVIDER;
            }
        } else if (config.getProviderName() == null) {
            type = ServiceType.CONSUMER;
        } else {
            // both
            type = null;
        }
        return type;
    }

    protected String createTargetCondition() {
        final ServiceType type = getTargetType();
        if (type == null) {
            return null;
        }
        final StringBuffer buffer = new StringBuffer();
        buffer.append('"').append(type.toString()).append('"').append(".equalsIgnoreCase(this._target)");
        return buffer.toString();
    }
}
