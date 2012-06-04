/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JCA Inbound Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction#getListener <em>Listener</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction#getInboundOperation <em>Inbound Operation</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCAInboundInteraction()
 * @model extendedMetaData="name='JCAInboundInteraction' kind='elementOnly'"
 * @generated
 */
public interface JCAInboundInteraction extends EObject {
	/**
     * Returns the value of the '<em><b>Listener</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listener</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Listener</em>' attribute.
     * @see #setListener(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCAInboundInteraction_Listener()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='listener' namespace='##targetNamespace'"
     * @generated
     */
	String getListener();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction#getListener <em>Listener</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Listener</em>' attribute.
     * @see #getListener()
     * @generated
     */
	void setListener(String value);

	/**
     * Returns the value of the '<em><b>Inbound Operation</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.InboundOperation}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbound Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Inbound Operation</em>' containment reference list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCAInboundInteraction_InboundOperation()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='inboundOperation' namespace='##targetNamespace'"
     * @generated
     */
	EList<InboundOperation> getInboundOperation();

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCAInboundInteraction_Any()
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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCAInboundInteraction_AnyAttribute()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':3' processing='lax'"
     * @generated
     */
	FeatureMap getAnyAttribute();

} // JCAInboundInteraction
