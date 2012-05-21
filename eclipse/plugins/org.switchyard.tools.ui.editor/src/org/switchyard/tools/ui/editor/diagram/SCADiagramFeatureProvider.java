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
package org.switchyard.tools.ui.editor.diagram;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDirectEditingFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;
import org.switchyard.tools.ui.editor.diagram.binding.SCADiagramAddBindingFeature;
import org.switchyard.tools.ui.editor.diagram.binding.SCADiagramCreateBindingFeature;
import org.switchyard.tools.ui.editor.diagram.component.SCADiagramAddComponentFeature;
import org.switchyard.tools.ui.editor.diagram.component.SCADiagramCreateComponentFeature;
import org.switchyard.tools.ui.editor.diagram.component.SCADiagramDirectEditComponentFeature;
import org.switchyard.tools.ui.editor.diagram.component.SCADiagramLayoutComponentFeature;
import org.switchyard.tools.ui.editor.diagram.component.SCADiagramUpdateComponentFeature;
import org.switchyard.tools.ui.editor.diagram.componentreference.SCADiagramAddComponentReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.componentreference.SCADiagramCreateComponentReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.componentreference.SCADiagramCustomPromoteReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.componentservice.SCADiagramAddComponentServiceFeature;
import org.switchyard.tools.ui.editor.diagram.componentservice.SCADiagramCreateComponentServiceFeature;
import org.switchyard.tools.ui.editor.diagram.composite.SCADiagramAddCompositeFeature;
import org.switchyard.tools.ui.editor.diagram.composite.SCADiagramCreateCompositeFeature;
import org.switchyard.tools.ui.editor.diagram.composite.SCADiagramDirectEditCompositeFeature;
import org.switchyard.tools.ui.editor.diagram.composite.SCADiagramLayoutCompositeFeature;
import org.switchyard.tools.ui.editor.diagram.composite.SCADiagramUpdateCompositeFeature;
import org.switchyard.tools.ui.editor.diagram.compositereference.SCADiagramAddCompositeReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.compositereference.SCADiagramCreateCompositeReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.compositereference.SCADiagramDirectEditCompositeReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.compositereference.SCADiagramLayoutCompositeReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.compositereference.SCADiagramMoveCompositeReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.compositereference.SCADiagramResizeCompositeReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.compositereference.SCADiagramUpdateCompositeReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.connections.SCADiagramAddComponentServiceLinkFeature;
import org.switchyard.tools.ui.editor.diagram.connections.SCADiagramAddReferenceLinkFeature;
import org.switchyard.tools.ui.editor.diagram.connections.SCADiagramCreateComponentServiceLinkFeature;
import org.switchyard.tools.ui.editor.diagram.connections.SCADiagramCreateReferenceLinkFeature;
import org.switchyard.tools.ui.editor.diagram.implementation.SCADiagramAddImplementationFeature;
import org.switchyard.tools.ui.editor.diagram.implementation.SCADiagramCreateImplementationFeature;
import org.switchyard.tools.ui.editor.diagram.service.SCADiagramAddServiceFeature;
import org.switchyard.tools.ui.editor.diagram.service.SCADiagramCreateServiceFeature;
import org.switchyard.tools.ui.editor.diagram.service.SCADiagramCustomPromoteServiceFeature;
import org.switchyard.tools.ui.editor.diagram.service.SCADiagramDirectEditServiceFeature;
import org.switchyard.tools.ui.editor.diagram.service.SCADiagramLayoutServiceFeature;
import org.switchyard.tools.ui.editor.diagram.service.SCADiagramMoveServiceFeature;
import org.switchyard.tools.ui.editor.diagram.service.SCADiagramResizeServiceFeature;
import org.switchyard.tools.ui.editor.diagram.service.SCADiagramUpdateServiceFeature;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramFeatureProvider extends DefaultFeatureProvider {

    /**
     * @param dtp the diagram type provider
     */
    public SCADiagramFeatureProvider(IDiagramTypeProvider dtp) {
        super(dtp);
    }

    @Override
    public IAddFeature getAddFeature(IAddContext context) {
        // is object for add request a EClass?
        if (context.getNewObject() instanceof Composite) {
            return new SCADiagramAddCompositeFeature(this);
        }
        if (context.getNewObject() instanceof Component) {
            return new SCADiagramAddComponentFeature(this);
        }
        if (context.getNewObject() instanceof Service) {
            return new SCADiagramAddServiceFeature(this);
        }
        if (context.getNewObject() instanceof SwitchYardBindingType) {
            return new SCADiagramAddBindingFeature(this);
        }
        if (context.getNewObject() instanceof Reference) {
            if (context instanceof AddConnectionContext) {
                return new SCADiagramAddReferenceLinkFeature(this);
            } else {
                return new SCADiagramAddCompositeReferenceFeature(this);
            }
        }
        if (context.getNewObject() instanceof ComponentReference) {
            if (context instanceof AddConnectionContext) {
                return new SCADiagramAddReferenceLinkFeature(this);
            } else {
                return new SCADiagramAddComponentReferenceFeature(this);
            }
        }
        if (context.getNewObject() instanceof ComponentService) {
            if (context instanceof AddConnectionContext) {
                return new SCADiagramAddComponentServiceLinkFeature(this);
            } else {
                return new SCADiagramAddComponentServiceFeature(this);
            }
        }
        if (context.getNewObject() instanceof Implementation) {
            return new SCADiagramAddImplementationFeature(this);
        }
        return super.getAddFeature(context);
    }

    @Override
    public ICreateFeature[] getCreateFeatures() {
        return new ICreateFeature[] {new SCADiagramCreateCompositeFeature(this),
                new SCADiagramCreateComponentFeature(this), new SCADiagramCreateServiceFeature(this),
                new SCADiagramCreateComponentServiceFeature(this), new SCADiagramCreateComponentReferenceFeature(this),
                new SCADiagramCreateCompositeReferenceFeature(this), new SCADiagramCreateBindingFeature(this),
                new SCADiagramCreateImplementationFeature(this) };
    }

    @Override
    public ICreateConnectionFeature[] getCreateConnectionFeatures() {
        return new ICreateConnectionFeature[] {new SCADiagramCreateReferenceLinkFeature(this),
                new SCADiagramCreateComponentServiceLinkFeature(this) };
    }

    @Override
    public IUpdateFeature getUpdateFeature(IUpdateContext context) {
        PictogramElement pictogramElement = context.getPictogramElement();
        if (pictogramElement instanceof ContainerShape) {
            Object bo = getBusinessObjectForPictogramElement(pictogramElement);
            if (bo instanceof Composite) {
                return new SCADiagramUpdateCompositeFeature(this);
            }
            if (bo instanceof Service) {
                return new SCADiagramUpdateServiceFeature(this);
            }
            if (bo instanceof Reference) {
                return new SCADiagramUpdateCompositeReferenceFeature(this);
            }
            if (bo instanceof Component) {
                return new SCADiagramUpdateComponentFeature(this);
            }
        }
        return super.getUpdateFeature(context);
    }

    @Override
    public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
        Shape shape = context.getShape();
        Object bo = getBusinessObjectForPictogramElement(shape);
        if (bo instanceof Service) {
            return new SCADiagramMoveServiceFeature(this);
        }
        if (bo instanceof Reference) {
            return new SCADiagramMoveCompositeReferenceFeature(this);
        }
        if (bo instanceof ComponentReference || bo instanceof ComponentService || bo instanceof Composite) {
            return null;
        }
        return super.getMoveShapeFeature(context);
    }

    @Override
    public IFeature[] getDragAndDropFeatures(IPictogramElementContext context) {
        // simply return all create connection features
        return getCreateConnectionFeatures();

    }

    @Override
    public IDirectEditingFeature getDirectEditingFeature(IDirectEditingContext context) {
        PictogramElement pe = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pe);
        if (bo instanceof Composite) {
            return new SCADiagramDirectEditCompositeFeature(this);
        }
        if (bo instanceof Component) {
            return new SCADiagramDirectEditComponentFeature(this);
        }
        if (bo instanceof Service) {
            return new SCADiagramDirectEditServiceFeature(this);
        }
        if (bo instanceof Reference) {
            return new SCADiagramDirectEditCompositeReferenceFeature(this);
        }
        return super.getDirectEditingFeature(context);
    }

    @Override
    public ILayoutFeature getLayoutFeature(ILayoutContext context) {
        PictogramElement pictogramElement = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo instanceof Composite) {
            return new SCADiagramLayoutCompositeFeature(this);
        }
        if (bo instanceof Service) {
            return new SCADiagramLayoutServiceFeature(this);
        }
        if (bo instanceof Reference) {
            return new SCADiagramLayoutCompositeReferenceFeature(this);
        }
        if (bo instanceof Component) {
            return new SCADiagramLayoutComponentFeature(this);
        }
        return super.getLayoutFeature(context);
    }

    @Override
    public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context) {
        PictogramElement pe = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pe);
        if (bo instanceof Service) {
            return new SCADiagramResizeServiceFeature(this);
        }
        if (bo instanceof Reference) {
            return new SCADiagramResizeCompositeReferenceFeature(this);
        }
        if (bo instanceof ComponentReference || bo instanceof ComponentService) {
            return null;
        }
        return super.getResizeShapeFeature(context);
    }

    @Override
    public ICustomFeature[] getCustomFeatures(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            if (bo instanceof ComponentService) {
                final List<ICustomFeature> features = new ArrayList<ICustomFeature>(2);
                features.add(new SCADiagramCustomPromoteServiceFeature(this));
                if (((ComponentService) bo).getInterface() instanceof JavaInterface) {
                    features.add(new Java2WSDLCustomFeature(this));
                }
                return features.toArray(new ICustomFeature[features.size()]);
            } else if (bo instanceof ComponentReference) {
                return new ICustomFeature[] {new SCADiagramCustomPromoteReferenceFeature(this) };
            } else if (bo instanceof Composite) {
                return new ICustomFeature[] {new AutoLayoutFeature(this) };
            }
        }
        return super.getCustomFeatures(context);
    }

}
