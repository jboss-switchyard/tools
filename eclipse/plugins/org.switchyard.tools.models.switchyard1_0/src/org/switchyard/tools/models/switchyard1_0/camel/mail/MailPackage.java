/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.mail;

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
 * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailFactory
 * @model kind="package"
 * @generated
 */
public interface MailPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "mail";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-camel-mail:config:1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "mail";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MailPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.BaseCamelBindingImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl#getBaseCamelBinding()
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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 2;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl <em>Camel Mail Consumer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl#getCamelMailConsumerType()
     * @generated
     */
    int CAMEL_MAIL_CONSUMER_TYPE = 3;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailProducerTypeImpl <em>Camel Mail Producer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailProducerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl#getCamelMailProducerType()
     * @generated
     */
    int CAMEL_MAIL_PRODUCER_TYPE = 4;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailBindingTypeImpl <em>Camel Mail Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl#getCamelMailBindingType()
     * @generated
     */
    int CAMEL_MAIL_BINDING_TYPE = 1;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE__HOST = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE__PORT = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE__USERNAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE__PASSWORD = BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Connection Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE__CONNECTION_TIMEOUT = BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE__CONSUME = BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Produce</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE__PRODUCE = BASE_CAMEL_BINDING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Secure</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE__SECURE = BASE_CAMEL_BINDING_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Camel Mail Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 8;

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
     * The feature id for the '<em><b>Binding Mail</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_MAIL = 3;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 4;

    /**
     * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_CONSUMER_TYPE__INITIAL_DELAY = 0;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_CONSUMER_TYPE__DELAY = 1;

    /**
     * The feature id for the '<em><b>Use Fixed Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_CONSUMER_TYPE__USE_FIXED_DELAY = 2;

    /**
     * The feature id for the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = 3;

    /**
     * The feature id for the '<em><b>Time Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_CONSUMER_TYPE__TIME_UNIT = 4;

    /**
     * The feature id for the '<em><b>Max Messages Per Poll</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = 5;

    /**
     * The feature id for the '<em><b>Folder Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_CONSUMER_TYPE__FOLDER_NAME = 6;

    /**
     * The feature id for the '<em><b>Fetch Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE = 7;

    /**
     * The feature id for the '<em><b>Unseen</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_CONSUMER_TYPE__UNSEEN = 8;

    /**
     * The feature id for the '<em><b>Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_CONSUMER_TYPE__DELETE = 9;

    /**
     * The feature id for the '<em><b>Copy To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_CONSUMER_TYPE__COPY_TO = 10;

    /**
     * The feature id for the '<em><b>Disconnect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_CONSUMER_TYPE__DISCONNECT = 11;

    /**
     * The feature id for the '<em><b>Account Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_CONSUMER_TYPE__ACCOUNT_TYPE = 12;

    /**
     * The number of structural features of the '<em>Camel Mail Consumer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_CONSUMER_TYPE_FEATURE_COUNT = 13;

    /**
     * The feature id for the '<em><b>Subject</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_PRODUCER_TYPE__SUBJECT = 0;

    /**
     * The feature id for the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_PRODUCER_TYPE__FROM = 1;

    /**
     * The feature id for the '<em><b>To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_PRODUCER_TYPE__TO = 2;

    /**
     * The feature id for the '<em><b>CC</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_PRODUCER_TYPE__CC = 3;

    /**
     * The feature id for the '<em><b>BCC</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_PRODUCER_TYPE__BCC = 4;

    /**
     * The feature id for the '<em><b>Reply To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_PRODUCER_TYPE__REPLY_TO = 5;

    /**
     * The number of structural features of the '<em>Camel Mail Producer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MAIL_PRODUCER_TYPE_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.MailConsumerAccountType <em>Consumer Account Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailConsumerAccountType
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl#getMailConsumerAccountType()
     * @generated
     */
    int MAIL_CONSUMER_ACCOUNT_TYPE = 5;


    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.TimeUnitType <em>Time Unit Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.TimeUnitType
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl#getTimeUnitType()
     * @generated
     */
    int TIME_UNIT_TYPE = 6;

    /**
     * The meta object id for the '<em>Consumer Account Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailConsumerAccountType
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl#getMailConsumerAccountTypeObject()
     * @generated
     */
    int MAIL_CONSUMER_ACCOUNT_TYPE_OBJECT = 7;

    /**
     * The meta object id for the '<em>Time Unit Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.TimeUnitType
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl#getTimeUnitTypeObject()
     * @generated
     */
    int TIME_UNIT_TYPE_OBJECT = 8;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.BaseCamelBinding <em>Base Camel Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Camel Binding</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.BaseCamelBinding
     * @generated
     */
    EClass getBaseCamelBinding();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.DocumentRoot#getBindingMail <em>Binding Mail</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Mail</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.DocumentRoot#getBindingMail()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingMail();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType <em>Camel Mail Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Mail Consumer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType
     * @generated
     */
    EClass getCamelMailConsumerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getInitialDelay <em>Initial Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initial Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getInitialDelay()
     * @see #getCamelMailConsumerType()
     * @generated
     */
    EAttribute getCamelMailConsumerType_InitialDelay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getDelay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getDelay()
     * @see #getCamelMailConsumerType()
     * @generated
     */
    EAttribute getCamelMailConsumerType_Delay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getUseFixedDelay <em>Use Fixed Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Fixed Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getUseFixedDelay()
     * @see #getCamelMailConsumerType()
     * @generated
     */
    EAttribute getCamelMailConsumerType_UseFixedDelay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Send Empty Message When Idle</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getSendEmptyMessageWhenIdle()
     * @see #getCamelMailConsumerType()
     * @generated
     */
    EAttribute getCamelMailConsumerType_SendEmptyMessageWhenIdle();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getTimeUnit <em>Time Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time Unit</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getTimeUnit()
     * @see #getCamelMailConsumerType()
     * @generated
     */
    EAttribute getCamelMailConsumerType_TimeUnit();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Messages Per Poll</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getMaxMessagesPerPoll()
     * @see #getCamelMailConsumerType()
     * @generated
     */
    EAttribute getCamelMailConsumerType_MaxMessagesPerPoll();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getFolderName <em>Folder Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Folder Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getFolderName()
     * @see #getCamelMailConsumerType()
     * @generated
     */
    EAttribute getCamelMailConsumerType_FolderName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getFetchSize <em>Fetch Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fetch Size</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getFetchSize()
     * @see #getCamelMailConsumerType()
     * @generated
     */
    EAttribute getCamelMailConsumerType_FetchSize();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getUnseen <em>Unseen</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unseen</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getUnseen()
     * @see #getCamelMailConsumerType()
     * @generated
     */
    EAttribute getCamelMailConsumerType_Unseen();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getDelete <em>Delete</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delete</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getDelete()
     * @see #getCamelMailConsumerType()
     * @generated
     */
    EAttribute getCamelMailConsumerType_Delete();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getCopyTo <em>Copy To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Copy To</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getCopyTo()
     * @see #getCamelMailConsumerType()
     * @generated
     */
    EAttribute getCamelMailConsumerType_CopyTo();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getDisconnect <em>Disconnect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Disconnect</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getDisconnect()
     * @see #getCamelMailConsumerType()
     * @generated
     */
    EAttribute getCamelMailConsumerType_Disconnect();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getAccountType <em>Account Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Account Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType#getAccountType()
     * @see #getCamelMailConsumerType()
     * @generated
     */
    EAttribute getCamelMailConsumerType_AccountType();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType <em>Camel Mail Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Mail Producer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType
     * @generated
     */
    EClass getCamelMailProducerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getSubject <em>Subject</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Subject</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getSubject()
     * @see #getCamelMailProducerType()
     * @generated
     */
    EAttribute getCamelMailProducerType_Subject();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>From</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getFrom()
     * @see #getCamelMailProducerType()
     * @generated
     */
    EAttribute getCamelMailProducerType_From();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getTo <em>To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>To</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getTo()
     * @see #getCamelMailProducerType()
     * @generated
     */
    EAttribute getCamelMailProducerType_To();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getCC <em>CC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CC</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getCC()
     * @see #getCamelMailProducerType()
     * @generated
     */
    EAttribute getCamelMailProducerType_CC();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getBCC <em>BCC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>BCC</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getBCC()
     * @see #getCamelMailProducerType()
     * @generated
     */
    EAttribute getCamelMailProducerType_BCC();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getReplyTo <em>Reply To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reply To</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType#getReplyTo()
     * @see #getCamelMailProducerType()
     * @generated
     */
    EAttribute getCamelMailProducerType_ReplyTo();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType <em>Camel Mail Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Mail Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType
     * @generated
     */
    EClass getCamelMailBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getHost <em>Host</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Host</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getHost()
     * @see #getCamelMailBindingType()
     * @generated
     */
    EAttribute getCamelMailBindingType_Host();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getPort <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Port</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getPort()
     * @see #getCamelMailBindingType()
     * @generated
     */
    EAttribute getCamelMailBindingType_Port();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getUsername <em>Username</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Username</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getUsername()
     * @see #getCamelMailBindingType()
     * @generated
     */
    EAttribute getCamelMailBindingType_Username();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getPassword <em>Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getPassword()
     * @see #getCamelMailBindingType()
     * @generated
     */
    EAttribute getCamelMailBindingType_Password();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getConnectionTimeout <em>Connection Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connection Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getConnectionTimeout()
     * @see #getCamelMailBindingType()
     * @generated
     */
    EAttribute getCamelMailBindingType_ConnectionTimeout();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getConsume <em>Consume</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Consume</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getConsume()
     * @see #getCamelMailBindingType()
     * @generated
     */
    EReference getCamelMailBindingType_Consume();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getProduce <em>Produce</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Produce</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getProduce()
     * @see #getCamelMailBindingType()
     * @generated
     */
    EReference getCamelMailBindingType_Produce();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getSecure <em>Secure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Secure</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType#getSecure()
     * @see #getCamelMailBindingType()
     * @generated
     */
    EAttribute getCamelMailBindingType_Secure();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.MailConsumerAccountType <em>Consumer Account Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Consumer Account Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailConsumerAccountType
     * @generated
     */
    EEnum getMailConsumerAccountType();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.TimeUnitType <em>Time Unit Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Time Unit Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.TimeUnitType
     * @generated
     */
    EEnum getTimeUnitType();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.MailConsumerAccountType <em>Consumer Account Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Consumer Account Type Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailConsumerAccountType
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.camel.mail.MailConsumerAccountType"
     *        extendedMetaData="name='MailConsumerAccountType:Object' baseType='MailConsumerAccountType'"
     * @generated
     */
    EDataType getMailConsumerAccountTypeObject();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.TimeUnitType <em>Time Unit Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Time Unit Type Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.TimeUnitType
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.camel.mail.TimeUnitType"
     *        extendedMetaData="name='timeUnit_._type:Object' baseType='timeUnit_._type'"
     * @generated
     */
    EDataType getTimeUnitTypeObject();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    MailFactory getMailFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.BaseCamelBindingImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl#getBaseCamelBinding()
         * @generated
         */
        EClass BASE_CAMEL_BINDING = eINSTANCE.getBaseCamelBinding();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Binding Mail</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_MAIL = eINSTANCE.getDocumentRoot_BindingMail();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl <em>Camel Mail Consumer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailConsumerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl#getCamelMailConsumerType()
         * @generated
         */
        EClass CAMEL_MAIL_CONSUMER_TYPE = eINSTANCE.getCamelMailConsumerType();

        /**
         * The meta object literal for the '<em><b>Initial Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_CONSUMER_TYPE__INITIAL_DELAY = eINSTANCE.getCamelMailConsumerType_InitialDelay();

        /**
         * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_CONSUMER_TYPE__DELAY = eINSTANCE.getCamelMailConsumerType_Delay();

        /**
         * The meta object literal for the '<em><b>Use Fixed Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_CONSUMER_TYPE__USE_FIXED_DELAY = eINSTANCE.getCamelMailConsumerType_UseFixedDelay();

        /**
         * The meta object literal for the '<em><b>Send Empty Message When Idle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = eINSTANCE.getCamelMailConsumerType_SendEmptyMessageWhenIdle();

        /**
         * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_CONSUMER_TYPE__TIME_UNIT = eINSTANCE.getCamelMailConsumerType_TimeUnit();

        /**
         * The meta object literal for the '<em><b>Max Messages Per Poll</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = eINSTANCE.getCamelMailConsumerType_MaxMessagesPerPoll();

        /**
         * The meta object literal for the '<em><b>Folder Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_CONSUMER_TYPE__FOLDER_NAME = eINSTANCE.getCamelMailConsumerType_FolderName();

        /**
         * The meta object literal for the '<em><b>Fetch Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE = eINSTANCE.getCamelMailConsumerType_FetchSize();

        /**
         * The meta object literal for the '<em><b>Unseen</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_CONSUMER_TYPE__UNSEEN = eINSTANCE.getCamelMailConsumerType_Unseen();

        /**
         * The meta object literal for the '<em><b>Delete</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_CONSUMER_TYPE__DELETE = eINSTANCE.getCamelMailConsumerType_Delete();

        /**
         * The meta object literal for the '<em><b>Copy To</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_CONSUMER_TYPE__COPY_TO = eINSTANCE.getCamelMailConsumerType_CopyTo();

        /**
         * The meta object literal for the '<em><b>Disconnect</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_CONSUMER_TYPE__DISCONNECT = eINSTANCE.getCamelMailConsumerType_Disconnect();

        /**
         * The meta object literal for the '<em><b>Account Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_CONSUMER_TYPE__ACCOUNT_TYPE = eINSTANCE.getCamelMailConsumerType_AccountType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailProducerTypeImpl <em>Camel Mail Producer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailProducerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl#getCamelMailProducerType()
         * @generated
         */
        EClass CAMEL_MAIL_PRODUCER_TYPE = eINSTANCE.getCamelMailProducerType();

        /**
         * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_PRODUCER_TYPE__SUBJECT = eINSTANCE.getCamelMailProducerType_Subject();

        /**
         * The meta object literal for the '<em><b>From</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_PRODUCER_TYPE__FROM = eINSTANCE.getCamelMailProducerType_From();

        /**
         * The meta object literal for the '<em><b>To</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_PRODUCER_TYPE__TO = eINSTANCE.getCamelMailProducerType_To();

        /**
         * The meta object literal for the '<em><b>CC</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_PRODUCER_TYPE__CC = eINSTANCE.getCamelMailProducerType_CC();

        /**
         * The meta object literal for the '<em><b>BCC</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_PRODUCER_TYPE__BCC = eINSTANCE.getCamelMailProducerType_BCC();

        /**
         * The meta object literal for the '<em><b>Reply To</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_PRODUCER_TYPE__REPLY_TO = eINSTANCE.getCamelMailProducerType_ReplyTo();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailBindingTypeImpl <em>Camel Mail Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.CamelMailBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl#getCamelMailBindingType()
         * @generated
         */
        EClass CAMEL_MAIL_BINDING_TYPE = eINSTANCE.getCamelMailBindingType();

        /**
         * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_BINDING_TYPE__HOST = eINSTANCE.getCamelMailBindingType_Host();

        /**
         * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_BINDING_TYPE__PORT = eINSTANCE.getCamelMailBindingType_Port();

        /**
         * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_BINDING_TYPE__USERNAME = eINSTANCE.getCamelMailBindingType_Username();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_BINDING_TYPE__PASSWORD = eINSTANCE.getCamelMailBindingType_Password();

        /**
         * The meta object literal for the '<em><b>Connection Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_BINDING_TYPE__CONNECTION_TIMEOUT = eINSTANCE.getCamelMailBindingType_ConnectionTimeout();

        /**
         * The meta object literal for the '<em><b>Consume</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_MAIL_BINDING_TYPE__CONSUME = eINSTANCE.getCamelMailBindingType_Consume();

        /**
         * The meta object literal for the '<em><b>Produce</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_MAIL_BINDING_TYPE__PRODUCE = eINSTANCE.getCamelMailBindingType_Produce();

        /**
         * The meta object literal for the '<em><b>Secure</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MAIL_BINDING_TYPE__SECURE = eINSTANCE.getCamelMailBindingType_Secure();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.MailConsumerAccountType <em>Consumer Account Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailConsumerAccountType
         * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl#getMailConsumerAccountType()
         * @generated
         */
        EEnum MAIL_CONSUMER_ACCOUNT_TYPE = eINSTANCE.getMailConsumerAccountType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mail.TimeUnitType <em>Time Unit Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.mail.TimeUnitType
         * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl#getTimeUnitType()
         * @generated
         */
        EEnum TIME_UNIT_TYPE = eINSTANCE.getTimeUnitType();

        /**
         * The meta object literal for the '<em>Consumer Account Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailConsumerAccountType
         * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl#getMailConsumerAccountTypeObject()
         * @generated
         */
        EDataType MAIL_CONSUMER_ACCOUNT_TYPE_OBJECT = eINSTANCE.getMailConsumerAccountTypeObject();

        /**
         * The meta object literal for the '<em>Time Unit Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.mail.TimeUnitType
         * @see org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl#getTimeUnitTypeObject()
         * @generated
         */
        EDataType TIME_UNIT_TYPE_OBJECT = eINSTANCE.getTimeUnitTypeObject();

    }

} //MailPackage
