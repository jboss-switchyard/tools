/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.validate;

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
 * @see org.switchyard.tools.models.switchyard1_0.validate.ValidateFactory
 * @model kind="package"
 * @generated
 */
public interface ValidatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "validate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:switchyard-config:validate:1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "validate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValidatePackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.validate.impl.ValidatePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.validate.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.validate.impl.DocumentRootImpl
	 * @see org.switchyard.tools.models.switchyard1_0.validate.impl.ValidatePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

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
	 * The feature id for the '<em><b>Validate Java</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALIDATE_JAVA = 3;

	/**
	 * The feature id for the '<em><b>Validate Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALIDATE_XML = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.validate.impl.JavaValidateTypeImpl <em>Java Validate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.validate.impl.JavaValidateTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.validate.impl.ValidatePackageImpl#getJavaValidateType()
	 * @generated
	 */
	int JAVA_VALIDATE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VALIDATE_TYPE__NAME = SwitchyardPackage.VALIDATE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Java Validate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VALIDATE_TYPE_FEATURE_COUNT = SwitchyardPackage.VALIDATE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.validate.impl.XmlValidateTypeImpl <em>Xml Validate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.validate.impl.XmlValidateTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.validate.impl.ValidatePackageImpl#getXmlValidateType()
	 * @generated
	 */
	int XML_VALIDATE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_VALIDATE_TYPE__NAME = SwitchyardPackage.VALIDATE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Xml Validate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_VALIDATE_TYPE_FEATURE_COUNT = SwitchyardPackage.VALIDATE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.validate.XmlSchemaType <em>Xml Schema Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.validate.XmlSchemaType
	 * @see org.switchyard.tools.models.switchyard1_0.validate.impl.ValidatePackageImpl#getXmlSchemaType()
	 * @generated
	 */
	int XML_SCHEMA_TYPE = 3;

	/**
	 * The meta object id for the '<em>Xml Schema Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.validate.XmlSchemaType
	 * @see org.switchyard.tools.models.switchyard1_0.validate.impl.ValidatePackageImpl#getXmlSchemaTypeObject()
	 * @generated
	 */
	int XML_SCHEMA_TYPE_OBJECT = 4;


	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.validate.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.validate.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.validate.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.validate.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.validate.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.validate.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.validate.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.validate.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.validate.DocumentRoot#getValidateJava <em>Validate Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validate Java</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.validate.DocumentRoot#getValidateJava()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValidateJava();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.validate.DocumentRoot#getValidateXml <em>Validate Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validate Xml</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.validate.DocumentRoot#getValidateXml()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValidateXml();

	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.validate.JavaValidateType <em>Java Validate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Validate Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.validate.JavaValidateType
	 * @generated
	 */
	EClass getJavaValidateType();

	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType <em>Xml Validate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Validate Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType
	 * @generated
	 */
	EClass getXmlValidateType();

	/**
	 * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.validate.XmlSchemaType <em>Xml Schema Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Xml Schema Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.validate.XmlSchemaType
	 * @generated
	 */
	EEnum getXmlSchemaType();

	/**
	 * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.validate.XmlSchemaType <em>Xml Schema Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Xml Schema Type Object</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.validate.XmlSchemaType
	 * @model instanceClass="org.switchyard.tools.models.switchyard1_0.validate.XmlSchemaType"
	 *        extendedMetaData="name='xmlSchemaType:Object' baseType='xmlSchemaType'"
	 * @generated
	 */
	EDataType getXmlSchemaTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValidateFactory getValidateFactory();

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
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.validate.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.validate.impl.DocumentRootImpl
		 * @see org.switchyard.tools.models.switchyard1_0.validate.impl.ValidatePackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Validate Java</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALIDATE_JAVA = eINSTANCE.getDocumentRoot_ValidateJava();

		/**
		 * The meta object literal for the '<em><b>Validate Xml</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALIDATE_XML = eINSTANCE.getDocumentRoot_ValidateXml();

		/**
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.validate.impl.JavaValidateTypeImpl <em>Java Validate Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.validate.impl.JavaValidateTypeImpl
		 * @see org.switchyard.tools.models.switchyard1_0.validate.impl.ValidatePackageImpl#getJavaValidateType()
		 * @generated
		 */
		EClass JAVA_VALIDATE_TYPE = eINSTANCE.getJavaValidateType();

		/**
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.validate.impl.XmlValidateTypeImpl <em>Xml Validate Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.validate.impl.XmlValidateTypeImpl
		 * @see org.switchyard.tools.models.switchyard1_0.validate.impl.ValidatePackageImpl#getXmlValidateType()
		 * @generated
		 */
		EClass XML_VALIDATE_TYPE = eINSTANCE.getXmlValidateType();

		/**
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.validate.XmlSchemaType <em>Xml Schema Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.validate.XmlSchemaType
		 * @see org.switchyard.tools.models.switchyard1_0.validate.impl.ValidatePackageImpl#getXmlSchemaType()
		 * @generated
		 */
		EEnum XML_SCHEMA_TYPE = eINSTANCE.getXmlSchemaType();

		/**
		 * The meta object literal for the '<em>Xml Schema Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.validate.XmlSchemaType
		 * @see org.switchyard.tools.models.switchyard1_0.validate.impl.ValidatePackageImpl#getXmlSchemaTypeObject()
		 * @generated
		 */
		EDataType XML_SCHEMA_TYPE_OBJECT = eINSTANCE.getXmlSchemaTypeObject();

	}

} //ValidatePackage
