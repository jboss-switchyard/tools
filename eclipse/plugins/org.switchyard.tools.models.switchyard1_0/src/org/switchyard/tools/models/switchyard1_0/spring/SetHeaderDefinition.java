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
 * A representation of the model object '<em><b>Set Header Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SetHeaderDefinition#getHeaderName <em>Header Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SetHeaderDefinition#getAnyAttribute3 <em>Any Attribute3</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSetHeaderDefinition()
 * @model extendedMetaData="name='setHeaderDefinition' kind='elementOnly'"
 * @generated
 */
public interface SetHeaderDefinition extends NoOutputExpressionNode {
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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSetHeaderDefinition_HeaderName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='headerName'"
	 * @generated
	 */
	String getHeaderName();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SetHeaderDefinition#getHeaderName <em>Header Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Name</em>' attribute.
	 * @see #getHeaderName()
	 * @generated
	 */
	void setHeaderName(String value);

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSetHeaderDefinition_AnyAttribute3()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':48' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute3();

} // SetHeaderDefinition
