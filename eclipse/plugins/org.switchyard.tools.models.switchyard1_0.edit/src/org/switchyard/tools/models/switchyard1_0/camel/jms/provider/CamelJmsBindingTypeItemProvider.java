/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.jms.provider;


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

import org.switchyard.tools.models.switchyard1_0.camel.jms.CamelJmsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.jms.JmsPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.jms.CamelJmsBindingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelJmsBindingTypeItemProvider
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
    public CamelJmsBindingTypeItemProvider(AdapterFactory adapterFactory) {
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
            addAcknowledgementModeNamePropertyDescriptor(object);
            addAcknowledgementModePropertyDescriptor(object);
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
                 getString("_UI_CamelJmsBindingType_queue_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_queue_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__QUEUE,
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
                 getString("_UI_CamelJmsBindingType_topic_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_topic_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__TOPIC,
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
                 getString("_UI_CamelJmsBindingType_connectionFactory_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_connectionFactory_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__CONNECTION_FACTORY,
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
                 getString("_UI_CamelJmsBindingType_username_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_username_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__USERNAME,
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
                 getString("_UI_CamelJmsBindingType_password_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_password_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__PASSWORD,
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
                 getString("_UI_CamelJmsBindingType_clientId_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_clientId_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__CLIENT_ID,
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
                 getString("_UI_CamelJmsBindingType_durableSubscriptionName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_durableSubscriptionName_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__DURABLE_SUBSCRIPTION_NAME,
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
                 getString("_UI_CamelJmsBindingType_concurrentConsumers_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_concurrentConsumers_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__CONCURRENT_CONSUMERS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                 getString("_UI_CamelJmsBindingType_maxConcurrentConsumers_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_maxConcurrentConsumers_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                 getString("_UI_CamelJmsBindingType_disableReplyTo_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_disableReplyTo_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__DISABLE_REPLY_TO,
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
                 getString("_UI_CamelJmsBindingType_preserveMessageQos_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_preserveMessageQos_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__PRESERVE_MESSAGE_QOS,
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
                 getString("_UI_CamelJmsBindingType_deliveryPersistent_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_deliveryPersistent_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__DELIVERY_PERSISTENT,
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
                 getString("_UI_CamelJmsBindingType_priority_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_priority_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__PRIORITY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                 getString("_UI_CamelJmsBindingType_explicitQosEnabled_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_explicitQosEnabled_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__EXPLICIT_QOS_ENABLED,
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
                 getString("_UI_CamelJmsBindingType_replyTo_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_replyTo_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__REPLY_TO,
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
                 getString("_UI_CamelJmsBindingType_replyToType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_replyToType_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__REPLY_TO_TYPE,
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
                 getString("_UI_CamelJmsBindingType_requestTimeout_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_requestTimeout_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__REQUEST_TIMEOUT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                 getString("_UI_CamelJmsBindingType_selector_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_selector_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__SELECTOR,
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
                 getString("_UI_CamelJmsBindingType_timeToLive_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_timeToLive_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__TIME_TO_LIVE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                 getString("_UI_CamelJmsBindingType_transacted_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_transacted_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__TRANSACTED,
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
                 getString("_UI_CamelJmsBindingType_transactionManager_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_transactionManager_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__TRANSACTION_MANAGER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Acknowledgement Mode Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAcknowledgementModeNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelJmsBindingType_acknowledgementModeName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_acknowledgementModeName_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__ACKNOWLEDGEMENT_MODE_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Acknowledgement Mode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAcknowledgementModePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CamelJmsBindingType_acknowledgementMode_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CamelJmsBindingType_acknowledgementMode_feature", "_UI_CamelJmsBindingType_type"),
                 JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__ACKNOWLEDGEMENT_MODE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns CamelJmsBindingType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CamelJmsBindingType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CamelJmsBindingType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_CamelJmsBindingType_type") :
            getString("_UI_CamelJmsBindingType_type") + " " + label;
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

        switch (notification.getFeatureID(CamelJmsBindingType.class)) {
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__QUEUE:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__TOPIC:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__CONNECTION_FACTORY:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__USERNAME:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__PASSWORD:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__CLIENT_ID:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__DURABLE_SUBSCRIPTION_NAME:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__CONCURRENT_CONSUMERS:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__DISABLE_REPLY_TO:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__PRESERVE_MESSAGE_QOS:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__DELIVERY_PERSISTENT:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__PRIORITY:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__EXPLICIT_QOS_ENABLED:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__REPLY_TO:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__REPLY_TO_TYPE:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__REQUEST_TIMEOUT:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__SELECTOR:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__TIME_TO_LIVE:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__TRANSACTED:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__TRANSACTION_MANAGER:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__ACKNOWLEDGEMENT_MODE_NAME:
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__ACKNOWLEDGEMENT_MODE:
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
