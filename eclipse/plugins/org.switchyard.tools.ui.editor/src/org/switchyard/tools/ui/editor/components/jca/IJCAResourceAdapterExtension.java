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
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.components.jca;

import java.util.Map;

import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;

/**
 * @author bfitzpat
 *
 */
public interface IJCAResourceAdapterExtension {

    /**
     * Returns a score indicating how likely the specified binding is associated
     * with this extension. Typically, the number of "fields" whose settings
     * match those for this extension.
     * 
     * @param binding the binding to score
     * @return the score
     */
    public int score(JCABinding binding);

    /**
     * @return the default inbound interaction settings
     */
    public IInboundInteractionSettings getInboundInteractionSettings();

    /**
     * @return the default inbound connection settings
     */
    public IInboundConnectionSettings getInboundConnectionSettings();

    /**
     * @return the default outbound interaction settings
     */
    public IOutboundInteractionSettings getOutboundInteractionSettings();

    /**
     * @return the default outbound connection settings
     */
    public IOutboundConnectionSettings getOutboundConnectionSettings();

    /**
     * @return Display name
     */
    public String getDisplayName();

    /**
     * @param toolkit for creating controls
     * @return Composite with controls
     */
    public AbstractJCABindingComposite createComposite(FormToolkit toolkit);
    
    /**
     * @return boolean true = default
     */
    public boolean isDefault();
    
    /**
     * Inbound intercation settings.
     */
    public interface IInboundInteractionSettings {
        /**
         * @return the listener type (e.g. javax.jms.MessageListener).
         */
        public String getListenerType();

        /**
         * @return true if transacted, false if not, null if no default.
         */
        public String isTransacted();

        /**
         * @return the endpoint type, must extend
         *         org.switchyard.component.jca.endpoint.AbstractInflowEndpoint
         *         (e.g. org.switchyard.component.jca.endpoint.JMSEndpoint)
         */
        public String getEndpointType();

        /**
         * @return set of default endpoint properties.
         */
        public Map<String, String> getEndpointProperties();
    }

    /**
     * Inbound connection settings.
     */
    public interface IInboundConnectionSettings {
        /**
         * @return the name of the resource adapter (e.g. hornetq-ra.rar).
         */
        public String getResourceAdapterName();

        /**
         * @return set of default resource adapter properties
         */
        public Map<String, String> getResourceAdapterProperties();

        /**
         * @return set of default activation spec properties (e.g.
         *         destinationType=javax.jms.Queue, destination=SomeQueue,
         *         etc.).
         */
        public Map<String, String> getActivationSpecProperties();
    }

    /**
     * Outbound interaction settings.
     */
    public interface IOutboundInteractionSettings {
        /**
         * @return the processor type, must extend
         *         org.switchyard.component.jca.processor
         *         .AbstractOutboundProcessor (e.g.
         *         org.switchyard.component.jca.processor.JMSProcessor).
         */
        public String getProcessorType();

        /**
         * @return set of default processor properties (e.g.
         *         destination=SomeQueue, messageType=Text, etc.).
         */
        public Map<String, String> getProcessorProperties();

        /**
         * @return set of default connection spec properties.
         */
        public Map<String, String> getConnectionSpecProperties();

        /**
         * @return set of default interaction spec properties.
         */
        public Map<String, String> getInteractionSpecProperties();
    }

    /**
     * Outbound connection settings.
     */
    public interface IOutboundConnectionSettings {
        /**
         * @return the name of the resource adapter (e.g. hornetq-ra.rar).
         */
        public String getResourceAdapterName();

        /**
         * @return set of default resource adapter properties
         */
        public Map<String, String> getResourceAdapterProperties();

        /**
         * @return default JNDI name for the connection
         */
        public String getConnectionJndiName();

        /**
         * @return set of default connection properties.
         */
        public Map<String, String> getConnectionProperties();
    }

}
