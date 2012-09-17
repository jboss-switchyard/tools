/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard.impl;

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
import org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactsType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.switchyard.DomainType;
import org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface;
import org.switchyard.tools.models.switchyard1_0.switchyard.HandlerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.HandlersType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.PropertiesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.PropertyType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ResourceType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType;
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
public class SwitchyardPackageImpl extends EPackageImpl implements SwitchyardPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass artifactsTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass artifactTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass contextMapperTypeEClass = null;

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
	private EClass domainTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass esbInterfaceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass handlersTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass handlerTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass messageComposerTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass propertiesTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass propertyTypeEClass = null;

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
	private EClass switchYardBindingTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass switchYardTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass transformsTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass transformTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass validatesTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass validateTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass switchYardOperationSelectorTypeEClass = null;

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
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private SwitchyardPackageImpl() {
        super(eNS_URI, SwitchyardFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link SwitchyardPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static SwitchyardPackage init() {
        if (isInited) return (SwitchyardPackage)EPackage.Registry.INSTANCE.getEPackage(SwitchyardPackage.eNS_URI);

        // Obtain or create and register package
        SwitchyardPackageImpl theSwitchyardPackage = (SwitchyardPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SwitchyardPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SwitchyardPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        ScaPackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        BeanPackageImpl theBeanPackage = (BeanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI) instanceof BeanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI) : BeanPackage.eINSTANCE);
        BPELPackageImpl theBPELPackage = (BPELPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPELPackage.eNS_URI) instanceof BPELPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPELPackage.eNS_URI) : BPELPackage.eINSTANCE);
        BPMPackageImpl theBPMPackage = (BPMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPMPackage.eNS_URI) instanceof BPMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPMPackage.eNS_URI) : BPMPackage.eINSTANCE);
        CommonRulesPackageImpl theCommonRulesPackage = (CommonRulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonRulesPackage.eNS_URI) instanceof CommonRulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonRulesPackage.eNS_URI) : CommonRulesPackage.eINSTANCE);
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
        theSwitchyardPackage.createPackageContents();
        theBeanPackage.createPackageContents();
        theBPELPackage.createPackageContents();
        theBPMPackage.createPackageContents();
        theCommonRulesPackage.createPackageContents();
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
        theSwitchyardPackage.initializePackageContents();
        theBeanPackage.initializePackageContents();
        theBPELPackage.initializePackageContents();
        theBPMPackage.initializePackageContents();
        theCommonRulesPackage.initializePackageContents();
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
        theSwitchyardPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SwitchyardPackage.eNS_URI, theSwitchyardPackage);
        return theSwitchyardPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getArtifactsType() {
        return artifactsTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getArtifactsType_Artifact() {
        return (EReference)artifactsTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getArtifactType() {
        return artifactTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getArtifactType_Name() {
        return (EAttribute)artifactTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getArtifactType_Url() {
        return (EAttribute)artifactTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getContextMapperType() {
        return contextMapperTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getContextMapperType_Class() {
        return (EAttribute)contextMapperTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getContextMapperType_ExcludeNamespaces() {
        return (EAttribute)contextMapperTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getContextMapperType_Excludes() {
        return (EAttribute)contextMapperTypeEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getContextMapperType_IncludeNamespaces() {
        return (EAttribute)contextMapperTypeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getContextMapperType_Includes() {
        return (EAttribute)contextMapperTypeEClass.getEStructuralFeatures().get(4);
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
	public EReference getDocumentRoot_Artifact() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Artifacts() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_BindingSwitchyard() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Domain() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Handler() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Handlers() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_InterfaceEsb() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Properties() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Property() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Resource() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Switchyard() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Transform() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Transforms() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Validate() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Validates() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_OperationSelectorSwitchyard() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDomainType() {
        return domainTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDomainType_Transforms() {
        return (EReference)domainTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDomainType_Validates() {
        return (EReference)domainTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDomainType_Properties() {
        return (EReference)domainTypeEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDomainType_Handlers() {
        return (EReference)domainTypeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDomainType_Name() {
        return (EAttribute)domainTypeEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEsbInterface() {
        return esbInterfaceEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEsbInterface_InputType() {
        return (EAttribute)esbInterfaceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEsbInterface_OutputType() {
        return (EAttribute)esbInterfaceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEsbInterface_FaultType() {
        return (EAttribute)esbInterfaceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getHandlersType() {
        return handlersTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getHandlersType_Handler() {
        return (EReference)handlersTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getHandlerType() {
        return handlerTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getHandlerType_Class() {
        return (EAttribute)handlerTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getHandlerType_Name() {
        return (EAttribute)handlerTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMessageComposerType() {
        return messageComposerTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMessageComposerType_Class() {
        return (EAttribute)messageComposerTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPropertiesType() {
        return propertiesTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPropertiesType_Property() {
        return (EReference)propertiesTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPropertyType() {
        return propertyTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPropertyType_Name() {
        return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPropertyType_Value() {
        return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getResourceType_Location() {
        return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResourceType_Type() {
        return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSwitchYardBindingType() {
        return switchYardBindingTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSwitchYardBindingType_ContextMapper() {
        return (EReference)switchYardBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSwitchYardBindingType_MessageComposer() {
        return (EReference)switchYardBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSwitchYardType() {
        return switchYardTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSwitchYardType_Name() {
        return (EAttribute)switchYardTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSwitchYardType_TargetNamespace() {
        return (EAttribute)switchYardTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSwitchYardType_Composite() {
        return (EReference)switchYardTypeEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSwitchYardType_Transforms() {
        return (EReference)switchYardTypeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSwitchYardType_Validates() {
        return (EReference)switchYardTypeEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSwitchYardType_Domain() {
        return (EReference)switchYardTypeEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSwitchYardType_Artifacts() {
        return (EReference)switchYardTypeEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTransformsType() {
        return transformsTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTransformsType_TransformGroup() {
        return (EAttribute)transformsTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getTransformsType_Transform() {
        return (EReference)transformsTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTransformType() {
        return transformTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTransformType_From() {
        return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTransformType_To() {
        return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getValidatesType() {
        return validatesTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getValidatesType_ValidateGroup() {
        return (EAttribute)validatesTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getValidatesType_Validate() {
        return (EReference)validatesTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getValidateType() {
        return validateTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getValidateType_Name() {
        return (EAttribute)validateTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSwitchYardOperationSelectorType() {
        return switchYardOperationSelectorTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SwitchyardFactory getSwitchyardFactory() {
        return (SwitchyardFactory)getEFactoryInstance();
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
        artifactsTypeEClass = createEClass(ARTIFACTS_TYPE);
        createEReference(artifactsTypeEClass, ARTIFACTS_TYPE__ARTIFACT);

        artifactTypeEClass = createEClass(ARTIFACT_TYPE);
        createEAttribute(artifactTypeEClass, ARTIFACT_TYPE__NAME);
        createEAttribute(artifactTypeEClass, ARTIFACT_TYPE__URL);

        contextMapperTypeEClass = createEClass(CONTEXT_MAPPER_TYPE);
        createEAttribute(contextMapperTypeEClass, CONTEXT_MAPPER_TYPE__CLASS);
        createEAttribute(contextMapperTypeEClass, CONTEXT_MAPPER_TYPE__EXCLUDE_NAMESPACES);
        createEAttribute(contextMapperTypeEClass, CONTEXT_MAPPER_TYPE__EXCLUDES);
        createEAttribute(contextMapperTypeEClass, CONTEXT_MAPPER_TYPE__INCLUDE_NAMESPACES);
        createEAttribute(contextMapperTypeEClass, CONTEXT_MAPPER_TYPE__INCLUDES);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__ARTIFACT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__ARTIFACTS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_SWITCHYARD);
        createEReference(documentRootEClass, DOCUMENT_ROOT__DOMAIN);
        createEReference(documentRootEClass, DOCUMENT_ROOT__HANDLER);
        createEReference(documentRootEClass, DOCUMENT_ROOT__HANDLERS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__INTERFACE_ESB);
        createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTIES);
        createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY);
        createEReference(documentRootEClass, DOCUMENT_ROOT__RESOURCE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__SWITCHYARD);
        createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSFORM);
        createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSFORMS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__VALIDATE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__VALIDATES);
        createEReference(documentRootEClass, DOCUMENT_ROOT__OPERATION_SELECTOR_SWITCHYARD);

        domainTypeEClass = createEClass(DOMAIN_TYPE);
        createEReference(domainTypeEClass, DOMAIN_TYPE__TRANSFORMS);
        createEReference(domainTypeEClass, DOMAIN_TYPE__VALIDATES);
        createEReference(domainTypeEClass, DOMAIN_TYPE__PROPERTIES);
        createEReference(domainTypeEClass, DOMAIN_TYPE__HANDLERS);
        createEAttribute(domainTypeEClass, DOMAIN_TYPE__NAME);

        esbInterfaceEClass = createEClass(ESB_INTERFACE);
        createEAttribute(esbInterfaceEClass, ESB_INTERFACE__INPUT_TYPE);
        createEAttribute(esbInterfaceEClass, ESB_INTERFACE__OUTPUT_TYPE);
        createEAttribute(esbInterfaceEClass, ESB_INTERFACE__FAULT_TYPE);

        handlersTypeEClass = createEClass(HANDLERS_TYPE);
        createEReference(handlersTypeEClass, HANDLERS_TYPE__HANDLER);

        handlerTypeEClass = createEClass(HANDLER_TYPE);
        createEAttribute(handlerTypeEClass, HANDLER_TYPE__CLASS);
        createEAttribute(handlerTypeEClass, HANDLER_TYPE__NAME);

        messageComposerTypeEClass = createEClass(MESSAGE_COMPOSER_TYPE);
        createEAttribute(messageComposerTypeEClass, MESSAGE_COMPOSER_TYPE__CLASS);

        propertiesTypeEClass = createEClass(PROPERTIES_TYPE);
        createEReference(propertiesTypeEClass, PROPERTIES_TYPE__PROPERTY);

        propertyTypeEClass = createEClass(PROPERTY_TYPE);
        createEAttribute(propertyTypeEClass, PROPERTY_TYPE__NAME);
        createEAttribute(propertyTypeEClass, PROPERTY_TYPE__VALUE);

        resourceTypeEClass = createEClass(RESOURCE_TYPE);
        createEAttribute(resourceTypeEClass, RESOURCE_TYPE__LOCATION);
        createEAttribute(resourceTypeEClass, RESOURCE_TYPE__TYPE);

        switchYardBindingTypeEClass = createEClass(SWITCH_YARD_BINDING_TYPE);
        createEReference(switchYardBindingTypeEClass, SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER);
        createEReference(switchYardBindingTypeEClass, SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER);

        switchYardTypeEClass = createEClass(SWITCH_YARD_TYPE);
        createEAttribute(switchYardTypeEClass, SWITCH_YARD_TYPE__NAME);
        createEAttribute(switchYardTypeEClass, SWITCH_YARD_TYPE__TARGET_NAMESPACE);
        createEReference(switchYardTypeEClass, SWITCH_YARD_TYPE__COMPOSITE);
        createEReference(switchYardTypeEClass, SWITCH_YARD_TYPE__TRANSFORMS);
        createEReference(switchYardTypeEClass, SWITCH_YARD_TYPE__VALIDATES);
        createEReference(switchYardTypeEClass, SWITCH_YARD_TYPE__DOMAIN);
        createEReference(switchYardTypeEClass, SWITCH_YARD_TYPE__ARTIFACTS);

        transformsTypeEClass = createEClass(TRANSFORMS_TYPE);
        createEAttribute(transformsTypeEClass, TRANSFORMS_TYPE__TRANSFORM_GROUP);
        createEReference(transformsTypeEClass, TRANSFORMS_TYPE__TRANSFORM);

        transformTypeEClass = createEClass(TRANSFORM_TYPE);
        createEAttribute(transformTypeEClass, TRANSFORM_TYPE__FROM);
        createEAttribute(transformTypeEClass, TRANSFORM_TYPE__TO);

        validatesTypeEClass = createEClass(VALIDATES_TYPE);
        createEAttribute(validatesTypeEClass, VALIDATES_TYPE__VALIDATE_GROUP);
        createEReference(validatesTypeEClass, VALIDATES_TYPE__VALIDATE);

        validateTypeEClass = createEClass(VALIDATE_TYPE);
        createEAttribute(validateTypeEClass, VALIDATE_TYPE__NAME);

        switchYardOperationSelectorTypeEClass = createEClass(SWITCH_YARD_OPERATION_SELECTOR_TYPE);
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
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
        ScaPackage theScaPackage = (ScaPackage)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        esbInterfaceEClass.getESuperTypes().add(theScaPackage.getInterface());
        switchYardBindingTypeEClass.getESuperTypes().add(theScaPackage.getBinding());
        switchYardOperationSelectorTypeEClass.getESuperTypes().add(theScaPackage.getOperationSelectorType());

        // Initialize classes and features; add operations and parameters
        initEClass(artifactsTypeEClass, ArtifactsType.class, "ArtifactsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getArtifactsType_Artifact(), this.getArtifactType(), null, "artifact", null, 0, -1, ArtifactsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(artifactTypeEClass, ArtifactType.class, "ArtifactType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getArtifactType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ArtifactType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getArtifactType_Url(), theXMLTypePackage.getString(), "url", null, 1, 1, ArtifactType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(contextMapperTypeEClass, ContextMapperType.class, "ContextMapperType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getContextMapperType_Class(), theXMLTypePackage.getString(), "class", null, 0, 1, ContextMapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getContextMapperType_ExcludeNamespaces(), theXMLTypePackage.getString(), "excludeNamespaces", null, 0, 1, ContextMapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getContextMapperType_Excludes(), theXMLTypePackage.getString(), "excludes", null, 0, 1, ContextMapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getContextMapperType_IncludeNamespaces(), theXMLTypePackage.getString(), "includeNamespaces", null, 0, 1, ContextMapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getContextMapperType_Includes(), theXMLTypePackage.getString(), "includes", null, 0, 1, ContextMapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Artifact(), this.getArtifactType(), null, "artifact", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Artifacts(), this.getArtifactsType(), null, "artifacts", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingSwitchyard(), this.getSwitchYardBindingType(), null, "bindingSwitchyard", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Domain(), this.getDomainType(), null, "domain", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Handler(), this.getHandlerType(), null, "handler", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Handlers(), this.getHandlersType(), null, "handlers", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_InterfaceEsb(), this.getEsbInterface(), null, "interfaceEsb", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Properties(), this.getPropertiesType(), null, "properties", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Property(), this.getPropertyType(), null, "property", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Resource(), this.getResourceType(), null, "resource", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Switchyard(), this.getSwitchYardType(), null, "switchyard", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Transform(), this.getTransformType(), null, "transform", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Transforms(), this.getTransformsType(), null, "transforms", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Validate(), this.getValidateType(), null, "validate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Validates(), this.getValidatesType(), null, "validates", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_OperationSelectorSwitchyard(), this.getSwitchYardOperationSelectorType(), null, "operationSelectorSwitchyard", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(domainTypeEClass, DomainType.class, "DomainType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDomainType_Transforms(), this.getTransformsType(), null, "transforms", null, 0, 1, DomainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDomainType_Validates(), this.getValidatesType(), null, "validates", null, 0, 1, DomainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDomainType_Properties(), this.getPropertiesType(), null, "properties", null, 0, 1, DomainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDomainType_Handlers(), this.getHandlersType(), null, "handlers", null, 0, 1, DomainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDomainType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, DomainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(esbInterfaceEClass, EsbInterface.class, "EsbInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEsbInterface_InputType(), theXMLTypePackage.getString(), "inputType", null, 0, 1, EsbInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEsbInterface_OutputType(), theXMLTypePackage.getString(), "outputType", null, 0, 1, EsbInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEsbInterface_FaultType(), theXMLTypePackage.getString(), "faultType", null, 0, 1, EsbInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(handlersTypeEClass, HandlersType.class, "HandlersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getHandlersType_Handler(), this.getHandlerType(), null, "handler", null, 0, -1, HandlersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(handlerTypeEClass, HandlerType.class, "HandlerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getHandlerType_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, HandlerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHandlerType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, HandlerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(messageComposerTypeEClass, MessageComposerType.class, "MessageComposerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMessageComposerType_Class(), theXMLTypePackage.getString(), "class", null, 0, 1, MessageComposerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertiesTypeEClass, PropertiesType.class, "PropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPropertiesType_Property(), this.getPropertyType(), null, "property", null, 0, -1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyTypeEClass, PropertyType.class, "PropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPropertyType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPropertyType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(resourceTypeEClass, ResourceType.class, "ResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getResourceType_Location(), theXMLTypePackage.getString(), "location", null, 1, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResourceType_Type(), theXMLTypePackage.getNCName(), "type", null, 1, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(switchYardBindingTypeEClass, SwitchYardBindingType.class, "SwitchYardBindingType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSwitchYardBindingType_ContextMapper(), this.getContextMapperType(), null, "contextMapper", null, 0, 1, SwitchYardBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSwitchYardBindingType_MessageComposer(), this.getMessageComposerType(), null, "messageComposer", null, 0, 1, SwitchYardBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(switchYardTypeEClass, SwitchYardType.class, "SwitchYardType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSwitchYardType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, SwitchYardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSwitchYardType_TargetNamespace(), theXMLTypePackage.getString(), "targetNamespace", null, 0, 1, SwitchYardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSwitchYardType_Composite(), theScaPackage.getComposite(), null, "composite", null, 0, 1, SwitchYardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSwitchYardType_Transforms(), this.getTransformsType(), null, "transforms", null, 0, 1, SwitchYardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSwitchYardType_Validates(), this.getValidatesType(), null, "validates", null, 0, 1, SwitchYardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSwitchYardType_Domain(), this.getDomainType(), null, "domain", null, 0, 1, SwitchYardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSwitchYardType_Artifacts(), this.getArtifactsType(), null, "artifacts", null, 0, 1, SwitchYardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(transformsTypeEClass, TransformsType.class, "TransformsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTransformsType_TransformGroup(), ecorePackage.getEFeatureMapEntry(), "transformGroup", null, 0, -1, TransformsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTransformsType_Transform(), this.getTransformType(), null, "transform", null, 0, -1, TransformsType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(transformTypeEClass, TransformType.class, "TransformType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTransformType_From(), theXMLTypePackage.getString(), "from", null, 1, 1, TransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTransformType_To(), theXMLTypePackage.getString(), "to", null, 1, 1, TransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(validatesTypeEClass, ValidatesType.class, "ValidatesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getValidatesType_ValidateGroup(), ecorePackage.getEFeatureMapEntry(), "validateGroup", null, 0, -1, ValidatesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getValidatesType_Validate(), this.getValidateType(), null, "validate", null, 0, -1, ValidatesType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(validateTypeEClass, ValidateType.class, "ValidateType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getValidateType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ValidateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(switchYardOperationSelectorTypeEClass, SwitchYardOperationSelectorType.class, "SwitchYardOperationSelectorType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
          (artifactsTypeEClass, 
           source, 
           new String[] {
             "name", "ArtifactsType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getArtifactsType_Artifact(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "artifact",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (artifactTypeEClass, 
           source, 
           new String[] {
             "name", "ArtifactType",
             "kind", "empty"
           });		
        addAnnotation
          (getArtifactType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getArtifactType_Url(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "url"
           });		
        addAnnotation
          (contextMapperTypeEClass, 
           source, 
           new String[] {
             "name", "ContextMapperType",
             "kind", "empty"
           });		
        addAnnotation
          (getContextMapperType_Class(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "class"
           });		
        addAnnotation
          (getContextMapperType_ExcludeNamespaces(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "excludeNamespaces"
           });		
        addAnnotation
          (getContextMapperType_Excludes(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "excludes"
           });		
        addAnnotation
          (getContextMapperType_IncludeNamespaces(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "includeNamespaces"
           });		
        addAnnotation
          (getContextMapperType_Includes(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "includes"
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
          (getDocumentRoot_Artifact(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "artifact",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Artifacts(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "artifacts",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_BindingSwitchyard(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.switchyard",
             "namespace", "##targetNamespace",
             "affiliation", "http://docs.oasis-open.org/ns/opencsa/sca/200912#binding"
           });		
        addAnnotation
          (getDocumentRoot_Domain(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "domain",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Handler(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "handler",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Handlers(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "handlers",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_InterfaceEsb(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "interface.esb",
             "namespace", "##targetNamespace",
             "affiliation", "http://docs.oasis-open.org/ns/opencsa/sca/200912#interface"
           });		
        addAnnotation
          (getDocumentRoot_Properties(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "properties",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Property(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "property",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Resource(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "resource",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Switchyard(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "switchyard",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Transform(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "transform",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Transforms(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "transforms",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Validate(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "validate",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Validates(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "validates",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_OperationSelectorSwitchyard(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "operationSelector.switchyard",
             "namespace", "##targetNamespace",
             "affiliation", "http://docs.oasis-open.org/ns/opencsa/sca/200912#operationSelector"
           });		
        addAnnotation
          (domainTypeEClass, 
           source, 
           new String[] {
             "name", "DomainType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getDomainType_Transforms(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "transforms",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDomainType_Validates(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "validates",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDomainType_Properties(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "properties",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDomainType_Handlers(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "handlers",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDomainType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (esbInterfaceEClass, 
           source, 
           new String[] {
             "name", "EsbInterface",
             "kind", "empty"
           });		
        addAnnotation
          (getEsbInterface_InputType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "inputType"
           });		
        addAnnotation
          (getEsbInterface_OutputType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "outputType"
           });		
        addAnnotation
          (getEsbInterface_FaultType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "faultType"
           });		
        addAnnotation
          (handlersTypeEClass, 
           source, 
           new String[] {
             "name", "HandlersType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getHandlersType_Handler(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "handler",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (handlerTypeEClass, 
           source, 
           new String[] {
             "name", "HandlerType",
             "kind", "empty"
           });		
        addAnnotation
          (getHandlerType_Class(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "class"
           });		
        addAnnotation
          (getHandlerType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (messageComposerTypeEClass, 
           source, 
           new String[] {
             "name", "MessageComposerType",
             "kind", "empty"
           });		
        addAnnotation
          (getMessageComposerType_Class(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "class"
           });		
        addAnnotation
          (propertiesTypeEClass, 
           source, 
           new String[] {
             "name", "PropertiesType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getPropertiesType_Property(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "property",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (propertyTypeEClass, 
           source, 
           new String[] {
             "name", "PropertyType",
             "kind", "empty"
           });		
        addAnnotation
          (getPropertyType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getPropertyType_Value(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "value"
           });		
        addAnnotation
          (resourceTypeEClass, 
           source, 
           new String[] {
             "name", "ResourceType",
             "kind", "empty"
           });		
        addAnnotation
          (getResourceType_Location(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "location"
           });		
        addAnnotation
          (getResourceType_Type(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "type"
           });		
        addAnnotation
          (switchYardBindingTypeEClass, 
           source, 
           new String[] {
             "name", "SwitchYardBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getSwitchYardBindingType_ContextMapper(), 
           source, 
           new String[] {
             "name", "contextMapper",
             "kind", "element",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getSwitchYardBindingType_MessageComposer(), 
           source, 
           new String[] {
             "name", "messageComposer",
             "kind", "element",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (switchYardTypeEClass, 
           source, 
           new String[] {
             "name", "SwitchYardType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getSwitchYardType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getSwitchYardType_TargetNamespace(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "targetNamespace"
           });		
        addAnnotation
          (getSwitchYardType_Composite(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "composite",
             "namespace", "http://docs.oasis-open.org/ns/opencsa/sca/200912"
           });		
        addAnnotation
          (getSwitchYardType_Transforms(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "transforms",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getSwitchYardType_Validates(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "validates",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getSwitchYardType_Domain(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "domain",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getSwitchYardType_Artifacts(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "artifacts",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (transformsTypeEClass, 
           source, 
           new String[] {
             "name", "TransformsType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getTransformsType_TransformGroup(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "transform:group",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTransformsType_Transform(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "transform",
             "namespace", "##targetNamespace",
             "group", "transform:group"
           });		
        addAnnotation
          (transformTypeEClass, 
           source, 
           new String[] {
             "name", "TransformType",
             "kind", "empty"
           });		
        addAnnotation
          (getTransformType_From(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "from"
           });		
        addAnnotation
          (getTransformType_To(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "to"
           });		
        addAnnotation
          (validatesTypeEClass, 
           source, 
           new String[] {
             "name", "ValidatesType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getValidatesType_ValidateGroup(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "validate:group",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getValidatesType_Validate(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "validate",
             "namespace", "##targetNamespace",
             "group", "validate:group"
           });		
        addAnnotation
          (validateTypeEClass, 
           source, 
           new String[] {
             "name", "ValidateType",
             "kind", "empty"
           });		
        addAnnotation
          (getValidateType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (switchYardOperationSelectorTypeEClass, 
           source, 
           new String[] {
             "name", "SwitchYardOperationSelectorType",
             "kind", "elementOnly"
           });
    }

} //SwitchyardPackageImpl
