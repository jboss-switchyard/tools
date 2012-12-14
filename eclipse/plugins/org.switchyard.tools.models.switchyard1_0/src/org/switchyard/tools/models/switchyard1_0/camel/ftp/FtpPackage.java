/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.switchyard.tools.models.switchyard1_0.camel.core.CamelPackage;

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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl <em>Camel Ftp Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getCamelFtpBindingType()
     * @generated
     */
    int CAMEL_FTP_BINDING_TYPE = 0;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__DOCUMENTATION = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__ANY_ATTRIBUTE = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__WIRE_FORMAT_GROUP = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__WIRE_FORMAT = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__OPERATION_SELECTOR_GROUP = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__OPERATION_SELECTOR = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__NAME = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__POLICY_SETS = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__REQUIRES = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__URI = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__CONTEXT_MAPPER = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__MESSAGE_COMPOSER = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__DIRECTORY = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__DIRECTORY;

    /**
     * The feature id for the '<em><b>Auto Create</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__AUTO_CREATE = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__AUTO_CREATE;

    /**
     * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__BUFFER_SIZE = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__BUFFER_SIZE;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__FILE_NAME = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__FILE_NAME;

    /**
     * The feature id for the '<em><b>Flatten</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__FLATTEN = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__FLATTEN;

    /**
     * The feature id for the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__CHARSET = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__CHARSET;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__HOST = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__HOST;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__PORT = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__PORT;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__USERNAME = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__USERNAME;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__PASSWORD = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__PASSWORD;

    /**
     * The feature id for the '<em><b>Binary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__BINARY = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__BINARY;

    /**
     * The feature id for the '<em><b>Connect Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__CONNECT_TIMEOUT = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__CONNECT_TIMEOUT;

    /**
     * The feature id for the '<em><b>Disconnect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__DISCONNECT = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__DISCONNECT;

    /**
     * The feature id for the '<em><b>Maximum Reconnect Attempts</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS;

    /**
     * The feature id for the '<em><b>Reconnect Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__RECONNECT_DELAY = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__RECONNECT_DELAY;

    /**
     * The feature id for the '<em><b>Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__SEPARATOR = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__SEPARATOR;

    /**
     * The feature id for the '<em><b>Stepwise</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__STEPWISE = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__STEPWISE;

    /**
     * The feature id for the '<em><b>Throw Exception On Connect Failed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED;

    /**
     * The feature id for the '<em><b>Passive Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE = CamelPackage.CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__TIMEOUT = CamelPackage.CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>So Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT = CamelPackage.CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Site Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__SITE_COMMAND = CamelPackage.CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Consume</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__CONSUME = CamelPackage.CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Produce</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__PRODUCE = CamelPackage.CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Camel Ftp Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE_FEATURE_COUNT = CamelPackage.CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 6;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpsBindingTypeImpl <em>Camel Ftps Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpsBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getCamelFtpsBindingType()
     * @generated
     */
    int CAMEL_FTPS_BINDING_TYPE = 1;

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
     * The feature id for the '<em><b>Consume</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__CONSUME = CAMEL_FTP_BINDING_TYPE__CONSUME;

    /**
     * The feature id for the '<em><b>Produce</b></em>' reference.
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
    int CAMEL_SFTP_BINDING_TYPE = 2;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__DOCUMENTATION = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__ANY_ATTRIBUTE = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__WIRE_FORMAT_GROUP = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__WIRE_FORMAT = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__OPERATION_SELECTOR_GROUP = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__OPERATION_SELECTOR = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__NAME = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__POLICY_SETS = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__REQUIRES = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__URI = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__CONTEXT_MAPPER = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__MESSAGE_COMPOSER = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__DIRECTORY = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__DIRECTORY;

    /**
     * The feature id for the '<em><b>Auto Create</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__AUTO_CREATE = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__AUTO_CREATE;

    /**
     * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__BUFFER_SIZE = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__BUFFER_SIZE;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__FILE_NAME = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__FILE_NAME;

    /**
     * The feature id for the '<em><b>Flatten</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__FLATTEN = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__FLATTEN;

    /**
     * The feature id for the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__CHARSET = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__CHARSET;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__HOST = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__HOST;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__PORT = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__PORT;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__USERNAME = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__USERNAME;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__PASSWORD = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__PASSWORD;

    /**
     * The feature id for the '<em><b>Binary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__BINARY = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__BINARY;

    /**
     * The feature id for the '<em><b>Connect Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__CONNECT_TIMEOUT = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__CONNECT_TIMEOUT;

    /**
     * The feature id for the '<em><b>Disconnect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__DISCONNECT = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__DISCONNECT;

    /**
     * The feature id for the '<em><b>Maximum Reconnect Attempts</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS;

    /**
     * The feature id for the '<em><b>Reconnect Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__RECONNECT_DELAY = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__RECONNECT_DELAY;

    /**
     * The feature id for the '<em><b>Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__SEPARATOR = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__SEPARATOR;

    /**
     * The feature id for the '<em><b>Stepwise</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__STEPWISE = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__STEPWISE;

    /**
     * The feature id for the '<em><b>Throw Exception On Connect Failed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED = CamelPackage.CAMEL_REMOTE_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED;

    /**
     * The feature id for the '<em><b>Known Hosts File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__KNOWN_HOSTS_FILE = CamelPackage.CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Private Key File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE = CamelPackage.CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Private Key File Passphrase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE = CamelPackage.CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Consume</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__CONSUME = CamelPackage.CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Produce</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__PRODUCE = CamelPackage.CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Camel Sftp Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE_FEATURE_COUNT = CamelPackage.CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl <em>Remote File Consumer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileConsumerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getRemoteFileConsumerType()
     * @generated
     */
    int REMOTE_FILE_CONSUMER_TYPE = 3;

    /**
     * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__INITIAL_DELAY = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__INITIAL_DELAY;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__DELAY = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__DELAY;

    /**
     * The feature id for the '<em><b>Use Fixed Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__USE_FIXED_DELAY = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__USE_FIXED_DELAY;

    /**
     * The feature id for the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE;

    /**
     * The feature id for the '<em><b>Time Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__TIME_UNIT = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__TIME_UNIT;

    /**
     * The feature id for the '<em><b>Max Messages Per Poll</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL;

    /**
     * The feature id for the '<em><b>Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__DELETE = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__DELETE;

    /**
     * The feature id for the '<em><b>Recursive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__RECURSIVE = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__RECURSIVE;

    /**
     * The feature id for the '<em><b>Noop</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__NOOP = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__NOOP;

    /**
     * The feature id for the '<em><b>Pre Move</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__PRE_MOVE = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__PRE_MOVE;

    /**
     * The feature id for the '<em><b>Move</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__MOVE = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__MOVE;

    /**
     * The feature id for the '<em><b>Move Failed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__MOVE_FAILED = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__MOVE_FAILED;

    /**
     * The feature id for the '<em><b>Include</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__INCLUDE = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__INCLUDE;

    /**
     * The feature id for the '<em><b>Exclude</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__EXCLUDE = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__EXCLUDE;

    /**
     * The feature id for the '<em><b>Idempotent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT;

    /**
     * The feature id for the '<em><b>Idempotent Repository</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY;

    /**
     * The feature id for the '<em><b>In Progress Repository</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY;

    /**
     * The feature id for the '<em><b>Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__FILTER = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__FILTER;

    /**
     * The feature id for the '<em><b>Sorter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__SORTER = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__SORTER;

    /**
     * The feature id for the '<em><b>Sort By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__SORT_BY = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__SORT_BY;

    /**
     * The feature id for the '<em><b>Read Lock</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__READ_LOCK = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__READ_LOCK;

    /**
     * The feature id for the '<em><b>Read Lock Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT;

    /**
     * The feature id for the '<em><b>Read Lock Check Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL;

    /**
     * The feature id for the '<em><b>Exclusive Read Lock Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY;

    /**
     * The feature id for the '<em><b>Process Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__PROCESS_STRATEGY = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__PROCESS_STRATEGY;

    /**
     * The feature id for the '<em><b>Starting Directory Must Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST;

    /**
     * The feature id for the '<em><b>Directory Must Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST;

    /**
     * The feature id for the '<em><b>Done File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__DONE_FILE_NAME = CamelPackage.GENERIC_FILE_CONSUMER_TYPE__DONE_FILE_NAME;

    /**
     * The number of structural features of the '<em>Remote File Consumer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE_FEATURE_COUNT = CamelPackage.GENERIC_FILE_CONSUMER_TYPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileProducerTypeImpl <em>Remote File Producer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileProducerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getRemoteFileProducerType()
     * @generated
     */
    int REMOTE_FILE_PRODUCER_TYPE = 4;

    /**
     * The feature id for the '<em><b>File Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE__FILE_EXIST = CamelPackage.GENERIC_FILE_PRODUCER_TYPE__FILE_EXIST;

    /**
     * The feature id for the '<em><b>Temp Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE__TEMP_PREFIX = CamelPackage.GENERIC_FILE_PRODUCER_TYPE__TEMP_PREFIX;

    /**
     * The feature id for the '<em><b>Temp File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE__TEMP_FILE_NAME = CamelPackage.GENERIC_FILE_PRODUCER_TYPE__TEMP_FILE_NAME;

    /**
     * The feature id for the '<em><b>Keep Last Modified</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED = CamelPackage.GENERIC_FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED;

    /**
     * The feature id for the '<em><b>Eager Delete Target File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE = CamelPackage.GENERIC_FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE;

    /**
     * The feature id for the '<em><b>Done File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE__DONE_FILE_NAME = CamelPackage.GENERIC_FILE_PRODUCER_TYPE__DONE_FILE_NAME;

    /**
     * The number of structural features of the '<em>Remote File Producer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE_FEATURE_COUNT = CamelPackage.GENERIC_FILE_PRODUCER_TYPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 5;

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
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType <em>Camel Ftp Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Ftp Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType
     * @generated
     */
    EClass getCamelFtpBindingType();

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
     * Returns the meta object for the reference '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getConsume <em>Consume</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Consume</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getConsume()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EReference getCamelFtpBindingType_Consume();

    /**
     * Returns the meta object for the reference '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType#getProduce <em>Produce</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Produce</em>'.
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
     * Returns the meta object for the reference '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getConsume <em>Consume</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Consume</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getConsume()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EReference getCamelSftpBindingType_Consume();

    /**
     * Returns the meta object for the reference '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType#getProduce <em>Produce</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Produce</em>'.
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
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType <em>Remote File Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Remote File Producer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType
     * @generated
     */
    EClass getRemoteFileProducerType();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl <em>Camel Ftp Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getCamelFtpBindingType()
         * @generated
         */
        EClass CAMEL_FTP_BINDING_TYPE = eINSTANCE.getCamelFtpBindingType();

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
         * The meta object literal for the '<em><b>Consume</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_FTP_BINDING_TYPE__CONSUME = eINSTANCE.getCamelFtpBindingType_Consume();

        /**
         * The meta object literal for the '<em><b>Produce</b></em>' reference feature.
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
         * The meta object literal for the '<em><b>Consume</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_SFTP_BINDING_TYPE__CONSUME = eINSTANCE.getCamelSftpBindingType_Consume();

        /**
         * The meta object literal for the '<em><b>Produce</b></em>' reference feature.
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileProducerTypeImpl <em>Remote File Producer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.RemoteFileProducerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl#getRemoteFileProducerType()
         * @generated
         */
        EClass REMOTE_FILE_PRODUCER_TYPE = eINSTANCE.getRemoteFileProducerType();

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
