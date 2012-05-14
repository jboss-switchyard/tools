/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Secure Random Parameters Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractSecureRandomParametersFactoryBean#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractSecureRandomParametersFactoryBean#getProvider <em>Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractSecureRandomParametersFactoryBean()
 * @model abstract="true"
 *        extendedMetaData="name='abstractSecureRandomParametersFactoryBean' kind='empty'"
 * @generated
 */
public interface AbstractSecureRandomParametersFactoryBean extends AbstractJsseUtilFactoryBean {
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractSecureRandomParametersFactoryBean_Algorithm()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='algorithm'"
     * @generated
     */
	String getAlgorithm();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractSecureRandomParametersFactoryBean#getAlgorithm <em>Algorithm</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Algorithm</em>' attribute.
     * @see #getAlgorithm()
     * @generated
     */
	void setAlgorithm(String value);

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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractSecureRandomParametersFactoryBean_Provider()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='provider'"
     * @generated
     */
	String getProvider();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractSecureRandomParametersFactoryBean#getProvider <em>Provider</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Provider</em>' attribute.
     * @see #getProvider()
     * @generated
     */
	void setProvider(String value);

} // AbstractSecureRandomParametersFactoryBean
