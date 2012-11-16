/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.commonrules.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
























import org.open.oasis.docs.ns.opencsa.sca.bpel.BPELPackage;

import org.open.oasis.docs.ns.opencsa.sca.bpel.impl.BPELPackageImpl;
import org.switchyard.tools.models.switchyard1_0.bean.BeanPackage;
import org.switchyard.tools.models.switchyard1_0.bean.impl.BeanPackageImpl;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl;
import org.switchyard.tools.models.switchyard1_0.clojure.ClojurePackage;
import org.switchyard.tools.models.switchyard1_0.clojure.impl.ClojurePackageImpl;
import org.switchyard.tools.models.switchyard1_0.commonrules.AuditType;
import org.switchyard.tools.models.switchyard1_0.commonrules.AuditType1;
import org.switchyard.tools.models.switchyard1_0.commonrules.ClockType;
import org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType;
import org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesFactory;
import org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage;
import org.switchyard.tools.models.switchyard1_0.commonrules.ContextScope;
import org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.commonrules.EventListenerType;
import org.switchyard.tools.models.switchyard1_0.commonrules.EventProcessingType;
import org.switchyard.tools.models.switchyard1_0.commonrules.ExpressionType;
import org.switchyard.tools.models.switchyard1_0.commonrules.MappingType;
import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage;
import org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl;
import org.switchyard.tools.models.switchyard1_0.http.HttpPackage;
import org.switchyard.tools.models.switchyard1_0.http.impl.HttpPackageImpl;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl;
import org.switchyard.tools.models.switchyard1_0.remote.RemotePackage;
import org.switchyard.tools.models.switchyard1_0.remote.impl.RemotePackageImpl;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage;
import org.switchyard.tools.models.switchyard1_0.resteasy.impl.ResteasyPackageImpl;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;
import org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;
import org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.impl.SpringPackageImpl;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl;
import org.switchyard.tools.models.switchyard1_0.transform.TransformPackage;
import org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl;
import org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage;
import org.switchyard.tools.models.switchyard1_0.validate.impl.ValidatePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonRulesPackageImpl extends EPackageImpl implements CommonRulesPackage {
	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass auditType1EClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass commonImplementationTypeEClass = null;
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
    private EClass mappingTypeEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventListenerTypeEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum auditTypeEEnum = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum clockTypeEEnum = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum contextScopeEEnum = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum eventProcessingTypeEEnum = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum expressionTypeEEnum = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType auditTypeObjectEDataType = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType clockTypeObjectEDataType = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType contextScopeObjectEDataType = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType eventProcessingTypeObjectEDataType = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType expressionTypeObjectEDataType = null;

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
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private CommonRulesPackageImpl() {
        super(eNS_URI, CommonRulesFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link CommonRulesPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static CommonRulesPackage init() {
        if (isInited) return (CommonRulesPackage)EPackage.Registry.INSTANCE.getEPackage(CommonRulesPackage.eNS_URI);

        // Obtain or create and register package
        CommonRulesPackageImpl theCommonRulesPackage = (CommonRulesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommonRulesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommonRulesPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        ScaPackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        BeanPackageImpl theBeanPackage = (BeanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI) instanceof BeanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI) : BeanPackage.eINSTANCE);
        BPELPackageImpl theBPELPackage = (BPELPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPELPackage.eNS_URI) instanceof BPELPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPELPackage.eNS_URI) : BPELPackage.eINSTANCE);
        BPMPackageImpl theBPMPackage = (BPMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPMPackage.eNS_URI) instanceof BPMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPMPackage.eNS_URI) : BPMPackage.eINSTANCE);
        SwitchyardPackageImpl theSwitchyardPackage = (SwitchyardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SwitchyardPackage.eNS_URI) instanceof SwitchyardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SwitchyardPackage.eNS_URI) : SwitchyardPackage.eINSTANCE);
        ClojurePackageImpl theClojurePackage = (ClojurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClojurePackage.eNS_URI) instanceof ClojurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClojurePackage.eNS_URI) : ClojurePackage.eINSTANCE);
        HornetQPackageImpl theHornetQPackage = (HornetQPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HornetQPackage.eNS_URI) instanceof HornetQPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HornetQPackage.eNS_URI) : HornetQPackage.eINSTANCE);
        RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
        SOAPPackageImpl theSOAPPackage = (SOAPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SOAPPackage.eNS_URI) instanceof SOAPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SOAPPackage.eNS_URI) : SOAPPackage.eINSTANCE);
        TransformPackageImpl theTransformPackage = (TransformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransformPackage.eNS_URI) instanceof TransformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransformPackage.eNS_URI) : TransformPackage.eINSTANCE);
        ValidatePackageImpl theValidatePackage = (ValidatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValidatePackage.eNS_URI) instanceof ValidatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValidatePackage.eNS_URI) : ValidatePackage.eINSTANCE);
        CamelPackageImpl theCamelPackage = (CamelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) instanceof CamelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) : CamelPackage.eINSTANCE);
        SpringPackageImpl theSpringPackage = (SpringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI) instanceof SpringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI) : SpringPackage.eINSTANCE);
        JcaPackageImpl theJcaPackage = (JcaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JcaPackage.eNS_URI) instanceof JcaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JcaPackage.eNS_URI) : JcaPackage.eINSTANCE);
        ResteasyPackageImpl theResteasyPackage = (ResteasyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResteasyPackage.eNS_URI) instanceof ResteasyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResteasyPackage.eNS_URI) : ResteasyPackage.eINSTANCE);
        HttpPackageImpl theHttpPackage = (HttpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HttpPackage.eNS_URI) instanceof HttpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HttpPackage.eNS_URI) : HttpPackage.eINSTANCE);
        RemotePackageImpl theRemotePackage = (RemotePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RemotePackage.eNS_URI) instanceof RemotePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RemotePackage.eNS_URI) : RemotePackage.eINSTANCE);

        // Load packages
        theSpringPackage.loadPackage();

        // Create package meta-data objects
        theCommonRulesPackage.createPackageContents();
        theBeanPackage.createPackageContents();
        theBPELPackage.createPackageContents();
        theBPMPackage.createPackageContents();
        theSwitchyardPackage.createPackageContents();
        theClojurePackage.createPackageContents();
        theHornetQPackage.createPackageContents();
        theRulesPackage.createPackageContents();
        theSOAPPackage.createPackageContents();
        theTransformPackage.createPackageContents();
        theValidatePackage.createPackageContents();
        theCamelPackage.createPackageContents();
        theJcaPackage.createPackageContents();
        theResteasyPackage.createPackageContents();
        theHttpPackage.createPackageContents();
        theRemotePackage.createPackageContents();

        // Initialize created meta-data
        theCommonRulesPackage.initializePackageContents();
        theBeanPackage.initializePackageContents();
        theBPELPackage.initializePackageContents();
        theBPMPackage.initializePackageContents();
        theSwitchyardPackage.initializePackageContents();
        theClojurePackage.initializePackageContents();
        theHornetQPackage.initializePackageContents();
        theRulesPackage.initializePackageContents();
        theSOAPPackage.initializePackageContents();
        theTransformPackage.initializePackageContents();
        theValidatePackage.initializePackageContents();
        theCamelPackage.initializePackageContents();
        theJcaPackage.initializePackageContents();
        theResteasyPackage.initializePackageContents();
        theHttpPackage.initializePackageContents();
        theRemotePackage.initializePackageContents();

        // Fix loaded packages
        theSpringPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theCommonRulesPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(CommonRulesPackage.eNS_URI, theCommonRulesPackage);
        return theCommonRulesPackage;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAuditType1() {
        return auditType1EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAuditType1_Interval() {
        return (EAttribute)auditType1EClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAuditType1_Log() {
        return (EAttribute)auditType1EClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAuditType1_Type() {
        return (EAttribute)auditType1EClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCommonImplementationType() {
        return commonImplementationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCommonImplementationType_Agent() {
        return (EAttribute)commonImplementationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCommonImplementationType_Clock() {
        return (EAttribute)commonImplementationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCommonImplementationType_EventProcessing() {
        return (EAttribute)commonImplementationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCommonImplementationType_MaxThreads() {
        return (EAttribute)commonImplementationTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCommonImplementationType_MultithreadEvaluation() {
        return (EAttribute)commonImplementationTypeEClass.getEStructuralFeatures().get(4);
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
	public EReference getDocumentRoot_Audit() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ImplementationCommonRules() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Mapping() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EventListener() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMappingType() {
        return mappingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMappingType_ContextScope() {
        return (EAttribute)mappingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMappingType_Expression() {
        return (EAttribute)mappingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMappingType_ExpressionType() {
        return (EAttribute)mappingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMappingType_Variable() {
        return (EAttribute)mappingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEventListenerType() {
        return eventListenerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEventListenerType_Class() {
        return (EAttribute)eventListenerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAuditType() {
        return auditTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getClockType() {
        return clockTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getContextScope() {
        return contextScopeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getEventProcessingType() {
        return eventProcessingTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getExpressionType() {
        return expressionTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getAuditTypeObject() {
        return auditTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getClockTypeObject() {
        return clockTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getContextScopeObject() {
        return contextScopeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getEventProcessingTypeObject() {
        return eventProcessingTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getExpressionTypeObject() {
        return expressionTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CommonRulesFactory getCommonRulesFactory() {
        return (CommonRulesFactory)getEFactoryInstance();
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
        auditType1EClass = createEClass(AUDIT_TYPE1);
        createEAttribute(auditType1EClass, AUDIT_TYPE1__INTERVAL);
        createEAttribute(auditType1EClass, AUDIT_TYPE1__LOG);
        createEAttribute(auditType1EClass, AUDIT_TYPE1__TYPE);

        commonImplementationTypeEClass = createEClass(COMMON_IMPLEMENTATION_TYPE);
        createEAttribute(commonImplementationTypeEClass, COMMON_IMPLEMENTATION_TYPE__AGENT);
        createEAttribute(commonImplementationTypeEClass, COMMON_IMPLEMENTATION_TYPE__CLOCK);
        createEAttribute(commonImplementationTypeEClass, COMMON_IMPLEMENTATION_TYPE__EVENT_PROCESSING);
        createEAttribute(commonImplementationTypeEClass, COMMON_IMPLEMENTATION_TYPE__MAX_THREADS);
        createEAttribute(commonImplementationTypeEClass, COMMON_IMPLEMENTATION_TYPE__MULTITHREAD_EVALUATION);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__AUDIT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__IMPLEMENTATION_COMMON_RULES);
        createEReference(documentRootEClass, DOCUMENT_ROOT__MAPPING);
        createEReference(documentRootEClass, DOCUMENT_ROOT__EVENT_LISTENER);

        mappingTypeEClass = createEClass(MAPPING_TYPE);
        createEAttribute(mappingTypeEClass, MAPPING_TYPE__CONTEXT_SCOPE);
        createEAttribute(mappingTypeEClass, MAPPING_TYPE__EXPRESSION);
        createEAttribute(mappingTypeEClass, MAPPING_TYPE__EXPRESSION_TYPE);
        createEAttribute(mappingTypeEClass, MAPPING_TYPE__VARIABLE);

        eventListenerTypeEClass = createEClass(EVENT_LISTENER_TYPE);
        createEAttribute(eventListenerTypeEClass, EVENT_LISTENER_TYPE__CLASS);

        // Create enums
        auditTypeEEnum = createEEnum(AUDIT_TYPE);
        clockTypeEEnum = createEEnum(CLOCK_TYPE);
        contextScopeEEnum = createEEnum(CONTEXT_SCOPE);
        eventProcessingTypeEEnum = createEEnum(EVENT_PROCESSING_TYPE);
        expressionTypeEEnum = createEEnum(EXPRESSION_TYPE);

        // Create data types
        auditTypeObjectEDataType = createEDataType(AUDIT_TYPE_OBJECT);
        clockTypeObjectEDataType = createEDataType(CLOCK_TYPE_OBJECT);
        contextScopeObjectEDataType = createEDataType(CONTEXT_SCOPE_OBJECT);
        eventProcessingTypeObjectEDataType = createEDataType(EVENT_PROCESSING_TYPE_OBJECT);
        expressionTypeObjectEDataType = createEDataType(EXPRESSION_TYPE_OBJECT);
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
        ScaPackage theScaPackage = (ScaPackage)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI);
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        auditType1EClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        commonImplementationTypeEClass.getESuperTypes().add(theScaPackage.getImplementation());
        mappingTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        eventListenerTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());

        // Initialize classes and features; add operations and parameters
        initEClass(auditType1EClass, AuditType1.class, "AuditType1", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAuditType1_Interval(), theXMLTypePackage.getInt(), "interval", "1000", 0, 1, AuditType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAuditType1_Log(), theXMLTypePackage.getString(), "log", "event", 0, 1, AuditType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAuditType1_Type(), this.getAuditType(), "type", "THREADED_FILE", 0, 1, AuditType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(commonImplementationTypeEClass, CommonImplementationType.class, "CommonImplementationType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCommonImplementationType_Agent(), theXMLTypePackage.getBoolean(), "agent", "false", 0, 1, CommonImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCommonImplementationType_Clock(), this.getClockType(), "clock", "REALTIME", 0, 1, CommonImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCommonImplementationType_EventProcessing(), this.getEventProcessingType(), "eventProcessing", "CLOUD", 0, 1, CommonImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCommonImplementationType_MaxThreads(), theXMLTypePackage.getInt(), "maxThreads", null, 0, 1, CommonImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCommonImplementationType_MultithreadEvaluation(), theXMLTypePackage.getBoolean(), "multithreadEvaluation", null, 0, 1, CommonImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Audit(), this.getAuditType1(), null, "audit", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_ImplementationCommonRules(), this.getCommonImplementationType(), null, "implementationCommonRules", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Mapping(), this.getMappingType(), null, "mapping", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_EventListener(), this.getEventListenerType(), null, "eventListener", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(mappingTypeEClass, MappingType.class, "MappingType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMappingType_ContextScope(), this.getContextScope(), "contextScope", "IN", 0, 1, MappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMappingType_Expression(), theXMLTypePackage.getString(), "expression", "", 1, 1, MappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMappingType_ExpressionType(), this.getExpressionType(), "expressionType", "MVEL", 0, 1, MappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMappingType_Variable(), theXMLTypePackage.getNCName(), "variable", null, 0, 1, MappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eventListenerTypeEClass, EventListenerType.class, "EventListenerType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEventListenerType_Class(), theXMLTypePackage.getNCName(), "class", null, 1, 1, EventListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(auditTypeEEnum, AuditType.class, "AuditType");
        addEEnumLiteral(auditTypeEEnum, AuditType.CONSOLE);
        addEEnumLiteral(auditTypeEEnum, AuditType.FILE);
        addEEnumLiteral(auditTypeEEnum, AuditType.THREADEDFILE);

        initEEnum(clockTypeEEnum, ClockType.class, "ClockType");
        addEEnumLiteral(clockTypeEEnum, ClockType.REALTIME);
        addEEnumLiteral(clockTypeEEnum, ClockType.PSEUDO);

        initEEnum(contextScopeEEnum, ContextScope.class, "ContextScope");
        addEEnumLiteral(contextScopeEEnum, ContextScope.IN);
        addEEnumLiteral(contextScopeEEnum, ContextScope.OUT);
        addEEnumLiteral(contextScopeEEnum, ContextScope.EXCHANGE);

        initEEnum(eventProcessingTypeEEnum, EventProcessingType.class, "EventProcessingType");
        addEEnumLiteral(eventProcessingTypeEEnum, EventProcessingType.CLOUD);
        addEEnumLiteral(eventProcessingTypeEEnum, EventProcessingType.STREAM);

        initEEnum(expressionTypeEEnum, ExpressionType.class, "ExpressionType");
        addEEnumLiteral(expressionTypeEEnum, ExpressionType.MVEL);

        // Initialize data types
        initEDataType(auditTypeObjectEDataType, AuditType.class, "AuditTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(clockTypeObjectEDataType, ClockType.class, "ClockTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(contextScopeObjectEDataType, ContextScope.class, "ContextScopeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(eventProcessingTypeObjectEDataType, EventProcessingType.class, "EventProcessingTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(expressionTypeObjectEDataType, ExpressionType.class, "ExpressionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
          (auditTypeEEnum, 
           source, 
           new String[] {
             "name", "auditType"
           });		
        addAnnotation
          (auditType1EClass, 
           source, 
           new String[] {
             "name", "AuditType",
             "kind", "empty"
           });		
        addAnnotation
          (getAuditType1_Interval(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "interval"
           });		
        addAnnotation
          (getAuditType1_Log(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "log"
           });		
        addAnnotation
          (getAuditType1_Type(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "type"
           });		
        addAnnotation
          (auditTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "auditType:Object",
             "baseType", "auditType"
           });		
        addAnnotation
          (clockTypeEEnum, 
           source, 
           new String[] {
             "name", "clockType"
           });		
        addAnnotation
          (clockTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "clockType:Object",
             "baseType", "clockType"
           });		
        addAnnotation
          (commonImplementationTypeEClass, 
           source, 
           new String[] {
             "name", "CommonImplementationType",
             "kind", "empty"
           });		
        addAnnotation
          (getCommonImplementationType_Agent(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "agent"
           });		
        addAnnotation
          (getCommonImplementationType_Clock(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "clock"
           });		
        addAnnotation
          (getCommonImplementationType_EventProcessing(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "eventProcessing"
           });		
        addAnnotation
          (getCommonImplementationType_MaxThreads(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "maxThreads"
           });		
        addAnnotation
          (getCommonImplementationType_MultithreadEvaluation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "multithreadEvaluation"
           });		
        addAnnotation
          (contextScopeEEnum, 
           source, 
           new String[] {
             "name", "contextScope"
           });		
        addAnnotation
          (contextScopeObjectEDataType, 
           source, 
           new String[] {
             "name", "contextScope:Object",
             "baseType", "contextScope"
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
          (getDocumentRoot_Audit(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "audit",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_ImplementationCommonRules(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "implementation.common.rules",
             "namespace", "##targetNamespace",
             "affiliation", "http://docs.oasis-open.org/ns/opencsa/sca/200912#implementation"
           });		
        addAnnotation
          (getDocumentRoot_Mapping(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "mapping",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_EventListener(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "eventListener",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (eventProcessingTypeEEnum, 
           source, 
           new String[] {
             "name", "eventProcessingType"
           });		
        addAnnotation
          (eventProcessingTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "eventProcessingType:Object",
             "baseType", "eventProcessingType"
           });		
        addAnnotation
          (expressionTypeEEnum, 
           source, 
           new String[] {
             "name", "expressionType"
           });		
        addAnnotation
          (expressionTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "expressionType:Object",
             "baseType", "expressionType"
           });		
        addAnnotation
          (mappingTypeEClass, 
           source, 
           new String[] {
             "name", "MappingType",
             "kind", "empty"
           });		
        addAnnotation
          (getMappingType_ContextScope(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "contextScope"
           });		
        addAnnotation
          (getMappingType_Expression(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "expression"
           });		
        addAnnotation
          (getMappingType_ExpressionType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "expressionType"
           });		
        addAnnotation
          (getMappingType_Variable(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "variable"
           });		
        addAnnotation
          (eventListenerTypeEClass, 
           source, 
           new String[] {
             "name", "EventListenerType",
             "kind", "empty"
           });		
        addAnnotation
          (getEventListenerType_Class(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "class"
           });
    }

} //CommonRulesPackageImpl
