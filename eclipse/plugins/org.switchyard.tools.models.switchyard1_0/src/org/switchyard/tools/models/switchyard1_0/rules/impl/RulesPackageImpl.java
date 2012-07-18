/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.rules.impl;

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
import org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage;
import org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl;
import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage;
import org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage;
import org.switchyard.tools.models.switchyard1_0.resteasy.impl.ResteasyPackageImpl;
import org.switchyard.tools.models.switchyard1_0.rules.ActionType;
import org.switchyard.tools.models.switchyard1_0.rules.ActionType1;
import org.switchyard.tools.models.switchyard1_0.rules.AuditType;
import org.switchyard.tools.models.switchyard1_0.rules.ChannelType;
import org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.rules.GlobalsType;
import org.switchyard.tools.models.switchyard1_0.rules.MappingType;
import org.switchyard.tools.models.switchyard1_0.rules.ResourceType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesFactory;
import org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;
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
public class RulesPackageImpl extends EPackageImpl implements RulesPackage {
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
	private EClass channelTypeEClass = null;

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
    private EClass globalsTypeEClass = null;

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
	private EClass resourceTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass rulesImplementationTypeEClass = null;

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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private RulesPackageImpl() {
        super(eNS_URI, RulesFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link RulesPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static RulesPackage init() {
        if (isInited) return (RulesPackage)EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);

        // Obtain or create and register package
        RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RulesPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        ScaPackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        BeanPackageImpl theBeanPackage = (BeanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI) instanceof BeanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI) : BeanPackage.eINSTANCE);
        BPELPackageImpl theBPELPackage = (BPELPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPELPackage.eNS_URI) instanceof BPELPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPELPackage.eNS_URI) : BPELPackage.eINSTANCE);
        BPMPackageImpl theBPMPackage = (BPMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPMPackage.eNS_URI) instanceof BPMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPMPackage.eNS_URI) : BPMPackage.eINSTANCE);
        CommonRulesPackageImpl theCommonRulesPackage = (CommonRulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonRulesPackage.eNS_URI) instanceof CommonRulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonRulesPackage.eNS_URI) : CommonRulesPackage.eINSTANCE);
        SwitchyardPackageImpl theSwitchyardPackage = (SwitchyardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SwitchyardPackage.eNS_URI) instanceof SwitchyardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SwitchyardPackage.eNS_URI) : SwitchyardPackage.eINSTANCE);
        ClojurePackageImpl theClojurePackage = (ClojurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClojurePackage.eNS_URI) instanceof ClojurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClojurePackage.eNS_URI) : ClojurePackage.eINSTANCE);
        HornetQPackageImpl theHornetQPackage = (HornetQPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HornetQPackage.eNS_URI) instanceof HornetQPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HornetQPackage.eNS_URI) : HornetQPackage.eINSTANCE);
        SOAPPackageImpl theSOAPPackage = (SOAPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SOAPPackage.eNS_URI) instanceof SOAPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SOAPPackage.eNS_URI) : SOAPPackage.eINSTANCE);
        TransformPackageImpl theTransformPackage = (TransformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransformPackage.eNS_URI) instanceof TransformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransformPackage.eNS_URI) : TransformPackage.eINSTANCE);
        ValidatePackageImpl theValidatePackage = (ValidatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValidatePackage.eNS_URI) instanceof ValidatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValidatePackage.eNS_URI) : ValidatePackage.eINSTANCE);
        CamelPackageImpl theCamelPackage = (CamelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) instanceof CamelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) : CamelPackage.eINSTANCE);
        SpringPackageImpl theSpringPackage = (SpringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI) instanceof SpringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI) : SpringPackage.eINSTANCE);
        JcaPackageImpl theJcaPackage = (JcaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JcaPackage.eNS_URI) instanceof JcaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JcaPackage.eNS_URI) : JcaPackage.eINSTANCE);
        ResteasyPackageImpl theResteasyPackage = (ResteasyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResteasyPackage.eNS_URI) instanceof ResteasyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResteasyPackage.eNS_URI) : ResteasyPackage.eINSTANCE);

        // Load packages
        theSpringPackage.loadPackage();

        // Create package meta-data objects
        theRulesPackage.createPackageContents();
        theBeanPackage.createPackageContents();
        theBPELPackage.createPackageContents();
        theBPMPackage.createPackageContents();
        theCommonRulesPackage.createPackageContents();
        theSwitchyardPackage.createPackageContents();
        theClojurePackage.createPackageContents();
        theHornetQPackage.createPackageContents();
        theSOAPPackage.createPackageContents();
        theTransformPackage.createPackageContents();
        theValidatePackage.createPackageContents();
        theCamelPackage.createPackageContents();
        theJcaPackage.createPackageContents();
        theResteasyPackage.createPackageContents();

        // Initialize created meta-data
        theRulesPackage.initializePackageContents();
        theBeanPackage.initializePackageContents();
        theBPELPackage.initializePackageContents();
        theBPMPackage.initializePackageContents();
        theCommonRulesPackage.initializePackageContents();
        theSwitchyardPackage.initializePackageContents();
        theClojurePackage.initializePackageContents();
        theHornetQPackage.initializePackageContents();
        theSOAPPackage.initializePackageContents();
        theTransformPackage.initializePackageContents();
        theValidatePackage.initializePackageContents();
        theCamelPackage.initializePackageContents();
        theJcaPackage.initializePackageContents();
        theResteasyPackage.initializePackageContents();

        // Fix loaded packages
        theSpringPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theRulesPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(RulesPackage.eNS_URI, theRulesPackage);
        return theRulesPackage;
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
	public EClass getChannelType() {
        return channelTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChannelType_Class() {
        return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChannelType_Input() {
        return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChannelType_Name() {
        return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChannelType_Operation() {
        return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChannelType_Reference() {
        return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(4);
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
	public EReference getDocumentRoot_Channel() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Globals() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ImplementationRules() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Mapping() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Resource() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGlobalsType() {
        return globalsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGlobalsType_Mapping() {
        return (EReference)globalsTypeEClass.getEStructuralFeatures().get(0);
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
	public EClass getResourceType() {
        return resourceTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRulesImplementationType() {
        return rulesImplementationTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRulesImplementationType_Action() {
        return (EReference)rulesImplementationTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRulesImplementationType_Audit() {
        return (EReference)rulesImplementationTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRulesImplementationType_Channel() {
        return (EReference)rulesImplementationTypeEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRulesImplementationType_Resource() {
        return (EReference)rulesImplementationTypeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRulesImplementationType_Globals() {
        return (EReference)rulesImplementationTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRulesImplementationType_MessageContentName() {
        return (EAttribute)rulesImplementationTypeEClass.getEStructuralFeatures().get(5);
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
	public RulesFactory getRulesFactory() {
        return (RulesFactory)getEFactoryInstance();
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

        channelTypeEClass = createEClass(CHANNEL_TYPE);
        createEAttribute(channelTypeEClass, CHANNEL_TYPE__CLASS);
        createEAttribute(channelTypeEClass, CHANNEL_TYPE__INPUT);
        createEAttribute(channelTypeEClass, CHANNEL_TYPE__NAME);
        createEAttribute(channelTypeEClass, CHANNEL_TYPE__OPERATION);
        createEAttribute(channelTypeEClass, CHANNEL_TYPE__REFERENCE);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__ACTION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__AUDIT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__CHANNEL);
        createEReference(documentRootEClass, DOCUMENT_ROOT__GLOBALS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__IMPLEMENTATION_RULES);
        createEReference(documentRootEClass, DOCUMENT_ROOT__MAPPING);
        createEReference(documentRootEClass, DOCUMENT_ROOT__RESOURCE);

        globalsTypeEClass = createEClass(GLOBALS_TYPE);
        createEReference(globalsTypeEClass, GLOBALS_TYPE__MAPPING);

        mappingTypeEClass = createEClass(MAPPING_TYPE);

        resourceTypeEClass = createEClass(RESOURCE_TYPE);

        rulesImplementationTypeEClass = createEClass(RULES_IMPLEMENTATION_TYPE);
        createEReference(rulesImplementationTypeEClass, RULES_IMPLEMENTATION_TYPE__ACTION);
        createEReference(rulesImplementationTypeEClass, RULES_IMPLEMENTATION_TYPE__AUDIT);
        createEReference(rulesImplementationTypeEClass, RULES_IMPLEMENTATION_TYPE__CHANNEL);
        createEReference(rulesImplementationTypeEClass, RULES_IMPLEMENTATION_TYPE__RESOURCE);
        createEReference(rulesImplementationTypeEClass, RULES_IMPLEMENTATION_TYPE__GLOBALS);
        createEAttribute(rulesImplementationTypeEClass, RULES_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_NAME);

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
        channelTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        globalsTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        mappingTypeEClass.getESuperTypes().add(theCommonRulesPackage.getMappingType());
        resourceTypeEClass.getESuperTypes().add(theSwitchyardPackage.getResourceType());
        rulesImplementationTypeEClass.getESuperTypes().add(theCommonRulesPackage.getCommonImplementationType());

        // Initialize classes and features; add operations and parameters
        initEClass(actionType1EClass, ActionType1.class, "ActionType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getActionType1_Name(), theXMLTypePackage.getNCName(), "name", null, 1, 1, ActionType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActionType1_Type(), this.getActionType(), "type", null, 1, 1, ActionType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActionType1_EventType(), theXMLTypePackage.getString(), "eventType", null, 0, 1, ActionType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(auditTypeEClass, AuditType.class, "AuditType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(channelTypeEClass, ChannelType.class, "ChannelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getChannelType_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChannelType_Input(), theXMLTypePackage.getString(), "input", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChannelType_Name(), theXMLTypePackage.getNCName(), "name", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChannelType_Operation(), theXMLTypePackage.getNCName(), "operation", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChannelType_Reference(), theXMLTypePackage.getString(), "reference", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Action(), this.getActionType1(), null, "action", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Audit(), this.getAuditType(), null, "audit", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Channel(), this.getChannelType(), null, "channel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Globals(), this.getGlobalsType(), null, "globals", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_ImplementationRules(), this.getRulesImplementationType(), null, "implementationRules", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Mapping(), this.getMappingType(), null, "mapping", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Resource(), this.getResourceType(), null, "resource", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(globalsTypeEClass, GlobalsType.class, "GlobalsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getGlobalsType_Mapping(), this.getMappingType(), null, "mapping", null, 0, -1, GlobalsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(mappingTypeEClass, MappingType.class, "MappingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(resourceTypeEClass, ResourceType.class, "ResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(rulesImplementationTypeEClass, RulesImplementationType.class, "RulesImplementationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRulesImplementationType_Action(), this.getActionType1(), null, "action", null, 0, -1, RulesImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRulesImplementationType_Audit(), this.getAuditType(), null, "audit", null, 0, 1, RulesImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRulesImplementationType_Channel(), this.getChannelType(), null, "channel", null, 0, -1, RulesImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRulesImplementationType_Resource(), this.getResourceType(), null, "resource", null, 0, -1, RulesImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRulesImplementationType_Globals(), this.getGlobalsType(), null, "globals", null, 0, 1, RulesImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRulesImplementationType_MessageContentName(), theXMLTypePackage.getString(), "messageContentName", null, 0, 1, RulesImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(actionTypeEEnum, ActionType.class, "ActionType");
        addEEnumLiteral(actionTypeEEnum, ActionType.EXECUTE);
        addEEnumLiteral(actionTypeEEnum, ActionType.FIREALLRULES);
        addEEnumLiteral(actionTypeEEnum, ActionType.FIREUNTILHALT);

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
          (channelTypeEClass, 
           source, 
           new String[] {
             "name", "ChannelType",
             "kind", "empty"
           });		
        addAnnotation
          (getChannelType_Class(), 
           source, 
           new String[] {
             "name", "class",
             "kind", "attribute"
           });		
        addAnnotation
          (getChannelType_Input(), 
           source, 
           new String[] {
             "name", "input",
             "kind", "attribute"
           });		
        addAnnotation
          (getChannelType_Name(), 
           source, 
           new String[] {
             "name", "name",
             "kind", "attribute"
           });		
        addAnnotation
          (getChannelType_Operation(), 
           source, 
           new String[] {
             "name", "operation",
             "kind", "attribute"
           });		
        addAnnotation
          (getChannelType_Reference(), 
           source, 
           new String[] {
             "name", "reference",
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
          (getDocumentRoot_Channel(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "channel",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Globals(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "globals",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_ImplementationRules(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "implementation.rules",
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
          (getDocumentRoot_Resource(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "resource",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#resource"
           });		
        addAnnotation
          (globalsTypeEClass, 
           source, 
           new String[] {
             "name", "GlobalsType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getGlobalsType_Mapping(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "mapping",
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
          (resourceTypeEClass, 
           source, 
           new String[] {
             "name", "ResourceType",
             "kind", "empty"
           });		
        addAnnotation
          (rulesImplementationTypeEClass, 
           source, 
           new String[] {
             "name", "RulesImplementationType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getRulesImplementationType_Action(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "action",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRulesImplementationType_Audit(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "audit",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRulesImplementationType_Channel(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "channel",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRulesImplementationType_Resource(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "resource",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRulesImplementationType_Globals(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "globals",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRulesImplementationType_MessageContentName(), 
           source, 
           new String[] {
             "name", "messageContentName",
             "kind", "attribute"
           });
    }

} //RulesPackageImpl
