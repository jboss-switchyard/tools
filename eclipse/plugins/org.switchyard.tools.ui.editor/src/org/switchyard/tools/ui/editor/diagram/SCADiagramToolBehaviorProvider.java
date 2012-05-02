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

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;
import org.eclipse.graphiti.palette.impl.ConnectionCreationToolEntry;
import org.eclipse.graphiti.palette.impl.ObjectCreationToolEntry;
import org.eclipse.graphiti.palette.impl.PaletteCompartmentEntry;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IContextButtonPadData;
import org.eclipse.graphiti.tb.IDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.models.switchyard1_0.hornetq.BindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.ui.editor.ImageProvider;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramToolBehaviorProvider extends DefaultToolBehaviorProvider {

    /**
     * @param diagramTypeProvider the diagram type provider
     */
    public SCADiagramToolBehaviorProvider(IDiagramTypeProvider diagramTypeProvider) {
        super(diagramTypeProvider);
    }

    @Override
    public IDecorator[] getDecorators(PictogramElement pe) {
        IFeatureProvider featureProvider = getFeatureProvider();
        Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
        if (bo instanceof Service) {
            Service service = (Service) bo;
            if (!service.getBinding().isEmpty()) {
                EList<Binding> bindings = service.getBinding();
                ArrayList<IDecorator> decorators = new ArrayList<IDecorator>();
                for (Binding binding : bindings) {
                    IDecorator imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_CHAIN);
                    String text = binding.getClass().getSimpleName();
                    if (binding instanceof SOAPBindingType) {
                        SOAPBindingType soapBinding = (SOAPBindingType) binding;
                        text = "SOAP Binding:\n";
                        text = text + soapBinding.getWsdl();
                    } else if (binding instanceof BindingType) {
                        BindingType hornetQBinding = (BindingType) binding;
                        text = "HornetQ Binding:\n";
                        text = text + hornetQBinding.getUri();
                    }
                    imageRenderingDecorator.setMessage(text);
                    decorators.add(imageRenderingDecorator);
                }
                return decorators.toArray(new IDecorator[decorators.size()]);
            }
        } else if (bo instanceof Reference) {
            Reference reference = (Reference) bo;
            if (!reference.getBinding().isEmpty()) {
                EList<Binding> bindings = reference.getBinding();
                ArrayList<IDecorator> decorators = new ArrayList<IDecorator>();
                for (Binding binding : bindings) {
                    IDecorator imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_CHAIN);
                    String text = binding.getClass().getSimpleName();
                    if (binding instanceof SOAPBindingType) {
                        SOAPBindingType soapBinding = (SOAPBindingType) binding;
                        text = "SOAP Binding:\n";
                        text = text + soapBinding.getWsdl();
                    } else if (binding instanceof BindingType) {
                        BindingType hornetQBinding = (BindingType) binding;
                        text = "HornetQ Binding:\n";
                        text = text + hornetQBinding.getUri();
                    }
                    imageRenderingDecorator.setMessage(text);
                    decorators.add(imageRenderingDecorator);
                }
                return decorators.toArray(new IDecorator[decorators.size()]);
            }

        } else if (bo instanceof Component) {
            Component component = (Component) bo;
            if (component.getImplementation() != null) {
                ArrayList<IDecorator> decorators = new ArrayList<IDecorator>();
                Implementation implementation = component.getImplementation();
                String text = implementation.getClass().getSimpleName();
                IDecorator imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_IMPLEMENTATION_TYPE);
                imageRenderingDecorator.setMessage(text);
                decorators.add(imageRenderingDecorator);
                return decorators.toArray(new IDecorator[decorators.size()]);
            }
        }

        return super.getDecorators(pe);
    }

    @Override
    public String getToolTip(GraphicsAlgorithm ga) {
        PictogramElement pe = ga.getPictogramElement();
        Object bo = getFeatureProvider().getBusinessObjectForPictogramElement(pe);
        if (bo instanceof Composite) {
            String name = ((Composite) bo).getName();
            if (name != null && !name.isEmpty()) {
                return name;
            }
        } else if (bo instanceof Component) {
            String name = ((Component) bo).getName();
            if (name != null && !name.isEmpty()) {
                return name;
            }
        } else if (bo instanceof Service) {
            String name = ((Service) bo).getName();
            if (name != null && !name.isEmpty()) {
                return name;
            }
        } else if (bo instanceof ComponentService) {
            String name = ((ComponentService) bo).getName();
            if (name != null && !name.isEmpty()) {
                return name;
            }
        } else if (bo instanceof ComponentReference) {
            String name = ((ComponentReference) bo).getName();
            if (name != null && !name.isEmpty()) {
                return name;
            }
        } else if (bo instanceof Reference) {
            String name = ((Reference) bo).getName();
            if (name != null && !name.isEmpty()) {
                return name;
            }
        }
        return super.getToolTip(ga);
    }

    @Override
    public IPaletteCompartmentEntry[] getPalette() {
        List<IPaletteCompartmentEntry> ret = new ArrayList<IPaletteCompartmentEntry>();

        // add connections
        PaletteCompartmentEntry connectionsEntry = new PaletteCompartmentEntry("Connections", null);
        ret.add(connectionsEntry);

        // add all create-connection-features to the new stack-entry
        ICreateConnectionFeature[] createConnectionFeatures = getFeatureProvider().getCreateConnectionFeatures();
        for (ICreateConnectionFeature cf : createConnectionFeatures) {
            ConnectionCreationToolEntry connectionCreationToolEntry = new ConnectionCreationToolEntry(
                    cf.getCreateName(), cf.getCreateDescription(), cf.getCreateImageId(), cf.getCreateLargeImageId());
            connectionCreationToolEntry.addCreateConnectionFeature(cf);
            connectionsEntry.addToolEntry(connectionCreationToolEntry);
        }

        // add new compartment for composites
        PaletteCompartmentEntry compositeEntry = new PaletteCompartmentEntry("Composites", null);
        ret.add(compositeEntry);

        // add new compartment for components
        PaletteCompartmentEntry componentEntry = new PaletteCompartmentEntry("Components", null);
        ret.add(componentEntry);

        // add new compartment for components
        PaletteCompartmentEntry bindingsEntry = new PaletteCompartmentEntry("Bindings", null);
        ret.add(bindingsEntry);

        // add new compartment for components
        PaletteCompartmentEntry implementationsEntry = new PaletteCompartmentEntry("Implementations", null);
        ret.add(implementationsEntry);

        // add new compartment for anything else
        PaletteCompartmentEntry miscEntry = new PaletteCompartmentEntry("Other", null);

        // add all create-features to the new stack-entry
        IFeatureProvider featureProvider = getFeatureProvider();

        ICreateFeature[] createFeatures = featureProvider.getCreateFeatures();
        for (ICreateFeature cf : createFeatures) {
            ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(cf.getCreateName(),
                    cf.getCreateDescription(), cf.getCreateImageId(), cf.getCreateLargeImageId(), cf);
            if (cf.getCreateName().contains("Composite")) {
                compositeEntry.addToolEntry(objectCreationToolEntry);
            } else if (cf.getCreateName().contains("Component")) {
                componentEntry.addToolEntry(objectCreationToolEntry);
            } else if (cf.getCreateName().contains("Service")) {
                compositeEntry.addToolEntry(objectCreationToolEntry);
            } else if (cf.getCreateName().contains("Binding")) {
                bindingsEntry.addToolEntry(objectCreationToolEntry);
            } else if (cf.getCreateName().contains("Implementation")) {
                implementationsEntry.addToolEntry(objectCreationToolEntry);
            } else {
                miscEntry.addToolEntry(objectCreationToolEntry);
            }
        }

        if (!miscEntry.getToolEntries().isEmpty()) {
            ret.add(miscEntry);
        }

        return ret.toArray(new IPaletteCompartmentEntry[ret.size()]);
    }

    @Override
    public IContextButtonPadData getContextButtonPad(IPictogramElementContext context) {

        IContextButtonPadData data = super.getContextButtonPad(context);
        PictogramElement pe = context.getPictogramElement();

        // 1. set the generic context buttons
        // note, that we do not add 'remove' (just as an example)
        setGenericContextButtons(data, pe, CONTEXT_BUTTON_DELETE | CONTEXT_BUTTON_UPDATE);

        return data;
    }

}
