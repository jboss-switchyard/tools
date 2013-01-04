/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp;

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
 * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpFactory
 * @model kind="package"
 * @generated
 */
public interface FtpPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "ftp";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-camel-ftp:config:1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "ftp";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    FtpPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.BaseCamelBindingImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getBaseCamelBinding()
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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl <em>Camel Ftp Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getCamelFtpBindingType()
     * @generated
     */
    int CAMEL_FTP_BINDING_TYPE = 1;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Camel Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__CAMEL_CONTEXT_MAPPER = BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Camel Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__CAMEL_MESSAGE_COMPOSER = BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__DIRECTORY = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Auto Create</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__AUTO_CREATE = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__BUFFER_SIZE = BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__FILE_NAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Flatten</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__FLATTEN = BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__CHARSET = BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__HOST = BASE_CAMEL_BINDING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__PORT = BASE_CAMEL_BINDING_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__USERNAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__PASSWORD = BASE_CAMEL_BINDING_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Binary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__BINARY = BASE_CAMEL_BINDING_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Connect Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__CONNECT_TIMEOUT = BASE_CAMEL_BINDING_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Disconnect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__DISCONNECT = BASE_CAMEL_BINDING_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Maximum Reconnect Attempts</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS = BASE_CAMEL_BINDING_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Reconnect Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__RECONNECT_DELAY = BASE_CAMEL_BINDING_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__SEPARATOR = BASE_CAMEL_BINDING_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Stepwise</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__STEPWISE = BASE_CAMEL_BINDING_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Throw Exception On Connect Failed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED = BASE_CAMEL_BINDING_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Passive Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE = BASE_CAMEL_BINDING_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__TIMEOUT = BASE_CAMEL_BINDING_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>So Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT = BASE_CAMEL_BINDING_FEATURE_COUNT + 20;

    /**
     * The feature id for the '<em><b>Site Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__SITE_COMMAND = BASE_CAMEL_BINDING_FEATURE_COUNT + 21;

    /**
     * The feature id for the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__CONSUME = BASE_CAMEL_BINDING_FEATURE_COUNT + 22;

    /**
     * The feature id for the '<em><b>Produce</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__PRODUCE = BASE_CAMEL_BINDING_FEATURE_COUNT + 23;

    /**
     * The number of structural features of the '<em>Camel Ftp Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 24;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpsBindingTypeImpl <em>Camel Ftps Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpsBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getCamelFtpsBindingType()
     * @generated
     */
    int CAMEL_FTPS_BINDING_TYPE = 2;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__DOCUMENTATION = CAMEL_FTP_BINDING_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__ANY_ATTRIBUTE = CAMEL_FTP_BINDING_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__WIRE_FORMAT_GROUP = CAMEL_FTP_BINDING_TYPE__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__WIRE_FORMAT = CAMEL_FTP_BINDING_TYPE__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__OPERATION_SELECTOR_GROUP = CAMEL_FTP_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__OPERATION_SELECTOR = CAMEL_FTP_BINDING_TYPE__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__NAME = CAMEL_FTP_BINDING_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__POLICY_SETS = CAMEL_FTP_BINDING_TYPE__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__REQUIRES = CAMEL_FTP_BINDING_TYPE__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__URI = CAMEL_FTP_BINDING_TYPE__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__CONTEXT_MAPPER = CAMEL_FTP_BINDING_TYPE__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__MESSAGE_COMPOSER = CAMEL_FTP_BINDING_TYPE__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Camel Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__CAMEL_CONTEXT_MAPPER = CAMEL_FTP_BINDING_TYPE__CAMEL_CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Camel Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__CAMEL_MESSAGE_COMPOSER = CAMEL_FTP_BINDING_TYPE__CAMEL_MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__DIRECTORY = CAMEL_FTP_BINDING_TYPE__DIRECTORY;

    /**
     * The feature id for the '<em><b>Auto Create</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__AUTO_CREATE = CAMEL_FTP_BINDING_TYPE__AUTO_CREATE;

    /**
     * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__BUFFER_SIZE = CAMEL_FTP_BINDING_TYPE__BUFFER_SIZE;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__FILE_NAME = CAMEL_FTP_BINDING_TYPE__FILE_NAME;

    /**
     * The feature id for the '<em><b>Flatten</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__FLATTEN = CAMEL_FTP_BINDING_TYPE__FLATTEN;

    /**
     * The feature id for the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__CHARSET = CAMEL_FTP_BINDING_TYPE__CHARSET;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__HOST = CAMEL_FTP_BINDING_TYPE__HOST;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__PORT = CAMEL_FTP_BINDING_TYPE__PORT;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__USERNAME = CAMEL_FTP_BINDING_TYPE__USERNAME;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__PASSWORD = CAMEL_FTP_BINDING_TYPE__PASSWORD;

    /**
     * The feature id for the '<em><b>Binary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__BINARY = CAMEL_FTP_BINDING_TYPE__BINARY;

    /**
     * The feature id for the '<em><b>Connect Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__CONNECT_TIMEOUT = CAMEL_FTP_BINDING_TYPE__CONNECT_TIMEOUT;

    /**
     * The feature id for the '<em><b>Disconnect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__DISCONNECT = CAMEL_FTP_BINDING_TYPE__DISCONNECT;

    /**
     * The feature id for the '<em><b>Maximum Reconnect Attempts</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS = CAMEL_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS;

    /**
     * The feature id for the '<em><b>Reconnect Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__RECONNECT_DELAY = CAMEL_FTP_BINDING_TYPE__RECONNECT_DELAY;

    /**
     * The feature id for the '<em><b>Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__SEPARATOR = CAMEL_FTP_BINDING_TYPE__SEPARATOR;

    /**
     * The feature id for the '<em><b>Stepwise</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__STEPWISE = CAMEL_FTP_BINDING_TYPE__STEPWISE;

    /**
     * The feature id for the '<em><b>Throw Exception On Connect Failed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED = CAMEL_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED;

    /**
     * The feature id for the '<em><b>Passive Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__PASSIVE_MODE = CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE;

    /**
     * The feature id for the '<em><b>Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__TIMEOUT = CAMEL_FTP_BINDING_TYPE__TIMEOUT;

    /**
     * The feature id for the '<em><b>So Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__SO_TIMEOUT = CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT;

    /**
     * The feature id for the '<em><b>Site Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__SITE_COMMAND = CAMEL_FTP_BINDING_TYPE__SITE_COMMAND;

    /**
     * The feature id for the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__CONSUME = CAMEL_FTP_BINDING_TYPE__CONSUME;

    /**
     * The feature id for the '<em><b>Produce</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__PRODUCE = CAMEL_FTP_BINDING_TYPE__PRODUCE;

    /**
     * The feature id for the '<em><b>Security Protocol</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__SECURITY_PROTOCOL = CAMEL_FTP_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Implicit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__IS_IMPLICIT = CAMEL_FTP_BINDING_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Exec Pbsz</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__EXEC_PBSZ = CAMEL_FTP_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Exec Prot</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__EXEC_PROT = CAMEL_FTP_BINDING_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Disable Secure Data Channel Defaults</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__DISABLE_SECURE_DATA_CHANNEL_DEFAULTS = CAMEL_FTP_BINDING_TYPE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Camel Ftps Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE_FEATURE_COUNT = CAMEL_FTP_BINDING_TYPE_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelSftpBindingTypeImpl <em>Camel Sftp Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelSftpBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getCamelSftpBindingType()
     * @generated
     */
    int CAMEL_SFTP_BINDING_TYPE = 3;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Camel Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__CAMEL_CONTEXT_MAPPER = BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Camel Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__CAMEL_MESSAGE_COMPOSER = BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__DIRECTORY = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Auto Create</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__AUTO_CREATE = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__BUFFER_SIZE = BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__FILE_NAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Flatten</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__FLATTEN = BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__CHARSET = BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__HOST = BASE_CAMEL_BINDING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__PORT = BASE_CAMEL_BINDING_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__USERNAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__PASSWORD = BASE_CAMEL_BINDING_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Binary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__BINARY = BASE_CAMEL_BINDING_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Connect Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__CONNECT_TIMEOUT = BASE_CAMEL_BINDING_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Disconnect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__DISCONNECT = BASE_CAMEL_BINDING_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Maximum Reconnect Attempts</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS = BASE_CAMEL_BINDING_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Reconnect Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__RECONNECT_DELAY = BASE_CAMEL_BINDING_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__SEPARATOR = BASE_CAMEL_BINDING_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Stepwise</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__STEPWISE = BASE_CAMEL_BINDING_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Throw Exception On Connect Failed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED = BASE_CAMEL_BINDING_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Known Hosts File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__KNOWN_HOSTS_FILE = BASE_CAMEL_BINDING_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Private Key File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE = BASE_CAMEL_BINDING_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Private Key File Passphrase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE = BASE_CAMEL_BINDING_FEATURE_COUNT + 20;

    /**
     * The feature id for the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__CONSUME = BASE_CAMEL_BINDING_FEATURE_COUNT + 21;

    /**
     * The feature id for the '<em><b>Produce</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__PRODUCE = BASE_CAMEL_BINDING_FEATURE_COUNT + 22;

    /**
     * The number of structural features of the '<em>Camel Sftp Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 23;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl <em>Remote File Consumer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getRemoteFileConsumerType()
     * @generated
     */
    int REMOTE_FILE_CONSUMER_TYPE = 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileProducerTypeImpl <em>Remote File Producer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileProducerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getRemoteFileProducerType()
     * @generated
     */
    int REMOTE_FILE_PRODUCER_TYPE = 6;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.TimeUnitType <em>Time Unit Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.TimeUnitType
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getTimeUnitType()
     * @generated
     */
    int TIME_UNIT_TYPE = 7;

    /**
     * The meta object id for the '<em>Time Unit Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.TimeUnitType
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getTimeUnitTypeObject()
     * @generated
     */
    int TIME_UNIT_TYPE_OBJECT = 8;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.BaseCamelBinding <em>Base Camel Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Camel Binding</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.BaseCamelBinding
     * @generated
     */
    EClass getBaseCamelBinding();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.BaseCamelBinding#getCamelContextMapper <em>Camel Context Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Camel Context Mapper</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.BaseCamelBinding#getCamelContextMapper()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_CamelContextMapper();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.BaseCamelBinding#getCamelMessageComposer <em>Camel Message Composer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Camel Message Composer</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.BaseCamelBinding#getCamelMessageComposer()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_CamelMessageComposer();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getDocumentRoot()
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
     * The feature id for the '<em><b>Binding Ftp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_FTP = 3;

    /**
     * The feature id for the '<em><b>Binding Ftps</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_FTPS = 4;

    /**
     * The feature id for the '<em><b>Binding Sftp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_SFTP = 5;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 6;

    /**
     * The feature id for the '<em><b>Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__DELETE = 0;

    /**
     * The feature id for the '<em><b>Recursive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__RECURSIVE = 1;

    /**
     * The feature id for the '<em><b>Noop</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__NOOP = 2;

    /**
     * The feature id for the '<em><b>Pre Move</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__PRE_MOVE = 3;

    /**
     * The feature id for the '<em><b>Move</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__MOVE = 4;

    /**
     * The feature id for the '<em><b>Move Failed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__MOVE_FAILED = 5;

    /**
     * The feature id for the '<em><b>Include</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__INCLUDE = 6;

    /**
     * The feature id for the '<em><b>Exclude</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__EXCLUDE = 7;

    /**
     * The feature id for the '<em><b>Idempotent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT = 8;

    /**
     * The feature id for the '<em><b>Idempotent Repository</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY = 9;

    /**
     * The feature id for the '<em><b>In Progress Repository</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY = 10;

    /**
     * The feature id for the '<em><b>Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__FILTER = 11;

    /**
     * The feature id for the '<em><b>Sorter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__SORTER = 12;

    /**
     * The feature id for the '<em><b>Sort By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__SORT_BY = 13;

    /**
     * The feature id for the '<em><b>Read Lock</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__READ_LOCK = 14;

    /**
     * The feature id for the '<em><b>Read Lock Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT = 15;

    /**
     * The feature id for the '<em><b>Read Lock Check Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL = 16;

    /**
     * The feature id for the '<em><b>Exclusive Read Lock Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY = 17;

    /**
     * The feature id for the '<em><b>Process Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__PROCESS_STRATEGY = 18;

    /**
     * The feature id for the '<em><b>Starting Directory Must Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST = 19;

    /**
     * The feature id for the '<em><b>Directory Must Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST = 20;

    /**
     * The feature id for the '<em><b>Done File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__DONE_FILE_NAME = 21;

    /**
     * The feature id for the '<em><b>Max Messages Per Poll</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = 22;

    /**
     * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__INITIAL_DELAY = 23;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__DELAY = 24;

    /**
     * The feature id for the '<em><b>Use Fixed Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__USE_FIXED_DELAY = 25;

    /**
     * The feature id for the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = 26;

    /**
     * The feature id for the '<em><b>Time Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__TIME_UNIT = 27;

    /**
     * The number of structural features of the '<em>Remote File Consumer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE_FEATURE_COUNT = 28;

    /**
     * The feature id for the '<em><b>File Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE__FILE_EXIST = 0;

    /**
     * The feature id for the '<em><b>Temp Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE__TEMP_PREFIX = 1;

    /**
     * The feature id for the '<em><b>Temp File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE__TEMP_FILE_NAME = 2;

    /**
     * The feature id for the '<em><b>Keep Last Modified</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED = 3;

    /**
     * The feature id for the '<em><b>Eager Delete Target File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE = 4;

    /**
     * The feature id for the '<em><b>Done File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE__DONE_FILE_NAME = 5;

    /**
     * The number of structural features of the '<em>Remote File Producer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE_FEATURE_COUNT = 6;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType <em>Camel Ftp Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Ftp Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType
     * @generated
     */
    EClass getCamelFtpBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getDirectory <em>Directory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Directory</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getDirectory()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_Directory();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getAutoCreate <em>Auto Create</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Auto Create</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getAutoCreate()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_AutoCreate();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getBufferSize <em>Buffer Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Buffer Size</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getBufferSize()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_BufferSize();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getFileName <em>File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getFileName()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_FileName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getFlatten <em>Flatten</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Flatten</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getFlatten()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_Flatten();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getCharset <em>Charset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Charset</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getCharset()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_Charset();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getHost <em>Host</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Host</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getHost()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_Host();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getPort <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Port</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getPort()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_Port();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getUsername <em>Username</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Username</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getUsername()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_Username();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getPassword <em>Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getPassword()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_Password();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getBinary <em>Binary</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Binary</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getBinary()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_Binary();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getConnectTimeout <em>Connect Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connect Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getConnectTimeout()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_ConnectTimeout();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getDisconnect <em>Disconnect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Disconnect</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getDisconnect()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_Disconnect();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getMaximumReconnectAttempts <em>Maximum Reconnect Attempts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Maximum Reconnect Attempts</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getMaximumReconnectAttempts()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_MaximumReconnectAttempts();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getReconnectDelay <em>Reconnect Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reconnect Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getReconnectDelay()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_ReconnectDelay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getSeparator <em>Separator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Separator</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getSeparator()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_Separator();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getStepwise <em>Stepwise</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stepwise</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getStepwise()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_Stepwise();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getThrowExceptionOnConnectFailed <em>Throw Exception On Connect Failed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Throw Exception On Connect Failed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getThrowExceptionOnConnectFailed()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_ThrowExceptionOnConnectFailed();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getPassiveMode <em>Passive Mode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Passive Mode</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getPassiveMode()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_PassiveMode();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getTimeout <em>Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getTimeout()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_Timeout();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getSoTimeout <em>So Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>So Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getSoTimeout()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_SoTimeout();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getSiteCommand <em>Site Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Site Command</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getSiteCommand()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_SiteCommand();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getConsume <em>Consume</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Consume</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getConsume()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EReference getCamelFtpBindingType_Consume();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getProduce <em>Produce</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Produce</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getProduce()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EReference getCamelFtpBindingType_Produce();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType <em>Camel Ftps Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Ftps Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType
     * @generated
     */
    EClass getCamelFtpsBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getSecurityProtocol <em>Security Protocol</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Security Protocol</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getSecurityProtocol()
     * @see #getCamelFtpsBindingType()
     * @generated
     */
    EAttribute getCamelFtpsBindingType_SecurityProtocol();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getIsImplicit <em>Is Implicit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Implicit</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getIsImplicit()
     * @see #getCamelFtpsBindingType()
     * @generated
     */
    EAttribute getCamelFtpsBindingType_IsImplicit();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getExecPbsz <em>Exec Pbsz</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exec Pbsz</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getExecPbsz()
     * @see #getCamelFtpsBindingType()
     * @generated
     */
    EAttribute getCamelFtpsBindingType_ExecPbsz();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getExecProt <em>Exec Prot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exec Prot</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getExecProt()
     * @see #getCamelFtpsBindingType()
     * @generated
     */
    EAttribute getCamelFtpsBindingType_ExecProt();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getDisableSecureDataChannelDefaults <em>Disable Secure Data Channel Defaults</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Disable Secure Data Channel Defaults</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType#getDisableSecureDataChannelDefaults()
     * @see #getCamelFtpsBindingType()
     * @generated
     */
    EAttribute getCamelFtpsBindingType_DisableSecureDataChannelDefaults();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType <em>Camel Sftp Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Sftp Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType
     * @generated
     */
    EClass getCamelSftpBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getDirectory <em>Directory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Directory</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getDirectory()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_Directory();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getAutoCreate <em>Auto Create</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Auto Create</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getAutoCreate()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_AutoCreate();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getBufferSize <em>Buffer Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Buffer Size</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getBufferSize()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_BufferSize();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getFileName <em>File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getFileName()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_FileName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getFlatten <em>Flatten</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Flatten</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getFlatten()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_Flatten();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getCharset <em>Charset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Charset</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getCharset()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_Charset();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getHost <em>Host</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Host</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getHost()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_Host();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getPort <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Port</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getPort()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_Port();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getUsername <em>Username</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Username</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getUsername()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_Username();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getPassword <em>Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getPassword()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_Password();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getBinary <em>Binary</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Binary</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getBinary()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_Binary();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getConnectTimeout <em>Connect Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connect Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getConnectTimeout()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_ConnectTimeout();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getDisconnect <em>Disconnect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Disconnect</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getDisconnect()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_Disconnect();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getMaximumReconnectAttempts <em>Maximum Reconnect Attempts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Maximum Reconnect Attempts</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getMaximumReconnectAttempts()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_MaximumReconnectAttempts();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getReconnectDelay <em>Reconnect Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reconnect Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getReconnectDelay()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_ReconnectDelay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getSeparator <em>Separator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Separator</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getSeparator()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_Separator();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getStepwise <em>Stepwise</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stepwise</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getStepwise()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_Stepwise();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getThrowExceptionOnConnectFailed <em>Throw Exception On Connect Failed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Throw Exception On Connect Failed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getThrowExceptionOnConnectFailed()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_ThrowExceptionOnConnectFailed();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getKnownHostsFile <em>Known Hosts File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Known Hosts File</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getKnownHostsFile()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_KnownHostsFile();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getPrivateKeyFile <em>Private Key File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Private Key File</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getPrivateKeyFile()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_PrivateKeyFile();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getPrivateKeyFilePassphrase <em>Private Key File Passphrase</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Private Key File Passphrase</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getPrivateKeyFilePassphrase()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_PrivateKeyFilePassphrase();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getConsume <em>Consume</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Consume</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getConsume()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EReference getCamelSftpBindingType_Consume();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getProduce <em>Produce</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Produce</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getProduce()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EReference getCamelSftpBindingType_Produce();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType <em>Remote File Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Remote File Consumer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType
     * @generated
     */
    EClass getRemoteFileConsumerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getDelete <em>Delete</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delete</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getDelete()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_Delete();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getRecursive <em>Recursive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Recursive</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getRecursive()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_Recursive();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getNoop <em>Noop</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Noop</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getNoop()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_Noop();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getPreMove <em>Pre Move</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pre Move</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getPreMove()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_PreMove();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getMove <em>Move</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Move</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getMove()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_Move();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getMoveFailed <em>Move Failed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Move Failed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getMoveFailed()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_MoveFailed();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getInclude <em>Include</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Include</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getInclude()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_Include();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getExclude <em>Exclude</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exclude</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getExclude()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_Exclude();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getIdempotent <em>Idempotent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idempotent</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getIdempotent()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_Idempotent();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getIdempotentRepository <em>Idempotent Repository</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idempotent Repository</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getIdempotentRepository()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_IdempotentRepository();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getInProgressRepository <em>In Progress Repository</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>In Progress Repository</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getInProgressRepository()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_InProgressRepository();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getFilter <em>Filter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Filter</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getFilter()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_Filter();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getSorter <em>Sorter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sorter</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getSorter()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_Sorter();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getSortBy <em>Sort By</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sort By</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getSortBy()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_SortBy();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getReadLock <em>Read Lock</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read Lock</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getReadLock()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_ReadLock();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getReadLockTimeout <em>Read Lock Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read Lock Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getReadLockTimeout()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_ReadLockTimeout();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getReadLockCheckInterval <em>Read Lock Check Interval</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read Lock Check Interval</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getReadLockCheckInterval()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_ReadLockCheckInterval();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getExclusiveReadLockStrategy <em>Exclusive Read Lock Strategy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exclusive Read Lock Strategy</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getExclusiveReadLockStrategy()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_ExclusiveReadLockStrategy();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getProcessStrategy <em>Process Strategy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process Strategy</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getProcessStrategy()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_ProcessStrategy();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getStartingDirectoryMustExist <em>Starting Directory Must Exist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Starting Directory Must Exist</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getStartingDirectoryMustExist()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_StartingDirectoryMustExist();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getDirectoryMustExist <em>Directory Must Exist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Directory Must Exist</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getDirectoryMustExist()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_DirectoryMustExist();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getDoneFileName <em>Done File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Done File Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getDoneFileName()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_DoneFileName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Messages Per Poll</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getMaxMessagesPerPoll()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_MaxMessagesPerPoll();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getInitialDelay <em>Initial Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initial Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getInitialDelay()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_InitialDelay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getDelay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getDelay()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_Delay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getUseFixedDelay <em>Use Fixed Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Fixed Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getUseFixedDelay()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_UseFixedDelay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Send Empty Message When Idle</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getSendEmptyMessageWhenIdle()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_SendEmptyMessageWhenIdle();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getTimeUnit <em>Time Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time Unit</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType#getTimeUnit()
     * @see #getRemoteFileConsumerType()
     * @generated
     */
    EAttribute getRemoteFileConsumerType_TimeUnit();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType <em>Remote File Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Remote File Producer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType
     * @generated
     */
    EClass getRemoteFileProducerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getFileExist <em>File Exist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File Exist</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getFileExist()
     * @see #getRemoteFileProducerType()
     * @generated
     */
    EAttribute getRemoteFileProducerType_FileExist();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getTempPrefix <em>Temp Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Temp Prefix</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getTempPrefix()
     * @see #getRemoteFileProducerType()
     * @generated
     */
    EAttribute getRemoteFileProducerType_TempPrefix();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getTempFileName <em>Temp File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Temp File Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getTempFileName()
     * @see #getRemoteFileProducerType()
     * @generated
     */
    EAttribute getRemoteFileProducerType_TempFileName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getKeepLastModified <em>Keep Last Modified</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Keep Last Modified</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getKeepLastModified()
     * @see #getRemoteFileProducerType()
     * @generated
     */
    EAttribute getRemoteFileProducerType_KeepLastModified();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getEagerDeleteTargetFile <em>Eager Delete Target File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Eager Delete Target File</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getEagerDeleteTargetFile()
     * @see #getRemoteFileProducerType()
     * @generated
     */
    EAttribute getRemoteFileProducerType_EagerDeleteTargetFile();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getDoneFileName <em>Done File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Done File Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType#getDoneFileName()
     * @see #getRemoteFileProducerType()
     * @generated
     */
    EAttribute getRemoteFileProducerType_DoneFileName();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.TimeUnitType <em>Time Unit Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Time Unit Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.TimeUnitType
     * @generated
     */
    EEnum getTimeUnitType();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.TimeUnitType <em>Time Unit Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Time Unit Type Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.TimeUnitType
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.camel.ftp.TimeUnitType"
     *        extendedMetaData="name='timeUnit_._type:Object' baseType='timeUnit_._type'"
     * @generated
     */
    EDataType getTimeUnitTypeObject();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.DocumentRoot#getBindingFtp <em>Binding Ftp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Ftp</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.DocumentRoot#getBindingFtp()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingFtp();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.DocumentRoot#getBindingFtps <em>Binding Ftps</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Ftps</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.DocumentRoot#getBindingFtps()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingFtps();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.DocumentRoot#getBindingSftp <em>Binding Sftp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Sftp</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.DocumentRoot#getBindingSftp()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingSftp();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    FtpFactory getFtpFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.BaseCamelBindingImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getBaseCamelBinding()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl <em>Camel Ftp Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getCamelFtpBindingType()
         * @generated
         */
        EClass CAMEL_FTP_BINDING_TYPE = eINSTANCE.getCamelFtpBindingType();

        /**
         * The meta object literal for the '<em><b>Directory</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__DIRECTORY = eINSTANCE.getCamelFtpBindingType_Directory();

        /**
         * The meta object literal for the '<em><b>Auto Create</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__AUTO_CREATE = eINSTANCE.getCamelFtpBindingType_AutoCreate();

        /**
         * The meta object literal for the '<em><b>Buffer Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__BUFFER_SIZE = eINSTANCE.getCamelFtpBindingType_BufferSize();

        /**
         * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__FILE_NAME = eINSTANCE.getCamelFtpBindingType_FileName();

        /**
         * The meta object literal for the '<em><b>Flatten</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__FLATTEN = eINSTANCE.getCamelFtpBindingType_Flatten();

        /**
         * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__CHARSET = eINSTANCE.getCamelFtpBindingType_Charset();

        /**
         * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__HOST = eINSTANCE.getCamelFtpBindingType_Host();

        /**
         * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__PORT = eINSTANCE.getCamelFtpBindingType_Port();

        /**
         * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__USERNAME = eINSTANCE.getCamelFtpBindingType_Username();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__PASSWORD = eINSTANCE.getCamelFtpBindingType_Password();

        /**
         * The meta object literal for the '<em><b>Binary</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__BINARY = eINSTANCE.getCamelFtpBindingType_Binary();

        /**
         * The meta object literal for the '<em><b>Connect Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__CONNECT_TIMEOUT = eINSTANCE.getCamelFtpBindingType_ConnectTimeout();

        /**
         * The meta object literal for the '<em><b>Disconnect</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__DISCONNECT = eINSTANCE.getCamelFtpBindingType_Disconnect();

        /**
         * The meta object literal for the '<em><b>Maximum Reconnect Attempts</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS = eINSTANCE.getCamelFtpBindingType_MaximumReconnectAttempts();

        /**
         * The meta object literal for the '<em><b>Reconnect Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__RECONNECT_DELAY = eINSTANCE.getCamelFtpBindingType_ReconnectDelay();

        /**
         * The meta object literal for the '<em><b>Separator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__SEPARATOR = eINSTANCE.getCamelFtpBindingType_Separator();

        /**
         * The meta object literal for the '<em><b>Stepwise</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__STEPWISE = eINSTANCE.getCamelFtpBindingType_Stepwise();

        /**
         * The meta object literal for the '<em><b>Throw Exception On Connect Failed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED = eINSTANCE.getCamelFtpBindingType_ThrowExceptionOnConnectFailed();

        /**
         * The meta object literal for the '<em><b>Passive Mode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE = eINSTANCE.getCamelFtpBindingType_PassiveMode();

        /**
         * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__TIMEOUT = eINSTANCE.getCamelFtpBindingType_Timeout();

        /**
         * The meta object literal for the '<em><b>So Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT = eINSTANCE.getCamelFtpBindingType_SoTimeout();

        /**
         * The meta object literal for the '<em><b>Site Command</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__SITE_COMMAND = eINSTANCE.getCamelFtpBindingType_SiteCommand();

        /**
         * The meta object literal for the '<em><b>Consume</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_FTP_BINDING_TYPE__CONSUME = eINSTANCE.getCamelFtpBindingType_Consume();

        /**
         * The meta object literal for the '<em><b>Produce</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_FTP_BINDING_TYPE__PRODUCE = eINSTANCE.getCamelFtpBindingType_Produce();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpsBindingTypeImpl <em>Camel Ftps Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpsBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getCamelFtpsBindingType()
         * @generated
         */
        EClass CAMEL_FTPS_BINDING_TYPE = eINSTANCE.getCamelFtpsBindingType();

        /**
         * The meta object literal for the '<em><b>Security Protocol</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTPS_BINDING_TYPE__SECURITY_PROTOCOL = eINSTANCE.getCamelFtpsBindingType_SecurityProtocol();

        /**
         * The meta object literal for the '<em><b>Is Implicit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTPS_BINDING_TYPE__IS_IMPLICIT = eINSTANCE.getCamelFtpsBindingType_IsImplicit();

        /**
         * The meta object literal for the '<em><b>Exec Pbsz</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTPS_BINDING_TYPE__EXEC_PBSZ = eINSTANCE.getCamelFtpsBindingType_ExecPbsz();

        /**
         * The meta object literal for the '<em><b>Exec Prot</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTPS_BINDING_TYPE__EXEC_PROT = eINSTANCE.getCamelFtpsBindingType_ExecProt();

        /**
         * The meta object literal for the '<em><b>Disable Secure Data Channel Defaults</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTPS_BINDING_TYPE__DISABLE_SECURE_DATA_CHANNEL_DEFAULTS = eINSTANCE.getCamelFtpsBindingType_DisableSecureDataChannelDefaults();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelSftpBindingTypeImpl <em>Camel Sftp Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelSftpBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getCamelSftpBindingType()
         * @generated
         */
        EClass CAMEL_SFTP_BINDING_TYPE = eINSTANCE.getCamelSftpBindingType();

        /**
         * The meta object literal for the '<em><b>Directory</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__DIRECTORY = eINSTANCE.getCamelSftpBindingType_Directory();

        /**
         * The meta object literal for the '<em><b>Auto Create</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__AUTO_CREATE = eINSTANCE.getCamelSftpBindingType_AutoCreate();

        /**
         * The meta object literal for the '<em><b>Buffer Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__BUFFER_SIZE = eINSTANCE.getCamelSftpBindingType_BufferSize();

        /**
         * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__FILE_NAME = eINSTANCE.getCamelSftpBindingType_FileName();

        /**
         * The meta object literal for the '<em><b>Flatten</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__FLATTEN = eINSTANCE.getCamelSftpBindingType_Flatten();

        /**
         * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__CHARSET = eINSTANCE.getCamelSftpBindingType_Charset();

        /**
         * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__HOST = eINSTANCE.getCamelSftpBindingType_Host();

        /**
         * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__PORT = eINSTANCE.getCamelSftpBindingType_Port();

        /**
         * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__USERNAME = eINSTANCE.getCamelSftpBindingType_Username();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__PASSWORD = eINSTANCE.getCamelSftpBindingType_Password();

        /**
         * The meta object literal for the '<em><b>Binary</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__BINARY = eINSTANCE.getCamelSftpBindingType_Binary();

        /**
         * The meta object literal for the '<em><b>Connect Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__CONNECT_TIMEOUT = eINSTANCE.getCamelSftpBindingType_ConnectTimeout();

        /**
         * The meta object literal for the '<em><b>Disconnect</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__DISCONNECT = eINSTANCE.getCamelSftpBindingType_Disconnect();

        /**
         * The meta object literal for the '<em><b>Maximum Reconnect Attempts</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS = eINSTANCE.getCamelSftpBindingType_MaximumReconnectAttempts();

        /**
         * The meta object literal for the '<em><b>Reconnect Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__RECONNECT_DELAY = eINSTANCE.getCamelSftpBindingType_ReconnectDelay();

        /**
         * The meta object literal for the '<em><b>Separator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__SEPARATOR = eINSTANCE.getCamelSftpBindingType_Separator();

        /**
         * The meta object literal for the '<em><b>Stepwise</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__STEPWISE = eINSTANCE.getCamelSftpBindingType_Stepwise();

        /**
         * The meta object literal for the '<em><b>Throw Exception On Connect Failed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED = eINSTANCE.getCamelSftpBindingType_ThrowExceptionOnConnectFailed();

        /**
         * The meta object literal for the '<em><b>Known Hosts File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__KNOWN_HOSTS_FILE = eINSTANCE.getCamelSftpBindingType_KnownHostsFile();

        /**
         * The meta object literal for the '<em><b>Private Key File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE = eINSTANCE.getCamelSftpBindingType_PrivateKeyFile();

        /**
         * The meta object literal for the '<em><b>Private Key File Passphrase</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE = eINSTANCE.getCamelSftpBindingType_PrivateKeyFilePassphrase();

        /**
         * The meta object literal for the '<em><b>Consume</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_SFTP_BINDING_TYPE__CONSUME = eINSTANCE.getCamelSftpBindingType_Consume();

        /**
         * The meta object literal for the '<em><b>Produce</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_SFTP_BINDING_TYPE__PRODUCE = eINSTANCE.getCamelSftpBindingType_Produce();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl <em>Remote File Consumer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getRemoteFileConsumerType()
         * @generated
         */
        EClass REMOTE_FILE_CONSUMER_TYPE = eINSTANCE.getRemoteFileConsumerType();

        /**
         * The meta object literal for the '<em><b>Delete</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__DELETE = eINSTANCE.getRemoteFileConsumerType_Delete();

        /**
         * The meta object literal for the '<em><b>Recursive</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__RECURSIVE = eINSTANCE.getRemoteFileConsumerType_Recursive();

        /**
         * The meta object literal for the '<em><b>Noop</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__NOOP = eINSTANCE.getRemoteFileConsumerType_Noop();

        /**
         * The meta object literal for the '<em><b>Pre Move</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__PRE_MOVE = eINSTANCE.getRemoteFileConsumerType_PreMove();

        /**
         * The meta object literal for the '<em><b>Move</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__MOVE = eINSTANCE.getRemoteFileConsumerType_Move();

        /**
         * The meta object literal for the '<em><b>Move Failed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__MOVE_FAILED = eINSTANCE.getRemoteFileConsumerType_MoveFailed();

        /**
         * The meta object literal for the '<em><b>Include</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__INCLUDE = eINSTANCE.getRemoteFileConsumerType_Include();

        /**
         * The meta object literal for the '<em><b>Exclude</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__EXCLUDE = eINSTANCE.getRemoteFileConsumerType_Exclude();

        /**
         * The meta object literal for the '<em><b>Idempotent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT = eINSTANCE.getRemoteFileConsumerType_Idempotent();

        /**
         * The meta object literal for the '<em><b>Idempotent Repository</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY = eINSTANCE.getRemoteFileConsumerType_IdempotentRepository();

        /**
         * The meta object literal for the '<em><b>In Progress Repository</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY = eINSTANCE.getRemoteFileConsumerType_InProgressRepository();

        /**
         * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__FILTER = eINSTANCE.getRemoteFileConsumerType_Filter();

        /**
         * The meta object literal for the '<em><b>Sorter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__SORTER = eINSTANCE.getRemoteFileConsumerType_Sorter();

        /**
         * The meta object literal for the '<em><b>Sort By</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__SORT_BY = eINSTANCE.getRemoteFileConsumerType_SortBy();

        /**
         * The meta object literal for the '<em><b>Read Lock</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__READ_LOCK = eINSTANCE.getRemoteFileConsumerType_ReadLock();

        /**
         * The meta object literal for the '<em><b>Read Lock Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT = eINSTANCE.getRemoteFileConsumerType_ReadLockTimeout();

        /**
         * The meta object literal for the '<em><b>Read Lock Check Interval</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL = eINSTANCE.getRemoteFileConsumerType_ReadLockCheckInterval();

        /**
         * The meta object literal for the '<em><b>Exclusive Read Lock Strategy</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY = eINSTANCE.getRemoteFileConsumerType_ExclusiveReadLockStrategy();

        /**
         * The meta object literal for the '<em><b>Process Strategy</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__PROCESS_STRATEGY = eINSTANCE.getRemoteFileConsumerType_ProcessStrategy();

        /**
         * The meta object literal for the '<em><b>Starting Directory Must Exist</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST = eINSTANCE.getRemoteFileConsumerType_StartingDirectoryMustExist();

        /**
         * The meta object literal for the '<em><b>Directory Must Exist</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST = eINSTANCE.getRemoteFileConsumerType_DirectoryMustExist();

        /**
         * The meta object literal for the '<em><b>Done File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__DONE_FILE_NAME = eINSTANCE.getRemoteFileConsumerType_DoneFileName();

        /**
         * The meta object literal for the '<em><b>Max Messages Per Poll</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = eINSTANCE.getRemoteFileConsumerType_MaxMessagesPerPoll();

        /**
         * The meta object literal for the '<em><b>Initial Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__INITIAL_DELAY = eINSTANCE.getRemoteFileConsumerType_InitialDelay();

        /**
         * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__DELAY = eINSTANCE.getRemoteFileConsumerType_Delay();

        /**
         * The meta object literal for the '<em><b>Use Fixed Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__USE_FIXED_DELAY = eINSTANCE.getRemoteFileConsumerType_UseFixedDelay();

        /**
         * The meta object literal for the '<em><b>Send Empty Message When Idle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = eINSTANCE.getRemoteFileConsumerType_SendEmptyMessageWhenIdle();

        /**
         * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_CONSUMER_TYPE__TIME_UNIT = eINSTANCE.getRemoteFileConsumerType_TimeUnit();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileProducerTypeImpl <em>Remote File Producer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileProducerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getRemoteFileProducerType()
         * @generated
         */
        EClass REMOTE_FILE_PRODUCER_TYPE = eINSTANCE.getRemoteFileProducerType();

        /**
         * The meta object literal for the '<em><b>File Exist</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_PRODUCER_TYPE__FILE_EXIST = eINSTANCE.getRemoteFileProducerType_FileExist();

        /**
         * The meta object literal for the '<em><b>Temp Prefix</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_PRODUCER_TYPE__TEMP_PREFIX = eINSTANCE.getRemoteFileProducerType_TempPrefix();

        /**
         * The meta object literal for the '<em><b>Temp File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_PRODUCER_TYPE__TEMP_FILE_NAME = eINSTANCE.getRemoteFileProducerType_TempFileName();

        /**
         * The meta object literal for the '<em><b>Keep Last Modified</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED = eINSTANCE.getRemoteFileProducerType_KeepLastModified();

        /**
         * The meta object literal for the '<em><b>Eager Delete Target File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE = eINSTANCE.getRemoteFileProducerType_EagerDeleteTargetFile();

        /**
         * The meta object literal for the '<em><b>Done File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_FILE_PRODUCER_TYPE__DONE_FILE_NAME = eINSTANCE.getRemoteFileProducerType_DoneFileName();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.TimeUnitType <em>Time Unit Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.TimeUnitType
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getTimeUnitType()
         * @generated
         */
        EEnum TIME_UNIT_TYPE = eINSTANCE.getTimeUnitType();

        /**
         * The meta object literal for the '<em>Time Unit Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.TimeUnitType
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getTimeUnitTypeObject()
         * @generated
         */
        EDataType TIME_UNIT_TYPE_OBJECT = eINSTANCE.getTimeUnitTypeObject();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Binding Ftp</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_FTP = eINSTANCE.getDocumentRoot_BindingFtp();

        /**
         * The meta object literal for the '<em><b>Binding Ftps</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_FTPS = eINSTANCE.getDocumentRoot_BindingFtps();

        /**
         * The meta object literal for the '<em><b>Binding Sftp</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_SFTP = eINSTANCE.getDocumentRoot_BindingSftp();

    }

} //FtpPackage
