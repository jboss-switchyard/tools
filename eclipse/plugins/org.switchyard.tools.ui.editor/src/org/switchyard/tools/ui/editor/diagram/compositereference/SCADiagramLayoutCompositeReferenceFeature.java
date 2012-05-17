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
package org.switchyard.tools.ui.editor.diagram.compositereference;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.switchyard.tools.ui.editor.diagram.StyleUtil;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramLayoutCompositeReferenceFeature extends AbstractLayoutFeature {

    private static final int MIN_HEIGHT = StyleUtil.COMPOSITE_REFERENCE_HEIGHT;
    private static final int MIN_WIDTH = StyleUtil.COMPOSITE_REFERENCE_WIDTH;

    /**
     * @param fp feature provider
     */
    public SCADiagramLayoutCompositeReferenceFeature(IFeatureProvider fp) {
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
        return businessObjects.size() == 1 && businessObjects.get(0) instanceof Reference;
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
