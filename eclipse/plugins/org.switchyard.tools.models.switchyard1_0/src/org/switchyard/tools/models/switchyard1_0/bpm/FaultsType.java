/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Faults Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.FaultsType#getFault <em>Fault</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getFaultsType()
 * @model extendedMetaData="name='FaultsType' kind='elementOnly'"
 * @generated
 */
public interface FaultsType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Fault</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.bpm.MappingType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fault</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fault</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getFaultsType_Fault()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='fault' namespace='##targetNamespace'"
     * @generated
     */
    EList<MappingType> getFault();

} // FaultsType
