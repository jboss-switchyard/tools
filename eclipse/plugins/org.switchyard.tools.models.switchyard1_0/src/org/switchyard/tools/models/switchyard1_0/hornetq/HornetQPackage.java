/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.hornetq;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

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
 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQFactory
 * @model kind="package"
 * @generated
 */
public interface HornetQPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "hornetq";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-hornetq:config:1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "hornetq";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    HornetQPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.BindingTypeImpl <em>Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.BindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl#getBindingType()
     * @generated
     */
    int BINDING_TYPE = 0;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINDING_TYPE__DOCUMENTATION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINDING_TYPE__ANY_ATTRIBUTE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINDING_TYPE__WIRE_FORMAT_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINDING_TYPE__WIRE_FORMAT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINDING_TYPE__OPERATION_SELECTOR_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINDING_TYPE__OPERATION_SELECTOR = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINDING_TYPE__NAME = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINDING_TYPE__POLICY_SETS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINDING_TYPE__REQUIRES = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINDING_TYPE__URI = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINDING_TYPE__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINDING_TYPE__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Config</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINDING_TYPE__CONFIG = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINDING_TYPE_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl <em>Config Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl#getConfigType()
     * @generated
     */
    int CONFIG_TYPE = 1;

    /**
     * The feature id for the '<em><b>Ack Batch Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__ACK_BATCH_SIZE = 0;

    /**
     * The feature id for the '<em><b>Auto Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__AUTO_GROUP = 1;

    /**
     * The feature id for the '<em><b>Block On Acknowledge</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__BLOCK_ON_ACKNOWLEDGE = 2;

    /**
     * The feature id for the '<em><b>Block On Durable Send</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__BLOCK_ON_DURABLE_SEND = 3;

    /**
     * The feature id for the '<em><b>Block On Non Durable Send</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__BLOCK_ON_NON_DURABLE_SEND = 4;

    /**
     * The feature id for the '<em><b>Cache Large Messages On Consumer</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__CACHE_LARGE_MESSAGES_ON_CONSUMER = 5;

    /**
     * The feature id for the '<em><b>Call Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__CALL_TIMEOUT = 6;

    /**
     * The feature id for the '<em><b>Client Failure Check Period</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__CLIENT_FAILURE_CHECK_PERIOD = 7;

    /**
     * The feature id for the '<em><b>Compress Large Messages</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__COMPRESS_LARGE_MESSAGES = 8;

    /**
     * The feature id for the '<em><b>Connection Load Balancing Policy Class Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__CONNECTION_LOAD_BALANCING_POLICY_CLASS_NAME = 9;

    /**
     * The feature id for the '<em><b>Connection TTL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__CONNECTION_TTL = 10;

    /**
     * The feature id for the '<em><b>Confirmation Window Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__CONFIRMATION_WINDOW_SIZE = 11;

    /**
     * The feature id for the '<em><b>Connector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__CONNECTOR = 12;

    /**
     * The feature id for the '<em><b>Consumer Max Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__CONSUMER_MAX_RATE = 13;

    /**
     * The feature id for the '<em><b>Consumer Window Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__CONSUMER_WINDOW_SIZE = 14;

    /**
     * The feature id for the '<em><b>Disable Finalize Check</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__DISABLE_FINALIZE_CHECK = 15;

    /**
     * The feature id for the '<em><b>Discovery Group</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__DISCOVERY_GROUP = 16;

    /**
     * The feature id for the '<em><b>Failover On Initial Connection</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__FAILOVER_ON_INITIAL_CONNECTION = 17;

    /**
     * The feature id for the '<em><b>Group ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__GROUP_ID = 18;

    /**
     * The feature id for the '<em><b>Initial Message Packet Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__INITIAL_MESSAGE_PACKET_SIZE = 19;

    /**
     * The feature id for the '<em><b>Initial Reconnect Attempts</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__INITIAL_RECONNECT_ATTEMPTS = 20;

    /**
     * The feature id for the '<em><b>Max Retry Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__MAX_RETRY_INTERVAL = 21;

    /**
     * The feature id for the '<em><b>Min Large Message Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__MIN_LARGE_MESSAGE_SIZE = 22;

    /**
     * The feature id for the '<em><b>Pre Acknowledge</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__PRE_ACKNOWLEDGE = 23;

    /**
     * The feature id for the '<em><b>Producer Max Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__PRODUCER_MAX_RATE = 24;

    /**
     * The feature id for the '<em><b>Producer Window Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__PRODUCER_WINDOW_SIZE = 25;

    /**
     * The feature id for the '<em><b>Queue</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__QUEUE = 26;

    /**
     * The feature id for the '<em><b>Reconnect Attempts</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__RECONNECT_ATTEMPTS = 27;

    /**
     * The feature id for the '<em><b>Retry Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__RETRY_INTERVAL = 28;

    /**
     * The feature id for the '<em><b>Retry Interval Multiplier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__RETRY_INTERVAL_MULTIPLIER = 29;

    /**
     * The feature id for the '<em><b>Scheduled Thread Pool Max Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__SCHEDULED_THREAD_POOL_MAX_SIZE = 30;

    /**
     * The feature id for the '<em><b>Thread Pool Max Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__THREAD_POOL_MAX_SIZE = 31;

    /**
     * The feature id for the '<em><b>Use Global Pools</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__USE_GLOBAL_POOLS = 32;

    /**
     * The feature id for the '<em><b>Use HA</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__USE_HA = 33;

    /**
     * The feature id for the '<em><b>Xa Session</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__XA_SESSION = 34;

    /**
     * The number of structural features of the '<em>Config Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE_FEATURE_COUNT = 35;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConnectorTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl#getConnectorType()
     * @generated
     */
    int CONNECTOR_TYPE = 2;

    /**
     * The feature id for the '<em><b>Factory Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__FACTORY_CLASS = 0;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__PROPERTIES = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__NAME = 2;

    /**
     * The number of structural features of the '<em>Connector Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.DiscoveryGroupTypeImpl <em>Discovery Group Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.DiscoveryGroupTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl#getDiscoveryGroupType()
     * @generated
     */
    int DISCOVERY_GROUP_TYPE = 3;

    /**
     * The feature id for the '<em><b>Local Bind Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCOVERY_GROUP_TYPE__LOCAL_BIND_ADDRESS = 0;

    /**
     * The feature id for the '<em><b>Group Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCOVERY_GROUP_TYPE__GROUP_ADDRESS = 1;

    /**
     * The feature id for the '<em><b>Group Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCOVERY_GROUP_TYPE__GROUP_PORT = 2;

    /**
     * The feature id for the '<em><b>Refresh Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCOVERY_GROUP_TYPE__REFRESH_TIMEOUT = 3;

    /**
     * The feature id for the '<em><b>Initial Wait Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCOVERY_GROUP_TYPE__INITIAL_WAIT_TIMEOUT = 4;

    /**
     * The number of structural features of the '<em>Discovery Group Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCOVERY_GROUP_TYPE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl#getDocumentRoot()
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
     * The feature id for the '<em><b>Binding Hornetq</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_HORNETQ = 3;

    /**
     * The feature id for the '<em><b>Config</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONFIG = 4;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.PropertiesTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl#getPropertiesType()
     * @generated
     */
    int PROPERTIES_TYPE = 5;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_TYPE__PROPERTY = 0;

    /**
     * The number of structural features of the '<em>Properties Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.PropertyTypeImpl <em>Property Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.PropertyTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl#getPropertyType()
     * @generated
     */
    int PROPERTY_TYPE = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_TYPE__NAME = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_TYPE__VALUE = 1;

    /**
     * The number of structural features of the '<em>Property Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_TYPE_FEATURE_COUNT = 2;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.hornetq.BindingType <em>Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.BindingType
     * @generated
     */
    EClass getBindingType();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.hornetq.BindingType#getConfig <em>Config</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Config</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.BindingType#getConfig()
     * @see #getBindingType()
     * @generated
     */
    EReference getBindingType_Config();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType <em>Config Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Config Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType
     * @generated
     */
    EClass getConfigType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getAckBatchSize <em>Ack Batch Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ack Batch Size</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getAckBatchSize()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_AckBatchSize();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isAutoGroup <em>Auto Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Auto Group</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isAutoGroup()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_AutoGroup();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isBlockOnAcknowledge <em>Block On Acknowledge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Block On Acknowledge</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isBlockOnAcknowledge()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_BlockOnAcknowledge();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isBlockOnDurableSend <em>Block On Durable Send</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Block On Durable Send</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isBlockOnDurableSend()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_BlockOnDurableSend();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isBlockOnNonDurableSend <em>Block On Non Durable Send</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Block On Non Durable Send</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isBlockOnNonDurableSend()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_BlockOnNonDurableSend();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isCacheLargeMessagesOnConsumer <em>Cache Large Messages On Consumer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cache Large Messages On Consumer</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isCacheLargeMessagesOnConsumer()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_CacheLargeMessagesOnConsumer();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getCallTimeout <em>Call Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Call Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getCallTimeout()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_CallTimeout();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getClientFailureCheckPeriod <em>Client Failure Check Period</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Client Failure Check Period</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getClientFailureCheckPeriod()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_ClientFailureCheckPeriod();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isCompressLargeMessages <em>Compress Large Messages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Compress Large Messages</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isCompressLargeMessages()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_CompressLargeMessages();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConnectionLoadBalancingPolicyClassName <em>Connection Load Balancing Policy Class Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connection Load Balancing Policy Class Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConnectionLoadBalancingPolicyClassName()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_ConnectionLoadBalancingPolicyClassName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConnectionTTL <em>Connection TTL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connection TTL</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConnectionTTL()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_ConnectionTTL();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConfirmationWindowSize <em>Confirmation Window Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Confirmation Window Size</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConfirmationWindowSize()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_ConfirmationWindowSize();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConnector <em>Connector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Connector</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConnector()
     * @see #getConfigType()
     * @generated
     */
    EReference getConfigType_Connector();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConsumerMaxRate <em>Consumer Max Rate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Consumer Max Rate</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConsumerMaxRate()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_ConsumerMaxRate();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConsumerWindowSize <em>Consumer Window Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Consumer Window Size</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConsumerWindowSize()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_ConsumerWindowSize();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isDisableFinalizeCheck <em>Disable Finalize Check</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Disable Finalize Check</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isDisableFinalizeCheck()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_DisableFinalizeCheck();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getDiscoveryGroup <em>Discovery Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Discovery Group</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getDiscoveryGroup()
     * @see #getConfigType()
     * @generated
     */
    EReference getConfigType_DiscoveryGroup();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isFailoverOnInitialConnection <em>Failover On Initial Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Failover On Initial Connection</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isFailoverOnInitialConnection()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_FailoverOnInitialConnection();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getGroupID <em>Group ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Group ID</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getGroupID()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_GroupID();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getInitialMessagePacketSize <em>Initial Message Packet Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initial Message Packet Size</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getInitialMessagePacketSize()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_InitialMessagePacketSize();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getInitialReconnectAttempts <em>Initial Reconnect Attempts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initial Reconnect Attempts</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getInitialReconnectAttempts()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_InitialReconnectAttempts();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getMaxRetryInterval <em>Max Retry Interval</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Retry Interval</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getMaxRetryInterval()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_MaxRetryInterval();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getMinLargeMessageSize <em>Min Large Message Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Large Message Size</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getMinLargeMessageSize()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_MinLargeMessageSize();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isPreAcknowledge <em>Pre Acknowledge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pre Acknowledge</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isPreAcknowledge()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_PreAcknowledge();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getProducerMaxRate <em>Producer Max Rate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Producer Max Rate</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getProducerMaxRate()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_ProducerMaxRate();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getProducerWindowSize <em>Producer Window Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Producer Window Size</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getProducerWindowSize()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_ProducerWindowSize();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getQueue <em>Queue</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Queue</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getQueue()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_Queue();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getReconnectAttempts <em>Reconnect Attempts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reconnect Attempts</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getReconnectAttempts()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_ReconnectAttempts();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getRetryInterval <em>Retry Interval</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Retry Interval</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getRetryInterval()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_RetryInterval();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getRetryIntervalMultiplier <em>Retry Interval Multiplier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Retry Interval Multiplier</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getRetryIntervalMultiplier()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_RetryIntervalMultiplier();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getScheduledThreadPoolMaxSize <em>Scheduled Thread Pool Max Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scheduled Thread Pool Max Size</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getScheduledThreadPoolMaxSize()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_ScheduledThreadPoolMaxSize();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getThreadPoolMaxSize <em>Thread Pool Max Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Thread Pool Max Size</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getThreadPoolMaxSize()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_ThreadPoolMaxSize();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isUseGlobalPools <em>Use Global Pools</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Global Pools</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isUseGlobalPools()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_UseGlobalPools();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isUseHA <em>Use HA</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use HA</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isUseHA()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_UseHA();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isXaSession <em>Xa Session</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xa Session</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isXaSession()
     * @see #getConfigType()
     * @generated
     */
    EAttribute getConfigType_XaSession();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConnectorType <em>Connector Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connector Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConnectorType
     * @generated
     */
    EClass getConnectorType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConnectorType#getFactoryClass <em>Factory Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Factory Class</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConnectorType#getFactoryClass()
     * @see #getConnectorType()
     * @generated
     */
    EAttribute getConnectorType_FactoryClass();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConnectorType#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConnectorType#getProperties()
     * @see #getConnectorType()
     * @generated
     */
    EReference getConnectorType_Properties();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConnectorType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.ConnectorType#getName()
     * @see #getConnectorType()
     * @generated
     */
    EAttribute getConnectorType_Name();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType <em>Discovery Group Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Discovery Group Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType
     * @generated
     */
    EClass getDiscoveryGroupType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getLocalBindAddress <em>Local Bind Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Bind Address</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getLocalBindAddress()
     * @see #getDiscoveryGroupType()
     * @generated
     */
    EAttribute getDiscoveryGroupType_LocalBindAddress();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getGroupAddress <em>Group Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Group Address</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getGroupAddress()
     * @see #getDiscoveryGroupType()
     * @generated
     */
    EAttribute getDiscoveryGroupType_GroupAddress();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getGroupPort <em>Group Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Group Port</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getGroupPort()
     * @see #getDiscoveryGroupType()
     * @generated
     */
    EAttribute getDiscoveryGroupType_GroupPort();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getRefreshTimeout <em>Refresh Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Refresh Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getRefreshTimeout()
     * @see #getDiscoveryGroupType()
     * @generated
     */
    EAttribute getDiscoveryGroupType_RefreshTimeout();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getInitialWaitTimeout <em>Initial Wait Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initial Wait Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType#getInitialWaitTimeout()
     * @see #getDiscoveryGroupType()
     * @generated
     */
    EAttribute getDiscoveryGroupType_InitialWaitTimeout();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DocumentRoot#getBindingHornetq <em>Binding Hornetq</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Hornetq</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.DocumentRoot#getBindingHornetq()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingHornetq();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.hornetq.DocumentRoot#getConfig <em>Config</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Config</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.DocumentRoot#getConfig()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Config();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.hornetq.PropertiesType <em>Properties Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Properties Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.PropertiesType
     * @generated
     */
    EClass getPropertiesType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.hornetq.PropertiesType#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.PropertiesType#getProperty()
     * @see #getPropertiesType()
     * @generated
     */
    EReference getPropertiesType_Property();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.hornetq.PropertyType <em>Property Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.PropertyType
     * @generated
     */
    EClass getPropertyType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.PropertyType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.PropertyType#getName()
     * @see #getPropertyType()
     * @generated
     */
    EAttribute getPropertyType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.hornetq.PropertyType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.PropertyType#getValue()
     * @see #getPropertyType()
     * @generated
     */
    EAttribute getPropertyType_Value();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    HornetQFactory getHornetQFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.BindingTypeImpl <em>Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.BindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl#getBindingType()
         * @generated
         */
        EClass BINDING_TYPE = eINSTANCE.getBindingType();

        /**
         * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BINDING_TYPE__CONFIG = eINSTANCE.getBindingType_Config();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl <em>Config Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConfigTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl#getConfigType()
         * @generated
         */
        EClass CONFIG_TYPE = eINSTANCE.getConfigType();

        /**
         * The meta object literal for the '<em><b>Ack Batch Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__ACK_BATCH_SIZE = eINSTANCE.getConfigType_AckBatchSize();

        /**
         * The meta object literal for the '<em><b>Auto Group</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__AUTO_GROUP = eINSTANCE.getConfigType_AutoGroup();

        /**
         * The meta object literal for the '<em><b>Block On Acknowledge</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__BLOCK_ON_ACKNOWLEDGE = eINSTANCE.getConfigType_BlockOnAcknowledge();

        /**
         * The meta object literal for the '<em><b>Block On Durable Send</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__BLOCK_ON_DURABLE_SEND = eINSTANCE.getConfigType_BlockOnDurableSend();

        /**
         * The meta object literal for the '<em><b>Block On Non Durable Send</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__BLOCK_ON_NON_DURABLE_SEND = eINSTANCE.getConfigType_BlockOnNonDurableSend();

        /**
         * The meta object literal for the '<em><b>Cache Large Messages On Consumer</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__CACHE_LARGE_MESSAGES_ON_CONSUMER = eINSTANCE.getConfigType_CacheLargeMessagesOnConsumer();

        /**
         * The meta object literal for the '<em><b>Call Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__CALL_TIMEOUT = eINSTANCE.getConfigType_CallTimeout();

        /**
         * The meta object literal for the '<em><b>Client Failure Check Period</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__CLIENT_FAILURE_CHECK_PERIOD = eINSTANCE.getConfigType_ClientFailureCheckPeriod();

        /**
         * The meta object literal for the '<em><b>Compress Large Messages</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__COMPRESS_LARGE_MESSAGES = eINSTANCE.getConfigType_CompressLargeMessages();

        /**
         * The meta object literal for the '<em><b>Connection Load Balancing Policy Class Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__CONNECTION_LOAD_BALANCING_POLICY_CLASS_NAME = eINSTANCE.getConfigType_ConnectionLoadBalancingPolicyClassName();

        /**
         * The meta object literal for the '<em><b>Connection TTL</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__CONNECTION_TTL = eINSTANCE.getConfigType_ConnectionTTL();

        /**
         * The meta object literal for the '<em><b>Confirmation Window Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__CONFIRMATION_WINDOW_SIZE = eINSTANCE.getConfigType_ConfirmationWindowSize();

        /**
         * The meta object literal for the '<em><b>Connector</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONFIG_TYPE__CONNECTOR = eINSTANCE.getConfigType_Connector();

        /**
         * The meta object literal for the '<em><b>Consumer Max Rate</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__CONSUMER_MAX_RATE = eINSTANCE.getConfigType_ConsumerMaxRate();

        /**
         * The meta object literal for the '<em><b>Consumer Window Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__CONSUMER_WINDOW_SIZE = eINSTANCE.getConfigType_ConsumerWindowSize();

        /**
         * The meta object literal for the '<em><b>Disable Finalize Check</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__DISABLE_FINALIZE_CHECK = eINSTANCE.getConfigType_DisableFinalizeCheck();

        /**
         * The meta object literal for the '<em><b>Discovery Group</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONFIG_TYPE__DISCOVERY_GROUP = eINSTANCE.getConfigType_DiscoveryGroup();

        /**
         * The meta object literal for the '<em><b>Failover On Initial Connection</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__FAILOVER_ON_INITIAL_CONNECTION = eINSTANCE.getConfigType_FailoverOnInitialConnection();

        /**
         * The meta object literal for the '<em><b>Group ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__GROUP_ID = eINSTANCE.getConfigType_GroupID();

        /**
         * The meta object literal for the '<em><b>Initial Message Packet Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__INITIAL_MESSAGE_PACKET_SIZE = eINSTANCE.getConfigType_InitialMessagePacketSize();

        /**
         * The meta object literal for the '<em><b>Initial Reconnect Attempts</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__INITIAL_RECONNECT_ATTEMPTS = eINSTANCE.getConfigType_InitialReconnectAttempts();

        /**
         * The meta object literal for the '<em><b>Max Retry Interval</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__MAX_RETRY_INTERVAL = eINSTANCE.getConfigType_MaxRetryInterval();

        /**
         * The meta object literal for the '<em><b>Min Large Message Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__MIN_LARGE_MESSAGE_SIZE = eINSTANCE.getConfigType_MinLargeMessageSize();

        /**
         * The meta object literal for the '<em><b>Pre Acknowledge</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__PRE_ACKNOWLEDGE = eINSTANCE.getConfigType_PreAcknowledge();

        /**
         * The meta object literal for the '<em><b>Producer Max Rate</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__PRODUCER_MAX_RATE = eINSTANCE.getConfigType_ProducerMaxRate();

        /**
         * The meta object literal for the '<em><b>Producer Window Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__PRODUCER_WINDOW_SIZE = eINSTANCE.getConfigType_ProducerWindowSize();

        /**
         * The meta object literal for the '<em><b>Queue</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__QUEUE = eINSTANCE.getConfigType_Queue();

        /**
         * The meta object literal for the '<em><b>Reconnect Attempts</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__RECONNECT_ATTEMPTS = eINSTANCE.getConfigType_ReconnectAttempts();

        /**
         * The meta object literal for the '<em><b>Retry Interval</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__RETRY_INTERVAL = eINSTANCE.getConfigType_RetryInterval();

        /**
         * The meta object literal for the '<em><b>Retry Interval Multiplier</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__RETRY_INTERVAL_MULTIPLIER = eINSTANCE.getConfigType_RetryIntervalMultiplier();

        /**
         * The meta object literal for the '<em><b>Scheduled Thread Pool Max Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__SCHEDULED_THREAD_POOL_MAX_SIZE = eINSTANCE.getConfigType_ScheduledThreadPoolMaxSize();

        /**
         * The meta object literal for the '<em><b>Thread Pool Max Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__THREAD_POOL_MAX_SIZE = eINSTANCE.getConfigType_ThreadPoolMaxSize();

        /**
         * The meta object literal for the '<em><b>Use Global Pools</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__USE_GLOBAL_POOLS = eINSTANCE.getConfigType_UseGlobalPools();

        /**
         * The meta object literal for the '<em><b>Use HA</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__USE_HA = eINSTANCE.getConfigType_UseHA();

        /**
         * The meta object literal for the '<em><b>Xa Session</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_TYPE__XA_SESSION = eINSTANCE.getConfigType_XaSession();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConnectorTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl#getConnectorType()
         * @generated
         */
        EClass CONNECTOR_TYPE = eINSTANCE.getConnectorType();

        /**
         * The meta object literal for the '<em><b>Factory Class</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_TYPE__FACTORY_CLASS = eINSTANCE.getConnectorType_FactoryClass();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTOR_TYPE__PROPERTIES = eINSTANCE.getConnectorType_Properties();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_TYPE__NAME = eINSTANCE.getConnectorType_Name();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.DiscoveryGroupTypeImpl <em>Discovery Group Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.DiscoveryGroupTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl#getDiscoveryGroupType()
         * @generated
         */
        EClass DISCOVERY_GROUP_TYPE = eINSTANCE.getDiscoveryGroupType();

        /**
         * The meta object literal for the '<em><b>Local Bind Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DISCOVERY_GROUP_TYPE__LOCAL_BIND_ADDRESS = eINSTANCE.getDiscoveryGroupType_LocalBindAddress();

        /**
         * The meta object literal for the '<em><b>Group Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DISCOVERY_GROUP_TYPE__GROUP_ADDRESS = eINSTANCE.getDiscoveryGroupType_GroupAddress();

        /**
         * The meta object literal for the '<em><b>Group Port</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DISCOVERY_GROUP_TYPE__GROUP_PORT = eINSTANCE.getDiscoveryGroupType_GroupPort();

        /**
         * The meta object literal for the '<em><b>Refresh Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DISCOVERY_GROUP_TYPE__REFRESH_TIMEOUT = eINSTANCE.getDiscoveryGroupType_RefreshTimeout();

        /**
         * The meta object literal for the '<em><b>Initial Wait Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DISCOVERY_GROUP_TYPE__INITIAL_WAIT_TIMEOUT = eINSTANCE.getDiscoveryGroupType_InitialWaitTimeout();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Binding Hornetq</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_HORNETQ = eINSTANCE.getDocumentRoot_BindingHornetq();

        /**
         * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CONFIG = eINSTANCE.getDocumentRoot_Config();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.PropertiesTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl#getPropertiesType()
         * @generated
         */
        EClass PROPERTIES_TYPE = eINSTANCE.getPropertiesType();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTIES_TYPE__PROPERTY = eINSTANCE.getPropertiesType_Property();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.PropertyTypeImpl <em>Property Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.PropertyTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl#getPropertyType()
         * @generated
         */
        EClass PROPERTY_TYPE = eINSTANCE.getPropertyType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY_TYPE__NAME = eINSTANCE.getPropertyType_Name();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY_TYPE__VALUE = eINSTANCE.getPropertyType_Value();

    }

} //HornetQPackage
