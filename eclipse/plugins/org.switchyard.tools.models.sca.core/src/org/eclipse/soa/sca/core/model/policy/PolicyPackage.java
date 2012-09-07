/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.core.model.policy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.soa.sca.core.model.policy.PolicyFactory
 * @model kind="package"
 * @generated
 */
public interface PolicyPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "policy";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://schemas.xmlsoap.org/ws/2004/09/policy";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "policy";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	PolicyPackage eINSTANCE = org.eclipse.soa.sca.core.model.policy.impl.PolicyPackageImpl.init();

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.core.model.policy.impl.AppliesToTypeImpl <em>Applies To Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.core.model.policy.impl.AppliesToTypeImpl
     * @see org.eclipse.soa.sca.core.model.policy.impl.PolicyPackageImpl#getAppliesToType()
     * @generated
     */
	int APPLIES_TO_TYPE = 0;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int APPLIES_TO_TYPE__ANY = 0;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int APPLIES_TO_TYPE__ANY_ATTRIBUTE = 1;

	/**
     * The number of structural features of the '<em>Applies To Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int APPLIES_TO_TYPE_FEATURE_COUNT = 2;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.core.model.policy.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.core.model.policy.impl.DocumentRootImpl
     * @see org.eclipse.soa.sca.core.model.policy.impl.PolicyPackageImpl#getDocumentRoot()
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
     * The feature id for the '<em><b>All</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__ALL = 3;

	/**
     * The feature id for the '<em><b>Applies To</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__APPLIES_TO = 4;

	/**
     * The feature id for the '<em><b>Exactly One</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__EXACTLY_ONE = 5;

	/**
     * The feature id for the '<em><b>Policy</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__POLICY = 6;

	/**
     * The feature id for the '<em><b>Policy Attachment</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__POLICY_ATTACHMENT = 7;

	/**
     * The feature id for the '<em><b>Policy Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__POLICY_REFERENCE = 8;

	/**
     * The feature id for the '<em><b>Optional</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__OPTIONAL = 9;

	/**
     * The feature id for the '<em><b>Policy UR Is</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__POLICY_UR_IS = 10;

	/**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT_FEATURE_COUNT = 11;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.core.model.policy.impl.OperatorContentTypeImpl <em>Operator Content Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.core.model.policy.impl.OperatorContentTypeImpl
     * @see org.eclipse.soa.sca.core.model.policy.impl.PolicyPackageImpl#getOperatorContentType()
     * @generated
     */
	int OPERATOR_CONTENT_TYPE = 2;

	/**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int OPERATOR_CONTENT_TYPE__GROUP = 0;

	/**
     * The feature id for the '<em><b>Policy</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int OPERATOR_CONTENT_TYPE__POLICY = 1;

	/**
     * The feature id for the '<em><b>All</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int OPERATOR_CONTENT_TYPE__ALL = 2;

	/**
     * The feature id for the '<em><b>Exactly One</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int OPERATOR_CONTENT_TYPE__EXACTLY_ONE = 3;

	/**
     * The feature id for the '<em><b>Policy Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int OPERATOR_CONTENT_TYPE__POLICY_REFERENCE = 4;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int OPERATOR_CONTENT_TYPE__ANY = 5;

	/**
     * The number of structural features of the '<em>Operator Content Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int OPERATOR_CONTENT_TYPE_FEATURE_COUNT = 6;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.core.model.policy.impl.PolicyAttachmentTypeImpl <em>Attachment Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.core.model.policy.impl.PolicyAttachmentTypeImpl
     * @see org.eclipse.soa.sca.core.model.policy.impl.PolicyPackageImpl#getPolicyAttachmentType()
     * @generated
     */
	int POLICY_ATTACHMENT_TYPE = 3;

	/**
     * The feature id for the '<em><b>Applies To</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_ATTACHMENT_TYPE__APPLIES_TO = 0;

	/**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_ATTACHMENT_TYPE__GROUP = 1;

	/**
     * The feature id for the '<em><b>Policy</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_ATTACHMENT_TYPE__POLICY = 2;

	/**
     * The feature id for the '<em><b>Policy Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_ATTACHMENT_TYPE__POLICY_REFERENCE = 3;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_ATTACHMENT_TYPE__ANY = 4;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_ATTACHMENT_TYPE__ANY_ATTRIBUTE = 5;

	/**
     * The number of structural features of the '<em>Attachment Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_ATTACHMENT_TYPE_FEATURE_COUNT = 6;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.core.model.policy.impl.PolicyReferenceTypeImpl <em>Reference Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.core.model.policy.impl.PolicyReferenceTypeImpl
     * @see org.eclipse.soa.sca.core.model.policy.impl.PolicyPackageImpl#getPolicyReferenceType()
     * @generated
     */
	int POLICY_REFERENCE_TYPE = 4;

	/**
     * The feature id for the '<em><b>Digest</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_REFERENCE_TYPE__DIGEST = 0;

	/**
     * The feature id for the '<em><b>Digest Algorithm</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_REFERENCE_TYPE__DIGEST_ALGORITHM = 1;

	/**
     * The feature id for the '<em><b>URI</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_REFERENCE_TYPE__URI = 2;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_REFERENCE_TYPE__ANY_ATTRIBUTE = 3;

	/**
     * The number of structural features of the '<em>Reference Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_REFERENCE_TYPE_FEATURE_COUNT = 4;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.core.model.policy.impl.PolicyTypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.core.model.policy.impl.PolicyTypeImpl
     * @see org.eclipse.soa.sca.core.model.policy.impl.PolicyPackageImpl#getPolicyType()
     * @generated
     */
	int POLICY_TYPE = 5;

	/**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_TYPE__GROUP = OPERATOR_CONTENT_TYPE__GROUP;

	/**
     * The feature id for the '<em><b>Policy</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_TYPE__POLICY = OPERATOR_CONTENT_TYPE__POLICY;

	/**
     * The feature id for the '<em><b>All</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_TYPE__ALL = OPERATOR_CONTENT_TYPE__ALL;

	/**
     * The feature id for the '<em><b>Exactly One</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_TYPE__EXACTLY_ONE = OPERATOR_CONTENT_TYPE__EXACTLY_ONE;

	/**
     * The feature id for the '<em><b>Policy Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_TYPE__POLICY_REFERENCE = OPERATOR_CONTENT_TYPE__POLICY_REFERENCE;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_TYPE__ANY = OPERATOR_CONTENT_TYPE__ANY;

	/**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_TYPE__ID = OPERATOR_CONTENT_TYPE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_TYPE__NAME = OPERATOR_CONTENT_TYPE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_TYPE__ANY_ATTRIBUTE = OPERATOR_CONTENT_TYPE_FEATURE_COUNT + 2;

	/**
     * The number of structural features of the '<em>Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_TYPE_FEATURE_COUNT = OPERATOR_CONTENT_TYPE_FEATURE_COUNT + 3;

	/**
     * The meta object id for the '<em>UR Is Type</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.eclipse.soa.sca.core.model.policy.impl.PolicyPackageImpl#getPolicyURIsType()
     * @generated
     */
	int POLICY_UR_IS_TYPE = 6;


	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.core.model.policy.AppliesToType <em>Applies To Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Applies To Type</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.AppliesToType
     * @generated
     */
	EClass getAppliesToType();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.policy.AppliesToType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.AppliesToType#getAny()
     * @see #getAppliesToType()
     * @generated
     */
	EAttribute getAppliesToType_Any();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.policy.AppliesToType#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.AppliesToType#getAnyAttribute()
     * @see #getAppliesToType()
     * @generated
     */
	EAttribute getAppliesToType_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.core.model.policy.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.DocumentRoot
     * @generated
     */
	EClass getDocumentRoot();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.policy.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
	EAttribute getDocumentRoot_Mixed();

	/**
     * Returns the meta object for the map '{@link org.eclipse.soa.sca.core.model.policy.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
     * Returns the meta object for the map '{@link org.eclipse.soa.sca.core.model.policy.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.policy.DocumentRoot#getAll <em>All</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>All</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.DocumentRoot#getAll()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_All();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.policy.DocumentRoot#getAppliesTo <em>Applies To</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Applies To</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.DocumentRoot#getAppliesTo()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_AppliesTo();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.policy.DocumentRoot#getExactlyOne <em>Exactly One</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Exactly One</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.DocumentRoot#getExactlyOne()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ExactlyOne();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.policy.DocumentRoot#getPolicy <em>Policy</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Policy</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.DocumentRoot#getPolicy()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Policy();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.policy.DocumentRoot#getPolicyAttachment <em>Policy Attachment</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Policy Attachment</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.DocumentRoot#getPolicyAttachment()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_PolicyAttachment();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.policy.DocumentRoot#getPolicyReference <em>Policy Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Policy Reference</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.DocumentRoot#getPolicyReference()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_PolicyReference();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.core.model.policy.DocumentRoot#isOptional <em>Optional</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Optional</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.DocumentRoot#isOptional()
     * @see #getDocumentRoot()
     * @generated
     */
	EAttribute getDocumentRoot_Optional();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.core.model.policy.DocumentRoot#getPolicyURIs <em>Policy UR Is</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Policy UR Is</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.DocumentRoot#getPolicyURIs()
     * @see #getDocumentRoot()
     * @generated
     */
	EAttribute getDocumentRoot_PolicyURIs();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.core.model.policy.OperatorContentType <em>Operator Content Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operator Content Type</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.OperatorContentType
     * @generated
     */
	EClass getOperatorContentType();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.policy.OperatorContentType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.OperatorContentType#getGroup()
     * @see #getOperatorContentType()
     * @generated
     */
	EAttribute getOperatorContentType_Group();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.core.model.policy.OperatorContentType#getPolicy <em>Policy</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Policy</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.OperatorContentType#getPolicy()
     * @see #getOperatorContentType()
     * @generated
     */
	EReference getOperatorContentType_Policy();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.core.model.policy.OperatorContentType#getAll <em>All</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>All</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.OperatorContentType#getAll()
     * @see #getOperatorContentType()
     * @generated
     */
	EReference getOperatorContentType_All();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.core.model.policy.OperatorContentType#getExactlyOne <em>Exactly One</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Exactly One</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.OperatorContentType#getExactlyOne()
     * @see #getOperatorContentType()
     * @generated
     */
	EReference getOperatorContentType_ExactlyOne();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.core.model.policy.OperatorContentType#getPolicyReference <em>Policy Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Policy Reference</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.OperatorContentType#getPolicyReference()
     * @see #getOperatorContentType()
     * @generated
     */
	EReference getOperatorContentType_PolicyReference();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.policy.OperatorContentType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.OperatorContentType#getAny()
     * @see #getOperatorContentType()
     * @generated
     */
	EAttribute getOperatorContentType_Any();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.core.model.policy.PolicyAttachmentType <em>Attachment Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attachment Type</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyAttachmentType
     * @generated
     */
	EClass getPolicyAttachmentType();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.policy.PolicyAttachmentType#getAppliesTo <em>Applies To</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Applies To</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyAttachmentType#getAppliesTo()
     * @see #getPolicyAttachmentType()
     * @generated
     */
	EReference getPolicyAttachmentType_AppliesTo();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.policy.PolicyAttachmentType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyAttachmentType#getGroup()
     * @see #getPolicyAttachmentType()
     * @generated
     */
	EAttribute getPolicyAttachmentType_Group();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.core.model.policy.PolicyAttachmentType#getPolicy <em>Policy</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Policy</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyAttachmentType#getPolicy()
     * @see #getPolicyAttachmentType()
     * @generated
     */
	EReference getPolicyAttachmentType_Policy();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.core.model.policy.PolicyAttachmentType#getPolicyReference <em>Policy Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Policy Reference</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyAttachmentType#getPolicyReference()
     * @see #getPolicyAttachmentType()
     * @generated
     */
	EReference getPolicyAttachmentType_PolicyReference();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.policy.PolicyAttachmentType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyAttachmentType#getAny()
     * @see #getPolicyAttachmentType()
     * @generated
     */
	EAttribute getPolicyAttachmentType_Any();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.policy.PolicyAttachmentType#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyAttachmentType#getAnyAttribute()
     * @see #getPolicyAttachmentType()
     * @generated
     */
	EAttribute getPolicyAttachmentType_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.core.model.policy.PolicyReferenceType <em>Reference Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference Type</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyReferenceType
     * @generated
     */
	EClass getPolicyReferenceType();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.core.model.policy.PolicyReferenceType#getDigest <em>Digest</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Digest</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyReferenceType#getDigest()
     * @see #getPolicyReferenceType()
     * @generated
     */
	EAttribute getPolicyReferenceType_Digest();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.core.model.policy.PolicyReferenceType#getDigestAlgorithm <em>Digest Algorithm</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Digest Algorithm</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyReferenceType#getDigestAlgorithm()
     * @see #getPolicyReferenceType()
     * @generated
     */
	EAttribute getPolicyReferenceType_DigestAlgorithm();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.core.model.policy.PolicyReferenceType#getURI <em>URI</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>URI</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyReferenceType#getURI()
     * @see #getPolicyReferenceType()
     * @generated
     */
	EAttribute getPolicyReferenceType_URI();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.policy.PolicyReferenceType#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyReferenceType#getAnyAttribute()
     * @see #getPolicyReferenceType()
     * @generated
     */
	EAttribute getPolicyReferenceType_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.core.model.policy.PolicyType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyType
     * @generated
     */
	EClass getPolicyType();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.core.model.policy.PolicyType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyType#getId()
     * @see #getPolicyType()
     * @generated
     */
	EAttribute getPolicyType_Id();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.core.model.policy.PolicyType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyType#getName()
     * @see #getPolicyType()
     * @generated
     */
	EAttribute getPolicyType_Name();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.policy.PolicyType#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.core.model.policy.PolicyType#getAnyAttribute()
     * @see #getPolicyType()
     * @generated
     */
	EAttribute getPolicyType_AnyAttribute();

	/**
     * Returns the meta object for data type '{@link java.util.List <em>UR Is Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>UR Is Type</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='PolicyURIs_._type' itemType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
     * @generated
     */
	EDataType getPolicyURIsType();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	PolicyFactory getPolicyFactory();

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
         * The meta object literal for the '{@link org.eclipse.soa.sca.core.model.policy.impl.AppliesToTypeImpl <em>Applies To Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.eclipse.soa.sca.core.model.policy.impl.AppliesToTypeImpl
         * @see org.eclipse.soa.sca.core.model.policy.impl.PolicyPackageImpl#getAppliesToType()
         * @generated
         */
		EClass APPLIES_TO_TYPE = eINSTANCE.getAppliesToType();

		/**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute APPLIES_TO_TYPE__ANY = eINSTANCE.getAppliesToType_Any();

		/**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute APPLIES_TO_TYPE__ANY_ATTRIBUTE = eINSTANCE.getAppliesToType_AnyAttribute();

		/**
         * The meta object literal for the '{@link org.eclipse.soa.sca.core.model.policy.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.eclipse.soa.sca.core.model.policy.impl.DocumentRootImpl
         * @see org.eclipse.soa.sca.core.model.policy.impl.PolicyPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>All</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__ALL = eINSTANCE.getDocumentRoot_All();

		/**
         * The meta object literal for the '<em><b>Applies To</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__APPLIES_TO = eINSTANCE.getDocumentRoot_AppliesTo();

		/**
         * The meta object literal for the '<em><b>Exactly One</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__EXACTLY_ONE = eINSTANCE.getDocumentRoot_ExactlyOne();

		/**
         * The meta object literal for the '<em><b>Policy</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__POLICY = eINSTANCE.getDocumentRoot_Policy();

		/**
         * The meta object literal for the '<em><b>Policy Attachment</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__POLICY_ATTACHMENT = eINSTANCE.getDocumentRoot_PolicyAttachment();

		/**
         * The meta object literal for the '<em><b>Policy Reference</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__POLICY_REFERENCE = eINSTANCE.getDocumentRoot_PolicyReference();

		/**
         * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute DOCUMENT_ROOT__OPTIONAL = eINSTANCE.getDocumentRoot_Optional();

		/**
         * The meta object literal for the '<em><b>Policy UR Is</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute DOCUMENT_ROOT__POLICY_UR_IS = eINSTANCE.getDocumentRoot_PolicyURIs();

		/**
         * The meta object literal for the '{@link org.eclipse.soa.sca.core.model.policy.impl.OperatorContentTypeImpl <em>Operator Content Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.eclipse.soa.sca.core.model.policy.impl.OperatorContentTypeImpl
         * @see org.eclipse.soa.sca.core.model.policy.impl.PolicyPackageImpl#getOperatorContentType()
         * @generated
         */
		EClass OPERATOR_CONTENT_TYPE = eINSTANCE.getOperatorContentType();

		/**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute OPERATOR_CONTENT_TYPE__GROUP = eINSTANCE.getOperatorContentType_Group();

		/**
         * The meta object literal for the '<em><b>Policy</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference OPERATOR_CONTENT_TYPE__POLICY = eINSTANCE.getOperatorContentType_Policy();

		/**
         * The meta object literal for the '<em><b>All</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference OPERATOR_CONTENT_TYPE__ALL = eINSTANCE.getOperatorContentType_All();

		/**
         * The meta object literal for the '<em><b>Exactly One</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference OPERATOR_CONTENT_TYPE__EXACTLY_ONE = eINSTANCE.getOperatorContentType_ExactlyOne();

		/**
         * The meta object literal for the '<em><b>Policy Reference</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference OPERATOR_CONTENT_TYPE__POLICY_REFERENCE = eINSTANCE.getOperatorContentType_PolicyReference();

		/**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute OPERATOR_CONTENT_TYPE__ANY = eINSTANCE.getOperatorContentType_Any();

		/**
         * The meta object literal for the '{@link org.eclipse.soa.sca.core.model.policy.impl.PolicyAttachmentTypeImpl <em>Attachment Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.eclipse.soa.sca.core.model.policy.impl.PolicyAttachmentTypeImpl
         * @see org.eclipse.soa.sca.core.model.policy.impl.PolicyPackageImpl#getPolicyAttachmentType()
         * @generated
         */
		EClass POLICY_ATTACHMENT_TYPE = eINSTANCE.getPolicyAttachmentType();

		/**
         * The meta object literal for the '<em><b>Applies To</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference POLICY_ATTACHMENT_TYPE__APPLIES_TO = eINSTANCE.getPolicyAttachmentType_AppliesTo();

		/**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute POLICY_ATTACHMENT_TYPE__GROUP = eINSTANCE.getPolicyAttachmentType_Group();

		/**
         * The meta object literal for the '<em><b>Policy</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference POLICY_ATTACHMENT_TYPE__POLICY = eINSTANCE.getPolicyAttachmentType_Policy();

		/**
         * The meta object literal for the '<em><b>Policy Reference</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference POLICY_ATTACHMENT_TYPE__POLICY_REFERENCE = eINSTANCE.getPolicyAttachmentType_PolicyReference();

		/**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute POLICY_ATTACHMENT_TYPE__ANY = eINSTANCE.getPolicyAttachmentType_Any();

		/**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute POLICY_ATTACHMENT_TYPE__ANY_ATTRIBUTE = eINSTANCE.getPolicyAttachmentType_AnyAttribute();

		/**
         * The meta object literal for the '{@link org.eclipse.soa.sca.core.model.policy.impl.PolicyReferenceTypeImpl <em>Reference Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.eclipse.soa.sca.core.model.policy.impl.PolicyReferenceTypeImpl
         * @see org.eclipse.soa.sca.core.model.policy.impl.PolicyPackageImpl#getPolicyReferenceType()
         * @generated
         */
		EClass POLICY_REFERENCE_TYPE = eINSTANCE.getPolicyReferenceType();

		/**
         * The meta object literal for the '<em><b>Digest</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute POLICY_REFERENCE_TYPE__DIGEST = eINSTANCE.getPolicyReferenceType_Digest();

		/**
         * The meta object literal for the '<em><b>Digest Algorithm</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute POLICY_REFERENCE_TYPE__DIGEST_ALGORITHM = eINSTANCE.getPolicyReferenceType_DigestAlgorithm();

		/**
         * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute POLICY_REFERENCE_TYPE__URI = eINSTANCE.getPolicyReferenceType_URI();

		/**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute POLICY_REFERENCE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getPolicyReferenceType_AnyAttribute();

		/**
         * The meta object literal for the '{@link org.eclipse.soa.sca.core.model.policy.impl.PolicyTypeImpl <em>Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.eclipse.soa.sca.core.model.policy.impl.PolicyTypeImpl
         * @see org.eclipse.soa.sca.core.model.policy.impl.PolicyPackageImpl#getPolicyType()
         * @generated
         */
		EClass POLICY_TYPE = eINSTANCE.getPolicyType();

		/**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute POLICY_TYPE__ID = eINSTANCE.getPolicyType_Id();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute POLICY_TYPE__NAME = eINSTANCE.getPolicyType_Name();

		/**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute POLICY_TYPE__ANY_ATTRIBUTE = eINSTANCE.getPolicyType_AnyAttribute();

		/**
         * The meta object literal for the '<em>UR Is Type</em>' data type.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.eclipse.soa.sca.core.model.policy.impl.PolicyPackageImpl#getPolicyURIsType()
         * @generated
         */
		EDataType POLICY_UR_IS_TYPE = eINSTANCE.getPolicyURIsType();

	}

} //PolicyPackage
