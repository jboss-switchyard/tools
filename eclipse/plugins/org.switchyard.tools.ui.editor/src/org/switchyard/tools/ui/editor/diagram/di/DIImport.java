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
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
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
import org.switchyard.tools.ui.editor.diagram.AutoLayoutFeature;

/**
 * @author bfitzpat
 * 
 */
public class DIImport {

    private Diagram _diagram;
    private TransactionalEditingDomain _domain;
    private ModelHandler _modelHandler;
    private IFeatureProvider _featureProvider;

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

            IAddFeature addFeature = featureProvider.getAddFeature(addContext);
            if (addFeature.canAdd(addContext)) {
                PictogramElement pe = addFeature.add(addContext);
                if (pe != null) {
                    CustomContext context = new CustomContext(new PictogramElement[] {pe });
                    ICustomFeature layoutFeature = new AutoLayoutFeature(featureProvider);
                    if (layoutFeature.canExecute(context)) {
                        layoutFeature.execute(context);
                    }
                }
            }
        }
        return null;
    }

    /**
     * @param parent Graphics Algorithm
     * @param gaSearchType Graphics Algorithm class to look for
     * @return found GA
     */
    public static GraphicsAlgorithm findChildGA(GraphicsAlgorithm parent, Class<?> gaSearchType) {
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

}
