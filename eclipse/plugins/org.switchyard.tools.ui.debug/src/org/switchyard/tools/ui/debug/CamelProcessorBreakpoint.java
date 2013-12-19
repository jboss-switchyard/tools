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

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.jdt.debug.core.IJavaMethodBreakpoint;
import org.eclipse.jdt.debug.core.JDIDebugModel;
import org.eclipse.jdt.internal.debug.core.breakpoints.JavaBreakpoint;
import org.switchyard.tools.ui.debug.IInteractionConfiguration.TriggerType;

/**
 * ServiceHandlerBreakpoint
 * <p/>
 * Base implementation for breakpoints relating to Camel Processor types.
 */
@SuppressWarnings("restriction")
public abstract class CamelProcessorBreakpoint extends DelegatingJavaBreakpoint<String> {

    private static final String DELEGATE_KEY = CamelProcessorBreakpoint.class.getCanonicalName();
    private static final String SIGNATURE = "(Lorg/apache/camel/Exchange;)V";
    private static final String METHOD = "process";

    private final String _type;
    private final String _exchangeVariable;

    /**
     * Create a new CamelProcessorBreakpoint.
     * 
     * @param type the processor type (e.g.
     *            org.switchyard.bus.camel.processors.InterceptProcessor)
     * @param exchangeVariable the name of the variable to use in conditions
     */
    protected CamelProcessorBreakpoint(final String type, final String exchangeVariable) {
        super();
        _type = type;
        _exchangeVariable = exchangeVariable;
    }

    /**
     * Create a new CamelProcessorBreakpoint.
     * 
     * @param resource the associated resource
     * @param configuration the configuration for this breakpoint
     * @param register true to register this breakpoint with the debug
     *            subsystem.
     * @param type the handler type (e.g.
     *            org.switchyard.handlers.TransactionHandler)
     * @param exchangeVariable the name of the variable to use in conditions
     * @param markerId the id for the associated marker
     * @throws CoreException if something goes awry
     */
    public CamelProcessorBreakpoint(final IResource resource, final IInteractionConfiguration configuration,
            final boolean register, final String type, final String exchangeVariable, final String markerId)
            throws CoreException {
        super(resource, configuration, register, markerId);
        _type = type;
        _exchangeVariable = exchangeVariable;
    }

    @Override
    protected void createDelegates() throws CoreException {
        final Map<String, Object> attributes = new HashMap<String, Object>(getMarker().getAttributes());
        attributes.put(IBreakpoint.PERSISTED, false);
        attributes.put(IMarker.TRANSIENT, true);

        final IJavaMethodBreakpoint delegate = JDIDebugModel.createMethodBreakpoint(getMarker().getResource(), _type,
                METHOD, SIGNATURE, true, false, false, -1, -1, -1, 0, false, attributes);

        final String condition = createCondition();
        if (condition != null) {
            delegate.setCondition(condition);
            delegate.setConditionEnabled(true);
        }

        delegate.setEnabled(isEnabled());

        addDelegate(DELEGATE_KEY, (JavaBreakpoint) delegate);
    }

    /**
     * @return the delegate.
     */
    protected IJavaMethodBreakpoint getDelegate() {
        return (IJavaMethodBreakpoint) getDelegate(DELEGATE_KEY);
    }

    @Override
    protected void configurationUpdated() throws CoreException {
        final IJavaMethodBreakpoint delegate = getDelegate();
        final String newCondition = createCondition();
        final String oldCondition = delegate.getCondition();
        if (newCondition == null) {
            if (oldCondition == null) {
                // nothing to do
                return;
            } else {
                delegate.setConditionEnabled(false);
                delegate.setCondition(null);
            }
        } else if (newCondition.equals(oldCondition)) {
            // nothing to do
            return;
        } else {
            delegate.setCondition(newCondition);
            if (!delegate.isConditionEnabled()) {
                delegate.setConditionEnabled(true);
            }
        }
        super.configurationUpdated();
    }

    /**
     * @return the condition to be used with the delegate
     */
    protected String createCondition() {
        final IInteractionConfiguration config = getInteractionConfiguration();
        if (config == null) {
            return null;
        }
        final IConditionBuilder builder = new CamelExchangeConditionBuilder(_exchangeVariable);
        final Set<TriggerType> triggers = config.getTriggers();
        final String triggerCondition = builder.exchangePhase(triggers == null || triggers.isEmpty() ? EnumSet
                .allOf(TriggerType.class) : triggers);
        final String providerCondition = builder.provider(config.getProviderName());
        final String consumerCondition = builder.consumer(config.getConsumerName());
        final StringBuffer buffer = new StringBuffer();
        if (triggerCondition != null) {
            buffer.append(triggerCondition);
        }
        if (providerCondition != null) {
            if (buffer.length() > 0) {
                buffer.append("\n        && ");
            }
            buffer.append(providerCondition);
        }
        if (consumerCondition != null) {
            if (buffer.length() > 0) {
                buffer.append("\n        && ");
            }
            buffer.append(consumerCondition);
        }
        if (buffer.length() == 0) {
            return null;
        }
        buffer.insert(0, '(');
        buffer.append(")");
        return buffer.toString();
    }

    @Override
    protected void updateEnabled(boolean enabled) throws CoreException {
        getDelegate().setEnabled(enabled);
    }

}
