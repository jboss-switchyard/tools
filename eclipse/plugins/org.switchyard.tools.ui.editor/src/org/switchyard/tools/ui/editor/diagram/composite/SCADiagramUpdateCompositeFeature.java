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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.ui.editor.diagram.StyleUtil;
import org.switchyard.tools.ui.editor.util.GraphitiUtil;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramUpdateCompositeFeature extends AbstractUpdateFeature {

    private boolean _hasDoneChanges;

    /**
     * @param fp the feature provider
     */
    public SCADiagramUpdateCompositeFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canUpdate(IUpdateContext context) {
        // return true, if linked business object is a Composite
        Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
        return (bo instanceof Composite);
    }

    @Override
    public IReason updateNeeded(IUpdateContext context) {
        // retrieve name from pictogram model
        PictogramElement pictogramElement = context.getPictogramElement();
        String pictogramName = null;
        Text foundText = GraphitiUtil.findChildGA(pictogramElement.getGraphicsAlgorithm(), Text.class);
        if (foundText != null) {
            pictogramName = foundText.getValue();
        }

        // retrieve name from business model
        Composite composite = (Composite) getBusinessObjectForPictogramElement(pictogramElement);
        String businessName = composite.getName();

        // update needed, if names are different
        boolean updateNameNeeded = pictogramName == null ? businessName != null : !pictogramName.equals(businessName);
        if (updateNameNeeded) {
            return Reason.createTrueReason("Composite name is out of date");
        }

        if (getChildrenNotInDiagram(composite).length > 0) {
            return Reason.createTrueReason("Add missing components, services and references");
        }
        return childrenNeedUpdating(pictogramElement);
    }

    @Override
    public boolean update(IUpdateContext context) {
        _hasDoneChanges = false;

        // retrieve name from business model
        PictogramElement pictogramElement = context.getPictogramElement();
        Composite composite = (Composite) getBusinessObjectForPictogramElement(pictogramElement);
        String businessName = composite.getName();

        // Set name in pictogram model
        GraphicsAlgorithm ga = pictogramElement.getGraphicsAlgorithm();
        Text text = GraphitiUtil.findChildGA(ga, Text.class);
        if (text != null && !text.getValue().equals(businessName)) {
            text.setValue(businessName);
            _hasDoneChanges = true;
        }

        boolean layout = false;

        // update child shapes
        if (updateChildren((ContainerShape) pictogramElement)) {
            layout = true;
            _hasDoneChanges = true;
        }

        // add missing shapes
        if (addMissingChildren(composite, (ContainerShape) pictogramElement)) {
            layout = true;
            _hasDoneChanges = true;
        }

        if (layout) {
            // make sure the shape is big enough to hold everything.
            layoutPictogramElement(pictogramElement);
        }

        return _hasDoneChanges;
    }

    @Override
    public boolean hasDoneChanges() {
        return _hasDoneChanges;
    }

    private boolean updateChildren(ContainerShape containerShape) {
        boolean changed = false;
        for (Shape shape : new ArrayList<Shape>(containerShape.getChildren())) {
            UpdateContext updateContext = new UpdateContext(shape);
            IUpdateFeature updateFeature = getFeatureProvider().getUpdateFeature(updateContext);
            if (updateFeature != null && updateFeature.canUpdate(updateContext)
                    && updateFeature.updateNeeded(updateContext).toBoolean()) {
                changed = updateFeature.update(updateContext) || changed;
            }
        }
        return changed;
    }

    private boolean addMissingChildren(Composite composite, ContainerShape containerShape) {
        boolean changed = false;

        AddContext addComponentContext = SCADiagramAddCompositeFeature.createComponentAddContext(getFeatureProvider(),
                containerShape);
        AddContext addServiceContext = SCADiagramAddCompositeFeature.createServiceAddContext(getFeatureProvider(),
                containerShape);
        AddContext addReferenceContext = SCADiagramAddCompositeFeature.createReferenceAddContext(getFeatureProvider(),
                containerShape);
        for (EObject missingChild : getChildrenNotInDiagram(composite)) {
            if (missingChild instanceof Component) {
                changed = addGraphicalRepresentation(addComponentContext, missingChild) != null || changed;
            } else if (missingChild instanceof Service) {
                changed = addGraphicalRepresentation(addServiceContext, missingChild) != null || changed;
            } else if (missingChild instanceof Reference) {
                changed = addGraphicalRepresentation(addReferenceContext, missingChild) != null || changed;
            }
        }
        return changed;
    }

    private PictogramElement addGraphicalRepresentation(AddContext context, Object object) {
        context.setNewObject(object);
        PictogramElement pe = super.addGraphicalRepresentation(context, object);
        if (pe == null) {
            context.setY(context.getY() + 2 * StyleUtil.COMPOSITE_CHILD_V_SPACING);
        } else {
            context.setY(context.getY() + pe.getGraphicsAlgorithm().getHeight() + StyleUtil.COMPOSITE_CHILD_V_SPACING);
        }
        return pe;
    }

    private EObject[] getChildrenNotInDiagram(Composite composite) {
        List<EObject> children = new ArrayList<EObject>();
        children.addAll(composite.getService());
        children.addAll(composite.getReference());
        children.addAll(composite.getComponent());

        return Graphiti.getPeService().getElementsNotInDiagram(children.toArray(new EObject[children.size()]),
                getDiagram());
    }

    private IReason childrenNeedUpdating(PictogramElement pe) {
        if (pe instanceof ContainerShape) {
            EList<Shape> children = ((ContainerShape) pe).getChildren();
            for (Shape shape : children) {
                UpdateContext updateContext = new UpdateContext(shape);
                IUpdateFeature updateFeature = getFeatureProvider().getUpdateFeature(updateContext);
                if (updateFeature != null && updateFeature.updateNeeded(updateContext).toBoolean()) {
                    return Reason.createTrueReason();
                }
            }
        }
        return Reason.createFalseReason();
    }
}
