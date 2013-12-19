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

import static org.switchyard.tools.ui.debug.IInteractionConfiguration.AspectType.ENTRY;
import static org.switchyard.tools.ui.debug.IInteractionConfiguration.AspectType.FAULT;
import static org.switchyard.tools.ui.debug.IInteractionConfiguration.AspectType.POLICY;
import static org.switchyard.tools.ui.debug.IInteractionConfiguration.AspectType.RETURN;
import static org.switchyard.tools.ui.debug.IInteractionConfiguration.AspectType.SECURITY;
import static org.switchyard.tools.ui.debug.IInteractionConfiguration.AspectType.TARGET_INVOCATION;
import static org.switchyard.tools.ui.debug.IInteractionConfiguration.AspectType.TRANSACTION;
import static org.switchyard.tools.ui.debug.IInteractionConfiguration.AspectType.TRANSFORMATION;
import static org.switchyard.tools.ui.debug.IInteractionConfiguration.AspectType.VALIDATION;

import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.jdt.internal.debug.core.breakpoints.JavaBreakpoint;
import org.switchyard.tools.ui.debug.IInteractionConfiguration.AspectType;
import org.switchyard.tools.ui.debug.IInteractionConfiguration.TriggerType;
import org.switchyard.tools.ui.debug.SwitchYardDebugUtil.ServiceType;

/**
 * ServiceInteractionBreakpoint
 * <p/>
 * Breakpoint for interactions between a consumer and producer (i.e. composite
 * service->component service, component reference->component service, component
 * reference->composite reference).
 */
@SuppressWarnings("restriction")
public class ServiceInteractionBreakpoint extends DelegatingJavaBreakpoint<AspectType> {

    private static final String MARKER_ID = "org.switchyard.tools.ui.debug.switchYardServiceBreakpointMarker";

    /**
     * Create a new ServiceInteractionBreakpoint.
     */
    public ServiceInteractionBreakpoint() {
        super();
    }

    /**
     * Create a new ServiceInteractionBreakpoint.
     * 
     * @param resource the associated resource
     * @param configuration the configuration for this breakpoint
     * @param register true to register this breakpoint with the debug
     *            subsystem.
     * @throws DebugException if something goes awry
     */
    public ServiceInteractionBreakpoint(IResource resource, IInteractionConfiguration configuration, boolean register)
            throws DebugException {
        super(resource, configuration, register, MARKER_ID);
    }

    @Override
    protected void createDelegates() throws CoreException {
        final IResource resource = getMarker().getResource();
        final IInteractionConfiguration configuration = getInteractionConfiguration();
        final Set<TriggerType> triggers = configuration.getTriggers();
        final Set<AspectType> aspects = configuration.getAspects();
        final boolean enabled = isEnabled();
        addDelegate(ENTRY, enabled, triggers, aspects, new ServiceInterceptBreakpoint(resource,
                transformInterceptConfiguration(configuration, ENTRY), false) {
            @Override
            protected ServiceType getTargetType() {
                // we only want to break at the very beginning and the very end
                return ServiceType.CONSUMER;
            }
        });
        addDelegate(TARGET_INVOCATION, enabled, triggers, aspects, new ProviderProcessorBreakpoint(resource,
                transformInterceptConfiguration(configuration, TARGET_INVOCATION), false));
        addDelegate(RETURN, enabled, triggers, aspects, new ConsumerCallbackProcessorBreakpoint(resource,
                transformInterceptConfiguration(configuration, RETURN), false));
        addDelegate(FAULT, enabled, triggers, aspects, new ErrorHandlingProcessorBreakpoint(resource,
                transformInterceptConfiguration(configuration, FAULT), false));
        addDelegate(TRANSACTION, enabled, triggers, aspects, new TransactionHandlerBreakpoint(resource,
                transformInterceptConfiguration(configuration, TRANSACTION), false));
        addDelegate(SECURITY, enabled, triggers, aspects, new SecurityHandlerBreakpoint(resource,
                transformInterceptConfiguration(configuration, SECURITY), false));
        addDelegate(POLICY, enabled, triggers, aspects, new PolicyHandlerBreakpoint(resource,
                transformInterceptConfiguration(configuration, POLICY), false));
        addDelegate(VALIDATION, enabled, triggers, aspects, new ValidateHandlerBreakpoint(resource,
                transformInterceptConfiguration(configuration, VALIDATION), ValidateConfigurationBuilder.create()
                        .build(), false));
        addDelegate(TRANSFORMATION, enabled, triggers, aspects, new TransformHandlerBreakpoint(resource,
                transformInterceptConfiguration(configuration, TRANSFORMATION), false));
    }

    private void addDelegate(final AspectType aspect, final boolean enabled, final Set<TriggerType> triggers,
            final Set<AspectType> aspects, final JavaBreakpoint delegate) throws CoreException {
        if (!shouldEnable(aspect, enabled, triggers, aspects)) {
            delegate.setEnabled(false);
        }
        addDelegate(aspect, delegate);
    }

    @Override
    protected void configurationUpdated() throws CoreException {
        final IInteractionConfiguration configuration = getInteractionConfiguration();
        for (Map.Entry<AspectType, JavaBreakpoint> entry : getDelegates().entrySet()) {
            final JavaBreakpoint delegate = entry.getValue();
            if (delegate instanceof DelegatingJavaBreakpoint) {
                try {
                    ((DelegatingJavaBreakpoint<?>) delegate)
                            .setInteractionConfiguration(transformInterceptConfiguration(configuration, entry.getKey()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        updateEnabled(isEnabled());
        super.configurationUpdated();
    }

    @Override
    protected void updateEnabled(final boolean enabled) throws CoreException {
        if (enabled) {
            final IInteractionConfiguration configuration = getInteractionConfiguration();
            final Set<TriggerType> triggers = configuration.getTriggers();
            final Set<AspectType> aspects = configuration.getAspects();
            for (Map.Entry<AspectType, JavaBreakpoint> entry : getDelegates().entrySet()) {
                final boolean shouldEnable = shouldEnable(entry.getKey(), enabled, triggers, aspects);
                final JavaBreakpoint delegate = entry.getValue();
                if (shouldEnable != delegate.isEnabled()) {
                    try {
                        delegate.setEnabled(shouldEnable);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            for (IBreakpoint breakpoint : getDelegates().values()) {
                try {
                    if (breakpoint.isEnabled()) {
                        breakpoint.setEnabled(false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private boolean shouldEnable(AspectType aspect, boolean enabled, Set<TriggerType> triggers, Set<AspectType> aspects) {
        return enabled && (aspects == null || aspects.contains(aspect)) && aspect.shouldEnable(triggers);
    }

    private IInteractionConfiguration transformInterceptConfiguration(final IInteractionConfiguration configuration,
            final AspectType aspect) {
        // we only want to set the triggers supported by the aspect.
        final InteractionConfigurationBuilder builder = InteractionConfigurationBuilder.createFrom(configuration);
        final Set<TriggerType> triggers = configuration.getTriggers();
        final Set<TriggerType> supportedTriggers = aspect.getSupportedTriggers();
        if (triggers == null) {
            builder.triggers(supportedTriggers);
        } else if (supportedTriggers != null) {
            triggers.retainAll(supportedTriggers);
        }
        builder.triggers(triggers);
        return builder.build();
    }

}
