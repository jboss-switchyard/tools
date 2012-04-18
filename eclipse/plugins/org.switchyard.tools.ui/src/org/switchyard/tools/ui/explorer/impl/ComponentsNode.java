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
package org.switchyard.tools.ui.explorer.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.switchyard.config.model.composite.ComponentModel;
import org.switchyard.config.model.composite.CompositeModel;
import org.switchyard.config.model.switchyard.SwitchYardModel;
import org.switchyard.tools.ui.explorer.AbstractSwitchYardNode;
import org.switchyard.tools.ui.explorer.IComponentNode;
import org.switchyard.tools.ui.explorer.IComponentsNode;

/**
 * ComponentsNode
 * 
 * <p/>
 * Implementation of IComponentsNode.
 * 
 * @author Rob Cernich
 */
public class ComponentsNode extends AbstractSwitchYardNode implements IComponentsNode {

    private List<IComponentNode> _components;

    /**
     * Create a new ComponentsNode.
     * 
     * @param root the parent.
     * @param configuration the configuration.
     */
    public ComponentsNode(SwitchYardRootNode root, SwitchYardModel configuration) {
        super(root);
        if (configuration == null) {
            _components = Collections.emptyList();
            return;
        }
        CompositeModel composite = configuration.getComposite();
        if (composite == null) {
            _components = Collections.emptyList();
            return;
        }
        List<ComponentModel> components = composite.getComponents();
        _components = new ArrayList<IComponentNode>(components.size());
        for (ComponentModel component : components) {
            _components.add(new ComponentNode(this, component));
        }
    }

    @Override
    public String getName() {
        return "Components";
    }

    @Override
    public List<IComponentNode> getComponents() {
        return _components;
    }

    @Override
    public int hashCode() {
        return getRoot().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComponentsNode) {
            return ((ComponentsNode) obj).getRoot() == getRoot();
        }
        return false;
    }

}
