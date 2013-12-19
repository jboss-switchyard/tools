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

import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.switchyard.impl.TransformTypeImpl;

/**
 * ValidateConfigurationBuilder
 * <p/>
 * Configuration builder for IValidateConfiguration.
 */
public final class TransformConfigurationBuilder {

    /** Attributes key for trigger type. */
    public static final String TRANSFORMS_KEY = "switchYardTransformerBreakpointMarker.transforms";

    private TransformConfigurationImpl _config;

    private TransformConfigurationBuilder() {
        _config = new TransformConfigurationImpl();
    }

    /**
     * @param transforms the transforms for which the breakpoint should be
     *            configured, may be null
     * @return this
     */
    public TransformConfigurationBuilder transforms(Set<TransformType> transforms) {
        if (transforms == null) {
            _config._transforms = null;
        } else {
            _config._transforms = new LinkedHashSet<TransformType>();
            for (TransformType transform : transforms) {
                _config._transforms.add(new DummyTransformType(transform));
            }
        }
        return this;
    }

    /**
     * Updates the current configuration based on the settings in the attributes
     * map.
     * 
     * @param attributes the attributes
     * @return this
     */
    public TransformConfigurationBuilder updateFrom(Map<String, Object> attributes) {
        final Object value = attributes.get(TRANSFORMS_KEY);
        final StringTokenizer tokens = value instanceof String ? new StringTokenizer((String) value) : null;
        if (tokens == null || !tokens.hasMoreTokens()) {
            _config._transforms = null;
        } else {
            _config._transforms = new LinkedHashSet<TransformType>();
            for (; tokens.hasMoreTokens();) {
                final String from = tokens.nextToken();
                final String to = tokens.hasMoreTokens() ? tokens.nextToken() : null;
                if (to != null) {
                    final TransformType transform = new DummyTransformType(from, to);
                    _config._transforms.add(transform);
                }
            }
        }
        return this;
    }

    /**
     * @return the configuration
     */
    public ITransformConfiguration build() {
        return _config;
    }

    /**
     * @return a new builder
     */
    public static TransformConfigurationBuilder create() {
        return new TransformConfigurationBuilder();
    }

    /**
     * @param config an existing configuration
     * @return a new builder initialized using the specified configuration
     */
    public static TransformConfigurationBuilder createFrom(ITransformConfiguration config) {
        return create().transforms(config.getTransforms());
    }

    private static final class TransformConfigurationImpl implements ITransformConfiguration {
        private Set<TransformType> _transforms;

        @Override
        public Set<TransformType> getTransforms() {
            return _transforms == null ? null : Collections.unmodifiableSet(_transforms);
        }

        @Override
        public Map<String, Object> toAttributesMap() {
            final Map<String, Object> attributes = new HashMap<String, Object>();
            if (_transforms != null && _transforms.size() > 0) {
                final StringBuffer buffer = new StringBuffer();
                for (TransformType transform : _transforms) {
                    if (transform.getFrom() != null && transform.getTo() != null) {
                        buffer.append(transform.getFrom().toString()).append(' ');
                        buffer.append(transform.getTo().toString()).append(' ');
                    }
                }
                if (buffer.length() > 0) {
                    buffer.deleteCharAt(buffer.length() - 1);
                }
                attributes.put(TRANSFORMS_KEY, buffer.toString());
            }
            return attributes;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TransformConfigurationImpl) {
                final TransformConfigurationImpl other = (TransformConfigurationImpl) obj;
                return ((_transforms == null || _transforms.isEmpty()) && (other._transforms == null || other._transforms
                        .isEmpty())) || (_transforms != null && _transforms.equals(other._transforms));
            }
            return false;
        }
    }

    protected static final class DummyTransformType extends TransformTypeImpl {
        protected DummyTransformType(final String from, final String to) {
            this.from = from;
            this.to = to;
        }

        protected DummyTransformType(final TransformType other) {
            this.from = other.getFrom();
            this.to = other.getTo();
        }

        @Override
        public int hashCode() {
            return from == null ? 0 : from.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TransformType) {
                final TransformType other = (TransformType) obj;
                return ((from == null && other.getFrom() == null) || (from != null && from.equals(other.getFrom())))
                        && ((to == null && other.getTo() == null) || (to != null && to.equals(other.getTo())));
            }
            return false;
        }

    }
}
