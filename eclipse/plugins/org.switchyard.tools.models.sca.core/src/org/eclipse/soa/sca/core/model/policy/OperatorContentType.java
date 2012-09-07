/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.core.model.policy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Content Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.OperatorContentType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.OperatorContentType#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.OperatorContentType#getAll <em>All</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.OperatorContentType#getExactlyOne <em>Exactly One</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.OperatorContentType#getPolicyReference <em>Policy Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.OperatorContentType#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.core.model.policy.PolicyPackage#getOperatorContentType()
 * @model extendedMetaData="name='OperatorContentType' kind='elementOnly'"
 * @generated
 */
public interface OperatorContentType extends EObject {
	/**
     * Returns the value of the '<em><b>Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Group</em>' attribute list.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyPackage#getOperatorContentType_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:0'"
     * @generated
     */
	FeatureMap getGroup();

	/**
     * Returns the value of the '<em><b>Policy</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.soa.sca.core.model.policy.PolicyType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Policy</em>' containment reference list.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyPackage#getOperatorContentType_Policy()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='Policy' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<PolicyType> getPolicy();

	/**
     * Returns the value of the '<em><b>All</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.soa.sca.core.model.policy.OperatorContentType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>All</em>' containment reference list.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyPackage#getOperatorContentType_All()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='All' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<OperatorContentType> getAll();

	/**
     * Returns the value of the '<em><b>Exactly One</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.soa.sca.core.model.policy.OperatorContentType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exactly One</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Exactly One</em>' containment reference list.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyPackage#getOperatorContentType_ExactlyOne()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ExactlyOne' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<OperatorContentType> getExactlyOne();

	/**
     * Returns the value of the '<em><b>Policy Reference</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.soa.sca.core.model.policy.PolicyReferenceType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Policy Reference</em>' containment reference list.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyPackage#getOperatorContentType_PolicyReference()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='PolicyReference' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
	EList<PolicyReferenceType> getPolicyReference();

	/**
     * Returns the value of the '<em><b>Any</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Any</em>' attribute list.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyPackage#getOperatorContentType_Any()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':5' processing='lax' group='#group:0'"
     * @generated
     */
	FeatureMap getAny();

} // OperatorContentType
