/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core;

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
 * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelFactory
 * @model kind="package"
 * @generated
 */
public interface CamelPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "core";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-camel-core:config:1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "camel";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CamelPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.BaseCamelBindingImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getBaseCamelBinding()
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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.GenericFileBindingTypeImpl <em>Generic File Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.GenericFileBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getGenericFileBindingType()
     * @generated
     */
    int GENERIC_FILE_BINDING_TYPE = 1;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__DIRECTORY = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Auto Create</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__AUTO_CREATE = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__BUFFER_SIZE = BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__FILE_NAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Flatten</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__FLATTEN = BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__CHARSET = BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Generic File Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 6;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelRemoteBindingTypeImpl <em>Remote Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelRemoteBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getCamelRemoteBindingType()
     * @generated
     */
    int CAMEL_REMOTE_BINDING_TYPE = 2;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__DOCUMENTATION = GENERIC_FILE_BINDING_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__ANY_ATTRIBUTE = GENERIC_FILE_BINDING_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__WIRE_FORMAT_GROUP = GENERIC_FILE_BINDING_TYPE__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__WIRE_FORMAT = GENERIC_FILE_BINDING_TYPE__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__OPERATION_SELECTOR_GROUP = GENERIC_FILE_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__OPERATION_SELECTOR = GENERIC_FILE_BINDING_TYPE__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__NAME = GENERIC_FILE_BINDING_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__POLICY_SETS = GENERIC_FILE_BINDING_TYPE__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__REQUIRES = GENERIC_FILE_BINDING_TYPE__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__URI = GENERIC_FILE_BINDING_TYPE__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__CONTEXT_MAPPER = GENERIC_FILE_BINDING_TYPE__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__MESSAGE_COMPOSER = GENERIC_FILE_BINDING_TYPE__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__DIRECTORY = GENERIC_FILE_BINDING_TYPE__DIRECTORY;

    /**
     * The feature id for the '<em><b>Auto Create</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__AUTO_CREATE = GENERIC_FILE_BINDING_TYPE__AUTO_CREATE;

    /**
     * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__BUFFER_SIZE = GENERIC_FILE_BINDING_TYPE__BUFFER_SIZE;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__FILE_NAME = GENERIC_FILE_BINDING_TYPE__FILE_NAME;

    /**
     * The feature id for the '<em><b>Flatten</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__FLATTEN = GENERIC_FILE_BINDING_TYPE__FLATTEN;

    /**
     * The feature id for the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__CHARSET = GENERIC_FILE_BINDING_TYPE__CHARSET;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__HOST = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__PORT = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__USERNAME = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__PASSWORD = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Binary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__BINARY = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Connect Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__CONNECT_TIMEOUT = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Disconnect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__DISCONNECT = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Maximum Reconnect Attempts</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Reconnect Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__RECONNECT_DELAY = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__SEPARATOR = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Stepwise</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__STEPWISE = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Throw Exception On Connect Failed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 11;

    /**
     * The number of structural features of the '<em>Remote Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 12;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.ScheduledPollConsumerTypeImpl <em>Scheduled Poll Consumer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.ScheduledPollConsumerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getScheduledPollConsumerType()
     * @generated
     */
    int SCHEDULED_POLL_CONSUMER_TYPE = 3;

    /**
     * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_POLL_CONSUMER_TYPE__INITIAL_DELAY = 0;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_POLL_CONSUMER_TYPE__DELAY = 1;

    /**
     * The feature id for the '<em><b>Use Fixed Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_POLL_CONSUMER_TYPE__USE_FIXED_DELAY = 2;

    /**
     * The feature id for the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = 3;

    /**
     * The feature id for the '<em><b>Time Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_POLL_CONSUMER_TYPE__TIME_UNIT = 4;

    /**
     * The number of structural features of the '<em>Scheduled Poll Consumer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.ScheduledBatchPollConsumerTypeImpl <em>Scheduled Batch Poll Consumer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.ScheduledBatchPollConsumerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getScheduledBatchPollConsumerType()
     * @generated
     */
    int SCHEDULED_BATCH_POLL_CONSUMER_TYPE = 4;

    /**
     * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_BATCH_POLL_CONSUMER_TYPE__INITIAL_DELAY = SCHEDULED_POLL_CONSUMER_TYPE__INITIAL_DELAY;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_BATCH_POLL_CONSUMER_TYPE__DELAY = SCHEDULED_POLL_CONSUMER_TYPE__DELAY;

    /**
     * The feature id for the '<em><b>Use Fixed Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_BATCH_POLL_CONSUMER_TYPE__USE_FIXED_DELAY = SCHEDULED_POLL_CONSUMER_TYPE__USE_FIXED_DELAY;

    /**
     * The feature id for the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_BATCH_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = SCHEDULED_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE;

    /**
     * The feature id for the '<em><b>Time Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_BATCH_POLL_CONSUMER_TYPE__TIME_UNIT = SCHEDULED_POLL_CONSUMER_TYPE__TIME_UNIT;

    /**
     * The feature id for the '<em><b>Max Messages Per Poll</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_BATCH_POLL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Scheduled Batch Poll Consumer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT = SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.GenericFileConsumerTypeImpl <em>Generic File Consumer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.GenericFileConsumerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getGenericFileConsumerType()
     * @generated
     */
    int GENERIC_FILE_CONSUMER_TYPE = 5;

    /**
     * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__INITIAL_DELAY = SCHEDULED_BATCH_POLL_CONSUMER_TYPE__INITIAL_DELAY;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__DELAY = SCHEDULED_BATCH_POLL_CONSUMER_TYPE__DELAY;

    /**
     * The feature id for the '<em><b>Use Fixed Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__USE_FIXED_DELAY = SCHEDULED_BATCH_POLL_CONSUMER_TYPE__USE_FIXED_DELAY;

    /**
     * The feature id for the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = SCHEDULED_BATCH_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE;

    /**
     * The feature id for the '<em><b>Time Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__TIME_UNIT = SCHEDULED_BATCH_POLL_CONSUMER_TYPE__TIME_UNIT;

    /**
     * The feature id for the '<em><b>Max Messages Per Poll</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = SCHEDULED_BATCH_POLL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL;

    /**
     * The feature id for the '<em><b>Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__DELETE = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Recursive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__RECURSIVE = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Noop</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__NOOP = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Pre Move</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__PRE_MOVE = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Move</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__MOVE = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Move Failed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__MOVE_FAILED = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Include</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__INCLUDE = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Exclude</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__EXCLUDE = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Idempotent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Idempotent Repository</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>In Progress Repository</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__FILTER = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Sorter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__SORTER = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Sort By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__SORT_BY = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Read Lock</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__READ_LOCK = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Read Lock Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Read Lock Check Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Exclusive Read Lock Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Process Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__PROCESS_STRATEGY = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Starting Directory Must Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Directory Must Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 20;

    /**
     * The feature id for the '<em><b>Done File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__DONE_FILE_NAME = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 21;

    /**
     * The number of structural features of the '<em>Generic File Consumer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE_FEATURE_COUNT = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 22;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.GenericFileProducerTypeImpl <em>Generic File Producer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.GenericFileProducerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getGenericFileProducerType()
     * @generated
     */
    int GENERIC_FILE_PRODUCER_TYPE = 6;

    /**
     * The feature id for the '<em><b>File Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_PRODUCER_TYPE__FILE_EXIST = 0;

    /**
     * The feature id for the '<em><b>Temp Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_PRODUCER_TYPE__TEMP_PREFIX = 1;

    /**
     * The feature id for the '<em><b>Temp File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_PRODUCER_TYPE__TEMP_FILE_NAME = 2;

    /**
     * The feature id for the '<em><b>Keep Last Modified</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED = 3;

    /**
     * The feature id for the '<em><b>Eager Delete Target File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE = 4;

    /**
     * The feature id for the '<em><b>Done File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_PRODUCER_TYPE__DONE_FILE_NAME = 5;

    /**
     * The number of structural features of the '<em>Generic File Producer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_PRODUCER_TYPE_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.JmsBindingTypeImpl <em>Jms Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.JmsBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getJmsBindingType()
     * @generated
     */
    int JMS_BINDING_TYPE = 7;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Queue</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__QUEUE = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Topic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__TOPIC = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Connection Factory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__CONNECTION_FACTORY = BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__USERNAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__PASSWORD = BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Client Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__CLIENT_ID = BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Durable Subscription Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__DURABLE_SUBSCRIPTION_NAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Concurrent Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__CONCURRENT_CONSUMERS = BASE_CAMEL_BINDING_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Max Concurrent Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS = BASE_CAMEL_BINDING_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Disable Reply To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__DISABLE_REPLY_TO = BASE_CAMEL_BINDING_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Preserve Message Qos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__PRESERVE_MESSAGE_QOS = BASE_CAMEL_BINDING_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Delivery Persistent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__DELIVERY_PERSISTENT = BASE_CAMEL_BINDING_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__PRIORITY = BASE_CAMEL_BINDING_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Explicit Qos Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__EXPLICIT_QOS_ENABLED = BASE_CAMEL_BINDING_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Reply To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__REPLY_TO = BASE_CAMEL_BINDING_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Reply To Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__REPLY_TO_TYPE = BASE_CAMEL_BINDING_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Request Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__REQUEST_TIMEOUT = BASE_CAMEL_BINDING_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Selector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__SELECTOR = BASE_CAMEL_BINDING_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Time To Live</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__TIME_TO_LIVE = BASE_CAMEL_BINDING_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Transacted</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__TRANSACTED = BASE_CAMEL_BINDING_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Transaction Manager</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE__TRANSACTION_MANAGER = BASE_CAMEL_BINDING_FEATURE_COUNT + 20;

    /**
     * The number of structural features of the '<em>Jms Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JMS_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 21;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelBindingTypeImpl <em>Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getCamelBindingType()
     * @generated
     */
    int CAMEL_BINDING_TYPE = 8;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Config URI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__CONFIG_URI = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelDirectBindingTypeImpl <em>Direct Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelDirectBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getCamelDirectBindingType()
     * @generated
     */
    int CAMEL_DIRECT_BINDING_TYPE = 9;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Name Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__NAME_ELEMENT = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Direct Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelTimerBindingTypeImpl <em>Timer Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelTimerBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getCamelTimerBindingType()
     * @generated
     */
    int CAMEL_TIMER_BINDING_TYPE = 10;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Camel Binding Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__CAMEL_BINDING_NAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__TIME = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__PATTERN = BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Period</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__PERIOD = BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__DELAY = BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Fixed Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__FIXED_RATE = BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Daemon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__DAEMON = BASE_CAMEL_BINDING_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Timer Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 7;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelSedaBindingTypeImpl <em>Seda Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelSedaBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getCamelSedaBindingType()
     * @generated
     */
    int CAMEL_SEDA_BINDING_TYPE = 11;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Name Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__NAME_ELEMENT = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__SIZE = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Concurrent Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__CONCURRENT_CONSUMERS = BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Wait For Task To Complete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__WAIT_FOR_TASK_TO_COMPLETE = BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__TIMEOUT = BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Multiple Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__MULTIPLE_CONSUMERS = BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Limit Concurrent Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__LIMIT_CONCURRENT_CONSUMERS = BASE_CAMEL_BINDING_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Seda Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 7;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelMockBindingTypeImpl <em>Mock Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelMockBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getCamelMockBindingType()
     * @generated
     */
    int CAMEL_MOCK_BINDING_TYPE = 12;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Name Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__NAME_ELEMENT = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Report Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__REPORT_GROUP = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Mock Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 13;

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
     * The feature id for the '<em><b>Binding Camel</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_CAMEL = 3;

    /**
     * The feature id for the '<em><b>Binding Direct</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_DIRECT = 4;

    /**
     * The feature id for the '<em><b>Binding Jms</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_JMS = 5;

    /**
     * The feature id for the '<em><b>Binding Mock</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_MOCK = 6;

    /**
     * The feature id for the '<em><b>Binding Seda</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_SEDA = 7;

    /**
     * The feature id for the '<em><b>Binding Timer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_TIMER = 8;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 9;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.TimeUnit <em>Time Unit</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.TimeUnit
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getTimeUnit()
     * @generated
     */
    int TIME_UNIT = 14;

    /**
     * The meta object id for the '<em>Time Unit Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.TimeUnit
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getTimeUnitObject()
     * @generated
     */
    int TIME_UNIT_OBJECT = 15;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.BaseCamelBinding <em>Base Camel Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Camel Binding</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.BaseCamelBinding
     * @generated
     */
    EClass getBaseCamelBinding();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType <em>Generic File Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Generic File Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType
     * @generated
     */
    EClass getGenericFileBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getDirectory <em>Directory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Directory</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getDirectory()
     * @see #getGenericFileBindingType()
     * @generated
     */
    EAttribute getGenericFileBindingType_Directory();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getAutoCreate <em>Auto Create</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Auto Create</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getAutoCreate()
     * @see #getGenericFileBindingType()
     * @generated
     */
    EAttribute getGenericFileBindingType_AutoCreate();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getBufferSize <em>Buffer Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Buffer Size</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getBufferSize()
     * @see #getGenericFileBindingType()
     * @generated
     */
    EAttribute getGenericFileBindingType_BufferSize();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getFileName <em>File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getFileName()
     * @see #getGenericFileBindingType()
     * @generated
     */
    EAttribute getGenericFileBindingType_FileName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getFlatten <em>Flatten</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Flatten</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getFlatten()
     * @see #getGenericFileBindingType()
     * @generated
     */
    EAttribute getGenericFileBindingType_Flatten();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getCharset <em>Charset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Charset</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getCharset()
     * @see #getGenericFileBindingType()
     * @generated
     */
    EAttribute getGenericFileBindingType_Charset();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType <em>Remote Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Remote Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType
     * @generated
     */
    EClass getCamelRemoteBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getHost <em>Host</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Host</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getHost()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_Host();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getPort <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Port</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getPort()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_Port();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getUsername <em>Username</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Username</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getUsername()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_Username();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getPassword <em>Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getPassword()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_Password();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getBinary <em>Binary</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Binary</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getBinary()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_Binary();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getConnectTimeout <em>Connect Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connect Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getConnectTimeout()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_ConnectTimeout();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getDisconnect <em>Disconnect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Disconnect</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getDisconnect()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_Disconnect();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getMaximumReconnectAttempts <em>Maximum Reconnect Attempts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Maximum Reconnect Attempts</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getMaximumReconnectAttempts()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_MaximumReconnectAttempts();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getReconnectDelay <em>Reconnect Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reconnect Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getReconnectDelay()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_ReconnectDelay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getSeparator <em>Separator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Separator</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getSeparator()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_Separator();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getStepwise <em>Stepwise</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stepwise</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getStepwise()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_Stepwise();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getThrowExceptionOnConnectFailed <em>Throw Exception On Connect Failed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Throw Exception On Connect Failed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType#getThrowExceptionOnConnectFailed()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_ThrowExceptionOnConnectFailed();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType <em>Scheduled Poll Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scheduled Poll Consumer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType
     * @generated
     */
    EClass getScheduledPollConsumerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getInitialDelay <em>Initial Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initial Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getInitialDelay()
     * @see #getScheduledPollConsumerType()
     * @generated
     */
    EAttribute getScheduledPollConsumerType_InitialDelay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getDelay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getDelay()
     * @see #getScheduledPollConsumerType()
     * @generated
     */
    EAttribute getScheduledPollConsumerType_Delay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getUseFixedDelay <em>Use Fixed Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Fixed Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getUseFixedDelay()
     * @see #getScheduledPollConsumerType()
     * @generated
     */
    EAttribute getScheduledPollConsumerType_UseFixedDelay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Send Empty Message When Idle</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getSendEmptyMessageWhenIdle()
     * @see #getScheduledPollConsumerType()
     * @generated
     */
    EAttribute getScheduledPollConsumerType_SendEmptyMessageWhenIdle();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getTimeUnit <em>Time Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time Unit</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType#getTimeUnit()
     * @see #getScheduledPollConsumerType()
     * @generated
     */
    EAttribute getScheduledPollConsumerType_TimeUnit();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledBatchPollConsumerType <em>Scheduled Batch Poll Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scheduled Batch Poll Consumer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledBatchPollConsumerType
     * @generated
     */
    EClass getScheduledBatchPollConsumerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledBatchPollConsumerType#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Messages Per Poll</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledBatchPollConsumerType#getMaxMessagesPerPoll()
     * @see #getScheduledBatchPollConsumerType()
     * @generated
     */
    EAttribute getScheduledBatchPollConsumerType_MaxMessagesPerPoll();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType <em>Generic File Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Generic File Consumer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType
     * @generated
     */
    EClass getGenericFileConsumerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getDelete <em>Delete</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delete</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getDelete()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_Delete();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getRecursive <em>Recursive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Recursive</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getRecursive()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_Recursive();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getNoop <em>Noop</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Noop</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getNoop()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_Noop();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getPreMove <em>Pre Move</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pre Move</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getPreMove()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_PreMove();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getMove <em>Move</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Move</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getMove()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_Move();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getMoveFailed <em>Move Failed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Move Failed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getMoveFailed()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_MoveFailed();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getInclude <em>Include</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Include</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getInclude()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_Include();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getExclude <em>Exclude</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exclude</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getExclude()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_Exclude();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getIdempotent <em>Idempotent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idempotent</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getIdempotent()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_Idempotent();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getIdempotentRepository <em>Idempotent Repository</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idempotent Repository</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getIdempotentRepository()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_IdempotentRepository();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getInProgressRepository <em>In Progress Repository</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>In Progress Repository</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getInProgressRepository()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_InProgressRepository();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getFilter <em>Filter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Filter</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getFilter()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_Filter();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getSorter <em>Sorter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sorter</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getSorter()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_Sorter();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getSortBy <em>Sort By</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sort By</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getSortBy()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_SortBy();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getReadLock <em>Read Lock</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read Lock</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getReadLock()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_ReadLock();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getReadLockTimeout <em>Read Lock Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read Lock Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getReadLockTimeout()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_ReadLockTimeout();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getReadLockCheckInterval <em>Read Lock Check Interval</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read Lock Check Interval</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getReadLockCheckInterval()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_ReadLockCheckInterval();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getExclusiveReadLockStrategy <em>Exclusive Read Lock Strategy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exclusive Read Lock Strategy</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getExclusiveReadLockStrategy()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_ExclusiveReadLockStrategy();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getProcessStrategy <em>Process Strategy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process Strategy</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getProcessStrategy()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_ProcessStrategy();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getStartingDirectoryMustExist <em>Starting Directory Must Exist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Starting Directory Must Exist</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getStartingDirectoryMustExist()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_StartingDirectoryMustExist();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getDirectoryMustExist <em>Directory Must Exist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Directory Must Exist</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getDirectoryMustExist()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_DirectoryMustExist();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getDoneFileName <em>Done File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Done File Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType#getDoneFileName()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_DoneFileName();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType <em>Generic File Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Generic File Producer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType
     * @generated
     */
    EClass getGenericFileProducerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType#getFileExist <em>File Exist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File Exist</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType#getFileExist()
     * @see #getGenericFileProducerType()
     * @generated
     */
    EAttribute getGenericFileProducerType_FileExist();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType#getTempPrefix <em>Temp Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Temp Prefix</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType#getTempPrefix()
     * @see #getGenericFileProducerType()
     * @generated
     */
    EAttribute getGenericFileProducerType_TempPrefix();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType#getTempFileName <em>Temp File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Temp File Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType#getTempFileName()
     * @see #getGenericFileProducerType()
     * @generated
     */
    EAttribute getGenericFileProducerType_TempFileName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType#getKeepLastModified <em>Keep Last Modified</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Keep Last Modified</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType#getKeepLastModified()
     * @see #getGenericFileProducerType()
     * @generated
     */
    EAttribute getGenericFileProducerType_KeepLastModified();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType#getEagerDeleteTargetFile <em>Eager Delete Target File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Eager Delete Target File</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType#getEagerDeleteTargetFile()
     * @see #getGenericFileProducerType()
     * @generated
     */
    EAttribute getGenericFileProducerType_EagerDeleteTargetFile();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType#getDoneFileName <em>Done File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Done File Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType#getDoneFileName()
     * @see #getGenericFileProducerType()
     * @generated
     */
    EAttribute getGenericFileProducerType_DoneFileName();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType <em>Jms Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Jms Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType
     * @generated
     */
    EClass getJmsBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getQueue <em>Queue</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Queue</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getQueue()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_Queue();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getTopic <em>Topic</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Topic</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getTopic()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_Topic();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getConnectionFactory <em>Connection Factory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connection Factory</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getConnectionFactory()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_ConnectionFactory();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getUsername <em>Username</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Username</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getUsername()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_Username();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getPassword <em>Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getPassword()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_Password();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getClientId <em>Client Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Client Id</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getClientId()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_ClientId();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getDurableSubscriptionName <em>Durable Subscription Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Durable Subscription Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getDurableSubscriptionName()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_DurableSubscriptionName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getConcurrentConsumers <em>Concurrent Consumers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Concurrent Consumers</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getConcurrentConsumers()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_ConcurrentConsumers();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getMaxConcurrentConsumers <em>Max Concurrent Consumers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Concurrent Consumers</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getMaxConcurrentConsumers()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_MaxConcurrentConsumers();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getDisableReplyTo <em>Disable Reply To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Disable Reply To</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getDisableReplyTo()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_DisableReplyTo();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getPreserveMessageQos <em>Preserve Message Qos</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Preserve Message Qos</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getPreserveMessageQos()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_PreserveMessageQos();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getDeliveryPersistent <em>Delivery Persistent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delivery Persistent</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getDeliveryPersistent()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_DeliveryPersistent();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getPriority <em>Priority</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Priority</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getPriority()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_Priority();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getExplicitQosEnabled <em>Explicit Qos Enabled</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Explicit Qos Enabled</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getExplicitQosEnabled()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_ExplicitQosEnabled();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getReplyTo <em>Reply To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reply To</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getReplyTo()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_ReplyTo();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getReplyToType <em>Reply To Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reply To Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getReplyToType()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_ReplyToType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getRequestTimeout <em>Request Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Request Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getRequestTimeout()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_RequestTimeout();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getSelector <em>Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selector</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getSelector()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_Selector();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getTimeToLive <em>Time To Live</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time To Live</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getTimeToLive()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_TimeToLive();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getTransacted <em>Transacted</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transacted</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getTransacted()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_Transacted();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getTransactionManager <em>Transaction Manager</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transaction Manager</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType#getTransactionManager()
     * @see #getJmsBindingType()
     * @generated
     */
    EAttribute getJmsBindingType_TransactionManager();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelBindingType <em>Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelBindingType
     * @generated
     */
    EClass getCamelBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelBindingType#getConfigURI <em>Config URI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Config URI</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelBindingType#getConfigURI()
     * @see #getCamelBindingType()
     * @generated
     */
    EAttribute getCamelBindingType_ConfigURI();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelDirectBindingType <em>Direct Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Direct Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelDirectBindingType
     * @generated
     */
    EClass getCamelDirectBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelDirectBindingType#getNameElement <em>Name Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name Element</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelDirectBindingType#getNameElement()
     * @see #getCamelDirectBindingType()
     * @generated
     */
    EAttribute getCamelDirectBindingType_NameElement();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType <em>Timer Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Timer Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType
     * @generated
     */
    EClass getCamelTimerBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getCamelBindingName <em>Camel Binding Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Camel Binding Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getCamelBindingName()
     * @see #getCamelTimerBindingType()
     * @generated
     */
    EAttribute getCamelTimerBindingType_CamelBindingName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getTime <em>Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getTime()
     * @see #getCamelTimerBindingType()
     * @generated
     */
    EAttribute getCamelTimerBindingType_Time();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getPattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pattern</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getPattern()
     * @see #getCamelTimerBindingType()
     * @generated
     */
    EAttribute getCamelTimerBindingType_Pattern();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getPeriod <em>Period</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Period</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getPeriod()
     * @see #getCamelTimerBindingType()
     * @generated
     */
    EAttribute getCamelTimerBindingType_Period();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getDelay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getDelay()
     * @see #getCamelTimerBindingType()
     * @generated
     */
    EAttribute getCamelTimerBindingType_Delay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getFixedRate <em>Fixed Rate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fixed Rate</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getFixedRate()
     * @see #getCamelTimerBindingType()
     * @generated
     */
    EAttribute getCamelTimerBindingType_FixedRate();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getDaemon <em>Daemon</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Daemon</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getDaemon()
     * @see #getCamelTimerBindingType()
     * @generated
     */
    EAttribute getCamelTimerBindingType_Daemon();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType <em>Seda Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Seda Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType
     * @generated
     */
    EClass getCamelSedaBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getNameElement <em>Name Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name Element</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getNameElement()
     * @see #getCamelSedaBindingType()
     * @generated
     */
    EAttribute getCamelSedaBindingType_NameElement();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getSize <em>Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Size</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getSize()
     * @see #getCamelSedaBindingType()
     * @generated
     */
    EAttribute getCamelSedaBindingType_Size();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getConcurrentConsumers <em>Concurrent Consumers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Concurrent Consumers</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getConcurrentConsumers()
     * @see #getCamelSedaBindingType()
     * @generated
     */
    EAttribute getCamelSedaBindingType_ConcurrentConsumers();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getWaitForTaskToComplete <em>Wait For Task To Complete</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Wait For Task To Complete</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getWaitForTaskToComplete()
     * @see #getCamelSedaBindingType()
     * @generated
     */
    EAttribute getCamelSedaBindingType_WaitForTaskToComplete();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getTimeout <em>Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getTimeout()
     * @see #getCamelSedaBindingType()
     * @generated
     */
    EAttribute getCamelSedaBindingType_Timeout();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#isMultipleConsumers <em>Multiple Consumers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Multiple Consumers</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#isMultipleConsumers()
     * @see #getCamelSedaBindingType()
     * @generated
     */
    EAttribute getCamelSedaBindingType_MultipleConsumers();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#isLimitConcurrentConsumers <em>Limit Concurrent Consumers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Limit Concurrent Consumers</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#isLimitConcurrentConsumers()
     * @see #getCamelSedaBindingType()
     * @generated
     */
    EAttribute getCamelSedaBindingType_LimitConcurrentConsumers();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType <em>Mock Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mock Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType
     * @generated
     */
    EClass getCamelMockBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType#getNameElement <em>Name Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name Element</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType#getNameElement()
     * @see #getCamelMockBindingType()
     * @generated
     */
    EAttribute getCamelMockBindingType_NameElement();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType#getReportGroup <em>Report Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Report Group</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType#getReportGroup()
     * @see #getCamelMockBindingType()
     * @generated
     */
    EAttribute getCamelMockBindingType_ReportGroup();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingCamel <em>Binding Camel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Camel</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingCamel()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingCamel();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingDirect <em>Binding Direct</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Direct</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingDirect()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingDirect();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingJms <em>Binding Jms</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Jms</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingJms()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingJms();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingMock <em>Binding Mock</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Mock</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingMock()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingMock();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingSeda <em>Binding Seda</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Seda</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingSeda()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingSeda();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingTimer <em>Binding Timer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Timer</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingTimer()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingTimer();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.camel.core.TimeUnit <em>Time Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Time Unit</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.TimeUnit
     * @generated
     */
    EEnum getTimeUnit();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.camel.core.TimeUnit <em>Time Unit Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Time Unit Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.TimeUnit
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.camel.core.TimeUnit"
     *        extendedMetaData="name='TimeUnit:Object' baseType='TimeUnit'"
     * @generated
     */
    EDataType getTimeUnitObject();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CamelFactory getCamelFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.BaseCamelBindingImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getBaseCamelBinding()
         * @generated
         */
        EClass BASE_CAMEL_BINDING = eINSTANCE.getBaseCamelBinding();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.GenericFileBindingTypeImpl <em>Generic File Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.GenericFileBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getGenericFileBindingType()
         * @generated
         */
        EClass GENERIC_FILE_BINDING_TYPE = eINSTANCE.getGenericFileBindingType();

        /**
         * The meta object literal for the '<em><b>Directory</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_BINDING_TYPE__DIRECTORY = eINSTANCE.getGenericFileBindingType_Directory();

        /**
         * The meta object literal for the '<em><b>Auto Create</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_BINDING_TYPE__AUTO_CREATE = eINSTANCE.getGenericFileBindingType_AutoCreate();

        /**
         * The meta object literal for the '<em><b>Buffer Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_BINDING_TYPE__BUFFER_SIZE = eINSTANCE.getGenericFileBindingType_BufferSize();

        /**
         * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_BINDING_TYPE__FILE_NAME = eINSTANCE.getGenericFileBindingType_FileName();

        /**
         * The meta object literal for the '<em><b>Flatten</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_BINDING_TYPE__FLATTEN = eINSTANCE.getGenericFileBindingType_Flatten();

        /**
         * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_BINDING_TYPE__CHARSET = eINSTANCE.getGenericFileBindingType_Charset();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelRemoteBindingTypeImpl <em>Remote Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelRemoteBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getCamelRemoteBindingType()
         * @generated
         */
        EClass CAMEL_REMOTE_BINDING_TYPE = eINSTANCE.getCamelRemoteBindingType();

        /**
         * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__HOST = eINSTANCE.getCamelRemoteBindingType_Host();

        /**
         * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__PORT = eINSTANCE.getCamelRemoteBindingType_Port();

        /**
         * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__USERNAME = eINSTANCE.getCamelRemoteBindingType_Username();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__PASSWORD = eINSTANCE.getCamelRemoteBindingType_Password();

        /**
         * The meta object literal for the '<em><b>Binary</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__BINARY = eINSTANCE.getCamelRemoteBindingType_Binary();

        /**
         * The meta object literal for the '<em><b>Connect Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__CONNECT_TIMEOUT = eINSTANCE.getCamelRemoteBindingType_ConnectTimeout();

        /**
         * The meta object literal for the '<em><b>Disconnect</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__DISCONNECT = eINSTANCE.getCamelRemoteBindingType_Disconnect();

        /**
         * The meta object literal for the '<em><b>Maximum Reconnect Attempts</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS = eINSTANCE.getCamelRemoteBindingType_MaximumReconnectAttempts();

        /**
         * The meta object literal for the '<em><b>Reconnect Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__RECONNECT_DELAY = eINSTANCE.getCamelRemoteBindingType_ReconnectDelay();

        /**
         * The meta object literal for the '<em><b>Separator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__SEPARATOR = eINSTANCE.getCamelRemoteBindingType_Separator();

        /**
         * The meta object literal for the '<em><b>Stepwise</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__STEPWISE = eINSTANCE.getCamelRemoteBindingType_Stepwise();

        /**
         * The meta object literal for the '<em><b>Throw Exception On Connect Failed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED = eINSTANCE.getCamelRemoteBindingType_ThrowExceptionOnConnectFailed();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.ScheduledPollConsumerTypeImpl <em>Scheduled Poll Consumer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.ScheduledPollConsumerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getScheduledPollConsumerType()
         * @generated
         */
        EClass SCHEDULED_POLL_CONSUMER_TYPE = eINSTANCE.getScheduledPollConsumerType();

        /**
         * The meta object literal for the '<em><b>Initial Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULED_POLL_CONSUMER_TYPE__INITIAL_DELAY = eINSTANCE.getScheduledPollConsumerType_InitialDelay();

        /**
         * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULED_POLL_CONSUMER_TYPE__DELAY = eINSTANCE.getScheduledPollConsumerType_Delay();

        /**
         * The meta object literal for the '<em><b>Use Fixed Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULED_POLL_CONSUMER_TYPE__USE_FIXED_DELAY = eINSTANCE.getScheduledPollConsumerType_UseFixedDelay();

        /**
         * The meta object literal for the '<em><b>Send Empty Message When Idle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULED_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = eINSTANCE.getScheduledPollConsumerType_SendEmptyMessageWhenIdle();

        /**
         * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULED_POLL_CONSUMER_TYPE__TIME_UNIT = eINSTANCE.getScheduledPollConsumerType_TimeUnit();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.ScheduledBatchPollConsumerTypeImpl <em>Scheduled Batch Poll Consumer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.ScheduledBatchPollConsumerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getScheduledBatchPollConsumerType()
         * @generated
         */
        EClass SCHEDULED_BATCH_POLL_CONSUMER_TYPE = eINSTANCE.getScheduledBatchPollConsumerType();

        /**
         * The meta object literal for the '<em><b>Max Messages Per Poll</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULED_BATCH_POLL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = eINSTANCE.getScheduledBatchPollConsumerType_MaxMessagesPerPoll();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.GenericFileConsumerTypeImpl <em>Generic File Consumer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.GenericFileConsumerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getGenericFileConsumerType()
         * @generated
         */
        EClass GENERIC_FILE_CONSUMER_TYPE = eINSTANCE.getGenericFileConsumerType();

        /**
         * The meta object literal for the '<em><b>Delete</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__DELETE = eINSTANCE.getGenericFileConsumerType_Delete();

        /**
         * The meta object literal for the '<em><b>Recursive</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__RECURSIVE = eINSTANCE.getGenericFileConsumerType_Recursive();

        /**
         * The meta object literal for the '<em><b>Noop</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__NOOP = eINSTANCE.getGenericFileConsumerType_Noop();

        /**
         * The meta object literal for the '<em><b>Pre Move</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__PRE_MOVE = eINSTANCE.getGenericFileConsumerType_PreMove();

        /**
         * The meta object literal for the '<em><b>Move</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__MOVE = eINSTANCE.getGenericFileConsumerType_Move();

        /**
         * The meta object literal for the '<em><b>Move Failed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__MOVE_FAILED = eINSTANCE.getGenericFileConsumerType_MoveFailed();

        /**
         * The meta object literal for the '<em><b>Include</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__INCLUDE = eINSTANCE.getGenericFileConsumerType_Include();

        /**
         * The meta object literal for the '<em><b>Exclude</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__EXCLUDE = eINSTANCE.getGenericFileConsumerType_Exclude();

        /**
         * The meta object literal for the '<em><b>Idempotent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT = eINSTANCE.getGenericFileConsumerType_Idempotent();

        /**
         * The meta object literal for the '<em><b>Idempotent Repository</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY = eINSTANCE.getGenericFileConsumerType_IdempotentRepository();

        /**
         * The meta object literal for the '<em><b>In Progress Repository</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY = eINSTANCE.getGenericFileConsumerType_InProgressRepository();

        /**
         * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__FILTER = eINSTANCE.getGenericFileConsumerType_Filter();

        /**
         * The meta object literal for the '<em><b>Sorter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__SORTER = eINSTANCE.getGenericFileConsumerType_Sorter();

        /**
         * The meta object literal for the '<em><b>Sort By</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__SORT_BY = eINSTANCE.getGenericFileConsumerType_SortBy();

        /**
         * The meta object literal for the '<em><b>Read Lock</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__READ_LOCK = eINSTANCE.getGenericFileConsumerType_ReadLock();

        /**
         * The meta object literal for the '<em><b>Read Lock Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT = eINSTANCE.getGenericFileConsumerType_ReadLockTimeout();

        /**
         * The meta object literal for the '<em><b>Read Lock Check Interval</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL = eINSTANCE.getGenericFileConsumerType_ReadLockCheckInterval();

        /**
         * The meta object literal for the '<em><b>Exclusive Read Lock Strategy</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY = eINSTANCE.getGenericFileConsumerType_ExclusiveReadLockStrategy();

        /**
         * The meta object literal for the '<em><b>Process Strategy</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__PROCESS_STRATEGY = eINSTANCE.getGenericFileConsumerType_ProcessStrategy();

        /**
         * The meta object literal for the '<em><b>Starting Directory Must Exist</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST = eINSTANCE.getGenericFileConsumerType_StartingDirectoryMustExist();

        /**
         * The meta object literal for the '<em><b>Directory Must Exist</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST = eINSTANCE.getGenericFileConsumerType_DirectoryMustExist();

        /**
         * The meta object literal for the '<em><b>Done File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__DONE_FILE_NAME = eINSTANCE.getGenericFileConsumerType_DoneFileName();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.GenericFileProducerTypeImpl <em>Generic File Producer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.GenericFileProducerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getGenericFileProducerType()
         * @generated
         */
        EClass GENERIC_FILE_PRODUCER_TYPE = eINSTANCE.getGenericFileProducerType();

        /**
         * The meta object literal for the '<em><b>File Exist</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_PRODUCER_TYPE__FILE_EXIST = eINSTANCE.getGenericFileProducerType_FileExist();

        /**
         * The meta object literal for the '<em><b>Temp Prefix</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_PRODUCER_TYPE__TEMP_PREFIX = eINSTANCE.getGenericFileProducerType_TempPrefix();

        /**
         * The meta object literal for the '<em><b>Temp File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_PRODUCER_TYPE__TEMP_FILE_NAME = eINSTANCE.getGenericFileProducerType_TempFileName();

        /**
         * The meta object literal for the '<em><b>Keep Last Modified</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED = eINSTANCE.getGenericFileProducerType_KeepLastModified();

        /**
         * The meta object literal for the '<em><b>Eager Delete Target File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE = eINSTANCE.getGenericFileProducerType_EagerDeleteTargetFile();

        /**
         * The meta object literal for the '<em><b>Done File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_PRODUCER_TYPE__DONE_FILE_NAME = eINSTANCE.getGenericFileProducerType_DoneFileName();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.JmsBindingTypeImpl <em>Jms Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.JmsBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getJmsBindingType()
         * @generated
         */
        EClass JMS_BINDING_TYPE = eINSTANCE.getJmsBindingType();

        /**
         * The meta object literal for the '<em><b>Queue</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__QUEUE = eINSTANCE.getJmsBindingType_Queue();

        /**
         * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__TOPIC = eINSTANCE.getJmsBindingType_Topic();

        /**
         * The meta object literal for the '<em><b>Connection Factory</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__CONNECTION_FACTORY = eINSTANCE.getJmsBindingType_ConnectionFactory();

        /**
         * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__USERNAME = eINSTANCE.getJmsBindingType_Username();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__PASSWORD = eINSTANCE.getJmsBindingType_Password();

        /**
         * The meta object literal for the '<em><b>Client Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__CLIENT_ID = eINSTANCE.getJmsBindingType_ClientId();

        /**
         * The meta object literal for the '<em><b>Durable Subscription Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__DURABLE_SUBSCRIPTION_NAME = eINSTANCE.getJmsBindingType_DurableSubscriptionName();

        /**
         * The meta object literal for the '<em><b>Concurrent Consumers</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__CONCURRENT_CONSUMERS = eINSTANCE.getJmsBindingType_ConcurrentConsumers();

        /**
         * The meta object literal for the '<em><b>Max Concurrent Consumers</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS = eINSTANCE.getJmsBindingType_MaxConcurrentConsumers();

        /**
         * The meta object literal for the '<em><b>Disable Reply To</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__DISABLE_REPLY_TO = eINSTANCE.getJmsBindingType_DisableReplyTo();

        /**
         * The meta object literal for the '<em><b>Preserve Message Qos</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__PRESERVE_MESSAGE_QOS = eINSTANCE.getJmsBindingType_PreserveMessageQos();

        /**
         * The meta object literal for the '<em><b>Delivery Persistent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__DELIVERY_PERSISTENT = eINSTANCE.getJmsBindingType_DeliveryPersistent();

        /**
         * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__PRIORITY = eINSTANCE.getJmsBindingType_Priority();

        /**
         * The meta object literal for the '<em><b>Explicit Qos Enabled</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__EXPLICIT_QOS_ENABLED = eINSTANCE.getJmsBindingType_ExplicitQosEnabled();

        /**
         * The meta object literal for the '<em><b>Reply To</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__REPLY_TO = eINSTANCE.getJmsBindingType_ReplyTo();

        /**
         * The meta object literal for the '<em><b>Reply To Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__REPLY_TO_TYPE = eINSTANCE.getJmsBindingType_ReplyToType();

        /**
         * The meta object literal for the '<em><b>Request Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__REQUEST_TIMEOUT = eINSTANCE.getJmsBindingType_RequestTimeout();

        /**
         * The meta object literal for the '<em><b>Selector</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__SELECTOR = eINSTANCE.getJmsBindingType_Selector();

        /**
         * The meta object literal for the '<em><b>Time To Live</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__TIME_TO_LIVE = eINSTANCE.getJmsBindingType_TimeToLive();

        /**
         * The meta object literal for the '<em><b>Transacted</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__TRANSACTED = eINSTANCE.getJmsBindingType_Transacted();

        /**
         * The meta object literal for the '<em><b>Transaction Manager</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JMS_BINDING_TYPE__TRANSACTION_MANAGER = eINSTANCE.getJmsBindingType_TransactionManager();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelBindingTypeImpl <em>Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getCamelBindingType()
         * @generated
         */
        EClass CAMEL_BINDING_TYPE = eINSTANCE.getCamelBindingType();

        /**
         * The meta object literal for the '<em><b>Config URI</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_BINDING_TYPE__CONFIG_URI = eINSTANCE.getCamelBindingType_ConfigURI();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelDirectBindingTypeImpl <em>Direct Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelDirectBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getCamelDirectBindingType()
         * @generated
         */
        EClass CAMEL_DIRECT_BINDING_TYPE = eINSTANCE.getCamelDirectBindingType();

        /**
         * The meta object literal for the '<em><b>Name Element</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_DIRECT_BINDING_TYPE__NAME_ELEMENT = eINSTANCE.getCamelDirectBindingType_NameElement();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelTimerBindingTypeImpl <em>Timer Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelTimerBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getCamelTimerBindingType()
         * @generated
         */
        EClass CAMEL_TIMER_BINDING_TYPE = eINSTANCE.getCamelTimerBindingType();

        /**
         * The meta object literal for the '<em><b>Camel Binding Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_TIMER_BINDING_TYPE__CAMEL_BINDING_NAME = eINSTANCE.getCamelTimerBindingType_CamelBindingName();

        /**
         * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_TIMER_BINDING_TYPE__TIME = eINSTANCE.getCamelTimerBindingType_Time();

        /**
         * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_TIMER_BINDING_TYPE__PATTERN = eINSTANCE.getCamelTimerBindingType_Pattern();

        /**
         * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_TIMER_BINDING_TYPE__PERIOD = eINSTANCE.getCamelTimerBindingType_Period();

        /**
         * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_TIMER_BINDING_TYPE__DELAY = eINSTANCE.getCamelTimerBindingType_Delay();

        /**
         * The meta object literal for the '<em><b>Fixed Rate</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_TIMER_BINDING_TYPE__FIXED_RATE = eINSTANCE.getCamelTimerBindingType_FixedRate();

        /**
         * The meta object literal for the '<em><b>Daemon</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_TIMER_BINDING_TYPE__DAEMON = eINSTANCE.getCamelTimerBindingType_Daemon();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelSedaBindingTypeImpl <em>Seda Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelSedaBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getCamelSedaBindingType()
         * @generated
         */
        EClass CAMEL_SEDA_BINDING_TYPE = eINSTANCE.getCamelSedaBindingType();

        /**
         * The meta object literal for the '<em><b>Name Element</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SEDA_BINDING_TYPE__NAME_ELEMENT = eINSTANCE.getCamelSedaBindingType_NameElement();

        /**
         * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SEDA_BINDING_TYPE__SIZE = eINSTANCE.getCamelSedaBindingType_Size();

        /**
         * The meta object literal for the '<em><b>Concurrent Consumers</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SEDA_BINDING_TYPE__CONCURRENT_CONSUMERS = eINSTANCE.getCamelSedaBindingType_ConcurrentConsumers();

        /**
         * The meta object literal for the '<em><b>Wait For Task To Complete</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SEDA_BINDING_TYPE__WAIT_FOR_TASK_TO_COMPLETE = eINSTANCE.getCamelSedaBindingType_WaitForTaskToComplete();

        /**
         * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SEDA_BINDING_TYPE__TIMEOUT = eINSTANCE.getCamelSedaBindingType_Timeout();

        /**
         * The meta object literal for the '<em><b>Multiple Consumers</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SEDA_BINDING_TYPE__MULTIPLE_CONSUMERS = eINSTANCE.getCamelSedaBindingType_MultipleConsumers();

        /**
         * The meta object literal for the '<em><b>Limit Concurrent Consumers</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SEDA_BINDING_TYPE__LIMIT_CONCURRENT_CONSUMERS = eINSTANCE.getCamelSedaBindingType_LimitConcurrentConsumers();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelMockBindingTypeImpl <em>Mock Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelMockBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getCamelMockBindingType()
         * @generated
         */
        EClass CAMEL_MOCK_BINDING_TYPE = eINSTANCE.getCamelMockBindingType();

        /**
         * The meta object literal for the '<em><b>Name Element</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MOCK_BINDING_TYPE__NAME_ELEMENT = eINSTANCE.getCamelMockBindingType_NameElement();

        /**
         * The meta object literal for the '<em><b>Report Group</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MOCK_BINDING_TYPE__REPORT_GROUP = eINSTANCE.getCamelMockBindingType_ReportGroup();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Binding Camel</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_CAMEL = eINSTANCE.getDocumentRoot_BindingCamel();

        /**
         * The meta object literal for the '<em><b>Binding Direct</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_DIRECT = eINSTANCE.getDocumentRoot_BindingDirect();

        /**
         * The meta object literal for the '<em><b>Binding Jms</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_JMS = eINSTANCE.getDocumentRoot_BindingJms();

        /**
         * The meta object literal for the '<em><b>Binding Mock</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_MOCK = eINSTANCE.getDocumentRoot_BindingMock();

        /**
         * The meta object literal for the '<em><b>Binding Seda</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_SEDA = eINSTANCE.getDocumentRoot_BindingSeda();

        /**
         * The meta object literal for the '<em><b>Binding Timer</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_TIMER = eINSTANCE.getDocumentRoot_BindingTimer();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.TimeUnit <em>Time Unit</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.TimeUnit
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getTimeUnit()
         * @generated
         */
        EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

        /**
         * The meta object literal for the '<em>Time Unit Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.TimeUnit
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl#getTimeUnitObject()
         * @generated
         */
        EDataType TIME_UNIT_OBJECT = eINSTANCE.getTimeUnitObject();

    }

} //CamelPackage
