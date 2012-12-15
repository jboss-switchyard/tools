/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jms Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getQueue <em>Queue</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getConnectionFactory <em>Connection Factory</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getUsername <em>Username</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getPassword <em>Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getClientId <em>Client Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getDurableSubscriptionName <em>Durable Subscription Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getConcurrentConsumers <em>Concurrent Consumers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getMaxConcurrentConsumers <em>Max Concurrent Consumers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getDisableReplyTo <em>Disable Reply To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getPreserveMessageQos <em>Preserve Message Qos</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getDeliveryPersistent <em>Delivery Persistent</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getExplicitQosEnabled <em>Explicit Qos Enabled</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getReplyTo <em>Reply To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getReplyToType <em>Reply To Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getRequestTimeout <em>Request Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getTimeToLive <em>Time To Live</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getTransactionManager <em>Transaction Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType()
 * @model extendedMetaData="name='JmsBindingType' kind='elementOnly'"
 * @generated
 */
public interface JmsBindingType extends BaseCamelBinding {
    /**
     * Returns the value of the '<em><b>Queue</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Queue</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Queue</em>' attribute.
     * @see #setQueue(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_Queue()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='queue' namespace='##targetNamespace'"
     * @generated
     */
    String getQueue();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getQueue <em>Queue</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Queue</em>' attribute.
     * @see #getQueue()
     * @generated
     */
    void setQueue(String value);

    /**
     * Returns the value of the '<em><b>Topic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Topic</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Topic</em>' attribute.
     * @see #setTopic(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_Topic()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='topic' namespace='##targetNamespace'"
     * @generated
     */
    String getTopic();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getTopic <em>Topic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Topic</em>' attribute.
     * @see #getTopic()
     * @generated
     */
    void setTopic(String value);

    /**
     * Returns the value of the '<em><b>Connection Factory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Factory</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Factory</em>' attribute.
     * @see #setConnectionFactory(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_ConnectionFactory()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='connectionFactory' namespace='##targetNamespace'"
     * @generated
     */
    String getConnectionFactory();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getConnectionFactory <em>Connection Factory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Factory</em>' attribute.
     * @see #getConnectionFactory()
     * @generated
     */
    void setConnectionFactory(String value);

    /**
     * Returns the value of the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Username</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Username</em>' attribute.
     * @see #setUsername(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_Username()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='username' namespace='##targetNamespace'"
     * @generated
     */
    String getUsername();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getUsername <em>Username</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Username</em>' attribute.
     * @see #getUsername()
     * @generated
     */
    void setUsername(String value);

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_Password()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='password' namespace='##targetNamespace'"
     * @generated
     */
    String getPassword();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' attribute.
     * @see #getPassword()
     * @generated
     */
    void setPassword(String value);

    /**
     * Returns the value of the '<em><b>Client Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Client Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Client Id</em>' attribute.
     * @see #setClientId(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_ClientId()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='clientId' namespace='##targetNamespace'"
     * @generated
     */
    String getClientId();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getClientId <em>Client Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Client Id</em>' attribute.
     * @see #getClientId()
     * @generated
     */
    void setClientId(String value);

    /**
     * Returns the value of the '<em><b>Durable Subscription Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Durable Subscription Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Durable Subscription Name</em>' attribute.
     * @see #setDurableSubscriptionName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_DurableSubscriptionName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='durableSubscriptionName' namespace='##targetNamespace'"
     * @generated
     */
    String getDurableSubscriptionName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getDurableSubscriptionName <em>Durable Subscription Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Durable Subscription Name</em>' attribute.
     * @see #getDurableSubscriptionName()
     * @generated
     */
    void setDurableSubscriptionName(String value);

