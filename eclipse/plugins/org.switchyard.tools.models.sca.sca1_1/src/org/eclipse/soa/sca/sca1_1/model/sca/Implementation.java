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
 * A representation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Implementation#getPolicySets <em>Policy Sets</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.Implementation#getRequires <em>Requires</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getImplementation()
 * @model abstract="true"
 *        extendedMetaData="name='Implementation' kind='elementOnly'"
 * @generated
 */
public interface Implementation extends CommonExtensionBase {
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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getImplementation_PolicySets()
	 * @model dataType="org.eclipse.soa.sca.sca1_1.model.sca.ListOfQNames" many="false"
	 *        extendedMetaData="kind='attribute' name='policySets'"
	 * @generated
	 */
	List<QName> getPolicySets();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Implementation#getPolicySets <em>Policy Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Sets</em>' attribute.
	 * @see #getPolicySets()
	 * @generated
	 */
	void setPolicySets(List<QName> value);

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
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getImplementation_Requires()
	 * @model dataType="org.eclipse.soa.sca.sca1_1.model.sca.ListOfQNames" many="false"
	 *        extendedMetaData="kind='attribute' name='requires'"
	 * @generated
	 */
	List<QName> getRequires();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Implementation#getRequires <em>Requires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires</em>' attribute.
	 * @see #getRequires()
	 * @generated
	 */
	void setRequires(List<QName> value);

} // Implementation
