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
 * A representation of the model object '<em><b>JMS Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse#getWireFormat <em>Wire Format</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse#getConnectionFactory <em>Connection Factory</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse#getActivationSpec <em>Activation Spec</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSResponse()
 * @model extendedMetaData="name='JMSResponse' kind='elementOnly'"
 * @generated
 */
public interface JMSResponse extends EObject {
	/**
     * Returns the value of the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire Format</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Wire Format</em>' containment reference.
     * @see #setWireFormat(WireFormatType)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSResponse_WireFormat()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='wireFormat' namespace='##targetNamespace'"
     * @generated
     */
	WireFormatType getWireFormat();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse#getWireFormat <em>Wire Format</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wire Format</em>' containment reference.
     * @see #getWireFormat()
     * @generated
     */
	void setWireFormat(WireFormatType value);

	/**
     * Returns the value of the '<em><b>Destination</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Destination</em>' containment reference.
     * @see #setDestination(JMSDestination)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSResponse_Destination()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='destination' namespace='##targetNamespace'"
     * @generated
     */
	JMSDestination getDestination();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse#getDestination <em>Destination</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Destination</em>' containment reference.
     * @see #getDestination()
     * @generated
     */
	void setDestination(JMSDestination value);

	/**
     * Returns the value of the '<em><b>Connection Factory</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Factory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Factory</em>' containment reference.
     * @see #setConnectionFactory(JMSConnectionFactory)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSResponse_ConnectionFactory()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='connectionFactory' namespace='##targetNamespace'"
     * @generated
     */
	JMSConnectionFactory getConnectionFactory();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse#getConnectionFactory <em>Connection Factory</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Factory</em>' containment reference.
     * @see #getConnectionFactory()
     * @generated
     */
	void setConnectionFactory(JMSConnectionFactory value);

	/**
     * Returns the value of the '<em><b>Activation Spec</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Activation Spec</em>' containment reference.
     * @see #setActivationSpec(JMSActivationSpec)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSResponse_ActivationSpec()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='activationSpec' namespace='##targetNamespace'"
     * @generated
     */
	JMSActivationSpec getActivationSpec();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse#getActivationSpec <em>Activation Spec</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activation Spec</em>' containment reference.
     * @see #getActivationSpec()
     * @generated
     */
	void setActivationSpec(JMSActivationSpec value);

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJMSResponse_Any()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='lax'"
     * @generated
     */
	FeatureMap getAny();

} // JMSResponse
