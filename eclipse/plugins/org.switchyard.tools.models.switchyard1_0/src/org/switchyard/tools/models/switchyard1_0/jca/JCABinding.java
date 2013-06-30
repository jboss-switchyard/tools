/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.soa.sca.sca1_1.model.sca.ExtensionsType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JCA Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getContextMapper <em>Context Mapper</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getMessageComposer <em>Message Composer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getOutboundConnection <em>Outbound Connection</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getInboundConnection <em>Inbound Connection</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getOutboundInteraction <em>Outbound Interaction</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getInboundInteraction <em>Inbound Interaction</em>}</li>
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
     * Returns the value of the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Mapper</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Mapper</em>' containment reference.
     * @see #setContextMapper(ContextMapperType)
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCABinding_ContextMapper()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='contextMapper' namespace='##targetNamespace'"
     * @generated
     */
    ContextMapperType getContextMapper();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getContextMapper <em>Context Mapper</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Mapper</em>' containment reference.
     * @see #getContextMapper()
     * @generated
     */
    void setContextMapper(ContextMapperType value);

    /**
     * Returns the value of the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Composer</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Composer</em>' containment reference.
     * @see #setMessageComposer(MessageComposerType)
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCABinding_MessageComposer()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='messageComposer' namespace='##targetNamespace'"
     * @generated
     */
    MessageComposerType getMessageComposer();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getMessageComposer <em>Message Composer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Composer</em>' containment reference.
     * @see #getMessageComposer()
     * @generated
     */
    void setMessageComposer(MessageComposerType value);

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
     * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extensions</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extensions</em>' containment reference.
     * @see #setExtensions(ExtensionsType)
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCABinding_Extensions()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='extensions' namespace='http://docs.oasis-open.org/ns/opencsa/sca/200912'"
     * @generated
     */
    ExtensionsType getExtensions();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getExtensions <em>Extensions</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extensions</em>' containment reference.
     * @see #getExtensions()
     * @generated
     */
    void setExtensions(ExtensionsType value);

} // JCABinding
