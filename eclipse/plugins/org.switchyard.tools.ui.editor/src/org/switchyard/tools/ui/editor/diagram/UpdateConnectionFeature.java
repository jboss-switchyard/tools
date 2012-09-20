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

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;

/**
 * UpdateConnectionFeature
 * 
 * <p/>
 * Updates connections to make sure they can support problem decorators.
 */
public class UpdateConnectionFeature extends AbstractUpdateFeature implements IUpdateFeature {

    /**
     * Create a new UpdateConnectionFeature.
     * 
     * @param fp the feature provider.
     */
    public UpdateConnectionFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canUpdate(IUpdateContext context) {
        final PictogramElement pe = context.getPictogramElement();
        // currently, no connections contain decorators (e.g. Text)
        return pe instanceof Connection && ((Connection) pe).getConnectionDecorators().isEmpty();
    }

    @Override
    public IReason updateNeeded(IUpdateContext context) {
        return canUpdate(context) ? Reason.createTrueReason("Add decorator to connection.") : Reason
                .createFalseReason();
    }

    @Override
    public boolean update(IUpdateContext context) {
        final Connection connection = (Connection) context.getPictogramElement();
        final ConnectionDecorator decorator = Graphiti.getPeCreateService().createConnectionDecorator(connection, true,
                .5, true);
        final Rectangle invisibleRectangle = Graphiti.getGaCreateService().createInvisibleRectangle(decorator);
        Graphiti.getGaLayoutService().setSize(invisibleRectangle, 16, 16);
        decorator.setGraphicsAlgorithm(invisibleRectangle);
        return true;
    }

    @Override
    public boolean hasDoneChanges() {
        // these changes do not need to be persisted.
        return false;
    }

}
