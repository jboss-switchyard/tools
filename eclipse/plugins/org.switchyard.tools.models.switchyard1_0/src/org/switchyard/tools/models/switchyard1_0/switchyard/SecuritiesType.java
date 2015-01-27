/**
 */
package org.switchyard.tools.models.switchyard1_0.switchyard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Securities Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecuritiesType#getSecurity <em>Security</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getSecuritiesType()
 * @model extendedMetaData="name='SecuritiesType' kind='elementOnly'"
 * @generated
 */
public interface SecuritiesType extends EObject {
    /**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Security</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getSecuritiesType_Security()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<SecurityType> getSecurity();

} // SecuritiesType
