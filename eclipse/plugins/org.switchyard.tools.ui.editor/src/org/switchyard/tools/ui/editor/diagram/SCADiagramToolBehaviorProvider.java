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
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDoubleClickContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
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
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
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

    /**
     * @param pe incoming pictogram element
     * @return point with x/y
     */
    public Location getDecoratorLocationUpperRight(PictogramElement pe) {
        GraphicsAlgorithm ga = pe.getGraphicsAlgorithm();
        int x = 4;
        int y = 4;
        EList<GraphicsAlgorithm> gaChildren = ga.getGraphicsAlgorithmChildren();
        for (Object gaChild : gaChildren.toArray()) {
            if (gaChild instanceof Polygon) {
                Polygon poly = (Polygon) gaChild;
                EList<Point> points = poly.getPoints();
                for (Iterator<Point> iterator = points.iterator(); iterator.hasNext();) {
                    Point point = (Point) iterator.next();
                    if (point.getY() < y && point.getX() > x) {
                        x = point.getX();
                    }
                }
                break;
            }

        }
        return new Location(x, y);
    }

    @Override
    public IDecorator[] getDecorators(PictogramElement pe) {
        IFeatureProvider featureProvider = getFeatureProvider();
        Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
        if (bo instanceof Service) {
            ArrayList<IDecorator> decorators = new ArrayList<IDecorator>();
            Service service = (Service) bo;
            if (!service.getBinding().isEmpty()) {
                EList<Binding> bindings = service.getBinding();
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
            }
            if (!(service.getInterface() == null)) {
                ImageDecorator imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_INTERFACE_OVERRIDE);
                Interface intfc = service.getInterface();
                imageRenderingDecorator.setMessage("Interface:\n" + intfc.eClass().getInstanceTypeName());
                Location loc = getDecoratorLocationUpperRight(pe);
                imageRenderingDecorator.setX(loc.getX() - 10);
                decorators.add(imageRenderingDecorator);
            } else if (service.getPromote() != null && service.getPromote().getInterface() != null) {
                ImageDecorator imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_INTERFACE);
                Interface intfc = service.getPromote().getInterface();
                Location loc = getDecoratorLocationUpperRight(pe);
                imageRenderingDecorator.setX(loc.getX() - 10);
                imageRenderingDecorator.setMessage("Interface (Inherited):\n" + intfc.eClass().getInstanceTypeName());
                decorators.add(imageRenderingDecorator);
            }
            return decorators.toArray(new IDecorator[decorators.size()]);
        } else if (bo instanceof Reference) {
            Reference reference = (Reference) bo;
            ArrayList<IDecorator> decorators = new ArrayList<IDecorator>();
            if (!reference.getBinding().isEmpty()) {
                EList<Binding> bindings = reference.getBinding();
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
            }
            if (!(reference.getInterface() == null)) {
                ImageDecorator imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_INTERFACE_OVERRIDE);
                Interface intfc = reference.getInterface();
                Location loc = getDecoratorLocationUpperRight(pe);
                imageRenderingDecorator.setX(loc.getX() - 10);
                imageRenderingDecorator.setMessage("Interface:\n" + intfc.eClass().getInstanceTypeName());
                decorators.add(imageRenderingDecorator);
            } else if (reference.getPromote() != null) {
                EList<ComponentReference> references = reference.getPromote();
                boolean hasInterface = false;
                for (Iterator<ComponentReference> iterator = references.iterator(); iterator.hasNext();) {
                    ComponentReference componentReference = (ComponentReference) iterator.next();
                    if (componentReference.getInterface() != null) {
                        hasInterface = true;
                        break;
                    }
                }
                if (hasInterface) {
                    ImageDecorator imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_INTERFACE);
                    imageRenderingDecorator.setMessage("Inherited Interface(s)");
                    Location loc = getDecoratorLocationUpperRight(pe);
                    imageRenderingDecorator.setX(loc.getX() - 10);
                    decorators.add(imageRenderingDecorator);
                }
            }
            return decorators.toArray(new IDecorator[decorators.size()]);

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
                // remove the "Composite" item from the palette
                if (!cf.getName().contentEquals("Composite")) {
                    compositeEntry.addToolEntry(objectCreationToolEntry);
                }
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
        Object bo = getFeatureProvider().getBusinessObjectForPictogramElement(pe);
        
        if (bo instanceof Composite) {
            setGenericContextButtons(data, pe, CONTEXT_BUTTON_UPDATE); // just update, no delete
        } else {
            setGenericContextButtons(data, pe, CONTEXT_BUTTON_DELETE | CONTEXT_BUTTON_UPDATE);
        }
        
        return data;
    }

    @Override
    public ICustomFeature getDoubleClickFeature(IDoubleClickContext context) {
        if (context.getPictogramElements() != null) {
            PictogramElement[] elements = context.getPictogramElements();
            if (elements.length > 0) {
                PictogramElement firstOne = elements[0];
                Object bo = getFeatureProvider().getBusinessObjectForPictogramElement(firstOne);
                if (bo instanceof Component || bo instanceof Service || bo instanceof Reference
                        || bo instanceof ComponentService || bo instanceof ComponentReference) {
                    return new SCADiagramOpenOnDoubleClickFeature(getFeatureProvider());
                }
            }
        }
        return super.getDoubleClickFeature(context);
    }

    private class Location {
        private int _x = 0;
        private int _y = 0;

        /**
         * @param locx x coord
         * @param locy y coord
         */
        public Location(int locx, int locy) {
            _x = locx;
            _y = locy;
        }

        /**
         * @return x coord
         */
        public int getX() {
            return _x;
        }
        
        /**
         * @return y coord
         */
        @SuppressWarnings("unused")
        public int getY() {
            return _y;
        }
    }

}
