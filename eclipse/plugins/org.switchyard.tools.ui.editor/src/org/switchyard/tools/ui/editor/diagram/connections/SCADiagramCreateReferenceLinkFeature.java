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
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.switchyard.tools.ui.editor.ImageProvider;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramCreateReferenceLinkFeature extends AbstractCreateConnectionFeature {

    /**
     * @param fp the feature provider
     */
    public SCADiagramCreateReferenceLinkFeature(IFeatureProvider fp) {
        super(fp, "Wire Reference (dashed)", "Wire Reference");
    }

    @Override
    public boolean canCreate(ICreateConnectionContext context) {
        if (context.getSourceAnchor() != null && context.getTargetAnchor() != null) {

            Object source = getBusinessObjectForPictogramElement(context.getSourceAnchor());
            Object target = getBusinessObjectForPictogramElement(context.getTargetAnchor());
            if (source != null && target != null) {
                if (source instanceof ComponentReference && target instanceof Reference
                        && !getDiagramBehavior().getEditingDomain().isReadOnly(((Reference) target).eResource())) {
                    return true;
                } else if (source instanceof ComponentReference && target instanceof ComponentService
                        && !getDiagramBehavior().getEditingDomain().isReadOnly(((ComponentReference) source).eResource())) {
                    return true;
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
        return getBusinessObjectForPictogramElement(context.getSourceAnchor()) instanceof ComponentReference;
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

        Object source = getBusinessObjectForPictogramElement(context.getSourceAnchor());
        Object target = getBusinessObjectForPictogramElement(context.getTargetAnchor());

        if (source instanceof ComponentReference && target instanceof Reference) {
            // get EClasses which should be connected
            ComponentReference componentReference = (ComponentReference) source;
            Reference reference = (Reference) target;

            reference.getPromote().add(componentReference);
            // add connection for business object
            AddConnectionContext addContext = new AddConnectionContext(context.getSourceAnchor(),
                    context.getTargetAnchor());
            addContext.setNewObject(componentReference);
            newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
        } else if (source instanceof ComponentReference && target instanceof ComponentService) {
            ComponentReference reference = (ComponentReference) getBusinessObjectForPictogramElement(context
                    .getSourceAnchor());
            ComponentService service = (ComponentService) getBusinessObjectForPictogramElement(context
                    .getTargetAnchor());

            reference.setName(service.getName());

            // add connection for business object
            AddConnectionContext addContext = new AddConnectionContext(context.getSourceAnchor(),
                    context.getTargetAnchor());
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
