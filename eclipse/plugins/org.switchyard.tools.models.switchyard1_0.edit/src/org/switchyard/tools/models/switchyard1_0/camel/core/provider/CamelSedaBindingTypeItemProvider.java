/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core.provider;


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

import org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelSedaBindingTypeItemProvider
    extends BaseCamelBindingItemProvider
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
    public CamelSedaBindingTypeItemProvider(AdapterFactory adapterFactory) {
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

            addNameElementPropertyDescriptor(object);
            addSizePropertyDescriptor(object);
            addConcurrentConsumersPropertyDescriptor(object);
            addWaitForTaskToCompletePropertyDescriptor(object);
            addTimeoutPropertyDescriptor(object);
            addMultipleConsumersPropertyDescriptor(object);
            addLimitConcurrentConsumersPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Name Element feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNameElementPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSedaBindingType_nameElement_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSedaBindingType_nameElement_feature", "_UI_CamelSedaBindingType_type"),
                 CorePackage.Literals.CAMEL_SEDA_BINDING_TYPE__NAME_ELEMENT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSedaBindingType_size_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSedaBindingType_size_feature", "_UI_CamelSedaBindingType_type"),
                 CorePackage.Literals.CAMEL_SEDA_BINDING_TYPE__SIZE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Concurrent Consumers feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConcurrentConsumersPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSedaBindingType_concurrentConsumers_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSedaBindingType_concurrentConsumers_feature", "_UI_CamelSedaBindingType_type"),
                 CorePackage.Literals.CAMEL_SEDA_BINDING_TYPE__CONCURRENT_CONSUMERS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Wait For Task To Complete feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWaitForTaskToCompletePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSedaBindingType_waitForTaskToComplete_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSedaBindingType_waitForTaskToComplete_feature", "_UI_CamelSedaBindingType_type"),
                 CorePackage.Literals.CAMEL_SEDA_BINDING_TYPE__WAIT_FOR_TASK_TO_COMPLETE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Timeout feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimeoutPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSedaBindingType_timeout_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSedaBindingType_timeout_feature", "_UI_CamelSedaBindingType_type"),
                 CorePackage.Literals.CAMEL_SEDA_BINDING_TYPE__TIMEOUT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Multiple Consumers feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMultipleConsumersPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSedaBindingType_multipleConsumers_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSedaBindingType_multipleConsumers_feature", "_UI_CamelSedaBindingType_type"),
                 CorePackage.Literals.CAMEL_SEDA_BINDING_TYPE__MULTIPLE_CONSUMERS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Limit Concurrent Consumers feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLimitConcurrentConsumersPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelSedaBindingType_limitConcurrentConsumers_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelSedaBindingType_limitConcurrentConsumers_feature", "_UI_CamelSedaBindingType_type"),
                 CorePackage.Literals.CAMEL_SEDA_BINDING_TYPE__LIMIT_CONCURRENT_CONSUMERS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns CamelSedaBindingType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CamelSedaBindingType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CamelSedaBindingType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_CamelSedaBindingType_type") :
            getString("_UI_CamelSedaBindingType_type") + " " + label;
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

        switch (notification.getFeatureID(CamelSedaBindingType.class)) {
            case CorePackage.CAMEL_SEDA_BINDING_TYPE__NAME_ELEMENT:
            case CorePackage.CAMEL_SEDA_BINDING_TYPE__SIZE:
            case CorePackage.CAMEL_SEDA_BINDING_TYPE__CONCURRENT_CONSUMERS:
            case CorePackage.CAMEL_SEDA_BINDING_TYPE__WAIT_FOR_TASK_TO_COMPLETE:
            case CorePackage.CAMEL_SEDA_BINDING_TYPE__TIMEOUT:
            case CorePackage.CAMEL_SEDA_BINDING_TYPE__MULTIPLE_CONSUMERS:
            case CorePackage.CAMEL_SEDA_BINDING_TYPE__LIMIT_CONCURRENT_CONSUMERS:
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
