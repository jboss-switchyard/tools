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
package org.switchyard.tools.ui.editor.diagram.componentservice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;

/**
 * UpdateComponentServiceFeature
 * 
 * <p/>
 * Updates connections, etc. based on changes to a component service.
 */
public class UpdateComponentServiceFeature extends AbstractUpdateFeature {

    private boolean _hasDoneChanges;

    /**
     * Create a new UpdateComponentServiceFeature.
     * 
     * @param fp the feature provider.
     */
    public UpdateComponentServiceFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canUpdate(IUpdateContext context) {
        return getBusinessObjectForPictogramElement(context.getPictogramElement()) instanceof ComponentService
                && context.getPictogramElement() instanceof ContainerShape;
    }

    @Override
    public IReason updateNeeded(IUpdateContext context) {
        final ComponentService service = (ComponentService) getBusinessObjectForPictogramElement(context
                .getPictogramElement());
        final ContainerShape container = (ContainerShape) context.getPictogramElement();
        final Set<Contract> existingConnections = getExistingConnections(container);
        final Composite composite = (Composite) service.eContainer().eContainer();

        for (Service compositeService : composite.getService()) {
            if (compositeService.getPromote() == service) {
                if (!existingConnections.remove(compositeService)) {
                    return Reason.createTrueReason();
                }
            }
        }

        if (service.getName() != null && service.getName().length() > 0) {
            for (Component other : composite.getComponent()) {
                if (other == service.eContainer()) {
                    // we don't allow self references???
                    continue;
                }
                for (ComponentReference reference : other.getReference()) {
                    if (service.getName().equals(reference.getName())) {
                        if (!existingConnections.remove(reference)) {
                            return Reason.createTrueReason();
                        }
                    }
                }
            }
        }

        return existingConnections.isEmpty() ? Reason.createFalseReason() : Reason.createTrueReason();
    }

    @Override
    public boolean update(IUpdateContext context) {
        _hasDoneChanges = false;
        final ComponentService service = (ComponentService) getBusinessObjectForPictogramElement(context
                .getPictogramElement());
        final ContainerShape container = (ContainerShape) context.getPictogramElement();
        final Anchor anchor = container.getAnchors().get(0);
        final Set<Contract> existingConnections = getExistingConnections(container);
        final Composite composite = (Composite) service.eContainer().eContainer();

        for (Service compositeService : composite.getService()) {
            if (compositeService.getPromote() == service) {
                if (!existingConnections.remove(compositeService)) {
                    for (PictogramElement pe : getFeatureProvider().getAllPictogramElementsForBusinessObject(
                            compositeService)) {
                        if (pe instanceof Anchor) {
                            AddConnectionContext addContext = new AddConnectionContext((Anchor) pe, anchor);
                            addContext.setNewObject(service);
                            updatePictogramElement(getFeatureProvider().addIfPossible(addContext));
                            _hasDoneChanges = true;
                            break;
                        }
                    }
                }
            }
        }

        if (service.getName() != null && service.getName().length() > 0) {
            for (Component other : composite.getComponent()) {
                if (other == service.eContainer()) {
                    // we don't allow self references???
                    continue;
                }
                REFERENCE_LOOP: for (ComponentReference reference : other.getReference()) {
                    if (service.getName().equals(reference.getName())) {
                        if (!existingConnections.remove(reference)) {
                            for (PictogramElement pe : getFeatureProvider().getAllPictogramElementsForBusinessObject(
                                    reference)) {
                                if (pe instanceof Anchor) {
                                    AddConnectionContext addContext = new AddConnectionContext((Anchor) pe, anchor);
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

        for (Connection connection : new ArrayList<Connection>(anchor.getIncomingConnections())) {
            Object bo = getBusinessObjectForPictogramElement(connection.getStart());
            if (existingConnections.remove(bo)) {
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
            for (Connection connection : anchor.getIncomingConnections()) {
                Object bo = getBusinessObjectForPictogramElement(connection.getStart());
                if (bo instanceof Contract) {
                    existingConnections.add((Contract) bo);
                }
            }
        }
        return existingConnections;
    }
}
