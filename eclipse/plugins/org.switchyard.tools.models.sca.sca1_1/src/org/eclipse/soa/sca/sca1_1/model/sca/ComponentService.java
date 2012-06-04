/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentService#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getComponentService()
 * @model extendedMetaData="name='ComponentService' kind='elementOnly'"
 * @generated
 */
public interface ComponentService extends Contract {
	/**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getComponentService_Id()
     * @model default="" id="true" required="true" transient="true" volatile="true" derived="true"
     * @generated
     */
	String getId();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentService#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
	void setId(String value);

} // ComponentService
