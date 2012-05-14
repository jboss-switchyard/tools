/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aop Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AopDefinition#getAfterFinallyUri <em>After Finally Uri</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AopDefinition#getAfterUri <em>After Uri</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AopDefinition#getBeforeUri <em>Before Uri</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AopDefinition#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAopDefinition()
 * @model extendedMetaData="name='aopDefinition' kind='elementOnly'"
 * @generated
 */
public interface AopDefinition extends Output {
	/**
     * Returns the value of the '<em><b>After Finally Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Finally Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>After Finally Uri</em>' attribute.
     * @see #setAfterFinallyUri(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAopDefinition_AfterFinallyUri()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='afterFinallyUri'"
     * @generated
     */
	String getAfterFinallyUri();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AopDefinition#getAfterFinallyUri <em>After Finally Uri</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>After Finally Uri</em>' attribute.
     * @see #getAfterFinallyUri()
     * @generated
     */
	void setAfterFinallyUri(String value);

	/**
     * Returns the value of the '<em><b>After Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>After Uri</em>' attribute.
     * @see #setAfterUri(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAopDefinition_AfterUri()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='afterUri'"
     * @generated
     */
	String getAfterUri();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AopDefinition#getAfterUri <em>After Uri</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>After Uri</em>' attribute.
     * @see #getAfterUri()
     * @generated
     */
	void setAfterUri(String value);

	/**
     * Returns the value of the '<em><b>Before Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Before Uri</em>' attribute.
     * @see #setBeforeUri(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAopDefinition_BeforeUri()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='beforeUri'"
     * @generated
     */
	String getBeforeUri();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AopDefinition#getBeforeUri <em>Before Uri</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Before Uri</em>' attribute.
     * @see #getBeforeUri()
     * @generated
     */
	void setBeforeUri(String value);

	/**
     * Returns the value of the '<em><b>Any Attribute2</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Any Attribute2</em>' attribute list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAopDefinition_AnyAttribute2()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':67' processing='skip'"
     * @generated
     */
	FeatureMap getAnyAttribute2();

} // AopDefinition
