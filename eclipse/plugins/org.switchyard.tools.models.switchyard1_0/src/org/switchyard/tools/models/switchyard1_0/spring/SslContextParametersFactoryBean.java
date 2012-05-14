/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssl Context Parameters Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getCipherSuites <em>Cipher Suites</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getCipherSuitesFilter <em>Cipher Suites Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getSecureSocketProtocols <em>Secure Socket Protocols</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getSecureSocketProtocolsFilter <em>Secure Socket Protocols Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getKeyManagers <em>Key Managers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getTrustManagers <em>Trust Managers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getSecureRandom <em>Secure Random</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getClientParameters <em>Client Parameters</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getServerParameters <em>Server Parameters</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getSecureSocketProtocol <em>Secure Socket Protocol</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getSessionTimeout <em>Session Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSslContextParametersFactoryBean()
 * @model extendedMetaData="name='sslContextParametersFactoryBean' kind='elementOnly'"
 * @generated
 */
public interface SslContextParametersFactoryBean extends AbstractJsseUtilFactoryBean {
	/**
     * Returns the value of the '<em><b>Cipher Suites</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cipher Suites</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Cipher Suites</em>' containment reference.
     * @see #setCipherSuites(CipherSuitesParameters)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSslContextParametersFactoryBean_CipherSuites()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='cipherSuites' namespace='##targetNamespace'"
     * @generated
     */
	CipherSuitesParameters getCipherSuites();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getCipherSuites <em>Cipher Suites</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cipher Suites</em>' containment reference.
     * @see #getCipherSuites()
     * @generated
     */
	void setCipherSuites(CipherSuitesParameters value);

	/**
     * Returns the value of the '<em><b>Cipher Suites Filter</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cipher Suites Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Cipher Suites Filter</em>' containment reference.
     * @see #setCipherSuitesFilter(FilterParameters)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSslContextParametersFactoryBean_CipherSuitesFilter()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='cipherSuitesFilter' namespace='##targetNamespace'"
     * @generated
     */
	FilterParameters getCipherSuitesFilter();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getCipherSuitesFilter <em>Cipher Suites Filter</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cipher Suites Filter</em>' containment reference.
     * @see #getCipherSuitesFilter()
     * @generated
     */
	void setCipherSuitesFilter(FilterParameters value);

	/**
     * Returns the value of the '<em><b>Secure Socket Protocols</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secure Socket Protocols</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Secure Socket Protocols</em>' containment reference.
     * @see #setSecureSocketProtocols(SecureSocketProtocolsParameters)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSslContextParametersFactoryBean_SecureSocketProtocols()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='secureSocketProtocols' namespace='##targetNamespace'"
     * @generated
     */
	SecureSocketProtocolsParameters getSecureSocketProtocols();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getSecureSocketProtocols <em>Secure Socket Protocols</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Secure Socket Protocols</em>' containment reference.
     * @see #getSecureSocketProtocols()
     * @generated
     */
	void setSecureSocketProtocols(SecureSocketProtocolsParameters value);

	/**
     * Returns the value of the '<em><b>Secure Socket Protocols Filter</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secure Socket Protocols Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Secure Socket Protocols Filter</em>' containment reference.
     * @see #setSecureSocketProtocolsFilter(FilterParameters)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSslContextParametersFactoryBean_SecureSocketProtocolsFilter()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='secureSocketProtocolsFilter' namespace='##targetNamespace'"
     * @generated
     */
	FilterParameters getSecureSocketProtocolsFilter();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getSecureSocketProtocolsFilter <em>Secure Socket Protocols Filter</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Secure Socket Protocols Filter</em>' containment reference.
     * @see #getSecureSocketProtocolsFilter()
     * @generated
     */
	void setSecureSocketProtocolsFilter(FilterParameters value);

