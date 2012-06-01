/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.commonrules;

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
 * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesFactory
 * @model kind="package"
 * @generated
 */
public interface CommonRulesPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "commonrules";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "urn:switchyard-component-common-rules:config:1.0";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "common_rules";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	CommonRulesPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl.init();

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.AuditType1Impl <em>Audit Type1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.AuditType1Impl
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getAuditType1()
     * @generated
     */
    int AUDIT_TYPE1 = 0;

    /**
     * The number of structural features of the '<em>Audit Type1</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDIT_TYPE1_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonImplementationTypeImpl <em>Common Implementation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonImplementationTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getCommonImplementationType()
     * @generated
     */
    int COMMON_IMPLEMENTATION_TYPE = 1;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_IMPLEMENTATION_TYPE__DOCUMENTATION = ScaPackage.IMPLEMENTATION__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_IMPLEMENTATION_TYPE__ANY_ATTRIBUTE = ScaPackage.IMPLEMENTATION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_IMPLEMENTATION_TYPE__POLICY_SETS = ScaPackage.IMPLEMENTATION__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_IMPLEMENTATION_TYPE__REQUIRES = ScaPackage.IMPLEMENTATION__REQUIRES;

    /**
     * The feature id for the '<em><b>Agent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_IMPLEMENTATION_TYPE__AGENT = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Clock</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_IMPLEMENTATION_TYPE__CLOCK = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Event Processing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_IMPLEMENTATION_TYPE__EVENT_PROCESSING = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Max Threads</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_IMPLEMENTATION_TYPE__MAX_THREADS = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Multithread Evaluation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_IMPLEMENTATION_TYPE__MULTITHREAD_EVALUATION = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Common Implementation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_IMPLEMENTATION_TYPE_FEATURE_COUNT = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getDocumentRoot()
     * @generated
     */
	int DOCUMENT_ROOT = 2;

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
     * The feature id for the '<em><b>Audit</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__AUDIT = 3;

	/**
     * The feature id for the '<em><b>Implementation Common Rules</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPLEMENTATION_COMMON_RULES = 4;

	/**
     * The feature id for the '<em><b>Mapping</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MAPPING = 5;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT_FEATURE_COUNT = 6;


	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.MappingTypeImpl <em>Mapping Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.MappingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getMappingType()
     * @generated
     */
    int MAPPING_TYPE = 3;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__DOCUMENTATION = ScaPackage.COMMON_EXTENSION_BASE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__ANY_ATTRIBUTE = ScaPackage.COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Context Scope</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__CONTEXT_SCOPE = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__EXPRESSION = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Expression Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__EXPRESSION_TYPE = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Variable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__VARIABLE = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Mapping Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE_FEATURE_COUNT = ScaPackage.COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.AuditType <em>Audit Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.AuditType
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getAuditType()
     * @generated
     */
    int AUDIT_TYPE = 4;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.ClockType <em>Clock Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.ClockType
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getClockType()
     * @generated
     */
    int CLOCK_TYPE = 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.ContextScope <em>Context Scope</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.ContextScope
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getContextScope()
     * @generated
     */
    int CONTEXT_SCOPE = 6;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.EventProcessingType <em>Event Processing Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.EventProcessingType
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getEventProcessingType()
     * @generated
     */
    int EVENT_PROCESSING_TYPE = 7;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.ExpressionType <em>Expression Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.ExpressionType
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getExpressionType()
     * @generated
     */
    int EXPRESSION_TYPE = 8;

    /**
     * The meta object id for the '<em>Audit Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.AuditType
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getAuditTypeObject()
     * @generated
     */
    int AUDIT_TYPE_OBJECT = 9;

    /**
     * The meta object id for the '<em>Clock Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.ClockType
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getClockTypeObject()
     * @generated
     */
    int CLOCK_TYPE_OBJECT = 10;

    /**
     * The meta object id for the '<em>Context Scope Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.ContextScope
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getContextScopeObject()
     * @generated
     */
    int CONTEXT_SCOPE_OBJECT = 11;

    /**
     * The meta object id for the '<em>Event Processing Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.EventProcessingType
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getEventProcessingTypeObject()
     * @generated
     */
    int EVENT_PROCESSING_TYPE_OBJECT = 12;

    /**
     * The meta object id for the '<em>Expression Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.ExpressionType
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getExpressionTypeObject()
     * @generated
     */
    int EXPRESSION_TYPE_OBJECT = 13;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.commonrules.AuditType1 <em>Audit Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Audit Type1</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.AuditType1
     * @generated
     */
    EClass getAuditType1();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType <em>Common Implementation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Common Implementation Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType
     * @generated
     */
    EClass getCommonImplementationType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType#isAgent <em>Agent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Agent</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType#isAgent()
     * @see #getCommonImplementationType()
     * @generated
     */
    EAttribute getCommonImplementationType_Agent();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType#getClock <em>Clock</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Clock</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType#getClock()
     * @see #getCommonImplementationType()
     * @generated
     */
    EAttribute getCommonImplementationType_Clock();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType#getEventProcessing <em>Event Processing</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Event Processing</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType#getEventProcessing()
     * @see #getCommonImplementationType()
     * @generated
     */
    EAttribute getCommonImplementationType_EventProcessing();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType#getMaxThreads <em>Max Threads</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Threads</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType#getMaxThreads()
     * @see #getCommonImplementationType()
     * @generated
     */
    EAttribute getCommonImplementationType_MaxThreads();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType#isMultithreadEvaluation <em>Multithread Evaluation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Multithread Evaluation</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType#isMultithreadEvaluation()
     * @see #getCommonImplementationType()
     * @generated
     */
    EAttribute getCommonImplementationType_MultithreadEvaluation();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot
     * @generated
     */
	EClass getDocumentRoot();

	/**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
	EAttribute getDocumentRoot_Mixed();

	/**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getAudit <em>Audit</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Audit</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getAudit()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Audit();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getImplementationCommonRules <em>Implementation Common Rules</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Implementation Common Rules</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getImplementationCommonRules()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ImplementationCommonRules();

	/**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getMapping <em>Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Mapping</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getMapping()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Mapping();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.commonrules.MappingType <em>Mapping Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mapping Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.MappingType
     * @generated
     */
    EClass getMappingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.commonrules.MappingType#getContextScope <em>Context Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Context Scope</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.MappingType#getContextScope()
     * @see #getMappingType()
     * @generated
     */
    EAttribute getMappingType_ContextScope();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.commonrules.MappingType#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.MappingType#getExpression()
     * @see #getMappingType()
     * @generated
     */
    EAttribute getMappingType_Expression();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.commonrules.MappingType#getExpressionType <em>Expression Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.MappingType#getExpressionType()
     * @see #getMappingType()
     * @generated
     */
    EAttribute getMappingType_ExpressionType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.commonrules.MappingType#getVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Variable</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.MappingType#getVariable()
     * @see #getMappingType()
     * @generated
     */
    EAttribute getMappingType_Variable();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.commonrules.AuditType <em>Audit Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Audit Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.AuditType
     * @generated
     */
    EEnum getAuditType();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.commonrules.ClockType <em>Clock Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Clock Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.ClockType
     * @generated
     */
    EEnum getClockType();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.commonrules.ContextScope <em>Context Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Context Scope</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.ContextScope
     * @generated
     */
    EEnum getContextScope();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.commonrules.EventProcessingType <em>Event Processing Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Event Processing Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.EventProcessingType
     * @generated
     */
    EEnum getEventProcessingType();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.commonrules.ExpressionType <em>Expression Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Expression Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.ExpressionType
     * @generated
     */
    EEnum getExpressionType();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.commonrules.AuditType <em>Audit Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Audit Type Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.AuditType
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.commonrules.AuditType"
     *        extendedMetaData="name='auditType:Object' baseType='auditType'"
     * @generated
     */
    EDataType getAuditTypeObject();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.commonrules.ClockType <em>Clock Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Clock Type Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.ClockType
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.commonrules.ClockType"
     *        extendedMetaData="name='clockType:Object' baseType='clockType'"
     * @generated
     */
    EDataType getClockTypeObject();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.commonrules.ContextScope <em>Context Scope Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Context Scope Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.ContextScope
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.commonrules.ContextScope"
     *        extendedMetaData="name='contextScope:Object' baseType='contextScope'"
     * @generated
     */
    EDataType getContextScopeObject();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.commonrules.EventProcessingType <em>Event Processing Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Event Processing Type Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.EventProcessingType
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.commonrules.EventProcessingType"
     *        extendedMetaData="name='eventProcessingType:Object' baseType='eventProcessingType'"
     * @generated
     */
    EDataType getEventProcessingTypeObject();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.commonrules.ExpressionType <em>Expression Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Expression Type Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.ExpressionType
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.commonrules.ExpressionType"
     *        extendedMetaData="name='expressionType:Object' baseType='expressionType'"
     * @generated
     */
    EDataType getExpressionTypeObject();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	CommonRulesFactory getCommonRulesFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.AuditType1Impl <em>Audit Type1</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.AuditType1Impl
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getAuditType1()
         * @generated
         */
        EClass AUDIT_TYPE1 = eINSTANCE.getAuditType1();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonImplementationTypeImpl <em>Common Implementation Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonImplementationTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getCommonImplementationType()
         * @generated
         */
        EClass COMMON_IMPLEMENTATION_TYPE = eINSTANCE.getCommonImplementationType();

        /**
         * The meta object literal for the '<em><b>Agent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMMON_IMPLEMENTATION_TYPE__AGENT = eINSTANCE.getCommonImplementationType_Agent();

        /**
         * The meta object literal for the '<em><b>Clock</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMMON_IMPLEMENTATION_TYPE__CLOCK = eINSTANCE.getCommonImplementationType_Clock();

        /**
         * The meta object literal for the '<em><b>Event Processing</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMMON_IMPLEMENTATION_TYPE__EVENT_PROCESSING = eINSTANCE.getCommonImplementationType_EventProcessing();

        /**
         * The meta object literal for the '<em><b>Max Threads</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMMON_IMPLEMENTATION_TYPE__MAX_THREADS = eINSTANCE.getCommonImplementationType_MaxThreads();

        /**
         * The meta object literal for the '<em><b>Multithread Evaluation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMMON_IMPLEMENTATION_TYPE__MULTITHREAD_EVALUATION = eINSTANCE.getCommonImplementationType_MultithreadEvaluation();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Audit</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__AUDIT = eINSTANCE.getDocumentRoot_Audit();

		/**
         * The meta object literal for the '<em><b>Implementation Common Rules</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__IMPLEMENTATION_COMMON_RULES = eINSTANCE.getDocumentRoot_ImplementationCommonRules();

		/**
         * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__MAPPING = eINSTANCE.getDocumentRoot_Mapping();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.MappingTypeImpl <em>Mapping Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.MappingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getMappingType()
         * @generated
         */
        EClass MAPPING_TYPE = eINSTANCE.getMappingType();

        /**
         * The meta object literal for the '<em><b>Context Scope</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPING_TYPE__CONTEXT_SCOPE = eINSTANCE.getMappingType_ContextScope();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPING_TYPE__EXPRESSION = eINSTANCE.getMappingType_Expression();

        /**
         * The meta object literal for the '<em><b>Expression Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPING_TYPE__EXPRESSION_TYPE = eINSTANCE.getMappingType_ExpressionType();

        /**
         * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAPPING_TYPE__VARIABLE = eINSTANCE.getMappingType_Variable();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.AuditType <em>Audit Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.AuditType
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getAuditType()
         * @generated
         */
        EEnum AUDIT_TYPE = eINSTANCE.getAuditType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.ClockType <em>Clock Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.ClockType
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getClockType()
         * @generated
         */
        EEnum CLOCK_TYPE = eINSTANCE.getClockType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.ContextScope <em>Context Scope</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.ContextScope
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getContextScope()
         * @generated
         */
        EEnum CONTEXT_SCOPE = eINSTANCE.getContextScope();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.EventProcessingType <em>Event Processing Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.EventProcessingType
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getEventProcessingType()
         * @generated
         */
        EEnum EVENT_PROCESSING_TYPE = eINSTANCE.getEventProcessingType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.ExpressionType <em>Expression Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.ExpressionType
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getExpressionType()
         * @generated
         */
        EEnum EXPRESSION_TYPE = eINSTANCE.getExpressionType();

        /**
         * The meta object literal for the '<em>Audit Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.AuditType
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getAuditTypeObject()
         * @generated
         */
        EDataType AUDIT_TYPE_OBJECT = eINSTANCE.getAuditTypeObject();

        /**
         * The meta object literal for the '<em>Clock Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.ClockType
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getClockTypeObject()
         * @generated
         */
        EDataType CLOCK_TYPE_OBJECT = eINSTANCE.getClockTypeObject();

        /**
         * The meta object literal for the '<em>Context Scope Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.ContextScope
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getContextScopeObject()
         * @generated
         */
        EDataType CONTEXT_SCOPE_OBJECT = eINSTANCE.getContextScopeObject();

        /**
         * The meta object literal for the '<em>Event Processing Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.EventProcessingType
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getEventProcessingTypeObject()
         * @generated
         */
        EDataType EVENT_PROCESSING_TYPE_OBJECT = eINSTANCE.getEventProcessingTypeObject();

        /**
         * The meta object literal for the '<em>Expression Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.ExpressionType
         * @see org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl#getExpressionTypeObject()
         * @generated
         */
        EDataType EXPRESSION_TYPE_OBJECT = eINSTANCE.getExpressionTypeObject();

	}

} //CommonRulesPackage
