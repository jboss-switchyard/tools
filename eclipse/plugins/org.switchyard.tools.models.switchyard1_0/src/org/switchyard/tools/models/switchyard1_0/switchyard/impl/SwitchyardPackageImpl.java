/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
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
import org.switchyard.tools.models.switchyard1_0.camel.amqp.AmqpPackage;
import org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.AmqpPackageImpl;
import org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage;
import org.switchyard.tools.models.switchyard1_0.camel.atom.impl.AtomPackageImpl;
import org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage;
import org.switchyard.tools.models.switchyard1_0.camel.core.impl.CorePackageImpl;
import org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage;
import org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl;
import org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl;
import org.switchyard.tools.models.switchyard1_0.camel.jms.JmsPackage;
import org.switchyard.tools.models.switchyard1_0.camel.jms.impl.JmsPackageImpl;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl;
import org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage;
import org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl;
import org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage;
import org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl;
import org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzPackage;
import org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.QuartzPackageImpl;
import org.switchyard.tools.models.switchyard1_0.camel.sql.SqlPackage;
import org.switchyard.tools.models.switchyard1_0.camel.sql.impl.SqlPackageImpl;
import org.switchyard.tools.models.switchyard1_0.clojure.ClojurePackage;
import org.switchyard.tools.models.switchyard1_0.clojure.impl.ClojurePackageImpl;
import org.switchyard.tools.models.switchyard1_0.http.HttpPackage;
import org.switchyard.tools.models.switchyard1_0.http.impl.HttpPackageImpl;
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
import org.switchyard.tools.models.switchyard1_0.switchyard.JavaOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.PropertiesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.PropertyType;
import org.switchyard.tools.models.switchyard1_0.switchyard.RegexOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ResourceType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SecuritiesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType;
import org.switchyard.tools.models.switchyard1_0.switchyard.StaticOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.ThrottlingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.XPathOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardValidator;
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
    private EClass throttlingTypeEClass = null;

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
	private EClass javaOperationSelectorTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass regexOperationSelectorTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass staticOperationSelectorTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass xPathOperationSelectorTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass securityTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass securitiesTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType propBooleanEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType propertyValueEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType propIntegerEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType propLongEDataType = null;

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
        ClojurePackageImpl theClojurePackage = (ClojurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClojurePackage.eNS_URI) instanceof ClojurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClojurePackage.eNS_URI) : ClojurePackage.eINSTANCE);
        RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
        SOAPPackageImpl theSOAPPackage = (SOAPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SOAPPackage.eNS_URI) instanceof SOAPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SOAPPackage.eNS_URI) : SOAPPackage.eINSTANCE);
        TransformPackageImpl theTransformPackage = (TransformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransformPackage.eNS_URI) instanceof TransformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransformPackage.eNS_URI) : TransformPackage.eINSTANCE);
        ValidatePackageImpl theValidatePackage = (ValidatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValidatePackage.eNS_URI) instanceof ValidatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValidatePackage.eNS_URI) : ValidatePackage.eINSTANCE);
        CamelPackageImpl theCamelPackage = (CamelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) instanceof CamelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) : CamelPackage.eINSTANCE);
        SpringPackageImpl theSpringPackage = (SpringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI) instanceof SpringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI) : SpringPackage.eINSTANCE);
        JcaPackageImpl theJcaPackage = (JcaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JcaPackage.eNS_URI) instanceof JcaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JcaPackage.eNS_URI) : JcaPackage.eINSTANCE);
        ResteasyPackageImpl theResteasyPackage = (ResteasyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResteasyPackage.eNS_URI) instanceof ResteasyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResteasyPackage.eNS_URI) : ResteasyPackage.eINSTANCE);
        HttpPackageImpl theHttpPackage = (HttpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HttpPackage.eNS_URI) instanceof HttpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HttpPackage.eNS_URI) : HttpPackage.eINSTANCE);
        CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
        AmqpPackageImpl theAmqpPackage = (AmqpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AmqpPackage.eNS_URI) instanceof AmqpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AmqpPackage.eNS_URI) : AmqpPackage.eINSTANCE);
        AtomPackageImpl theAtomPackage = (AtomPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AtomPackage.eNS_URI) instanceof AtomPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AtomPackage.eNS_URI) : AtomPackage.eINSTANCE);
        FilePackageImpl theFilePackage = (FilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI) instanceof FilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI) : FilePackage.eINSTANCE);
        FtpPackageImpl theFtpPackage = (FtpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FtpPackage.eNS_URI) instanceof FtpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FtpPackage.eNS_URI) : FtpPackage.eINSTANCE);
        JmsPackageImpl theJmsPackage = (JmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JmsPackage.eNS_URI) instanceof JmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JmsPackage.eNS_URI) : JmsPackage.eINSTANCE);
        JpaPackageImpl theJpaPackage = (JpaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JpaPackage.eNS_URI) instanceof JpaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JpaPackage.eNS_URI) : JpaPackage.eINSTANCE);
        MailPackageImpl theMailPackage = (MailPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MailPackage.eNS_URI) instanceof MailPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MailPackage.eNS_URI) : MailPackage.eINSTANCE);
        NettyPackageImpl theNettyPackage = (NettyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NettyPackage.eNS_URI) instanceof NettyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NettyPackage.eNS_URI) : NettyPackage.eINSTANCE);
        QuartzPackageImpl theQuartzPackage = (QuartzPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuartzPackage.eNS_URI) instanceof QuartzPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuartzPackage.eNS_URI) : QuartzPackage.eINSTANCE);
        SqlPackageImpl theSqlPackage = (SqlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SqlPackage.eNS_URI) instanceof SqlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SqlPackage.eNS_URI) : SqlPackage.eINSTANCE);

        // Load packages
        theSpringPackage.loadPackage();

        // Create package meta-data objects
        theSwitchyardPackage.createPackageContents();
        theBeanPackage.createPackageContents();
        theBPELPackage.createPackageContents();
        theBPMPackage.createPackageContents();
        theClojurePackage.createPackageContents();
        theRulesPackage.createPackageContents();
        theSOAPPackage.createPackageContents();
        theTransformPackage.createPackageContents();
        theValidatePackage.createPackageContents();
        theCamelPackage.createPackageContents();
        theJcaPackage.createPackageContents();
        theResteasyPackage.createPackageContents();
        theHttpPackage.createPackageContents();
        theCorePackage.createPackageContents();
        theAmqpPackage.createPackageContents();
        theAtomPackage.createPackageContents();
        theFilePackage.createPackageContents();
        theFtpPackage.createPackageContents();
        theJmsPackage.createPackageContents();
        theJpaPackage.createPackageContents();
        theMailPackage.createPackageContents();
        theNettyPackage.createPackageContents();
        theQuartzPackage.createPackageContents();
        theSqlPackage.createPackageContents();

        // Initialize created meta-data
        theSwitchyardPackage.initializePackageContents();
        theBeanPackage.initializePackageContents();
        theBPELPackage.initializePackageContents();
        theBPMPackage.initializePackageContents();
        theClojurePackage.initializePackageContents();
        theRulesPackage.initializePackageContents();
        theSOAPPackage.initializePackageContents();
        theTransformPackage.initializePackageContents();
        theValidatePackage.initializePackageContents();
        theCamelPackage.initializePackageContents();
        theJcaPackage.initializePackageContents();
        theResteasyPackage.initializePackageContents();
        theHttpPackage.initializePackageContents();
        theCorePackage.initializePackageContents();
        theAmqpPackage.initializePackageContents();
        theAtomPackage.initializePackageContents();
        theFilePackage.initializePackageContents();
        theFtpPackage.initializePackageContents();
        theJmsPackage.initializePackageContents();
        theJpaPackage.initializePackageContents();
        theMailPackage.initializePackageContents();
        theNettyPackage.initializePackageContents();
        theQuartzPackage.initializePackageContents();
        theSqlPackage.initializePackageContents();

        // Fix loaded packages
        theSpringPackage.fixPackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theSwitchyardPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return SwitchyardValidator.INSTANCE;
                 }
             });

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
	public EReference getDocumentRoot_InterfaceEsb() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_OperationSelector() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Properties() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Property() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Resource() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Switchyard() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Throttling() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Transform() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Transforms() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Validate() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Validates() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_OperationSelectorSwitchyard() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_OperationSelectorJava() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_OperationSelectorRegex() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_OperationSelectorXpath() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Security() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Target() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(27);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_TargetNamespace() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(28);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Clustered() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(24);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_LoadBalance() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(25);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_SecurityAttr() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(26);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Securities() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
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
	public EAttribute getDomainType_Name() {
        return (EAttribute)domainTypeEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDomainType_Securities() {
        return (EReference)domainTypeEClass.getEStructuralFeatures().get(3);
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
        return (EAttribute)esbInterfaceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEsbInterface_OutputType() {
        return (EAttribute)esbInterfaceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEsbInterface_FaultType() {
        return (EAttribute)esbInterfaceEClass.getEStructuralFeatures().get(0);
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
	public EClass getSwitchYardType() {
        return switchYardTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSwitchYardType_Name() {
        return (EAttribute)switchYardTypeEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSwitchYardType_TargetNamespace() {
        return (EAttribute)switchYardTypeEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getThrottlingType() {
        return throttlingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getThrottlingType_MaxRequests() {
        return (EAttribute)throttlingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getThrottlingType_TimePeriod() {
        return (EAttribute)throttlingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSwitchYardType_Composite() {
        return (EReference)switchYardTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSwitchYardType_Transforms() {
        return (EReference)switchYardTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSwitchYardType_Validates() {
        return (EReference)switchYardTypeEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSwitchYardType_Domain() {
        return (EReference)switchYardTypeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSwitchYardType_Artifacts() {
        return (EReference)switchYardTypeEClass.getEStructuralFeatures().get(4);
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
	public EClass getJavaOperationSelectorType() {
        return javaOperationSelectorTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJavaOperationSelectorType_Class() {
        return (EAttribute)javaOperationSelectorTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRegexOperationSelectorType() {
        return regexOperationSelectorTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRegexOperationSelectorType_Expression() {
        return (EAttribute)regexOperationSelectorTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getStaticOperationSelectorType() {
        return staticOperationSelectorTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getStaticOperationSelectorType_OperationName() {
        return (EAttribute)staticOperationSelectorTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getXPathOperationSelectorType() {
        return xPathOperationSelectorTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getXPathOperationSelectorType_Expression() {
        return (EAttribute)xPathOperationSelectorTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSecurityType() {
        return securityTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSecurityType_CallbackHandler() {
        return (EAttribute)securityTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSecurityType_Name() {
        return (EAttribute)securityTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSecurityType_Properties() {
        return (EReference)securityTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSecurityType_RolesAllowed() {
        return (EAttribute)securityTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSecurityType_RunAs() {
        return (EAttribute)securityTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSecurityType_SecurityDomain() {
        return (EAttribute)securityTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSecuritiesType() {
        return securitiesTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSecuritiesType_Security() {
        return (EReference)securitiesTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getPropBoolean() {
        return propBooleanEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getPropertyValue() {
        return propertyValueEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getPropInteger() {
        return propIntegerEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getPropLong() {
        return propLongEDataType;
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
        createEReference(documentRootEClass, DOCUMENT_ROOT__INTERFACE_ESB);
        createEReference(documentRootEClass, DOCUMENT_ROOT__OPERATION_SELECTOR);
        createEReference(documentRootEClass, DOCUMENT_ROOT__OPERATION_SELECTOR_SWITCHYARD);
        createEReference(documentRootEClass, DOCUMENT_ROOT__OPERATION_SELECTOR_JAVA);
        createEReference(documentRootEClass, DOCUMENT_ROOT__OPERATION_SELECTOR_REGEX);
        createEReference(documentRootEClass, DOCUMENT_ROOT__OPERATION_SELECTOR_XPATH);
        createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTIES);
        createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY);
        createEReference(documentRootEClass, DOCUMENT_ROOT__RESOURCE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__SECURITIES);
        createEReference(documentRootEClass, DOCUMENT_ROOT__SECURITY);
        createEReference(documentRootEClass, DOCUMENT_ROOT__SWITCHYARD);
        createEReference(documentRootEClass, DOCUMENT_ROOT__THROTTLING);
        createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSFORM);
        createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSFORMS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__VALIDATE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__VALIDATES);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__CLUSTERED);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__LOAD_BALANCE);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__SECURITY_ATTR);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__TARGET);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__TARGET_NAMESPACE);

        domainTypeEClass = createEClass(DOMAIN_TYPE);
        createEReference(domainTypeEClass, DOMAIN_TYPE__TRANSFORMS);
        createEReference(domainTypeEClass, DOMAIN_TYPE__VALIDATES);
        createEReference(domainTypeEClass, DOMAIN_TYPE__PROPERTIES);
        createEReference(domainTypeEClass, DOMAIN_TYPE__SECURITIES);
        createEAttribute(domainTypeEClass, DOMAIN_TYPE__NAME);

        esbInterfaceEClass = createEClass(ESB_INTERFACE);
        createEAttribute(esbInterfaceEClass, ESB_INTERFACE__FAULT_TYPE);
        createEAttribute(esbInterfaceEClass, ESB_INTERFACE__INPUT_TYPE);
        createEAttribute(esbInterfaceEClass, ESB_INTERFACE__OUTPUT_TYPE);

        javaOperationSelectorTypeEClass = createEClass(JAVA_OPERATION_SELECTOR_TYPE);
        createEAttribute(javaOperationSelectorTypeEClass, JAVA_OPERATION_SELECTOR_TYPE__CLASS);

        messageComposerTypeEClass = createEClass(MESSAGE_COMPOSER_TYPE);
        createEAttribute(messageComposerTypeEClass, MESSAGE_COMPOSER_TYPE__CLASS);

        propertiesTypeEClass = createEClass(PROPERTIES_TYPE);
        createEReference(propertiesTypeEClass, PROPERTIES_TYPE__PROPERTY);

        propertyTypeEClass = createEClass(PROPERTY_TYPE);
        createEAttribute(propertyTypeEClass, PROPERTY_TYPE__NAME);
        createEAttribute(propertyTypeEClass, PROPERTY_TYPE__VALUE);

        regexOperationSelectorTypeEClass = createEClass(REGEX_OPERATION_SELECTOR_TYPE);
        createEAttribute(regexOperationSelectorTypeEClass, REGEX_OPERATION_SELECTOR_TYPE__EXPRESSION);

        resourceTypeEClass = createEClass(RESOURCE_TYPE);
        createEAttribute(resourceTypeEClass, RESOURCE_TYPE__LOCATION);
        createEAttribute(resourceTypeEClass, RESOURCE_TYPE__TYPE);

        securitiesTypeEClass = createEClass(SECURITIES_TYPE);
        createEReference(securitiesTypeEClass, SECURITIES_TYPE__SECURITY);

        securityTypeEClass = createEClass(SECURITY_TYPE);
        createEReference(securityTypeEClass, SECURITY_TYPE__PROPERTIES);
        createEAttribute(securityTypeEClass, SECURITY_TYPE__CALLBACK_HANDLER);
        createEAttribute(securityTypeEClass, SECURITY_TYPE__NAME);
        createEAttribute(securityTypeEClass, SECURITY_TYPE__ROLES_ALLOWED);
        createEAttribute(securityTypeEClass, SECURITY_TYPE__RUN_AS);
        createEAttribute(securityTypeEClass, SECURITY_TYPE__SECURITY_DOMAIN);

        staticOperationSelectorTypeEClass = createEClass(STATIC_OPERATION_SELECTOR_TYPE);
        createEAttribute(staticOperationSelectorTypeEClass, STATIC_OPERATION_SELECTOR_TYPE__OPERATION_NAME);

        switchYardBindingTypeEClass = createEClass(SWITCH_YARD_BINDING_TYPE);

        switchYardOperationSelectorTypeEClass = createEClass(SWITCH_YARD_OPERATION_SELECTOR_TYPE);

        switchYardTypeEClass = createEClass(SWITCH_YARD_TYPE);
        createEReference(switchYardTypeEClass, SWITCH_YARD_TYPE__COMPOSITE);
        createEReference(switchYardTypeEClass, SWITCH_YARD_TYPE__TRANSFORMS);
        createEReference(switchYardTypeEClass, SWITCH_YARD_TYPE__VALIDATES);
        createEReference(switchYardTypeEClass, SWITCH_YARD_TYPE__DOMAIN);
        createEReference(switchYardTypeEClass, SWITCH_YARD_TYPE__ARTIFACTS);
        createEAttribute(switchYardTypeEClass, SWITCH_YARD_TYPE__NAME);
        createEAttribute(switchYardTypeEClass, SWITCH_YARD_TYPE__TARGET_NAMESPACE);

        throttlingTypeEClass = createEClass(THROTTLING_TYPE);
        createEAttribute(throttlingTypeEClass, THROTTLING_TYPE__MAX_REQUESTS);
        createEAttribute(throttlingTypeEClass, THROTTLING_TYPE__TIME_PERIOD);

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

        xPathOperationSelectorTypeEClass = createEClass(XPATH_OPERATION_SELECTOR_TYPE);
        createEAttribute(xPathOperationSelectorTypeEClass, XPATH_OPERATION_SELECTOR_TYPE__EXPRESSION);

        // Create data types
        propBooleanEDataType = createEDataType(PROP_BOOLEAN);
        propertyValueEDataType = createEDataType(PROPERTY_VALUE);
        propIntegerEDataType = createEDataType(PROP_INTEGER);
        propLongEDataType = createEDataType(PROP_LONG);
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
        javaOperationSelectorTypeEClass.getESuperTypes().add(this.getSwitchYardOperationSelectorType());
        regexOperationSelectorTypeEClass.getESuperTypes().add(this.getSwitchYardOperationSelectorType());
        staticOperationSelectorTypeEClass.getESuperTypes().add(this.getSwitchYardOperationSelectorType());
        switchYardBindingTypeEClass.getESuperTypes().add(theScaPackage.getBinding());
        switchYardOperationSelectorTypeEClass.getESuperTypes().add(theScaPackage.getOperationSelectorType());
        xPathOperationSelectorTypeEClass.getESuperTypes().add(this.getSwitchYardOperationSelectorType());

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
        initEReference(getDocumentRoot_InterfaceEsb(), this.getEsbInterface(), null, "interfaceEsb", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_OperationSelector(), this.getStaticOperationSelectorType(), null, "operationSelector", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_OperationSelectorSwitchyard(), this.getSwitchYardOperationSelectorType(), null, "operationSelectorSwitchyard", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_OperationSelectorJava(), this.getJavaOperationSelectorType(), null, "operationSelectorJava", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_OperationSelectorRegex(), this.getRegexOperationSelectorType(), null, "operationSelectorRegex", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_OperationSelectorXpath(), this.getXPathOperationSelectorType(), null, "operationSelectorXpath", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Properties(), this.getPropertiesType(), null, "properties", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Property(), this.getPropertyType(), null, "property", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Resource(), this.getResourceType(), null, "resource", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Securities(), this.getSecuritiesType(), null, "securities", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Security(), this.getSecurityType(), null, "security", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Switchyard(), this.getSwitchYardType(), null, "switchyard", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Throttling(), this.getThrottlingType(), null, "throttling", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Transform(), this.getTransformType(), null, "transform", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Transforms(), this.getTransformsType(), null, "transforms", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Validate(), this.getValidateType(), null, "validate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Validates(), this.getValidatesType(), null, "validates", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Clustered(), theXMLTypePackage.getBoolean(), "clustered", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_LoadBalance(), theXMLTypePackage.getString(), "loadBalance", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_SecurityAttr(), theXMLTypePackage.getString(), "securityAttr", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Target(), theXMLTypePackage.getString(), "target", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_TargetNamespace(), theXMLTypePackage.getString(), "targetNamespace", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(domainTypeEClass, DomainType.class, "DomainType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDomainType_Transforms(), this.getTransformsType(), null, "transforms", null, 0, 1, DomainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDomainType_Validates(), this.getValidatesType(), null, "validates", null, 0, 1, DomainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDomainType_Properties(), this.getPropertiesType(), null, "properties", null, 0, 1, DomainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDomainType_Securities(), this.getSecuritiesType(), null, "securities", null, 0, 1, DomainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDomainType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, DomainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(esbInterfaceEClass, EsbInterface.class, "EsbInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEsbInterface_FaultType(), theXMLTypePackage.getString(), "faultType", null, 0, 1, EsbInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEsbInterface_InputType(), theXMLTypePackage.getString(), "inputType", null, 0, 1, EsbInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEsbInterface_OutputType(), theXMLTypePackage.getString(), "outputType", null, 0, 1, EsbInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(javaOperationSelectorTypeEClass, JavaOperationSelectorType.class, "JavaOperationSelectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getJavaOperationSelectorType_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, JavaOperationSelectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(messageComposerTypeEClass, MessageComposerType.class, "MessageComposerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMessageComposerType_Class(), theXMLTypePackage.getString(), "class", null, 0, 1, MessageComposerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertiesTypeEClass, PropertiesType.class, "PropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPropertiesType_Property(), this.getPropertyType(), null, "property", null, 0, -1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyTypeEClass, PropertyType.class, "PropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPropertyType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPropertyType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(regexOperationSelectorTypeEClass, RegexOperationSelectorType.class, "RegexOperationSelectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRegexOperationSelectorType_Expression(), theXMLTypePackage.getString(), "expression", null, 1, 1, RegexOperationSelectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(resourceTypeEClass, ResourceType.class, "ResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getResourceType_Location(), theXMLTypePackage.getString(), "location", null, 1, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResourceType_Type(), theXMLTypePackage.getNCName(), "type", null, 1, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(securitiesTypeEClass, SecuritiesType.class, "SecuritiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSecuritiesType_Security(), this.getSecurityType(), null, "security", null, 0, -1, SecuritiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(securityTypeEClass, SecurityType.class, "SecurityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSecurityType_Properties(), this.getPropertiesType(), null, "properties", null, 0, 1, SecurityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSecurityType_CallbackHandler(), theXMLTypePackage.getString(), "callbackHandler", null, 0, 1, SecurityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSecurityType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, SecurityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSecurityType_RolesAllowed(), theXMLTypePackage.getString(), "rolesAllowed", null, 0, 1, SecurityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSecurityType_RunAs(), theXMLTypePackage.getString(), "runAs", null, 0, 1, SecurityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSecurityType_SecurityDomain(), theXMLTypePackage.getString(), "securityDomain", null, 0, 1, SecurityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(staticOperationSelectorTypeEClass, StaticOperationSelectorType.class, "StaticOperationSelectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStaticOperationSelectorType_OperationName(), theXMLTypePackage.getString(), "operationName", null, 1, 1, StaticOperationSelectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(switchYardBindingTypeEClass, SwitchYardBindingType.class, "SwitchYardBindingType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(switchYardOperationSelectorTypeEClass, SwitchYardOperationSelectorType.class, "SwitchYardOperationSelectorType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(switchYardTypeEClass, SwitchYardType.class, "SwitchYardType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSwitchYardType_Composite(), theScaPackage.getComposite(), null, "composite", null, 0, 1, SwitchYardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSwitchYardType_Transforms(), this.getTransformsType(), null, "transforms", null, 0, 1, SwitchYardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSwitchYardType_Validates(), this.getValidatesType(), null, "validates", null, 0, 1, SwitchYardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSwitchYardType_Domain(), this.getDomainType(), null, "domain", null, 0, 1, SwitchYardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSwitchYardType_Artifacts(), this.getArtifactsType(), null, "artifacts", null, 0, 1, SwitchYardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSwitchYardType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, SwitchYardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSwitchYardType_TargetNamespace(), theXMLTypePackage.getString(), "targetNamespace", null, 0, 1, SwitchYardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(throttlingTypeEClass, ThrottlingType.class, "ThrottlingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getThrottlingType_MaxRequests(), this.getPropInteger(), "maxRequests", null, 1, 1, ThrottlingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getThrottlingType_TimePeriod(), this.getPropLong(), "timePeriod", "1000", 0, 1, ThrottlingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(transformsTypeEClass, TransformsType.class, "TransformsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTransformsType_TransformGroup(), ecorePackage.getEFeatureMapEntry(), "transformGroup", null, 0, -1, TransformsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTransformsType_Transform(), this.getTransformType(), null, "transform", null, 0, -1, TransformsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(transformTypeEClass, TransformType.class, "TransformType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTransformType_From(), theXMLTypePackage.getString(), "from", null, 1, 1, TransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTransformType_To(), theXMLTypePackage.getString(), "to", null, 1, 1, TransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(validatesTypeEClass, ValidatesType.class, "ValidatesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getValidatesType_ValidateGroup(), ecorePackage.getEFeatureMapEntry(), "validateGroup", null, 0, -1, ValidatesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getValidatesType_Validate(), this.getValidateType(), null, "validate", null, 0, -1, ValidatesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(validateTypeEClass, ValidateType.class, "ValidateType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getValidateType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ValidateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(xPathOperationSelectorTypeEClass, XPathOperationSelectorType.class, "XPathOperationSelectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getXPathOperationSelectorType_Expression(), theXMLTypePackage.getString(), "expression", null, 1, 1, XPathOperationSelectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize data types
        initEDataType(propBooleanEDataType, Object.class, "PropBoolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(propertyValueEDataType, String.class, "PropertyValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(propIntegerEDataType, Object.class, "PropInteger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(propLongEDataType, Object.class, "PropLong", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
          (getDocumentRoot_InterfaceEsb(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "interface.esb",
             "namespace", "##targetNamespace",
             "affiliation", "http://docs.oasis-open.org/ns/opencsa/sca/200912#interface"
           });		
        addAnnotation
          (getDocumentRoot_OperationSelector(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "operationSelector",
             "namespace", "##targetNamespace",
             "affiliation", "operationSelector.switchyard"
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
          (getDocumentRoot_OperationSelectorJava(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "operationSelector.java",
             "namespace", "##targetNamespace",
             "affiliation", "operationSelector.switchyard"
           });		
        addAnnotation
          (getDocumentRoot_OperationSelectorRegex(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "operationSelector.regex",
             "namespace", "##targetNamespace",
             "affiliation", "operationSelector.switchyard"
           });		
        addAnnotation
          (getDocumentRoot_OperationSelectorXpath(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "operationSelector.xpath",
             "namespace", "##targetNamespace",
             "affiliation", "operationSelector.switchyard"
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
          (getDocumentRoot_Securities(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "securities",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Security(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "security",
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
          (getDocumentRoot_Throttling(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "throttling",
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
          (getDocumentRoot_Clustered(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "clustered",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_LoadBalance(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "loadBalance",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_SecurityAttr(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "security",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Target(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "target",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_TargetNamespace(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "targetNamespace",
             "namespace", "##targetNamespace"
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
          (getDomainType_Securities(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "securities",
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
             "kind", "elementOnly"
           });		
        addAnnotation
          (getEsbInterface_FaultType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "faultType"
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
          (javaOperationSelectorTypeEClass, 
           source, 
           new String[] {
             "name", "JavaOperationSelectorType",
             "kind", "empty"
           });			
        addAnnotation
          (getJavaOperationSelectorType_Class(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "class"
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
          (propBooleanEDataType, 
           source, 
           new String[] {
             "name", "propBoolean",
             "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#boolean propertyValue"
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
          (propertyValueEDataType, 
           source, 
           new String[] {
             "name", "propertyValue",
             "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
             "pattern", "\\$\\{([a-zA-Z0-9])*(:([a-zA-Z0-9])*)?\\}"
           });		
        addAnnotation
          (propIntegerEDataType, 
           source, 
           new String[] {
             "name", "propInteger",
             "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#integer propertyValue"
           });		
        addAnnotation
          (propLongEDataType, 
           source, 
           new String[] {
             "name", "propLong",
             "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#long propertyValue"
           });			
        addAnnotation
          (regexOperationSelectorTypeEClass, 
           source, 
           new String[] {
             "name", "RegexOperationSelectorType",
             "kind", "empty"
           });			
        addAnnotation
          (getRegexOperationSelectorType_Expression(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "expression"
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
          (securitiesTypeEClass, 
           source, 
           new String[] {
             "name", "SecuritiesType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getSecuritiesType_Security(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "security",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (securityTypeEClass, 
           source, 
           new String[] {
             "name", "SecurityType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getSecurityType_Properties(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "properties",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getSecurityType_CallbackHandler(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "callbackHandler"
           });		
        addAnnotation
          (getSecurityType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getSecurityType_RolesAllowed(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "rolesAllowed"
           });		
        addAnnotation
          (getSecurityType_RunAs(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "runAs"
           });		
        addAnnotation
          (getSecurityType_SecurityDomain(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "securityDomain"
           });			
        addAnnotation
          (staticOperationSelectorTypeEClass, 
           source, 
           new String[] {
             "name", "StaticOperationSelectorType",
             "kind", "empty"
           });			
        addAnnotation
          (getStaticOperationSelectorType_OperationName(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "operationName"
           });		
        addAnnotation
          (switchYardBindingTypeEClass, 
           source, 
           new String[] {
             "name", "SwitchYardBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (switchYardOperationSelectorTypeEClass, 
           source, 
           new String[] {
             "name", "SwitchYardOperationSelectorType",
             "kind", "empty"
           });		
        addAnnotation
          (switchYardTypeEClass, 
           source, 
           new String[] {
             "name", "SwitchYardType",
             "kind", "elementOnly"
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
          (throttlingTypeEClass, 
           source, 
           new String[] {
             "name", "ThrottlingType",
             "kind", "empty"
           });			
        addAnnotation
          (getThrottlingType_MaxRequests(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "maxRequests"
           });			
        addAnnotation
          (getThrottlingType_TimePeriod(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "timePeriod"
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
          (xPathOperationSelectorTypeEClass, 
           source, 
           new String[] {
             "name", "XPathOperationSelectorType",
             "kind", "empty"
           });			
        addAnnotation
          (getXPathOperationSelectorType_Expression(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "expression"
           });
    }

} //SwitchyardPackageImpl
