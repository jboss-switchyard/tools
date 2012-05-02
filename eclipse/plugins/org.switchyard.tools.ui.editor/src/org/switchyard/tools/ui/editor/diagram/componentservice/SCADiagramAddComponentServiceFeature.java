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

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
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
        Component addedComponent = (Component) getBusinessObjectForPictogramElement(targetContainer);

        String scaType = Graphiti.getPeService().getPropertyValue(targetContainer, "sca-type");
        if (scaType != null && !scaType.equalsIgnoreCase("component")) {
            return null;
        }

        IPeCreateService peCreateService = Graphiti.getPeCreateService();
        IGaService gaService = Graphiti.getGaService();

        if (addedComponent.getService().size() > 0) {

            EList<ComponentService> services = addedComponent.getService();
            for (ComponentService componentService : services) {

                if (!anchorComponentAlreadyExists(targetContainer, componentService)) {
                    // create a box relative anchor at middle-left
                    final BoxRelativeAnchor boxAnchorLeft = peCreateService.createBoxRelativeAnchor(targetContainer);
                    boxAnchorLeft.setRelativeWidth(0.0);
                    boxAnchorLeft.setRelativeHeight(0.38); // Use golden section

                    // assign a graphics algorithm for the box relative anchor
                    Polygon pbox = gaService.createPolygon(boxAnchorLeft, StyleUtil.SMALL_RIGHT_ARROW);
                    pbox.setBackground(manageColor(StyleUtil.GREEN));
                    pbox.setForeground(manageColor(StyleUtil.BRIGHT_ORANGE));
                    pbox.setLineVisible(false);
                    pbox.setFilled(true);

                    // anchor is located on the left border of the visible
                    // rectangle
                    // and touches the border of the invisible rectangle
                    gaService.setLocationAndSize(pbox, -6, 0, StyleUtil.SMALL_RIGHT_ARROW_WIDTH,
                            StyleUtil.SMALL_RIGHT_ARROW_HEIGHT);
                    link(boxAnchorLeft, componentService);
                }
            }
        }

        // call the layout feature
        layoutPictogramElement(targetContainer);

        return targetContainer;
    }

    private boolean anchorComponentAlreadyExists(ContainerShape targetContainer, ComponentService cservice) {

        EList<Anchor> anchors = targetContainer.getAnchors();
        for (Anchor anchor : anchors) {
            Object testObject = getBusinessObjectForPictogramElement(anchor);
            if (testObject.equals(cservice)) {
                return true;
            }
        }
        return false;
    }

}
