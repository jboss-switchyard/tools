/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.jms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.jms.CamelJmsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.jms.JmsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Jms Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getQueue <em>Queue</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getConnectionFactory <em>Connection Factory</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getClientId <em>Client Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getDurableSubscriptionName <em>Durable Subscription Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getConcurrentConsumers <em>Concurrent Consumers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getMaxConcurrentConsumers <em>Max Concurrent Consumers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getDisableReplyTo <em>Disable Reply To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getPreserveMessageQos <em>Preserve Message Qos</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getDeliveryPersistent <em>Delivery Persistent</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getExplicitQosEnabled <em>Explicit Qos Enabled</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getReplyTo <em>Reply To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getReplyToType <em>Reply To Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getRequestTimeout <em>Request Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getTimeToLive <em>Time To Live</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.jms.impl.CamelJmsBindingTypeImpl#getTransactionManager <em>Transaction Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelJmsBindingTypeImpl extends BaseCamelBindingImpl implements CamelJmsBindingType {
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
     * The default value of the '{@link #getTopic() <em>Topic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTopic()
     * @generated
     * @ordered
     */
    protected static final String TOPIC_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getTopic() <em>Topic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTopic()
     * @generated
     * @ordered
     */
    protected String topic = TOPIC_EDEFAULT;
    /**
     * The default value of the '{@link #getConnectionFactory() <em>Connection Factory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionFactory()
     * @generated
     * @ordered
     */
    protected static final String CONNECTION_FACTORY_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getConnectionFactory() <em>Connection Factory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionFactory()
     * @generated
     * @ordered
     */
    protected String connectionFactory = CONNECTION_FACTORY_EDEFAULT;
    /**
     * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsername()
     * @generated
     * @ordered
     */
    protected static final String USERNAME_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsername()
     * @generated
     * @ordered
     */
    protected String username = USERNAME_EDEFAULT;
    /**
     * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected static final String PASSWORD_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected String password = PASSWORD_EDEFAULT;
    /**
     * The default value of the '{@link #getClientId() <em>Client Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClientId()
     * @generated
     * @ordered
     */
    protected static final String CLIENT_ID_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getClientId() <em>Client Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClientId()
     * @generated
     * @ordered
     */
    protected String clientId = CLIENT_ID_EDEFAULT;
    /**
     * The default value of the '{@link #getDurableSubscriptionName() <em>Durable Subscription Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDurableSubscriptionName()
     * @generated
     * @ordered
     */
    protected static final String DURABLE_SUBSCRIPTION_NAME_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getDurableSubscriptionName() <em>Durable Subscription Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDurableSubscriptionName()
     * @generated
     * @ordered
     */
    protected String durableSubscriptionName = DURABLE_SUBSCRIPTION_NAME_EDEFAULT;
    /**
     * The default value of the '{@link #getConcurrentConsumers() <em>Concurrent Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConcurrentConsumers()
     * @generated
     * @ordered
     */
    protected static final Integer CONCURRENT_CONSUMERS_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getConcurrentConsumers() <em>Concurrent Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConcurrentConsumers()
     * @generated
     * @ordered
     */
    protected Integer concurrentConsumers = CONCURRENT_CONSUMERS_EDEFAULT;
    /**
     * This is true if the Concurrent Consumers attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean concurrentConsumersESet;
    /**
     * The default value of the '{@link #getMaxConcurrentConsumers() <em>Max Concurrent Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxConcurrentConsumers()
     * @generated
     * @ordered
     */
    protected static final Integer MAX_CONCURRENT_CONSUMERS_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getMaxConcurrentConsumers() <em>Max Concurrent Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxConcurrentConsumers()
     * @generated
     * @ordered
     */
    protected Integer maxConcurrentConsumers = MAX_CONCURRENT_CONSUMERS_EDEFAULT;
    /**
     * This is true if the Max Concurrent Consumers attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxConcurrentConsumersESet;
    /**
     * The default value of the '{@link #getDisableReplyTo() <em>Disable Reply To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisableReplyTo()
     * @generated
     * @ordered
     */
    protected static final Boolean DISABLE_REPLY_TO_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getDisableReplyTo() <em>Disable Reply To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisableReplyTo()
     * @generated
     * @ordered
     */
    protected Boolean disableReplyTo = DISABLE_REPLY_TO_EDEFAULT;
    /**
     * This is true if the Disable Reply To attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean disableReplyToESet;
    /**
     * The default value of the '{@link #getPreserveMessageQos() <em>Preserve Message Qos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreserveMessageQos()
     * @generated
     * @ordered
     */
    protected static final Boolean PRESERVE_MESSAGE_QOS_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getPreserveMessageQos() <em>Preserve Message Qos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreserveMessageQos()
     * @generated
     * @ordered
     */
    protected Boolean preserveMessageQos = PRESERVE_MESSAGE_QOS_EDEFAULT;
    /**
     * This is true if the Preserve Message Qos attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean preserveMessageQosESet;
    /**
     * The default value of the '{@link #getDeliveryPersistent() <em>Delivery Persistent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeliveryPersistent()
     * @generated
     * @ordered
     */
    protected static final Boolean DELIVERY_PERSISTENT_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getDeliveryPersistent() <em>Delivery Persistent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeliveryPersistent()
     * @generated
     * @ordered
     */
    protected Boolean deliveryPersistent = DELIVERY_PERSISTENT_EDEFAULT;
    /**
     * This is true if the Delivery Persistent attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean deliveryPersistentESet;
    /**
     * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected static final Integer PRIORITY_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected Integer priority = PRIORITY_EDEFAULT;
    /**
     * This is true if the Priority attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean priorityESet;
    /**
     * The default value of the '{@link #getExplicitQosEnabled() <em>Explicit Qos Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExplicitQosEnabled()
     * @generated
     * @ordered
     */
    protected static final Boolean EXPLICIT_QOS_ENABLED_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getExplicitQosEnabled() <em>Explicit Qos Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExplicitQosEnabled()
     * @generated
     * @ordered
     */
    protected Boolean explicitQosEnabled = EXPLICIT_QOS_ENABLED_EDEFAULT;
    /**
     * This is true if the Explicit Qos Enabled attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean explicitQosEnabledESet;
    /**
     * The default value of the '{@link #getReplyTo() <em>Reply To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReplyTo()
     * @generated
     * @ordered
     */
    protected static final String REPLY_TO_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getReplyTo() <em>Reply To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReplyTo()
     * @generated
     * @ordered
     */
    protected String replyTo = REPLY_TO_EDEFAULT;
    /**
     * The default value of the '{@link #getReplyToType() <em>Reply To Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReplyToType()
     * @generated
     * @ordered
     */
    protected static final String REPLY_TO_TYPE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getReplyToType() <em>Reply To Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReplyToType()
     * @generated
     * @ordered
     */
    protected String replyToType = REPLY_TO_TYPE_EDEFAULT;
    /**
     * The default value of the '{@link #getRequestTimeout() <em>Request Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequestTimeout()
     * @generated
     * @ordered
     */
    protected static final Integer REQUEST_TIMEOUT_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getRequestTimeout() <em>Request Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequestTimeout()
     * @generated
     * @ordered
     */
    protected Integer requestTimeout = REQUEST_TIMEOUT_EDEFAULT;
    /**
     * This is true if the Request Timeout attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean requestTimeoutESet;
    /**
     * The default value of the '{@link #getSelector() <em>Selector</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelector()
     * @generated
     * @ordered
     */
    protected static final String SELECTOR_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getSelector() <em>Selector</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelector()
     * @generated
     * @ordered
     */
    protected String selector = SELECTOR_EDEFAULT;
    /**
     * The default value of the '{@link #getTimeToLive() <em>Time To Live</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeToLive()
     * @generated
     * @ordered
     */
    protected static final Integer TIME_TO_LIVE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getTimeToLive() <em>Time To Live</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeToLive()
     * @generated
     * @ordered
     */
    protected Integer timeToLive = TIME_TO_LIVE_EDEFAULT;
    /**
     * This is true if the Time To Live attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeToLiveESet;
    /**
     * The default value of the '{@link #getTransacted() <em>Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransacted()
     * @generated
     * @ordered
     */
    protected static final Boolean TRANSACTED_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getTransacted() <em>Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransacted()
     * @generated
     * @ordered
     */
    protected Boolean transacted = TRANSACTED_EDEFAULT;
    /**
     * This is true if the Transacted attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transactedESet;
    /**
     * The default value of the '{@link #getTransactionManager() <em>Transaction Manager</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransactionManager()
     * @generated
     * @ordered
     */
    protected static final String TRANSACTION_MANAGER_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getTransactionManager() <em>Transaction Manager</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransactionManager()
     * @generated
     * @ordered
     */
    protected String transactionManager = TRANSACTION_MANAGER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelJmsBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__QUEUE, oldQueue, queue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTopic() {
        return topic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTopic(String newTopic) {
        String oldTopic = topic;
        topic = newTopic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__TOPIC, oldTopic, topic));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getConnectionFactory() {
        return connectionFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnectionFactory(String newConnectionFactory) {
        String oldConnectionFactory = connectionFactory;
        connectionFactory = newConnectionFactory;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__CONNECTION_FACTORY, oldConnectionFactory, connectionFactory));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUsername(String newUsername) {
        String oldUsername = username;
        username = newUsername;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__USERNAME, oldUsername, username));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPassword(String newPassword) {
        String oldPassword = password;
        password = newPassword;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__PASSWORD, oldPassword, password));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setClientId(String newClientId) {
        String oldClientId = clientId;
        clientId = newClientId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__CLIENT_ID, oldClientId, clientId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDurableSubscriptionName() {
        return durableSubscriptionName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDurableSubscriptionName(String newDurableSubscriptionName) {
        String oldDurableSubscriptionName = durableSubscriptionName;
        durableSubscriptionName = newDurableSubscriptionName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__DURABLE_SUBSCRIPTION_NAME, oldDurableSubscriptionName, durableSubscriptionName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getConcurrentConsumers() {
        return concurrentConsumers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConcurrentConsumers(Integer newConcurrentConsumers) {
        Integer oldConcurrentConsumers = concurrentConsumers;
        concurrentConsumers = newConcurrentConsumers;
        boolean oldConcurrentConsumersESet = concurrentConsumersESet;
        concurrentConsumersESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__CONCURRENT_CONSUMERS, oldConcurrentConsumers, concurrentConsumers, !oldConcurrentConsumersESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetConcurrentConsumers() {
        Integer oldConcurrentConsumers = concurrentConsumers;
        boolean oldConcurrentConsumersESet = concurrentConsumersESet;
        concurrentConsumers = CONCURRENT_CONSUMERS_EDEFAULT;
        concurrentConsumersESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, JmsPackage.CAMEL_JMS_BINDING_TYPE__CONCURRENT_CONSUMERS, oldConcurrentConsumers, CONCURRENT_CONSUMERS_EDEFAULT, oldConcurrentConsumersESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetConcurrentConsumers() {
        return concurrentConsumersESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getMaxConcurrentConsumers() {
        return maxConcurrentConsumers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxConcurrentConsumers(Integer newMaxConcurrentConsumers) {
        Integer oldMaxConcurrentConsumers = maxConcurrentConsumers;
        maxConcurrentConsumers = newMaxConcurrentConsumers;
        boolean oldMaxConcurrentConsumersESet = maxConcurrentConsumersESet;
        maxConcurrentConsumersESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS, oldMaxConcurrentConsumers, maxConcurrentConsumers, !oldMaxConcurrentConsumersESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMaxConcurrentConsumers() {
        Integer oldMaxConcurrentConsumers = maxConcurrentConsumers;
        boolean oldMaxConcurrentConsumersESet = maxConcurrentConsumersESet;
        maxConcurrentConsumers = MAX_CONCURRENT_CONSUMERS_EDEFAULT;
        maxConcurrentConsumersESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, JmsPackage.CAMEL_JMS_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS, oldMaxConcurrentConsumers, MAX_CONCURRENT_CONSUMERS_EDEFAULT, oldMaxConcurrentConsumersESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMaxConcurrentConsumers() {
        return maxConcurrentConsumersESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getDisableReplyTo() {
        return disableReplyTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDisableReplyTo(Boolean newDisableReplyTo) {
        Boolean oldDisableReplyTo = disableReplyTo;
        disableReplyTo = newDisableReplyTo;
        boolean oldDisableReplyToESet = disableReplyToESet;
        disableReplyToESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__DISABLE_REPLY_TO, oldDisableReplyTo, disableReplyTo, !oldDisableReplyToESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDisableReplyTo() {
        Boolean oldDisableReplyTo = disableReplyTo;
        boolean oldDisableReplyToESet = disableReplyToESet;
        disableReplyTo = DISABLE_REPLY_TO_EDEFAULT;
        disableReplyToESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, JmsPackage.CAMEL_JMS_BINDING_TYPE__DISABLE_REPLY_TO, oldDisableReplyTo, DISABLE_REPLY_TO_EDEFAULT, oldDisableReplyToESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDisableReplyTo() {
        return disableReplyToESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getPreserveMessageQos() {
        return preserveMessageQos;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPreserveMessageQos(Boolean newPreserveMessageQos) {
        Boolean oldPreserveMessageQos = preserveMessageQos;
        preserveMessageQos = newPreserveMessageQos;
        boolean oldPreserveMessageQosESet = preserveMessageQosESet;
        preserveMessageQosESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__PRESERVE_MESSAGE_QOS, oldPreserveMessageQos, preserveMessageQos, !oldPreserveMessageQosESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPreserveMessageQos() {
        Boolean oldPreserveMessageQos = preserveMessageQos;
        boolean oldPreserveMessageQosESet = preserveMessageQosESet;
        preserveMessageQos = PRESERVE_MESSAGE_QOS_EDEFAULT;
        preserveMessageQosESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, JmsPackage.CAMEL_JMS_BINDING_TYPE__PRESERVE_MESSAGE_QOS, oldPreserveMessageQos, PRESERVE_MESSAGE_QOS_EDEFAULT, oldPreserveMessageQosESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPreserveMessageQos() {
        return preserveMessageQosESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getDeliveryPersistent() {
        return deliveryPersistent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDeliveryPersistent(Boolean newDeliveryPersistent) {
        Boolean oldDeliveryPersistent = deliveryPersistent;
        deliveryPersistent = newDeliveryPersistent;
        boolean oldDeliveryPersistentESet = deliveryPersistentESet;
        deliveryPersistentESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__DELIVERY_PERSISTENT, oldDeliveryPersistent, deliveryPersistent, !oldDeliveryPersistentESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDeliveryPersistent() {
        Boolean oldDeliveryPersistent = deliveryPersistent;
        boolean oldDeliveryPersistentESet = deliveryPersistentESet;
        deliveryPersistent = DELIVERY_PERSISTENT_EDEFAULT;
        deliveryPersistentESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, JmsPackage.CAMEL_JMS_BINDING_TYPE__DELIVERY_PERSISTENT, oldDeliveryPersistent, DELIVERY_PERSISTENT_EDEFAULT, oldDeliveryPersistentESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDeliveryPersistent() {
        return deliveryPersistentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPriority(Integer newPriority) {
        Integer oldPriority = priority;
        priority = newPriority;
        boolean oldPriorityESet = priorityESet;
        priorityESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__PRIORITY, oldPriority, priority, !oldPriorityESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPriority() {
        Integer oldPriority = priority;
        boolean oldPriorityESet = priorityESet;
        priority = PRIORITY_EDEFAULT;
        priorityESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, JmsPackage.CAMEL_JMS_BINDING_TYPE__PRIORITY, oldPriority, PRIORITY_EDEFAULT, oldPriorityESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPriority() {
        return priorityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getExplicitQosEnabled() {
        return explicitQosEnabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExplicitQosEnabled(Boolean newExplicitQosEnabled) {
        Boolean oldExplicitQosEnabled = explicitQosEnabled;
        explicitQosEnabled = newExplicitQosEnabled;
        boolean oldExplicitQosEnabledESet = explicitQosEnabledESet;
        explicitQosEnabledESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__EXPLICIT_QOS_ENABLED, oldExplicitQosEnabled, explicitQosEnabled, !oldExplicitQosEnabledESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetExplicitQosEnabled() {
        Boolean oldExplicitQosEnabled = explicitQosEnabled;
        boolean oldExplicitQosEnabledESet = explicitQosEnabledESet;
        explicitQosEnabled = EXPLICIT_QOS_ENABLED_EDEFAULT;
        explicitQosEnabledESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, JmsPackage.CAMEL_JMS_BINDING_TYPE__EXPLICIT_QOS_ENABLED, oldExplicitQosEnabled, EXPLICIT_QOS_ENABLED_EDEFAULT, oldExplicitQosEnabledESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetExplicitQosEnabled() {
        return explicitQosEnabledESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReplyTo(String newReplyTo) {
        String oldReplyTo = replyTo;
        replyTo = newReplyTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__REPLY_TO, oldReplyTo, replyTo));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getReplyToType() {
        return replyToType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReplyToType(String newReplyToType) {
        String oldReplyToType = replyToType;
        replyToType = newReplyToType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__REPLY_TO_TYPE, oldReplyToType, replyToType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getRequestTimeout() {
        return requestTimeout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRequestTimeout(Integer newRequestTimeout) {
        Integer oldRequestTimeout = requestTimeout;
        requestTimeout = newRequestTimeout;
        boolean oldRequestTimeoutESet = requestTimeoutESet;
        requestTimeoutESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__REQUEST_TIMEOUT, oldRequestTimeout, requestTimeout, !oldRequestTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetRequestTimeout() {
        Integer oldRequestTimeout = requestTimeout;
        boolean oldRequestTimeoutESet = requestTimeoutESet;
        requestTimeout = REQUEST_TIMEOUT_EDEFAULT;
        requestTimeoutESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, JmsPackage.CAMEL_JMS_BINDING_TYPE__REQUEST_TIMEOUT, oldRequestTimeout, REQUEST_TIMEOUT_EDEFAULT, oldRequestTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetRequestTimeout() {
        return requestTimeoutESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSelector() {
        return selector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSelector(String newSelector) {
        String oldSelector = selector;
        selector = newSelector;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__SELECTOR, oldSelector, selector));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getTimeToLive() {
        return timeToLive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeToLive(Integer newTimeToLive) {
        Integer oldTimeToLive = timeToLive;
        timeToLive = newTimeToLive;
        boolean oldTimeToLiveESet = timeToLiveESet;
        timeToLiveESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__TIME_TO_LIVE, oldTimeToLive, timeToLive, !oldTimeToLiveESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTimeToLive() {
        Integer oldTimeToLive = timeToLive;
        boolean oldTimeToLiveESet = timeToLiveESet;
        timeToLive = TIME_TO_LIVE_EDEFAULT;
        timeToLiveESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, JmsPackage.CAMEL_JMS_BINDING_TYPE__TIME_TO_LIVE, oldTimeToLive, TIME_TO_LIVE_EDEFAULT, oldTimeToLiveESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTimeToLive() {
        return timeToLiveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getTransacted() {
        return transacted;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTransacted(Boolean newTransacted) {
        Boolean oldTransacted = transacted;
        transacted = newTransacted;
        boolean oldTransactedESet = transactedESet;
        transactedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__TRANSACTED, oldTransacted, transacted, !oldTransactedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTransacted() {
        Boolean oldTransacted = transacted;
        boolean oldTransactedESet = transactedESet;
        transacted = TRANSACTED_EDEFAULT;
        transactedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, JmsPackage.CAMEL_JMS_BINDING_TYPE__TRANSACTED, oldTransacted, TRANSACTED_EDEFAULT, oldTransactedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTransacted() {
        return transactedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTransactionManager() {
        return transactionManager;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTransactionManager(String newTransactionManager) {
        String oldTransactionManager = transactionManager;
        transactionManager = newTransactionManager;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JmsPackage.CAMEL_JMS_BINDING_TYPE__TRANSACTION_MANAGER, oldTransactionManager, transactionManager));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__QUEUE:
                return getQueue();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__TOPIC:
                return getTopic();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__CONNECTION_FACTORY:
                return getConnectionFactory();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__USERNAME:
                return getUsername();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__PASSWORD:
                return getPassword();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__CLIENT_ID:
                return getClientId();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__DURABLE_SUBSCRIPTION_NAME:
                return getDurableSubscriptionName();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__CONCURRENT_CONSUMERS:
                return getConcurrentConsumers();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS:
                return getMaxConcurrentConsumers();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__DISABLE_REPLY_TO:
                return getDisableReplyTo();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__PRESERVE_MESSAGE_QOS:
                return getPreserveMessageQos();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__DELIVERY_PERSISTENT:
                return getDeliveryPersistent();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__PRIORITY:
                return getPriority();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__EXPLICIT_QOS_ENABLED:
                return getExplicitQosEnabled();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__REPLY_TO:
                return getReplyTo();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__REPLY_TO_TYPE:
                return getReplyToType();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__REQUEST_TIMEOUT:
                return getRequestTimeout();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__SELECTOR:
                return getSelector();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__TIME_TO_LIVE:
                return getTimeToLive();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__TRANSACTED:
                return getTransacted();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__TRANSACTION_MANAGER:
                return getTransactionManager();
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
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__QUEUE:
                setQueue((String)newValue);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__TOPIC:
                setTopic((String)newValue);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__CONNECTION_FACTORY:
                setConnectionFactory((String)newValue);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__USERNAME:
                setUsername((String)newValue);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__PASSWORD:
                setPassword((String)newValue);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__CLIENT_ID:
                setClientId((String)newValue);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__DURABLE_SUBSCRIPTION_NAME:
                setDurableSubscriptionName((String)newValue);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__CONCURRENT_CONSUMERS:
                setConcurrentConsumers((Integer)newValue);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS:
                setMaxConcurrentConsumers((Integer)newValue);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__DISABLE_REPLY_TO:
                setDisableReplyTo((Boolean)newValue);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__PRESERVE_MESSAGE_QOS:
                setPreserveMessageQos((Boolean)newValue);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__DELIVERY_PERSISTENT:
                setDeliveryPersistent((Boolean)newValue);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__PRIORITY:
                setPriority((Integer)newValue);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__EXPLICIT_QOS_ENABLED:
                setExplicitQosEnabled((Boolean)newValue);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__REPLY_TO:
                setReplyTo((String)newValue);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__REPLY_TO_TYPE:
                setReplyToType((String)newValue);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__REQUEST_TIMEOUT:
                setRequestTimeout((Integer)newValue);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__SELECTOR:
                setSelector((String)newValue);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__TIME_TO_LIVE:
                setTimeToLive((Integer)newValue);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__TRANSACTED:
                setTransacted((Boolean)newValue);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__TRANSACTION_MANAGER:
                setTransactionManager((String)newValue);
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
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__QUEUE:
                setQueue(QUEUE_EDEFAULT);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__TOPIC:
                setTopic(TOPIC_EDEFAULT);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__CONNECTION_FACTORY:
                setConnectionFactory(CONNECTION_FACTORY_EDEFAULT);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__USERNAME:
                setUsername(USERNAME_EDEFAULT);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__PASSWORD:
                setPassword(PASSWORD_EDEFAULT);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__CLIENT_ID:
                setClientId(CLIENT_ID_EDEFAULT);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__DURABLE_SUBSCRIPTION_NAME:
                setDurableSubscriptionName(DURABLE_SUBSCRIPTION_NAME_EDEFAULT);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__CONCURRENT_CONSUMERS:
                unsetConcurrentConsumers();
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS:
                unsetMaxConcurrentConsumers();
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__DISABLE_REPLY_TO:
                unsetDisableReplyTo();
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__PRESERVE_MESSAGE_QOS:
                unsetPreserveMessageQos();
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__DELIVERY_PERSISTENT:
                unsetDeliveryPersistent();
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__PRIORITY:
                unsetPriority();
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__EXPLICIT_QOS_ENABLED:
                unsetExplicitQosEnabled();
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__REPLY_TO:
                setReplyTo(REPLY_TO_EDEFAULT);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__REPLY_TO_TYPE:
                setReplyToType(REPLY_TO_TYPE_EDEFAULT);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__REQUEST_TIMEOUT:
                unsetRequestTimeout();
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__SELECTOR:
                setSelector(SELECTOR_EDEFAULT);
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__TIME_TO_LIVE:
                unsetTimeToLive();
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__TRANSACTED:
                unsetTransacted();
                return;
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__TRANSACTION_MANAGER:
                setTransactionManager(TRANSACTION_MANAGER_EDEFAULT);
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
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__QUEUE:
                return QUEUE_EDEFAULT == null ? queue != null : !QUEUE_EDEFAULT.equals(queue);
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__TOPIC:
                return TOPIC_EDEFAULT == null ? topic != null : !TOPIC_EDEFAULT.equals(topic);
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__CONNECTION_FACTORY:
                return CONNECTION_FACTORY_EDEFAULT == null ? connectionFactory != null : !CONNECTION_FACTORY_EDEFAULT.equals(connectionFactory);
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__USERNAME:
                return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__PASSWORD:
                return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__CLIENT_ID:
                return CLIENT_ID_EDEFAULT == null ? clientId != null : !CLIENT_ID_EDEFAULT.equals(clientId);
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__DURABLE_SUBSCRIPTION_NAME:
                return DURABLE_SUBSCRIPTION_NAME_EDEFAULT == null ? durableSubscriptionName != null : !DURABLE_SUBSCRIPTION_NAME_EDEFAULT.equals(durableSubscriptionName);
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__CONCURRENT_CONSUMERS:
                return isSetConcurrentConsumers();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS:
                return isSetMaxConcurrentConsumers();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__DISABLE_REPLY_TO:
                return isSetDisableReplyTo();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__PRESERVE_MESSAGE_QOS:
                return isSetPreserveMessageQos();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__DELIVERY_PERSISTENT:
                return isSetDeliveryPersistent();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__PRIORITY:
                return isSetPriority();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__EXPLICIT_QOS_ENABLED:
                return isSetExplicitQosEnabled();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__REPLY_TO:
                return REPLY_TO_EDEFAULT == null ? replyTo != null : !REPLY_TO_EDEFAULT.equals(replyTo);
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__REPLY_TO_TYPE:
                return REPLY_TO_TYPE_EDEFAULT == null ? replyToType != null : !REPLY_TO_TYPE_EDEFAULT.equals(replyToType);
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__REQUEST_TIMEOUT:
                return isSetRequestTimeout();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__SELECTOR:
                return SELECTOR_EDEFAULT == null ? selector != null : !SELECTOR_EDEFAULT.equals(selector);
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__TIME_TO_LIVE:
                return isSetTimeToLive();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__TRANSACTED:
                return isSetTransacted();
            case JmsPackage.CAMEL_JMS_BINDING_TYPE__TRANSACTION_MANAGER:
                return TRANSACTION_MANAGER_EDEFAULT == null ? transactionManager != null : !TRANSACTION_MANAGER_EDEFAULT.equals(transactionManager);
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
        result.append(" (queue: ");
        result.append(queue);
        result.append(", topic: ");
        result.append(topic);
        result.append(", connectionFactory: ");
        result.append(connectionFactory);
        result.append(", username: ");
        result.append(username);
        result.append(", password: ");
        result.append(password);
        result.append(", clientId: ");
        result.append(clientId);
        result.append(", durableSubscriptionName: ");
        result.append(durableSubscriptionName);
        result.append(", concurrentConsumers: ");
        if (concurrentConsumersESet) result.append(concurrentConsumers); else result.append("<unset>");
        result.append(", maxConcurrentConsumers: ");
        if (maxConcurrentConsumersESet) result.append(maxConcurrentConsumers); else result.append("<unset>");
        result.append(", disableReplyTo: ");
        if (disableReplyToESet) result.append(disableReplyTo); else result.append("<unset>");
        result.append(", preserveMessageQos: ");
        if (preserveMessageQosESet) result.append(preserveMessageQos); else result.append("<unset>");
        result.append(", deliveryPersistent: ");
        if (deliveryPersistentESet) result.append(deliveryPersistent); else result.append("<unset>");
        result.append(", priority: ");
        if (priorityESet) result.append(priority); else result.append("<unset>");
        result.append(", explicitQosEnabled: ");
        if (explicitQosEnabledESet) result.append(explicitQosEnabled); else result.append("<unset>");
        result.append(", replyTo: ");
        result.append(replyTo);
        result.append(", replyToType: ");
        result.append(replyToType);
        result.append(", requestTimeout: ");
        if (requestTimeoutESet) result.append(requestTimeout); else result.append("<unset>");
        result.append(", selector: ");
        result.append(selector);
        result.append(", timeToLive: ");
        if (timeToLiveESet) result.append(timeToLive); else result.append("<unset>");
        result.append(", transacted: ");
        if (transactedESet) result.append(transacted); else result.append("<unset>");
        result.append(", transactionManager: ");
        result.append(transactionManager);
        result.append(')');
        return result.toString();
    }

} //CamelJmsBindingTypeImpl
