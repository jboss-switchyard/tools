/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.core.model.addressing;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage
 * @generated
 */
public interface AddressingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AddressingFactory eINSTANCE = org.eclipse.soa.sca.core.model.addressing.impl.AddressingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attributed QName Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attributed QName Type</em>'.
	 * @generated
	 */
	AttributedQNameType createAttributedQNameType();

	/**
	 * Returns a new object of class '<em>Attributed Unsigned Long Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attributed Unsigned Long Type</em>'.
	 * @generated
	 */
	AttributedUnsignedLongType createAttributedUnsignedLongType();

	/**
	 * Returns a new object of class '<em>Attributed URI Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attributed URI Type</em>'.
	 * @generated
	 */
	AttributedURIType createAttributedURIType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Endpoint Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Endpoint Reference Type</em>'.
	 * @generated
	 */
	EndpointReferenceType createEndpointReferenceType();

	/**
	 * Returns a new object of class '<em>Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata Type</em>'.
	 * @generated
	 */
	MetadataType createMetadataType();

	/**
	 * Returns a new object of class '<em>Problem Action Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Action Type</em>'.
	 * @generated
	 */
	ProblemActionType createProblemActionType();

	/**
	 * Returns a new object of class '<em>Reference Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Parameters Type</em>'.
	 * @generated
	 */
	ReferenceParametersType createReferenceParametersType();

	/**
	 * Returns a new object of class '<em>Relates To Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relates To Type</em>'.
	 * @generated
	 */
	RelatesToType createRelatesToType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AddressingPackage getAddressingPackage();

} //AddressingFactory
