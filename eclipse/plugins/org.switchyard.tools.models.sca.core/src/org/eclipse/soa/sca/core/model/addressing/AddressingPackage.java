/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.core.model.addressing;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.soa.sca.core.model.addressing.AddressingFactory
 * @model kind="package"
 * @generated
 */
public interface AddressingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "addressing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/2005/08/addressing";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "addressing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AddressingPackage eINSTANCE = org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.soa.sca.core.model.addressing.impl.AttributedQNameTypeImpl <em>Attributed QName Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.AttributedQNameTypeImpl
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getAttributedQNameType()
	 * @generated
	 */
	int ATTRIBUTED_QNAME_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_QNAME_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_QNAME_TYPE__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Attributed QName Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_QNAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.soa.sca.core.model.addressing.impl.AttributedUnsignedLongTypeImpl <em>Attributed Unsigned Long Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.AttributedUnsignedLongTypeImpl
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getAttributedUnsignedLongType()
	 * @generated
	 */
	int ATTRIBUTED_UNSIGNED_LONG_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_UNSIGNED_LONG_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_UNSIGNED_LONG_TYPE__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Attributed Unsigned Long Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_UNSIGNED_LONG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.soa.sca.core.model.addressing.impl.AttributedURITypeImpl <em>Attributed URI Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.AttributedURITypeImpl
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getAttributedURIType()
	 * @generated
	 */
	int ATTRIBUTED_URI_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_URI_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_URI_TYPE__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Attributed URI Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_URI_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACTION = 3;

	/**
	 * The feature id for the '<em><b>Endpoint Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENDPOINT_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Fault To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FAULT_TO = 5;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FROM = 6;

	/**
	 * The feature id for the '<em><b>Message ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_ID = 7;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METADATA = 8;

	/**
	 * The feature id for the '<em><b>Problem Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROBLEM_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Problem Header QName</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROBLEM_HEADER_QNAME = 10;

	/**
	 * The feature id for the '<em><b>Problem IRI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROBLEM_IRI = 11;

	/**
	 * The feature id for the '<em><b>Reference Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFERENCE_PARAMETERS = 12;

	/**
	 * The feature id for the '<em><b>Relates To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELATES_TO = 13;

	/**
	 * The feature id for the '<em><b>Reply To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REPLY_TO = 14;

	/**
	 * The feature id for the '<em><b>Retry After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RETRY_AFTER = 15;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TO = 16;

	/**
	 * The feature id for the '<em><b>Is Reference Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_REFERENCE_PARAMETER = 17;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.soa.sca.core.model.addressing.impl.EndpointReferenceTypeImpl <em>Endpoint Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.EndpointReferenceTypeImpl
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getEndpointReferenceType()
	 * @generated
	 */
	int ENDPOINT_REFERENCE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REFERENCE_TYPE__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Reference Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REFERENCE_TYPE__REFERENCE_PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REFERENCE_TYPE__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REFERENCE_TYPE__ANY = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REFERENCE_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Endpoint Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_REFERENCE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.soa.sca.core.model.addressing.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.MetadataTypeImpl
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getMetadataType()
	 * @generated
	 */
	int METADATA_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.soa.sca.core.model.addressing.impl.ProblemActionTypeImpl <em>Problem Action Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.ProblemActionTypeImpl
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getProblemActionType()
	 * @generated
	 */
	int PROBLEM_ACTION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ACTION_TYPE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Soap Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ACTION_TYPE__SOAP_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ACTION_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Problem Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ACTION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.soa.sca.core.model.addressing.impl.ReferenceParametersTypeImpl <em>Reference Parameters Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.ReferenceParametersTypeImpl
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getReferenceParametersType()
	 * @generated
	 */
	int REFERENCE_PARAMETERS_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PARAMETERS_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PARAMETERS_TYPE__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Reference Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PARAMETERS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.soa.sca.core.model.addressing.impl.RelatesToTypeImpl <em>Relates To Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.RelatesToTypeImpl
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getRelatesToType()
	 * @generated
	 */
	int RELATES_TO_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATES_TO_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATES_TO_TYPE__RELATIONSHIP_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATES_TO_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Relates To Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATES_TO_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.soa.sca.core.model.addressing.RelationshipType <em>Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.soa.sca.core.model.addressing.RelationshipType
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 9;

	/**
	 * The meta object id for the '<em>Fault Codes Open Enum Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.namespace.QName
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getFaultCodesOpenEnumType()
	 * @generated
	 */
	int FAULT_CODES_OPEN_ENUM_TYPE = 10;

	/**
	 * The meta object id for the '<em>Fault Codes Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.namespace.QName
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getFaultCodesType()
	 * @generated
	 */
	int FAULT_CODES_TYPE = 11;

	/**
	 * The meta object id for the '<em>Relationship Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.soa.sca.core.model.addressing.RelationshipType
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getRelationshipTypeObject()
	 * @generated
	 */
	int RELATIONSHIP_TYPE_OBJECT = 12;

	/**
	 * The meta object id for the '<em>Relationship Type Open Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getRelationshipTypeOpenEnum()
	 * @generated
	 */
	int RELATIONSHIP_TYPE_OPEN_ENUM = 13;


	/**
	 * Returns the meta object for class '{@link org.eclipse.soa.sca.core.model.addressing.AttributedQNameType <em>Attributed QName Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributed QName Type</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.AttributedQNameType
	 * @generated
	 */
	EClass getAttributedQNameType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.core.model.addressing.AttributedQNameType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.AttributedQNameType#getValue()
	 * @see #getAttributedQNameType()
	 * @generated
	 */
	EAttribute getAttributedQNameType_Value();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.addressing.AttributedQNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.AttributedQNameType#getAnyAttribute()
	 * @see #getAttributedQNameType()
	 * @generated
	 */
	EAttribute getAttributedQNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.soa.sca.core.model.addressing.AttributedUnsignedLongType <em>Attributed Unsigned Long Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributed Unsigned Long Type</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.AttributedUnsignedLongType
	 * @generated
	 */
	EClass getAttributedUnsignedLongType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.core.model.addressing.AttributedUnsignedLongType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.AttributedUnsignedLongType#getValue()
	 * @see #getAttributedUnsignedLongType()
	 * @generated
	 */
	EAttribute getAttributedUnsignedLongType_Value();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.addressing.AttributedUnsignedLongType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.AttributedUnsignedLongType#getAnyAttribute()
	 * @see #getAttributedUnsignedLongType()
	 * @generated
	 */
	EAttribute getAttributedUnsignedLongType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.soa.sca.core.model.addressing.AttributedURIType <em>Attributed URI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributed URI Type</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.AttributedURIType
	 * @generated
	 */
	EClass getAttributedURIType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.core.model.addressing.AttributedURIType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.AttributedURIType#getValue()
	 * @see #getAttributedURIType()
	 * @generated
	 */
	EAttribute getAttributedURIType_Value();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.addressing.AttributedURIType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.AttributedURIType#getAnyAttribute()
	 * @see #getAttributedURIType()
	 * @generated
	 */
	EAttribute getAttributedURIType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getAction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Action();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getEndpointReference <em>Endpoint Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint Reference</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getEndpointReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EndpointReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getFaultTo <em>Fault To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault To</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getFaultTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FaultTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getFrom()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_From();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getMessageID <em>Message ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message ID</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getMessageID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MessageID();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getProblemAction <em>Problem Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Problem Action</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getProblemAction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProblemAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getProblemHeaderQName <em>Problem Header QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Problem Header QName</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getProblemHeaderQName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProblemHeaderQName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getProblemIRI <em>Problem IRI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Problem IRI</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getProblemIRI()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProblemIRI();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getReferenceParameters <em>Reference Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Parameters</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getReferenceParameters()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReferenceParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getRelatesTo <em>Relates To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relates To</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getRelatesTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RelatesTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getReplyTo <em>Reply To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply To</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getReplyTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReplyTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getRetryAfter <em>Retry After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retry After</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getRetryAfter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RetryAfter();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_To();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#isIsReferenceParameter <em>Is Reference Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reference Parameter</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.DocumentRoot#isIsReferenceParameter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IsReferenceParameter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType <em>Endpoint Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint Reference Type</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType
	 * @generated
	 */
	EClass getEndpointReferenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType#getAddress()
	 * @see #getEndpointReferenceType()
	 * @generated
	 */
	EReference getEndpointReferenceType_Address();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType#getReferenceParameters <em>Reference Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Parameters</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType#getReferenceParameters()
	 * @see #getEndpointReferenceType()
	 * @generated
	 */
	EReference getEndpointReferenceType_ReferenceParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType#getMetadata()
	 * @see #getEndpointReferenceType()
	 * @generated
	 */
	EReference getEndpointReferenceType_Metadata();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType#getAny()
	 * @see #getEndpointReferenceType()
	 * @generated
	 */
	EAttribute getEndpointReferenceType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType#getAnyAttribute()
	 * @see #getEndpointReferenceType()
	 * @generated
	 */
	EAttribute getEndpointReferenceType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.soa.sca.core.model.addressing.MetadataType <em>Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata Type</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.MetadataType
	 * @generated
	 */
	EClass getMetadataType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.addressing.MetadataType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.MetadataType#getAny()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.addressing.MetadataType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.MetadataType#getAnyAttribute()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.soa.sca.core.model.addressing.ProblemActionType <em>Problem Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Action Type</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.ProblemActionType
	 * @generated
	 */
	EClass getProblemActionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.core.model.addressing.ProblemActionType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.ProblemActionType#getAction()
	 * @see #getProblemActionType()
	 * @generated
	 */
	EReference getProblemActionType_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.core.model.addressing.ProblemActionType#getSoapAction <em>Soap Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soap Action</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.ProblemActionType#getSoapAction()
	 * @see #getProblemActionType()
	 * @generated
	 */
	EAttribute getProblemActionType_SoapAction();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.addressing.ProblemActionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.ProblemActionType#getAnyAttribute()
	 * @see #getProblemActionType()
	 * @generated
	 */
	EAttribute getProblemActionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.soa.sca.core.model.addressing.ReferenceParametersType <em>Reference Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Parameters Type</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.ReferenceParametersType
	 * @generated
	 */
	EClass getReferenceParametersType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.addressing.ReferenceParametersType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.ReferenceParametersType#getAny()
	 * @see #getReferenceParametersType()
	 * @generated
	 */
	EAttribute getReferenceParametersType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.addressing.ReferenceParametersType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.ReferenceParametersType#getAnyAttribute()
	 * @see #getReferenceParametersType()
	 * @generated
	 */
	EAttribute getReferenceParametersType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.soa.sca.core.model.addressing.RelatesToType <em>Relates To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relates To Type</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.RelatesToType
	 * @generated
	 */
	EClass getRelatesToType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.core.model.addressing.RelatesToType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.RelatesToType#getValue()
	 * @see #getRelatesToType()
	 * @generated
	 */
	EAttribute getRelatesToType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.core.model.addressing.RelatesToType#getRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Type</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.RelatesToType#getRelationshipType()
	 * @see #getRelatesToType()
	 * @generated
	 */
	EAttribute getRelatesToType_RelationshipType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.core.model.addressing.RelatesToType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.RelatesToType#getAnyAttribute()
	 * @see #getRelatesToType()
	 * @generated
	 */
	EAttribute getRelatesToType_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.soa.sca.core.model.addressing.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Type</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.RelationshipType
	 * @generated
	 */
	EEnum getRelationshipType();

	/**
	 * Returns the meta object for data type '{@link javax.xml.namespace.QName <em>Fault Codes Open Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fault Codes Open Enum Type</em>'.
	 * @see javax.xml.namespace.QName
	 * @model instanceClass="javax.xml.namespace.QName"
	 *        extendedMetaData="name='FaultCodesOpenEnumType' memberTypes='FaultCodesType http://www.eclipse.org/emf/2003/XMLType#QName'"
	 * @generated
	 */
	EDataType getFaultCodesOpenEnumType();

	/**
	 * Returns the meta object for data type '{@link javax.xml.namespace.QName <em>Fault Codes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fault Codes Type</em>'.
	 * @see javax.xml.namespace.QName
	 * @model instanceClass="javax.xml.namespace.QName"
	 *        extendedMetaData="name='FaultCodesType' baseType='http://www.eclipse.org/emf/2003/XMLType#QName' enumeration='{http://www.w3.org/2005/08/addressing}InvalidAddressingHeader {http://www.w3.org/2005/08/addressing}InvalidAddress {http://www.w3.org/2005/08/addressing}InvalidEPR {http://www.w3.org/2005/08/addressing}InvalidCardinality {http://www.w3.org/2005/08/addressing}MissingAddressInEPR {http://www.w3.org/2005/08/addressing}DuplicateMessageID {http://www.w3.org/2005/08/addressing}ActionMismatch {http://www.w3.org/2005/08/addressing}MessageAddressingHeaderRequired {http://www.w3.org/2005/08/addressing}DestinationUnreachable {http://www.w3.org/2005/08/addressing}ActionNotSupported {http://www.w3.org/2005/08/addressing}EndpointUnavailable'"
	 * @generated
	 */
	EDataType getFaultCodesType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.soa.sca.core.model.addressing.RelationshipType <em>Relationship Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Relationship Type Object</em>'.
	 * @see org.eclipse.soa.sca.core.model.addressing.RelationshipType
	 * @model instanceClass="org.eclipse.soa.sca.core.model.addressing.RelationshipType"
	 *        extendedMetaData="name='RelationshipType:Object' baseType='RelationshipType'"
	 * @generated
	 */
	EDataType getRelationshipTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Relationship Type Open Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Relationship Type Open Enum</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='RelationshipTypeOpenEnum' memberTypes='RelationshipType http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getRelationshipTypeOpenEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AddressingFactory getAddressingFactory();

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
		 * The meta object literal for the '{@link org.eclipse.soa.sca.core.model.addressing.impl.AttributedQNameTypeImpl <em>Attributed QName Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.AttributedQNameTypeImpl
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getAttributedQNameType()
		 * @generated
		 */
		EClass ATTRIBUTED_QNAME_TYPE = eINSTANCE.getAttributedQNameType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_QNAME_TYPE__VALUE = eINSTANCE.getAttributedQNameType_Value();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_QNAME_TYPE__ANY_ATTRIBUTE = eINSTANCE.getAttributedQNameType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.soa.sca.core.model.addressing.impl.AttributedUnsignedLongTypeImpl <em>Attributed Unsigned Long Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.AttributedUnsignedLongTypeImpl
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getAttributedUnsignedLongType()
		 * @generated
		 */
		EClass ATTRIBUTED_UNSIGNED_LONG_TYPE = eINSTANCE.getAttributedUnsignedLongType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_UNSIGNED_LONG_TYPE__VALUE = eINSTANCE.getAttributedUnsignedLongType_Value();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_UNSIGNED_LONG_TYPE__ANY_ATTRIBUTE = eINSTANCE.getAttributedUnsignedLongType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.soa.sca.core.model.addressing.impl.AttributedURITypeImpl <em>Attributed URI Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.AttributedURITypeImpl
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getAttributedURIType()
		 * @generated
		 */
		EClass ATTRIBUTED_URI_TYPE = eINSTANCE.getAttributedURIType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_URI_TYPE__VALUE = eINSTANCE.getAttributedURIType_Value();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTED_URI_TYPE__ANY_ATTRIBUTE = eINSTANCE.getAttributedURIType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Endpoint Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENDPOINT_REFERENCE = eINSTANCE.getDocumentRoot_EndpointReference();

		/**
		 * The meta object literal for the '<em><b>Fault To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FAULT_TO = eINSTANCE.getDocumentRoot_FaultTo();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FROM = eINSTANCE.getDocumentRoot_From();

		/**
		 * The meta object literal for the '<em><b>Message ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MESSAGE_ID = eINSTANCE.getDocumentRoot_MessageID();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__METADATA = eINSTANCE.getDocumentRoot_Metadata();

		/**
		 * The meta object literal for the '<em><b>Problem Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROBLEM_ACTION = eINSTANCE.getDocumentRoot_ProblemAction();

		/**
		 * The meta object literal for the '<em><b>Problem Header QName</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROBLEM_HEADER_QNAME = eINSTANCE.getDocumentRoot_ProblemHeaderQName();

		/**
		 * The meta object literal for the '<em><b>Problem IRI</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROBLEM_IRI = eINSTANCE.getDocumentRoot_ProblemIRI();

		/**
		 * The meta object literal for the '<em><b>Reference Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REFERENCE_PARAMETERS = eINSTANCE.getDocumentRoot_ReferenceParameters();

		/**
		 * The meta object literal for the '<em><b>Relates To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RELATES_TO = eINSTANCE.getDocumentRoot_RelatesTo();

		/**
		 * The meta object literal for the '<em><b>Reply To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REPLY_TO = eINSTANCE.getDocumentRoot_ReplyTo();

		/**
		 * The meta object literal for the '<em><b>Retry After</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RETRY_AFTER = eINSTANCE.getDocumentRoot_RetryAfter();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TO = eINSTANCE.getDocumentRoot_To();

		/**
		 * The meta object literal for the '<em><b>Is Reference Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__IS_REFERENCE_PARAMETER = eINSTANCE.getDocumentRoot_IsReferenceParameter();

		/**
		 * The meta object literal for the '{@link org.eclipse.soa.sca.core.model.addressing.impl.EndpointReferenceTypeImpl <em>Endpoint Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.EndpointReferenceTypeImpl
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getEndpointReferenceType()
		 * @generated
		 */
		EClass ENDPOINT_REFERENCE_TYPE = eINSTANCE.getEndpointReferenceType();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT_REFERENCE_TYPE__ADDRESS = eINSTANCE.getEndpointReferenceType_Address();

		/**
		 * The meta object literal for the '<em><b>Reference Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT_REFERENCE_TYPE__REFERENCE_PARAMETERS = eINSTANCE.getEndpointReferenceType_ReferenceParameters();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT_REFERENCE_TYPE__METADATA = eINSTANCE.getEndpointReferenceType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT_REFERENCE_TYPE__ANY = eINSTANCE.getEndpointReferenceType_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT_REFERENCE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getEndpointReferenceType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.soa.sca.core.model.addressing.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.MetadataTypeImpl
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getMetadataType()
		 * @generated
		 */
		EClass METADATA_TYPE = eINSTANCE.getMetadataType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__ANY = eINSTANCE.getMetadataType_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__ANY_ATTRIBUTE = eINSTANCE.getMetadataType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.soa.sca.core.model.addressing.impl.ProblemActionTypeImpl <em>Problem Action Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.ProblemActionTypeImpl
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getProblemActionType()
		 * @generated
		 */
		EClass PROBLEM_ACTION_TYPE = eINSTANCE.getProblemActionType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_ACTION_TYPE__ACTION = eINSTANCE.getProblemActionType_Action();

		/**
		 * The meta object literal for the '<em><b>Soap Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM_ACTION_TYPE__SOAP_ACTION = eINSTANCE.getProblemActionType_SoapAction();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM_ACTION_TYPE__ANY_ATTRIBUTE = eINSTANCE.getProblemActionType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.soa.sca.core.model.addressing.impl.ReferenceParametersTypeImpl <em>Reference Parameters Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.ReferenceParametersTypeImpl
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getReferenceParametersType()
		 * @generated
		 */
		EClass REFERENCE_PARAMETERS_TYPE = eINSTANCE.getReferenceParametersType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_PARAMETERS_TYPE__ANY = eINSTANCE.getReferenceParametersType_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_PARAMETERS_TYPE__ANY_ATTRIBUTE = eINSTANCE.getReferenceParametersType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.soa.sca.core.model.addressing.impl.RelatesToTypeImpl <em>Relates To Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.RelatesToTypeImpl
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getRelatesToType()
		 * @generated
		 */
		EClass RELATES_TO_TYPE = eINSTANCE.getRelatesToType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATES_TO_TYPE__VALUE = eINSTANCE.getRelatesToType_Value();

		/**
		 * The meta object literal for the '<em><b>Relationship Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATES_TO_TYPE__RELATIONSHIP_TYPE = eINSTANCE.getRelatesToType_RelationshipType();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATES_TO_TYPE__ANY_ATTRIBUTE = eINSTANCE.getRelatesToType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.soa.sca.core.model.addressing.RelationshipType <em>Relationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.soa.sca.core.model.addressing.RelationshipType
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getRelationshipType()
		 * @generated
		 */
		EEnum RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

		/**
		 * The meta object literal for the '<em>Fault Codes Open Enum Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.namespace.QName
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getFaultCodesOpenEnumType()
		 * @generated
		 */
		EDataType FAULT_CODES_OPEN_ENUM_TYPE = eINSTANCE.getFaultCodesOpenEnumType();

		/**
		 * The meta object literal for the '<em>Fault Codes Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.namespace.QName
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getFaultCodesType()
		 * @generated
		 */
		EDataType FAULT_CODES_TYPE = eINSTANCE.getFaultCodesType();

		/**
		 * The meta object literal for the '<em>Relationship Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.soa.sca.core.model.addressing.RelationshipType
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getRelationshipTypeObject()
		 * @generated
		 */
		EDataType RELATIONSHIP_TYPE_OBJECT = eINSTANCE.getRelationshipTypeObject();

		/**
		 * The meta object literal for the '<em>Relationship Type Open Enum</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.soa.sca.core.model.addressing.impl.AddressingPackageImpl#getRelationshipTypeOpenEnum()
		 * @generated
		 */
		EDataType RELATIONSHIP_TYPE_OPEN_ENUM = eINSTANCE.getRelationshipTypeOpenEnum();

	}

} //AddressingPackage
