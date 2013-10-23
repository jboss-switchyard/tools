/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory
 * @model kind="package"
 * @generated
 */
public interface SwitchyardPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "switchyard";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "urn:switchyard-config:switchyard:1.0";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "sy";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	SwitchyardPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl.init();

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ArtifactsTypeImpl <em>Artifacts Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.ArtifactsTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getArtifactsType()
     * @generated
     */
	int ARTIFACTS_TYPE = 0;

	/**
     * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ARTIFACTS_TYPE__ARTIFACT = 0;

	/**
     * The number of structural features of the '<em>Artifacts Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ARTIFACTS_TYPE_FEATURE_COUNT = 1;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ArtifactTypeImpl <em>Artifact Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.ArtifactTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getArtifactType()
     * @generated
     */
	int ARTIFACT_TYPE = 1;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ARTIFACT_TYPE__NAME = 0;

	/**
     * The feature id for the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ARTIFACT_TYPE__URL = 1;

	/**
     * The number of structural features of the '<em>Artifact Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ARTIFACT_TYPE_FEATURE_COUNT = 2;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ContextMapperTypeImpl <em>Context Mapper Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.ContextMapperTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getContextMapperType()
     * @generated
     */
	int CONTEXT_MAPPER_TYPE = 2;

	/**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTEXT_MAPPER_TYPE__CLASS = 0;

	/**
     * The feature id for the '<em><b>Exclude Namespaces</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTEXT_MAPPER_TYPE__EXCLUDE_NAMESPACES = 1;

	/**
     * The feature id for the '<em><b>Excludes</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTEXT_MAPPER_TYPE__EXCLUDES = 2;

	/**
     * The feature id for the '<em><b>Include Namespaces</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTEXT_MAPPER_TYPE__INCLUDE_NAMESPACES = 3;

	/**
     * The feature id for the '<em><b>Includes</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTEXT_MAPPER_TYPE__INCLUDES = 4;

	/**
     * The number of structural features of the '<em>Context Mapper Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTEXT_MAPPER_TYPE_FEATURE_COUNT = 5;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getDocumentRoot()
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
     * The feature id for the '<em><b>Artifact</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__ARTIFACT = 3;

	/**
     * The feature id for the '<em><b>Artifacts</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__ARTIFACTS = 4;

	/**
     * The feature id for the '<em><b>Binding Switchyard</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__BINDING_SWITCHYARD = 5;

	/**
     * The feature id for the '<em><b>Domain</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__DOMAIN = 6;

	/**
     * The feature id for the '<em><b>Interface Esb</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__INTERFACE_ESB = 7;

	/**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OPERATION_SELECTOR = 8;

    /**
     * The feature id for the '<em><b>Operation Selector Switchyard</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OPERATION_SELECTOR_SWITCHYARD = 9;

    /**
     * The feature id for the '<em><b>Operation Selector Java</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OPERATION_SELECTOR_JAVA = 10;

    /**
     * The feature id for the '<em><b>Operation Selector Regex</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OPERATION_SELECTOR_REGEX = 11;

    /**
     * The feature id for the '<em><b>Operation Selector Xpath</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OPERATION_SELECTOR_XPATH = 12;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__PROPERTIES = 13;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__PROPERTY = 14;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__RESOURCE = 15;

    /**
     * The feature id for the '<em><b>Securities</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SECURITIES = 16;

                /**
     * The feature id for the '<em><b>Security</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SECURITY = 17;

                /**
     * The feature id for the '<em><b>Switchyard</b></em>' containment reference.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int DOCUMENT_ROOT__SWITCHYARD = 18;

                /**
     * The feature id for the '<em><b>Throttling</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__THROTTLING = 19;

                /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int DOCUMENT_ROOT__TRANSFORM = 20;

                /**
     * The feature id for the '<em><b>Transforms</b></em>' containment reference.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int DOCUMENT_ROOT__TRANSFORMS = 21;

                /**
     * The feature id for the '<em><b>Validate</b></em>' containment reference.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int DOCUMENT_ROOT__VALIDATE = 22;

                /**
     * The feature id for the '<em><b>Validates</b></em>' containment reference.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int DOCUMENT_ROOT__VALIDATES = 23;

                /**
     * The feature id for the '<em><b>Clustered</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CLUSTERED = 24;

                /**
     * The feature id for the '<em><b>Load Balance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LOAD_BALANCE = 25;

                /**
     * The feature id for the '<em><b>Security Attr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SECURITY_ATTR = 26;

                /**
     * The feature id for the '<em><b>Target</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TARGET = 27;

                /**
     * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TARGET_NAMESPACE = 28;

                /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT_FEATURE_COUNT = 29;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DomainTypeImpl <em>Domain Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.DomainTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getDomainType()
     * @generated
     */
	int DOMAIN_TYPE = 4;

	/**
     * The feature id for the '<em><b>Transforms</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOMAIN_TYPE__TRANSFORMS = 0;

	/**
     * The feature id for the '<em><b>Validates</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOMAIN_TYPE__VALIDATES = 1;

	/**
     * The feature id for the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOMAIN_TYPE__PROPERTIES = 2;

	/**
     * The feature id for the '<em><b>Securities</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_TYPE__SECURITIES = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOMAIN_TYPE__NAME = 4;

    /**
     * The number of structural features of the '<em>Domain Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOMAIN_TYPE_FEATURE_COUNT = 5;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.EsbInterfaceImpl <em>Esb Interface</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.EsbInterfaceImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getEsbInterface()
     * @generated
     */
	int ESB_INTERFACE = 5;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ESB_INTERFACE__DOCUMENTATION = ScaPackage.INTERFACE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ESB_INTERFACE__ANY_ATTRIBUTE = ScaPackage.INTERFACE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ESB_INTERFACE__POLICY_SETS = ScaPackage.INTERFACE__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Remotable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ESB_INTERFACE__REMOTABLE = ScaPackage.INTERFACE__REMOTABLE;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ESB_INTERFACE__REQUIRES = ScaPackage.INTERFACE__REQUIRES;

	/**
     * The feature id for the '<em><b>Fault Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESB_INTERFACE__FAULT_TYPE = ScaPackage.INTERFACE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Input Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESB_INTERFACE__INPUT_TYPE = ScaPackage.INTERFACE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Output Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESB_INTERFACE__OUTPUT_TYPE = ScaPackage.INTERFACE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Esb Interface</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ESB_INTERFACE_FEATURE_COUNT = ScaPackage.INTERFACE_FEATURE_COUNT + 3;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.MessageComposerTypeImpl <em>Message Composer Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.MessageComposerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getMessageComposerType()
     * @generated
     */
	int MESSAGE_COMPOSER_TYPE = 7;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.PropertiesTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getPropertiesType()
     * @generated
     */
	int PROPERTIES_TYPE = 8;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.PropertyTypeImpl <em>Property Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.PropertyTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getPropertyType()
     * @generated
     */
	int PROPERTY_TYPE = 9;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.ResourceTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getResourceType()
     * @generated
     */
	int RESOURCE_TYPE = 11;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardBindingTypeImpl <em>Switch Yard Binding Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getSwitchYardBindingType()
     * @generated
     */
	int SWITCH_YARD_BINDING_TYPE = 15;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardTypeImpl <em>Switch Yard Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getSwitchYardType()
     * @generated
     */
	int SWITCH_YARD_TYPE = 17;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.TransformsTypeImpl <em>Transforms Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.TransformsTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getTransformsType()
     * @generated
     */
	int TRANSFORMS_TYPE = 19;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.TransformTypeImpl <em>Transform Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.TransformTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getTransformType()
     * @generated
     */
	int TRANSFORM_TYPE = 20;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ValidatesTypeImpl <em>Validates Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.ValidatesTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getValidatesType()
     * @generated
     */
	int VALIDATES_TYPE = 21;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ValidateTypeImpl <em>Validate Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.ValidateTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getValidateType()
     * @generated
     */
	int VALIDATE_TYPE = 22;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardOperationSelectorTypeImpl <em>Switch Yard Operation Selector Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardOperationSelectorTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getSwitchYardOperationSelectorType()
     * @generated
     */
    int SWITCH_YARD_OPERATION_SELECTOR_TYPE = 16;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_YARD_OPERATION_SELECTOR_TYPE__ANY = ScaPackage.OPERATION_SELECTOR_TYPE__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_YARD_OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE = ScaPackage.OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>Switch Yard Operation Selector Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_YARD_OPERATION_SELECTOR_TYPE_FEATURE_COUNT = ScaPackage.OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ThrottlingTypeImpl <em>Throttling Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.ThrottlingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getThrottlingType()
     * @generated
     */
    int THROTTLING_TYPE = 18;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.JavaOperationSelectorTypeImpl <em>Java Operation Selector Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.JavaOperationSelectorTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getJavaOperationSelectorType()
     * @generated
     */
	int JAVA_OPERATION_SELECTOR_TYPE = 6;

				/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_OPERATION_SELECTOR_TYPE__ANY = SWITCH_YARD_OPERATION_SELECTOR_TYPE__ANY;

				/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE = SWITCH_YARD_OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE;

				/**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_OPERATION_SELECTOR_TYPE__CLASS = SWITCH_YARD_OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 0;

				/**
     * The number of structural features of the '<em>Java Operation Selector Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_OPERATION_SELECTOR_TYPE_FEATURE_COUNT = SWITCH_YARD_OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 1;

                /**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int MESSAGE_COMPOSER_TYPE__CLASS = 0;

                /**
     * The number of structural features of the '<em>Message Composer Type</em>' class.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int MESSAGE_COMPOSER_TYPE_FEATURE_COUNT = 1;

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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.RegexOperationSelectorTypeImpl <em>Regex Operation Selector Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.RegexOperationSelectorTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getRegexOperationSelectorType()
     * @generated
     */
	int REGEX_OPERATION_SELECTOR_TYPE = 10;

				/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REGEX_OPERATION_SELECTOR_TYPE__ANY = SWITCH_YARD_OPERATION_SELECTOR_TYPE__ANY;

				/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REGEX_OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE = SWITCH_YARD_OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE;

				/**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REGEX_OPERATION_SELECTOR_TYPE__EXPRESSION = SWITCH_YARD_OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 0;

				/**
     * The number of structural features of the '<em>Regex Operation Selector Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REGEX_OPERATION_SELECTOR_TYPE_FEATURE_COUNT = SWITCH_YARD_OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 1;

                /**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int RESOURCE_TYPE__LOCATION = 0;

                /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int RESOURCE_TYPE__TYPE = 1;

                /**
     * The number of structural features of the '<em>Resource Type</em>' class.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int RESOURCE_TYPE_FEATURE_COUNT = 2;

				/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.StaticOperationSelectorTypeImpl <em>Static Operation Selector Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.StaticOperationSelectorTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getStaticOperationSelectorType()
     * @generated
     */
	int STATIC_OPERATION_SELECTOR_TYPE = 14;

				/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.XPathOperationSelectorTypeImpl <em>XPath Operation Selector Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.XPathOperationSelectorTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getXPathOperationSelectorType()
     * @generated
     */
	int XPATH_OPERATION_SELECTOR_TYPE = 23;

				/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SecurityTypeImpl <em>Security Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SecurityTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getSecurityType()
     * @generated
     */
    int SECURITY_TYPE = 13;

                /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SecuritiesTypeImpl <em>Securities Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SecuritiesTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getSecuritiesType()
     * @generated
     */
    int SECURITIES_TYPE = 12;

                /**
     * The feature id for the '<em><b>Security</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITIES_TYPE__SECURITY = 0;

                /**
     * The number of structural features of the '<em>Securities Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITIES_TYPE_FEATURE_COUNT = 1;

                /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_TYPE__PROPERTIES = 0;

                /**
     * The feature id for the '<em><b>Callback Handler</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_TYPE__CALLBACK_HANDLER = 1;

                /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_TYPE__NAME = 2;

                /**
     * The feature id for the '<em><b>Roles Allowed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_TYPE__ROLES_ALLOWED = 3;

                /**
     * The feature id for the '<em><b>Run As</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_TYPE__RUN_AS = 4;

                /**
     * The feature id for the '<em><b>Security Domain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_TYPE__SECURITY_DOMAIN = 5;

                /**
     * The number of structural features of the '<em>Security Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECURITY_TYPE_FEATURE_COUNT = 6;

                /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STATIC_OPERATION_SELECTOR_TYPE__ANY = SWITCH_YARD_OPERATION_SELECTOR_TYPE__ANY;

                /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STATIC_OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE = SWITCH_YARD_OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE;

                /**
     * The feature id for the '<em><b>Operation Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STATIC_OPERATION_SELECTOR_TYPE__OPERATION_NAME = SWITCH_YARD_OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 0;

                /**
     * The number of structural features of the '<em>Static Operation Selector Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STATIC_OPERATION_SELECTOR_TYPE_FEATURE_COUNT = SWITCH_YARD_OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 1;

                /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int SWITCH_YARD_BINDING_TYPE__DOCUMENTATION = ScaPackage.BINDING__DOCUMENTATION;

                /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int SWITCH_YARD_BINDING_TYPE__ANY_ATTRIBUTE = ScaPackage.BINDING__ANY_ATTRIBUTE;

                /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT_GROUP = ScaPackage.BINDING__WIRE_FORMAT_GROUP;

                /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT = ScaPackage.BINDING__WIRE_FORMAT;

                /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR_GROUP = ScaPackage.BINDING__OPERATION_SELECTOR_GROUP;

                /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR = ScaPackage.BINDING__OPERATION_SELECTOR;

                /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int SWITCH_YARD_BINDING_TYPE__NAME = ScaPackage.BINDING__NAME;

                /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int SWITCH_YARD_BINDING_TYPE__POLICY_SETS = ScaPackage.BINDING__POLICY_SETS;

                /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int SWITCH_YARD_BINDING_TYPE__REQUIRES = ScaPackage.BINDING__REQUIRES;

                /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int SWITCH_YARD_BINDING_TYPE__URI = ScaPackage.BINDING__URI;

                /**
     * The number of structural features of the '<em>Switch Yard Binding Type</em>' class.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT = ScaPackage.BINDING_FEATURE_COUNT + 0;

                /**
     * The feature id for the '<em><b>Composite</b></em>' containment reference.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int SWITCH_YARD_TYPE__COMPOSITE = 0;

                /**
     * The feature id for the '<em><b>Transforms</b></em>' containment reference.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int SWITCH_YARD_TYPE__TRANSFORMS = 1;

                /**
     * The feature id for the '<em><b>Validates</b></em>' containment reference.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int SWITCH_YARD_TYPE__VALIDATES = 2;

                /**
     * The feature id for the '<em><b>Domain</b></em>' containment reference.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int SWITCH_YARD_TYPE__DOMAIN = 3;

                /**
     * The feature id for the '<em><b>Artifacts</b></em>' containment reference.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int SWITCH_YARD_TYPE__ARTIFACTS = 4;

                /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int SWITCH_YARD_TYPE__NAME = 5;

                /**
     * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int SWITCH_YARD_TYPE__TARGET_NAMESPACE = 6;

                /**
     * The number of structural features of the '<em>Switch Yard Type</em>' class.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int SWITCH_YARD_TYPE_FEATURE_COUNT = 7;

                /**
     * The feature id for the '<em><b>Max Requests</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROTTLING_TYPE__MAX_REQUESTS = 0;

                /**
     * The feature id for the '<em><b>Time Period</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROTTLING_TYPE__TIME_PERIOD = 1;

                /**
     * The number of structural features of the '<em>Throttling Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROTTLING_TYPE_FEATURE_COUNT = 2;

                /**
     * The feature id for the '<em><b>Transform Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int TRANSFORMS_TYPE__TRANSFORM_GROUP = 0;

                /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int TRANSFORMS_TYPE__TRANSFORM = 1;

                /**
     * The number of structural features of the '<em>Transforms Type</em>' class.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int TRANSFORMS_TYPE_FEATURE_COUNT = 2;

                /**
     * The feature id for the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int TRANSFORM_TYPE__FROM = 0;

                /**
     * The feature id for the '<em><b>To</b></em>' attribute.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int TRANSFORM_TYPE__TO = 1;

                /**
     * The number of structural features of the '<em>Transform Type</em>' class.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int TRANSFORM_TYPE_FEATURE_COUNT = 2;

                /**
     * The feature id for the '<em><b>Validate Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int VALIDATES_TYPE__VALIDATE_GROUP = 0;

                /**
     * The feature id for the '<em><b>Validate</b></em>' containment reference list.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int VALIDATES_TYPE__VALIDATE = 1;

                /**
     * The number of structural features of the '<em>Validates Type</em>' class.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int VALIDATES_TYPE_FEATURE_COUNT = 2;

                /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int VALIDATE_TYPE__NAME = 0;

                /**
     * The number of structural features of the '<em>Validate Type</em>' class.
     * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
                int VALIDATE_TYPE_FEATURE_COUNT = 1;

                /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int XPATH_OPERATION_SELECTOR_TYPE__ANY = SWITCH_YARD_OPERATION_SELECTOR_TYPE__ANY;

                /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int XPATH_OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE = SWITCH_YARD_OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE;

                /**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int XPATH_OPERATION_SELECTOR_TYPE__EXPRESSION = SWITCH_YARD_OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 0;

                /**
     * The number of structural features of the '<em>XPath Operation Selector Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int XPATH_OPERATION_SELECTOR_TYPE_FEATURE_COUNT = SWITCH_YARD_OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 1;

                /**
     * The meta object id for the '<em>Prop Boolean</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getPropBoolean()
     * @generated
     */
    int PROP_BOOLEAN = 24;

                /**
     * The meta object id for the '<em>Property Value</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getPropertyValue()
     * @generated
     */
    int PROPERTY_VALUE = 25;

                /**
     * The meta object id for the '<em>Prop Integer</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getPropInteger()
     * @generated
     */
    int PROP_INTEGER = 26;

                /**
     * The meta object id for the '<em>Prop Long</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getPropLong()
     * @generated
     */
    int PROP_LONG = 27;


                /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactsType <em>Artifacts Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Artifacts Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactsType
     * @generated
     */
	EClass getArtifactsType();

	/**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactsType#getArtifact <em>Artifact</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Artifact</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactsType#getArtifact()
     * @see #getArtifactsType()
     * @generated
     */
	EReference getArtifactsType_Artifact();

	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactType <em>Artifact Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Artifact Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactType
     * @generated
     */
	EClass getArtifactType();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactType#getName()
     * @see #getArtifactType()
     * @generated
     */
	EAttribute getArtifactType_Name();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactType#getUrl <em>Url</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Url</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactType#getUrl()
     * @see #getArtifactType()
     * @generated
     */
	EAttribute getArtifactType_Url();

	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType <em>Context Mapper Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Mapper Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType
     * @generated
     */
	EClass getContextMapperType();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType#getClass_ <em>Class</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType#getClass_()
     * @see #getContextMapperType()
     * @generated
     */
	EAttribute getContextMapperType_Class();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType#getExcludeNamespaces <em>Exclude Namespaces</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exclude Namespaces</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType#getExcludeNamespaces()
     * @see #getContextMapperType()
     * @generated
     */
	EAttribute getContextMapperType_ExcludeNamespaces();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType#getExcludes <em>Excludes</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Excludes</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType#getExcludes()
     * @see #getContextMapperType()
     * @generated
     */
	EAttribute getContextMapperType_Excludes();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType#getIncludeNamespaces <em>Include Namespaces</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Include Namespaces</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType#getIncludeNamespaces()
     * @see #getContextMapperType()
     * @generated
     */
	EAttribute getContextMapperType_IncludeNamespaces();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType#getIncludes <em>Includes</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Includes</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType#getIncludes()
     * @see #getContextMapperType()
     * @generated
     */
	EAttribute getContextMapperType_Includes();

	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot
     * @generated
     */
	EClass getDocumentRoot();

	/**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
	EAttribute getDocumentRoot_Mixed();

	/**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getArtifact <em>Artifact</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Artifact</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getArtifact()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Artifact();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getArtifacts <em>Artifacts</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Artifacts</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getArtifacts()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Artifacts();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getBindingSwitchyard <em>Binding Switchyard</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Switchyard</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getBindingSwitchyard()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_BindingSwitchyard();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getDomain <em>Domain</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Domain</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getDomain()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Domain();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getInterfaceEsb <em>Interface Esb</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Interface Esb</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getInterfaceEsb()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_InterfaceEsb();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getOperationSelector <em>Operation Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operation Selector</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getOperationSelector()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_OperationSelector();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Properties</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getProperties()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Properties();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getProperty()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Property();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resource</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getResource()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Resource();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getSwitchyard <em>Switchyard</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Switchyard</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getSwitchyard()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Switchyard();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getThrottling <em>Throttling</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Throttling</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getThrottling()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Throttling();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getTransform <em>Transform</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Transform</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getTransform()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Transform();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getTransforms <em>Transforms</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Transforms</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getTransforms()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Transforms();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getValidate <em>Validate</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Validate</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getValidate()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Validate();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getValidates <em>Validates</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Validates</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getValidates()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Validates();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getOperationSelectorSwitchyard <em>Operation Selector Switchyard</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operation Selector Switchyard</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getOperationSelectorSwitchyard()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_OperationSelectorSwitchyard();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getOperationSelectorJava <em>Operation Selector Java</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operation Selector Java</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getOperationSelectorJava()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_OperationSelectorJava();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getOperationSelectorRegex <em>Operation Selector Regex</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operation Selector Regex</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getOperationSelectorRegex()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_OperationSelectorRegex();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getOperationSelectorXpath <em>Operation Selector Xpath</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operation Selector Xpath</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getOperationSelectorXpath()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_OperationSelectorXpath();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getSecurity <em>Security</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Security</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getSecurity()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Security();

                /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getTarget()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Target();

                /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getTargetNamespace <em>Target Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Namespace</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getTargetNamespace()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_TargetNamespace();

                /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#isClustered <em>Clustered</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Clustered</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#isClustered()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Clustered();

                /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getLoadBalance <em>Load Balance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Load Balance</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getLoadBalance()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_LoadBalance();

                /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getSecurityAttr <em>Security Attr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Security Attr</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getSecurityAttr()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_SecurityAttr();

                /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getSecurities <em>Securities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Securities</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getSecurities()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Securities();

                /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DomainType <em>Domain Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Domain Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DomainType
     * @generated
     */
	EClass getDomainType();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DomainType#getTransforms <em>Transforms</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Transforms</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DomainType#getTransforms()
     * @see #getDomainType()
     * @generated
     */
	EReference getDomainType_Transforms();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DomainType#getValidates <em>Validates</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Validates</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DomainType#getValidates()
     * @see #getDomainType()
     * @generated
     */
	EReference getDomainType_Validates();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DomainType#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Properties</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DomainType#getProperties()
     * @see #getDomainType()
     * @generated
     */
	EReference getDomainType_Properties();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DomainType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DomainType#getName()
     * @see #getDomainType()
     * @generated
     */
	EAttribute getDomainType_Name();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DomainType#getSecurities <em>Securities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Securities</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.DomainType#getSecurities()
     * @see #getDomainType()
     * @generated
     */
    EReference getDomainType_Securities();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface <em>Esb Interface</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Esb Interface</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface
     * @generated
     */
	EClass getEsbInterface();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface#getInputType <em>Input Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface#getInputType()
     * @see #getEsbInterface()
     * @generated
     */
    EAttribute getEsbInterface_InputType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface#getOutputType <em>Output Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface#getOutputType()
     * @see #getEsbInterface()
     * @generated
     */
    EAttribute getEsbInterface_OutputType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface#getFaultType <em>Fault Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fault Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface#getFaultType()
     * @see #getEsbInterface()
     * @generated
     */
    EAttribute getEsbInterface_FaultType();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType <em>Message Composer Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Message Composer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType
     * @generated
     */
	EClass getMessageComposerType();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType#getClass_ <em>Class</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType#getClass_()
     * @see #getMessageComposerType()
     * @generated
     */
	EAttribute getMessageComposerType_Class();

	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.PropertiesType <em>Properties Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Properties Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.PropertiesType
     * @generated
     */
	EClass getPropertiesType();

	/**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.switchyard.PropertiesType#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.PropertiesType#getProperty()
     * @see #getPropertiesType()
     * @generated
     */
	EReference getPropertiesType_Property();

	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.PropertyType <em>Property Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.PropertyType
     * @generated
     */
	EClass getPropertyType();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.PropertyType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.PropertyType#getName()
     * @see #getPropertyType()
     * @generated
     */
	EAttribute getPropertyType_Name();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.PropertyType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.PropertyType#getValue()
     * @see #getPropertyType()
     * @generated
     */
	EAttribute getPropertyType_Value();

	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ResourceType <em>Resource Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ResourceType
     * @generated
     */
	EClass getResourceType();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ResourceType#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ResourceType#getLocation()
     * @see #getResourceType()
     * @generated
     */
	EAttribute getResourceType_Location();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ResourceType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ResourceType#getType()
     * @see #getResourceType()
     * @generated
     */
	EAttribute getResourceType_Type();

	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType <em>Switch Yard Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Switch Yard Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType
     * @generated
     */
	EClass getSwitchYardBindingType();

	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType <em>Switch Yard Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Switch Yard Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType
     * @generated
     */
	EClass getSwitchYardType();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getName()
     * @see #getSwitchYardType()
     * @generated
     */
	EAttribute getSwitchYardType_Name();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getTargetNamespace <em>Target Namespace</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Namespace</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getTargetNamespace()
     * @see #getSwitchYardType()
     * @generated
     */
	EAttribute getSwitchYardType_TargetNamespace();

	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ThrottlingType <em>Throttling Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Throttling Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ThrottlingType
     * @generated
     */
    EClass getThrottlingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ThrottlingType#getMaxRequests <em>Max Requests</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Requests</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ThrottlingType#getMaxRequests()
     * @see #getThrottlingType()
     * @generated
     */
    EAttribute getThrottlingType_MaxRequests();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ThrottlingType#getTimePeriod <em>Time Period</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time Period</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ThrottlingType#getTimePeriod()
     * @see #getThrottlingType()
     * @generated
     */
    EAttribute getThrottlingType_TimePeriod();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getComposite <em>Composite</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Composite</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getComposite()
     * @see #getSwitchYardType()
     * @generated
     */
	EReference getSwitchYardType_Composite();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getTransforms <em>Transforms</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Transforms</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getTransforms()
     * @see #getSwitchYardType()
     * @generated
     */
	EReference getSwitchYardType_Transforms();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getValidates <em>Validates</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Validates</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getValidates()
     * @see #getSwitchYardType()
     * @generated
     */
	EReference getSwitchYardType_Validates();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getDomain <em>Domain</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Domain</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getDomain()
     * @see #getSwitchYardType()
     * @generated
     */
	EReference getSwitchYardType_Domain();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getArtifacts <em>Artifacts</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Artifacts</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getArtifacts()
     * @see #getSwitchYardType()
     * @generated
     */
	EReference getSwitchYardType_Artifacts();

	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType <em>Transforms Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Transforms Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType
     * @generated
     */
	EClass getTransformsType();

	/**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType#getTransformGroup <em>Transform Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Transform Group</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType#getTransformGroup()
     * @see #getTransformsType()
     * @generated
     */
	EAttribute getTransformsType_TransformGroup();

	/**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType#getTransform <em>Transform</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Transform</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType#getTransform()
     * @see #getTransformsType()
     * @generated
     */
	EReference getTransformsType_Transform();

	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.TransformType <em>Transform Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Transform Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.TransformType
     * @generated
     */
	EClass getTransformType();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.TransformType#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>From</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.TransformType#getFrom()
     * @see #getTransformType()
     * @generated
     */
	EAttribute getTransformType_From();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.TransformType#getTo <em>To</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>To</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.TransformType#getTo()
     * @see #getTransformType()
     * @generated
     */
	EAttribute getTransformType_To();

	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType <em>Validates Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Validates Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType
     * @generated
     */
	EClass getValidatesType();

	/**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType#getValidateGroup <em>Validate Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Validate Group</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType#getValidateGroup()
     * @see #getValidatesType()
     * @generated
     */
	EAttribute getValidatesType_ValidateGroup();

	/**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType#getValidate <em>Validate</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Validate</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType#getValidate()
     * @see #getValidatesType()
     * @generated
     */
	EReference getValidatesType_Validate();

	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType <em>Validate Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Validate Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType
     * @generated
     */
	EClass getValidateType();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType#getName()
     * @see #getValidateType()
     * @generated
     */
	EAttribute getValidateType_Name();

	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.JavaOperationSelectorType <em>Java Operation Selector Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Java Operation Selector Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.JavaOperationSelectorType
     * @generated
     */
	EClass getJavaOperationSelectorType();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.JavaOperationSelectorType#getClass_ <em>Class</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.JavaOperationSelectorType#getClass_()
     * @see #getJavaOperationSelectorType()
     * @generated
     */
	EAttribute getJavaOperationSelectorType_Class();

	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.RegexOperationSelectorType <em>Regex Operation Selector Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Regex Operation Selector Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.RegexOperationSelectorType
     * @generated
     */
	EClass getRegexOperationSelectorType();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.RegexOperationSelectorType#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.RegexOperationSelectorType#getExpression()
     * @see #getRegexOperationSelectorType()
     * @generated
     */
	EAttribute getRegexOperationSelectorType_Expression();

	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.StaticOperationSelectorType <em>Static Operation Selector Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Static Operation Selector Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.StaticOperationSelectorType
     * @generated
     */
	EClass getStaticOperationSelectorType();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.StaticOperationSelectorType#getOperationName <em>Operation Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.StaticOperationSelectorType#getOperationName()
     * @see #getStaticOperationSelectorType()
     * @generated
     */
	EAttribute getStaticOperationSelectorType_OperationName();

	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.XPathOperationSelectorType <em>XPath Operation Selector Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>XPath Operation Selector Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.XPathOperationSelectorType
     * @generated
     */
	EClass getXPathOperationSelectorType();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.XPathOperationSelectorType#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.XPathOperationSelectorType#getExpression()
     * @see #getXPathOperationSelectorType()
     * @generated
     */
	EAttribute getXPathOperationSelectorType_Expression();

	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType <em>Security Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Security Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType
     * @generated
     */
    EClass getSecurityType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getCallbackHandler <em>Callback Handler</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Callback Handler</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getCallbackHandler()
     * @see #getSecurityType()
     * @generated
     */
    EAttribute getSecurityType_CallbackHandler();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getName()
     * @see #getSecurityType()
     * @generated
     */
    EAttribute getSecurityType_Name();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Properties</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getProperties()
     * @see #getSecurityType()
     * @generated
     */
    EReference getSecurityType_Properties();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getRolesAllowed <em>Roles Allowed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Roles Allowed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getRolesAllowed()
     * @see #getSecurityType()
     * @generated
     */
    EAttribute getSecurityType_RolesAllowed();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getRunAs <em>Run As</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Run As</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getRunAs()
     * @see #getSecurityType()
     * @generated
     */
    EAttribute getSecurityType_RunAs();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getSecurityDomain <em>Security Domain</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Security Domain</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType#getSecurityDomain()
     * @see #getSecurityType()
     * @generated
     */
    EAttribute getSecurityType_SecurityDomain();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecuritiesType <em>Securities Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Securities Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SecuritiesType
     * @generated
     */
    EClass getSecuritiesType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SecuritiesType#getSecurity <em>Security</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Security</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SecuritiesType#getSecurity()
     * @see #getSecuritiesType()
     * @generated
     */
    EReference getSecuritiesType_Security();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Prop Boolean</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Prop Boolean</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='propBoolean' memberTypes='http://www.eclipse.org/emf/2003/XMLType#boolean propertyValue'"
     * @generated
     */
    EDataType getPropBoolean();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Property Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Property Value</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='propertyValue' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='\\$\\{([a-zA-Z0-9\\.-_])*(:([a-zA-Z0-9])*)?\\}'"
     * @generated
     */
    EDataType getPropertyValue();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Prop Integer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Prop Integer</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='propInteger' memberTypes='http://www.eclipse.org/emf/2003/XMLType#integer propertyValue'"
     * @generated
     */
    EDataType getPropInteger();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Prop Long</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Prop Long</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='propLong' memberTypes='http://www.eclipse.org/emf/2003/XMLType#long propertyValue'"
     * @generated
     */
    EDataType getPropLong();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardOperationSelectorType <em>Switch Yard Operation Selector Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Switch Yard Operation Selector Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardOperationSelectorType
     * @generated
     */
    EClass getSwitchYardOperationSelectorType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	SwitchyardFactory getSwitchyardFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ArtifactsTypeImpl <em>Artifacts Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.ArtifactsTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getArtifactsType()
         * @generated
         */
		EClass ARTIFACTS_TYPE = eINSTANCE.getArtifactsType();

		/**
         * The meta object literal for the '<em><b>Artifact</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ARTIFACTS_TYPE__ARTIFACT = eINSTANCE.getArtifactsType_Artifact();

		/**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ArtifactTypeImpl <em>Artifact Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.ArtifactTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getArtifactType()
         * @generated
         */
		EClass ARTIFACT_TYPE = eINSTANCE.getArtifactType();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ARTIFACT_TYPE__NAME = eINSTANCE.getArtifactType_Name();

		/**
         * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ARTIFACT_TYPE__URL = eINSTANCE.getArtifactType_Url();

		/**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ContextMapperTypeImpl <em>Context Mapper Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.ContextMapperTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getContextMapperType()
         * @generated
         */
		EClass CONTEXT_MAPPER_TYPE = eINSTANCE.getContextMapperType();

		/**
         * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CONTEXT_MAPPER_TYPE__CLASS = eINSTANCE.getContextMapperType_Class();

		/**
         * The meta object literal for the '<em><b>Exclude Namespaces</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CONTEXT_MAPPER_TYPE__EXCLUDE_NAMESPACES = eINSTANCE.getContextMapperType_ExcludeNamespaces();

		/**
         * The meta object literal for the '<em><b>Excludes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CONTEXT_MAPPER_TYPE__EXCLUDES = eINSTANCE.getContextMapperType_Excludes();

		/**
         * The meta object literal for the '<em><b>Include Namespaces</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CONTEXT_MAPPER_TYPE__INCLUDE_NAMESPACES = eINSTANCE.getContextMapperType_IncludeNamespaces();

		/**
         * The meta object literal for the '<em><b>Includes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CONTEXT_MAPPER_TYPE__INCLUDES = eINSTANCE.getContextMapperType_Includes();

		/**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Artifact</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__ARTIFACT = eINSTANCE.getDocumentRoot_Artifact();

		/**
         * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__ARTIFACTS = eINSTANCE.getDocumentRoot_Artifacts();

		/**
         * The meta object literal for the '<em><b>Binding Switchyard</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__BINDING_SWITCHYARD = eINSTANCE.getDocumentRoot_BindingSwitchyard();

		/**
         * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__DOMAIN = eINSTANCE.getDocumentRoot_Domain();

		/**
         * The meta object literal for the '<em><b>Interface Esb</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__INTERFACE_ESB = eINSTANCE.getDocumentRoot_InterfaceEsb();

		/**
         * The meta object literal for the '<em><b>Operation Selector</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__OPERATION_SELECTOR = eINSTANCE.getDocumentRoot_OperationSelector();

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
         * The meta object literal for the '<em><b>Switchyard</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__SWITCHYARD = eINSTANCE.getDocumentRoot_Switchyard();

		/**
         * The meta object literal for the '<em><b>Throttling</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__THROTTLING = eINSTANCE.getDocumentRoot_Throttling();

        /**
         * The meta object literal for the '<em><b>Transform</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__TRANSFORM = eINSTANCE.getDocumentRoot_Transform();

		/**
         * The meta object literal for the '<em><b>Transforms</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__TRANSFORMS = eINSTANCE.getDocumentRoot_Transforms();

		/**
         * The meta object literal for the '<em><b>Validate</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__VALIDATE = eINSTANCE.getDocumentRoot_Validate();

		/**
         * The meta object literal for the '<em><b>Validates</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__VALIDATES = eINSTANCE.getDocumentRoot_Validates();

		/**
         * The meta object literal for the '<em><b>Operation Selector Switchyard</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__OPERATION_SELECTOR_SWITCHYARD = eINSTANCE.getDocumentRoot_OperationSelectorSwitchyard();

        /**
         * The meta object literal for the '<em><b>Operation Selector Java</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__OPERATION_SELECTOR_JAVA = eINSTANCE.getDocumentRoot_OperationSelectorJava();

        /**
         * The meta object literal for the '<em><b>Operation Selector Regex</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__OPERATION_SELECTOR_REGEX = eINSTANCE.getDocumentRoot_OperationSelectorRegex();

        /**
         * The meta object literal for the '<em><b>Operation Selector Xpath</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__OPERATION_SELECTOR_XPATH = eINSTANCE.getDocumentRoot_OperationSelectorXpath();

        /**
         * The meta object literal for the '<em><b>Security</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__SECURITY = eINSTANCE.getDocumentRoot_Security();

                                /**
         * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__TARGET = eINSTANCE.getDocumentRoot_Target();

                                /**
         * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__TARGET_NAMESPACE = eINSTANCE.getDocumentRoot_TargetNamespace();

                                /**
         * The meta object literal for the '<em><b>Clustered</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__CLUSTERED = eINSTANCE.getDocumentRoot_Clustered();

                                /**
         * The meta object literal for the '<em><b>Load Balance</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__LOAD_BALANCE = eINSTANCE.getDocumentRoot_LoadBalance();

                                /**
         * The meta object literal for the '<em><b>Security Attr</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__SECURITY_ATTR = eINSTANCE.getDocumentRoot_SecurityAttr();

                                /**
         * The meta object literal for the '<em><b>Securities</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__SECURITIES = eINSTANCE.getDocumentRoot_Securities();

                                /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DomainTypeImpl <em>Domain Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.DomainTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getDomainType()
         * @generated
         */
		EClass DOMAIN_TYPE = eINSTANCE.getDomainType();

		/**
         * The meta object literal for the '<em><b>Transforms</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOMAIN_TYPE__TRANSFORMS = eINSTANCE.getDomainType_Transforms();

		/**
         * The meta object literal for the '<em><b>Validates</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOMAIN_TYPE__VALIDATES = eINSTANCE.getDomainType_Validates();

		/**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOMAIN_TYPE__PROPERTIES = eINSTANCE.getDomainType_Properties();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute DOMAIN_TYPE__NAME = eINSTANCE.getDomainType_Name();

		/**
         * The meta object literal for the '<em><b>Securities</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOMAIN_TYPE__SECURITIES = eINSTANCE.getDomainType_Securities();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.EsbInterfaceImpl <em>Esb Interface</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.EsbInterfaceImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getEsbInterface()
         * @generated
         */
		EClass ESB_INTERFACE = eINSTANCE.getEsbInterface();

		/**
         * The meta object literal for the '<em><b>Input Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ESB_INTERFACE__INPUT_TYPE = eINSTANCE.getEsbInterface_InputType();

        /**
         * The meta object literal for the '<em><b>Output Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ESB_INTERFACE__OUTPUT_TYPE = eINSTANCE.getEsbInterface_OutputType();

        /**
         * The meta object literal for the '<em><b>Fault Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ESB_INTERFACE__FAULT_TYPE = eINSTANCE.getEsbInterface_FaultType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.MessageComposerTypeImpl <em>Message Composer Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.MessageComposerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getMessageComposerType()
         * @generated
         */
		EClass MESSAGE_COMPOSER_TYPE = eINSTANCE.getMessageComposerType();

		/**
         * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute MESSAGE_COMPOSER_TYPE__CLASS = eINSTANCE.getMessageComposerType_Class();

		/**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.PropertiesTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getPropertiesType()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.PropertyTypeImpl <em>Property Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.PropertyTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getPropertyType()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.ResourceTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getResourceType()
         * @generated
         */
		EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardBindingTypeImpl <em>Switch Yard Binding Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getSwitchYardBindingType()
         * @generated
         */
		EClass SWITCH_YARD_BINDING_TYPE = eINSTANCE.getSwitchYardBindingType();

		/**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardTypeImpl <em>Switch Yard Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getSwitchYardType()
         * @generated
         */
		EClass SWITCH_YARD_TYPE = eINSTANCE.getSwitchYardType();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SWITCH_YARD_TYPE__NAME = eINSTANCE.getSwitchYardType_Name();

		/**
         * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SWITCH_YARD_TYPE__TARGET_NAMESPACE = eINSTANCE.getSwitchYardType_TargetNamespace();

		/**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ThrottlingTypeImpl <em>Throttling Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.ThrottlingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getThrottlingType()
         * @generated
         */
        EClass THROTTLING_TYPE = eINSTANCE.getThrottlingType();

        /**
         * The meta object literal for the '<em><b>Max Requests</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute THROTTLING_TYPE__MAX_REQUESTS = eINSTANCE.getThrottlingType_MaxRequests();

        /**
         * The meta object literal for the '<em><b>Time Period</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute THROTTLING_TYPE__TIME_PERIOD = eINSTANCE.getThrottlingType_TimePeriod();

        /**
         * The meta object literal for the '<em><b>Composite</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SWITCH_YARD_TYPE__COMPOSITE = eINSTANCE.getSwitchYardType_Composite();

		/**
         * The meta object literal for the '<em><b>Transforms</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SWITCH_YARD_TYPE__TRANSFORMS = eINSTANCE.getSwitchYardType_Transforms();

		/**
         * The meta object literal for the '<em><b>Validates</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SWITCH_YARD_TYPE__VALIDATES = eINSTANCE.getSwitchYardType_Validates();

		/**
         * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SWITCH_YARD_TYPE__DOMAIN = eINSTANCE.getSwitchYardType_Domain();

		/**
         * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SWITCH_YARD_TYPE__ARTIFACTS = eINSTANCE.getSwitchYardType_Artifacts();

		/**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.TransformsTypeImpl <em>Transforms Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.TransformsTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getTransformsType()
         * @generated
         */
		EClass TRANSFORMS_TYPE = eINSTANCE.getTransformsType();

		/**
         * The meta object literal for the '<em><b>Transform Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TRANSFORMS_TYPE__TRANSFORM_GROUP = eINSTANCE.getTransformsType_TransformGroup();

		/**
         * The meta object literal for the '<em><b>Transform</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference TRANSFORMS_TYPE__TRANSFORM = eINSTANCE.getTransformsType_Transform();

		/**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.TransformTypeImpl <em>Transform Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.TransformTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getTransformType()
         * @generated
         */
		EClass TRANSFORM_TYPE = eINSTANCE.getTransformType();

		/**
         * The meta object literal for the '<em><b>From</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TRANSFORM_TYPE__FROM = eINSTANCE.getTransformType_From();

		/**
         * The meta object literal for the '<em><b>To</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TRANSFORM_TYPE__TO = eINSTANCE.getTransformType_To();

		/**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ValidatesTypeImpl <em>Validates Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.ValidatesTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getValidatesType()
         * @generated
         */
		EClass VALIDATES_TYPE = eINSTANCE.getValidatesType();

		/**
         * The meta object literal for the '<em><b>Validate Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute VALIDATES_TYPE__VALIDATE_GROUP = eINSTANCE.getValidatesType_ValidateGroup();

		/**
         * The meta object literal for the '<em><b>Validate</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference VALIDATES_TYPE__VALIDATE = eINSTANCE.getValidatesType_Validate();

		/**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ValidateTypeImpl <em>Validate Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.ValidateTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getValidateType()
         * @generated
         */
		EClass VALIDATE_TYPE = eINSTANCE.getValidateType();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute VALIDATE_TYPE__NAME = eINSTANCE.getValidateType_Name();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.JavaOperationSelectorTypeImpl <em>Java Operation Selector Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.JavaOperationSelectorTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getJavaOperationSelectorType()
         * @generated
         */
		EClass JAVA_OPERATION_SELECTOR_TYPE = eINSTANCE.getJavaOperationSelectorType();

		/**
         * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute JAVA_OPERATION_SELECTOR_TYPE__CLASS = eINSTANCE.getJavaOperationSelectorType_Class();

		/**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.RegexOperationSelectorTypeImpl <em>Regex Operation Selector Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.RegexOperationSelectorTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getRegexOperationSelectorType()
         * @generated
         */
		EClass REGEX_OPERATION_SELECTOR_TYPE = eINSTANCE.getRegexOperationSelectorType();

		/**
         * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute REGEX_OPERATION_SELECTOR_TYPE__EXPRESSION = eINSTANCE.getRegexOperationSelectorType_Expression();

		/**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.StaticOperationSelectorTypeImpl <em>Static Operation Selector Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.StaticOperationSelectorTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getStaticOperationSelectorType()
         * @generated
         */
		EClass STATIC_OPERATION_SELECTOR_TYPE = eINSTANCE.getStaticOperationSelectorType();

		/**
         * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute STATIC_OPERATION_SELECTOR_TYPE__OPERATION_NAME = eINSTANCE.getStaticOperationSelectorType_OperationName();

		/**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.XPathOperationSelectorTypeImpl <em>XPath Operation Selector Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.XPathOperationSelectorTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getXPathOperationSelectorType()
         * @generated
         */
		EClass XPATH_OPERATION_SELECTOR_TYPE = eINSTANCE.getXPathOperationSelectorType();

		/**
         * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute XPATH_OPERATION_SELECTOR_TYPE__EXPRESSION = eINSTANCE.getXPathOperationSelectorType_Expression();

								/**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SecurityTypeImpl <em>Security Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SecurityTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getSecurityType()
         * @generated
         */
        EClass SECURITY_TYPE = eINSTANCE.getSecurityType();

        /**
         * The meta object literal for the '<em><b>Callback Handler</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SECURITY_TYPE__CALLBACK_HANDLER = eINSTANCE.getSecurityType_CallbackHandler();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SECURITY_TYPE__NAME = eINSTANCE.getSecurityType_Name();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SECURITY_TYPE__PROPERTIES = eINSTANCE.getSecurityType_Properties();

                                /**
         * The meta object literal for the '<em><b>Roles Allowed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SECURITY_TYPE__ROLES_ALLOWED = eINSTANCE.getSecurityType_RolesAllowed();

        /**
         * The meta object literal for the '<em><b>Run As</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SECURITY_TYPE__RUN_AS = eINSTANCE.getSecurityType_RunAs();

                                /**
         * The meta object literal for the '<em><b>Security Domain</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SECURITY_TYPE__SECURITY_DOMAIN = eINSTANCE.getSecurityType_SecurityDomain();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SecuritiesTypeImpl <em>Securities Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SecuritiesTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getSecuritiesType()
         * @generated
         */
        EClass SECURITIES_TYPE = eINSTANCE.getSecuritiesType();

        /**
         * The meta object literal for the '<em><b>Security</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SECURITIES_TYPE__SECURITY = eINSTANCE.getSecuritiesType_Security();

                                /**
         * The meta object literal for the '<em>Prop Boolean</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getPropBoolean()
         * @generated
         */
        EDataType PROP_BOOLEAN = eINSTANCE.getPropBoolean();

        /**
         * The meta object literal for the '<em>Property Value</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getPropertyValue()
         * @generated
         */
        EDataType PROPERTY_VALUE = eINSTANCE.getPropertyValue();

        /**
         * The meta object literal for the '<em>Prop Integer</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getPropInteger()
         * @generated
         */
        EDataType PROP_INTEGER = eINSTANCE.getPropInteger();

        /**
         * The meta object literal for the '<em>Prop Long</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getPropLong()
         * @generated
         */
        EDataType PROP_LONG = eINSTANCE.getPropLong();

                                /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardOperationSelectorTypeImpl <em>Switch Yard Operation Selector Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardOperationSelectorTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl#getSwitchYardOperationSelectorType()
         * @generated
         */
        EClass SWITCH_YARD_OPERATION_SELECTOR_TYPE = eINSTANCE.getSwitchYardOperationSelectorType();

	}

} //SwitchyardPackage
