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
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.core.ModelHandler;
import org.switchyard.tools.ui.editor.core.ModelHandlerLocator;
import org.switchyard.tools.ui.editor.diagram.service.wizards.SCADiagramAddCompositeServiceWizard;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramCreateServiceFeature extends AbstractCreateFeature {

    private boolean _hasDoneChanges;

    /**
     * @param fp the feature provider
     */
    public SCADiagramCreateServiceFeature(IFeatureProvider fp) {
        super(fp, "Service", "Create Service");
    }

    @Override
    public boolean canCreate(ICreateContext context) {
        if (getBusinessObjectForPictogramElement(context.getTargetContainer()) instanceof Composite) {
            return true;
        }
        return false;
    }

    @Override
    public boolean hasDoneChanges() {
        return _hasDoneChanges;
    }

    @Override
    public Object[] create(ICreateContext context) {
        Service newService = null;

        String newServiceName = null;
        Interface newInterface = null;
        SCADiagramAddCompositeServiceWizard wizard = new SCADiagramAddCompositeServiceWizard();
        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        WizardDialog wizDialog = new WizardDialog(shell, wizard);
        int rtn_code = wizDialog.open();
        if (rtn_code == Window.OK) {
            newServiceName = wizard.getCompositeServiceName();
            newInterface = wizard.getInterface();
        } else {
            _hasDoneChanges = false;
            return EMPTY;
        }

        try {
            ModelHandler mh = ModelHandlerLocator.getModelHandler(getDiagram().eResource());
            Object o = getBusinessObjectForPictogramElement(context.getTargetContainer());
            newService = mh.createService((Composite) o);
            newService.setName(newServiceName);
            if (newInterface != null) {
                // do something with it
                if (newInterface instanceof JavaInterface) {
                    newService.getInterfaceGroup().set(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceJava(),
                            newInterface);
                } else if (newInterface instanceof WSDLPortType) {
                    newService.getInterfaceGroup().set(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceWsdl(),
                            newInterface);
                }
            }
        } catch (IOException e) {
            Activator.logError(e);
        }

        // do the add
        PictogramElement pe = addGraphicalRepresentation(context, newService);
        if (pe instanceof Shape) {
            // make sure the new service is positioned correctly.
            layoutPictogramElement(((Shape) pe).getContainer());
        }

        // activate direct editing after object creation
        getFeatureProvider().getDirectEditingInfo().setActive(true);

        // make sure we look like we actually did something.
        _hasDoneChanges = true;

        // return newly created business object(s)
        return new Object[] {newService };
    }

    @Override
    public String getCreateImageId() {
        return ImageProvider.IMG_16_SERVICE;
    }

}
