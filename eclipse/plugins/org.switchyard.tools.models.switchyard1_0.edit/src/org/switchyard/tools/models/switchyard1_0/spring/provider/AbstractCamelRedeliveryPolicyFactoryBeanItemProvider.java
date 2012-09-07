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

import org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractCamelRedeliveryPolicyFactoryBeanItemProvider
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
    public AbstractCamelRedeliveryPolicyFactoryBeanItemProvider(AdapterFactory adapterFactory) {
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

            addAsyncDelayedRedeliveryPropertyDescriptor(object);
            addBackOffMultiplierPropertyDescriptor(object);
            addCollisionAvoidanceFactorPropertyDescriptor(object);
            addDelayPatternPropertyDescriptor(object);
            addDisableRedeliveryPropertyDescriptor(object);
            addLogContinuedPropertyDescriptor(object);
            addLogExhaustedPropertyDescriptor(object);
            addLogHandledPropertyDescriptor(object);
            addLogRetryAttemptedPropertyDescriptor(object);
            addLogRetryStackTracePropertyDescriptor(object);
            addLogStackTracePropertyDescriptor(object);
            addMaximumRedeliveriesPropertyDescriptor(object);
            addMaximumRedeliveryDelayPropertyDescriptor(object);
            addRedeliveryDelayPropertyDescriptor(object);
            addRetriesExhaustedLogLevelPropertyDescriptor(object);
            addRetryAttemptedLogLevelPropertyDescriptor(object);
            addUseCollisionAvoidancePropertyDescriptor(object);
            addUseExponentialBackOffPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Async Delayed Redelivery feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAsyncDelayedRedeliveryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstractCamelRedeliveryPolicyFactoryBean_asyncDelayedRedelivery_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_asyncDelayedRedelivery_feature", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelRedeliveryPolicyFactoryBean_AsyncDelayedRedelivery(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Back Off Multiplier feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBackOffMultiplierPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstractCamelRedeliveryPolicyFactoryBean_backOffMultiplier_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_backOffMultiplier_feature", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelRedeliveryPolicyFactoryBean_BackOffMultiplier(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Collision Avoidance Factor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCollisionAvoidanceFactorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstractCamelRedeliveryPolicyFactoryBean_collisionAvoidanceFactor_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_collisionAvoidanceFactor_feature", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelRedeliveryPolicyFactoryBean_CollisionAvoidanceFactor(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Delay Pattern feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDelayPatternPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstractCamelRedeliveryPolicyFactoryBean_delayPattern_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_delayPattern_feature", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelRedeliveryPolicyFactoryBean_DelayPattern(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Disable Redelivery feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDisableRedeliveryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstractCamelRedeliveryPolicyFactoryBean_disableRedelivery_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_disableRedelivery_feature", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelRedeliveryPolicyFactoryBean_DisableRedelivery(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Log Continued feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLogContinuedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstractCamelRedeliveryPolicyFactoryBean_logContinued_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_logContinued_feature", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelRedeliveryPolicyFactoryBean_LogContinued(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Log Exhausted feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLogExhaustedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstractCamelRedeliveryPolicyFactoryBean_logExhausted_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_logExhausted_feature", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelRedeliveryPolicyFactoryBean_LogExhausted(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Log Handled feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLogHandledPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstractCamelRedeliveryPolicyFactoryBean_logHandled_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_logHandled_feature", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelRedeliveryPolicyFactoryBean_LogHandled(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Log Retry Attempted feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLogRetryAttemptedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstractCamelRedeliveryPolicyFactoryBean_logRetryAttempted_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_logRetryAttempted_feature", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelRedeliveryPolicyFactoryBean_LogRetryAttempted(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Log Retry Stack Trace feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLogRetryStackTracePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstractCamelRedeliveryPolicyFactoryBean_logRetryStackTrace_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_logRetryStackTrace_feature", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelRedeliveryPolicyFactoryBean_LogRetryStackTrace(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Log Stack Trace feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLogStackTracePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstractCamelRedeliveryPolicyFactoryBean_logStackTrace_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_logStackTrace_feature", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelRedeliveryPolicyFactoryBean_LogStackTrace(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Maximum Redeliveries feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaximumRedeliveriesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstractCamelRedeliveryPolicyFactoryBean_maximumRedeliveries_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_maximumRedeliveries_feature", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelRedeliveryPolicyFactoryBean_MaximumRedeliveries(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Maximum Redelivery Delay feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaximumRedeliveryDelayPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstractCamelRedeliveryPolicyFactoryBean_maximumRedeliveryDelay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_maximumRedeliveryDelay_feature", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelRedeliveryPolicyFactoryBean_MaximumRedeliveryDelay(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Redelivery Delay feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRedeliveryDelayPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstractCamelRedeliveryPolicyFactoryBean_redeliveryDelay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_redeliveryDelay_feature", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelRedeliveryPolicyFactoryBean_RedeliveryDelay(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Retries Exhausted Log Level feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRetriesExhaustedLogLevelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstractCamelRedeliveryPolicyFactoryBean_retriesExhaustedLogLevel_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_retriesExhaustedLogLevel_feature", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelRedeliveryPolicyFactoryBean_RetriesExhaustedLogLevel(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Retry Attempted Log Level feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRetryAttemptedLogLevelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstractCamelRedeliveryPolicyFactoryBean_retryAttemptedLogLevel_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_retryAttemptedLogLevel_feature", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelRedeliveryPolicyFactoryBean_RetryAttemptedLogLevel(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Use Collision Avoidance feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseCollisionAvoidancePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstractCamelRedeliveryPolicyFactoryBean_useCollisionAvoidance_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_useCollisionAvoidance_feature", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelRedeliveryPolicyFactoryBean_UseCollisionAvoidance(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Use Exponential Back Off feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseExponentialBackOffPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstractCamelRedeliveryPolicyFactoryBean_useExponentialBackOff_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_useExponentialBackOff_feature", "_UI_AbstractCamelRedeliveryPolicyFactoryBean_type"),
                 SpringPackage.eINSTANCE.getAbstractCamelRedeliveryPolicyFactoryBean_UseExponentialBackOff(),
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
        String label = ((AbstractCamelRedeliveryPolicyFactoryBean)object).getId();
        return label == null || label.length() == 0 ?
            getString("_UI_AbstractCamelRedeliveryPolicyFactoryBean_type") :
            getString("_UI_AbstractCamelRedeliveryPolicyFactoryBean_type") + " " + label;
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

        switch (notification.getFeatureID(AbstractCamelRedeliveryPolicyFactoryBean.class)) {
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__ASYNC_DELAYED_REDELIVERY:
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__BACK_OFF_MULTIPLIER:
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__COLLISION_AVOIDANCE_FACTOR:
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__DELAY_PATTERN:
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__DISABLE_REDELIVERY:
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_CONTINUED:
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_EXHAUSTED:
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_HANDLED:
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_RETRY_ATTEMPTED:
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_RETRY_STACK_TRACE:
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_STACK_TRACE:
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__MAXIMUM_REDELIVERIES:
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__MAXIMUM_REDELIVERY_DELAY:
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__REDELIVERY_DELAY:
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__RETRIES_EXHAUSTED_LOG_LEVEL:
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__RETRY_ATTEMPTED_LOG_LEVEL:
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__USE_COLLISION_AVOIDANCE:
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__USE_EXPONENTIAL_BACK_OFF:
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
