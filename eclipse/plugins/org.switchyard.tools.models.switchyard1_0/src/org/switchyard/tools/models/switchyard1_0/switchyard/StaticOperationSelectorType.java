/**
 */
package org.switchyard.tools.models.switchyard1_0.switchyard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Operation Selector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.StaticOperationSelectorType#getOperationName <em>Operation Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getStaticOperationSelectorType()
 * @model extendedMetaData="name='StaticOperationSelectorType' kind='empty'"
 * @generated
 */
public interface StaticOperationSelectorType extends SwitchYardOperationSelectorType {
	/**
     * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Operation Name</em>' attribute.
     * @see #setOperationName(String)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getStaticOperationSelectorType_OperationName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='operationName'"
     * @generated
     */
	String getOperationName();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.StaticOperationSelectorType#getOperationName <em>Operation Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation Name</em>' attribute.
     * @see #getOperationName()
     * @generated
     */
	void setOperationName(String value);

} // StaticOperationSelectorType
