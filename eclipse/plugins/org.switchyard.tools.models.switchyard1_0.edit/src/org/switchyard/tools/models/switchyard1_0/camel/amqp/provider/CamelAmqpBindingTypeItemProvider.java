/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.amqp.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.switchyard.tools.models.switchyard1_0.camel.amqp.AmqpPackage;
import org.switchyard.tools.models.switchyard1_0.bean.provider.Switchyard_1EditPlugin;

import org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelAmqpBindingTypeItemProvider
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
    public CamelAmqpBindingTypeItemProvider(AdapterFactory adapterFactory) {
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

            addQueuePropertyDescriptor(object);
            addTopicPropertyDescriptor(object);
            addConnectionFactoryPropertyDescriptor(object);
            addUsernamePropertyDescriptor(object);
            addPasswordPropertyDescriptor(object);
            addClientIdPropertyDescriptor(object);
            addDurableSubscriptionNamePropertyDescriptor(object);
            addConcurrentConsumersPropertyDescriptor(object);
            addMaxConcurrentConsumersPropertyDescriptor(object);
            addDisableReplyToPropertyDescriptor(object);
            addPreserveMessageQosPropertyDescriptor(object);
            addDeliveryPersistentPropertyDescriptor(object);
            addPriorityPropertyDescriptor(object);
            addExplicitQosEnabledPropertyDescriptor(object);
            addReplyToPropertyDescriptor(object);
            addReplyToTypePropertyDescriptor(object);
            addRequestTimeoutPropertyDescriptor(object);
            addSelectorPropertyDescriptor(object);
            addTimeToLivePropertyDescriptor(object);
            addTransactedPropertyDescriptor(object);
            addTransactionManagerPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Queue feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQueuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAmqpBindingType_queue_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_queue_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__QUEUE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Topic feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTopicPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAmqpBindingType_topic_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_topic_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__TOPIC,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Connection Factory feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConnectionFactoryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAmqpBindingType_connectionFactory_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_connectionFactory_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__CONNECTION_FACTORY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Username feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsernamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAmqpBindingType_username_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_username_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__USERNAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Password feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPasswordPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAmqpBindingType_password_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_password_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__PASSWORD,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Client Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addClientIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAmqpBindingType_clientId_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_clientId_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__CLIENT_ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Durable Subscription Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDurableSubscriptionNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAmqpBindingType_durableSubscriptionName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_durableSubscriptionName_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__DURABLE_SUBSCRIPTION_NAME,
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
                 getString("_UI_CamelAmqpBindingType_concurrentConsumers_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_concurrentConsumers_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__CONCURRENT_CONSUMERS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Max Concurrent Consumers feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxConcurrentConsumersPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAmqpBindingType_maxConcurrentConsumers_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_maxConcurrentConsumers_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Disable Reply To feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDisableReplyToPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAmqpBindingType_disableReplyTo_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_disableReplyTo_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__DISABLE_REPLY_TO,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Preserve Message Qos feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPreserveMessageQosPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAmqpBindingType_preserveMessageQos_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_preserveMessageQos_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__PRESERVE_MESSAGE_QOS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Delivery Persistent feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDeliveryPersistentPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAmqpBindingType_deliveryPersistent_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_deliveryPersistent_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__DELIVERY_PERSISTENT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Priority feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPriorityPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAmqpBindingType_priority_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_priority_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__PRIORITY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Explicit Qos Enabled feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExplicitQosEnabledPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAmqpBindingType_explicitQosEnabled_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_explicitQosEnabled_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__EXPLICIT_QOS_ENABLED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Reply To feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReplyToPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAmqpBindingType_replyTo_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_replyTo_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__REPLY_TO,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Reply To Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReplyToTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAmqpBindingType_replyToType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_replyToType_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__REPLY_TO_TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Request Timeout feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRequestTimeoutPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAmqpBindingType_requestTimeout_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_requestTimeout_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__REQUEST_TIMEOUT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Selector feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSelectorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAmqpBindingType_selector_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_selector_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__SELECTOR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Time To Live feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimeToLivePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAmqpBindingType_timeToLive_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_timeToLive_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__TIME_TO_LIVE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Transacted feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTransactedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAmqpBindingType_transacted_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_transacted_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__TRANSACTED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Transaction Manager feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTransactionManagerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelAmqpBindingType_transactionManager_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelAmqpBindingType_transactionManager_feature", "_UI_CamelAmqpBindingType_type"),
                 AmqpPackage.Literals.CAMEL_AMQP_BINDING_TYPE__TRANSACTION_MANAGER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns CamelAmqpBindingType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CamelAmqpBindingType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CamelAmqpBindingType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_CamelAmqpBindingType_type") :
            getString("_UI_CamelAmqpBindingType_type") + " " + label;
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

        switch (notification.getFeatureID(CamelAmqpBindingType.class)) {
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__QUEUE:
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__TOPIC:
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__CONNECTION_FACTORY:
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__USERNAME:
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__PASSWORD:
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__CLIENT_ID:
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__DURABLE_SUBSCRIPTION_NAME:
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__CONCURRENT_CONSUMERS:
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS:
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__DISABLE_REPLY_TO:
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__PRESERVE_MESSAGE_QOS:
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__DELIVERY_PERSISTENT:
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__PRIORITY:
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__EXPLICIT_QOS_ENABLED:
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__REPLY_TO:
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__REPLY_TO_TYPE:
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__REQUEST_TIMEOUT:
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__SELECTOR:
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__TIME_TO_LIVE:
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__TRANSACTED:
            case AmqpPackage.CAMEL_AMQP_BINDING_TYPE__TRANSACTION_MANAGER:
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
