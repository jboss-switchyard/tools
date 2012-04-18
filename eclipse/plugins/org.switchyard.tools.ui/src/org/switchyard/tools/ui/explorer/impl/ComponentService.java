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

import org.switchyard.config.model.composite.ComponentServiceModel;
import org.switchyard.tools.ui.explorer.AbstractSwitchYardNode;
import org.switchyard.tools.ui.explorer.IComponentNode;
import org.switchyard.tools.ui.explorer.IComponentService;

/**
 * ComponentService
 * 
 * <p/>
 * Implementation of IComponentService. Wraps ComponentServiceModel.
 * 
 * @author Rob Cernich
 */
public class ComponentService extends AbstractSwitchYardNode implements IComponentService {

    private ComponentServiceModel _service;

    /**
     * Create a new ComponentService.
     * 
     * @param parent the parent.
     * @param service the ComponentServiceModel.
     */
    public ComponentService(IComponentNode parent, ComponentServiceModel service) {
        super(parent);
        _service = service;
    }

    @Override
    public String getName() {
        return _service.getName();
    }

    /**
     * @return the ComponentServiceModel.
     */
    public ComponentServiceModel getModel() {
        return _service;
    }

    @Override
    public int hashCode() {
        return _service.getQName() == null ? super.hashCode() : _service.getQName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComponentService) {
            ComponentService other = (ComponentService) obj;
            return other.getRoot().equals(getRoot()) && other._service.getName() != null && _service.getName() != null
                    && other._service.getName().equals(_service.getName());
        }
        return false;
    }

}
