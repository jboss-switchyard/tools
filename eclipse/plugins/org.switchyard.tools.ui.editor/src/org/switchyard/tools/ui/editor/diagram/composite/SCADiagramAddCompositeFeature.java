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
package org.switchyard.tools.ui.editor.diagram.composite;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.switchyard.tools.ui.editor.diagram.StyleUtil;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramAddCompositeFeature extends AbstractAddShapeFeature {

    /**
     * @param fp the feature provider
     */
    public SCADiagramAddCompositeFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canAdd(IAddContext context) {
        // check if user wants to add a composite
        if (context.getNewObject() instanceof Composite) {
            // check if user wants to add to a diagram
            if (context.getTargetContainer() instanceof Diagram) {
                return true;
            }
        }
        return false;
    }

    @Override
    public PictogramElement add(IAddContext context) {
        Composite addedComposite = (Composite) context.getNewObject();
        Diagram targetDiagram = (Diagram) context.getTargetContainer();

        // CONTAINER SHAPE WITH ROUNDED RECTANGLE
        IPeCreateService peCreateService = Graphiti.getPeCreateService();
        ContainerShape containerShape = peCreateService.createContainerShape(targetDiagram, true);
        Graphiti.getPeService().setPropertyValue(containerShape, "sca-type", "composite");

        // define a default size for the shape
        IGaService gaService = Graphiti.getGaService();
        int edge = StyleUtil.COMPOSITE_EDGE;

        // check whether the context has a size (e.g. from a create feature)
        // otherwise define a default size for the shape
        int width = context.getWidth() <= 0 ? StyleUtil.COMPOSITE_WIDTH + edge : context.getWidth();
        int height = context.getHeight() <= 0 ? StyleUtil.COMPOSITE_HEIGHT + edge : context.getHeight();

        Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
        gaService.setLocationAndSize(invisibleRectangle, context.getX(), context.getY(), width
                + StyleUtil.COMPOSITE_INVISIBLE_RECT_RIGHT, height + StyleUtil.COMPOSITE_INVISIBLE_RECT_RIGHT);

        RoundedRectangle roundedRectangle = null;

        // create and set graphics algorithm
        roundedRectangle = gaService.createRoundedRectangle(invisibleRectangle, 6, 0);
        roundedRectangle.setStyle(StyleUtil.getStyleForComposite(getDiagram()));
        roundedRectangle.setLineWidth(2);

        gaService.setLocationAndSize(roundedRectangle, StyleUtil.COMPOSITE_INVISIBLE_RECT_RIGHT / 2,
                StyleUtil.COMPOSITE_INVISIBLE_RECT_RIGHT / 2, width - edge, height - edge);

        // if added Class has no resource we add it to the resource
        // of the diagram

        // in a real scenario the business model would have its own resource
        // if (addedClass.eResource() == null) {
        // getDiagram().eResource().getContents().add(addedClass);
        // }

        Graphiti.getPeService().setPropertyValue(roundedRectangle, "sca-type", "composite");

        // create link and wire it
        link(containerShape, addedComposite);

        // SHAPE WITH TEXT

        // create and set text graphics algorithm
        Text text = gaService.createDefaultText(getDiagram(), roundedRectangle, addedComposite.getName());
        text.setForeground(manageColor(StyleUtil.BLACK));
        text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
        text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
        Font font = gaService.manageFont(getDiagram(), text.getFont().getName(), text.getFont().getSize(), false,
                true);
        text.setFont(font);
        gaService.setLocationAndSize(text, edge + 2, edge + 2, width, font.getSize() * 2);

        // call the layout feature
        layoutPictogramElement(containerShape);

        return containerShape;

    }

}
