/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.core.model.policy;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.PolicyReferenceType#getDigest <em>Digest</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.PolicyReferenceType#getDigestAlgorithm <em>Digest Algorithm</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.PolicyReferenceType#getURI <em>URI</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.policy.PolicyReferenceType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.core.model.policy.PolicyPackage#getPolicyReferenceType()
 * @model extendedMetaData="name='PolicyReference_._type' kind='empty'"
 * @generated
 */
public interface PolicyReferenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Digest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digest</em>' attribute.
	 * @see #setDigest(byte[])
	 * @see org.eclipse.soa.sca.core.model.policy.PolicyPackage#getPolicyReferenceType_Digest()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='attribute' name='Digest'"
	 * @generated
	 */
	byte[] getDigest();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.policy.PolicyReferenceType#getDigest <em>Digest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digest</em>' attribute.
	 * @see #getDigest()
	 * @generated
	 */
	void setDigest(byte[] value);

	/**
	 * Returns the value of the '<em><b>Digest Algorithm</b></em>' attribute.
	 * The default value is <code>"http://schemas.xmlsoap.org/ws/2004/09/policy/Sha1Exc"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digest Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digest Algorithm</em>' attribute.
	 * @see #isSetDigestAlgorithm()
	 * @see #unsetDigestAlgorithm()
	 * @see #setDigestAlgorithm(String)
	 * @see org.eclipse.soa.sca.core.model.policy.PolicyPackage#getPolicyReferenceType_DigestAlgorithm()
	 * @model default="http://schemas.xmlsoap.org/ws/2004/09/policy/Sha1Exc" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='DigestAlgorithm'"
	 * @generated
	 */
	String getDigestAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.policy.PolicyReferenceType#getDigestAlgorithm <em>Digest Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digest Algorithm</em>' attribute.
	 * @see #isSetDigestAlgorithm()
	 * @see #unsetDigestAlgorithm()
	 * @see #getDigestAlgorithm()
	 * @generated
	 */
	void setDigestAlgorithm(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.soa.sca.core.model.policy.PolicyReferenceType#getDigestAlgorithm <em>Digest Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDigestAlgorithm()
	 * @see #getDigestAlgorithm()
	 * @see #setDigestAlgorithm(String)
	 * @generated
	 */
	void unsetDigestAlgorithm();

	/**
	 * Returns whether the value of the '{@link org.eclipse.soa.sca.core.model.policy.PolicyReferenceType#getDigestAlgorithm <em>Digest Algorithm</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Digest Algorithm</em>' attribute is set.
	 * @see #unsetDigestAlgorithm()
	 * @see #getDigestAlgorithm()
	 * @see #setDigestAlgorithm(String)
	 * @generated
	 */
	boolean isSetDigestAlgorithm();

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see org.eclipse.soa.sca.core.model.policy.PolicyPackage#getPolicyReferenceType_URI()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='URI'"
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.policy.PolicyReferenceType#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

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
	 * @see org.eclipse.soa.sca.core.model.policy.PolicyPackage#getPolicyReferenceType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // PolicyReferenceType
