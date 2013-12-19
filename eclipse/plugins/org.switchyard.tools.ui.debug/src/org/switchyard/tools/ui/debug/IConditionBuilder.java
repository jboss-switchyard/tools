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
 * IConditionBuilder
 * <p/>
 * Interface for creating conditions used with breakpoints.
 */
public interface IConditionBuilder {

    /**
     * Condition requiring a match of the specified provider name, e.g.
     * exchange.getProvider().getName().equals(name).
     * 
     * @param name the provider name to match
     * @return a String representing the condition.
     */
    public String provider(QName name);

    /**
     * Condition requiring a match of the specified consumer name, e.g.
     * exchange.getConsumer().getName().equals(name).
     * 
     * @param name the provider name to match
     * @return a String representing the condition.
     */
    public String consumer(QName name);

    /**
     * Condition requiring a match of the specified phases, e.g.
     * exchange.getPhase() == Phase.IN.
     * 
     * @param triggers the phases to match
     * @return a String representing the condition.
     */
    public String exchangePhase(Set<TriggerType> triggers);

    /**
     * Condition requiring a match of the specified state, e.g.
     * exchange.getState() == ExchangeState.FAULT.
     * 
     * @param fault true to match FAULT, false for OK.
     * @return a String representing the condition.
     */
    public String exchangeState(boolean fault);
}
