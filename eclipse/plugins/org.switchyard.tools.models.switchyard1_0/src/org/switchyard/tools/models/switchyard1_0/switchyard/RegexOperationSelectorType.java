/**
 */
package org.switchyard.tools.models.switchyard1_0.switchyard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regex Operation Selector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 XPath Operation Selector Configuration.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.RegexOperationSelectorType#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getRegexOperationSelectorType()
 * @model extendedMetaData="name='RegexOperationSelectorType' kind='empty'"
 * @generated
 */
public interface RegexOperationSelectorType extends SwitchYardOperationSelectorType {
	/**
     * Returns the value of the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                             Regex expression.
     *                         
     * <!-- end-model-doc -->
     * @return the value of the '<em>Expression</em>' attribute.
     * @see #setExpression(String)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getRegexOperationSelectorType_Expression()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='expression'"
     * @generated
     */
	String getExpression();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.RegexOperationSelectorType#getExpression <em>Expression</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' attribute.
     * @see #getExpression()
     * @generated
     */
	void setExpression(String value);

} // RegexOperationSelectorType
