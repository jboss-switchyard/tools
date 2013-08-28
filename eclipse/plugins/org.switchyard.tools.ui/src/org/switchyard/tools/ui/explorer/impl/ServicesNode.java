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

import org.switchyard.config.model.composite.CompositeModel;
import org.switchyard.config.model.composite.CompositeServiceModel;
import org.switchyard.config.model.switchyard.SwitchYardModel;
import org.switchyard.tools.ui.explorer.AbstractSwitchYardNode;
import org.switchyard.tools.ui.explorer.IServiceNode;
import org.switchyard.tools.ui.explorer.IServicesNode;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * ServicesNode
 * 
 * <p/>
 * Implementation of IServicesNode.
 * 
 * @author Rob Cernich
 */
public class ServicesNode extends AbstractSwitchYardNode implements IServicesNode {

    private List<IServiceNode> _services;

    /**
     * Create a new ServicesNode.
     * 
     * @param root the parent node.
     * @param configuration the SwitchYardConfiguration.
     */
    public ServicesNode(SwitchYardRootNode root, SwitchYardModel configuration) {
        super(root);
        if (configuration == null) {
            _services = Collections.emptyList();
            return;
        }
        CompositeModel composite = configuration.getComposite();
        if (composite == null) {
            _services = Collections.emptyList();
            return;
        }
        List<CompositeServiceModel> services = composite.getServices();
        _services = new ArrayList<IServiceNode>(services.size());
        for (CompositeServiceModel service : services) {
            _services.add(new ServiceNode(this, service));
        }
    }

    @Override
    public String getName() {
        return Messages.ServicesNode_labelServices;
    }

    @Override
    public List<IServiceNode> getServices() {
        return _services;
    }

    @Override
    public int hashCode() {
        return getRoot().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ServicesNode) {
            return ((ServicesNode) obj).getRoot() == getRoot();
        }
        return false;
    }

}
