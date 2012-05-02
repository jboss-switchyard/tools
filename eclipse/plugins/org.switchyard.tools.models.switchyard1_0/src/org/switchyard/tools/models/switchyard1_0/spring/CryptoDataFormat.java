/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crypto Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#getAlgorithmParameterRef <em>Algorithm Parameter Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#getBuffersize <em>Buffersize</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#getCryptoProvider <em>Crypto Provider</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#getInitVectorRef <em>Init Vector Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#isInline <em>Inline</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#getKeyRef <em>Key Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#getMacAlgorithm <em>Mac Algorithm</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#isShouldAppendHMAC <em>Should Append HMAC</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCryptoDataFormat()
 * @model extendedMetaData="name='cryptoDataFormat' kind='empty'"
 * @generated
 */
public interface CryptoDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCryptoDataFormat_Algorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='algorithm'"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Algorithm Parameter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm Parameter Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm Parameter Ref</em>' attribute.
	 * @see #setAlgorithmParameterRef(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCryptoDataFormat_AlgorithmParameterRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='algorithmParameterRef'"
	 * @generated
	 */
	String getAlgorithmParameterRef();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#getAlgorithmParameterRef <em>Algorithm Parameter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Parameter Ref</em>' attribute.
	 * @see #getAlgorithmParameterRef()
	 * @generated
	 */
	void setAlgorithmParameterRef(String value);

	/**
	 * Returns the value of the '<em><b>Buffersize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffersize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffersize</em>' attribute.
	 * @see #isSetBuffersize()
	 * @see #unsetBuffersize()
	 * @see #setBuffersize(int)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCryptoDataFormat_Buffersize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='buffersize'"
	 * @generated
	 */
	int getBuffersize();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#getBuffersize <em>Buffersize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffersize</em>' attribute.
	 * @see #isSetBuffersize()
	 * @see #unsetBuffersize()
	 * @see #getBuffersize()
	 * @generated
	 */
	void setBuffersize(int value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#getBuffersize <em>Buffersize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBuffersize()
	 * @see #getBuffersize()
	 * @see #setBuffersize(int)
	 * @generated
	 */
	void unsetBuffersize();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#getBuffersize <em>Buffersize</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Buffersize</em>' attribute is set.
	 * @see #unsetBuffersize()
	 * @see #getBuffersize()
	 * @see #setBuffersize(int)
	 * @generated
	 */
	boolean isSetBuffersize();

	/**
	 * Returns the value of the '<em><b>Crypto Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crypto Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crypto Provider</em>' attribute.
	 * @see #setCryptoProvider(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCryptoDataFormat_CryptoProvider()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='cryptoProvider'"
	 * @generated
	 */
	String getCryptoProvider();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#getCryptoProvider <em>Crypto Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crypto Provider</em>' attribute.
	 * @see #getCryptoProvider()
	 * @generated
	 */
	void setCryptoProvider(String value);

	/**
	 * Returns the value of the '<em><b>Init Vector Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Vector Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Vector Ref</em>' attribute.
	 * @see #setInitVectorRef(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCryptoDataFormat_InitVectorRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='initVectorRef'"
	 * @generated
	 */
	String getInitVectorRef();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#getInitVectorRef <em>Init Vector Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Vector Ref</em>' attribute.
	 * @see #getInitVectorRef()
	 * @generated
	 */
	void setInitVectorRef(String value);

	/**
	 * Returns the value of the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inline</em>' attribute.
	 * @see #isSetInline()
	 * @see #unsetInline()
	 * @see #setInline(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCryptoDataFormat_Inline()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='inline'"
	 * @generated
	 */
	boolean isInline();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#isInline <em>Inline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inline</em>' attribute.
	 * @see #isSetInline()
	 * @see #unsetInline()
	 * @see #isInline()
	 * @generated
	 */
	void setInline(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#isInline <em>Inline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInline()
	 * @see #isInline()
	 * @see #setInline(boolean)
	 * @generated
	 */
	void unsetInline();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#isInline <em>Inline</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inline</em>' attribute is set.
	 * @see #unsetInline()
	 * @see #isInline()
	 * @see #setInline(boolean)
	 * @generated
	 */
	boolean isSetInline();

	/**
	 * Returns the value of the '<em><b>Key Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Ref</em>' attribute.
	 * @see #setKeyRef(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCryptoDataFormat_KeyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='keyRef'"
	 * @generated
	 */
	String getKeyRef();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#getKeyRef <em>Key Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Ref</em>' attribute.
	 * @see #getKeyRef()
	 * @generated
	 */
	void setKeyRef(String value);

	/**
	 * Returns the value of the '<em><b>Mac Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mac Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mac Algorithm</em>' attribute.
	 * @see #setMacAlgorithm(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCryptoDataFormat_MacAlgorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='macAlgorithm'"
	 * @generated
	 */
	String getMacAlgorithm();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#getMacAlgorithm <em>Mac Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac Algorithm</em>' attribute.
	 * @see #getMacAlgorithm()
	 * @generated
	 */
	void setMacAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Should Append HMAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Should Append HMAC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Should Append HMAC</em>' attribute.
	 * @see #isSetShouldAppendHMAC()
	 * @see #unsetShouldAppendHMAC()
	 * @see #setShouldAppendHMAC(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCryptoDataFormat_ShouldAppendHMAC()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='shouldAppendHMAC'"
	 * @generated
	 */
	boolean isShouldAppendHMAC();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#isShouldAppendHMAC <em>Should Append HMAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Should Append HMAC</em>' attribute.
	 * @see #isSetShouldAppendHMAC()
	 * @see #unsetShouldAppendHMAC()
	 * @see #isShouldAppendHMAC()
	 * @generated
	 */
	void setShouldAppendHMAC(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#isShouldAppendHMAC <em>Should Append HMAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShouldAppendHMAC()
	 * @see #isShouldAppendHMAC()
	 * @see #setShouldAppendHMAC(boolean)
	 * @generated
	 */
	void unsetShouldAppendHMAC();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CryptoDataFormat#isShouldAppendHMAC <em>Should Append HMAC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Should Append HMAC</em>' attribute is set.
	 * @see #unsetShouldAppendHMAC()
	 * @see #isShouldAppendHMAC()
	 * @see #setShouldAppendHMAC(boolean)
	 * @generated
	 */
	boolean isSetShouldAppendHMAC();

} // CryptoDataFormat
