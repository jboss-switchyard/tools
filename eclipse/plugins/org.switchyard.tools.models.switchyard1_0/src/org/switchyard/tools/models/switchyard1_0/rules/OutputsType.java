/**
 */
package org.switchyard.tools.models.switchyard1_0.rules;

import org.eclipse.emf.common.util.EList;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outputs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.OutputsType#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getOutputsType()
 * @model extendedMetaData="name='OutputsType' kind='elementOnly'"
 * @generated
 */
public interface OutputsType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Output</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.rules.MappingType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getOutputsType_Output()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
     * @generated
     */
    EList<MappingType> getOutput();

} // OutputsType
