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
 * A representation of the model object '<em><b>Loop Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.LoopDefinition#isCopy <em>Copy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.LoopDefinition#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getLoopDefinition()
 * @model extendedMetaData="name='loopDefinition' kind='elementOnly'"
 * @generated
 */
public interface LoopDefinition extends ExpressionNode {
	/**
	 * Returns the value of the '<em><b>Copy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy</em>' attribute.
	 * @see #isSetCopy()
	 * @see #unsetCopy()
	 * @see #setCopy(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getLoopDefinition_Copy()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='copy'"
	 * @generated
	 */
	boolean isCopy();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.LoopDefinition#isCopy <em>Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy</em>' attribute.
	 * @see #isSetCopy()
	 * @see #unsetCopy()
	 * @see #isCopy()
	 * @generated
	 */
	void setCopy(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.LoopDefinition#isCopy <em>Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCopy()
	 * @see #isCopy()
	 * @see #setCopy(boolean)
	 * @generated
	 */
	void unsetCopy();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.LoopDefinition#isCopy <em>Copy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Copy</em>' attribute is set.
	 * @see #unsetCopy()
	 * @see #isCopy()
	 * @see #setCopy(boolean)
	 * @generated
	 */
	boolean isSetCopy();

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getLoopDefinition_AnyAttribute2()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':47' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute2();

} // LoopDefinition
