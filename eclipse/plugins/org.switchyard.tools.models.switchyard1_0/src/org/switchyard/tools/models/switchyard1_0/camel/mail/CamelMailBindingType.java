/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.mail;

import org.switchyard.tools.models.switchyard1_0.camel.core.BaseCamelBinding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Mail Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getHost <em>Host</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getPort <em>Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getUsername <em>Username</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getPassword <em>Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getConnectionTimeout <em>Connection Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getConsume <em>Consume</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getProduce <em>Produce</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getSecure <em>Secure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailBindingType()
 * @model extendedMetaData="name='CamelMailBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelMailBindingType extends BaseCamelBinding {
    /**
     * Returns the value of the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Host</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Host</em>' attribute.
     * @see #setHost(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailBindingType_Host()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='host' namespace='##targetNamespace'"
     * @generated
     */
    String getHost();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getHost <em>Host</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Host</em>' attribute.
     * @see #getHost()
     * @generated
     */
    void setHost(String value);

    /**
     * Returns the value of the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port</em>' attribute.
     * @see #setPort(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailBindingType_Port()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='port' namespace='##targetNamespace'"
     * @generated
     */
    Integer getPort();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port</em>' attribute.
     * @see #getPort()
     * @generated
     */
    void setPort(Integer value);

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailBindingType_Username()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='username' namespace='##targetNamespace'"
     * @generated
     */
    String getUsername();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getUsername <em>Username</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailBindingType_Password()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='password' namespace='##targetNamespace'"
     * @generated
     */
    String getPassword();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' attribute.
     * @see #getPassword()
     * @generated
     */
    void setPassword(String value);

    /**
     * Returns the value of the '<em><b>Connection Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Timeout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Timeout</em>' attribute.
     * @see #isSetConnectionTimeout()
     * @see #unsetConnectionTimeout()
     * @see #setConnectionTimeout(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailBindingType_ConnectionTimeout()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='connectionTimeout' namespace='##targetNamespace'"
     * @generated
     */
    Integer getConnectionTimeout();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getConnectionTimeout <em>Connection Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Timeout</em>' attribute.
     * @see #isSetConnectionTimeout()
     * @see #unsetConnectionTimeout()
     * @see #getConnectionTimeout()
     * @generated
     */
    void setConnectionTimeout(Integer value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getConnectionTimeout <em>Connection Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectionTimeout()
     * @see #getConnectionTimeout()
     * @see #setConnectionTimeout(Integer)
     * @generated
     */
    void unsetConnectionTimeout();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getConnectionTimeout <em>Connection Timeout</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connection Timeout</em>' attribute is set.
     * @see #unsetConnectionTimeout()
     * @see #getConnectionTimeout()
     * @see #setConnectionTimeout(Integer)
     * @generated
     */
    boolean isSetConnectionTimeout();

    /**
     * Returns the value of the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Consume</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Consume</em>' containment reference.
     * @see #setConsume(CamelMailConsumerType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailBindingType_Consume()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='consume' namespace='##targetNamespace'"
     * @generated
     */
    CamelMailConsumerType getConsume();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getConsume <em>Consume</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consume</em>' containment reference.
     * @see #getConsume()
     * @generated
     */
    void setConsume(CamelMailConsumerType value);

    /**
     * Returns the value of the '<em><b>Produce</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Produce</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Produce</em>' containment reference.
     * @see #setProduce(CamelMailProducerType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailBindingType_Produce()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='produce' namespace='##targetNamespace'"
     * @generated
     */
    CamelMailProducerType getProduce();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getProduce <em>Produce</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Produce</em>' containment reference.
     * @see #getProduce()
     * @generated
     */
    void setProduce(CamelMailProducerType value);

    /**
     * Returns the value of the '<em><b>Secure</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Secure</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Secure</em>' attribute.
     * @see #setSecure(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#getCamelMailBindingType_Secure()
     * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='attribute' name='secure'"
     * @generated
     */
    Boolean getSecure();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getSecure <em>Secure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Secure</em>' attribute.
     * @see #getSecure()
     * @generated
     */
    void setSecure(Boolean value);

} // CamelMailBindingType
