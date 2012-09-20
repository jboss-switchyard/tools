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
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.ui.editor.diagram.StyleUtil;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramLayoutCompositeFeature extends AbstractLayoutFeature {

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
        int edging = 2 * StyleUtil.COMPOSITE_OUTER_EDGE;
        int containerWidth = Math.max(StyleUtil.COMPOSITE_WIDTH, containerGa.getWidth() - edging);
        int containerHeight = Math.max(StyleUtil.COMPOSITE_HEIGHT, containerGa.getHeight() - edging);

        for (Shape child : containerShape.getChildren()) {
            final GraphicsAlgorithm ga = child.getGraphicsAlgorithm();
            if (getBusinessObjectForPictogramElement(child) instanceof Component) {
                // only need to check width for components as services and
                // references are fixed to the edges.
                containerWidth = Math.max(containerWidth, ga.getX() + ga.getWidth());
            }
            containerHeight = Math.max(containerHeight, ga.getY() + ga.getHeight());
        }
        // height
        if (containerGa.getHeight() - edging < containerHeight) {
            containerGa.setHeight(containerHeight + edging);
            anythingChanged = true;
        }

        // width
        if (containerGa.getWidth() - edging < containerWidth) {
            containerGa.setWidth(containerWidth + edging);
            anythingChanged = true;
        }

        final IGaService gaService = Graphiti.getGaService();
        for (GraphicsAlgorithm ga : containerGa.getGraphicsAlgorithmChildren()) {
            IDimension size = gaService.calculateSize(ga);
            if (ga instanceof Rectangle) {
                if (containerWidth != size.getWidth() || containerHeight != size.getHeight()) {
                    Rectangle rt = (Rectangle) ga;
                    rt.setHeight(containerHeight);
                    rt.setWidth(containerWidth);
                    anythingChanged = true;
                }
            } else if (ga instanceof RoundedRectangle) {
                if (containerWidth != size.getWidth() || containerHeight != size.getHeight()) {
                    RoundedRectangle rt = (RoundedRectangle) ga;
                    rt.setX(StyleUtil.COMPOSITE_OUTER_EDGE);
                    rt.setY(StyleUtil.COMPOSITE_OUTER_EDGE);
                    rt.setHeight(containerHeight);
                    rt.setWidth(containerWidth);
                    anythingChanged = true;
                }
            }
        }

        final int serviceX = StyleUtil.COMPOSITE_OUTER_EDGE - StyleUtil.COMPOSITE_PROTRUSION_WIDTH;
        for (Shape child : containerShape.getChildren()) {
            final Object bo = getBusinessObjectForPictogramElement(child);
            if (bo instanceof Service) {
                final GraphicsAlgorithm ga = child.getGraphicsAlgorithm();
                if (ga.getX() != serviceX) {
                    ga.setX(serviceX);
                    anythingChanged = true;
                }
            } else if (bo instanceof Reference) {
                final GraphicsAlgorithm ga = child.getGraphicsAlgorithm();
                final int desiredX = containerGa.getWidth() - ga.getWidth() - StyleUtil.COMPOSITE_OUTER_EDGE
                        + StyleUtil.COMPOSITE_PROTRUSION_WIDTH;
                if (ga.getX() != desiredX) {
                    ga.setX(desiredX);
                    anythingChanged = true;
                }
            }
        }
        return anythingChanged;
    }

}
