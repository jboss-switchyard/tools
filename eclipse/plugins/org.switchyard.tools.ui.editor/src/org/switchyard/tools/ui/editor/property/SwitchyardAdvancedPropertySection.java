package org.switchyard.tools.ui.editor.property;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.View;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor.PropertyValueWrapper;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.internal.parts.ContainerShapeEditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.tabbed.AdvancedPropertySection;

/**
 * @author bfitzpat
 * 
 */
@SuppressWarnings("restriction")
public class SwitchyardAdvancedPropertySection extends AdvancedPropertySection implements IPropertySourceProvider {

    @Override
    public IPropertySource getPropertySource(Object object) {
        IPropertySource source = null;
        IPropertySourceProvider modelPropertySourceProvider = new AdapterFactoryContentProvider(
                initializeAdapterFactory());
        if (object instanceof EditPart) {
            source = modelPropertySourceProvider.getPropertySource(((EditPart) object).getModel());
        } else {
            source = modelPropertySourceProvider.getPropertySource(object);
        }

        if (source != null) {
            return new UnwrappingPropertySource(source);
        }

        // if (object instanceof IPropertySource) {
        // return (IPropertySource) object;
        // }
        // AdapterFactory af = getAdapterFactory(object);
        // if (af != null) {
        // IItemPropertySource ips = (IItemPropertySource) af.adapt(object,
        // IItemPropertySource.class);
        // if (ips != null) {
        // return new PropertySource(object, ips);
        // }
        // }
        // if (object instanceof IAdaptable) {
        // return (IPropertySource) ((IAdaptable)
        // object).getAdapter(IPropertySource.class);
        // }
        return null;
    }

    protected IPropertySourceProvider getPropertySourceProvider() {
        return this;
    }

    protected AdapterFactory getAdapterFactory(Object object) {
        if (object instanceof EObject) {
            return initializeAdapterFactory();
        }
        TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(object);
        if (editingDomain != null) {
            return ((AdapterFactoryEditingDomain) editingDomain).getAdapterFactory();
        }
        return null;
    }

    @Override
    public void setInput(IWorkbenchPart part, ISelection selection) {
        if (selection.isEmpty() || !(selection instanceof StructuredSelection)) {
            super.setInput(part, selection);
            return;
        }
        final StructuredSelection structuredSelection = ((StructuredSelection) selection);
        ArrayList<Object> transformedSelection = new ArrayList<Object>(structuredSelection.size());
        for (Iterator<?> it = structuredSelection.iterator(); it.hasNext();) {
            Object r = transformSelection(it.next());
            if (r != null) {
                transformedSelection.add(r);
            }
        }
        super.setInput(part, new StructuredSelection(transformedSelection));
    }

    protected Object transformSelection(Object selected) {

        if (selected instanceof ContainerShapeEditPart) {
            ContainerShapeEditPart csEdit = (ContainerShapeEditPart) selected;
            PictogramElement pe = csEdit.getPictogramElement();
            EObject bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
            return getPropertySourceProvider().getPropertySource(bo);
            // return bo;
        }

        if (selected instanceof EditPart) {
            Object model = ((EditPart) selected).getModel();
            return model instanceof View ? ((View) model).getElement() : null;
        }
        if (selected instanceof View) {
            return ((View) selected).getElement();
        }
        if (selected instanceof IAdaptable) {
            View view = (View) ((IAdaptable) selected).getAdapter(View.class);
            if (view != null) {
                return view.getElement();
            }
        }
        return selected;
    }

    private ComposedAdapterFactory initializeAdapterFactory() {
        List<AdapterFactoryImpl> factories = new ArrayList<AdapterFactoryImpl>();
//        factories.add(new ScaItemProviderAdapterFactory());
//        factories.add(new ValidateItemProviderAdapterFactory());
//        factories.add(new TransformItemProviderAdapterFactory());
//        factories.add(new SwitchyardItemProviderAdapterFactory());
//        factories.add(new SpringItemProviderAdapterFactory());
//        factories.add(new SOAPItemProviderAdapterFactory());
//        factories.add(new RulesItemProviderAdapterFactory());
//        factories.add(new ResteasyItemProviderAdapterFactory());
//        factories.add(new SwitchyardItemProviderAdapterFactory());
//        factories.add(new JcaItemProviderAdapterFactory());
//        factories.add(new ClojureItemProviderAdapterFactory());
//        factories.add(new CamelItemProviderAdapterFactory());
//        factories.add(new BPMItemProviderAdapterFactory());
//        factories.add(new BeanItemProviderAdapterFactory());
//        factories.add(new AddressingItemProviderAdapterFactory());
//        factories.add(new InstanceItemProviderAdapterFactory());
//        factories.add(new PolicyItemProviderAdapterFactory());
//        factories.add(new ResourceItemProviderAdapterFactory());
//        factories.add(new ReflectiveItemProviderAdapterFactory());
        ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(factories);
        return adapterFactory;
    }

    /**
     * A property source which unwraps values that are wrapped in an EMF.
     * {@link PropertyValueWrapper}
     * 
     * @author vainolo
     * 
     */
    public class UnwrappingPropertySource implements IPropertySource {
        private IPropertySource _source;

        /**
         * @param source property source
         */
        public UnwrappingPropertySource(final IPropertySource source) {
            this._source = source;
        }

        @Override
        public Object getEditableValue() {
            Object value = _source.getEditableValue();
            if (value instanceof PropertyValueWrapper) {
                PropertyValueWrapper wrapper = (PropertyValueWrapper) value;
                return wrapper.getEditableValue(null);
            } else {
                return _source.getEditableValue();
            }
        }

        @Override
        public IPropertyDescriptor[] getPropertyDescriptors() {
            return _source.getPropertyDescriptors();
        }

        @Override
        public Object getPropertyValue(Object id) {
            Object value = _source.getPropertyValue(id);
            if (value instanceof PropertyValueWrapper) {
                PropertyValueWrapper wrapper = (PropertyValueWrapper) value;
                return wrapper.getEditableValue(null);
            } else {
                return _source.getPropertyValue(id);
            }
        }

        @Override
        public boolean isPropertySet(Object id) {
            return _source.isPropertySet(id);
        }

        @Override
        public void resetPropertyValue(Object id) {
            _source.resetPropertyValue(id);
        }

        @Override
        public void setPropertyValue(Object id, Object value) {
            _source.setPropertyValue(id, value);
        }
    }
}
