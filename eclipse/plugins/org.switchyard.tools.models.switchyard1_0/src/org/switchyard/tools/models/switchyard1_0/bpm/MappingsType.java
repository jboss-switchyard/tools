/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mappings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.MappingsType#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getMappingsType()
 * @model extendedMetaData="name='MappingsType' kind='elementOnly'"
 * @generated
 */
public interface MappingsType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Mapping</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.bpm.MappingType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mapping</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mapping</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getMappingsType_Mapping()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='mapping' namespace='##targetNamespace'"
     * @generated
     */
    EList<MappingType> getMapping();

} // MappingsType
