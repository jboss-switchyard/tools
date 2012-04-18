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
 * AbstractSwitchYardNode
 * 
 * <p/>
 * Base type for ISwitchYardNode objects.
 * 
 * @author Rob Cernich
 */
public abstract class AbstractSwitchYardNode implements ISwitchYardNode {

    private ISwitchYardNode _parent;

    protected AbstractSwitchYardNode(ISwitchYardNode parent) {
        super();
        _parent = parent;
    }

    @Override
    public ISwitchYardRootNode getRoot() {
        return _parent == null ? null : _parent.getRoot();
    }

    @Override
    public ISwitchYardNode getParent() {
        return _parent;
    }

}
