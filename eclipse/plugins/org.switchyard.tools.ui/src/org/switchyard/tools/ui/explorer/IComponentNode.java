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
 * IComponentNode
 * 
 * <p/>
 * Represents a SwitchYard component within the application.
 * 
 * @author Rob Cernich
 */
public interface IComponentNode extends ISwitchYardNode {

    /**
     * @return the services implemented by this component.
     */
    public List<IComponentService> getServices();

    /**
     * @return the services used by this implementation.
     */
    public List<IComponentReference> getReferences();

}
