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
package org.switchyard.tools.ui.editor.diagram.compositereference;

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
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.FixPointAnchor;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.StyleUtil;
import org.switchyard.tools.ui.editor.model.merge.CompositeMergedModelAdapter;
import org.switchyard.tools.ui.editor.model.merge.ContractMergedModelAdapter;
import org.switchyard.tools.ui.editor.model.merge.MergedModelUtil;
import org.switchyard.tools.ui.editor.util.GraphitiUtil;

/**
 * @author bfitzpat
 * 
 */
@SuppressWarnings("restriction")
public class SCADiagramUpdateCompositeReferenceFeature extends AbstractUpdateFeature {

    private boolean _hasDoneChanges;

    /**
     * @param fp the feature provider
     */
    public SCADiagramUpdateCompositeReferenceFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canUpdate(IUpdateContext context) {
        // return true, if linked business object is a Reference
        PictogramElement pe = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pe);
        return bo instanceof Reference && pe instanceof ContainerShape;
    }

    @Override
    public IReason updateNeeded(IUpdateContext context) {
        if (!canUpdate(context)) {
            return Reason.createFalseReason();
        }

        ContainerShape cs = (ContainerShape) context.getPictogramElement();
        Reference reference = (Reference) getBusinessObjectForPictogramElement(cs);

        // make sure the component still exists in the model
        if (!GraphitiInternal.getEmfService().isObjectAlive(reference)) {
            return Reason.createTrueReason(String.format(Messages.updateReason_referenceRemoved, reference.getName()));
        }

        // retrieve name from pictogram model
        String pictogramName = null;
        Text foundText = GraphitiUtil.findChildGA(cs.getGraphicsAlgorithm(), Text.class);
        if (foundText != null) {
            pictogramName = foundText.getValue();
        }

        // update needed, if names are different
        String businessName = reference.getName();
        boolean updateNameNeeded = ((pictogramName == null && businessName != null) || (pictogramName != null && !pictogramName
                .contentEquals(businessName)));
        if (updateNameNeeded) {
            return Reason.createTrueReason(Messages.updateReason_referenceName);
        }

        // check the wiring
        final Set<ComponentReference> promotedReferences = new LinkedHashSet<ComponentReference>(reference.getPromote());
        if (reference.getName() != null && reference.getName().length() > 0) {
            final ContractMergedModelAdapter mergeAdapter = MergedModelUtil.getAdapter(reference,
                    ContractMergedModelAdapter.class);
            final CompositeMergedModelAdapter composite = MergedModelUtil.getAdapter(mergeAdapter.getSwitchYard()
                    .getComposite(), CompositeMergedModelAdapter.class);
            for (Component component : composite.getComponents()) {
                for (ComponentReference componentReference : component.getReference()) {
                    if (reference.getName().equals(componentReference.getName())) {
                        promotedReferences.add(componentReference);
                    }
                }
            }
        }
        final Set<Contract> existingConnections = getExistingConnections(cs);
        for (ComponentReference promotedReference : promotedReferences) {
            if (promotedReference != null && !existingConnections.remove(promotedReference)) {
                return Reason.createTrueReason(Messages.updateReason_updateConnections);
            }
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
        Reference reference = (Reference) getBusinessObjectForPictogramElement(cs);

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

        // Set name in pictogram model
        String pictogramName = null;
        Text foundText = GraphitiUtil.findChildGA(cs.getGraphicsAlgorithm(), Text.class);
        if (foundText != null) {
            pictogramName = foundText.getValue();
        }
        String businessName = reference.getName();
        boolean updateNameNeeded = ((pictogramName == null && businessName != null) || (pictogramName != null && !pictogramName
                .contentEquals(businessName)));
        if (updateNameNeeded) {
            foundText.setValue(businessName);
            _hasDoneChanges = true;
        }

        // update the wires
        final Set<ComponentReference> promotedReferences = new LinkedHashSet<ComponentReference>(reference.getPromote());
        if (reference.getName() != null && reference.getName().length() > 0) {
            final ContractMergedModelAdapter mergeAdapter = MergedModelUtil.getAdapter(reference,
                    ContractMergedModelAdapter.class);
            final CompositeMergedModelAdapter composite = MergedModelUtil.getAdapter(mergeAdapter.getSwitchYard()
                    .getComposite(), CompositeMergedModelAdapter.class);
            for (Component component : composite.getComponents()) {
                for (ComponentReference componentReference : component.getReference()) {
                    if (reference.getName().equals(componentReference.getName())) {
                        promotedReferences.add(componentReference);
                    }
                }
            }
        }

        if (cs.getAnchors().size() != 2) {
            // add new anchor point for connections
            final FixPointAnchor anchor = Graphiti.getPeCreateService().createFixPointAnchor(cs);
            GraphicsAlgorithm anchorGa = Graphiti.getGaCreateService().createEllipse(anchor);
            GraphicsAlgorithm containerGa = cs.getGraphicsAlgorithm();
            anchorGa.setTransparency(.9);
            anchorGa.setLineVisible(false);
            Graphiti.getGaLayoutService().setLocationAndSize(anchorGa, 0, -6, 12, 12);
            anchor.setLocation(Graphiti.getGaService().createPoint(
                    (int) (14d * containerGa.getWidth() / StyleUtil.COMPOSITE_REFERENCE_WIDTH),
                    containerGa.getHeight() / 2));
            anchor.setUseAnchorLocationAsConnectionEndpoint(true);
            link(anchor, reference);
            cs.getAnchors().move(0, anchor);
            for (Connection connection : new ArrayList<Connection>(cs.getAnchors().get(1).getIncomingConnections())) {
                connection.setEnd(anchor);
            }
        }
        final Set<Contract> existingConnections = getExistingConnections(cs);
        final Anchor anchor = cs.getAnchors().get(0);
        for (ComponentReference promotedReference : promotedReferences) {
            if (promotedReference != null && !existingConnections.remove(promotedReference)) {
                for (PictogramElement pe : getFeatureProvider().getAllPictogramElementsForBusinessObject(
                        promotedReference)) {
                    if (pe instanceof Anchor) {
                        AddConnectionContext addContext = new AddConnectionContext((Anchor) pe, anchor);
                        addContext.setNewObject(reference);
                        updatePictogramElement(getFeatureProvider().addIfPossible(addContext));
                        _hasDoneChanges = true;
                        break;
                    }
                }
            }
        }

        for (Connection connection : new ArrayList<Connection>(anchor.getIncomingConnections())) {
            Object bo = getBusinessObjectForPictogramElement(connection.getStart());
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
            for (Connection connection : anchor.getIncomingConnections()) {
                Object bo = getBusinessObjectForPictogramElement(connection.getStart());
                if (bo instanceof Contract || bo == null) {
                    existingConnections.add((Contract) bo);
                }
            }
        }
        return existingConnections;
    }
}
