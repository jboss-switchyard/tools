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

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Multiplicity;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.shared.BaseNewContractWizard;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramCreateCompositeReferenceFeature extends AbstractCreateFeature {

    private boolean _hasDoneChanges;

    /**
     * @param fp feature provider
     */
    public SCADiagramCreateCompositeReferenceFeature(IFeatureProvider fp) {
        super(fp, "Reference", "Create Composite Reference");
    }

    @Override
    public boolean hasDoneChanges() {
        return _hasDoneChanges;
    }

    @Override
    public boolean canCreate(ICreateContext context) {
        final Object bo = getBusinessObjectForPictogramElement(context.getTargetContainer());
        if (bo instanceof Composite && !getDiagramBehavior().getEditingDomain().isReadOnly(((Composite) bo).eResource())) {
            return true;
        }
        return false;
    }

    @Override
    public Object[] create(ICreateContext context) {
        Reference newReference = null;
        Composite composite = (Composite) getBusinessObjectForPictogramElement(context.getTargetContainer());
        BaseNewContractWizard wizard = new BaseNewContractWizard("New Reference",
                "Specify details for the new reference.", ScaPackage.eINSTANCE.getReference());
        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        WizardDialog wizDialog = new WizardDialog(shell, wizard);
        wizard.init(composite);
        int rtn_code = wizDialog.open();
        if (rtn_code == Window.OK) {
            newReference = (Reference) wizard.getContract();
            newReference.setMultiplicity(Multiplicity._01);
        } else {
            _hasDoneChanges = false;
            return EMPTY;
        }

        composite.getReference().add(newReference);

        // do the add
        PictogramElement pe = addGraphicalRepresentation(context, newReference);
        if (pe instanceof Shape) {
            // make sure the new reference is positioned correctly.
            layoutPictogramElement(((Shape) pe).getContainer());
        }

        // make sure we look like we actually did something.
        _hasDoneChanges = true;

        // return newly created business object(s)
        return new Object[] {newReference };
    }

    @Override
    public String getCreateImageId() {
        return ImageProvider.IMG_16_REFERENCE;
    }

}
