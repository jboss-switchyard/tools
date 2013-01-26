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

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
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

        int edging = 2 * StyleUtil.COMPONENT_EDGE;

        // check whether the context has a size (e.g. from a create feature)
        // otherwise define a default size for the shape
        int width = context.getWidth() <= 0 ? StyleUtil.COMPONENT_WIDTH : context.getWidth();
        int height = context.getHeight() <= 0 ? StyleUtil.COMPONENT_HEIGHT : context.getHeight();

        Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
        gaService.setLocationAndSize(invisibleRectangle, context.getX() - StyleUtil.COMPONENT_EDGE, context.getY()
                - StyleUtil.COMPONENT_EDGE, width + edging, height + edging);

        // define a default size for the shape
        RoundedRectangle roundedRectangle;

        // create and set graphics algorithm
        roundedRectangle = gaService.createRoundedRectangle(invisibleRectangle, 12, 12);
        roundedRectangle.setStyle(StyleUtil.getStyleForComponent(getDiagram()));
        roundedRectangle.setParentGraphicsAlgorithm(invisibleRectangle);
        roundedRectangle.setLineWidth(roundedRectangle.getStyle().getLineWidth());

        gaService.setLocationAndSize(roundedRectangle, StyleUtil.COMPONENT_EDGE, StyleUtil.COMPONENT_EDGE, width,
                height);

        // create link and wire it
        link(containerShape, addedComponent);
        Graphiti.getPeService().setPropertyValue(roundedRectangle, "sca-type", "component");

        // SHAPE WITH TEXT
        // create and set text graphics algorithm
        Text text = gaService.createDefaultText(getDiagram(), roundedRectangle, addedComponent.getName());
        text.setForeground(manageColor(new ColorConstant(StyleUtil.COMPONENT_PALETTE.getTextForeground())));
        text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
        text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
        Font font = text.getFont();
        font = gaService.manageFont(getDiagram(), font.getName(), font.getSize(), false, true);
        text.setFont(font);
        gaService.setLocationAndSize(text, StyleUtil.COMPONENT_EDGE, StyleUtil.COMPONENT_EDGE, width - edging, height
                - edging);

        if (addedComponent.getService().size() > 0) {
            final AddContext addContext = new AddContext();
            // TODO: do we really need this spacing?
            final int anchorX = roundedRectangle.getX() - 8;
            int anchorY = 2 * edging;
            addContext.setTargetContainer(containerShape);
            for (ComponentService componentService : addedComponent.getService()) {
                addContext.setNewObject(componentService);
                addContext.setLocation(anchorX, anchorY);

                addGraphicalRepresentation(addContext, componentService);

                // increment our spacing
                anchorY += StyleUtil.COMPONENT_CHILD_V_SPACING;
            }
        }

        if (addedComponent.getReference().size() > 0) {
            // TODO: do we really need this spacing?
            final AddContext addContext = new AddContext();
            final int anchorX = roundedRectangle.getX() + roundedRectangle.getWidth() - 8;
            int anchorY = 2 * edging;
            addContext.setTargetContainer(containerShape);
            for (ComponentReference componentReference : addedComponent.getReference()) {
                addContext.setNewObject(componentReference);
                addContext.setLocation(anchorX, anchorY);

                addGraphicalRepresentation(addContext, componentReference);

                // increment our spacing
                anchorY += StyleUtil.COMPONENT_CHILD_V_SPACING;
            }
        }

        // call the layout feature
        layoutPictogramElement(containerShape);

        return containerShape;

    }

}
