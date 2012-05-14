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

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramResizeServiceFeature extends DefaultResizeShapeFeature {

    /**
     * @param fp the feature provider
     */
    public SCADiagramResizeServiceFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public void resizeShape(IResizeShapeContext context) {
        super.resizeShape(context);

        GraphicsAlgorithm containerGA = context.getPictogramElement().getGraphicsAlgorithm();
        // Get new sizes
        int width = containerGA.getWidth();
        int height = containerGA.getHeight();

        // Get old sizes. They are defined by the max values for x and y on all
        // points
        PictogramElement pictogramElement = context.getPictogramElement();
        Polygon polygon = null;
        if (!(pictogramElement.getGraphicsAlgorithm() instanceof Polygon)) {
            EList<GraphicsAlgorithm> childGAs = pictogramElement.getGraphicsAlgorithm().getGraphicsAlgorithmChildren();
            for (GraphicsAlgorithm graphicsAlgorithm : childGAs) {
                if (graphicsAlgorithm instanceof Polygon) {
                    polygon = (Polygon) graphicsAlgorithm;
                    break;
                }
            }
        } else {
            polygon = (Polygon) pictogramElement.getGraphicsAlgorithm();
        }
        EList<Point> points = polygon.getPoints();
        float maxX = 0;
        float maxY = 0;
        for (Iterator<Point> iterator = points.iterator(); iterator.hasNext();) {
            Point point = iterator.next();
            if (point.getX() > maxX) {
                maxX = point.getX();
            }
            if (point.getY() > maxY) {
                maxY = point.getY();
            }
        }

        // Compute scale factor
        float scaleX = width / maxX;
        float scaleY = height / maxY;

        int left = 0;
        int right = width;

        if (scaleX != 1 || scaleY != 1) {
            int i = -1;
            for (Iterator<Point> iterator = points.iterator(); iterator.hasNext();) {
                i++;
                Point point = iterator.next();
                int newX = Math.round(point.getX() * scaleX);
                if (i == 1) {
                    right = newX;
                }
                if (i == 5) {
                    left = newX;
                }
                point.setX(newX);
                int newY = Math.round(point.getY() * scaleY);
                point.setY(newY);
            }
        }

        // TODO: move this to layout feature
        GraphicsAlgorithm textGa = findChildGA(pictogramElement.getGraphicsAlgorithm(), Text.class);
        if (textGa != null) {
            IGaService gaService = Graphiti.getGaService();
            Text text = (Text) textGa;
            text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
            text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
            gaService.setLocationAndSize(text, left + 10, 0, right - left - 10, height);
        }

        // layout composite to make sure the reference is on the edge
        layoutPictogramElement(((Shape) pictogramElement).getContainer());
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
