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

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.shared.BaseNewContractWizard;

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
        Composite composite = (Composite) getBusinessObjectForPictogramElement(context.getTargetContainer());
        BaseNewContractWizard wizard = new BaseNewContractWizard("New Service", "Specify details for the new service.",
                ScaPackage.eINSTANCE.getService());
        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        WizardDialog wizDialog = new WizardDialog(shell, wizard);
        wizard.init(composite);
        int rtn_code = wizDialog.open();
        if (rtn_code == Window.OK) {
            newService = (Service) wizard.getContract();
        } else {
            _hasDoneChanges = false;
            return EMPTY;
        }

        composite.getService().add(newService);

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
