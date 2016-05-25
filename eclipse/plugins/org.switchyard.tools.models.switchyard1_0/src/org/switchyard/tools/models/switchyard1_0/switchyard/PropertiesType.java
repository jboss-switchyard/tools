/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.PropertiesType#getProperty <em>Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.PropertiesType#getLoad <em>Load</em>}</li>
 * </ul>
 *
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getPropertiesType()
 * @model extendedMetaData="name='PropertiesType' kind='elementOnly'"
 * @generated
 */
public interface PropertiesType extends EObject {
	/**
     * Returns the value of the '<em><b>Property</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.switchyard.PropertyType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getPropertiesType_Property()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
     * @generated
     */
	EList<PropertyType> getProperty();

    /**
     * Returns the value of the '<em><b>Load</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Load</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Load</em>' attribute.
     * @see #setLoad(String)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getPropertiesType_Load()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='load'"
     * @generated
     */
    String getLoad();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.PropertiesType#getLoad <em>Load</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Load</em>' attribute.
     * @see #getLoad()
     * @generated
     */
    void setLoad(String value);

} // PropertiesType
