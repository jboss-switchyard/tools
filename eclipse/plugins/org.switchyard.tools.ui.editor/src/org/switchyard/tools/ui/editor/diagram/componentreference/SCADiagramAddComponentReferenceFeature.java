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
package org.switchyard.tools.ui.editor.diagram.componentreference;

import java.util.List;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.StyleUtil;
import org.switchyard.tools.ui.editor.model.merge.ComponentMergedModelAdapter;
import org.switchyard.tools.ui.editor.model.merge.MergedModelUtil;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramAddComponentReferenceFeature extends AbstractAddShapeFeature {

    /**
     * @param fp the feature provider
     */
    public SCADiagramAddComponentReferenceFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canAdd(IAddContext context) {
        // check if user wants to add a EClass
        if (context.getNewObject() instanceof ComponentReference) {
            ContainerShape targetContainer = context.getTargetContainer();
            // check if user wants to add to a diagram
            if (getBusinessObjectForPictogramElement(targetContainer) instanceof Component) {
                return true;
            }
        }
        return false;
    }

    @Override
    public PictogramElement add(IAddContext context) {
        final ContainerShape targetContainer = context.getTargetContainer();
        final Component component = (Component) getBusinessObjectForPictogramElement(targetContainer);

        final ComponentReference reference = (ComponentReference) context.getNewObject();
        if (reference == null) {
            return null;
        }

        final List<ComponentReference> references = MergedModelUtil.getAdapter(component,
                ComponentMergedModelAdapter.class).getReferences();
        if (!references.contains(reference)) {
            System.err.println("Target component does not contain new reference!!!"); //$NON-NLS-1$
            return null;
        }

        IPeCreateService peCreateService = Graphiti.getPeCreateService();
        IGaService gaService = Graphiti.getGaService();

        int anchorY = StyleUtil.COMPONENT_EDGE + 10 + references.indexOf(reference)
                * StyleUtil.COMPONENT_CHILD_V_SPACING;
        int anchorX = targetContainer.getGraphicsAlgorithm().getWidth() - StyleUtil.COMPONENT_EDGE - 10;
        final ContainerShape container = peCreateService.createContainerShape(targetContainer, true);
        // use the image to represent the service component
        final Image image = gaService.createImage(container, ImageProvider.IMG_COMPONENT_REFERENCE_SCALEABLE);
//        final Image image = gaService.createImage(container, ImageProvider.IMG_16_COMPONENT_REFERENCE);
//        gaService.setLocationAndSize(image, anchorX, anchorY, 16, 16);
        gaService.setLocationAndSize(image, anchorX, anchorY, 20, 20);
        image.setStretchH(true);
        image.setStretchV(true);
        image.setProportional(true); 
        // the anchor (note, box relative supports drag/drop for connections)
        final BoxRelativeAnchor anchor = peCreateService.createBoxRelativeAnchor(container);
        GraphicsAlgorithm anchorGa = gaService.createEllipse(anchor);
        anchorGa.setFilled(false);
        anchorGa.setLineVisible(false);
        gaService.setLocationAndSize(anchorGa, -10, -5, 10, 10);
        anchor.setRelativeHeight(.5);
        anchor.setRelativeWidth(1d);
        anchor.setUseAnchorLocationAsConnectionEndpoint(true);

        // make the whole figure accessible as a landing point for connections
        final ChopboxAnchor chopboxAnchor = peCreateService.createChopboxAnchor(container);

        // link 'em up
        link(container, reference);
        link(anchor, reference);
        link(chopboxAnchor, reference);

        // call the layout feature
        layoutPictogramElement(container);

        if (updatePictogramElementNeeded(container)) {
            // need to check otherwise, if no work is done, we'll nuke the
            // previous item on the undo stack
            updatePictogramElement(container);
        }

        return container;
    }

}
