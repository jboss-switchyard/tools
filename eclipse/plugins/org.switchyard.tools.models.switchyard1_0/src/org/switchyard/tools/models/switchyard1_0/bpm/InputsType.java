/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inputs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.InputsType#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getInputsType()
 * @model extendedMetaData="name='InputsType' kind='elementOnly'"
 * @generated
 */
public interface InputsType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Input</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.bpm.InputMappingType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getInputsType_Input()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
     * @generated
     */
    EList<InputMappingType> getInput();

} // InputsType
