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
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.util.GraphitiUtil;

/**
 * @author bfitzpat
 * 
 */
@SuppressWarnings("restriction")
public class SCADiagramUpdateServiceFeature extends AbstractUpdateFeature {

    private boolean _hasDoneChanges;

    /**
     * @param fp the feature provider
     */
    public SCADiagramUpdateServiceFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canUpdate(IUpdateContext context) {
        // return true, if linked business object is a Service
        PictogramElement pe = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pe);
        return bo instanceof Service && pe instanceof ContainerShape;
    }

    @Override
    public IReason updateNeeded(IUpdateContext context) {
        if (!canUpdate(context)) {
            return Reason.createFalseReason();
        }

        ContainerShape cs = (ContainerShape) context.getPictogramElement();
        Service service = (Service) getBusinessObjectForPictogramElement(cs);

        // make sure the component still exists in the model
        if (!GraphitiInternal.getEmfService().isObjectAlive(service)) {
            return Reason.createTrueReason(String.format(Messages.updateReason_serviceRemoved, service.getName()));
        }

        // retrieve name from pictogram model
        String pictogramName = null;
        Text foundText = GraphitiUtil.findChildGA(cs.getGraphicsAlgorithm(), Text.class);
        if (foundText != null) {
            pictogramName = foundText.getValue();
        }

        // retrieve name from business model
        String businessName = service.getName();
        // update needed, if names are different
        boolean updateNameNeeded = ((pictogramName == null && businessName != null) || (pictogramName != null && !pictogramName
                .contentEquals(businessName)));
        if (updateNameNeeded) {
            return Reason.createTrueReason(Messages.updateReason_serviceName);
        }

        // check the wiring
        final Set<Contract> existingConnections = getExistingConnections(cs);
        if (service.getPromote() != null && !existingConnections.remove(service.getPromote())) {
            return Reason.createTrueReason(Messages.updateReason_updateConnections);
        }

        if (existingConnections.size() > 0 || cs.getAnchors().size() != 2) {
            return Reason.createTrueReason(Messages.updateReason_updateConnections);
        }

        return Reason.createFalseReason();
    }

    @Override
    public boolean update(IUpdateContext context) {
        _hasDoneChanges = false;

        // retrieve name from business model
        ContainerShape cs = (ContainerShape) context.getPictogramElement();
        Service service = (Service) getBusinessObjectForPictogramElement(cs);

        // remove it if it's gone
        if (!GraphitiInternal.getEmfService().isObjectAlive(service)) {
            IRemoveContext removeContext = new RemoveContext(context.getPictogramElement());
            final IRemoveFeature removeFeature = getFeatureProvider().getRemoveFeature(removeContext);
            if (removeFeature != null && removeFeature.canRemove(removeContext)) {
                removeFeature.remove(removeContext);
                _hasDoneChanges = removeFeature.hasDoneChanges();
                return true;
            }
        }

        // Set name in pictogram model
        String pictogramName = null;
        Text foundText = GraphitiUtil.findChildGA(cs.getGraphicsAlgorithm(), Text.class);
        if (foundText != null) {
            pictogramName = foundText.getValue();
        }
        String businessName = service.getName();
        boolean updateNameNeeded = ((pictogramName == null && businessName != null) || (pictogramName != null && !pictogramName
                .contentEquals(businessName)));
        if (updateNameNeeded) {
            foundText.setValue(businessName);
            _hasDoneChanges = true;
        }

        // update the wires
        if (cs.getAnchors().size() != 2) {
            // add new anchor point for connections
            final BoxRelativeAnchor anchor = Graphiti.getPeCreateService().createBoxRelativeAnchor(cs);
            GraphicsAlgorithm anchorGa = Graphiti.getGaCreateService().createEllipse(anchor);
            // anchorGa.setFilled(false);
            anchorGa.setTransparency(.9);
            anchorGa.setLineVisible(false);
            Graphiti.getGaLayoutService().setLocationAndSize(anchorGa, -14, -6, 12, 12);
            anchor.setRelativeHeight(.5);
            anchor.setRelativeWidth(1);
            anchor.setUseAnchorLocationAsConnectionEndpoint(true);
            link(anchor, service);
            cs.getAnchors().move(0, anchor);
            for (Connection connection : new ArrayList<Connection>(cs.getAnchors().get(1).getOutgoingConnections())) {
                connection.setStart(anchor);
            }
        }
        final Set<Contract> existingConnections = getExistingConnections(cs);
        final Anchor anchor = cs.getAnchors().get(0);
        final ComponentService promotedService = service.getPromote();
        if (promotedService != null && !existingConnections.remove(promotedService)) {
            for (PictogramElement pe : getFeatureProvider().getAllPictogramElementsForBusinessObject(promotedService)) {
                if (pe instanceof Anchor) {
                    AddConnectionContext addContext = new AddConnectionContext(anchor, (Anchor) pe);
                    addContext.setNewObject(promotedService);
                    updatePictogramElement(getFeatureProvider().addIfPossible(addContext));
                    _hasDoneChanges = true;
                    break;
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
