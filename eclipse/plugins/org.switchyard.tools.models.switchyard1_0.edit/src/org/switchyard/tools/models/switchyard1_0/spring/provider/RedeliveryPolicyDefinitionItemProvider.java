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

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.switchyard.tools.models.switchyard1_0.bean.provider.Switchyard_1EditPlugin;

import org.switchyard.tools.models.switchyard1_0.spring.RedeliveryPolicyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.RedeliveryPolicyDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RedeliveryPolicyDefinitionItemProvider
    extends ItemProviderAdapter
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
    public RedeliveryPolicyDefinitionItemProvider(AdapterFactory adapterFactory) {
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
                 getString("_UI_RedeliveryPolicyDefinition_asyncDelayedRedelivery_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RedeliveryPolicyDefinition_asyncDelayedRedelivery_feature", "_UI_RedeliveryPolicyDefinition_type"),
                 SpringPackage.eINSTANCE.getRedeliveryPolicyDefinition_AsyncDelayedRedelivery(),
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
                 getString("_UI_RedeliveryPolicyDefinition_backOffMultiplier_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RedeliveryPolicyDefinition_backOffMultiplier_feature", "_UI_RedeliveryPolicyDefinition_type"),
                 SpringPackage.eINSTANCE.getRedeliveryPolicyDefinition_BackOffMultiplier(),
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
                 getString("_UI_RedeliveryPolicyDefinition_collisionAvoidanceFactor_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RedeliveryPolicyDefinition_collisionAvoidanceFactor_feature", "_UI_RedeliveryPolicyDefinition_type"),
                 SpringPackage.eINSTANCE.getRedeliveryPolicyDefinition_CollisionAvoidanceFactor(),
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
                 getString("_UI_RedeliveryPolicyDefinition_delayPattern_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RedeliveryPolicyDefinition_delayPattern_feature", "_UI_RedeliveryPolicyDefinition_type"),
                 SpringPackage.eINSTANCE.getRedeliveryPolicyDefinition_DelayPattern(),
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
                 getString("_UI_RedeliveryPolicyDefinition_disableRedelivery_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RedeliveryPolicyDefinition_disableRedelivery_feature", "_UI_RedeliveryPolicyDefinition_type"),
                 SpringPackage.eINSTANCE.getRedeliveryPolicyDefinition_DisableRedelivery(),
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
                 getString("_UI_RedeliveryPolicyDefinition_logContinued_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RedeliveryPolicyDefinition_logContinued_feature", "_UI_RedeliveryPolicyDefinition_type"),
                 SpringPackage.eINSTANCE.getRedeliveryPolicyDefinition_LogContinued(),
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
                 getString("_UI_RedeliveryPolicyDefinition_logExhausted_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RedeliveryPolicyDefinition_logExhausted_feature", "_UI_RedeliveryPolicyDefinition_type"),
                 SpringPackage.eINSTANCE.getRedeliveryPolicyDefinition_LogExhausted(),
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
                 getString("_UI_RedeliveryPolicyDefinition_logHandled_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RedeliveryPolicyDefinition_logHandled_feature", "_UI_RedeliveryPolicyDefinition_type"),
                 SpringPackage.eINSTANCE.getRedeliveryPolicyDefinition_LogHandled(),
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
                 getString("_UI_RedeliveryPolicyDefinition_logRetryAttempted_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RedeliveryPolicyDefinition_logRetryAttempted_feature", "_UI_RedeliveryPolicyDefinition_type"),
                 SpringPackage.eINSTANCE.getRedeliveryPolicyDefinition_LogRetryAttempted(),
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
                 getString("_UI_RedeliveryPolicyDefinition_logRetryStackTrace_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RedeliveryPolicyDefinition_logRetryStackTrace_feature", "_UI_RedeliveryPolicyDefinition_type"),
                 SpringPackage.eINSTANCE.getRedeliveryPolicyDefinition_LogRetryStackTrace(),
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
                 getString("_UI_RedeliveryPolicyDefinition_logStackTrace_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RedeliveryPolicyDefinition_logStackTrace_feature", "_UI_RedeliveryPolicyDefinition_type"),
                 SpringPackage.eINSTANCE.getRedeliveryPolicyDefinition_LogStackTrace(),
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
                 getString("_UI_RedeliveryPolicyDefinition_maximumRedeliveries_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RedeliveryPolicyDefinition_maximumRedeliveries_feature", "_UI_RedeliveryPolicyDefinition_type"),
                 SpringPackage.eINSTANCE.getRedeliveryPolicyDefinition_MaximumRedeliveries(),
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
                 getString("_UI_RedeliveryPolicyDefinition_maximumRedeliveryDelay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RedeliveryPolicyDefinition_maximumRedeliveryDelay_feature", "_UI_RedeliveryPolicyDefinition_type"),
                 SpringPackage.eINSTANCE.getRedeliveryPolicyDefinition_MaximumRedeliveryDelay(),
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
                 getString("_UI_RedeliveryPolicyDefinition_redeliveryDelay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RedeliveryPolicyDefinition_redeliveryDelay_feature", "_UI_RedeliveryPolicyDefinition_type"),
                 SpringPackage.eINSTANCE.getRedeliveryPolicyDefinition_RedeliveryDelay(),
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
                 getString("_UI_RedeliveryPolicyDefinition_retriesExhaustedLogLevel_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RedeliveryPolicyDefinition_retriesExhaustedLogLevel_feature", "_UI_RedeliveryPolicyDefinition_type"),
                 SpringPackage.eINSTANCE.getRedeliveryPolicyDefinition_RetriesExhaustedLogLevel(),
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
                 getString("_UI_RedeliveryPolicyDefinition_retryAttemptedLogLevel_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RedeliveryPolicyDefinition_retryAttemptedLogLevel_feature", "_UI_RedeliveryPolicyDefinition_type"),
                 SpringPackage.eINSTANCE.getRedeliveryPolicyDefinition_RetryAttemptedLogLevel(),
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
                 getString("_UI_RedeliveryPolicyDefinition_useCollisionAvoidance_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RedeliveryPolicyDefinition_useCollisionAvoidance_feature", "_UI_RedeliveryPolicyDefinition_type"),
                 SpringPackage.eINSTANCE.getRedeliveryPolicyDefinition_UseCollisionAvoidance(),
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
                 getString("_UI_RedeliveryPolicyDefinition_useExponentialBackOff_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RedeliveryPolicyDefinition_useExponentialBackOff_feature", "_UI_RedeliveryPolicyDefinition_type"),
                 SpringPackage.eINSTANCE.getRedeliveryPolicyDefinition_UseExponentialBackOff(),
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns RedeliveryPolicyDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/RedeliveryPolicyDefinition"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((RedeliveryPolicyDefinition)object).getAsyncDelayedRedelivery();
        return label == null || label.length() == 0 ?
            getString("_UI_RedeliveryPolicyDefinition_type") :
            getString("_UI_RedeliveryPolicyDefinition_type") + " " + label;
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

        switch (notification.getFeatureID(RedeliveryPolicyDefinition.class)) {
            case SpringPackage.REDELIVERY_POLICY_DEFINITION__ASYNC_DELAYED_REDELIVERY:
            case SpringPackage.REDELIVERY_POLICY_DEFINITION__BACK_OFF_MULTIPLIER:
            case SpringPackage.REDELIVERY_POLICY_DEFINITION__COLLISION_AVOIDANCE_FACTOR:
            case SpringPackage.REDELIVERY_POLICY_DEFINITION__DELAY_PATTERN:
            case SpringPackage.REDELIVERY_POLICY_DEFINITION__DISABLE_REDELIVERY:
            case SpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_CONTINUED:
            case SpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_EXHAUSTED:
            case SpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_HANDLED:
            case SpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_RETRY_ATTEMPTED:
            case SpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_RETRY_STACK_TRACE:
            case SpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_STACK_TRACE:
            case SpringPackage.REDELIVERY_POLICY_DEFINITION__MAXIMUM_REDELIVERIES:
            case SpringPackage.REDELIVERY_POLICY_DEFINITION__MAXIMUM_REDELIVERY_DELAY:
            case SpringPackage.REDELIVERY_POLICY_DEFINITION__REDELIVERY_DELAY:
            case SpringPackage.REDELIVERY_POLICY_DEFINITION__RETRIES_EXHAUSTED_LOG_LEVEL:
            case SpringPackage.REDELIVERY_POLICY_DEFINITION__RETRY_ATTEMPTED_LOG_LEVEL:
            case SpringPackage.REDELIVERY_POLICY_DEFINITION__USE_COLLISION_AVOIDANCE:
            case SpringPackage.REDELIVERY_POLICY_DEFINITION__USE_EXPONENTIAL_BACK_OFF:
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

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return Switchyard_1EditPlugin.INSTANCE;
    }

}