	/**
     * Returns the value of the '<em><b>Key Managers</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Managers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Key Managers</em>' containment reference.
     * @see #setKeyManagers(KeyManagersParametersFactoryBean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSslContextParametersFactoryBean_KeyManagers()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='keyManagers' namespace='##targetNamespace'"
     * @generated
     */
	KeyManagersParametersFactoryBean getKeyManagers();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getKeyManagers <em>Key Managers</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key Managers</em>' containment reference.
     * @see #getKeyManagers()
     * @generated
     */
	void setKeyManagers(KeyManagersParametersFactoryBean value);

	/**
     * Returns the value of the '<em><b>Trust Managers</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trust Managers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Trust Managers</em>' containment reference.
     * @see #setTrustManagers(TrustManagersParametersFactoryBean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSslContextParametersFactoryBean_TrustManagers()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='trustManagers' namespace='##targetNamespace'"
     * @generated
     */
	TrustManagersParametersFactoryBean getTrustManagers();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getTrustManagers <em>Trust Managers</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trust Managers</em>' containment reference.
     * @see #getTrustManagers()
     * @generated
     */
	void setTrustManagers(TrustManagersParametersFactoryBean value);

	/**
     * Returns the value of the '<em><b>Secure Random</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secure Random</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Secure Random</em>' containment reference.
     * @see #setSecureRandom(SecureRandomParametersFactoryBean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSslContextParametersFactoryBean_SecureRandom()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='secureRandom' namespace='##targetNamespace'"
     * @generated
     */
	SecureRandomParametersFactoryBean getSecureRandom();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getSecureRandom <em>Secure Random</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Secure Random</em>' containment reference.
     * @see #getSecureRandom()
     * @generated
     */
	void setSecureRandom(SecureRandomParametersFactoryBean value);

	/**
     * Returns the value of the '<em><b>Client Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Client Parameters</em>' containment reference.
     * @see #setClientParameters(SslContextClientParametersFactoryBean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSslContextParametersFactoryBean_ClientParameters()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='clientParameters' namespace='##targetNamespace'"
     * @generated
     */
	SslContextClientParametersFactoryBean getClientParameters();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getClientParameters <em>Client Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Client Parameters</em>' containment reference.
     * @see #getClientParameters()
     * @generated
     */
	void setClientParameters(SslContextClientParametersFactoryBean value);

	/**
     * Returns the value of the '<em><b>Server Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Server Parameters</em>' containment reference.
     * @see #setServerParameters(SslContextServerParametersFactoryBean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSslContextParametersFactoryBean_ServerParameters()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='serverParameters' namespace='##targetNamespace'"
     * @generated
     */
	SslContextServerParametersFactoryBean getServerParameters();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getServerParameters <em>Server Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Server Parameters</em>' containment reference.
     * @see #getServerParameters()
     * @generated
     */
	void setServerParameters(SslContextServerParametersFactoryBean value);

	/**
     * Returns the value of the '<em><b>Provider</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Provider</em>' attribute.
     * @see #setProvider(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSslContextParametersFactoryBean_Provider()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='provider'"
     * @generated
     */
	String getProvider();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getProvider <em>Provider</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Provider</em>' attribute.
     * @see #getProvider()
     * @generated
     */
	void setProvider(String value);

	/**
     * Returns the value of the '<em><b>Secure Socket Protocol</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secure Socket Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Secure Socket Protocol</em>' attribute.
     * @see #setSecureSocketProtocol(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSslContextParametersFactoryBean_SecureSocketProtocol()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='secureSocketProtocol'"
     * @generated
     */
	String getSecureSocketProtocol();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getSecureSocketProtocol <em>Secure Socket Protocol</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Secure Socket Protocol</em>' attribute.
     * @see #getSecureSocketProtocol()
     * @generated
     */
	void setSecureSocketProtocol(String value);

	/**
     * Returns the value of the '<em><b>Session Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Session Timeout</em>' attribute.
     * @see #setSessionTimeout(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSslContextParametersFactoryBean_SessionTimeout()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='sessionTimeout'"
     * @generated
     */
	String getSessionTimeout();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextParametersFactoryBean#getSessionTimeout <em>Session Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Session Timeout</em>' attribute.
     * @see #getSessionTimeout()
     * @generated
     */
	void setSessionTimeout(String value);

} // SslContextParametersFactoryBean
