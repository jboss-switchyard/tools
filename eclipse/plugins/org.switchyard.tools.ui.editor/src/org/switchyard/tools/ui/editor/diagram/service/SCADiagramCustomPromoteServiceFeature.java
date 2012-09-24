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
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.composite.SCADiagramAddCompositeFeature;
import org.switchyard.tools.ui.editor.model.merge.MergedModelUtil;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramCustomPromoteServiceFeature extends AbstractCustomFeature {

    private boolean _hasDoneChanges = false;

    /**
     * @param fp the feature provider
     */
    public SCADiagramCustomPromoteServiceFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public void execute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            if (bo instanceof ComponentService) {
                ComponentService componentService = (ComponentService) bo;
                createService(componentService, (Shape) pes[0]);
                getDiagramEditor().refresh();
            }
        }
    }

    private void createService(ComponentService componentService, Shape componentServiceShape) {
        Service newService = null;
        PromoteServiceWizard wizard = new PromoteServiceWizard();
        wizard.init(componentService);
        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        WizardDialog wizDialog = new WizardDialog(shell, wizard);
        int rtn_code = wizDialog.open();
        if (rtn_code == Window.OK) {
            newService = (Service) wizard.getContract();
            newService.setPromote(componentService);
        } else {
            _hasDoneChanges = false;
            return;
        }

        Composite composite = MergedModelUtil.getSwitchYard(componentService).getComposite();
        composite.getService().add(newService);

        ContainerShape compositeShape = (ContainerShape) getFeatureProvider().getPictogramElementForBusinessObject(
                composite);

        AddContext addServiceContext = SCADiagramAddCompositeFeature.createServiceAddContext(getFeatureProvider(),
                compositeShape);
        addServiceContext.setNewObject(newService);
        Shape serviceShape = (Shape) addGraphicalRepresentation(addServiceContext, newService);
        _hasDoneChanges = serviceShape != null;
    }

    @Override
    public String getDescription() {
        return "Promote Component Service";
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            return getBusinessObjectForPictogramElement(pes[0]) instanceof ComponentService;
        }

        return false;
    }

    @Override
    public String getName() {
        return "Promote Component Service";
    }

    @Override
    public boolean hasDoneChanges() {
        return _hasDoneChanges;
    }

    @Override
    public String getImageId() {
        return ImageProvider.IMG_16_PLUS;
    }

    @Override
    public boolean isAvailable(IContext context) {
        return true;
    }

}
