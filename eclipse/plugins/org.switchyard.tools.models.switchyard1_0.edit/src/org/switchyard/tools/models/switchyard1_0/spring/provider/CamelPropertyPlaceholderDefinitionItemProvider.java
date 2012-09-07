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

import org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelPropertyPlaceholderDefinitionItemProvider
    extends IdentifiedTypeItemProvider
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
    public CamelPropertyPlaceholderDefinitionItemProvider(AdapterFactory adapterFactory) {
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

            addFallbackToUnaugmentedPropertyPropertyDescriptor(object);
            addLocationPropertyDescriptor(object);
            addPrefixTokenPropertyDescriptor(object);
            addPropertiesParserRefPropertyDescriptor(object);
            addPropertiesResolverRefPropertyDescriptor(object);
            addPropertyPrefixPropertyDescriptor(object);
            addPropertySuffixPropertyDescriptor(object);
            addSuffixTokenPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Fallback To Unaugmented Property feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFallbackToUnaugmentedPropertyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelPropertyPlaceholderDefinition_fallbackToUnaugmentedProperty_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelPropertyPlaceholderDefinition_fallbackToUnaugmentedProperty_feature", "_UI_CamelPropertyPlaceholderDefinition_type"),
                 SpringPackage.eINSTANCE.getCamelPropertyPlaceholderDefinition_FallbackToUnaugmentedProperty(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Location feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLocationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelPropertyPlaceholderDefinition_location_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelPropertyPlaceholderDefinition_location_feature", "_UI_CamelPropertyPlaceholderDefinition_type"),
                 SpringPackage.eINSTANCE.getCamelPropertyPlaceholderDefinition_Location(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Prefix Token feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPrefixTokenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelPropertyPlaceholderDefinition_prefixToken_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelPropertyPlaceholderDefinition_prefixToken_feature", "_UI_CamelPropertyPlaceholderDefinition_type"),
                 SpringPackage.eINSTANCE.getCamelPropertyPlaceholderDefinition_PrefixToken(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Properties Parser Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPropertiesParserRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelPropertyPlaceholderDefinition_propertiesParserRef_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelPropertyPlaceholderDefinition_propertiesParserRef_feature", "_UI_CamelPropertyPlaceholderDefinition_type"),
                 SpringPackage.eINSTANCE.getCamelPropertyPlaceholderDefinition_PropertiesParserRef(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Properties Resolver Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPropertiesResolverRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelPropertyPlaceholderDefinition_propertiesResolverRef_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelPropertyPlaceholderDefinition_propertiesResolverRef_feature", "_UI_CamelPropertyPlaceholderDefinition_type"),
                 SpringPackage.eINSTANCE.getCamelPropertyPlaceholderDefinition_PropertiesResolverRef(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Property Prefix feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPropertyPrefixPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelPropertyPlaceholderDefinition_propertyPrefix_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelPropertyPlaceholderDefinition_propertyPrefix_feature", "_UI_CamelPropertyPlaceholderDefinition_type"),
                 SpringPackage.eINSTANCE.getCamelPropertyPlaceholderDefinition_PropertyPrefix(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Property Suffix feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPropertySuffixPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelPropertyPlaceholderDefinition_propertySuffix_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelPropertyPlaceholderDefinition_propertySuffix_feature", "_UI_CamelPropertyPlaceholderDefinition_type"),
                 SpringPackage.eINSTANCE.getCamelPropertyPlaceholderDefinition_PropertySuffix(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Suffix Token feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSuffixTokenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelPropertyPlaceholderDefinition_suffixToken_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelPropertyPlaceholderDefinition_suffixToken_feature", "_UI_CamelPropertyPlaceholderDefinition_type"),
                 SpringPackage.eINSTANCE.getCamelPropertyPlaceholderDefinition_SuffixToken(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns CamelPropertyPlaceholderDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CamelPropertyPlaceholderDefinition"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CamelPropertyPlaceholderDefinition)object).getId();
        return label == null || label.length() == 0 ?
            getString("_UI_CamelPropertyPlaceholderDefinition_type") :
            getString("_UI_CamelPropertyPlaceholderDefinition_type") + " " + label;
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

        switch (notification.getFeatureID(CamelPropertyPlaceholderDefinition.class)) {
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__FALLBACK_TO_UNAUGMENTED_PROPERTY:
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__LOCATION:
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PREFIX_TOKEN:
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_PARSER_REF:
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTIES_RESOLVER_REF:
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTY_PREFIX:
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__PROPERTY_SUFFIX:
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION__SUFFIX_TOKEN:
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
