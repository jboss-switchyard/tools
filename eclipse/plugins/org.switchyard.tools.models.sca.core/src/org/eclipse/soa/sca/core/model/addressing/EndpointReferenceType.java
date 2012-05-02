/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.core.model.addressing;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType#getReferenceParameters <em>Reference Parameters</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getEndpointReferenceType()
 * @model extendedMetaData="name='EndpointReferenceType' kind='elementOnly'"
 * @generated
 */
public interface EndpointReferenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(AttributedURIType)
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getEndpointReferenceType_Address()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Address' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedURIType getAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(AttributedURIType value);

	/**
	 * Returns the value of the '<em><b>Reference Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Parameters</em>' containment reference.
	 * @see #setReferenceParameters(ReferenceParametersType)
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getEndpointReferenceType_ReferenceParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReferenceParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceParametersType getReferenceParameters();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType#getReferenceParameters <em>Reference Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Parameters</em>' containment reference.
	 * @see #getReferenceParameters()
	 * @generated
	 */
	void setReferenceParameters(ReferenceParametersType value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(MetadataType)
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getEndpointReferenceType_Metadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	MetadataType getMetadata();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(MetadataType value);

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
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getEndpointReferenceType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getEndpointReferenceType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // EndpointReferenceType
