/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validates Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType#getValidateGroup <em>Validate Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType#getValidate <em>Validate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getValidatesType()
 * @model extendedMetaData="name='ValidatesType' kind='elementOnly'"
 * @generated
 */
public interface ValidatesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Validate Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate Group</em>' attribute list.
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getValidatesType_ValidateGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='validate:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getValidateGroup();

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getValidatesType_Validate()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='validate' namespace='##targetNamespace' group='validate:group'"
	 * @generated
	 */
	EList<ValidateType> getValidate();

} // ValidatesType
