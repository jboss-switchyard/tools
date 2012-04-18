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
import java.util.List;

import org.switchyard.config.model.composite.ComponentModel;
import org.switchyard.config.model.composite.ComponentReferenceModel;
import org.switchyard.config.model.composite.ComponentServiceModel;
import org.switchyard.tools.ui.explorer.AbstractSwitchYardNode;
import org.switchyard.tools.ui.explorer.IComponentNode;
import org.switchyard.tools.ui.explorer.IComponentReference;
import org.switchyard.tools.ui.explorer.IComponentService;
import org.switchyard.tools.ui.explorer.IComponentsNode;

/**
 * ComponentNode
 * 
 * <p/>
 * Implementation of IComponentNode. Wraps ComponentModel.
 * 
 * @author Rob Cernich
 */
public class ComponentNode extends AbstractSwitchYardNode implements IComponentNode {

    private ComponentModel _component;
    private List<IComponentService> _services;
    private List<IComponentReference> _references;

    /**
     * Create a new ComponentNode.
     * 
     * @param parent the parent.
     * @param component the configuration.
     */
    public ComponentNode(IComponentsNode parent, ComponentModel component) {
        super(parent);
        _component = component;

        List<ComponentServiceModel> services = component.getServices();
        _services = new ArrayList<IComponentService>(services.size());
        for (ComponentServiceModel service : services) {
            _services.add(new ComponentService(this, service));
        }

        List<ComponentReferenceModel> references = component.getReferences();
        _references = new ArrayList<IComponentReference>(references.size());
        for (ComponentReferenceModel reference : references) {
            _references.add(new ComponentReference(this, reference));
        }
    }

    @Override
    public String getName() {
        return _component.getName();
    }

    @Override
    public List<IComponentService> getServices() {
        return _services;
    }

    @Override
    public List<IComponentReference> getReferences() {
        return _references;
    }

    /**
     * @return the ComponentModel.
     */
    public ComponentModel getModel() {
        return _component;
    }

    @Override
    public int hashCode() {
        return _component.getQName() == null ? super.hashCode() : _component.getQName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComponentNode) {
            ComponentNode other = (ComponentNode) obj;
            return other.getRoot().equals(getRoot()) && other._component.getQName() != null
                    && _component.getQName() != null && other._component.getQName().equals(_component.getQName());
        }
        return false;
    }

}
