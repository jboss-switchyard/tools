/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFactory
 * @model kind="package"
 * @generated
 */
public interface CamelPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "camel";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "urn:switchyard-component-camel:config:2.0";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "camel";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	CamelPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl.init();

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.JavaDSLTypeImpl <em>Java DSL Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.JavaDSLTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getJavaDSLType()
     * @generated
     */
    int JAVA_DSL_TYPE = 0;

    /**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_DSL_TYPE__CLASS = 0;

    /**
     * The number of structural features of the '<em>Java DSL Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_DSL_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.XMLDSLTypeImpl <em>XMLDSL Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.XMLDSLTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getXMLDSLType()
     * @generated
     */
    int XMLDSL_TYPE = 1;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XMLDSL_TYPE__PATH = 0;

    /**
     * The number of structural features of the '<em>XMLDSL Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XMLDSL_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelImplementationTypeImpl <em>Implementation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelImplementationTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelImplementationType()
     * @generated
     */
    int CAMEL_IMPLEMENTATION_TYPE = 2;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_IMPLEMENTATION_TYPE__DOCUMENTATION = ScaPackage.IMPLEMENTATION__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_IMPLEMENTATION_TYPE__ANY_ATTRIBUTE = ScaPackage.IMPLEMENTATION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_IMPLEMENTATION_TYPE__POLICY_SETS = ScaPackage.IMPLEMENTATION__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_IMPLEMENTATION_TYPE__REQUIRES = ScaPackage.IMPLEMENTATION__REQUIRES;

    /**
     * The feature id for the '<em><b>Route</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_IMPLEMENTATION_TYPE__ROUTE = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Java</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_IMPLEMENTATION_TYPE__JAVA = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Xml</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_IMPLEMENTATION_TYPE__XML = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Implementation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_IMPLEMENTATION_TYPE_FEATURE_COUNT = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getDocumentRoot()
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
     * The feature id for the '<em><b>Implementation Camel</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__IMPLEMENTATION_CAMEL = 3;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType <em>Java DSL Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Java DSL Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType
     * @generated
     */
    EClass getJavaDSLType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType#getClass_ <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType#getClass_()
     * @see #getJavaDSLType()
     * @generated
     */
    EAttribute getJavaDSLType_Class();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType <em>XMLDSL Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XMLDSL Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType
     * @generated
     */
    EClass getXMLDSLType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType#getPath <em>Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Path</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType#getPath()
     * @see #getXMLDSLType()
     * @generated
     */
    EAttribute getXMLDSLType_Path();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType <em>Implementation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Implementation Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType
     * @generated
     */
    EClass getCamelImplementationType();

    /**
     * Returns the meta object for the reference '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType#getRoute <em>Route</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Route</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType#getRoute()
     * @see #getCamelImplementationType()
     * @generated
     */
    EReference getCamelImplementationType_Route();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType#getJava <em>Java</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Java</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType#getJava()
     * @see #getCamelImplementationType()
     * @generated
     */
    EReference getCamelImplementationType_Java();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType#getXml <em>Xml</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Xml</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType#getXml()
     * @see #getCamelImplementationType()
     * @generated
     */
    EReference getCamelImplementationType_Xml();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot
     * @generated
     */
	EClass getDocumentRoot();

	/**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
	EAttribute getDocumentRoot_Mixed();

	/**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getImplementationCamel <em>Implementation Camel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Implementation Camel</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getImplementationCamel()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ImplementationCamel();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	CamelFactory getCamelFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.JavaDSLTypeImpl <em>Java DSL Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.JavaDSLTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getJavaDSLType()
         * @generated
         */
        EClass JAVA_DSL_TYPE = eINSTANCE.getJavaDSLType();

        /**
         * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JAVA_DSL_TYPE__CLASS = eINSTANCE.getJavaDSLType_Class();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.XMLDSLTypeImpl <em>XMLDSL Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.XMLDSLTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getXMLDSLType()
         * @generated
         */
        EClass XMLDSL_TYPE = eINSTANCE.getXMLDSLType();

        /**
         * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XMLDSL_TYPE__PATH = eINSTANCE.getXMLDSLType_Path();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelImplementationTypeImpl <em>Implementation Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelImplementationTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelImplementationType()
         * @generated
         */
        EClass CAMEL_IMPLEMENTATION_TYPE = eINSTANCE.getCamelImplementationType();

        /**
         * The meta object literal for the '<em><b>Route</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_IMPLEMENTATION_TYPE__ROUTE = eINSTANCE.getCamelImplementationType_Route();

        /**
         * The meta object literal for the '<em><b>Java</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_IMPLEMENTATION_TYPE__JAVA = eINSTANCE.getCamelImplementationType_Java();

        /**
         * The meta object literal for the '<em><b>Xml</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_IMPLEMENTATION_TYPE__XML = eINSTANCE.getCamelImplementationType_Xml();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Implementation Camel</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__IMPLEMENTATION_CAMEL = eINSTANCE.getDocumentRoot_ImplementationCamel();

	}

} //CamelPackage
