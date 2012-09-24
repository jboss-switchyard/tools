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
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.ui.editor.diagram.StyleUtil;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramAddCompositeFeature extends AbstractAddShapeFeature {

    /**
     * @param fp the feature provider
     */
    public SCADiagramAddCompositeFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canAdd(IAddContext context) {
        // check if user wants to add a composite
        if (context.getNewObject() instanceof Composite) {
            // check if user wants to add to a diagram
            if (context.getTargetContainer() instanceof Diagram) {
                return true;
            }
        }
        return false;
    }

    @Override
    public PictogramElement add(IAddContext context) {
        Composite addedComposite = (Composite) context.getNewObject();
        Diagram targetDiagram = (Diagram) context.getTargetContainer();

        // CONTAINER SHAPE WITH ROUNDED RECTANGLE
        IPeCreateService peCreateService = Graphiti.getPeCreateService();
        ContainerShape containerShape = peCreateService.createContainerShape(targetDiagram, true);
        Graphiti.getPeService().setPropertyValue(containerShape, "sca-type", "composite");

        // define a default size for the shape
        IGaService gaService = Graphiti.getGaService();
        int outerEdging = 2 * StyleUtil.COMPOSITE_OUTER_EDGE;
        int innerEdging = 2 * StyleUtil.COMPOSITE_INNER_EDGE;

        // check whether the context has a size (e.g. from a create feature)
        // otherwise define a default size for the shape
        int width = context.getWidth() <= 0 ? StyleUtil.COMPOSITE_WIDTH : context.getWidth();
        int height = context.getHeight() <= 0 ? StyleUtil.COMPOSITE_HEIGHT : context.getHeight();

        Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
        gaService.setLocationAndSize(invisibleRectangle, context.getX(), context.getY(), width + outerEdging, height
                + outerEdging);

        RoundedRectangle roundedRectangle = null;

        // create and set graphics algorithm
        roundedRectangle = gaService.createRoundedRectangle(invisibleRectangle, 6, 0);
        roundedRectangle.setStyle(StyleUtil.getStyleForComposite(getDiagram()));
        roundedRectangle.setLineWidth(2);

        gaService.setLocationAndSize(roundedRectangle, StyleUtil.COMPOSITE_OUTER_EDGE, StyleUtil.COMPOSITE_OUTER_EDGE,
                width, height);

        // if added Class has no resource we add it to the resource
        // of the diagram

        // in a real scenario the business model would have its own resource
        // if (addedClass.eResource() == null) {
        // getDiagram().eResource().getContents().add(addedClass);
        // }

        Graphiti.getPeService().setPropertyValue(roundedRectangle, "sca-type", "composite");

        // create link and wire it
        link(containerShape, addedComposite);

        // SHAPE WITH TEXT

        // create and set text graphics algorithm
        Text text = gaService.createDefaultText(getDiagram(), roundedRectangle, addedComposite.getName());
        text.setForeground(manageColor(StyleUtil.BLACK));
        text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
        text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
        Font font = gaService.manageFont(getDiagram(), text.getFont().getName(), text.getFont().getSize(), false, true);
        text.setFont(font);
        gaService.setLocationAndSize(text, StyleUtil.COMPOSITE_INNER_EDGE, StyleUtil.COMPOSITE_INNER_EDGE, width
                - innerEdging, font.getSize() * 2);

        AddContext childContext = createComponentAddContext(getFeatureProvider(), containerShape);
        childContext.setTargetContainer(containerShape);
        for (Component component : addedComposite.getComponent()) {
            PictogramElement pe = addGraphicalRepresentation(childContext, component);
            if (pe == null) {
                childContext.setY(childContext.getY() + 2 * StyleUtil.COMPOSITE_CHILD_V_SPACING);
            } else {
                childContext.setY(childContext.getY() + pe.getGraphicsAlgorithm().getHeight()
                        + StyleUtil.COMPOSITE_CHILD_V_SPACING);
            }
        }

        childContext = createServiceAddContext(getFeatureProvider(), containerShape);
        for (Service service : addedComposite.getService()) {
            PictogramElement pe = addGraphicalRepresentation(childContext, service);
            if (pe == null) {
                childContext.setY(childContext.getY() + 2 * StyleUtil.COMPOSITE_CHILD_V_SPACING);
            } else {
                childContext.setY(childContext.getY() + pe.getGraphicsAlgorithm().getHeight()
                        + StyleUtil.COMPOSITE_CHILD_V_SPACING);
            }
        }

        childContext = createReferenceAddContext(getFeatureProvider(), containerShape);
        for (Reference reference : addedComposite.getReference()) {
            PictogramElement pe = addGraphicalRepresentation(childContext, reference);
            if (pe == null) {
                childContext.setY(childContext.getY() + 2 * StyleUtil.COMPOSITE_CHILD_V_SPACING);
            } else {
                childContext.setY(childContext.getY() + pe.getGraphicsAlgorithm().getHeight()
                        + StyleUtil.COMPOSITE_CHILD_V_SPACING);
            }
        }

        // call the layout feature
        layoutPictogramElement(containerShape);

        return containerShape;

    }

    /**
     * Create an AddContext for adding a new component to a Composite shape.
     * 
     * @param featureProvider the feature provider.
     * @param compositeContainer the shape representing the Composite.
     * 
     * @return a new AddContext.
     */
    public static AddContext createComponentAddContext(IFeatureProvider featureProvider,
            ContainerShape compositeContainer) {
        GraphicsAlgorithm ga = compositeContainer.getGraphicsAlgorithm();

        AddContext context = new AddContext();
        context.setX((ga.getWidth() - StyleUtil.COMPONENT_WIDTH) / 2 + ga.getX());
        context.setY(Math.max(StyleUtil.COMPOSITE_OUTER_EDGE + StyleUtil.COMPOSITE_INNER_EDGE * 2 + ga.getY(),
                getMaxYForChildShapeCount(featureProvider, compositeContainer, Component.class)));
        context.setTargetContainer(compositeContainer);

        return context;
    }

    /**
     * Create an AddContext for adding a new service to a Composite shape.
     * 
     * @param featureProvider the feature provider.
     * @param compositeContainer the shape representing the Composite.
     * 
     * @return a new AddContext.
     */
    public static AddContext createServiceAddContext(IFeatureProvider featureProvider, ContainerShape compositeContainer) {
        GraphicsAlgorithm ga = compositeContainer.getGraphicsAlgorithm();

        AddContext context = new AddContext();
        context.setX(StyleUtil.COMPOSITE_OUTER_EDGE - StyleUtil.COMPOSITE_PROTRUSION_WIDTH);
        context.setY(Math.max(StyleUtil.COMPOSITE_OUTER_EDGE + StyleUtil.COMPOSITE_INNER_EDGE * 2 + ga.getY(),
                getMaxYForChildShapeCount(featureProvider, compositeContainer, Service.class)));
        context.setTargetContainer(compositeContainer);

        return context;
    }

    /**
     * Create an AddContext for adding a new reference to a Composite shape.
     * 
     * @param featureProvider the feature provider.
     * @param compositeContainer the shape representing the Composite.
     * 
     * @return a new AddContext.
     */
    public static AddContext createReferenceAddContext(IFeatureProvider featureProvider,
            ContainerShape compositeContainer) {
        GraphicsAlgorithm ga = compositeContainer.getGraphicsAlgorithm();

        AddContext context = new AddContext();
        context.setX(ga.getX() + ga.getWidth() - StyleUtil.COMPOSITE_OUTER_EDGE + StyleUtil.COMPOSITE_PROTRUSION_WIDTH
                - StyleUtil.COMPOSITE_REFERENCE_WIDTH);
        context.setY(Math.max(StyleUtil.COMPOSITE_OUTER_EDGE + StyleUtil.COMPOSITE_INNER_EDGE * 2 + ga.getY(),
                getMaxYForChildShapeCount(featureProvider, compositeContainer, Reference.class)));
        context.setTargetContainer(compositeContainer);

        return context;
    }

    private static int getMaxYForChildShapeCount(IFeatureProvider featureProvider, ContainerShape containerShape,
            Class<?> boType) {
        int maxY = 0;
        for (Shape shape : containerShape.getChildren()) {
            if (boType.isInstance(featureProvider.getBusinessObjectForPictogramElement(shape))) {
                maxY = Math.max(shape.getGraphicsAlgorithm().getHeight() + shape.getGraphicsAlgorithm().getY(), maxY);
            }
        }
        if (maxY > 0) {
            maxY += StyleUtil.COMPOSITE_CHILD_V_SPACING;
        }
        return maxY;
    }

}
