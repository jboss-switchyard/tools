/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.jca.JcaFactory
 * @model kind="package"
 * @generated
 */
public interface JcaPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "jca";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-jca:config:1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "jca";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    JcaPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.ActivationSpecImpl <em>Activation Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.ActivationSpecImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getActivationSpec()
     * @generated
     */
    int ACTIVATION_SPEC = 0;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVATION_SPEC__PROPERTY = 0;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVATION_SPEC__ANY = 1;

    /**
     * The feature id for the '<em><b>Create</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVATION_SPEC__CREATE = 2;

    /**
     * The feature id for the '<em><b>Jndi Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVATION_SPEC__JNDI_NAME = 3;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVATION_SPEC__TYPE = 4;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVATION_SPEC__ANY_ATTRIBUTE = 5;

    /**
     * The number of structural features of the '<em>Activation Spec</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVATION_SPEC_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.ConnectionImpl <em>Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.ConnectionImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getConnection()
     * @generated
     */
    int CONNECTION = 1;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__PROPERTY = 0;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__ANY = 1;

    /**
     * The feature id for the '<em><b>Create</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__CREATE = 2;

    /**
     * The feature id for the '<em><b>Jndi Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__JNDI_NAME = 3;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__TYPE = 4;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__ANY_ATTRIBUTE = 5;

    /**
     * The number of structural features of the '<em>Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.ConnectionSpecImpl <em>Connection Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.ConnectionSpecImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getConnectionSpec()
     * @generated
     */
    int CONNECTION_SPEC = 2;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_SPEC__PROPERTY = 0;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_SPEC__ANY = 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_SPEC__TYPE = 2;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_SPEC__ANY_ATTRIBUTE = 3;

    /**
     * The number of structural features of the '<em>Connection Spec</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_SPEC_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 15;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.InboundOperationImpl <em>Inbound Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.InboundOperationImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getInboundOperation()
     * @generated
     */
    int INBOUND_OPERATION = 4;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.InteractionSpecImpl <em>Interaction Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.InteractionSpecImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getInteractionSpec()
     * @generated
     */
    int INTERACTION_SPEC = 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCABindingImpl <em>JCA Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCABindingImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCABinding()
     * @generated
     */
    int JCA_BINDING = 6;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundConnectionImpl <em>JCA Inbound Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundConnectionImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCAInboundConnection()
     * @generated
     */
    int JCA_INBOUND_CONNECTION = 7;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundInteractionImpl <em>JCA Inbound Interaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundInteractionImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCAInboundInteraction()
     * @generated
     */
    int JCA_INBOUND_INTERACTION = 8;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundConnectionImpl <em>JCA Outbound Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundConnectionImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCAOutboundConnection()
     * @generated
     */
    int JCA_OUTBOUND_CONNECTION = 9;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundInteractionImpl <em>JCA Outbound Interaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundInteractionImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCAOutboundInteraction()
     * @generated
     */
    int JCA_OUTBOUND_INTERACTION = 10;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.OperationImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getOperation()
     * @generated
     */
    int OPERATION = 11;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.PropertyImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 13;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.ResourceAdapterImpl <em>Resource Adapter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.ResourceAdapterImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getResourceAdapter()
     * @generated
     */
    int RESOURCE_ADAPTER = 14;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.ProcessorImpl <em>Processor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.ProcessorImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getProcessor()
     * @generated
     */
    int PROCESSOR = 12;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.EndpointImpl <em>Endpoint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.EndpointImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getEndpoint()
     * @generated
     */
    int ENDPOINT = 3;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__PROPERTY = 0;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__ANY = 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__TYPE = 2;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__ANY_ATTRIBUTE = 3;

    /**
     * The number of structural features of the '<em>Endpoint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT_FEATURE_COUNT = 4;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOUND_OPERATION__ANY = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOUND_OPERATION__NAME = 1;

    /**
     * The feature id for the '<em><b>Selected Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOUND_OPERATION__SELECTED_OPERATION = 2;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOUND_OPERATION__ANY_ATTRIBUTE = 3;

    /**
     * The number of structural features of the '<em>Inbound Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOUND_OPERATION_FEATURE_COUNT = 4;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_SPEC__PROPERTY = 0;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_SPEC__ANY = 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_SPEC__TYPE = 2;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_SPEC__ANY_ATTRIBUTE = 3;

    /**
     * The number of structural features of the '<em>Interaction Spec</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_SPEC_FEATURE_COUNT = 4;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__DOCUMENTATION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__ANY_ATTRIBUTE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__WIRE_FORMAT_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__WIRE_FORMAT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__OPERATION_SELECTOR_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__OPERATION_SELECTOR = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__NAME = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__POLICY_SETS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__REQUIRES = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__URI = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Jndi URL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__JNDI_URL = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Initial Context Factory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__INITIAL_CONTEXT_FACTORY = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Outbound Connection</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__OUTBOUND_CONNECTION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Inbound Connection</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__INBOUND_CONNECTION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Inbound Interaction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__INBOUND_INTERACTION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Outbound Interaction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__OUTBOUND_INTERACTION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__PROPERTY = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Extensions</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__EXTENSIONS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>JCA Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Resource Adapter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_INBOUND_CONNECTION__RESOURCE_ADAPTER = 0;

    /**
     * The feature id for the '<em><b>Activation Spec</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_INBOUND_CONNECTION__ACTIVATION_SPEC = 1;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_INBOUND_CONNECTION__ANY = 2;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_INBOUND_CONNECTION__ANY_ATTRIBUTE = 3;

    /**
     * The number of structural features of the '<em>JCA Inbound Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_INBOUND_CONNECTION_FEATURE_COUNT = 4;

    /**
     * The feature id for the '<em><b>Listener</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_INBOUND_INTERACTION__LISTENER = 0;

    /**
     * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_INBOUND_INTERACTION__ENDPOINT = 1;

    /**
     * The feature id for the '<em><b>Transacted</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_INBOUND_INTERACTION__TRANSACTED = 2;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_INBOUND_INTERACTION__ANY = 3;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_INBOUND_INTERACTION__ANY_ATTRIBUTE = 4;

    /**
     * The number of structural features of the '<em>JCA Inbound Interaction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_INBOUND_INTERACTION_FEATURE_COUNT = 5;

    /**
     * The feature id for the '<em><b>Resource Adapter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_OUTBOUND_CONNECTION__RESOURCE_ADAPTER = 0;

    /**
     * The feature id for the '<em><b>Connection</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_OUTBOUND_CONNECTION__CONNECTION = 1;

    /**
     * The feature id for the '<em><b>Res Auth</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_OUTBOUND_CONNECTION__RES_AUTH = 2;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_OUTBOUND_CONNECTION__ANY = 3;

    /**
     * The feature id for the '<em><b>Managed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_OUTBOUND_CONNECTION__MANAGED = 4;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_OUTBOUND_CONNECTION__ANY_ATTRIBUTE = 5;

    /**
     * The number of structural features of the '<em>JCA Outbound Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_OUTBOUND_CONNECTION_FEATURE_COUNT = 6;

    /**
     * The feature id for the '<em><b>Connection Spec</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_OUTBOUND_INTERACTION__CONNECTION_SPEC = 0;

    /**
     * The feature id for the '<em><b>Interaction Spec</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_OUTBOUND_INTERACTION__INTERACTION_SPEC = 1;

    /**
     * The feature id for the '<em><b>Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_OUTBOUND_INTERACTION__OPERATION = 2;

    /**
     * The feature id for the '<em><b>Processor</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_OUTBOUND_INTERACTION__PROCESSOR = 3;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_OUTBOUND_INTERACTION__ANY = 4;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_OUTBOUND_INTERACTION__ANY_ATTRIBUTE = 5;

    /**
     * The number of structural features of the '<em>JCA Outbound Interaction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_OUTBOUND_INTERACTION_FEATURE_COUNT = 6;

    /**
     * The feature id for the '<em><b>Interaction Spec</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__INTERACTION_SPEC = 0;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__ANY = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__NAME = 2;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__ANY_ATTRIBUTE = 3;

    /**
     * The number of structural features of the '<em>Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_FEATURE_COUNT = 4;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__PROPERTY = 0;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__ANY = 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__TYPE = 2;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__ANY_ATTRIBUTE = 3;

    /**
     * The number of structural features of the '<em>Processor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_FEATURE_COUNT = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__NAME = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__VALUE = 1;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = 2;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_ADAPTER__PROPERTY = 0;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_ADAPTER__ANY = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_ADAPTER__NAME = 2;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_ADAPTER__TYPE = 3;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_ADAPTER__ANY_ATTRIBUTE = 4;

    /**
     * The number of structural features of the '<em>Resource Adapter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_ADAPTER_FEATURE_COUNT = 5;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>Binding Jca</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_JCA = 3;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONTEXT_MAPPER = 4;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MESSAGE_COMPOSER = 5;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAContextMapperTypeImpl <em>JCA Context Mapper Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCAContextMapperTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCAContextMapperType()
     * @generated
     */
    int JCA_CONTEXT_MAPPER_TYPE = 16;

    /**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_CONTEXT_MAPPER_TYPE__CLASS = SwitchyardPackage.CONTEXT_MAPPER_TYPE__CLASS;

    /**
     * The feature id for the '<em><b>Exclude Namespaces</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_CONTEXT_MAPPER_TYPE__EXCLUDE_NAMESPACES = SwitchyardPackage.CONTEXT_MAPPER_TYPE__EXCLUDE_NAMESPACES;

    /**
     * The feature id for the '<em><b>Excludes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_CONTEXT_MAPPER_TYPE__EXCLUDES = SwitchyardPackage.CONTEXT_MAPPER_TYPE__EXCLUDES;

    /**
     * The feature id for the '<em><b>Include Namespaces</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_CONTEXT_MAPPER_TYPE__INCLUDE_NAMESPACES = SwitchyardPackage.CONTEXT_MAPPER_TYPE__INCLUDE_NAMESPACES;

    /**
     * The feature id for the '<em><b>Includes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_CONTEXT_MAPPER_TYPE__INCLUDES = SwitchyardPackage.CONTEXT_MAPPER_TYPE__INCLUDES;

    /**
     * The number of structural features of the '<em>JCA Context Mapper Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_CONTEXT_MAPPER_TYPE_FEATURE_COUNT = SwitchyardPackage.CONTEXT_MAPPER_TYPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAMessageComposerTypeImpl <em>JCA Message Composer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCAMessageComposerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCAMessageComposerType()
     * @generated
     */
    int JCA_MESSAGE_COMPOSER_TYPE = 17;

    /**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_MESSAGE_COMPOSER_TYPE__CLASS = SwitchyardPackage.MESSAGE_COMPOSER_TYPE__CLASS;

    /**
     * The number of structural features of the '<em>JCA Message Composer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_MESSAGE_COMPOSER_TYPE_FEATURE_COUNT = SwitchyardPackage.MESSAGE_COMPOSER_TYPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCACreateResource <em>JCA Create Resource</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCACreateResource
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCACreateResource()
     * @generated
     */
    int JCA_CREATE_RESOURCE = 18;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.ResAuth <em>Res Auth</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.ResAuth
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getResAuth()
     * @generated
     */
    int RES_AUTH = 19;

    /**
     * The meta object id for the '<em>JCA Create Resource Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCACreateResource
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCACreateResourceObject()
     * @generated
     */
    int JCA_CREATE_RESOURCE_OBJECT = 20;

    /**
     * The meta object id for the '<em>Res Auth Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.ResAuth
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getResAuthObject()
     * @generated
     */
    int RES_AUTH_OBJECT = 21;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec <em>Activation Spec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activation Spec</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec
     * @generated
     */
    EClass getActivationSpec();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getProperty()
     * @see #getActivationSpec()
     * @generated
     */
    EReference getActivationSpec_Property();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getAny()
     * @see #getActivationSpec()
     * @generated
     */
    EAttribute getActivationSpec_Any();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getCreate <em>Create</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Create</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getCreate()
     * @see #getActivationSpec()
     * @generated
     */
    EAttribute getActivationSpec_Create();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getJndiName <em>Jndi Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Jndi Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getJndiName()
     * @see #getActivationSpec()
     * @generated
     */
    EAttribute getActivationSpec_JndiName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getType()
     * @see #getActivationSpec()
     * @generated
     */
    EAttribute getActivationSpec_Type();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getAnyAttribute()
     * @see #getActivationSpec()
     * @generated
     */
    EAttribute getActivationSpec_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.Connection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connection</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Connection
     * @generated
     */
    EClass getConnection();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.jca.Connection#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Connection#getProperty()
     * @see #getConnection()
     * @generated
     */
    EReference getConnection_Property();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.Connection#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Connection#getAny()
     * @see #getConnection()
     * @generated
     */
    EAttribute getConnection_Any();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.Connection#getCreate <em>Create</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Create</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Connection#getCreate()
     * @see #getConnection()
     * @generated
     */
    EAttribute getConnection_Create();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.Connection#getJndiName <em>Jndi Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Jndi Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Connection#getJndiName()
     * @see #getConnection()
     * @generated
     */
    EAttribute getConnection_JndiName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.Connection#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Connection#getType()
     * @see #getConnection()
     * @generated
     */
    EAttribute getConnection_Type();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.Connection#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Connection#getAnyAttribute()
     * @see #getConnection()
     * @generated
     */
    EAttribute getConnection_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec <em>Connection Spec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connection Spec</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec
     * @generated
     */
    EClass getConnectionSpec();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec#getProperty()
     * @see #getConnectionSpec()
     * @generated
     */
    EReference getConnectionSpec_Property();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec#getAny()
     * @see #getConnectionSpec()
     * @generated
     */
    EAttribute getConnectionSpec_Any();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec#getType()
     * @see #getConnectionSpec()
     * @generated
     */
    EAttribute getConnectionSpec_Type();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec#getAnyAttribute()
     * @see #getConnectionSpec()
     * @generated
     */
    EAttribute getConnectionSpec_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot#getBindingJca <em>Binding Jca</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Jca</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot#getBindingJca()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingJca();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot#getContextMapper <em>Context Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Context Mapper</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot#getContextMapper()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ContextMapper();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot#getMessageComposer <em>Message Composer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Message Composer</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot#getMessageComposer()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MessageComposer();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAContextMapperType <em>JCA Context Mapper Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>JCA Context Mapper Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAContextMapperType
     * @generated
     */
    EClass getJCAContextMapperType();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAMessageComposerType <em>JCA Message Composer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>JCA Message Composer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAMessageComposerType
     * @generated
     */
    EClass getJCAMessageComposerType();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.InboundOperation <em>Inbound Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Inbound Operation</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.InboundOperation
     * @generated
     */
    EClass getInboundOperation();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.InboundOperation#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.InboundOperation#getAny()
     * @see #getInboundOperation()
     * @generated
     */
    EAttribute getInboundOperation_Any();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.InboundOperation#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.InboundOperation#getName()
     * @see #getInboundOperation()
     * @generated
     */
    EAttribute getInboundOperation_Name();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.InboundOperation#getSelectedOperation <em>Selected Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selected Operation</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.InboundOperation#getSelectedOperation()
     * @see #getInboundOperation()
     * @generated
     */
    EAttribute getInboundOperation_SelectedOperation();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.InboundOperation#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.InboundOperation#getAnyAttribute()
     * @see #getInboundOperation()
     * @generated
     */
    EAttribute getInboundOperation_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec <em>Interaction Spec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Spec</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec
     * @generated
     */
    EClass getInteractionSpec();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec#getProperty()
     * @see #getInteractionSpec()
     * @generated
     */
    EReference getInteractionSpec_Property();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec#getAny()
     * @see #getInteractionSpec()
     * @generated
     */
    EAttribute getInteractionSpec_Any();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec#getType()
     * @see #getInteractionSpec()
     * @generated
     */
    EAttribute getInteractionSpec_Type();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec#getAnyAttribute()
     * @see #getInteractionSpec()
     * @generated
     */
    EAttribute getInteractionSpec_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding <em>JCA Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>JCA Binding</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCABinding
     * @generated
     */
    EClass getJCABinding();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getJndiURL <em>Jndi URL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Jndi URL</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getJndiURL()
     * @see #getJCABinding()
     * @generated
     */
    EAttribute getJCABinding_JndiURL();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getInitialContextFactory <em>Initial Context Factory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initial Context Factory</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getInitialContextFactory()
     * @see #getJCABinding()
     * @generated
     */
    EAttribute getJCABinding_InitialContextFactory();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getOutboundConnection <em>Outbound Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Outbound Connection</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getOutboundConnection()
     * @see #getJCABinding()
     * @generated
     */
    EReference getJCABinding_OutboundConnection();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getInboundConnection <em>Inbound Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Inbound Connection</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getInboundConnection()
     * @see #getJCABinding()
     * @generated
     */
    EReference getJCABinding_InboundConnection();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getInboundInteraction <em>Inbound Interaction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Inbound Interaction</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getInboundInteraction()
     * @see #getJCABinding()
     * @generated
     */
    EReference getJCABinding_InboundInteraction();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getOutboundInteraction <em>Outbound Interaction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Outbound Interaction</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getOutboundInteraction()
     * @see #getJCABinding()
     * @generated
     */
    EReference getJCABinding_OutboundInteraction();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getProperty()
     * @see #getJCABinding()
     * @generated
     */
    EReference getJCABinding_Property();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getExtensions <em>Extensions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Extensions</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getExtensions()
     * @see #getJCABinding()
     * @generated
     */
    EAttribute getJCABinding_Extensions();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection <em>JCA Inbound Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>JCA Inbound Connection</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection
     * @generated
     */
    EClass getJCAInboundConnection();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection#getResourceAdapter <em>Resource Adapter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resource Adapter</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection#getResourceAdapter()
     * @see #getJCAInboundConnection()
     * @generated
     */
    EReference getJCAInboundConnection_ResourceAdapter();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection#getActivationSpec <em>Activation Spec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Activation Spec</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection#getActivationSpec()
     * @see #getJCAInboundConnection()
     * @generated
     */
    EReference getJCAInboundConnection_ActivationSpec();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection#getAny()
     * @see #getJCAInboundConnection()
     * @generated
     */
    EAttribute getJCAInboundConnection_Any();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection#getAnyAttribute()
     * @see #getJCAInboundConnection()
     * @generated
     */
    EAttribute getJCAInboundConnection_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction <em>JCA Inbound Interaction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>JCA Inbound Interaction</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction
     * @generated
     */
    EClass getJCAInboundInteraction();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getListener <em>Listener</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Listener</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getListener()
     * @see #getJCAInboundInteraction()
     * @generated
     */
    EAttribute getJCAInboundInteraction_Listener();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getEndpoint <em>Endpoint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Endpoint</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getEndpoint()
     * @see #getJCAInboundInteraction()
     * @generated
     */
    EReference getJCAInboundInteraction_Endpoint();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#isTransacted <em>Transacted</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transacted</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#isTransacted()
     * @see #getJCAInboundInteraction()
     * @generated
     */
    EAttribute getJCAInboundInteraction_Transacted();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getAny()
     * @see #getJCAInboundInteraction()
     * @generated
     */
    EAttribute getJCAInboundInteraction_Any();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getAnyAttribute()
     * @see #getJCAInboundInteraction()
     * @generated
     */
    EAttribute getJCAInboundInteraction_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection <em>JCA Outbound Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>JCA Outbound Connection</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection
     * @generated
     */
    EClass getJCAOutboundConnection();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getResourceAdapter <em>Resource Adapter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resource Adapter</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getResourceAdapter()
     * @see #getJCAOutboundConnection()
     * @generated
     */
    EReference getJCAOutboundConnection_ResourceAdapter();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getConnection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Connection</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getConnection()
     * @see #getJCAOutboundConnection()
     * @generated
     */
    EReference getJCAOutboundConnection_Connection();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getResAuth <em>Res Auth</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Res Auth</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getResAuth()
     * @see #getJCAOutboundConnection()
     * @generated
     */
    EAttribute getJCAOutboundConnection_ResAuth();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getAny()
     * @see #getJCAOutboundConnection()
     * @generated
     */
    EAttribute getJCAOutboundConnection_Any();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getManaged <em>Managed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Managed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getManaged()
     * @see #getJCAOutboundConnection()
     * @generated
     */
    EAttribute getJCAOutboundConnection_Managed();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getAnyAttribute()
     * @see #getJCAOutboundConnection()
     * @generated
     */
    EAttribute getJCAOutboundConnection_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction <em>JCA Outbound Interaction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>JCA Outbound Interaction</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction
     * @generated
     */
    EClass getJCAOutboundInteraction();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getConnectionSpec <em>Connection Spec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Connection Spec</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getConnectionSpec()
     * @see #getJCAOutboundInteraction()
     * @generated
     */
    EReference getJCAOutboundInteraction_ConnectionSpec();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getInteractionSpec <em>Interaction Spec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Interaction Spec</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getInteractionSpec()
     * @see #getJCAOutboundInteraction()
     * @generated
     */
    EReference getJCAOutboundInteraction_InteractionSpec();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operation</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getOperation()
     * @see #getJCAOutboundInteraction()
     * @generated
     */
    EReference getJCAOutboundInteraction_Operation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getProcessor <em>Processor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Processor</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getProcessor()
     * @see #getJCAOutboundInteraction()
     * @generated
     */
    EReference getJCAOutboundInteraction_Processor();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getAny()
     * @see #getJCAOutboundInteraction()
     * @generated
     */
    EAttribute getJCAOutboundInteraction_Any();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getAnyAttribute()
     * @see #getJCAOutboundInteraction()
     * @generated
     */
    EAttribute getJCAOutboundInteraction_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.Operation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operation</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Operation
     * @generated
     */
    EClass getOperation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.Operation#getInteractionSpec <em>Interaction Spec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Interaction Spec</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Operation#getInteractionSpec()
     * @see #getOperation()
     * @generated
     */
    EReference getOperation_InteractionSpec();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.Operation#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Operation#getAny()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_Any();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.Operation#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Operation#getName()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_Name();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.Operation#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Operation#getAnyAttribute()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.Property#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Property#getName()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Name();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.Property#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Property#getValue()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Value();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter <em>Resource Adapter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource Adapter</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter
     * @generated
     */
    EClass getResourceAdapter();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter#getProperty()
     * @see #getResourceAdapter()
     * @generated
     */
    EReference getResourceAdapter_Property();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter#getAny()
     * @see #getResourceAdapter()
     * @generated
     */
    EAttribute getResourceAdapter_Any();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter#getName()
     * @see #getResourceAdapter()
     * @generated
     */
    EAttribute getResourceAdapter_Name();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter#getType()
     * @see #getResourceAdapter()
     * @generated
     */
    EAttribute getResourceAdapter_Type();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter#getAnyAttribute()
     * @see #getResourceAdapter()
     * @generated
     */
    EAttribute getResourceAdapter_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.Processor <em>Processor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Processor</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Processor
     * @generated
     */
    EClass getProcessor();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.jca.Processor#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Processor#getProperty()
     * @see #getProcessor()
     * @generated
     */
    EReference getProcessor_Property();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.Processor#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Processor#getAny()
     * @see #getProcessor()
     * @generated
     */
    EAttribute getProcessor_Any();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.Processor#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Processor#getType()
     * @see #getProcessor()
     * @generated
     */
    EAttribute getProcessor_Type();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.Processor#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Processor#getAnyAttribute()
     * @see #getProcessor()
     * @generated
     */
    EAttribute getProcessor_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.Endpoint <em>Endpoint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Endpoint</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Endpoint
     * @generated
     */
    EClass getEndpoint();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.jca.Endpoint#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Endpoint#getProperty()
     * @see #getEndpoint()
     * @generated
     */
    EReference getEndpoint_Property();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.Endpoint#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Endpoint#getAny()
     * @see #getEndpoint()
     * @generated
     */
    EAttribute getEndpoint_Any();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.Endpoint#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Endpoint#getType()
     * @see #getEndpoint()
     * @generated
     */
    EAttribute getEndpoint_Type();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.Endpoint#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Endpoint#getAnyAttribute()
     * @see #getEndpoint()
     * @generated
     */
    EAttribute getEndpoint_AnyAttribute();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.jca.JCACreateResource <em>JCA Create Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>JCA Create Resource</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCACreateResource
     * @generated
     */
    EEnum getJCACreateResource();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.jca.ResAuth <em>Res Auth</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Res Auth</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ResAuth
     * @generated
     */
    EEnum getResAuth();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.jca.JCACreateResource <em>JCA Create Resource Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>JCA Create Resource Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCACreateResource
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.jca.JCACreateResource"
     *        extendedMetaData="name='JCACreateResource:Object' baseType='JCACreateResource'"
     * @generated
     */
    EDataType getJCACreateResourceObject();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.jca.ResAuth <em>Res Auth Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Res Auth Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ResAuth
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.jca.ResAuth"
     *        extendedMetaData="name='ResAuth:Object' baseType='ResAuth'"
     * @generated
     */
    EDataType getResAuthObject();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    JcaFactory getJcaFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.ActivationSpecImpl <em>Activation Spec</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.ActivationSpecImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getActivationSpec()
         * @generated
         */
        EClass ACTIVATION_SPEC = eINSTANCE.getActivationSpec();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVATION_SPEC__PROPERTY = eINSTANCE.getActivationSpec_Property();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTIVATION_SPEC__ANY = eINSTANCE.getActivationSpec_Any();

        /**
         * The meta object literal for the '<em><b>Create</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTIVATION_SPEC__CREATE = eINSTANCE.getActivationSpec_Create();

        /**
         * The meta object literal for the '<em><b>Jndi Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTIVATION_SPEC__JNDI_NAME = eINSTANCE.getActivationSpec_JndiName();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTIVATION_SPEC__TYPE = eINSTANCE.getActivationSpec_Type();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTIVATION_SPEC__ANY_ATTRIBUTE = eINSTANCE.getActivationSpec_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.ConnectionImpl <em>Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.ConnectionImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getConnection()
         * @generated
         */
        EClass CONNECTION = eINSTANCE.getConnection();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTION__PROPERTY = eINSTANCE.getConnection_Property();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION__ANY = eINSTANCE.getConnection_Any();

        /**
         * The meta object literal for the '<em><b>Create</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION__CREATE = eINSTANCE.getConnection_Create();

        /**
         * The meta object literal for the '<em><b>Jndi Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION__JNDI_NAME = eINSTANCE.getConnection_JndiName();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION__TYPE = eINSTANCE.getConnection_Type();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION__ANY_ATTRIBUTE = eINSTANCE.getConnection_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.ConnectionSpecImpl <em>Connection Spec</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.ConnectionSpecImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getConnectionSpec()
         * @generated
         */
        EClass CONNECTION_SPEC = eINSTANCE.getConnectionSpec();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTION_SPEC__PROPERTY = eINSTANCE.getConnectionSpec_Property();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_SPEC__ANY = eINSTANCE.getConnectionSpec_Any();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_SPEC__TYPE = eINSTANCE.getConnectionSpec_Type();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_SPEC__ANY_ATTRIBUTE = eINSTANCE.getConnectionSpec_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>Binding Jca</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_JCA = eINSTANCE.getDocumentRoot_BindingJca();

        /**
         * The meta object literal for the '<em><b>Context Mapper</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CONTEXT_MAPPER = eINSTANCE.getDocumentRoot_ContextMapper();

        /**
         * The meta object literal for the '<em><b>Message Composer</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__MESSAGE_COMPOSER = eINSTANCE.getDocumentRoot_MessageComposer();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAContextMapperTypeImpl <em>JCA Context Mapper Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCAContextMapperTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCAContextMapperType()
         * @generated
         */
        EClass JCA_CONTEXT_MAPPER_TYPE = eINSTANCE.getJCAContextMapperType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAMessageComposerTypeImpl <em>JCA Message Composer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCAMessageComposerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCAMessageComposerType()
         * @generated
         */
        EClass JCA_MESSAGE_COMPOSER_TYPE = eINSTANCE.getJCAMessageComposerType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.InboundOperationImpl <em>Inbound Operation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.InboundOperationImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getInboundOperation()
         * @generated
         */
        EClass INBOUND_OPERATION = eINSTANCE.getInboundOperation();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOUND_OPERATION__ANY = eINSTANCE.getInboundOperation_Any();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOUND_OPERATION__NAME = eINSTANCE.getInboundOperation_Name();

        /**
         * The meta object literal for the '<em><b>Selected Operation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOUND_OPERATION__SELECTED_OPERATION = eINSTANCE.getInboundOperation_SelectedOperation();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOUND_OPERATION__ANY_ATTRIBUTE = eINSTANCE.getInboundOperation_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.InteractionSpecImpl <em>Interaction Spec</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.InteractionSpecImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getInteractionSpec()
         * @generated
         */
        EClass INTERACTION_SPEC = eINSTANCE.getInteractionSpec();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_SPEC__PROPERTY = eINSTANCE.getInteractionSpec_Property();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERACTION_SPEC__ANY = eINSTANCE.getInteractionSpec_Any();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERACTION_SPEC__TYPE = eINSTANCE.getInteractionSpec_Type();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERACTION_SPEC__ANY_ATTRIBUTE = eINSTANCE.getInteractionSpec_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCABindingImpl <em>JCA Binding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCABindingImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCABinding()
         * @generated
         */
        EClass JCA_BINDING = eINSTANCE.getJCABinding();

        /**
         * The meta object literal for the '<em><b>Jndi URL</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JCA_BINDING__JNDI_URL = eINSTANCE.getJCABinding_JndiURL();

        /**
         * The meta object literal for the '<em><b>Initial Context Factory</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JCA_BINDING__INITIAL_CONTEXT_FACTORY = eINSTANCE.getJCABinding_InitialContextFactory();

        /**
         * The meta object literal for the '<em><b>Outbound Connection</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_BINDING__OUTBOUND_CONNECTION = eINSTANCE.getJCABinding_OutboundConnection();

        /**
         * The meta object literal for the '<em><b>Inbound Connection</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_BINDING__INBOUND_CONNECTION = eINSTANCE.getJCABinding_InboundConnection();

        /**
         * The meta object literal for the '<em><b>Inbound Interaction</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_BINDING__INBOUND_INTERACTION = eINSTANCE.getJCABinding_InboundInteraction();

        /**
         * The meta object literal for the '<em><b>Outbound Interaction</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_BINDING__OUTBOUND_INTERACTION = eINSTANCE.getJCABinding_OutboundInteraction();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_BINDING__PROPERTY = eINSTANCE.getJCABinding_Property();

        /**
         * The meta object literal for the '<em><b>Extensions</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JCA_BINDING__EXTENSIONS = eINSTANCE.getJCABinding_Extensions();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundConnectionImpl <em>JCA Inbound Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundConnectionImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCAInboundConnection()
         * @generated
         */
        EClass JCA_INBOUND_CONNECTION = eINSTANCE.getJCAInboundConnection();

        /**
         * The meta object literal for the '<em><b>Resource Adapter</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_INBOUND_CONNECTION__RESOURCE_ADAPTER = eINSTANCE.getJCAInboundConnection_ResourceAdapter();

        /**
         * The meta object literal for the '<em><b>Activation Spec</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_INBOUND_CONNECTION__ACTIVATION_SPEC = eINSTANCE.getJCAInboundConnection_ActivationSpec();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JCA_INBOUND_CONNECTION__ANY = eINSTANCE.getJCAInboundConnection_Any();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JCA_INBOUND_CONNECTION__ANY_ATTRIBUTE = eINSTANCE.getJCAInboundConnection_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundInteractionImpl <em>JCA Inbound Interaction</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundInteractionImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCAInboundInteraction()
         * @generated
         */
        EClass JCA_INBOUND_INTERACTION = eINSTANCE.getJCAInboundInteraction();

        /**
         * The meta object literal for the '<em><b>Listener</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JCA_INBOUND_INTERACTION__LISTENER = eINSTANCE.getJCAInboundInteraction_Listener();

        /**
         * The meta object literal for the '<em><b>Endpoint</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_INBOUND_INTERACTION__ENDPOINT = eINSTANCE.getJCAInboundInteraction_Endpoint();

        /**
         * The meta object literal for the '<em><b>Transacted</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JCA_INBOUND_INTERACTION__TRANSACTED = eINSTANCE.getJCAInboundInteraction_Transacted();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JCA_INBOUND_INTERACTION__ANY = eINSTANCE.getJCAInboundInteraction_Any();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JCA_INBOUND_INTERACTION__ANY_ATTRIBUTE = eINSTANCE.getJCAInboundInteraction_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundConnectionImpl <em>JCA Outbound Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundConnectionImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCAOutboundConnection()
         * @generated
         */
        EClass JCA_OUTBOUND_CONNECTION = eINSTANCE.getJCAOutboundConnection();

        /**
         * The meta object literal for the '<em><b>Resource Adapter</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_OUTBOUND_CONNECTION__RESOURCE_ADAPTER = eINSTANCE.getJCAOutboundConnection_ResourceAdapter();

        /**
         * The meta object literal for the '<em><b>Connection</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_OUTBOUND_CONNECTION__CONNECTION = eINSTANCE.getJCAOutboundConnection_Connection();

        /**
         * The meta object literal for the '<em><b>Res Auth</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JCA_OUTBOUND_CONNECTION__RES_AUTH = eINSTANCE.getJCAOutboundConnection_ResAuth();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JCA_OUTBOUND_CONNECTION__ANY = eINSTANCE.getJCAOutboundConnection_Any();

        /**
         * The meta object literal for the '<em><b>Managed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JCA_OUTBOUND_CONNECTION__MANAGED = eINSTANCE.getJCAOutboundConnection_Managed();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JCA_OUTBOUND_CONNECTION__ANY_ATTRIBUTE = eINSTANCE.getJCAOutboundConnection_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundInteractionImpl <em>JCA Outbound Interaction</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundInteractionImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCAOutboundInteraction()
         * @generated
         */
        EClass JCA_OUTBOUND_INTERACTION = eINSTANCE.getJCAOutboundInteraction();

        /**
         * The meta object literal for the '<em><b>Connection Spec</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_OUTBOUND_INTERACTION__CONNECTION_SPEC = eINSTANCE.getJCAOutboundInteraction_ConnectionSpec();

        /**
         * The meta object literal for the '<em><b>Interaction Spec</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_OUTBOUND_INTERACTION__INTERACTION_SPEC = eINSTANCE.getJCAOutboundInteraction_InteractionSpec();

        /**
         * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_OUTBOUND_INTERACTION__OPERATION = eINSTANCE.getJCAOutboundInteraction_Operation();

        /**
         * The meta object literal for the '<em><b>Processor</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_OUTBOUND_INTERACTION__PROCESSOR = eINSTANCE.getJCAOutboundInteraction_Processor();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JCA_OUTBOUND_INTERACTION__ANY = eINSTANCE.getJCAOutboundInteraction_Any();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JCA_OUTBOUND_INTERACTION__ANY_ATTRIBUTE = eINSTANCE.getJCAOutboundInteraction_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.OperationImpl <em>Operation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.OperationImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getOperation()
         * @generated
         */
        EClass OPERATION = eINSTANCE.getOperation();

        /**
         * The meta object literal for the '<em><b>Interaction Spec</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION__INTERACTION_SPEC = eINSTANCE.getOperation_InteractionSpec();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION__ANY = eINSTANCE.getOperation_Any();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION__ANY_ATTRIBUTE = eINSTANCE.getOperation_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.PropertyImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getProperty()
         * @generated
         */
        EClass PROPERTY = eINSTANCE.getProperty();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.ResourceAdapterImpl <em>Resource Adapter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.ResourceAdapterImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getResourceAdapter()
         * @generated
         */
        EClass RESOURCE_ADAPTER = eINSTANCE.getResourceAdapter();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESOURCE_ADAPTER__PROPERTY = eINSTANCE.getResourceAdapter_Property();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_ADAPTER__ANY = eINSTANCE.getResourceAdapter_Any();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_ADAPTER__NAME = eINSTANCE.getResourceAdapter_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_ADAPTER__TYPE = eINSTANCE.getResourceAdapter_Type();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_ADAPTER__ANY_ATTRIBUTE = eINSTANCE.getResourceAdapter_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.ProcessorImpl <em>Processor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.ProcessorImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getProcessor()
         * @generated
         */
        EClass PROCESSOR = eINSTANCE.getProcessor();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESSOR__PROPERTY = eINSTANCE.getProcessor_Property();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESSOR__ANY = eINSTANCE.getProcessor_Any();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESSOR__TYPE = eINSTANCE.getProcessor_Type();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESSOR__ANY_ATTRIBUTE = eINSTANCE.getProcessor_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.EndpointImpl <em>Endpoint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.EndpointImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getEndpoint()
         * @generated
         */
        EClass ENDPOINT = eINSTANCE.getEndpoint();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENDPOINT__PROPERTY = eINSTANCE.getEndpoint_Property();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENDPOINT__ANY = eINSTANCE.getEndpoint_Any();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENDPOINT__TYPE = eINSTANCE.getEndpoint_Type();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENDPOINT__ANY_ATTRIBUTE = eINSTANCE.getEndpoint_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.JCACreateResource <em>JCA Create Resource</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.JCACreateResource
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCACreateResource()
         * @generated
         */
        EEnum JCA_CREATE_RESOURCE = eINSTANCE.getJCACreateResource();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.ResAuth <em>Res Auth</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.ResAuth
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getResAuth()
         * @generated
         */
        EEnum RES_AUTH = eINSTANCE.getResAuth();

        /**
         * The meta object literal for the '<em>JCA Create Resource Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.JCACreateResource
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCACreateResourceObject()
         * @generated
         */
        EDataType JCA_CREATE_RESOURCE_OBJECT = eINSTANCE.getJCACreateResourceObject();

        /**
         * The meta object literal for the '<em>Res Auth Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.ResAuth
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getResAuthObject()
         * @generated
         */
        EDataType RES_AUTH_OBJECT = eINSTANCE.getResAuthObject();

    }

} //JcaPackage
