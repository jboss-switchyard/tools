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
 * Base implementation for breakpoints relating to SwitchYard ServiceHandler
 * types.
 */
@SuppressWarnings("restriction")
public abstract class ServiceHandlerBreakpoint extends DelegatingJavaBreakpoint<String> {

    private static final String SIGNATURE = "(Lorg/switchyard/Exchange;)V";
    protected static final String HANDLE_MESSAGE = "handleMessage";
    protected static final String HANDLE_FAULT = "handleFault";

    private final String _type;
    private final String _exchangeVariable;

    /**
     * Create a new ServiceHandlerBreakpoint.
     * 
     * @param type the handler type (e.g.
     *            org.switchyard.handlers.TransactionHandler)
     * @param exchangeVariable the name of the variable to use in conditions
     */
    protected ServiceHandlerBreakpoint(final String type, final String exchangeVariable) {
        super();
        _type = type;
        _exchangeVariable = exchangeVariable;
    }

    /**
     * Create a new ServiceHandlerBreakpoint.
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
    public ServiceHandlerBreakpoint(final IResource resource, final IInteractionConfiguration configuration,
            final boolean register, final String type, final String exchangeVariable, final String markerId)
            throws CoreException {
        super(resource, configuration, register, markerId);
        _type = type;
        _exchangeVariable = exchangeVariable;
    }

    @Override
    protected void createDelegates() throws CoreException {
        final Map<String, Object> messageAttributes = new HashMap<String, Object>(getMarker().getAttributes());
        messageAttributes.put(IBreakpoint.PERSISTED, false);
        messageAttributes.put(IMarker.TRANSIENT, true);
        final Map<String, Object> faultAttributes = new HashMap<String, Object>(messageAttributes);
        faultAttributes.put(IBreakpoint.ENABLED, isEnabled() && triggersOnFault());

        final IJavaMethodBreakpoint handleMessageDelegate = createHandleMessageDelegate(messageAttributes);
        final IJavaMethodBreakpoint handleFaultDelegate = createHandleFaultDelegate(faultAttributes);

        setMessageCondition(handleMessageDelegate);
        setFaultCondition(handleFaultDelegate);

        addDelegate(HANDLE_MESSAGE, (JavaBreakpoint) handleMessageDelegate);
        addDelegate(HANDLE_FAULT, (JavaBreakpoint) handleFaultDelegate);
        
        updateEnabled(isEnabled());
    }

    /**
     * @param attributes the breakpoint attributes.
     * @return a new breakpoint for the handleMessage() method.
     * @throws CoreException
     */
    protected IJavaMethodBreakpoint createHandleMessageDelegate(final Map<String, Object> attributes)
            throws CoreException {
        return JDIDebugModel.createMethodBreakpoint(getMarker().getResource(), _type, HANDLE_MESSAGE, SIGNATURE, true,
                false, false, -1, -1, -1, 0, false, attributes);
    }

    /**
     * @param attributes the breakpoint attributes.
     * @return a new breakpoint for the handleFault() method.
     * @throws CoreException
     */
    protected IJavaMethodBreakpoint createHandleFaultDelegate(final Map<String, Object> attributes)
            throws CoreException {
        return JDIDebugModel.createMethodBreakpoint(getMarker().getResource(), _type, HANDLE_FAULT, SIGNATURE, true,
                false, false, -1, -1, -1, 0, false, attributes);
    }

    /**
     * @return the delegate for handleMessage().
     */
    protected IJavaMethodBreakpoint getHandleMessageDelegate() {
        return (IJavaMethodBreakpoint) getDelegate(HANDLE_MESSAGE);
    }

    /**
     * @return the delegate for handleFault().
     */
    protected IJavaMethodBreakpoint getHandleFaultDelegate() {
        return (IJavaMethodBreakpoint) getDelegate(HANDLE_FAULT);
    }

    @Override
    protected void configurationUpdated() throws CoreException {
        setMessageCondition(getHandleMessageDelegate());
        setFaultCondition(getHandleFaultDelegate());
        super.configurationUpdated();
    }

    @Override
    protected void updateEnabled(boolean enabled) throws CoreException {
        final IJavaMethodBreakpoint handleMessageDelegate = getHandleMessageDelegate();
        final IJavaMethodBreakpoint handleFaultDelegate = getHandleFaultDelegate();
        if (enabled) {
            if (handleMessageDelegate != null) {
                handleMessageDelegate.setEnabled(true);
            }
            if (handleFaultDelegate != null) {
                if (triggersOnFault()) {
                    handleFaultDelegate.setEnabled(true);
                } else {
                    handleFaultDelegate.setEnabled(false);
                }
            }
        } else {
            if (handleMessageDelegate != null) {
                handleMessageDelegate.setEnabled(false);
            }
            if (handleFaultDelegate != null) {
                handleFaultDelegate.setEnabled(false);
            }
        }
    }

    /**
     * @return true if this breakpoint is configured to trigger on faults.
     */
    protected boolean triggersOnFault() {
        final Set<TriggerType> triggers = getInteractionConfiguration().getTriggers();
        return triggers == null || triggers.contains(TriggerType.FAULT) || triggers.contains(TriggerType.OUT);
    }

    /**
     * @return the condition to be used with handleMessage().
     */
    protected String createMessageCondition() {
        final IInteractionConfiguration config = getInteractionConfiguration();
        if (config == null) {
            return null;
        }
        final IConditionBuilder builder = new SwitchYardExchangeConditionBuilder(_exchangeVariable);
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

    /**
     * @return the condition to be used with handleFault().
     */
    protected String createFaultCondition() {
        final IInteractionConfiguration config = getInteractionConfiguration();
        if (config == null) {
            return null;
        }
        final IConditionBuilder builder = new SwitchYardExchangeConditionBuilder(_exchangeVariable);
        final String providerCondition = builder.provider(config.getProviderName());
        final String consumerCondition = builder.consumer(config.getConsumerName());
        final StringBuffer buffer = new StringBuffer();
        if (providerCondition != null) {
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

    private void setMessageCondition(final IJavaMethodBreakpoint delegate) throws CoreException {
        updateCondition(createMessageCondition(), delegate);
    }

    private void setFaultCondition(final IJavaMethodBreakpoint delegate) throws CoreException {
        updateCondition(createFaultCondition(), delegate);
    }

    private void updateCondition(final String newCondition, final IJavaMethodBreakpoint delegate) throws CoreException {
        if (delegate == null) {
            return;
        }
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
    }

}
