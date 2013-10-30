/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.editor.diagram.connections;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReconnectionFeature;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.eclipse.graphiti.features.impl.DefaultReconnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;

/**
 * ReconnectCompositeReferenceFeature
 * <p/>
 * Supports reconnection when the source is a composite reference.
 */
public class ReconnectCompositeReferenceFeature extends DefaultReconnectionFeature implements IReconnectionFeature {

    private final Reference _reference;

    /**
     * Create a new ReconnectCompositeReferenceFeature.
     * 
     * @param fp the feature provider
     * @param reference the source reference
     */
    public ReconnectCompositeReferenceFeature(IFeatureProvider fp, Reference reference) {
        super(fp);
        _reference = reference;
    }

    @Override
    public boolean canReconnect(IReconnectionContext context) {
        return super.canReconnect(context)
                && getBusinessObjectForPictogramElement(getNewAnchor(context)) instanceof ComponentReference;
    }

    @Override
    public void preReconnect(IReconnectionContext context) {
        super.preReconnect(context);
        _reference.getPromote().remove(
                (ComponentReference) getBusinessObjectForPictogramElement(context.getOldAnchor()));
    }

    @Override
    public void postReconnect(IReconnectionContext context) {
        _reference.getPromote().add((ComponentReference) getBusinessObjectForPictogramElement(getNewAnchor(context)));
        super.postReconnect(context);
    }

    @Override
    protected Anchor getNewAnchor(IReconnectionContext context) {
        // make sure we get the fixed anchor, not the chopbox anchor
        final Anchor newAnchor = super.getNewAnchor(context);
        return newAnchor == null ? null : newAnchor.getParent().getAnchors().get(0);
    }

}
