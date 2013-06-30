/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JCA Outbound Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getConnectionSpec <em>Connection Spec</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getInteractionSpec <em>Interaction Spec</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getProcessor <em>Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCAOutboundInteraction()
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
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCAOutboundInteraction_ConnectionSpec()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='connectionSpec' namespace='##targetNamespace'"
     * @generated
     */
    ConnectionSpec getConnectionSpec();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getConnectionSpec <em>Connection Spec</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCAOutboundInteraction_InteractionSpec()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='interactionSpec' namespace='##targetNamespace'"
     * @generated
     */
    InteractionSpec getInteractionSpec();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getInteractionSpec <em>Interaction Spec</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interaction Spec</em>' containment reference.
     * @see #getInteractionSpec()
     * @generated
     */
    void setInteractionSpec(InteractionSpec value);

    /**
     * Returns the value of the '<em><b>Processor</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Processor</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Processor</em>' containment reference.
     * @see #setProcessor(Processor)
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#getJCAOutboundInteraction_Processor()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='processor' namespace='##targetNamespace'"
     * @generated
     */
    Processor getProcessor();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getProcessor <em>Processor</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Processor</em>' containment reference.
     * @see #getProcessor()
     * @generated
     */
    void setProcessor(Processor value);

} // JCAOutboundInteraction
