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
package org.switchyard.tools.ui.editor.diagram.componentreference;

import java.io.IOException;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.core.ModelHandler;
import org.switchyard.tools.ui.editor.core.ModelHandlerLocator;
import org.switchyard.tools.ui.editor.diagram.componentreference.wizards.SCADiagramAddComponentReferenceWizard;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramCreateComponentReferenceFeature extends AbstractCreateFeature {

    private boolean _hasDoneChanges;

    /**
     * @param fp the feature provider
     */
    public SCADiagramCreateComponentReferenceFeature(IFeatureProvider fp) {
        super(fp, "Component Reference", "Create Component Reference");
    }

    @Override
    public boolean hasDoneChanges() {
        return _hasDoneChanges;
    }

    @Override
    public boolean canCreate(ICreateContext context) {
        ContainerShape targetContainer = context.getTargetContainer();
        // check if user wants to add to a Component
        if (targetContainer instanceof Component) {
            return true;
        }
        if (getBusinessObjectForPictogramElement(targetContainer) instanceof Component) {
            return true;
        }
        return false;
    }

    @Override
    public Object[] create(ICreateContext context) {

        String newClassName = null;
        Interface newInterface = null;
        SCADiagramAddComponentReferenceWizard wizard = new SCADiagramAddComponentReferenceWizard();
        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        WizardDialog wizDialog = new WizardDialog(shell, wizard);
        int rtn_code = wizDialog.open();
        if (rtn_code == Window.OK) {
            newClassName = wizard.getComponentReferenceName();
            newInterface = wizard.getInterface();
        } else {
            _hasDoneChanges = false;
            return EMPTY;
        }

        ComponentReference newCReference = null;

        try {
            ModelHandler mh = ModelHandlerLocator.getModelHandler(getDiagram().eResource());
            Object o = getBusinessObjectForPictogramElement(context.getTargetContainer());
            newCReference = mh.createComponentReference((Component) o);
            newCReference.setName(newClassName);
            if (newInterface != null) {
                // do something with it
                if (newInterface instanceof JavaInterface) {
                    newCReference.getInterfaceGroup().set(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceJava(),
                            newInterface);
                } else if (newInterface instanceof WSDLPortType) {
                    newCReference.getInterfaceGroup().set(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceWsdl(),
                            newInterface);
                }
            }
        } catch (IOException e) {
            Activator.logError(e);
        }
        // do the add
        addGraphicalRepresentation(context, newCReference);

        // activate direct editing after object creation
        getFeatureProvider().getDirectEditingInfo().setActive(true);

        // make sure we look like we actually did something.
        _hasDoneChanges = true;

        // return newly created business object(s)
        return new Object[] {newCReference };
    }

    @Override
    public String getCreateImageId() {
        return ImageProvider.IMG_16_COMPONENT_REFERENCE;
    }

}
