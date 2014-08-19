/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extra Jaxb Classes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.ExtraJaxbClassesType#getExtraJaxbClass <em>Extra Jaxb Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getExtraJaxbClassesType()
 * @model extendedMetaData="name='ExtraJaxbClassesType' kind='elementOnly'"
 * @generated
 */
public interface ExtraJaxbClassesType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Extra Jaxb Class</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extra Jaxb Class</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extra Jaxb Class</em>' attribute list.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getExtraJaxbClassesType_ExtraJaxbClass()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='extraJaxbClass' namespace='##targetNamespace'"
     * @generated
     */
    EList<String> getExtraJaxbClass();

} // ExtraJaxbClassesType
