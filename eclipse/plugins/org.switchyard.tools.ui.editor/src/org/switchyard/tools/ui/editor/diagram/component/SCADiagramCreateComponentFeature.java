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
package org.switchyard.tools.ui.editor.diagram.component;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.component.wizards.SCADiagramAddComponentWizard;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramCreateComponentFeature extends AbstractCreateFeature {

    private boolean _hasDoneChanges;

    /**
     * @param fp feature provider
     */
    public SCADiagramCreateComponentFeature(IFeatureProvider fp) {
        super(fp, "Component", "Create Component");
    }

    @Override
    public boolean hasDoneChanges() {
        return _hasDoneChanges;
    }

    @Override
    public boolean canCreate(ICreateContext context) {
        ContainerShape targetContainer = context.getTargetContainer();
        // check if user wants to add to a diagram
        if (targetContainer instanceof Composite) {
            return true;
        }
        if (getBusinessObjectForPictogramElement(targetContainer) instanceof Composite) {
            return true;
        }
        return false;
    }

    @Override
    public Object[] create(ICreateContext context) {

        Object o = getBusinessObjectForPictogramElement(context.getTargetContainer());
        Composite composite = (Composite) o;
        Component newComponent = null;
        SCADiagramAddComponentWizard wizard = new SCADiagramAddComponentWizard();
        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        WizardDialog wizDialog = new WizardDialog(shell, wizard);
        int rtn_code = wizDialog.open();
        if (rtn_code == Window.OK) {
            newComponent = wizard.getComponent();
        } else {
            newComponent = null;
            _hasDoneChanges = false;
            return EMPTY;
        }
        // // ask user for component name
        // String newComponentName = ExampleUtil.askString(TITLE, USER_QUESTION,
        // "");
        // if (newComponentName == null || newComponentName.trim().length() ==
        // 0) {
        // return EMPTY;
        // }

        composite.getComponent().add(newComponent);

        // do the add
        addGraphicalRepresentation(context, newComponent);

        // activate direct editing after object creation
        getFeatureProvider().getDirectEditingInfo().setActive(true);

        // make sure we look like we actually did something.
        _hasDoneChanges = true;

        // return newly created business object(s)
        return new Object[] {newComponent };
    }

    @Override
    public String getCreateImageId() {
        return ImageProvider.IMG_16_COMPONENT;
    }

}
