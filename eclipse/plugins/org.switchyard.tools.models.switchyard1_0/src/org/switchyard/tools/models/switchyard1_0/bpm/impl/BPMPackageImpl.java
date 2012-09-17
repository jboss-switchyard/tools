/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm.impl;

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
import org.switchyard.tools.models.switchyard1_0.bpm.ActionType;
import org.switchyard.tools.models.switchyard1_0.bpm.ActionType1;
import org.switchyard.tools.models.switchyard1_0.bpm.AuditType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMFactory;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.bpm.MappingType;
import org.switchyard.tools.models.switchyard1_0.bpm.ParametersType;
import org.switchyard.tools.models.switchyard1_0.bpm.ResourceType;
import org.switchyard.tools.models.switchyard1_0.bpm.ResultsType;
import org.switchyard.tools.models.switchyard1_0.bpm.TaskHandlerType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl;
import org.switchyard.tools.models.switchyard1_0.clojure.ClojurePackage;
import org.switchyard.tools.models.switchyard1_0.clojure.impl.ClojurePackageImpl;
import org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage;
import org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl;
import org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorPackage;
import org.switchyard.tools.models.switchyard1_0.commonselector.impl.CommonselectorPackageImpl;
import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage;
import org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl;
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
public class BPMPackageImpl extends EPackageImpl implements BPMPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass actionType1EClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass auditTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bpmImplementationTypeEClass = null;

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
    private EClass parametersTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass resourceTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resultsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass taskHandlerTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum actionTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType actionTypeObjectEDataType = null;

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
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private BPMPackageImpl() {
        super(eNS_URI, BPMFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link BPMPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static BPMPackage init() {
        if (isInited) return (BPMPackage)EPackage.Registry.INSTANCE.getEPackage(BPMPackage.eNS_URI);

        // Obtain or create and register package
        BPMPackageImpl theBPMPackage = (BPMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BPMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BPMPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        ScaPackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        BeanPackageImpl theBeanPackage = (BeanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI) instanceof BeanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI) : BeanPackage.eINSTANCE);
        BPELPackageImpl theBPELPackage = (BPELPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPELPackage.eNS_URI) instanceof BPELPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPELPackage.eNS_URI) : BPELPackage.eINSTANCE);
        CommonRulesPackageImpl theCommonRulesPackage = (CommonRulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonRulesPackage.eNS_URI) instanceof CommonRulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonRulesPackage.eNS_URI) : CommonRulesPackage.eINSTANCE);
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
        CommonselectorPackageImpl theCommonselectorPackage = (CommonselectorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonselectorPackage.eNS_URI) instanceof CommonselectorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonselectorPackage.eNS_URI) : CommonselectorPackage.eINSTANCE);

        // Load packages
        theSpringPackage.loadPackage();

        // Create package meta-data objects
        theBPMPackage.createPackageContents();
        theBeanPackage.createPackageContents();
        theBPELPackage.createPackageContents();
        theCommonRulesPackage.createPackageContents();
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
        theCommonselectorPackage.createPackageContents();

        // Initialize created meta-data
        theBPMPackage.initializePackageContents();
        theBeanPackage.initializePackageContents();
        theBPELPackage.initializePackageContents();
        theCommonRulesPackage.initializePackageContents();
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
        theCommonselectorPackage.initializePackageContents();

        // Fix loaded packages
        theSpringPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theBPMPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(BPMPackage.eNS_URI, theBPMPackage);
        return theBPMPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getActionType1() {
        return actionType1EClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActionType1_Name() {
        return (EAttribute)actionType1EClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActionType1_Type() {
        return (EAttribute)actionType1EClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActionType1_EventType() {
        return (EAttribute)actionType1EClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAuditType() {
        return auditTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBPMImplementationType() {
        return bpmImplementationTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBPMImplementationType_Action() {
        return (EReference)bpmImplementationTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBPMImplementationType_Audit() {
        return (EReference)bpmImplementationTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBPMImplementationType_TaskHandler() {
        return (EReference)bpmImplementationTypeEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBPMImplementationType_Resource() {
        return (EReference)bpmImplementationTypeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMImplementationType_Parameters() {
        return (EReference)bpmImplementationTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMImplementationType_Results() {
        return (EReference)bpmImplementationTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBPMImplementationType_ProcessDefinition() {
        return (EAttribute)bpmImplementationTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBPMImplementationType_ProcessDefinitionType() {
        return (EAttribute)bpmImplementationTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBPMImplementationType_ProcessId() {
        return (EAttribute)bpmImplementationTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBPMImplementationType_MessageContentInName() {
        return (EAttribute)bpmImplementationTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBPMImplementationType_MessageContentOutName() {
        return (EAttribute)bpmImplementationTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBPMImplementationType_Persistent() {
        return (EAttribute)bpmImplementationTypeEClass.getEStructuralFeatures().get(11);
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
	public EReference getDocumentRoot_Audit() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ImplementationBpm() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Mapping() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Parameters() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Resource() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Results() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_TaskHandler() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
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
    public EClass getParametersType() {
        return parametersTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getParametersType_Mapping() {
        return (EReference)parametersTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getResourceType() {
        return resourceTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResultsType() {
        return resultsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getResultsType_Mapping() {
        return (EReference)resultsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTaskHandlerType() {
        return taskHandlerTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTaskHandlerType_Name() {
        return (EAttribute)taskHandlerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTaskHandlerType_Class() {
        return (EAttribute)taskHandlerTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getActionType() {
        return actionTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getActionTypeObject() {
        return actionTypeObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BPMFactory getBPMFactory() {
        return (BPMFactory)getEFactoryInstance();
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
        actionType1EClass = createEClass(ACTION_TYPE1);
        createEAttribute(actionType1EClass, ACTION_TYPE1__NAME);
        createEAttribute(actionType1EClass, ACTION_TYPE1__TYPE);
        createEAttribute(actionType1EClass, ACTION_TYPE1__EVENT_TYPE);

        auditTypeEClass = createEClass(AUDIT_TYPE);

        bpmImplementationTypeEClass = createEClass(BPM_IMPLEMENTATION_TYPE);
        createEReference(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__ACTION);
        createEReference(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__AUDIT);
        createEReference(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__TASK_HANDLER);
        createEReference(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__RESOURCE);
        createEReference(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__PARAMETERS);
        createEReference(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__RESULTS);
        createEAttribute(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__PROCESS_DEFINITION);
        createEAttribute(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__PROCESS_DEFINITION_TYPE);
        createEAttribute(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__PROCESS_ID);
        createEAttribute(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_IN_NAME);
        createEAttribute(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_OUT_NAME);
        createEAttribute(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__PERSISTENT);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__ACTION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__AUDIT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__IMPLEMENTATION_BPM);
        createEReference(documentRootEClass, DOCUMENT_ROOT__MAPPING);
        createEReference(documentRootEClass, DOCUMENT_ROOT__PARAMETERS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__RESOURCE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__RESULTS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__TASK_HANDLER);

        mappingTypeEClass = createEClass(MAPPING_TYPE);

        parametersTypeEClass = createEClass(PARAMETERS_TYPE);
        createEReference(parametersTypeEClass, PARAMETERS_TYPE__MAPPING);

        resourceTypeEClass = createEClass(RESOURCE_TYPE);

        resultsTypeEClass = createEClass(RESULTS_TYPE);
        createEReference(resultsTypeEClass, RESULTS_TYPE__MAPPING);

        taskHandlerTypeEClass = createEClass(TASK_HANDLER_TYPE);
        createEAttribute(taskHandlerTypeEClass, TASK_HANDLER_TYPE__NAME);
        createEAttribute(taskHandlerTypeEClass, TASK_HANDLER_TYPE__CLASS);

        // Create enums
        actionTypeEEnum = createEEnum(ACTION_TYPE);

        // Create data types
        actionTypeObjectEDataType = createEDataType(ACTION_TYPE_OBJECT);
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
        CommonRulesPackage theCommonRulesPackage = (CommonRulesPackage)EPackage.Registry.INSTANCE.getEPackage(CommonRulesPackage.eNS_URI);
        SwitchyardPackage theSwitchyardPackage = (SwitchyardPackage)EPackage.Registry.INSTANCE.getEPackage(SwitchyardPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        actionType1EClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        auditTypeEClass.getESuperTypes().add(theCommonRulesPackage.getAuditType1());
        bpmImplementationTypeEClass.getESuperTypes().add(theCommonRulesPackage.getCommonImplementationType());
        mappingTypeEClass.getESuperTypes().add(theCommonRulesPackage.getMappingType());
        parametersTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        resourceTypeEClass.getESuperTypes().add(theSwitchyardPackage.getResourceType());
        resultsTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        taskHandlerTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());

        // Initialize classes and features; add operations and parameters
        initEClass(actionType1EClass, ActionType1.class, "ActionType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getActionType1_Name(), theXMLTypePackage.getNCName(), "name", null, 1, 1, ActionType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActionType1_Type(), this.getActionType(), "type", null, 1, 1, ActionType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActionType1_EventType(), theXMLTypePackage.getString(), "eventType", null, 0, 1, ActionType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(auditTypeEClass, AuditType.class, "AuditType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(bpmImplementationTypeEClass, BPMImplementationType.class, "BPMImplementationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBPMImplementationType_Action(), this.getActionType1(), null, "action", null, 0, -1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBPMImplementationType_Audit(), this.getAuditType(), null, "audit", null, 0, 1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBPMImplementationType_TaskHandler(), this.getTaskHandlerType(), null, "taskHandler", null, 0, -1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBPMImplementationType_Resource(), this.getResourceType(), null, "resource", null, 0, -1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBPMImplementationType_Parameters(), this.getParametersType(), null, "parameters", null, 0, 1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBPMImplementationType_Results(), this.getResultsType(), null, "results", null, 0, 1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBPMImplementationType_ProcessDefinition(), theXMLTypePackage.getString(), "processDefinition", null, 1, 1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBPMImplementationType_ProcessDefinitionType(), theXMLTypePackage.getNCName(), "processDefinitionType", "BPMN2", 0, 1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBPMImplementationType_ProcessId(), theXMLTypePackage.getString(), "processId", null, 1, 1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBPMImplementationType_MessageContentInName(), theXMLTypePackage.getString(), "messageContentInName", "messageContentIn", 0, 1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBPMImplementationType_MessageContentOutName(), theXMLTypePackage.getString(), "messageContentOutName", "messageContentOut", 0, 1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBPMImplementationType_Persistent(), theXMLTypePackage.getBoolean(), "persistent", "false", 0, 1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Action(), this.getActionType1(), null, "action", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Audit(), this.getAuditType(), null, "audit", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_ImplementationBpm(), this.getBPMImplementationType(), null, "implementationBpm", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Mapping(), this.getMappingType(), null, "mapping", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Parameters(), this.getParametersType(), null, "parameters", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Resource(), this.getResourceType(), null, "resource", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Results(), this.getResultsType(), null, "results", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_TaskHandler(), this.getTaskHandlerType(), null, "taskHandler", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(mappingTypeEClass, MappingType.class, "MappingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(parametersTypeEClass, ParametersType.class, "ParametersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getParametersType_Mapping(), this.getMappingType(), null, "mapping", null, 0, -1, ParametersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(resourceTypeEClass, ResourceType.class, "ResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(resultsTypeEClass, ResultsType.class, "ResultsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getResultsType_Mapping(), this.getMappingType(), null, "mapping", null, 0, -1, ResultsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(taskHandlerTypeEClass, TaskHandlerType.class, "TaskHandlerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTaskHandlerType_Name(), theXMLTypePackage.getNCName(), "name", null, 0, 1, TaskHandlerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTaskHandlerType_Class(), theXMLTypePackage.getName_(), "class", null, 1, 1, TaskHandlerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(actionTypeEEnum, ActionType.class, "ActionType");
        addEEnumLiteral(actionTypeEEnum, ActionType.STARTPROCESS);
        addEEnumLiteral(actionTypeEEnum, ActionType.SIGNALEVENT);
        addEEnumLiteral(actionTypeEEnum, ActionType.ABORTPROCESSINSTANCE);

        // Initialize data types
        initEDataType(actionTypeObjectEDataType, ActionType.class, "ActionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
          (actionTypeEEnum, 
           source, 
           new String[] {
             "name", "actionType"
           });		
        addAnnotation
          (actionType1EClass, 
           source, 
           new String[] {
             "name", "ActionType",
             "kind", "empty"
           });		
        addAnnotation
          (getActionType1_Name(), 
           source, 
           new String[] {
             "name", "name",
             "kind", "attribute"
           });		
        addAnnotation
          (getActionType1_Type(), 
           source, 
           new String[] {
             "name", "type",
             "kind", "attribute"
           });		
        addAnnotation
          (getActionType1_EventType(), 
           source, 
           new String[] {
             "name", "eventType",
             "kind", "attribute"
           });		
        addAnnotation
          (actionTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "actionType:Object",
             "baseType", "actionType"
           });		
        addAnnotation
          (auditTypeEClass, 
           source, 
           new String[] {
             "name", "AuditType",
             "kind", "empty"
           });		
        addAnnotation
          (bpmImplementationTypeEClass, 
           source, 
           new String[] {
             "name", "BPMImplementationType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getBPMImplementationType_Action(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "action",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBPMImplementationType_Audit(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "audit",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBPMImplementationType_TaskHandler(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "taskHandler",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBPMImplementationType_Resource(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "resource",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBPMImplementationType_Parameters(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "parameters",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBPMImplementationType_Results(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "results",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBPMImplementationType_ProcessDefinition(), 
           source, 
           new String[] {
             "name", "processDefinition",
             "kind", "attribute"
           });		
        addAnnotation
          (getBPMImplementationType_ProcessDefinitionType(), 
           source, 
           new String[] {
             "name", "processDefinitionType",
             "kind", "attribute"
           });		
        addAnnotation
          (getBPMImplementationType_ProcessId(), 
           source, 
           new String[] {
             "name", "processId",
             "kind", "attribute"
           });		
        addAnnotation
          (getBPMImplementationType_MessageContentInName(), 
           source, 
           new String[] {
             "name", "messageContentInName",
             "kind", "attribute"
           });		
        addAnnotation
          (getBPMImplementationType_MessageContentOutName(), 
           source, 
           new String[] {
             "name", "messageContentOutName",
             "kind", "attribute"
           });		
        addAnnotation
          (getBPMImplementationType_Persistent(), 
           source, 
           new String[] {
             "name", "persistent",
             "kind", "attribute"
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
             "name", "action",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Audit(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "audit",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-component-common-rules:config:1.0#audit"
           });		
        addAnnotation
          (getDocumentRoot_ImplementationBpm(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "implementation.bpm",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-component-common-rules:config:1.0#implementation.common.rules"
           });		
        addAnnotation
          (getDocumentRoot_Mapping(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "mapping",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-component-common-rules:config:1.0#mapping"
           });		
        addAnnotation
          (getDocumentRoot_Parameters(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "parameters",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Resource(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "resource",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#resource"
           });		
        addAnnotation
          (getDocumentRoot_Results(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "results",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_TaskHandler(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "taskHandler",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (mappingTypeEClass, 
           source, 
           new String[] {
             "name", "MappingType",
             "kind", "empty"
           });		
        addAnnotation
          (parametersTypeEClass, 
           source, 
           new String[] {
             "name", "ParametersType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getParametersType_Mapping(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "mapping",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (resourceTypeEClass, 
           source, 
           new String[] {
             "name", "ResourceType",
             "kind", "empty"
           });		
        addAnnotation
          (resultsTypeEClass, 
           source, 
           new String[] {
             "name", "ResultsType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getResultsType_Mapping(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "mapping",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (taskHandlerTypeEClass, 
           source, 
           new String[] {
             "name", "TaskHandlerType",
             "kind", "empty"
           });		
        addAnnotation
          (getTaskHandlerType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getTaskHandlerType_Class(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "class"
           });
    }

} //BPMPackageImpl
