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
package org.switchyard.tools.ui.editor.diagram.componentservice;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.StyleUtil;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramAddComponentServiceFeature extends AbstractAddShapeFeature {

    /**
     * @param fp the feature provider
     */
    public SCADiagramAddComponentServiceFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canAdd(IAddContext context) {
        // check if user wants to add a component service
        if (context.getNewObject() instanceof ComponentService) {
            ContainerShape targetContainer = context.getTargetContainer();
            // check if user wants to add to a component
            if (getBusinessObjectForPictogramElement(targetContainer) instanceof Component) {
                return true;
            }
        }
        return false;
    }

    @Override
    public PictogramElement add(IAddContext context) {
        ContainerShape targetContainer = context.getTargetContainer();
        Component component = (Component) getBusinessObjectForPictogramElement(targetContainer);

        ComponentService service = (ComponentService) context.getNewObject();
        if (service == null) {
            return null;
        }

        if (service.eContainer() != component) {
            System.err.println("Target component does not contain new service!!!");
            return null;
        }

        IPeCreateService peCreateService = Graphiti.getPeCreateService();
        IGaService gaService = Graphiti.getGaService();

        int anchorY = (component.getService().indexOf(service) + 1) * StyleUtil.COMPONENT_CHILD_V_SPACING;
        int anchorX = 0;
        final ContainerShape container = peCreateService.createContainerShape(targetContainer, true);
        // use the image to represent the service component
        final Image image = gaService.createImage(container, ImageProvider.IMG_16_COMPONENT_SERVICE);
        gaService.setLocationAndSize(image, anchorX, anchorY, 16, 16);
        // the anchor (note, box relative supports drag/drop for connections)
        final ChopboxAnchor anchor = peCreateService.createChopboxAnchor(container);

        // link 'em up
        link(container, service);
        link(anchor, service);

        // call the layout feature
        layoutPictogramElement(container);

        // make sure the connections get updated
        updatePictogramElement(container);

        return container;
    }

}
