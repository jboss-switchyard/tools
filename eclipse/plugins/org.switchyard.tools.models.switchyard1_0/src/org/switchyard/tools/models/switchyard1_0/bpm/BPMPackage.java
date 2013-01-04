/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm;

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
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMFactory
 * @model kind="package"
 * @generated
 */
public interface BPMPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "bpm";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "urn:switchyard-component-bpm:config:1.0";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "bpm";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	BPMPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl.init();

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ActionsTypeImpl <em>Actions Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ActionsTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getActionsType()
     * @generated
     */
    int ACTIONS_TYPE = 0;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIONS_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIONS_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Action</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIONS_TYPE__ACTION = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Actions Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIONS_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ActionType1Impl <em>Action Type1</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ActionType1Impl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getActionType1()
     * @generated
     */
	int ACTION_TYPE1 = 1;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE1__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE1__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Globals</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE1__GLOBALS = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Inputs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE1__INPUTS = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Outputs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE1__OUTPUTS = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE1__ID = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE1__OPERATION = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE1__TYPE = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Action Type1</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTION_TYPE1_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 6;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl <em>Implementation Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getBPMImplementationType()
     * @generated
     */
	int BPM_IMPLEMENTATION_TYPE = 2;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPM_IMPLEMENTATION_TYPE__DOCUMENTATION = ScaPackage.IMPLEMENTATION__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPM_IMPLEMENTATION_TYPE__ANY_ATTRIBUTE = ScaPackage.IMPLEMENTATION__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPM_IMPLEMENTATION_TYPE__POLICY_SETS = ScaPackage.IMPLEMENTATION__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPM_IMPLEMENTATION_TYPE__REQUIRES = ScaPackage.IMPLEMENTATION__REQUIRES;

	/**
     * The feature id for the '<em><b>Actions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__ACTIONS = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Channels</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__CHANNELS = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Listeners</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__LISTENERS = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Loggers</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__LOGGERS = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Manifest</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__MANIFEST = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__PROPERTIES = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Work Item Handlers</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__WORK_ITEM_HANDLERS = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Persistent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__PERSISTENT = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Process Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__PROCESS_ID = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Session Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__SESSION_ID = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Implementation Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPM_IMPLEMENTATION_TYPE_FEATURE_COUNT = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 10;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ChannelsTypeImpl <em>Channels Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ChannelsTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getChannelsType()
     * @generated
     */
    int CHANNELS_TYPE = 3;

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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ChannelTypeImpl <em>Channel Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ChannelTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getChannelType()
     * @generated
     */
    int CHANNEL_TYPE = 4;

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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ContainerTypeImpl <em>Container Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ContainerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getContainerType()
     * @generated
     */
    int CONTAINER_TYPE = 5;

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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getDocumentRoot()
     * @generated
     */
	int DOCUMENT_ROOT = 6;

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
     * The feature id for the '<em><b>Action</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__ACTION = 3;

	/**
     * The feature id for the '<em><b>Actions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ACTIONS = 4;

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
     * The feature id for the '<em><b>Globals</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GLOBALS = 8;

    /**
     * The feature id for the '<em><b>Implementation Bpm</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPLEMENTATION_BPM = 9;

	/**
     * The feature id for the '<em><b>Inputs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INPUTS = 10;

    /**
     * The feature id for the '<em><b>Listener</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LISTENER = 11;

    /**
     * The feature id for the '<em><b>Listeners</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LISTENERS = 12;

    /**
     * The feature id for the '<em><b>Logger</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LOGGER = 13;

    /**
     * The feature id for the '<em><b>Loggers</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LOGGERS = 14;

    /**
     * The feature id for the '<em><b>Manifest</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MANIFEST = 15;

    /**
     * The feature id for the '<em><b>Mapping</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MAPPING = 16;

    /**
     * The feature id for the '<em><b>Outputs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OUTPUTS = 17;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROPERTIES = 18;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROPERTY = 19;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__RESOURCE = 20;

	/**
     * The feature id for the '<em><b>Resources</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__RESOURCES = 21;

    /**
     * The feature id for the '<em><b>Work Item Handler</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__WORK_ITEM_HANDLER = 22;

    /**
     * The feature id for the '<em><b>Work Item Handlers</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__WORK_ITEM_HANDLERS = 23;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT_FEATURE_COUNT = 24;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ListenersTypeImpl <em>Listeners Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ListenersTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getListenersType()
     * @generated
     */
    int LISTENERS_TYPE = 7;

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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ListenerTypeImpl <em>Listener Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ListenerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getListenerType()
     * @generated
     */
    int LISTENER_TYPE = 8;

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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.LoggersTypeImpl <em>Loggers Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.LoggersTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getLoggersType()
     * @generated
     */
    int LOGGERS_TYPE = 9;

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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.LoggerType1Impl <em>Logger Type1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.LoggerType1Impl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getLoggerType1()
     * @generated
     */
    int LOGGER_TYPE1 = 10;

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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ManifestTypeImpl <em>Manifest Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ManifestTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getManifestType()
     * @generated
     */
    int MANIFEST_TYPE = 11;

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
     * The number of structural features of the '<em>Manifest Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANIFEST_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.MappingsTypeImpl <em>Mappings Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.MappingsTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getMappingsType()
     * @generated
     */
    int MAPPINGS_TYPE = 12;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPINGS_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPINGS_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPINGS_TYPE__MAPPING = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Mappings Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPINGS_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.MappingTypeImpl <em>Mapping Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.MappingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getMappingType()
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
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__EXPRESSION = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__EXPRESSION_TYPE = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Scope</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__SCOPE = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Variable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__VARIABLE = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Mapping Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.PropertiesTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getPropertiesType()
     * @generated
     */
    int PROPERTIES_TYPE = 14;

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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.PropertyTypeImpl <em>Property Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.PropertyTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getPropertyType()
     * @generated
     */
    int PROPERTY_TYPE = 15;

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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ResourcesTypeImpl <em>Resources Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ResourcesTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getResourcesType()
     * @generated
     */
    int RESOURCES_TYPE = 16;

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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ResourceTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getResourceType()
     * @generated
     */
	int RESOURCE_TYPE = 17;

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
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE__LOCATION = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE__TYPE = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Resource Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.WorkItemHandlersTypeImpl <em>Work Item Handlers Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.WorkItemHandlersTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getWorkItemHandlersType()
     * @generated
     */
    int WORK_ITEM_HANDLERS_TYPE = 18;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORK_ITEM_HANDLERS_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORK_ITEM_HANDLERS_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Work Item Handler</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORK_ITEM_HANDLERS_TYPE__WORK_ITEM_HANDLER = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Work Item Handlers Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORK_ITEM_HANDLERS_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.WorkItemHandlerTypeImpl <em>Work Item Handler Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.WorkItemHandlerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getWorkItemHandlerType()
     * @generated
     */
    int WORK_ITEM_HANDLER_TYPE = 19;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORK_ITEM_HANDLER_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORK_ITEM_HANDLER_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORK_ITEM_HANDLER_TYPE__CLASS = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORK_ITEM_HANDLER_TYPE__NAME = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Work Item Handler Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORK_ITEM_HANDLER_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType <em>Action Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getActionType()
     * @generated
     */
	int ACTION_TYPE = 20;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ExpressionType <em>Expression Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ExpressionType
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getExpressionType()
     * @generated
     */
    int EXPRESSION_TYPE = 21;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.LoggerType <em>Logger Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.LoggerType
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getLoggerType()
     * @generated
     */
    int LOGGER_TYPE = 22;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ScopeType <em>Scope Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ScopeType
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getScopeType()
     * @generated
     */
    int SCOPE_TYPE = 23;

    /**
     * The meta object id for the '<em>Action Type Object</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getActionTypeObject()
     * @generated
     */
	int ACTION_TYPE_OBJECT = 24;


	/**
     * The meta object id for the '<em>Expression Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ExpressionType
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getExpressionTypeObject()
     * @generated
     */
    int EXPRESSION_TYPE_OBJECT = 25;

    /**
     * The meta object id for the '<em>Logger Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.LoggerType
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getLoggerTypeObject()
     * @generated
     */
    int LOGGER_TYPE_OBJECT = 26;

    /**
     * The meta object id for the '<em>Scope Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ScopeType
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getScopeTypeObject()
     * @generated
     */
    int SCOPE_TYPE_OBJECT = 27;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionsType <em>Actions Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Actions Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionsType
     * @generated
     */
    EClass getActionsType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionsType#getAction <em>Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Action</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionsType#getAction()
     * @see #getActionsType()
     * @generated
     */
    EReference getActionsType_Action();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1 <em>Action Type1</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action Type1</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType1
     * @generated
     */
	EClass getActionType1();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getGlobals <em>Globals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Globals</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getGlobals()
     * @see #getActionType1()
     * @generated
     */
    EReference getActionType1_Globals();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getInputs <em>Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Inputs</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getInputs()
     * @see #getActionType1()
     * @generated
     */
    EReference getActionType1_Inputs();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getOutputs <em>Outputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Outputs</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getOutputs()
     * @see #getActionType1()
     * @generated
     */
    EReference getActionType1_Outputs();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getId()
     * @see #getActionType1()
     * @generated
     */
    EAttribute getActionType1_Id();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getOperation()
     * @see #getActionType1()
     * @generated
     */
    EAttribute getActionType1_Operation();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getType()
     * @see #getActionType1()
     * @generated
     */
    EAttribute getActionType1_Type();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType <em>Implementation Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Implementation Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType
     * @generated
     */
	EClass getBPMImplementationType();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getActions <em>Actions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Actions</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getActions()
     * @see #getBPMImplementationType()
     * @generated
     */
    EReference getBPMImplementationType_Actions();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getChannels <em>Channels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Channels</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getChannels()
     * @see #getBPMImplementationType()
     * @generated
     */
    EReference getBPMImplementationType_Channels();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getListeners <em>Listeners</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Listeners</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getListeners()
     * @see #getBPMImplementationType()
     * @generated
     */
    EReference getBPMImplementationType_Listeners();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getLoggers <em>Loggers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Loggers</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getLoggers()
     * @see #getBPMImplementationType()
     * @generated
     */
    EReference getBPMImplementationType_Loggers();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getManifest <em>Manifest</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Manifest</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getManifest()
     * @see #getBPMImplementationType()
     * @generated
     */
    EReference getBPMImplementationType_Manifest();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Properties</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getProperties()
     * @see #getBPMImplementationType()
     * @generated
     */
    EReference getBPMImplementationType_Properties();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getWorkItemHandlers <em>Work Item Handlers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Work Item Handlers</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getWorkItemHandlers()
     * @see #getBPMImplementationType()
     * @generated
     */
    EReference getBPMImplementationType_WorkItemHandlers();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getProcessId <em>Process Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process Id</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getProcessId()
     * @see #getBPMImplementationType()
     * @generated
     */
    EAttribute getBPMImplementationType_ProcessId();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#isPersistent <em>Persistent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Persistent</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#isPersistent()
     * @see #getBPMImplementationType()
     * @generated
     */
    EAttribute getBPMImplementationType_Persistent();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getSessionId <em>Session Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Session Id</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getSessionId()
     * @see #getBPMImplementationType()
     * @generated
     */
    EAttribute getBPMImplementationType_SessionId();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.ChannelsType <em>Channels Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Channels Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ChannelsType
     * @generated
     */
    EClass getChannelsType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.bpm.ChannelsType#getChannel <em>Channel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Channel</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ChannelsType#getChannel()
     * @see #getChannelsType()
     * @generated
     */
    EReference getChannelsType_Channel();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.ChannelType <em>Channel Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Channel Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ChannelType
     * @generated
     */
    EClass getChannelType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.ChannelType#getClass_ <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ChannelType#getClass_()
     * @see #getChannelType()
     * @generated
     */
    EAttribute getChannelType_Class();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.ChannelType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ChannelType#getName()
     * @see #getChannelType()
     * @generated
     */
    EAttribute getChannelType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.ChannelType#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ChannelType#getOperation()
     * @see #getChannelType()
     * @generated
     */
    EAttribute getChannelType_Operation();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.ChannelType#getReference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reference</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ChannelType#getReference()
     * @see #getChannelType()
     * @generated
     */
    EAttribute getChannelType_Reference();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.ContainerType <em>Container Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Container Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ContainerType
     * @generated
     */
    EClass getContainerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#getBaseName <em>Base Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Base Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#getBaseName()
     * @see #getContainerType()
     * @generated
     */
    EAttribute getContainerType_BaseName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#getReleaseId <em>Release Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Release Id</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#getReleaseId()
     * @see #getContainerType()
     * @generated
     */
    EAttribute getContainerType_ReleaseId();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#isScan <em>Scan</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scan</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#isScan()
     * @see #getContainerType()
     * @generated
     */
    EAttribute getContainerType_Scan();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#getScanInterval <em>Scan Interval</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scan Interval</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#getScanInterval()
     * @see #getContainerType()
     * @generated
     */
    EAttribute getContainerType_ScanInterval();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#getSessionName <em>Session Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Session Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ContainerType#getSessionName()
     * @see #getContainerType()
     * @generated
     */
    EAttribute getContainerType_SessionName();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot
     * @generated
     */
	EClass getDocumentRoot();

	/**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
	EAttribute getDocumentRoot_Mixed();

	/**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getAction <em>Action</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Action</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getAction()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Action();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getActions <em>Actions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Actions</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getActions()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Actions();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getChannel <em>Channel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Channel</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getChannel()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Channel();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getChannels <em>Channels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Channels</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getChannels()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Channels();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getContainer <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Container</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getContainer()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Container();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getGlobals <em>Globals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Globals</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getGlobals()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Globals();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getImplementationBpm <em>Implementation Bpm</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Implementation Bpm</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getImplementationBpm()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ImplementationBpm();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getInputs <em>Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Inputs</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getInputs()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Inputs();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getListener <em>Listener</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Listener</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getListener()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Listener();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getListeners <em>Listeners</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Listeners</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getListeners()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Listeners();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getLogger <em>Logger</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Logger</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getLogger()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Logger();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getLoggers <em>Loggers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Loggers</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getLoggers()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Loggers();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getManifest <em>Manifest</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Manifest</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getManifest()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Manifest();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getMapping <em>Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Mapping</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getMapping()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Mapping();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getOutputs <em>Outputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Outputs</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getOutputs()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Outputs();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Properties</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getProperties()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Properties();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getProperty()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Property();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resource</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getResource()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Resource();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getResources <em>Resources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resources</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getResources()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Resources();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getWorkItemHandler <em>Work Item Handler</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Work Item Handler</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getWorkItemHandler()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_WorkItemHandler();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getWorkItemHandlers <em>Work Item Handlers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Work Item Handlers</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getWorkItemHandlers()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_WorkItemHandlers();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.ListenersType <em>Listeners Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Listeners Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ListenersType
     * @generated
     */
    EClass getListenersType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.bpm.ListenersType#getListener <em>Listener</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Listener</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ListenersType#getListener()
     * @see #getListenersType()
     * @generated
     */
    EReference getListenersType_Listener();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.ListenerType <em>Listener Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Listener Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ListenerType
     * @generated
     */
    EClass getListenerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.ListenerType#getClass_ <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ListenerType#getClass_()
     * @see #getListenerType()
     * @generated
     */
    EAttribute getListenerType_Class();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.LoggersType <em>Loggers Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Loggers Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.LoggersType
     * @generated
     */
    EClass getLoggersType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.bpm.LoggersType#getLogger <em>Logger</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Logger</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.LoggersType#getLogger()
     * @see #getLoggersType()
     * @generated
     */
    EReference getLoggersType_Logger();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.LoggerType1 <em>Logger Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Logger Type1</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.LoggerType1
     * @generated
     */
    EClass getLoggerType1();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.LoggerType1#getInterval <em>Interval</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Interval</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.LoggerType1#getInterval()
     * @see #getLoggerType1()
     * @generated
     */
    EAttribute getLoggerType1_Interval();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.LoggerType1#getLog <em>Log</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Log</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.LoggerType1#getLog()
     * @see #getLoggerType1()
     * @generated
     */
    EAttribute getLoggerType1_Log();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.LoggerType1#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.LoggerType1#getType()
     * @see #getLoggerType1()
     * @generated
     */
    EAttribute getLoggerType1_Type();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.ManifestType <em>Manifest Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Manifest Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ManifestType
     * @generated
     */
    EClass getManifestType();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.ManifestType#getContainer <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Container</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ManifestType#getContainer()
     * @see #getManifestType()
     * @generated
     */
    EReference getManifestType_Container();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.ManifestType#getResources <em>Resources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resources</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ManifestType#getResources()
     * @see #getManifestType()
     * @generated
     */
    EReference getManifestType_Resources();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.MappingsType <em>Mappings Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mappings Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.MappingsType
     * @generated
     */
    EClass getMappingsType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.bpm.MappingsType#getMapping <em>Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Mapping</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.MappingsType#getMapping()
     * @see #getMappingsType()
     * @generated
     */
    EReference getMappingsType_Mapping();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.MappingType <em>Mapping Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mapping Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.MappingType
     * @generated
     */
    EClass getMappingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.MappingType#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.MappingType#getExpression()
     * @see #getMappingType()
     * @generated
     */
    EAttribute getMappingType_Expression();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.MappingType#getExpressionType <em>Expression Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.MappingType#getExpressionType()
     * @see #getMappingType()
     * @generated
     */
    EAttribute getMappingType_ExpressionType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.MappingType#getScope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scope</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.MappingType#getScope()
     * @see #getMappingType()
     * @generated
     */
    EAttribute getMappingType_Scope();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.MappingType#getVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Variable</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.MappingType#getVariable()
     * @see #getMappingType()
     * @generated
     */
    EAttribute getMappingType_Variable();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.PropertiesType <em>Properties Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Properties Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.PropertiesType
     * @generated
     */
    EClass getPropertiesType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.bpm.PropertiesType#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.PropertiesType#getProperty()
     * @see #getPropertiesType()
     * @generated
     */
    EReference getPropertiesType_Property();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.PropertyType <em>Property Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.PropertyType
     * @generated
     */
    EClass getPropertyType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.PropertyType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.PropertyType#getName()
     * @see #getPropertyType()
     * @generated
     */
    EAttribute getPropertyType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.PropertyType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.PropertyType#getValue()
     * @see #getPropertyType()
     * @generated
     */
    EAttribute getPropertyType_Value();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.ResourcesType <em>Resources Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resources Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ResourcesType
     * @generated
     */
    EClass getResourcesType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.bpm.ResourcesType#getResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Resource</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ResourcesType#getResource()
     * @see #getResourcesType()
     * @generated
     */
    EReference getResourcesType_Resource();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.ResourceType <em>Resource Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ResourceType
     * @generated
     */
	EClass getResourceType();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.ResourceType#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ResourceType#getLocation()
     * @see #getResourceType()
     * @generated
     */
    EAttribute getResourceType_Location();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.ResourceType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ResourceType#getType()
     * @see #getResourceType()
     * @generated
     */
    EAttribute getResourceType_Type();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.WorkItemHandlersType <em>Work Item Handlers Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Work Item Handlers Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.WorkItemHandlersType
     * @generated
     */
    EClass getWorkItemHandlersType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.bpm.WorkItemHandlersType#getWorkItemHandler <em>Work Item Handler</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Work Item Handler</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.WorkItemHandlersType#getWorkItemHandler()
     * @see #getWorkItemHandlersType()
     * @generated
     */
    EReference getWorkItemHandlersType_WorkItemHandler();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.WorkItemHandlerType <em>Work Item Handler Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Work Item Handler Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.WorkItemHandlerType
     * @generated
     */
    EClass getWorkItemHandlerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.WorkItemHandlerType#getClass_ <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.WorkItemHandlerType#getClass_()
     * @see #getWorkItemHandlerType()
     * @generated
     */
    EAttribute getWorkItemHandlerType_Class();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.WorkItemHandlerType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.WorkItemHandlerType#getName()
     * @see #getWorkItemHandlerType()
     * @generated
     */
    EAttribute getWorkItemHandlerType_Name();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType <em>Action Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Action Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType
     * @generated
     */
	EEnum getActionType();

	/**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.bpm.ExpressionType <em>Expression Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Expression Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ExpressionType
     * @generated
     */
    EEnum getExpressionType();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.bpm.LoggerType <em>Logger Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Logger Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.LoggerType
     * @generated
     */
    EEnum getLoggerType();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.bpm.ScopeType <em>Scope Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Scope Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ScopeType
     * @generated
     */
    EEnum getScopeType();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType <em>Action Type Object</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Action Type Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.bpm.ActionType"
     *        extendedMetaData="name='actionType:Object' baseType='actionType'"
     * @generated
     */
	EDataType getActionTypeObject();

	/**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.bpm.ExpressionType <em>Expression Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Expression Type Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ExpressionType
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.bpm.ExpressionType"
     *        extendedMetaData="name='expressionType:Object' baseType='expressionType'"
     * @generated
     */
    EDataType getExpressionTypeObject();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.bpm.LoggerType <em>Logger Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Logger Type Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.LoggerType
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.bpm.LoggerType"
     *        extendedMetaData="name='loggerType:Object' baseType='loggerType'"
     * @generated
     */
    EDataType getLoggerTypeObject();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.bpm.ScopeType <em>Scope Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Scope Type Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ScopeType
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.bpm.ScopeType"
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
	BPMFactory getBPMFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ActionsTypeImpl <em>Actions Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ActionsTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getActionsType()
         * @generated
         */
        EClass ACTIONS_TYPE = eINSTANCE.getActionsType();

        /**
         * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIONS_TYPE__ACTION = eINSTANCE.getActionsType_Action();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ActionType1Impl <em>Action Type1</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ActionType1Impl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getActionType1()
         * @generated
         */
		EClass ACTION_TYPE1 = eINSTANCE.getActionType1();

		/**
         * The meta object literal for the '<em><b>Globals</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION_TYPE1__GLOBALS = eINSTANCE.getActionType1_Globals();

        /**
         * The meta object literal for the '<em><b>Inputs</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION_TYPE1__INPUTS = eINSTANCE.getActionType1_Inputs();

        /**
         * The meta object literal for the '<em><b>Outputs</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION_TYPE1__OUTPUTS = eINSTANCE.getActionType1_Outputs();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTION_TYPE1__ID = eINSTANCE.getActionType1_Id();

        /**
         * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTION_TYPE1__OPERATION = eINSTANCE.getActionType1_Operation();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTION_TYPE1__TYPE = eINSTANCE.getActionType1_Type();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl <em>Implementation Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getBPMImplementationType()
         * @generated
         */
		EClass BPM_IMPLEMENTATION_TYPE = eINSTANCE.getBPMImplementationType();

		/**
         * The meta object literal for the '<em><b>Actions</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BPM_IMPLEMENTATION_TYPE__ACTIONS = eINSTANCE.getBPMImplementationType_Actions();

        /**
         * The meta object literal for the '<em><b>Channels</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BPM_IMPLEMENTATION_TYPE__CHANNELS = eINSTANCE.getBPMImplementationType_Channels();

        /**
         * The meta object literal for the '<em><b>Listeners</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BPM_IMPLEMENTATION_TYPE__LISTENERS = eINSTANCE.getBPMImplementationType_Listeners();

        /**
         * The meta object literal for the '<em><b>Loggers</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BPM_IMPLEMENTATION_TYPE__LOGGERS = eINSTANCE.getBPMImplementationType_Loggers();

        /**
         * The meta object literal for the '<em><b>Manifest</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BPM_IMPLEMENTATION_TYPE__MANIFEST = eINSTANCE.getBPMImplementationType_Manifest();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BPM_IMPLEMENTATION_TYPE__PROPERTIES = eINSTANCE.getBPMImplementationType_Properties();

        /**
         * The meta object literal for the '<em><b>Work Item Handlers</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BPM_IMPLEMENTATION_TYPE__WORK_ITEM_HANDLERS = eINSTANCE.getBPMImplementationType_WorkItemHandlers();

        /**
         * The meta object literal for the '<em><b>Process Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BPM_IMPLEMENTATION_TYPE__PROCESS_ID = eINSTANCE.getBPMImplementationType_ProcessId();

        /**
         * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BPM_IMPLEMENTATION_TYPE__PERSISTENT = eINSTANCE.getBPMImplementationType_Persistent();

        /**
         * The meta object literal for the '<em><b>Session Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BPM_IMPLEMENTATION_TYPE__SESSION_ID = eINSTANCE.getBPMImplementationType_SessionId();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ChannelsTypeImpl <em>Channels Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ChannelsTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getChannelsType()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ChannelTypeImpl <em>Channel Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ChannelTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getChannelType()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ContainerTypeImpl <em>Container Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ContainerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getContainerType()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__ACTION = eINSTANCE.getDocumentRoot_Action();

		/**
         * The meta object literal for the '<em><b>Actions</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ACTIONS = eINSTANCE.getDocumentRoot_Actions();

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
         * The meta object literal for the '<em><b>Globals</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__GLOBALS = eINSTANCE.getDocumentRoot_Globals();

        /**
         * The meta object literal for the '<em><b>Implementation Bpm</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__IMPLEMENTATION_BPM = eINSTANCE.getDocumentRoot_ImplementationBpm();

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
         * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__MAPPING = eINSTANCE.getDocumentRoot_Mapping();

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
         * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__RESOURCES = eINSTANCE.getDocumentRoot_Resources();

        /**
         * The meta object literal for the '<em><b>Work Item Handler</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__WORK_ITEM_HANDLER = eINSTANCE.getDocumentRoot_WorkItemHandler();

        /**
         * The meta object literal for the '<em><b>Work Item Handlers</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__WORK_ITEM_HANDLERS = eINSTANCE.getDocumentRoot_WorkItemHandlers();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ListenersTypeImpl <em>Listeners Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ListenersTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getListenersType()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ListenerTypeImpl <em>Listener Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ListenerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getListenerType()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.LoggersTypeImpl <em>Loggers Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.LoggersTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getLoggersType()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.LoggerType1Impl <em>Logger Type1</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.LoggerType1Impl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getLoggerType1()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ManifestTypeImpl <em>Manifest Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ManifestTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getManifestType()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.MappingsTypeImpl <em>Mappings Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.MappingsTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getMappingsType()
         * @generated
         */
        EClass MAPPINGS_TYPE = eINSTANCE.getMappingsType();

        /**
         * The meta object literal for the '<em><b>Mapping</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MAPPINGS_TYPE__MAPPING = eINSTANCE.getMappingsType_Mapping();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.MappingTypeImpl <em>Mapping Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.MappingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getMappingType()
         * @generated
         */
        EClass MAPPING_TYPE = eINSTANCE.getMappingType();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPING_TYPE__EXPRESSION = eINSTANCE.getMappingType_Expression();

        /**
         * The meta object literal for the '<em><b>Expression Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPING_TYPE__EXPRESSION_TYPE = eINSTANCE.getMappingType_ExpressionType();

        /**
         * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPING_TYPE__SCOPE = eINSTANCE.getMappingType_Scope();

        /**
         * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPING_TYPE__VARIABLE = eINSTANCE.getMappingType_Variable();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.PropertiesTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getPropertiesType()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.PropertyTypeImpl <em>Property Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.PropertyTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getPropertyType()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ResourcesTypeImpl <em>Resources Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ResourcesTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getResourcesType()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ResourceTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getResourceType()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.WorkItemHandlersTypeImpl <em>Work Item Handlers Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.WorkItemHandlersTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getWorkItemHandlersType()
         * @generated
         */
        EClass WORK_ITEM_HANDLERS_TYPE = eINSTANCE.getWorkItemHandlersType();

        /**
         * The meta object literal for the '<em><b>Work Item Handler</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WORK_ITEM_HANDLERS_TYPE__WORK_ITEM_HANDLER = eINSTANCE.getWorkItemHandlersType_WorkItemHandler();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.WorkItemHandlerTypeImpl <em>Work Item Handler Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.WorkItemHandlerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getWorkItemHandlerType()
         * @generated
         */
        EClass WORK_ITEM_HANDLER_TYPE = eINSTANCE.getWorkItemHandlerType();

        /**
         * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WORK_ITEM_HANDLER_TYPE__CLASS = eINSTANCE.getWorkItemHandlerType_Class();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WORK_ITEM_HANDLER_TYPE__NAME = eINSTANCE.getWorkItemHandlerType_Name();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType <em>Action Type</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getActionType()
         * @generated
         */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

		/**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ExpressionType <em>Expression Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.ExpressionType
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getExpressionType()
         * @generated
         */
        EEnum EXPRESSION_TYPE = eINSTANCE.getExpressionType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.LoggerType <em>Logger Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.LoggerType
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getLoggerType()
         * @generated
         */
        EEnum LOGGER_TYPE = eINSTANCE.getLoggerType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ScopeType <em>Scope Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.ScopeType
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getScopeType()
         * @generated
         */
        EEnum SCOPE_TYPE = eINSTANCE.getScopeType();

        /**
         * The meta object literal for the '<em>Action Type Object</em>' data type.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getActionTypeObject()
         * @generated
         */
		EDataType ACTION_TYPE_OBJECT = eINSTANCE.getActionTypeObject();

        /**
         * The meta object literal for the '<em>Expression Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.ExpressionType
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getExpressionTypeObject()
         * @generated
         */
        EDataType EXPRESSION_TYPE_OBJECT = eINSTANCE.getExpressionTypeObject();

        /**
         * The meta object literal for the '<em>Logger Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.LoggerType
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getLoggerTypeObject()
         * @generated
         */
        EDataType LOGGER_TYPE_OBJECT = eINSTANCE.getLoggerTypeObject();

        /**
         * The meta object literal for the '<em>Scope Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.ScopeType
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getScopeTypeObject()
         * @generated
         */
        EDataType SCOPE_TYPE_OBJECT = eINSTANCE.getScopeTypeObject();

	}

} //BPMPackage
