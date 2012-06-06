/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.impl;

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
import org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding;
import org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelDirectBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFtpsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelNettyBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelNettyTcpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelNettyUdpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.FileProducerType;
import org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.GenericFileProducerType;
import org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType;
import org.switchyard.tools.models.switchyard1_0.camel.RemoteFileConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.RemoteFileProducerType;
import org.switchyard.tools.models.switchyard1_0.camel.ScheduledBatchPollConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.ScheduledPollConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.TimeUnit;
import org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType;
import org.switchyard.tools.models.switchyard1_0.clojure.ClojurePackage;
import org.switchyard.tools.models.switchyard1_0.clojure.impl.ClojurePackageImpl;
import org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage;
import org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl;
import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage;
import org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl;
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
public class CamelPackageImpl extends EPackageImpl implements CamelPackage {
	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass baseCamelBindingEClass = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelAtomBindingTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelBindingTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelDirectBindingTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelFileBindingTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelFtpBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelFtpsBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelImplementationTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelJmsBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelNettyBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelNettyUdpBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelNettyTcpBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelMockBindingTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelOperationSelectorTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelSedaBindingTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelTimerBindingTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelSftpBindingTypeEClass = null;

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
    private EClass camelRemoteBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fileConsumerTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fileProducerTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass javaDSLTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass xmldslTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scheduledPollConsumerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass genericFileBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scheduledBatchPollConsumerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass genericFileConsumerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass genericFileProducerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass remoteFileConsumerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass remoteFileProducerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum timeUnitEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType timeUnitObjectEDataType = null;

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private CamelPackageImpl() {
        super(eNS_URI, CamelFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link CamelPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static CamelPackage init() {
        if (isInited) return (CamelPackage)EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI);

        // Obtain or create and register package
        CamelPackageImpl theCamelPackage = (CamelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CamelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CamelPackageImpl());

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
        RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
        SOAPPackageImpl theSOAPPackage = (SOAPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SOAPPackage.eNS_URI) instanceof SOAPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SOAPPackage.eNS_URI) : SOAPPackage.eINSTANCE);
        TransformPackageImpl theTransformPackage = (TransformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransformPackage.eNS_URI) instanceof TransformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransformPackage.eNS_URI) : TransformPackage.eINSTANCE);
        ValidatePackageImpl theValidatePackage = (ValidatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValidatePackage.eNS_URI) instanceof ValidatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValidatePackage.eNS_URI) : ValidatePackage.eINSTANCE);
        SpringPackageImpl theSpringPackage = (SpringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI) instanceof SpringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI) : SpringPackage.eINSTANCE);

        // Load packages
        theSpringPackage.loadPackage();

        // Create package meta-data objects
        theCamelPackage.createPackageContents();
        theBeanPackage.createPackageContents();
        theBPELPackage.createPackageContents();
        theBPMPackage.createPackageContents();
        theCommonRulesPackage.createPackageContents();
        theSwitchyardPackage.createPackageContents();
        theClojurePackage.createPackageContents();
        theHornetQPackage.createPackageContents();
        theRulesPackage.createPackageContents();
        theSOAPPackage.createPackageContents();
        theTransformPackage.createPackageContents();
        theValidatePackage.createPackageContents();

        // Initialize created meta-data
        theCamelPackage.initializePackageContents();
        theBeanPackage.initializePackageContents();
        theBPELPackage.initializePackageContents();
        theBPMPackage.initializePackageContents();
        theCommonRulesPackage.initializePackageContents();
        theSwitchyardPackage.initializePackageContents();
        theClojurePackage.initializePackageContents();
        theHornetQPackage.initializePackageContents();
        theRulesPackage.initializePackageContents();
        theSOAPPackage.initializePackageContents();
        theTransformPackage.initializePackageContents();
        theValidatePackage.initializePackageContents();

        // Fix loaded packages
        theSpringPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theCamelPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(CamelPackage.eNS_URI, theCamelPackage);
        return theCamelPackage;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBaseCamelBinding() {
        return baseCamelBindingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBaseCamelBinding_ContextMapper() {
        return (EReference)baseCamelBindingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBaseCamelBinding_MessageComposer() {
        return (EReference)baseCamelBindingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBaseCamelBinding_CamelOperationSelector() {
        return (EReference)baseCamelBindingEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelAtomBindingType() {
        return camelAtomBindingTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelAtomBindingType_FeedURI() {
        return (EAttribute)camelAtomBindingTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelAtomBindingType_SplitEntries() {
        return (EAttribute)camelAtomBindingTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelAtomBindingType_Filter() {
        return (EAttribute)camelAtomBindingTypeEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelAtomBindingType_LastUpdate() {
        return (EAttribute)camelAtomBindingTypeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelAtomBindingType_ThrottleEntries() {
        return (EAttribute)camelAtomBindingTypeEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelAtomBindingType_FeedHeader() {
        return (EAttribute)camelAtomBindingTypeEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelAtomBindingType_SortEntries() {
        return (EAttribute)camelAtomBindingTypeEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelAtomBindingType_Consume() {
        return (EReference)camelAtomBindingTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelBindingType() {
        return camelBindingTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelBindingType_ConfigURI() {
        return (EAttribute)camelBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelDirectBindingType() {
        return camelDirectBindingTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelDirectBindingType_ContextMapper() {
        return (EReference)camelDirectBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelDirectBindingType_MessageComposer() {
        return (EReference)camelDirectBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelDirectBindingType_NameElement() {
        return (EAttribute)camelDirectBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelFileBindingType() {
        return camelFileBindingTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelFileBindingType_Consume() {
        return (EReference)camelFileBindingTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelFileBindingType_Produce() {
        return (EReference)camelFileBindingTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelFtpBindingType() {
        return camelFtpBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_PassiveMode() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_Timeout() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_SoTimeout() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_SiteCommand() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelFtpsBindingType() {
        return camelFtpsBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpsBindingType_SecurityProtocol() {
        return (EAttribute)camelFtpsBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpsBindingType_IsImplicit() {
        return (EAttribute)camelFtpsBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpsBindingType_ExecPbsz() {
        return (EAttribute)camelFtpsBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpsBindingType_ExecProt() {
        return (EAttribute)camelFtpsBindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpsBindingType_DisableSecureDataChannelDefaults() {
        return (EAttribute)camelFtpsBindingTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelImplementationType() {
        return camelImplementationTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelImplementationType_Route() {
        return (EReference)camelImplementationTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelImplementationType_Java() {
        return (EReference)camelImplementationTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelImplementationType_Xml() {
        return (EReference)camelImplementationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelJmsBindingType() {
        return camelJmsBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_Queue() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_Topic() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_ConnectionFactory() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_Username() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_Password() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_ClientId() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_DurableSubscriptionName() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_ConcurrentConsumers() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_MaxConcurrentConsumers() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_DisableReplyTo() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_PreserveMessageQos() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_DeliveryPersistent() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_Priority() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_ExplicitQosEnabled() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_ReplyTo() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_ReplyToType() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_RequestTimeout() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_Selector() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_TimeToLive() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_Transacted() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJmsBindingType_TransactionManager() {
        return (EAttribute)camelJmsBindingTypeEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelNettyBindingType() {
        return camelNettyBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelNettyBindingType_Host() {
        return (EAttribute)camelNettyBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelNettyBindingType_Port() {
        return (EAttribute)camelNettyBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelNettyBindingType_ReceiveBufferSize() {
        return (EAttribute)camelNettyBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelNettyBindingType_SendBufferSize() {
        return (EAttribute)camelNettyBindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelNettyBindingType_ReuseAddress() {
        return (EAttribute)camelNettyBindingTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelNettyBindingType_Encoders() {
        return (EAttribute)camelNettyBindingTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelNettyBindingType_Decoders() {
        return (EAttribute)camelNettyBindingTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelNettyBindingType_AllowDefaultCodec() {
        return (EAttribute)camelNettyBindingTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelNettyBindingType_WorkerCount() {
        return (EAttribute)camelNettyBindingTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelNettyBindingType_Sync() {
        return (EAttribute)camelNettyBindingTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelNettyBindingType_Disconnect() {
        return (EAttribute)camelNettyBindingTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelNettyUdpBindingType() {
        return camelNettyUdpBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelNettyUdpBindingType_Broadcast() {
        return (EAttribute)camelNettyUdpBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelNettyTcpBindingType() {
        return camelNettyTcpBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelNettyTcpBindingType_Textline() {
        return (EAttribute)camelNettyTcpBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelNettyTcpBindingType_TcpNoDelay() {
        return (EAttribute)camelNettyTcpBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelNettyTcpBindingType_KeepAlive() {
        return (EAttribute)camelNettyTcpBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelMockBindingType() {
        return camelMockBindingTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelMockBindingType_ContextMapper() {
        return (EReference)camelMockBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelMockBindingType_MessageComposer() {
        return (EReference)camelMockBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMockBindingType_NameElement() {
        return (EAttribute)camelMockBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelMockBindingType_ReportGroup() {
        return (EAttribute)camelMockBindingTypeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelOperationSelectorType() {
        return camelOperationSelectorTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelOperationSelectorType_Namespace() {
        return (EAttribute)camelOperationSelectorTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelOperationSelectorType_OperationName() {
        return (EAttribute)camelOperationSelectorTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelSedaBindingType() {
        return camelSedaBindingTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelSedaBindingType_ContextMapper() {
        return (EReference)camelSedaBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelSedaBindingType_MessageComposer() {
        return (EReference)camelSedaBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSedaBindingType_NameElement() {
        return (EAttribute)camelSedaBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelSedaBindingType_Size() {
        return (EAttribute)camelSedaBindingTypeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelSedaBindingType_ConcurrentConsumers() {
        return (EAttribute)camelSedaBindingTypeEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelSedaBindingType_WaitForTaskToComplete() {
        return (EAttribute)camelSedaBindingTypeEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelSedaBindingType_Timeout() {
        return (EAttribute)camelSedaBindingTypeEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelSedaBindingType_MultipleConsumers() {
        return (EAttribute)camelSedaBindingTypeEClass.getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelSedaBindingType_LimitConcurrentConsumers() {
        return (EAttribute)camelSedaBindingTypeEClass.getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelTimerBindingType() {
        return camelTimerBindingTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelTimerBindingType_ContextMapper() {
        return (EReference)camelTimerBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelTimerBindingType_MessageComposer() {
        return (EReference)camelTimerBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelTimerBindingType_NameElement() {
        return (EAttribute)camelTimerBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelTimerBindingType_Time() {
        return (EAttribute)camelTimerBindingTypeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelTimerBindingType_Pattern() {
        return (EAttribute)camelTimerBindingTypeEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelTimerBindingType_Period() {
        return (EAttribute)camelTimerBindingTypeEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelTimerBindingType_Delay() {
        return (EAttribute)camelTimerBindingTypeEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelTimerBindingType_FixedRate() {
        return (EAttribute)camelTimerBindingTypeEClass.getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelTimerBindingType_Daemon() {
        return (EAttribute)camelTimerBindingTypeEClass.getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelSftpBindingType() {
        return camelSftpBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_KnownHostsFile() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_PrivateKeyFile() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_PrivateKeyFilePassphrase() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(2);
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
	public EReference getDocumentRoot_BindingAtom() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_BindingCamel() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_BindingDirect() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_BindingFile() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BindingFtp() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BindingFtps() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BindingJms() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_BindingMock() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_BindingSeda() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BindingSftp() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_BindingTimer() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ImplementationCamel() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BindingNettyUDP() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BindingNettyTCP() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelRemoteBindingType() {
        return camelRemoteBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_Host() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_Port() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_Username() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_Password() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_Binary() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_ConnectTimeout() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_Disconnect() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_MaximumReconnectAttempts() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_ReconnectDelay() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_Separator() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_Stepwise() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_ThrowExceptionOnConnectFailed() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelRemoteBindingType_Consume() {
        return (EReference)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelRemoteBindingType_Produce() {
        return (EReference)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFileConsumerType() {
        return fileConsumerTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFileProducerType() {
        return fileProducerTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJavaDSLType() {
        return javaDSLTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJavaDSLType_Class() {
        return (EAttribute)javaDSLTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getXMLDSLType() {
        return xmldslTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXMLDSLType_Path() {
        return (EAttribute)xmldslTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getScheduledPollConsumerType() {
        return scheduledPollConsumerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScheduledPollConsumerType_InitialDelay() {
        return (EAttribute)scheduledPollConsumerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScheduledPollConsumerType_Delay() {
        return (EAttribute)scheduledPollConsumerTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScheduledPollConsumerType_UseFixedDelay() {
        return (EAttribute)scheduledPollConsumerTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScheduledPollConsumerType_SendEmptyMessageWhenIdle() {
        return (EAttribute)scheduledPollConsumerTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScheduledPollConsumerType_TimeUnit() {
        return (EAttribute)scheduledPollConsumerTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGenericFileBindingType() {
        return genericFileBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileBindingType_Directory() {
        return (EAttribute)genericFileBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileBindingType_AutoCreate() {
        return (EAttribute)genericFileBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileBindingType_BufferSize() {
        return (EAttribute)genericFileBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileBindingType_FileName() {
        return (EAttribute)genericFileBindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileBindingType_Flatten() {
        return (EAttribute)genericFileBindingTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileBindingType_Charset() {
        return (EAttribute)genericFileBindingTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getScheduledBatchPollConsumerType() {
        return scheduledBatchPollConsumerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScheduledBatchPollConsumerType_MaxMessagesPerPoll() {
        return (EAttribute)scheduledBatchPollConsumerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGenericFileConsumerType() {
        return genericFileConsumerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_Delete() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_Recursive() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_Noop() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_PreMove() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_Move() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_MoveFailed() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_Include() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_Exclude() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_Idempotent() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_IdempotentRepository() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_InProgressRepository() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_Filter() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_Sorter() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_SortBy() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_ReadLock() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_ReadLockTimeout() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_ReadLockCheckInterval() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_ExclusiveReadLockStrategy() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_ProcessStrategy() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_StartingDirectoryMustExist() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_DirectoryMustExist() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_DoneFileName() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGenericFileProducerType() {
        return genericFileProducerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileProducerType_FileExist() {
        return (EAttribute)genericFileProducerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileProducerType_TempPrefix() {
        return (EAttribute)genericFileProducerTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileProducerType_TempFileName() {
        return (EAttribute)genericFileProducerTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileProducerType_KeepLastModified() {
        return (EAttribute)genericFileProducerTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileProducerType_EagerDeleteTargetFile() {
        return (EAttribute)genericFileProducerTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileProducerType_DoneFileName() {
        return (EAttribute)genericFileProducerTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRemoteFileConsumerType() {
        return remoteFileConsumerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRemoteFileProducerType() {
        return remoteFileProducerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTimeUnit() {
        return timeUnitEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTimeUnitObject() {
        return timeUnitObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CamelFactory getCamelFactory() {
        return (CamelFactory)getEFactoryInstance();
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
        baseCamelBindingEClass = createEClass(BASE_CAMEL_BINDING);
        createEReference(baseCamelBindingEClass, BASE_CAMEL_BINDING__CONTEXT_MAPPER);
        createEReference(baseCamelBindingEClass, BASE_CAMEL_BINDING__MESSAGE_COMPOSER);
        createEReference(baseCamelBindingEClass, BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR);

        camelAtomBindingTypeEClass = createEClass(CAMEL_ATOM_BINDING_TYPE);
        createEAttribute(camelAtomBindingTypeEClass, CAMEL_ATOM_BINDING_TYPE__FEED_URI);
        createEAttribute(camelAtomBindingTypeEClass, CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES);
        createEAttribute(camelAtomBindingTypeEClass, CAMEL_ATOM_BINDING_TYPE__FILTER);
        createEAttribute(camelAtomBindingTypeEClass, CAMEL_ATOM_BINDING_TYPE__LAST_UPDATE);
        createEAttribute(camelAtomBindingTypeEClass, CAMEL_ATOM_BINDING_TYPE__THROTTLE_ENTRIES);
        createEAttribute(camelAtomBindingTypeEClass, CAMEL_ATOM_BINDING_TYPE__FEED_HEADER);
        createEAttribute(camelAtomBindingTypeEClass, CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES);
        createEReference(camelAtomBindingTypeEClass, CAMEL_ATOM_BINDING_TYPE__CONSUME);

        camelBindingTypeEClass = createEClass(CAMEL_BINDING_TYPE);
        createEAttribute(camelBindingTypeEClass, CAMEL_BINDING_TYPE__CONFIG_URI);

        camelDirectBindingTypeEClass = createEClass(CAMEL_DIRECT_BINDING_TYPE);
        createEReference(camelDirectBindingTypeEClass, CAMEL_DIRECT_BINDING_TYPE__CONTEXT_MAPPER);
        createEReference(camelDirectBindingTypeEClass, CAMEL_DIRECT_BINDING_TYPE__MESSAGE_COMPOSER);
        createEAttribute(camelDirectBindingTypeEClass, CAMEL_DIRECT_BINDING_TYPE__NAME_ELEMENT);

        camelFileBindingTypeEClass = createEClass(CAMEL_FILE_BINDING_TYPE);
        createEReference(camelFileBindingTypeEClass, CAMEL_FILE_BINDING_TYPE__CONSUME);
        createEReference(camelFileBindingTypeEClass, CAMEL_FILE_BINDING_TYPE__PRODUCE);

        camelFtpBindingTypeEClass = createEClass(CAMEL_FTP_BINDING_TYPE);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__TIMEOUT);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__SITE_COMMAND);

        camelFtpsBindingTypeEClass = createEClass(CAMEL_FTPS_BINDING_TYPE);
        createEAttribute(camelFtpsBindingTypeEClass, CAMEL_FTPS_BINDING_TYPE__SECURITY_PROTOCOL);
        createEAttribute(camelFtpsBindingTypeEClass, CAMEL_FTPS_BINDING_TYPE__IS_IMPLICIT);
        createEAttribute(camelFtpsBindingTypeEClass, CAMEL_FTPS_BINDING_TYPE__EXEC_PBSZ);
        createEAttribute(camelFtpsBindingTypeEClass, CAMEL_FTPS_BINDING_TYPE__EXEC_PROT);
        createEAttribute(camelFtpsBindingTypeEClass, CAMEL_FTPS_BINDING_TYPE__DISABLE_SECURE_DATA_CHANNEL_DEFAULTS);

        camelImplementationTypeEClass = createEClass(CAMEL_IMPLEMENTATION_TYPE);
        createEReference(camelImplementationTypeEClass, CAMEL_IMPLEMENTATION_TYPE__ROUTE);
        createEReference(camelImplementationTypeEClass, CAMEL_IMPLEMENTATION_TYPE__JAVA);
        createEReference(camelImplementationTypeEClass, CAMEL_IMPLEMENTATION_TYPE__XML);

        camelJmsBindingTypeEClass = createEClass(CAMEL_JMS_BINDING_TYPE);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__QUEUE);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__TOPIC);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__CONNECTION_FACTORY);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__USERNAME);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__PASSWORD);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__CLIENT_ID);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__DURABLE_SUBSCRIPTION_NAME);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__CONCURRENT_CONSUMERS);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__DISABLE_REPLY_TO);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__PRESERVE_MESSAGE_QOS);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__DELIVERY_PERSISTENT);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__PRIORITY);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__EXPLICIT_QOS_ENABLED);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__REPLY_TO);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__REPLY_TO_TYPE);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__REQUEST_TIMEOUT);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__SELECTOR);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__TIME_TO_LIVE);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__TRANSACTED);
        createEAttribute(camelJmsBindingTypeEClass, CAMEL_JMS_BINDING_TYPE__TRANSACTION_MANAGER);

        camelNettyBindingTypeEClass = createEClass(CAMEL_NETTY_BINDING_TYPE);
        createEAttribute(camelNettyBindingTypeEClass, CAMEL_NETTY_BINDING_TYPE__HOST);
        createEAttribute(camelNettyBindingTypeEClass, CAMEL_NETTY_BINDING_TYPE__PORT);
        createEAttribute(camelNettyBindingTypeEClass, CAMEL_NETTY_BINDING_TYPE__RECEIVE_BUFFER_SIZE);
        createEAttribute(camelNettyBindingTypeEClass, CAMEL_NETTY_BINDING_TYPE__SEND_BUFFER_SIZE);
        createEAttribute(camelNettyBindingTypeEClass, CAMEL_NETTY_BINDING_TYPE__REUSE_ADDRESS);
        createEAttribute(camelNettyBindingTypeEClass, CAMEL_NETTY_BINDING_TYPE__ENCODERS);
        createEAttribute(camelNettyBindingTypeEClass, CAMEL_NETTY_BINDING_TYPE__DECODERS);
        createEAttribute(camelNettyBindingTypeEClass, CAMEL_NETTY_BINDING_TYPE__ALLOW_DEFAULT_CODEC);
        createEAttribute(camelNettyBindingTypeEClass, CAMEL_NETTY_BINDING_TYPE__WORKER_COUNT);
        createEAttribute(camelNettyBindingTypeEClass, CAMEL_NETTY_BINDING_TYPE__SYNC);
        createEAttribute(camelNettyBindingTypeEClass, CAMEL_NETTY_BINDING_TYPE__DISCONNECT);

        camelNettyUdpBindingTypeEClass = createEClass(CAMEL_NETTY_UDP_BINDING_TYPE);
        createEAttribute(camelNettyUdpBindingTypeEClass, CAMEL_NETTY_UDP_BINDING_TYPE__BROADCAST);

        camelNettyTcpBindingTypeEClass = createEClass(CAMEL_NETTY_TCP_BINDING_TYPE);
        createEAttribute(camelNettyTcpBindingTypeEClass, CAMEL_NETTY_TCP_BINDING_TYPE__TEXTLINE);
        createEAttribute(camelNettyTcpBindingTypeEClass, CAMEL_NETTY_TCP_BINDING_TYPE__TCP_NO_DELAY);
        createEAttribute(camelNettyTcpBindingTypeEClass, CAMEL_NETTY_TCP_BINDING_TYPE__KEEP_ALIVE);

        camelMockBindingTypeEClass = createEClass(CAMEL_MOCK_BINDING_TYPE);
        createEReference(camelMockBindingTypeEClass, CAMEL_MOCK_BINDING_TYPE__CONTEXT_MAPPER);
        createEReference(camelMockBindingTypeEClass, CAMEL_MOCK_BINDING_TYPE__MESSAGE_COMPOSER);
        createEAttribute(camelMockBindingTypeEClass, CAMEL_MOCK_BINDING_TYPE__NAME_ELEMENT);
        createEAttribute(camelMockBindingTypeEClass, CAMEL_MOCK_BINDING_TYPE__REPORT_GROUP);

        camelOperationSelectorTypeEClass = createEClass(CAMEL_OPERATION_SELECTOR_TYPE);
        createEAttribute(camelOperationSelectorTypeEClass, CAMEL_OPERATION_SELECTOR_TYPE__NAMESPACE);
        createEAttribute(camelOperationSelectorTypeEClass, CAMEL_OPERATION_SELECTOR_TYPE__OPERATION_NAME);

        camelSedaBindingTypeEClass = createEClass(CAMEL_SEDA_BINDING_TYPE);
        createEReference(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__CONTEXT_MAPPER);
        createEReference(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__MESSAGE_COMPOSER);
        createEAttribute(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__NAME_ELEMENT);
        createEAttribute(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__SIZE);
        createEAttribute(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__CONCURRENT_CONSUMERS);
        createEAttribute(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__WAIT_FOR_TASK_TO_COMPLETE);
        createEAttribute(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__TIMEOUT);
        createEAttribute(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__MULTIPLE_CONSUMERS);
        createEAttribute(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__LIMIT_CONCURRENT_CONSUMERS);

        camelTimerBindingTypeEClass = createEClass(CAMEL_TIMER_BINDING_TYPE);
        createEReference(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__CONTEXT_MAPPER);
        createEReference(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__MESSAGE_COMPOSER);
        createEAttribute(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__NAME_ELEMENT);
        createEAttribute(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__TIME);
        createEAttribute(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__PATTERN);
        createEAttribute(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__PERIOD);
        createEAttribute(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__DELAY);
        createEAttribute(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__FIXED_RATE);
        createEAttribute(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__DAEMON);

        camelSftpBindingTypeEClass = createEClass(CAMEL_SFTP_BINDING_TYPE);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__KNOWN_HOSTS_FILE);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_ATOM);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_CAMEL);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_DIRECT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_FILE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_FTP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_FTPS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_JMS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_MOCK);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_SEDA);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_SFTP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_TIMER);
        createEReference(documentRootEClass, DOCUMENT_ROOT__IMPLEMENTATION_CAMEL);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_NETTY_UDP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_NETTY_TCP);

        camelRemoteBindingTypeEClass = createEClass(CAMEL_REMOTE_BINDING_TYPE);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__HOST);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__PORT);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__USERNAME);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__PASSWORD);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__BINARY);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__CONNECT_TIMEOUT);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__DISCONNECT);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__RECONNECT_DELAY);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__SEPARATOR);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__STEPWISE);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED);
        createEReference(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__CONSUME);
        createEReference(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__PRODUCE);

        fileConsumerTypeEClass = createEClass(FILE_CONSUMER_TYPE);

        fileProducerTypeEClass = createEClass(FILE_PRODUCER_TYPE);

        javaDSLTypeEClass = createEClass(JAVA_DSL_TYPE);
        createEAttribute(javaDSLTypeEClass, JAVA_DSL_TYPE__CLASS);

        xmldslTypeEClass = createEClass(XMLDSL_TYPE);
        createEAttribute(xmldslTypeEClass, XMLDSL_TYPE__PATH);

        scheduledPollConsumerTypeEClass = createEClass(SCHEDULED_POLL_CONSUMER_TYPE);
        createEAttribute(scheduledPollConsumerTypeEClass, SCHEDULED_POLL_CONSUMER_TYPE__INITIAL_DELAY);
        createEAttribute(scheduledPollConsumerTypeEClass, SCHEDULED_POLL_CONSUMER_TYPE__DELAY);
        createEAttribute(scheduledPollConsumerTypeEClass, SCHEDULED_POLL_CONSUMER_TYPE__USE_FIXED_DELAY);
        createEAttribute(scheduledPollConsumerTypeEClass, SCHEDULED_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE);
        createEAttribute(scheduledPollConsumerTypeEClass, SCHEDULED_POLL_CONSUMER_TYPE__TIME_UNIT);

        genericFileBindingTypeEClass = createEClass(GENERIC_FILE_BINDING_TYPE);
        createEAttribute(genericFileBindingTypeEClass, GENERIC_FILE_BINDING_TYPE__DIRECTORY);
        createEAttribute(genericFileBindingTypeEClass, GENERIC_FILE_BINDING_TYPE__AUTO_CREATE);
        createEAttribute(genericFileBindingTypeEClass, GENERIC_FILE_BINDING_TYPE__BUFFER_SIZE);
        createEAttribute(genericFileBindingTypeEClass, GENERIC_FILE_BINDING_TYPE__FILE_NAME);
        createEAttribute(genericFileBindingTypeEClass, GENERIC_FILE_BINDING_TYPE__FLATTEN);
        createEAttribute(genericFileBindingTypeEClass, GENERIC_FILE_BINDING_TYPE__CHARSET);

        scheduledBatchPollConsumerTypeEClass = createEClass(SCHEDULED_BATCH_POLL_CONSUMER_TYPE);
        createEAttribute(scheduledBatchPollConsumerTypeEClass, SCHEDULED_BATCH_POLL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL);

        genericFileConsumerTypeEClass = createEClass(GENERIC_FILE_CONSUMER_TYPE);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__DELETE);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__RECURSIVE);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__NOOP);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__PRE_MOVE);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__MOVE);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__MOVE_FAILED);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__INCLUDE);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__EXCLUDE);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__FILTER);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__SORTER);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__SORT_BY);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__READ_LOCK);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__PROCESS_STRATEGY);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__DONE_FILE_NAME);

        genericFileProducerTypeEClass = createEClass(GENERIC_FILE_PRODUCER_TYPE);
        createEAttribute(genericFileProducerTypeEClass, GENERIC_FILE_PRODUCER_TYPE__FILE_EXIST);
        createEAttribute(genericFileProducerTypeEClass, GENERIC_FILE_PRODUCER_TYPE__TEMP_PREFIX);
        createEAttribute(genericFileProducerTypeEClass, GENERIC_FILE_PRODUCER_TYPE__TEMP_FILE_NAME);
        createEAttribute(genericFileProducerTypeEClass, GENERIC_FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED);
        createEAttribute(genericFileProducerTypeEClass, GENERIC_FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE);
        createEAttribute(genericFileProducerTypeEClass, GENERIC_FILE_PRODUCER_TYPE__DONE_FILE_NAME);

        remoteFileConsumerTypeEClass = createEClass(REMOTE_FILE_CONSUMER_TYPE);

        remoteFileProducerTypeEClass = createEClass(REMOTE_FILE_PRODUCER_TYPE);

        // Create enums
        timeUnitEEnum = createEEnum(TIME_UNIT);

        // Create data types
        timeUnitObjectEDataType = createEDataType(TIME_UNIT_OBJECT);
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
        SwitchyardPackage theSwitchyardPackage = (SwitchyardPackage)EPackage.Registry.INSTANCE.getEPackage(SwitchyardPackage.eNS_URI);
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
        ScaPackage theScaPackage = (ScaPackage)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI);
        SpringPackage theSpringPackage = (SpringPackage)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        baseCamelBindingEClass.getESuperTypes().add(theSwitchyardPackage.getSwitchYardBindingType());
        camelAtomBindingTypeEClass.getESuperTypes().add(this.getBaseCamelBinding());
        camelBindingTypeEClass.getESuperTypes().add(this.getBaseCamelBinding());
        camelDirectBindingTypeEClass.getESuperTypes().add(theSwitchyardPackage.getSwitchYardBindingType());
        camelFileBindingTypeEClass.getESuperTypes().add(this.getGenericFileBindingType());
        camelFtpBindingTypeEClass.getESuperTypes().add(this.getCamelRemoteBindingType());
        camelFtpsBindingTypeEClass.getESuperTypes().add(this.getCamelFtpBindingType());
        camelImplementationTypeEClass.getESuperTypes().add(theScaPackage.getImplementation());
        camelJmsBindingTypeEClass.getESuperTypes().add(this.getBaseCamelBinding());
        camelNettyBindingTypeEClass.getESuperTypes().add(this.getBaseCamelBinding());
        camelNettyUdpBindingTypeEClass.getESuperTypes().add(this.getCamelNettyBindingType());
        camelNettyTcpBindingTypeEClass.getESuperTypes().add(this.getCamelNettyBindingType());
        camelMockBindingTypeEClass.getESuperTypes().add(theSwitchyardPackage.getSwitchYardBindingType());
        camelOperationSelectorTypeEClass.getESuperTypes().add(theScaPackage.getOperationSelectorType());
        camelSedaBindingTypeEClass.getESuperTypes().add(theSwitchyardPackage.getSwitchYardBindingType());
        camelTimerBindingTypeEClass.getESuperTypes().add(theSwitchyardPackage.getSwitchYardBindingType());
        camelSftpBindingTypeEClass.getESuperTypes().add(this.getCamelRemoteBindingType());
        camelRemoteBindingTypeEClass.getESuperTypes().add(this.getGenericFileBindingType());
        fileConsumerTypeEClass.getESuperTypes().add(this.getGenericFileConsumerType());
        fileProducerTypeEClass.getESuperTypes().add(this.getGenericFileProducerType());
        genericFileBindingTypeEClass.getESuperTypes().add(this.getBaseCamelBinding());
        scheduledBatchPollConsumerTypeEClass.getESuperTypes().add(this.getScheduledPollConsumerType());
        genericFileConsumerTypeEClass.getESuperTypes().add(this.getScheduledBatchPollConsumerType());
        remoteFileConsumerTypeEClass.getESuperTypes().add(this.getGenericFileConsumerType());
        remoteFileProducerTypeEClass.getESuperTypes().add(this.getGenericFileProducerType());

        // Initialize classes and features; add operations and parameters
        initEClass(baseCamelBindingEClass, BaseCamelBinding.class, "BaseCamelBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBaseCamelBinding_ContextMapper(), theSwitchyardPackage.getContextMapperType(), null, "contextMapper", null, 0, 1, BaseCamelBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBaseCamelBinding_MessageComposer(), theSwitchyardPackage.getMessageComposerType(), null, "messageComposer", null, 0, 1, BaseCamelBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBaseCamelBinding_CamelOperationSelector(), this.getCamelOperationSelectorType(), null, "camelOperationSelector", null, 0, 1, BaseCamelBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelAtomBindingTypeEClass, CamelAtomBindingType.class, "CamelAtomBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelAtomBindingType_FeedURI(), theXMLTypePackage.getAnyURI(), "feedURI", null, 1, 1, CamelAtomBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelAtomBindingType_SplitEntries(), theXMLTypePackage.getBoolean(), "splitEntries", null, 0, 1, CamelAtomBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelAtomBindingType_Filter(), theXMLTypePackage.getBoolean(), "filter", null, 0, 1, CamelAtomBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelAtomBindingType_LastUpdate(), theXMLTypePackage.getDateTime(), "lastUpdate", null, 0, 1, CamelAtomBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelAtomBindingType_ThrottleEntries(), theXMLTypePackage.getBoolean(), "throttleEntries", null, 0, 1, CamelAtomBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelAtomBindingType_FeedHeader(), theXMLTypePackage.getBoolean(), "feedHeader", null, 0, 1, CamelAtomBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelAtomBindingType_SortEntries(), theXMLTypePackage.getBoolean(), "sortEntries", null, 0, 1, CamelAtomBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelAtomBindingType_Consume(), this.getScheduledPollConsumerType(), null, "consume", null, 0, 1, CamelAtomBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelBindingTypeEClass, CamelBindingType.class, "CamelBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelBindingType_ConfigURI(), theXMLTypePackage.getAnyURI(), "configURI", null, 0, 1, CamelBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelDirectBindingTypeEClass, CamelDirectBindingType.class, "CamelDirectBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCamelDirectBindingType_ContextMapper(), theSwitchyardPackage.getContextMapperType(), null, "contextMapper", null, 0, 1, CamelDirectBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelDirectBindingType_MessageComposer(), theSwitchyardPackage.getMessageComposerType(), null, "messageComposer", null, 0, 1, CamelDirectBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelDirectBindingType_NameElement(), theXMLTypePackage.getString(), "nameElement", null, 1, 1, CamelDirectBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelFileBindingTypeEClass, CamelFileBindingType.class, "CamelFileBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCamelFileBindingType_Consume(), this.getFileConsumerType(), null, "consume", null, 0, 1, CamelFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelFileBindingType_Produce(), this.getFileProducerType(), null, "produce", null, 0, 1, CamelFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelFtpBindingTypeEClass, CamelFtpBindingType.class, "CamelFtpBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelFtpBindingType_PassiveMode(), theXMLTypePackage.getBoolean(), "passiveMode", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_Timeout(), theXMLTypePackage.getInt(), "timeout", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_SoTimeout(), theXMLTypePackage.getInt(), "soTimeout", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_SiteCommand(), theXMLTypePackage.getString(), "siteCommand", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelFtpsBindingTypeEClass, CamelFtpsBindingType.class, "CamelFtpsBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelFtpsBindingType_SecurityProtocol(), theXMLTypePackage.getString(), "securityProtocol", null, 0, 1, CamelFtpsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpsBindingType_IsImplicit(), theXMLTypePackage.getBoolean(), "isImplicit", null, 0, 1, CamelFtpsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpsBindingType_ExecPbsz(), theXMLTypePackage.getLong(), "execPbsz", null, 0, 1, CamelFtpsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpsBindingType_ExecProt(), theXMLTypePackage.getString(), "execProt", null, 0, 1, CamelFtpsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpsBindingType_DisableSecureDataChannelDefaults(), theXMLTypePackage.getBoolean(), "disableSecureDataChannelDefaults", null, 0, 1, CamelFtpsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelImplementationTypeEClass, CamelImplementationType.class, "CamelImplementationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCamelImplementationType_Route(), theSpringPackage.getRouteDefinition(), null, "route", null, 0, 1, CamelImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelImplementationType_Java(), this.getJavaDSLType(), null, "java", null, 0, 1, CamelImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelImplementationType_Xml(), this.getXMLDSLType(), null, "xml", null, 0, 1, CamelImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelJmsBindingTypeEClass, CamelJmsBindingType.class, "CamelJmsBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelJmsBindingType_Queue(), theXMLTypePackage.getString(), "queue", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_Topic(), theXMLTypePackage.getString(), "topic", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_ConnectionFactory(), theXMLTypePackage.getString(), "connectionFactory", null, 1, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_Username(), theXMLTypePackage.getString(), "username", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_Password(), theXMLTypePackage.getString(), "password", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_ClientId(), theXMLTypePackage.getString(), "clientId", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_DurableSubscriptionName(), theXMLTypePackage.getString(), "durableSubscriptionName", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_ConcurrentConsumers(), theXMLTypePackage.getInt(), "concurrentConsumers", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_MaxConcurrentConsumers(), theXMLTypePackage.getInt(), "maxConcurrentConsumers", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_DisableReplyTo(), theXMLTypePackage.getBoolean(), "disableReplyTo", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_PreserveMessageQos(), theXMLTypePackage.getBoolean(), "preserveMessageQos", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_DeliveryPersistent(), theXMLTypePackage.getBoolean(), "deliveryPersistent", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_Priority(), theXMLTypePackage.getInt(), "priority", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_ExplicitQosEnabled(), theXMLTypePackage.getBoolean(), "explicitQosEnabled", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_ReplyTo(), theXMLTypePackage.getString(), "replyTo", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_ReplyToType(), theXMLTypePackage.getString(), "replyToType", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_RequestTimeout(), theXMLTypePackage.getInt(), "requestTimeout", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_Selector(), theXMLTypePackage.getString(), "selector", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_TimeToLive(), theXMLTypePackage.getInt(), "timeToLive", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_Transacted(), theXMLTypePackage.getBoolean(), "transacted", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_TransactionManager(), theXMLTypePackage.getString(), "transactionManager", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelNettyBindingTypeEClass, CamelNettyBindingType.class, "CamelNettyBindingType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelNettyBindingType_Host(), theXMLTypePackage.getString(), "host", null, 1, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyBindingType_Port(), theXMLTypePackage.getInt(), "port", null, 1, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyBindingType_ReceiveBufferSize(), theXMLTypePackage.getLong(), "receiveBufferSize", null, 0, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyBindingType_SendBufferSize(), theXMLTypePackage.getLong(), "sendBufferSize", null, 0, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyBindingType_ReuseAddress(), theXMLTypePackage.getBoolean(), "reuseAddress", null, 0, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyBindingType_Encoders(), theXMLTypePackage.getString(), "encoders", null, 0, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyBindingType_Decoders(), theXMLTypePackage.getString(), "decoders", null, 0, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyBindingType_AllowDefaultCodec(), theXMLTypePackage.getBoolean(), "allowDefaultCodec", null, 0, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyBindingType_WorkerCount(), theXMLTypePackage.getInt(), "workerCount", null, 0, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyBindingType_Sync(), theXMLTypePackage.getBoolean(), "sync", null, 0, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyBindingType_Disconnect(), theXMLTypePackage.getBoolean(), "disconnect", null, 0, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelNettyUdpBindingTypeEClass, CamelNettyUdpBindingType.class, "CamelNettyUdpBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelNettyUdpBindingType_Broadcast(), theXMLTypePackage.getBoolean(), "broadcast", null, 0, 1, CamelNettyUdpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelNettyTcpBindingTypeEClass, CamelNettyTcpBindingType.class, "CamelNettyTcpBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelNettyTcpBindingType_Textline(), theXMLTypePackage.getBoolean(), "textline", null, 0, 1, CamelNettyTcpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyTcpBindingType_TcpNoDelay(), theXMLTypePackage.getBoolean(), "tcpNoDelay", null, 0, 1, CamelNettyTcpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyTcpBindingType_KeepAlive(), theXMLTypePackage.getBoolean(), "keepAlive", null, 0, 1, CamelNettyTcpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelMockBindingTypeEClass, CamelMockBindingType.class, "CamelMockBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCamelMockBindingType_ContextMapper(), theSwitchyardPackage.getContextMapperType(), null, "contextMapper", null, 0, 1, CamelMockBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelMockBindingType_MessageComposer(), theSwitchyardPackage.getMessageComposerType(), null, "messageComposer", null, 0, 1, CamelMockBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMockBindingType_NameElement(), theXMLTypePackage.getString(), "nameElement", null, 1, 1, CamelMockBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMockBindingType_ReportGroup(), theXMLTypePackage.getInteger(), "reportGroup", null, 1, 1, CamelMockBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelOperationSelectorTypeEClass, CamelOperationSelectorType.class, "CamelOperationSelectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelOperationSelectorType_Namespace(), theXMLTypePackage.getString(), "namespace", null, 0, 1, CamelOperationSelectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelOperationSelectorType_OperationName(), theXMLTypePackage.getString(), "operationName", null, 1, 1, CamelOperationSelectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelSedaBindingTypeEClass, CamelSedaBindingType.class, "CamelSedaBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCamelSedaBindingType_ContextMapper(), theSwitchyardPackage.getContextMapperType(), null, "contextMapper", null, 0, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelSedaBindingType_MessageComposer(), theSwitchyardPackage.getMessageComposerType(), null, "messageComposer", null, 0, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSedaBindingType_NameElement(), theXMLTypePackage.getString(), "nameElement", null, 1, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSedaBindingType_Size(), theXMLTypePackage.getInteger(), "size", null, 1, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSedaBindingType_ConcurrentConsumers(), theXMLTypePackage.getInteger(), "concurrentConsumers", null, 1, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSedaBindingType_WaitForTaskToComplete(), theXMLTypePackage.getString(), "waitForTaskToComplete", null, 1, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSedaBindingType_Timeout(), theXMLTypePackage.getLong(), "timeout", null, 1, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSedaBindingType_MultipleConsumers(), theXMLTypePackage.getBoolean(), "multipleConsumers", null, 1, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSedaBindingType_LimitConcurrentConsumers(), theXMLTypePackage.getBoolean(), "limitConcurrentConsumers", null, 1, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelTimerBindingTypeEClass, CamelTimerBindingType.class, "CamelTimerBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCamelTimerBindingType_ContextMapper(), theSwitchyardPackage.getContextMapperType(), null, "contextMapper", null, 0, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelTimerBindingType_MessageComposer(), theSwitchyardPackage.getMessageComposerType(), null, "messageComposer", null, 0, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelTimerBindingType_NameElement(), theXMLTypePackage.getString(), "nameElement", null, 1, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelTimerBindingType_Time(), theXMLTypePackage.getDateTime(), "time", null, 0, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelTimerBindingType_Pattern(), theXMLTypePackage.getString(), "pattern", null, 0, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelTimerBindingType_Period(), theXMLTypePackage.getLong(), "period", null, 0, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelTimerBindingType_Delay(), theXMLTypePackage.getLong(), "delay", null, 0, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelTimerBindingType_FixedRate(), theXMLTypePackage.getBoolean(), "fixedRate", null, 0, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelTimerBindingType_Daemon(), theXMLTypePackage.getBoolean(), "daemon", null, 0, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelSftpBindingTypeEClass, CamelSftpBindingType.class, "CamelSftpBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelSftpBindingType_KnownHostsFile(), theXMLTypePackage.getString(), "knownHostsFile", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_PrivateKeyFile(), theXMLTypePackage.getString(), "privateKeyFile", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_PrivateKeyFilePassphrase(), theXMLTypePackage.getString(), "privateKeyFilePassphrase", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingAtom(), this.getCamelAtomBindingType(), null, "bindingAtom", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingCamel(), this.getCamelBindingType(), null, "bindingCamel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingDirect(), this.getCamelDirectBindingType(), null, "bindingDirect", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingFile(), this.getCamelFileBindingType(), null, "bindingFile", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingFtp(), this.getCamelFtpBindingType(), null, "bindingFtp", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingFtps(), this.getCamelFtpsBindingType(), null, "bindingFtps", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingJms(), this.getCamelJmsBindingType(), null, "bindingJms", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingMock(), this.getCamelMockBindingType(), null, "bindingMock", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingSeda(), this.getCamelSedaBindingType(), null, "bindingSeda", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingSftp(), this.getCamelSftpBindingType(), null, "bindingSftp", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingTimer(), this.getCamelTimerBindingType(), null, "bindingTimer", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_ImplementationCamel(), this.getCamelImplementationType(), null, "implementationCamel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingNettyUDP(), this.getCamelNettyUdpBindingType(), null, "bindingNettyUDP", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingNettyTCP(), this.getCamelNettyTcpBindingType(), null, "bindingNettyTCP", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(camelRemoteBindingTypeEClass, CamelRemoteBindingType.class, "CamelRemoteBindingType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelRemoteBindingType_Host(), theXMLTypePackage.getString(), "host", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_Port(), theXMLTypePackage.getInt(), "port", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_Username(), theXMLTypePackage.getString(), "username", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_Password(), theXMLTypePackage.getString(), "password", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_Binary(), theXMLTypePackage.getBoolean(), "binary", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_ConnectTimeout(), theXMLTypePackage.getInt(), "connectTimeout", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_Disconnect(), theXMLTypePackage.getBoolean(), "disconnect", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_MaximumReconnectAttempts(), theXMLTypePackage.getInt(), "maximumReconnectAttempts", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_ReconnectDelay(), theXMLTypePackage.getInt(), "reconnectDelay", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_Separator(), theXMLTypePackage.getString(), "separator", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_Stepwise(), theXMLTypePackage.getBoolean(), "stepwise", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_ThrowExceptionOnConnectFailed(), theXMLTypePackage.getBoolean(), "throwExceptionOnConnectFailed", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelRemoteBindingType_Consume(), this.getRemoteFileConsumerType(), null, "consume", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelRemoteBindingType_Produce(), this.getRemoteFileProducerType(), null, "produce", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fileConsumerTypeEClass, FileConsumerType.class, "FileConsumerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(fileProducerTypeEClass, FileProducerType.class, "FileProducerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(javaDSLTypeEClass, JavaDSLType.class, "JavaDSLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getJavaDSLType_Class(), theXMLTypePackage.getString(), "class", null, 0, 1, JavaDSLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(xmldslTypeEClass, XMLDSLType.class, "XMLDSLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getXMLDSLType_Path(), theXMLTypePackage.getString(), "path", null, 0, 1, XMLDSLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(scheduledPollConsumerTypeEClass, ScheduledPollConsumerType.class, "ScheduledPollConsumerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getScheduledPollConsumerType_InitialDelay(), theXMLTypePackage.getInteger(), "initialDelay", null, 0, 1, ScheduledPollConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getScheduledPollConsumerType_Delay(), theXMLTypePackage.getInteger(), "delay", null, 0, 1, ScheduledPollConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getScheduledPollConsumerType_UseFixedDelay(), theXMLTypePackage.getBoolean(), "useFixedDelay", null, 0, 1, ScheduledPollConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getScheduledPollConsumerType_SendEmptyMessageWhenIdle(), theXMLTypePackage.getBoolean(), "sendEmptyMessageWhenIdle", null, 0, 1, ScheduledPollConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getScheduledPollConsumerType_TimeUnit(), this.getTimeUnit(), "timeUnit", null, 0, 1, ScheduledPollConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(genericFileBindingTypeEClass, GenericFileBindingType.class, "GenericFileBindingType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGenericFileBindingType_Directory(), theXMLTypePackage.getString(), "directory", null, 1, 1, GenericFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileBindingType_AutoCreate(), theXMLTypePackage.getBoolean(), "autoCreate", null, 0, 1, GenericFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileBindingType_BufferSize(), theXMLTypePackage.getInteger(), "bufferSize", null, 0, 1, GenericFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileBindingType_FileName(), theXMLTypePackage.getString(), "fileName", null, 0, 1, GenericFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileBindingType_Flatten(), theXMLTypePackage.getBoolean(), "flatten", null, 0, 1, GenericFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileBindingType_Charset(), theXMLTypePackage.getString(), "charset", null, 0, 1, GenericFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(scheduledBatchPollConsumerTypeEClass, ScheduledBatchPollConsumerType.class, "ScheduledBatchPollConsumerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getScheduledBatchPollConsumerType_MaxMessagesPerPoll(), theXMLTypePackage.getInteger(), "maxMessagesPerPoll", null, 0, 1, ScheduledBatchPollConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(genericFileConsumerTypeEClass, GenericFileConsumerType.class, "GenericFileConsumerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGenericFileConsumerType_Delete(), theXMLTypePackage.getBoolean(), "delete", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_Recursive(), theXMLTypePackage.getBoolean(), "recursive", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_Noop(), theXMLTypePackage.getBoolean(), "noop", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_PreMove(), theXMLTypePackage.getString(), "preMove", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_Move(), theXMLTypePackage.getString(), "move", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_MoveFailed(), theXMLTypePackage.getString(), "moveFailed", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_Include(), theXMLTypePackage.getString(), "include", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_Exclude(), theXMLTypePackage.getString(), "exclude", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_Idempotent(), theXMLTypePackage.getBoolean(), "idempotent", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_IdempotentRepository(), theXMLTypePackage.getString(), "idempotentRepository", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_InProgressRepository(), theXMLTypePackage.getString(), "inProgressRepository", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_Filter(), theXMLTypePackage.getString(), "filter", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_Sorter(), theXMLTypePackage.getString(), "sorter", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_SortBy(), theXMLTypePackage.getString(), "sortBy", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_ReadLock(), theXMLTypePackage.getString(), "readLock", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_ReadLockTimeout(), theXMLTypePackage.getLong(), "readLockTimeout", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_ReadLockCheckInterval(), theXMLTypePackage.getInteger(), "readLockCheckInterval", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_ExclusiveReadLockStrategy(), theXMLTypePackage.getString(), "exclusiveReadLockStrategy", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_ProcessStrategy(), theXMLTypePackage.getString(), "processStrategy", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_StartingDirectoryMustExist(), theXMLTypePackage.getBoolean(), "startingDirectoryMustExist", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_DirectoryMustExist(), theXMLTypePackage.getBoolean(), "directoryMustExist", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_DoneFileName(), theXMLTypePackage.getString(), "doneFileName", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(genericFileProducerTypeEClass, GenericFileProducerType.class, "GenericFileProducerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGenericFileProducerType_FileExist(), theXMLTypePackage.getString(), "fileExist", null, 0, 1, GenericFileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileProducerType_TempPrefix(), theXMLTypePackage.getString(), "tempPrefix", null, 0, 1, GenericFileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileProducerType_TempFileName(), theXMLTypePackage.getString(), "tempFileName", null, 0, 1, GenericFileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileProducerType_KeepLastModified(), theXMLTypePackage.getBoolean(), "keepLastModified", null, 0, 1, GenericFileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileProducerType_EagerDeleteTargetFile(), theXMLTypePackage.getBoolean(), "eagerDeleteTargetFile", null, 0, 1, GenericFileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileProducerType_DoneFileName(), theXMLTypePackage.getString(), "doneFileName", null, 0, 1, GenericFileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(remoteFileConsumerTypeEClass, RemoteFileConsumerType.class, "RemoteFileConsumerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(remoteFileProducerTypeEClass, RemoteFileProducerType.class, "RemoteFileProducerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(timeUnitEEnum, TimeUnit.class, "TimeUnit");
        addEEnumLiteral(timeUnitEEnum, TimeUnit.NANOSECONDS);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.MICROSECONDS);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.MILLISECONDS);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.SECONDS);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.MINUTES);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.HOURS);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.DAYS);

        // Initialize data types
        initEDataType(timeUnitObjectEDataType, TimeUnit.class, "TimeUnitObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
          (baseCamelBindingEClass, 
           source, 
           new String[] {
             "name", "BaseCamelBinding",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getBaseCamelBinding_ContextMapper(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "contextMapper",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBaseCamelBinding_MessageComposer(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "messageComposer",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBaseCamelBinding_CamelOperationSelector(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "operationSelector",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelAtomBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelAtomBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelAtomBindingType_FeedURI(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "feedURI",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelAtomBindingType_SplitEntries(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "splitEntries",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelAtomBindingType_Filter(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "filter",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelAtomBindingType_LastUpdate(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "lastUpdate",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelAtomBindingType_ThrottleEntries(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "throttleEntries",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelAtomBindingType_FeedHeader(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "feedHeader",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelAtomBindingType_SortEntries(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sortEntries",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelAtomBindingType_Consume(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "consume",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelBindingType_ConfigURI(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "configURI"
           });		
        addAnnotation
          (camelDirectBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelDirectBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelDirectBindingType_ContextMapper(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "contextMapper",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelDirectBindingType_MessageComposer(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "messageComposer",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelDirectBindingType_NameElement(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "name",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelFileBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelFileBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelFileBindingType_Consume(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "consume",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFileBindingType_Produce(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "produce",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelFtpBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelFtpBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelFtpBindingType_PassiveMode(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "passiveMode",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_Timeout(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "timeout",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_SoTimeout(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "soTimeout",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_SiteCommand(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "siteCommand",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelFtpsBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelFtpsBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelFtpsBindingType_SecurityProtocol(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "securityProtocol",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpsBindingType_IsImplicit(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "isImplicit",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpsBindingType_ExecPbsz(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "execPbsz",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpsBindingType_ExecProt(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "execProt",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpsBindingType_DisableSecureDataChannelDefaults(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "disableSecureDataChannelDefaults",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelImplementationTypeEClass, 
           source, 
           new String[] {
             "name", "CamelImplementationType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelImplementationType_Route(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "route",
             "namespace", "http://camel.apache.org/schema/spring"
           });		
        addAnnotation
          (getCamelImplementationType_Java(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "java",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelImplementationType_Xml(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "xml",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelJmsBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelJmsBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelJmsBindingType_Queue(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "queue",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJmsBindingType_Topic(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "topic",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJmsBindingType_ConnectionFactory(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "connectionFactory",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJmsBindingType_Username(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "username",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJmsBindingType_Password(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "password",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJmsBindingType_ClientId(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "clientId",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJmsBindingType_DurableSubscriptionName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "durableSubscriptionName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJmsBindingType_ConcurrentConsumers(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "concurrentConsumers",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJmsBindingType_MaxConcurrentConsumers(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "maxConcurrentConsumers",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJmsBindingType_DisableReplyTo(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "disableReplyTo",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJmsBindingType_PreserveMessageQos(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "preserveMessageQos",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJmsBindingType_DeliveryPersistent(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "deliveryPersistent",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJmsBindingType_Priority(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "priority",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJmsBindingType_ExplicitQosEnabled(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "explicitQosEnabled",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJmsBindingType_ReplyTo(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "replyTo",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJmsBindingType_ReplyToType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "replyToType",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJmsBindingType_RequestTimeout(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "requestTimeout",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJmsBindingType_Selector(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "selector",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJmsBindingType_TimeToLive(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "timeToLive",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJmsBindingType_Transacted(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "transacted",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJmsBindingType_TransactionManager(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "transactionManager",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelNettyBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelNettyBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelNettyBindingType_Host(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "host",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelNettyBindingType_Port(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "port",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelNettyBindingType_ReceiveBufferSize(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "receiveBufferSize",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelNettyBindingType_SendBufferSize(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sendBufferSize",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelNettyBindingType_ReuseAddress(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "reuseAddress",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelNettyBindingType_Encoders(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "encoders",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelNettyBindingType_Decoders(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "decoders",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelNettyBindingType_AllowDefaultCodec(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "allowDefaultCodec",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelNettyBindingType_WorkerCount(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "workerCount",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelNettyBindingType_Sync(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sync",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelNettyBindingType_Disconnect(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "disconnect",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelNettyUdpBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelNettyUdpBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelNettyUdpBindingType_Broadcast(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "broadcast",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelNettyTcpBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelNettyTcpBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelNettyTcpBindingType_Textline(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "textline",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelNettyTcpBindingType_TcpNoDelay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "tcpNoDelay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelNettyTcpBindingType_KeepAlive(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "keepAlive",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelMockBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelMockBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelMockBindingType_ContextMapper(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "contextMapper",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMockBindingType_MessageComposer(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "messageComposer",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMockBindingType_NameElement(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "name",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMockBindingType_ReportGroup(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "reportGroup",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelOperationSelectorTypeEClass, 
           source, 
           new String[] {
             "name", "CamelOperationSelectorType",
             "kind", "empty"
           });		
        addAnnotation
          (getCamelOperationSelectorType_Namespace(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "namespace"
           });		
        addAnnotation
          (getCamelOperationSelectorType_OperationName(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "operationName"
           });		
        addAnnotation
          (camelSedaBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelSedaBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelSedaBindingType_ContextMapper(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "contextMapper",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSedaBindingType_MessageComposer(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "messageComposer",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSedaBindingType_NameElement(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "name",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSedaBindingType_Size(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "size",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSedaBindingType_ConcurrentConsumers(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "concurrentConsumers",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSedaBindingType_WaitForTaskToComplete(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "waitForTaskToComplete",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSedaBindingType_Timeout(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "timeout",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSedaBindingType_MultipleConsumers(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "multipleConsumers",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSedaBindingType_LimitConcurrentConsumers(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "limitConcurrentConsumers",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelTimerBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelTimerBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelTimerBindingType_ContextMapper(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "contextMapper",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelTimerBindingType_MessageComposer(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "messageComposer",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelTimerBindingType_NameElement(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "name",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelTimerBindingType_Time(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "time",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelTimerBindingType_Pattern(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "pattern",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelTimerBindingType_Period(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "period",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelTimerBindingType_Delay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "delay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelTimerBindingType_FixedRate(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "fixedRate",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelTimerBindingType_Daemon(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "daemon",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelSftpBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelSftpBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelSftpBindingType_KnownHostsFile(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "knownHostsFile",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSftpBindingType_PrivateKeyFile(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "privateKeyFile",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSftpBindingType_PrivateKeyFilePassphrase(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "privateKeyFilePassphrase",
             "namespace", "##targetNamespace"
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
          (getDocumentRoot_BindingAtom(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.atom",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (getDocumentRoot_BindingCamel(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.camel",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (getDocumentRoot_BindingDirect(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.direct",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (getDocumentRoot_BindingFile(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.file",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (getDocumentRoot_BindingFtp(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.ftp",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (getDocumentRoot_BindingFtps(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.ftps",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (getDocumentRoot_BindingJms(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.jms",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (getDocumentRoot_BindingMock(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.mock",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (getDocumentRoot_BindingSeda(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.seda",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (getDocumentRoot_BindingSftp(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.sftp",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (getDocumentRoot_BindingTimer(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.timer",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (getDocumentRoot_ImplementationCamel(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "implementation.camel",
             "namespace", "##targetNamespace",
             "affiliation", "http://docs.oasis-open.org/ns/opencsa/sca/200912#implementation"
           });		
        addAnnotation
          (getDocumentRoot_BindingNettyUDP(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.netty-udp",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (getDocumentRoot_BindingNettyTCP(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.netty-tcp",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (camelRemoteBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelRemoteBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelRemoteBindingType_Host(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "host",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_Port(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "port",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_Username(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "username",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_Password(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "password",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_Binary(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binary",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_ConnectTimeout(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "connectTimeout",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_Disconnect(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "disconnect",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_MaximumReconnectAttempts(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "maximumReconnectAttempts",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_ReconnectDelay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "reconnectDelay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_Separator(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "separator",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_Stepwise(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "stepwise",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_ThrowExceptionOnConnectFailed(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "throwExceptionOnConnectFailed",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_Consume(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "consume",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_Produce(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "produce",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (fileConsumerTypeEClass, 
           source, 
           new String[] {
             "name", "FileConsumerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (fileProducerTypeEClass, 
           source, 
           new String[] {
             "name", "FileProducerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (javaDSLTypeEClass, 
           source, 
           new String[] {
             "name", "JavaDSLType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getJavaDSLType_Class(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "class"
           });		
        addAnnotation
          (xmldslTypeEClass, 
           source, 
           new String[] {
             "name", "XMLDSLType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getXMLDSLType_Path(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "path"
           });		
        addAnnotation
          (timeUnitEEnum, 
           source, 
           new String[] {
             "name", "TimeUnit"
           });		
        addAnnotation
          (scheduledPollConsumerTypeEClass, 
           source, 
           new String[] {
             "name", "ScheduledPollConsumerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getScheduledPollConsumerType_InitialDelay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "initialDelay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getScheduledPollConsumerType_Delay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "delay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getScheduledPollConsumerType_UseFixedDelay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "useFixedDelay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getScheduledPollConsumerType_SendEmptyMessageWhenIdle(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sendEmptyMessageWhenIdle",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getScheduledPollConsumerType_TimeUnit(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "timeUnit",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (genericFileBindingTypeEClass, 
           source, 
           new String[] {
             "name", "GenericFileBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getGenericFileBindingType_Directory(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "directory",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileBindingType_AutoCreate(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "autoCreate",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileBindingType_BufferSize(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "bufferSize",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileBindingType_FileName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "fileName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileBindingType_Flatten(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "flatten",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileBindingType_Charset(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "charset",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (scheduledBatchPollConsumerTypeEClass, 
           source, 
           new String[] {
             "name", "ScheduledBatchPollConsumerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getScheduledBatchPollConsumerType_MaxMessagesPerPoll(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "maxMessagesPerPoll",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (genericFileConsumerTypeEClass, 
           source, 
           new String[] {
             "name", "GenericFileConsumerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getGenericFileConsumerType_Delete(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "delete",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_Recursive(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "recursive",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_Noop(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "noop",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_PreMove(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "preMove",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_Move(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "move",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_MoveFailed(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "moveFailed",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_Include(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "include",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_Exclude(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "exclude",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_Idempotent(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idempotent",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_IdempotentRepository(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idempotentRepository",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_InProgressRepository(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "inProgressRepository",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_Filter(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "filter",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_Sorter(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sorter",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_SortBy(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sortBy",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_ReadLock(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "readLock",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_ReadLockTimeout(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "readLockTimeout",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_ReadLockCheckInterval(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "readLockCheckInterval",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_ExclusiveReadLockStrategy(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "exclusiveReadLockStrategy",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_ProcessStrategy(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "processStrategy",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_StartingDirectoryMustExist(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "startingDirectoryMustExist",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_DirectoryMustExist(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "directoryMustExist",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_DoneFileName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doneFileName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (genericFileProducerTypeEClass, 
           source, 
           new String[] {
             "name", "GenericFileProducerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getGenericFileProducerType_FileExist(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "fileExist",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileProducerType_TempPrefix(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "tempPrefix",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileProducerType_TempFileName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "tempFileName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileProducerType_KeepLastModified(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "keepLastModified",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileProducerType_EagerDeleteTargetFile(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "eagerDeleteTargetFile",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileProducerType_DoneFileName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doneFileName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (remoteFileConsumerTypeEClass, 
           source, 
           new String[] {
             "name", "RemoteFileConsumerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (timeUnitObjectEDataType, 
           source, 
           new String[] {
             "name", "TimeUnit:Object",
             "baseType", "TimeUnit"
           });		
        addAnnotation
          (remoteFileProducerTypeEClass, 
           source, 
           new String[] {
             "name", "RemoteFileProducerType",
             "kind", "elementOnly"
           });
    }

} //CamelPackageImpl
