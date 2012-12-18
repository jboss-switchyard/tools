/**
 */
package org.switchyard.tools.models.switchyard1_0.rules;

import org.eclipse.emf.common.util.EList;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Listeners Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.ListenersType#getListener <em>Listener</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getListenersType()
 * @model extendedMetaData="name='ListenersType' kind='elementOnly'"
 * @generated
 */
public interface ListenersType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Listener</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.rules.ListenerType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Listener</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Listener</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getListenersType_Listener()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='listener' namespace='##targetNamespace'"
     * @generated
     */
    EList<ListenerType> getListener();

} // ListenersType
