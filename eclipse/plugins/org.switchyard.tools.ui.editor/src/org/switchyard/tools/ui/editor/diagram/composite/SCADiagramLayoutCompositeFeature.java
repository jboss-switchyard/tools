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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramLayoutCompositeFeature extends AbstractLayoutFeature {

    private static final int MIN_HEIGHT = 150;
    private static final int MIN_WIDTH = 150;

    /**
     * @param fp the feature provider
     */
    public SCADiagramLayoutCompositeFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canLayout(ILayoutContext context) {
        // return true, if pictogram element is linked to an EClass
        PictogramElement pe = context.getPictogramElement();
        if (!(pe instanceof ContainerShape)) {
            return false;
        }
        EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
        return businessObjects.size() == 1 && businessObjects.get(0) instanceof Composite;
    }

    @Override
    public boolean layout(ILayoutContext context) {
        boolean anythingChanged = false;

        ContainerShape containerShape = (ContainerShape) context.getPictogramElement();
        GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
        int containerWidth = containerGa.getWidth();
        int containerHeight = containerGa.getHeight();

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

        IGaService gaService = Graphiti.getGaService();
        for (GraphicsAlgorithm ga : containerGa.getGraphicsAlgorithmChildren()) {
            IDimension size = gaService.calculateSize(ga);
            if (containerWidth != size.getWidth()) {
                if (ga instanceof Rectangle) {
                    Rectangle rt = (Rectangle) ga;
                    rt.setHeight(containerHeight);
                    rt.setWidth(containerWidth);
                } else if (ga instanceof RoundedRectangle) {
                    RoundedRectangle rt = (RoundedRectangle) ga;
                    rt.setHeight(containerHeight - 40);
                    rt.setWidth(containerWidth - 40);
                }
            }
        }

        return anythingChanged;
    }

}
