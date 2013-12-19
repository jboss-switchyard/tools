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
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

import javax.xml.namespace.QName;

/**
 * Configuration for SwitchYard breakpoints.
 */
public interface IInteractionConfiguration {

    /**
     * Values for when a service/reference breakpoint should be triggered.
     */
    public enum TriggerType {
        /** On entry. */
        IN,
        /** On exit. */
        OUT,
        /** On fault. */
        FAULT;
    }

    /**
     * Used to define which points in the system bus should breaks occur, e.g.
     * transaction setup/cleanup, security setup/cleanup, transformation,
     * validation, etc.
     */
    public enum AspectType {
        /** Break upon entering the bus. */
        ENTRY(EnumSet.of(TriggerType.IN)),
        /** Break during consumer callback. */
        RETURN(EnumSet.of(TriggerType.OUT)),
        /** Break during fault/error handler invocation. */
        FAULT(EnumSet.of(TriggerType.OUT, TriggerType.FAULT)),
        /** Break during transaction setup/cleanup. */
        TRANSACTION(null),
        /** Break during transaction setup/cleanup. */
        SECURITY(null),
        /** Break during generic policy check. */
        POLICY(EnumSet.of(TriggerType.IN)),
        /** Break during provider invocation. */
        TARGET_INVOCATION(EnumSet.of(TriggerType.IN)),
        /** Break during message validation. */
        VALIDATION(null),
        /** Break during message transformation. */
        TRANSFORMATION(null);

        private final Set<TriggerType> _supportedTriggers;

        private AspectType(final Set<TriggerType> supportedTriggers) {
            _supportedTriggers = supportedTriggers;
        }

        /**
         * Aspects may only be enabled during specific exchange phases. For
         * example, generic policy check (POLICY) is only applicable to the IN
         * phase.
         * 
         * @param triggers the triggers applied
         * @return true if this aspect should be enabled based on the specified
         *         triggers.
         */
        public boolean shouldEnable(Set<TriggerType> triggers) {
            return triggers == null || _supportedTriggers == null || containsTriggers(triggers);
        }

        private boolean containsTriggers(Set<TriggerType> triggers) {
            for (TriggerType trigger : triggers) {
                if (_supportedTriggers.contains(trigger)) {
                    return true;
                }
            }
            return false;
        }

        /**
         * @return the supported triggers
         */
        public Set<TriggerType> getSupportedTriggers() {
            return _supportedTriggers == null ? null : Collections.unmodifiableSet(_supportedTriggers);
        }
    }

    /**
     * @return the name of the provider service.
     */
    public QName getProviderName();

    /**
     * @return the model URI for the provider service.
     */
    public String getProviderUri();

    /**
     * @return the name of the consumer service.
     */
    public QName getConsumerName();

    /**
     * @return the model URI for the consumer service.
     */
    public String getConsumerUri();

    /**
     * @return the triggers
     */
    public Set<TriggerType> getTriggers();

    /**
     * @return the aspects
     */
    public Set<AspectType> getAspects();

    /**
     * @return an attributes map corresponding to this configurations settings.
     */
    public Map<String, Object> toAttributesMap();
}
