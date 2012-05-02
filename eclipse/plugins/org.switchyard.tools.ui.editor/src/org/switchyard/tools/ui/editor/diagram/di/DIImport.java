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
package org.switchyard.tools.ui.editor.diagram.di;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.LayoutContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IPeService;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.ui.editor.core.ModelHandler;
import org.switchyard.tools.ui.editor.diagram.StyleUtil;
import org.switchyard.tools.ui.editor.util.CalculateUtil;

/**
 * @author bfitzpat
 *
 */
public class DIImport {

    private Diagram _diagram;
    private TransactionalEditingDomain _domain;
    private ModelHandler _modelHandler;
    private IFeatureProvider _featureProvider;
    private final IPeService _peService = Graphiti.getPeService();
    private int _furthestX = 0;
    private int _furthestY = 0;

    /**
     * Look for model diagram interchange information and generate all shapes
     * for the diagrams.
     * 
     * NB! Currently only first found diagram is generated.
     */
    public void generateFromDI() {

        final List<DocumentRoot> documentRoots = _modelHandler.getAll(DocumentRoot.class);

        _domain.getCommandStack().execute(new RecordingCommand(_domain) {
            @Override
            protected void doExecute() {

                if (!documentRoots.isEmpty()) {
                    DocumentRoot docRoot = documentRoots.get(0);
                    addComposites(docRoot, _diagram, _featureProvider);
                }
            }

        });
    }

    /**
     * @param diagram diagram
     */
    public void setDiagram(Diagram diagram) {
        this._diagram = diagram;
    }

    /**
     * @param editingDomain domain
     */
    public void setDomain(TransactionalEditingDomain editingDomain) {
        this._domain = editingDomain;

    }

    /**
     * @param modelHandler model handler
     */
    public void setModelHandler(ModelHandler modelHandler) {
        this._modelHandler = modelHandler;
    }

    /**
     * @param featureProvider feature provider
     */
    public void setFeatureProvider(IFeatureProvider featureProvider) {
        this._featureProvider = featureProvider;
    }

    private ContainerShape addComposites(DocumentRoot root, Diagram diagram, IFeatureProvider featureProvider) {
        int x = 20;
        int y = 20;

        SwitchYardType switchyardRoot = root.getSwitchyard();
        if (switchyardRoot != null && switchyardRoot.getComposite() != null) {
            Composite composite = switchyardRoot.getComposite();

            // Create the context information
            AddContext addContext = new AddContext();
            addContext.setNewObject(composite);
            addContext.setTargetContainer(diagram);
            addContext.setX(x);
            addContext.setY(y);
            _furthestX = x;
            _furthestY = y;

            IAddFeature addFeature = featureProvider.getAddFeature(addContext);
            if (addFeature.canAdd(addContext)) {
                addFeature.add(addContext);
            }

            ContainerShape compositeContainerShape = (ContainerShape) featureProvider
                    .getPictogramElementForBusinessObject(composite).getGraphicsAlgorithm().eContainer();

            addCompositeServices(composite, compositeContainerShape, featureProvider, diagram, x, y);

            addComponents(composite, compositeContainerShape, featureProvider, diagram, x, y);

            addCompositeReferences(composite, compositeContainerShape, featureProvider, diagram, x, y);

            handleCompositeReferences(diagram, featureProvider, compositeContainerShape);

            expandCompositeShapeIfNecessary(compositeContainerShape);

            return compositeContainerShape;
        }
        return null;
    }

    private void layoutAll() {
        for (Shape shape : _diagram.getChildren()) {
            PictogramElement pe = shape.getGraphicsAlgorithm().getPictogramElement();
            LayoutContext context = new LayoutContext(pe);
            ILayoutFeature feature = _featureProvider.getLayoutFeature(context);
            if (feature == null) {
                continue;
            }
            if (feature.canLayout(context)) {
                feature.layout(context);
            }
        }
    }

