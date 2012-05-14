/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssl Context Server Parameters Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextServerParametersFactoryBean#getCipherSuites <em>Cipher Suites</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextServerParametersFactoryBean#getCipherSuitesFilter <em>Cipher Suites Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextServerParametersFactoryBean#getSecureSocketProtocols <em>Secure Socket Protocols</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextServerParametersFactoryBean#getSecureSocketProtocolsFilter <em>Secure Socket Protocols Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextServerParametersFactoryBean#getClientAuthentication <em>Client Authentication</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextServerParametersFactoryBean#getSessionTimeout <em>Session Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSslContextServerParametersFactoryBean()
 * @model extendedMetaData="name='sslContextServerParametersFactoryBean' kind='elementOnly'"
 * @generated
 */
public interface SslContextServerParametersFactoryBean extends AbstractJsseUtilFactoryBean {
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSslContextServerParametersFactoryBean_CipherSuites()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='cipherSuites' namespace='##targetNamespace'"
     * @generated
     */
	CipherSuitesParameters getCipherSuites();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextServerParametersFactoryBean#getCipherSuites <em>Cipher Suites</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSslContextServerParametersFactoryBean_CipherSuitesFilter()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='cipherSuitesFilter' namespace='##targetNamespace'"
     * @generated
     */
	FilterParameters getCipherSuitesFilter();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextServerParametersFactoryBean#getCipherSuitesFilter <em>Cipher Suites Filter</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSslContextServerParametersFactoryBean_SecureSocketProtocols()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='secureSocketProtocols' namespace='##targetNamespace'"
     * @generated
     */
	SecureSocketProtocolsParameters getSecureSocketProtocols();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextServerParametersFactoryBean#getSecureSocketProtocols <em>Secure Socket Protocols</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSslContextServerParametersFactoryBean_SecureSocketProtocolsFilter()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='secureSocketProtocolsFilter' namespace='##targetNamespace'"
     * @generated
     */
	FilterParameters getSecureSocketProtocolsFilter();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextServerParametersFactoryBean#getSecureSocketProtocolsFilter <em>Secure Socket Protocols Filter</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Secure Socket Protocols Filter</em>' containment reference.
     * @see #getSecureSocketProtocolsFilter()
     * @generated
     */
	void setSecureSocketProtocolsFilter(FilterParameters value);

	/**
     * Returns the value of the '<em><b>Client Authentication</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Authentication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Client Authentication</em>' attribute.
     * @see #setClientAuthentication(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSslContextServerParametersFactoryBean_ClientAuthentication()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='clientAuthentication'"
     * @generated
     */
	String getClientAuthentication();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextServerParametersFactoryBean#getClientAuthentication <em>Client Authentication</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Client Authentication</em>' attribute.
     * @see #getClientAuthentication()
     * @generated
     */
	void setClientAuthentication(String value);

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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSslContextServerParametersFactoryBean_SessionTimeout()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='sessionTimeout'"
     * @generated
     */
	String getSessionTimeout();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SslContextServerParametersFactoryBean#getSessionTimeout <em>Session Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Session Timeout</em>' attribute.
     * @see #getSessionTimeout()
     * @generated
     */
	void setSessionTimeout(String value);

} // SslContextServerParametersFactoryBean
