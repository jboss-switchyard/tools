/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage;
import org.switchyard.tools.models.switchyard1_0.camel.mqtt.QualityOfServiceType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Mqtt Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl#getLocalAddress <em>Local Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl#getConnectAttemptsMax <em>Connect Attempts Max</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl#getReconnectAttemptsMax <em>Reconnect Attempts Max</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl#getReconnectDelay <em>Reconnect Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl#getReconnectBackOffMultiplier <em>Reconnect Back Off Multiplier</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl#getReconnectDelayMax <em>Reconnect Delay Max</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl#getQualityOfService <em>Quality Of Service</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl#getSubscribeTopicName <em>Subscribe Topic Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl#getPublishTopicName <em>Publish Topic Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl#getByDefaultRetain <em>By Default Retain</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl#getMqttTopicPropertyName <em>Mqtt Topic Property Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl#getMqttRetainPropertyName <em>Mqtt Retain Property Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl#getMqttQosPropertyName <em>Mqtt Qos Property Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl#getConnectWaitInSeconds <em>Connect Wait In Seconds</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl#getDisconnectWaitInSeconds <em>Disconnect Wait In Seconds</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl#getSendWaitInSeconds <em>Send Wait In Seconds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelMqttBindingTypeImpl extends BaseCamelBindingImpl implements CamelMqttBindingType {
    /**
     * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHost()
     * @generated
     * @ordered
     */
    protected static final String HOST_EDEFAULT = "tcp://127.0.0.1:1883";

    /**
     * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHost()
     * @generated
     * @ordered
     */
    protected String host = HOST_EDEFAULT;

    /**
     * The default value of the '{@link #getLocalAddress() <em>Local Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalAddress()
     * @generated
     * @ordered
     */
    protected static final String LOCAL_ADDRESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocalAddress() <em>Local Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalAddress()
     * @generated
     * @ordered
     */
    protected String localAddress = LOCAL_ADDRESS_EDEFAULT;

    /**
     * The default value of the '{@link #getConnectAttemptsMax() <em>Connect Attempts Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectAttemptsMax()
     * @generated
     * @ordered
     */
    protected static final Object CONNECT_ATTEMPTS_MAX_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropInteger(), "-1");

    /**
     * The cached value of the '{@link #getConnectAttemptsMax() <em>Connect Attempts Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectAttemptsMax()
     * @generated
     * @ordered
     */
    protected Object connectAttemptsMax = CONNECT_ATTEMPTS_MAX_EDEFAULT;

    /**
     * The default value of the '{@link #getReconnectAttemptsMax() <em>Reconnect Attempts Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReconnectAttemptsMax()
     * @generated
     * @ordered
     */
    protected static final Object RECONNECT_ATTEMPTS_MAX_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropInteger(), "-1");

    /**
     * The cached value of the '{@link #getReconnectAttemptsMax() <em>Reconnect Attempts Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReconnectAttemptsMax()
     * @generated
     * @ordered
     */
    protected Object reconnectAttemptsMax = RECONNECT_ATTEMPTS_MAX_EDEFAULT;

    /**
     * The default value of the '{@link #getReconnectDelay() <em>Reconnect Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReconnectDelay()
     * @generated
     * @ordered
     */
    protected static final Object RECONNECT_DELAY_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropInteger(), "10");

    /**
     * The cached value of the '{@link #getReconnectDelay() <em>Reconnect Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReconnectDelay()
     * @generated
     * @ordered
     */
    protected Object reconnectDelay = RECONNECT_DELAY_EDEFAULT;

    /**
     * The default value of the '{@link #getReconnectBackOffMultiplier() <em>Reconnect Back Off Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReconnectBackOffMultiplier()
     * @generated
     * @ordered
     */
    protected static final Object RECONNECT_BACK_OFF_MULTIPLIER_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropDouble(), "2.0");

    /**
     * The cached value of the '{@link #getReconnectBackOffMultiplier() <em>Reconnect Back Off Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReconnectBackOffMultiplier()
     * @generated
     * @ordered
     */
    protected Object reconnectBackOffMultiplier = RECONNECT_BACK_OFF_MULTIPLIER_EDEFAULT;

    /**
     * The default value of the '{@link #getReconnectDelayMax() <em>Reconnect Delay Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReconnectDelayMax()
     * @generated
     * @ordered
     */
    protected static final Object RECONNECT_DELAY_MAX_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropInteger(), "30000");

    /**
     * The cached value of the '{@link #getReconnectDelayMax() <em>Reconnect Delay Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReconnectDelayMax()
     * @generated
     * @ordered
     */
    protected Object reconnectDelayMax = RECONNECT_DELAY_MAX_EDEFAULT;

    /**
     * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUserName()
     * @generated
     * @ordered
     */
    protected static final String USER_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUserName()
     * @generated
     * @ordered
     */
    protected String userName = USER_NAME_EDEFAULT;

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
     * The default value of the '{@link #getQualityOfService() <em>Quality Of Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQualityOfService()
     * @generated
     * @ordered
     */
    protected static final QualityOfServiceType QUALITY_OF_SERVICE_EDEFAULT = QualityOfServiceType.AT_LEAST_ONCE;

    /**
     * The cached value of the '{@link #getQualityOfService() <em>Quality Of Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQualityOfService()
     * @generated
     * @ordered
     */
    protected QualityOfServiceType qualityOfService = QUALITY_OF_SERVICE_EDEFAULT;

    /**
     * This is true if the Quality Of Service attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qualityOfServiceESet;

    /**
     * The default value of the '{@link #getSubscribeTopicName() <em>Subscribe Topic Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubscribeTopicName()
     * @generated
     * @ordered
     */
    protected static final String SUBSCRIBE_TOPIC_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubscribeTopicName() <em>Subscribe Topic Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubscribeTopicName()
     * @generated
     * @ordered
     */
    protected String subscribeTopicName = SUBSCRIBE_TOPIC_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getPublishTopicName() <em>Publish Topic Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublishTopicName()
     * @generated
     * @ordered
     */
    protected static final String PUBLISH_TOPIC_NAME_EDEFAULT = "camel/mqtt/test";

    /**
     * The cached value of the '{@link #getPublishTopicName() <em>Publish Topic Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublishTopicName()
     * @generated
     * @ordered
     */
    protected String publishTopicName = PUBLISH_TOPIC_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getByDefaultRetain() <em>By Default Retain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getByDefaultRetain()
     * @generated
     * @ordered
     */
    protected static final Object BY_DEFAULT_RETAIN_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropBoolean(), "false");

    /**
     * The cached value of the '{@link #getByDefaultRetain() <em>By Default Retain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getByDefaultRetain()
     * @generated
     * @ordered
     */
    protected Object byDefaultRetain = BY_DEFAULT_RETAIN_EDEFAULT;

    /**
     * The default value of the '{@link #getMqttTopicPropertyName() <em>Mqtt Topic Property Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMqttTopicPropertyName()
     * @generated
     * @ordered
     */
    protected static final String MQTT_TOPIC_PROPERTY_NAME_EDEFAULT = "_MQTTTopicPropertyName+";

    /**
     * The cached value of the '{@link #getMqttTopicPropertyName() <em>Mqtt Topic Property Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMqttTopicPropertyName()
     * @generated
     * @ordered
     */
    protected String mqttTopicPropertyName = MQTT_TOPIC_PROPERTY_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getMqttRetainPropertyName() <em>Mqtt Retain Property Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMqttRetainPropertyName()
     * @generated
     * @ordered
     */
    protected static final String MQTT_RETAIN_PROPERTY_NAME_EDEFAULT = "MQTTRetain";

    /**
     * The cached value of the '{@link #getMqttRetainPropertyName() <em>Mqtt Retain Property Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMqttRetainPropertyName()
     * @generated
     * @ordered
     */
    protected String mqttRetainPropertyName = MQTT_RETAIN_PROPERTY_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getMqttQosPropertyName() <em>Mqtt Qos Property Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMqttQosPropertyName()
     * @generated
     * @ordered
     */
    protected static final String MQTT_QOS_PROPERTY_NAME_EDEFAULT = "MQTTQos";

    /**
     * The cached value of the '{@link #getMqttQosPropertyName() <em>Mqtt Qos Property Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMqttQosPropertyName()
     * @generated
     * @ordered
     */
    protected String mqttQosPropertyName = MQTT_QOS_PROPERTY_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getConnectWaitInSeconds() <em>Connect Wait In Seconds</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectWaitInSeconds()
     * @generated
     * @ordered
     */
    protected static final Object CONNECT_WAIT_IN_SECONDS_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropInteger(), "10");

    /**
     * The cached value of the '{@link #getConnectWaitInSeconds() <em>Connect Wait In Seconds</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectWaitInSeconds()
     * @generated
     * @ordered
     */
    protected Object connectWaitInSeconds = CONNECT_WAIT_IN_SECONDS_EDEFAULT;

    /**
     * The default value of the '{@link #getDisconnectWaitInSeconds() <em>Disconnect Wait In Seconds</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisconnectWaitInSeconds()
     * @generated
     * @ordered
     */
    protected static final Object DISCONNECT_WAIT_IN_SECONDS_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropInteger(), "5");

    /**
     * The cached value of the '{@link #getDisconnectWaitInSeconds() <em>Disconnect Wait In Seconds</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisconnectWaitInSeconds()
     * @generated
     * @ordered
     */
    protected Object disconnectWaitInSeconds = DISCONNECT_WAIT_IN_SECONDS_EDEFAULT;

    /**
     * The default value of the '{@link #getSendWaitInSeconds() <em>Send Wait In Seconds</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSendWaitInSeconds()
     * @generated
     * @ordered
     */
    protected static final Object SEND_WAIT_IN_SECONDS_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropInteger(), "5");

    /**
     * The cached value of the '{@link #getSendWaitInSeconds() <em>Send Wait In Seconds</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSendWaitInSeconds()
     * @generated
     * @ordered
     */
    protected Object sendWaitInSeconds = SEND_WAIT_IN_SECONDS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelMqttBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MqttPackage.Literals.CAMEL_MQTT_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHost() {
        return host;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHost(String newHost) {
        String oldHost = host;
        host = newHost;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.CAMEL_MQTT_BINDING_TYPE__HOST, oldHost, host));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLocalAddress() {
        return localAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalAddress(String newLocalAddress) {
        String oldLocalAddress = localAddress;
        localAddress = newLocalAddress;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.CAMEL_MQTT_BINDING_TYPE__LOCAL_ADDRESS, oldLocalAddress, localAddress));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getConnectAttemptsMax() {
        return connectAttemptsMax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnectAttemptsMax(Object newConnectAttemptsMax) {
        Object oldConnectAttemptsMax = connectAttemptsMax;
        connectAttemptsMax = newConnectAttemptsMax;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.CAMEL_MQTT_BINDING_TYPE__CONNECT_ATTEMPTS_MAX, oldConnectAttemptsMax, connectAttemptsMax));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getReconnectAttemptsMax() {
        return reconnectAttemptsMax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReconnectAttemptsMax(Object newReconnectAttemptsMax) {
        Object oldReconnectAttemptsMax = reconnectAttemptsMax;
        reconnectAttemptsMax = newReconnectAttemptsMax;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.CAMEL_MQTT_BINDING_TYPE__RECONNECT_ATTEMPTS_MAX, oldReconnectAttemptsMax, reconnectAttemptsMax));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getReconnectDelay() {
        return reconnectDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReconnectDelay(Object newReconnectDelay) {
        Object oldReconnectDelay = reconnectDelay;
        reconnectDelay = newReconnectDelay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.CAMEL_MQTT_BINDING_TYPE__RECONNECT_DELAY, oldReconnectDelay, reconnectDelay));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getReconnectBackOffMultiplier() {
        return reconnectBackOffMultiplier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReconnectBackOffMultiplier(Object newReconnectBackOffMultiplier) {
        Object oldReconnectBackOffMultiplier = reconnectBackOffMultiplier;
        reconnectBackOffMultiplier = newReconnectBackOffMultiplier;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.CAMEL_MQTT_BINDING_TYPE__RECONNECT_BACK_OFF_MULTIPLIER, oldReconnectBackOffMultiplier, reconnectBackOffMultiplier));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getReconnectDelayMax() {
        return reconnectDelayMax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReconnectDelayMax(Object newReconnectDelayMax) {
        Object oldReconnectDelayMax = reconnectDelayMax;
        reconnectDelayMax = newReconnectDelayMax;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.CAMEL_MQTT_BINDING_TYPE__RECONNECT_DELAY_MAX, oldReconnectDelayMax, reconnectDelayMax));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUserName(String newUserName) {
        String oldUserName = userName;
        userName = newUserName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.CAMEL_MQTT_BINDING_TYPE__USER_NAME, oldUserName, userName));
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
            eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.CAMEL_MQTT_BINDING_TYPE__PASSWORD, oldPassword, password));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QualityOfServiceType getQualityOfService() {
        return qualityOfService;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setQualityOfService(QualityOfServiceType newQualityOfService) {
        QualityOfServiceType oldQualityOfService = qualityOfService;
        qualityOfService = newQualityOfService == null ? QUALITY_OF_SERVICE_EDEFAULT : newQualityOfService;
        boolean oldQualityOfServiceESet = qualityOfServiceESet;
        qualityOfServiceESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.CAMEL_MQTT_BINDING_TYPE__QUALITY_OF_SERVICE, oldQualityOfService, qualityOfService, !oldQualityOfServiceESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetQualityOfService() {
        QualityOfServiceType oldQualityOfService = qualityOfService;
        boolean oldQualityOfServiceESet = qualityOfServiceESet;
        qualityOfService = QUALITY_OF_SERVICE_EDEFAULT;
        qualityOfServiceESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, MqttPackage.CAMEL_MQTT_BINDING_TYPE__QUALITY_OF_SERVICE, oldQualityOfService, QUALITY_OF_SERVICE_EDEFAULT, oldQualityOfServiceESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetQualityOfService() {
        return qualityOfServiceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSubscribeTopicName() {
        return subscribeTopicName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSubscribeTopicName(String newSubscribeTopicName) {
        String oldSubscribeTopicName = subscribeTopicName;
        subscribeTopicName = newSubscribeTopicName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.CAMEL_MQTT_BINDING_TYPE__SUBSCRIBE_TOPIC_NAME, oldSubscribeTopicName, subscribeTopicName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPublishTopicName() {
        return publishTopicName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPublishTopicName(String newPublishTopicName) {
        String oldPublishTopicName = publishTopicName;
        publishTopicName = newPublishTopicName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.CAMEL_MQTT_BINDING_TYPE__PUBLISH_TOPIC_NAME, oldPublishTopicName, publishTopicName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getByDefaultRetain() {
        return byDefaultRetain;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setByDefaultRetain(Object newByDefaultRetain) {
        Object oldByDefaultRetain = byDefaultRetain;
        byDefaultRetain = newByDefaultRetain;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.CAMEL_MQTT_BINDING_TYPE__BY_DEFAULT_RETAIN, oldByDefaultRetain, byDefaultRetain));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMqttTopicPropertyName() {
        return mqttTopicPropertyName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMqttTopicPropertyName(String newMqttTopicPropertyName) {
        String oldMqttTopicPropertyName = mqttTopicPropertyName;
        mqttTopicPropertyName = newMqttTopicPropertyName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.CAMEL_MQTT_BINDING_TYPE__MQTT_TOPIC_PROPERTY_NAME, oldMqttTopicPropertyName, mqttTopicPropertyName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMqttRetainPropertyName() {
        return mqttRetainPropertyName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMqttRetainPropertyName(String newMqttRetainPropertyName) {
        String oldMqttRetainPropertyName = mqttRetainPropertyName;
        mqttRetainPropertyName = newMqttRetainPropertyName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.CAMEL_MQTT_BINDING_TYPE__MQTT_RETAIN_PROPERTY_NAME, oldMqttRetainPropertyName, mqttRetainPropertyName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMqttQosPropertyName() {
        return mqttQosPropertyName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMqttQosPropertyName(String newMqttQosPropertyName) {
        String oldMqttQosPropertyName = mqttQosPropertyName;
        mqttQosPropertyName = newMqttQosPropertyName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.CAMEL_MQTT_BINDING_TYPE__MQTT_QOS_PROPERTY_NAME, oldMqttQosPropertyName, mqttQosPropertyName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getConnectWaitInSeconds() {
        return connectWaitInSeconds;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnectWaitInSeconds(Object newConnectWaitInSeconds) {
        Object oldConnectWaitInSeconds = connectWaitInSeconds;
        connectWaitInSeconds = newConnectWaitInSeconds;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.CAMEL_MQTT_BINDING_TYPE__CONNECT_WAIT_IN_SECONDS, oldConnectWaitInSeconds, connectWaitInSeconds));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDisconnectWaitInSeconds() {
        return disconnectWaitInSeconds;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDisconnectWaitInSeconds(Object newDisconnectWaitInSeconds) {
        Object oldDisconnectWaitInSeconds = disconnectWaitInSeconds;
        disconnectWaitInSeconds = newDisconnectWaitInSeconds;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.CAMEL_MQTT_BINDING_TYPE__DISCONNECT_WAIT_IN_SECONDS, oldDisconnectWaitInSeconds, disconnectWaitInSeconds));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSendWaitInSeconds() {
        return sendWaitInSeconds;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSendWaitInSeconds(Object newSendWaitInSeconds) {
        Object oldSendWaitInSeconds = sendWaitInSeconds;
        sendWaitInSeconds = newSendWaitInSeconds;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.CAMEL_MQTT_BINDING_TYPE__SEND_WAIT_IN_SECONDS, oldSendWaitInSeconds, sendWaitInSeconds));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__HOST:
                return getHost();
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__LOCAL_ADDRESS:
                return getLocalAddress();
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__CONNECT_ATTEMPTS_MAX:
                return getConnectAttemptsMax();
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__RECONNECT_ATTEMPTS_MAX:
                return getReconnectAttemptsMax();
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__RECONNECT_DELAY:
                return getReconnectDelay();
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__RECONNECT_BACK_OFF_MULTIPLIER:
                return getReconnectBackOffMultiplier();
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__RECONNECT_DELAY_MAX:
                return getReconnectDelayMax();
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__USER_NAME:
                return getUserName();
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__PASSWORD:
                return getPassword();
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__QUALITY_OF_SERVICE:
                return getQualityOfService();
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__SUBSCRIBE_TOPIC_NAME:
                return getSubscribeTopicName();
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__PUBLISH_TOPIC_NAME:
                return getPublishTopicName();
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__BY_DEFAULT_RETAIN:
                return getByDefaultRetain();
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__MQTT_TOPIC_PROPERTY_NAME:
                return getMqttTopicPropertyName();
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__MQTT_RETAIN_PROPERTY_NAME:
                return getMqttRetainPropertyName();
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__MQTT_QOS_PROPERTY_NAME:
                return getMqttQosPropertyName();
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__CONNECT_WAIT_IN_SECONDS:
                return getConnectWaitInSeconds();
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__DISCONNECT_WAIT_IN_SECONDS:
                return getDisconnectWaitInSeconds();
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__SEND_WAIT_IN_SECONDS:
                return getSendWaitInSeconds();
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
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__HOST:
                setHost((String)newValue);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__LOCAL_ADDRESS:
                setLocalAddress((String)newValue);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__CONNECT_ATTEMPTS_MAX:
                setConnectAttemptsMax(newValue);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__RECONNECT_ATTEMPTS_MAX:
                setReconnectAttemptsMax(newValue);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__RECONNECT_DELAY:
                setReconnectDelay(newValue);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__RECONNECT_BACK_OFF_MULTIPLIER:
                setReconnectBackOffMultiplier(newValue);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__RECONNECT_DELAY_MAX:
                setReconnectDelayMax(newValue);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__USER_NAME:
                setUserName((String)newValue);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__PASSWORD:
                setPassword((String)newValue);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__QUALITY_OF_SERVICE:
                setQualityOfService((QualityOfServiceType)newValue);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__SUBSCRIBE_TOPIC_NAME:
                setSubscribeTopicName((String)newValue);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__PUBLISH_TOPIC_NAME:
                setPublishTopicName((String)newValue);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__BY_DEFAULT_RETAIN:
                setByDefaultRetain(newValue);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__MQTT_TOPIC_PROPERTY_NAME:
                setMqttTopicPropertyName((String)newValue);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__MQTT_RETAIN_PROPERTY_NAME:
                setMqttRetainPropertyName((String)newValue);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__MQTT_QOS_PROPERTY_NAME:
                setMqttQosPropertyName((String)newValue);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__CONNECT_WAIT_IN_SECONDS:
                setConnectWaitInSeconds(newValue);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__DISCONNECT_WAIT_IN_SECONDS:
                setDisconnectWaitInSeconds(newValue);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__SEND_WAIT_IN_SECONDS:
                setSendWaitInSeconds(newValue);
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
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__HOST:
                setHost(HOST_EDEFAULT);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__LOCAL_ADDRESS:
                setLocalAddress(LOCAL_ADDRESS_EDEFAULT);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__CONNECT_ATTEMPTS_MAX:
                setConnectAttemptsMax(CONNECT_ATTEMPTS_MAX_EDEFAULT);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__RECONNECT_ATTEMPTS_MAX:
                setReconnectAttemptsMax(RECONNECT_ATTEMPTS_MAX_EDEFAULT);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__RECONNECT_DELAY:
                setReconnectDelay(RECONNECT_DELAY_EDEFAULT);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__RECONNECT_BACK_OFF_MULTIPLIER:
                setReconnectBackOffMultiplier(RECONNECT_BACK_OFF_MULTIPLIER_EDEFAULT);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__RECONNECT_DELAY_MAX:
                setReconnectDelayMax(RECONNECT_DELAY_MAX_EDEFAULT);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__USER_NAME:
                setUserName(USER_NAME_EDEFAULT);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__PASSWORD:
                setPassword(PASSWORD_EDEFAULT);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__QUALITY_OF_SERVICE:
                unsetQualityOfService();
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__SUBSCRIBE_TOPIC_NAME:
                setSubscribeTopicName(SUBSCRIBE_TOPIC_NAME_EDEFAULT);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__PUBLISH_TOPIC_NAME:
                setPublishTopicName(PUBLISH_TOPIC_NAME_EDEFAULT);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__BY_DEFAULT_RETAIN:
                setByDefaultRetain(BY_DEFAULT_RETAIN_EDEFAULT);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__MQTT_TOPIC_PROPERTY_NAME:
                setMqttTopicPropertyName(MQTT_TOPIC_PROPERTY_NAME_EDEFAULT);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__MQTT_RETAIN_PROPERTY_NAME:
                setMqttRetainPropertyName(MQTT_RETAIN_PROPERTY_NAME_EDEFAULT);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__MQTT_QOS_PROPERTY_NAME:
                setMqttQosPropertyName(MQTT_QOS_PROPERTY_NAME_EDEFAULT);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__CONNECT_WAIT_IN_SECONDS:
                setConnectWaitInSeconds(CONNECT_WAIT_IN_SECONDS_EDEFAULT);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__DISCONNECT_WAIT_IN_SECONDS:
                setDisconnectWaitInSeconds(DISCONNECT_WAIT_IN_SECONDS_EDEFAULT);
                return;
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__SEND_WAIT_IN_SECONDS:
                setSendWaitInSeconds(SEND_WAIT_IN_SECONDS_EDEFAULT);
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
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__HOST:
                return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__LOCAL_ADDRESS:
                return LOCAL_ADDRESS_EDEFAULT == null ? localAddress != null : !LOCAL_ADDRESS_EDEFAULT.equals(localAddress);
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__CONNECT_ATTEMPTS_MAX:
                return CONNECT_ATTEMPTS_MAX_EDEFAULT == null ? connectAttemptsMax != null : !CONNECT_ATTEMPTS_MAX_EDEFAULT.equals(connectAttemptsMax);
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__RECONNECT_ATTEMPTS_MAX:
                return RECONNECT_ATTEMPTS_MAX_EDEFAULT == null ? reconnectAttemptsMax != null : !RECONNECT_ATTEMPTS_MAX_EDEFAULT.equals(reconnectAttemptsMax);
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__RECONNECT_DELAY:
                return RECONNECT_DELAY_EDEFAULT == null ? reconnectDelay != null : !RECONNECT_DELAY_EDEFAULT.equals(reconnectDelay);
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__RECONNECT_BACK_OFF_MULTIPLIER:
                return RECONNECT_BACK_OFF_MULTIPLIER_EDEFAULT == null ? reconnectBackOffMultiplier != null : !RECONNECT_BACK_OFF_MULTIPLIER_EDEFAULT.equals(reconnectBackOffMultiplier);
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__RECONNECT_DELAY_MAX:
                return RECONNECT_DELAY_MAX_EDEFAULT == null ? reconnectDelayMax != null : !RECONNECT_DELAY_MAX_EDEFAULT.equals(reconnectDelayMax);
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__USER_NAME:
                return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__PASSWORD:
                return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__QUALITY_OF_SERVICE:
                return isSetQualityOfService();
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__SUBSCRIBE_TOPIC_NAME:
                return SUBSCRIBE_TOPIC_NAME_EDEFAULT == null ? subscribeTopicName != null : !SUBSCRIBE_TOPIC_NAME_EDEFAULT.equals(subscribeTopicName);
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__PUBLISH_TOPIC_NAME:
                return PUBLISH_TOPIC_NAME_EDEFAULT == null ? publishTopicName != null : !PUBLISH_TOPIC_NAME_EDEFAULT.equals(publishTopicName);
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__BY_DEFAULT_RETAIN:
                return BY_DEFAULT_RETAIN_EDEFAULT == null ? byDefaultRetain != null : !BY_DEFAULT_RETAIN_EDEFAULT.equals(byDefaultRetain);
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__MQTT_TOPIC_PROPERTY_NAME:
                return MQTT_TOPIC_PROPERTY_NAME_EDEFAULT == null ? mqttTopicPropertyName != null : !MQTT_TOPIC_PROPERTY_NAME_EDEFAULT.equals(mqttTopicPropertyName);
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__MQTT_RETAIN_PROPERTY_NAME:
                return MQTT_RETAIN_PROPERTY_NAME_EDEFAULT == null ? mqttRetainPropertyName != null : !MQTT_RETAIN_PROPERTY_NAME_EDEFAULT.equals(mqttRetainPropertyName);
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__MQTT_QOS_PROPERTY_NAME:
                return MQTT_QOS_PROPERTY_NAME_EDEFAULT == null ? mqttQosPropertyName != null : !MQTT_QOS_PROPERTY_NAME_EDEFAULT.equals(mqttQosPropertyName);
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__CONNECT_WAIT_IN_SECONDS:
                return CONNECT_WAIT_IN_SECONDS_EDEFAULT == null ? connectWaitInSeconds != null : !CONNECT_WAIT_IN_SECONDS_EDEFAULT.equals(connectWaitInSeconds);
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__DISCONNECT_WAIT_IN_SECONDS:
                return DISCONNECT_WAIT_IN_SECONDS_EDEFAULT == null ? disconnectWaitInSeconds != null : !DISCONNECT_WAIT_IN_SECONDS_EDEFAULT.equals(disconnectWaitInSeconds);
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE__SEND_WAIT_IN_SECONDS:
                return SEND_WAIT_IN_SECONDS_EDEFAULT == null ? sendWaitInSeconds != null : !SEND_WAIT_IN_SECONDS_EDEFAULT.equals(sendWaitInSeconds);
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
        result.append(" (host: ");
        result.append(host);
        result.append(", localAddress: ");
        result.append(localAddress);
        result.append(", connectAttemptsMax: ");
        result.append(connectAttemptsMax);
        result.append(", reconnectAttemptsMax: ");
        result.append(reconnectAttemptsMax);
        result.append(", reconnectDelay: ");
        result.append(reconnectDelay);
        result.append(", reconnectBackOffMultiplier: ");
        result.append(reconnectBackOffMultiplier);
        result.append(", reconnectDelayMax: ");
        result.append(reconnectDelayMax);
        result.append(", userName: ");
        result.append(userName);
        result.append(", password: ");
        result.append(password);
        result.append(", qualityOfService: ");
        if (qualityOfServiceESet) result.append(qualityOfService); else result.append("<unset>");
        result.append(", subscribeTopicName: ");
        result.append(subscribeTopicName);
        result.append(", publishTopicName: ");
        result.append(publishTopicName);
        result.append(", byDefaultRetain: ");
        result.append(byDefaultRetain);
        result.append(", mqttTopicPropertyName: ");
        result.append(mqttTopicPropertyName);
        result.append(", mqttRetainPropertyName: ");
        result.append(mqttRetainPropertyName);
        result.append(", mqttQosPropertyName: ");
        result.append(mqttQosPropertyName);
        result.append(", connectWaitInSeconds: ");
        result.append(connectWaitInSeconds);
        result.append(", disconnectWaitInSeconds: ");
        result.append(disconnectWaitInSeconds);
        result.append(", sendWaitInSeconds: ");
        result.append(sendWaitInSeconds);
        result.append(')');
        return result.toString();
    }

} //CamelMqttBindingTypeImpl
