/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.http;

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
 * @see org.switchyard.tools.models.switchyard1_0.http.HttpFactory
 * @model kind="package"
 * @generated
 */
public interface HttpPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "http";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-http:config:1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "http";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    HttpPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.http.impl.HttpPackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.http.impl.HttpBindingTypeImpl <em>Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.http.impl.HttpBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.http.impl.HttpPackageImpl#getHttpBindingType()
     * @generated
     */
    int HTTP_BINDING_TYPE = 0;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_BINDING_TYPE__DOCUMENTATION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_BINDING_TYPE__ANY_ATTRIBUTE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_BINDING_TYPE__WIRE_FORMAT_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_BINDING_TYPE__WIRE_FORMAT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_BINDING_TYPE__OPERATION_SELECTOR_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_BINDING_TYPE__OPERATION_SELECTOR = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_BINDING_TYPE__NAME = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_BINDING_TYPE__POLICY_SETS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_BINDING_TYPE__REQUIRES = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_BINDING_TYPE__URI = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_BINDING_TYPE__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_BINDING_TYPE__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Context Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_BINDING_TYPE__CONTEXT_PATH = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_BINDING_TYPE__ADDRESS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Method</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_BINDING_TYPE__METHOD = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Content Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_BINDING_TYPE__CONTENT_TYPE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Basic</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_BINDING_TYPE__BASIC = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Ntlm</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_BINDING_TYPE__NTLM = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Proxy</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_BINDING_TYPE__PROXY = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_BINDING_TYPE_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 7;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.http.impl.HttpContextMapperTypeImpl <em>Context Mapper Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.http.impl.HttpContextMapperTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.http.impl.HttpPackageImpl#getHttpContextMapperType()
     * @generated
     */
    int HTTP_CONTEXT_MAPPER_TYPE = 1;

    /**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_CONTEXT_MAPPER_TYPE__CLASS = SwitchyardPackage.CONTEXT_MAPPER_TYPE__CLASS;

    /**
     * The feature id for the '<em><b>Exclude Namespaces</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_CONTEXT_MAPPER_TYPE__EXCLUDE_NAMESPACES = SwitchyardPackage.CONTEXT_MAPPER_TYPE__EXCLUDE_NAMESPACES;

    /**
     * The feature id for the '<em><b>Excludes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_CONTEXT_MAPPER_TYPE__EXCLUDES = SwitchyardPackage.CONTEXT_MAPPER_TYPE__EXCLUDES;

    /**
     * The feature id for the '<em><b>Include Namespaces</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_CONTEXT_MAPPER_TYPE__INCLUDE_NAMESPACES = SwitchyardPackage.CONTEXT_MAPPER_TYPE__INCLUDE_NAMESPACES;

    /**
     * The feature id for the '<em><b>Includes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_CONTEXT_MAPPER_TYPE__INCLUDES = SwitchyardPackage.CONTEXT_MAPPER_TYPE__INCLUDES;

    /**
     * The number of structural features of the '<em>Context Mapper Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_CONTEXT_MAPPER_TYPE_FEATURE_COUNT = SwitchyardPackage.CONTEXT_MAPPER_TYPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.http.impl.HttpMessageComposerTypeImpl <em>Message Composer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.http.impl.HttpMessageComposerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.http.impl.HttpPackageImpl#getHttpMessageComposerType()
     * @generated
     */
    int HTTP_MESSAGE_COMPOSER_TYPE = 2;

    /**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_MESSAGE_COMPOSER_TYPE__CLASS = SwitchyardPackage.MESSAGE_COMPOSER_TYPE__CLASS;

    /**
     * The number of structural features of the '<em>Message Composer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_MESSAGE_COMPOSER_TYPE_FEATURE_COUNT = SwitchyardPackage.MESSAGE_COMPOSER_TYPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.http.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.http.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.http.impl.HttpPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 3;

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
     * The feature id for the '<em><b>Binding HTTP</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_HTTP = 3;

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
     * The feature id for the '<em><b>Basic</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BASIC = 6;

    /**
     * The feature id for the '<em><b>Ntlm</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NTLM = 7;

    /**
     * The feature id for the '<em><b>Proxy</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROXY = 8;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 9;


    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.http.impl.BasicAuthenticationTypeImpl <em>Basic Authentication Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.http.impl.BasicAuthenticationTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.http.impl.HttpPackageImpl#getBasicAuthenticationType()
     * @generated
     */
    int BASIC_AUTHENTICATION_TYPE = 4;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_AUTHENTICATION_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_AUTHENTICATION_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>User</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_AUTHENTICATION_TYPE__USER = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_AUTHENTICATION_TYPE__PASSWORD = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Realm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_AUTHENTICATION_TYPE__REALM = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_AUTHENTICATION_TYPE__HOST = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_AUTHENTICATION_TYPE__PORT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Basic Authentication Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_AUTHENTICATION_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.http.impl.NTLMAuthenticationTypeImpl <em>NTLM Authentication Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.http.impl.NTLMAuthenticationTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.http.impl.HttpPackageImpl#getNTLMAuthenticationType()
     * @generated
     */
    int NTLM_AUTHENTICATION_TYPE = 5;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NTLM_AUTHENTICATION_TYPE__DOCUMENTATION = BASIC_AUTHENTICATION_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NTLM_AUTHENTICATION_TYPE__ANY_ATTRIBUTE = BASIC_AUTHENTICATION_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>User</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NTLM_AUTHENTICATION_TYPE__USER = BASIC_AUTHENTICATION_TYPE__USER;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NTLM_AUTHENTICATION_TYPE__PASSWORD = BASIC_AUTHENTICATION_TYPE__PASSWORD;

    /**
     * The feature id for the '<em><b>Realm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NTLM_AUTHENTICATION_TYPE__REALM = BASIC_AUTHENTICATION_TYPE__REALM;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NTLM_AUTHENTICATION_TYPE__HOST = BASIC_AUTHENTICATION_TYPE__HOST;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NTLM_AUTHENTICATION_TYPE__PORT = BASIC_AUTHENTICATION_TYPE__PORT;

    /**
     * The feature id for the '<em><b>Domain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NTLM_AUTHENTICATION_TYPE__DOMAIN = BASIC_AUTHENTICATION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>NTLM Authentication Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NTLM_AUTHENTICATION_TYPE_FEATURE_COUNT = BASIC_AUTHENTICATION_TYPE_FEATURE_COUNT + 1;


    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.http.impl.ProxyTypeImpl <em>Proxy Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.http.impl.ProxyTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.http.impl.HttpPackageImpl#getProxyType()
     * @generated
     */
    int PROXY_TYPE = 6;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROXY_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROXY_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROXY_TYPE__HOST = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROXY_TYPE__PORT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>User</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROXY_TYPE__USER = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROXY_TYPE__PASSWORD = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Proxy Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROXY_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.http.HttpBindingType <em>Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpBindingType
     * @generated
     */
    EClass getHttpBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getContextPath <em>Context Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Context Path</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getContextPath()
     * @see #getHttpBindingType()
     * @generated
     */
    EAttribute getHttpBindingType_ContextPath();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getAddress <em>Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Address</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getAddress()
     * @see #getHttpBindingType()
     * @generated
     */
    EAttribute getHttpBindingType_Address();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getMethod <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Method</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getMethod()
     * @see #getHttpBindingType()
     * @generated
     */
    EAttribute getHttpBindingType_Method();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getContentType <em>Content Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Content Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getContentType()
     * @see #getHttpBindingType()
     * @generated
     */
    EAttribute getHttpBindingType_ContentType();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getBasic <em>Basic</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Basic</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getBasic()
     * @see #getHttpBindingType()
     * @generated
     */
    EReference getHttpBindingType_Basic();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getNtlm <em>Ntlm</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Ntlm</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getNtlm()
     * @see #getHttpBindingType()
     * @generated
     */
    EReference getHttpBindingType_Ntlm();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getProxy <em>Proxy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Proxy</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpBindingType#getProxy()
     * @see #getHttpBindingType()
     * @generated
     */
    EReference getHttpBindingType_Proxy();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.http.HttpContextMapperType <em>Context Mapper Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Mapper Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpContextMapperType
     * @generated
     */
    EClass getHttpContextMapperType();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.http.HttpMessageComposerType <em>Message Composer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Message Composer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.HttpMessageComposerType
     * @generated
     */
    EClass getHttpMessageComposerType();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.http.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.http.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.http.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.http.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.http.DocumentRoot#getBindingHTTP <em>Binding HTTP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding HTTP</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.DocumentRoot#getBindingHTTP()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingHTTP();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.http.DocumentRoot#getContextMapper <em>Context Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Context Mapper</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.DocumentRoot#getContextMapper()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ContextMapper();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.http.DocumentRoot#getMessageComposer <em>Message Composer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Message Composer</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.DocumentRoot#getMessageComposer()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MessageComposer();

    /**
     * Returns the meta object for the reference '{@link org.switchyard.tools.models.switchyard1_0.http.DocumentRoot#getBasic <em>Basic</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Basic</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.DocumentRoot#getBasic()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Basic();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.http.DocumentRoot#getNtlm <em>Ntlm</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Ntlm</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.DocumentRoot#getNtlm()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Ntlm();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.http.DocumentRoot#getProxy <em>Proxy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Proxy</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.DocumentRoot#getProxy()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Proxy();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType <em>Basic Authentication Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Basic Authentication Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType
     * @generated
     */
    EClass getBasicAuthenticationType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType#getUser <em>User</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>User</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType#getUser()
     * @see #getBasicAuthenticationType()
     * @generated
     */
    EAttribute getBasicAuthenticationType_User();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType#getPassword <em>Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType#getPassword()
     * @see #getBasicAuthenticationType()
     * @generated
     */
    EAttribute getBasicAuthenticationType_Password();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType#getRealm <em>Realm</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Realm</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType#getRealm()
     * @see #getBasicAuthenticationType()
     * @generated
     */
    EAttribute getBasicAuthenticationType_Realm();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType#getHost <em>Host</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Host</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType#getHost()
     * @see #getBasicAuthenticationType()
     * @generated
     */
    EAttribute getBasicAuthenticationType_Host();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType#getPort <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Port</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType#getPort()
     * @see #getBasicAuthenticationType()
     * @generated
     */
    EAttribute getBasicAuthenticationType_Port();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.http.NTLMAuthenticationType <em>NTLM Authentication Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>NTLM Authentication Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.NTLMAuthenticationType
     * @generated
     */
    EClass getNTLMAuthenticationType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.http.NTLMAuthenticationType#getDomain <em>Domain</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Domain</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.NTLMAuthenticationType#getDomain()
     * @see #getNTLMAuthenticationType()
     * @generated
     */
    EAttribute getNTLMAuthenticationType_Domain();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.http.ProxyType <em>Proxy Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Proxy Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.ProxyType
     * @generated
     */
    EClass getProxyType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.http.ProxyType#getHost <em>Host</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Host</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.ProxyType#getHost()
     * @see #getProxyType()
     * @generated
     */
    EAttribute getProxyType_Host();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.http.ProxyType#getPort <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Port</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.ProxyType#getPort()
     * @see #getProxyType()
     * @generated
     */
    EAttribute getProxyType_Port();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.http.ProxyType#getUser <em>User</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>User</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.ProxyType#getUser()
     * @see #getProxyType()
     * @generated
     */
    EAttribute getProxyType_User();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.http.ProxyType#getPassword <em>Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.http.ProxyType#getPassword()
     * @see #getProxyType()
     * @generated
     */
    EAttribute getProxyType_Password();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    HttpFactory getHttpFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.http.impl.HttpBindingTypeImpl <em>Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.http.impl.HttpBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.http.impl.HttpPackageImpl#getHttpBindingType()
         * @generated
         */
        EClass HTTP_BINDING_TYPE = eINSTANCE.getHttpBindingType();

        /**
         * The meta object literal for the '<em><b>Context Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HTTP_BINDING_TYPE__CONTEXT_PATH = eINSTANCE.getHttpBindingType_ContextPath();

        /**
         * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HTTP_BINDING_TYPE__ADDRESS = eINSTANCE.getHttpBindingType_Address();

        /**
         * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HTTP_BINDING_TYPE__METHOD = eINSTANCE.getHttpBindingType_Method();

        /**
         * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HTTP_BINDING_TYPE__CONTENT_TYPE = eINSTANCE.getHttpBindingType_ContentType();

        /**
         * The meta object literal for the '<em><b>Basic</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HTTP_BINDING_TYPE__BASIC = eINSTANCE.getHttpBindingType_Basic();

        /**
         * The meta object literal for the '<em><b>Ntlm</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HTTP_BINDING_TYPE__NTLM = eINSTANCE.getHttpBindingType_Ntlm();

        /**
         * The meta object literal for the '<em><b>Proxy</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HTTP_BINDING_TYPE__PROXY = eINSTANCE.getHttpBindingType_Proxy();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.http.impl.HttpContextMapperTypeImpl <em>Context Mapper Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.http.impl.HttpContextMapperTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.http.impl.HttpPackageImpl#getHttpContextMapperType()
         * @generated
         */
        EClass HTTP_CONTEXT_MAPPER_TYPE = eINSTANCE.getHttpContextMapperType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.http.impl.HttpMessageComposerTypeImpl <em>Message Composer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.http.impl.HttpMessageComposerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.http.impl.HttpPackageImpl#getHttpMessageComposerType()
         * @generated
         */
        EClass HTTP_MESSAGE_COMPOSER_TYPE = eINSTANCE.getHttpMessageComposerType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.http.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.http.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.http.impl.HttpPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Binding HTTP</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_HTTP = eINSTANCE.getDocumentRoot_BindingHTTP();

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
         * The meta object literal for the '<em><b>Basic</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BASIC = eINSTANCE.getDocumentRoot_Basic();

        /**
         * The meta object literal for the '<em><b>Ntlm</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__NTLM = eINSTANCE.getDocumentRoot_Ntlm();

        /**
         * The meta object literal for the '<em><b>Proxy</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PROXY = eINSTANCE.getDocumentRoot_Proxy();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.http.impl.BasicAuthenticationTypeImpl <em>Basic Authentication Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.http.impl.BasicAuthenticationTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.http.impl.HttpPackageImpl#getBasicAuthenticationType()
         * @generated
         */
        EClass BASIC_AUTHENTICATION_TYPE = eINSTANCE.getBasicAuthenticationType();

        /**
         * The meta object literal for the '<em><b>User</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASIC_AUTHENTICATION_TYPE__USER = eINSTANCE.getBasicAuthenticationType_User();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASIC_AUTHENTICATION_TYPE__PASSWORD = eINSTANCE.getBasicAuthenticationType_Password();

        /**
         * The meta object literal for the '<em><b>Realm</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASIC_AUTHENTICATION_TYPE__REALM = eINSTANCE.getBasicAuthenticationType_Realm();

        /**
         * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASIC_AUTHENTICATION_TYPE__HOST = eINSTANCE.getBasicAuthenticationType_Host();

        /**
         * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASIC_AUTHENTICATION_TYPE__PORT = eINSTANCE.getBasicAuthenticationType_Port();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.http.impl.NTLMAuthenticationTypeImpl <em>NTLM Authentication Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.http.impl.NTLMAuthenticationTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.http.impl.HttpPackageImpl#getNTLMAuthenticationType()
         * @generated
         */
        EClass NTLM_AUTHENTICATION_TYPE = eINSTANCE.getNTLMAuthenticationType();

        /**
         * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NTLM_AUTHENTICATION_TYPE__DOMAIN = eINSTANCE.getNTLMAuthenticationType_Domain();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.http.impl.ProxyTypeImpl <em>Proxy Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.http.impl.ProxyTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.http.impl.HttpPackageImpl#getProxyType()
         * @generated
         */
        EClass PROXY_TYPE = eINSTANCE.getProxyType();

        /**
         * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROXY_TYPE__HOST = eINSTANCE.getProxyType_Host();

        /**
         * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROXY_TYPE__PORT = eINSTANCE.getProxyType_Port();

        /**
         * The meta object literal for the '<em><b>User</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROXY_TYPE__USER = eINSTANCE.getProxyType_User();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROXY_TYPE__PASSWORD = eINSTANCE.getProxyType_Password();

    }

} //HttpPackage
