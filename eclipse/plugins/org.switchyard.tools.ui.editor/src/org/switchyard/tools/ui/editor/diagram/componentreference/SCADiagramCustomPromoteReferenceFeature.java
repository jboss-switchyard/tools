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
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Multiplicity;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.core.ModelHandler;
import org.switchyard.tools.ui.editor.core.ModelHandlerLocator;
import org.switchyard.tools.ui.editor.diagram.StyleUtil;
import org.switchyard.tools.ui.editor.diagram.di.DIImport;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramCustomPromoteReferenceFeature extends AbstractCustomFeature {

    private boolean _hasDoneChanges = false;

    /**
     * @param fp the feature provider
     */
    public SCADiagramCustomPromoteReferenceFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public void execute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            if (bo instanceof Component) {
                Component component = (Component) bo;
                if (!component.getReference().isEmpty()) {
                    ComponentReference cref = component.getReference().get(0);
                    Shape[] shapes = DIImport.findShapesWithName(getFeatureProvider(), getDiagram(), cref.getName());
                    if (shapes != null && shapes.length > 0) {
                        for (int i = 0; i < shapes.length; i++) {
                            Object testObj = getFeatureProvider().getBusinessObjectForPictogramElement(shapes[i]);
                            if (testObj instanceof Reference) {
                                Reference reference = (Reference) testObj;
                                reference.getPromote().add(cref);
                                this._hasDoneChanges = true;
                            }
                        }
                        getDiagramEditor().refresh();
                    } else {
                        try {
                            // ContainerShape componentShape = (ContainerShape)
                            // pes[0];
                            Composite composite = (Composite) component.eContainer();
                            ModelHandler handler = ModelHandlerLocator.getModelHandler(getDiagram().eResource());
                            Reference newReference = handler.createCompositeReference(composite);
                            newReference.setName(cref.getName());
                            newReference.getPromote().add(cref);
                            newReference.setMultiplicity(Multiplicity._01);

                            ContainerShape cshape = (ContainerShape) getFeatureProvider()
                                    .getPictogramElementForBusinessObject(composite);

                            AddContext addRefContext = new AddContext();
                            addRefContext.setNewObject(newReference);
                            addRefContext.setTargetContainer(cshape);
                            addRefContext.setX(cshape.getGraphicsAlgorithm().getX()
                                    + cshape.getGraphicsAlgorithm().getWidth() - StyleUtil.LARGE_RIGHT_ARROW_WIDTH);
                            addRefContext.setY(pes[0].getGraphicsAlgorithm().getY());

                            IAddFeature addRefFeature = getFeatureProvider().getAddFeature(addRefContext);
                            if (addRefFeature.canAdd(addRefContext)) {
                                Shape referenceShape = (Shape) addRefFeature.add(addRefContext);
                                getDiagramEditor().refresh(referenceShape);

                                String referencedShapeName = cref.getName();
                                Anchor targetAnchor = null;
                                Anchor sourceAnchor = null;
                                Anchor[] anchors = DIImport.findAnchorsWithName(getFeatureProvider(), getDiagram(),
                                        referencedShapeName);
                                for (Anchor anchor : anchors) {
                                    Object anchorObj = getFeatureProvider()
                                            .getBusinessObjectForPictogramElement(anchor);
                                    if (anchorObj instanceof ComponentReference) {
                                        ComponentReference cref2 = (ComponentReference) anchorObj;
                                        if (cref2.getName().contentEquals(referencedShapeName)) {
                                            targetAnchor = anchor;
                                        }
                                    }
                                    if (anchorObj instanceof Reference) {
                                        Reference reference = (Reference) anchorObj;
                                        if (reference.getName().contentEquals(referencedShapeName)) {
                                            sourceAnchor = anchor;
                                        }
                                    }
                                }
                                if (sourceAnchor != null && targetAnchor != null) {
                                    if (sourceAnchor.getParent() != targetAnchor.getParent()) {
                                        // now define the connection between the
                                        // componentreference and the new
                                        // reference shape
                                        AddConnectionContext addReferenceContext = new AddConnectionContext(
                                                sourceAnchor, targetAnchor);
                                        ArrayList<String> targetRef = new ArrayList<String>();
                                        targetRef.add(referencedShapeName);
                                        addReferenceContext.setNewObject(cref);
                                        addReferenceContext.setTargetContainer(cshape);

                                        IAddFeature addConnectionFeature = getFeatureProvider().getAddFeature(
                                                addReferenceContext);
                                        if (addConnectionFeature != null
                                                && addConnectionFeature.canAdd(addReferenceContext)) {
                                            addConnectionFeature.add(addReferenceContext);
                                        }
                                    }
                                }

                            }

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }
        }
    }

    @Override
    public String getDescription() {
        return "Promote Component Reference";
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            if (bo instanceof Component) {
                Component component = (Component) bo;
                if (!component.getReference().isEmpty()) {
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public String getName() {
        return "Promote Component Reference";
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
