/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Service#getPromote <em>Promote</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getService()
 * @model extendedMetaData="name='Service' kind='elementOnly'"
 * @generated
 */
public interface Service extends Contract {
	/**
	 * Returns the value of the '<em><b>Promote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Promote</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promote</em>' reference.
	 * @see #setPromote(ComponentService)
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getService_Promote()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='attribute' name='promote'"
	 * @generated
	 */
	ComponentService getPromote();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Service#getPromote <em>Promote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promote</em>' reference.
	 * @see #getPromote()
	 * @generated
	 */
	void setPromote(ComponentService value);

} // Service
