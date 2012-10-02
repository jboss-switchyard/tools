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
     * The feature id for the '<em><b>Entry Point</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE1__ENTRY_POINT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Action Type1</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTION_TYPE1_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ChannelTypeImpl <em>Channel Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ChannelTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getChannelType()
     * @generated
     */
	int CHANNEL_TYPE = 2;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANNEL_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANNEL_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANNEL_TYPE__CLASS = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANNEL_TYPE__INPUT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANNEL_TYPE__NAME = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANNEL_TYPE__OPERATION = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANNEL_TYPE__REFERENCE = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Channel Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHANNEL_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 5;

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
     * The feature id for the '<em><b>Globals</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GLOBALS = 6;

    /**
     * The feature id for the '<em><b>Implementation Rules</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPLEMENTATION_RULES = 7;

	/**
     * The feature id for the '<em><b>Mapping</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MAPPING = 8;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__RESOURCE = 9;

	/**
     * The feature id for the '<em><b>Facts</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FACTS = 10;

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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.GlobalsTypeImpl <em>Globals Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.GlobalsTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getGlobalsType()
     * @generated
     */
    int GLOBALS_TYPE = 4;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBALS_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBALS_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBALS_TYPE__MAPPING = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Globals Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBALS_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.MappingTypeImpl <em>Mapping Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.MappingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getMappingType()
     * @generated
     */
    int MAPPING_TYPE = 5;

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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.ResourceTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getResourceType()
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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesImplementationTypeImpl <em>Implementation Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesImplementationTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getRulesImplementationType()
     * @generated
     */
	int RULES_IMPLEMENTATION_TYPE = 7;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RULES_IMPLEMENTATION_TYPE__DOCUMENTATION = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RULES_IMPLEMENTATION_TYPE__ANY_ATTRIBUTE = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RULES_IMPLEMENTATION_TYPE__POLICY_SETS = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RULES_IMPLEMENTATION_TYPE__REQUIRES = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__REQUIRES;

	/**
     * The feature id for the '<em><b>Agent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_IMPLEMENTATION_TYPE__AGENT = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__AGENT;

    /**
     * The feature id for the '<em><b>Clock</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_IMPLEMENTATION_TYPE__CLOCK = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__CLOCK;

    /**
     * The feature id for the '<em><b>Event Processing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_IMPLEMENTATION_TYPE__EVENT_PROCESSING = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__EVENT_PROCESSING;

    /**
     * The feature id for the '<em><b>Max Threads</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_IMPLEMENTATION_TYPE__MAX_THREADS = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__MAX_THREADS;

    /**
     * The feature id for the '<em><b>Multithread Evaluation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_IMPLEMENTATION_TYPE__MULTITHREAD_EVALUATION = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE__MULTITHREAD_EVALUATION;

    /**
     * The feature id for the '<em><b>Action</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RULES_IMPLEMENTATION_TYPE__ACTION = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Audit</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RULES_IMPLEMENTATION_TYPE__AUDIT = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Event Listener</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_IMPLEMENTATION_TYPE__EVENT_LISTENER = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Channel</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RULES_IMPLEMENTATION_TYPE__CHANNEL = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RULES_IMPLEMENTATION_TYPE__RESOURCE = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Globals</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_IMPLEMENTATION_TYPE__GLOBALS = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Facts</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULES_IMPLEMENTATION_TYPE__FACTS = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Implementation Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RULES_IMPLEMENTATION_TYPE_FEATURE_COUNT = CommonRulesPackage.COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT + 7;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.FactsTypeImpl <em>Facts Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.FactsTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getFactsType()
     * @generated
     */
    int FACTS_TYPE = 8;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACTS_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACTS_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACTS_TYPE__MAPPING = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Facts Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACTS_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.EventListenerTypeImpl <em>Event Listener Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.EventListenerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getEventListenerType()
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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType <em>Action Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.ActionType
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getActionType()
     * @generated
     */
	int ACTION_TYPE = 10;

	/**
     * The meta object id for the '<em>Action Type Object</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.rules.ActionType
     * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getActionTypeObject()
     * @generated
     */
	int ACTION_TYPE_OBJECT = 11;


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
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getName()
     * @see #getActionType1()
     * @generated
     */
    EAttribute getActionType1_Name();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getType()
     * @see #getActionType1()
     * @generated
     */
    EAttribute getActionType1_Type();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getEntryPoint <em>Entry Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Entry Point</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getEntryPoint()
     * @see #getActionType1()
     * @generated
     */
    EAttribute getActionType1_EntryPoint();

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
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getClass_ <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getClass_()
     * @see #getChannelType()
     * @generated
     */
    EAttribute getChannelType_Class();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getInput()
     * @see #getChannelType()
     * @generated
     */
    EAttribute getChannelType_Input();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getName()
     * @see #getChannelType()
     * @generated
     */
    EAttribute getChannelType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getOperation()
     * @see #getChannelType()
     * @generated
     */
    EAttribute getChannelType_Operation();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getReference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reference</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ChannelType#getReference()
     * @see #getChannelType()
     * @generated
     */
    EAttribute getChannelType_Reference();

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
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getGlobals <em>Globals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Globals</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getGlobals()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Globals();

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
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getMapping <em>Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Mapping</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getMapping()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Mapping();

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
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getFacts <em>Facts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Facts</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getFacts()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Facts();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getEventListener <em>Event Listener</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event Listener</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getEventListener()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EventListener();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.GlobalsType <em>Globals Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Globals Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.GlobalsType
     * @generated
     */
    EClass getGlobalsType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.rules.GlobalsType#getMapping <em>Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Mapping</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.GlobalsType#getMapping()
     * @see #getGlobalsType()
     * @generated
     */
    EReference getGlobalsType_Mapping();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.MappingType <em>Mapping Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mapping Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.MappingType
     * @generated
     */
    EClass getMappingType();

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
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getEventListener <em>Event Listener</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Event Listener</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getEventListener()
     * @see #getRulesImplementationType()
     * @generated
     */
    EReference getRulesImplementationType_EventListener();

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
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getGlobals <em>Globals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Globals</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getGlobals()
     * @see #getRulesImplementationType()
     * @generated
     */
    EReference getRulesImplementationType_Globals();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getFacts <em>Facts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Facts</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType#getFacts()
     * @see #getRulesImplementationType()
     * @generated
     */
    EReference getRulesImplementationType_Facts();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.FactsType <em>Facts Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Facts Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.FactsType
     * @generated
     */
    EClass getFactsType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.rules.FactsType#getMapping <em>Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Mapping</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.FactsType#getMapping()
     * @see #getFactsType()
     * @generated
     */
    EReference getFactsType_Mapping();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.rules.EventListenerType <em>Event Listener Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Listener Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.rules.EventListenerType
     * @generated
     */
    EClass getEventListenerType();

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
         * The meta object literal for the '<em><b>Entry Point</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTION_TYPE1__ENTRY_POINT = eINSTANCE.getActionType1_EntryPoint();

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
         * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANNEL_TYPE__CLASS = eINSTANCE.getChannelType_Class();

        /**
         * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANNEL_TYPE__INPUT = eINSTANCE.getChannelType_Input();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANNEL_TYPE__NAME = eINSTANCE.getChannelType_Name();

        /**
         * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANNEL_TYPE__OPERATION = eINSTANCE.getChannelType_Operation();

        /**
         * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANNEL_TYPE__REFERENCE = eINSTANCE.getChannelType_Reference();

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
         * The meta object literal for the '<em><b>Globals</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__GLOBALS = eINSTANCE.getDocumentRoot_Globals();

        /**
         * The meta object literal for the '<em><b>Implementation Rules</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__IMPLEMENTATION_RULES = eINSTANCE.getDocumentRoot_ImplementationRules();

		/**
         * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__MAPPING = eINSTANCE.getDocumentRoot_Mapping();

        /**
         * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__RESOURCE = eINSTANCE.getDocumentRoot_Resource();

		/**
         * The meta object literal for the '<em><b>Facts</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__FACTS = eINSTANCE.getDocumentRoot_Facts();

        /**
         * The meta object literal for the '<em><b>Event Listener</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__EVENT_LISTENER = eINSTANCE.getDocumentRoot_EventListener();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.GlobalsTypeImpl <em>Globals Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.GlobalsTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getGlobalsType()
         * @generated
         */
        EClass GLOBALS_TYPE = eINSTANCE.getGlobalsType();

        /**
         * The meta object literal for the '<em><b>Mapping</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GLOBALS_TYPE__MAPPING = eINSTANCE.getGlobalsType_Mapping();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.MappingTypeImpl <em>Mapping Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.MappingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getMappingType()
         * @generated
         */
        EClass MAPPING_TYPE = eINSTANCE.getMappingType();

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
         * The meta object literal for the '<em><b>Event Listener</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULES_IMPLEMENTATION_TYPE__EVENT_LISTENER = eINSTANCE.getRulesImplementationType_EventListener();

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
         * The meta object literal for the '<em><b>Globals</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULES_IMPLEMENTATION_TYPE__GLOBALS = eINSTANCE.getRulesImplementationType_Globals();

        /**
         * The meta object literal for the '<em><b>Facts</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULES_IMPLEMENTATION_TYPE__FACTS = eINSTANCE.getRulesImplementationType_Facts();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.FactsTypeImpl <em>Facts Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.FactsTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getFactsType()
         * @generated
         */
        EClass FACTS_TYPE = eINSTANCE.getFactsType();

        /**
         * The meta object literal for the '<em><b>Mapping</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FACTS_TYPE__MAPPING = eINSTANCE.getFactsType_Mapping();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.rules.impl.EventListenerTypeImpl <em>Event Listener Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.EventListenerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl#getEventListenerType()
         * @generated
         */
        EClass EVENT_LISTENER_TYPE = eINSTANCE.getEventListenerType();

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
