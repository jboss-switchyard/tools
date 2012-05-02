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
package org.switchyard.tools.ui.editor.diagram.service;

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.core.ModelHandler;
import org.switchyard.tools.ui.editor.core.ModelHandlerLocator;
import org.switchyard.tools.ui.editor.diagram.di.DIImport;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramCustomPromoteServiceFeature extends AbstractCustomFeature {

    private boolean _hasDoneChanges = false;

    /**
     * @param fp the feature provider
     */
    public SCADiagramCustomPromoteServiceFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public void execute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            if (bo instanceof Component) {
                Component component = (Component) bo;
                if (!component.getService().isEmpty()) {
                    ComponentService cservice = component.getService().get(0);
                    Shape[] shapes = DIImport
                            .findShapesWithName(getFeatureProvider(), getDiagram(), cservice.getName());
                    if (shapes != null && shapes.length > 0) {
                        for (int i = 0; i < shapes.length; i++) {
                            Object testObj = getFeatureProvider().getBusinessObjectForPictogramElement(shapes[i]);
                            if (testObj instanceof Service) {
                                Service service = (Service) testObj;
                                service.setPromote(cservice);
                                this._hasDoneChanges = true;
                            }
                        }
                        if (!this._hasDoneChanges) {
                            createAndConnectService(component, cservice);
                        }
                        getDiagramEditor().refresh();
                    } else {
                        createAndConnectService(component, cservice);
                    }
                }
            }
        }
    }

    private void createAndConnectService(Component component, ComponentService cservice) {
        try {
            Composite composite = (Composite) component.eContainer();
            ModelHandler handler = ModelHandlerLocator.getModelHandler(getDiagram().eResource());
            Service newService = handler.createService(composite);
            newService.setName(cservice.getName());
            newService.setPromote(cservice);

            ContainerShape cshape = (ContainerShape) getFeatureProvider().getPictogramElementForBusinessObject(
                    composite);

            AddContext addServiceContext = new AddContext();
            addServiceContext.setNewObject(newService);
            addServiceContext.setTargetContainer(cshape);
            addServiceContext.setX(0);
            addServiceContext.setY(0);

            IAddFeature addServiceFeature = getFeatureProvider().getAddFeature(addServiceContext);
            if (addServiceFeature.canAdd(addServiceContext)) {
                Shape serviceShape = (Shape) addServiceFeature.add(addServiceContext);
                getDiagramEditor().refresh(serviceShape);

                String referencedShapeName = cservice.getName();
                Anchor targetAnchor = null;
                Anchor sourceAnchor = null;
                Anchor[] anchors = DIImport
                        .findAnchorsWithName(getFeatureProvider(), getDiagram(), referencedShapeName);
                for (Anchor anchor : anchors) {
                    Object anchorObj = getFeatureProvider().getBusinessObjectForPictogramElement(anchor);
                    if (anchorObj instanceof ComponentService) {
                        ComponentService cservice2 = (ComponentService) anchorObj;
                        if (cservice2.getName().contentEquals(referencedShapeName)) {
                            targetAnchor = anchor;
                        }
                    }
                    if (anchorObj instanceof Service) {
                        Service service = (Service) anchorObj;
                        if (service.getName().contentEquals(referencedShapeName)) {
                            sourceAnchor = anchor;
                        }
                    }
                }
                if (sourceAnchor != null && targetAnchor != null) {
                    if (sourceAnchor.getParent() != targetAnchor.getParent()) {
                        // now define the connection between the
                        // componentservice and the new service shape
                        AddConnectionContext addReferenceContext = new AddConnectionContext(sourceAnchor, targetAnchor);
                        ArrayList<String> targetRef = new ArrayList<String>();
                        targetRef.add(referencedShapeName);
                        addReferenceContext.setNewObject(cservice);
                        addReferenceContext.setTargetContainer(cshape);

                        IAddFeature addConnectionFeature = getFeatureProvider().getAddFeature(addReferenceContext);
                        if (addConnectionFeature != null && addConnectionFeature.canAdd(addReferenceContext)) {
                            addConnectionFeature.add(addReferenceContext);
                        }
                    }
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getDescription() {
        return "Promote Component Service";
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            if (bo instanceof Component) {
                Component component = (Component) bo;
                if (!component.getService().isEmpty()) {
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public String getName() {
        return "Promote Component Service";
    }

    @Override
    public boolean hasDoneChanges() {
        return this._hasDoneChanges;
    }

    @Override
    public String getImageId() {
        return ImageProvider.IMG_16_PLUS;
    }

    @Override
    public boolean isAvailable(IContext context) {
        return true;
    }

}
