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
package org.switchyard.tools.ui.editor.diagram;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.features.impl.DefaultUpdateDiagramFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;

/**
 * UpdateDiagramFeature
 * 
 * Updates the diagram based on any model changes.
 * 
 */
public class UpdateDiagramFeature extends DefaultUpdateDiagramFeature {

    private boolean _hasDoneChanges;

    /**
     * Create a new UpdateDiagramFeature.
     * 
     * @param fp the feature provider.
     */
    public UpdateDiagramFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean update(IUpdateContext context) {
        _hasDoneChanges = false;
        boolean retVal = super.update(context);
        if (compositeMissing(context).toBoolean()) {
            Diagram d = (Diagram) context.getPictogramElement();
            for (EObject bo : d.getLink().getBusinessObjects()) {
                if (bo instanceof DocumentRoot) {
                    DocumentRoot root = (DocumentRoot) bo;
                    if (root.getSwitchyard() != null && root.getSwitchyard().getComposite() != null) {
                        addComposite(context, root.getSwitchyard().getComposite());
                    }
                } else if (bo instanceof SwitchYardType) {
                    SwitchYardType switchYard = (SwitchYardType) bo;
                    if (switchYard.getComposite() != null) {
                        addComposite(context, switchYard.getComposite());
                    }
                } else if (bo instanceof Composite) {
                    addComposite(context, (Composite) bo);
                }
            }
        }
        // parent doesn't actually update connections, so update them ourselves
        // we do this last because model updates may have removed connections.
        updateConnections(context);
        return retVal;
    }

    @Override
    public IReason updateNeeded(IUpdateContext context) {
        IReason retVal = super.updateNeeded(context);
        if (retVal.toBoolean()) {
            return retVal;
        }
        return compositeMissing(context);
    }

    @Override
    public boolean hasDoneChanges() {
        return super.hasDoneChanges() || _hasDoneChanges;
    }

    private IReason compositeMissing(IUpdateContext context) {
        PictogramElement pe = context.getPictogramElement();
        if (pe instanceof Diagram) {
            Diagram d = (Diagram) pe;
            if (d.getChildren().size() == 0) {
                return Reason.createTrueReason();
            }
        }
        return Reason.createFalseReason();
    }

    private void addComposite(IUpdateContext updateContext, Composite composite) {
        AddContext addContext = new AddContext();
        addContext.setNewObject(composite);
        addContext.setTargetContainer((Diagram) updateContext.getPictogramElement());
        addContext.setX(20);
        addContext.setY(20);

        PictogramElement pe = getFeatureProvider().addIfPossible(addContext);
        if (pe != null) {
            CustomContext context = new CustomContext(new PictogramElement[] {pe });
            ICustomFeature layoutFeature = new AutoLayoutFeature(getFeatureProvider());
            if (layoutFeature.canExecute(context)) {
                layoutFeature.execute(context);
            }
            _hasDoneChanges = true;
        }
    }

    private void updateConnections(IUpdateContext context) {
        for (Connection connection : new ArrayList<Connection>(
                ((Diagram) context.getPictogramElement()).getConnections())) {
            UpdateContext updateContext = new UpdateContext(connection);
            IUpdateFeature updateFeature = getFeatureProvider().getUpdateFeature(updateContext);
            if (updateFeature != null && updateFeature.canUpdate(updateContext)
                    && updateFeature.updateNeeded(updateContext).toBoolean()) {
                updateFeature.update(updateContext);
                _hasDoneChanges = _hasDoneChanges || updateFeature.hasDoneChanges();
            }
        }
    }
}
