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

import org.switchyard.config.model.composite.BindingModel;
import org.switchyard.config.model.composite.CompositeServiceModel;
import org.switchyard.tools.ui.explorer.AbstractSwitchYardNode;
import org.switchyard.tools.ui.explorer.IServiceGateway;
import org.switchyard.tools.ui.explorer.IServiceNode;
import org.switchyard.tools.ui.explorer.IServicesNode;

/**
 * ServiceNode
 * 
 * <p/>
 * Implementation of IServiceNode. Wraps CompositeServicModel.
 * 
 * @author Rob Cernich
 */
public class ServiceNode extends AbstractSwitchYardNode implements IServiceNode {

    private CompositeServiceModel _service;
    private List<IServiceGateway> _gateways;

    /**
     * Create a new ServiceNode.
     * 
     * @param parent the parent.
     * @param service the service.
     */
    public ServiceNode(IServicesNode parent, CompositeServiceModel service) {
        super(parent);
        _service = service;
        List<BindingModel> bindings = service.getBindings();
        _gateways = new ArrayList<IServiceGateway>(bindings.size());
        for (BindingModel binding : bindings) {
            _gateways.add(new ServiceGateway(this, binding));
        }
    }

    @Override
    public String getName() {
        return _service.getName();
    }

    @Override
    public List<IServiceGateway> getGateways() {
        return _gateways;
    }

    /**
     * @return the CompositeServiceModel.
     */
    public CompositeServiceModel getModel() {
        return _service;
    }

    @Override
    public int hashCode() {
        return _service.getQName() == null ? super.hashCode() : _service.getQName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ServiceNode) {
            ServiceNode other = (ServiceNode) obj;
            return other.getRoot().equals(getRoot()) && other._service.getQName() != null
                    && _service.getQName() != null && other._service.getQName().equals(_service.getQName());
        }
        return false;
    }

}
