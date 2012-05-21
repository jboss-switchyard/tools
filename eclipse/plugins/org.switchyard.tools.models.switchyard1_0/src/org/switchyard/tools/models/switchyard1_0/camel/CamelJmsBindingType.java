/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jms Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getQueue <em>Queue</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getConnectionFactory <em>Connection Factory</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getUsername <em>Username</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getPassword <em>Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getClientId <em>Client Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getDurableSubscriptionName <em>Durable Subscription Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getConcurrentConsumers <em>Concurrent Consumers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getMaxConcurrentConsumers <em>Max Concurrent Consumers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isDisableReplyTo <em>Disable Reply To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isPreserveMessageQos <em>Preserve Message Qos</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isDeliveryPersistent <em>Delivery Persistent</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isExplicitQosEnabled <em>Explicit Qos Enabled</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getReplyTo <em>Reply To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getReplyToType <em>Reply To Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getRequestTimeout <em>Request Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getTimeToLive <em>Time To Live</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getTransactionManager <em>Transaction Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType()
 * @model extendedMetaData="name='CamelJmsBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelJmsBindingType extends BaseCamelBinding {
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_Queue()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='queue' namespace='##targetNamespace'"
     * @generated
     */
    String getQueue();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getQueue <em>Queue</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_Topic()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='topic' namespace='##targetNamespace'"
     * @generated
     */
    String getTopic();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getTopic <em>Topic</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_ConnectionFactory()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='connectionFactory' namespace='##targetNamespace'"
     * @generated
     */
    String getConnectionFactory();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getConnectionFactory <em>Connection Factory</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_Username()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='username' namespace='##targetNamespace'"
     * @generated
     */
    String getUsername();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getUsername <em>Username</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_Password()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='password' namespace='##targetNamespace'"
     * @generated
     */
    String getPassword();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getPassword <em>Password</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_ClientId()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='clientId' namespace='##targetNamespace'"
     * @generated
     */
    String getClientId();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getClientId <em>Client Id</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_DurableSubscriptionName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='durableSubscriptionName' namespace='##targetNamespace'"
     * @generated
     */
    String getDurableSubscriptionName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getDurableSubscriptionName <em>Durable Subscription Name</em>}' attribute.
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
     * @see #setConcurrentConsumers(int)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_ConcurrentConsumers()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='concurrentConsumers' namespace='##targetNamespace'"
     * @generated
     */
    int getConcurrentConsumers();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getConcurrentConsumers <em>Concurrent Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Concurrent Consumers</em>' attribute.
     * @see #isSetConcurrentConsumers()
     * @see #unsetConcurrentConsumers()
     * @see #getConcurrentConsumers()
     * @generated
     */
    void setConcurrentConsumers(int value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getConcurrentConsumers <em>Concurrent Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConcurrentConsumers()
     * @see #getConcurrentConsumers()
     * @see #setConcurrentConsumers(int)
     * @generated
     */
    void unsetConcurrentConsumers();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getConcurrentConsumers <em>Concurrent Consumers</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Concurrent Consumers</em>' attribute is set.
     * @see #unsetConcurrentConsumers()
     * @see #getConcurrentConsumers()
     * @see #setConcurrentConsumers(int)
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
     * @see #setMaxConcurrentConsumers(int)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_MaxConcurrentConsumers()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='maxConcurrentConsumers' namespace='##targetNamespace'"
     * @generated
     */
    int getMaxConcurrentConsumers();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getMaxConcurrentConsumers <em>Max Concurrent Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Concurrent Consumers</em>' attribute.
     * @see #isSetMaxConcurrentConsumers()
     * @see #unsetMaxConcurrentConsumers()
     * @see #getMaxConcurrentConsumers()
     * @generated
     */
    void setMaxConcurrentConsumers(int value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getMaxConcurrentConsumers <em>Max Concurrent Consumers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxConcurrentConsumers()
     * @see #getMaxConcurrentConsumers()
     * @see #setMaxConcurrentConsumers(int)
     * @generated
     */
    void unsetMaxConcurrentConsumers();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getMaxConcurrentConsumers <em>Max Concurrent Consumers</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Concurrent Consumers</em>' attribute is set.
     * @see #unsetMaxConcurrentConsumers()
     * @see #getMaxConcurrentConsumers()
     * @see #setMaxConcurrentConsumers(int)
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
     * @see #setDisableReplyTo(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_DisableReplyTo()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='disableReplyTo' namespace='##targetNamespace'"
     * @generated
     */
    boolean isDisableReplyTo();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isDisableReplyTo <em>Disable Reply To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Disable Reply To</em>' attribute.
     * @see #isSetDisableReplyTo()
     * @see #unsetDisableReplyTo()
     * @see #isDisableReplyTo()
     * @generated
     */
    void setDisableReplyTo(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isDisableReplyTo <em>Disable Reply To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDisableReplyTo()
     * @see #isDisableReplyTo()
     * @see #setDisableReplyTo(boolean)
     * @generated
     */
    void unsetDisableReplyTo();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isDisableReplyTo <em>Disable Reply To</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Disable Reply To</em>' attribute is set.
     * @see #unsetDisableReplyTo()
     * @see #isDisableReplyTo()
     * @see #setDisableReplyTo(boolean)
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
     * @see #setPreserveMessageQos(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_PreserveMessageQos()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='preserveMessageQos' namespace='##targetNamespace'"
     * @generated
     */
    boolean isPreserveMessageQos();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isPreserveMessageQos <em>Preserve Message Qos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Preserve Message Qos</em>' attribute.
     * @see #isSetPreserveMessageQos()
     * @see #unsetPreserveMessageQos()
     * @see #isPreserveMessageQos()
     * @generated
     */
    void setPreserveMessageQos(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isPreserveMessageQos <em>Preserve Message Qos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPreserveMessageQos()
     * @see #isPreserveMessageQos()
     * @see #setPreserveMessageQos(boolean)
     * @generated
     */
    void unsetPreserveMessageQos();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isPreserveMessageQos <em>Preserve Message Qos</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Preserve Message Qos</em>' attribute is set.
     * @see #unsetPreserveMessageQos()
     * @see #isPreserveMessageQos()
     * @see #setPreserveMessageQos(boolean)
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
     * @see #setDeliveryPersistent(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_DeliveryPersistent()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='deliveryPersistent' namespace='##targetNamespace'"
     * @generated
     */
    boolean isDeliveryPersistent();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isDeliveryPersistent <em>Delivery Persistent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delivery Persistent</em>' attribute.
     * @see #isSetDeliveryPersistent()
     * @see #unsetDeliveryPersistent()
     * @see #isDeliveryPersistent()
     * @generated
     */
    void setDeliveryPersistent(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isDeliveryPersistent <em>Delivery Persistent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDeliveryPersistent()
     * @see #isDeliveryPersistent()
     * @see #setDeliveryPersistent(boolean)
     * @generated
     */
    void unsetDeliveryPersistent();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isDeliveryPersistent <em>Delivery Persistent</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Delivery Persistent</em>' attribute is set.
     * @see #unsetDeliveryPersistent()
     * @see #isDeliveryPersistent()
     * @see #setDeliveryPersistent(boolean)
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
     * @see #setPriority(int)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_Priority()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
     * @generated
     */
    int getPriority();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getPriority <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Priority</em>' attribute.
     * @see #isSetPriority()
     * @see #unsetPriority()
     * @see #getPriority()
     * @generated
     */
    void setPriority(int value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getPriority <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPriority()
     * @see #getPriority()
     * @see #setPriority(int)
     * @generated
     */
    void unsetPriority();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getPriority <em>Priority</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Priority</em>' attribute is set.
     * @see #unsetPriority()
     * @see #getPriority()
     * @see #setPriority(int)
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
     * @see #setExplicitQosEnabled(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_ExplicitQosEnabled()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='explicitQosEnabled' namespace='##targetNamespace'"
     * @generated
     */
    boolean isExplicitQosEnabled();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isExplicitQosEnabled <em>Explicit Qos Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Explicit Qos Enabled</em>' attribute.
     * @see #isSetExplicitQosEnabled()
     * @see #unsetExplicitQosEnabled()
     * @see #isExplicitQosEnabled()
     * @generated
     */
    void setExplicitQosEnabled(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isExplicitQosEnabled <em>Explicit Qos Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExplicitQosEnabled()
     * @see #isExplicitQosEnabled()
     * @see #setExplicitQosEnabled(boolean)
     * @generated
     */
    void unsetExplicitQosEnabled();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isExplicitQosEnabled <em>Explicit Qos Enabled</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Explicit Qos Enabled</em>' attribute is set.
     * @see #unsetExplicitQosEnabled()
     * @see #isExplicitQosEnabled()
     * @see #setExplicitQosEnabled(boolean)
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_ReplyTo()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='replyTo' namespace='##targetNamespace'"
     * @generated
     */
    String getReplyTo();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getReplyTo <em>Reply To</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_ReplyToType()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='replyToType' namespace='##targetNamespace'"
     * @generated
     */
    String getReplyToType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getReplyToType <em>Reply To Type</em>}' attribute.
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
     * @see #setRequestTimeout(int)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_RequestTimeout()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='requestTimeout' namespace='##targetNamespace'"
     * @generated
     */
    int getRequestTimeout();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getRequestTimeout <em>Request Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Request Timeout</em>' attribute.
     * @see #isSetRequestTimeout()
     * @see #unsetRequestTimeout()
     * @see #getRequestTimeout()
     * @generated
     */
    void setRequestTimeout(int value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getRequestTimeout <em>Request Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRequestTimeout()
     * @see #getRequestTimeout()
     * @see #setRequestTimeout(int)
     * @generated
     */
    void unsetRequestTimeout();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getRequestTimeout <em>Request Timeout</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Request Timeout</em>' attribute is set.
     * @see #unsetRequestTimeout()
     * @see #getRequestTimeout()
     * @see #setRequestTimeout(int)
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_Selector()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='selector' namespace='##targetNamespace'"
     * @generated
     */
    String getSelector();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getSelector <em>Selector</em>}' attribute.
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
     * @see #setTimeToLive(int)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_TimeToLive()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='timeToLive' namespace='##targetNamespace'"
     * @generated
     */
    int getTimeToLive();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getTimeToLive <em>Time To Live</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time To Live</em>' attribute.
     * @see #isSetTimeToLive()
     * @see #unsetTimeToLive()
     * @see #getTimeToLive()
     * @generated
     */
    void setTimeToLive(int value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getTimeToLive <em>Time To Live</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeToLive()
     * @see #getTimeToLive()
     * @see #setTimeToLive(int)
     * @generated
     */
    void unsetTimeToLive();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getTimeToLive <em>Time To Live</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time To Live</em>' attribute is set.
     * @see #unsetTimeToLive()
     * @see #getTimeToLive()
     * @see #setTimeToLive(int)
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
     * @see #setTransacted(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_Transacted()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='transacted' namespace='##targetNamespace'"
     * @generated
     */
    boolean isTransacted();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isTransacted <em>Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transacted</em>' attribute.
     * @see #isSetTransacted()
     * @see #unsetTransacted()
     * @see #isTransacted()
     * @generated
     */
    void setTransacted(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isTransacted <em>Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransacted()
     * @see #isTransacted()
     * @see #setTransacted(boolean)
     * @generated
     */
    void unsetTransacted();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isTransacted <em>Transacted</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transacted</em>' attribute is set.
     * @see #unsetTransacted()
     * @see #isTransacted()
     * @see #setTransacted(boolean)
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelJmsBindingType_TransactionManager()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='transactionManager' namespace='##targetNamespace'"
     * @generated
     */
    String getTransactionManager();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getTransactionManager <em>Transaction Manager</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transaction Manager</em>' attribute.
     * @see #getTransactionManager()
     * @generated
     */
    void setTransactionManager(String value);

} // CamelJmsBindingType
