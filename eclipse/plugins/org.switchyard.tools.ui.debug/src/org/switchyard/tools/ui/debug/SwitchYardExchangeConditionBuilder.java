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

import java.util.Set;

import javax.xml.namespace.QName;

import org.switchyard.tools.ui.debug.IInteractionConfiguration.TriggerType;

/**
 * CamelExchangeConditionBuilder
 * <p/>
 * Builds conditions against a Camel Exchange.
 */
public class SwitchYardExchangeConditionBuilder implements IConditionBuilder {

    private final String _exchangeVariable;

    /**
     * Create a new CamelExchangeConditionBuilder.
     * 
     * @param exchangeVariable the name of the exchange variable to use in the
     *            expressions
     */
    public SwitchYardExchangeConditionBuilder(final String exchangeVariable) {
        _exchangeVariable = exchangeVariable;
    }

    @Override
    public String provider(QName name) {
        if (name == null) {
            return null;
        }
        final StringBuffer buffer = new StringBuffer();
        buffer.append('(');
        buffer.append(_exchangeVariable).append(".getConsumer() != null && ");
        buffer.append('"').append(name.toString()).append('"').append(".equals(").append(_exchangeVariable)
                .append(".getConsumer().getTargetServiceName().toString())");
        buffer.append(')');
        return buffer.toString();
    }

    @Override
    public String consumer(QName name) {
        if (name == null) {
            return null;
        }
        final StringBuffer buffer = new StringBuffer();
        buffer.append('(');
        buffer.append(_exchangeVariable).append(".getConsumer() != null && ");
        buffer.append('"').append(name.toString()).append('"').append(".equals(").append(_exchangeVariable)
                .append(".getConsumer().getName().toString())");
        buffer.append(')');
        return buffer.toString();
    }

    @Override
    public String exchangePhase(Set<TriggerType> triggers) {
        final StringBuffer buffer = new StringBuffer();
        boolean addOr = false;
        buffer.append("(");
        if (triggers.contains(TriggerType.IN)) {
            if (triggers.contains(TriggerType.OUT)) {
                // no need for a condition on triggers
                return null;
            }
            buffer.append("org.switchyard.ExchangePhase.IN == ").append(_exchangeVariable)
                    .append(".getProperty(\"org.switchyard.bus.camel.phase\", org.switchyard.ExchangePhase.class)");
            addOr = true;
        }
        if (triggers.contains(TriggerType.OUT)) {
            if (addOr) {
                buffer.append("\n            || ");
            }
            buffer.append("org.switchyard.ExchangePhase.OUT == ").append(_exchangeVariable)
                    .append(".getProperty(\"org.switchyard.bus.camel.phase\", org.switchyard.ExchangePhase.class)");
        } else if (triggers.contains(TriggerType.FAULT)) {
            if (addOr) {
                buffer.append("\n            || ");
            }
            buffer.append(exchangeState(true));
        }
        buffer.append(")");
        return buffer.toString();
    }

    @Override
    public String exchangeState(boolean fault) {
        final StringBuffer buffer = new StringBuffer();
        if (!fault) {
            buffer.append('!');
        }
        buffer.append(_exchangeVariable).append(
                ".getProperty(\"org.switchyard.bus.camel.fault\", false, Boolean.class)");
        return buffer.toString();
    }

}
