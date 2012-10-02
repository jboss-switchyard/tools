/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca;

import org.eclipse.emf.common.util.EList;

import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JCA Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getJndiURL <em>Jndi URL</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getInitialContextFactory <em>Initial Context Factory</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getOutboundConnection <em>Outbound Connection</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getInboundConnection <em>Inbound Connection</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getInboundInteraction <em>Inbound Interaction</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getOutboundInteraction <em>Outbound Interaction</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getProperty <em>Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCABinding()
 * @model extendedMetaData="name='JCABinding' kind='elementOnly'"
 * @generated
 */
public interface JCABinding extends SwitchYardBindingType {
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
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCABinding_JndiURL()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='jndiURL'"
     * @generated
     */
    String getJndiURL();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getJndiURL <em>Jndi URL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Jndi URL</em>' attribute.
     * @see #getJndiURL()
     * @generated
     */
    void setJndiURL(String value);

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
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCABinding_InitialContextFactory()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='initialContextFactory'"
     * @generated
     */
    String getInitialContextFactory();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getInitialContextFactory <em>Initial Context Factory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial Context Factory</em>' attribute.
     * @see #getInitialContextFactory()
     * @generated
     */
    void setInitialContextFactory(String value);

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
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCABinding_OutboundConnection()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='outboundConnection' namespace='##targetNamespace'"
     * @generated
     */
    JCAOutboundConnection getOutboundConnection();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getOutboundConnection <em>Outbound Connection</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCABinding_InboundConnection()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='inboundConnection' namespace='##targetNamespace'"
     * @generated
     */
    JCAInboundConnection getInboundConnection();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getInboundConnection <em>Inbound Connection</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inbound Connection</em>' containment reference.
     * @see #getInboundConnection()
     * @generated
     */
    void setInboundConnection(JCAInboundConnection value);

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
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCABinding_InboundInteraction()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='inboundInteraction' namespace='##targetNamespace'"
     * @generated
     */
    JCAInboundInteraction getInboundInteraction();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getInboundInteraction <em>Inbound Interaction</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inbound Interaction</em>' containment reference.
     * @see #getInboundInteraction()
     * @generated
     */
    void setInboundInteraction(JCAInboundInteraction value);

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
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCABinding_OutboundInteraction()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='outboundInteraction' namespace='##targetNamespace'"
     * @generated
     */
    JCAOutboundInteraction getOutboundInteraction();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getOutboundInteraction <em>Outbound Interaction</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Outbound Interaction</em>' containment reference.
     * @see #getOutboundInteraction()
     * @generated
     */
    void setOutboundInteraction(JCAOutboundInteraction value);

    /**
     * Returns the value of the '<em><b>Property</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.jca.Property}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCABinding_Property()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
     * @generated
     */
    EList<Property> getProperty();

    /**
     * Returns the value of the '<em><b>Extensions</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extensions</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extensions</em>' attribute.
     * @see #setExtensions(Object)
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCABinding_Extensions()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='element' name='extensions' namespace='http://docs.oasis-open.org/ns/opencsa/sca/200912'"
     * @generated
     */
    Object getExtensions();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getExtensions <em>Extensions</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extensions</em>' attribute.
     * @see #getExtensions()
     * @generated
     */
    void setExtensions(Object value);

} // JCABinding
