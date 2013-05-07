/*************************************************************************************
 * Copyright (c) 2013 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.diagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.shared.InterfaceChangeDialog;

/**
 * ChangeInterfaceCustomFeature
 * 
 * <p/>
 * Custom feature for changing the Interface of the selected Contract.
 * 
 * @author bfitzpat
 */
public class ChangeInterfaceCustomFeature extends AbstractCustomFeature implements ICustomFeature {

    /**
     * Create a new ChangeInterfaceCustomFeature.
     * 
     * @param fp the feature provider
     */
    public ChangeInterfaceCustomFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public String getDescription() {
        return "Edit the interface.";
    }

    @Override
    public boolean isAvailable(IContext context) {
        final PictogramElement[] pes = ((ICustomContext) context).getPictogramElements();
        if (pes == null || pes.length != 1) {
            return false;
        }
        final Object bo = getBusinessObjectForPictogramElement(pes[0]);
        if (!(bo instanceof Contract)) {
            return false;
        }
        final Interface intf = ((Contract) bo).getInterface();
        if (intf == null) {
            return false;
        }
        return true;
    }

    @Override
    public String getName() {
        return "Edit Interface";
    }

    @Override
    public boolean hasDoneChanges() {
        // this never changes the model.
        return true;
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        Object bo = getBusinessObjectForPictogramElement(context.getPictogramElements()[0]);
        return isAvailable(context)
                && bo instanceof EObject
                && (((EObject) bo).eResource() == null || !getFeatureProvider().getDiagramTypeProvider()
                .getDiagramBehavior().getEditingDomain().isReadOnly(((EObject) bo).eResource()));
    }

    @Override
    public void execute(ICustomContext context) {
        final Object bo = getBusinessObjectForPictogramElement(context.getPictogramElements()[0]);
        final Contract contract = (Contract) bo;
        final Interface intf = contract.getInterface();
        InterfaceChangeDialog dialog = new InterfaceChangeDialog(
                PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), null, intf);
        if (intf != null && intf.eContainer() != null) {
            dialog.setSelection(new StructuredSelection(contract));
        }
        int return_code = dialog.open();
        if (return_code == Window.OK) {
            final Interface newIntfc = (Interface) ((StructuredSelection)dialog.getSelection()).getFirstElement();
            if (newIntfc.equals(intf)) {
                return;
            }
            contract.setInterface(newIntfc);

            // nothing really to add - just refresh the object so the decorator
            // appears
            getDiagramBehavior().refreshRenderingDecorators(context.getPictogramElements()[0]);
        }
         
    }

    @Override
    public String getImageId() {
        return ImageProvider.IMG_16_EDIT_INTERFACE;
    }
}
