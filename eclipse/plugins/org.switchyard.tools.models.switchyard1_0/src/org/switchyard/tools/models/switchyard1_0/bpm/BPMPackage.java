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
import org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage;
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
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE1__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE1__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE1__NAME = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE1__TYPE = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Event Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE1__EVENT_TYPE = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Action Type1</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTION_TYPE1_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

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
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDIT_TYPE__DOCUMENTATION = CommonRulesPackage.AUDIT_TYPE1__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDIT_TYPE__ANY_ATTRIBUTE = CommonRulesPackage.AUDIT_TYPE1__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDIT_TYPE__INTERVAL = CommonRulesPackage.AUDIT_TYPE1__INTERVAL;

    /**
     * The feature id for the '<em><b>Log</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDIT_TYPE__LOG = CommonRulesPackage.AUDIT_TYPE1__LOG;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDIT_TYPE__TYPE = CommonRulesPackage.AUDIT_TYPE1__TYPE;

    /**
     * The number of structural features of the '<em>Audit Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int AUDIT_TYPE_FEATURE_COUNT = CommonRulesPackage.AUDIT_TYPE1_FEATURE_COUNT + 0;

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
	int BPM_IMPLEMENTATION_TYPE__DOCUMENTATION = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPM_IMPLEMENTATION_TYPE__ANY_ATTRIBUTE = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPM_IMPLEMENTATION_TYPE__POLICY_SETS = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPM_IMPLEMENTATION_TYPE__REQUIRES = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__REQUIRES;

	/**
     * The feature id for the '<em><b>Agent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__AGENT = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__AGENT;

    /**
     * The feature id for the '<em><b>Clock</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__CLOCK = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__CLOCK;

    /**
     * The feature id for the '<em><b>Event Processing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__EVENT_PROCESSING = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__EVENT_PROCESSING;

    /**
     * The feature id for the '<em><b>Max Threads</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__MAX_THREADS = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__MAX_THREADS;

    /**
     * The feature id for the '<em><b>Multithread Evaluation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__MULTITHREAD_EVALUATION = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__MULTITHREAD_EVALUATION;

    /**
     * The feature id for the '<em><b>Action</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPM_IMPLEMENTATION_TYPE__ACTION = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Audit</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPM_IMPLEMENTATION_TYPE__AUDIT = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Event Listener</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__EVENT_LISTENER = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Task Handler</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPM_IMPLEMENTATION_TYPE__TASK_HANDLER = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPM_IMPLEMENTATION_TYPE__RESOURCE = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__PARAMETERS = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Results</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__RESULTS = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Process Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__PROCESS_DEFINITION = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Process Definition Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__PROCESS_DEFINITION_TYPE = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Process Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__PROCESS_ID = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Message Content In Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_IN_NAME = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Message Content Out Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_OUT_NAME = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Persistent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__PERSISTENT = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Session Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPM_IMPLEMENTATION_TYPE__SESSION_ID = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 13;

    /**
     * The number of structural features of the '<em>Implementation Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPM_IMPLEMENTATION_TYPE_FEATURE_COUNT = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 14;

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
     * The feature id for the '<em><b>Mapping</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MAPPING = 6;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PARAMETERS = 7;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__RESOURCE = 8;

	/**
     * The feature id for the '<em><b>Results</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__RESULTS = 9;

    /**
     * The feature id for the '<em><b>Task Handler</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__TASK_HANDLER = 10;

	/**
     * The feature id for the '<em><b>Event Listener</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EVENT_LISTENER = 11;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT_FEATURE_COUNT = 12;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.MappingTypeImpl <em>Mapping Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.MappingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getMappingType()
     * @generated
     */
    int MAPPING_TYPE = 4;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__DOCUMENTATION = CommonRulesPackage.MAPPING_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__ANY_ATTRIBUTE = CommonRulesPackage.MAPPING_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Context Scope</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__CONTEXT_SCOPE = CommonRulesPackage.MAPPING_TYPE__CONTEXT_SCOPE;

    /**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__EXPRESSION = CommonRulesPackage.MAPPING_TYPE__EXPRESSION;

    /**
     * The feature id for the '<em><b>Expression Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__EXPRESSION_TYPE = CommonRulesPackage.MAPPING_TYPE__EXPRESSION_TYPE;

    /**
     * The feature id for the '<em><b>Variable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__VARIABLE = CommonRulesPackage.MAPPING_TYPE__VARIABLE;

    /**
     * The number of structural features of the '<em>Mapping Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE_FEATURE_COUNT = CommonRulesPackage.MAPPING_TYPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ParametersTypeImpl <em>Parameters Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ParametersTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getParametersType()
     * @generated
     */
    int PARAMETERS_TYPE = 5;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETERS_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETERS_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETERS_TYPE__MAPPING = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Parameters Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETERS_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ResourceTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getResourceType()
     * @generated
     */
	int RESOURCE_TYPE = 6;

	/**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE__LOCATION = SwitchyardPackage.RESOURCE_TYPE__LOCATION;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE__TYPE = SwitchyardPackage.RESOURCE_TYPE__TYPE;

    /**
     * The number of structural features of the '<em>Resource Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_TYPE_FEATURE_COUNT = SwitchyardPackage.RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ResultsTypeImpl <em>Results Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ResultsTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getResultsType()
     * @generated
     */
    int RESULTS_TYPE = 7;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULTS_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULTS_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULTS_TYPE__MAPPING = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Results Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULTS_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.TaskHandlerTypeImpl <em>Task Handler Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.TaskHandlerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getTaskHandlerType()
     * @generated
     */
	int TASK_HANDLER_TYPE = 8;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_HANDLER_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_HANDLER_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_HANDLER_TYPE__NAME = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_HANDLER_TYPE__CLASS = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Task Handler Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TASK_HANDLER_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.EventListenerTypeImpl <em>Event Listener Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.EventListenerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getEventListenerType()
     * @generated
     */
    int EVENT_LISTENER_TYPE = 9;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_LISTENER_TYPE__DOCUMENTATION = CommonRulesPackage.EVENT_LISTENER_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_LISTENER_TYPE__ANY_ATTRIBUTE = CommonRulesPackage.EVENT_LISTENER_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_LISTENER_TYPE__CLASS = CommonRulesPackage.EVENT_LISTENER_TYPE__CLASS;

    /**
     * The number of structural features of the '<em>Event Listener Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_LISTENER_TYPE_FEATURE_COUNT = CommonRulesPackage.EVENT_LISTENER_TYPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType <em>Action Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getActionType()
     * @generated
     */
	int ACTION_TYPE = 10;

	/**
     * The meta object id for the '<em>Action Type Object</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType
     * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getActionTypeObject()
     * @generated
     */
	int ACTION_TYPE_OBJECT = 11;


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
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getName()
     * @see #getActionType1()
     * @generated
     */
    EAttribute getActionType1_Name();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getType()
     * @see #getActionType1()
     * @generated
     */
    EAttribute getActionType1_Type();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getEventType <em>Event Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Event Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ActionType1#getEventType()
     * @see #getActionType1()
     * @generated
     */
    EAttribute getActionType1_EventType();

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
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getEventListener <em>Event Listener</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Event Listener</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getEventListener()
     * @see #getBPMImplementationType()
     * @generated
     */
    EReference getBPMImplementationType_EventListener();

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
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Parameters</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getParameters()
     * @see #getBPMImplementationType()
     * @generated
     */
    EReference getBPMImplementationType_Parameters();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getResults <em>Results</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Results</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getResults()
     * @see #getBPMImplementationType()
     * @generated
     */
    EReference getBPMImplementationType_Results();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getProcessDefinition <em>Process Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process Definition</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getProcessDefinition()
     * @see #getBPMImplementationType()
     * @generated
     */
    EAttribute getBPMImplementationType_ProcessDefinition();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getProcessDefinitionType <em>Process Definition Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process Definition Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getProcessDefinitionType()
     * @see #getBPMImplementationType()
     * @generated
     */
    EAttribute getBPMImplementationType_ProcessDefinitionType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getProcessId <em>Process Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process Id</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getProcessId()
     * @see #getBPMImplementationType()
     * @generated
     */
    EAttribute getBPMImplementationType_ProcessId();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getMessageContentInName <em>Message Content In Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Message Content In Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getMessageContentInName()
     * @see #getBPMImplementationType()
     * @generated
     */
    EAttribute getBPMImplementationType_MessageContentInName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getMessageContentOutName <em>Message Content Out Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Message Content Out Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getMessageContentOutName()
     * @see #getBPMImplementationType()
     * @generated
     */
    EAttribute getBPMImplementationType_MessageContentOutName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#isPersistent <em>Persistent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Persistent</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#isPersistent()
     * @see #getBPMImplementationType()
     * @generated
     */
    EAttribute getBPMImplementationType_Persistent();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getSessionId <em>Session Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Session Id</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType#getSessionId()
     * @see #getBPMImplementationType()
     * @generated
     */
    EAttribute getBPMImplementationType_SessionId();

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
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getMapping <em>Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Mapping</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getMapping()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Mapping();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Parameters</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getParameters()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Parameters();

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
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getResults <em>Results</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Results</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getResults()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Results();

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
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getEventListener <em>Event Listener</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event Listener</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getEventListener()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EventListener();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.MappingType <em>Mapping Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mapping Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.MappingType
     * @generated
     */
    EClass getMappingType();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.ParametersType <em>Parameters Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameters Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ParametersType
     * @generated
     */
    EClass getParametersType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.bpm.ParametersType#getMapping <em>Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Mapping</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ParametersType#getMapping()
     * @see #getParametersType()
     * @generated
     */
    EReference getParametersType_Mapping();

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
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.ResultsType <em>Results Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Results Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ResultsType
     * @generated
     */
    EClass getResultsType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.bpm.ResultsType#getMapping <em>Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Mapping</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.ResultsType#getMapping()
     * @see #getResultsType()
     * @generated
     */
    EReference getResultsType_Mapping();

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
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.TaskHandlerType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.TaskHandlerType#getName()
     * @see #getTaskHandlerType()
     * @generated
     */
    EAttribute getTaskHandlerType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.bpm.TaskHandlerType#getClass_ <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.TaskHandlerType#getClass_()
     * @see #getTaskHandlerType()
     * @generated
     */
    EAttribute getTaskHandlerType_Class();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.bpm.EventListenerType <em>Event Listener Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Listener Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.EventListenerType
     * @generated
     */
    EClass getEventListenerType();

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
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTION_TYPE1__NAME = eINSTANCE.getActionType1_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTION_TYPE1__TYPE = eINSTANCE.getActionType1_Type();

        /**
         * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTION_TYPE1__EVENT_TYPE = eINSTANCE.getActionType1_EventType();

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
         * The meta object literal for the '<em><b>Event Listener</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BPM_IMPLEMENTATION_TYPE__EVENT_LISTENER = eINSTANCE.getBPMImplementationType_EventListener();

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
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BPM_IMPLEMENTATION_TYPE__PARAMETERS = eINSTANCE.getBPMImplementationType_Parameters();

        /**
         * The meta object literal for the '<em><b>Results</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BPM_IMPLEMENTATION_TYPE__RESULTS = eINSTANCE.getBPMImplementationType_Results();

        /**
         * The meta object literal for the '<em><b>Process Definition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BPM_IMPLEMENTATION_TYPE__PROCESS_DEFINITION = eINSTANCE.getBPMImplementationType_ProcessDefinition();

        /**
         * The meta object literal for the '<em><b>Process Definition Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BPM_IMPLEMENTATION_TYPE__PROCESS_DEFINITION_TYPE = eINSTANCE.getBPMImplementationType_ProcessDefinitionType();

        /**
         * The meta object literal for the '<em><b>Process Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BPM_IMPLEMENTATION_TYPE__PROCESS_ID = eINSTANCE.getBPMImplementationType_ProcessId();

        /**
         * The meta object literal for the '<em><b>Message Content In Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BPM_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_IN_NAME = eINSTANCE.getBPMImplementationType_MessageContentInName();

        /**
         * The meta object literal for the '<em><b>Message Content Out Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BPM_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_OUT_NAME = eINSTANCE.getBPMImplementationType_MessageContentOutName();

        /**
         * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BPM_IMPLEMENTATION_TYPE__PERSISTENT = eINSTANCE.getBPMImplementationType_Persistent();

        /**
         * The meta object literal for the '<em><b>Session Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BPM_IMPLEMENTATION_TYPE__SESSION_ID = eINSTANCE.getBPMImplementationType_SessionId();

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
         * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__MAPPING = eINSTANCE.getDocumentRoot_Mapping();

        /**
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PARAMETERS = eINSTANCE.getDocumentRoot_Parameters();

        /**
         * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__RESOURCE = eINSTANCE.getDocumentRoot_Resource();

		/**
         * The meta object literal for the '<em><b>Results</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__RESULTS = eINSTANCE.getDocumentRoot_Results();

        /**
         * The meta object literal for the '<em><b>Task Handler</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__TASK_HANDLER = eINSTANCE.getDocumentRoot_TaskHandler();

		/**
         * The meta object literal for the '<em><b>Event Listener</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__EVENT_LISTENER = eINSTANCE.getDocumentRoot_EventListener();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.MappingTypeImpl <em>Mapping Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.MappingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getMappingType()
         * @generated
         */
        EClass MAPPING_TYPE = eINSTANCE.getMappingType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ParametersTypeImpl <em>Parameters Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ParametersTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getParametersType()
         * @generated
         */
        EClass PARAMETERS_TYPE = eINSTANCE.getParametersType();

        /**
         * The meta object literal for the '<em><b>Mapping</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETERS_TYPE__MAPPING = eINSTANCE.getParametersType_Mapping();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ResultsTypeImpl <em>Results Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.ResultsTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getResultsType()
         * @generated
         */
        EClass RESULTS_TYPE = eINSTANCE.getResultsType();

        /**
         * The meta object literal for the '<em><b>Mapping</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESULTS_TYPE__MAPPING = eINSTANCE.getResultsType_Mapping();

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
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TASK_HANDLER_TYPE__NAME = eINSTANCE.getTaskHandlerType_Name();

        /**
         * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TASK_HANDLER_TYPE__CLASS = eINSTANCE.getTaskHandlerType_Class();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.EventListenerTypeImpl <em>Event Listener Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.EventListenerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl#getEventListenerType()
         * @generated
         */
        EClass EVENT_LISTENER_TYPE = eINSTANCE.getEventListenerType();

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
