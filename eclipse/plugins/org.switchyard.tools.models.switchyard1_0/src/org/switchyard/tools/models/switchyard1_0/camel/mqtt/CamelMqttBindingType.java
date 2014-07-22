/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.mqtt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Mqtt Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getHost <em>Host</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getLocalAddress <em>Local Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getConnectAttemptsMax <em>Connect Attempts Max</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getReconnectAttemptsMax <em>Reconnect Attempts Max</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getReconnectDelay <em>Reconnect Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getReconnectBackOffMultiplier <em>Reconnect Back Off Multiplier</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getReconnectDelayMax <em>Reconnect Delay Max</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getPassword <em>Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getQualityOfService <em>Quality Of Service</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getSubscribeTopicName <em>Subscribe Topic Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getPublishTopicName <em>Publish Topic Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getByDefaultRetain <em>By Default Retain</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getMqttTopicPropertyName <em>Mqtt Topic Property Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getMqttRetainPropertyName <em>Mqtt Retain Property Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getMqttQosPropertyName <em>Mqtt Qos Property Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getConnectWaitInSeconds <em>Connect Wait In Seconds</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getDisconnectWaitInSeconds <em>Disconnect Wait In Seconds</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getSendWaitInSeconds <em>Send Wait In Seconds</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getCamelMqttBindingType()
 * @model extendedMetaData="name='CamelMqttBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelMqttBindingType extends BaseCamelBinding {
    /**
     * Returns the value of the '<em><b>Host</b></em>' attribute.
     * The default value is <code>"tcp://127.0.0.1:1883"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Host</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Host</em>' attribute.
     * @see #setHost(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getCamelMqttBindingType_Host()
     * @model default="tcp://127.0.0.1:1883" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='host' namespace='##targetNamespace'"
     * @generated
     */
    String getHost();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getHost <em>Host</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Host</em>' attribute.
     * @see #getHost()
     * @generated
     */
    void setHost(String value);

    /**
     * Returns the value of the '<em><b>Local Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Address</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Address</em>' attribute.
     * @see #setLocalAddress(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getCamelMqttBindingType_LocalAddress()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='localAddress' namespace='##targetNamespace'"
     * @generated
     */
    String getLocalAddress();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getLocalAddress <em>Local Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Address</em>' attribute.
     * @see #getLocalAddress()
     * @generated
     */
    void setLocalAddress(String value);

    /**
     * Returns the value of the '<em><b>Connect Attempts Max</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connect Attempts Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connect Attempts Max</em>' attribute.
     * @see #setConnectAttemptsMax(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getCamelMqttBindingType_ConnectAttemptsMax()
     * @model default="-1" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='element' name='connectAttemptsMax' namespace='##targetNamespace'"
     * @generated
     */
    Object getConnectAttemptsMax();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getConnectAttemptsMax <em>Connect Attempts Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connect Attempts Max</em>' attribute.
     * @see #getConnectAttemptsMax()
     * @generated
     */
    void setConnectAttemptsMax(Object value);

    /**
     * Returns the value of the '<em><b>Reconnect Attempts Max</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reconnect Attempts Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reconnect Attempts Max</em>' attribute.
     * @see #setReconnectAttemptsMax(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getCamelMqttBindingType_ReconnectAttemptsMax()
     * @model default="-1" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='element' name='reconnectAttemptsMax' namespace='##targetNamespace'"
     * @generated
     */
    Object getReconnectAttemptsMax();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getReconnectAttemptsMax <em>Reconnect Attempts Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reconnect Attempts Max</em>' attribute.
     * @see #getReconnectAttemptsMax()
     * @generated
     */
    void setReconnectAttemptsMax(Object value);

    /**
     * Returns the value of the '<em><b>Reconnect Delay</b></em>' attribute.
     * The default value is <code>"10"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reconnect Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reconnect Delay</em>' attribute.
     * @see #setReconnectDelay(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getCamelMqttBindingType_ReconnectDelay()
     * @model default="10" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='element' name='reconnectDelay' namespace='##targetNamespace'"
     * @generated
     */
    Object getReconnectDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getReconnectDelay <em>Reconnect Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reconnect Delay</em>' attribute.
     * @see #getReconnectDelay()
     * @generated
     */
    void setReconnectDelay(Object value);

    /**
     * Returns the value of the '<em><b>Reconnect Back Off Multiplier</b></em>' attribute.
     * The default value is <code>"2.0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reconnect Back Off Multiplier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reconnect Back Off Multiplier</em>' attribute.
     * @see #setReconnectBackOffMultiplier(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getCamelMqttBindingType_ReconnectBackOffMultiplier()
     * @model default="2.0" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropDouble"
     *        extendedMetaData="kind='element' name='reconnectBackOffMultiplier' namespace='##targetNamespace'"
     * @generated
     */
    Object getReconnectBackOffMultiplier();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getReconnectBackOffMultiplier <em>Reconnect Back Off Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reconnect Back Off Multiplier</em>' attribute.
     * @see #getReconnectBackOffMultiplier()
     * @generated
     */
    void setReconnectBackOffMultiplier(Object value);

    /**
     * Returns the value of the '<em><b>Reconnect Delay Max</b></em>' attribute.
     * The default value is <code>"30000"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reconnect Delay Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reconnect Delay Max</em>' attribute.
     * @see #setReconnectDelayMax(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getCamelMqttBindingType_ReconnectDelayMax()
     * @model default="30000" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='element' name='reconnectDelayMax' namespace='##targetNamespace'"
     * @generated
     */
    Object getReconnectDelayMax();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getReconnectDelayMax <em>Reconnect Delay Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reconnect Delay Max</em>' attribute.
     * @see #getReconnectDelayMax()
     * @generated
     */
    void setReconnectDelayMax(Object value);

    /**
     * Returns the value of the '<em><b>User Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>User Name</em>' attribute.
     * @see #setUserName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getCamelMqttBindingType_UserName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='userName' namespace='##targetNamespace'"
     * @generated
     */
    String getUserName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getUserName <em>User Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>User Name</em>' attribute.
     * @see #getUserName()
     * @generated
     */
    void setUserName(String value);

    /**
     * Returns the value of the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Password</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Password</em>' attribute.
     * @see #setPassword(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getCamelMqttBindingType_Password()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='password' namespace='##targetNamespace'"
     * @generated
     */
    String getPassword();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' attribute.
     * @see #getPassword()
     * @generated
     */
    void setPassword(String value);

    /**
     * Returns the value of the '<em><b>Quality Of Service</b></em>' attribute.
     * The default value is <code>"AtLeastOnce"</code>.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.QualityOfServiceType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Quality Of Service</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Quality Of Service</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.QualityOfServiceType
     * @see #isSetQualityOfService()
     * @see #unsetQualityOfService()
     * @see #setQualityOfService(QualityOfServiceType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getCamelMqttBindingType_QualityOfService()
     * @model default="AtLeastOnce" unsettable="true"
     *        extendedMetaData="kind='element' name='qualityOfService' namespace='##targetNamespace'"
     * @generated
     */
    QualityOfServiceType getQualityOfService();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getQualityOfService <em>Quality Of Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Quality Of Service</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.QualityOfServiceType
     * @see #isSetQualityOfService()
     * @see #unsetQualityOfService()
     * @see #getQualityOfService()
     * @generated
     */
    void setQualityOfService(QualityOfServiceType value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getQualityOfService <em>Quality Of Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQualityOfService()
     * @see #getQualityOfService()
     * @see #setQualityOfService(QualityOfServiceType)
     * @generated
     */
    void unsetQualityOfService();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getQualityOfService <em>Quality Of Service</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Quality Of Service</em>' attribute is set.
     * @see #unsetQualityOfService()
     * @see #getQualityOfService()
     * @see #setQualityOfService(QualityOfServiceType)
     * @generated
     */
    boolean isSetQualityOfService();

    /**
     * Returns the value of the '<em><b>Subscribe Topic Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Subscribe Topic Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Subscribe Topic Name</em>' attribute.
     * @see #setSubscribeTopicName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getCamelMqttBindingType_SubscribeTopicName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='subscribeTopicName' namespace='##targetNamespace'"
     * @generated
     */
    String getSubscribeTopicName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getSubscribeTopicName <em>Subscribe Topic Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Subscribe Topic Name</em>' attribute.
     * @see #getSubscribeTopicName()
     * @generated
     */
    void setSubscribeTopicName(String value);

    /**
     * Returns the value of the '<em><b>Publish Topic Name</b></em>' attribute.
     * The default value is <code>"camel/mqtt/test"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Publish Topic Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Publish Topic Name</em>' attribute.
     * @see #setPublishTopicName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getCamelMqttBindingType_PublishTopicName()
     * @model default="camel/mqtt/test" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='publishTopicName' namespace='##targetNamespace'"
     * @generated
     */
    String getPublishTopicName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getPublishTopicName <em>Publish Topic Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Publish Topic Name</em>' attribute.
     * @see #getPublishTopicName()
     * @generated
     */
    void setPublishTopicName(String value);

    /**
     * Returns the value of the '<em><b>By Default Retain</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>By Default Retain</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>By Default Retain</em>' attribute.
     * @see #setByDefaultRetain(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getCamelMqttBindingType_ByDefaultRetain()
     * @model default="false" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropBoolean"
     *        extendedMetaData="kind='element' name='byDefaultRetain' namespace='##targetNamespace'"
     * @generated
     */
    Object getByDefaultRetain();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getByDefaultRetain <em>By Default Retain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>By Default Retain</em>' attribute.
     * @see #getByDefaultRetain()
     * @generated
     */
    void setByDefaultRetain(Object value);

    /**
     * Returns the value of the '<em><b>Mqtt Topic Property Name</b></em>' attribute.
     * The default value is <code>"_MQTTTopicPropertyName+"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mqtt Topic Property Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mqtt Topic Property Name</em>' attribute.
     * @see #setMqttTopicPropertyName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getCamelMqttBindingType_MqttTopicPropertyName()
     * @model default="_MQTTTopicPropertyName+" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='mqttTopicPropertyName' namespace='##targetNamespace'"
     * @generated
     */
    String getMqttTopicPropertyName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getMqttTopicPropertyName <em>Mqtt Topic Property Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mqtt Topic Property Name</em>' attribute.
     * @see #getMqttTopicPropertyName()
     * @generated
     */
    void setMqttTopicPropertyName(String value);

    /**
     * Returns the value of the '<em><b>Mqtt Retain Property Name</b></em>' attribute.
     * The default value is <code>"MQTTRetain"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mqtt Retain Property Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mqtt Retain Property Name</em>' attribute.
     * @see #setMqttRetainPropertyName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getCamelMqttBindingType_MqttRetainPropertyName()
     * @model default="MQTTRetain" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='mqttRetainPropertyName' namespace='##targetNamespace'"
     * @generated
     */
    String getMqttRetainPropertyName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getMqttRetainPropertyName <em>Mqtt Retain Property Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mqtt Retain Property Name</em>' attribute.
     * @see #getMqttRetainPropertyName()
     * @generated
     */
    void setMqttRetainPropertyName(String value);

    /**
     * Returns the value of the '<em><b>Mqtt Qos Property Name</b></em>' attribute.
     * The default value is <code>"MQTTQos"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mqtt Qos Property Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mqtt Qos Property Name</em>' attribute.
     * @see #setMqttQosPropertyName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getCamelMqttBindingType_MqttQosPropertyName()
     * @model default="MQTTQos" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='mqttQosPropertyName' namespace='##targetNamespace'"
     * @generated
     */
    String getMqttQosPropertyName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getMqttQosPropertyName <em>Mqtt Qos Property Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mqtt Qos Property Name</em>' attribute.
     * @see #getMqttQosPropertyName()
     * @generated
     */
    void setMqttQosPropertyName(String value);

    /**
     * Returns the value of the '<em><b>Connect Wait In Seconds</b></em>' attribute.
     * The default value is <code>"10"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connect Wait In Seconds</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connect Wait In Seconds</em>' attribute.
     * @see #setConnectWaitInSeconds(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getCamelMqttBindingType_ConnectWaitInSeconds()
     * @model default="10" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='element' name='connectWaitInSeconds' namespace='##targetNamespace'"
     * @generated
     */
    Object getConnectWaitInSeconds();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getConnectWaitInSeconds <em>Connect Wait In Seconds</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connect Wait In Seconds</em>' attribute.
     * @see #getConnectWaitInSeconds()
     * @generated
     */
    void setConnectWaitInSeconds(Object value);

    /**
     * Returns the value of the '<em><b>Disconnect Wait In Seconds</b></em>' attribute.
     * The default value is <code>"5"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Disconnect Wait In Seconds</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Disconnect Wait In Seconds</em>' attribute.
     * @see #setDisconnectWaitInSeconds(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getCamelMqttBindingType_DisconnectWaitInSeconds()
     * @model default="5" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='element' name='disconnectWaitInSeconds' namespace='##targetNamespace'"
     * @generated
     */
    Object getDisconnectWaitInSeconds();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getDisconnectWaitInSeconds <em>Disconnect Wait In Seconds</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Disconnect Wait In Seconds</em>' attribute.
     * @see #getDisconnectWaitInSeconds()
     * @generated
     */
    void setDisconnectWaitInSeconds(Object value);

    /**
     * Returns the value of the '<em><b>Send Wait In Seconds</b></em>' attribute.
     * The default value is <code>"5"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Send Wait In Seconds</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Send Wait In Seconds</em>' attribute.
     * @see #setSendWaitInSeconds(Object)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage#getCamelMqttBindingType_SendWaitInSeconds()
     * @model default="5" dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='element' name='sendWaitInSeconds' namespace='##targetNamespace'"
     * @generated
     */
    Object getSendWaitInSeconds();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getSendWaitInSeconds <em>Send Wait In Seconds</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Send Wait In Seconds</em>' attribute.
     * @see #getSendWaitInSeconds()
     * @generated
     */
    void setSendWaitInSeconds(Object value);

} // CamelMqttBindingType
