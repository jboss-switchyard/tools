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

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * ValidateConfigurationBuilder
 * <p/>
 * Configuration builder for IValidateConfiguration.
 */
public final class ValidateConfigurationBuilder {

    /** Attributes key for trigger type. */
    public static final String TYPES_KEY = "switchYardValidatorBreakpointMarker.types";

    private ValidateConfigurationImpl _config;

    private ValidateConfigurationBuilder() {
        _config = new ValidateConfigurationImpl();
    }

    /**
     * @param types the types for which the breakpoint should be configured, may
     *            be null;
     * @return this
     */
    public ValidateConfigurationBuilder types(Set<String> types) {
        _config._validateTypes = types == null ? null : new LinkedHashSet<String>(types);
        return this;
    }

    /**
     * Updates the current configuration based on the settings in the attributes
     * map.
     * 
     * @param attributes the attributes
     * @return this
     */
    public ValidateConfigurationBuilder updateFrom(Map<String, Object> attributes) {
        final Object value = attributes.get(TYPES_KEY);
        final StringTokenizer tokens = value instanceof String ? new StringTokenizer((String) value) : null;
        if (tokens == null || !tokens.hasMoreTokens()) {
            _config._validateTypes = null;
        } else {
            _config._validateTypes = new LinkedHashSet<String>();
            for (; tokens.hasMoreTokens();) {
                _config._validateTypes.add(tokens.nextToken());
            }
        }
        return this;
    }

    /**
     * @return the configuration
     */
    public IValidateConfiguration build() {
        return _config;
    }

    /**
     * @return a new builder
     */
    public static ValidateConfigurationBuilder create() {
        return new ValidateConfigurationBuilder();
    }

    /**
     * @param config an existing configuration
     * @return a new builder initialized using the specified configuration
     */
    public static ValidateConfigurationBuilder createFrom(IValidateConfiguration config) {
        return create().types(config.getValidateTypes());
    }

    private static final class ValidateConfigurationImpl implements IValidateConfiguration {
        private Set<String> _validateTypes;

        @Override
        public Set<String> getValidateTypes() {
            return _validateTypes == null ? null : Collections.unmodifiableSet(_validateTypes);
        }

        @Override
        public Map<String, Object> toAttributesMap() {
            final Map<String, Object> attributes = new HashMap<String, Object>();
            if (_validateTypes != null && _validateTypes.size() > 0) {
                final StringBuffer buffer = new StringBuffer();
                for (String value : _validateTypes) {
                    buffer.append(value.toString()).append(' ');
                }
                if (buffer.length() > 0) {
                    buffer.deleteCharAt(buffer.length() - 1);
                }
                attributes.put(TYPES_KEY, buffer.toString());
            }
            return attributes;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ValidateConfigurationImpl) {
                final ValidateConfigurationImpl other = (ValidateConfigurationImpl) obj;
                return ((_validateTypes == null || _validateTypes.isEmpty()) && (other._validateTypes == null || other._validateTypes
                        .isEmpty())) || (_validateTypes != null && _validateTypes.equals(other._validateTypes));
            }
            return false;
        }
    }

}
