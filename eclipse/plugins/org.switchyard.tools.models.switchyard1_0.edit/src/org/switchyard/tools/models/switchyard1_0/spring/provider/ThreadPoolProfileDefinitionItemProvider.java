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

import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.ThreadPoolProfileDefinition;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.ThreadPoolProfileDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThreadPoolProfileDefinitionItemProvider
    extends OptionalIdentifiedDefinitionItemProvider
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
    public ThreadPoolProfileDefinitionItemProvider(AdapterFactory adapterFactory) {
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

            addTimeUnitPropertyDescriptor(object);
            addDefaultProfilePropertyDescriptor(object);
            addKeepAliveTimePropertyDescriptor(object);
            addMaxPoolSizePropertyDescriptor(object);
            addMaxQueueSizePropertyDescriptor(object);
            addPoolSizePropertyDescriptor(object);
            addRejectedPolicyPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Time Unit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimeUnitPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ThreadPoolProfileDefinition_timeUnit_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ThreadPoolProfileDefinition_timeUnit_feature", "_UI_ThreadPoolProfileDefinition_type"),
                 SpringPackage.eINSTANCE.getThreadPoolProfileDefinition_TimeUnit(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Default Profile feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDefaultProfilePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ThreadPoolProfileDefinition_defaultProfile_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ThreadPoolProfileDefinition_defaultProfile_feature", "_UI_ThreadPoolProfileDefinition_type"),
                 SpringPackage.eINSTANCE.getThreadPoolProfileDefinition_DefaultProfile(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Keep Alive Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKeepAliveTimePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ThreadPoolProfileDefinition_keepAliveTime_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ThreadPoolProfileDefinition_keepAliveTime_feature", "_UI_ThreadPoolProfileDefinition_type"),
                 SpringPackage.eINSTANCE.getThreadPoolProfileDefinition_KeepAliveTime(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Max Pool Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxPoolSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ThreadPoolProfileDefinition_maxPoolSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ThreadPoolProfileDefinition_maxPoolSize_feature", "_UI_ThreadPoolProfileDefinition_type"),
                 SpringPackage.eINSTANCE.getThreadPoolProfileDefinition_MaxPoolSize(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Max Queue Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxQueueSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ThreadPoolProfileDefinition_maxQueueSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ThreadPoolProfileDefinition_maxQueueSize_feature", "_UI_ThreadPoolProfileDefinition_type"),
                 SpringPackage.eINSTANCE.getThreadPoolProfileDefinition_MaxQueueSize(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Pool Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPoolSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ThreadPoolProfileDefinition_poolSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ThreadPoolProfileDefinition_poolSize_feature", "_UI_ThreadPoolProfileDefinition_type"),
                 SpringPackage.eINSTANCE.getThreadPoolProfileDefinition_PoolSize(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Rejected Policy feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRejectedPolicyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ThreadPoolProfileDefinition_rejectedPolicy_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ThreadPoolProfileDefinition_rejectedPolicy_feature", "_UI_ThreadPoolProfileDefinition_type"),
                 SpringPackage.eINSTANCE.getThreadPoolProfileDefinition_RejectedPolicy(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns ThreadPoolProfileDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ThreadPoolProfileDefinition"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((ThreadPoolProfileDefinition)object).getId();
        return label == null || label.length() == 0 ?
            getString("_UI_ThreadPoolProfileDefinition_type") :
            getString("_UI_ThreadPoolProfileDefinition_type") + " " + label;
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

        switch (notification.getFeatureID(ThreadPoolProfileDefinition.class)) {
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__TIME_UNIT:
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__DEFAULT_PROFILE:
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__KEEP_ALIVE_TIME:
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_POOL_SIZE:
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_QUEUE_SIZE:
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__POOL_SIZE:
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__REJECTED_POLICY:
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
