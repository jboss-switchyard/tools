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

import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
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

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.graphiti.func.ILayout#layout(org.eclipse.graphiti.features
     * .context.ILayoutContext)
     */
    @Override
    public boolean layout(ILayoutContext context) {
        boolean anythingChanged = false;

        ContainerShape containerShape = (ContainerShape) context.getPictogramElement();
        GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
        Component component = (Component) getBusinessObjectForPictogramElement(containerShape);

        // make sure all the nubs fit
        int minHeight = Math.max(
                Math.max(containerGa.getHeight(), MIN_HEIGHT),
                Math.max((component.getService().size() + 1) * StyleUtil.COMPONENT_CHILD_V_SPACING
                        + StyleUtil.COMPONENT_CHILD_V_SPACING / 2, (component.getReference().size() + 1)
                        * StyleUtil.COMPONENT_CHILD_V_SPACING));
        // TODO: make sure the text fits
        int minWidth = Math.max(MIN_WIDTH, containerGa.getWidth());

        if (containerGa.getHeight() < minHeight) {
            containerGa.setHeight(minHeight);
            anythingChanged = true;
        }

        if (containerGa.getWidth() < minWidth) {
            containerGa.setWidth(minWidth);
            anythingChanged = true;
        }

        IGaService gaService = Graphiti.getGaService();
        for (GraphicsAlgorithm ga : containerGa.getGraphicsAlgorithmChildren()) {
            IDimension size = gaService.calculateSize(ga);
            if (ga instanceof Rectangle) {
                if (minWidth != size.getWidth() || minHeight != size.getHeight()) {
                    Rectangle rt = (Rectangle) ga;
                    rt.setHeight(minHeight);
                    rt.setWidth(minWidth);
                    anythingChanged = true;
                }
            } else if (ga instanceof RoundedRectangle) {
                if (minWidth != size.getWidth() + StyleUtil.COMPONENT_INVISIBLE_RECT_RIGHT
                        || minHeight != size.getHeight()) {
                    RoundedRectangle rt = (RoundedRectangle) ga;
                    rt.setHeight(minHeight);
                    rt.setWidth(minWidth - StyleUtil.COMPONENT_INVISIBLE_RECT_RIGHT);
                    // make sure the references are on the edge
                    for (Shape child : containerShape.getChildren()) {
                        if (getBusinessObjectForPictogramElement(child) instanceof ComponentReference) {
                            GraphicsAlgorithm childGa = child.getGraphicsAlgorithm();
                            childGa.setX(minWidth - childGa.getWidth());
                        }
                    }
                    anythingChanged = true;
                }
            }
        }

        int containerWidth = containerGa.getWidth();
        int containerHeight = containerGa.getHeight();
        GraphicsAlgorithm gaFound = StyleUtil.findChildGA(containerGa, Text.class);
        if (gaFound != null && gaFound instanceof Text) {
            Text text = (Text) gaFound;
            text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
            text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
            gaService.setLocationAndSize(text, 5, 0, containerWidth - 15, containerHeight / 2);
            anythingChanged = true;
        }
        return anythingChanged;
    }
}
