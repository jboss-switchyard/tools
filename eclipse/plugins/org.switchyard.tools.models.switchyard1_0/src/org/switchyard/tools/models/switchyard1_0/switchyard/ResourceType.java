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
 * A representation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.ResourceType#getLocation <em>Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.ResourceType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getResourceType()
 * @model extendedMetaData="name='ResourceType' kind='empty'"
 * @generated
 */
public interface ResourceType extends EObject {
	/**
     * Returns the value of the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Location</em>' attribute.
     * @see #setLocation(String)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getResourceType_Location()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='location'"
     * @generated
     */
	String getLocation();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ResourceType#getLocation <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' attribute.
     * @see #getLocation()
     * @generated
     */
	void setLocation(String value);

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
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getResourceType_Type()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
	String getType();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ResourceType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
	void setType(String value);

} // ResourceType
