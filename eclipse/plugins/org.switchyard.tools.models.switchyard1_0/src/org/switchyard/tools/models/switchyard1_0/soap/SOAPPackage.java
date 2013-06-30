/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.soap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory
 * @model kind="package"
 * @generated
 */
public interface SOAPPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "soap";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-soap:config:1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "soap";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SOAPPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.ContextMapperTypeImpl <em>Context Mapper Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.ContextMapperTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getContextMapperType()
     * @generated
     */
    int CONTEXT_MAPPER_TYPE = 0;

    /**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_MAPPER_TYPE__CLASS = SwitchyardPackage.CONTEXT_MAPPER_TYPE__CLASS;

    /**
     * The feature id for the '<em><b>Exclude Namespaces</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_MAPPER_TYPE__EXCLUDE_NAMESPACES = SwitchyardPackage.CONTEXT_MAPPER_TYPE__EXCLUDE_NAMESPACES;

    /**
     * The feature id for the '<em><b>Excludes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_MAPPER_TYPE__EXCLUDES = SwitchyardPackage.CONTEXT_MAPPER_TYPE__EXCLUDES;

    /**
     * The feature id for the '<em><b>Include Namespaces</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_MAPPER_TYPE__INCLUDE_NAMESPACES = SwitchyardPackage.CONTEXT_MAPPER_TYPE__INCLUDE_NAMESPACES;

    /**
     * The feature id for the '<em><b>Includes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_MAPPER_TYPE__INCLUDES = SwitchyardPackage.CONTEXT_MAPPER_TYPE__INCLUDES;

    /**
     * The feature id for the '<em><b>Soap Headers Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_MAPPER_TYPE__SOAP_HEADERS_TYPE = SwitchyardPackage.CONTEXT_MAPPER_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Context Mapper Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_MAPPER_TYPE_FEATURE_COUNT = SwitchyardPackage.CONTEXT_MAPPER_TYPE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 1;

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
     * The feature id for the '<em><b>Binding Soap</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_SOAP = 3;

    /**
     * The feature id for the '<em><b>Interceptor</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INTERCEPTOR = 4;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROPERTIES = 5;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROPERTY = 6;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 7;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl <em>Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getSOAPBindingType()
     * @generated
     */
    int SOAP_BINDING_TYPE = 10;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.InterceptorTypeImpl <em>Interceptor Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.InterceptorTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getInterceptorType()
     * @generated
     */
    int INTERCEPTOR_TYPE = 4;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.MessageComposerTypeImpl <em>Message Composer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.MessageComposerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getMessageComposerType()
     * @generated
     */
    int MESSAGE_COMPOSER_TYPE = 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.InterceptorsTypeImpl <em>Interceptors Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.InterceptorsTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getInterceptorsType()
     * @generated
     */
    int INTERCEPTORS_TYPE = 3;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.MtomTypeImpl <em>Mtom Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.MtomTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getMtomType()
     * @generated
     */
    int MTOM_TYPE = 6;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.PropertyTypeImpl <em>Property Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.PropertyTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getPropertyType()
     * @generated
     */
    int PROPERTY_TYPE = 8;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.PropertiesTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getPropertiesType()
     * @generated
     */
    int PROPERTIES_TYPE = 7;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.EndpointConfigTypeImpl <em>Endpoint Config Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.EndpointConfigTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getEndpointConfigType()
     * @generated
     */
    int ENDPOINT_CONFIG_TYPE = 2;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT_CONFIG_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT_CONFIG_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Config File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT_CONFIG_TYPE__CONFIG_FILE = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Config Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT_CONFIG_TYPE__CONFIG_NAME = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Endpoint Config Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT_CONFIG_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERCEPTORS_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERCEPTORS_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Interceptor</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERCEPTORS_TYPE__INTERCEPTOR = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Interceptors Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERCEPTORS_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERCEPTOR_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERCEPTOR_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERCEPTOR_TYPE__PROPERTIES = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERCEPTOR_TYPE__CLASS = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Interceptor Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERCEPTOR_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_COMPOSER_TYPE__CLASS = SwitchyardPackage.MESSAGE_COMPOSER_TYPE__CLASS;

    /**
     * The feature id for the '<em><b>Unwrapped</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_COMPOSER_TYPE__UNWRAPPED = SwitchyardPackage.MESSAGE_COMPOSER_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Message Composer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_COMPOSER_TYPE_FEATURE_COUNT = SwitchyardPackage.MESSAGE_COMPOSER_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MTOM_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MTOM_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MTOM_TYPE__ENABLED = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Threshold</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MTOM_TYPE__THRESHOLD = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Xop Expand</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MTOM_TYPE__XOP_EXPAND = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Mtom Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MTOM_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_TYPE__PROPERTY = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Properties Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_TYPE__NAME = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_TYPE__VALUE = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Property Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.ProxyTypeImpl <em>Proxy Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.ProxyTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getProxyType()
     * @generated
     */
    int PROXY_TYPE = 9;

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
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROXY_TYPE__TYPE = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROXY_TYPE__HOST = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROXY_TYPE__PORT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>User</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROXY_TYPE__USER = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROXY_TYPE__PASSWORD = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Proxy Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROXY_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__DOCUMENTATION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__ANY_ATTRIBUTE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__WIRE_FORMAT_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__WIRE_FORMAT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__OPERATION_SELECTOR_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__OPERATION_SELECTOR = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__NAME = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__POLICY_SETS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__REQUIRES = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__URI = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Wsdl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__WSDL = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Wsdl Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__WSDL_PORT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Socket Addr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__SOCKET_ADDR = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Context Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__CONTEXT_PATH = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Endpoint Config</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__ENDPOINT_CONFIG = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Endpoint Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__ENDPOINT_ADDRESS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Proxy</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__PROXY = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Mtom</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__MTOM = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>In Interceptors</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__IN_INTERCEPTORS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Out Interceptors</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE__OUT_INTERCEPTORS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 11;

    /**
     * The number of structural features of the '<em>Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOAP_BINDING_TYPE_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 12;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType <em>Soap Headers Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getSoapHeadersType()
     * @generated
     */
    int SOAP_HEADERS_TYPE = 11;

    /**
     * The meta object id for the '<em>Soap Headers Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getSoapHeadersTypeObject()
     * @generated
     */
    int SOAP_HEADERS_TYPE_OBJECT = 12;

    /**
     * The meta object id for the '<em>Wsdl Port Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getWsdlPortType()
     * @generated
     */
    int WSDL_PORT_TYPE = 13;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.soap.ContextMapperType <em>Context Mapper Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Mapper Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.ContextMapperType
     * @generated
     */
    EClass getContextMapperType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.soap.ContextMapperType#getSoapHeadersType <em>Soap Headers Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Soap Headers Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.ContextMapperType#getSoapHeadersType()
     * @see #getContextMapperType()
     * @generated
     */
    EAttribute getContextMapperType_SoapHeadersType();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getBindingSoap <em>Binding Soap</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Soap</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getBindingSoap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingSoap();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getInterceptor <em>Interceptor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Interceptor</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getInterceptor()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Interceptor();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Properties</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getProperties()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Properties();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getProperty()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Property();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType <em>Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType
     * @generated
     */
    EClass getSOAPBindingType();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getContextMapper <em>Context Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Context Mapper</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getContextMapper()
     * @see #getSOAPBindingType()
     * @generated
     */
    EReference getSOAPBindingType_ContextMapper();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getMessageComposer <em>Message Composer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Message Composer</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getMessageComposer()
     * @see #getSOAPBindingType()
     * @generated
     */
    EReference getSOAPBindingType_MessageComposer();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getWsdl <em>Wsdl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Wsdl</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getWsdl()
     * @see #getSOAPBindingType()
     * @generated
     */
    EAttribute getSOAPBindingType_Wsdl();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getWsdlPort <em>Wsdl Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Wsdl Port</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getWsdlPort()
     * @see #getSOAPBindingType()
     * @generated
     */
    EAttribute getSOAPBindingType_WsdlPort();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getSocketAddr <em>Socket Addr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Socket Addr</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getSocketAddr()
     * @see #getSOAPBindingType()
     * @generated
     */
    EAttribute getSOAPBindingType_SocketAddr();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getContextPath <em>Context Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Context Path</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getContextPath()
     * @see #getSOAPBindingType()
     * @generated
     */
    EAttribute getSOAPBindingType_ContextPath();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getEndpointAddress <em>Endpoint Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Endpoint Address</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getEndpointAddress()
     * @see #getSOAPBindingType()
     * @generated
     */
    EAttribute getSOAPBindingType_EndpointAddress();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getInInterceptors <em>In Interceptors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>In Interceptors</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getInInterceptors()
     * @see #getSOAPBindingType()
     * @generated
     */
    EReference getSOAPBindingType_InInterceptors();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getOutInterceptors <em>Out Interceptors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Out Interceptors</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getOutInterceptors()
     * @see #getSOAPBindingType()
     * @generated
     */
    EReference getSOAPBindingType_OutInterceptors();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getMtom <em>Mtom</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Mtom</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getMtom()
     * @see #getSOAPBindingType()
     * @generated
     */
    EReference getSOAPBindingType_Mtom();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getEndpointConfig <em>Endpoint Config</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Endpoint Config</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getEndpointConfig()
     * @see #getSOAPBindingType()
     * @generated
     */
    EReference getSOAPBindingType_EndpointConfig();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getProxy <em>Proxy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Proxy</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getProxy()
     * @see #getSOAPBindingType()
     * @generated
     */
    EReference getSOAPBindingType_Proxy();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.soap.InterceptorType <em>Interceptor Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interceptor Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.InterceptorType
     * @generated
     */
    EClass getInterceptorType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.soap.InterceptorType#getClass_ <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.InterceptorType#getClass_()
     * @see #getInterceptorType()
     * @generated
     */
    EAttribute getInterceptorType_Class();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType <em>Message Composer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Message Composer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType
     * @generated
     */
    EClass getMessageComposerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType#isUnwrapped <em>Unwrapped</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unwrapped</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType#isUnwrapped()
     * @see #getMessageComposerType()
     * @generated
     */
    EAttribute getMessageComposerType_Unwrapped();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.soap.InterceptorType#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Properties</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.InterceptorType#getProperties()
     * @see #getInterceptorType()
     * @generated
     */
    EReference getInterceptorType_Properties();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.soap.InterceptorsType <em>Interceptors Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interceptors Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.InterceptorsType
     * @generated
     */
    EClass getInterceptorsType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.soap.InterceptorsType#getInterceptor <em>Interceptor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Interceptor</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.InterceptorsType#getInterceptor()
     * @see #getInterceptorsType()
     * @generated
     */
    EReference getInterceptorsType_Interceptor();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType <em>Mtom Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mtom Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.MtomType
     * @generated
     */
    EClass getMtomType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#isEnabled <em>Enabled</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Enabled</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.MtomType#isEnabled()
     * @see #getMtomType()
     * @generated
     */
    EAttribute getMtomType_Enabled();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#getThreshold <em>Threshold</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Threshold</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.MtomType#getThreshold()
     * @see #getMtomType()
     * @generated
     */
    EAttribute getMtomType_Threshold();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.soap.MtomType#isXopExpand <em>Xop Expand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xop Expand</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.MtomType#isXopExpand()
     * @see #getMtomType()
     * @generated
     */
    EAttribute getMtomType_XopExpand();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.soap.PropertyType <em>Property Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.PropertyType
     * @generated
     */
    EClass getPropertyType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.soap.PropertyType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.PropertyType#getName()
     * @see #getPropertyType()
     * @generated
     */
    EAttribute getPropertyType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.soap.PropertyType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.PropertyType#getValue()
     * @see #getPropertyType()
     * @generated
     */
    EAttribute getPropertyType_Value();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.soap.PropertiesType <em>Properties Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Properties Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.PropertiesType
     * @generated
     */
    EClass getPropertiesType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.soap.PropertiesType#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.PropertiesType#getProperty()
     * @see #getPropertiesType()
     * @generated
     */
    EReference getPropertiesType_Property();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.soap.EndpointConfigType <em>Endpoint Config Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Endpoint Config Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.EndpointConfigType
     * @generated
     */
    EClass getEndpointConfigType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.soap.EndpointConfigType#getConfigFile <em>Config File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Config File</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.EndpointConfigType#getConfigFile()
     * @see #getEndpointConfigType()
     * @generated
     */
    EAttribute getEndpointConfigType_ConfigFile();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.soap.EndpointConfigType#getConfigName <em>Config Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Config Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.EndpointConfigType#getConfigName()
     * @see #getEndpointConfigType()
     * @generated
     */
    EAttribute getEndpointConfigType_ConfigName();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.soap.ProxyType <em>Proxy Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Proxy Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.ProxyType
     * @generated
     */
    EClass getProxyType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.soap.ProxyType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.ProxyType#getType()
     * @see #getProxyType()
     * @generated
     */
    EAttribute getProxyType_Type();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.soap.ProxyType#getHost <em>Host</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Host</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.ProxyType#getHost()
     * @see #getProxyType()
     * @generated
     */
    EAttribute getProxyType_Host();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.soap.ProxyType#getPort <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Port</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.ProxyType#getPort()
     * @see #getProxyType()
     * @generated
     */
    EAttribute getProxyType_Port();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.soap.ProxyType#getUser <em>User</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>User</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.ProxyType#getUser()
     * @see #getProxyType()
     * @generated
     */
    EAttribute getProxyType_User();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.soap.ProxyType#getPassword <em>Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.ProxyType#getPassword()
     * @see #getProxyType()
     * @generated
     */
    EAttribute getProxyType_Password();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType <em>Soap Headers Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Soap Headers Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType
     * @generated
     */
    EEnum getSoapHeadersType();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType <em>Soap Headers Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Soap Headers Type Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType"
     *        extendedMetaData="name='soapHeadersType:Object' baseType='soapHeadersType'"
     * @generated
     */
    EDataType getSoapHeadersTypeObject();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Wsdl Port Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Wsdl Port Type</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='wsdlPortType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='\\{.+\\}.+:[^:]+|.+:[^:]+|[^:]+'"
     * @generated
     */
    EDataType getWsdlPortType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SOAPFactory getSOAPFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.ContextMapperTypeImpl <em>Context Mapper Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.ContextMapperTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getContextMapperType()
         * @generated
         */
        EClass CONTEXT_MAPPER_TYPE = eINSTANCE.getContextMapperType();

        /**
         * The meta object literal for the '<em><b>Soap Headers Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_MAPPER_TYPE__SOAP_HEADERS_TYPE = eINSTANCE.getContextMapperType_SoapHeadersType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Binding Soap</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_SOAP = eINSTANCE.getDocumentRoot_BindingSoap();

        /**
         * The meta object literal for the '<em><b>Interceptor</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__INTERCEPTOR = eINSTANCE.getDocumentRoot_Interceptor();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PROPERTIES = eINSTANCE.getDocumentRoot_Properties();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PROPERTY = eINSTANCE.getDocumentRoot_Property();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl <em>Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getSOAPBindingType()
         * @generated
         */
        EClass SOAP_BINDING_TYPE = eINSTANCE.getSOAPBindingType();

        /**
         * The meta object literal for the '<em><b>Context Mapper</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOAP_BINDING_TYPE__CONTEXT_MAPPER = eINSTANCE.getSOAPBindingType_ContextMapper();

        /**
         * The meta object literal for the '<em><b>Message Composer</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOAP_BINDING_TYPE__MESSAGE_COMPOSER = eINSTANCE.getSOAPBindingType_MessageComposer();

        /**
         * The meta object literal for the '<em><b>Wsdl</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOAP_BINDING_TYPE__WSDL = eINSTANCE.getSOAPBindingType_Wsdl();

        /**
         * The meta object literal for the '<em><b>Wsdl Port</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOAP_BINDING_TYPE__WSDL_PORT = eINSTANCE.getSOAPBindingType_WsdlPort();

        /**
         * The meta object literal for the '<em><b>Socket Addr</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOAP_BINDING_TYPE__SOCKET_ADDR = eINSTANCE.getSOAPBindingType_SocketAddr();

        /**
         * The meta object literal for the '<em><b>Context Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOAP_BINDING_TYPE__CONTEXT_PATH = eINSTANCE.getSOAPBindingType_ContextPath();

        /**
         * The meta object literal for the '<em><b>Endpoint Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOAP_BINDING_TYPE__ENDPOINT_ADDRESS = eINSTANCE.getSOAPBindingType_EndpointAddress();

        /**
         * The meta object literal for the '<em><b>In Interceptors</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOAP_BINDING_TYPE__IN_INTERCEPTORS = eINSTANCE.getSOAPBindingType_InInterceptors();

        /**
         * The meta object literal for the '<em><b>Out Interceptors</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOAP_BINDING_TYPE__OUT_INTERCEPTORS = eINSTANCE.getSOAPBindingType_OutInterceptors();

        /**
         * The meta object literal for the '<em><b>Mtom</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOAP_BINDING_TYPE__MTOM = eINSTANCE.getSOAPBindingType_Mtom();

        /**
         * The meta object literal for the '<em><b>Endpoint Config</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOAP_BINDING_TYPE__ENDPOINT_CONFIG = eINSTANCE.getSOAPBindingType_EndpointConfig();

        /**
         * The meta object literal for the '<em><b>Proxy</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOAP_BINDING_TYPE__PROXY = eINSTANCE.getSOAPBindingType_Proxy();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.InterceptorTypeImpl <em>Interceptor Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.InterceptorTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getInterceptorType()
         * @generated
         */
        EClass INTERCEPTOR_TYPE = eINSTANCE.getInterceptorType();

        /**
         * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERCEPTOR_TYPE__CLASS = eINSTANCE.getInterceptorType_Class();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.MessageComposerTypeImpl <em>Message Composer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.MessageComposerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getMessageComposerType()
         * @generated
         */
        EClass MESSAGE_COMPOSER_TYPE = eINSTANCE.getMessageComposerType();

        /**
         * The meta object literal for the '<em><b>Unwrapped</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MESSAGE_COMPOSER_TYPE__UNWRAPPED = eINSTANCE.getMessageComposerType_Unwrapped();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERCEPTOR_TYPE__PROPERTIES = eINSTANCE.getInterceptorType_Properties();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.InterceptorsTypeImpl <em>Interceptors Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.InterceptorsTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getInterceptorsType()
         * @generated
         */
        EClass INTERCEPTORS_TYPE = eINSTANCE.getInterceptorsType();

        /**
         * The meta object literal for the '<em><b>Interceptor</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERCEPTORS_TYPE__INTERCEPTOR = eINSTANCE.getInterceptorsType_Interceptor();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.MtomTypeImpl <em>Mtom Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.MtomTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getMtomType()
         * @generated
         */
        EClass MTOM_TYPE = eINSTANCE.getMtomType();

        /**
         * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MTOM_TYPE__ENABLED = eINSTANCE.getMtomType_Enabled();

        /**
         * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MTOM_TYPE__THRESHOLD = eINSTANCE.getMtomType_Threshold();

        /**
         * The meta object literal for the '<em><b>Xop Expand</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MTOM_TYPE__XOP_EXPAND = eINSTANCE.getMtomType_XopExpand();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.PropertyTypeImpl <em>Property Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.PropertyTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getPropertyType()
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

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.PropertiesTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getPropertiesType()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.EndpointConfigTypeImpl <em>Endpoint Config Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.EndpointConfigTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getEndpointConfigType()
         * @generated
         */
        EClass ENDPOINT_CONFIG_TYPE = eINSTANCE.getEndpointConfigType();

        /**
         * The meta object literal for the '<em><b>Config File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENDPOINT_CONFIG_TYPE__CONFIG_FILE = eINSTANCE.getEndpointConfigType_ConfigFile();

        /**
         * The meta object literal for the '<em><b>Config Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENDPOINT_CONFIG_TYPE__CONFIG_NAME = eINSTANCE.getEndpointConfigType_ConfigName();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.ProxyTypeImpl <em>Proxy Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.ProxyTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getProxyType()
         * @generated
         */
        EClass PROXY_TYPE = eINSTANCE.getProxyType();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROXY_TYPE__TYPE = eINSTANCE.getProxyType_Type();

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

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType <em>Soap Headers Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getSoapHeadersType()
         * @generated
         */
        EEnum SOAP_HEADERS_TYPE = eINSTANCE.getSoapHeadersType();

        /**
         * The meta object literal for the '<em>Soap Headers Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getSoapHeadersTypeObject()
         * @generated
         */
        EDataType SOAP_HEADERS_TYPE_OBJECT = eINSTANCE.getSoapHeadersTypeObject();

        /**
         * The meta object literal for the '<em>Wsdl Port Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getWsdlPortType()
         * @generated
         */
        EDataType WSDL_PORT_TYPE = eINSTANCE.getWsdlPortType();

    }

} //SOAPPackage
