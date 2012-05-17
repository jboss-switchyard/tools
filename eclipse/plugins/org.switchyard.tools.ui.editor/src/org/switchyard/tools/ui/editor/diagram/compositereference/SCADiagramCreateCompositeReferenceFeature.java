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

import java.io.IOException;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.core.ModelHandler;
import org.switchyard.tools.ui.editor.core.ModelHandlerLocator;
import org.switchyard.tools.ui.editor.diagram.compositereference.wizards.SCADiagramAddCompositeReferenceWizard;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramCreateCompositeReferenceFeature extends AbstractCreateFeature {

    /**
     * @param fp feature provider
     */
    public SCADiagramCreateCompositeReferenceFeature(IFeatureProvider fp) {
        super(fp, "Composite Reference", "Create Composite Reference");
    }

    @Override
    public boolean canCreate(ICreateContext context) {
        if (getBusinessObjectForPictogramElement(context.getTargetContainer()) instanceof Composite) {
            return true;
        }
        return false;
    }

    @Override
    public Object[] create(ICreateContext context) {

        Reference newReference = null;
        String newRefName = null;
        Interface newInterface = null;
        SCADiagramAddCompositeReferenceWizard wizard = new SCADiagramAddCompositeReferenceWizard();
        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        WizardDialog wizDialog = new WizardDialog(shell, wizard);
        int rtn_code = wizDialog.open();
        if (rtn_code == Window.OK) {
            newRefName = wizard.getCompositeReferenceName();
            newInterface = wizard.getInterface();
        } else {
            return EMPTY;
        }

        try {
            ModelHandler mh = ModelHandlerLocator.getModelHandler(getDiagram().eResource());
            Object o = getBusinessObjectForPictogramElement(context.getTargetContainer());
            newReference = mh.createCompositeReference((Composite) o);
            newReference.setName(newRefName);
            if (newInterface != null) {
                // do something with it
                if (newInterface instanceof JavaInterface) {
                    newReference.getInterfaceGroup().set(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceJava(),
                            newInterface);
                } else if (newInterface instanceof WSDLPortType) {
                    newReference.getInterfaceGroup().set(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceWsdl(),
                            newInterface);
                }
            }
        } catch (IOException e) {
            Activator.logError(e);
        }

        // do the add
        PictogramElement pe = addGraphicalRepresentation(context, newReference);
        if (pe instanceof Shape) {
            // make sure the new reference is positioned correctly.
            layoutPictogramElement(((Shape) pe).getContainer());
        }

        // return newly created business object(s)
        return new Object[] {newReference };
    }

    @Override
    public String getCreateImageId() {
        return ImageProvider.IMG_16_REFERENCE;
    }

}
