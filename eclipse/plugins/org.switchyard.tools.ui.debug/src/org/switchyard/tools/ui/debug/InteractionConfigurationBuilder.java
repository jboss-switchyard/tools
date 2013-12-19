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

import javax.xml.namespace.QName;

import org.switchyard.tools.ui.debug.IInteractionConfiguration.AspectType;
import org.switchyard.tools.ui.debug.IInteractionConfiguration.TriggerType;

/**
 * InteractionConfigurationBuilder
 * <p/>
 * Utility for creating/updating breakpoint service interaction configurations.
 */
public class InteractionConfigurationBuilder {

    /** Attributes key for trigger type. */
    public static final String TRIGGER_KEY = "switchYardServiceBreakpoint.trigger";
    /** Attributes key for trigger type. */
    public static final String ASPECT_KEY = "switchYardServiceBreakpoint.aspect";
    /** Attributes key for consumer name. */
    public static final String CONSUMER_NAME_KEY = "switchYardServiceBreakpoint.consumer.name";
    /** Attributes key for consumer model URI. */
    public static final String CONSUMER_URI_KEY = "switchYardServiceBreakpoint.consumer.uri";
    /** Attributes key for provider name. */
    public static final String PROVIDER_NAME_KEY = "switchYardServiceBreakpoint.provider.name";
    /** Attributes key for provider model URI. */
    public static final String PROVIDER_URI_KEY = "switchYardServiceBreakpoint.provider.uri";

    private BasicBreakpointConfiguration _config;

    private InteractionConfigurationBuilder() {
        this(new BasicBreakpointConfiguration());
    }

    protected InteractionConfigurationBuilder(BasicBreakpointConfiguration config) {
        _config = config;
    }

    /**
     * @param triggers the trigger set to configure
     * @return this
     */
    public InteractionConfigurationBuilder triggers(Set<TriggerType> triggers) {
        _config._triggers = triggers == null || triggers.isEmpty() ? null : EnumSet.copyOf(triggers);
        return this;
    }

    /**
     * @param aspects the aspects set to configure
     * @return this
     */
    public InteractionConfigurationBuilder aspects(Set<AspectType> aspects) {
        _config._aspects = aspects == null || aspects.isEmpty() ? null : EnumSet.copyOf(aspects);
        return this;
    }

    /**
     * @param name the name of the consumer
     * @param uri the model uri for the consumer
     * @return this
     */
    public InteractionConfigurationBuilder consumer(QName name, String uri) {
        _config._consumerName = name;
        _config._consumerUri = uri;
        return this;
    }

    /**
     * @param name the name of the provider
     * @param uri the model uri for the provider
     * @return this
     */
    public InteractionConfigurationBuilder provider(QName name, String uri) {
        _config._providerName = name;
        _config._providerUri = uri;
        return this;
    }

    /**
     * Updates fields in the configuration using details from the attributes.
     * 
     * @param attributes attributes representing the configuration
     * @return this
     */
    public InteractionConfigurationBuilder updateFrom(Map<String, Object> attributes) {
        return triggers(SwitchYardDebugUtil.fromString(TriggerType.class, getString(attributes, TRIGGER_KEY, null)))
                .aspects(SwitchYardDebugUtil.fromString(AspectType.class, getString(attributes, ASPECT_KEY, null)))
                .consumer(getQName(attributes, CONSUMER_NAME_KEY, null), getString(attributes, CONSUMER_URI_KEY, null))
                .provider(getQName(attributes, PROVIDER_NAME_KEY, null), getString(attributes, PROVIDER_URI_KEY, null));
    }

    /**
     * @return the configuration
     */
    public IInteractionConfiguration build() {
        return _config;
    }

    /**
     * @return a new builder
     */
    public static InteractionConfigurationBuilder create() {
        return new InteractionConfigurationBuilder();
    }

    /**
     * @param config an existing configuration
     * @return a new builder initialized using the specified configuration
     */
    public static InteractionConfigurationBuilder createFrom(IInteractionConfiguration config) {
        if (config == null) {
            return create();
        }
        return create().updateFrom(config);
    }

