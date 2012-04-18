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

import org.switchyard.config.model.composite.ComponentReferenceModel;
import org.switchyard.tools.ui.explorer.AbstractSwitchYardNode;
import org.switchyard.tools.ui.explorer.IComponentNode;
import org.switchyard.tools.ui.explorer.IComponentReference;

/**
 * ComponentReference
 * 
 * <p/>
 * Implementation of IComponentReference. Wraps ComponentReferenceModel.
 * 
 * @author Rob Cernich
 */
public class ComponentReference extends AbstractSwitchYardNode implements IComponentReference {

    private ComponentReferenceModel _reference;

    /**
     * Create a new ComponentReference.
     * 
     * @param parent the parent.
     * @param reference the ComponentReferenceModel.
     */
    public ComponentReference(IComponentNode parent, ComponentReferenceModel reference) {
        super(parent);
        _reference = reference;
    }

    @Override
    public String getName() {
        return _reference.getName();
    }

    /**
     * @return the ComponentReferenceModel.
     */
    public ComponentReferenceModel getModel() {
        return _reference;
    }

    @Override
    public int hashCode() {
        return _reference.getQName() == null ? super.hashCode() : _reference.getQName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComponentReference) {
            ComponentReference other = (ComponentReference) obj;
            return other.getRoot().equals(getRoot()) && other._reference.getName() != null
                    && _reference.getName() != null && other._reference.getName().equals(_reference.getName());
        }
        return false;
    }

}
