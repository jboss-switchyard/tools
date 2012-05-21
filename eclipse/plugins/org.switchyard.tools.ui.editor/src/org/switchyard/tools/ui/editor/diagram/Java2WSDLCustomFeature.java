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
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.ui.wizards.Java2WSDLWizard;

/**
 * Java2WSDLCustomFeature
 * 
 * <p/>
 * Custom feature for creating WSDL from a Java interface.
 * 
 * @author Rob Cernich
 */
public class Java2WSDLCustomFeature extends AbstractCustomFeature implements ICustomFeature {

    /**
     * Create a new Java2WSDLCustomFeature.
     * 
     * @param fp the feature provider
     */
    public Java2WSDLCustomFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public String getDescription() {
        return "Generate a new WSDL file from a Java inteface.";
    }

    @Override
    public boolean isAvailable(IContext context) {
        final PictogramElement[] pes = ((ICustomContext) context).getPictogramElements();
        if (pes == null || pes.length != 1) {
            return false;
        }
        final Object bo = getBusinessObjectForPictogramElement(pes[0]);
        if (!(bo instanceof ComponentService)) {
            return false;
        }
        final Interface intf = ((ComponentService) bo).getInterface();
        if (!(intf instanceof JavaInterface)) {
            return false;
        }
        final String javaIntf = ((JavaInterface) intf).getInterface();
        return javaIntf != null && javaIntf.length() > 0;
    }

    @Override
    public String getName() {
        return "Generate WSDL File";
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
        final JavaInterface javaIntf = (JavaInterface) ((ComponentService) bo).getInterface();
        final Java2WSDLWizard wizard = new Java2WSDLWizard();
        final WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                wizard);
        wizard.init(PlatformUI.getWorkbench(), getResourceForInterface(javaIntf));
        dialog.open();
    }

    private IStructuredSelection getResourceForInterface(JavaInterface javaIntf) {
        final IResource file = (IResource) Platform.getAdapterManager().loadAdapter(javaIntf,
                IResource.class.getCanonicalName());
        if (file == null) {
            return StructuredSelection.EMPTY;
        }
        return new StructuredSelection(file);
    }
}
