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
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.switchyard.tools.ui.editor.diagram.StyleUtil;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramResizeComponentFeature extends DefaultResizeShapeFeature {

    /**
     * @param fp feature provider
     */
    public SCADiagramResizeComponentFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public void resizeShape(IResizeShapeContext context) {
        Shape shape = context.getShape();
        int x = context.getX();
        int y = context.getY();
        int width = context.getWidth();
        int height = context.getHeight();

        GraphicsAlgorithm shapeGa = shape.getGraphicsAlgorithm();
        if (shapeGa != null) {
            Graphiti.getGaService().setLocationAndSize(shapeGa, x, y, width, height);
            if (!shapeGa.getGraphicsAlgorithmChildren().isEmpty()) {
                EList<GraphicsAlgorithm> children = shapeGa.getGraphicsAlgorithmChildren();
                for (GraphicsAlgorithm graphicsAlgorithm : children) {
                    if (graphicsAlgorithm instanceof RoundedRectangle) {
                        RoundedRectangle rrect = (RoundedRectangle) graphicsAlgorithm;
                        Graphiti.getGaService().setLocationAndSize(rrect, StyleUtil.COMPONENT_EDGE, 0,
                                width - (StyleUtil.COMPONENT_EDGE * 2), height);
                    }
                }
            }
        }

        GraphicsAlgorithm textGa = findChildGA(shapeGa, Text.class);
        if (textGa != null) {
            IGaService gaService = Graphiti.getGaService();
            Text text = (Text) textGa;
            text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
            text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
            gaService.setLocationAndSize(text, StyleUtil.COMPONENT_EDGE + 10, 0, width - (StyleUtil.COMPONENT_EDGE * 3)
                    - (StyleUtil.COMPONENT_INVISIBLE_RECT_RIGHT * 2), height);
        }
    }

    private GraphicsAlgorithm findChildGA(GraphicsAlgorithm parent, Class<?> gaSearchType) {
        EList<GraphicsAlgorithm> childGAs = parent.getGraphicsAlgorithmChildren();
        for (GraphicsAlgorithm graphicsAlgorithm : childGAs) {
            if (graphicsAlgorithm.getClass().getCanonicalName().contentEquals(gaSearchType.getCanonicalName())) {
                return graphicsAlgorithm;
            } else if (graphicsAlgorithm.getClass() != gaSearchType
                    && gaSearchType.isAssignableFrom(graphicsAlgorithm.getClass())) {
                return graphicsAlgorithm;
            }
            if (graphicsAlgorithm.getGraphicsAlgorithmChildren().size() > 0) {
                return findChildGA(graphicsAlgorithm, gaSearchType);
            }
        }
        return null;
    }
}
