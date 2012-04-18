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

/**
 * ISwitchYardNode
 * 
 * <p/>
 * Base node for SwitchYard specific project explorer content.
 * 
 * @author Rob Cernich
 */
public interface ISwitchYardNode {

    /**
     * @return this node's name.
     */
    public String getName();

    /**
     * @return the root node.
     */
    public ISwitchYardRootNode getRoot();

    /**
     * @return this node's parent.
     */
    public ISwitchYardNode getParent();
}
