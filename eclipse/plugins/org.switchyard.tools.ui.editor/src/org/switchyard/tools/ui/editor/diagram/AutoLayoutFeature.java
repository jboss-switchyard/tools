/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.diagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.zest.layouts.InvalidLayoutConfiguration;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutBendPoint;
import org.eclipse.zest.layouts.LayoutEntity;
import org.eclipse.zest.layouts.LayoutRelationship;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.HorizontalTreeLayoutAlgorithm;
import org.eclipse.zest.layouts.exampleStructures.SimpleNode;
import org.eclipse.zest.layouts.exampleStructures.SimpleRelationship;
import org.switchyard.tools.ui.editor.ImageProvider;

/**
 * AutoLayoutFeature
 * 
 * <p/>
 * Automatically lays out diagram using Zest.
 * 
 * @author Rob Cernich
 */
public class AutoLayoutFeature extends AbstractCustomFeature {

    /**
     * Create a new AutoLayoutFeature.
     * 
     * @param fp the feature provider.
     */
    public AutoLayoutFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public String getDescription() {
        return "Layout diagram.";
    }

    @Override
    public String getName() {
        return "Auto-layout Diagram";
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        PictogramElement[] elements = context.getPictogramElements();
        return elements != null && elements.length == 1
                && getBusinessObjectForPictogramElement(elements[0]) instanceof Composite;
    }

    @Override
    public void execute(ICustomContext context) {
        final Shape shape = (Shape) context.getPictogramElements()[0];
        final List<SimpleRelationship> relationships = new ArrayList<SimpleRelationship>();
        final Map<Shape, SimpleNode> shapes = new LinkedHashMap<Shape, SimpleNode>();
        final GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();

        getLayoutEntities(shape, shapes, relationships);

        try {
            final int width = ga.getWidth() - 2 * StyleUtil.COMPOSITE_OUTER_EDGE;
            final int height = ga.getHeight() - 2 * StyleUtil.COMPOSITE_OUTER_EDGE;
            final LayoutAlgorithm layoutAlgo = new HorizontalTreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
            layoutAlgo.applyLayout(shapes.values().toArray(new LayoutEntity[shapes.size()]),
                    relationships.toArray(new LayoutRelationship[relationships.size()]), ga.getX(), ga.getY(), width,
                    height, false, false);
        } catch (InvalidLayoutConfiguration e) {
            e.printStackTrace();
            return;
        }
        updateCoordinates(ga, shapes, relationships);

        updateLayout((ContainerShape) context.getPictogramElements()[0]);
    }

    private void updateLayout(ContainerShape shape) {
        for (PictogramElement pe : shape.getChildren()) {
            if (pe instanceof ContainerShape) {
                updateLayout((ContainerShape) pe);
            }
        }
        layoutPictogramElement(shape);
    }

    /**
     * Note, the order in which these elements are added affects the way they
     * are laid out. We start with the components, add in links to services,
     * then referenced components, then composite services and references. The
     * order in which the objects appear in the switchyard.xml file may affect
     * the layout as well.
     */
    private void getLayoutEntities(final Shape shape, Map<Shape, SimpleNode> map, List<SimpleRelationship> relationships) {
        if (map.containsKey(shape)) {
            return;
        }
        final Object bo = getBusinessObjectForPictogramElement(shape);
        if (bo instanceof Composite) {
            final Composite composite = (Composite) bo;
            for (Component component : getSortedComponents(composite)) {
                final PictogramElement pe = getFeatureProvider().getPictogramElementForBusinessObject(component);
                if (pe instanceof Shape) {
                    getLayoutEntities((Shape) pe, map, relationships);
                }
            }
            for (Service service : composite.getService()) {
                final PictogramElement pe = getFeatureProvider().getPictogramElementForBusinessObject(service);
                if (pe instanceof Shape) {
                    getLayoutEntities((Shape) pe, map, relationships);
                }
            }
            for (Reference reference : composite.getReference()) {
                final PictogramElement pe = getFeatureProvider().getPictogramElementForBusinessObject(reference);
                if (pe instanceof Shape) {
                    getLayoutEntities((Shape) pe, map, relationships);
                }
            }
        } else if (bo instanceof Service) {
            final GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();
            final SimpleNode node = new SimpleNode(shape, ga.getX(), ga.getY(), ga.getWidth(), ga.getHeight());
            map.put(shape, node);
            for (Anchor anchor : shape.getAnchors()) {
                for (Connection connection : anchor.getOutgoingConnections()) {
                    Shape container = ((Shape) connection.getEnd().getParent()).getContainer();
                    getLayoutEntities(container, map, relationships);
                    relationships.add(new ConnectionRelationship(node, map.get(container), false, connection));
                }
            }
        } else if (bo instanceof Component) {
            final GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();
            final SimpleNode node = new SimpleNode(shape, ga.getX(), ga.getY(), ga.getWidth(), ga.getHeight());
            map.put(shape, node);
            for (ComponentService service : ((Component) bo).getService()) {
                PictogramElement pe = getFeatureProvider().getPictogramElementForBusinessObject(service);
                if (pe instanceof Shape) {
                    for (Anchor anchor : ((Shape) pe).getAnchors()) {
                        for (Connection connection : anchor.getIncomingConnections()) {
                            Shape container = (Shape) connection.getStart().getParent();
                            if (getBusinessObjectForPictogramElement(container) instanceof Service) {
                                getLayoutEntities(container, map, relationships);
                            }
                        }
                    }
                }
            }
            for (ComponentReference reference : ((Component) bo).getReference()) {
                PictogramElement pe = getFeatureProvider().getPictogramElementForBusinessObject(reference);
                if (pe instanceof Shape) {
                    for (Anchor anchor : ((Shape) pe).getAnchors()) {
                        for (Connection connection : anchor.getOutgoingConnections()) {
                            Shape container = (Shape) connection.getEnd().getParent();
                            if (getBusinessObjectForPictogramElement(container) instanceof ComponentService) {
                                container = container.getContainer();
                            }
                            getLayoutEntities(container, map, relationships);
                            relationships.add(new ConnectionRelationship(node, map.get(container), false, connection));
                        }
                    }
                }
            }
        } else if (bo instanceof Reference) {
            final GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();
            final SimpleNode node = new SimpleNode(shape, ga.getX(), ga.getY(), ga.getWidth(), ga.getHeight());
            map.put(shape, node);
        }
    }

