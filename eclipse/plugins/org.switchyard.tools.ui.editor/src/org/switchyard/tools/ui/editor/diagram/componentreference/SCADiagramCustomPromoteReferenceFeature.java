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

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.Multiplicity;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.composite.SCADiagramAddCompositeFeature;
import org.switchyard.tools.ui.editor.diagram.compositereference.PromoteReferenceWizard;
import org.switchyard.tools.ui.editor.model.merge.MergedModelUtil;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramCustomPromoteReferenceFeature extends AbstractCustomFeature {

    private boolean _hasDoneChanges = false;

    /**
     * @param fp the feature provider
     */
    public SCADiagramCustomPromoteReferenceFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public void execute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            if (bo instanceof ComponentReference) {
                ComponentReference componentReference = (ComponentReference) bo;
                Reference newReference = null;
                PromoteReferenceWizard wizard = new PromoteReferenceWizard();
                wizard.init(componentReference);
                Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
                WizardDialog wizDialog = new WizardDialog(shell, wizard);
                boolean doNotAddNewShape = false;
                int rtn_code = wizDialog.open();
                if (rtn_code == Window.OK) {
                    
                    newReference = (Reference) wizard.getContract();
                    newReference.setMultiplicity(Multiplicity._01);

                    Component parentComponent = (Component) componentReference.eContainer();
                    Composite parentComposite = (Composite) parentComponent.eContainer();
                    EList<Reference> refs = parentComposite.getReference();
                    for (Reference ref : refs) {
                        boolean nameMatch = false;
                        boolean foundDupe = false;
                        if (ref.getName().equals(newReference.getName())) {
                            nameMatch = true;
                            if (ref.getInterface().eClass().getName().equals(newReference.getInterface().eClass().getName())) {
                                if (ref.getInterface() instanceof JavaInterface) {
                                    JavaInterface refIntfc = (JavaInterface) ref.getInterface();
                                    JavaInterface newRefIntfc = (JavaInterface) newReference.getInterface();
                                    if (refIntfc.getInterface().equals(newRefIntfc.getInterface())) {
                                        foundDupe = true;
                                    }
                                } else if (ref.getInterface() instanceof EsbInterface) {
                                    EsbInterface refIntfc = (EsbInterface) ref.getInterface();
                                    EsbInterface newRefIntfc = (EsbInterface) newReference.getInterface();
                                    boolean inputMatch = false;
                                    if (refIntfc.getInputType() != null && refIntfc.getInputType().equals(newRefIntfc.getInputType())) {
                                        inputMatch = true;
                                    } else if (refIntfc.getInputType() == null && newRefIntfc.getInputType() == null) {
                                        inputMatch = true;
                                    }
                                    boolean outputMatch = false;
                                    if (refIntfc.getOutputType() != null && refIntfc.getOutputType().equals(newRefIntfc.getOutputType())) {
                                        outputMatch = true;
                                    } else if (refIntfc.getOutputType() == null && newRefIntfc.getOutputType() == null) {
                                        outputMatch = true;
                                    }
                                    boolean faultMatch = false;
                                    if (refIntfc.getFaultType() != null && refIntfc.getFaultType().equals(newRefIntfc.getFaultType())) {
                                        faultMatch = true;
                                    } else if (refIntfc.getFaultType() == null && newRefIntfc.getFaultType() == null) {
                                        faultMatch = true;
                                    }
                                    if (inputMatch && outputMatch && faultMatch) {
                                        foundDupe = true;
                                    }
                                } else if (ref.getInterface() instanceof WSDLPortType) {
                                    WSDLPortType refIntfc = (WSDLPortType) ref.getInterface();
                                    WSDLPortType newRefIntfc = (WSDLPortType) newReference.getInterface();
                                    if (refIntfc.getInterface().equals(newRefIntfc.getInterface())) {
                                        foundDupe = true;
                                    }
                                }
                            }
                        }
                        if (foundDupe && nameMatch) {
                            // found a dupe
                            newReference = ref;
                            doNotAddNewShape = true;
                            break;
                        } else if (!foundDupe && nameMatch) {
                            // invalid - name match but no interface match
                            _hasDoneChanges = false;
                            MessageDialog dialog = new MessageDialog(shell, "Invalid Reference Promotion", 
                                    null, "An existing promoted composite reference already exists with the name " + newReference.getName() + " and a different interface type.",
                                    SWT.NULL, new String[] {"OK"}, 0);
                            dialog.open();
                            return;
                        }
                    }
                    
                    newReference.getPromote().add(componentReference);

//                    if (wizard.isRemoted()) {
//                        RemoteBindingType remoteBinding =
//                                RemoteFactory.eINSTANCE.createRemoteBindingType();
//                        newReference.getBinding().add(remoteBinding);
//                    }
                } else {
                    _hasDoneChanges = false;
                    return;
                }

                SwitchYardType switchYardRoot = MergedModelUtil.getSwitchYard(componentReference);
                Composite composite = switchYardRoot.getComposite();
                composite.getReference().add(newReference);

                // add in any new transformers
                Collection<TransformType> newTransforms = wizard.getCreatedTransforms();
                if (newTransforms != null && newTransforms.size() > 0) {
                    TransformsType transforms = switchYardRoot.getTransforms();
                    if (transforms == null) {
                        switchYardRoot.setTransforms(SwitchyardFactory.eINSTANCE.createTransformsType());
                        transforms = switchYardRoot.getTransforms();
                    }
                    Collection<TransformType> transformsList = transforms.getTransform();
                    for (TransformType newTransform : newTransforms) {
                        transformsList.add(newTransform);
                    }
                }

                if (!doNotAddNewShape) {
                    ContainerShape compositeShape = (ContainerShape) getFeatureProvider()
                            .getPictogramElementForBusinessObject(composite);
    
                    AddContext addRefContext = SCADiagramAddCompositeFeature.createReferenceAddContext(
                            getFeatureProvider(), compositeShape);
                    addRefContext.setNewObject(newReference);
                    Shape referenceShape = (Shape) addGraphicalRepresentation(addRefContext, newReference);
                    if (referenceShape != null) {
                        // make sure the new reference is positioned
                        // correctly.
                        layoutPictogramElement(compositeShape);
                    }
                }
                _hasDoneChanges = true;
            }
        }
    }

    @Override
    public String getDescription() {
        return "Promote the reference";
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            return getBusinessObjectForPictogramElement(pes[0]) instanceof ComponentReference;
        }

        return false;
    }

    @Override
    public String getName() {
        return "Promote Reference";
    }

    @Override
    public boolean hasDoneChanges() {
        return this._hasDoneChanges;
    }

    @Override
    public String getImageId() {
        return ImageProvider.IMG_16_PROMOTE;
    }

    @Override
    public boolean isAvailable(IContext context) {
        return true;
    }

}
