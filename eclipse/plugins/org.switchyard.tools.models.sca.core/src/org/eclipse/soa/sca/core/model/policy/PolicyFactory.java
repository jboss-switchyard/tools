/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.core.model.policy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.soa.sca.core.model.policy.PolicyPackage
 * @generated
 */
public interface PolicyFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	PolicyFactory eINSTANCE = org.eclipse.soa.sca.core.model.policy.impl.PolicyFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Applies To Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Applies To Type</em>'.
     * @generated
     */
	AppliesToType createAppliesToType();

	/**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
	DocumentRoot createDocumentRoot();

	/**
     * Returns a new object of class '<em>Operator Content Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Operator Content Type</em>'.
     * @generated
     */
	OperatorContentType createOperatorContentType();

	/**
     * Returns a new object of class '<em>Attachment Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Attachment Type</em>'.
     * @generated
     */
	PolicyAttachmentType createPolicyAttachmentType();

	/**
     * Returns a new object of class '<em>Reference Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Reference Type</em>'.
     * @generated
     */
	PolicyReferenceType createPolicyReferenceType();

	/**
     * Returns a new object of class '<em>Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Type</em>'.
     * @generated
     */
	PolicyType createPolicyType();

	/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	PolicyPackage getPolicyPackage();

} //PolicyFactory
