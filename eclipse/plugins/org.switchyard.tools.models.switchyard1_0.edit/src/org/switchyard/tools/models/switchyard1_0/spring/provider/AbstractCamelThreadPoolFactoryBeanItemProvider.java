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

import org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelThreadPoolFactoryBean;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelThreadPoolFactoryBean} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractCamelThreadPoolFactoryBeanItemProvider
    extends AbstractCamelFactoryBeanItemProvider
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
    public AbstractCamelThreadPoolFactoryBeanItemProvider(AdapterFactory adapterFactory) {
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

            addKeepAliveTimePropertyDescriptor(object);
            addMaxPoolSizePropertyDescriptor(object);
            addMaxQueueSizePropertyDescriptor(object);
            addPoolSizePropertyDescriptor(object);
            addRejectedPolicyPropertyDescriptor(object);
            addThreadNamePropertyDescriptor(object);
            addTimeUnitPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
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
                 getString("_UI_AbstractCamelThreadPoolFactoryBean_keepAliveTime_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelThreadPoolFactoryBean_keepAliveTime_feature", "_UI_AbstractCamelThreadPoolFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelThreadPoolFactoryBean_KeepAliveTime(),
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
                 getString("_UI_AbstractCamelThreadPoolFactoryBean_maxPoolSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelThreadPoolFactoryBean_maxPoolSize_feature", "_UI_AbstractCamelThreadPoolFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelThreadPoolFactoryBean_MaxPoolSize(),
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
                 getString("_UI_AbstractCamelThreadPoolFactoryBean_maxQueueSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelThreadPoolFactoryBean_maxQueueSize_feature", "_UI_AbstractCamelThreadPoolFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelThreadPoolFactoryBean_MaxQueueSize(),
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
                 getString("_UI_AbstractCamelThreadPoolFactoryBean_poolSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelThreadPoolFactoryBean_poolSize_feature", "_UI_AbstractCamelThreadPoolFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelThreadPoolFactoryBean_PoolSize(),
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
                 getString("_UI_AbstractCamelThreadPoolFactoryBean_rejectedPolicy_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelThreadPoolFactoryBean_rejectedPolicy_feature", "_UI_AbstractCamelThreadPoolFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelThreadPoolFactoryBean_RejectedPolicy(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Thread Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThreadNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstractCamelThreadPoolFactoryBean_threadName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelThreadPoolFactoryBean_threadName_feature", "_UI_AbstractCamelThreadPoolFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelThreadPoolFactoryBean_ThreadName(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
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
                 getString("_UI_AbstractCamelThreadPoolFactoryBean_timeUnit_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelThreadPoolFactoryBean_timeUnit_feature", "_UI_AbstractCamelThreadPoolFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelThreadPoolFactoryBean_TimeUnit(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((AbstractCamelThreadPoolFactoryBean)object).getId();
        return label == null || label.length() == 0 ?
            getString("_UI_AbstractCamelThreadPoolFactoryBean_type") :
            getString("_UI_AbstractCamelThreadPoolFactoryBean_type") + " " + label;
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

        switch (notification.getFeatureID(AbstractCamelThreadPoolFactoryBean.class)) {
            case SpringPackage.ABSTRACT_CAMEL_THREAD_POOL_FACTORY_BEAN__KEEP_ALIVE_TIME:
            case SpringPackage.ABSTRACT_CAMEL_THREAD_POOL_FACTORY_BEAN__MAX_POOL_SIZE:
            case SpringPackage.ABSTRACT_CAMEL_THREAD_POOL_FACTORY_BEAN__MAX_QUEUE_SIZE:
            case SpringPackage.ABSTRACT_CAMEL_THREAD_POOL_FACTORY_BEAN__POOL_SIZE:
            case SpringPackage.ABSTRACT_CAMEL_THREAD_POOL_FACTORY_BEAN__REJECTED_POLICY:
            case SpringPackage.ABSTRACT_CAMEL_THREAD_POOL_FACTORY_BEAN__THREAD_NAME:
            case SpringPackage.ABSTRACT_CAMEL_THREAD_POOL_FACTORY_BEAN__TIME_UNIT:
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
