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
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.switchyard.tools.ui.editor.diagram.StyleUtil;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramLayoutComponentFeature extends AbstractLayoutFeature {

    private static final int MIN_HEIGHT = StyleUtil.COMPONENT_HEIGHT;
    private static final int MIN_WIDTH = StyleUtil.COMPONENT_WIDTH;

    /**
     * @param fp feature provider
     */
    public SCADiagramLayoutComponentFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canLayout(ILayoutContext context) {
        // return true, if pictogram element is linked to an EClass
        PictogramElement pe = context.getPictogramElement();
        if (!(pe instanceof ContainerShape)) {
            return false;
        }
        return true;
    }

    /* (non-Javadoc)
     * @see org.eclipse.graphiti.func.ILayout#layout(org.eclipse.graphiti.features.context.ILayoutContext)
     */
    @Override
    public boolean layout(ILayoutContext context) {
        boolean anythingChanged = false;

        ContainerShape containerShape = (ContainerShape) context.getPictogramElement();

        GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();

        // height
        if (containerGa.getHeight() < MIN_HEIGHT) {
            containerGa.setHeight(MIN_HEIGHT);
            anythingChanged = true;
        }

        // width
        if (containerGa.getWidth() < MIN_WIDTH) {
            containerGa.setWidth(MIN_WIDTH);
            anythingChanged = true;
        }

//        int containerWidth = containerGa.getWidth();
//
//        for (Shape shape : containerShape.getChildren()) {
//
//            GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
//            IGaService gaService = Graphiti.getGaService();
//
//            IDimension size = gaService.calculateSize(graphicsAlgorithm);

//            if (containerWidth != size.getWidth() || containerGa.getHeight() != size.getHeight()) {

                // if (graphicsAlgorithm instanceof Polyline) {
                //
                // Polyline polyline = (Polyline) graphicsAlgorithm;
                // Point secondPoint = polyline.getPoints().get(1);
                // Point newSecondPoint =
                // gaService.createPoint(containerWidth, secondPoint.getY());
                // polyline.getPoints().set(1, newSecondPoint);
                //
                // anythingChanged = true;
                //
                // } else {
                // gaService.setWidth(graphicsAlgorithm,
                // containerWidth);
                // gaService.setHeight(graphicsAlgorithm,
                // containerGa.getHeight());
                // graphicsAlgorithm.setWidth(containerWidth);
                //
                // anythingChanged = true;
                // }
//            }
//        }
        return anythingChanged;
    }
}
