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
package org.switchyard.tools.ui.editor.diagram;

import java.util.ArrayList;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.features.impl.DefaultRemoveFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

/**
 * CascadingRemoveFeature
 * 
 * Handles removal of shape containing children (e.g. a Component).
 */
public class CascadingRemoveFeature extends DefaultRemoveFeature {

    /**
     * Create a new CascadingRemoveFeature.
     * 
     * @param fp the feature provider.
     */
    public CascadingRemoveFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public void preRemove(IRemoveContext context) {
        super.preRemove(context);
        PictogramElement pe = context.getPictogramElement();
        if (pe instanceof ContainerShape) {
            for (Shape shape : new ArrayList<Shape>(((ContainerShape) pe).getChildren())) {
                IRemoveContext childContext = new RemoveContext(shape);
                final IRemoveFeature removeFeature = getFeatureProvider().getRemoveFeature(childContext);
                if (removeFeature != null && removeFeature.canRemove(childContext)) {
                    removeFeature.remove(childContext);
                }
            }
        }
    }

}
