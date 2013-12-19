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
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IDirectEditingFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IReconnectionFeature;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.LayoutContext;
import org.eclipse.graphiti.features.context.impl.ReconnectionContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;
import org.switchyard.tools.ui.editor.BindingTypeExtensionManager;
import org.switchyard.tools.ui.editor.ComponentTypeExtensionManager;
import org.switchyard.tools.ui.editor.IBindingTypeExtension;
import org.switchyard.tools.ui.editor.IComponentTypeExtension;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.AutoLayoutFeature.RecreateDiagramFeature;
import org.switchyard.tools.ui.editor.diagram.binding.SCADiagramAddBindingFeature;
import org.switchyard.tools.ui.editor.diagram.component.AbstractComponentFactory;
import org.switchyard.tools.ui.editor.diagram.component.CreateComponentFeature;
import org.switchyard.tools.ui.editor.diagram.component.SCADiagramAddComponentFeature;
import org.switchyard.tools.ui.editor.diagram.component.SCADiagramDirectEditComponentFeature;
import org.switchyard.tools.ui.editor.diagram.component.SCADiagramLayoutComponentFeature;
import org.switchyard.tools.ui.editor.diagram.component.SCADiagramUpdateComponentFeature;
import org.switchyard.tools.ui.editor.diagram.componentreference.SCADiagramAddComponentReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.componentreference.SCADiagramCreateComponentReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.componentreference.SCADiagramCustomPromoteReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.componentreference.UpdateComponentReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.componentservice.SCADiagramAddComponentServiceFeature;
import org.switchyard.tools.ui.editor.diagram.componentservice.SCADiagramCreateComponentServiceFeature;
import org.switchyard.tools.ui.editor.diagram.componentservice.UpdateComponentServiceFeature;
import org.switchyard.tools.ui.editor.diagram.composite.SCADiagramAddCompositeFeature;
import org.switchyard.tools.ui.editor.diagram.composite.SCADiagramDeleteCompositeFeature;
import org.switchyard.tools.ui.editor.diagram.composite.SCADiagramDirectEditCompositeFeature;
import org.switchyard.tools.ui.editor.diagram.composite.SCADiagramLayoutCompositeFeature;
import org.switchyard.tools.ui.editor.diagram.composite.SCADiagramResizeCompositeFeature;
import org.switchyard.tools.ui.editor.diagram.composite.SCADiagramUpdateCompositeFeature;
import org.switchyard.tools.ui.editor.diagram.compositereference.SCADiagramAddCompositeReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.compositereference.SCADiagramCreateCompositeReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.compositereference.SCADiagramDirectEditCompositeReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.compositereference.SCADiagramLayoutCompositeReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.compositereference.SCADiagramMoveCompositeReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.compositereference.SCADiagramResizeCompositeReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.compositereference.SCADiagramUpdateCompositeReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.connections.CustomAddTransformFeature;
import org.switchyard.tools.ui.editor.diagram.connections.ReconnectComponentReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.connections.ReconnectComponentServiceFeature;
import org.switchyard.tools.ui.editor.diagram.connections.ReconnectCompositeReferenceFeature;
import org.switchyard.tools.ui.editor.diagram.connections.ReconnectCompositeServiceFeature;
import org.switchyard.tools.ui.editor.diagram.connections.SCADiagramAddComponentServiceLinkFeature;
import org.switchyard.tools.ui.editor.diagram.connections.SCADiagramAddReferenceLinkFeature;
import org.switchyard.tools.ui.editor.diagram.connections.SCADiagramCreateComponentServiceLinkFeature;
import org.switchyard.tools.ui.editor.diagram.connections.SCADiagramCreateReferenceLinkFeature;
import org.switchyard.tools.ui.editor.diagram.implementation.SCADiagramAddImplementationFeature;
import org.switchyard.tools.ui.editor.diagram.service.SCADiagramAddServiceFeature;
import org.switchyard.tools.ui.editor.diagram.service.SCADiagramCreateServiceFeature;
import org.switchyard.tools.ui.editor.diagram.service.SCADiagramCustomPromoteServiceFeature;
import org.switchyard.tools.ui.editor.diagram.service.SCADiagramDirectEditServiceFeature;
import org.switchyard.tools.ui.editor.diagram.service.SCADiagramLayoutServiceFeature;
import org.switchyard.tools.ui.editor.diagram.service.SCADiagramMoveServiceFeature;
import org.switchyard.tools.ui.editor.diagram.service.SCADiagramResizeServiceFeature;
import org.switchyard.tools.ui.editor.diagram.service.SCADiagramUpdateServiceFeature;
import org.switchyard.tools.ui.editor.diagram.shared.CompositeCreateConnectionFeature;
import org.switchyard.tools.ui.editor.diagram.shared.CompositeCreateFeature;

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
        List<ICreateFeature> features = new ArrayList<ICreateFeature>();
        features.addAll(getCreateGenericFeatures());
        features.addAll(getCreateComponentFeatures());
        features.addAll(getCreateBindingFeatures());
        return features.toArray(new ICreateFeature[features.size()]);
    }

    /* package */List<ICreateFeature> getCreateComponentFeatures() {
        List<ICreateFeature> features = new ArrayList<ICreateFeature>(5);
        for (IComponentTypeExtension extension : ComponentTypeExtensionManager.instance().getExtensions()) {
            features.addAll(Arrays.asList(extension.newCreateFeatures(this)));
        }

        Collections.sort(features, new Comparator<ICreateFeature>() {
            @Override
            public int compare(ICreateFeature o1, ICreateFeature o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        return features;
    }

    /* package */List<ICreateFeature> getCreateGenericFeatures() {
        List<ICreateFeature> features = new ArrayList<ICreateFeature>(3);
        features.add(new CreateComponentFeature(this, new AbstractComponentFactory(), Messages.label_component,
                Messages.description_tool_component));
        features.add(new CompositeCreateFeature(this, Messages.label_service, Messages.description_tool_service,
                new SCADiagramCreateServiceFeature(this), new SCADiagramCreateComponentServiceFeature(this)));
        features.add(new CompositeCreateFeature(this, Messages.label_reference, Messages.description_tool_reference,
                new SCADiagramCreateCompositeReferenceFeature(this),
                new SCADiagramCreateComponentReferenceFeature(this)));
        return features;
    }

    /* package */List<ICreateFeature> getCreateBindingFeatures() {
        List<ICreateFeature> features = new ArrayList<ICreateFeature>(10);
        for (IBindingTypeExtension extension : BindingTypeExtensionManager.instance().getExtensions()) {
            features.addAll(Arrays.asList(extension.newCreateFeatures(this)));
        }
        Collections.sort(features, new Comparator<ICreateFeature>() {
            @Override
            public int compare(ICreateFeature o1, ICreateFeature o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        return features;
    }

    /* package */List<ICreateFeature> getCreateOtherFeatures() {
        return Collections.emptyList();
    }

    @Override
    public ICreateConnectionFeature[] getCreateConnectionFeatures() {
        return new ICreateConnectionFeature[] {new CompositeCreateConnectionFeature(this, Messages.label_promote,
                Messages.description_tool_promote, new SCADiagramCreateReferenceLinkFeature(this),
                new SCADiagramCreateComponentServiceLinkFeature(this)) };
    }

    @Override
    public IUpdateFeature getUpdateFeature(IUpdateContext context) {
        PictogramElement pictogramElement = context.getPictogramElement();
        if (pictogramElement instanceof Diagram) {
            return new UpdateDiagramFeature(this);
        } else if (pictogramElement instanceof ContainerShape) {
            Object bo = getBusinessObjectForPictogramElement(pictogramElement);
            if (bo instanceof Composite) {
                return new SCADiagramUpdateCompositeFeature(this);
            } else if (bo instanceof Service) {
                return new SCADiagramUpdateServiceFeature(this);
            } else if (bo instanceof Reference) {
                return new SCADiagramUpdateCompositeReferenceFeature(this);
            } else if (bo instanceof Component) {
                return new SCADiagramUpdateComponentFeature(this);
            } else if (bo instanceof ComponentService) {
                return new UpdateComponentServiceFeature(this);
            } else if (bo instanceof ComponentReference) {
                return new UpdateComponentReferenceFeature(this);
            }
        } else if (pictogramElement instanceof Connection) {
            return new UpdateConnectionFeature(this);
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
        if (bo instanceof EObject
                && ((EObject) bo).eResource() != null
                && getDiagramTypeProvider().getDiagramBehavior().getEditingDomain()
                        .isReadOnly(((EObject) bo).eResource())) {
            return null;
        }
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
        if (bo instanceof Composite) {
            return new SCADiagramResizeCompositeFeature(this);
        } else if (bo instanceof Service) {
            return new SCADiagramResizeServiceFeature(this);
        } else if (bo instanceof Reference) {
            return new SCADiagramResizeCompositeReferenceFeature(this);
        } else if (bo instanceof ComponentReference || bo instanceof ComponentService) {
            return null;
        }
        return super.getResizeShapeFeature(context);
    }

    @Override
    public ICustomFeature[] getCustomFeatures(ICustomContext context) {
        List<ICustomFeature> features = new ArrayList<ICustomFeature>();
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            if (bo instanceof ComponentService) {
                features.add(new SCADiagramCustomPromoteServiceFeature(this));
                // features.add(new PropertiesDialogFeature(this));
            } else if (bo instanceof ComponentReference) {
                features.add(new SCADiagramCustomPromoteReferenceFeature(this));
            } else if (bo instanceof Composite) {
                features.add(new RecreateDiagramFeature(this));
                features.add(new CustomAddTransformFeature(this));
                features.add(new ToggleTransformBreakpointFeature(this, context));
                features.add(new ToggleValidateBreakpointFeature(this, context));
            }
            if (bo instanceof Contract) {
                final Interface intf = ((Contract) bo).getInterface();
                features.add(new CreateServiceTestCustomFeature(this));
                features.add(new ToggleServiceBreakpointFeature(this, context));
                if (intf instanceof JavaInterface) {
                    features.add(new Java2WSDLCustomFeature(this));
                } else if (intf instanceof WSDLPortType) {
                    features.add(new WSDL2JavaCustomFeature(this));
                }
            }
            // if (bo != null) {
            // features.add(new PropertiesDialogFeature(this));
            // }
            if (pes[0] instanceof Connection) {
                features.add(new CustomAddTransformFeature(this));
                features.add(new ToggleServiceBreakpointFeature(this, context));
            }
        }
        features.add(new SynchronizeGeneratedModelFeature(this));
        features.add(new ValidateModelFeature(this));
        features.add(new PropertiesDialogFeature(this));
        return features.toArray(new ICustomFeature[features.size()]);
    }

    @Override
    public IDeleteFeature getDeleteFeature(IDeleteContext context) {
        PictogramElement pe = context.getPictogramElement();
        if (pe instanceof Connection) {
            return new ConnectionDeleteFeature(this);
        } else if (pe != null) {
            Object bo = getBusinessObjectForPictogramElement(pe);
            if (bo instanceof Composite) {
                return new SCADiagramDeleteCompositeFeature(this);
            } else {
                return new DefaultDeleteFeature(this) {
                    private PictogramElement _parentElement;

                    @Override
                    public void preDelete(IDeleteContext context) {
                        super.preDelete(context);
                        PictogramElement pe = context.getPictogramElement();
                        if (pe instanceof Shape) {
                            _parentElement = ((Shape) pe).getContainer();
                        } else {
                            _parentElement = null;
                        }
                    }

                    @Override
                    public void postDelete(IDeleteContext context) {
                        super.postDelete(context);
                        if (hasDoneChanges() && _parentElement != null) {
                            layoutIfPossible(new LayoutContext(_parentElement));
                        }
                    }
                };
            }
        }
        return new ReadOnlyDeleteFeature(this);
    }

    @Override
    public IRemoveFeature getRemoveFeature(IRemoveContext context) {
        PictogramElement pe = context.getPictogramElement();
        if (pe != null) {
            Object bo = getBusinessObjectForPictogramElement(pe);
            if (bo instanceof Composite) {
                return null;
            } else if (bo instanceof Component) {
                return new CascadingRemoveFeature(this);
            }
        }
        return super.getRemoveFeature(context);
    }

    @Override
    public IReconnectionFeature getReconnectionFeature(IReconnectionContext context) {
        final Object boBeingReconnected;
        if (ReconnectionContext.RECONNECT_SOURCE.equals(context.getReconnectType())) {
            boBeingReconnected = getBusinessObjectForPictogramElement(context.getConnection().getEnd());
        } else {
            boBeingReconnected = getBusinessObjectForPictogramElement(context.getConnection().getStart());
        }
        if (boBeingReconnected instanceof Service) {
            return new ReconnectCompositeServiceFeature(this, (Service) boBeingReconnected);
        } else if (boBeingReconnected instanceof ComponentService) {
            if (getBusinessObjectForPictogramElement(context.getOldAnchor()) instanceof Service) {
                return new ReconnectComponentServiceFeature(this, (ComponentService) boBeingReconnected);
            }
            /*
             * don't allow reconnection of reference end of service<->reference
             * connections.
             */
            return null;
        } else if (boBeingReconnected instanceof Reference) {
            return new ReconnectCompositeReferenceFeature(this, (Reference) boBeingReconnected);
        } else if (boBeingReconnected instanceof ComponentReference) {
            return new ReconnectComponentReferenceFeature(this, (ComponentReference) boBeingReconnected);
        }
        return null;
    }

}
