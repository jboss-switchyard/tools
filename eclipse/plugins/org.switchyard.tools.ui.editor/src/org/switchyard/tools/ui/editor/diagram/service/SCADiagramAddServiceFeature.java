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
package org.switchyard.tools.ui.editor.diagram.service;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.ui.editor.diagram.StyleUtil;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramAddServiceFeature extends AbstractAddShapeFeature {

    /**
     * @param fp the feature provider
     */
    public SCADiagramAddServiceFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canAdd(IAddContext context) {
        // check if user wants to add a Service
        if (context.getNewObject() instanceof Service) {

            if (getBusinessObjectForPictogramElement(context.getTargetContainer()) instanceof Composite) {
                return true;
            }
        }
        return false;
    }

    @Override
    public PictogramElement add(IAddContext context) {
        Service addedService = null;
        if (context.getNewObject() instanceof Service) {
            addedService = (Service) context.getNewObject();
        }
        ContainerShape targetContainerShape = null;
        if (context.getTargetContainer() instanceof ContainerShape) {
            targetContainerShape = (ContainerShape) context.getTargetContainer();
        }

        // CONTAINER SHAPE WITH ROUNDED RECTANGLE
        IPeCreateService peCreateService = Graphiti.getPeCreateService();
        IGaService gaService = Graphiti.getGaService();

        ContainerShape containerShape = peCreateService.createContainerShape(targetContainerShape, true);

        // check whether the context has a size (e.g. from a create feature)
        // otherwise define a default size for the shape
        int width = context.getWidth() <= 0 ? StyleUtil.SERVICE_WIDTH : context.getWidth();
        int height = context.getHeight() <= 0 ? StyleUtil.SERVICE_HEIGHT : context.getHeight();

        Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
        gaService.setLocationAndSize(invisibleRectangle, context.getX(), context.getY(), width, height);

        Polygon p = null;
        // create service

        // arrow through points: top-middle, bottom-right, bottom-left
        p = gaService.createPolygon(invisibleRectangle, StyleUtil.LARGE_RIGHT_ARROW[0], StyleUtil.LARGE_RIGHT_ARROW[1]);
        p.setStyle(StyleUtil.getStyleForService(getDiagram()));
        p.setParentGraphicsAlgorithm(invisibleRectangle);
        p.setLineWidth(p.getStyle().getLineWidth());

        gaService.setLocationAndSize(p, 0, 0, width, height);

        Graphiti.getPeService().setPropertyValue(p, "sca-type", "service");

        // create link and wire it
        link(containerShape, addedService);

        ChopboxAnchor anchor = peCreateService.createChopboxAnchor(containerShape);
        anchor.setActive(true);
        link(anchor, addedService);

        // SHAPE WITH TEXT
        // create and set text graphics algorithm
        Text text = gaService.createDefaultText(getDiagram(), p, addedService.getName());
        Font font = gaService.manageFont(getDiagram(), text.getFont().getName(), text.getFont().getSize(), false, true);
        text.setFont(font);

        text.setForeground(manageColor(new ColorConstant(StyleUtil.SERVICE_PALETTE.getTextForeground())));
        int left = p.getPoints().get(5).getX();
        int right = p.getPoints().get(2).getX();
        text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
        text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
        gaService.setLocationAndSize(text, left + 5, 0, right - left - 10, height);

        layoutPictogramElement(containerShape);
        if (updatePictogramElementNeeded(containerShape)) {
            // need to check otherwise, if no work is done, we'll nuke the
            // previous item on the undo stack
            updatePictogramElement(containerShape);
        }

        return containerShape;

    }
}
