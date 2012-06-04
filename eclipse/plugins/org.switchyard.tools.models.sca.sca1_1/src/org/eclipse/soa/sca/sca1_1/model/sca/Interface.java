/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import java.util.List;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Interface#getPolicySets <em>Policy Sets</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Interface#isRemotable <em>Remotable</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Interface#getRequires <em>Requires</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getInterface()
 * @model abstract="true"
 *        extendedMetaData="name='Interface' kind='elementOnly'"
 * @generated
 */
public interface Interface extends CommonExtensionBase, ExtendableType {
	/**
     * Returns the value of the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Sets</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Policy Sets</em>' attribute.
     * @see #setPolicySets(List)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getInterface_PolicySets()
     * @model dataType="org.eclipse.soa.sca.sca1_1.model.sca.ListOfQNames" many="false"
     *        extendedMetaData="kind='attribute' name='policySets'"
     * @generated
     */
	List<QName> getPolicySets();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Interface#getPolicySets <em>Policy Sets</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Policy Sets</em>' attribute.
     * @see #getPolicySets()
     * @generated
     */
	void setPolicySets(List<QName> value);

	/**
     * Returns the value of the '<em><b>Remotable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remotable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Remotable</em>' attribute.
     * @see #isSetRemotable()
     * @see #unsetRemotable()
     * @see #setRemotable(boolean)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getInterface_Remotable()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='remotable'"
     * @generated
     */
	boolean isRemotable();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Interface#isRemotable <em>Remotable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remotable</em>' attribute.
     * @see #isSetRemotable()
     * @see #unsetRemotable()
     * @see #isRemotable()
     * @generated
     */
	void setRemotable(boolean value);

	/**
     * Unsets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Interface#isRemotable <em>Remotable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetRemotable()
     * @see #isRemotable()
     * @see #setRemotable(boolean)
     * @generated
     */
	void unsetRemotable();

	/**
     * Returns whether the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Interface#isRemotable <em>Remotable</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Remotable</em>' attribute is set.
     * @see #unsetRemotable()
     * @see #isRemotable()
     * @see #setRemotable(boolean)
     * @generated
     */
	boolean isSetRemotable();

	/**
     * Returns the value of the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Requires</em>' attribute.
     * @see #setRequires(List)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getInterface_Requires()
     * @model dataType="org.eclipse.soa.sca.sca1_1.model.sca.ListOfQNames" many="false"
     *        extendedMetaData="kind='attribute' name='requires'"
     * @generated
     */
	List<QName> getRequires();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Interface#getRequires <em>Requires</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Requires</em>' attribute.
     * @see #getRequires()
     * @generated
     */
	void setRequires(List<QName> value);

} // Interface
