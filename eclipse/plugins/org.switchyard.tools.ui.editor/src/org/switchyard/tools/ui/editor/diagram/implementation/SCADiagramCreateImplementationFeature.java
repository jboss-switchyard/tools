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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.component.wizards.SCADiagramAddImplementationWizard;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramCreateImplementationFeature extends AbstractCreateFeature {

    private boolean _hasDoneChanges;

    /**
     * @param fp the feature provider
     */
    public SCADiagramCreateImplementationFeature(IFeatureProvider fp) {
        super(fp, "Implementation", "Create Implementation");
    }

    @Override
    public boolean hasDoneChanges() {
        return _hasDoneChanges;
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
        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        WizardDialog wizDialog = new WizardDialog(shell, wizard);
        int rtn_code = wizDialog.open();
        if (rtn_code == Window.OK) {
            newImplementation = wizard.getImplementation();
        } else {
            _hasDoneChanges = false;
            return EMPTY;
        }

        List<Object> newObjects = new ArrayList<Object>();
        if (newImplementation != null) {
            newObjects.add(newImplementation);
            // do something with it
            component.getImplementationGroup().add(wizard.getFeatureForImplementation(), newImplementation);
            if (wizard.getImplementationServices() != null) {
                NEW_SERVICES_LOOP: for (ComponentService service : wizard.getImplementationServices()) {
                    if (service.getName() == null || service.getName().length() == 0) {
                        continue;
                    }
                    for (ComponentService existingService : component.getService()) {
                        if (service.getName().equals(existingService.getName())) {
                            continue NEW_SERVICES_LOOP;
                        }
                    }
                    component.getService().add(service);
                    newObjects.add(service);
                    addGraphicalRepresentation(context, service);
                }
            }
            if (wizard.getImplementationReferences() != null) {
                NEW_REFERENCES_LOOP: for (ComponentReference reference : wizard.getImplementationReferences()) {
                    if (reference.getName() == null || reference.getName().length() == 0) {
                        continue;
                    }
                    for (ComponentReference existingReference : component.getReference()) {
                        if (reference.getName().equals(existingReference.getName())) {
                            continue NEW_REFERENCES_LOOP;
                        }
                    }
                    component.getReference().add(reference);
                    newObjects.add(reference);
                    addGraphicalRepresentation(context, reference);
                }
            }
        }

        getDiagramEditor().refresh(context.getTargetContainer());

        // make sure we look like we actually did something.
        _hasDoneChanges = true;

        // return newly created business object(s)
        return newObjects.toArray();
    }

    @Override
    public String getCreateImageId() {
        return ImageProvider.IMG_16_IMPLEMENTATION_TYPE;
    }

}
