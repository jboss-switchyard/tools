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
package org.switchyard.tools.ui.editor.diagram.shared;

import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Connection;

/**
 * CompositeCreateConnectionFeature
 * 
 * A create feature that delegates to one or more individual create features.
 */
public class CompositeCreateConnectionFeature extends AbstractCreateConnectionFeature {

    private final ICreateConnectionFeature[] _delegates;

    /**
     * Create a new CompositeCreateConnectionFeature.
     * 
     * @param fp the feature provider.
     * @param name the name for the feature.
     * @param description the description for the feature.
     * @param delegates the individual create features.
     */
    public CompositeCreateConnectionFeature(IFeatureProvider fp, String name, String description,
            ICreateConnectionFeature... delegates) {
        super(fp, name, description);
        _delegates = delegates;
    }

    @Override
    public boolean canCreate(ICreateConnectionContext context) {
        if (_delegates == null || _delegates.length == 0) {
            return false;
        }
        for (ICreateConnectionFeature delegate : _delegates) {
            if (delegate.canCreate(context)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Connection create(ICreateConnectionContext context) {
        if (_delegates == null || _delegates.length == 0) {
            return null;
        }
        for (ICreateConnectionFeature delegate : _delegates) {
            if (delegate.canCreate(context)) {
                return delegate.create(context);
            }
        }
        return null;
    }

    @Override
    public boolean canStartConnection(ICreateConnectionContext context) {
        if (_delegates == null || _delegates.length == 0) {
            return false;
        }
        for (ICreateConnectionFeature delegate : _delegates) {
            if (delegate.canStartConnection(context)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getCreateImageId() {
        if (_delegates == null || _delegates.length < 1) {
            return super.getCreateImageId();
        }
        return _delegates[0].getCreateImageId();
    }

    @Override
    public String getCreateLargeImageId() {
        if (_delegates == null || _delegates.length < 1) {
            return super.getCreateLargeImageId();
        }
        return _delegates[0].getCreateLargeImageId();
    }

}
