/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JaxbDataFormatItemProvider
    extends DataFormatItemProvider
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JaxbDataFormatItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addContextPathPropertyDescriptor(object);
            addEncodingPropertyDescriptor(object);
            addFilterNonXmlCharsPropertyDescriptor(object);
            addFragmentPropertyDescriptor(object);
            addIgnoreJAXBElementPropertyDescriptor(object);
            addPartClassPropertyDescriptor(object);
            addPartNamespacePropertyDescriptor(object);
            addPrettyPrintPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Context Path feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addContextPathPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_JaxbDataFormat_contextPath_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JaxbDataFormat_contextPath_feature", "_UI_JaxbDataFormat_type"),
                 SpringPackage.eINSTANCE.getJaxbDataFormat_ContextPath(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Encoding feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEncodingPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_JaxbDataFormat_encoding_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JaxbDataFormat_encoding_feature", "_UI_JaxbDataFormat_type"),
                 SpringPackage.eINSTANCE.getJaxbDataFormat_Encoding(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Filter Non Xml Chars feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFilterNonXmlCharsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_JaxbDataFormat_filterNonXmlChars_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JaxbDataFormat_filterNonXmlChars_feature", "_UI_JaxbDataFormat_type"),
                 SpringPackage.eINSTANCE.getJaxbDataFormat_FilterNonXmlChars(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Fragment feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFragmentPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_JaxbDataFormat_fragment_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JaxbDataFormat_fragment_feature", "_UI_JaxbDataFormat_type"),
                 SpringPackage.eINSTANCE.getJaxbDataFormat_Fragment(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Ignore JAXB Element feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIgnoreJAXBElementPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_JaxbDataFormat_ignoreJAXBElement_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JaxbDataFormat_ignoreJAXBElement_feature", "_UI_JaxbDataFormat_type"),
                 SpringPackage.eINSTANCE.getJaxbDataFormat_IgnoreJAXBElement(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Part Class feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPartClassPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_JaxbDataFormat_partClass_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JaxbDataFormat_partClass_feature", "_UI_JaxbDataFormat_type"),
                 SpringPackage.eINSTANCE.getJaxbDataFormat_PartClass(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Part Namespace feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPartNamespacePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_JaxbDataFormat_partNamespace_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JaxbDataFormat_partNamespace_feature", "_UI_JaxbDataFormat_type"),
                 SpringPackage.eINSTANCE.getJaxbDataFormat_PartNamespace(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Pretty Print feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPrettyPrintPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_JaxbDataFormat_prettyPrint_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_JaxbDataFormat_prettyPrint_feature", "_UI_JaxbDataFormat_type"),
                 SpringPackage.eINSTANCE.getJaxbDataFormat_PrettyPrint(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns JaxbDataFormat.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/JaxbDataFormat"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((JaxbDataFormat)object).getId();
        return label == null || label.length() == 0 ?
            getString("_UI_JaxbDataFormat_type") :
            getString("_UI_JaxbDataFormat_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(JaxbDataFormat.class)) {
            case SpringPackage.JAXB_DATA_FORMAT__CONTEXT_PATH:
            case SpringPackage.JAXB_DATA_FORMAT__ENCODING:
            case SpringPackage.JAXB_DATA_FORMAT__FILTER_NON_XML_CHARS:
            case SpringPackage.JAXB_DATA_FORMAT__FRAGMENT:
            case SpringPackage.JAXB_DATA_FORMAT__IGNORE_JAXB_ELEMENT:
            case SpringPackage.JAXB_DATA_FORMAT__PART_CLASS:
            case SpringPackage.JAXB_DATA_FORMAT__PART_NAMESPACE:
            case SpringPackage.JAXB_DATA_FORMAT__PRETTY_PRINT:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
