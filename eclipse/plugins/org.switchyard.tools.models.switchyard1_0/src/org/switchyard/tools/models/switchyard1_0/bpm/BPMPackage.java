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
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ActionType1Impl <em>Action Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ActionType1Impl
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getActionType1()
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
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.AuditTypeImpl <em>Audit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.AuditTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getAuditType()
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
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPM_IMPLEMENTATION_TYPE__ACTION = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Audit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPM_IMPLEMENTATION_TYPE__AUDIT = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Task Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPM_IMPLEMENTATION_TYPE__TASK_HANDLER = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPM_IMPLEMENTATION_TYPE__RESOURCE = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Implementation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPM_IMPLEMENTATION_TYPE_FEATURE_COUNT = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Implementation Bpm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMPLEMENTATION_BPM = 5;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Task Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TASK_HANDLER = 7;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ResourceTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getResourceType()
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
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.TaskHandlerTypeImpl <em>Task Handler Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.TaskHandlerTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getTaskHandlerType()
	 * @generated
	 */
	int TASK_HANDLER_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Task Handler Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_HANDLER_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 6;

	/**
	 * The meta object id for the '<em>Action Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getActionTypeObject()
	 * @generated
	 */
	int ACTION_TYPE_OBJECT = 7;


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
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.AuditType <em>Audit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audit Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.AuditType
	 * @generated
	 */
	EClass getAuditType();

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
	 * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getAction()
	 * @see #getBPMImplementationType()
	 * @generated
	 */
	EReference getBPMImplementationType_Action();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getAudit <em>Audit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Audit</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getAudit()
	 * @see #getBPMImplementationType()
	 * @generated
	 */
	EReference getBPMImplementationType_Audit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getTaskHandler <em>Task Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Handler</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getTaskHandler()
	 * @see #getBPMImplementationType()
	 * @generated
	 */
	EReference getBPMImplementationType_TaskHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getResource()
	 * @see #getBPMImplementationType()
	 * @generated
	 */
	EReference getBPMImplementationType_Resource();

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
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getAudit <em>Audit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Audit</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getAudit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Audit();

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
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getTaskHandler <em>Task Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Handler</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getTaskHandler()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TaskHandler();

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
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.TaskHandlerType <em>Task Handler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Handler Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.bpm.TaskHandlerType
	 * @generated
	 */
	EClass getTaskHandlerType();

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
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ActionType1Impl <em>Action Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ActionType1Impl
		 * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getActionType1()
		 * @generated
		 */
		EClass ACTION_TYPE1 = eINSTANCE.getActionType1();

		/**
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.AuditTypeImpl <em>Audit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.AuditTypeImpl
		 * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getAuditType()
		 * @generated
		 */
		EClass AUDIT_TYPE = eINSTANCE.getAuditType();

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
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPM_IMPLEMENTATION_TYPE__ACTION = eINSTANCE.getBPMImplementationType_Action();

		/**
		 * The meta object literal for the '<em><b>Audit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPM_IMPLEMENTATION_TYPE__AUDIT = eINSTANCE.getBPMImplementationType_Audit();

		/**
		 * The meta object literal for the '<em><b>Task Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPM_IMPLEMENTATION_TYPE__TASK_HANDLER = eINSTANCE.getBPMImplementationType_TaskHandler();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPM_IMPLEMENTATION_TYPE__RESOURCE = eINSTANCE.getBPMImplementationType_Resource();

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
		 * The meta object literal for the '<em><b>Audit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUDIT = eINSTANCE.getDocumentRoot_Audit();

		/**
		 * The meta object literal for the '<em><b>Implementation Bpm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMPLEMENTATION_BPM = eINSTANCE.getDocumentRoot_ImplementationBpm();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESOURCE = eINSTANCE.getDocumentRoot_Resource();

		/**
		 * The meta object literal for the '<em><b>Task Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TASK_HANDLER = eINSTANCE.getDocumentRoot_TaskHandler();

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
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.TaskHandlerTypeImpl <em>Task Handler Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.TaskHandlerTypeImpl
		 * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getTaskHandlerType()
		 * @generated
		 */
		EClass TASK_HANDLER_TYPE = eINSTANCE.getTaskHandlerType();

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
		 * The meta object literal for the '<em>Action Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType
		 * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getActionTypeObject()
		 * @generated
		 */
		EDataType ACTION_TYPE_OBJECT = eINSTANCE.getActionTypeObject();

	}

} //BPMPackage
