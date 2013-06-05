/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Globals Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.GlobalsType#getGlobal <em>Global</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getGlobalsType()
 * @model extendedMetaData="name='GlobalsType' kind='elementOnly'"
 * @generated
 */
public interface GlobalsType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Global</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.bpm.MappingType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Global</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Global</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getGlobalsType_Global()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='global' namespace='##targetNamespace'"
     * @generated
     */
    EList<MappingType> getGlobal();

} // GlobalsType
