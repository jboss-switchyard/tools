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
 * A representation of the model object '<em><b>Transforms Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType#getTransformGroup <em>Transform Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType#getTransform <em>Transform</em>}</li>
 * </ul>
 *
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getTransformsType()
 * @model extendedMetaData="name='TransformsType' kind='elementOnly'"
 * @generated
 */
public interface TransformsType extends EObject {
	/**
     * Returns the value of the '<em><b>Transform Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Transform Group</em>' attribute list.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getTransformsType_TransformGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='transform:group' namespace='##targetNamespace'"
     * @generated
     */
	FeatureMap getTransformGroup();

	/**
     * Returns the value of the '<em><b>Transform</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.switchyard.TransformType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Transform</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getTransformsType_Transform()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='transform' namespace='##targetNamespace' group='transform:group'"
     * @generated
     */
	EList<TransformType> getTransform();

} // TransformsType
