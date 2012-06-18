/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
            JcaFactory theJcaFactory = (JcaFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-jca:config:1.0"); 
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
            case JcaPackage.CONNECTION: return createConnection();
            case JcaPackage.CONNECTION_SPEC: return createConnectionSpec();
            case JcaPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case JcaPackage.INBOUND_OPERATION: return createInboundOperation();
            case JcaPackage.INTERACTION_SPEC: return createInteractionSpec();
            case JcaPackage.JCA_BINDING: return createJCABinding();
            case JcaPackage.JCA_INBOUND_CONNECTION: return createJCAInboundConnection();
            case JcaPackage.JCA_INBOUND_INTERACTION: return createJCAInboundInteraction();
            case JcaPackage.JCA_OUTBOUND_CONNECTION: return createJCAOutboundConnection();
            case JcaPackage.JCA_OUTBOUND_INTERACTION: return createJCAOutboundInteraction();
            case JcaPackage.OPERATION: return createOperation();
            case JcaPackage.PROPERTY: return createProperty();
            case JcaPackage.RESOURCE_ADAPTER: return createResourceAdapter();
            case JcaPackage.PROCESSOR: return createProcessor();
            case JcaPackage.ENDPOINT: return createEndpoint();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case JcaPackage.JCA_CREATE_RESOURCE:
                return createJCACreateResourceFromString(eDataType, initialValue);
            case JcaPackage.RES_AUTH:
                return createResAuthFromString(eDataType, initialValue);
            case JcaPackage.JCA_CREATE_RESOURCE_OBJECT:
                return createJCACreateResourceObjectFromString(eDataType, initialValue);
            case JcaPackage.RES_AUTH_OBJECT:
                return createResAuthObjectFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case JcaPackage.JCA_CREATE_RESOURCE:
                return convertJCACreateResourceToString(eDataType, instanceValue);
            case JcaPackage.RES_AUTH:
                return convertResAuthToString(eDataType, instanceValue);
            case JcaPackage.JCA_CREATE_RESOURCE_OBJECT:
                return convertJCACreateResourceObjectToString(eDataType, instanceValue);
            case JcaPackage.RES_AUTH_OBJECT:
                return convertResAuthObjectToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
    public InboundOperation createInboundOperation() {
        InboundOperationImpl inboundOperation = new InboundOperationImpl();
        return inboundOperation;
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
    public Operation createOperation() {
        OperationImpl operation = new OperationImpl();
        return operation;
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
    public JCACreateResource createJCACreateResourceFromString(EDataType eDataType, String initialValue) {
        JCACreateResource result = JCACreateResource.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertJCACreateResourceToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResAuth createResAuthFromString(EDataType eDataType, String initialValue) {
        ResAuth result = ResAuth.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertResAuthToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JCACreateResource createJCACreateResourceObjectFromString(EDataType eDataType, String initialValue) {
        return createJCACreateResourceFromString(JcaPackage.Literals.JCA_CREATE_RESOURCE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertJCACreateResourceObjectToString(EDataType eDataType, Object instanceValue) {
        return convertJCACreateResourceToString(JcaPackage.Literals.JCA_CREATE_RESOURCE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResAuth createResAuthObjectFromString(EDataType eDataType, String initialValue) {
        return createResAuthFromString(JcaPackage.Literals.RES_AUTH, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertResAuthObjectToString(EDataType eDataType, Object instanceValue) {
        return convertResAuthToString(JcaPackage.Literals.RES_AUTH, instanceValue);
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
