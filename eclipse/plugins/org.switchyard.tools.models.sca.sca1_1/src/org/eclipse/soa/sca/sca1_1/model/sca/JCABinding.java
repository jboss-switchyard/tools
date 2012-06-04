/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JCA Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getOutboundConnection <em>Outbound Connection</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getInboundConnection <em>Inbound Connection</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getOutboundInteraction <em>Outbound Interaction</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getInboundInteraction <em>Inbound Interaction</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getConnectionInfo <em>Connection Info</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getInitialContextFactory <em>Initial Context Factory</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getJndiURL <em>Jndi URL</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCABinding()
 * @model extendedMetaData="name='JCABinding' kind='elementOnly'"
 * @generated
 */
public interface JCABinding extends Binding {
	/**
     * Returns the value of the '<em><b>Outbound Connection</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outbound Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Outbound Connection</em>' containment reference.
     * @see #setOutboundConnection(JCAOutboundConnection)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCABinding_OutboundConnection()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='outboundConnection' namespace='##targetNamespace'"
     * @generated
     */
	JCAOutboundConnection getOutboundConnection();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getOutboundConnection <em>Outbound Connection</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Outbound Connection</em>' containment reference.
     * @see #getOutboundConnection()
     * @generated
     */
	void setOutboundConnection(JCAOutboundConnection value);

	/**
     * Returns the value of the '<em><b>Inbound Connection</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbound Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Inbound Connection</em>' containment reference.
     * @see #setInboundConnection(JCAInboundConnection)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCABinding_InboundConnection()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='inboundConnection' namespace='##targetNamespace'"
     * @generated
     */
	JCAInboundConnection getInboundConnection();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getInboundConnection <em>Inbound Connection</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inbound Connection</em>' containment reference.
     * @see #getInboundConnection()
     * @generated
     */
	void setInboundConnection(JCAInboundConnection value);

	/**
     * Returns the value of the '<em><b>Outbound Interaction</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outbound Interaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Outbound Interaction</em>' containment reference.
     * @see #setOutboundInteraction(JCAOutboundInteraction)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCABinding_OutboundInteraction()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='outboundInteraction' namespace='##targetNamespace'"
     * @generated
     */
	JCAOutboundInteraction getOutboundInteraction();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getOutboundInteraction <em>Outbound Interaction</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Outbound Interaction</em>' containment reference.
     * @see #getOutboundInteraction()
     * @generated
     */
	void setOutboundInteraction(JCAOutboundInteraction value);

	/**
     * Returns the value of the '<em><b>Inbound Interaction</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbound Interaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Inbound Interaction</em>' containment reference.
     * @see #setInboundInteraction(JCAInboundInteraction)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCABinding_InboundInteraction()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='inboundInteraction' namespace='##targetNamespace'"
     * @generated
     */
	JCAInboundInteraction getInboundInteraction();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getInboundInteraction <em>Inbound Interaction</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inbound Interaction</em>' containment reference.
     * @see #getInboundInteraction()
     * @generated
     */
	void setInboundInteraction(JCAInboundInteraction value);

	/**
     * Returns the value of the '<em><b>Property</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.Property}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' containment reference list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCABinding_Property()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
     * @generated
     */
	EList<Property> getProperty();

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCABinding_Any()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':15' processing='lax'"
     * @generated
     */
	FeatureMap getAny();

	/**
     * Returns the value of the '<em><b>Connection Info</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Info</em>' attribute.
     * @see #setConnectionInfo(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCABinding_ConnectionInfo()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='connectionInfo'"
     * @generated
     */
	String getConnectionInfo();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getConnectionInfo <em>Connection Info</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Info</em>' attribute.
     * @see #getConnectionInfo()
     * @generated
     */
	void setConnectionInfo(String value);

	/**
     * Returns the value of the '<em><b>Initial Context Factory</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Context Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Initial Context Factory</em>' attribute.
     * @see #setInitialContextFactory(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCABinding_InitialContextFactory()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='initialContextFactory'"
     * @generated
     */
	String getInitialContextFactory();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getInitialContextFactory <em>Initial Context Factory</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial Context Factory</em>' attribute.
     * @see #getInitialContextFactory()
     * @generated
     */
	void setInitialContextFactory(String value);

	/**
     * Returns the value of the '<em><b>Jndi URL</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jndi URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Jndi URL</em>' attribute.
     * @see #setJndiURL(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getJCABinding_JndiURL()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='jndiURL'"
     * @generated
     */
	String getJndiURL();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getJndiURL <em>Jndi URL</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Jndi URL</em>' attribute.
     * @see #getJndiURL()
     * @generated
     */
	void setJndiURL(String value);

} // JCABinding
