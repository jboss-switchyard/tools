/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.netty;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyFactory
 * @model kind="package"
 * @generated
 */
public interface NettyPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "netty";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-camel-netty:config:1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "netty";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    NettyPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.BaseCamelBindingImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl#getBaseCamelBinding()
     * @generated
     */
    int BASE_CAMEL_BINDING = 0;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__DOCUMENTATION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__ANY_ATTRIBUTE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__WIRE_FORMAT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__OPERATION_SELECTOR = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__NAME = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__POLICY_SETS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__REQUIRES = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__URI = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER;

    /**
     * The number of structural features of the '<em>Base Camel Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl <em>Camel Netty Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl#getCamelNettyBindingType()
     * @generated
     */
    int CAMEL_NETTY_BINDING_TYPE = 1;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__HOST = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__PORT = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Receive Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__RECEIVE_BUFFER_SIZE = BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Send Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__SEND_BUFFER_SIZE = BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Reuse Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__REUSE_ADDRESS = BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Encoders</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__ENCODERS = BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Decoders</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__DECODERS = BASE_CAMEL_BINDING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Allow Default Codec</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC = BASE_CAMEL_BINDING_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Worker Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Sync</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__SYNC = BASE_CAMEL_BINDING_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Disconnect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__DISCONNECT = BASE_CAMEL_BINDING_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>Camel Netty Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 11;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyTcpBindingTypeImpl <em>Camel Netty Tcp Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyTcpBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl#getCamelNettyTcpBindingType()
     * @generated
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE = 2;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__DOCUMENTATION = CAMEL_NETTY_BINDING_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__ANY_ATTRIBUTE = CAMEL_NETTY_BINDING_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__WIRE_FORMAT_GROUP = CAMEL_NETTY_BINDING_TYPE__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__WIRE_FORMAT = CAMEL_NETTY_BINDING_TYPE__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__OPERATION_SELECTOR_GROUP = CAMEL_NETTY_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__OPERATION_SELECTOR = CAMEL_NETTY_BINDING_TYPE__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__NAME = CAMEL_NETTY_BINDING_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__POLICY_SETS = CAMEL_NETTY_BINDING_TYPE__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__REQUIRES = CAMEL_NETTY_BINDING_TYPE__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__URI = CAMEL_NETTY_BINDING_TYPE__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__CONTEXT_MAPPER = CAMEL_NETTY_BINDING_TYPE__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__MESSAGE_COMPOSER = CAMEL_NETTY_BINDING_TYPE__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__HOST = CAMEL_NETTY_BINDING_TYPE__HOST;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__PORT = CAMEL_NETTY_BINDING_TYPE__PORT;

    /**
     * The feature id for the '<em><b>Receive Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__RECEIVE_BUFFER_SIZE = CAMEL_NETTY_BINDING_TYPE__RECEIVE_BUFFER_SIZE;

    /**
     * The feature id for the '<em><b>Send Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__SEND_BUFFER_SIZE = CAMEL_NETTY_BINDING_TYPE__SEND_BUFFER_SIZE;

    /**
     * The feature id for the '<em><b>Reuse Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__REUSE_ADDRESS = CAMEL_NETTY_BINDING_TYPE__REUSE_ADDRESS;

    /**
     * The feature id for the '<em><b>Encoders</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__ENCODERS = CAMEL_NETTY_BINDING_TYPE__ENCODERS;

    /**
     * The feature id for the '<em><b>Decoders</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__DECODERS = CAMEL_NETTY_BINDING_TYPE__DECODERS;

    /**
     * The feature id for the '<em><b>Allow Default Codec</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__ALLOW_DEFAULT_CODEC = CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC;

    /**
     * The feature id for the '<em><b>Worker Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__WORKER_COUNT = CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT;

    /**
     * The feature id for the '<em><b>Sync</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__SYNC = CAMEL_NETTY_BINDING_TYPE__SYNC;

    /**
     * The feature id for the '<em><b>Disconnect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__DISCONNECT = CAMEL_NETTY_BINDING_TYPE__DISCONNECT;

    /**
     * The feature id for the '<em><b>Textline</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__TEXTLINE = CAMEL_NETTY_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Tcp No Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__TCP_NO_DELAY = CAMEL_NETTY_BINDING_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Keep Alive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__KEEP_ALIVE = CAMEL_NETTY_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Camel Netty Tcp Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE_FEATURE_COUNT = CAMEL_NETTY_BINDING_TYPE_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyUdpBindingTypeImpl <em>Camel Netty Udp Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyUdpBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl#getCamelNettyUdpBindingType()
     * @generated
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE = 3;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__DOCUMENTATION = CAMEL_NETTY_BINDING_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__ANY_ATTRIBUTE = CAMEL_NETTY_BINDING_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__WIRE_FORMAT_GROUP = CAMEL_NETTY_BINDING_TYPE__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__WIRE_FORMAT = CAMEL_NETTY_BINDING_TYPE__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__OPERATION_SELECTOR_GROUP = CAMEL_NETTY_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__OPERATION_SELECTOR = CAMEL_NETTY_BINDING_TYPE__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__NAME = CAMEL_NETTY_BINDING_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__POLICY_SETS = CAMEL_NETTY_BINDING_TYPE__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__REQUIRES = CAMEL_NETTY_BINDING_TYPE__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__URI = CAMEL_NETTY_BINDING_TYPE__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__CONTEXT_MAPPER = CAMEL_NETTY_BINDING_TYPE__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__MESSAGE_COMPOSER = CAMEL_NETTY_BINDING_TYPE__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__HOST = CAMEL_NETTY_BINDING_TYPE__HOST;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__PORT = CAMEL_NETTY_BINDING_TYPE__PORT;

    /**
     * The feature id for the '<em><b>Receive Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__RECEIVE_BUFFER_SIZE = CAMEL_NETTY_BINDING_TYPE__RECEIVE_BUFFER_SIZE;

    /**
     * The feature id for the '<em><b>Send Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__SEND_BUFFER_SIZE = CAMEL_NETTY_BINDING_TYPE__SEND_BUFFER_SIZE;

    /**
     * The feature id for the '<em><b>Reuse Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__REUSE_ADDRESS = CAMEL_NETTY_BINDING_TYPE__REUSE_ADDRESS;

    /**
     * The feature id for the '<em><b>Encoders</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__ENCODERS = CAMEL_NETTY_BINDING_TYPE__ENCODERS;

    /**
     * The feature id for the '<em><b>Decoders</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__DECODERS = CAMEL_NETTY_BINDING_TYPE__DECODERS;

    /**
     * The feature id for the '<em><b>Allow Default Codec</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__ALLOW_DEFAULT_CODEC = CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC;

    /**
     * The feature id for the '<em><b>Worker Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__WORKER_COUNT = CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT;

    /**
     * The feature id for the '<em><b>Sync</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__SYNC = CAMEL_NETTY_BINDING_TYPE__SYNC;

    /**
     * The feature id for the '<em><b>Disconnect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__DISCONNECT = CAMEL_NETTY_BINDING_TYPE__DISCONNECT;

    /**
     * The feature id for the '<em><b>Broadcast</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__BROADCAST = CAMEL_NETTY_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Camel Netty Udp Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE_FEATURE_COUNT = CAMEL_NETTY_BINDING_TYPE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 4;

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
     * The feature id for the '<em><b>Binding Netty UDP</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_NETTY_UDP = 3;

    /**
     * The feature id for the '<em><b>Binding Netty TCP</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_NETTY_TCP = 4;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 5;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.BaseCamelBinding <em>Base Camel Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Camel Binding</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.BaseCamelBinding
     * @generated
     */
    EClass getBaseCamelBinding();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType <em>Camel Netty Tcp Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Netty Tcp Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType
     * @generated
     */
    EClass getCamelNettyTcpBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#getTextline <em>Textline</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Textline</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#getTextline()
     * @see #getCamelNettyTcpBindingType()
     * @generated
     */
    EAttribute getCamelNettyTcpBindingType_Textline();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#getTcpNoDelay <em>Tcp No Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tcp No Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#getTcpNoDelay()
     * @see #getCamelNettyTcpBindingType()
     * @generated
     */
    EAttribute getCamelNettyTcpBindingType_TcpNoDelay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#getKeepAlive <em>Keep Alive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Keep Alive</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#getKeepAlive()
     * @see #getCamelNettyTcpBindingType()
     * @generated
     */
    EAttribute getCamelNettyTcpBindingType_KeepAlive();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyUdpBindingType <em>Camel Netty Udp Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Netty Udp Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyUdpBindingType
     * @generated
     */
    EClass getCamelNettyUdpBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyUdpBindingType#getBroadcast <em>Broadcast</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Broadcast</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyUdpBindingType#getBroadcast()
     * @see #getCamelNettyUdpBindingType()
     * @generated
     */
    EAttribute getCamelNettyUdpBindingType_Broadcast();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType <em>Camel Netty Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Netty Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType
     * @generated
     */
    EClass getCamelNettyBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getHost <em>Host</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Host</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getHost()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_Host();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getPort <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Port</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getPort()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_Port();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getReceiveBufferSize <em>Receive Buffer Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Receive Buffer Size</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getReceiveBufferSize()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_ReceiveBufferSize();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSendBufferSize <em>Send Buffer Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Send Buffer Size</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSendBufferSize()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_SendBufferSize();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isReuseAddress <em>Reuse Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reuse Address</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isReuseAddress()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_ReuseAddress();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getEncoders <em>Encoders</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Encoders</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getEncoders()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_Encoders();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getDecoders <em>Decoders</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Decoders</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getDecoders()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_Decoders();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getAllowDefaultCodec <em>Allow Default Codec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Allow Default Codec</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getAllowDefaultCodec()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_AllowDefaultCodec();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getWorkerCount <em>Worker Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Worker Count</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getWorkerCount()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_WorkerCount();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSync <em>Sync</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sync</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSync()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_Sync();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getDisconnect <em>Disconnect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Disconnect</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getDisconnect()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_Disconnect();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.DocumentRoot#getBindingNettyUDP <em>Binding Netty UDP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Netty UDP</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.DocumentRoot#getBindingNettyUDP()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingNettyUDP();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.DocumentRoot#getBindingNettyTCP <em>Binding Netty TCP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Netty TCP</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.DocumentRoot#getBindingNettyTCP()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingNettyTCP();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    NettyFactory getNettyFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.BaseCamelBindingImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl#getBaseCamelBinding()
         * @generated
         */
        EClass BASE_CAMEL_BINDING = eINSTANCE.getBaseCamelBinding();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyTcpBindingTypeImpl <em>Camel Netty Tcp Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyTcpBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl#getCamelNettyTcpBindingType()
         * @generated
         */
        EClass CAMEL_NETTY_TCP_BINDING_TYPE = eINSTANCE.getCamelNettyTcpBindingType();

        /**
         * The meta object literal for the '<em><b>Textline</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_TCP_BINDING_TYPE__TEXTLINE = eINSTANCE.getCamelNettyTcpBindingType_Textline();

        /**
         * The meta object literal for the '<em><b>Tcp No Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_TCP_BINDING_TYPE__TCP_NO_DELAY = eINSTANCE.getCamelNettyTcpBindingType_TcpNoDelay();

        /**
         * The meta object literal for the '<em><b>Keep Alive</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_TCP_BINDING_TYPE__KEEP_ALIVE = eINSTANCE.getCamelNettyTcpBindingType_KeepAlive();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyUdpBindingTypeImpl <em>Camel Netty Udp Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyUdpBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl#getCamelNettyUdpBindingType()
         * @generated
         */
        EClass CAMEL_NETTY_UDP_BINDING_TYPE = eINSTANCE.getCamelNettyUdpBindingType();

        /**
         * The meta object literal for the '<em><b>Broadcast</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_UDP_BINDING_TYPE__BROADCAST = eINSTANCE.getCamelNettyUdpBindingType_Broadcast();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl <em>Camel Netty Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl#getCamelNettyBindingType()
         * @generated
         */
        EClass CAMEL_NETTY_BINDING_TYPE = eINSTANCE.getCamelNettyBindingType();

        /**
         * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_BINDING_TYPE__HOST = eINSTANCE.getCamelNettyBindingType_Host();

        /**
         * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_BINDING_TYPE__PORT = eINSTANCE.getCamelNettyBindingType_Port();

        /**
         * The meta object literal for the '<em><b>Receive Buffer Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_BINDING_TYPE__RECEIVE_BUFFER_SIZE = eINSTANCE.getCamelNettyBindingType_ReceiveBufferSize();

        /**
         * The meta object literal for the '<em><b>Send Buffer Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_BINDING_TYPE__SEND_BUFFER_SIZE = eINSTANCE.getCamelNettyBindingType_SendBufferSize();

        /**
         * The meta object literal for the '<em><b>Reuse Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_BINDING_TYPE__REUSE_ADDRESS = eINSTANCE.getCamelNettyBindingType_ReuseAddress();

        /**
         * The meta object literal for the '<em><b>Encoders</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_BINDING_TYPE__ENCODERS = eINSTANCE.getCamelNettyBindingType_Encoders();

        /**
         * The meta object literal for the '<em><b>Decoders</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_BINDING_TYPE__DECODERS = eINSTANCE.getCamelNettyBindingType_Decoders();

        /**
         * The meta object literal for the '<em><b>Allow Default Codec</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC = eINSTANCE.getCamelNettyBindingType_AllowDefaultCodec();

        /**
         * The meta object literal for the '<em><b>Worker Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT = eINSTANCE.getCamelNettyBindingType_WorkerCount();

        /**
         * The meta object literal for the '<em><b>Sync</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_BINDING_TYPE__SYNC = eINSTANCE.getCamelNettyBindingType_Sync();

        /**
         * The meta object literal for the '<em><b>Disconnect</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_BINDING_TYPE__DISCONNECT = eINSTANCE.getCamelNettyBindingType_Disconnect();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Binding Netty UDP</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_NETTY_UDP = eINSTANCE.getDocumentRoot_BindingNettyUDP();

        /**
         * The meta object literal for the '<em><b>Binding Netty TCP</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_NETTY_TCP = eINSTANCE.getDocumentRoot_BindingNettyTCP();

    }

} //NettyPackage
