/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.rules;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

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
 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesFactory
 * @model kind="package"
 * @generated
 */
public interface RulesPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "rules";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "urn:switchyard-component-rules:config:2.0";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "rules";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	RulesPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl.init();

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.OperationsTypeImpl <em>Operations Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.OperationsTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getOperationsType()
     * @generated
     */
    int OPERATIONS_TYPE = 0;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATIONS_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATIONS_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Operation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATIONS_TYPE__OPERATION = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Operations Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATIONS_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesOperationTypeImpl <em>Operation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesOperationTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getRulesOperationType()
     * @generated
     */
    int RULES_OPERATION_TYPE = 1;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_OPERATION_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_OPERATION_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Globals</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_OPERATION_TYPE__GLOBALS = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Inputs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_OPERATION_TYPE__INPUTS = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Outputs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_OPERATION_TYPE__OUTPUTS = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Faults</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_OPERATION_TYPE__FAULTS = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Event Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_OPERATION_TYPE__EVENT_ID = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_OPERATION_TYPE__NAME = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_OPERATION_TYPE__TYPE = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Operation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_OPERATION_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 7;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ChannelsTypeImpl <em>Channels Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ChannelsTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getChannelsType()
     * @generated
     */
    int CHANNELS_TYPE = 2;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANNELS_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANNELS_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Channel</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANNELS_TYPE__CHANNEL = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Channels Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANNELS_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ChannelTypeImpl <em>Channel Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ChannelTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getChannelType()
     * @generated
     */
	int CHANNEL_TYPE = 3;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANNEL_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANNEL_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANNEL_TYPE__CLASS = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANNEL_TYPE__NAME = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANNEL_TYPE__OPERATION = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANNEL_TYPE__REFERENCE = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Channel Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHANNEL_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ContainerTypeImpl <em>Container Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ContainerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getContainerType()
     * @generated
     */
    int CONTAINER_TYPE = 4;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Base Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER_TYPE__BASE_NAME = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Release Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER_TYPE__RELEASE_ID = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Scan</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER_TYPE__SCAN = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Scan Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER_TYPE__SCAN_INTERVAL = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Session Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER_TYPE__SESSION_NAME = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Container Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getDocumentRoot()
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
     * The feature id for the '<em><b>Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OPERATION = 3;

    /**
     * The feature id for the '<em><b>Operations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OPERATIONS = 4;

    /**
     * The feature id for the '<em><b>Channel</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__CHANNEL = 5;

	/**
     * The feature id for the '<em><b>Channels</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CHANNELS = 6;

    /**
     * The feature id for the '<em><b>Container</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONTAINER = 7;

    /**
     * The feature id for the '<em><b>Global</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GLOBAL = 8;

    /**
     * The feature id for the '<em><b>Globals</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GLOBALS = 9;

    /**
     * The feature id for the '<em><b>Implementation Rules</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPLEMENTATION_RULES = 10;

	/**
     * The feature id for the '<em><b>Input</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INPUT = 11;

    /**
     * The feature id for the '<em><b>Inputs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INPUTS = 12;

    /**
     * The feature id for the '<em><b>Listener</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LISTENER = 13;

    /**
     * The feature id for the '<em><b>Listeners</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LISTENERS = 14;

    /**
     * The feature id for the '<em><b>Logger</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LOGGER = 15;

    /**
     * The feature id for the '<em><b>Loggers</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LOGGERS = 16;

    /**
     * The feature id for the '<em><b>Manifest</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MANIFEST = 17;

    /**
     * The feature id for the '<em><b>Output</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OUTPUT = 18;

    /**
     * The feature id for the '<em><b>Outputs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OUTPUTS = 19;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROPERTIES = 20;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROPERTY = 21;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__RESOURCE = 22;

	/**
     * The feature id for the '<em><b>Resource Detail</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__RESOURCE_DETAIL = 23;

    /**
     * The feature id for the '<em><b>Resources</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__RESOURCES = 24;

    /**
     * The feature id for the '<em><b>Fault</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FAULT = 25;

    /**
     * The feature id for the '<em><b>Faults</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FAULTS = 26;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT_FEATURE_COUNT = 27;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.GlobalsTypeImpl <em>Globals Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.GlobalsTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getGlobalsType()
     * @generated
     */
    int GLOBALS_TYPE = 6;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBALS_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBALS_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Global</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBALS_TYPE__GLOBAL = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Globals Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBALS_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.InputsTypeImpl <em>Inputs Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.InputsTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getInputsType()
     * @generated
     */
    int INPUTS_TYPE = 7;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUTS_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUTS_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Input</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUTS_TYPE__INPUT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Inputs Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUTS_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ListenersTypeImpl <em>Listeners Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ListenersTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getListenersType()
     * @generated
     */
    int LISTENERS_TYPE = 8;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LISTENERS_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LISTENERS_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Listener</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LISTENERS_TYPE__LISTENER = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Listeners Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LISTENERS_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ListenerTypeImpl <em>Listener Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ListenerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getListenerType()
     * @generated
     */
    int LISTENER_TYPE = 9;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LISTENER_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LISTENER_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LISTENER_TYPE__CLASS = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Listener Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LISTENER_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.LoggersTypeImpl <em>Loggers Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.LoggersTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getLoggersType()
     * @generated
     */
    int LOGGERS_TYPE = 10;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGGERS_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGGERS_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Logger</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGGERS_TYPE__LOGGER = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Loggers Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGGERS_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.LoggerType1Impl <em>Logger Type1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.LoggerType1Impl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getLoggerType1()
     * @generated
     */
    int LOGGER_TYPE1 = 11;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGGER_TYPE1__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGGER_TYPE1__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGGER_TYPE1__INTERVAL = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Log</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGGER_TYPE1__LOG = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGGER_TYPE1__TYPE = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Logger Type1</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGGER_TYPE1_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ManifestTypeImpl <em>Manifest Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ManifestTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getManifestType()
     * @generated
     */
    int MANIFEST_TYPE = 12;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFEST_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFEST_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Container</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFEST_TYPE__CONTAINER = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Resources</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFEST_TYPE__RESOURCES = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Remote Jms</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFEST_TYPE__REMOTE_JMS = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Remote Rest</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFEST_TYPE__REMOTE_REST = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Manifest Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFEST_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.MappingTypeImpl <em>Mapping Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.MappingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getMappingType()
     * @generated
     */
    int MAPPING_TYPE = 13;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__FROM = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__TO = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Mapping Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.OutputsTypeImpl <em>Outputs Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.OutputsTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getOutputsType()
     * @generated
     */
    int OUTPUTS_TYPE = 14;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUTS_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUTS_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Output</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUTS_TYPE__OUTPUT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Outputs Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUTS_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.PropertiesTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getPropertiesType()
     * @generated
     */
    int PROPERTIES_TYPE = 15;

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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.PropertyTypeImpl <em>Property Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.PropertyTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getPropertyType()
     * @generated
     */
    int PROPERTY_TYPE = 16;

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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ResourceDetailTypeImpl <em>Resource Detail Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ResourceDetailTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getResourceDetailType()
     * @generated
     */
    int RESOURCE_DETAIL_TYPE = 17;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_DETAIL_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_DETAIL_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Input Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_DETAIL_TYPE__INPUT_TYPE = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Using External Types</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_DETAIL_TYPE__USING_EXTERNAL_TYPES = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Worksheet Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_DETAIL_TYPE__WORKSHEET_NAME = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Resource Detail Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_DETAIL_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ResourcesTypeImpl <em>Resources Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ResourcesTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getResourcesType()
     * @generated
     */
    int RESOURCES_TYPE = 18;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCES_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCES_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCES_TYPE__RESOURCE = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Resources Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCES_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ResourceTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getResourceType()
     * @generated
     */
	int RESOURCE_TYPE = 19;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Resource Detail</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE__RESOURCE_DETAIL = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE__LOCATION = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE__TYPE = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Resource Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesImplementationTypeImpl <em>Implementation Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesImplementationTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getRulesImplementationType()
     * @generated
     */
	int RULES_IMPLEMENTATION_TYPE = 20;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RULES_IMPLEMENTATION_TYPE__DOCUMENTATION = ScaPackage.IMPLEMENTATION__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RULES_IMPLEMENTATION_TYPE__ANY_ATTRIBUTE = ScaPackage.IMPLEMENTATION__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RULES_IMPLEMENTATION_TYPE__POLICY_SETS = ScaPackage.IMPLEMENTATION__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RULES_IMPLEMENTATION_TYPE__REQUIRES = ScaPackage.IMPLEMENTATION__REQUIRES;

	/**
     * The feature id for the '<em><b>Channels</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_IMPLEMENTATION_TYPE__CHANNELS = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Listeners</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_IMPLEMENTATION_TYPE__LISTENERS = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Loggers</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_IMPLEMENTATION_TYPE__LOGGERS = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Manifest</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_IMPLEMENTATION_TYPE__MANIFEST = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Operations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_IMPLEMENTATION_TYPE__OPERATIONS = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_IMPLEMENTATION_TYPE__PROPERTIES = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Implementation Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RULES_IMPLEMENTATION_TYPE_FEATURE_COUNT = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 6;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.FaultsTypeImpl <em>Faults Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.FaultsTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getFaultsType()
     * @generated
     */
    int FAULTS_TYPE = 21;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAULTS_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAULTS_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Fault</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAULTS_TYPE__FAULT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Faults Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAULTS_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RemoteTypeImpl <em>Remote Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RemoteTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getRemoteType()
     * @generated
     */
    int REMOTE_TYPE = 22;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Deployment Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_TYPE__DEPLOYMENT_ID = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Extra Jaxb Classes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_TYPE__EXTRA_JAXB_CLASSES = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_TYPE__PASSWORD = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_TYPE__TIMEOUT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>User Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_TYPE__USER_NAME = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Remote Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RemoteJmsTypeImpl <em>Remote Jms Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RemoteJmsTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getRemoteJmsType()
     * @generated
     */
    int REMOTE_JMS_TYPE = 23;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_JMS_TYPE__DOCUMENTATION = REMOTE_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_JMS_TYPE__ANY_ATTRIBUTE = REMOTE_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Deployment Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_JMS_TYPE__DEPLOYMENT_ID = REMOTE_TYPE__DEPLOYMENT_ID;

    /**
     * The feature id for the '<em><b>Extra Jaxb Classes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_JMS_TYPE__EXTRA_JAXB_CLASSES = REMOTE_TYPE__EXTRA_JAXB_CLASSES;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_JMS_TYPE__PASSWORD = REMOTE_TYPE__PASSWORD;

    /**
     * The feature id for the '<em><b>Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_JMS_TYPE__TIMEOUT = REMOTE_TYPE__TIMEOUT;

    /**
     * The feature id for the '<em><b>User Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_JMS_TYPE__USER_NAME = REMOTE_TYPE__USER_NAME;

    /**
     * The feature id for the '<em><b>Host Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_JMS_TYPE__HOST_NAME = REMOTE_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Keystore Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_JMS_TYPE__KEYSTORE_LOCATION = REMOTE_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Keystore Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_JMS_TYPE__KEYSTORE_PASSWORD = REMOTE_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Remoting Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_JMS_TYPE__REMOTING_PORT = REMOTE_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Messaging Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_JMS_TYPE__MESSAGING_PORT = REMOTE_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Truststore Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_JMS_TYPE__TRUSTSTORE_LOCATION = REMOTE_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Truststore Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_JMS_TYPE__TRUSTSTORE_PASSWORD = REMOTE_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Use Ssl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_JMS_TYPE__USE_SSL = REMOTE_TYPE_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Remote Jms Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_JMS_TYPE_FEATURE_COUNT = REMOTE_TYPE_FEATURE_COUNT + 8;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RemoteRestTypeImpl <em>Remote Rest Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RemoteRestTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getRemoteRestType()
     * @generated
     */
    int REMOTE_REST_TYPE = 24;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_REST_TYPE__DOCUMENTATION = REMOTE_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_REST_TYPE__ANY_ATTRIBUTE = REMOTE_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Deployment Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_REST_TYPE__DEPLOYMENT_ID = REMOTE_TYPE__DEPLOYMENT_ID;

    /**
     * The feature id for the '<em><b>Extra Jaxb Classes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_REST_TYPE__EXTRA_JAXB_CLASSES = REMOTE_TYPE__EXTRA_JAXB_CLASSES;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_REST_TYPE__PASSWORD = REMOTE_TYPE__PASSWORD;

    /**
     * The feature id for the '<em><b>Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_REST_TYPE__TIMEOUT = REMOTE_TYPE__TIMEOUT;

    /**
     * The feature id for the '<em><b>User Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_REST_TYPE__USER_NAME = REMOTE_TYPE__USER_NAME;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_REST_TYPE__URL = REMOTE_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Use Form Based Auth</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_REST_TYPE__USE_FORM_BASED_AUTH = REMOTE_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Remote Rest Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_REST_TYPE_FEATURE_COUNT = REMOTE_TYPE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ExtraJaxbClassesTypeImpl <em>Extra Jaxb Classes Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ExtraJaxbClassesTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getExtraJaxbClassesType()
     * @generated
     */
    int EXTRA_JAXB_CLASSES_TYPE = 25;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTRA_JAXB_CLASSES_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTRA_JAXB_CLASSES_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Extra Jaxb Class</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTRA_JAXB_CLASSES_TYPE__EXTRA_JAXB_CLASS = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Extra Jaxb Classes Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTRA_JAXB_CLASSES_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.OperationType <em>Operation Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.OperationType
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getOperationType()
     * @generated
     */
    int OPERATION_TYPE = 26;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.ExpressionType <em>Expression Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.ExpressionType
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getExpressionType()
     * @generated
     */
    int EXPRESSION_TYPE = 27;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.LoggerType <em>Logger Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.LoggerType
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getLoggerType()
     * @generated
     */
    int LOGGER_TYPE = 28;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.ScopeType <em>Scope Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.ScopeType
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getScopeType()
     * @generated
     */
    int SCOPE_TYPE = 29;

    /**
     * The meta object id for the '<em>Operation Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.OperationType
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getOperationTypeObject()
     * @generated
     */
    int OPERATION_TYPE_OBJECT = 30;

    /**
     * The meta object id for the '<em>Expression Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.ExpressionType
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getExpressionTypeObject()
     * @generated
     */
    int EXPRESSION_TYPE_OBJECT = 31;

    /**
     * The meta object id for the '<em>Logger Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.LoggerType
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getLoggerTypeObject()
     * @generated
     */
    int LOGGER_TYPE_OBJECT = 32;

    /**
     * The meta object id for the '<em>Scope Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.ScopeType
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getScopeTypeObject()
     * @generated
     */
    int SCOPE_TYPE_OBJECT = 33;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.OperationsType <em>Operations Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operations Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.OperationsType
     * @generated
     */
    EClass getOperationsType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.rules.OperationsType#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Operation</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.OperationsType#getOperation()
     * @see #getOperationsType()
     * @generated
     */
    EReference getOperationsType_Operation();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType <em>Operation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operation Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType
     * @generated
     */
    EClass getRulesOperationType();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getGlobals <em>Globals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Globals</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getGlobals()
     * @see #getRulesOperationType()
     * @generated
     */
    EReference getRulesOperationType_Globals();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getInputs <em>Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Inputs</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getInputs()
     * @see #getRulesOperationType()
     * @generated
     */
    EReference getRulesOperationType_Inputs();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getOutputs <em>Outputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Outputs</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getOutputs()
     * @see #getRulesOperationType()
     * @generated
     */
    EReference getRulesOperationType_Outputs();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getFaults <em>Faults</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Faults</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getFaults()
     * @see #getRulesOperationType()
     * @generated
     */
    EReference getRulesOperationType_Faults();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getEventId <em>Event Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Event Id</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getEventId()
     * @see #getRulesOperationType()
     * @generated
     */
    EAttribute getRulesOperationType_EventId();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getName()
     * @see #getRulesOperationType()
     * @generated
     */
    EAttribute getRulesOperationType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType#getType()
     * @see #getRulesOperationType()
     * @generated
     */
    EAttribute getRulesOperationType_Type();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelsType <em>Channels Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Channels Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ChannelsType
     * @generated
     */
    EClass getChannelsType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelsType#getChannel <em>Channel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Channel</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ChannelsType#getChannel()
     * @see #getChannelsType()
     * @generated
     */
    EReference getChannelsType_Channel();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType <em>Channel Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Channel Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ChannelType
     * @generated
     */
	EClass getChannelType();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getClass_ <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getClass_()
     * @see #getChannelType()
     * @generated
     */
    EAttribute getChannelType_Class();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getName()
     * @see #getChannelType()
     * @generated
     */
    EAttribute getChannelType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getOperation()
     * @see #getChannelType()
     * @generated
     */
    EAttribute getChannelType_Operation();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getReference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reference</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getReference()
     * @see #getChannelType()
     * @generated
     */
    EAttribute getChannelType_Reference();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.ContainerType <em>Container Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Container Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ContainerType
     * @generated
     */
    EClass getContainerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ContainerType#getBaseName <em>Base Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Base Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ContainerType#getBaseName()
     * @see #getContainerType()
     * @generated
     */
    EAttribute getContainerType_BaseName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ContainerType#getReleaseId <em>Release Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Release Id</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ContainerType#getReleaseId()
     * @see #getContainerType()
     * @generated
     */
    EAttribute getContainerType_ReleaseId();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ContainerType#isScan <em>Scan</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scan</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ContainerType#isScan()
     * @see #getContainerType()
     * @generated
     */
    EAttribute getContainerType_Scan();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ContainerType#getScanInterval <em>Scan Interval</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scan Interval</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ContainerType#getScanInterval()
     * @see #getContainerType()
     * @generated
     */
    EAttribute getContainerType_ScanInterval();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ContainerType#getSessionName <em>Session Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Session Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ContainerType#getSessionName()
     * @see #getContainerType()
     * @generated
     */
    EAttribute getContainerType_SessionName();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot
     * @generated
     */
	EClass getDocumentRoot();

	/**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
	EAttribute getDocumentRoot_Mixed();

	/**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operation</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getOperation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Operation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getOperations <em>Operations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operations</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getOperations()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Operations();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getChannel <em>Channel</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Channel</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getChannel()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Channel();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getChannels <em>Channels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Channels</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getChannels()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Channels();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getContainer <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Container</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getContainer()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Container();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getGlobal <em>Global</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Global</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getGlobal()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Global();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getGlobals <em>Globals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Globals</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getGlobals()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Globals();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getImplementationRules <em>Implementation Rules</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Implementation Rules</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getImplementationRules()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ImplementationRules();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Input</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getInput()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Input();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getInputs <em>Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Inputs</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getInputs()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Inputs();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getListener <em>Listener</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Listener</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getListener()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Listener();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getListeners <em>Listeners</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Listeners</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getListeners()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Listeners();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getLogger <em>Logger</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Logger</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getLogger()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Logger();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getLoggers <em>Loggers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Loggers</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getLoggers()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Loggers();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getManifest <em>Manifest</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Manifest</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getManifest()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Manifest();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getOutput <em>Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Output</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getOutput()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Output();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getOutputs <em>Outputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Outputs</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getOutputs()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Outputs();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Properties</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getProperties()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Properties();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getProperty()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Property();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resource</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getResource()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Resource();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getResourceDetail <em>Resource Detail</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resource Detail</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getResourceDetail()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ResourceDetail();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getResources <em>Resources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resources</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getResources()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Resources();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getFault <em>Fault</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Fault</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getFault()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Fault();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getFaults <em>Faults</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Faults</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getFaults()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Faults();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.GlobalsType <em>Globals Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Globals Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.GlobalsType
     * @generated
     */
    EClass getGlobalsType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.rules.GlobalsType#getGlobal <em>Global</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Global</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.GlobalsType#getGlobal()
     * @see #getGlobalsType()
     * @generated
     */
    EReference getGlobalsType_Global();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.InputsType <em>Inputs Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Inputs Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.InputsType
     * @generated
     */
    EClass getInputsType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.rules.InputsType#getInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Input</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.InputsType#getInput()
     * @see #getInputsType()
     * @generated
     */
    EReference getInputsType_Input();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.ListenersType <em>Listeners Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Listeners Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ListenersType
     * @generated
     */
    EClass getListenersType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.rules.ListenersType#getListener <em>Listener</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Listener</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ListenersType#getListener()
     * @see #getListenersType()
     * @generated
     */
    EReference getListenersType_Listener();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.ListenerType <em>Listener Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Listener Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ListenerType
     * @generated
     */
    EClass getListenerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ListenerType#getClass_ <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ListenerType#getClass_()
     * @see #getListenerType()
     * @generated
     */
    EAttribute getListenerType_Class();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.LoggersType <em>Loggers Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Loggers Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.LoggersType
     * @generated
     */
    EClass getLoggersType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.rules.LoggersType#getLogger <em>Logger</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Logger</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.LoggersType#getLogger()
     * @see #getLoggersType()
     * @generated
     */
    EReference getLoggersType_Logger();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.LoggerType1 <em>Logger Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Logger Type1</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.LoggerType1
     * @generated
     */
    EClass getLoggerType1();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.LoggerType1#getInterval <em>Interval</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Interval</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.LoggerType1#getInterval()
     * @see #getLoggerType1()
     * @generated
     */
    EAttribute getLoggerType1_Interval();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.LoggerType1#getLog <em>Log</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Log</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.LoggerType1#getLog()
     * @see #getLoggerType1()
     * @generated
     */
    EAttribute getLoggerType1_Log();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.LoggerType1#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.LoggerType1#getType()
     * @see #getLoggerType1()
     * @generated
     */
    EAttribute getLoggerType1_Type();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.ManifestType <em>Manifest Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Manifest Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ManifestType
     * @generated
     */
    EClass getManifestType();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.ManifestType#getContainer <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Container</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ManifestType#getContainer()
     * @see #getManifestType()
     * @generated
     */
    EReference getManifestType_Container();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.ManifestType#getResources <em>Resources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resources</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ManifestType#getResources()
     * @see #getManifestType()
     * @generated
     */
    EReference getManifestType_Resources();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.ManifestType#getRemoteJms <em>Remote Jms</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Remote Jms</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ManifestType#getRemoteJms()
     * @see #getManifestType()
     * @generated
     */
    EReference getManifestType_RemoteJms();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.ManifestType#getRemoteRest <em>Remote Rest</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Remote Rest</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ManifestType#getRemoteRest()
     * @see #getManifestType()
     * @generated
     */
    EReference getManifestType_RemoteRest();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.MappingType <em>Mapping Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mapping Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.MappingType
     * @generated
     */
    EClass getMappingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.MappingType#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>From</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.MappingType#getFrom()
     * @see #getMappingType()
     * @generated
     */
    EAttribute getMappingType_From();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.MappingType#getTo <em>To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>To</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.MappingType#getTo()
     * @see #getMappingType()
     * @generated
     */
    EAttribute getMappingType_To();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.OutputsType <em>Outputs Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Outputs Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.OutputsType
     * @generated
     */
    EClass getOutputsType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.rules.OutputsType#getOutput <em>Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Output</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.OutputsType#getOutput()
     * @see #getOutputsType()
     * @generated
     */
    EReference getOutputsType_Output();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.PropertiesType <em>Properties Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Properties Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.PropertiesType
     * @generated
     */
    EClass getPropertiesType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.rules.PropertiesType#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.PropertiesType#getProperty()
     * @see #getPropertiesType()
     * @generated
     */
    EReference getPropertiesType_Property();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.PropertyType <em>Property Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.PropertyType
     * @generated
     */
    EClass getPropertyType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.PropertyType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.PropertyType#getName()
     * @see #getPropertyType()
     * @generated
     */
    EAttribute getPropertyType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.PropertyType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.PropertyType#getValue()
     * @see #getPropertyType()
     * @generated
     */
    EAttribute getPropertyType_Value();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.ResourceDetailType <em>Resource Detail Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource Detail Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ResourceDetailType
     * @generated
     */
    EClass getResourceDetailType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ResourceDetailType#getInputType <em>Input Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ResourceDetailType#getInputType()
     * @see #getResourceDetailType()
     * @generated
     */
    EAttribute getResourceDetailType_InputType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ResourceDetailType#isUsingExternalTypes <em>Using External Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Using External Types</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ResourceDetailType#isUsingExternalTypes()
     * @see #getResourceDetailType()
     * @generated
     */
    EAttribute getResourceDetailType_UsingExternalTypes();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ResourceDetailType#getWorksheetName <em>Worksheet Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Worksheet Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ResourceDetailType#getWorksheetName()
     * @see #getResourceDetailType()
     * @generated
     */
    EAttribute getResourceDetailType_WorksheetName();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.ResourcesType <em>Resources Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resources Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ResourcesType
     * @generated
     */
    EClass getResourcesType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.rules.ResourcesType#getResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Resource</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ResourcesType#getResource()
     * @see #getResourcesType()
     * @generated
     */
    EReference getResourcesType_Resource();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.ResourceType <em>Resource Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ResourceType
     * @generated
     */
	EClass getResourceType();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.ResourceType#getResourceDetail <em>Resource Detail</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resource Detail</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ResourceType#getResourceDetail()
     * @see #getResourceType()
     * @generated
     */
    EReference getResourceType_ResourceDetail();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ResourceType#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ResourceType#getLocation()
     * @see #getResourceType()
     * @generated
     */
    EAttribute getResourceType_Location();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ResourceType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ResourceType#getType()
     * @see #getResourceType()
     * @generated
     */
    EAttribute getResourceType_Type();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType <em>Implementation Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Implementation Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType
     * @generated
     */
	EClass getRulesImplementationType();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getChannels <em>Channels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Channels</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getChannels()
     * @see #getRulesImplementationType()
     * @generated
     */
    EReference getRulesImplementationType_Channels();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getListeners <em>Listeners</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Listeners</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getListeners()
     * @see #getRulesImplementationType()
     * @generated
     */
    EReference getRulesImplementationType_Listeners();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getLoggers <em>Loggers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Loggers</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getLoggers()
     * @see #getRulesImplementationType()
     * @generated
     */
    EReference getRulesImplementationType_Loggers();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getManifest <em>Manifest</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Manifest</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getManifest()
     * @see #getRulesImplementationType()
     * @generated
     */
    EReference getRulesImplementationType_Manifest();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getOperations <em>Operations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operations</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getOperations()
     * @see #getRulesImplementationType()
     * @generated
     */
    EReference getRulesImplementationType_Operations();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Properties</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getProperties()
     * @see #getRulesImplementationType()
     * @generated
     */
    EReference getRulesImplementationType_Properties();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.FaultsType <em>Faults Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Faults Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.FaultsType
     * @generated
     */
    EClass getFaultsType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.rules.FaultsType#getFault <em>Fault</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Fault</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.FaultsType#getFault()
     * @see #getFaultsType()
     * @generated
     */
    EReference getFaultsType_Fault();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteType <em>Remote Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Remote Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RemoteType
     * @generated
     */
    EClass getRemoteType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteType#getDeploymentId <em>Deployment Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Deployment Id</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RemoteType#getDeploymentId()
     * @see #getRemoteType()
     * @generated
     */
    EAttribute getRemoteType_DeploymentId();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteType#getExtraJaxbClasses <em>Extra Jaxb Classes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Extra Jaxb Classes</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RemoteType#getExtraJaxbClasses()
     * @see #getRemoteType()
     * @generated
     */
    EReference getRemoteType_ExtraJaxbClasses();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteType#getPassword <em>Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RemoteType#getPassword()
     * @see #getRemoteType()
     * @generated
     */
    EAttribute getRemoteType_Password();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteType#getTimeout <em>Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RemoteType#getTimeout()
     * @see #getRemoteType()
     * @generated
     */
    EAttribute getRemoteType_Timeout();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteType#getUserName <em>User Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>User Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RemoteType#getUserName()
     * @see #getRemoteType()
     * @generated
     */
    EAttribute getRemoteType_UserName();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType <em>Remote Jms Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Remote Jms Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType
     * @generated
     */
    EClass getRemoteJmsType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getHostName <em>Host Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Host Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getHostName()
     * @see #getRemoteJmsType()
     * @generated
     */
    EAttribute getRemoteJmsType_HostName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getKeystoreLocation <em>Keystore Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Keystore Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getKeystoreLocation()
     * @see #getRemoteJmsType()
     * @generated
     */
    EAttribute getRemoteJmsType_KeystoreLocation();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getKeystorePassword <em>Keystore Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Keystore Password</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getKeystorePassword()
     * @see #getRemoteJmsType()
     * @generated
     */
    EAttribute getRemoteJmsType_KeystorePassword();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getRemotingPort <em>Remoting Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remoting Port</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getRemotingPort()
     * @see #getRemoteJmsType()
     * @generated
     */
    EAttribute getRemoteJmsType_RemotingPort();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getMessagingPort <em>Messaging Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Messaging Port</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getMessagingPort()
     * @see #getRemoteJmsType()
     * @generated
     */
    EAttribute getRemoteJmsType_MessagingPort();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getTruststoreLocation <em>Truststore Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Truststore Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getTruststoreLocation()
     * @see #getRemoteJmsType()
     * @generated
     */
    EAttribute getRemoteJmsType_TruststoreLocation();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getTruststorePassword <em>Truststore Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Truststore Password</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getTruststorePassword()
     * @see #getRemoteJmsType()
     * @generated
     */
    EAttribute getRemoteJmsType_TruststorePassword();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getUseSsl <em>Use Ssl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Ssl</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType#getUseSsl()
     * @see #getRemoteJmsType()
     * @generated
     */
    EAttribute getRemoteJmsType_UseSsl();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteRestType <em>Remote Rest Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Remote Rest Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RemoteRestType
     * @generated
     */
    EClass getRemoteRestType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteRestType#getUrl <em>Url</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Url</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RemoteRestType#getUrl()
     * @see #getRemoteRestType()
     * @generated
     */
    EAttribute getRemoteRestType_Url();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.RemoteRestType#getUseFormBasedAuth <em>Use Form Based Auth</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Form Based Auth</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RemoteRestType#getUseFormBasedAuth()
     * @see #getRemoteRestType()
     * @generated
     */
    EAttribute getRemoteRestType_UseFormBasedAuth();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.ExtraJaxbClassesType <em>Extra Jaxb Classes Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Extra Jaxb Classes Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ExtraJaxbClassesType
     * @generated
     */
    EClass getExtraJaxbClassesType();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.rules.ExtraJaxbClassesType#getExtraJaxbClass <em>Extra Jaxb Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Extra Jaxb Class</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ExtraJaxbClassesType#getExtraJaxbClass()
     * @see #getExtraJaxbClassesType()
     * @generated
     */
    EAttribute getExtraJaxbClassesType_ExtraJaxbClass();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.rules.OperationType <em>Operation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Operation Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.OperationType
     * @generated
     */
    EEnum getOperationType();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.rules.ExpressionType <em>Expression Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Expression Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ExpressionType
     * @generated
     */
    EEnum getExpressionType();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.rules.LoggerType <em>Logger Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Logger Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.LoggerType
     * @generated
     */
    EEnum getLoggerType();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.rules.ScopeType <em>Scope Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Scope Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ScopeType
     * @generated
     */
    EEnum getScopeType();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.rules.OperationType <em>Operation Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Operation Type Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.OperationType
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.rules.OperationType"
     *        extendedMetaData="name='operationType:Object' baseType='operationType'"
     * @generated
     */
    EDataType getOperationTypeObject();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.rules.ExpressionType <em>Expression Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Expression Type Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ExpressionType
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.rules.ExpressionType"
     *        extendedMetaData="name='expressionType:Object' baseType='expressionType'"
     * @generated
     */
    EDataType getExpressionTypeObject();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.rules.LoggerType <em>Logger Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Logger Type Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.LoggerType
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.rules.LoggerType"
     *        extendedMetaData="name='loggerType:Object' baseType='loggerType'"
     * @generated
     */
    EDataType getLoggerTypeObject();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.rules.ScopeType <em>Scope Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Scope Type Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ScopeType
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.rules.ScopeType"
     *        extendedMetaData="name='scopeType:Object' baseType='scopeType'"
     * @generated
     */
    EDataType getScopeTypeObject();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	RulesFactory getRulesFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.OperationsTypeImpl <em>Operations Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.OperationsTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getOperationsType()
         * @generated
         */
        EClass OPERATIONS_TYPE = eINSTANCE.getOperationsType();

        /**
         * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATIONS_TYPE__OPERATION = eINSTANCE.getOperationsType_Operation();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesOperationTypeImpl <em>Operation Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesOperationTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getRulesOperationType()
         * @generated
         */
        EClass RULES_OPERATION_TYPE = eINSTANCE.getRulesOperationType();

        /**
         * The meta object literal for the '<em><b>Globals</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULES_OPERATION_TYPE__GLOBALS = eINSTANCE.getRulesOperationType_Globals();

        /**
         * The meta object literal for the '<em><b>Inputs</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULES_OPERATION_TYPE__INPUTS = eINSTANCE.getRulesOperationType_Inputs();

        /**
         * The meta object literal for the '<em><b>Outputs</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULES_OPERATION_TYPE__OUTPUTS = eINSTANCE.getRulesOperationType_Outputs();

        /**
         * The meta object literal for the '<em><b>Faults</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULES_OPERATION_TYPE__FAULTS = eINSTANCE.getRulesOperationType_Faults();

        /**
         * The meta object literal for the '<em><b>Event Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULES_OPERATION_TYPE__EVENT_ID = eINSTANCE.getRulesOperationType_EventId();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULES_OPERATION_TYPE__NAME = eINSTANCE.getRulesOperationType_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULES_OPERATION_TYPE__TYPE = eINSTANCE.getRulesOperationType_Type();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ChannelsTypeImpl <em>Channels Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ChannelsTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getChannelsType()
         * @generated
         */
        EClass CHANNELS_TYPE = eINSTANCE.getChannelsType();

        /**
         * The meta object literal for the '<em><b>Channel</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CHANNELS_TYPE__CHANNEL = eINSTANCE.getChannelsType_Channel();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ChannelTypeImpl <em>Channel Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ChannelTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getChannelType()
         * @generated
         */
		EClass CHANNEL_TYPE = eINSTANCE.getChannelType();

		/**
         * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANNEL_TYPE__CLASS = eINSTANCE.getChannelType_Class();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANNEL_TYPE__NAME = eINSTANCE.getChannelType_Name();

        /**
         * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANNEL_TYPE__OPERATION = eINSTANCE.getChannelType_Operation();

        /**
         * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANNEL_TYPE__REFERENCE = eINSTANCE.getChannelType_Reference();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ContainerTypeImpl <em>Container Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ContainerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getContainerType()
         * @generated
         */
        EClass CONTAINER_TYPE = eINSTANCE.getContainerType();

        /**
         * The meta object literal for the '<em><b>Base Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTAINER_TYPE__BASE_NAME = eINSTANCE.getContainerType_BaseName();

        /**
         * The meta object literal for the '<em><b>Release Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTAINER_TYPE__RELEASE_ID = eINSTANCE.getContainerType_ReleaseId();

        /**
         * The meta object literal for the '<em><b>Scan</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTAINER_TYPE__SCAN = eINSTANCE.getContainerType_Scan();

        /**
         * The meta object literal for the '<em><b>Scan Interval</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTAINER_TYPE__SCAN_INTERVAL = eINSTANCE.getContainerType_ScanInterval();

        /**
         * The meta object literal for the '<em><b>Session Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTAINER_TYPE__SESSION_NAME = eINSTANCE.getContainerType_SessionName();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__OPERATION = eINSTANCE.getDocumentRoot_Operation();

        /**
         * The meta object literal for the '<em><b>Operations</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__OPERATIONS = eINSTANCE.getDocumentRoot_Operations();

        /**
         * The meta object literal for the '<em><b>Channel</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__CHANNEL = eINSTANCE.getDocumentRoot_Channel();

		/**
         * The meta object literal for the '<em><b>Channels</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CHANNELS = eINSTANCE.getDocumentRoot_Channels();

        /**
         * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CONTAINER = eINSTANCE.getDocumentRoot_Container();

        /**
         * The meta object literal for the '<em><b>Global</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__GLOBAL = eINSTANCE.getDocumentRoot_Global();

        /**
         * The meta object literal for the '<em><b>Globals</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__GLOBALS = eINSTANCE.getDocumentRoot_Globals();

        /**
         * The meta object literal for the '<em><b>Implementation Rules</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__IMPLEMENTATION_RULES = eINSTANCE.getDocumentRoot_ImplementationRules();

		/**
         * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__INPUT = eINSTANCE.getDocumentRoot_Input();

        /**
         * The meta object literal for the '<em><b>Inputs</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__INPUTS = eINSTANCE.getDocumentRoot_Inputs();

        /**
         * The meta object literal for the '<em><b>Listener</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__LISTENER = eINSTANCE.getDocumentRoot_Listener();

        /**
         * The meta object literal for the '<em><b>Listeners</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__LISTENERS = eINSTANCE.getDocumentRoot_Listeners();

        /**
         * The meta object literal for the '<em><b>Logger</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__LOGGER = eINSTANCE.getDocumentRoot_Logger();

        /**
         * The meta object literal for the '<em><b>Loggers</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__LOGGERS = eINSTANCE.getDocumentRoot_Loggers();

        /**
         * The meta object literal for the '<em><b>Manifest</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__MANIFEST = eINSTANCE.getDocumentRoot_Manifest();

        /**
         * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__OUTPUT = eINSTANCE.getDocumentRoot_Output();

        /**
         * The meta object literal for the '<em><b>Outputs</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__OUTPUTS = eINSTANCE.getDocumentRoot_Outputs();

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
         * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__RESOURCE = eINSTANCE.getDocumentRoot_Resource();

		/**
         * The meta object literal for the '<em><b>Resource Detail</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__RESOURCE_DETAIL = eINSTANCE.getDocumentRoot_ResourceDetail();

        /**
         * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__RESOURCES = eINSTANCE.getDocumentRoot_Resources();

        /**
         * The meta object literal for the '<em><b>Fault</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__FAULT = eINSTANCE.getDocumentRoot_Fault();

        /**
         * The meta object literal for the '<em><b>Faults</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__FAULTS = eINSTANCE.getDocumentRoot_Faults();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.GlobalsTypeImpl <em>Globals Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.GlobalsTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getGlobalsType()
         * @generated
         */
        EClass GLOBALS_TYPE = eINSTANCE.getGlobalsType();

        /**
         * The meta object literal for the '<em><b>Global</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GLOBALS_TYPE__GLOBAL = eINSTANCE.getGlobalsType_Global();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.InputsTypeImpl <em>Inputs Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.InputsTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getInputsType()
         * @generated
         */
        EClass INPUTS_TYPE = eINSTANCE.getInputsType();

        /**
         * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUTS_TYPE__INPUT = eINSTANCE.getInputsType_Input();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ListenersTypeImpl <em>Listeners Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ListenersTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getListenersType()
         * @generated
         */
        EClass LISTENERS_TYPE = eINSTANCE.getListenersType();

        /**
         * The meta object literal for the '<em><b>Listener</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LISTENERS_TYPE__LISTENER = eINSTANCE.getListenersType_Listener();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ListenerTypeImpl <em>Listener Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ListenerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getListenerType()
         * @generated
         */
        EClass LISTENER_TYPE = eINSTANCE.getListenerType();

        /**
         * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LISTENER_TYPE__CLASS = eINSTANCE.getListenerType_Class();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.LoggersTypeImpl <em>Loggers Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.LoggersTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getLoggersType()
         * @generated
         */
        EClass LOGGERS_TYPE = eINSTANCE.getLoggersType();

        /**
         * The meta object literal for the '<em><b>Logger</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOGGERS_TYPE__LOGGER = eINSTANCE.getLoggersType_Logger();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.LoggerType1Impl <em>Logger Type1</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.LoggerType1Impl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getLoggerType1()
         * @generated
         */
        EClass LOGGER_TYPE1 = eINSTANCE.getLoggerType1();

        /**
         * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOGGER_TYPE1__INTERVAL = eINSTANCE.getLoggerType1_Interval();

        /**
         * The meta object literal for the '<em><b>Log</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOGGER_TYPE1__LOG = eINSTANCE.getLoggerType1_Log();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOGGER_TYPE1__TYPE = eINSTANCE.getLoggerType1_Type();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ManifestTypeImpl <em>Manifest Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ManifestTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getManifestType()
         * @generated
         */
        EClass MANIFEST_TYPE = eINSTANCE.getManifestType();

        /**
         * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MANIFEST_TYPE__CONTAINER = eINSTANCE.getManifestType_Container();

        /**
         * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MANIFEST_TYPE__RESOURCES = eINSTANCE.getManifestType_Resources();

        /**
         * The meta object literal for the '<em><b>Remote Jms</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MANIFEST_TYPE__REMOTE_JMS = eINSTANCE.getManifestType_RemoteJms();

        /**
         * The meta object literal for the '<em><b>Remote Rest</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MANIFEST_TYPE__REMOTE_REST = eINSTANCE.getManifestType_RemoteRest();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.MappingTypeImpl <em>Mapping Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.MappingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getMappingType()
         * @generated
         */
        EClass MAPPING_TYPE = eINSTANCE.getMappingType();

        /**
         * The meta object literal for the '<em><b>From</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPING_TYPE__FROM = eINSTANCE.getMappingType_From();

        /**
         * The meta object literal for the '<em><b>To</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPING_TYPE__TO = eINSTANCE.getMappingType_To();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.OutputsTypeImpl <em>Outputs Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.OutputsTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getOutputsType()
         * @generated
         */
        EClass OUTPUTS_TYPE = eINSTANCE.getOutputsType();

        /**
         * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OUTPUTS_TYPE__OUTPUT = eINSTANCE.getOutputsType_Output();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.PropertiesTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getPropertiesType()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.PropertyTypeImpl <em>Property Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.PropertyTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getPropertyType()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ResourceDetailTypeImpl <em>Resource Detail Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ResourceDetailTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getResourceDetailType()
         * @generated
         */
        EClass RESOURCE_DETAIL_TYPE = eINSTANCE.getResourceDetailType();

        /**
         * The meta object literal for the '<em><b>Input Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_DETAIL_TYPE__INPUT_TYPE = eINSTANCE.getResourceDetailType_InputType();

        /**
         * The meta object literal for the '<em><b>Using External Types</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_DETAIL_TYPE__USING_EXTERNAL_TYPES = eINSTANCE.getResourceDetailType_UsingExternalTypes();

        /**
         * The meta object literal for the '<em><b>Worksheet Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_DETAIL_TYPE__WORKSHEET_NAME = eINSTANCE.getResourceDetailType_WorksheetName();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ResourcesTypeImpl <em>Resources Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ResourcesTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getResourcesType()
         * @generated
         */
        EClass RESOURCES_TYPE = eINSTANCE.getResourcesType();

        /**
         * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESOURCES_TYPE__RESOURCE = eINSTANCE.getResourcesType_Resource();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ResourceTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getResourceType()
         * @generated
         */
		EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
         * The meta object literal for the '<em><b>Resource Detail</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESOURCE_TYPE__RESOURCE_DETAIL = eINSTANCE.getResourceType_ResourceDetail();

        /**
         * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_TYPE__LOCATION = eINSTANCE.getResourceType_Location();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_TYPE__TYPE = eINSTANCE.getResourceType_Type();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesImplementationTypeImpl <em>Implementation Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesImplementationTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getRulesImplementationType()
         * @generated
         */
		EClass RULES_IMPLEMENTATION_TYPE = eINSTANCE.getRulesImplementationType();

		/**
         * The meta object literal for the '<em><b>Channels</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULES_IMPLEMENTATION_TYPE__CHANNELS = eINSTANCE.getRulesImplementationType_Channels();

        /**
         * The meta object literal for the '<em><b>Listeners</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULES_IMPLEMENTATION_TYPE__LISTENERS = eINSTANCE.getRulesImplementationType_Listeners();

        /**
         * The meta object literal for the '<em><b>Loggers</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULES_IMPLEMENTATION_TYPE__LOGGERS = eINSTANCE.getRulesImplementationType_Loggers();

        /**
         * The meta object literal for the '<em><b>Manifest</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULES_IMPLEMENTATION_TYPE__MANIFEST = eINSTANCE.getRulesImplementationType_Manifest();

        /**
         * The meta object literal for the '<em><b>Operations</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULES_IMPLEMENTATION_TYPE__OPERATIONS = eINSTANCE.getRulesImplementationType_Operations();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULES_IMPLEMENTATION_TYPE__PROPERTIES = eINSTANCE.getRulesImplementationType_Properties();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.FaultsTypeImpl <em>Faults Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.FaultsTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getFaultsType()
         * @generated
         */
        EClass FAULTS_TYPE = eINSTANCE.getFaultsType();

        /**
         * The meta object literal for the '<em><b>Fault</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FAULTS_TYPE__FAULT = eINSTANCE.getFaultsType_Fault();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RemoteTypeImpl <em>Remote Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RemoteTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getRemoteType()
         * @generated
         */
        EClass REMOTE_TYPE = eINSTANCE.getRemoteType();

        /**
         * The meta object literal for the '<em><b>Deployment Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_TYPE__DEPLOYMENT_ID = eINSTANCE.getRemoteType_DeploymentId();

        /**
         * The meta object literal for the '<em><b>Extra Jaxb Classes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REMOTE_TYPE__EXTRA_JAXB_CLASSES = eINSTANCE.getRemoteType_ExtraJaxbClasses();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_TYPE__PASSWORD = eINSTANCE.getRemoteType_Password();

        /**
         * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_TYPE__TIMEOUT = eINSTANCE.getRemoteType_Timeout();

        /**
         * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_TYPE__USER_NAME = eINSTANCE.getRemoteType_UserName();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RemoteJmsTypeImpl <em>Remote Jms Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RemoteJmsTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getRemoteJmsType()
         * @generated
         */
        EClass REMOTE_JMS_TYPE = eINSTANCE.getRemoteJmsType();

        /**
         * The meta object literal for the '<em><b>Host Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_JMS_TYPE__HOST_NAME = eINSTANCE.getRemoteJmsType_HostName();

        /**
         * The meta object literal for the '<em><b>Keystore Location</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_JMS_TYPE__KEYSTORE_LOCATION = eINSTANCE.getRemoteJmsType_KeystoreLocation();

        /**
         * The meta object literal for the '<em><b>Keystore Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_JMS_TYPE__KEYSTORE_PASSWORD = eINSTANCE.getRemoteJmsType_KeystorePassword();

        /**
         * The meta object literal for the '<em><b>Remoting Port</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_JMS_TYPE__REMOTING_PORT = eINSTANCE.getRemoteJmsType_RemotingPort();

        /**
         * The meta object literal for the '<em><b>Messaging Port</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_JMS_TYPE__MESSAGING_PORT = eINSTANCE.getRemoteJmsType_MessagingPort();

        /**
         * The meta object literal for the '<em><b>Truststore Location</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_JMS_TYPE__TRUSTSTORE_LOCATION = eINSTANCE.getRemoteJmsType_TruststoreLocation();

        /**
         * The meta object literal for the '<em><b>Truststore Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_JMS_TYPE__TRUSTSTORE_PASSWORD = eINSTANCE.getRemoteJmsType_TruststorePassword();

        /**
         * The meta object literal for the '<em><b>Use Ssl</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_JMS_TYPE__USE_SSL = eINSTANCE.getRemoteJmsType_UseSsl();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RemoteRestTypeImpl <em>Remote Rest Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RemoteRestTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getRemoteRestType()
         * @generated
         */
        EClass REMOTE_REST_TYPE = eINSTANCE.getRemoteRestType();

        /**
         * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_REST_TYPE__URL = eINSTANCE.getRemoteRestType_Url();

        /**
         * The meta object literal for the '<em><b>Use Form Based Auth</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMOTE_REST_TYPE__USE_FORM_BASED_AUTH = eINSTANCE.getRemoteRestType_UseFormBasedAuth();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ExtraJaxbClassesTypeImpl <em>Extra Jaxb Classes Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ExtraJaxbClassesTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getExtraJaxbClassesType()
         * @generated
         */
        EClass EXTRA_JAXB_CLASSES_TYPE = eINSTANCE.getExtraJaxbClassesType();

        /**
         * The meta object literal for the '<em><b>Extra Jaxb Class</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTRA_JAXB_CLASSES_TYPE__EXTRA_JAXB_CLASS = eINSTANCE.getExtraJaxbClassesType_ExtraJaxbClass();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.OperationType <em>Operation Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.OperationType
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getOperationType()
         * @generated
         */
        EEnum OPERATION_TYPE = eINSTANCE.getOperationType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.ExpressionType <em>Expression Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.ExpressionType
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getExpressionType()
         * @generated
         */
        EEnum EXPRESSION_TYPE = eINSTANCE.getExpressionType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.LoggerType <em>Logger Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.LoggerType
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getLoggerType()
         * @generated
         */
        EEnum LOGGER_TYPE = eINSTANCE.getLoggerType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.ScopeType <em>Scope Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.ScopeType
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getScopeType()
         * @generated
         */
        EEnum SCOPE_TYPE = eINSTANCE.getScopeType();

        /**
         * The meta object literal for the '<em>Operation Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.OperationType
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getOperationTypeObject()
         * @generated
         */
        EDataType OPERATION_TYPE_OBJECT = eINSTANCE.getOperationTypeObject();

        /**
         * The meta object literal for the '<em>Expression Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.ExpressionType
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getExpressionTypeObject()
         * @generated
         */
        EDataType EXPRESSION_TYPE_OBJECT = eINSTANCE.getExpressionTypeObject();

        /**
         * The meta object literal for the '<em>Logger Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.LoggerType
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getLoggerTypeObject()
         * @generated
         */
        EDataType LOGGER_TYPE_OBJECT = eINSTANCE.getLoggerTypeObject();

        /**
         * The meta object literal for the '<em>Scope Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.ScopeType
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getScopeTypeObject()
         * @generated
         */
        EDataType SCOPE_TYPE_OBJECT = eINSTANCE.getScopeTypeObject();

	}

} //RulesPackage
