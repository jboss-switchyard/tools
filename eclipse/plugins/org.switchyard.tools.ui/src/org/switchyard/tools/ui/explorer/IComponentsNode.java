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
 * IComponentsNode
 * 
 * <p/>
 * Root node for SwitchYard components in the project explorer.
 * 
 * @author Rob Cernich
 */
public interface IComponentsNode extends ISwitchYardNode {

    /**
     * @return the SwitchYard components defined within the application.
     */
    public List<IComponentNode> getComponents();

}
