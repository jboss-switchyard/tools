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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType;
import org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType1;
import org.switchyard.tools.models.switchyard1_0.transform.JsonTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1;
import org.switchyard.tools.models.switchyard1_0.transform.TransformPackage;
import org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.model.merge.MergedModelUtil;
import org.switchyard.tools.ui.editor.transform.wizards.AddTransformWizard;

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
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            if (pes[0] instanceof Connection) {
                Connection connection = (Connection) pes[0];
                Object startbo = getBusinessObjectForPictogramElement(connection.getStart().getParent());
                Object endbo = getBusinessObjectForPictogramElement(connection.getEnd().getParent());
                if (startbo != null && endbo != null) {
                    AddTransformWizard wizard = new AddTransformWizard();
                    wizard.initializeFromAndTo((EObject)startbo, (EObject)endbo);
                    Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
                    WizardDialog wizDialog = new WizardDialog(shell, wizard);
                    int rtn_code = wizDialog.open();
                    if (rtn_code == Window.OK) {
                        TransformType transform = wizard.getTransform();
                        SwitchYardType switchYardRoot = MergedModelUtil.getSwitchYard((EObject) startbo);
                        TransformsType transforms = switchYardRoot.getTransforms();
                        if (transforms == null) {
                            switchYardRoot.setTransforms(SwitchyardFactory.eINSTANCE.createTransformsType());
                            transforms = switchYardRoot.getTransforms();
                        }
                        FeatureMap transformGroup = transforms.getTransformGroup();
                        if (transform instanceof JAXBTransformType) {
                            transformGroup.add(TransformPackage.eINSTANCE.getDocumentRoot_TransformJaxb(), transform);
                        } else if (transform instanceof XsltTransformType) {
                            transformGroup.add(TransformPackage.eINSTANCE.getDocumentRoot_TransformXslt(), transform);
                        } else if (transform instanceof SmooksTransformType1) {
                            transformGroup.add(TransformPackage.eINSTANCE.getDocumentRoot_TransformSmooks(), transform);
                        } else if (transform instanceof JsonTransformType) {
                            transformGroup.add(TransformPackage.eINSTANCE.getDocumentRoot_TransformJson(), transform);
                        } else if (transform instanceof JavaTransformType1) {
                            transformGroup.add(TransformPackage.eINSTANCE.getDocumentRoot_TransformJava(), transform);
                        }
                        _hasDoneChanges = true;
                    } else {
                        _hasDoneChanges = false;
                        return;
                    }
                }
            }
        }
    }

    @Override
    public String getDescription() {
        return "Add a new transformer for the connected objects.";
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            return pes[0] instanceof Connection;
        }

        return false;
    }

    @Override
    public String getName() {
        return "Add Transformer";
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
