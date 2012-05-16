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

import java.io.IOException;

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
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.core.ModelHandler;
import org.switchyard.tools.ui.editor.core.ModelHandlerLocator;
import org.switchyard.tools.ui.editor.diagram.StyleUtil;
import org.switchyard.tools.ui.editor.diagram.di.DIImport;
import org.switchyard.tools.ui.editor.diagram.service.wizards.SCADiagramAddServiceInterfaceWizard;

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
                ComponentService cservice = (ComponentService) bo;
                Shape[] shapes = DIImport.findShapesWithName(getFeatureProvider(), getDiagram(), cservice.getName());
                if (shapes != null && shapes.length > 0) {
                    for (int i = 0; i < shapes.length; i++) {
                        Object testObj = getFeatureProvider().getBusinessObjectForPictogramElement(shapes[i]);
                        if (testObj instanceof Service) {
                            Service service = (Service) testObj;
                            service.setPromote(cservice);

                            Interface newInterface = null;
                            SCADiagramAddServiceInterfaceWizard wizard = new SCADiagramAddServiceInterfaceWizard();
                            if (cservice.getInterface() != null) {
                                wizard.setInheritedInterface(cservice.getInterface());
                            }
                            Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
                            WizardDialog wizDialog = new WizardDialog(shell, wizard);
                            wizDialog.setTitle("Specify Promoted Service Interface");
                            int rtn_code = wizDialog.open();
                            if (rtn_code == Window.OK) {
                                newInterface = wizard.getInterface();
                                if (newInterface != null) {
                                    // do something with it
                                    if (newInterface instanceof JavaInterface) {
                                        service.getInterfaceGroup().set(
                                                ScaPackage.eINSTANCE.getDocumentRoot_InterfaceJava(), newInterface);
                                    } else if (newInterface instanceof WSDLPortType) {
                                        service.getInterfaceGroup().set(
                                                ScaPackage.eINSTANCE.getDocumentRoot_InterfaceWsdl(), newInterface);
                                    }
                                }
                            }

                            this._hasDoneChanges = true;
                            connectService(cservice, shapes[i], (Shape) pes[0]);
                            break;
                        }
                    }
                    if (!this._hasDoneChanges) {
                        createService(cservice, (Shape) pes[0]);
                    }
                    getDiagramEditor().refresh();
                } else {
                    createService(cservice, (Shape) pes[0]);
                    getDiagramEditor().refresh();
                }
            }
        }
    }

    private void createService(ComponentService cservice, Shape componentServiceShape) {
        try {
            Interface newInterface = null;
            SCADiagramAddServiceInterfaceWizard wizard = new SCADiagramAddServiceInterfaceWizard();
            if (cservice.getInterface() != null) {
                wizard.setInheritedInterface(cservice.getInterface());
            }
            Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
            WizardDialog wizDialog = new WizardDialog(shell, wizard);
            wizDialog.setTitle("Specify Promoted Service Interface");
            int rtn_code = wizDialog.open();
            if (rtn_code == Window.OK) {
                newInterface = wizard.getInterface();
            } else {
                this._hasDoneChanges = false;
                return;
            }

            Composite composite = (Composite) cservice.eContainer().eContainer();
            ModelHandler handler = ModelHandlerLocator.getModelHandler(getDiagram().eResource());
            Service newService = handler.createService(composite);

            newService.setName(cservice.getName());
            newService.setPromote(cservice);

            if (newInterface != null) {
                // do something with it
                if (newInterface instanceof JavaInterface) {
                    newService.getInterfaceGroup().set(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceJava(),
                            newInterface);
                } else if (newInterface instanceof WSDLPortType) {
                    newService.getInterfaceGroup().set(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceWsdl(),
                            newInterface);
                }
            }

            ContainerShape cshape = (ContainerShape) getFeatureProvider().getPictogramElementForBusinessObject(
                    composite);

            AddContext addServiceContext = new AddContext();
            addServiceContext.setNewObject(newService);
            addServiceContext.setTargetContainer(cshape);
            addServiceContext.setX(0);
            addServiceContext.setY(cshape.getGraphicsAlgorithm().getY() + 3 * StyleUtil.COMPOSITE_EDGE);
            Shape serviceShape = (Shape) addGraphicalRepresentation(addServiceContext, newService);
            if (serviceShape != null) {
                this._hasDoneChanges = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void connectService(ComponentService componentService, Shape serviceShape, Shape componentServiceShape) {
        getDiagramEditor().refresh(serviceShape);

        Anchor targetAnchor = getAnchor(componentServiceShape);
        Anchor sourceAnchor = getAnchor(serviceShape);
        if (sourceAnchor != null && targetAnchor != null) {
            if (sourceAnchor.getParent() != targetAnchor.getParent()) {
                // now define the connection between the
                // componentservice and the new service shape
                AddConnectionContext addReferenceContext = new AddConnectionContext(sourceAnchor, targetAnchor);
                addReferenceContext.setNewObject(componentService);
                addReferenceContext.setTargetContainer(serviceShape.getContainer());
                addGraphicalRepresentation(addReferenceContext, componentService);
            }
        }

        this._hasDoneChanges = true;
    }

    private Anchor getAnchor(Shape shape) {
        if (shape.getAnchors().size() > 0) {
            return shape.getAnchors().get(0);
        }
        return null;
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
