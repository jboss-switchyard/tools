/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Security Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat#getKeyCipherAlgorithm <em>Key Cipher Algorithm</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat#getKeyOrTrustStoreParametersId <em>Key Or Trust Store Parameters Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat#getPassPhrase <em>Pass Phrase</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat#getRecipientKeyAlias <em>Recipient Key Alias</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat#getSecureTag <em>Secure Tag</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat#isSecureTagContents <em>Secure Tag Contents</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat#getXmlCipherAlgorithm <em>Xml Cipher Algorithm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXmlSecurityDataFormat()
 * @model extendedMetaData="name='xmlSecurityDataFormat' kind='empty'"
 * @generated
 */
public interface XmlSecurityDataFormat extends DataFormat {
	/**
     * Returns the value of the '<em><b>Key Cipher Algorithm</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Cipher Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Key Cipher Algorithm</em>' attribute.
     * @see #setKeyCipherAlgorithm(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXmlSecurityDataFormat_KeyCipherAlgorithm()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='keyCipherAlgorithm'"
     * @generated
     */
	String getKeyCipherAlgorithm();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat#getKeyCipherAlgorithm <em>Key Cipher Algorithm</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key Cipher Algorithm</em>' attribute.
     * @see #getKeyCipherAlgorithm()
     * @generated
     */
	void setKeyCipherAlgorithm(String value);

	/**
     * Returns the value of the '<em><b>Key Or Trust Store Parameters Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Key Or Trust Store Parameters Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Key Or Trust Store Parameters Id</em>' attribute.
     * @see #setKeyOrTrustStoreParametersId(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXmlSecurityDataFormat_KeyOrTrustStoreParametersId()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='keyOrTrustStoreParametersId'"
     * @generated
     */
    String getKeyOrTrustStoreParametersId();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat#getKeyOrTrustStoreParametersId <em>Key Or Trust Store Parameters Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key Or Trust Store Parameters Id</em>' attribute.
     * @see #getKeyOrTrustStoreParametersId()
     * @generated
     */
    void setKeyOrTrustStoreParametersId(String value);

    /**
     * Returns the value of the '<em><b>Pass Phrase</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pass Phrase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Pass Phrase</em>' attribute.
     * @see #setPassPhrase(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXmlSecurityDataFormat_PassPhrase()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='passPhrase'"
     * @generated
     */
	String getPassPhrase();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat#getPassPhrase <em>Pass Phrase</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pass Phrase</em>' attribute.
     * @see #getPassPhrase()
     * @generated
     */
	void setPassPhrase(String value);

	/**
     * Returns the value of the '<em><b>Recipient Key Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient Key Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Recipient Key Alias</em>' attribute.
     * @see #setRecipientKeyAlias(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXmlSecurityDataFormat_RecipientKeyAlias()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='recipientKeyAlias'"
     * @generated
     */
	String getRecipientKeyAlias();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat#getRecipientKeyAlias <em>Recipient Key Alias</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Recipient Key Alias</em>' attribute.
     * @see #getRecipientKeyAlias()
     * @generated
     */
	void setRecipientKeyAlias(String value);

	/**
     * Returns the value of the '<em><b>Secure Tag</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secure Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Secure Tag</em>' attribute.
     * @see #setSecureTag(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXmlSecurityDataFormat_SecureTag()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='secureTag'"
     * @generated
     */
	String getSecureTag();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat#getSecureTag <em>Secure Tag</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Secure Tag</em>' attribute.
     * @see #getSecureTag()
     * @generated
     */
	void setSecureTag(String value);

	/**
     * Returns the value of the '<em><b>Secure Tag Contents</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secure Tag Contents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Secure Tag Contents</em>' attribute.
     * @see #isSetSecureTagContents()
     * @see #unsetSecureTagContents()
     * @see #setSecureTagContents(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXmlSecurityDataFormat_SecureTagContents()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='secureTagContents'"
     * @generated
     */
	boolean isSecureTagContents();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat#isSecureTagContents <em>Secure Tag Contents</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Secure Tag Contents</em>' attribute.
     * @see #isSetSecureTagContents()
     * @see #unsetSecureTagContents()
     * @see #isSecureTagContents()
     * @generated
     */
	void setSecureTagContents(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat#isSecureTagContents <em>Secure Tag Contents</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetSecureTagContents()
     * @see #isSecureTagContents()
     * @see #setSecureTagContents(boolean)
     * @generated
     */
	void unsetSecureTagContents();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat#isSecureTagContents <em>Secure Tag Contents</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Secure Tag Contents</em>' attribute is set.
     * @see #unsetSecureTagContents()
     * @see #isSecureTagContents()
     * @see #setSecureTagContents(boolean)
     * @generated
     */
	boolean isSetSecureTagContents();

	/**
     * Returns the value of the '<em><b>Xml Cipher Algorithm</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml Cipher Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Xml Cipher Algorithm</em>' attribute.
     * @see #setXmlCipherAlgorithm(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getXmlSecurityDataFormat_XmlCipherAlgorithm()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='xmlCipherAlgorithm'"
     * @generated
     */
	String getXmlCipherAlgorithm();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.XmlSecurityDataFormat#getXmlCipherAlgorithm <em>Xml Cipher Algorithm</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xml Cipher Algorithm</em>' attribute.
     * @see #getXmlCipherAlgorithm()
     * @generated
     */
	void setXmlCipherAlgorithm(String value);

} // XmlSecurityDataFormat
