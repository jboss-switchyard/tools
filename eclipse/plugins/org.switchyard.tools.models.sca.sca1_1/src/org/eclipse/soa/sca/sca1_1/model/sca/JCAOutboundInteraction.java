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
 * A representation of the model object '<em><b>JCA Outbound Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction#getConnectionSpec <em>Connection Spec</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction#getInteractionSpec <em>Interaction Spec</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCAOutboundInteraction()
 * @model extendedMetaData="name='JCAOutboundInteraction' kind='elementOnly'"
 * @generated
 */
public interface JCAOutboundInteraction extends EObject {
	/**
     * Returns the value of the '<em><b>Connection Spec</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Spec</em>' containment reference.
     * @see #setConnectionSpec(ConnectionSpec)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCAOutboundInteraction_ConnectionSpec()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='connectionSpec' namespace='##targetNamespace'"
     * @generated
     */
	ConnectionSpec getConnectionSpec();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction#getConnectionSpec <em>Connection Spec</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Spec</em>' containment reference.
     * @see #getConnectionSpec()
     * @generated
     */
	void setConnectionSpec(ConnectionSpec value);

	/**
     * Returns the value of the '<em><b>Interaction Spec</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Interaction Spec</em>' containment reference.
     * @see #setInteractionSpec(InteractionSpec)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCAOutboundInteraction_InteractionSpec()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='interactionSpec' namespace='##targetNamespace'"
     * @generated
     */
	InteractionSpec getInteractionSpec();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction#getInteractionSpec <em>Interaction Spec</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interaction Spec</em>' containment reference.
     * @see #getInteractionSpec()
     * @generated
     */
	void setInteractionSpec(InteractionSpec value);

	/**
     * Returns the value of the '<em><b>Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Operation</em>' containment reference.
     * @see #setOperation(Operation)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCAOutboundInteraction_Operation()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
     * @generated
     */
	Operation getOperation();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction#getOperation <em>Operation</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation</em>' containment reference.
     * @see #getOperation()
     * @generated
     */
	void setOperation(Operation value);

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCAOutboundInteraction_Any()
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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCAOutboundInteraction_AnyAttribute()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':4' processing='lax'"
     * @generated
     */
	FeatureMap getAnyAttribute();

} // JCAOutboundInteraction
