/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.hornetq.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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

import org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType;
import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQFactory;
import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigTypeItemProvider
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
    public ConfigTypeItemProvider(AdapterFactory adapterFactory) {
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

            addAckBatchSizePropertyDescriptor(object);
            addAutoGroupPropertyDescriptor(object);
            addBlockOnAcknowledgePropertyDescriptor(object);
            addBlockOnDurableSendPropertyDescriptor(object);
            addBlockOnNonDurableSendPropertyDescriptor(object);
            addCacheLargeMessagesOnConsumerPropertyDescriptor(object);
            addCallTimeoutPropertyDescriptor(object);
            addClientFailureCheckPeriodPropertyDescriptor(object);
            addCompressLargeMessagesPropertyDescriptor(object);
            addConnectionLoadBalancingPolicyClassNamePropertyDescriptor(object);
            addConnectionTTLPropertyDescriptor(object);
            addConfirmationWindowSizePropertyDescriptor(object);
            addConsumerMaxRatePropertyDescriptor(object);
            addConsumerWindowSizePropertyDescriptor(object);
            addDisableFinalizeCheckPropertyDescriptor(object);
            addFailoverOnInitialConnectionPropertyDescriptor(object);
            addGroupIDPropertyDescriptor(object);
            addInitialMessagePacketSizePropertyDescriptor(object);
            addInitialReconnectAttemptsPropertyDescriptor(object);
            addMaxRetryIntervalPropertyDescriptor(object);
            addMinLargeMessageSizePropertyDescriptor(object);
            addPreAcknowledgePropertyDescriptor(object);
            addProducerMaxRatePropertyDescriptor(object);
            addProducerWindowSizePropertyDescriptor(object);
            addQueuePropertyDescriptor(object);
            addReconnectAttemptsPropertyDescriptor(object);
            addRetryIntervalPropertyDescriptor(object);
            addRetryIntervalMultiplierPropertyDescriptor(object);
            addScheduledThreadPoolMaxSizePropertyDescriptor(object);
            addThreadPoolMaxSizePropertyDescriptor(object);
            addUseGlobalPoolsPropertyDescriptor(object);
            addUseHAPropertyDescriptor(object);
            addXaSessionPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Ack Batch Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAckBatchSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_ackBatchSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_ackBatchSize_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__ACK_BATCH_SIZE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Auto Group feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAutoGroupPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_autoGroup_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_autoGroup_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__AUTO_GROUP,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Block On Acknowledge feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBlockOnAcknowledgePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_blockOnAcknowledge_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_blockOnAcknowledge_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__BLOCK_ON_ACKNOWLEDGE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Block On Durable Send feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBlockOnDurableSendPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_blockOnDurableSend_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_blockOnDurableSend_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__BLOCK_ON_DURABLE_SEND,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Block On Non Durable Send feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBlockOnNonDurableSendPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_blockOnNonDurableSend_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_blockOnNonDurableSend_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__BLOCK_ON_NON_DURABLE_SEND,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Cache Large Messages On Consumer feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCacheLargeMessagesOnConsumerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_cacheLargeMessagesOnConsumer_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_cacheLargeMessagesOnConsumer_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__CACHE_LARGE_MESSAGES_ON_CONSUMER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Call Timeout feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCallTimeoutPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_callTimeout_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_callTimeout_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__CALL_TIMEOUT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Client Failure Check Period feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addClientFailureCheckPeriodPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_clientFailureCheckPeriod_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_clientFailureCheckPeriod_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__CLIENT_FAILURE_CHECK_PERIOD,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Compress Large Messages feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCompressLargeMessagesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_compressLargeMessages_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_compressLargeMessages_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__COMPRESS_LARGE_MESSAGES,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Connection Load Balancing Policy Class Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConnectionLoadBalancingPolicyClassNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_connectionLoadBalancingPolicyClassName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_connectionLoadBalancingPolicyClassName_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__CONNECTION_LOAD_BALANCING_POLICY_CLASS_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Connection TTL feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConnectionTTLPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_connectionTTL_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_connectionTTL_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__CONNECTION_TTL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Confirmation Window Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConfirmationWindowSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_confirmationWindowSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_confirmationWindowSize_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__CONFIRMATION_WINDOW_SIZE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Consumer Max Rate feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConsumerMaxRatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_consumerMaxRate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_consumerMaxRate_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__CONSUMER_MAX_RATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Consumer Window Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConsumerWindowSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_consumerWindowSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_consumerWindowSize_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__CONSUMER_WINDOW_SIZE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Disable Finalize Check feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDisableFinalizeCheckPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_disableFinalizeCheck_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_disableFinalizeCheck_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__DISABLE_FINALIZE_CHECK,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Failover On Initial Connection feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFailoverOnInitialConnectionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_failoverOnInitialConnection_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_failoverOnInitialConnection_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__FAILOVER_ON_INITIAL_CONNECTION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Group ID feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGroupIDPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_groupID_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_groupID_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__GROUP_ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Initial Message Packet Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInitialMessagePacketSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_initialMessagePacketSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_initialMessagePacketSize_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__INITIAL_MESSAGE_PACKET_SIZE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Initial Reconnect Attempts feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInitialReconnectAttemptsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_initialReconnectAttempts_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_initialReconnectAttempts_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__INITIAL_RECONNECT_ATTEMPTS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Max Retry Interval feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxRetryIntervalPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_maxRetryInterval_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_maxRetryInterval_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__MAX_RETRY_INTERVAL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Min Large Message Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinLargeMessageSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_minLargeMessageSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_minLargeMessageSize_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__MIN_LARGE_MESSAGE_SIZE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Pre Acknowledge feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPreAcknowledgePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_preAcknowledge_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_preAcknowledge_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__PRE_ACKNOWLEDGE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Producer Max Rate feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProducerMaxRatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_producerMaxRate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_producerMaxRate_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__PRODUCER_MAX_RATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Producer Window Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProducerWindowSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_producerWindowSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_producerWindowSize_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__PRODUCER_WINDOW_SIZE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
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
                 getString("_UI_ConfigType_queue_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_queue_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__QUEUE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Reconnect Attempts feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReconnectAttemptsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_reconnectAttempts_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_reconnectAttempts_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__RECONNECT_ATTEMPTS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Retry Interval feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRetryIntervalPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_retryInterval_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_retryInterval_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__RETRY_INTERVAL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Retry Interval Multiplier feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRetryIntervalMultiplierPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_retryIntervalMultiplier_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_retryIntervalMultiplier_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__RETRY_INTERVAL_MULTIPLIER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Scheduled Thread Pool Max Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addScheduledThreadPoolMaxSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_scheduledThreadPoolMaxSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_scheduledThreadPoolMaxSize_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__SCHEDULED_THREAD_POOL_MAX_SIZE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Thread Pool Max Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThreadPoolMaxSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_threadPoolMaxSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_threadPoolMaxSize_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__THREAD_POOL_MAX_SIZE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Use Global Pools feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseGlobalPoolsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_useGlobalPools_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_useGlobalPools_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__USE_GLOBAL_POOLS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Use HA feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseHAPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_useHA_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_useHA_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__USE_HA,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Xa Session feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXaSessionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ConfigType_xaSession_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ConfigType_xaSession_feature", "_UI_ConfigType_type"),
                 HornetQPackage.Literals.CONFIG_TYPE__XA_SESSION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(HornetQPackage.Literals.CONFIG_TYPE__CONNECTOR);
            childrenFeatures.add(HornetQPackage.Literals.CONFIG_TYPE__DISCOVERY_GROUP);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns ConfigType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ConfigType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((ConfigType)object).getConnectionLoadBalancingPolicyClassName();
        return label == null || label.length() == 0 ?
            getString("_UI_ConfigType_type") :
            getString("_UI_ConfigType_type") + " " + label;
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

        switch (notification.getFeatureID(ConfigType.class)) {
            case HornetQPackage.CONFIG_TYPE__ACK_BATCH_SIZE:
            case HornetQPackage.CONFIG_TYPE__AUTO_GROUP:
            case HornetQPackage.CONFIG_TYPE__BLOCK_ON_ACKNOWLEDGE:
            case HornetQPackage.CONFIG_TYPE__BLOCK_ON_DURABLE_SEND:
            case HornetQPackage.CONFIG_TYPE__BLOCK_ON_NON_DURABLE_SEND:
            case HornetQPackage.CONFIG_TYPE__CACHE_LARGE_MESSAGES_ON_CONSUMER:
            case HornetQPackage.CONFIG_TYPE__CALL_TIMEOUT:
            case HornetQPackage.CONFIG_TYPE__CLIENT_FAILURE_CHECK_PERIOD:
            case HornetQPackage.CONFIG_TYPE__COMPRESS_LARGE_MESSAGES:
            case HornetQPackage.CONFIG_TYPE__CONNECTION_LOAD_BALANCING_POLICY_CLASS_NAME:
            case HornetQPackage.CONFIG_TYPE__CONNECTION_TTL:
            case HornetQPackage.CONFIG_TYPE__CONFIRMATION_WINDOW_SIZE:
            case HornetQPackage.CONFIG_TYPE__CONSUMER_MAX_RATE:
            case HornetQPackage.CONFIG_TYPE__CONSUMER_WINDOW_SIZE:
            case HornetQPackage.CONFIG_TYPE__DISABLE_FINALIZE_CHECK:
            case HornetQPackage.CONFIG_TYPE__FAILOVER_ON_INITIAL_CONNECTION:
            case HornetQPackage.CONFIG_TYPE__GROUP_ID:
            case HornetQPackage.CONFIG_TYPE__INITIAL_MESSAGE_PACKET_SIZE:
            case HornetQPackage.CONFIG_TYPE__INITIAL_RECONNECT_ATTEMPTS:
            case HornetQPackage.CONFIG_TYPE__MAX_RETRY_INTERVAL:
            case HornetQPackage.CONFIG_TYPE__MIN_LARGE_MESSAGE_SIZE:
            case HornetQPackage.CONFIG_TYPE__PRE_ACKNOWLEDGE:
            case HornetQPackage.CONFIG_TYPE__PRODUCER_MAX_RATE:
            case HornetQPackage.CONFIG_TYPE__PRODUCER_WINDOW_SIZE:
            case HornetQPackage.CONFIG_TYPE__QUEUE:
            case HornetQPackage.CONFIG_TYPE__RECONNECT_ATTEMPTS:
            case HornetQPackage.CONFIG_TYPE__RETRY_INTERVAL:
            case HornetQPackage.CONFIG_TYPE__RETRY_INTERVAL_MULTIPLIER:
            case HornetQPackage.CONFIG_TYPE__SCHEDULED_THREAD_POOL_MAX_SIZE:
            case HornetQPackage.CONFIG_TYPE__THREAD_POOL_MAX_SIZE:
            case HornetQPackage.CONFIG_TYPE__USE_GLOBAL_POOLS:
            case HornetQPackage.CONFIG_TYPE__USE_HA:
            case HornetQPackage.CONFIG_TYPE__XA_SESSION:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case HornetQPackage.CONFIG_TYPE__CONNECTOR:
            case HornetQPackage.CONFIG_TYPE__DISCOVERY_GROUP:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

        newChildDescriptors.add
            (createChildParameter
                (HornetQPackage.Literals.CONFIG_TYPE__CONNECTOR,
                 HornetQFactory.eINSTANCE.createConnectorType()));

        newChildDescriptors.add
            (createChildParameter
                (HornetQPackage.Literals.CONFIG_TYPE__DISCOVERY_GROUP,
                 HornetQFactory.eINSTANCE.createDiscoveryGroupType()));
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
