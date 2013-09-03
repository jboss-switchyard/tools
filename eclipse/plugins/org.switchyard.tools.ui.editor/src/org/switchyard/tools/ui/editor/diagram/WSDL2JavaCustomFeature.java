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

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Platform;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.wizards.WSDL2JavaWizard;

/**
 * WSDL2JavaCustomFeature
 * 
 * <p/>
 * Custom feature for creating WSDL from a Java interface.
 */
public class WSDL2JavaCustomFeature extends AbstractCustomFeature implements ICustomFeature {

    /**
     * Create a new WSDL2JavaCustomFeature.
     * 
     * @param fp the feature provider
     */
    public WSDL2JavaCustomFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public String getDescription() {
        return Messages.featureDescription_wsdlToJava;
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
        if (!(intf instanceof WSDLPortType)) {
            return false;
        }
        final String wsdlIntf = ((WSDLPortType) intf).getInterface();
        return wsdlIntf != null && wsdlIntf.length() > 0;
    }

    @Override
    public String getName() {
        return Messages.featureName_wsdlToJava;
    }

    @Override
    public boolean hasDoneChanges() {
        // this never changes the model.
        return false;
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        return isAvailable(context);
    }

    @Override
    public void execute(ICustomContext context) {
        final Object bo = getBusinessObjectForPictogramElement(context.getPictogramElements()[0]);
        final WSDLPortType wsdlIntf = (WSDLPortType) ((Contract) bo).getInterface();
        final WSDL2JavaWizard wizard = new WSDL2JavaWizard();
        final WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                wizard);
        wizard.init(PlatformUI.getWorkbench(), getResourceForInterface(wsdlIntf));
        dialog.open();
    }

    private IStructuredSelection getResourceForInterface(WSDLPortType wsdlIntf) {
        final IResource file = (IResource) Platform.getAdapterManager().loadAdapter(wsdlIntf,
                IResource.class.getCanonicalName());
        if (file == null) {
            return StructuredSelection.EMPTY;
        }
        return new StructuredSelection(file);
    }

    @Override
    public String getImageId() {
        return ImageProvider.IMG_16_WSDL_2_JAVA;
    }

}
