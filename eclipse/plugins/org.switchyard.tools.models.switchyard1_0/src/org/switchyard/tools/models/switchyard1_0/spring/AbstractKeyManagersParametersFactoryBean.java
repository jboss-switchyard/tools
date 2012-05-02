/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Key Managers Parameters Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractKeyManagersParametersFactoryBean#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractKeyManagersParametersFactoryBean#getKeyPassword <em>Key Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractKeyManagersParametersFactoryBean#getProvider <em>Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractKeyManagersParametersFactoryBean()
 * @model abstract="true"
 *        extendedMetaData="name='abstractKeyManagersParametersFactoryBean' kind='empty'"
 * @generated
 */
public interface AbstractKeyManagersParametersFactoryBean extends AbstractJsseUtilFactoryBean {
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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractKeyManagersParametersFactoryBean_Algorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='algorithm'"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractKeyManagersParametersFactoryBean#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Key Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Password</em>' attribute.
	 * @see #setKeyPassword(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractKeyManagersParametersFactoryBean_KeyPassword()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='keyPassword'"
	 * @generated
	 */
	String getKeyPassword();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractKeyManagersParametersFactoryBean#getKeyPassword <em>Key Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Password</em>' attribute.
	 * @see #getKeyPassword()
	 * @generated
	 */
	void setKeyPassword(String value);

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractKeyManagersParametersFactoryBean_Provider()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='provider'"
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractKeyManagersParametersFactoryBean#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

} // AbstractKeyManagersParametersFactoryBean