    private void expandCompositeShapeIfNecessary(ContainerShape compositeContainerShape) {
        int farX = 0;
        int farY = 0;
        for (Shape shape : compositeContainerShape.getChildren()) {
            GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();
            int computedFarX = ga.getX() + ga.getWidth();
            int computedFarY = ga.getY() + ga.getHeight();
            if (computedFarX > farX) {
                farX = computedFarX;
            }
            if (computedFarY > farY) {
                farY = computedFarY;
            }
        }

        Composite composite = (Composite) _featureProvider.getBusinessObjectForPictogramElement(compositeContainerShape);
        if (composite != null && !composite.getReference().isEmpty()) {
            farX = farX - (StyleUtil.LARGE_RIGHT_ARROW_WIDTH / 2);
        }

        GraphicsAlgorithm containerGA = compositeContainerShape.getGraphicsAlgorithm();
        if (farX == 0) {
            farX = StyleUtil.COMPOSITE_WIDTH;
        }
        if (farY == 0) {
            farY = StyleUtil.COMPOSITE_HEIGHT;
        }
        containerGA.setHeight(farY + 50);
        containerGA.setWidth(farX + 50);

        // EList<Anchor> anchors = compositeContainerShape.getAnchors();
        // for (Anchor anchor : anchors) {
        // Object anchorObj =
        // featureProvider.getBusinessObjectForPictogramElement(anchor);
        // if (anchorObj != null) {
        // GraphicsAlgorithm gaAnchor = anchor.getGraphicsAlgorithm();
        // gaAnchor.setY(gaAnchor.getY() + 20);
        // }
        // }

        layoutAll();
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

    private void addComponents(Composite composite, ContainerShape compositeContainerShape,
            IFeatureProvider featureProvider, Diagram diagram, int x, int y) {
        int innerx = compositeContainerShape.getGraphicsAlgorithm().getX() + 20;
        int innery = compositeContainerShape.getGraphicsAlgorithm().getY() + 30;
        int colOneX = innerx;
        int colTwoX = innerx + StyleUtil.COMPONENT_WIDTH + 50;
        int colThreeX = colTwoX + StyleUtil.COMPONENT_WIDTH + 50;

        EList<Component> components = composite.getComponent();
        for (Iterator<Component> iterator = components.iterator(); iterator.hasNext();) {
            Component component = (Component) iterator.next();

            boolean hasRef = (component.getReference().size() > 0);
            boolean hasCService = (component.getService().size() > 0);

            if (hasRef && hasCService) {
                innerx = colTwoX;
            } else if (hasRef) {
                innerx = colOneX;
            } else if (hasCService) {
                innerx = colThreeX;
            }

            AddContext addComponentContext = new AddContext();
            addComponentContext.setNewObject(component);
            addComponentContext.setTargetContainer(compositeContainerShape);
            addComponentContext.setX(innerx);
            addComponentContext.setY(innery);

            if (innerx > _furthestX) {
                _furthestX = innerx;
            }
            if (innery > _furthestY) {
                _furthestY = innery;
            }

            IAddFeature addComponentFeature = featureProvider.getAddFeature(addComponentContext);
            if (addComponentFeature.canAdd(addComponentContext)) {
                addComponentFeature.add(addComponentContext);
            }

            ContainerShape componentContainerShape = (ContainerShape) featureProvider
                    .getPictogramElementForBusinessObject(component).getGraphicsAlgorithm().eContainer();

            GraphicsAlgorithm componentGa = findChildGA(componentContainerShape.getGraphicsAlgorithm(), Text.class);
            if (componentGa != null && componentGa instanceof Text) {
                Text text = (Text) componentGa;
                IDimension dims = CalculateUtil.calculateTextSize(component.getName(), text.getFont());
                if (componentGa.getWidth() < dims.getWidth()) {
                    int diff = dims.getWidth() - componentGa.getWidth();
                    componentGa.setWidth(dims.getWidth());
                    componentContainerShape.getGraphicsAlgorithm().setWidth(
                            diff + componentContainerShape.getGraphicsAlgorithm().getWidth());
                    GraphicsAlgorithm rectGa = findChildGA(componentContainerShape.getGraphicsAlgorithm(),
                            RoundedRectangle.class);
                    if (rectGa != null && rectGa instanceof RoundedRectangle) {
                        rectGa.setWidth(componentContainerShape.getGraphicsAlgorithm().getWidth()
                                - (StyleUtil.COMPONENT_INVISIBLE_RECT_RIGHT * 2));
                    }
                }
            }

            addComponentServices(component, componentContainerShape, featureProvider, diagram, x, y);

            innery = innery + StyleUtil.SERVICE_HEIGHT + 20;
        }
        for (Iterator<Component> iterator = components.iterator(); iterator.hasNext();) {
            Component component = (Component) iterator.next();
            ContainerShape componentContainerShape = (ContainerShape) featureProvider
                    .getPictogramElementForBusinessObject(component).getGraphicsAlgorithm().eContainer();
            handleComponentReferences(diagram, featureProvider, componentContainerShape);
            handleComponentServiceReferences(diagram, featureProvider, componentContainerShape);
        }
    }

    private void addComponentServices(Component component, ContainerShape componentContainerShape,
            IFeatureProvider featureProvider, Diagram diagram, int x, int y) {
        EList<ComponentService> services = component.getService();
        for (Iterator<ComponentService> iterator1 = services.iterator(); iterator1.hasNext();) {
            ComponentService service = (ComponentService) iterator1.next();

            if (featureProvider.getPictogramElementForBusinessObject(service) == null) {
                AddContext addServiceContext = new AddContext();
                addServiceContext.setNewObject(service);
                addServiceContext.setTargetContainer(componentContainerShape);
                addServiceContext.setX(x);
                addServiceContext.setY(y);

                IAddFeature addServiceFeature = featureProvider.getAddFeature(addServiceContext);
                if (addServiceFeature != null && addServiceFeature.canAdd(addServiceContext)) {
                    addServiceFeature.add(addServiceContext);
                }
            }
        }
    }

    private void addCompositeReferences(Composite composite, ContainerShape compositeContainerShape,
            IFeatureProvider featureProvider, Diagram diagram, int x, int y) {
        int innerx = compositeContainerShape.getGraphicsAlgorithm().getX() + 50;
        int innery = compositeContainerShape.getGraphicsAlgorithm().getY() + 20;
        int colOneX = innerx;
        int colTwoX = colOneX + StyleUtil.COMPONENT_WIDTH + 50;
        int colThreeX = colTwoX + StyleUtil.COMPONENT_WIDTH + 50;
        int colFourX = colThreeX + StyleUtil.COMPOSITE_REFERENCE_WIDTH + (StyleUtil.COMPOSITE_REFERENCE_WIDTH / 2) + 50;

        if (composite.getReference() != null && composite.getReference().size() > 0) {
            EList<Reference> references = composite.getReference();
            for (Reference compositeReference : references) {

                innerx = colFourX;

                // Create the context information
                AddContext addRefContext = new AddContext();
                addRefContext.setNewObject(compositeReference);
                addRefContext.setTargetContainer(compositeContainerShape);

                addRefContext.setX(innerx);
                addRefContext.setY(innery);

                if (innerx > _furthestX) {
                    _furthestX = innerx;
                }
                if (innery > _furthestY) {
                    _furthestY = innery;
                }

                IAddFeature addRefFeature = featureProvider.getAddFeature(addRefContext);
                if (addRefFeature.canAdd(addRefContext)) {
                    addRefFeature.add(addRefContext);
                }

                innery = innery + StyleUtil.COMPOSITE_REFERENCE_HEIGHT + 20;

                ContainerShape componentContainerShape = (ContainerShape) featureProvider
                        .getPictogramElementForBusinessObject(compositeReference).getGraphicsAlgorithm().eContainer();

                GraphicsAlgorithm componentGa = findChildGA(componentContainerShape.getGraphicsAlgorithm(), Text.class);
                if (componentGa != null && componentGa instanceof Text) {
                    Text text = (Text) componentGa;
                    IDimension dims = CalculateUtil.calculateTextSize(compositeReference.getName(), text.getFont());
                    if (componentGa.getWidth() < dims.getWidth()) {
                        int diff = dims.getWidth() - componentGa.getWidth();
                        componentGa.setWidth(dims.getWidth());
                        componentContainerShape.getGraphicsAlgorithm().setWidth(
                                diff + componentContainerShape.getGraphicsAlgorithm().getWidth());
                        GraphicsAlgorithm rectGa = findChildGA(componentContainerShape.getGraphicsAlgorithm(),
                                Polygon.class);
                        if (rectGa != null && rectGa instanceof Polygon) {
                            Polygon polygon = (Polygon) rectGa;
                            int width = componentContainerShape.getGraphicsAlgorithm().getWidth();
                            int height = componentContainerShape.getGraphicsAlgorithm().getHeight();
                            EList<Point> points = polygon.getPoints();
                            float maxX = 0;
                            float maxY = 0;
                            for (Iterator<Point> iteratorPoints = points.iterator(); iteratorPoints.hasNext();) {
                                Point point = iteratorPoints.next();
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

                            if (scaleX != 1 || scaleY != 1) {
                                int i = -1;
                                for (Iterator<Point> iteratorPoints = points.iterator(); iteratorPoints.hasNext();) {
                                    i++;
                                    Point point = iteratorPoints.next();
                                    int newX = Math.round(point.getX() * scaleX);
                                    if (i == 5) {
                                        left = newX;
                                    }
                                    point.setX(newX);
                                    int newY = Math.round(point.getY() * scaleY);
                                    point.setY(newY);
                                }
                            }
                            text.setX(left + 10);
                            text.setY(0);
                            text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
                            text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
                        }
                    }
                }
            }
        }
    }

    private void addCompositeServices(Composite composite, ContainerShape compositeContainerShape,
            IFeatureProvider featureProvider, Diagram diagram, int x, int y) {
        int innerx = compositeContainerShape.getGraphicsAlgorithm().getX() + 50;
        int innery = compositeContainerShape.getGraphicsAlgorithm().getY() + 30;
        EList<Service> services = composite.getService();
        for (Iterator<Service> iterator = services.iterator(); iterator.hasNext();) {
            Service service = (Service) iterator.next();

            boolean isPromoted = service.getPromote() != null;
            if (isPromoted) {
                innerx = compositeContainerShape.getGraphicsAlgorithm().getX()
                        - StyleUtil.COMPOSITE_INVISIBLE_RECT_RIGHT / 2;
            }

            if (featureProvider.getPictogramElementForBusinessObject(service) == null) {
                AddContext addServiceContext = new AddContext();
                addServiceContext.setNewObject(service);
                addServiceContext.setTargetContainer(compositeContainerShape);
                addServiceContext.setX(innerx);
                addServiceContext.setY(innery);

                if (innerx > _furthestX) {
                    _furthestX = innerx;
                }
                if (innery > _furthestY) {
                    _furthestY = innery;
                }

                IAddFeature addServiceFeature = featureProvider.getAddFeature(addServiceContext);
                if (addServiceFeature.canAdd(addServiceContext)) {
                    addServiceFeature.add(addServiceContext);
                }
            }

            innery = innery + StyleUtil.SERVICE_HEIGHT + 20;

            ContainerShape componentContainerShape = (ContainerShape) featureProvider
                    .getPictogramElementForBusinessObject(service).getGraphicsAlgorithm().eContainer();

            Polygon polygon = null;
            GraphicsAlgorithm componentGa = findChildGA(componentContainerShape.getGraphicsAlgorithm(), Text.class);
            if (componentGa != null && componentGa instanceof Text) {
                Text text = (Text) componentGa;
                IDimension dims = CalculateUtil.calculateTextSize(service.getName(), text.getFont());
                if (componentGa.getWidth() < dims.getWidth()) {
                    int diff = dims.getWidth() - componentGa.getWidth();
                    componentGa.setWidth(dims.getWidth());
                    componentContainerShape.getGraphicsAlgorithm().setWidth(
                            diff + componentContainerShape.getGraphicsAlgorithm().getWidth());
                    GraphicsAlgorithm rectGa = findChildGA(componentContainerShape.getGraphicsAlgorithm(),
                            Polygon.class);
                    if (rectGa != null && rectGa instanceof Polygon) {
                        polygon = (Polygon) rectGa;
                        int width = componentContainerShape.getGraphicsAlgorithm().getWidth();
                        int height = componentContainerShape.getGraphicsAlgorithm().getHeight();
                        EList<Point> points = polygon.getPoints();
                        float maxX = 0;
                        float maxY = 0;
                        for (Iterator<Point> iteratorPoints = points.iterator(); iteratorPoints.hasNext();) {
                            Point point = iteratorPoints.next();
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

                        if (scaleX != 1 || scaleY != 1) {
                            int i = -1;
                            for (Iterator<Point> iteratorPoints = points.iterator(); iteratorPoints.hasNext();) {
                                i++;
                                Point point = iteratorPoints.next();
                                int newX = Math.round(point.getX() * scaleX);
                                if (i == 5) {
                                    left = newX;
                                }
                                point.setX(newX);
                                int newY = Math.round(point.getY() * scaleY);
                                point.setY(newY);
                            }
                        }
                        text.setX(left + 10);
                        text.setY(0);
                        text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
                        text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
                    }
                }
            }

        }
    }

    private ContainerShape findShapeWithName(IFeatureProvider fp, ContainerShape root, String name) {
        if (root instanceof Diagram) {
            Collection<Shape> shapes = _peService.getAllContainedShapes(root);
            for (Shape shape : shapes) {
                Object test = fp.getBusinessObjectForPictogramElement(shape);
                String testName = null;
                if (test instanceof Component) {
                    Component testcomponent = (Component) test;
                    testName = testcomponent.getName();
                } else if (test instanceof Service) {
                    Service testservice = (Service) test;
                    testName = testservice.getName();
                } else if (test instanceof ComponentService) {
                    ComponentService testservice = (ComponentService) test;
                    testName = testservice.getName();
                } else if (test instanceof Composite) {
                    Composite testcomposite = (Composite) test;
                    testName = testcomposite.getName();
                }
                if (testName != null && testName.contentEquals(name)) {
                    return (ContainerShape) shape;
                }
            }
        }
        return null;
    }

    /**
     * @param fp feature provider
     * @param root root shape
     * @param name name of shape to find
     * @return shapes found with name
     */
    public static ContainerShape[] findShapesWithName(IFeatureProvider fp, ContainerShape root, String name) {
        ArrayList<ContainerShape> foundItems = new ArrayList<ContainerShape>();
        if (root instanceof Diagram) {
            IPeService peService = Graphiti.getPeService();
            Collection<Shape> shapes = peService.getAllContainedShapes(root);
            for (Shape shape : shapes) {
                Object test = fp.getBusinessObjectForPictogramElement(shape);
                String testName = null;
                if (test instanceof Component) {
                    Component testcomponent = (Component) test;
                    testName = testcomponent.getName();
                } else if (test instanceof Service) {
                    Service testservice = (Service) test;
                    testName = testservice.getName();
                } else if (test instanceof ComponentService) {
                    ComponentService testservice = (ComponentService) test;
                    testName = testservice.getName();
                } else if (test instanceof Composite) {
                    Composite testcomposite = (Composite) test;
                    testName = testcomposite.getName();
                } else if (test instanceof Reference) {
                    Reference testref = (Reference) test;
                    testName = testref.getName();
                } else {
                    System.out.println("Couldn't find shape named '" + name + "'");
                }
                if (testName != null && testName.contentEquals(name) && shape instanceof ContainerShape) {
                    foundItems.add((ContainerShape) shape);
                }
            }
        }
        return foundItems.toArray(new ContainerShape[foundItems.size()]);
    }

    /**
     * @param fp feature provider
     * @param root root shape
     * @param name name of shape to find
     * @return anchors found with name
     */
    public static Anchor[] findAnchorsWithName(IFeatureProvider fp, ContainerShape root, String name) {
        ArrayList<Anchor> foundItems = new ArrayList<Anchor>();
        if (root instanceof Diagram) {
            IPeService peService = Graphiti.getPeService();
            Collection<Shape> shapes = peService.getAllContainedShapes(root);
            for (Shape shape : shapes) {
                if (shape instanceof ContainerShape) {
                    EList<Anchor> anchors = shape.getAnchors();
                    String anchortestname = null;
                    for (Anchor anchor : anchors) {
                        Object anchortest = fp.getBusinessObjectForPictogramElement(anchor);
                        if (anchortest instanceof ComponentService) {
                            ComponentService testservice = (ComponentService) anchortest;
                            anchortestname = testservice.getName();
                            if (anchortestname != null && anchortestname.contentEquals(name)) {
                                foundItems.add(anchor);
                            }
                        } else if (anchortest instanceof Service) {
                            Service testservice = (Service) anchortest;
                            anchortestname = testservice.getName();
                            if (anchortestname != null && anchortestname.contentEquals(name)) {
                                foundItems.add(anchor);
                            }
                        } else if (anchortest instanceof Reference) {
                            Reference testref = (Reference) anchortest;
                            anchortestname = testref.getName();
                            if (anchortestname != null && anchortestname.contentEquals(name)) {
                                foundItems.add(anchor);
                            }
                        } else if (anchortest instanceof ComponentReference) {
                            ComponentReference testref = (ComponentReference) anchortest;
                            anchortestname = testref.getName();
                            if (anchortestname != null && anchortestname.contentEquals(name)) {
                                foundItems.add(anchor);
                            }
                        }
                    }
                }
            }
        }
        return foundItems.toArray(new Anchor[foundItems.size()]);
    }

    private void handleCompositeReferences(Diagram diagram, IFeatureProvider featureProvider, ContainerShape parent) {

        EList<Shape> shapes = parent.getChildren();
        for (Shape shape : shapes) {
            Object shapeObj = featureProvider.getBusinessObjectForPictogramElement(shape);
            if (shapeObj instanceof Reference) {
                Reference ref = (Reference) shapeObj;
                if (!ref.getPromote().isEmpty()) {
                    String referencedShapeName = ref.getPromote().get(0).getName();
                    Anchor[] anchors = findAnchorsWithName(featureProvider, diagram, referencedShapeName);
                    Anchor sourceAnchor = null;
                    for (int i = 0; i < anchors.length; i++) {
                        Object testObj = featureProvider.getBusinessObjectForPictogramElement(anchors[i]);
                        if (testObj instanceof ComponentReference) {
                            sourceAnchor = anchors[i];
                            break;
                        }
                    }
                    Anchor targetAnchor = shape.getAnchors().get(0);

                    AddConnectionContext addReferenceContext = new AddConnectionContext(sourceAnchor, targetAnchor);
                    ArrayList<String> targetRef = new ArrayList<String>();
                    targetRef.add(referencedShapeName);
                    addReferenceContext.setNewObject(ref);
                    addReferenceContext.setTargetContainer((ContainerShape) parent);

                    IAddFeature addServiceFeature = featureProvider.getAddFeature(addReferenceContext);
                    if (addServiceFeature.canAdd(addReferenceContext)) {
                        addServiceFeature.add(addReferenceContext);
                    }
                }
            }
        }
    }

    private void handleComponentReferences(Diagram diagram, IFeatureProvider featureProvider, ContainerShape parent) {
        Object parentObj = featureProvider.getBusinessObjectForPictogramElement(parent);

        if (parentObj instanceof Component) {
            Component component = (Component) parentObj;
            EList<ComponentReference> references = component.getReference();
            for (ComponentReference componentReference : references) {
                String referencedShapeName = componentReference.getName();
                Anchor targetAnchor = null;
                Anchor sourceAnchor = null;
                Anchor[] anchors = findAnchorsWithName(featureProvider, diagram, referencedShapeName);
                for (Anchor anchor : anchors) {
                    Object testObj = featureProvider.getBusinessObjectForPictogramElement(anchor);
                    if (testObj instanceof ComponentReference) {
                        ComponentReference cref = (ComponentReference) testObj;
                        if (cref.getName().contentEquals(referencedShapeName)) {
                            targetAnchor = anchor;
                            continue;
                        }
                    } else if (testObj instanceof ComponentService) {
                        ComponentService cs = (ComponentService) testObj;
                        if (cs.getName().contentEquals(referencedShapeName)) {
                            sourceAnchor = anchor;
                            continue;
                        }
                    }
                }
                if (sourceAnchor != null && targetAnchor != null) {
                    if (sourceAnchor.getParent() != targetAnchor.getParent()) {
                        AddConnectionContext addReferenceContext = new AddConnectionContext(sourceAnchor, targetAnchor);
                        ArrayList<String> targetRef = new ArrayList<String>();
                        targetRef.add(referencedShapeName);
                        addReferenceContext.setNewObject(componentReference);
                        addReferenceContext.setTargetContainer((ContainerShape) parent);

                        IAddFeature addServiceFeature = featureProvider.getAddFeature(addReferenceContext);
                        if (addServiceFeature.canAdd(addReferenceContext)) {
                            addServiceFeature.add(addReferenceContext);
                        }
                    }
                }
            }
        }
    }

    private void handleComponentServiceReferences(Diagram diagram, IFeatureProvider featureProvider,
            ContainerShape parent) {
        Object parentObj = featureProvider.getBusinessObjectForPictogramElement(parent);

        if (parentObj instanceof Component) {
            Component component = (Component) parentObj;
            EList<ComponentService> services = component.getService();
            for (ComponentService componentService : services) {
                String referencedShapeName = componentService.getName();
                ContainerShape targetShape = findShapeWithName(featureProvider, diagram, referencedShapeName);
                Object targetObj = featureProvider.getBusinessObjectForPictogramElement(targetShape);
                String sourceName = component.getName();
                String targetName = null;
                if (targetObj instanceof Component) {
                    Component targetComponent = (Component) targetObj;
                    targetName = targetComponent.getName();
                }

                if (sourceName != null && targetName != null && sourceName.contentEquals(targetName)) {
                    return;
                }

                if (targetShape != null) {
                    EList<Anchor> targetAnchors = targetShape.getAnchors();
                    Anchor target = null;
                    for (Anchor anchor : targetAnchors) {
                        Object anchorObj = featureProvider.getBusinessObjectForPictogramElement(anchor);
                        if (anchorObj instanceof ComponentService) {
                            ComponentService cservice = (ComponentService) anchorObj;
                            if (cservice.getName().contentEquals(referencedShapeName)) {
                                target = anchor;
                                break;
                            }
                        } else if (anchorObj instanceof Service) {
                            Service service = (Service) anchorObj;
                            if (service.getName().contentEquals(referencedShapeName)) {
                                target = anchor;
                                break;
                            }
                        }
                    }
                    EList<Anchor> sourceAnchors = parent.getAnchors();
                    Anchor source = null;
                    for (Anchor anchor : sourceAnchors) {
                        Object anchorObj = featureProvider.getBusinessObjectForPictogramElement(anchor);
                        if (anchorObj instanceof ComponentReference) {
                            ComponentReference cref = (ComponentReference) anchorObj;
                            if (cref.getName().contentEquals(referencedShapeName)) {
                                source = anchor;
                                break;
                            }
                        } else if (anchorObj instanceof ComponentService) {
                            ComponentService cservice = (ComponentService) anchorObj;
                            if (cservice.getName().contains(referencedShapeName)) {
                                source = anchor;
                                break;
                            }
                        }
                    }
                    if (source != null && target != null) {
                        AddConnectionContext addReferenceContext = new AddConnectionContext(target, source);
                        ArrayList<String> targetRef = new ArrayList<String>();
                        targetRef.add(targetName);
                        addReferenceContext.setNewObject(componentService);
                        addReferenceContext.setTargetContainer((ContainerShape) parent);

                        IAddFeature addServiceFeature = featureProvider.getAddFeature(addReferenceContext);
                        if (addServiceFeature != null && addServiceFeature.canAdd(addReferenceContext)) {
                            addServiceFeature.add(addReferenceContext);
                        }
                    }
                }
            }
        }
    }
}
