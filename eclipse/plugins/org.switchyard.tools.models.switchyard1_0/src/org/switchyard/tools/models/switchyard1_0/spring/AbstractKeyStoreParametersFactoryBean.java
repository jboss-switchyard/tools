/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Key Store Parameters Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractKeyStoreParametersFactoryBean#getPassword <em>Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractKeyStoreParametersFactoryBean#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractKeyStoreParametersFactoryBean#getResource <em>Resource</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractKeyStoreParametersFactoryBean#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractKeyStoreParametersFactoryBean()
 * @model abstract="true"
 *        extendedMetaData="name='abstractKeyStoreParametersFactoryBean' kind='empty'"
 * @generated
 */
public interface AbstractKeyStoreParametersFactoryBean extends AbstractJsseUtilFactoryBean {
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractKeyStoreParametersFactoryBean_Password()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='password'"
     * @generated
     */
	String getPassword();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractKeyStoreParametersFactoryBean#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' attribute.
     * @see #getPassword()
     * @generated
     */
	void setPassword(String value);

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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractKeyStoreParametersFactoryBean_Provider()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='provider'"
     * @generated
     */
	String getProvider();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractKeyStoreParametersFactoryBean#getProvider <em>Provider</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Provider</em>' attribute.
     * @see #getProvider()
     * @generated
     */
	void setProvider(String value);

	/**
     * Returns the value of the '<em><b>Resource</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Resource</em>' attribute.
     * @see #setResource(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractKeyStoreParametersFactoryBean_Resource()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='resource'"
     * @generated
     */
	String getResource();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractKeyStoreParametersFactoryBean#getResource <em>Resource</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource</em>' attribute.
     * @see #getResource()
     * @generated
     */
	void setResource(String value);

	/**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractKeyStoreParametersFactoryBean_Type()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
	String getType();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractKeyStoreParametersFactoryBean#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
	void setType(String value);

} // AbstractKeyStoreParametersFactoryBean
