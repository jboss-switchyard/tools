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
package org.switchyard.tools.ui.editor.diagram.component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.internal.services.GraphitiInternal;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.switchyard.tools.ui.editor.diagram.StyleUtil;
import org.switchyard.tools.ui.editor.model.merge.ComponentMergedModelAdapter;
import org.switchyard.tools.ui.editor.model.merge.MergedModelUtil;
import org.switchyard.tools.ui.editor.util.GraphitiUtil;

/**
 * @author bfitzpat
 * 
 */
@SuppressWarnings("restriction")
public class SCADiagramUpdateComponentFeature extends AbstractUpdateFeature {

    private boolean _hasDoneChanges;

    /**
     * @param fp the feature provider
     */
    public SCADiagramUpdateComponentFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canUpdate(IUpdateContext context) {
        // return true, if linked business object is a Component
        Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
        return (bo instanceof Component);
    }

    @Override
    public IReason updateNeeded(IUpdateContext context) {
        PictogramElement pictogramElement = context.getPictogramElement();

        Component component = (Component) getBusinessObjectForPictogramElement(pictogramElement);

        // make sure the component still exists in the model
        if (!GraphitiInternal.getEmfService().isObjectAlive(component)) {
            return Reason.createTrueReason(String.format("Component {0} has been removed.", component.getName()));
        }

        // retrieve name from business model
        String businessName = component.getName();

        // retrieve name from pictogram model
        String pictogramName = null;
        Text foundText = GraphitiUtil.findChildGA(pictogramElement.getGraphicsAlgorithm(), Text.class);
        if (foundText != null) {
            pictogramName = foundText.getValue();
        }

        // update needed, if names are different
        boolean updateNameNeeded = pictogramName == null ? businessName != null : !pictogramName.equals(businessName);
        if (updateNameNeeded) {
            return Reason.createTrueReason("Component name is out of date");
        }

        if (getMissingChildren(component, (ContainerShape) pictogramElement).size() > 0) {
            return Reason.createTrueReason("Add missing services and references");
        }

        return childrenNeedUpdating(component, (ContainerShape) pictogramElement);
    }

    @Override
    public boolean update(IUpdateContext context) {
        // retrieve name from business model
        PictogramElement pictogramElement = context.getPictogramElement();
        Component component = (Component) getBusinessObjectForPictogramElement(pictogramElement);

        // remove it if it's gone
        if (!GraphitiInternal.getEmfService().isObjectAlive(component)) {
            IRemoveContext removeContext = new RemoveContext(pictogramElement);
            final IRemoveFeature removeFeature = getFeatureProvider().getRemoveFeature(removeContext);
            if (removeFeature != null && removeFeature.canRemove(removeContext)) {
                removeFeature.remove(removeContext);
                return true;
            }
        }

        String businessName = component.getName();

        Text text = GraphitiUtil.findChildGA(pictogramElement.getGraphicsAlgorithm(), Text.class);
        if (text != null && !text.getValue().equals(businessName)) {
            text.setValue(businessName);
            _hasDoneChanges = true;
        }

        // update child shapes
        _hasDoneChanges = updateChildren(component, (ContainerShape) pictogramElement) || _hasDoneChanges;

        // add missing shapes
        if (addMissingChildren(component, (ContainerShape) pictogramElement)) {
            _hasDoneChanges = true;
            layoutPictogramElement(pictogramElement);
        }

        return _hasDoneChanges;
    }

    @Override
    public boolean hasDoneChanges() {
        return _hasDoneChanges;
    }

