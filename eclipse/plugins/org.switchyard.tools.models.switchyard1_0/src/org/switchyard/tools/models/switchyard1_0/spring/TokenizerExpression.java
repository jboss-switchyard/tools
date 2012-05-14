/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tokenizer Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.TokenizerExpression#getHeaderName <em>Header Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.TokenizerExpression#isRegex <em>Regex</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.TokenizerExpression#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getTokenizerExpression()
 * @model extendedMetaData="name='tokenizerExpression' kind='simple'"
 * @generated
 */
public interface TokenizerExpression extends Expression {
	/**
     * Returns the value of the '<em><b>Header Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Header Name</em>' attribute.
     * @see #setHeaderName(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getTokenizerExpression_HeaderName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='headerName'"
     * @generated
     */
	String getHeaderName();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.TokenizerExpression#getHeaderName <em>Header Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Header Name</em>' attribute.
     * @see #getHeaderName()
     * @generated
     */
	void setHeaderName(String value);

	/**
     * Returns the value of the '<em><b>Regex</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Regex</em>' attribute.
     * @see #isSetRegex()
     * @see #unsetRegex()
     * @see #setRegex(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getTokenizerExpression_Regex()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='regex'"
     * @generated
     */
	boolean isRegex();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.TokenizerExpression#isRegex <em>Regex</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Regex</em>' attribute.
     * @see #isSetRegex()
     * @see #unsetRegex()
     * @see #isRegex()
     * @generated
     */
	void setRegex(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.TokenizerExpression#isRegex <em>Regex</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetRegex()
     * @see #isRegex()
     * @see #setRegex(boolean)
     * @generated
     */
	void unsetRegex();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.TokenizerExpression#isRegex <em>Regex</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Regex</em>' attribute is set.
     * @see #unsetRegex()
     * @see #isRegex()
     * @see #setRegex(boolean)
     * @generated
     */
	boolean isSetRegex();

	/**
     * Returns the value of the '<em><b>Token</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Token</em>' attribute.
     * @see #setToken(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getTokenizerExpression_Token()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='token'"
     * @generated
     */
	String getToken();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.TokenizerExpression#getToken <em>Token</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Token</em>' attribute.
     * @see #getToken()
     * @generated
     */
	void setToken(String value);

} // TokenizerExpression
