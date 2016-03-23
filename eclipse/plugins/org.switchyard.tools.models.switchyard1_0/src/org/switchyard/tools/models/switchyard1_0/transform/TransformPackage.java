/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.transform;

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
 * @see org.switchyard.tools.models.switchyard1_0.transform.TransformFactory
 * @model kind="package"
 * @generated
 */
public interface TransformPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "transform";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "urn:switchyard-config:transform:2.0";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "transform";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	TransformPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl.init();

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.transform.impl.CamelTransformTypeImpl <em>Camel Transform Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.CamelTransformTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getCamelTransformType()
     * @generated
     */
    int CAMEL_TRANSFORM_TYPE = 0;

    /**
     * The feature id for the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TRANSFORM_TYPE__FROM = SwitchyardPackage.TRANSFORM_TYPE__FROM;

    /**
     * The feature id for the '<em><b>To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TRANSFORM_TYPE__TO = SwitchyardPackage.TRANSFORM_TYPE__TO;

    /**
     * The feature id for the '<em><b>Endpoint Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TRANSFORM_TYPE__ENDPOINT_URI = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Camel Transform Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TRANSFORM_TYPE_FEATURE_COUNT = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.transform.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getDocumentRoot()
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
     * The feature id for the '<em><b>Transform Camel</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TRANSFORM_CAMEL = 3;

    /**
     * The feature id for the '<em><b>Transform Dozer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TRANSFORM_DOZER = 4;

    /**
     * The feature id for the '<em><b>Transform Java</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__TRANSFORM_JAVA = 5;

	/**
     * The feature id for the '<em><b>Transform Jaxb</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__TRANSFORM_JAXB = 6;

	/**
     * The feature id for the '<em><b>Transform Json</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__TRANSFORM_JSON = 7;

	/**
     * The feature id for the '<em><b>Transform Smooks</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__TRANSFORM_SMOOKS = 8;

	/**
     * The feature id for the '<em><b>Transform Xslt</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__TRANSFORM_XSLT = 9;

	/**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT_FEATURE_COUNT = 10;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.transform.impl.DozerFileEntryTypeImpl <em>Dozer File Entry Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.DozerFileEntryTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getDozerFileEntryType()
     * @generated
     */
    int DOZER_FILE_ENTRY_TYPE = 2;

    /**
     * The feature id for the '<em><b>File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOZER_FILE_ENTRY_TYPE__FILE = 0;

    /**
     * The number of structural features of the '<em>Dozer File Entry Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOZER_FILE_ENTRY_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.transform.impl.DozerMappingFilesTypeImpl <em>Dozer Mapping Files Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.DozerMappingFilesTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getDozerMappingFilesType()
     * @generated
     */
    int DOZER_MAPPING_FILES_TYPE = 3;

    /**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOZER_MAPPING_FILES_TYPE__ENTRY = 0;

    /**
     * The number of structural features of the '<em>Dozer Mapping Files Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOZER_MAPPING_FILES_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.transform.impl.DozerTransformTypeImpl <em>Dozer Transform Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.DozerTransformTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getDozerTransformType()
     * @generated
     */
    int DOZER_TRANSFORM_TYPE = 4;

    /**
     * The feature id for the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOZER_TRANSFORM_TYPE__FROM = SwitchyardPackage.TRANSFORM_TYPE__FROM;

    /**
     * The feature id for the '<em><b>To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOZER_TRANSFORM_TYPE__TO = SwitchyardPackage.TRANSFORM_TYPE__TO;

    /**
     * The feature id for the '<em><b>Mapping Files</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOZER_TRANSFORM_TYPE__MAPPING_FILES = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Dozer Transform Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOZER_TRANSFORM_TYPE_FEATURE_COUNT = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.transform.impl.JavaTransformType1Impl <em>Java Transform Type1</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.JavaTransformType1Impl
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getJavaTransformType1()
     * @generated
     */
	int JAVA_TRANSFORM_TYPE1 = 5;

	/**
     * The feature id for the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_TRANSFORM_TYPE1__FROM = SwitchyardPackage.TRANSFORM_TYPE__FROM;

	/**
     * The feature id for the '<em><b>To</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_TRANSFORM_TYPE1__TO = SwitchyardPackage.TRANSFORM_TYPE__TO;

	/**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_TRANSFORM_TYPE1__CLASS = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Bean</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_TRANSFORM_TYPE1__BEAN = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Java Transform Type1</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_TRANSFORM_TYPE1_FEATURE_COUNT = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.transform.impl.JAXBTransformTypeImpl <em>JAXB Transform Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.JAXBTransformTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getJAXBTransformType()
     * @generated
     */
	int JAXB_TRANSFORM_TYPE = 6;

	/**
     * The feature id for the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAXB_TRANSFORM_TYPE__FROM = SwitchyardPackage.TRANSFORM_TYPE__FROM;

	/**
     * The feature id for the '<em><b>To</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAXB_TRANSFORM_TYPE__TO = SwitchyardPackage.TRANSFORM_TYPE__TO;

	/**
     * The feature id for the '<em><b>Context Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAXB_TRANSFORM_TYPE__CONTEXT_PATH = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>JAXB Transform Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAXB_TRANSFORM_TYPE_FEATURE_COUNT = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.transform.impl.JsonTransformTypeImpl <em>Json Transform Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.JsonTransformTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getJsonTransformType()
     * @generated
     */
	int JSON_TRANSFORM_TYPE = 7;

	/**
     * The feature id for the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JSON_TRANSFORM_TYPE__FROM = SwitchyardPackage.TRANSFORM_TYPE__FROM;

	/**
     * The feature id for the '<em><b>To</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JSON_TRANSFORM_TYPE__TO = SwitchyardPackage.TRANSFORM_TYPE__TO;

	/**
     * The number of structural features of the '<em>Json Transform Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JSON_TRANSFORM_TYPE_FEATURE_COUNT = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.transform.impl.SmooksTransformType1Impl <em>Smooks Transform Type1</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.SmooksTransformType1Impl
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getSmooksTransformType1()
     * @generated
     */
	int SMOOKS_TRANSFORM_TYPE1 = 8;

	/**
     * The feature id for the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOOKS_TRANSFORM_TYPE1__FROM = SwitchyardPackage.TRANSFORM_TYPE__FROM;

	/**
     * The feature id for the '<em><b>To</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOOKS_TRANSFORM_TYPE1__TO = SwitchyardPackage.TRANSFORM_TYPE__TO;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMOOKS_TRANSFORM_TYPE1__TYPE = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Config</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMOOKS_TRANSFORM_TYPE1__CONFIG = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Report Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMOOKS_TRANSFORM_TYPE1__REPORT_PATH = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Smooks Transform Type1</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOOKS_TRANSFORM_TYPE1_FEATURE_COUNT = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 3;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.transform.impl.XsltTransformTypeImpl <em>Xslt Transform Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.XsltTransformTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getXsltTransformType()
     * @generated
     */
	int XSLT_TRANSFORM_TYPE = 9;

	/**
     * The feature id for the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int XSLT_TRANSFORM_TYPE__FROM = SwitchyardPackage.TRANSFORM_TYPE__FROM;

	/**
     * The feature id for the '<em><b>To</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int XSLT_TRANSFORM_TYPE__TO = SwitchyardPackage.TRANSFORM_TYPE__TO;

	/**
     * The feature id for the '<em><b>Xslt File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XSLT_TRANSFORM_TYPE__XSLT_FILE = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Fail On Warning</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XSLT_TRANSFORM_TYPE__FAIL_ON_WARNING = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Xslt Transform Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int XSLT_TRANSFORM_TYPE_FEATURE_COUNT = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType <em>Java Transform Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getJavaTransformType()
     * @generated
     */
	int JAVA_TRANSFORM_TYPE = 10;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType <em>Smooks Transform Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getSmooksTransformType()
     * @generated
     */
	int SMOOKS_TRANSFORM_TYPE = 11;

	/**
     * The meta object id for the '<em>Java Transform Type Object</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getJavaTransformTypeObject()
     * @generated
     */
	int JAVA_TRANSFORM_TYPE_OBJECT = 12;

	/**
     * The meta object id for the '<em>Smooks Transform Type Object</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType
     * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getSmooksTransformTypeObject()
     * @generated
     */
	int SMOOKS_TRANSFORM_TYPE_OBJECT = 13;


	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.transform.CamelTransformType <em>Camel Transform Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Transform Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.CamelTransformType
     * @generated
     */
    EClass getCamelTransformType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.transform.CamelTransformType#getEndpointUri <em>Endpoint Uri</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Endpoint Uri</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.CamelTransformType#getEndpointUri()
     * @see #getCamelTransformType()
     * @generated
     */
    EAttribute getCamelTransformType_EndpointUri();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot
     * @generated
     */
	EClass getDocumentRoot();

	/**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
	EAttribute getDocumentRoot_Mixed();

	/**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformCamel <em>Transform Camel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Transform Camel</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformCamel()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TransformCamel();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformDozer <em>Transform Dozer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Transform Dozer</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformDozer()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TransformDozer();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformJava <em>Transform Java</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Transform Java</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformJava()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_TransformJava();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformJaxb <em>Transform Jaxb</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Transform Jaxb</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformJaxb()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_TransformJaxb();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformJson <em>Transform Json</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Transform Json</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformJson()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_TransformJson();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformSmooks <em>Transform Smooks</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Transform Smooks</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformSmooks()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_TransformSmooks();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformXslt <em>Transform Xslt</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Transform Xslt</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformXslt()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_TransformXslt();

	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.transform.DozerFileEntryType <em>Dozer File Entry Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dozer File Entry Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DozerFileEntryType
     * @generated
     */
    EClass getDozerFileEntryType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.transform.DozerFileEntryType#getFile <em>File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DozerFileEntryType#getFile()
     * @see #getDozerFileEntryType()
     * @generated
     */
    EAttribute getDozerFileEntryType_File();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.transform.DozerMappingFilesType <em>Dozer Mapping Files Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dozer Mapping Files Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DozerMappingFilesType
     * @generated
     */
    EClass getDozerMappingFilesType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.transform.DozerMappingFilesType#getEntry <em>Entry</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Entry</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DozerMappingFilesType#getEntry()
     * @see #getDozerMappingFilesType()
     * @generated
     */
    EReference getDozerMappingFilesType_Entry();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.transform.DozerTransformType <em>Dozer Transform Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dozer Transform Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DozerTransformType
     * @generated
     */
    EClass getDozerTransformType();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.transform.DozerTransformType#getMappingFiles <em>Mapping Files</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Mapping Files</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.DozerTransformType#getMappingFiles()
     * @see #getDozerTransformType()
     * @generated
     */
    EReference getDozerTransformType_MappingFiles();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType1 <em>Java Transform Type1</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Java Transform Type1</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType1
     * @generated
     */
	EClass getJavaTransformType1();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType1#getClass_ <em>Class</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType1#getClass_()
     * @see #getJavaTransformType1()
     * @generated
     */
	EAttribute getJavaTransformType1_Class();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType1#getBean <em>Bean</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Bean</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType1#getBean()
     * @see #getJavaTransformType1()
     * @generated
     */
    EAttribute getJavaTransformType1_Bean();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType <em>JAXB Transform Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>JAXB Transform Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType
     * @generated
     */
	EClass getJAXBTransformType();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType#getContextPath <em>Context Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Context Path</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType#getContextPath()
     * @see #getJAXBTransformType()
     * @generated
     */
    EAttribute getJAXBTransformType_ContextPath();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.transform.JsonTransformType <em>Json Transform Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Json Transform Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.JsonTransformType
     * @generated
     */
	EClass getJsonTransformType();

	/**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1 <em>Smooks Transform Type1</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Smooks Transform Type1</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1
     * @generated
     */
	EClass getSmooksTransformType1();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1#getType()
     * @see #getSmooksTransformType1()
     * @generated
     */
    EAttribute getSmooksTransformType1_Type();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1#getConfig <em>Config</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Config</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1#getConfig()
     * @see #getSmooksTransformType1()
     * @generated
     */
    EAttribute getSmooksTransformType1_Config();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1#getReportPath <em>Report Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Report Path</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1#getReportPath()
     * @see #getSmooksTransformType1()
     * @generated
     */
    EAttribute getSmooksTransformType1_ReportPath();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType <em>Xslt Transform Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Xslt Transform Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType
     * @generated
     */
	EClass getXsltTransformType();

	/**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType#getXsltFile <em>Xslt File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xslt File</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType#getXsltFile()
     * @see #getXsltTransformType()
     * @generated
     */
    EAttribute getXsltTransformType_XsltFile();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType#getFailOnWarning <em>Fail On Warning</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fail On Warning</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType#getFailOnWarning()
     * @see #getXsltTransformType()
     * @generated
     */
    EAttribute getXsltTransformType_FailOnWarning();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType <em>Java Transform Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Java Transform Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType
     * @generated
     */
	EEnum getJavaTransformType();

	/**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType <em>Smooks Transform Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Smooks Transform Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType
     * @generated
     */
	EEnum getSmooksTransformType();

	/**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType <em>Java Transform Type Object</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Java Transform Type Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType"
     *        extendedMetaData="name='javaTransformType:Object' baseType='javaTransformType'"
     * @generated
     */
	EDataType getJavaTransformTypeObject();

	/**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType <em>Smooks Transform Type Object</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Smooks Transform Type Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType"
     *        extendedMetaData="name='smooksTransformType:Object' baseType='smooksTransformType'"
     * @generated
     */
	EDataType getSmooksTransformTypeObject();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	TransformFactory getTransformFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.transform.impl.CamelTransformTypeImpl <em>Camel Transform Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.CamelTransformTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getCamelTransformType()
         * @generated
         */
        EClass CAMEL_TRANSFORM_TYPE = eINSTANCE.getCamelTransformType();

        /**
         * The meta object literal for the '<em><b>Endpoint Uri</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_TRANSFORM_TYPE__ENDPOINT_URI = eINSTANCE.getCamelTransformType_EndpointUri();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.transform.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Transform Camel</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__TRANSFORM_CAMEL = eINSTANCE.getDocumentRoot_TransformCamel();

        /**
         * The meta object literal for the '<em><b>Transform Dozer</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__TRANSFORM_DOZER = eINSTANCE.getDocumentRoot_TransformDozer();

        /**
         * The meta object literal for the '<em><b>Transform Java</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__TRANSFORM_JAVA = eINSTANCE.getDocumentRoot_TransformJava();

		/**
         * The meta object literal for the '<em><b>Transform Jaxb</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__TRANSFORM_JAXB = eINSTANCE.getDocumentRoot_TransformJaxb();

		/**
         * The meta object literal for the '<em><b>Transform Json</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__TRANSFORM_JSON = eINSTANCE.getDocumentRoot_TransformJson();

		/**
         * The meta object literal for the '<em><b>Transform Smooks</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__TRANSFORM_SMOOKS = eINSTANCE.getDocumentRoot_TransformSmooks();

		/**
         * The meta object literal for the '<em><b>Transform Xslt</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__TRANSFORM_XSLT = eINSTANCE.getDocumentRoot_TransformXslt();

		/**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.transform.impl.DozerFileEntryTypeImpl <em>Dozer File Entry Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.DozerFileEntryTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getDozerFileEntryType()
         * @generated
         */
        EClass DOZER_FILE_ENTRY_TYPE = eINSTANCE.getDozerFileEntryType();

        /**
         * The meta object literal for the '<em><b>File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOZER_FILE_ENTRY_TYPE__FILE = eINSTANCE.getDozerFileEntryType_File();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.transform.impl.DozerMappingFilesTypeImpl <em>Dozer Mapping Files Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.DozerMappingFilesTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getDozerMappingFilesType()
         * @generated
         */
        EClass DOZER_MAPPING_FILES_TYPE = eINSTANCE.getDozerMappingFilesType();

        /**
         * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOZER_MAPPING_FILES_TYPE__ENTRY = eINSTANCE.getDozerMappingFilesType_Entry();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.transform.impl.DozerTransformTypeImpl <em>Dozer Transform Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.DozerTransformTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getDozerTransformType()
         * @generated
         */
        EClass DOZER_TRANSFORM_TYPE = eINSTANCE.getDozerTransformType();

        /**
         * The meta object literal for the '<em><b>Mapping Files</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOZER_TRANSFORM_TYPE__MAPPING_FILES = eINSTANCE.getDozerTransformType_MappingFiles();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.transform.impl.JavaTransformType1Impl <em>Java Transform Type1</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.JavaTransformType1Impl
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getJavaTransformType1()
         * @generated
         */
		EClass JAVA_TRANSFORM_TYPE1 = eINSTANCE.getJavaTransformType1();

		/**
         * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute JAVA_TRANSFORM_TYPE1__CLASS = eINSTANCE.getJavaTransformType1_Class();

		/**
         * The meta object literal for the '<em><b>Bean</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JAVA_TRANSFORM_TYPE1__BEAN = eINSTANCE.getJavaTransformType1_Bean();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.transform.impl.JAXBTransformTypeImpl <em>JAXB Transform Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.JAXBTransformTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getJAXBTransformType()
         * @generated
         */
		EClass JAXB_TRANSFORM_TYPE = eINSTANCE.getJAXBTransformType();

		/**
         * The meta object literal for the '<em><b>Context Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JAXB_TRANSFORM_TYPE__CONTEXT_PATH = eINSTANCE.getJAXBTransformType_ContextPath();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.transform.impl.JsonTransformTypeImpl <em>Json Transform Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.JsonTransformTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getJsonTransformType()
         * @generated
         */
		EClass JSON_TRANSFORM_TYPE = eINSTANCE.getJsonTransformType();

		/**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.transform.impl.SmooksTransformType1Impl <em>Smooks Transform Type1</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.SmooksTransformType1Impl
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getSmooksTransformType1()
         * @generated
         */
		EClass SMOOKS_TRANSFORM_TYPE1 = eINSTANCE.getSmooksTransformType1();

		/**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SMOOKS_TRANSFORM_TYPE1__TYPE = eINSTANCE.getSmooksTransformType1_Type();

        /**
         * The meta object literal for the '<em><b>Config</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SMOOKS_TRANSFORM_TYPE1__CONFIG = eINSTANCE.getSmooksTransformType1_Config();

        /**
         * The meta object literal for the '<em><b>Report Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SMOOKS_TRANSFORM_TYPE1__REPORT_PATH = eINSTANCE.getSmooksTransformType1_ReportPath();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.transform.impl.XsltTransformTypeImpl <em>Xslt Transform Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.XsltTransformTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getXsltTransformType()
         * @generated
         */
		EClass XSLT_TRANSFORM_TYPE = eINSTANCE.getXsltTransformType();

		/**
         * The meta object literal for the '<em><b>Xslt File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XSLT_TRANSFORM_TYPE__XSLT_FILE = eINSTANCE.getXsltTransformType_XsltFile();

        /**
         * The meta object literal for the '<em><b>Fail On Warning</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XSLT_TRANSFORM_TYPE__FAIL_ON_WARNING = eINSTANCE.getXsltTransformType_FailOnWarning();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType <em>Java Transform Type</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getJavaTransformType()
         * @generated
         */
		EEnum JAVA_TRANSFORM_TYPE = eINSTANCE.getJavaTransformType();

		/**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType <em>Smooks Transform Type</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getSmooksTransformType()
         * @generated
         */
		EEnum SMOOKS_TRANSFORM_TYPE = eINSTANCE.getSmooksTransformType();

		/**
         * The meta object literal for the '<em>Java Transform Type Object</em>' data type.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getJavaTransformTypeObject()
         * @generated
         */
		EDataType JAVA_TRANSFORM_TYPE_OBJECT = eINSTANCE.getJavaTransformTypeObject();

		/**
         * The meta object literal for the '<em>Smooks Transform Type Object</em>' data type.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType
         * @see org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl#getSmooksTransformTypeObject()
         * @generated
         */
		EDataType SMOOKS_TRANSFORM_TYPE_OBJECT = eINSTANCE.getSmooksTransformTypeObject();

	}

} //TransformPackage
