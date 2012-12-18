/**
 */
package org.switchyard.tools.models.switchyard1_0.rules;

import org.eclipse.emf.common.util.EList;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.ActionsType#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getActionsType()
 * @model extendedMetaData="name='ActionsType' kind='elementOnly'"
 * @generated
 */
public interface ActionsType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Action</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Action</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getActionsType_Action()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
     * @generated
     */
    EList<ActionType1> getAction();

} // ActionsType
