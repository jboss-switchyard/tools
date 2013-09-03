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
package org.switchyard.tools.ui.editor.diagram.componentreference;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.internal.services.GraphitiInternal;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.model.merge.CompositeMergedModelAdapter;
import org.switchyard.tools.ui.editor.model.merge.ContractMergedModelAdapter;
import org.switchyard.tools.ui.editor.model.merge.MergedModelUtil;

/**
 * UpdateComponentReferenceFeature
 * 
 * <p/>
 * Updates connections, etc. based on changes to a component service.
 */
@SuppressWarnings("restriction")
public class UpdateComponentReferenceFeature extends AbstractUpdateFeature {

    private boolean _hasDoneChanges;

    /**
     * Create a new UpdateComponentReferenceFeature.
     * 
     * @param fp the feature provider.
     */
    public UpdateComponentReferenceFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canUpdate(IUpdateContext context) {
        return getBusinessObjectForPictogramElement(context.getPictogramElement()) instanceof ComponentReference
                && context.getPictogramElement() instanceof ContainerShape;
    }

    @Override
    public IReason updateNeeded(IUpdateContext context) {
        final ComponentReference reference = (ComponentReference) getBusinessObjectForPictogramElement(context
                .getPictogramElement());

        // make sure the component still exists in the model
        if (!GraphitiInternal.getEmfService().isObjectAlive(reference)) {
            return Reason.createTrueReason(String.format(Messages.updateReason_referenceRemoved, reference.getName()));
        }

        final ContainerShape container = (ContainerShape) context.getPictogramElement();
        final Set<Contract> existingConnections = getExistingConnections(container);
        final ContractMergedModelAdapter mergeAdapter = MergedModelUtil.getAdapter(reference,
                ContractMergedModelAdapter.class);
        final CompositeMergedModelAdapter composite = MergedModelUtil.getAdapter(mergeAdapter.getSwitchYard()
                .getComposite(), CompositeMergedModelAdapter.class);

        for (Reference compositeReference : composite.getReferences()) {
            if (compositeReference.getPromote().contains(reference)
                    || (reference.getName() != null && reference.getName().equals(compositeReference.getName()))) {
                if (!existingConnections.remove(compositeReference)) {
                    return Reason.createTrueReason(Messages.updateReason_updateConnections);
                }
            }
        }

        if (reference.getName() != null && reference.getName().length() > 0) {
            for (Component other : composite.getComponents()) {
                if (other == reference.eContainer()) {
                    // we don't allow self references???
                    continue;
                }
                for (ComponentService service : other.getService()) {
                    if (reference.getName().equals(service.getName())) {
                        if (!existingConnections.remove(service)) {
                            return Reason.createTrueReason(Messages.updateReason_updateConnections);
                        }
                    }
                }
            }
        }

        return existingConnections.isEmpty() ? Reason.createFalseReason() : Reason
                .createTrueReason(Messages.updateReason_updateConnections);
    }

    @Override
    public boolean update(IUpdateContext context) {
        _hasDoneChanges = false;
        final ComponentReference reference = (ComponentReference) getBusinessObjectForPictogramElement(context
                .getPictogramElement());

        // remove it if it's gone
        if (!GraphitiInternal.getEmfService().isObjectAlive(reference)) {
            IRemoveContext removeContext = new RemoveContext(context.getPictogramElement());
            final IRemoveFeature removeFeature = getFeatureProvider().getRemoveFeature(removeContext);
            if (removeFeature != null && removeFeature.canRemove(removeContext)) {
                removeFeature.remove(removeContext);
                _hasDoneChanges = removeFeature.hasDoneChanges();
                return true;
            }
        }

        final ContainerShape container = (ContainerShape) context.getPictogramElement();
        final Anchor anchor = container.getAnchors().get(0);
        final Set<Contract> existingConnections = getExistingConnections(container);
        final ContractMergedModelAdapter mergeAdapter = MergedModelUtil.getAdapter(reference,
                ContractMergedModelAdapter.class);
        final CompositeMergedModelAdapter composite = MergedModelUtil.getAdapter(mergeAdapter.getSwitchYard()
                .getComposite(), CompositeMergedModelAdapter.class);

        for (Reference compositeReference : composite.getReferences()) {
            if (compositeReference.getPromote().contains(reference)
                    || (reference.getName() != null && reference.getName().equals(compositeReference.getName()))) {
                if (!existingConnections.remove(compositeReference)) {
                    for (PictogramElement pe : getFeatureProvider().getAllPictogramElementsForBusinessObject(
                            compositeReference)) {
                        if (pe instanceof Anchor) {
                            AddConnectionContext addContext = new AddConnectionContext(anchor, (Anchor) pe);
                            addContext.setNewObject(reference);
                            updatePictogramElement(getFeatureProvider().addIfPossible(addContext));
                            _hasDoneChanges = true;
                            break;
                        }
                    }
                }
            }
        }

        if (reference.getName() != null && reference.getName().length() > 0) {
            for (Component other : composite.getComponents()) {
                if (other == reference.eContainer()) {
                    // we don't allow self references???
                    continue;
                }
                REFERENCE_LOOP: for (ComponentService service : other.getService()) {
                    if (reference.getName().equals(service.getName())) {
                        if (!existingConnections.remove(service)) {
                            for (PictogramElement pe : getFeatureProvider().getAllPictogramElementsForBusinessObject(
                                    service)) {
                                if (pe instanceof Anchor) {
                                    AddConnectionContext addContext = new AddConnectionContext(anchor, (Anchor) pe);
                                    addContext.setNewObject(reference);
                                    updatePictogramElement(getFeatureProvider().addIfPossible(addContext));
                                    _hasDoneChanges = true;
                                    break REFERENCE_LOOP;
                                }
                            }
                        }
                    }
                }
            }
        }

        for (Connection connection : new ArrayList<Connection>(anchor.getOutgoingConnections())) {
            Object bo = getBusinessObjectForPictogramElement(connection.getEnd());
            if (bo == null || existingConnections.remove(bo)) {
                RemoveContext removeContext = new RemoveContext(connection);
                IRemoveFeature removeFeature = getFeatureProvider().getRemoveFeature(removeContext);
                if (removeFeature.canExecute(removeContext)) {
                    removeFeature.execute(removeContext);
                    _hasDoneChanges = _hasDoneChanges || removeFeature.hasDoneChanges();
                }
            }
        }
        return _hasDoneChanges;
    }

    @Override
    public boolean hasDoneChanges() {
        return _hasDoneChanges;
    }

    private Set<Contract> getExistingConnections(AnchorContainer container) {
        Set<Contract> existingConnections = new LinkedHashSet<Contract>();
        for (Anchor anchor : container.getAnchors()) {
            for (Connection connection : anchor.getOutgoingConnections()) {
                Object bo = getBusinessObjectForPictogramElement(connection.getEnd());
                if (bo instanceof Contract || bo == null) {
                    existingConnections.add((Contract) bo);
                }
            }
        }
        return existingConnections;
    }
}
