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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.draw2d.Graphics;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDoubleClickContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;
import org.eclipse.graphiti.palette.impl.ConnectionCreationToolEntry;
import org.eclipse.graphiti.palette.impl.ObjectCreationToolEntry;
import org.eclipse.graphiti.palette.impl.PaletteCompartmentEntry;
import org.eclipse.graphiti.platform.IPlatformImageConstants;
import org.eclipse.graphiti.tb.BorderDecorator;
import org.eclipse.graphiti.tb.ContextButtonEntry;
import org.eclipse.graphiti.tb.ContextMenuEntry;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IContextButtonPadData;
import org.eclipse.graphiti.tb.IContextMenuEntry;
import org.eclipse.graphiti.tb.IDecorator;
import org.eclipse.graphiti.tb.IImageDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.graphiti.util.IColorConstant;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.models.switchyard1_0.hornetq.BindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;
import org.switchyard.tools.ui.editor.diagram.connections.CustomAddTransformFeature;
import org.switchyard.tools.ui.editor.property.adapters.LabelAdapter;
import org.switchyard.tools.ui.validation.ValidationStatusAdapter;

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
     * @see org.eclipse.graphiti.tb.DefaultToolBehaviorProvider#getContextMenu(org.eclipse.graphiti.features.context.ICustomContext)
     * @param context incoming context
     * @return menu entries
     */
    public IContextMenuEntry[] getContextMenu(ICustomContext context) {
        List<IContextMenuEntry> menuList = new ArrayList<IContextMenuEntry>();
        if (context.getPictogramElements() != null) {
            for (PictogramElement pictogramElement : context.getPictogramElements()) {
                if (pictogramElement instanceof Connection) {
                    ContextMenuEntry addTransformMenu = new ContextMenuEntry(new CustomAddTransformFeature(
                            getFeatureProvider()), context);
                    addTransformMenu.setText("Add Transformer");
                    addTransformMenu.setSubmenu(false);
                }
            }
            Object bo = getFeatureProvider().getBusinessObjectForPictogramElement(context.getPictogramElements()[0]);
            if (bo != null && (bo instanceof Component || bo instanceof Contract)) {
                ContextMenuEntry openMenu = new ContextMenuEntry(new SCADiagramOpenOnDoubleClickFeature(
                        getFeatureProvider()), context);
                openMenu.setText("Open");
                openMenu.setSubmenu(false);
                menuList.add(openMenu);
            }
            if (menuList.size() > 0) {
                return menuList.toArray(new IContextMenuEntry[menuList.size()]);
            }
        }
        return super.getContextMenu(context);
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

    /**
     * @param pe incoming pictogram element
     * @return point with x/y
     */
    public Location getDecoratorLocationLowerLeft(PictogramElement pe) {
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
                    if (point.getY() > y) {
                        y = point.getY();
                    }
                }
                break;
            } else if (gaChild instanceof RoundedRectangle) {
                RoundedRectangle rect = (RoundedRectangle) gaChild;
                int rectY = rect.getY();
                if (rectY > y) {
                    y = rectY;
                }
            }
        }
        return new Location(x, y);
    }

    /**
     * @param pe incoming pictogram element
     * @return point with x/y
     */
    public Location getDecoratorLocationTopLeft(PictogramElement pe) {
        GraphicsAlgorithm ga = pe.getGraphicsAlgorithm();
        int x = 30;
        int y = 30;
        EList<GraphicsAlgorithm> gaChildren = ga.getGraphicsAlgorithmChildren();
        for (Object gaChild : gaChildren.toArray()) {
            if (gaChild instanceof Polygon) {
                Polygon poly = (Polygon) gaChild;
                EList<Point> points = poly.getPoints();
                for (Iterator<Point> iterator = points.iterator(); iterator.hasNext();) {
                    Point point = (Point) iterator.next();
                    if (point.getY() < y) {
                        y = point.getY();
                    }
                    if (point.getX() < x) {
                        x = point.getX();
                    }
                }
                break;
            } else if (gaChild instanceof RoundedRectangle) {
                RoundedRectangle rect = (RoundedRectangle) gaChild;
                int rectX = rect.getX();
                int rectY = rect.getY();
                if (rectY < y) {
                    y = rectY;
                }
                if (rectX < x) {
                    x = rectX;
                }
            }
        }
        return new Location(x, y);
    }

    @Override
    public IDecorator[] getDecorators(PictogramElement pe) {
        if (pe instanceof Anchor) {
            // no decorators for anchors
            return super.getDecorators(pe);
        } else if (pe instanceof ConnectionDecorator) {
            return getDecoratorsForConnection((ConnectionDecorator) pe);
        }
        IFeatureProvider featureProvider = getFeatureProvider();
        Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
        if (bo == null || !(bo instanceof EObject)) {
            return super.getDecorators(pe);
        }
        List<IDecorator> decorators = new ArrayList<IDecorator>();
        if (bo instanceof Service) {
            Service service = (Service) bo;
            if (!service.getBinding().isEmpty()) {
                EList<Binding> bindings = service.getBinding();
                int x = 0;
                for (Binding binding : bindings) {
                    ImageDecorator imageRenderingDecorator = LabelAdapter.getImageDecoratorForBinding(binding);
                    if (x > 0) {
                        x = imageRenderingDecorator.getX() + 20;
                        imageRenderingDecorator.setX(x);
                    } else {
                        x = imageRenderingDecorator.getX();
                    }
                    String text = LabelAdapter.getLabel(binding);
                    if (binding instanceof SwitchYardBindingType) {
                        text = "Binding: " + LabelAdapter.getLabel(binding);
                    }
                    if (binding instanceof SOAPBindingType) {
                        SOAPBindingType soapBinding = (SOAPBindingType) binding;
                        text = text + "\n" + soapBinding.getWsdl();
                    } else if (binding instanceof BindingType) {
                        BindingType hornetQBinding = (BindingType) binding;
                        text = text + "\n"+ hornetQBinding.getUri();
                    }
                    imageRenderingDecorator.setMessage(text);
                    decorators.add(imageRenderingDecorator);
                }
            }
            if (!(service.getInterface() == null)) {
                ImageDecorator imageRenderingDecorator = LabelAdapter.getImageDecoratorForInterface(service.getInterface());
                Interface intfc = service.getInterface();
                String text = LabelAdapter.getLabel(intfc);
                imageRenderingDecorator.setMessage("Interface: " + text);
                Location loc = getDecoratorLocationLowerLeft(pe);
                imageRenderingDecorator.setY(loc.getY() - 18);
                decorators.add(imageRenderingDecorator);
            } else if (service.getPromote() != null && service.getPromote().getInterface() != null) {
                ImageDecorator imageRenderingDecorator = LabelAdapter.getImageDecoratorForInterface(service.getPromote().getInterface());
//                ImageDecorator imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_INTERFACE);
                Interface intfc = service.getPromote().getInterface();
                String text = LabelAdapter.getLabel(intfc);
                Location loc = getDecoratorLocationLowerLeft(pe);
                imageRenderingDecorator.setY(loc.getY() - 18);
                imageRenderingDecorator.setMessage("Interface (Inherited): " + text);
                decorators.add(imageRenderingDecorator);
            }
        } else if (bo instanceof Reference) {
            Reference reference = (Reference) bo;
            if (!reference.getBinding().isEmpty()) {
                EList<Binding> bindings = reference.getBinding();
                int x = 0;
                for (Binding binding : bindings) {
                    ImageDecorator imageRenderingDecorator = LabelAdapter.getImageDecoratorForBinding(binding);
                    if (x > 0) {
                        x = imageRenderingDecorator.getX() + 20;
                        imageRenderingDecorator.setX(x);
                    } else {
                        x = imageRenderingDecorator.getX();
                    }
                    String text = LabelAdapter.getLabel(binding);
                    if (binding instanceof SwitchYardBindingType) {
                        text = "Binding: " + LabelAdapter.getLabel(binding);
                    }
                    if (binding instanceof SOAPBindingType) {
                        SOAPBindingType soapBinding = (SOAPBindingType) binding;
                        text = text + "\n" + soapBinding.getWsdl();
                    } else if (binding instanceof BindingType) {
                        BindingType hornetQBinding = (BindingType) binding;
                        text = text + "\n" + hornetQBinding.getUri();
                    }
                    imageRenderingDecorator.setMessage(text);
                    decorators.add(imageRenderingDecorator);
                }
            }
            if (!(reference.getInterface() == null)) {
                ImageDecorator imageRenderingDecorator = LabelAdapter.getImageDecoratorForInterface(reference.getInterface());
                Interface intfc = reference.getInterface();
                Location loc = getDecoratorLocationLowerLeft(pe);
                imageRenderingDecorator.setY(loc.getY() - 18);
                String text = LabelAdapter.getLabel(intfc);
                imageRenderingDecorator.setMessage("Interface: " + text);
                decorators.add(imageRenderingDecorator);
            } else if (reference.getPromote() != null) {
                EList<ComponentReference> references = reference.getPromote();
                boolean hasInterface = false;
                Interface intfc = null;
                for (Iterator<ComponentReference> iterator = references.iterator(); iterator.hasNext();) {
                    ComponentReference componentReference = (ComponentReference) iterator.next();
                    if (componentReference.getInterface() != null) {
                        hasInterface = true;
                        intfc = componentReference.getInterface();
                        break;
                    }
                }
                if (hasInterface) {
                    String text = LabelAdapter.getLabel(intfc);
                    ImageDecorator imageRenderingDecorator = LabelAdapter.getImageDecoratorForInterface(intfc);
                    imageRenderingDecorator.setMessage("Inherited Interface(s): " + text);
                    Location loc = getDecoratorLocationLowerLeft(pe);
                    imageRenderingDecorator.setY(loc.getY() - 18);
                    decorators.add(imageRenderingDecorator);
                }
            }
        } else if (bo instanceof Component) {
            Component component = (Component) bo;
            if (component.getImplementation() != null) {
                Implementation implementation = component.getImplementation();
                String text = LabelAdapter.getLabel(implementation);
                IImageDecorator imageRenderingDecorator = LabelAdapter.getImageDecoratorForImplementation(implementation);
                imageRenderingDecorator.setMessage("Implementation: " + text);
                Location loc = getDecoratorLocationTopLeft(pe);
                imageRenderingDecorator.setX(loc.getX() + 10);
                imageRenderingDecorator.setY(loc.getY() + 4);
                decorators.add(imageRenderingDecorator);
            }
        }

        ValidationStatusAdapter statusAdapter = (ValidationStatusAdapter) EcoreUtil.getRegisteredAdapter((EObject) bo,
                ValidationStatusAdapter.class);
        if (statusAdapter != null) {
            final IImageDecorator decorator = createDecorator(statusAdapter.getValidationStatus());
            if (decorator != null) {
                GraphicsAlgorithm ga = getSelectionBorder(pe);
                if (ga == null) {
                    ga = pe.getGraphicsAlgorithm();
                }
                decorator.setX(ga.getWidth() - 10);
                decorator.setY(ga.getHeight() - 10);
                decorators.add(decorator);
            }
        }

        if (getDiagramTypeProvider().getDiagramEditor().getEditingDomain().isReadOnly(((EObject) bo).eResource())) {
            decorators.add(new BorderDecorator(IColorConstant.GRAY, null, Graphics.LINE_DASH));
        }
        return decorators.toArray(new IDecorator[decorators.size()]);
    }

    private IDecorator[] getDecoratorsForConnection(ConnectionDecorator pe) {
        if (pe.getConnection() == null || pe.getConnection().getStart() == null || pe.getConnection().getEnd() == null) {
            return super.getDecorators(pe);
        }
        Object sourceBO = getFeatureProvider().getBusinessObjectForPictogramElement(pe.getConnection().getStart());
        Object targetBO = getFeatureProvider().getBusinessObjectForPictogramElement(pe.getConnection().getEnd());
        if (sourceBO == null || targetBO == null) {
            return super.getDecorators(pe);
        }
        ValidationStatusAdapter statusAdapter = (ValidationStatusAdapter) EcoreUtil.getRegisteredAdapter(
                (EObject) sourceBO, ValidationStatusAdapter.class);
        if (statusAdapter == null) {
            return super.getDecorators(pe);
        }
        final IImageDecorator decorator = createDecorator(statusAdapter.getConnectionStatus((EObject) targetBO));
        if (decorator != null) {
            decorator.setX(0);
            decorator.setY(0);
            return new IDecorator[] {decorator };
        }
        return super.getDecorators(pe);
    }

    private IImageDecorator createDecorator(IStatus status) {
        final IImageDecorator decorator;
        switch (status.getSeverity()) {
        case IStatus.INFO:
            decorator = new ImageDecorator(IPlatformImageConstants.IMG_ECLIPSE_INFORMATION_TSK);
            break;
        case IStatus.WARNING:
            decorator = new ImageDecorator(IPlatformImageConstants.IMG_ECLIPSE_WARNING_TSK);
            break;
        case IStatus.ERROR:
            decorator = new ImageDecorator(IPlatformImageConstants.IMG_ECLIPSE_ERROR_TSK);
            break;
        default:
            decorator = null;
            break;
        }
        if (decorator != null) {
            decorator.setMessage(status.getMessage());
        }
        return decorator;
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

        // add new compartment for generic entries
        PaletteCompartmentEntry compositeEntry = new PaletteCompartmentEntry("Generic", null);
        for (ICreateFeature cf : ((SCADiagramFeatureProvider) getFeatureProvider()).getCreateGenericFeatures()) {
            compositeEntry.addToolEntry(new ObjectCreationToolEntry(cf.getCreateName(), cf.getCreateDescription(), cf
                    .getCreateImageId(), cf.getCreateLargeImageId(), cf));
        }
        for (ICreateConnectionFeature cf : getFeatureProvider().getCreateConnectionFeatures()) {
            ConnectionCreationToolEntry connectionCreationToolEntry = new ConnectionCreationToolEntry(
                    cf.getCreateName(), cf.getCreateDescription(), cf.getCreateImageId(), cf.getCreateLargeImageId());
            connectionCreationToolEntry.addCreateConnectionFeature(cf);
            compositeEntry.addToolEntry(connectionCreationToolEntry);
        }
        ret.add(compositeEntry);

        // add new compartment for component/implementation types
        PaletteCompartmentEntry componentEntry = new PaletteCompartmentEntry("Implementations", null);
        for (ICreateFeature cf : ((SCADiagramFeatureProvider) getFeatureProvider()).getCreateComponentFeatures()) {
            componentEntry.addToolEntry(new ObjectCreationToolEntry(cf.getCreateName(), cf.getCreateDescription(), cf
                    .getCreateImageId(), cf.getCreateLargeImageId(), cf));
        }
        ret.add(componentEntry);

        // add new compartment for bindings
        PaletteCompartmentEntry bindingsEntry = new PaletteCompartmentEntry("Bindings", null);
        for (ICreateFeature cf : ((SCADiagramFeatureProvider) getFeatureProvider()).getCreateBindingFeatures()) {
            bindingsEntry.addToolEntry(new ObjectCreationToolEntry(cf.getCreateName(), cf.getCreateDescription(), cf
                    .getCreateImageId(), cf.getCreateLargeImageId(), cf));
        }
        ret.add(bindingsEntry);

        // add new compartment for anything else
        PaletteCompartmentEntry miscEntry = new PaletteCompartmentEntry("Other", null);
        for (ICreateFeature cf : ((SCADiagramFeatureProvider) getFeatureProvider()).getCreateOtherFeatures()) {
            miscEntry.addToolEntry(new ObjectCreationToolEntry(cf.getCreateName(), cf.getCreateDescription(), cf
                    .getCreateImageId(), cf.getCreateLargeImageId(), cf));
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
            // just update, no delete
            setGenericContextButtons(data, pe, CONTEXT_BUTTON_UPDATE);

            // show synchronize on composite
            data.getDomainSpecificContextButtons().add(
                    new ContextButtonEntry(new SynchronizeGeneratedModelFeature(getFeatureProvider()),
                            new CustomContext(new PictogramElement[] {context.getPictogramElement() })));
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

    @Override
    public GraphicsAlgorithm getSelectionBorder(PictogramElement pe) {
        GraphicsAlgorithm ga = pe.getGraphicsAlgorithm();
        if (!ga.getFilled()) {
            for (GraphicsAlgorithm childGA : ga.getGraphicsAlgorithmChildren()) {
                if (childGA.getFilled()) {
                    return childGA;
                }
            }
        }
        return super.getSelectionBorder(pe);
    }

    @Override
    public GraphicsAlgorithm[] getClickArea(PictogramElement pe) {
        GraphicsAlgorithm ga = getSelectionBorder(pe);
        if (ga == null) {
            return super.getClickArea(pe);
        }
        return new GraphicsAlgorithm[] {ga };
    }

    @Override
    public boolean equalsBusinessObjects(Object o1, Object o2) {
        // we don't want to use EcoreUtil.equals() as the parent does.
        // null check
        if (o1 == null) {
            return o2 == null;
        } else if (o2 == null) {
            return false;
        }

        if (o1 instanceof EObject && o2 instanceof EObject) {
            EObject eo1 = (EObject) o1;
            EObject eo2 = (EObject) o2;
            // proxy check
            if (eo1.eIsProxy()) {
                return eo2.eIsProxy()
                        && ((InternalEObject) eo1).eProxyURI().equals(((InternalEObject) eo2).eProxyURI());
            } else if (eo2.eIsProxy()) {
                return false;
            }
            return eo1 == eo2;
        }
        return false;
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
        public int getY() {
            return _y;
        }
    }

}
