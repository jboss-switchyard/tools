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
 * A representation of the model object '<em><b>Sort Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SortDefinition#getComparatorRef <em>Comparator Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SortDefinition#getAnyAttribute3 <em>Any Attribute3</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSortDefinition()
 * @model extendedMetaData="name='sortDefinition' kind='elementOnly'"
 * @generated
 */
public interface SortDefinition extends NoOutputExpressionNode {
	/**
     * Returns the value of the '<em><b>Comparator Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparator Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Comparator Ref</em>' attribute.
     * @see #setComparatorRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSortDefinition_ComparatorRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='comparatorRef'"
     * @generated
     */
	String getComparatorRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SortDefinition#getComparatorRef <em>Comparator Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Comparator Ref</em>' attribute.
     * @see #getComparatorRef()
     * @generated
     */
	void setComparatorRef(String value);

	/**
     * Returns the value of the '<em><b>Any Attribute3</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Any Attribute3</em>' attribute list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSortDefinition_AnyAttribute3()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':48' processing='skip'"
     * @generated
     */
	FeatureMap getAnyAttribute3();

} // SortDefinition
