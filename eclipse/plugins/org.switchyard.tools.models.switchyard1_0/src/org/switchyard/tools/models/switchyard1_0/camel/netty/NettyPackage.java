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
 * <!-- begin-model-doc -->
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *     <h1>About the XML namespace</h1>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 *      </p>
 *      <p>
 *       See <a href="http://www.w3.org/XML/1998/namespace.html">
 *       http://www.w3.org/XML/1998/namespace.html</a> and
 *       <a href="http://www.w3.org/TR/REC-xml">
 *       http://www.w3.org/TR/REC-xml</a> for information 
 *       about this namespace.
 *      </p>
 *      <p>
 *       Note that local names in this namespace are intended to be
 *       defined only by the World Wide Web Consortium or its subgroups.
 *       The names currently defined in this namespace are listed below.
 *       They should not be used with conflicting semantics by any Working
 *       Group, specification, or document instance.
 *      </p>
 *      <p>   
 *       See further below in this document for more information about <a href="#usage">how to refer to this schema document from your own
 *       XSD schema documents</a> and about <a href="#nsversioning">the
 *       namespace-versioning policy governing this schema document</a>.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *    
 *     <h3>Father (in any context at all)</h3> 
 * 
 *     <div class="bodytext">
 *      <p>
 *       denotes Jon Bosak, the chair of 
 *       the original XML Working Group.  This name is reserved by 
 *       the following decision of the W3C XML Plenary and 
 *       XML Coordination groups:
 *      </p>
 *      <blockquote>
 *        <p>
 * 	In appreciation for his vision, leadership and
 * 	dedication the W3C XML Plenary on this 10th day of
 * 	February, 2000, reserves for Jon Bosak in perpetuity
 * 	the XML name "xml:Father".
 *        </p>
 *      </blockquote>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="usage" xml:id="usage" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="usage">About this schema document</a>
 *     </h2>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema defines attributes and an attribute group suitable
 *       for use by schemas wishing to allow <code>xml:base</code>,
 *       <code>xml:lang</code>, <code>xml:space</code> or
 *       <code>xml:id</code> attributes on elements they define.
 *      </p>
 *      <p>
 *       To enable this, such a schema must import this schema for
 *       the XML namespace, e.g. as follows:
 *      </p>
 *      <pre>
 *           &lt;schema . . .&gt;
 *            . . .
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       or
 *      </p>
 *      <pre>
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2009/01/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       Subsequently, qualified reference to any of the attributes or the
 *       group defined below will have the desired effect, e.g.
 *      </p>
 *      <pre>
 *           &lt;type . . .&gt;
 *            . . .
 *            &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *      </pre>
 *      <p>
 *       will define a type which will schema-validate an instance element
 *       with any of those attributes.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="nsversioning" xml:id="nsversioning" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="nsversioning">Versioning policy for this schema document</a>
 *     </h2>
 *     <div class="bodytext">
 *      <p>
 *       In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd</a>.
 *      </p>
 *      <p>
 *       At the date of issue it can also be found at
 *       <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd</a>.
 *      </p>
 *      <p>
 *       The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML
 *       Schema itself, or with the XML namespace itself.  In other words,
 *       if the XML Schema or XML namespaces change, the version of this
 *       document at <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd 
 *       </a> 
 *       will change accordingly; the version at 
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd 
 *       </a> 
 *       will not change.
 *      </p>
 *      <p>
 *       Previous dated (and unchanging) versions of this schema 
 *       document are at:
 *      </p>
 *      <ul>
 *       <li>
 *           <a href="http://www.w3.org/2009/01/xml.xsd">
 * 	http://www.w3.org/2009/01/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2007/08/xml.xsd">
 * 	http://www.w3.org/2007/08/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2004/10/xml.xsd">
 * 	http://www.w3.org/2004/10/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2001/03/xml.xsd">
 * 	http://www.w3.org/2001/03/xml.xsd</a>
 *         </li>
 *      </ul>
 *     </div>
 *    </div>
 *   
 * <!-- end-model-doc -->
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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.AdditionalUriParametersTypeImpl <em>Additional Uri Parameters Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.AdditionalUriParametersTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl#getAdditionalUriParametersType()
     * @generated
     */
    int ADDITIONAL_URI_PARAMETERS_TYPE = 0;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_URI_PARAMETERS_TYPE__PARAMETER = 0;

    /**
     * The number of structural features of the '<em>Additional Uri Parameters Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_URI_PARAMETERS_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.BaseCamelBindingImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl#getBaseCamelBinding()
     * @generated
     */
    int BASE_CAMEL_BINDING = 1;

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
    int BASE_CAMEL_BINDING__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Additional Uri Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__ADDITIONAL_URI_PARAMETERS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Base Camel Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl <em>Camel Netty Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl#getCamelNettyBindingType()
     * @generated
     */
    int CAMEL_NETTY_BINDING_TYPE = 2;

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
     * The feature id for the '<em><b>Additional Uri Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__ADDITIONAL_URI_PARAMETERS = BASE_CAMEL_BINDING__ADDITIONAL_URI_PARAMETERS;

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
     * The feature id for the '<em><b>Ssl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__SSL = BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Ssl Handler</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__SSL_HANDLER = BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Need Client Auth</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__NEED_CLIENT_AUTH = BASE_CAMEL_BINDING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Passphrase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__PASSPHRASE = BASE_CAMEL_BINDING_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Security Provider</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__SECURITY_PROVIDER = BASE_CAMEL_BINDING_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Key Store Format</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__KEY_STORE_FORMAT = BASE_CAMEL_BINDING_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Key Store File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__KEY_STORE_FILE = BASE_CAMEL_BINDING_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Trust Store File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__TRUST_STORE_FILE = BASE_CAMEL_BINDING_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Ssl Context Parameters Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__SSL_CONTEXT_PARAMETERS_REF = BASE_CAMEL_BINDING_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Reuse Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__REUSE_ADDRESS = BASE_CAMEL_BINDING_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Encoders</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__ENCODERS = BASE_CAMEL_BINDING_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Decoders</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__DECODERS = BASE_CAMEL_BINDING_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Allow Default Codec</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC = BASE_CAMEL_BINDING_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Worker Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Sync</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__SYNC = BASE_CAMEL_BINDING_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Disconnect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE__DISCONNECT = BASE_CAMEL_BINDING_FEATURE_COUNT + 19;

    /**
     * The number of structural features of the '<em>Camel Netty Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 20;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyTcpBindingTypeImpl <em>Camel Netty Tcp Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.CamelNettyTcpBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl#getCamelNettyTcpBindingType()
     * @generated
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE = 3;

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
     * The feature id for the '<em><b>Additional Uri Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__ADDITIONAL_URI_PARAMETERS = CAMEL_NETTY_BINDING_TYPE__ADDITIONAL_URI_PARAMETERS;

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
     * The feature id for the '<em><b>Ssl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__SSL = CAMEL_NETTY_BINDING_TYPE__SSL;

    /**
     * The feature id for the '<em><b>Ssl Handler</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__SSL_HANDLER = CAMEL_NETTY_BINDING_TYPE__SSL_HANDLER;

    /**
     * The feature id for the '<em><b>Need Client Auth</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__NEED_CLIENT_AUTH = CAMEL_NETTY_BINDING_TYPE__NEED_CLIENT_AUTH;

    /**
     * The feature id for the '<em><b>Passphrase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__PASSPHRASE = CAMEL_NETTY_BINDING_TYPE__PASSPHRASE;

    /**
     * The feature id for the '<em><b>Security Provider</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__SECURITY_PROVIDER = CAMEL_NETTY_BINDING_TYPE__SECURITY_PROVIDER;

    /**
     * The feature id for the '<em><b>Key Store Format</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__KEY_STORE_FORMAT = CAMEL_NETTY_BINDING_TYPE__KEY_STORE_FORMAT;

    /**
     * The feature id for the '<em><b>Key Store File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__KEY_STORE_FILE = CAMEL_NETTY_BINDING_TYPE__KEY_STORE_FILE;

    /**
     * The feature id for the '<em><b>Trust Store File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__TRUST_STORE_FILE = CAMEL_NETTY_BINDING_TYPE__TRUST_STORE_FILE;

    /**
     * The feature id for the '<em><b>Ssl Context Parameters Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_TCP_BINDING_TYPE__SSL_CONTEXT_PARAMETERS_REF = CAMEL_NETTY_BINDING_TYPE__SSL_CONTEXT_PARAMETERS_REF;

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
    int CAMEL_NETTY_UDP_BINDING_TYPE = 4;

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
     * The feature id for the '<em><b>Additional Uri Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__ADDITIONAL_URI_PARAMETERS = CAMEL_NETTY_BINDING_TYPE__ADDITIONAL_URI_PARAMETERS;

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
     * The feature id for the '<em><b>Ssl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__SSL = CAMEL_NETTY_BINDING_TYPE__SSL;

    /**
     * The feature id for the '<em><b>Ssl Handler</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__SSL_HANDLER = CAMEL_NETTY_BINDING_TYPE__SSL_HANDLER;

    /**
     * The feature id for the '<em><b>Need Client Auth</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__NEED_CLIENT_AUTH = CAMEL_NETTY_BINDING_TYPE__NEED_CLIENT_AUTH;

    /**
     * The feature id for the '<em><b>Passphrase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__PASSPHRASE = CAMEL_NETTY_BINDING_TYPE__PASSPHRASE;

    /**
     * The feature id for the '<em><b>Security Provider</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__SECURITY_PROVIDER = CAMEL_NETTY_BINDING_TYPE__SECURITY_PROVIDER;

    /**
     * The feature id for the '<em><b>Key Store Format</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__KEY_STORE_FORMAT = CAMEL_NETTY_BINDING_TYPE__KEY_STORE_FORMAT;

    /**
     * The feature id for the '<em><b>Key Store File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__KEY_STORE_FILE = CAMEL_NETTY_BINDING_TYPE__KEY_STORE_FILE;

    /**
     * The feature id for the '<em><b>Trust Store File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__TRUST_STORE_FILE = CAMEL_NETTY_BINDING_TYPE__TRUST_STORE_FILE;

    /**
     * The feature id for the '<em><b>Ssl Context Parameters Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_NETTY_UDP_BINDING_TYPE__SSL_CONTEXT_PARAMETERS_REF = CAMEL_NETTY_BINDING_TYPE__SSL_CONTEXT_PARAMETERS_REF;

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
     * The feature id for the '<em><b>Binding Tcp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_TCP = 3;

    /**
     * The feature id for the '<em><b>Binding Udp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_UDP = 4;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 5;


    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.ParameterTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl#getParameterType()
     * @generated
     */
    int PARAMETER_TYPE = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__NAME = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__VALUE = 1;

    /**
     * The number of structural features of the '<em>Parameter Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE_FEATURE_COUNT = 2;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.AdditionalUriParametersType <em>Additional Uri Parameters Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Additional Uri Parameters Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.AdditionalUriParametersType
     * @generated
     */
    EClass getAdditionalUriParametersType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.AdditionalUriParametersType#getParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameter</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.AdditionalUriParametersType#getParameter()
     * @see #getAdditionalUriParametersType()
     * @generated
     */
    EReference getAdditionalUriParametersType_Parameter();

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
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.BaseCamelBinding#getContextMapper <em>Context Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Context Mapper</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.BaseCamelBinding#getContextMapper()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_ContextMapper();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.BaseCamelBinding#getMessageComposer <em>Message Composer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Message Composer</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.BaseCamelBinding#getMessageComposer()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_MessageComposer();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.BaseCamelBinding#getAdditionalUriParameters <em>Additional Uri Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Additional Uri Parameters</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.BaseCamelBinding#getAdditionalUriParameters()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_AdditionalUriParameters();

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
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#isTextline <em>Textline</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Textline</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#isTextline()
     * @see #getCamelNettyTcpBindingType()
     * @generated
     */
    EAttribute getCamelNettyTcpBindingType_Textline();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#isTcpNoDelay <em>Tcp No Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tcp No Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#isTcpNoDelay()
     * @see #getCamelNettyTcpBindingType()
     * @generated
     */
    EAttribute getCamelNettyTcpBindingType_TcpNoDelay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#isKeepAlive <em>Keep Alive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Keep Alive</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType#isKeepAlive()
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
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyUdpBindingType#isBroadcast <em>Broadcast</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Broadcast</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyUdpBindingType#isBroadcast()
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
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isSsl <em>Ssl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ssl</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isSsl()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_Ssl();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSslHandler <em>Ssl Handler</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ssl Handler</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSslHandler()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_SslHandler();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isNeedClientAuth <em>Need Client Auth</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Need Client Auth</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isNeedClientAuth()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_NeedClientAuth();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getPassphrase <em>Passphrase</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Passphrase</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getPassphrase()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_Passphrase();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSecurityProvider <em>Security Provider</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Security Provider</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSecurityProvider()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_SecurityProvider();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getKeyStoreFormat <em>Key Store Format</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key Store Format</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getKeyStoreFormat()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_KeyStoreFormat();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getKeyStoreFile <em>Key Store File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key Store File</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getKeyStoreFile()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_KeyStoreFile();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getTrustStoreFile <em>Trust Store File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Trust Store File</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getTrustStoreFile()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_TrustStoreFile();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSslContextParametersRef <em>Ssl Context Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ssl Context Parameters Ref</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#getSslContextParametersRef()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_SslContextParametersRef();

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
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isAllowDefaultCodec <em>Allow Default Codec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Allow Default Codec</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isAllowDefaultCodec()
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
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isSync <em>Sync</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sync</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isSync()
     * @see #getCamelNettyBindingType()
     * @generated
     */
    EAttribute getCamelNettyBindingType_Sync();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isDisconnect <em>Disconnect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Disconnect</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType#isDisconnect()
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
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.DocumentRoot#getBindingTcp <em>Binding Tcp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Tcp</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.DocumentRoot#getBindingTcp()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingTcp();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.DocumentRoot#getBindingUdp <em>Binding Udp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Udp</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.DocumentRoot#getBindingUdp()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingUdp();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.ParameterType <em>Parameter Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.ParameterType
     * @generated
     */
    EClass getParameterType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.ParameterType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.ParameterType#getName()
     * @see #getParameterType()
     * @generated
     */
    EAttribute getParameterType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.ParameterType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.ParameterType#getValue()
     * @see #getParameterType()
     * @generated
     */
    EAttribute getParameterType_Value();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.AdditionalUriParametersTypeImpl <em>Additional Uri Parameters Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.AdditionalUriParametersTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl#getAdditionalUriParametersType()
         * @generated
         */
        EClass ADDITIONAL_URI_PARAMETERS_TYPE = eINSTANCE.getAdditionalUriParametersType();

        /**
         * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADDITIONAL_URI_PARAMETERS_TYPE__PARAMETER = eINSTANCE.getAdditionalUriParametersType_Parameter();

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
         * The meta object literal for the '<em><b>Context Mapper</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASE_CAMEL_BINDING__CONTEXT_MAPPER = eINSTANCE.getBaseCamelBinding_ContextMapper();

        /**
         * The meta object literal for the '<em><b>Message Composer</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASE_CAMEL_BINDING__MESSAGE_COMPOSER = eINSTANCE.getBaseCamelBinding_MessageComposer();

        /**
         * The meta object literal for the '<em><b>Additional Uri Parameters</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASE_CAMEL_BINDING__ADDITIONAL_URI_PARAMETERS = eINSTANCE.getBaseCamelBinding_AdditionalUriParameters();

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
         * The meta object literal for the '<em><b>Ssl</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_BINDING_TYPE__SSL = eINSTANCE.getCamelNettyBindingType_Ssl();

        /**
         * The meta object literal for the '<em><b>Ssl Handler</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_BINDING_TYPE__SSL_HANDLER = eINSTANCE.getCamelNettyBindingType_SslHandler();

        /**
         * The meta object literal for the '<em><b>Need Client Auth</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_BINDING_TYPE__NEED_CLIENT_AUTH = eINSTANCE.getCamelNettyBindingType_NeedClientAuth();

        /**
         * The meta object literal for the '<em><b>Passphrase</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_BINDING_TYPE__PASSPHRASE = eINSTANCE.getCamelNettyBindingType_Passphrase();

        /**
         * The meta object literal for the '<em><b>Security Provider</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_BINDING_TYPE__SECURITY_PROVIDER = eINSTANCE.getCamelNettyBindingType_SecurityProvider();

        /**
         * The meta object literal for the '<em><b>Key Store Format</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_BINDING_TYPE__KEY_STORE_FORMAT = eINSTANCE.getCamelNettyBindingType_KeyStoreFormat();

        /**
         * The meta object literal for the '<em><b>Key Store File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_BINDING_TYPE__KEY_STORE_FILE = eINSTANCE.getCamelNettyBindingType_KeyStoreFile();

        /**
         * The meta object literal for the '<em><b>Trust Store File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_BINDING_TYPE__TRUST_STORE_FILE = eINSTANCE.getCamelNettyBindingType_TrustStoreFile();

        /**
         * The meta object literal for the '<em><b>Ssl Context Parameters Ref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_NETTY_BINDING_TYPE__SSL_CONTEXT_PARAMETERS_REF = eINSTANCE.getCamelNettyBindingType_SslContextParametersRef();

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
         * The meta object literal for the '<em><b>Binding Tcp</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_TCP = eINSTANCE.getDocumentRoot_BindingTcp();

        /**
         * The meta object literal for the '<em><b>Binding Udp</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_UDP = eINSTANCE.getDocumentRoot_BindingUdp();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.netty.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.ParameterTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl#getParameterType()
         * @generated
         */
        EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_TYPE__NAME = eINSTANCE.getParameterType_Name();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_TYPE__VALUE = eINSTANCE.getParameterType_Value();

    }

} //NettyPackage
