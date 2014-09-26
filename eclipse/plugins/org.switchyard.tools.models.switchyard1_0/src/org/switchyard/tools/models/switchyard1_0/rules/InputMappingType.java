/**
 */
package org.switchyard.tools.models.switchyard1_0.rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.InputMappingType#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getInputMappingType()
 * @model extendedMetaData="name='InputMappingType' kind='elementOnly'"
 * @generated
 */
public interface InputMappingType extends MappingType {
    /**
     * Returns the value of the '<em><b>Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output</em>' attribute.
     * @see #setOutput(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getInputMappingType_Output()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='output'"
     * @generated
     */
    String getOutput();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.InputMappingType#getOutput <em>Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output</em>' attribute.
     * @see #getOutput()
     * @generated
     */
    void setOutput(String value);

} // InputMappingType
