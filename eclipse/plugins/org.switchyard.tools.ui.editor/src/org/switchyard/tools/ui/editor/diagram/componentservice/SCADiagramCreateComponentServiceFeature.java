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
package org.switchyard.tools.ui.editor.diagram.componentservice;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.ui.editor.ComponentTypeExtensionManager;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.shared.BaseNewContractWizard;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramCreateComponentServiceFeature extends AbstractCreateFeature {

    private boolean _hasDoneChanges;

    /**
     * @param fp the feature provider
     */
    public SCADiagramCreateComponentServiceFeature(IFeatureProvider fp) {
        super(fp, "Service", "Create Component Service");
    }

    @Override
    public boolean hasDoneChanges() {
        return _hasDoneChanges;
    }

    @Override
    public boolean canCreate(ICreateContext context) {
        final Object bo = getBusinessObjectForPictogramElement(context.getTargetContainer());
        return bo instanceof Component && ((Component) bo).getService().size() == 0
                && ComponentTypeExtensionManager.getSupportedInterfaceTypes((Component) bo).size() > 0
                && !getDiagramEditor().getEditingDomain().isReadOnly(((Component) bo).eResource());
    }

    @Override
    public Object[] create(ICreateContext context) {
        ComponentService newService = null;
        Component component = (Component) getBusinessObjectForPictogramElement(context.getTargetContainer());
        BaseNewContractWizard wizard = new BaseNewContractWizard("New Service", "Specify details for the new service.",
                ScaPackage.eINSTANCE.getComponentService(),
                ComponentTypeExtensionManager.getSupportedInterfaceTypes(component));
        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        WizardDialog wizDialog = new WizardDialog(shell, wizard);
        wizard.init(component);
        int rtn_code = wizDialog.open();
        if (rtn_code == Window.OK) {
            newService = (ComponentService) wizard.getContract();
        } else {
            _hasDoneChanges = false;
            return EMPTY;
        }

        component.getService().add(newService);

        // do the add
        addGraphicalRepresentation(context, newService);

        // activate direct editing after object creation
        getFeatureProvider().getDirectEditingInfo().setActive(true);

        // make sure we look like we actually did something.
        _hasDoneChanges = true;

        // return newly created business object(s)
        return new Object[] {newService };
    }

    @Override
    public String getCreateImageId() {
        return ImageProvider.IMG_16_COMPONENT_SERVICE;
    }

}
