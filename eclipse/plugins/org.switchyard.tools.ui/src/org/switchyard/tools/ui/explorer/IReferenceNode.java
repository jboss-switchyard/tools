/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.explorer;

import java.util.List;

/**
 * IReferenceNode
 * 
 * <p/>
 * Represents a SwitchYard service required by the application.
 * 
 * @author Rob Cernich
 */
public interface IReferenceNode extends ISwitchYardNode {

    /**
     * @return the gateways (bindings) through which this reference is accessed.
     */
    public List<IServiceGateway> getGateways();
}
