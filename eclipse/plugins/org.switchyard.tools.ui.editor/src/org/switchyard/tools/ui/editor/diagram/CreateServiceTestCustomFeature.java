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
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.wizards.NewServiceTestClassWizard;

/**
 * Java2WSDLCustomFeature
 * 
 * <p/>
 * Custom feature for creating WSDL from a Java interface.
 * 
 * @author Rob Cernich
 */
public class CreateServiceTestCustomFeature extends AbstractCustomFeature implements ICustomFeature {

    /**
     * Create a new Java2WSDLCustomFeature.
     * 
     * @param fp the feature provider
     */
    public CreateServiceTestCustomFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public String getDescription() {
        return Messages.featureDescription_newServiceTest;
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
        return true;
    }

    @Override
    public String getName() {
        return Messages.featureName_newServiceTest;
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
        final Contract contract = (Contract) getBusinessObjectForPictogramElement(context.getPictogramElements()[0]);
        final NewServiceTestClassWizard wizard = new NewServiceTestClassWizard();
        final WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                wizard);
        wizard.init(PlatformUI.getWorkbench(), getResourceForInterface(contract));
        wizard.forceServiceContract(contract);
        dialog.open();
    }

    private IStructuredSelection getResourceForInterface(Contract contract) {
        IResource file = (IResource) Platform.getAdapterManager().loadAdapter(contract, IResource.class.getCanonicalName());
        if (file == null) {
            file = PlatformResourceAdapterFactory.getContainingProject(contract);
            if (file == null) {
                return StructuredSelection.EMPTY;
            }
        }
        return new StructuredSelection(file);
    }

    @Override
    public String getImageId() {
        return ImageProvider.IMG_16_TEST_CLASS;
    }
}
