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
package org.switchyard.tools.ui.editor.diagram.component;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.switchyard.tools.ui.editor.diagram.StyleUtil;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramAddComponentFeature extends AbstractAddShapeFeature {

    /**
     * @param fp the feature provider
     */
    public SCADiagramAddComponentFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canAdd(IAddContext context) {
        // check if user wants to add a EClass
        if (context.getNewObject() instanceof Component) {
            ContainerShape targetContainer = context.getTargetContainer();
            // check if user wants to add to a diagram
            if (targetContainer instanceof Composite) {
                return true;
            }
            if (getBusinessObjectForPictogramElement(targetContainer) instanceof Composite) {
                return true;
            }
        }
        return false;
    }

    @Override
    public PictogramElement add(IAddContext context) {
        Component addedComponent = (Component) context.getNewObject();
        ContainerShape targetContainer = context.getTargetContainer();

        IGaService gaService = Graphiti.getGaService();

        // CONTAINER SHAPE WITH ROUNDED RECTANGLE
        IPeCreateService peCreateService = Graphiti.getPeCreateService();
        ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);

        int edge = StyleUtil.COMPONENT_EDGE;

        // check whether the context has a size (e.g. from a create feature)
        // otherwise define a default size for the shape
        int width = context.getWidth() <= 0 ? StyleUtil.COMPONENT_WIDTH + edge : context.getWidth();
        int height = context.getHeight() <= 0 ? StyleUtil.COMPONENT_HEIGHT + edge : context.getHeight();

        Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
        gaService.setLocationAndSize(invisibleRectangle, context.getX(), context.getY(), width
                + StyleUtil.COMPONENT_INVISIBLE_RECT_RIGHT, height);

        // define a default size for the shape
        RoundedRectangle roundedRectangle;

        // create and set graphics algorithm
        roundedRectangle = gaService.createRoundedRectangle(invisibleRectangle, 6, 0);
        roundedRectangle.setStyle(StyleUtil.getStyleForComponent(getDiagram()));
        roundedRectangle.setParentGraphicsAlgorithm(invisibleRectangle);

        gaService.setLocationAndSize(roundedRectangle, 5, 0, width, height);

        // if added Class has no resource we add it to the resource
        // of the diagram

        // in a real scenario the business model would have its own resource
        // if (addedComponent.eResource() == null) {
        // getDiagram().eResource().getContents().add(addedComponent);
        // }

        // create link and wire it
        link(containerShape, addedComponent);
        Graphiti.getPeService().setPropertyValue(roundedRectangle, "sca-type", "component");

        // SHAPE WITH TEXT
        // create and set text graphics algorithm
        Text text = gaService.createDefaultText(getDiagram(), roundedRectangle, addedComponent.getName());
        text.setForeground(manageColor(StyleUtil.BLACK));
        text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
        text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
        Font font = text.getFont();
        font = gaService.manageFont(getDiagram(), font.getName(), font.getSize(), false, true);
        text.setFont(font);
        gaService.setLocationAndSize(text, StyleUtil.COMPONENT_EDGE + 10, 0, width - (StyleUtil.COMPONENT_EDGE * 3)
                - (StyleUtil.COMPONENT_INVISIBLE_RECT_RIGHT * 2), height);

        if (addedComponent.getService().size() > 0) {
            EList<ComponentService> services = addedComponent.getService();
            for (ComponentService componentService : services) {
                // create a box relative anchor at middle-left
                final BoxRelativeAnchor boxAnchorLeft = peCreateService.createBoxRelativeAnchor(containerShape);
                boxAnchorLeft.setRelativeWidth(0.0);
                boxAnchorLeft.setRelativeHeight(0.38); // Use golden section
                // anchor references visible rectangle instead of invisible
                // rectangle
                boxAnchorLeft.setReferencedGraphicsAlgorithm(roundedRectangle);
                // assign a graphics algorithm for the box relative anchor
                Polygon pbox = gaService.createPolygon(boxAnchorLeft, StyleUtil.SMALL_RIGHT_ARROW);
                pbox.setBackground(manageColor(StyleUtil.GREEN));
                pbox.setForeground(manageColor(StyleUtil.BRIGHT_ORANGE));
                pbox.setLineVisible(false);
                pbox.setFilled(true);

                // anchor is located on the left border of the visible rectangle
                // and touches the border of the invisible rectangle
                gaService.setLocationAndSize(pbox, -6, 0, StyleUtil.SMALL_RIGHT_ARROW_WIDTH,
                        StyleUtil.SMALL_RIGHT_ARROW_HEIGHT);

                link(boxAnchorLeft, componentService);
            }
        }

        if (addedComponent.getReference().size() > 0) {

            EList<ComponentReference> references = addedComponent.getReference();
            for (ComponentReference componentReference : references) {

                // create a box relative anchor at middle-right
                final BoxRelativeAnchor boxAnchorRight = peCreateService.createBoxRelativeAnchor(containerShape);
                boxAnchorRight.setRelativeWidth(1.0);
                boxAnchorRight.setRelativeHeight(0.38); // Use golden section

                // anchor references visible rectangle instead of invisible
                // rectangle
                boxAnchorRight.setReferencedGraphicsAlgorithm(roundedRectangle);

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

        // call the layout feature
        layoutPictogramElement(containerShape);

        return containerShape;

    }

}
