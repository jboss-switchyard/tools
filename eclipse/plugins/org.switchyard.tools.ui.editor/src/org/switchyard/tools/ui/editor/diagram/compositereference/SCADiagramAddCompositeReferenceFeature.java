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

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.switchyard.tools.ui.editor.diagram.StyleUtil;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramAddCompositeReferenceFeature extends AbstractAddShapeFeature {

    /**
     * @param fp feature provider
     */
    public SCADiagramAddCompositeReferenceFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canAdd(IAddContext context) {
        if (context.getNewObject() instanceof Reference) {
            ContainerShape targetContainer = context.getTargetContainer();
            // check if user wants to add to a diagram
            if (getBusinessObjectForPictogramElement(targetContainer) instanceof Composite) {
                return true;
            }
        }
        return false;
    }

    @Override
    public PictogramElement add(IAddContext context) {
        Reference addedReference = null;
        if (context.getNewObject() instanceof Reference) {
            addedReference = (Reference) context.getNewObject();
        }
        ContainerShape targetContainerShape = null;
        if (context.getTargetContainer() instanceof ContainerShape) {
            targetContainerShape = (ContainerShape) context.getTargetContainer();
        }

        // CONTAINER SHAPE WITH ROUNDED RECTANGLE
        IPeCreateService peCreateService = Graphiti.getPeCreateService();
        IGaService gaService = Graphiti.getGaService();

        ContainerShape containerShape = peCreateService.createContainerShape(targetContainerShape, true);

        // check whether the context has a size (e.g. from a create feature)
        // otherwise define a default size for the shape
        int width = context.getWidth() <= 0 ? StyleUtil.COMPOSITE_REFERENCE_WIDTH : context.getWidth();
        int height = context.getHeight() <= 0 ? StyleUtil.COMPOSITE_REFERENCE_HEIGHT : context.getHeight();

        Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
        gaService.setLocationAndSize(invisibleRectangle, context.getX(), context.getY(), width, height);

        Polygon p = null;
        // create service

        // arrow through points: top-middle, bottom-right, bottom-left
        p = gaService.createPolygon(invisibleRectangle, StyleUtil.LARGE_RIGHT_ARROW);
        p.setStyle(StyleUtil.getStyleForCompositeReference(getDiagram()));
        p.setParentGraphicsAlgorithm(invisibleRectangle);

        gaService.setLocationAndSize(p, 0, 0, width, height);

        Graphiti.getPeService().setPropertyValue(p, "sca-type", "composite-reference");

        // create link and wire it
        link(containerShape, addedReference);

        ChopboxAnchor anchor = peCreateService.createChopboxAnchor(containerShape);
        anchor.setActive(true);
        link(anchor, addedReference);

        // SHAPE WITH TEXT

        // create and set text graphics algorithm
        Text text = gaService.createDefaultText(getDiagram(), p, addedReference.getName());
        Font font = gaService.manageFont(getDiagram(), text.getFont().getName(), text.getFont().getSize(), false, true);
        text.setFont(font);

        text.setForeground(manageColor(StyleUtil.BLACK));
        int left = p.getPoints().get(5).getX();
        int right = p.getPoints().get(1).getX();
        text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
        text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
        gaService.setLocationAndSize(text, left + 10, 0, right - left - 10, height);

        if (addedReference.getPromote() == null) {
            return containerShape;
        }

        for (ComponentReference promotedReference : addedReference.getPromote()) {
            for (PictogramElement pe : getFeatureProvider().getAllPictogramElementsForBusinessObject(promotedReference)) {
                if (pe instanceof Anchor) {
                    AddConnectionContext addContext = new AddConnectionContext((Anchor) pe, anchor);
                    addContext.setNewObject(addedReference);
                    getFeatureProvider().addIfPossible(addContext);
                    break;
                }
            }
        }

        return containerShape;

    }

}
