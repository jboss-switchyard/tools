/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage
 * @generated
 */
public interface JcaFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    JcaFactory eINSTANCE = org.switchyard.tools.models.switchyard1_0.jca.impl.JcaFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Activation Spec</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Activation Spec</em>'.
     * @generated
     */
    ActivationSpec createActivationSpec();

    /**
     * Returns a new object of class '<em>Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connection</em>'.
     * @generated
     */
    Connection createConnection();

    /**
     * Returns a new object of class '<em>Connection Spec</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connection Spec</em>'.
     * @generated
     */
    ConnectionSpec createConnectionSpec();

    /**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
    DocumentRoot createDocumentRoot();

    /**
     * Returns a new object of class '<em>JCA Context Mapper Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>JCA Context Mapper Type</em>'.
     * @generated
     */
    JCAContextMapperType createJCAContextMapperType();

    /**
     * Returns a new object of class '<em>JCA Message Composer Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>JCA Message Composer Type</em>'.
     * @generated
     */
    JCAMessageComposerType createJCAMessageComposerType();

    /**
     * Returns a new object of class '<em>Inbound Operation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Inbound Operation</em>'.
     * @generated
     */
    InboundOperation createInboundOperation();

    /**
     * Returns a new object of class '<em>Interaction Spec</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Spec</em>'.
     * @generated
     */
    InteractionSpec createInteractionSpec();

    /**
     * Returns a new object of class '<em>JCA Binding</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>JCA Binding</em>'.
     * @generated
     */
    JCABinding createJCABinding();

    /**
     * Returns a new object of class '<em>JCA Inbound Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>JCA Inbound Connection</em>'.
     * @generated
     */
    JCAInboundConnection createJCAInboundConnection();

    /**
     * Returns a new object of class '<em>JCA Inbound Interaction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>JCA Inbound Interaction</em>'.
     * @generated
     */
    JCAInboundInteraction createJCAInboundInteraction();

    /**
     * Returns a new object of class '<em>JCA Outbound Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>JCA Outbound Connection</em>'.
     * @generated
     */
    JCAOutboundConnection createJCAOutboundConnection();

    /**
     * Returns a new object of class '<em>JCA Outbound Interaction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>JCA Outbound Interaction</em>'.
     * @generated
     */
    JCAOutboundInteraction createJCAOutboundInteraction();

    /**
     * Returns a new object of class '<em>Operation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operation</em>'.
     * @generated
     */
    Operation createOperation();

    /**
     * Returns a new object of class '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property</em>'.
     * @generated
     */
    Property createProperty();

    /**
     * Returns a new object of class '<em>Resource Adapter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Resource Adapter</em>'.
     * @generated
     */
    ResourceAdapter createResourceAdapter();

    /**
     * Returns a new object of class '<em>Processor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Processor</em>'.
     * @generated
     */
    Processor createProcessor();

    /**
     * Returns a new object of class '<em>Endpoint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Endpoint</em>'.
     * @generated
     */
    Endpoint createEndpoint();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    JcaPackage getJcaPackage();

} //JcaFactory