    private void updateCoordinates(GraphicsAlgorithm compositeGA, Map<Shape, SimpleNode> shapes,
            List<SimpleRelationship> relationships) {
        // make sure we clear the text for the composite
        final int minY = compositeGA.getY() + StyleUtil.COMPOSITE_INNER_EDGE * 2 + StyleUtil.COMPOSITE_OUTER_EDGE;
        int delta = 0;
        for (SimpleNode node : shapes.values()) {
            if (((int) node.getY()) < minY) {
                int tmpDelta = minY - (int) node.getY();
                if (tmpDelta > delta) {
                    delta = tmpDelta;
                }
            }
        }
        for (Entry<Shape, SimpleNode> entry : shapes.entrySet()) {
            final SimpleNode node = entry.getValue();
            GraphicsAlgorithm ga = entry.getKey().getGraphicsAlgorithm();
            ga.setX((int) node.getX());
            ga.setY(((int) node.getY()) + delta);
        }

        final IGaService gaService = Graphiti.getGaService();
        for (SimpleRelationship relationship : relationships) {
            final FreeFormConnection connection = (FreeFormConnection) relationship.getGraphData();
            final LayoutBendPoint[] bendPoints = relationship.getBendPoints();
            connection.getBendpoints().clear();
            for (LayoutBendPoint bendPoint : bendPoints) {
                Point point = gaService.createPoint((int) bendPoint.getX(), ((int) bendPoint.getY()) + delta);
                connection.getBendpoints().add(point);
            }
        }
    }

    /**
     * We put the components with the most references at the top of the list.
     */
    private List<Component> getSortedComponents(Composite composite) {
        if (composite == null) {
            return Collections.emptyList();
        }
        final List<Component> components = new ArrayList<Component>(composite.getComponent());
        Collections.sort(components, new Comparator<Component>() {
            @Override
            public int compare(Component o1, Component o2) {
                return o2.getReference().size() - o1.getReference().size();
            }
        });
        return components;
    }

    /**
     * RecreateDiagramFeature
     * <p/>
     * Recreate and layout the entire diagram.
     */
    public static final class RecreateDiagramFeature extends AutoLayoutFeature {

        /**
         * Create a new RecreateDiagramFeature.
         * 
         * @param fp the feature provider.
         */
        public RecreateDiagramFeature(IFeatureProvider fp) {
            super(fp);
        }

        @Override
        public void execute(ICustomContext context) {
            final ContainerShape shape = (ContainerShape) context.getPictogramElements()[0];
            final Composite composite = (Composite) getBusinessObjectForPictogramElement(shape);
            final IRemoveContext removeContext = new RemoveContext(shape);
            final IRemoveFeature removeFeature = new CascadingRemoveFeature(getFeatureProvider());
            if (removeFeature.canExecute(removeContext)) {
                removeFeature.execute(removeContext);
                final AddContext addContext = new AddContext();
                addContext.setTargetContainer(getDiagram());
                addContext.setNewObject(composite);
                final PictogramElement newCompositeShape = getFeatureProvider().addIfPossible(addContext);
                super.execute(new CustomContext(new PictogramElement[] {newCompositeShape }));
            } else {
                super.execute(context);
            }
        }
        
    }

    private static final class ConnectionRelationship extends SimpleRelationship {

        final private Connection _connection;

        private ConnectionRelationship(LayoutEntity sourceEntity, LayoutEntity destinationEntity,
                boolean bidirectional, Connection connection) {
            super(sourceEntity, destinationEntity, bidirectional);
            _connection = connection;
        }

        @Override
        public Object getGraphData() {
            return _connection;
        }

    }

    @Override
    public String getImageId() {
        return ImageProvider.IMG_16_AUTO_LAYOUT;
    }

}
