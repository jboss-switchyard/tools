/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.file;

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
 * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileFactory
 * @model kind="package"
 * @generated
 */
public interface FilePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "file";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-camel-file:config:1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "file";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    FilePackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.BaseCamelBindingImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getBaseCamelBinding()
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
     * The feature id for the '<em><b>Camel Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Camel Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Base Camel Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.CamelFileBindingTypeImpl <em>Camel File Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.CamelFileBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getCamelFileBindingType()
     * @generated
     */
    int CAMEL_FILE_BINDING_TYPE = 1;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Camel Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__CAMEL_CONTEXT_MAPPER = BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Camel Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__CAMEL_MESSAGE_COMPOSER = BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__DIRECTORY = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Auto Create</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__AUTO_CREATE = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__BUFFER_SIZE = BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__FILE_NAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Flatten</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__FLATTEN = BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__CHARSET = BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__CONSUME = BASE_CAMEL_BINDING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Produce</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__PRODUCE = BASE_CAMEL_BINDING_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Camel File Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 8;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl <em>Consumer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getFileConsumerType()
     * @generated
     */
    int FILE_CONSUMER_TYPE = 2;

    /**
     * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__INITIAL_DELAY = 0;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__DELAY = 1;

    /**
     * The feature id for the '<em><b>Use Fixed Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__USE_FIXED_DELAY = 2;

    /**
     * The feature id for the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = 3;

    /**
     * The feature id for the '<em><b>Time Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__TIME_UNIT = 4;

    /**
     * The feature id for the '<em><b>Max Messages Per Poll</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = 5;

    /**
     * The feature id for the '<em><b>Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__DELETE = 6;

    /**
     * The feature id for the '<em><b>Recursive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__RECURSIVE = 7;

    /**
     * The feature id for the '<em><b>Noop</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__NOOP = 8;

    /**
     * The feature id for the '<em><b>Pre Move</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__PRE_MOVE = 9;

    /**
     * The feature id for the '<em><b>Move</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__MOVE = 10;

    /**
     * The feature id for the '<em><b>Move Failed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__MOVE_FAILED = 11;

    /**
     * The feature id for the '<em><b>Include</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__INCLUDE = 12;

    /**
     * The feature id for the '<em><b>Exclude</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__EXCLUDE = 13;

    /**
     * The feature id for the '<em><b>Idempotent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__IDEMPOTENT = 14;

    /**
     * The feature id for the '<em><b>Idempotent Repository</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY = 15;

    /**
     * The feature id for the '<em><b>In Progress Repository</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY = 16;

    /**
     * The feature id for the '<em><b>Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__FILTER = 17;

    /**
     * The feature id for the '<em><b>Sorter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__SORTER = 18;

    /**
     * The feature id for the '<em><b>Sort By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__SORT_BY = 19;

    /**
     * The feature id for the '<em><b>Read Lock</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__READ_LOCK = 20;

    /**
     * The feature id for the '<em><b>Read Lock Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT = 21;

    /**
     * The feature id for the '<em><b>Read Lock Check Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL = 22;

    /**
     * The feature id for the '<em><b>Exclusive Read Lock Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY = 23;

    /**
     * The feature id for the '<em><b>Process Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__PROCESS_STRATEGY = 24;

    /**
     * The feature id for the '<em><b>Starting Directory Must Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST = 25;

    /**
     * The feature id for the '<em><b>Directory Must Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST = 26;

    /**
     * The feature id for the '<em><b>Done File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__DONE_FILE_NAME = 27;

    /**
     * The number of structural features of the '<em>Consumer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE_FEATURE_COUNT = 28;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileProducerTypeImpl <em>Producer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileProducerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getFileProducerType()
     * @generated
     */
    int FILE_PRODUCER_TYPE = 3;

    /**
     * The feature id for the '<em><b>File Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_PRODUCER_TYPE__FILE_EXIST = 0;

    /**
     * The feature id for the '<em><b>Temp Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_PRODUCER_TYPE__TEMP_PREFIX = 1;

    /**
     * The feature id for the '<em><b>Temp File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_PRODUCER_TYPE__TEMP_FILE_NAME = 2;

    /**
     * The feature id for the '<em><b>Keep Last Modified</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED = 3;

    /**
     * The feature id for the '<em><b>Eager Delete Target File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE = 4;

    /**
     * The feature id for the '<em><b>Done File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_PRODUCER_TYPE__DONE_FILE_NAME = 5;

    /**
     * The number of structural features of the '<em>Producer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_PRODUCER_TYPE_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getDocumentRoot()
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
     * The feature id for the '<em><b>Binding File</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_FILE = 3;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 4;


    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.TimeUnit <em>Time Unit</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.TimeUnit
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getTimeUnit()
     * @generated
     */
    int TIME_UNIT = 5;

    /**
     * The meta object id for the '<em>Time Unit Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.TimeUnit
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getTimeUnitObject()
     * @generated
     */
    int TIME_UNIT_OBJECT = 6;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.file.BaseCamelBinding <em>Base Camel Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Camel Binding</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.BaseCamelBinding
     * @generated
     */
    EClass getBaseCamelBinding();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.file.BaseCamelBinding#getCamelContextMapper <em>Camel Context Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Camel Context Mapper</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.BaseCamelBinding#getCamelContextMapper()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_CamelContextMapper();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.file.BaseCamelBinding#getCamelMessageComposer <em>Camel Message Composer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Camel Message Composer</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.BaseCamelBinding#getCamelMessageComposer()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_CamelMessageComposer();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType <em>Camel File Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel File Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType
     * @generated
     */
    EClass getCamelFileBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getDirectory <em>Directory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Directory</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getDirectory()
     * @see #getCamelFileBindingType()
     * @generated
     */
    EAttribute getCamelFileBindingType_Directory();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getAutoCreate <em>Auto Create</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Auto Create</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getAutoCreate()
     * @see #getCamelFileBindingType()
     * @generated
     */
    EAttribute getCamelFileBindingType_AutoCreate();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getBufferSize <em>Buffer Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Buffer Size</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getBufferSize()
     * @see #getCamelFileBindingType()
     * @generated
     */
    EAttribute getCamelFileBindingType_BufferSize();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getFileName <em>File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getFileName()
     * @see #getCamelFileBindingType()
     * @generated
     */
    EAttribute getCamelFileBindingType_FileName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getFlatten <em>Flatten</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Flatten</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getFlatten()
     * @see #getCamelFileBindingType()
     * @generated
     */
    EAttribute getCamelFileBindingType_Flatten();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getCharset <em>Charset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Charset</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getCharset()
     * @see #getCamelFileBindingType()
     * @generated
     */
    EAttribute getCamelFileBindingType_Charset();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getConsume <em>Consume</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Consume</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getConsume()
     * @see #getCamelFileBindingType()
     * @generated
     */
    EReference getCamelFileBindingType_Consume();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getProduce <em>Produce</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Produce</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getProduce()
     * @see #getCamelFileBindingType()
     * @generated
     */
    EReference getCamelFileBindingType_Produce();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType <em>Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Consumer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType
     * @generated
     */
    EClass getFileConsumerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getInitialDelay <em>Initial Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initial Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getInitialDelay()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_InitialDelay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getDelay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getDelay()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_Delay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getUseFixedDelay <em>Use Fixed Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Fixed Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getUseFixedDelay()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_UseFixedDelay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Send Empty Message When Idle</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getSendEmptyMessageWhenIdle()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_SendEmptyMessageWhenIdle();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getTimeUnit <em>Time Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time Unit</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getTimeUnit()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_TimeUnit();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Messages Per Poll</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getMaxMessagesPerPoll()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_MaxMessagesPerPoll();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getDelete <em>Delete</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delete</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getDelete()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_Delete();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getRecursive <em>Recursive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Recursive</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getRecursive()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_Recursive();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getNoop <em>Noop</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Noop</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getNoop()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_Noop();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getPreMove <em>Pre Move</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pre Move</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getPreMove()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_PreMove();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getMove <em>Move</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Move</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getMove()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_Move();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getMoveFailed <em>Move Failed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Move Failed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getMoveFailed()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_MoveFailed();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getInclude <em>Include</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Include</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getInclude()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_Include();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getExclude <em>Exclude</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exclude</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getExclude()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_Exclude();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getIdempotent <em>Idempotent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idempotent</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getIdempotent()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_Idempotent();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getIdempotentRepository <em>Idempotent Repository</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idempotent Repository</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getIdempotentRepository()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_IdempotentRepository();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getInProgressRepository <em>In Progress Repository</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>In Progress Repository</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getInProgressRepository()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_InProgressRepository();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getFilter <em>Filter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Filter</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getFilter()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_Filter();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getSorter <em>Sorter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sorter</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getSorter()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_Sorter();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getSortBy <em>Sort By</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sort By</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getSortBy()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_SortBy();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getReadLock <em>Read Lock</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read Lock</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getReadLock()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_ReadLock();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getReadLockTimeout <em>Read Lock Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read Lock Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getReadLockTimeout()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_ReadLockTimeout();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getReadLockCheckInterval <em>Read Lock Check Interval</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read Lock Check Interval</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getReadLockCheckInterval()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_ReadLockCheckInterval();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getExclusiveReadLockStrategy <em>Exclusive Read Lock Strategy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exclusive Read Lock Strategy</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getExclusiveReadLockStrategy()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_ExclusiveReadLockStrategy();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getProcessStrategy <em>Process Strategy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process Strategy</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getProcessStrategy()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_ProcessStrategy();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getStartingDirectoryMustExist <em>Starting Directory Must Exist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Starting Directory Must Exist</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getStartingDirectoryMustExist()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_StartingDirectoryMustExist();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getDirectoryMustExist <em>Directory Must Exist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Directory Must Exist</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getDirectoryMustExist()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_DirectoryMustExist();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getDoneFileName <em>Done File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Done File Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType#getDoneFileName()
     * @see #getFileConsumerType()
     * @generated
     */
    EAttribute getFileConsumerType_DoneFileName();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType <em>Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Producer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType
     * @generated
     */
    EClass getFileProducerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#getFileExist <em>File Exist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File Exist</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#getFileExist()
     * @see #getFileProducerType()
     * @generated
     */
    EAttribute getFileProducerType_FileExist();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#getTempPrefix <em>Temp Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Temp Prefix</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#getTempPrefix()
     * @see #getFileProducerType()
     * @generated
     */
    EAttribute getFileProducerType_TempPrefix();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#getTempFileName <em>Temp File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Temp File Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#getTempFileName()
     * @see #getFileProducerType()
     * @generated
     */
    EAttribute getFileProducerType_TempFileName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#getKeepLastModified <em>Keep Last Modified</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Keep Last Modified</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#getKeepLastModified()
     * @see #getFileProducerType()
     * @generated
     */
    EAttribute getFileProducerType_KeepLastModified();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#getEagerDeleteTargetFile <em>Eager Delete Target File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Eager Delete Target File</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#getEagerDeleteTargetFile()
     * @see #getFileProducerType()
     * @generated
     */
    EAttribute getFileProducerType_EagerDeleteTargetFile();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#getDoneFileName <em>Done File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Done File Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType#getDoneFileName()
     * @see #getFileProducerType()
     * @generated
     */
    EAttribute getFileProducerType_DoneFileName();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot#getBindingFile <em>Binding File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding File</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot#getBindingFile()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingFile();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.camel.file.TimeUnit <em>Time Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Time Unit</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.TimeUnit
     * @generated
     */
    EEnum getTimeUnit();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.camel.file.TimeUnit <em>Time Unit Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Time Unit Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.TimeUnit
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.camel.file.TimeUnit"
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
    FileFactory getFileFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.BaseCamelBindingImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getBaseCamelBinding()
         * @generated
         */
        EClass BASE_CAMEL_BINDING = eINSTANCE.getBaseCamelBinding();

        /**
         * The meta object literal for the '<em><b>Camel Context Mapper</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER = eINSTANCE.getBaseCamelBinding_CamelContextMapper();

        /**
         * The meta object literal for the '<em><b>Camel Message Composer</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER = eINSTANCE.getBaseCamelBinding_CamelMessageComposer();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.CamelFileBindingTypeImpl <em>Camel File Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.CamelFileBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getCamelFileBindingType()
         * @generated
         */
        EClass CAMEL_FILE_BINDING_TYPE = eINSTANCE.getCamelFileBindingType();

        /**
         * The meta object literal for the '<em><b>Directory</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FILE_BINDING_TYPE__DIRECTORY = eINSTANCE.getCamelFileBindingType_Directory();

        /**
         * The meta object literal for the '<em><b>Auto Create</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FILE_BINDING_TYPE__AUTO_CREATE = eINSTANCE.getCamelFileBindingType_AutoCreate();

        /**
         * The meta object literal for the '<em><b>Buffer Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FILE_BINDING_TYPE__BUFFER_SIZE = eINSTANCE.getCamelFileBindingType_BufferSize();

        /**
         * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FILE_BINDING_TYPE__FILE_NAME = eINSTANCE.getCamelFileBindingType_FileName();

        /**
         * The meta object literal for the '<em><b>Flatten</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FILE_BINDING_TYPE__FLATTEN = eINSTANCE.getCamelFileBindingType_Flatten();

        /**
         * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FILE_BINDING_TYPE__CHARSET = eINSTANCE.getCamelFileBindingType_Charset();

        /**
         * The meta object literal for the '<em><b>Consume</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_FILE_BINDING_TYPE__CONSUME = eINSTANCE.getCamelFileBindingType_Consume();

        /**
         * The meta object literal for the '<em><b>Produce</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_FILE_BINDING_TYPE__PRODUCE = eINSTANCE.getCamelFileBindingType_Produce();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl <em>Consumer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getFileConsumerType()
         * @generated
         */
        EClass FILE_CONSUMER_TYPE = eINSTANCE.getFileConsumerType();

        /**
         * The meta object literal for the '<em><b>Initial Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__INITIAL_DELAY = eINSTANCE.getFileConsumerType_InitialDelay();

        /**
         * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__DELAY = eINSTANCE.getFileConsumerType_Delay();

        /**
         * The meta object literal for the '<em><b>Use Fixed Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__USE_FIXED_DELAY = eINSTANCE.getFileConsumerType_UseFixedDelay();

        /**
         * The meta object literal for the '<em><b>Send Empty Message When Idle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = eINSTANCE.getFileConsumerType_SendEmptyMessageWhenIdle();

        /**
         * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__TIME_UNIT = eINSTANCE.getFileConsumerType_TimeUnit();

        /**
         * The meta object literal for the '<em><b>Max Messages Per Poll</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = eINSTANCE.getFileConsumerType_MaxMessagesPerPoll();

        /**
         * The meta object literal for the '<em><b>Delete</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__DELETE = eINSTANCE.getFileConsumerType_Delete();

        /**
         * The meta object literal for the '<em><b>Recursive</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__RECURSIVE = eINSTANCE.getFileConsumerType_Recursive();

        /**
         * The meta object literal for the '<em><b>Noop</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__NOOP = eINSTANCE.getFileConsumerType_Noop();

        /**
         * The meta object literal for the '<em><b>Pre Move</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__PRE_MOVE = eINSTANCE.getFileConsumerType_PreMove();

        /**
         * The meta object literal for the '<em><b>Move</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__MOVE = eINSTANCE.getFileConsumerType_Move();

        /**
         * The meta object literal for the '<em><b>Move Failed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__MOVE_FAILED = eINSTANCE.getFileConsumerType_MoveFailed();

        /**
         * The meta object literal for the '<em><b>Include</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__INCLUDE = eINSTANCE.getFileConsumerType_Include();

        /**
         * The meta object literal for the '<em><b>Exclude</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__EXCLUDE = eINSTANCE.getFileConsumerType_Exclude();

        /**
         * The meta object literal for the '<em><b>Idempotent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__IDEMPOTENT = eINSTANCE.getFileConsumerType_Idempotent();

        /**
         * The meta object literal for the '<em><b>Idempotent Repository</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY = eINSTANCE.getFileConsumerType_IdempotentRepository();

        /**
         * The meta object literal for the '<em><b>In Progress Repository</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY = eINSTANCE.getFileConsumerType_InProgressRepository();

        /**
         * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__FILTER = eINSTANCE.getFileConsumerType_Filter();

        /**
         * The meta object literal for the '<em><b>Sorter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__SORTER = eINSTANCE.getFileConsumerType_Sorter();

        /**
         * The meta object literal for the '<em><b>Sort By</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__SORT_BY = eINSTANCE.getFileConsumerType_SortBy();

        /**
         * The meta object literal for the '<em><b>Read Lock</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__READ_LOCK = eINSTANCE.getFileConsumerType_ReadLock();

        /**
         * The meta object literal for the '<em><b>Read Lock Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT = eINSTANCE.getFileConsumerType_ReadLockTimeout();

        /**
         * The meta object literal for the '<em><b>Read Lock Check Interval</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL = eINSTANCE.getFileConsumerType_ReadLockCheckInterval();

        /**
         * The meta object literal for the '<em><b>Exclusive Read Lock Strategy</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY = eINSTANCE.getFileConsumerType_ExclusiveReadLockStrategy();

        /**
         * The meta object literal for the '<em><b>Process Strategy</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__PROCESS_STRATEGY = eINSTANCE.getFileConsumerType_ProcessStrategy();

        /**
         * The meta object literal for the '<em><b>Starting Directory Must Exist</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST = eINSTANCE.getFileConsumerType_StartingDirectoryMustExist();

        /**
         * The meta object literal for the '<em><b>Directory Must Exist</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST = eINSTANCE.getFileConsumerType_DirectoryMustExist();

        /**
         * The meta object literal for the '<em><b>Done File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONSUMER_TYPE__DONE_FILE_NAME = eINSTANCE.getFileConsumerType_DoneFileName();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileProducerTypeImpl <em>Producer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileProducerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getFileProducerType()
         * @generated
         */
        EClass FILE_PRODUCER_TYPE = eINSTANCE.getFileProducerType();

        /**
         * The meta object literal for the '<em><b>File Exist</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_PRODUCER_TYPE__FILE_EXIST = eINSTANCE.getFileProducerType_FileExist();

        /**
         * The meta object literal for the '<em><b>Temp Prefix</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_PRODUCER_TYPE__TEMP_PREFIX = eINSTANCE.getFileProducerType_TempPrefix();

        /**
         * The meta object literal for the '<em><b>Temp File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_PRODUCER_TYPE__TEMP_FILE_NAME = eINSTANCE.getFileProducerType_TempFileName();

        /**
         * The meta object literal for the '<em><b>Keep Last Modified</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED = eINSTANCE.getFileProducerType_KeepLastModified();

        /**
         * The meta object literal for the '<em><b>Eager Delete Target File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE = eINSTANCE.getFileProducerType_EagerDeleteTargetFile();

        /**
         * The meta object literal for the '<em><b>Done File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_PRODUCER_TYPE__DONE_FILE_NAME = eINSTANCE.getFileProducerType_DoneFileName();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Binding File</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_FILE = eINSTANCE.getDocumentRoot_BindingFile();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.TimeUnit <em>Time Unit</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.TimeUnit
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getTimeUnit()
         * @generated
         */
        EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

        /**
         * The meta object literal for the '<em>Time Unit Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.TimeUnit
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getTimeUnitObject()
         * @generated
         */
        EDataType TIME_UNIT_OBJECT = eINSTANCE.getTimeUnitObject();

    }

} //FilePackage
