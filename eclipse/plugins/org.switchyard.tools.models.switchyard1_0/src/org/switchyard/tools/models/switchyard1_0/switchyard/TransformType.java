/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transform Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.TransformType#getFrom <em>From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.TransformType#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getTransformType()
 * @model abstract="true"
 *        extendedMetaData="name='TransformType' kind='empty'"
 * @generated
 */
public interface TransformType extends EObject {
	/**
     * Returns the value of the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' attribute.
     * @see #setFrom(String)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getTransformType_From()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='from'"
     * @generated
     */
	String getFrom();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.TransformType#getFrom <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' attribute.
     * @see #getFrom()
     * @generated
     */
	void setFrom(String value);

	/**
     * Returns the value of the '<em><b>To</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>To</em>' attribute.
     * @see #setTo(String)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getTransformType_To()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='to'"
     * @generated
     */
	String getTo();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.TransformType#getTo <em>To</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>To</em>' attribute.
     * @see #getTo()
     * @generated
     */
	void setTo(String value);

} // TransformType
