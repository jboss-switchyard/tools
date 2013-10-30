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
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;

/**
 * ReconnectComponentReferenceFeature
 * <p/>
 * Supports reconnection when the source is a component reference.
 */
public class ReconnectComponentReferenceFeature extends DefaultReconnectionFeature implements IReconnectionFeature {

    private final ComponentReference _reference;

    /**
     * Create a new ReconnectComponentReferenceFeature.
     * 
     * @param fp the feature provider
     * @param reference the source reference
     */
    public ReconnectComponentReferenceFeature(IFeatureProvider fp, ComponentReference reference) {
        super(fp);
        _reference = reference;
    }

    @Override
    public boolean canReconnect(IReconnectionContext context) {
        final Object targetBo = getBusinessObjectForPictogramElement(getNewAnchor(context));
        /*
         * only reconnect if changing target composite reference or selecting a
         * different component service (i.e. we can't move from a component
         * service to a reference).
         */
        return super.canReconnect(context)
                && ((targetBo instanceof ComponentService && ((ComponentService) targetBo).eContainer() != _reference
                        .eContainer()) || (targetBo instanceof Reference
                        && !((Reference) targetBo).getPromote().contains(_reference) && getBusinessObjectForPictogramElement(context
                            .getOldAnchor()) instanceof Reference));
    }

    @Override
    public void preReconnect(IReconnectionContext context) {
        super.preReconnect(context);
        final Object oldTargetBo = getBusinessObjectForPictogramElement(context.getOldAnchor());
        if (oldTargetBo instanceof Reference) {
            ((Reference) oldTargetBo).getPromote().remove(_reference);
        }
    }

    @Override
    public void postReconnect(IReconnectionContext context) {
        final Object newTargetBo = getBusinessObjectForPictogramElement(getNewAnchor(context));
        if (newTargetBo instanceof Reference) {
            ((Reference) newTargetBo).getPromote().add(_reference);
        } else {
            _reference.setName(((ComponentService) newTargetBo).getName());
        }
        super.postReconnect(context);
    }

    @Override
    protected Anchor getNewAnchor(IReconnectionContext context) {
        // make sure we get the fixed anchor, not the chopbox anchor
        final Anchor newAnchor = super.getNewAnchor(context);
        return newAnchor == null ? null : newAnchor.getParent().getAnchors().get(0);
    }

}
