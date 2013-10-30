/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.diagram.connections;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.Messages;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramCreateReferenceLinkFeature extends AbstractCreateConnectionFeature {

    /**
     * @param fp the feature provider
     */
    public SCADiagramCreateReferenceLinkFeature(IFeatureProvider fp) {
        super(fp, Messages.featureName_wireReference, Messages.featureDescription_wireReference);
    }

    @Override
    public boolean canCreate(ICreateConnectionContext context) {
        if (context.getSourceAnchor() != null && context.getTargetAnchor() != null) {

            Object source = getBusinessObjectForPictogramElement(context.getSourceAnchor());
            Object target = getBusinessObjectForPictogramElement(context.getTargetAnchor());
            if (source != null && target != null) {
                if (source instanceof ComponentReference && target instanceof Reference
                        && !((Reference) target).getPromote().contains((ComponentReference) source)
                        && !getDiagramBehavior().getEditingDomain().isReadOnly(((Reference) target).eResource())) {
                    return true;
                } else if (source instanceof ComponentReference
                        && target instanceof ComponentService
                        && !getDiagramBehavior().getEditingDomain().isReadOnly(
                                ((ComponentReference) source).eResource())) {
                    ComponentReference reference = (ComponentReference) source;
                    ComponentService service = (ComponentService) target;
                    // true if not already connected to the service
                    return reference.eContainer() != service.eContainer()
                            && (reference.getName() == null || !reference.getName().equals(service.getName()));
                }
            }
        }
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.graphiti.func.ICreateConnection#canStartConnection(org.eclipse
     * .graphiti.features.context.ICreateConnectionContext)
     */
    @Override
    public boolean canStartConnection(ICreateConnectionContext context) {
        // return true if start anchor is a component/component reference
        return getBusinessObjectForPictogramElement(context.getSourceAnchor()) instanceof ComponentReference
                && context.getSourceAnchor().getOutgoingConnections().size() == 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.graphiti.func.ICreateConnection#create(org.eclipse.graphiti
     * .features.context.ICreateConnectionContext)
     */
    @Override
    public Connection create(ICreateConnectionContext context) {
        Connection newConnection = null;

        Anchor sourceAnchor = context.getSourceAnchor().getParent().getAnchors().get(0);
        Anchor targetAnchor = context.getTargetAnchor().getParent().getAnchors().get(0);
        Object source = getBusinessObjectForPictogramElement(sourceAnchor);
        Object target = getBusinessObjectForPictogramElement(targetAnchor);

        if (source instanceof ComponentReference && target instanceof Reference) {
            // get EClasses which should be connected
            ComponentReference componentReference = (ComponentReference) source;
            Reference reference = (Reference) target;

            reference.getPromote().add(componentReference);
            // add connection for business object
            AddConnectionContext addContext = new AddConnectionContext(sourceAnchor,
                    targetAnchor);
            addContext.setNewObject(componentReference);
            newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
        } else if (source instanceof ComponentReference && target instanceof ComponentService) {
            ComponentReference reference = (ComponentReference) getBusinessObjectForPictogramElement(context
                    .getSourceAnchor());
            ComponentService service = (ComponentService) getBusinessObjectForPictogramElement(context
                    .getTargetAnchor());

            reference.setName(service.getName());

            // add connection for business object
            AddConnectionContext addContext = new AddConnectionContext(sourceAnchor,
                    targetAnchor);
            addContext.setNewObject(reference);
            newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
        }

        if (newConnection != null) {
            getFeatureProvider().updateIfPossibleAndNeeded(new UpdateContext(newConnection));
        }

        return newConnection;
    }

    @Override
    public String getCreateImageId() {
        return ImageProvider.IMG_16_CONNECTION;
    }
}
