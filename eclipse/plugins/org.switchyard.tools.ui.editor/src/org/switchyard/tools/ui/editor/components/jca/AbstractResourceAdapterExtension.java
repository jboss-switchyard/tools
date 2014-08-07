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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec;
import org.switchyard.tools.models.switchyard1_0.jca.Endpoint;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction;
import org.switchyard.tools.models.switchyard1_0.jca.Property;
import org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter;


/**
 * @author bfitzpat
 *
 */
public abstract class AbstractResourceAdapterExtension implements IJCAResourceAdapterExtension {

    @Override
    public boolean isDefault() {
        return false;
    }

    @Override
    public int score(JCABinding binding) {
        if (binding == null) {
            return 0;
        } else if (binding.getInboundConnection() != null) {
            return inboundConnectionScore(binding) + inboundInteractionScore(binding);
        } else if (binding.getOutboundConnection() != null) {
            return outboundConnectionScore(binding) + outboundInteractionScore(binding);
        }
        return 0;
    }

    private int inboundConnectionScore(JCABinding binding) {
        int score = 0;
        final JCAInboundConnection connection = binding.getInboundConnection();
        if (connection == null) {
            return score;
        }

        final IInboundConnectionSettings settings = getInboundConnectionSettings();
        if (settings == null) {
            return score;
        }

        final ResourceAdapter ra = connection.getResourceAdapter();
        if (ra != null) {
            if (settings.getResourceAdapterName() != null) {
                if (settings.getResourceAdapterName().equals(ra.getName())) {
                    ++score;
                }
            }
            score += scoreProperties(ra.getProperty(), settings.getResourceAdapterProperties());
        }
        final ActivationSpec activationSpec = connection.getActivationSpec();
        if (activationSpec != null && settings.getActivationSpecProperties() != null) {
            score += scoreProperties(activationSpec.getProperty(), settings.getActivationSpecProperties());
        }
        return score;
    }

    private int inboundInteractionScore(JCABinding binding) {
        int score = 0;
        final JCAInboundInteraction interaction = binding.getInboundInteraction();
        if (interaction == null) {
            return score;
        }
        
        final IInboundInteractionSettings settings = getInboundInteractionSettings();
        if (settings == null) {
            return score;
        }

        if (settings.getListenerType() != null) {
            if (settings.getListenerType().equals(interaction.getListener())) {
                ++score;
            }
        }
        
        if (settings.isTransacted() != null) {
            if (interaction.isSetTransacted() && settings.isTransacted() == interaction.isTransacted()) {
                ++score;
            }
        }

        Endpoint endpoint = interaction.getEndpoint();
        if (endpoint != null) {
            if (settings.getEndpointType() != null) {
                if (settings.getEndpointType().equals(endpoint.getType())) {
                    ++score;
                }
            }
            score += scoreProperties(endpoint.getProperty(), settings.getEndpointProperties());
        }
        return score;
    }

    private int outboundConnectionScore(JCABinding binding) {
        return 0;
    }

    private int outboundInteractionScore(JCABinding binding) {
        return 0;
    }

    protected int scoreProperty(List<Property> properties, String prop, Object defaultval) {
        int score = 0;
        if (properties == null || prop == null) {
            return score;
        }
        for (Property property : properties) {
            if (property.getName() == null) {
                continue;
            }
            final String propname = property.getName();
            if (propname.equals(prop)) {
                final Object propvalue = property.getValue();
                if (propvalue != null && propvalue.equals(defaultval)) {
                    ++score;
                    break;
                }
            }
        }
        return score;
    }

    private int scoreProperties(List<Property> properties, Map<String, String> defaults) {
        int score = 0;
        if (properties == null || defaults == null) {
            return score;
        }
        defaults = new HashMap<String, String>(defaults);
        for (Property property : properties) {
            if (property.getName() == null) {
                continue;
            }
            final String value = defaults.get(property.getName());
            ++score;
            if (value != null && value.equals(property.getValue())) {
                // to handle specific property settings, e.g. destinationType
                ++score;
            }
        }
        return score;
    }

}
