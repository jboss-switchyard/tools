/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.hornetq.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType;
import org.switchyard.tools.models.switchyard1_0.hornetq.ConnectorType;
import org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType;
import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getAckBatchSize <em>Ack Batch Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#isAutoGroup <em>Auto Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#isBlockOnAcknowledge <em>Block On Acknowledge</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#isBlockOnDurableSend <em>Block On Durable Send</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#isBlockOnNonDurableSend <em>Block On Non Durable Send</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#isCacheLargeMessagesOnConsumer <em>Cache Large Messages On Consumer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getCallTimeout <em>Call Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getClientFailureCheckPeriod <em>Client Failure Check Period</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#isCompressLargeMessages <em>Compress Large Messages</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getConnectionLoadBalancingPolicyClassName <em>Connection Load Balancing Policy Class Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getConnectionTTL <em>Connection TTL</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getConfirmationWindowSize <em>Confirmation Window Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getConsumerMaxRate <em>Consumer Max Rate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getConsumerWindowSize <em>Consumer Window Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#isDisableFinalizeCheck <em>Disable Finalize Check</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getDiscoveryGroup <em>Discovery Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#isFailoverOnInitialConnection <em>Failover On Initial Connection</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getGroupID <em>Group ID</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getInitialMessagePacketSize <em>Initial Message Packet Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getInitialReconnectAttempts <em>Initial Reconnect Attempts</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getMaxRetryInterval <em>Max Retry Interval</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getMinLargeMessageSize <em>Min Large Message Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#isPreAcknowledge <em>Pre Acknowledge</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getProducerMaxRate <em>Producer Max Rate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getProducerWindowSize <em>Producer Window Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getQueue <em>Queue</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getReconnectAttempts <em>Reconnect Attempts</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getRetryInterval <em>Retry Interval</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getRetryIntervalMultiplier <em>Retry Interval Multiplier</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getScheduledThreadPoolMaxSize <em>Scheduled Thread Pool Max Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#getThreadPoolMaxSize <em>Thread Pool Max Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#isUseGlobalPools <em>Use Global Pools</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#isUseHA <em>Use HA</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl#isXaSession <em>Xa Session</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigTypeImpl extends EObjectImpl implements ConfigType {
    /**
     * The default value of the '{@link #getAckBatchSize() <em>Ack Batch Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAckBatchSize()
     * @generated
     * @ordered
     */
    protected static final long ACK_BATCH_SIZE_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getAckBatchSize() <em>Ack Batch Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAckBatchSize()
     * @generated
     * @ordered
     */
    protected long ackBatchSize = ACK_BATCH_SIZE_EDEFAULT;

    /**
     * This is true if the Ack Batch Size attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ackBatchSizeESet;

    /**
     * The default value of the '{@link #isAutoGroup() <em>Auto Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAutoGroup()
     * @generated
     * @ordered
     */
    protected static final boolean AUTO_GROUP_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isAutoGroup() <em>Auto Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAutoGroup()
     * @generated
     * @ordered
     */
    protected boolean autoGroup = AUTO_GROUP_EDEFAULT;

    /**
     * This is true if the Auto Group attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean autoGroupESet;

    /**
     * The default value of the '{@link #isBlockOnAcknowledge() <em>Block On Acknowledge</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBlockOnAcknowledge()
     * @generated
     * @ordered
     */
    protected static final boolean BLOCK_ON_ACKNOWLEDGE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isBlockOnAcknowledge() <em>Block On Acknowledge</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBlockOnAcknowledge()
     * @generated
     * @ordered
     */
    protected boolean blockOnAcknowledge = BLOCK_ON_ACKNOWLEDGE_EDEFAULT;

    /**
     * This is true if the Block On Acknowledge attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean blockOnAcknowledgeESet;

    /**
     * The default value of the '{@link #isBlockOnDurableSend() <em>Block On Durable Send</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBlockOnDurableSend()
     * @generated
     * @ordered
     */
    protected static final boolean BLOCK_ON_DURABLE_SEND_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isBlockOnDurableSend() <em>Block On Durable Send</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBlockOnDurableSend()
     * @generated
     * @ordered
     */
    protected boolean blockOnDurableSend = BLOCK_ON_DURABLE_SEND_EDEFAULT;

    /**
     * This is true if the Block On Durable Send attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean blockOnDurableSendESet;

    /**
     * The default value of the '{@link #isBlockOnNonDurableSend() <em>Block On Non Durable Send</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBlockOnNonDurableSend()
     * @generated
     * @ordered
     */
    protected static final boolean BLOCK_ON_NON_DURABLE_SEND_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isBlockOnNonDurableSend() <em>Block On Non Durable Send</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBlockOnNonDurableSend()
     * @generated
     * @ordered
     */
    protected boolean blockOnNonDurableSend = BLOCK_ON_NON_DURABLE_SEND_EDEFAULT;

    /**
     * This is true if the Block On Non Durable Send attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean blockOnNonDurableSendESet;

    /**
     * The default value of the '{@link #isCacheLargeMessagesOnConsumer() <em>Cache Large Messages On Consumer</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCacheLargeMessagesOnConsumer()
     * @generated
     * @ordered
     */
    protected static final boolean CACHE_LARGE_MESSAGES_ON_CONSUMER_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCacheLargeMessagesOnConsumer() <em>Cache Large Messages On Consumer</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCacheLargeMessagesOnConsumer()
     * @generated
     * @ordered
     */
    protected boolean cacheLargeMessagesOnConsumer = CACHE_LARGE_MESSAGES_ON_CONSUMER_EDEFAULT;

    /**
     * This is true if the Cache Large Messages On Consumer attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cacheLargeMessagesOnConsumerESet;

    /**
     * The default value of the '{@link #getCallTimeout() <em>Call Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCallTimeout()
     * @generated
     * @ordered
     */
    protected static final long CALL_TIMEOUT_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getCallTimeout() <em>Call Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCallTimeout()
     * @generated
     * @ordered
     */
    protected long callTimeout = CALL_TIMEOUT_EDEFAULT;

    /**
     * This is true if the Call Timeout attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean callTimeoutESet;

    /**
     * The default value of the '{@link #getClientFailureCheckPeriod() <em>Client Failure Check Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClientFailureCheckPeriod()
     * @generated
     * @ordered
     */
    protected static final long CLIENT_FAILURE_CHECK_PERIOD_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getClientFailureCheckPeriod() <em>Client Failure Check Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClientFailureCheckPeriod()
     * @generated
     * @ordered
     */
    protected long clientFailureCheckPeriod = CLIENT_FAILURE_CHECK_PERIOD_EDEFAULT;

    /**
     * This is true if the Client Failure Check Period attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean clientFailureCheckPeriodESet;

    /**
     * The default value of the '{@link #isCompressLargeMessages() <em>Compress Large Messages</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCompressLargeMessages()
     * @generated
     * @ordered
     */
    protected static final boolean COMPRESS_LARGE_MESSAGES_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCompressLargeMessages() <em>Compress Large Messages</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCompressLargeMessages()
     * @generated
     * @ordered
     */
    protected boolean compressLargeMessages = COMPRESS_LARGE_MESSAGES_EDEFAULT;

    /**
     * This is true if the Compress Large Messages attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean compressLargeMessagesESet;

    /**
     * The default value of the '{@link #getConnectionLoadBalancingPolicyClassName() <em>Connection Load Balancing Policy Class Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionLoadBalancingPolicyClassName()
     * @generated
     * @ordered
     */
    protected static final String CONNECTION_LOAD_BALANCING_POLICY_CLASS_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConnectionLoadBalancingPolicyClassName() <em>Connection Load Balancing Policy Class Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionLoadBalancingPolicyClassName()
     * @generated
     * @ordered
     */
    protected String connectionLoadBalancingPolicyClassName = CONNECTION_LOAD_BALANCING_POLICY_CLASS_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getConnectionTTL() <em>Connection TTL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionTTL()
     * @generated
     * @ordered
     */
    protected static final long CONNECTION_TTL_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getConnectionTTL() <em>Connection TTL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionTTL()
     * @generated
     * @ordered
     */
    protected long connectionTTL = CONNECTION_TTL_EDEFAULT;

    /**
     * This is true if the Connection TTL attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean connectionTTLESet;

    /**
     * The default value of the '{@link #getConfirmationWindowSize() <em>Confirmation Window Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfirmationWindowSize()
     * @generated
     * @ordered
     */
    protected static final int CONFIRMATION_WINDOW_SIZE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getConfirmationWindowSize() <em>Confirmation Window Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfirmationWindowSize()
     * @generated
     * @ordered
     */
    protected int confirmationWindowSize = CONFIRMATION_WINDOW_SIZE_EDEFAULT;

    /**
     * This is true if the Confirmation Window Size attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean confirmationWindowSizeESet;

    /**
     * The cached value of the '{@link #getConnector() <em>Connector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnector()
     * @generated
     * @ordered
     */
    protected ConnectorType connector;

    /**
     * The default value of the '{@link #getConsumerMaxRate() <em>Consumer Max Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumerMaxRate()
     * @generated
     * @ordered
     */
    protected static final int CONSUMER_MAX_RATE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getConsumerMaxRate() <em>Consumer Max Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumerMaxRate()
     * @generated
     * @ordered
     */
    protected int consumerMaxRate = CONSUMER_MAX_RATE_EDEFAULT;

    /**
     * This is true if the Consumer Max Rate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean consumerMaxRateESet;

    /**
     * The default value of the '{@link #getConsumerWindowSize() <em>Consumer Window Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumerWindowSize()
     * @generated
     * @ordered
     */
    protected static final int CONSUMER_WINDOW_SIZE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getConsumerWindowSize() <em>Consumer Window Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumerWindowSize()
     * @generated
     * @ordered
     */
    protected int consumerWindowSize = CONSUMER_WINDOW_SIZE_EDEFAULT;

    /**
     * This is true if the Consumer Window Size attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean consumerWindowSizeESet;

    /**
     * The default value of the '{@link #isDisableFinalizeCheck() <em>Disable Finalize Check</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDisableFinalizeCheck()
     * @generated
     * @ordered
     */
    protected static final boolean DISABLE_FINALIZE_CHECK_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDisableFinalizeCheck() <em>Disable Finalize Check</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDisableFinalizeCheck()
     * @generated
     * @ordered
     */
    protected boolean disableFinalizeCheck = DISABLE_FINALIZE_CHECK_EDEFAULT;

    /**
     * This is true if the Disable Finalize Check attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean disableFinalizeCheckESet;

    /**
     * The cached value of the '{@link #getDiscoveryGroup() <em>Discovery Group</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiscoveryGroup()
     * @generated
     * @ordered
     */
    protected DiscoveryGroupType discoveryGroup;

    /**
     * The default value of the '{@link #isFailoverOnInitialConnection() <em>Failover On Initial Connection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFailoverOnInitialConnection()
     * @generated
     * @ordered
     */
    protected static final boolean FAILOVER_ON_INITIAL_CONNECTION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isFailoverOnInitialConnection() <em>Failover On Initial Connection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFailoverOnInitialConnection()
     * @generated
     * @ordered
     */
    protected boolean failoverOnInitialConnection = FAILOVER_ON_INITIAL_CONNECTION_EDEFAULT;

    /**
     * This is true if the Failover On Initial Connection attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean failoverOnInitialConnectionESet;

    /**
     * The default value of the '{@link #getGroupID() <em>Group ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroupID()
     * @generated
     * @ordered
     */
    protected static final String GROUP_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGroupID() <em>Group ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroupID()
     * @generated
     * @ordered
     */
    protected String groupID = GROUP_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getInitialMessagePacketSize() <em>Initial Message Packet Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialMessagePacketSize()
     * @generated
     * @ordered
     */
    protected static final int INITIAL_MESSAGE_PACKET_SIZE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getInitialMessagePacketSize() <em>Initial Message Packet Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialMessagePacketSize()
     * @generated
     * @ordered
     */
    protected int initialMessagePacketSize = INITIAL_MESSAGE_PACKET_SIZE_EDEFAULT;

    /**
     * This is true if the Initial Message Packet Size attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean initialMessagePacketSizeESet;

    /**
     * The default value of the '{@link #getInitialReconnectAttempts() <em>Initial Reconnect Attempts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialReconnectAttempts()
     * @generated
     * @ordered
     */
    protected static final int INITIAL_RECONNECT_ATTEMPTS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getInitialReconnectAttempts() <em>Initial Reconnect Attempts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialReconnectAttempts()
     * @generated
     * @ordered
     */
    protected int initialReconnectAttempts = INITIAL_RECONNECT_ATTEMPTS_EDEFAULT;

    /**
     * This is true if the Initial Reconnect Attempts attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean initialReconnectAttemptsESet;

    /**
     * The default value of the '{@link #getMaxRetryInterval() <em>Max Retry Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxRetryInterval()
     * @generated
     * @ordered
     */
    protected static final long MAX_RETRY_INTERVAL_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getMaxRetryInterval() <em>Max Retry Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxRetryInterval()
     * @generated
     * @ordered
     */
    protected long maxRetryInterval = MAX_RETRY_INTERVAL_EDEFAULT;

    /**
     * This is true if the Max Retry Interval attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxRetryIntervalESet;

    /**
     * The default value of the '{@link #getMinLargeMessageSize() <em>Min Large Message Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinLargeMessageSize()
     * @generated
     * @ordered
     */
    protected static final long MIN_LARGE_MESSAGE_SIZE_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getMinLargeMessageSize() <em>Min Large Message Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinLargeMessageSize()
     * @generated
     * @ordered
     */
    protected long minLargeMessageSize = MIN_LARGE_MESSAGE_SIZE_EDEFAULT;

    /**
     * This is true if the Min Large Message Size attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minLargeMessageSizeESet;

    /**
     * The default value of the '{@link #isPreAcknowledge() <em>Pre Acknowledge</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPreAcknowledge()
     * @generated
     * @ordered
     */
    protected static final boolean PRE_ACKNOWLEDGE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isPreAcknowledge() <em>Pre Acknowledge</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPreAcknowledge()
     * @generated
     * @ordered
     */
    protected boolean preAcknowledge = PRE_ACKNOWLEDGE_EDEFAULT;

    /**
     * This is true if the Pre Acknowledge attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean preAcknowledgeESet;

    /**
     * The default value of the '{@link #getProducerMaxRate() <em>Producer Max Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProducerMaxRate()
     * @generated
     * @ordered
     */
    protected static final int PRODUCER_MAX_RATE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getProducerMaxRate() <em>Producer Max Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProducerMaxRate()
     * @generated
     * @ordered
     */
    protected int producerMaxRate = PRODUCER_MAX_RATE_EDEFAULT;

    /**
     * This is true if the Producer Max Rate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean producerMaxRateESet;

    /**
     * The default value of the '{@link #getProducerWindowSize() <em>Producer Window Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProducerWindowSize()
     * @generated
     * @ordered
     */
    protected static final int PRODUCER_WINDOW_SIZE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getProducerWindowSize() <em>Producer Window Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProducerWindowSize()
     * @generated
     * @ordered
     */
    protected int producerWindowSize = PRODUCER_WINDOW_SIZE_EDEFAULT;

    /**
     * This is true if the Producer Window Size attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean producerWindowSizeESet;

    /**
     * The default value of the '{@link #getQueue() <em>Queue</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQueue()
     * @generated
     * @ordered
     */
    protected static final String QUEUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQueue() <em>Queue</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQueue()
     * @generated
     * @ordered
     */
    protected String queue = QUEUE_EDEFAULT;

    /**
     * The default value of the '{@link #getReconnectAttempts() <em>Reconnect Attempts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReconnectAttempts()
     * @generated
     * @ordered
     */
    protected static final int RECONNECT_ATTEMPTS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getReconnectAttempts() <em>Reconnect Attempts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReconnectAttempts()
     * @generated
     * @ordered
     */
    protected int reconnectAttempts = RECONNECT_ATTEMPTS_EDEFAULT;

    /**
     * This is true if the Reconnect Attempts attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reconnectAttemptsESet;

    /**
     * The default value of the '{@link #getRetryInterval() <em>Retry Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRetryInterval()
     * @generated
     * @ordered
     */
    protected static final long RETRY_INTERVAL_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getRetryInterval() <em>Retry Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRetryInterval()
     * @generated
     * @ordered
     */
    protected long retryInterval = RETRY_INTERVAL_EDEFAULT;

    /**
     * This is true if the Retry Interval attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean retryIntervalESet;

    /**
     * The default value of the '{@link #getRetryIntervalMultiplier() <em>Retry Interval Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRetryIntervalMultiplier()
     * @generated
     * @ordered
     */
    protected static final float RETRY_INTERVAL_MULTIPLIER_EDEFAULT = 0.0F;

    /**
     * The cached value of the '{@link #getRetryIntervalMultiplier() <em>Retry Interval Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRetryIntervalMultiplier()
     * @generated
     * @ordered
     */
    protected float retryIntervalMultiplier = RETRY_INTERVAL_MULTIPLIER_EDEFAULT;

    /**
     * This is true if the Retry Interval Multiplier attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean retryIntervalMultiplierESet;

    /**
     * The default value of the '{@link #getScheduledThreadPoolMaxSize() <em>Scheduled Thread Pool Max Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScheduledThreadPoolMaxSize()
     * @generated
     * @ordered
     */
    protected static final int SCHEDULED_THREAD_POOL_MAX_SIZE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getScheduledThreadPoolMaxSize() <em>Scheduled Thread Pool Max Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScheduledThreadPoolMaxSize()
     * @generated
     * @ordered
     */
    protected int scheduledThreadPoolMaxSize = SCHEDULED_THREAD_POOL_MAX_SIZE_EDEFAULT;

    /**
     * This is true if the Scheduled Thread Pool Max Size attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean scheduledThreadPoolMaxSizeESet;

    /**
     * The default value of the '{@link #getThreadPoolMaxSize() <em>Thread Pool Max Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThreadPoolMaxSize()
     * @generated
     * @ordered
     */
    protected static final int THREAD_POOL_MAX_SIZE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getThreadPoolMaxSize() <em>Thread Pool Max Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThreadPoolMaxSize()
     * @generated
     * @ordered
     */
    protected int threadPoolMaxSize = THREAD_POOL_MAX_SIZE_EDEFAULT;

    /**
     * This is true if the Thread Pool Max Size attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean threadPoolMaxSizeESet;

    /**
     * The default value of the '{@link #isUseGlobalPools() <em>Use Global Pools</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUseGlobalPools()
     * @generated
     * @ordered
     */
    protected static final boolean USE_GLOBAL_POOLS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isUseGlobalPools() <em>Use Global Pools</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUseGlobalPools()
     * @generated
     * @ordered
     */
    protected boolean useGlobalPools = USE_GLOBAL_POOLS_EDEFAULT;

    /**
     * This is true if the Use Global Pools attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean useGlobalPoolsESet;

    /**
     * The default value of the '{@link #isUseHA() <em>Use HA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUseHA()
     * @generated
     * @ordered
     */
    protected static final boolean USE_HA_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isUseHA() <em>Use HA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUseHA()
     * @generated
     * @ordered
     */
    protected boolean useHA = USE_HA_EDEFAULT;

    /**
     * This is true if the Use HA attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean useHAESet;

    /**
     * The default value of the '{@link #isXaSession() <em>Xa Session</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isXaSession()
     * @generated
     * @ordered
     */
    protected static final boolean XA_SESSION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isXaSession() <em>Xa Session</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isXaSession()
     * @generated
     * @ordered
     */
    protected boolean xaSession = XA_SESSION_EDEFAULT;

    /**
     * This is true if the Xa Session attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xaSessionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConfigTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return HornetQPackage.Literals.CONFIG_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getAckBatchSize() {
        return ackBatchSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAckBatchSize(long newAckBatchSize) {
        long oldAckBatchSize = ackBatchSize;
        ackBatchSize = newAckBatchSize;
        boolean oldAckBatchSizeESet = ackBatchSizeESet;
        ackBatchSizeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__ACK_BATCH_SIZE, oldAckBatchSize, ackBatchSize, !oldAckBatchSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAckBatchSize() {
        long oldAckBatchSize = ackBatchSize;
        boolean oldAckBatchSizeESet = ackBatchSizeESet;
        ackBatchSize = ACK_BATCH_SIZE_EDEFAULT;
        ackBatchSizeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__ACK_BATCH_SIZE, oldAckBatchSize, ACK_BATCH_SIZE_EDEFAULT, oldAckBatchSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAckBatchSize() {
        return ackBatchSizeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAutoGroup() {
        return autoGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAutoGroup(boolean newAutoGroup) {
        boolean oldAutoGroup = autoGroup;
        autoGroup = newAutoGroup;
        boolean oldAutoGroupESet = autoGroupESet;
        autoGroupESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__AUTO_GROUP, oldAutoGroup, autoGroup, !oldAutoGroupESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAutoGroup() {
        boolean oldAutoGroup = autoGroup;
        boolean oldAutoGroupESet = autoGroupESet;
        autoGroup = AUTO_GROUP_EDEFAULT;
        autoGroupESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__AUTO_GROUP, oldAutoGroup, AUTO_GROUP_EDEFAULT, oldAutoGroupESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAutoGroup() {
        return autoGroupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isBlockOnAcknowledge() {
        return blockOnAcknowledge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBlockOnAcknowledge(boolean newBlockOnAcknowledge) {
        boolean oldBlockOnAcknowledge = blockOnAcknowledge;
        blockOnAcknowledge = newBlockOnAcknowledge;
        boolean oldBlockOnAcknowledgeESet = blockOnAcknowledgeESet;
        blockOnAcknowledgeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__BLOCK_ON_ACKNOWLEDGE, oldBlockOnAcknowledge, blockOnAcknowledge, !oldBlockOnAcknowledgeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBlockOnAcknowledge() {
        boolean oldBlockOnAcknowledge = blockOnAcknowledge;
        boolean oldBlockOnAcknowledgeESet = blockOnAcknowledgeESet;
        blockOnAcknowledge = BLOCK_ON_ACKNOWLEDGE_EDEFAULT;
        blockOnAcknowledgeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__BLOCK_ON_ACKNOWLEDGE, oldBlockOnAcknowledge, BLOCK_ON_ACKNOWLEDGE_EDEFAULT, oldBlockOnAcknowledgeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetBlockOnAcknowledge() {
        return blockOnAcknowledgeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isBlockOnDurableSend() {
        return blockOnDurableSend;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBlockOnDurableSend(boolean newBlockOnDurableSend) {
        boolean oldBlockOnDurableSend = blockOnDurableSend;
        blockOnDurableSend = newBlockOnDurableSend;
        boolean oldBlockOnDurableSendESet = blockOnDurableSendESet;
        blockOnDurableSendESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__BLOCK_ON_DURABLE_SEND, oldBlockOnDurableSend, blockOnDurableSend, !oldBlockOnDurableSendESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBlockOnDurableSend() {
        boolean oldBlockOnDurableSend = blockOnDurableSend;
        boolean oldBlockOnDurableSendESet = blockOnDurableSendESet;
        blockOnDurableSend = BLOCK_ON_DURABLE_SEND_EDEFAULT;
        blockOnDurableSendESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__BLOCK_ON_DURABLE_SEND, oldBlockOnDurableSend, BLOCK_ON_DURABLE_SEND_EDEFAULT, oldBlockOnDurableSendESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetBlockOnDurableSend() {
        return blockOnDurableSendESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isBlockOnNonDurableSend() {
        return blockOnNonDurableSend;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBlockOnNonDurableSend(boolean newBlockOnNonDurableSend) {
        boolean oldBlockOnNonDurableSend = blockOnNonDurableSend;
        blockOnNonDurableSend = newBlockOnNonDurableSend;
        boolean oldBlockOnNonDurableSendESet = blockOnNonDurableSendESet;
        blockOnNonDurableSendESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__BLOCK_ON_NON_DURABLE_SEND, oldBlockOnNonDurableSend, blockOnNonDurableSend, !oldBlockOnNonDurableSendESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBlockOnNonDurableSend() {
        boolean oldBlockOnNonDurableSend = blockOnNonDurableSend;
        boolean oldBlockOnNonDurableSendESet = blockOnNonDurableSendESet;
        blockOnNonDurableSend = BLOCK_ON_NON_DURABLE_SEND_EDEFAULT;
        blockOnNonDurableSendESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__BLOCK_ON_NON_DURABLE_SEND, oldBlockOnNonDurableSend, BLOCK_ON_NON_DURABLE_SEND_EDEFAULT, oldBlockOnNonDurableSendESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetBlockOnNonDurableSend() {
        return blockOnNonDurableSendESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isCacheLargeMessagesOnConsumer() {
        return cacheLargeMessagesOnConsumer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCacheLargeMessagesOnConsumer(boolean newCacheLargeMessagesOnConsumer) {
        boolean oldCacheLargeMessagesOnConsumer = cacheLargeMessagesOnConsumer;
        cacheLargeMessagesOnConsumer = newCacheLargeMessagesOnConsumer;
        boolean oldCacheLargeMessagesOnConsumerESet = cacheLargeMessagesOnConsumerESet;
        cacheLargeMessagesOnConsumerESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__CACHE_LARGE_MESSAGES_ON_CONSUMER, oldCacheLargeMessagesOnConsumer, cacheLargeMessagesOnConsumer, !oldCacheLargeMessagesOnConsumerESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetCacheLargeMessagesOnConsumer() {
        boolean oldCacheLargeMessagesOnConsumer = cacheLargeMessagesOnConsumer;
        boolean oldCacheLargeMessagesOnConsumerESet = cacheLargeMessagesOnConsumerESet;
        cacheLargeMessagesOnConsumer = CACHE_LARGE_MESSAGES_ON_CONSUMER_EDEFAULT;
        cacheLargeMessagesOnConsumerESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__CACHE_LARGE_MESSAGES_ON_CONSUMER, oldCacheLargeMessagesOnConsumer, CACHE_LARGE_MESSAGES_ON_CONSUMER_EDEFAULT, oldCacheLargeMessagesOnConsumerESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetCacheLargeMessagesOnConsumer() {
        return cacheLargeMessagesOnConsumerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getCallTimeout() {
        return callTimeout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCallTimeout(long newCallTimeout) {
        long oldCallTimeout = callTimeout;
        callTimeout = newCallTimeout;
        boolean oldCallTimeoutESet = callTimeoutESet;
        callTimeoutESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__CALL_TIMEOUT, oldCallTimeout, callTimeout, !oldCallTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetCallTimeout() {
        long oldCallTimeout = callTimeout;
        boolean oldCallTimeoutESet = callTimeoutESet;
        callTimeout = CALL_TIMEOUT_EDEFAULT;
        callTimeoutESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__CALL_TIMEOUT, oldCallTimeout, CALL_TIMEOUT_EDEFAULT, oldCallTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetCallTimeout() {
        return callTimeoutESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getClientFailureCheckPeriod() {
        return clientFailureCheckPeriod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setClientFailureCheckPeriod(long newClientFailureCheckPeriod) {
        long oldClientFailureCheckPeriod = clientFailureCheckPeriod;
        clientFailureCheckPeriod = newClientFailureCheckPeriod;
        boolean oldClientFailureCheckPeriodESet = clientFailureCheckPeriodESet;
        clientFailureCheckPeriodESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__CLIENT_FAILURE_CHECK_PERIOD, oldClientFailureCheckPeriod, clientFailureCheckPeriod, !oldClientFailureCheckPeriodESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetClientFailureCheckPeriod() {
        long oldClientFailureCheckPeriod = clientFailureCheckPeriod;
        boolean oldClientFailureCheckPeriodESet = clientFailureCheckPeriodESet;
        clientFailureCheckPeriod = CLIENT_FAILURE_CHECK_PERIOD_EDEFAULT;
        clientFailureCheckPeriodESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__CLIENT_FAILURE_CHECK_PERIOD, oldClientFailureCheckPeriod, CLIENT_FAILURE_CHECK_PERIOD_EDEFAULT, oldClientFailureCheckPeriodESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetClientFailureCheckPeriod() {
        return clientFailureCheckPeriodESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isCompressLargeMessages() {
        return compressLargeMessages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCompressLargeMessages(boolean newCompressLargeMessages) {
        boolean oldCompressLargeMessages = compressLargeMessages;
        compressLargeMessages = newCompressLargeMessages;
        boolean oldCompressLargeMessagesESet = compressLargeMessagesESet;
        compressLargeMessagesESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__COMPRESS_LARGE_MESSAGES, oldCompressLargeMessages, compressLargeMessages, !oldCompressLargeMessagesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetCompressLargeMessages() {
        boolean oldCompressLargeMessages = compressLargeMessages;
        boolean oldCompressLargeMessagesESet = compressLargeMessagesESet;
        compressLargeMessages = COMPRESS_LARGE_MESSAGES_EDEFAULT;
        compressLargeMessagesESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__COMPRESS_LARGE_MESSAGES, oldCompressLargeMessages, COMPRESS_LARGE_MESSAGES_EDEFAULT, oldCompressLargeMessagesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetCompressLargeMessages() {
        return compressLargeMessagesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getConnectionLoadBalancingPolicyClassName() {
        return connectionLoadBalancingPolicyClassName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnectionLoadBalancingPolicyClassName(String newConnectionLoadBalancingPolicyClassName) {
        String oldConnectionLoadBalancingPolicyClassName = connectionLoadBalancingPolicyClassName;
        connectionLoadBalancingPolicyClassName = newConnectionLoadBalancingPolicyClassName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__CONNECTION_LOAD_BALANCING_POLICY_CLASS_NAME, oldConnectionLoadBalancingPolicyClassName, connectionLoadBalancingPolicyClassName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getConnectionTTL() {
        return connectionTTL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnectionTTL(long newConnectionTTL) {
        long oldConnectionTTL = connectionTTL;
        connectionTTL = newConnectionTTL;
        boolean oldConnectionTTLESet = connectionTTLESet;
        connectionTTLESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__CONNECTION_TTL, oldConnectionTTL, connectionTTL, !oldConnectionTTLESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetConnectionTTL() {
        long oldConnectionTTL = connectionTTL;
        boolean oldConnectionTTLESet = connectionTTLESet;
        connectionTTL = CONNECTION_TTL_EDEFAULT;
        connectionTTLESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__CONNECTION_TTL, oldConnectionTTL, CONNECTION_TTL_EDEFAULT, oldConnectionTTLESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetConnectionTTL() {
        return connectionTTLESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getConfirmationWindowSize() {
        return confirmationWindowSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConfirmationWindowSize(int newConfirmationWindowSize) {
        int oldConfirmationWindowSize = confirmationWindowSize;
        confirmationWindowSize = newConfirmationWindowSize;
        boolean oldConfirmationWindowSizeESet = confirmationWindowSizeESet;
        confirmationWindowSizeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__CONFIRMATION_WINDOW_SIZE, oldConfirmationWindowSize, confirmationWindowSize, !oldConfirmationWindowSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetConfirmationWindowSize() {
        int oldConfirmationWindowSize = confirmationWindowSize;
        boolean oldConfirmationWindowSizeESet = confirmationWindowSizeESet;
        confirmationWindowSize = CONFIRMATION_WINDOW_SIZE_EDEFAULT;
        confirmationWindowSizeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__CONFIRMATION_WINDOW_SIZE, oldConfirmationWindowSize, CONFIRMATION_WINDOW_SIZE_EDEFAULT, oldConfirmationWindowSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetConfirmationWindowSize() {
        return confirmationWindowSizeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorType getConnector() {
        return connector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConnector(ConnectorType newConnector, NotificationChain msgs) {
        ConnectorType oldConnector = connector;
        connector = newConnector;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__CONNECTOR, oldConnector, newConnector);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnector(ConnectorType newConnector) {
        if (newConnector != connector) {
            NotificationChain msgs = null;
            if (connector != null)
                msgs = ((InternalEObject)connector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HornetQPackage.CONFIG_TYPE__CONNECTOR, null, msgs);
            if (newConnector != null)
                msgs = ((InternalEObject)newConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HornetQPackage.CONFIG_TYPE__CONNECTOR, null, msgs);
            msgs = basicSetConnector(newConnector, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__CONNECTOR, newConnector, newConnector));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getConsumerMaxRate() {
        return consumerMaxRate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConsumerMaxRate(int newConsumerMaxRate) {
        int oldConsumerMaxRate = consumerMaxRate;
        consumerMaxRate = newConsumerMaxRate;
        boolean oldConsumerMaxRateESet = consumerMaxRateESet;
        consumerMaxRateESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__CONSUMER_MAX_RATE, oldConsumerMaxRate, consumerMaxRate, !oldConsumerMaxRateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetConsumerMaxRate() {
        int oldConsumerMaxRate = consumerMaxRate;
        boolean oldConsumerMaxRateESet = consumerMaxRateESet;
        consumerMaxRate = CONSUMER_MAX_RATE_EDEFAULT;
        consumerMaxRateESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__CONSUMER_MAX_RATE, oldConsumerMaxRate, CONSUMER_MAX_RATE_EDEFAULT, oldConsumerMaxRateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetConsumerMaxRate() {
        return consumerMaxRateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getConsumerWindowSize() {
        return consumerWindowSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConsumerWindowSize(int newConsumerWindowSize) {
        int oldConsumerWindowSize = consumerWindowSize;
        consumerWindowSize = newConsumerWindowSize;
        boolean oldConsumerWindowSizeESet = consumerWindowSizeESet;
        consumerWindowSizeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__CONSUMER_WINDOW_SIZE, oldConsumerWindowSize, consumerWindowSize, !oldConsumerWindowSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetConsumerWindowSize() {
        int oldConsumerWindowSize = consumerWindowSize;
        boolean oldConsumerWindowSizeESet = consumerWindowSizeESet;
        consumerWindowSize = CONSUMER_WINDOW_SIZE_EDEFAULT;
        consumerWindowSizeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__CONSUMER_WINDOW_SIZE, oldConsumerWindowSize, CONSUMER_WINDOW_SIZE_EDEFAULT, oldConsumerWindowSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetConsumerWindowSize() {
        return consumerWindowSizeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isDisableFinalizeCheck() {
        return disableFinalizeCheck;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDisableFinalizeCheck(boolean newDisableFinalizeCheck) {
        boolean oldDisableFinalizeCheck = disableFinalizeCheck;
        disableFinalizeCheck = newDisableFinalizeCheck;
        boolean oldDisableFinalizeCheckESet = disableFinalizeCheckESet;
        disableFinalizeCheckESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__DISABLE_FINALIZE_CHECK, oldDisableFinalizeCheck, disableFinalizeCheck, !oldDisableFinalizeCheckESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDisableFinalizeCheck() {
        boolean oldDisableFinalizeCheck = disableFinalizeCheck;
        boolean oldDisableFinalizeCheckESet = disableFinalizeCheckESet;
        disableFinalizeCheck = DISABLE_FINALIZE_CHECK_EDEFAULT;
        disableFinalizeCheckESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__DISABLE_FINALIZE_CHECK, oldDisableFinalizeCheck, DISABLE_FINALIZE_CHECK_EDEFAULT, oldDisableFinalizeCheckESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDisableFinalizeCheck() {
        return disableFinalizeCheckESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiscoveryGroupType getDiscoveryGroup() {
        return discoveryGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDiscoveryGroup(DiscoveryGroupType newDiscoveryGroup, NotificationChain msgs) {
        DiscoveryGroupType oldDiscoveryGroup = discoveryGroup;
        discoveryGroup = newDiscoveryGroup;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__DISCOVERY_GROUP, oldDiscoveryGroup, newDiscoveryGroup);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDiscoveryGroup(DiscoveryGroupType newDiscoveryGroup) {
        if (newDiscoveryGroup != discoveryGroup) {
            NotificationChain msgs = null;
            if (discoveryGroup != null)
                msgs = ((InternalEObject)discoveryGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HornetQPackage.CONFIG_TYPE__DISCOVERY_GROUP, null, msgs);
            if (newDiscoveryGroup != null)
                msgs = ((InternalEObject)newDiscoveryGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HornetQPackage.CONFIG_TYPE__DISCOVERY_GROUP, null, msgs);
            msgs = basicSetDiscoveryGroup(newDiscoveryGroup, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__DISCOVERY_GROUP, newDiscoveryGroup, newDiscoveryGroup));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isFailoverOnInitialConnection() {
        return failoverOnInitialConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFailoverOnInitialConnection(boolean newFailoverOnInitialConnection) {
        boolean oldFailoverOnInitialConnection = failoverOnInitialConnection;
        failoverOnInitialConnection = newFailoverOnInitialConnection;
        boolean oldFailoverOnInitialConnectionESet = failoverOnInitialConnectionESet;
        failoverOnInitialConnectionESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__FAILOVER_ON_INITIAL_CONNECTION, oldFailoverOnInitialConnection, failoverOnInitialConnection, !oldFailoverOnInitialConnectionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetFailoverOnInitialConnection() {
        boolean oldFailoverOnInitialConnection = failoverOnInitialConnection;
        boolean oldFailoverOnInitialConnectionESet = failoverOnInitialConnectionESet;
        failoverOnInitialConnection = FAILOVER_ON_INITIAL_CONNECTION_EDEFAULT;
        failoverOnInitialConnectionESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__FAILOVER_ON_INITIAL_CONNECTION, oldFailoverOnInitialConnection, FAILOVER_ON_INITIAL_CONNECTION_EDEFAULT, oldFailoverOnInitialConnectionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetFailoverOnInitialConnection() {
        return failoverOnInitialConnectionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGroupID(String newGroupID) {
        String oldGroupID = groupID;
        groupID = newGroupID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__GROUP_ID, oldGroupID, groupID));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getInitialMessagePacketSize() {
        return initialMessagePacketSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitialMessagePacketSize(int newInitialMessagePacketSize) {
        int oldInitialMessagePacketSize = initialMessagePacketSize;
        initialMessagePacketSize = newInitialMessagePacketSize;
        boolean oldInitialMessagePacketSizeESet = initialMessagePacketSizeESet;
        initialMessagePacketSizeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__INITIAL_MESSAGE_PACKET_SIZE, oldInitialMessagePacketSize, initialMessagePacketSize, !oldInitialMessagePacketSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetInitialMessagePacketSize() {
        int oldInitialMessagePacketSize = initialMessagePacketSize;
        boolean oldInitialMessagePacketSizeESet = initialMessagePacketSizeESet;
        initialMessagePacketSize = INITIAL_MESSAGE_PACKET_SIZE_EDEFAULT;
        initialMessagePacketSizeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__INITIAL_MESSAGE_PACKET_SIZE, oldInitialMessagePacketSize, INITIAL_MESSAGE_PACKET_SIZE_EDEFAULT, oldInitialMessagePacketSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetInitialMessagePacketSize() {
        return initialMessagePacketSizeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getInitialReconnectAttempts() {
        return initialReconnectAttempts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitialReconnectAttempts(int newInitialReconnectAttempts) {
        int oldInitialReconnectAttempts = initialReconnectAttempts;
        initialReconnectAttempts = newInitialReconnectAttempts;
        boolean oldInitialReconnectAttemptsESet = initialReconnectAttemptsESet;
        initialReconnectAttemptsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__INITIAL_RECONNECT_ATTEMPTS, oldInitialReconnectAttempts, initialReconnectAttempts, !oldInitialReconnectAttemptsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetInitialReconnectAttempts() {
        int oldInitialReconnectAttempts = initialReconnectAttempts;
        boolean oldInitialReconnectAttemptsESet = initialReconnectAttemptsESet;
        initialReconnectAttempts = INITIAL_RECONNECT_ATTEMPTS_EDEFAULT;
        initialReconnectAttemptsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__INITIAL_RECONNECT_ATTEMPTS, oldInitialReconnectAttempts, INITIAL_RECONNECT_ATTEMPTS_EDEFAULT, oldInitialReconnectAttemptsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetInitialReconnectAttempts() {
        return initialReconnectAttemptsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getMaxRetryInterval() {
        return maxRetryInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxRetryInterval(long newMaxRetryInterval) {
        long oldMaxRetryInterval = maxRetryInterval;
        maxRetryInterval = newMaxRetryInterval;
        boolean oldMaxRetryIntervalESet = maxRetryIntervalESet;
        maxRetryIntervalESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__MAX_RETRY_INTERVAL, oldMaxRetryInterval, maxRetryInterval, !oldMaxRetryIntervalESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMaxRetryInterval() {
        long oldMaxRetryInterval = maxRetryInterval;
        boolean oldMaxRetryIntervalESet = maxRetryIntervalESet;
        maxRetryInterval = MAX_RETRY_INTERVAL_EDEFAULT;
        maxRetryIntervalESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__MAX_RETRY_INTERVAL, oldMaxRetryInterval, MAX_RETRY_INTERVAL_EDEFAULT, oldMaxRetryIntervalESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMaxRetryInterval() {
        return maxRetryIntervalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getMinLargeMessageSize() {
        return minLargeMessageSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMinLargeMessageSize(long newMinLargeMessageSize) {
        long oldMinLargeMessageSize = minLargeMessageSize;
        minLargeMessageSize = newMinLargeMessageSize;
        boolean oldMinLargeMessageSizeESet = minLargeMessageSizeESet;
        minLargeMessageSizeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__MIN_LARGE_MESSAGE_SIZE, oldMinLargeMessageSize, minLargeMessageSize, !oldMinLargeMessageSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMinLargeMessageSize() {
        long oldMinLargeMessageSize = minLargeMessageSize;
        boolean oldMinLargeMessageSizeESet = minLargeMessageSizeESet;
        minLargeMessageSize = MIN_LARGE_MESSAGE_SIZE_EDEFAULT;
        minLargeMessageSizeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__MIN_LARGE_MESSAGE_SIZE, oldMinLargeMessageSize, MIN_LARGE_MESSAGE_SIZE_EDEFAULT, oldMinLargeMessageSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMinLargeMessageSize() {
        return minLargeMessageSizeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isPreAcknowledge() {
        return preAcknowledge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPreAcknowledge(boolean newPreAcknowledge) {
        boolean oldPreAcknowledge = preAcknowledge;
        preAcknowledge = newPreAcknowledge;
        boolean oldPreAcknowledgeESet = preAcknowledgeESet;
        preAcknowledgeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__PRE_ACKNOWLEDGE, oldPreAcknowledge, preAcknowledge, !oldPreAcknowledgeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPreAcknowledge() {
        boolean oldPreAcknowledge = preAcknowledge;
        boolean oldPreAcknowledgeESet = preAcknowledgeESet;
        preAcknowledge = PRE_ACKNOWLEDGE_EDEFAULT;
        preAcknowledgeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__PRE_ACKNOWLEDGE, oldPreAcknowledge, PRE_ACKNOWLEDGE_EDEFAULT, oldPreAcknowledgeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPreAcknowledge() {
        return preAcknowledgeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getProducerMaxRate() {
        return producerMaxRate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProducerMaxRate(int newProducerMaxRate) {
        int oldProducerMaxRate = producerMaxRate;
        producerMaxRate = newProducerMaxRate;
        boolean oldProducerMaxRateESet = producerMaxRateESet;
        producerMaxRateESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__PRODUCER_MAX_RATE, oldProducerMaxRate, producerMaxRate, !oldProducerMaxRateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetProducerMaxRate() {
        int oldProducerMaxRate = producerMaxRate;
        boolean oldProducerMaxRateESet = producerMaxRateESet;
        producerMaxRate = PRODUCER_MAX_RATE_EDEFAULT;
        producerMaxRateESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__PRODUCER_MAX_RATE, oldProducerMaxRate, PRODUCER_MAX_RATE_EDEFAULT, oldProducerMaxRateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetProducerMaxRate() {
        return producerMaxRateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getProducerWindowSize() {
        return producerWindowSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProducerWindowSize(int newProducerWindowSize) {
        int oldProducerWindowSize = producerWindowSize;
        producerWindowSize = newProducerWindowSize;
        boolean oldProducerWindowSizeESet = producerWindowSizeESet;
        producerWindowSizeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__PRODUCER_WINDOW_SIZE, oldProducerWindowSize, producerWindowSize, !oldProducerWindowSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetProducerWindowSize() {
        int oldProducerWindowSize = producerWindowSize;
        boolean oldProducerWindowSizeESet = producerWindowSizeESet;
        producerWindowSize = PRODUCER_WINDOW_SIZE_EDEFAULT;
        producerWindowSizeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__PRODUCER_WINDOW_SIZE, oldProducerWindowSize, PRODUCER_WINDOW_SIZE_EDEFAULT, oldProducerWindowSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetProducerWindowSize() {
        return producerWindowSizeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getQueue() {
        return queue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setQueue(String newQueue) {
        String oldQueue = queue;
        queue = newQueue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__QUEUE, oldQueue, queue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getReconnectAttempts() {
        return reconnectAttempts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReconnectAttempts(int newReconnectAttempts) {
        int oldReconnectAttempts = reconnectAttempts;
        reconnectAttempts = newReconnectAttempts;
        boolean oldReconnectAttemptsESet = reconnectAttemptsESet;
        reconnectAttemptsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__RECONNECT_ATTEMPTS, oldReconnectAttempts, reconnectAttempts, !oldReconnectAttemptsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetReconnectAttempts() {
        int oldReconnectAttempts = reconnectAttempts;
        boolean oldReconnectAttemptsESet = reconnectAttemptsESet;
        reconnectAttempts = RECONNECT_ATTEMPTS_EDEFAULT;
        reconnectAttemptsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__RECONNECT_ATTEMPTS, oldReconnectAttempts, RECONNECT_ATTEMPTS_EDEFAULT, oldReconnectAttemptsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetReconnectAttempts() {
        return reconnectAttemptsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getRetryInterval() {
        return retryInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRetryInterval(long newRetryInterval) {
        long oldRetryInterval = retryInterval;
        retryInterval = newRetryInterval;
        boolean oldRetryIntervalESet = retryIntervalESet;
        retryIntervalESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__RETRY_INTERVAL, oldRetryInterval, retryInterval, !oldRetryIntervalESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetRetryInterval() {
        long oldRetryInterval = retryInterval;
        boolean oldRetryIntervalESet = retryIntervalESet;
        retryInterval = RETRY_INTERVAL_EDEFAULT;
        retryIntervalESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__RETRY_INTERVAL, oldRetryInterval, RETRY_INTERVAL_EDEFAULT, oldRetryIntervalESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetRetryInterval() {
        return retryIntervalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public float getRetryIntervalMultiplier() {
        return retryIntervalMultiplier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRetryIntervalMultiplier(float newRetryIntervalMultiplier) {
        float oldRetryIntervalMultiplier = retryIntervalMultiplier;
        retryIntervalMultiplier = newRetryIntervalMultiplier;
        boolean oldRetryIntervalMultiplierESet = retryIntervalMultiplierESet;
        retryIntervalMultiplierESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__RETRY_INTERVAL_MULTIPLIER, oldRetryIntervalMultiplier, retryIntervalMultiplier, !oldRetryIntervalMultiplierESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetRetryIntervalMultiplier() {
        float oldRetryIntervalMultiplier = retryIntervalMultiplier;
        boolean oldRetryIntervalMultiplierESet = retryIntervalMultiplierESet;
        retryIntervalMultiplier = RETRY_INTERVAL_MULTIPLIER_EDEFAULT;
        retryIntervalMultiplierESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__RETRY_INTERVAL_MULTIPLIER, oldRetryIntervalMultiplier, RETRY_INTERVAL_MULTIPLIER_EDEFAULT, oldRetryIntervalMultiplierESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetRetryIntervalMultiplier() {
        return retryIntervalMultiplierESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getScheduledThreadPoolMaxSize() {
        return scheduledThreadPoolMaxSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScheduledThreadPoolMaxSize(int newScheduledThreadPoolMaxSize) {
        int oldScheduledThreadPoolMaxSize = scheduledThreadPoolMaxSize;
        scheduledThreadPoolMaxSize = newScheduledThreadPoolMaxSize;
        boolean oldScheduledThreadPoolMaxSizeESet = scheduledThreadPoolMaxSizeESet;
        scheduledThreadPoolMaxSizeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__SCHEDULED_THREAD_POOL_MAX_SIZE, oldScheduledThreadPoolMaxSize, scheduledThreadPoolMaxSize, !oldScheduledThreadPoolMaxSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetScheduledThreadPoolMaxSize() {
        int oldScheduledThreadPoolMaxSize = scheduledThreadPoolMaxSize;
        boolean oldScheduledThreadPoolMaxSizeESet = scheduledThreadPoolMaxSizeESet;
        scheduledThreadPoolMaxSize = SCHEDULED_THREAD_POOL_MAX_SIZE_EDEFAULT;
        scheduledThreadPoolMaxSizeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__SCHEDULED_THREAD_POOL_MAX_SIZE, oldScheduledThreadPoolMaxSize, SCHEDULED_THREAD_POOL_MAX_SIZE_EDEFAULT, oldScheduledThreadPoolMaxSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetScheduledThreadPoolMaxSize() {
        return scheduledThreadPoolMaxSizeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getThreadPoolMaxSize() {
        return threadPoolMaxSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setThreadPoolMaxSize(int newThreadPoolMaxSize) {
        int oldThreadPoolMaxSize = threadPoolMaxSize;
        threadPoolMaxSize = newThreadPoolMaxSize;
        boolean oldThreadPoolMaxSizeESet = threadPoolMaxSizeESet;
        threadPoolMaxSizeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__THREAD_POOL_MAX_SIZE, oldThreadPoolMaxSize, threadPoolMaxSize, !oldThreadPoolMaxSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetThreadPoolMaxSize() {
        int oldThreadPoolMaxSize = threadPoolMaxSize;
        boolean oldThreadPoolMaxSizeESet = threadPoolMaxSizeESet;
        threadPoolMaxSize = THREAD_POOL_MAX_SIZE_EDEFAULT;
        threadPoolMaxSizeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__THREAD_POOL_MAX_SIZE, oldThreadPoolMaxSize, THREAD_POOL_MAX_SIZE_EDEFAULT, oldThreadPoolMaxSizeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetThreadPoolMaxSize() {
        return threadPoolMaxSizeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isUseGlobalPools() {
        return useGlobalPools;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUseGlobalPools(boolean newUseGlobalPools) {
        boolean oldUseGlobalPools = useGlobalPools;
        useGlobalPools = newUseGlobalPools;
        boolean oldUseGlobalPoolsESet = useGlobalPoolsESet;
        useGlobalPoolsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__USE_GLOBAL_POOLS, oldUseGlobalPools, useGlobalPools, !oldUseGlobalPoolsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetUseGlobalPools() {
        boolean oldUseGlobalPools = useGlobalPools;
        boolean oldUseGlobalPoolsESet = useGlobalPoolsESet;
        useGlobalPools = USE_GLOBAL_POOLS_EDEFAULT;
        useGlobalPoolsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__USE_GLOBAL_POOLS, oldUseGlobalPools, USE_GLOBAL_POOLS_EDEFAULT, oldUseGlobalPoolsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetUseGlobalPools() {
        return useGlobalPoolsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isUseHA() {
        return useHA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUseHA(boolean newUseHA) {
        boolean oldUseHA = useHA;
        useHA = newUseHA;
        boolean oldUseHAESet = useHAESet;
        useHAESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__USE_HA, oldUseHA, useHA, !oldUseHAESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetUseHA() {
        boolean oldUseHA = useHA;
        boolean oldUseHAESet = useHAESet;
        useHA = USE_HA_EDEFAULT;
        useHAESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__USE_HA, oldUseHA, USE_HA_EDEFAULT, oldUseHAESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetUseHA() {
        return useHAESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isXaSession() {
        return xaSession;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setXaSession(boolean newXaSession) {
        boolean oldXaSession = xaSession;
        xaSession = newXaSession;
        boolean oldXaSessionESet = xaSessionESet;
        xaSessionESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONFIG_TYPE__XA_SESSION, oldXaSession, xaSession, !oldXaSessionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetXaSession() {
        boolean oldXaSession = xaSession;
        boolean oldXaSessionESet = xaSessionESet;
        xaSession = XA_SESSION_EDEFAULT;
        xaSessionESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.CONFIG_TYPE__XA_SESSION, oldXaSession, XA_SESSION_EDEFAULT, oldXaSessionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetXaSession() {
        return xaSessionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case HornetQPackage.CONFIG_TYPE__CONNECTOR:
                return basicSetConnector(null, msgs);
            case HornetQPackage.CONFIG_TYPE__DISCOVERY_GROUP:
                return basicSetDiscoveryGroup(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case HornetQPackage.CONFIG_TYPE__ACK_BATCH_SIZE:
                return getAckBatchSize();
            case HornetQPackage.CONFIG_TYPE__AUTO_GROUP:
                return isAutoGroup();
            case HornetQPackage.CONFIG_TYPE__BLOCK_ON_ACKNOWLEDGE:
                return isBlockOnAcknowledge();
            case HornetQPackage.CONFIG_TYPE__BLOCK_ON_DURABLE_SEND:
                return isBlockOnDurableSend();
            case HornetQPackage.CONFIG_TYPE__BLOCK_ON_NON_DURABLE_SEND:
                return isBlockOnNonDurableSend();
            case HornetQPackage.CONFIG_TYPE__CACHE_LARGE_MESSAGES_ON_CONSUMER:
                return isCacheLargeMessagesOnConsumer();
            case HornetQPackage.CONFIG_TYPE__CALL_TIMEOUT:
                return getCallTimeout();
            case HornetQPackage.CONFIG_TYPE__CLIENT_FAILURE_CHECK_PERIOD:
                return getClientFailureCheckPeriod();
            case HornetQPackage.CONFIG_TYPE__COMPRESS_LARGE_MESSAGES:
                return isCompressLargeMessages();
            case HornetQPackage.CONFIG_TYPE__CONNECTION_LOAD_BALANCING_POLICY_CLASS_NAME:
                return getConnectionLoadBalancingPolicyClassName();
            case HornetQPackage.CONFIG_TYPE__CONNECTION_TTL:
                return getConnectionTTL();
            case HornetQPackage.CONFIG_TYPE__CONFIRMATION_WINDOW_SIZE:
                return getConfirmationWindowSize();
            case HornetQPackage.CONFIG_TYPE__CONNECTOR:
                return getConnector();
            case HornetQPackage.CONFIG_TYPE__CONSUMER_MAX_RATE:
                return getConsumerMaxRate();
            case HornetQPackage.CONFIG_TYPE__CONSUMER_WINDOW_SIZE:
                return getConsumerWindowSize();
            case HornetQPackage.CONFIG_TYPE__DISABLE_FINALIZE_CHECK:
                return isDisableFinalizeCheck();
            case HornetQPackage.CONFIG_TYPE__DISCOVERY_GROUP:
                return getDiscoveryGroup();
            case HornetQPackage.CONFIG_TYPE__FAILOVER_ON_INITIAL_CONNECTION:
                return isFailoverOnInitialConnection();
            case HornetQPackage.CONFIG_TYPE__GROUP_ID:
                return getGroupID();
            case HornetQPackage.CONFIG_TYPE__INITIAL_MESSAGE_PACKET_SIZE:
                return getInitialMessagePacketSize();
            case HornetQPackage.CONFIG_TYPE__INITIAL_RECONNECT_ATTEMPTS:
                return getInitialReconnectAttempts();
            case HornetQPackage.CONFIG_TYPE__MAX_RETRY_INTERVAL:
                return getMaxRetryInterval();
            case HornetQPackage.CONFIG_TYPE__MIN_LARGE_MESSAGE_SIZE:
                return getMinLargeMessageSize();
            case HornetQPackage.CONFIG_TYPE__PRE_ACKNOWLEDGE:
                return isPreAcknowledge();
            case HornetQPackage.CONFIG_TYPE__PRODUCER_MAX_RATE:
                return getProducerMaxRate();
            case HornetQPackage.CONFIG_TYPE__PRODUCER_WINDOW_SIZE:
                return getProducerWindowSize();
            case HornetQPackage.CONFIG_TYPE__QUEUE:
                return getQueue();
            case HornetQPackage.CONFIG_TYPE__RECONNECT_ATTEMPTS:
                return getReconnectAttempts();
            case HornetQPackage.CONFIG_TYPE__RETRY_INTERVAL:
                return getRetryInterval();
            case HornetQPackage.CONFIG_TYPE__RETRY_INTERVAL_MULTIPLIER:
                return getRetryIntervalMultiplier();
            case HornetQPackage.CONFIG_TYPE__SCHEDULED_THREAD_POOL_MAX_SIZE:
                return getScheduledThreadPoolMaxSize();
            case HornetQPackage.CONFIG_TYPE__THREAD_POOL_MAX_SIZE:
                return getThreadPoolMaxSize();
            case HornetQPackage.CONFIG_TYPE__USE_GLOBAL_POOLS:
                return isUseGlobalPools();
            case HornetQPackage.CONFIG_TYPE__USE_HA:
                return isUseHA();
            case HornetQPackage.CONFIG_TYPE__XA_SESSION:
                return isXaSession();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case HornetQPackage.CONFIG_TYPE__ACK_BATCH_SIZE:
                setAckBatchSize((Long)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__AUTO_GROUP:
                setAutoGroup((Boolean)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__BLOCK_ON_ACKNOWLEDGE:
                setBlockOnAcknowledge((Boolean)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__BLOCK_ON_DURABLE_SEND:
                setBlockOnDurableSend((Boolean)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__BLOCK_ON_NON_DURABLE_SEND:
                setBlockOnNonDurableSend((Boolean)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__CACHE_LARGE_MESSAGES_ON_CONSUMER:
                setCacheLargeMessagesOnConsumer((Boolean)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__CALL_TIMEOUT:
                setCallTimeout((Long)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__CLIENT_FAILURE_CHECK_PERIOD:
                setClientFailureCheckPeriod((Long)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__COMPRESS_LARGE_MESSAGES:
                setCompressLargeMessages((Boolean)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__CONNECTION_LOAD_BALANCING_POLICY_CLASS_NAME:
                setConnectionLoadBalancingPolicyClassName((String)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__CONNECTION_TTL:
                setConnectionTTL((Long)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__CONFIRMATION_WINDOW_SIZE:
                setConfirmationWindowSize((Integer)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__CONNECTOR:
                setConnector((ConnectorType)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__CONSUMER_MAX_RATE:
                setConsumerMaxRate((Integer)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__CONSUMER_WINDOW_SIZE:
                setConsumerWindowSize((Integer)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__DISABLE_FINALIZE_CHECK:
                setDisableFinalizeCheck((Boolean)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__DISCOVERY_GROUP:
                setDiscoveryGroup((DiscoveryGroupType)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__FAILOVER_ON_INITIAL_CONNECTION:
                setFailoverOnInitialConnection((Boolean)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__GROUP_ID:
                setGroupID((String)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__INITIAL_MESSAGE_PACKET_SIZE:
                setInitialMessagePacketSize((Integer)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__INITIAL_RECONNECT_ATTEMPTS:
                setInitialReconnectAttempts((Integer)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__MAX_RETRY_INTERVAL:
                setMaxRetryInterval((Long)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__MIN_LARGE_MESSAGE_SIZE:
                setMinLargeMessageSize((Long)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__PRE_ACKNOWLEDGE:
                setPreAcknowledge((Boolean)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__PRODUCER_MAX_RATE:
                setProducerMaxRate((Integer)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__PRODUCER_WINDOW_SIZE:
                setProducerWindowSize((Integer)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__QUEUE:
                setQueue((String)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__RECONNECT_ATTEMPTS:
                setReconnectAttempts((Integer)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__RETRY_INTERVAL:
                setRetryInterval((Long)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__RETRY_INTERVAL_MULTIPLIER:
                setRetryIntervalMultiplier((Float)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__SCHEDULED_THREAD_POOL_MAX_SIZE:
                setScheduledThreadPoolMaxSize((Integer)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__THREAD_POOL_MAX_SIZE:
                setThreadPoolMaxSize((Integer)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__USE_GLOBAL_POOLS:
                setUseGlobalPools((Boolean)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__USE_HA:
                setUseHA((Boolean)newValue);
                return;
            case HornetQPackage.CONFIG_TYPE__XA_SESSION:
                setXaSession((Boolean)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case HornetQPackage.CONFIG_TYPE__ACK_BATCH_SIZE:
                unsetAckBatchSize();
                return;
            case HornetQPackage.CONFIG_TYPE__AUTO_GROUP:
                unsetAutoGroup();
                return;
            case HornetQPackage.CONFIG_TYPE__BLOCK_ON_ACKNOWLEDGE:
                unsetBlockOnAcknowledge();
                return;
            case HornetQPackage.CONFIG_TYPE__BLOCK_ON_DURABLE_SEND:
                unsetBlockOnDurableSend();
                return;
            case HornetQPackage.CONFIG_TYPE__BLOCK_ON_NON_DURABLE_SEND:
                unsetBlockOnNonDurableSend();
                return;
            case HornetQPackage.CONFIG_TYPE__CACHE_LARGE_MESSAGES_ON_CONSUMER:
                unsetCacheLargeMessagesOnConsumer();
                return;
            case HornetQPackage.CONFIG_TYPE__CALL_TIMEOUT:
                unsetCallTimeout();
                return;
            case HornetQPackage.CONFIG_TYPE__CLIENT_FAILURE_CHECK_PERIOD:
                unsetClientFailureCheckPeriod();
                return;
            case HornetQPackage.CONFIG_TYPE__COMPRESS_LARGE_MESSAGES:
                unsetCompressLargeMessages();
                return;
            case HornetQPackage.CONFIG_TYPE__CONNECTION_LOAD_BALANCING_POLICY_CLASS_NAME:
                setConnectionLoadBalancingPolicyClassName(CONNECTION_LOAD_BALANCING_POLICY_CLASS_NAME_EDEFAULT);
                return;
            case HornetQPackage.CONFIG_TYPE__CONNECTION_TTL:
                unsetConnectionTTL();
                return;
            case HornetQPackage.CONFIG_TYPE__CONFIRMATION_WINDOW_SIZE:
                unsetConfirmationWindowSize();
                return;
            case HornetQPackage.CONFIG_TYPE__CONNECTOR:
                setConnector((ConnectorType)null);
                return;
            case HornetQPackage.CONFIG_TYPE__CONSUMER_MAX_RATE:
                unsetConsumerMaxRate();
                return;
            case HornetQPackage.CONFIG_TYPE__CONSUMER_WINDOW_SIZE:
                unsetConsumerWindowSize();
                return;
            case HornetQPackage.CONFIG_TYPE__DISABLE_FINALIZE_CHECK:
                unsetDisableFinalizeCheck();
                return;
            case HornetQPackage.CONFIG_TYPE__DISCOVERY_GROUP:
                setDiscoveryGroup((DiscoveryGroupType)null);
                return;
            case HornetQPackage.CONFIG_TYPE__FAILOVER_ON_INITIAL_CONNECTION:
                unsetFailoverOnInitialConnection();
                return;
            case HornetQPackage.CONFIG_TYPE__GROUP_ID:
                setGroupID(GROUP_ID_EDEFAULT);
                return;
            case HornetQPackage.CONFIG_TYPE__INITIAL_MESSAGE_PACKET_SIZE:
                unsetInitialMessagePacketSize();
                return;
            case HornetQPackage.CONFIG_TYPE__INITIAL_RECONNECT_ATTEMPTS:
                unsetInitialReconnectAttempts();
                return;
            case HornetQPackage.CONFIG_TYPE__MAX_RETRY_INTERVAL:
                unsetMaxRetryInterval();
                return;
            case HornetQPackage.CONFIG_TYPE__MIN_LARGE_MESSAGE_SIZE:
                unsetMinLargeMessageSize();
                return;
            case HornetQPackage.CONFIG_TYPE__PRE_ACKNOWLEDGE:
                unsetPreAcknowledge();
                return;
            case HornetQPackage.CONFIG_TYPE__PRODUCER_MAX_RATE:
                unsetProducerMaxRate();
                return;
            case HornetQPackage.CONFIG_TYPE__PRODUCER_WINDOW_SIZE:
                unsetProducerWindowSize();
                return;
            case HornetQPackage.CONFIG_TYPE__QUEUE:
                setQueue(QUEUE_EDEFAULT);
                return;
            case HornetQPackage.CONFIG_TYPE__RECONNECT_ATTEMPTS:
                unsetReconnectAttempts();
                return;
            case HornetQPackage.CONFIG_TYPE__RETRY_INTERVAL:
                unsetRetryInterval();
                return;
            case HornetQPackage.CONFIG_TYPE__RETRY_INTERVAL_MULTIPLIER:
                unsetRetryIntervalMultiplier();
                return;
            case HornetQPackage.CONFIG_TYPE__SCHEDULED_THREAD_POOL_MAX_SIZE:
                unsetScheduledThreadPoolMaxSize();
                return;
            case HornetQPackage.CONFIG_TYPE__THREAD_POOL_MAX_SIZE:
                unsetThreadPoolMaxSize();
                return;
            case HornetQPackage.CONFIG_TYPE__USE_GLOBAL_POOLS:
                unsetUseGlobalPools();
                return;
            case HornetQPackage.CONFIG_TYPE__USE_HA:
                unsetUseHA();
                return;
            case HornetQPackage.CONFIG_TYPE__XA_SESSION:
                unsetXaSession();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case HornetQPackage.CONFIG_TYPE__ACK_BATCH_SIZE:
                return isSetAckBatchSize();
            case HornetQPackage.CONFIG_TYPE__AUTO_GROUP:
                return isSetAutoGroup();
            case HornetQPackage.CONFIG_TYPE__BLOCK_ON_ACKNOWLEDGE:
                return isSetBlockOnAcknowledge();
            case HornetQPackage.CONFIG_TYPE__BLOCK_ON_DURABLE_SEND:
                return isSetBlockOnDurableSend();
            case HornetQPackage.CONFIG_TYPE__BLOCK_ON_NON_DURABLE_SEND:
                return isSetBlockOnNonDurableSend();
            case HornetQPackage.CONFIG_TYPE__CACHE_LARGE_MESSAGES_ON_CONSUMER:
                return isSetCacheLargeMessagesOnConsumer();
            case HornetQPackage.CONFIG_TYPE__CALL_TIMEOUT:
                return isSetCallTimeout();
            case HornetQPackage.CONFIG_TYPE__CLIENT_FAILURE_CHECK_PERIOD:
                return isSetClientFailureCheckPeriod();
            case HornetQPackage.CONFIG_TYPE__COMPRESS_LARGE_MESSAGES:
                return isSetCompressLargeMessages();
            case HornetQPackage.CONFIG_TYPE__CONNECTION_LOAD_BALANCING_POLICY_CLASS_NAME:
                return CONNECTION_LOAD_BALANCING_POLICY_CLASS_NAME_EDEFAULT == null ? connectionLoadBalancingPolicyClassName != null : !CONNECTION_LOAD_BALANCING_POLICY_CLASS_NAME_EDEFAULT.equals(connectionLoadBalancingPolicyClassName);
            case HornetQPackage.CONFIG_TYPE__CONNECTION_TTL:
                return isSetConnectionTTL();
            case HornetQPackage.CONFIG_TYPE__CONFIRMATION_WINDOW_SIZE:
                return isSetConfirmationWindowSize();
            case HornetQPackage.CONFIG_TYPE__CONNECTOR:
                return connector != null;
            case HornetQPackage.CONFIG_TYPE__CONSUMER_MAX_RATE:
                return isSetConsumerMaxRate();
            case HornetQPackage.CONFIG_TYPE__CONSUMER_WINDOW_SIZE:
                return isSetConsumerWindowSize();
            case HornetQPackage.CONFIG_TYPE__DISABLE_FINALIZE_CHECK:
                return isSetDisableFinalizeCheck();
            case HornetQPackage.CONFIG_TYPE__DISCOVERY_GROUP:
                return discoveryGroup != null;
            case HornetQPackage.CONFIG_TYPE__FAILOVER_ON_INITIAL_CONNECTION:
                return isSetFailoverOnInitialConnection();
            case HornetQPackage.CONFIG_TYPE__GROUP_ID:
                return GROUP_ID_EDEFAULT == null ? groupID != null : !GROUP_ID_EDEFAULT.equals(groupID);
            case HornetQPackage.CONFIG_TYPE__INITIAL_MESSAGE_PACKET_SIZE:
                return isSetInitialMessagePacketSize();
            case HornetQPackage.CONFIG_TYPE__INITIAL_RECONNECT_ATTEMPTS:
                return isSetInitialReconnectAttempts();
            case HornetQPackage.CONFIG_TYPE__MAX_RETRY_INTERVAL:
                return isSetMaxRetryInterval();
            case HornetQPackage.CONFIG_TYPE__MIN_LARGE_MESSAGE_SIZE:
                return isSetMinLargeMessageSize();
            case HornetQPackage.CONFIG_TYPE__PRE_ACKNOWLEDGE:
                return isSetPreAcknowledge();
            case HornetQPackage.CONFIG_TYPE__PRODUCER_MAX_RATE:
                return isSetProducerMaxRate();
            case HornetQPackage.CONFIG_TYPE__PRODUCER_WINDOW_SIZE:
                return isSetProducerWindowSize();
            case HornetQPackage.CONFIG_TYPE__QUEUE:
                return QUEUE_EDEFAULT == null ? queue != null : !QUEUE_EDEFAULT.equals(queue);
            case HornetQPackage.CONFIG_TYPE__RECONNECT_ATTEMPTS:
                return isSetReconnectAttempts();
            case HornetQPackage.CONFIG_TYPE__RETRY_INTERVAL:
                return isSetRetryInterval();
            case HornetQPackage.CONFIG_TYPE__RETRY_INTERVAL_MULTIPLIER:
                return isSetRetryIntervalMultiplier();
            case HornetQPackage.CONFIG_TYPE__SCHEDULED_THREAD_POOL_MAX_SIZE:
                return isSetScheduledThreadPoolMaxSize();
            case HornetQPackage.CONFIG_TYPE__THREAD_POOL_MAX_SIZE:
                return isSetThreadPoolMaxSize();
            case HornetQPackage.CONFIG_TYPE__USE_GLOBAL_POOLS:
                return isSetUseGlobalPools();
            case HornetQPackage.CONFIG_TYPE__USE_HA:
                return isSetUseHA();
            case HornetQPackage.CONFIG_TYPE__XA_SESSION:
                return isSetXaSession();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (ackBatchSize: ");
        if (ackBatchSizeESet) result.append(ackBatchSize); else result.append("<unset>");
        result.append(", autoGroup: ");
        if (autoGroupESet) result.append(autoGroup); else result.append("<unset>");
        result.append(", blockOnAcknowledge: ");
        if (blockOnAcknowledgeESet) result.append(blockOnAcknowledge); else result.append("<unset>");
        result.append(", blockOnDurableSend: ");
        if (blockOnDurableSendESet) result.append(blockOnDurableSend); else result.append("<unset>");
        result.append(", blockOnNonDurableSend: ");
        if (blockOnNonDurableSendESet) result.append(blockOnNonDurableSend); else result.append("<unset>");
        result.append(", cacheLargeMessagesOnConsumer: ");
        if (cacheLargeMessagesOnConsumerESet) result.append(cacheLargeMessagesOnConsumer); else result.append("<unset>");
        result.append(", callTimeout: ");
        if (callTimeoutESet) result.append(callTimeout); else result.append("<unset>");
        result.append(", clientFailureCheckPeriod: ");
        if (clientFailureCheckPeriodESet) result.append(clientFailureCheckPeriod); else result.append("<unset>");
        result.append(", compressLargeMessages: ");
        if (compressLargeMessagesESet) result.append(compressLargeMessages); else result.append("<unset>");
        result.append(", connectionLoadBalancingPolicyClassName: ");
        result.append(connectionLoadBalancingPolicyClassName);
        result.append(", connectionTTL: ");
        if (connectionTTLESet) result.append(connectionTTL); else result.append("<unset>");
        result.append(", confirmationWindowSize: ");
        if (confirmationWindowSizeESet) result.append(confirmationWindowSize); else result.append("<unset>");
        result.append(", consumerMaxRate: ");
        if (consumerMaxRateESet) result.append(consumerMaxRate); else result.append("<unset>");
        result.append(", consumerWindowSize: ");
        if (consumerWindowSizeESet) result.append(consumerWindowSize); else result.append("<unset>");
        result.append(", disableFinalizeCheck: ");
        if (disableFinalizeCheckESet) result.append(disableFinalizeCheck); else result.append("<unset>");
        result.append(", failoverOnInitialConnection: ");
        if (failoverOnInitialConnectionESet) result.append(failoverOnInitialConnection); else result.append("<unset>");
        result.append(", groupID: ");
        result.append(groupID);
        result.append(", initialMessagePacketSize: ");
        if (initialMessagePacketSizeESet) result.append(initialMessagePacketSize); else result.append("<unset>");
        result.append(", initialReconnectAttempts: ");
        if (initialReconnectAttemptsESet) result.append(initialReconnectAttempts); else result.append("<unset>");
        result.append(", maxRetryInterval: ");
        if (maxRetryIntervalESet) result.append(maxRetryInterval); else result.append("<unset>");
        result.append(", minLargeMessageSize: ");
        if (minLargeMessageSizeESet) result.append(minLargeMessageSize); else result.append("<unset>");
        result.append(", preAcknowledge: ");
        if (preAcknowledgeESet) result.append(preAcknowledge); else result.append("<unset>");
        result.append(", producerMaxRate: ");
        if (producerMaxRateESet) result.append(producerMaxRate); else result.append("<unset>");
        result.append(", producerWindowSize: ");
        if (producerWindowSizeESet) result.append(producerWindowSize); else result.append("<unset>");
        result.append(", queue: ");
        result.append(queue);
        result.append(", reconnectAttempts: ");
        if (reconnectAttemptsESet) result.append(reconnectAttempts); else result.append("<unset>");
        result.append(", retryInterval: ");
        if (retryIntervalESet) result.append(retryInterval); else result.append("<unset>");
        result.append(", retryIntervalMultiplier: ");
        if (retryIntervalMultiplierESet) result.append(retryIntervalMultiplier); else result.append("<unset>");
        result.append(", scheduledThreadPoolMaxSize: ");
        if (scheduledThreadPoolMaxSizeESet) result.append(scheduledThreadPoolMaxSize); else result.append("<unset>");
        result.append(", threadPoolMaxSize: ");
        if (threadPoolMaxSizeESet) result.append(threadPoolMaxSize); else result.append("<unset>");
        result.append(", useGlobalPools: ");
        if (useGlobalPoolsESet) result.append(useGlobalPools); else result.append("<unset>");
        result.append(", useHA: ");
        if (useHAESet) result.append(useHA); else result.append("<unset>");
        result.append(", xaSession: ");
        if (xaSessionESet) result.append(xaSession); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ConfigTypeImpl
