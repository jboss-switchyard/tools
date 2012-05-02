/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.rules;

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
 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesFactory
 * @model kind="package"
 * @generated
 */
public interface RulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:switchyard-component-rules:config:1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ActionType1Impl <em>Action Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ActionType1Impl
	 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getActionType1()
	 * @generated
	 */
	int ACTION_TYPE1 = 0;

	/**
	 * The number of structural features of the '<em>Action Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE1_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.AuditTypeImpl <em>Audit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.AuditTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getAuditType()
	 * @generated
	 */
	int AUDIT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Audit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ChannelTypeImpl <em>Channel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ChannelTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getChannelType()
	 * @generated
	 */
	int CHANNEL_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Channel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.DocumentRootImpl
	 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Audit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUDIT = 4;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANNEL = 5;

	/**
	 * The feature id for the '<em><b>Implementation Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMPLEMENTATION_RULES = 6;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE = 7;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ResourceTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesImplementationTypeImpl <em>Implementation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesImplementationTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getRulesImplementationType()
	 * @generated
	 */
	int RULES_IMPLEMENTATION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_IMPLEMENTATION_TYPE__DOCUMENTATION = ScaPackage.IMPLEMENTATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_IMPLEMENTATION_TYPE__ANY_ATTRIBUTE = ScaPackage.IMPLEMENTATION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_IMPLEMENTATION_TYPE__POLICY_SETS = ScaPackage.IMPLEMENTATION__POLICY_SETS;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_IMPLEMENTATION_TYPE__REQUIRES = ScaPackage.IMPLEMENTATION__REQUIRES;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_IMPLEMENTATION_TYPE__ACTION = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Audit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_IMPLEMENTATION_TYPE__AUDIT = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_IMPLEMENTATION_TYPE__CHANNEL = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_IMPLEMENTATION_TYPE__RESOURCE = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Implementation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_IMPLEMENTATION_TYPE_FEATURE_COUNT = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.rules.ActionType
	 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 6;

	/**
	 * The meta object id for the '<em>Action Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.rules.ActionType
	 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getActionTypeObject()
	 * @generated
	 */
	int ACTION_TYPE_OBJECT = 7;


	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1 <em>Action Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Type1</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.rules.ActionType1
	 * @generated
	 */
	EClass getActionType1();

	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.AuditType <em>Audit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audit Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.rules.AuditType
	 * @generated
	 */
	EClass getAuditType();

	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType <em>Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.rules.ChannelType
	 * @generated
	 */
	EClass getChannelType();

	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getAction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Action();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getAudit <em>Audit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Audit</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getAudit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Audit();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Channel</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getChannel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Channel();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getImplementationRules <em>Implementation Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation Rules</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getImplementationRules()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ImplementationRules();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getResource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Resource();

	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.rules.ResourceType
	 * @generated
	 */
	EClass getResourceType();

	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType <em>Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType
	 * @generated
	 */
	EClass getRulesImplementationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getAction()
	 * @see #getRulesImplementationType()
	 * @generated
	 */
	EReference getRulesImplementationType_Action();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getAudit <em>Audit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Audit</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getAudit()
	 * @see #getRulesImplementationType()
	 * @generated
	 */
	EReference getRulesImplementationType_Audit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channel</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getChannel()
	 * @see #getRulesImplementationType()
	 * @generated
	 */
	EReference getRulesImplementationType_Channel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getResource()
	 * @see #getRulesImplementationType()
	 * @generated
	 */
	EReference getRulesImplementationType_Resource();

	/**
	 * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.rules.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType <em>Action Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Action Type Object</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.rules.ActionType
	 * @model instanceClass="org.switchyard.tools.models.switchyard1_0.rules.ActionType"
	 *        extendedMetaData="name='actionType:Object' baseType='actionType'"
	 * @generated
	 */
	EDataType getActionTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

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
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ActionType1Impl <em>Action Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ActionType1Impl
		 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getActionType1()
		 * @generated
		 */
		EClass ACTION_TYPE1 = eINSTANCE.getActionType1();

		/**
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.AuditTypeImpl <em>Audit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.AuditTypeImpl
		 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getAuditType()
		 * @generated
		 */
		EClass AUDIT_TYPE = eINSTANCE.getAuditType();

		/**
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ChannelTypeImpl <em>Channel Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ChannelTypeImpl
		 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getChannelType()
		 * @generated
		 */
		EClass CHANNEL_TYPE = eINSTANCE.getChannelType();

		/**
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.DocumentRootImpl
		 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Audit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUDIT = eINSTANCE.getDocumentRoot_Audit();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHANNEL = eINSTANCE.getDocumentRoot_Channel();

		/**
		 * The meta object literal for the '<em><b>Implementation Rules</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMPLEMENTATION_RULES = eINSTANCE.getDocumentRoot_ImplementationRules();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESOURCE = eINSTANCE.getDocumentRoot_Resource();

		/**
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ResourceTypeImpl
		 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getResourceType()
		 * @generated
		 */
		EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesImplementationTypeImpl <em>Implementation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesImplementationTypeImpl
		 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getRulesImplementationType()
		 * @generated
		 */
		EClass RULES_IMPLEMENTATION_TYPE = eINSTANCE.getRulesImplementationType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULES_IMPLEMENTATION_TYPE__ACTION = eINSTANCE.getRulesImplementationType_Action();

		/**
		 * The meta object literal for the '<em><b>Audit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULES_IMPLEMENTATION_TYPE__AUDIT = eINSTANCE.getRulesImplementationType_Audit();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULES_IMPLEMENTATION_TYPE__CHANNEL = eINSTANCE.getRulesImplementationType_Channel();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULES_IMPLEMENTATION_TYPE__RESOURCE = eINSTANCE.getRulesImplementationType_Resource();

		/**
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.rules.ActionType
		 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '<em>Action Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.rules.ActionType
		 * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getActionTypeObject()
		 * @generated
		 */
		EDataType ACTION_TYPE_OBJECT = eINSTANCE.getActionTypeObject();

	}

} //RulesPackage
