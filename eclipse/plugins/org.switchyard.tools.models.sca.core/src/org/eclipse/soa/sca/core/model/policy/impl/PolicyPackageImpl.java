/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.core.model.policy.impl;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.soa.sca.core.model.policy.AppliesToType;
import org.eclipse.soa.sca.core.model.policy.DocumentRoot;
import org.eclipse.soa.sca.core.model.policy.OperatorContentType;
import org.eclipse.soa.sca.core.model.policy.PolicyAttachmentType;
import org.eclipse.soa.sca.core.model.policy.PolicyFactory;
import org.eclipse.soa.sca.core.model.policy.PolicyPackage;
import org.eclipse.soa.sca.core.model.policy.PolicyReferenceType;
import org.eclipse.soa.sca.core.model.policy.PolicyType;

import org.eclipse.soa.sca.core.model.policy.util.PolicyValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyPackageImpl extends EPackageImpl implements PolicyPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass appliesToTypeEClass = null;

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
	private EClass operatorContentTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass policyAttachmentTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass policyReferenceTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass policyTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType policyURIsTypeEDataType = null;

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
     * @see org.eclipse.soa.sca.core.model.policy.PolicyPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private PolicyPackageImpl() {
        super(eNS_URI, PolicyFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link PolicyPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static PolicyPackage init() {
        if (isInited) return (PolicyPackage)EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);

        // Obtain or create and register package
        PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PolicyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PolicyPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        thePolicyPackage.createPackageContents();

        // Initialize created meta-data
        thePolicyPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (thePolicyPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return PolicyValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        thePolicyPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(PolicyPackage.eNS_URI, thePolicyPackage);
        return thePolicyPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAppliesToType() {
        return appliesToTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAppliesToType_Any() {
        return (EAttribute)appliesToTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAppliesToType_AnyAttribute() {
        return (EAttribute)appliesToTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_All() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_AppliesTo() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ExactlyOne() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Policy() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_PolicyAttachment() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_PolicyReference() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDocumentRoot_Optional() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDocumentRoot_PolicyURIs() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getOperatorContentType() {
        return operatorContentTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOperatorContentType_Group() {
        return (EAttribute)operatorContentTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOperatorContentType_Policy() {
        return (EReference)operatorContentTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOperatorContentType_All() {
        return (EReference)operatorContentTypeEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOperatorContentType_ExactlyOne() {
        return (EReference)operatorContentTypeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOperatorContentType_PolicyReference() {
        return (EReference)operatorContentTypeEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOperatorContentType_Any() {
        return (EAttribute)operatorContentTypeEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPolicyAttachmentType() {
        return policyAttachmentTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPolicyAttachmentType_AppliesTo() {
        return (EReference)policyAttachmentTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicyAttachmentType_Group() {
        return (EAttribute)policyAttachmentTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPolicyAttachmentType_Policy() {
        return (EReference)policyAttachmentTypeEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPolicyAttachmentType_PolicyReference() {
        return (EReference)policyAttachmentTypeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicyAttachmentType_Any() {
        return (EAttribute)policyAttachmentTypeEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicyAttachmentType_AnyAttribute() {
        return (EAttribute)policyAttachmentTypeEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPolicyReferenceType() {
        return policyReferenceTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicyReferenceType_Digest() {
        return (EAttribute)policyReferenceTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicyReferenceType_DigestAlgorithm() {
        return (EAttribute)policyReferenceTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicyReferenceType_URI() {
        return (EAttribute)policyReferenceTypeEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicyReferenceType_AnyAttribute() {
        return (EAttribute)policyReferenceTypeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPolicyType() {
        return policyTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicyType_Id() {
        return (EAttribute)policyTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicyType_Name() {
        return (EAttribute)policyTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicyType_AnyAttribute() {
        return (EAttribute)policyTypeEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getPolicyURIsType() {
        return policyURIsTypeEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PolicyFactory getPolicyFactory() {
        return (PolicyFactory)getEFactoryInstance();
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
        appliesToTypeEClass = createEClass(APPLIES_TO_TYPE);
        createEAttribute(appliesToTypeEClass, APPLIES_TO_TYPE__ANY);
        createEAttribute(appliesToTypeEClass, APPLIES_TO_TYPE__ANY_ATTRIBUTE);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__ALL);
        createEReference(documentRootEClass, DOCUMENT_ROOT__APPLIES_TO);
        createEReference(documentRootEClass, DOCUMENT_ROOT__EXACTLY_ONE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__POLICY);
        createEReference(documentRootEClass, DOCUMENT_ROOT__POLICY_ATTACHMENT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__POLICY_REFERENCE);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__OPTIONAL);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__POLICY_UR_IS);

        operatorContentTypeEClass = createEClass(OPERATOR_CONTENT_TYPE);
        createEAttribute(operatorContentTypeEClass, OPERATOR_CONTENT_TYPE__GROUP);
        createEReference(operatorContentTypeEClass, OPERATOR_CONTENT_TYPE__POLICY);
        createEReference(operatorContentTypeEClass, OPERATOR_CONTENT_TYPE__ALL);
        createEReference(operatorContentTypeEClass, OPERATOR_CONTENT_TYPE__EXACTLY_ONE);
        createEReference(operatorContentTypeEClass, OPERATOR_CONTENT_TYPE__POLICY_REFERENCE);
        createEAttribute(operatorContentTypeEClass, OPERATOR_CONTENT_TYPE__ANY);

        policyAttachmentTypeEClass = createEClass(POLICY_ATTACHMENT_TYPE);
        createEReference(policyAttachmentTypeEClass, POLICY_ATTACHMENT_TYPE__APPLIES_TO);
        createEAttribute(policyAttachmentTypeEClass, POLICY_ATTACHMENT_TYPE__GROUP);
        createEReference(policyAttachmentTypeEClass, POLICY_ATTACHMENT_TYPE__POLICY);
        createEReference(policyAttachmentTypeEClass, POLICY_ATTACHMENT_TYPE__POLICY_REFERENCE);
        createEAttribute(policyAttachmentTypeEClass, POLICY_ATTACHMENT_TYPE__ANY);
        createEAttribute(policyAttachmentTypeEClass, POLICY_ATTACHMENT_TYPE__ANY_ATTRIBUTE);

        policyReferenceTypeEClass = createEClass(POLICY_REFERENCE_TYPE);
        createEAttribute(policyReferenceTypeEClass, POLICY_REFERENCE_TYPE__DIGEST);
        createEAttribute(policyReferenceTypeEClass, POLICY_REFERENCE_TYPE__DIGEST_ALGORITHM);
        createEAttribute(policyReferenceTypeEClass, POLICY_REFERENCE_TYPE__URI);
        createEAttribute(policyReferenceTypeEClass, POLICY_REFERENCE_TYPE__ANY_ATTRIBUTE);

        policyTypeEClass = createEClass(POLICY_TYPE);
        createEAttribute(policyTypeEClass, POLICY_TYPE__ID);
        createEAttribute(policyTypeEClass, POLICY_TYPE__NAME);
        createEAttribute(policyTypeEClass, POLICY_TYPE__ANY_ATTRIBUTE);

        // Create data types
        policyURIsTypeEDataType = createEDataType(POLICY_UR_IS_TYPE);
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
        policyTypeEClass.getESuperTypes().add(this.getOperatorContentType());

        // Initialize classes and features; add operations and parameters
        initEClass(appliesToTypeEClass, AppliesToType.class, "AppliesToType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAppliesToType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, -1, AppliesToType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAppliesToType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AppliesToType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_All(), this.getOperatorContentType(), null, "all", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_AppliesTo(), this.getAppliesToType(), null, "appliesTo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_ExactlyOne(), this.getOperatorContentType(), null, "exactlyOne", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Policy(), this.getPolicyType(), null, "policy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_PolicyAttachment(), this.getPolicyAttachmentType(), null, "policyAttachment", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_PolicyReference(), this.getPolicyReferenceType(), null, "policyReference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Optional(), theXMLTypePackage.getBoolean(), "optional", "false", 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_PolicyURIs(), this.getPolicyURIsType(), "policyURIs", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(operatorContentTypeEClass, OperatorContentType.class, "OperatorContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOperatorContentType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, OperatorContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOperatorContentType_Policy(), this.getPolicyType(), null, "policy", null, 0, -1, OperatorContentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getOperatorContentType_All(), this.getOperatorContentType(), null, "all", null, 0, -1, OperatorContentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getOperatorContentType_ExactlyOne(), this.getOperatorContentType(), null, "exactlyOne", null, 0, -1, OperatorContentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getOperatorContentType_PolicyReference(), this.getPolicyReferenceType(), null, "policyReference", null, 0, -1, OperatorContentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperatorContentType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, OperatorContentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(policyAttachmentTypeEClass, PolicyAttachmentType.class, "PolicyAttachmentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPolicyAttachmentType_AppliesTo(), this.getAppliesToType(), null, "appliesTo", null, 1, 1, PolicyAttachmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPolicyAttachmentType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PolicyAttachmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPolicyAttachmentType_Policy(), this.getPolicyType(), null, "policy", null, 0, -1, PolicyAttachmentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getPolicyAttachmentType_PolicyReference(), this.getPolicyReferenceType(), null, "policyReference", null, 0, -1, PolicyAttachmentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getPolicyAttachmentType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, PolicyAttachmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPolicyAttachmentType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, PolicyAttachmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(policyReferenceTypeEClass, PolicyReferenceType.class, "PolicyReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPolicyReferenceType_Digest(), theXMLTypePackage.getBase64Binary(), "digest", null, 0, 1, PolicyReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPolicyReferenceType_DigestAlgorithm(), theXMLTypePackage.getAnyURI(), "digestAlgorithm", "http://schemas.xmlsoap.org/ws/2004/09/policy/Sha1Exc", 0, 1, PolicyReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPolicyReferenceType_URI(), theXMLTypePackage.getAnyURI(), "uRI", null, 1, 1, PolicyReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPolicyReferenceType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, PolicyReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(policyTypeEClass, PolicyType.class, "PolicyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPolicyType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, PolicyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPolicyType_Name(), theXMLTypePackage.getAnyURI(), "name", null, 0, 1, PolicyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPolicyType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, PolicyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize data types
        initEDataType(policyURIsTypeEDataType, List.class, "PolicyURIsType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
          (appliesToTypeEClass, 
           source, 
           new String[] {
             "name", "AppliesTo_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getAppliesToType_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##any",
             "name", ":0",
             "processing", "lax"
           });		
        addAnnotation
          (getAppliesToType_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##any",
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
          (getDocumentRoot_All(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "All",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_AppliesTo(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "AppliesTo",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_ExactlyOne(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ExactlyOne",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Policy(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Policy",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_PolicyAttachment(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "PolicyAttachment",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_PolicyReference(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "PolicyReference",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Optional(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "Optional",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_PolicyURIs(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "PolicyURIs",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (operatorContentTypeEClass, 
           source, 
           new String[] {
             "name", "OperatorContentType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getOperatorContentType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:0"
           });		
        addAnnotation
          (getOperatorContentType_Policy(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Policy",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getOperatorContentType_All(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "All",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getOperatorContentType_ExactlyOne(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ExactlyOne",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getOperatorContentType_PolicyReference(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "PolicyReference",
             "namespace", "##targetNamespace",
             "group", "#group:0"
           });		
        addAnnotation
          (getOperatorContentType_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##other",
             "name", ":5",
             "processing", "lax",
             "group", "#group:0"
           });		
        addAnnotation
          (policyAttachmentTypeEClass, 
           source, 
           new String[] {
             "name", "PolicyAttachment_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getPolicyAttachmentType_AppliesTo(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "AppliesTo",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getPolicyAttachmentType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:1"
           });		
        addAnnotation
          (getPolicyAttachmentType_Policy(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Policy",
             "namespace", "##targetNamespace",
             "group", "#group:1"
           });		
        addAnnotation
          (getPolicyAttachmentType_PolicyReference(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "PolicyReference",
             "namespace", "##targetNamespace",
             "group", "#group:1"
           });		
        addAnnotation
          (getPolicyAttachmentType_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##other",
             "name", ":4",
             "processing", "lax"
           });		
        addAnnotation
          (getPolicyAttachmentType_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##any",
             "name", ":5",
             "processing", "lax"
           });		
        addAnnotation
          (policyReferenceTypeEClass, 
           source, 
           new String[] {
             "name", "PolicyReference_._type",
             "kind", "empty"
           });		
        addAnnotation
          (getPolicyReferenceType_Digest(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "Digest"
           });		
        addAnnotation
          (getPolicyReferenceType_DigestAlgorithm(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "DigestAlgorithm"
           });		
        addAnnotation
          (getPolicyReferenceType_URI(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "URI"
           });		
        addAnnotation
          (getPolicyReferenceType_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##any",
             "name", ":3",
             "processing", "lax"
           });		
        addAnnotation
          (policyTypeEClass, 
           source, 
           new String[] {
             "name", "Policy_._type",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getPolicyType_Id(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "Id",
             "namespace", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
           });		
        addAnnotation
          (getPolicyType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "Name"
           });		
        addAnnotation
          (getPolicyType_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##any",
             "name", ":3",
             "processing", "lax"
           });		
        addAnnotation
          (policyURIsTypeEDataType, 
           source, 
           new String[] {
             "name", "PolicyURIs_._type",
             "itemType", "http://www.eclipse.org/emf/2003/XMLType#anyURI"
           });
    }

} //PolicyPackageImpl