    /**
     * Returns the value of the '<em><b>Concurrent Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Concurrent Consumers</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Concurrent Consumers</em>' attribute.
     * @see #isSetConcurrentConsumers()
     * @see #unsetConcurrentConsumers()
     * @see #setConcurrentConsumers(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_ConcurrentConsumers()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='concurrentConsumers' namespace='##targetNamespace'"
     * @generated
     */
    Integer getConcurrentConsumers();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getConcurrentConsumers <em>Concurrent Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Concurrent Consumers</em>' attribute.
     * @see #isSetConcurrentConsumers()
     * @see #unsetConcurrentConsumers()
     * @see #getConcurrentConsumers()
     * @generated
     */
    void setConcurrentConsumers(Integer value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getConcurrentConsumers <em>Concurrent Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConcurrentConsumers()
     * @see #getConcurrentConsumers()
     * @see #setConcurrentConsumers(Integer)
     * @generated
     */
    void unsetConcurrentConsumers();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getConcurrentConsumers <em>Concurrent Consumers</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Concurrent Consumers</em>' attribute is set.
     * @see #unsetConcurrentConsumers()
     * @see #getConcurrentConsumers()
     * @see #setConcurrentConsumers(Integer)
     * @generated
     */
    boolean isSetConcurrentConsumers();

    /**
     * Returns the value of the '<em><b>Max Concurrent Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Concurrent Consumers</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Concurrent Consumers</em>' attribute.
     * @see #isSetMaxConcurrentConsumers()
     * @see #unsetMaxConcurrentConsumers()
     * @see #setMaxConcurrentConsumers(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_MaxConcurrentConsumers()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='maxConcurrentConsumers' namespace='##targetNamespace'"
     * @generated
     */
    Integer getMaxConcurrentConsumers();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getMaxConcurrentConsumers <em>Max Concurrent Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Concurrent Consumers</em>' attribute.
     * @see #isSetMaxConcurrentConsumers()
     * @see #unsetMaxConcurrentConsumers()
     * @see #getMaxConcurrentConsumers()
     * @generated
     */
    void setMaxConcurrentConsumers(Integer value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getMaxConcurrentConsumers <em>Max Concurrent Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxConcurrentConsumers()
     * @see #getMaxConcurrentConsumers()
     * @see #setMaxConcurrentConsumers(Integer)
     * @generated
     */
    void unsetMaxConcurrentConsumers();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getMaxConcurrentConsumers <em>Max Concurrent Consumers</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Concurrent Consumers</em>' attribute is set.
     * @see #unsetMaxConcurrentConsumers()
     * @see #getMaxConcurrentConsumers()
     * @see #setMaxConcurrentConsumers(Integer)
     * @generated
     */
    boolean isSetMaxConcurrentConsumers();

    /**
     * Returns the value of the '<em><b>Disable Reply To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Disable Reply To</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Disable Reply To</em>' attribute.
     * @see #isSetDisableReplyTo()
     * @see #unsetDisableReplyTo()
     * @see #setDisableReplyTo(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_DisableReplyTo()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='disableReplyTo' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getDisableReplyTo();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getDisableReplyTo <em>Disable Reply To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Disable Reply To</em>' attribute.
     * @see #isSetDisableReplyTo()
     * @see #unsetDisableReplyTo()
     * @see #getDisableReplyTo()
     * @generated
     */
    void setDisableReplyTo(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getDisableReplyTo <em>Disable Reply To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDisableReplyTo()
     * @see #getDisableReplyTo()
     * @see #setDisableReplyTo(Boolean)
     * @generated
     */
    void unsetDisableReplyTo();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getDisableReplyTo <em>Disable Reply To</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Disable Reply To</em>' attribute is set.
     * @see #unsetDisableReplyTo()
     * @see #getDisableReplyTo()
     * @see #setDisableReplyTo(Boolean)
     * @generated
     */
    boolean isSetDisableReplyTo();

    /**
     * Returns the value of the '<em><b>Preserve Message Qos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Preserve Message Qos</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Preserve Message Qos</em>' attribute.
     * @see #isSetPreserveMessageQos()
     * @see #unsetPreserveMessageQos()
     * @see #setPreserveMessageQos(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_PreserveMessageQos()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='preserveMessageQos' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getPreserveMessageQos();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getPreserveMessageQos <em>Preserve Message Qos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Preserve Message Qos</em>' attribute.
     * @see #isSetPreserveMessageQos()
     * @see #unsetPreserveMessageQos()
     * @see #getPreserveMessageQos()
     * @generated
     */
    void setPreserveMessageQos(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getPreserveMessageQos <em>Preserve Message Qos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPreserveMessageQos()
     * @see #getPreserveMessageQos()
     * @see #setPreserveMessageQos(Boolean)
     * @generated
     */
    void unsetPreserveMessageQos();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getPreserveMessageQos <em>Preserve Message Qos</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Preserve Message Qos</em>' attribute is set.
     * @see #unsetPreserveMessageQos()
     * @see #getPreserveMessageQos()
     * @see #setPreserveMessageQos(Boolean)
     * @generated
     */
    boolean isSetPreserveMessageQos();

    /**
     * Returns the value of the '<em><b>Delivery Persistent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delivery Persistent</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delivery Persistent</em>' attribute.
     * @see #isSetDeliveryPersistent()
     * @see #unsetDeliveryPersistent()
     * @see #setDeliveryPersistent(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_DeliveryPersistent()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='deliveryPersistent' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getDeliveryPersistent();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getDeliveryPersistent <em>Delivery Persistent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delivery Persistent</em>' attribute.
     * @see #isSetDeliveryPersistent()
     * @see #unsetDeliveryPersistent()
     * @see #getDeliveryPersistent()
     * @generated
     */
    void setDeliveryPersistent(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getDeliveryPersistent <em>Delivery Persistent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDeliveryPersistent()
     * @see #getDeliveryPersistent()
     * @see #setDeliveryPersistent(Boolean)
     * @generated
     */
    void unsetDeliveryPersistent();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getDeliveryPersistent <em>Delivery Persistent</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Delivery Persistent</em>' attribute is set.
     * @see #unsetDeliveryPersistent()
     * @see #getDeliveryPersistent()
     * @see #setDeliveryPersistent(Boolean)
     * @generated
     */
    boolean isSetDeliveryPersistent();

    /**
     * Returns the value of the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Priority</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Priority</em>' attribute.
     * @see #isSetPriority()
     * @see #unsetPriority()
     * @see #setPriority(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_Priority()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
     * @generated
     */
    Integer getPriority();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getPriority <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Priority</em>' attribute.
     * @see #isSetPriority()
     * @see #unsetPriority()
     * @see #getPriority()
     * @generated
     */
    void setPriority(Integer value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getPriority <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPriority()
     * @see #getPriority()
     * @see #setPriority(Integer)
     * @generated
     */
    void unsetPriority();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getPriority <em>Priority</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Priority</em>' attribute is set.
     * @see #unsetPriority()
     * @see #getPriority()
     * @see #setPriority(Integer)
     * @generated
     */
    boolean isSetPriority();

    /**
     * Returns the value of the '<em><b>Explicit Qos Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Explicit Qos Enabled</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Explicit Qos Enabled</em>' attribute.
     * @see #isSetExplicitQosEnabled()
     * @see #unsetExplicitQosEnabled()
     * @see #setExplicitQosEnabled(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_ExplicitQosEnabled()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='explicitQosEnabled' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getExplicitQosEnabled();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getExplicitQosEnabled <em>Explicit Qos Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Explicit Qos Enabled</em>' attribute.
     * @see #isSetExplicitQosEnabled()
     * @see #unsetExplicitQosEnabled()
     * @see #getExplicitQosEnabled()
     * @generated
     */
    void setExplicitQosEnabled(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getExplicitQosEnabled <em>Explicit Qos Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExplicitQosEnabled()
     * @see #getExplicitQosEnabled()
     * @see #setExplicitQosEnabled(Boolean)
     * @generated
     */
    void unsetExplicitQosEnabled();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getExplicitQosEnabled <em>Explicit Qos Enabled</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Explicit Qos Enabled</em>' attribute is set.
     * @see #unsetExplicitQosEnabled()
     * @see #getExplicitQosEnabled()
     * @see #setExplicitQosEnabled(Boolean)
     * @generated
     */
    boolean isSetExplicitQosEnabled();

    /**
     * Returns the value of the '<em><b>Reply To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reply To</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reply To</em>' attribute.
     * @see #setReplyTo(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_ReplyTo()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='replyTo' namespace='##targetNamespace'"
     * @generated
     */
    String getReplyTo();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getReplyTo <em>Reply To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reply To</em>' attribute.
     * @see #getReplyTo()
     * @generated
     */
    void setReplyTo(String value);

    /**
     * Returns the value of the '<em><b>Reply To Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reply To Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reply To Type</em>' attribute.
     * @see #setReplyToType(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_ReplyToType()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='replyToType' namespace='##targetNamespace'"
     * @generated
     */
    String getReplyToType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getReplyToType <em>Reply To Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reply To Type</em>' attribute.
     * @see #getReplyToType()
     * @generated
     */
    void setReplyToType(String value);

    /**
     * Returns the value of the '<em><b>Request Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Request Timeout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Request Timeout</em>' attribute.
     * @see #isSetRequestTimeout()
     * @see #unsetRequestTimeout()
     * @see #setRequestTimeout(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_RequestTimeout()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='requestTimeout' namespace='##targetNamespace'"
     * @generated
     */
    Integer getRequestTimeout();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getRequestTimeout <em>Request Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Request Timeout</em>' attribute.
     * @see #isSetRequestTimeout()
     * @see #unsetRequestTimeout()
     * @see #getRequestTimeout()
     * @generated
     */
    void setRequestTimeout(Integer value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getRequestTimeout <em>Request Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRequestTimeout()
     * @see #getRequestTimeout()
     * @see #setRequestTimeout(Integer)
     * @generated
     */
    void unsetRequestTimeout();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getRequestTimeout <em>Request Timeout</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Request Timeout</em>' attribute is set.
     * @see #unsetRequestTimeout()
     * @see #getRequestTimeout()
     * @see #setRequestTimeout(Integer)
     * @generated
     */
    boolean isSetRequestTimeout();

    /**
     * Returns the value of the '<em><b>Selector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selector</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selector</em>' attribute.
     * @see #setSelector(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_Selector()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='selector' namespace='##targetNamespace'"
     * @generated
     */
    String getSelector();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getSelector <em>Selector</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selector</em>' attribute.
     * @see #getSelector()
     * @generated
     */
    void setSelector(String value);

    /**
     * Returns the value of the '<em><b>Time To Live</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time To Live</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time To Live</em>' attribute.
     * @see #isSetTimeToLive()
     * @see #unsetTimeToLive()
     * @see #setTimeToLive(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_TimeToLive()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='timeToLive' namespace='##targetNamespace'"
     * @generated
     */
    Integer getTimeToLive();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getTimeToLive <em>Time To Live</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time To Live</em>' attribute.
     * @see #isSetTimeToLive()
     * @see #unsetTimeToLive()
     * @see #getTimeToLive()
     * @generated
     */
    void setTimeToLive(Integer value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getTimeToLive <em>Time To Live</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeToLive()
     * @see #getTimeToLive()
     * @see #setTimeToLive(Integer)
     * @generated
     */
    void unsetTimeToLive();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getTimeToLive <em>Time To Live</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time To Live</em>' attribute is set.
     * @see #unsetTimeToLive()
     * @see #getTimeToLive()
     * @see #setTimeToLive(Integer)
     * @generated
     */
    boolean isSetTimeToLive();

    /**
     * Returns the value of the '<em><b>Transacted</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transacted</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transacted</em>' attribute.
     * @see #isSetTransacted()
     * @see #unsetTransacted()
     * @see #setTransacted(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_Transacted()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='transacted' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getTransacted();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getTransacted <em>Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transacted</em>' attribute.
     * @see #isSetTransacted()
     * @see #unsetTransacted()
     * @see #getTransacted()
     * @generated
     */
    void setTransacted(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getTransacted <em>Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransacted()
     * @see #getTransacted()
     * @see #setTransacted(Boolean)
     * @generated
     */
    void unsetTransacted();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getTransacted <em>Transacted</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transacted</em>' attribute is set.
     * @see #unsetTransacted()
     * @see #getTransacted()
     * @see #setTransacted(Boolean)
     * @generated
     */
    boolean isSetTransacted();

    /**
     * Returns the value of the '<em><b>Transaction Manager</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transaction Manager</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transaction Manager</em>' attribute.
     * @see #setTransactionManager(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getJmsBindingType_TransactionManager()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='transactionManager' namespace='##targetNamespace'"
     * @generated
     */
    String getTransactionManager();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getTransactionManager <em>Transaction Manager</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transaction Manager</em>' attribute.
     * @see #getTransactionManager()
     * @generated
     */
    void setTransactionManager(String value);

} // JmsBindingType
