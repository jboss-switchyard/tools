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
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.ui.editor.ImageProvider;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramCreateComponentServiceLinkFeature extends AbstractCreateConnectionFeature {

    /**
     * @param fp the feature provider
     */
    public SCADiagramCreateComponentServiceLinkFeature(IFeatureProvider fp) {
        super(fp, "Component Service reference (dotted)", "Create Component Service reference");
    }

    @Override
    public boolean canCreate(ICreateConnectionContext context) {
        if (context.getSourceAnchor() != null && context.getTargetAnchor() != null) {
            Object source = getAnchorObject(context.getSourceAnchor());
            Object target = getAnchorObject(context.getTargetAnchor());
            if (source != null && target != null) {
                if (source instanceof Service && target instanceof ComponentService) {
                    return true;
                }
                if (source instanceof ComponentService && target instanceof Service) {
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
        // return true if start anchor belongs to a service or component
        if (getAnchorObject(context.getSourceAnchor()) != null) {
            return true;
        }
        return false;

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

        Anchor targetAnchor = context.getTargetAnchor();
        Anchor sourceAnchor = context.getSourceAnchor();
        Object source = getAnchorObject(sourceAnchor);
        Object target = getAnchorObject(targetAnchor);

        if (source != null && target != null) {
            ComponentService componentService;
            Service service;
            // add connection for business object
            if (source instanceof ComponentService) {
                componentService = (ComponentService) source;
                service = (Service) target;
                // always draw from service to component
                sourceAnchor = targetAnchor;
                targetAnchor = context.getSourceAnchor();
            } else {
                componentService = (ComponentService) target;
                service = (Service) source;
            }
            AddConnectionContext addContext = new AddConnectionContext(sourceAnchor, targetAnchor);
            service.setPromote(componentService);
            addContext.setNewObject(componentService);
            newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
            if (newConnection != null) {
                updatePictogramElement(newConnection);
            }
        }

        return newConnection;
    }

    private Object getAnchorObject(Anchor anchor) {
        if (anchor != null) {
            Object object = getBusinessObjectForPictogramElement(anchor.getParent());
            if (object instanceof Service || object instanceof ComponentService) {
                return object;
            }
        }
        return null;
    }

    @Override
    public String getCreateImageId() {
        return ImageProvider.IMG_16_CONNECTION;
    }

}
