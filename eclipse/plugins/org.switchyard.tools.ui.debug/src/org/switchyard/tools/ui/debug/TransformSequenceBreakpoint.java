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
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.ui.debug.IInteractionConfiguration.TriggerType;

/**
 * TransformSequenceBreakpoint
 * <p/>
 * Breakpoint for SwitchYard tranform invocation.
 */
@SuppressWarnings("restriction")
public class TransformSequenceBreakpoint extends DelegatingJavaBreakpoint<String> {

    private static final String MARKER_ID = SwitchYardDebugUtil.TRANSFORM_BREAKPOINT_MARKER_ID;
    private static final String DELEGATE_KEY = CamelProcessorBreakpoint.class.getCanonicalName();
    private static final String TYPE = "org.switchyard.transform.TransformSequence";
    private static final String METHOD = "apply";
    private static final String SIGNATURE = "(Lorg/switchyard/Message;Lorg/switchyard/transform/TransformerRegistry;)V";
    private static final String VARIABLE_NAME = "message.getContext()";

    private ITransformConfiguration _transformConfiguration;

    /**
     * Create a new TransformSequenceBreakpoint.
     */
    public TransformSequenceBreakpoint() {
        super();
    }

    /**
     * Create a new ConsumerCallbackProcessorBreakpoint.
     * 
     * @param resource the associated resource
     * @param configuration the configuration for this breakpoint
     * @param transformConfiguration the transform configuration for this
     *            breakpoint
     * @param register true to register this breakpoint with the debug
     *            subsystem.
     * @throws CoreException if something goes awry
     */
    public TransformSequenceBreakpoint(final IResource resource, final IInteractionConfiguration configuration,
            final ITransformConfiguration transformConfiguration, final boolean register) throws CoreException {
        super(resource, configuration, register, MARKER_ID);
        _transformConfiguration = transformConfiguration;
    }

    /**
     * @return the configuration details for this breakpoint.
     */
    public ITransformConfiguration getTransformConfiguration() {
        if (_transformConfiguration == null) {
            try {
                _transformConfiguration = TransformConfigurationBuilder.create()
                        .updateFrom(getMarker().getAttributes()).build();
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
        return _transformConfiguration;
    }

    /**
     * Update this breakpoint with new settings.
     * 
     * @param configuration the new configuration
     * @throws CoreException if something goes awry
     */
    public void setTransformConfiguration(final ITransformConfiguration configuration) throws CoreException {
        if (configuration.equals(_transformConfiguration)) {
            return;
        }
        Map<String, Object> attributes = getMarker().getAttributes();
        attributes.putAll(configuration.toAttributesMap());
        setAttributes(attributes);
        _transformConfiguration = configuration;
        if (getDelegates().size() > 0) {
            configurationUpdated();
        }
    }

    @Override
    protected void createDelegates() throws CoreException {
        final Map<String, Object> attributes = new HashMap<String, Object>(getMarker().getAttributes());
        attributes.put(IBreakpoint.PERSISTED, false);
        attributes.put(IMarker.TRANSIENT, true);

        final IJavaMethodBreakpoint delegate = JDIDebugModel.createMethodBreakpoint(getMarker().getResource(), TYPE,
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

    private String createCondition() {
        final String phaseCondition = createPhaseCondition();
        final ITransformConfiguration config = getTransformConfiguration();
        if (config == null) {
            return phaseCondition;
        }
        final Set<TransformType> transforms = config.getTransforms();
        if (transforms == null || transforms.isEmpty()) {
            return phaseCondition;
        }

        boolean addOr = false;
        final StringBuffer buffer = new StringBuffer();
        if (phaseCondition != null) {
            buffer.append(phaseCondition).append(" && ");
        }
        buffer.append("_sequence.size() > 1 && (\n");
        for (TransformType transform : transforms) {
            if (transform.getFrom() == null || transform.getTo() == null) {
                continue;
            }
            if (addOr) {
                buffer.append(" || ");
            } else {
                addOr = true;
            }
            buffer.append('(');
            buffer.append("javax.xml.namespace.QName.valueOf(\"").append(transform.getFrom())
                    .append("\").equals(_sequence.get(0))");
            buffer.append(" && ");
            buffer.append("(javax.xml.namespace.QName.valueOf(\"").append(transform.getTo())
                    .append("\").equals(_sequence.get(_sequence.size()-1))");
            buffer.append(")\n");
        }
        buffer.append(')');
        buffer.insert(0, '(');
        buffer.append(")");
        return buffer.toString();
    }

    private String createPhaseCondition() {
        final IInteractionConfiguration config = getInteractionConfiguration();
        if (config == null) {
            return null;
        }
        final Set<TriggerType> triggers = config.getTriggers();
        final StringBuffer buffer = new StringBuffer();
        boolean addOr = false;
        buffer.append("(");
        if (triggers.contains(TriggerType.IN)) {
            if (triggers.contains(TriggerType.OUT)) {
                // no need for a condition on triggers
                return null;
            }
            buffer.append("org.switchyard.ExchangePhase.IN == ").append(VARIABLE_NAME)
                    .append(".getPropertyValue(\"org.switchyard.bus.camel.phase\")");
            addOr = true;
        }
        if (triggers.contains(TriggerType.OUT)) {
            if (addOr) {
                buffer.append("\n            || ");
            }
            buffer.append("org.switchyard.ExchangePhase.OUT == ").append(VARIABLE_NAME)
                    .append(".getPropertyValue(\"org.switchyard.bus.camel.phase\")");
        } else if (triggers.contains(TriggerType.FAULT)) {
            if (addOr) {
                buffer.append("\n            || ");
            }
            buffer.append("Boolean.TRUE.equals(").append(VARIABLE_NAME)
                    .append(".getPropertyValue(\"org.switchyard.bus.camel.fault\"))");
        }
        buffer.append(")");
        return buffer.toString();
    }

    @Override
    protected void updateEnabled(boolean enabled) throws CoreException {
        getDelegate().setEnabled(enabled);
    }

}
