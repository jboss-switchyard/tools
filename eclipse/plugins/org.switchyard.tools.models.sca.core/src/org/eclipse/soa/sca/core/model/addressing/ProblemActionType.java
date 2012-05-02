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
 * A representation of the model object '<em><b>Problem Action Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.ProblemActionType#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.ProblemActionType#getSoapAction <em>Soap Action</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.ProblemActionType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getProblemActionType()
 * @model extendedMetaData="name='ProblemActionType' kind='elementOnly'"
 * @generated
 */
public interface ProblemActionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(AttributedURIType)
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getProblemActionType_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Action' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedURIType getAction();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.ProblemActionType#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(AttributedURIType value);

	/**
	 * Returns the value of the '<em><b>Soap Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soap Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soap Action</em>' attribute.
	 * @see #setSoapAction(String)
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getProblemActionType_SoapAction()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='SoapAction' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSoapAction();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.ProblemActionType#getSoapAction <em>Soap Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soap Action</em>' attribute.
	 * @see #getSoapAction()
	 * @generated
	 */
	void setSoapAction(String value);

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
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getProblemActionType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ProblemActionType
