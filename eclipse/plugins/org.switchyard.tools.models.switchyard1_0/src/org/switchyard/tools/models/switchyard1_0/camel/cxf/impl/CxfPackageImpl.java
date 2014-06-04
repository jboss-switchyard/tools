/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.cxf.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

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

import org.switchyard.tools.models.switchyard1_0.camel.cxf.AdditionalUriParametersType;
import org.switchyard.tools.models.switchyard1_0.camel.cxf.BaseCamelBinding;
import org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfFactory;
import org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage;
import org.switchyard.tools.models.switchyard1_0.camel.cxf.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.camel.cxf.ParameterType;

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

import org.switchyard.tools.models.switchyard1_0.camel.rss.RssPackage;

import org.switchyard.tools.models.switchyard1_0.camel.rss.impl.RssPackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage;

import org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl;

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
public class CxfPackageImpl extends EPackageImpl implements CxfPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass additionalUriParametersTypeEClass = null;

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
    private EClass camelCxfBindingTypeEClass = null;

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
    private EClass parameterTypeEClass = null;

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private CxfPackageImpl() {
        super(eNS_URI, CxfFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link CxfPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static CxfPackage init() {
        if (isInited) return (CxfPackage)EPackage.Registry.INSTANCE.getEPackage(CxfPackage.eNS_URI);

        // Obtain or create and register package
        CxfPackageImpl theCxfPackage = (CxfPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CxfPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CxfPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        ScaPackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        BeanPackageImpl theBeanPackage = (BeanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI) instanceof BeanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI) : BeanPackage.eINSTANCE);
        BPMPackageImpl theBPMPackage = (BPMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPMPackage.eNS_URI) instanceof BPMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPMPackage.eNS_URI) : BPMPackage.eINSTANCE);
        SwitchyardPackageImpl theSwitchyardPackage = (SwitchyardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SwitchyardPackage.eNS_URI) instanceof SwitchyardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SwitchyardPackage.eNS_URI) : SwitchyardPackage.eINSTANCE);
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
        RssPackageImpl theRssPackage = (RssPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RssPackage.eNS_URI) instanceof RssPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RssPackage.eNS_URI) : RssPackage.eINSTANCE);
        SapPackageImpl theSapPackage = (SapPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SapPackage.eNS_URI) instanceof SapPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SapPackage.eNS_URI) : SapPackage.eINSTANCE);

        // Load packages
        theSpringPackage.loadPackage();

        // Create package meta-data objects
        theCxfPackage.createPackageContents();
        theBeanPackage.createPackageContents();
        theBPMPackage.createPackageContents();
        theSwitchyardPackage.createPackageContents();
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
        theRssPackage.createPackageContents();
        theSapPackage.createPackageContents();

        // Initialize created meta-data
        theCxfPackage.initializePackageContents();
        theBeanPackage.initializePackageContents();
        theBPMPackage.initializePackageContents();
        theSwitchyardPackage.initializePackageContents();
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
        theRssPackage.initializePackageContents();
        theSapPackage.initializePackageContents();

        // Fix loaded packages
        theSpringPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theCxfPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(CxfPackage.eNS_URI, theCxfPackage);
        return theCxfPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAdditionalUriParametersType() {
        return additionalUriParametersTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAdditionalUriParametersType_Parameter() {
        return (EReference)additionalUriParametersTypeEClass.getEStructuralFeatures().get(0);
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
    public EReference getBaseCamelBinding_AdditionalUriParameters() {
        return (EReference)baseCamelBindingEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelCxfBindingType() {
        return camelCxfBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_CxfURI() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_WsdlURL() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_ServiceClass() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_ServiceName() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_PortName() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_DataFormat() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_RelayHeaders() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_Wrapped() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_WrappedStyle() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_SetDefaultBus() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_Bus() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_CxfBinding() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_HeaderFilterStrategy() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_LoggingFeatureEnabled() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_DefaultOperationName() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_DefaultOperationNamespace() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_Synchronous() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_PublishedEndpointUrl() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_AllowStreaming() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_SkipFaultLogging() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_Username() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelCxfBindingType_Password() {
        return (EAttribute)camelCxfBindingTypeEClass.getEStructuralFeatures().get(21);
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
    public EReference getDocumentRoot_BindingCxf() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getParameterType() {
        return parameterTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameterType_Name() {
        return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameterType_Value() {
        return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CxfFactory getCxfFactory() {
        return (CxfFactory)getEFactoryInstance();
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
        additionalUriParametersTypeEClass = createEClass(ADDITIONAL_URI_PARAMETERS_TYPE);
        createEReference(additionalUriParametersTypeEClass, ADDITIONAL_URI_PARAMETERS_TYPE__PARAMETER);

        baseCamelBindingEClass = createEClass(BASE_CAMEL_BINDING);
        createEReference(baseCamelBindingEClass, BASE_CAMEL_BINDING__CONTEXT_MAPPER);
        createEReference(baseCamelBindingEClass, BASE_CAMEL_BINDING__MESSAGE_COMPOSER);
        createEReference(baseCamelBindingEClass, BASE_CAMEL_BINDING__ADDITIONAL_URI_PARAMETERS);

        camelCxfBindingTypeEClass = createEClass(CAMEL_CXF_BINDING_TYPE);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__CXF_URI);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__WSDL_URL);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__SERVICE_CLASS);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__SERVICE_NAME);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__PORT_NAME);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__DATA_FORMAT);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__RELAY_HEADERS);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__WRAPPED);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__WRAPPED_STYLE);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__SET_DEFAULT_BUS);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__BUS);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__CXF_BINDING);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__HEADER_FILTER_STRATEGY);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__LOGGING_FEATURE_ENABLED);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__DEFAULT_OPERATION_NAME);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__DEFAULT_OPERATION_NAMESPACE);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__SYNCHRONOUS);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__PUBLISHED_ENDPOINT_URL);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__ALLOW_STREAMING);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__SKIP_FAULT_LOGGING);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__USERNAME);
        createEAttribute(camelCxfBindingTypeEClass, CAMEL_CXF_BINDING_TYPE__PASSWORD);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_CXF);

        parameterTypeEClass = createEClass(PARAMETER_TYPE);
        createEAttribute(parameterTypeEClass, PARAMETER_TYPE__NAME);
        createEAttribute(parameterTypeEClass, PARAMETER_TYPE__VALUE);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        baseCamelBindingEClass.getESuperTypes().add(theSwitchyardPackage.getSwitchYardBindingType());
        camelCxfBindingTypeEClass.getESuperTypes().add(this.getBaseCamelBinding());

        // Initialize classes and features; add operations and parameters
        initEClass(additionalUriParametersTypeEClass, AdditionalUriParametersType.class, "AdditionalUriParametersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAdditionalUriParametersType_Parameter(), this.getParameterType(), null, "parameter", null, 0, -1, AdditionalUriParametersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(baseCamelBindingEClass, BaseCamelBinding.class, "BaseCamelBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBaseCamelBinding_ContextMapper(), theSwitchyardPackage.getContextMapperType(), null, "contextMapper", null, 0, 1, BaseCamelBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBaseCamelBinding_MessageComposer(), theSwitchyardPackage.getMessageComposerType(), null, "messageComposer", null, 0, 1, BaseCamelBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBaseCamelBinding_AdditionalUriParameters(), this.getAdditionalUriParametersType(), null, "additionalUriParameters", null, 0, 1, BaseCamelBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelCxfBindingTypeEClass, CamelCxfBindingType.class, "CamelCxfBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelCxfBindingType_CxfURI(), theXMLTypePackage.getAnyURI(), "cxfURI", null, 1, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_WsdlURL(), theXMLTypePackage.getString(), "wsdlURL", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_ServiceClass(), theXMLTypePackage.getString(), "serviceClass", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_ServiceName(), theXMLTypePackage.getString(), "serviceName", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_PortName(), theXMLTypePackage.getString(), "portName", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_DataFormat(), theXMLTypePackage.getString(), "dataFormat", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_RelayHeaders(), theXMLTypePackage.getBoolean(), "relayHeaders", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_Wrapped(), theXMLTypePackage.getBoolean(), "wrapped", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_WrappedStyle(), theXMLTypePackage.getBoolean(), "wrappedStyle", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_SetDefaultBus(), theXMLTypePackage.getBoolean(), "setDefaultBus", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_Bus(), theXMLTypePackage.getString(), "bus", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_CxfBinding(), theXMLTypePackage.getString(), "cxfBinding", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_HeaderFilterStrategy(), theXMLTypePackage.getString(), "headerFilterStrategy", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_LoggingFeatureEnabled(), theXMLTypePackage.getBoolean(), "loggingFeatureEnabled", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_DefaultOperationName(), theXMLTypePackage.getString(), "defaultOperationName", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_DefaultOperationNamespace(), theXMLTypePackage.getString(), "defaultOperationNamespace", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_Synchronous(), theXMLTypePackage.getBoolean(), "synchronous", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_PublishedEndpointUrl(), theXMLTypePackage.getString(), "publishedEndpointUrl", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_AllowStreaming(), theXMLTypePackage.getBoolean(), "allowStreaming", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_SkipFaultLogging(), theXMLTypePackage.getBoolean(), "skipFaultLogging", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_Username(), theXMLTypePackage.getString(), "username", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelCxfBindingType_Password(), theXMLTypePackage.getString(), "password", null, 0, 1, CamelCxfBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingCxf(), this.getCamelCxfBindingType(), null, "bindingCxf", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getParameterType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameterType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
          (additionalUriParametersTypeEClass, 
           source, 
           new String[] {
             "name", "additionalUriParameters_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getAdditionalUriParametersType_Parameter(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "parameter",
             "namespace", "##targetNamespace"
           });		
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
          (getBaseCamelBinding_AdditionalUriParameters(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "additionalUriParameters",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelCxfBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelCxfBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelCxfBindingType_CxfURI(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "cxfURI",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_WsdlURL(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "wsdlURL",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_ServiceClass(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "serviceClass",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_ServiceName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "serviceName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_PortName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "portName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_DataFormat(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "dataFormat",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_RelayHeaders(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "relayHeaders",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_Wrapped(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "wrapped",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_WrappedStyle(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "wrappedStyle",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_SetDefaultBus(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "setDefaultBus",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_Bus(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "bus",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_CxfBinding(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "cxfBinding",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_HeaderFilterStrategy(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "headerFilterStrategy",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_LoggingFeatureEnabled(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "loggingFeatureEnabled",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_DefaultOperationName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "defaultOperationName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_DefaultOperationNamespace(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "defaultOperationNamespace",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_Synchronous(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "synchronous",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_PublishedEndpointUrl(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "publishedEndpointUrl",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_AllowStreaming(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "allowStreaming",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_SkipFaultLogging(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "skipFaultLogging",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_Username(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "username",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelCxfBindingType_Password(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "password",
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
          (getDocumentRoot_BindingCxf(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.cxf",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:2.0#binding.switchyard"
           });		
        addAnnotation
          (parameterTypeEClass, 
           source, 
           new String[] {
             "name", "parameter_._type",
             "kind", "empty"
           });		
        addAnnotation
          (getParameterType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getParameterType_Value(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "value"
           });
    }

} //CxfPackageImpl
