/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.core.model.addressing.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.soa.sca.core.model.addressing.AddressingFactory;
import org.eclipse.soa.sca.core.model.addressing.AddressingPackage;
import org.eclipse.soa.sca.core.model.addressing.AttributedQNameType;
import org.eclipse.soa.sca.core.model.addressing.AttributedURIType;
import org.eclipse.soa.sca.core.model.addressing.AttributedUnsignedLongType;
import org.eclipse.soa.sca.core.model.addressing.DocumentRoot;
import org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType;
import org.eclipse.soa.sca.core.model.addressing.MetadataType;
import org.eclipse.soa.sca.core.model.addressing.ProblemActionType;
import org.eclipse.soa.sca.core.model.addressing.ReferenceParametersType;
import org.eclipse.soa.sca.core.model.addressing.RelatesToType;
import org.eclipse.soa.sca.core.model.addressing.RelationshipType;

import org.eclipse.soa.sca.core.model.addressing.util.AddressingValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddressingPackageImpl extends EPackageImpl implements AddressingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedQNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedUnsignedLongTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedURITypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemActionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceParametersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatesToTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationshipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType faultCodesOpenEnumTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType faultCodesTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relationshipTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relationshipTypeOpenEnumEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AddressingPackageImpl() {
		super(eNS_URI, AddressingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AddressingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AddressingPackage init() {
		if (isInited) return (AddressingPackage)EPackage.Registry.INSTANCE.getEPackage(AddressingPackage.eNS_URI);

		// Obtain or create and register package
		AddressingPackageImpl theAddressingPackage = (AddressingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AddressingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AddressingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAddressingPackage.createPackageContents();

		// Initialize created meta-data
		theAddressingPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAddressingPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AddressingValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAddressingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AddressingPackage.eNS_URI, theAddressingPackage);
		return theAddressingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributedQNameType() {
		return attributedQNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedQNameType_Value() {
		return (EAttribute)attributedQNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedQNameType_AnyAttribute() {
		return (EAttribute)attributedQNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributedUnsignedLongType() {
		return attributedUnsignedLongTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedUnsignedLongType_Value() {
		return (EAttribute)attributedUnsignedLongTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedUnsignedLongType_AnyAttribute() {
		return (EAttribute)attributedUnsignedLongTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributedURIType() {
		return attributedURITypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedURIType_Value() {
		return (EAttribute)attributedURITypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedURIType_AnyAttribute() {
		return (EAttribute)attributedURITypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Action() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EndpointReference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FaultTo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_From() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageID() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Metadata() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProblemAction() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProblemHeaderQName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProblemIRI() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferenceParameters() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelatesTo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReplyTo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RetryAfter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_To() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IsReferenceParameter() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpointReferenceType() {
		return endpointReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpointReferenceType_Address() {
		return (EReference)endpointReferenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpointReferenceType_ReferenceParameters() {
		return (EReference)endpointReferenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpointReferenceType_Metadata() {
		return (EReference)endpointReferenceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointReferenceType_Any() {
		return (EAttribute)endpointReferenceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointReferenceType_AnyAttribute() {
		return (EAttribute)endpointReferenceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataType() {
		return metadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataType_Any() {
		return (EAttribute)metadataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataType_AnyAttribute() {
		return (EAttribute)metadataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemActionType() {
		return problemActionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblemActionType_Action() {
		return (EReference)problemActionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProblemActionType_SoapAction() {
		return (EAttribute)problemActionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProblemActionType_AnyAttribute() {
		return (EAttribute)problemActionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceParametersType() {
		return referenceParametersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceParametersType_Any() {
		return (EAttribute)referenceParametersTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceParametersType_AnyAttribute() {
		return (EAttribute)referenceParametersTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelatesToType() {
		return relatesToTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelatesToType_Value() {
		return (EAttribute)relatesToTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelatesToType_RelationshipType() {
		return (EAttribute)relatesToTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelatesToType_AnyAttribute() {
		return (EAttribute)relatesToTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationshipType() {
		return relationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFaultCodesOpenEnumType() {
		return faultCodesOpenEnumTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFaultCodesType() {
		return faultCodesTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelationshipTypeObject() {
		return relationshipTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelationshipTypeOpenEnum() {
		return relationshipTypeOpenEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressingFactory getAddressingFactory() {
		return (AddressingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		attributedQNameTypeEClass = createEClass(ATTRIBUTED_QNAME_TYPE);
		createEAttribute(attributedQNameTypeEClass, ATTRIBUTED_QNAME_TYPE__VALUE);
		createEAttribute(attributedQNameTypeEClass, ATTRIBUTED_QNAME_TYPE__ANY_ATTRIBUTE);

		attributedUnsignedLongTypeEClass = createEClass(ATTRIBUTED_UNSIGNED_LONG_TYPE);
		createEAttribute(attributedUnsignedLongTypeEClass, ATTRIBUTED_UNSIGNED_LONG_TYPE__VALUE);
		createEAttribute(attributedUnsignedLongTypeEClass, ATTRIBUTED_UNSIGNED_LONG_TYPE__ANY_ATTRIBUTE);

		attributedURITypeEClass = createEClass(ATTRIBUTED_URI_TYPE);
		createEAttribute(attributedURITypeEClass, ATTRIBUTED_URI_TYPE__VALUE);
		createEAttribute(attributedURITypeEClass, ATTRIBUTED_URI_TYPE__ANY_ATTRIBUTE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENDPOINT_REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FAULT_TO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FROM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MESSAGE_ID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__METADATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROBLEM_ACTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROBLEM_HEADER_QNAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROBLEM_IRI);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REFERENCE_PARAMETERS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RELATES_TO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REPLY_TO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RETRY_AFTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TO);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__IS_REFERENCE_PARAMETER);

		endpointReferenceTypeEClass = createEClass(ENDPOINT_REFERENCE_TYPE);
		createEReference(endpointReferenceTypeEClass, ENDPOINT_REFERENCE_TYPE__ADDRESS);
		createEReference(endpointReferenceTypeEClass, ENDPOINT_REFERENCE_TYPE__REFERENCE_PARAMETERS);
		createEReference(endpointReferenceTypeEClass, ENDPOINT_REFERENCE_TYPE__METADATA);
		createEAttribute(endpointReferenceTypeEClass, ENDPOINT_REFERENCE_TYPE__ANY);
		createEAttribute(endpointReferenceTypeEClass, ENDPOINT_REFERENCE_TYPE__ANY_ATTRIBUTE);

		metadataTypeEClass = createEClass(METADATA_TYPE);
		createEAttribute(metadataTypeEClass, METADATA_TYPE__ANY);
		createEAttribute(metadataTypeEClass, METADATA_TYPE__ANY_ATTRIBUTE);

		problemActionTypeEClass = createEClass(PROBLEM_ACTION_TYPE);
		createEReference(problemActionTypeEClass, PROBLEM_ACTION_TYPE__ACTION);
		createEAttribute(problemActionTypeEClass, PROBLEM_ACTION_TYPE__SOAP_ACTION);
		createEAttribute(problemActionTypeEClass, PROBLEM_ACTION_TYPE__ANY_ATTRIBUTE);

		referenceParametersTypeEClass = createEClass(REFERENCE_PARAMETERS_TYPE);
		createEAttribute(referenceParametersTypeEClass, REFERENCE_PARAMETERS_TYPE__ANY);
		createEAttribute(referenceParametersTypeEClass, REFERENCE_PARAMETERS_TYPE__ANY_ATTRIBUTE);

		relatesToTypeEClass = createEClass(RELATES_TO_TYPE);
		createEAttribute(relatesToTypeEClass, RELATES_TO_TYPE__VALUE);
		createEAttribute(relatesToTypeEClass, RELATES_TO_TYPE__RELATIONSHIP_TYPE);
		createEAttribute(relatesToTypeEClass, RELATES_TO_TYPE__ANY_ATTRIBUTE);

		// Create enums
		relationshipTypeEEnum = createEEnum(RELATIONSHIP_TYPE);

		// Create data types
		faultCodesOpenEnumTypeEDataType = createEDataType(FAULT_CODES_OPEN_ENUM_TYPE);
		faultCodesTypeEDataType = createEDataType(FAULT_CODES_TYPE);
		relationshipTypeObjectEDataType = createEDataType(RELATIONSHIP_TYPE_OBJECT);
		relationshipTypeOpenEnumEDataType = createEDataType(RELATIONSHIP_TYPE_OPEN_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(attributedQNameTypeEClass, AttributedQNameType.class, "AttributedQNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributedQNameType_Value(), theXMLTypePackage.getQName(), "value", null, 0, 1, AttributedQNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributedQNameType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AttributedQNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributedUnsignedLongTypeEClass, AttributedUnsignedLongType.class, "AttributedUnsignedLongType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributedUnsignedLongType_Value(), theXMLTypePackage.getUnsignedLong(), "value", null, 0, 1, AttributedUnsignedLongType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributedUnsignedLongType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AttributedUnsignedLongType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributedURITypeEClass, AttributedURIType.class, "AttributedURIType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributedURIType_Value(), theXMLTypePackage.getAnyURI(), "value", null, 0, 1, AttributedURIType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributedURIType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AttributedURIType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Action(), this.getAttributedURIType(), null, "action", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EndpointReference(), this.getEndpointReferenceType(), null, "endpointReference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FaultTo(), this.getEndpointReferenceType(), null, "faultTo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_From(), this.getEndpointReferenceType(), null, "from", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MessageID(), this.getAttributedURIType(), null, "messageID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Metadata(), this.getMetadataType(), null, "metadata", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ProblemAction(), this.getProblemActionType(), null, "problemAction", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ProblemHeaderQName(), this.getAttributedQNameType(), null, "problemHeaderQName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ProblemIRI(), this.getAttributedURIType(), null, "problemIRI", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ReferenceParameters(), this.getReferenceParametersType(), null, "referenceParameters", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RelatesTo(), this.getRelatesToType(), null, "relatesTo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ReplyTo(), this.getEndpointReferenceType(), null, "replyTo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RetryAfter(), this.getAttributedUnsignedLongType(), null, "retryAfter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_To(), this.getAttributedURIType(), null, "to", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_IsReferenceParameter(), theXMLTypePackage.getBoolean(), "isReferenceParameter", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endpointReferenceTypeEClass, EndpointReferenceType.class, "EndpointReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndpointReferenceType_Address(), this.getAttributedURIType(), null, "address", null, 1, 1, EndpointReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndpointReferenceType_ReferenceParameters(), this.getReferenceParametersType(), null, "referenceParameters", null, 0, 1, EndpointReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndpointReferenceType_Metadata(), this.getMetadataType(), null, "metadata", null, 0, 1, EndpointReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpointReferenceType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, EndpointReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpointReferenceType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, EndpointReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataTypeEClass, MetadataType.class, "MetadataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetadataType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, MetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadataType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, MetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(problemActionTypeEClass, ProblemActionType.class, "ProblemActionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProblemActionType_Action(), this.getAttributedURIType(), null, "action", null, 0, 1, ProblemActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProblemActionType_SoapAction(), theXMLTypePackage.getAnyURI(), "soapAction", null, 0, 1, ProblemActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProblemActionType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ProblemActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceParametersTypeEClass, ReferenceParametersType.class, "ReferenceParametersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceParametersType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ReferenceParametersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceParametersType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ReferenceParametersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relatesToTypeEClass, RelatesToType.class, "RelatesToType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelatesToType_Value(), theXMLTypePackage.getAnyURI(), "value", null, 0, 1, RelatesToType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelatesToType_RelationshipType(), this.getRelationshipTypeOpenEnum(), "relationshipType", "http://www.w3.org/2005/08/addressing/reply", 0, 1, RelatesToType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelatesToType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, RelatesToType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(relationshipTypeEEnum, RelationshipType.class, "RelationshipType");
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.HTTP_WWW_W3_ORG200508_ADDRESSING_REPLY);

		// Initialize data types
		initEDataType(faultCodesOpenEnumTypeEDataType, QName.class, "FaultCodesOpenEnumType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(faultCodesTypeEDataType, QName.class, "FaultCodesType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(relationshipTypeObjectEDataType, RelationshipType.class, "RelationshipTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(relationshipTypeOpenEnumEDataType, Object.class, "RelationshipTypeOpenEnum", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (attributedQNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AttributedQNameType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedQNameType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedQNameType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (attributedUnsignedLongTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AttributedUnsignedLongType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedUnsignedLongType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedUnsignedLongType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (attributedURITypeEClass, 
		   source, 
		   new String[] {
			 "name", "AttributedURIType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedURIType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedURIType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Action(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Action",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_EndpointReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EndpointReference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FaultTo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FaultTo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_From(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "From",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MessageID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MessageID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Metadata",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ProblemAction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProblemAction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ProblemHeaderQName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProblemHeaderQName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ProblemIRI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProblemIRI",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ReferenceParameters(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ReferenceParameters",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RelatesTo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RelatesTo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ReplyTo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ReplyTo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RetryAfter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RetryAfter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_To(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "To",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_IsReferenceParameter(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IsReferenceParameter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (endpointReferenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EndpointReferenceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEndpointReferenceType_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEndpointReferenceType_ReferenceParameters(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ReferenceParameters",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEndpointReferenceType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Metadata",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEndpointReferenceType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getEndpointReferenceType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "lax"
		   });		
		addAnnotation
		  (faultCodesOpenEnumTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "FaultCodesOpenEnumType",
			 "memberTypes", "FaultCodesType http://www.eclipse.org/emf/2003/XMLType#QName"
		   });		
		addAnnotation
		  (faultCodesTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "FaultCodesType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#QName",
			 "enumeration", "{http://www.w3.org/2005/08/addressing}InvalidAddressingHeader {http://www.w3.org/2005/08/addressing}InvalidAddress {http://www.w3.org/2005/08/addressing}InvalidEPR {http://www.w3.org/2005/08/addressing}InvalidCardinality {http://www.w3.org/2005/08/addressing}MissingAddressInEPR {http://www.w3.org/2005/08/addressing}DuplicateMessageID {http://www.w3.org/2005/08/addressing}ActionMismatch {http://www.w3.org/2005/08/addressing}MessageAddressingHeaderRequired {http://www.w3.org/2005/08/addressing}DestinationUnreachable {http://www.w3.org/2005/08/addressing}ActionNotSupported {http://www.w3.org/2005/08/addressing}EndpointUnavailable"
		   });		
		addAnnotation
		  (metadataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MetadataType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMetadataType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getMetadataType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (problemActionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ProblemActionType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProblemActionType_Action(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Action",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getProblemActionType_SoapAction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SoapAction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getProblemActionType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });		
		addAnnotation
		  (referenceParametersTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ReferenceParametersType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getReferenceParametersType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getReferenceParametersType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (relatesToTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RelatesToType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getRelatesToType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getRelatesToType_RelationshipType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "RelationshipType"
		   });		
		addAnnotation
		  (getRelatesToType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });		
		addAnnotation
		  (relationshipTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "RelationshipType"
		   });		
		addAnnotation
		  (relationshipTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "RelationshipType:Object",
			 "baseType", "RelationshipType"
		   });		
		addAnnotation
		  (relationshipTypeOpenEnumEDataType, 
		   source, 
		   new String[] {
			 "name", "RelationshipTypeOpenEnum",
			 "memberTypes", "RelationshipType http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });
	}

} //AddressingPackageImpl
