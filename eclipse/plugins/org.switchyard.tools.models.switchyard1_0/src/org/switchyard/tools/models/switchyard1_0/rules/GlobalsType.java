/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.rules;

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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.GlobalsType#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getGlobalsType()
 * @model extendedMetaData="name='GlobalsType' kind='elementOnly'"
 * @generated
 */
public interface GlobalsType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Mapping</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.rules.MappingType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mapping</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mapping</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getGlobalsType_Mapping()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='mapping' namespace='##targetNamespace'"
     * @generated
     */
    EList<MappingType> getMapping();

} // GlobalsType
