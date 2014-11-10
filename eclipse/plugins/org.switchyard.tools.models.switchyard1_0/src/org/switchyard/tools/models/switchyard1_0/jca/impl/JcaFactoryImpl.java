/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.jca.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JcaFactoryImpl extends EFactoryImpl implements JcaFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static JcaFactory init() {
        try {
            JcaFactory theJcaFactory = (JcaFactory)EPackage.Registry.INSTANCE.getEFactory(JcaPackage.eNS_URI);
            if (theJcaFactory != null) {
                return theJcaFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new JcaFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JcaFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case JcaPackage.ACTIVATION_SPEC: return createActivationSpec();
            case JcaPackage.BATCH_COMMIT: return createBatchCommit();
            case JcaPackage.CONNECTION: return createConnection();
            case JcaPackage.CONNECTION_SPEC: return createConnectionSpec();
            case JcaPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case JcaPackage.ENDPOINT: return createEndpoint();
            case JcaPackage.INTERACTION_SPEC: return createInteractionSpec();
            case JcaPackage.JCA_BINDING: return createJCABinding();
            case JcaPackage.JCA_INBOUND_CONNECTION: return createJCAInboundConnection();
            case JcaPackage.JCA_INBOUND_INTERACTION: return createJCAInboundInteraction();
            case JcaPackage.JCA_OUTBOUND_CONNECTION: return createJCAOutboundConnection();
            case JcaPackage.JCA_OUTBOUND_INTERACTION: return createJCAOutboundInteraction();
            case JcaPackage.PROCESSOR: return createProcessor();
            case JcaPackage.PROPERTY: return createProperty();
            case JcaPackage.RESOURCE_ADAPTER: return createResourceAdapter();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivationSpec createActivationSpec() {
        ActivationSpecImpl activationSpec = new ActivationSpecImpl();
        return activationSpec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Connection createConnection() {
        ConnectionImpl connection = new ConnectionImpl();
        return connection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectionSpec createConnectionSpec() {
        ConnectionSpecImpl connectionSpec = new ConnectionSpecImpl();
        return connectionSpec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BatchCommit createBatchCommit() {
        BatchCommitImpl batchCommit = new BatchCommitImpl();
        return batchCommit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionSpec createInteractionSpec() {
        InteractionSpecImpl interactionSpec = new InteractionSpecImpl();
        return interactionSpec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JCABinding createJCABinding() {
        JCABindingImpl jcaBinding = new JCABindingImpl();
        return jcaBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JCAInboundConnection createJCAInboundConnection() {
        JCAInboundConnectionImpl jcaInboundConnection = new JCAInboundConnectionImpl();
        return jcaInboundConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JCAInboundInteraction createJCAInboundInteraction() {
        JCAInboundInteractionImpl jcaInboundInteraction = new JCAInboundInteractionImpl();
        return jcaInboundInteraction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JCAOutboundConnection createJCAOutboundConnection() {
        JCAOutboundConnectionImpl jcaOutboundConnection = new JCAOutboundConnectionImpl();
        return jcaOutboundConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JCAOutboundInteraction createJCAOutboundInteraction() {
        JCAOutboundInteractionImpl jcaOutboundInteraction = new JCAOutboundInteractionImpl();
        return jcaOutboundInteraction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Property createProperty() {
        PropertyImpl property = new PropertyImpl();
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceAdapter createResourceAdapter() {
        ResourceAdapterImpl resourceAdapter = new ResourceAdapterImpl();
        return resourceAdapter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Processor createProcessor() {
        ProcessorImpl processor = new ProcessorImpl();
        return processor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Endpoint createEndpoint() {
        EndpointImpl endpoint = new EndpointImpl();
        return endpoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JcaPackage getJcaPackage() {
        return (JcaPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static JcaPackage getPackage() {
        return JcaPackage.eINSTANCE;
    }

} //JcaFactoryImpl
