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
package org.switchyard.tools.ui.editor.diagram.componentreference;

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
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.switchyard.tools.ui.editor.diagram.StyleUtil;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramAddComponentReferenceFeature extends AbstractAddShapeFeature {

    /**
     * @param fp the feature provider
     */
    public SCADiagramAddComponentReferenceFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canAdd(IAddContext context) {
        // check if user wants to add a EClass
        if (context.getNewObject() instanceof ComponentReference) {
            ContainerShape targetContainer = context.getTargetContainer();
            // check if user wants to add to a diagram
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

        IPeCreateService peCreateService = Graphiti.getPeCreateService();
        IGaService gaService = Graphiti.getGaService();

        if (addedComponent.getReference().size() > 0) {

            EList<ComponentReference> references = addedComponent.getReference();
            for (ComponentReference componentReference : references) {

                if (!anchorComponentAlreadyExists(targetContainer, componentReference)) {
                    // create a box relative anchor at middle-right
                    final BoxRelativeAnchor boxAnchorRight = peCreateService.createBoxRelativeAnchor(targetContainer);
                    boxAnchorRight.setRelativeWidth(1.0);
                    boxAnchorRight.setRelativeHeight(0.38); // Use golden
                                                            // section

                    // assign a graphics algorithm for the box relative anchor
                    Polygon pbox2 = gaService.createPolygon(boxAnchorRight, StyleUtil.SMALL_RIGHT_ARROW);
                    pbox2.setBackground(manageColor(StyleUtil.ORANGE));
                    pbox2.setForeground(manageColor(StyleUtil.BRIGHT_ORANGE));
                    pbox2.setLineVisible(false);
                    pbox2.setFilled(true);

                    // anchor is located on the right border of the visible
                    // rectangle
                    // and touches the border of the invisible rectangle
                    final int w2 = StyleUtil.COMPONENT_INVISIBLE_RECT_RIGHT;
                    gaService.setLocationAndSize(pbox2, -w2, -w2, StyleUtil.SMALL_RIGHT_ARROW_WIDTH,
                            StyleUtil.SMALL_RIGHT_ARROW_HEIGHT);

                    link(boxAnchorRight, componentReference);
                }
            }
        }

        // call the layout feature
        layoutPictogramElement(targetContainer);

        return targetContainer;
    }

    private boolean anchorComponentAlreadyExists(ContainerShape targetContainer, ComponentReference creference) {

        EList<Anchor> anchors = targetContainer.getAnchors();
        for (Anchor anchor : anchors) {
            Object testObject = getBusinessObjectForPictogramElement(anchor);
            if (testObject.equals(creference)) {
                return true;
            }
        }
        return false;
    }

}
