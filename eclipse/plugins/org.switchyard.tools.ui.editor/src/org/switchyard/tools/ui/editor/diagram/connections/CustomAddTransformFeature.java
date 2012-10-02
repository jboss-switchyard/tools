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
package org.switchyard.tools.ui.editor.diagram.connections;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.model.merge.MergedModelUtil;
import org.switchyard.tools.ui.editor.transform.NewTransformWizard;
import org.switchyard.tools.ui.editor.transform.TransformDetails;

/**
 * @author bfitzpat
 * 
 */
public class CustomAddTransformFeature extends AbstractCustomFeature {

    private boolean _hasDoneChanges = false;

    /**
     * @param fp the feature provider
     */
    public CustomAddTransformFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public void execute(ICustomContext context) {
        _hasDoneChanges = false;
        PictogramElement[] pes = context.getPictogramElements();
        if (pes == null || pes.length != 1) {
            return;
        }
        final Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        final SwitchYardType switchYardRoot;
        final TransformDetails details;
        try {
            if (pes[0] instanceof Connection) {
                final Connection connection = (Connection) pes[0];
                final Object startbo = getBusinessObjectForPictogramElement(connection.getStart().getParent());
                final Object endbo = getBusinessObjectForPictogramElement(connection.getEnd().getParent());
                if (!(startbo instanceof Contract && endbo instanceof Contract)) {
                    return;
                }
                switchYardRoot = MergedModelUtil.getSwitchYard((EObject) startbo);
                details = new TransformDetails(switchYardRoot, (Contract) startbo, (Contract) endbo);
            } else {
                final Object bo = getBusinessObjectForPictogramElement(pes[0]);
                if (!(bo instanceof EObject)) {
                    return;
                }
                switchYardRoot = MergedModelUtil.getSwitchYard((EObject) bo);
                details = new TransformDetails(switchYardRoot);
            }
        } catch (Exception e) {
            MessageDialog.openError(shell, "Error Resolving Transformers", "Could not resolve required transformers.\n"
                    + e.getMessage());
            return;
        }
        if (details.getDeclaredTransforms().containsAll(details.getRequiredTransforms())) {
            MessageDialog.openInformation(shell, "No New Transformers Required",
                    "All required transformers have been created.");
            return;
        }
        final NewTransformWizard wizard = new NewTransformWizard();
        wizard.init(details);
        WizardDialog dialog = new WizardDialog(shell, wizard);
        if (dialog.open() != Window.OK) {
            return;
        }
        Collection<TransformType> newTransforms = wizard.getCreatedTransforms();
        if (newTransforms == null || newTransforms.isEmpty()) {
            return;
        }
        TransformsType transforms = switchYardRoot.getTransforms();
        if (transforms == null) {
            switchYardRoot.setTransforms(SwitchyardFactory.eINSTANCE.createTransformsType());
            transforms = switchYardRoot.getTransforms();
        }
        Collection<TransformType> transformsList = transforms.getTransform();
        for (TransformType newTransform : newTransforms) {
            transformsList.add(newTransform);
        }
        _hasDoneChanges = true;
    }

    @Override
    public String getDescription() {
        return "Add a new transformer for the connected objects.";
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            return pes[0] instanceof Connection || getBusinessObjectForPictogramElement(pes[0]) instanceof Composite;
        }

        return false;
    }

    @Override
    public String getName() {
        return "Create Required Transformers";
    }

    @Override
    public boolean hasDoneChanges() {
        return this._hasDoneChanges;
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
