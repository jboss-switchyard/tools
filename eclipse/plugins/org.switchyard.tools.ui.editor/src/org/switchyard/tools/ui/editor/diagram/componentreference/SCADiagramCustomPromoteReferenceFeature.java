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
import java.util.ArrayList;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.Multiplicity;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.core.ModelHandler;
import org.switchyard.tools.ui.editor.core.ModelHandlerLocator;
import org.switchyard.tools.ui.editor.diagram.StyleUtil;
import org.switchyard.tools.ui.editor.diagram.compositereference.wizards.SCADiagramAddReferenceInterfaceWizard;
import org.switchyard.tools.ui.editor.diagram.di.DIImport;
import org.switchyard.tools.ui.editor.diagram.service.wizards.SCADiagramAddServiceInterfaceWizard;

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
                Shape referenceShape = null;
                ComponentReference cref = (ComponentReference) bo;
                ContainerShape cshape = (ContainerShape) getFeatureProvider().getPictogramElementForBusinessObject(
                        cref.eContainer().eContainer());
                Reference targetReference = null;
                for (Reference reference : ((Composite) cref.eContainer().eContainer()).getReference()) {
                    if (cref.getName().equals(reference.getName())) {
                        targetReference = reference;
                        break;
                    }
                }
                if (targetReference != null) {
                    targetReference.getPromote().add(cref);
                    Interface newInterface = null;
                    SCADiagramAddServiceInterfaceWizard wizard = new SCADiagramAddServiceInterfaceWizard();
                    if (targetReference.getInterface() != null) {
                        wizard.setInheritedInterface(targetReference.getInterface());
                    }
                    Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
                    WizardDialog wizDialog = new WizardDialog(shell, wizard);
                    wizDialog.setTitle("Specify Promoted Reference Interface");
                    int rtn_code = wizDialog.open();
                    if (rtn_code == Window.OK) {
                        newInterface = wizard.getInterface();
                        if (newInterface != null) {
                            // do something with it
                            if (newInterface instanceof JavaInterface) {
                                targetReference.getInterfaceGroup().set(
                                        ScaPackage.eINSTANCE.getDocumentRoot_InterfaceJava(), newInterface);
                            } else if (newInterface instanceof WSDLPortType) {
                                targetReference.getInterfaceGroup().set(
                                        ScaPackage.eINSTANCE.getDocumentRoot_InterfaceWsdl(), newInterface);
                            }
                        }
                    }
                    referenceShape = (Shape) getFeatureProvider().getPictogramElementForBusinessObject(targetReference);

                    this._hasDoneChanges = true;

                    // add the connection for the wire.
                    if (referenceShape != null) {
                        getDiagramEditor().refresh(referenceShape);

                        String referencedShapeName = cref.getName();
                        Anchor targetAnchor = null;
                        Anchor sourceAnchor = null;
                        Anchor[] anchors = DIImport.findAnchorsWithName(getFeatureProvider(), getDiagram(),
                                referencedShapeName);
                        for (Anchor anchor : anchors) {
                            Object anchorObj = getFeatureProvider().getBusinessObjectForPictogramElement(anchor);
                            if (anchorObj instanceof ComponentReference) {
                                ComponentReference cref2 = (ComponentReference) anchorObj;
                                if (cref2.getName().contentEquals(referencedShapeName)) {
                                    targetAnchor = anchor;
                                }
                            }
                            if (anchorObj instanceof Reference) {
                                Reference reference = (Reference) anchorObj;
                                if (reference.getName().contentEquals(referencedShapeName)) {
                                    sourceAnchor = anchor;
                                }
                            }
                        }
                        if (sourceAnchor != null && targetAnchor != null) {
                            if (sourceAnchor.getParent() != targetAnchor.getParent()) {
                                // now define the connection between the
                                // componentreference and the new
                                // reference shape
                                AddConnectionContext addReferenceContext = new AddConnectionContext(sourceAnchor,
                                        targetAnchor);
                                ArrayList<String> targetRef = new ArrayList<String>();
                                targetRef.add(referencedShapeName);
                                addReferenceContext.setNewObject(cref);
                                addReferenceContext.setTargetContainer(cshape);

                                IAddFeature addConnectionFeature = getFeatureProvider().getAddFeature(
                                        addReferenceContext);
                                if (addConnectionFeature != null && addConnectionFeature.canAdd(addReferenceContext)) {
                                    addConnectionFeature.add(addReferenceContext);
                                }
                            }
                        }
                    }
                } else {
                    try {
                        Interface newInterface = null;
                        SCADiagramAddReferenceInterfaceWizard wizard = new SCADiagramAddReferenceInterfaceWizard();
                        if (cref.getInterface() != null) {
                            wizard.setInheritedInterface(cref.getInterface());
                        }
                        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
                        WizardDialog wizDialog = new WizardDialog(shell, wizard);
                        wizDialog.setTitle("Specify Promoted Reference Interface");
                        int rtn_code = wizDialog.open();
                        if (rtn_code == Window.OK) {
                            newInterface = wizard.getInterface();
                        } else {
                            this._hasDoneChanges = false;
                            return;
                        }
                        Composite composite = (Composite) cref.eContainer().eContainer();
                        ModelHandler handler = ModelHandlerLocator.getModelHandler(getDiagram().eResource());
                        Reference newReference = handler.createCompositeReference(composite);
                        newReference.setName(cref.getName());
                        newReference.getPromote().add(cref);
                        newReference.setMultiplicity(Multiplicity._01);
                        if (newInterface != null) {
                            // do something with it
                            if (newInterface instanceof JavaInterface) {
                                newReference.getInterfaceGroup().set(
                                        ScaPackage.eINSTANCE.getDocumentRoot_InterfaceJava(), newInterface);
                            } else if (newInterface instanceof WSDLPortType) {
                                newReference.getInterfaceGroup().set(
                                        ScaPackage.eINSTANCE.getDocumentRoot_InterfaceWsdl(), newInterface);
                            }
                        }

                        AddContext addRefContext = new AddContext();
                        addRefContext.setNewObject(newReference);
                        addRefContext.setTargetContainer(cshape);
                        addRefContext.setX(cshape.getGraphicsAlgorithm().getWidth()
                                - StyleUtil.COMPOSITE_REFERENCE_WIDTH);
                        addRefContext.setY(cshape.getGraphicsAlgorithm().getY() + 3 * StyleUtil.COMPOSITE_EDGE);

                        referenceShape = (Shape) addGraphicalRepresentation(addRefContext, newReference);
                        if (referenceShape != null) {
                            // make sure the new reference is positioned
                            // correctly.
                            layoutPictogramElement(cshape);
                        }
                        this._hasDoneChanges = true;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    @Override
    public String getDescription() {
        return "Promote Component Reference";
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
        return "Promote Component Reference";
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
