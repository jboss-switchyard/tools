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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;

/**
 * CompositeCreateFeature
 * 
 * A create feature that delegates to one or more individual create features.
 */
public class CompositeCreateFeature extends AbstractCreateFeature {

    private final ICreateFeature[] _delegates;
    private boolean _hasDoneChanges;

    /**
     * Create a new CompositeCreateFeature.
     * 
     * @param fp the feature provider.
     * @param name the name for the feature.
     * @param description the description for the feature.
     * @param delegates the individual create features.
     */
    public CompositeCreateFeature(IFeatureProvider fp, String name, String description, ICreateFeature... delegates) {
        super(fp, name, description);
        _delegates = delegates;
    }

    @Override
    public boolean canCreate(ICreateContext context) {
        if (_delegates == null || _delegates.length == 0) {
            return false;
        }
        for (ICreateFeature delegate : _delegates) {
            if (delegate.canCreate(context)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] create(ICreateContext context) {
        _hasDoneChanges = false;
        if (_delegates == null || _delegates.length == 0) {
            return new Object[0];
        }
        List<Object> createdObjects = new ArrayList<Object>();
        for (ICreateFeature delegate : _delegates) {
            if (delegate.canCreate(context)) {
                Object[] objects = delegate.create(context);
                _hasDoneChanges = _hasDoneChanges || delegate.hasDoneChanges();
                if (objects != null) {
                    createdObjects.addAll(Arrays.asList(objects));
                }
            }
        }
        return createdObjects.toArray();
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

    @Override
    public boolean hasDoneChanges() {
        return _hasDoneChanges;
    }

}
