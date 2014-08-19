/**
 */
package org.switchyard.tools.models.switchyard1_0.rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Jms Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getHostName <em>Host Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getKeystoreLocation <em>Keystore Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getKeystorePassword <em>Keystore Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getRemotingPort <em>Remoting Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getMessagingPort <em>Messaging Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getTruststoreLocation <em>Truststore Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getTruststorePassword <em>Truststore Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getUseSsl <em>Use Ssl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRemoteJmsType()
 * @model extendedMetaData="name='RemoteJmsType' kind='elementOnly'"
 * @generated
 */
public interface RemoteJmsType extends RemoteType {
    /**
     * Returns the value of the '<em><b>Host Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Host Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Host Name</em>' attribute.
     * @see #setHostName(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRemoteJmsType_HostName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='hostName'"
     * @generated
     */
    String getHostName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getHostName <em>Host Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Host Name</em>' attribute.
     * @see #getHostName()
     * @generated
     */
    void setHostName(String value);

    /**
     * Returns the value of the '<em><b>Keystore Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Keystore Location</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Keystore Location</em>' attribute.
     * @see #setKeystoreLocation(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRemoteJmsType_KeystoreLocation()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='keystoreLocation'"
     * @generated
     */
    String getKeystoreLocation();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getKeystoreLocation <em>Keystore Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Keystore Location</em>' attribute.
     * @see #getKeystoreLocation()
     * @generated
     */
    void setKeystoreLocation(String value);

    /**
     * Returns the value of the '<em><b>Keystore Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Keystore Password</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Keystore Password</em>' attribute.
     * @see #setKeystorePassword(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRemoteJmsType_KeystorePassword()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='keystorePassword'"
     * @generated
     */
    String getKeystorePassword();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getKeystorePassword <em>Keystore Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Keystore Password</em>' attribute.
     * @see #getKeystorePassword()
     * @generated
     */
    void setKeystorePassword(String value);

    /**
     * Returns the value of the '<em><b>Remoting Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remoting Port</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remoting Port</em>' attribute.
     * @see #setRemotingPort(Object)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRemoteJmsType_RemotingPort()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='attribute' name='remotingPort'"
     * @generated
     */
    Object getRemotingPort();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getRemotingPort <em>Remoting Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remoting Port</em>' attribute.
     * @see #getRemotingPort()
     * @generated
     */
    void setRemotingPort(Object value);

    /**
     * Returns the value of the '<em><b>Messaging Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Messaging Port</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Messaging Port</em>' attribute.
     * @see #setMessagingPort(Object)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRemoteJmsType_MessagingPort()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropInteger"
     *        extendedMetaData="kind='attribute' name='messagingPort'"
     * @generated
     */
    Object getMessagingPort();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getMessagingPort <em>Messaging Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Messaging Port</em>' attribute.
     * @see #getMessagingPort()
     * @generated
     */
    void setMessagingPort(Object value);

    /**
     * Returns the value of the '<em><b>Truststore Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Truststore Location</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Truststore Location</em>' attribute.
     * @see #setTruststoreLocation(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRemoteJmsType_TruststoreLocation()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='truststoreLocation'"
     * @generated
     */
    String getTruststoreLocation();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getTruststoreLocation <em>Truststore Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Truststore Location</em>' attribute.
     * @see #getTruststoreLocation()
     * @generated
     */
    void setTruststoreLocation(String value);

    /**
     * Returns the value of the '<em><b>Truststore Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Truststore Password</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Truststore Password</em>' attribute.
     * @see #setTruststorePassword(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRemoteJmsType_TruststorePassword()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='truststorePassword'"
     * @generated
     */
    String getTruststorePassword();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getTruststorePassword <em>Truststore Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Truststore Password</em>' attribute.
     * @see #getTruststorePassword()
     * @generated
     */
    void setTruststorePassword(String value);

    /**
     * Returns the value of the '<em><b>Use Ssl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use Ssl</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Ssl</em>' attribute.
     * @see #setUseSsl(Object)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getRemoteJmsType_UseSsl()
     * @model dataType="org.switchyard.tools.models.switchyard1_0.switchyard.PropBoolean"
     *        extendedMetaData="kind='attribute' name='useSsl'"
     * @generated
     */
    Object getUseSsl();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getUseSsl <em>Use Ssl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Ssl</em>' attribute.
     * @see #getUseSsl()
     * @generated
     */
    void setUseSsl(Object value);

} // RemoteJmsType
