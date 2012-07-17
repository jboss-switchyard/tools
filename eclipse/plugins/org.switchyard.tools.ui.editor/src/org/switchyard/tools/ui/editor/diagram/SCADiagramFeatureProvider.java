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
import java.util.Collections;
import java.util.List;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IDirectEditingFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
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
import org.switchyard.tools.ui.editor.components.bean.BeanComponentFactory;
import org.switchyard.tools.ui.editor.components.bean.BeanImplementationFactory;
import org.switchyard.tools.ui.editor.components.bpm.BPMComponentFactory;
import org.switchyard.tools.ui.editor.components.bpm.BPMImplementationFactory;
import org.switchyard.tools.ui.editor.components.camel.file.CamelFileBindingFactory;
import org.switchyard.tools.ui.editor.components.camel.ftp.CamelFTPBindingFactory;
import org.switchyard.tools.ui.editor.components.camel.java.CamelJavaComponentFactory;
import org.switchyard.tools.ui.editor.components.camel.java.CamelJavaImplementationFactory;
import org.switchyard.tools.ui.editor.components.camel.jms.CamelJmsBindingFactory;
import org.switchyard.tools.ui.editor.components.camel.netty.CamelNettyTCPBindingFactory;
import org.switchyard.tools.ui.editor.components.camel.netty.CamelNettyUDPBindingFactory;
import org.switchyard.tools.ui.editor.components.camel.quartz.CamelQuartzBindingFactory;
import org.switchyard.tools.ui.editor.components.camel.sql.CamelSqlBindingFactory;
import org.switchyard.tools.ui.editor.components.camel.xml.CamelXMLComponentFactory;
import org.switchyard.tools.ui.editor.components.camel.xml.CamelXMLImplementationFactory;
import org.switchyard.tools.ui.editor.components.jca.JCABindingFactory;
import org.switchyard.tools.ui.editor.components.rules.RulesComponentFactory;
import org.switchyard.tools.ui.editor.components.rules.RulesImplementationFactory;
import org.switchyard.tools.ui.editor.components.soap.SOAPBindingFactory;
import org.switchyard.tools.ui.editor.diagram.binding.CreateBindingFeature;
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
import org.switchyard.tools.ui.editor.diagram.componentservice.SCADiagramAddComponentServiceFeature;
import org.switchyard.tools.ui.editor.diagram.componentservice.SCADiagramCreateComponentServiceFeature;
import org.switchyard.tools.ui.editor.diagram.composite.SCADiagramAddCompositeFeature;
import org.switchyard.tools.ui.editor.diagram.composite.SCADiagramDeleteCompositeFeature;
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
import org.switchyard.tools.ui.editor.diagram.implementation.CreateImplementationFeature;
import org.switchyard.tools.ui.editor.diagram.implementation.SCADiagramAddImplementationFeature;
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
        List<ICreateFeature> features = new ArrayList<ICreateFeature>();
        features.addAll(getCreateCompositeFeatures());
        features.addAll(getCreateComponentFeatures());
        features.addAll(getCreateImplementationFeatures());
        features.addAll(getCreateBindingFeatures());
        return features.toArray(new ICreateFeature[features.size()]);
    }

    /* package */List<ICreateFeature> getCreateComponentFeatures() {
        List<ICreateFeature> features = new ArrayList<ICreateFeature>(5);
        // component types
        features.add(new CreateComponentFeature(this, new AbstractComponentFactory(), "Abstract",
                "Create a simple component with no implementation, services or references."));
        features.add(new CreateComponentFeature(this, new CamelJavaComponentFactory(), "Camel (Java)",
                "Create a component implemented as a Java based Camel route."));
        features.add(new CreateComponentFeature(this, new CamelXMLComponentFactory(), "Camel (XML)",
                "Create a component implemented as an XML based Camel route."));
        features.add(new CreateComponentFeature(this, new BeanComponentFactory(), "Bean",
                "Create a component with a Java Bean (CDI) implementation."));
        features.add(new CreateComponentFeature(this, new BPMComponentFactory(), "Process (BPMN)",
                "Create a component implemented as a BPMN process."));
        features.add(new CreateComponentFeature(this, new RulesComponentFactory(), "Rules (DRL)",
                "Create a component implemented using rules."));

        // services & references
        features.add(new SCADiagramCreateComponentServiceFeature(this));
        features.add(new SCADiagramCreateComponentReferenceFeature(this));

        return features;
    }

    /* package */List<ICreateFeature> getCreateCompositeFeatures() {
        List<ICreateFeature> features = new ArrayList<ICreateFeature>(2);
        features.add(new SCADiagramCreateServiceFeature(this));
        features.add(new SCADiagramCreateCompositeReferenceFeature(this));
        return features;
    }

    /* package */List<ICreateFeature> getCreateImplementationFeatures() {
        List<ICreateFeature> features = new ArrayList<ICreateFeature>(2);
        features.add(new CreateImplementationFeature(this, new CamelJavaImplementationFactory(), "Camel (Java)",
                "An implementation using a Java based Camel route."));
        features.add(new CreateImplementationFeature(this, new CamelXMLImplementationFactory(), "Camel (XML)",
                "An implementation using an XML based Camel route."));
        features.add(new CreateImplementationFeature(this, new BeanImplementationFactory(), "Bean",
                "An implementation using a Java Bean (CDI).") {
            @Override
            public boolean canCreate(ICreateContext context) {
                if (super.canCreate(context)) {
                    Component component = (Component) getBusinessObjectForPictogramElement(context.getTargetContainer());
                    if (component.getService() == null) {
                        // no service contract defined
                        return true;
                    }
                    for (ComponentService service : component.getService()) {
                        // only allow this if the component has a java contract
                        // defined
                        return service.getInterface() == null || service.getInterface() instanceof JavaInterface;
                    }
                    // no service contract defined
                    return true;
                }
                return false;
            }
        });
        features.add(new CreateImplementationFeature(this, new BPMImplementationFactory(), "Process (BPMN)",
                "An implementation using a BPMN process."));
        features.add(new CreateImplementationFeature(this, new RulesImplementationFactory(), "Rules (DRL)",
                "An implementation using rules."));
        return features;
    }

    /* package */List<ICreateFeature> getCreateBindingFeatures() {
        List<ICreateFeature> features = new ArrayList<ICreateFeature>(1);
        features.add(new CreateBindingFeature(this, new CamelFileBindingFactory(), "File",
                "A Camel File based endpoint."));
        features.add(new CreateBindingFeature(this, new CamelFTPBindingFactory(), "FTP", "A Camel FTP based endpoint."));
        features.add(new CreateBindingFeature(this, new JCABindingFactory(), "JCA", 
                "A JCA based endpoint."));
        features.add(new CreateBindingFeature(this, new CamelJmsBindingFactory(), "JMS", "A Camel JMS based endpoint."));
        features.add(new CreateBindingFeature(this, new CamelNettyTCPBindingFactory(), "Netty TCP",
                "A Camel Netty TCP based endpoint."));
        features.add(new CreateBindingFeature(this, new CamelNettyUDPBindingFactory(), "Netty UDP",
                "A Camel Netty UDP based endpoint."));
        features.add(new CreateBindingFeature(this, new CamelQuartzBindingFactory(), "Scheduling",
                "A Camel Scheduling based endpoint."));
        features.add(new CreateBindingFeature(this, new SOAPBindingFactory(), "SOAP", "A SOAP based endpoint."));
        features.add(new CreateBindingFeature(this, new CamelSqlBindingFactory(), "SQL", "A Camel SQL based endpoint."));
        return features;
    }

    /* package */List<ICreateFeature> getCreateOtherFeatures() {
        return Collections.emptyList();
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
                final List<ICustomFeature> features = new ArrayList<ICustomFeature>(3);
                features.add(new SCADiagramCustomPromoteServiceFeature(this));
                if (((ComponentService) bo).getInterface() instanceof JavaInterface) {
                    features.add(new Java2WSDLCustomFeature(this));
                    features.add(new CreateServiceTestCustomFeature(this));
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

    @Override
    public IDeleteFeature getDeleteFeature(IDeleteContext context) {
        PictogramElement pe = context.getPictogramElement();
        if (pe != null) {
            Object bo = getBusinessObjectForPictogramElement(pe);
            if (bo instanceof Composite) {
                return new SCADiagramDeleteCompositeFeature(this);
            }
        }
        return super.getDeleteFeature(context);
    }

}