    private boolean updateChildren(Component component, ContainerShape containerShape) {
        boolean changed = false;
        List<EObject> children = getChildren(component);
        for (Shape shape : new ArrayList<Shape>(containerShape.getChildren())) {
            if (children.contains(getBusinessObjectForPictogramElement(shape))) {
                UpdateContext updateContext = new UpdateContext(shape);
                IUpdateFeature updateFeature = getFeatureProvider().getUpdateFeature(updateContext);
                if (updateFeature != null && updateFeature.canUpdate(updateContext)
                        && updateFeature.updateNeeded(updateContext).toBoolean()) {
                    changed = updateFeature.update(updateContext) || changed;
                }
            } else {
                IRemoveContext removeContext = new RemoveContext(shape);
                final IRemoveFeature removeFeature = getFeatureProvider().getRemoveFeature(removeContext);
                if (removeFeature != null && removeFeature.canRemove(removeContext)) {
                    removeFeature.remove(removeContext);
                    changed = removeFeature.hasDoneChanges() || changed;
                }
            }
        }
        return changed;
    }

    private boolean addMissingChildren(Component component, ContainerShape containerShape) {
        boolean changed = false;

        AddContext addServiceContext = new AddContext();
        addServiceContext.setX(StyleUtil.COMPONENT_EDGE - 8);
        addServiceContext.setY(2 * StyleUtil.COMPONENT_EDGE + StyleUtil.COMPONENT_CHILD_V_SPACING
                * getChildShapeCount(containerShape, ComponentService.class));
        addServiceContext.setTargetContainer(containerShape);

        AddContext addReferenceContext = new AddContext();
        addReferenceContext.setX(containerShape.getGraphicsAlgorithm().getWidth() - StyleUtil.COMPONENT_EDGE - 8);
        addReferenceContext.setY(2 * StyleUtil.COMPONENT_EDGE + StyleUtil.COMPONENT_CHILD_V_SPACING
                * getChildShapeCount(containerShape, ComponentReference.class));
        addReferenceContext.setTargetContainer(containerShape);

        for (EObject missingChild : getMissingChildren(component, containerShape)) {
            if (missingChild instanceof ComponentService) {
                changed = addGraphicalRepresentation(addServiceContext, missingChild) != null || changed;
                addServiceContext.setY(addServiceContext.getY() + StyleUtil.COMPONENT_CHILD_V_SPACING);
            } else if (missingChild instanceof ComponentReference) {
                changed = addGraphicalRepresentation(addReferenceContext, missingChild) != null || changed;
                addReferenceContext.setY(addReferenceContext.getY() + StyleUtil.COMPONENT_CHILD_V_SPACING);
            }
        }
        return changed;
    }

    private int getChildShapeCount(ContainerShape containerShape, Class<?> boType) {
        int count = 0;
        for (Shape shape : containerShape.getChildren()) {
            if (boType.isInstance(getBusinessObjectForPictogramElement(shape))) {
                ++count;
            }
        }
        return count;
    }

    private List<EObject> getMissingChildren(Component component, ContainerShape containerShape) {
        List<EObject> children = getChildren(component);
        for (Shape shape : containerShape.getChildren()) {
            children.removeAll(Arrays.asList(Graphiti.getLinkService()
                    .getBusinessObjectForLinkedPictogramElement(shape)));
        }

        return children;
    }

    private IReason childrenNeedUpdating(Component component, ContainerShape containerShape) {
        List<EObject> children = getChildren(component);
        for (Shape shape : containerShape.getChildren()) {
            if (children.contains(getBusinessObjectForPictogramElement(shape))) {
                UpdateContext updateContext = new UpdateContext(shape);
                IUpdateFeature updateFeature = getFeatureProvider().getUpdateFeature(updateContext);
                if (updateFeature != null) {
                    IReason reason = updateFeature.updateNeeded(updateContext);
                    if (reason.toBoolean()) {
                        return reason;
                    }
                }
            } else {
                return Reason.createTrueReason("Add missing children.");
            }
        }
        return Reason.createFalseReason();
    }

    private List<EObject> getChildren(Component component) {
        List<EObject> children = new ArrayList<EObject>();
        ComponentMergedModelAdapter mergedComponent = MergedModelUtil.getAdapter(component,
                ComponentMergedModelAdapter.class);
        children.addAll(mergedComponent.getServices());
        children.addAll(mergedComponent.getReferences());
        return children;
    }
}
