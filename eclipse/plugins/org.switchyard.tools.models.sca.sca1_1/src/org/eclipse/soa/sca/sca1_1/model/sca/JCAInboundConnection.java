/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JCA Inbound Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundConnection#getResourceAdapter <em>Resource Adapter</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundConnection#getActivationSpec <em>Activation Spec</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundConnection#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundConnection#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCAInboundConnection()
 * @model extendedMetaData="name='JCAInboundConnection' kind='elementOnly'"
 * @generated
 */
public interface JCAInboundConnection extends EObject {
	/**
     * Returns the value of the '<em><b>Resource Adapter</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Adapter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Resource Adapter</em>' containment reference.
     * @see #setResourceAdapter(ResourceAdapter)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCAInboundConnection_ResourceAdapter()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='resourceAdapter' namespace='##targetNamespace'"
     * @generated
     */
	ResourceAdapter getResourceAdapter();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundConnection#getResourceAdapter <em>Resource Adapter</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource Adapter</em>' containment reference.
     * @see #getResourceAdapter()
     * @generated
     */
	void setResourceAdapter(ResourceAdapter value);

	/**
     * Returns the value of the '<em><b>Activation Spec</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Activation Spec</em>' containment reference.
     * @see #setActivationSpec(ActivationSpec)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCAInboundConnection_ActivationSpec()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='activationSpec' namespace='##targetNamespace'"
     * @generated
     */
	ActivationSpec getActivationSpec();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundConnection#getActivationSpec <em>Activation Spec</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activation Spec</em>' containment reference.
     * @see #getActivationSpec()
     * @generated
     */
	void setActivationSpec(ActivationSpec value);

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCAInboundConnection_Any()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax'"
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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCAInboundConnection_AnyAttribute()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':3' processing='lax'"
     * @generated
     */
	FeatureMap getAnyAttribute();

} // JCAInboundConnection
