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
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl <em>Binding Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getSOAPBindingType()
     * @generated
     */
	int SOAP_BINDING_TYPE = 2;

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
     * The feature id for the '<em><b>Message Composer</b></em>' reference.
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
     * The number of structural features of the '<em>Binding Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SOAP_BINDING_TYPE_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 6;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType <em>Soap Headers Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getSoapHeadersType()
     * @generated
     */
    int SOAP_HEADERS_TYPE = 3;

    /**
     * The meta object id for the '<em>Soap Headers Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getSoapHeadersTypeObject()
     * @generated
     */
    int SOAP_HEADERS_TYPE_OBJECT = 4;

    /**
     * The meta object id for the '<em>Wsdl Port Type</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl#getWsdlPortType()
     * @generated
     */
	int WSDL_PORT_TYPE = 5;


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
     * Returns the meta object for the reference '{@link org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType#getMessageComposer <em>Message Composer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Message Composer</em>'.
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
         * The meta object literal for the '<em><b>Message Composer</b></em>' reference feature.
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
