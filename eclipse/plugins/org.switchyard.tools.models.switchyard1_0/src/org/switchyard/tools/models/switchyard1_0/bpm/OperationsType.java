/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.OperationsType#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getOperationsType()
 * @model extendedMetaData="name='OperationsType' kind='elementOnly'"
 * @generated
 */
public interface OperationsType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.bpm.BPMOperationType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getOperationsType_Operation()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
     * @generated
     */
    EList<BPMOperationType> getOperation();

} // OperationsType
