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
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramResizeCompositeFeature extends DefaultResizeShapeFeature {

    /**
     * @param fp the feature provider
     */
    public SCADiagramResizeCompositeFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public void resizeShape(IResizeShapeContext context) {
        Shape shape = context.getShape();
        int width = context.getWidth();
        int height = context.getHeight();

        GraphicsAlgorithm shapeGa = shape.getGraphicsAlgorithm();
        if (shapeGa != null) {
            Graphiti.getGaService().setLocationAndSize(shapeGa, shapeGa.getX(), shapeGa.getY(), width, height);
        }

        layoutPictogramElement(shape);
    }

}