    /**
     * Update this builder using the specified configuration.
     * 
     * @param config an existing configuration
     * @return the updated builder
     */
    protected InteractionConfigurationBuilder updateFrom(IInteractionConfiguration config) {
        return create().triggers(config.getTriggers()).consumer(config.getConsumerName(), config.getConsumerUri())
                .provider(config.getProviderName(), config.getProviderUri());
    }

    /**
     * @param attributes the attributes map
     * @param key the key
     * @param defaultValue the default value
     * @return the value
     */
    protected QName getQName(Map<String, Object> attributes, String key, QName defaultValue) {
        if (attributes.containsKey(key)) {
            Object value = attributes.get(key);
            if (value instanceof String) {
                return QName.valueOf((String) value);
            }
        }
        return defaultValue;
    }

    /**
     * @param attributes the attributes map
     * @param key the key
     * @param defaultValue the default value
     * @return the value
     */
    protected String getString(Map<String, Object> attributes, String key, String defaultValue) {
        if (attributes.containsKey(key)) {
            Object value = attributes.get(key);
            if (value instanceof String) {
                return (String) value;
            }
        }
        return defaultValue;
    }

    /**
     * @param attributes the attributes map
     * @param key the key
     * @param defaultValue the default value
     * @return the value
     */
    protected boolean getBoolean(Map<String, Object> attributes, String key, boolean defaultValue) {
        if (attributes.containsKey(key)) {
            Object value = attributes.get(key);
            if (value instanceof Boolean) {
                return ((Boolean) value).booleanValue();
            }
        }
        return defaultValue;
    }

    protected static class BasicBreakpointConfiguration implements IInteractionConfiguration {
        private Set<TriggerType> _triggers;
        private Set<AspectType> _aspects;
        private QName _providerName;
        private String _providerUri;
        private QName _consumerName;
        private String _consumerUri;

        @Override
        public Set<TriggerType> getTriggers() {
            return _triggers == null || _triggers.isEmpty() ? null : EnumSet.copyOf(_triggers);
        }

        @Override
        public QName getProviderName() {
            return _providerName;
        }

        @Override
        public String getProviderUri() {
            return _providerUri;
        }

        @Override
        public QName getConsumerName() {
            return _consumerName;
        }

        @Override
        public String getConsumerUri() {
            return _consumerUri;
        }

        @Override
        public Set<AspectType> getAspects() {
            return _aspects == null || _aspects.isEmpty() ? null : EnumSet.copyOf(_aspects);
        }

        @Override
        public Map<String, Object> toAttributesMap() {
            final Map<String, Object> attributes = new HashMap<String, Object>();
            attributes.put(CONSUMER_NAME_KEY, _consumerName == null ? null : _consumerName.toString());
            attributes.put(CONSUMER_URI_KEY, _consumerUri);
            attributes.put(PROVIDER_NAME_KEY, _providerName == null ? null : _providerName.toString());
            attributes.put(PROVIDER_URI_KEY, _providerUri);
            attributes.put(TRIGGER_KEY,
                    _triggers != null && _triggers.size() > 0 ? SwitchYardDebugUtil.toString(_triggers) : null);
            attributes.put(ASPECT_KEY, _aspects != null && _aspects.size() > 0 ? SwitchYardDebugUtil.toString(_aspects)
                    : null);
            return attributes;
        }

        @Override
        public int hashCode() {
            return _consumerName == null ? _providerName == null ? 0 : _providerName.hashCode() : _consumerName
                    .hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BasicBreakpointConfiguration) {
                final BasicBreakpointConfiguration other = (BasicBreakpointConfiguration) obj;
                return valuesMatch(_providerName, other._providerName) && valuesMatch(_providerUri, other._providerUri)
                        && valuesMatch(_consumerName, other._consumerName)
                        && valuesMatch(_consumerUri, other._consumerUri) && setsMatch(_triggers, other._triggers)
                        && setsMatch(_aspects, other._aspects);
            }
            return false;
        }

        private boolean valuesMatch(Object one, Object other) {
            return (one == null && other == null) || (one != null && one.equals(other));
        }

        private boolean setsMatch(Set<?> one, Set<?> other) {
            return ((one == null || one.isEmpty()) && (other == null || other.isEmpty()))
                    || (one != null && one.equals(other));
        }
    }
}
