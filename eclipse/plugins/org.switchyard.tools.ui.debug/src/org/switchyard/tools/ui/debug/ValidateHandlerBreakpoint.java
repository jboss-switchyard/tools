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

import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

/**
 * ValidateHandlerBreakpoint
 * <p/>
 * Breakpoint for SwitchYard VALIDATION.
 */
public class ValidateHandlerBreakpoint extends ServiceHandlerBreakpoint {

    private static final String MARKER_ID = SwitchYardDebugUtil.VALIDATE_BREAKPOINT_MARKER_ID;
    private static final String TYPE = "org.switchyard.handlers.ValidateHandler";
    private static final String EXCHANGE_VARIABLE = "exchange";

    private IValidateConfiguration _validateConfiguration;

    /**
     * Create a new ValidateHandlerBreakpoint.
     */
    public ValidateHandlerBreakpoint() {
        super(TYPE, EXCHANGE_VARIABLE);
    }

    /**
     * Create a new ValidateHandlerBreakpoint.
     * 
     * @param resource the associated resource
     * @param configuration the configuration for this breakpoint
     * @param validateConfiguration the validate configuration for this breakpoint
     * @param register true to register this breakpoint with the debug
     *            subsystem.
     * @throws CoreException if something goes awry
     */
    public ValidateHandlerBreakpoint(final IResource resource, final IInteractionConfiguration configuration,
            final IValidateConfiguration validateConfiguration, final boolean register) throws CoreException {
        super(resource, configuration, register, TYPE, EXCHANGE_VARIABLE, MARKER_ID);
        _validateConfiguration = validateConfiguration;
    }

    /**
     * @return the configuration details for this breakpoint.
     */
    public IValidateConfiguration getValidateConfiguration() {
        if (_validateConfiguration == null) {
            try {
                _validateConfiguration = ValidateConfigurationBuilder.create().updateFrom(getMarker().getAttributes())
                        .build();
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
        return _validateConfiguration;
    }

    /**
     * Update this breakpoint with new settings.
     * 
     * @param configuration the new configuration
     * @throws CoreException if something goes awry
     */
    public void setValidateConfiguration(final IValidateConfiguration configuration) throws CoreException {
        if (configuration.equals(_validateConfiguration)) {
            return;
        }
        Map<String, Object> attributes = getMarker().getAttributes();
        attributes.putAll(configuration.toAttributesMap());
        setAttributes(attributes);
        _validateConfiguration = configuration;
        if (getDelegates().size() > 0) {
            configurationUpdated();
        }
    }

    @Override
    protected String createMessageCondition() {
        return createCondition(super.createMessageCondition());
    }

    @Override
    protected String createFaultCondition() {
        return createCondition(super.createFaultCondition());
    }

    private String createCondition(final String baseCondition) {
        final String validateCondition = createValidateCondition();
        if (baseCondition == null) {
            return validateCondition;
        } else if (validateCondition == null) {
            return baseCondition;
        }
        final StringBuffer buffer = new StringBuffer();
        buffer.append('(');
        buffer.append(baseCondition);
        buffer.append("\n        && ");
        buffer.append(validateCondition);
        buffer.append(')');
        return buffer.toString();
    }

    private String createValidateCondition() {
        final Set<String> types = getValidateConfiguration().getValidateTypes();
        if (types == null || types.isEmpty()) {
            return null;
        }
        final StringBuffer buffer = new StringBuffer();
        buffer.append('(');
        buffer.append("get(").append(EXCHANGE_VARIABLE).append(") != null && ");
        buffer.append("java.util.Arrays.asList(");
        for (String type : types) {
            if (buffer.length() > 0) {
                buffer.append(", ");
            }
            buffer.append('"').append(type).append('"');
        }
        buffer.append(").contains(").append(EXCHANGE_VARIABLE)
                .append(".getContext().getProperty(\"org.switchyard.contentType\").getValue().toString())");
        buffer.append(')');
        return buffer.toString();
    }
}
