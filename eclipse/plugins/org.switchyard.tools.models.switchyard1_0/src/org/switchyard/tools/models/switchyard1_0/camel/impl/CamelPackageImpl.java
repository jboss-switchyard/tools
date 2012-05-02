/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
import org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelDirectBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.FileProducerType;
import org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType;
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
	private EClass camelImplementationTypeEClass = null;

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
	private EClass documentRootEClass = null;

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
	public EAttribute getCamelAtomBindingType_ConsumerDelay() {
		return (EAttribute)camelAtomBindingTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamelAtomBindingType_ConsumerInitialDelay() {
		return (EAttribute)camelAtomBindingTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamelAtomBindingType_ConsumerUserFixedDelay() {
		return (EAttribute)camelAtomBindingTypeEClass.getEStructuralFeatures().get(9);
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
	public EClass getCamelDirectBindingType() {
		return camelDirectBindingTypeEClass;
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
	public EAttribute getCamelFileBindingType_TargetDir() {
		return (EAttribute)camelFileBindingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamelFileBindingType_AutoCreate() {
		return (EAttribute)camelFileBindingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamelFileBindingType_BufferSize() {
		return (EAttribute)camelFileBindingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamelFileBindingType_FileName() {
		return (EAttribute)camelFileBindingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamelFileBindingType_Flatten() {
		return (EAttribute)camelFileBindingTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamelFileBindingType_Charset() {
		return (EAttribute)camelFileBindingTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCamelFileBindingType_Consume() {
		return (EReference)camelFileBindingTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCamelFileBindingType_Produce() {
		return (EReference)camelFileBindingTypeEClass.getEStructuralFeatures().get(7);
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
	public EClass getCamelMockBindingType() {
		return camelMockBindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamelMockBindingType_ReportGroup() {
		return (EAttribute)camelMockBindingTypeEClass.getEStructuralFeatures().get(0);
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
	public EClass getCamelSedaBindingType() {
		return camelSedaBindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamelSedaBindingType_Size() {
		return (EAttribute)camelSedaBindingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamelSedaBindingType_ConcurrentConsumers() {
		return (EAttribute)camelSedaBindingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamelSedaBindingType_WaitForTaskToComplete() {
		return (EAttribute)camelSedaBindingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamelSedaBindingType_Timeout() {
		return (EAttribute)camelSedaBindingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamelSedaBindingType_MultipleConsumers() {
		return (EAttribute)camelSedaBindingTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamelSedaBindingType_LimitConcurrentConsumers() {
		return (EAttribute)camelSedaBindingTypeEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getCamelTimerBindingType_Time() {
		return (EAttribute)camelTimerBindingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamelTimerBindingType_Pattern() {
		return (EAttribute)camelTimerBindingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamelTimerBindingType_Period() {
		return (EAttribute)camelTimerBindingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamelTimerBindingType_Delay() {
		return (EAttribute)camelTimerBindingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamelTimerBindingType_FixedRate() {
		return (EAttribute)camelTimerBindingTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamelTimerBindingType_Daemon() {
		return (EAttribute)camelTimerBindingTypeEClass.getEStructuralFeatures().get(5);
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
	public EReference getDocumentRoot_BindingMock() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BindingSeda() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BindingTimer() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ImplementationCamel() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
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
	public EAttribute getFileConsumerType_InitialDelay() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_Delay() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_UseFixedDelay() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_Recursive() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_Delete() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_Noop() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_PreMove() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_Move() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_MoveFailed() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_Include() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_Exclude() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_Idempotent() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_IdempotentRepository() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_InProgressRepository() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_Filter() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_Sorter() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_SortBy() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_ReadLock() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_ReadLockTimeout() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_ReadLockCheckInterval() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_ExclusiveReadLockStrategy() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_ProcessStrategy() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_MaxMessagesPerPoll() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_StartingDirectoryMustExist() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_DirectoryMustExist() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileConsumerType_DoneFileName() {
		return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(25);
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
	public EAttribute getFileProducerType_FileExist() {
		return (EAttribute)fileProducerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileProducerType_TempPrefix() {
		return (EAttribute)fileProducerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileProducerType_TempFileName() {
		return (EAttribute)fileProducerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileProducerType_KeepLastModified() {
		return (EAttribute)fileProducerTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileProducerType_EagerDeleteTargetFile() {
		return (EAttribute)fileProducerTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileProducerType_DoneFileName() {
		return (EAttribute)fileProducerTypeEClass.getEStructuralFeatures().get(5);
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
		camelAtomBindingTypeEClass = createEClass(CAMEL_ATOM_BINDING_TYPE);
		createEAttribute(camelAtomBindingTypeEClass, CAMEL_ATOM_BINDING_TYPE__FEED_URI);
		createEAttribute(camelAtomBindingTypeEClass, CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES);
		createEAttribute(camelAtomBindingTypeEClass, CAMEL_ATOM_BINDING_TYPE__FILTER);
		createEAttribute(camelAtomBindingTypeEClass, CAMEL_ATOM_BINDING_TYPE__LAST_UPDATE);
		createEAttribute(camelAtomBindingTypeEClass, CAMEL_ATOM_BINDING_TYPE__THROTTLE_ENTRIES);
		createEAttribute(camelAtomBindingTypeEClass, CAMEL_ATOM_BINDING_TYPE__FEED_HEADER);
		createEAttribute(camelAtomBindingTypeEClass, CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES);
		createEAttribute(camelAtomBindingTypeEClass, CAMEL_ATOM_BINDING_TYPE__CONSUMER_DELAY);
		createEAttribute(camelAtomBindingTypeEClass, CAMEL_ATOM_BINDING_TYPE__CONSUMER_INITIAL_DELAY);
		createEAttribute(camelAtomBindingTypeEClass, CAMEL_ATOM_BINDING_TYPE__CONSUMER_USER_FIXED_DELAY);

		camelBindingTypeEClass = createEClass(CAMEL_BINDING_TYPE);

		camelDirectBindingTypeEClass = createEClass(CAMEL_DIRECT_BINDING_TYPE);

		camelFileBindingTypeEClass = createEClass(CAMEL_FILE_BINDING_TYPE);
		createEAttribute(camelFileBindingTypeEClass, CAMEL_FILE_BINDING_TYPE__TARGET_DIR);
		createEAttribute(camelFileBindingTypeEClass, CAMEL_FILE_BINDING_TYPE__AUTO_CREATE);
		createEAttribute(camelFileBindingTypeEClass, CAMEL_FILE_BINDING_TYPE__BUFFER_SIZE);
		createEAttribute(camelFileBindingTypeEClass, CAMEL_FILE_BINDING_TYPE__FILE_NAME);
		createEAttribute(camelFileBindingTypeEClass, CAMEL_FILE_BINDING_TYPE__FLATTEN);
		createEAttribute(camelFileBindingTypeEClass, CAMEL_FILE_BINDING_TYPE__CHARSET);
		createEReference(camelFileBindingTypeEClass, CAMEL_FILE_BINDING_TYPE__CONSUME);
		createEReference(camelFileBindingTypeEClass, CAMEL_FILE_BINDING_TYPE__PRODUCE);

		camelImplementationTypeEClass = createEClass(CAMEL_IMPLEMENTATION_TYPE);
		createEReference(camelImplementationTypeEClass, CAMEL_IMPLEMENTATION_TYPE__ROUTE);
		createEReference(camelImplementationTypeEClass, CAMEL_IMPLEMENTATION_TYPE__JAVA);

		camelMockBindingTypeEClass = createEClass(CAMEL_MOCK_BINDING_TYPE);
		createEAttribute(camelMockBindingTypeEClass, CAMEL_MOCK_BINDING_TYPE__REPORT_GROUP);

		camelOperationSelectorTypeEClass = createEClass(CAMEL_OPERATION_SELECTOR_TYPE);

		camelSedaBindingTypeEClass = createEClass(CAMEL_SEDA_BINDING_TYPE);
		createEAttribute(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__SIZE);
		createEAttribute(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__CONCURRENT_CONSUMERS);
		createEAttribute(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__WAIT_FOR_TASK_TO_COMPLETE);
		createEAttribute(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__TIMEOUT);
		createEAttribute(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__MULTIPLE_CONSUMERS);
		createEAttribute(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__LIMIT_CONCURRENT_CONSUMERS);

		camelTimerBindingTypeEClass = createEClass(CAMEL_TIMER_BINDING_TYPE);
		createEAttribute(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__TIME);
		createEAttribute(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__PATTERN);
		createEAttribute(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__PERIOD);
		createEAttribute(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__DELAY);
		createEAttribute(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__FIXED_RATE);
		createEAttribute(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__DAEMON);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_ATOM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_CAMEL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_DIRECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_FILE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_MOCK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_SEDA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_TIMER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMPLEMENTATION_CAMEL);

		fileConsumerTypeEClass = createEClass(FILE_CONSUMER_TYPE);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__INITIAL_DELAY);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__DELAY);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__USE_FIXED_DELAY);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__RECURSIVE);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__DELETE);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__NOOP);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__PRE_MOVE);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__MOVE);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__MOVE_FAILED);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__INCLUDE);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__EXCLUDE);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__IDEMPOTENT);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__FILTER);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__SORTER);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__SORT_BY);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__READ_LOCK);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__PROCESS_STRATEGY);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST);
		createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__DONE_FILE_NAME);

		fileProducerTypeEClass = createEClass(FILE_PRODUCER_TYPE);
		createEAttribute(fileProducerTypeEClass, FILE_PRODUCER_TYPE__FILE_EXIST);
		createEAttribute(fileProducerTypeEClass, FILE_PRODUCER_TYPE__TEMP_PREFIX);
		createEAttribute(fileProducerTypeEClass, FILE_PRODUCER_TYPE__TEMP_FILE_NAME);
		createEAttribute(fileProducerTypeEClass, FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED);
		createEAttribute(fileProducerTypeEClass, FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE);
		createEAttribute(fileProducerTypeEClass, FILE_PRODUCER_TYPE__DONE_FILE_NAME);

		javaDSLTypeEClass = createEClass(JAVA_DSL_TYPE);
		createEAttribute(javaDSLTypeEClass, JAVA_DSL_TYPE__CLASS);
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
		camelAtomBindingTypeEClass.getESuperTypes().add(theSwitchyardPackage.getSwitchYardBindingType());
		camelBindingTypeEClass.getESuperTypes().add(theSwitchyardPackage.getSwitchYardBindingType());
		camelDirectBindingTypeEClass.getESuperTypes().add(theSwitchyardPackage.getSwitchYardBindingType());
		camelFileBindingTypeEClass.getESuperTypes().add(theSwitchyardPackage.getSwitchYardBindingType());
		camelImplementationTypeEClass.getESuperTypes().add(theScaPackage.getImplementation());
		camelMockBindingTypeEClass.getESuperTypes().add(theSwitchyardPackage.getSwitchYardBindingType());
		camelOperationSelectorTypeEClass.getESuperTypes().add(theScaPackage.getOperationSelectorType());
		camelSedaBindingTypeEClass.getESuperTypes().add(theSwitchyardPackage.getSwitchYardBindingType());
		camelTimerBindingTypeEClass.getESuperTypes().add(theSwitchyardPackage.getSwitchYardBindingType());

		// Initialize classes and features; add operations and parameters
		initEClass(camelAtomBindingTypeEClass, CamelAtomBindingType.class, "CamelAtomBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCamelAtomBindingType_FeedURI(), theXMLTypePackage.getAnyURI(), "feedURI", null, 1, 1, CamelAtomBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelAtomBindingType_SplitEntries(), theXMLTypePackage.getBoolean(), "splitEntries", null, 0, 1, CamelAtomBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelAtomBindingType_Filter(), theXMLTypePackage.getBoolean(), "filter", null, 0, 1, CamelAtomBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelAtomBindingType_LastUpdate(), theXMLTypePackage.getDateTime(), "lastUpdate", null, 0, 1, CamelAtomBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelAtomBindingType_ThrottleEntries(), theXMLTypePackage.getBoolean(), "throttleEntries", null, 0, 1, CamelAtomBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelAtomBindingType_FeedHeader(), theXMLTypePackage.getBoolean(), "feedHeader", null, 0, 1, CamelAtomBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelAtomBindingType_SortEntries(), theXMLTypePackage.getBoolean(), "sortEntries", null, 0, 1, CamelAtomBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelAtomBindingType_ConsumerDelay(), theXMLTypePackage.getInteger(), "consumerDelay", null, 0, 1, CamelAtomBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelAtomBindingType_ConsumerInitialDelay(), theXMLTypePackage.getInteger(), "consumerInitialDelay", null, 0, 1, CamelAtomBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelAtomBindingType_ConsumerUserFixedDelay(), theXMLTypePackage.getBoolean(), "consumerUserFixedDelay", null, 0, 1, CamelAtomBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(camelBindingTypeEClass, CamelBindingType.class, "CamelBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(camelDirectBindingTypeEClass, CamelDirectBindingType.class, "CamelDirectBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(camelFileBindingTypeEClass, CamelFileBindingType.class, "CamelFileBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCamelFileBindingType_TargetDir(), theXMLTypePackage.getString(), "targetDir", null, 1, 1, CamelFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelFileBindingType_AutoCreate(), theXMLTypePackage.getBoolean(), "autoCreate", null, 0, 1, CamelFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelFileBindingType_BufferSize(), theXMLTypePackage.getInteger(), "bufferSize", null, 0, 1, CamelFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelFileBindingType_FileName(), theXMLTypePackage.getString(), "fileName", null, 0, 1, CamelFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelFileBindingType_Flatten(), theXMLTypePackage.getBoolean(), "flatten", null, 0, 1, CamelFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelFileBindingType_Charset(), theXMLTypePackage.getString(), "charset", null, 0, 1, CamelFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCamelFileBindingType_Consume(), this.getFileConsumerType(), null, "consume", null, 0, 1, CamelFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCamelFileBindingType_Produce(), this.getFileProducerType(), null, "produce", null, 0, 1, CamelFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(camelImplementationTypeEClass, CamelImplementationType.class, "CamelImplementationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCamelImplementationType_Route(), theSpringPackage.getRouteDefinition(), null, "route", null, 0, 1, CamelImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCamelImplementationType_Java(), this.getJavaDSLType(), null, "java", null, 0, 1, CamelImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(camelMockBindingTypeEClass, CamelMockBindingType.class, "CamelMockBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCamelMockBindingType_ReportGroup(), theXMLTypePackage.getInteger(), "reportGroup", null, 1, 1, CamelMockBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(camelOperationSelectorTypeEClass, CamelOperationSelectorType.class, "CamelOperationSelectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(camelSedaBindingTypeEClass, CamelSedaBindingType.class, "CamelSedaBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCamelSedaBindingType_Size(), theXMLTypePackage.getInteger(), "size", null, 1, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelSedaBindingType_ConcurrentConsumers(), theXMLTypePackage.getInteger(), "concurrentConsumers", null, 1, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelSedaBindingType_WaitForTaskToComplete(), theXMLTypePackage.getString(), "waitForTaskToComplete", null, 1, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelSedaBindingType_Timeout(), theXMLTypePackage.getLong(), "timeout", null, 1, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelSedaBindingType_MultipleConsumers(), theXMLTypePackage.getBoolean(), "multipleConsumers", null, 1, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelSedaBindingType_LimitConcurrentConsumers(), theXMLTypePackage.getBoolean(), "limitConcurrentConsumers", null, 1, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(camelTimerBindingTypeEClass, CamelTimerBindingType.class, "CamelTimerBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCamelTimerBindingType_Time(), theXMLTypePackage.getDateTime(), "time", null, 0, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelTimerBindingType_Pattern(), theXMLTypePackage.getString(), "pattern", null, 0, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelTimerBindingType_Period(), theXMLTypePackage.getLong(), "period", null, 0, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelTimerBindingType_Delay(), theXMLTypePackage.getLong(), "delay", null, 0, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelTimerBindingType_FixedRate(), theXMLTypePackage.getBoolean(), "fixedRate", null, 0, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamelTimerBindingType_Daemon(), theXMLTypePackage.getBoolean(), "daemon", null, 0, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BindingAtom(), this.getCamelAtomBindingType(), null, "bindingAtom", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BindingCamel(), this.getCamelBindingType(), null, "bindingCamel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BindingDirect(), this.getCamelDirectBindingType(), null, "bindingDirect", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BindingFile(), this.getCamelFileBindingType(), null, "bindingFile", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BindingMock(), this.getCamelMockBindingType(), null, "bindingMock", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BindingSeda(), this.getCamelSedaBindingType(), null, "bindingSeda", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BindingTimer(), this.getCamelTimerBindingType(), null, "bindingTimer", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ImplementationCamel(), this.getCamelImplementationType(), null, "implementationCamel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(fileConsumerTypeEClass, FileConsumerType.class, "FileConsumerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileConsumerType_InitialDelay(), theXMLTypePackage.getInteger(), "initialDelay", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_Delay(), theXMLTypePackage.getInteger(), "delay", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_UseFixedDelay(), theXMLTypePackage.getBoolean(), "useFixedDelay", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_Recursive(), theXMLTypePackage.getBoolean(), "recursive", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_Delete(), theXMLTypePackage.getBoolean(), "delete", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_Noop(), theXMLTypePackage.getBoolean(), "noop", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_PreMove(), theXMLTypePackage.getString(), "preMove", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_Move(), theXMLTypePackage.getString(), "move", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_MoveFailed(), theXMLTypePackage.getString(), "moveFailed", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_Include(), theXMLTypePackage.getString(), "include", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_Exclude(), theXMLTypePackage.getString(), "exclude", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_Idempotent(), theXMLTypePackage.getBoolean(), "idempotent", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_IdempotentRepository(), theXMLTypePackage.getString(), "idempotentRepository", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_InProgressRepository(), theXMLTypePackage.getString(), "inProgressRepository", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_Filter(), theXMLTypePackage.getString(), "filter", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_Sorter(), theXMLTypePackage.getString(), "sorter", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_SortBy(), theXMLTypePackage.getString(), "sortBy", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_ReadLock(), theXMLTypePackage.getString(), "readLock", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_ReadLockTimeout(), theXMLTypePackage.getLong(), "readLockTimeout", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_ReadLockCheckInterval(), theXMLTypePackage.getInteger(), "readLockCheckInterval", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_ExclusiveReadLockStrategy(), theXMLTypePackage.getString(), "exclusiveReadLockStrategy", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_ProcessStrategy(), theXMLTypePackage.getString(), "processStrategy", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_MaxMessagesPerPoll(), theXMLTypePackage.getInteger(), "maxMessagesPerPoll", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_StartingDirectoryMustExist(), theXMLTypePackage.getBoolean(), "startingDirectoryMustExist", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_DirectoryMustExist(), theXMLTypePackage.getBoolean(), "directoryMustExist", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileConsumerType_DoneFileName(), theXMLTypePackage.getString(), "doneFileName", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileProducerTypeEClass, FileProducerType.class, "FileProducerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileProducerType_FileExist(), theXMLTypePackage.getString(), "fileExist", null, 0, 1, FileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileProducerType_TempPrefix(), theXMLTypePackage.getString(), "tempPrefix", null, 0, 1, FileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileProducerType_TempFileName(), theXMLTypePackage.getString(), "tempFileName", null, 0, 1, FileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileProducerType_KeepLastModified(), theXMLTypePackage.getBoolean(), "keepLastModified", null, 0, 1, FileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileProducerType_EagerDeleteTargetFile(), theXMLTypePackage.getBoolean(), "eagerDeleteTargetFile", null, 0, 1, FileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileProducerType_DoneFileName(), theXMLTypePackage.getString(), "doneFileName", null, 0, 1, FileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaDSLTypeEClass, JavaDSLType.class, "JavaDSLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaDSLType_Class(), theXMLTypePackage.getString(), "class", null, 0, 1, JavaDSLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getCamelAtomBindingType_ConsumerDelay(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "consumer.delay",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCamelAtomBindingType_ConsumerInitialDelay(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "consumer.initialDelay",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCamelAtomBindingType_ConsumerUserFixedDelay(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "consumer.userFixedDelay",
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
		  (camelDirectBindingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CamelDirectBindingType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (camelFileBindingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CamelFileBindingType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCamelFileBindingType_TargetDir(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "targetDir",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCamelFileBindingType_AutoCreate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "autoCreate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCamelFileBindingType_BufferSize(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bufferSize",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCamelFileBindingType_FileName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fileName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCamelFileBindingType_Flatten(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "flatten",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCamelFileBindingType_Charset(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "charset",
			 "namespace", "##targetNamespace"
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
		  (camelImplementationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CamelImplementationType",
			 "kind", "elementOnly"
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
		  (camelMockBindingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CamelMockBindingType",
			 "kind", "elementOnly"
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
		  (camelSedaBindingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CamelSedaBindingType",
			 "kind", "elementOnly"
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
		  (fileConsumerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FileConsumerType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFileConsumerType_InitialDelay(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "initialDelay",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_Delay(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "delay",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_UseFixedDelay(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "useFixedDelay",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_Recursive(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "recursive",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_Delete(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "delete",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_Noop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "noop",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_PreMove(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "preMove",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_Move(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "move",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_MoveFailed(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "moveFailed",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_Include(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "include",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_Exclude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "exclude",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_Idempotent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "idempotent",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_IdempotentRepository(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "idempotentRepository",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_InProgressRepository(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "inProgressRepository",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_Filter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "filter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_Sorter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sorter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_SortBy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sortBy",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_ReadLock(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "readLock",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_ReadLockTimeout(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "readLockTimeout",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_ReadLockCheckInterval(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "readLockCheckInterval",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_ExclusiveReadLockStrategy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "exclusiveReadLockStrategy",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_ProcessStrategy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "processStrategy",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_MaxMessagesPerPoll(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "maxMessagesPerPoll",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_StartingDirectoryMustExist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "startingDirectoryMustExist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_DirectoryMustExist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "directoryMustExist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileConsumerType_DoneFileName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "doneFileName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (fileProducerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FileProducerType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFileProducerType_FileExist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fileExist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileProducerType_TempPrefix(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tempPrefix",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileProducerType_TempFileName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tempFileName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileProducerType_KeepLastModified(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "keepLastModified",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileProducerType_EagerDeleteTargetFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "eagerDeleteTargetFile",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileProducerType_DoneFileName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "doneFileName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (javaDSLTypeEClass, 
		   source, 
		   new String[] {
			 "name", "JavaDSLType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getJavaDSLType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });
	}

} //CamelPackageImpl
