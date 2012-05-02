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
package org.switchyard.tools.ui.editor.diagram.implementation;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.component.wizards.SCADiagramAddImplementationWizard;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramCreateImplementationFeature extends AbstractCreateFeature {

    /**
     * @param fp the feature provider
     */
    public SCADiagramCreateImplementationFeature(IFeatureProvider fp) {
        super(fp, "Implementation", "Create implementation");
    }

    @Override
    public boolean canCreate(ICreateContext context) {
        ContainerShape targetContainer = context.getTargetContainer();
        // check if user wants to add to a component
        if (targetContainer instanceof Component
                || getBusinessObjectForPictogramElement(targetContainer) instanceof Component) {
            return true;
        }
        return false;
    }

    @Override
    public Object[] create(ICreateContext context) {

        Object o = getBusinessObjectForPictogramElement(context.getTargetContainer());
        Component component = (Component) o;

        Implementation newImplementation = null;
        SCADiagramAddImplementationWizard wizard = new SCADiagramAddImplementationWizard();
        wizard.setDiagram(getDiagram());
        wizard.setComponent(component);
        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        WizardDialog wizDialog = new WizardDialog(shell, wizard);
        int rtn_code = wizDialog.open();
        if (rtn_code == Window.OK) {
            newImplementation = wizard.getImplementation();
        } else {
            return EMPTY;
        }

        if (newImplementation != null) {
            // do something with it
            if (newImplementation instanceof CamelImplementationType) {
                component.getImplementationGroup().add(CamelPackage.eINSTANCE.getDocumentRoot_ImplementationCamel(),
                        newImplementation);
            }
        }

        getDiagramEditor().refresh(context.getTargetContainer());

        // return newly created business object(s)
        return new Object[] {newImplementation };
    }

    @Override
    public String getCreateImageId() {
        return ImageProvider.IMG_16_IMPLEMENTATION_TYPE;
    }

}
