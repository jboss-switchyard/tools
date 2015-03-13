/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.sap.impl;

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

import org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage;
import org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CxfPackageImpl;
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

import org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage;
import org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.MqttPackageImpl;
import org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage;

import org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzPackage;

import org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.QuartzPackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.rss.RssPackage;
import org.switchyard.tools.models.switchyard1_0.camel.rss.impl.RssPackageImpl;
import org.switchyard.tools.models.switchyard1_0.camel.sap.AdditionalUriParametersType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.BaseCamelBinding;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListServerType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocListDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcServerType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcServerType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.camel.sap.ParameterType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.SapFactory;
import org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage;

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
public class SapPackageImpl extends EPackageImpl implements SapPackage {
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
    private EClass camelSapBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelSapIDocDestinationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelSapIDocListDestinationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelSapIDocListServerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelSapQIDocDestinationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelSapQIDocListDestinationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelSapQRfcDestinationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelSapSRfcDestinationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelSapSRfcServerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelSapTRfcDestinationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelSapTRfcServerTypeEClass = null;

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SapPackageImpl() {
        super(eNS_URI, SapFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link SapPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SapPackage init() {
        if (isInited) return (SapPackage)EPackage.Registry.INSTANCE.getEPackage(SapPackage.eNS_URI);

        // Obtain or create and register package
        SapPackageImpl theSapPackage = (SapPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SapPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SapPackageImpl());

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
        MqttPackageImpl theMqttPackage = (MqttPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MqttPackage.eNS_URI) instanceof MqttPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MqttPackage.eNS_URI) : MqttPackage.eINSTANCE);
        CxfPackageImpl theCxfPackage = (CxfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CxfPackage.eNS_URI) instanceof CxfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CxfPackage.eNS_URI) : CxfPackage.eINSTANCE);

        // Load packages
        theSpringPackage.loadPackage();

        // Create package meta-data objects
        theSapPackage.createPackageContents();
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
        theMqttPackage.createPackageContents();
        theCxfPackage.createPackageContents();

        // Initialize created meta-data
        theSapPackage.initializePackageContents();
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
        theMqttPackage.initializePackageContents();
        theCxfPackage.initializePackageContents();

        // Fix loaded packages
        theSpringPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theSapPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SapPackage.eNS_URI, theSapPackage);
        return theSapPackage;
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
    public EClass getCamelSapBindingType() {
        return camelSapBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelSapBindingType_IdoclistServer() {
        return (EReference)camelSapBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelSapBindingType_SrfcServer() {
        return (EReference)camelSapBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelSapBindingType_TrfcServer() {
        return (EReference)camelSapBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelSapBindingType_IdocDestination() {
        return (EReference)camelSapBindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelSapBindingType_IdoclistDestination() {
        return (EReference)camelSapBindingTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelSapBindingType_QidocDestination() {
        return (EReference)camelSapBindingTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelSapBindingType_QidoclistDestination() {
        return (EReference)camelSapBindingTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelSapBindingType_QrfcDestination() {
        return (EReference)camelSapBindingTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelSapBindingType_SrfcDestination() {
        return (EReference)camelSapBindingTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelSapBindingType_TrfcDestination() {
        return (EReference)camelSapBindingTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelSapIDocDestinationType() {
        return camelSapIDocDestinationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapIDocDestinationType_DestinationName() {
        return (EAttribute)camelSapIDocDestinationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapIDocDestinationType_IdocType() {
        return (EAttribute)camelSapIDocDestinationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapIDocDestinationType_IdocTypeExtension() {
        return (EAttribute)camelSapIDocDestinationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapIDocDestinationType_SystemRelease() {
        return (EAttribute)camelSapIDocDestinationTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapIDocDestinationType_ApplicationRelease() {
        return (EAttribute)camelSapIDocDestinationTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelSapIDocListDestinationType() {
        return camelSapIDocListDestinationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapIDocListDestinationType_DestinationName() {
        return (EAttribute)camelSapIDocListDestinationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapIDocListDestinationType_IdocType() {
        return (EAttribute)camelSapIDocListDestinationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapIDocListDestinationType_IdocTypeExtension() {
        return (EAttribute)camelSapIDocListDestinationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapIDocListDestinationType_SystemRelease() {
        return (EAttribute)camelSapIDocListDestinationTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapIDocListDestinationType_ApplicationRelease() {
        return (EAttribute)camelSapIDocListDestinationTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelSapIDocListServerType() {
        return camelSapIDocListServerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapIDocListServerType_ServerName() {
        return (EAttribute)camelSapIDocListServerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapIDocListServerType_IdocType() {
        return (EAttribute)camelSapIDocListServerTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapIDocListServerType_IdocTypeExtension() {
        return (EAttribute)camelSapIDocListServerTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapIDocListServerType_SystemRelease() {
        return (EAttribute)camelSapIDocListServerTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapIDocListServerType_ApplicationRelease() {
        return (EAttribute)camelSapIDocListServerTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelSapQIDocDestinationType() {
        return camelSapQIDocDestinationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapQIDocDestinationType_DestinationName() {
        return (EAttribute)camelSapQIDocDestinationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapQIDocDestinationType_QueueName() {
        return (EAttribute)camelSapQIDocDestinationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapQIDocDestinationType_IdocType() {
        return (EAttribute)camelSapQIDocDestinationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapQIDocDestinationType_IdocTypeExtension() {
        return (EAttribute)camelSapQIDocDestinationTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapQIDocDestinationType_SystemRelease() {
        return (EAttribute)camelSapQIDocDestinationTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapQIDocDestinationType_ApplicationRelease() {
        return (EAttribute)camelSapQIDocDestinationTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelSapQIDocListDestinationType() {
        return camelSapQIDocListDestinationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapQIDocListDestinationType_DestinationName() {
        return (EAttribute)camelSapQIDocListDestinationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapQIDocListDestinationType_QueueName() {
        return (EAttribute)camelSapQIDocListDestinationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapQIDocListDestinationType_IdocType() {
        return (EAttribute)camelSapQIDocListDestinationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapQIDocListDestinationType_IdocTypeExtension() {
        return (EAttribute)camelSapQIDocListDestinationTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapQIDocListDestinationType_SystemRelease() {
        return (EAttribute)camelSapQIDocListDestinationTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapQIDocListDestinationType_ApplicationRelease() {
        return (EAttribute)camelSapQIDocListDestinationTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelSapQRfcDestinationType() {
        return camelSapQRfcDestinationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapQRfcDestinationType_DestinationName() {
        return (EAttribute)camelSapQRfcDestinationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapQRfcDestinationType_QueueName() {
        return (EAttribute)camelSapQRfcDestinationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapQRfcDestinationType_RfcName() {
        return (EAttribute)camelSapQRfcDestinationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapQRfcDestinationType_Transacted() {
        return (EAttribute)camelSapQRfcDestinationTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelSapSRfcDestinationType() {
        return camelSapSRfcDestinationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapSRfcDestinationType_DestinationName() {
        return (EAttribute)camelSapSRfcDestinationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapSRfcDestinationType_RfcName() {
        return (EAttribute)camelSapSRfcDestinationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapSRfcDestinationType_Transacted() {
        return (EAttribute)camelSapSRfcDestinationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelSapSRfcServerType() {
        return camelSapSRfcServerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapSRfcServerType_ServerName() {
        return (EAttribute)camelSapSRfcServerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapSRfcServerType_RfcName() {
        return (EAttribute)camelSapSRfcServerTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelSapTRfcDestinationType() {
        return camelSapTRfcDestinationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapTRfcDestinationType_DestinationName() {
        return (EAttribute)camelSapTRfcDestinationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapTRfcDestinationType_RfcName() {
        return (EAttribute)camelSapTRfcDestinationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapTRfcDestinationType_Transacted() {
        return (EAttribute)camelSapTRfcDestinationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelSapTRfcServerType() {
        return camelSapTRfcServerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapTRfcServerType_ServerName() {
        return (EAttribute)camelSapTRfcServerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSapTRfcServerType_RfcName() {
        return (EAttribute)camelSapTRfcServerTypeEClass.getEStructuralFeatures().get(1);
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
    public EReference getDocumentRoot_BindingSap() {
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
    public SapFactory getSapFactory() {
        return (SapFactory)getEFactoryInstance();
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

        camelSapBindingTypeEClass = createEClass(CAMEL_SAP_BINDING_TYPE);
        createEReference(camelSapBindingTypeEClass, CAMEL_SAP_BINDING_TYPE__IDOCLIST_SERVER);
        createEReference(camelSapBindingTypeEClass, CAMEL_SAP_BINDING_TYPE__SRFC_SERVER);
        createEReference(camelSapBindingTypeEClass, CAMEL_SAP_BINDING_TYPE__TRFC_SERVER);
        createEReference(camelSapBindingTypeEClass, CAMEL_SAP_BINDING_TYPE__IDOC_DESTINATION);
        createEReference(camelSapBindingTypeEClass, CAMEL_SAP_BINDING_TYPE__IDOCLIST_DESTINATION);
        createEReference(camelSapBindingTypeEClass, CAMEL_SAP_BINDING_TYPE__QIDOC_DESTINATION);
        createEReference(camelSapBindingTypeEClass, CAMEL_SAP_BINDING_TYPE__QIDOCLIST_DESTINATION);
        createEReference(camelSapBindingTypeEClass, CAMEL_SAP_BINDING_TYPE__QRFC_DESTINATION);
        createEReference(camelSapBindingTypeEClass, CAMEL_SAP_BINDING_TYPE__SRFC_DESTINATION);
        createEReference(camelSapBindingTypeEClass, CAMEL_SAP_BINDING_TYPE__TRFC_DESTINATION);

        camelSapIDocDestinationTypeEClass = createEClass(CAMEL_SAP_IDOC_DESTINATION_TYPE);
        createEAttribute(camelSapIDocDestinationTypeEClass, CAMEL_SAP_IDOC_DESTINATION_TYPE__DESTINATION_NAME);
        createEAttribute(camelSapIDocDestinationTypeEClass, CAMEL_SAP_IDOC_DESTINATION_TYPE__IDOC_TYPE);
        createEAttribute(camelSapIDocDestinationTypeEClass, CAMEL_SAP_IDOC_DESTINATION_TYPE__IDOC_TYPE_EXTENSION);
        createEAttribute(camelSapIDocDestinationTypeEClass, CAMEL_SAP_IDOC_DESTINATION_TYPE__SYSTEM_RELEASE);
        createEAttribute(camelSapIDocDestinationTypeEClass, CAMEL_SAP_IDOC_DESTINATION_TYPE__APPLICATION_RELEASE);

        camelSapIDocListDestinationTypeEClass = createEClass(CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE);
        createEAttribute(camelSapIDocListDestinationTypeEClass, CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__DESTINATION_NAME);
        createEAttribute(camelSapIDocListDestinationTypeEClass, CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__IDOC_TYPE);
        createEAttribute(camelSapIDocListDestinationTypeEClass, CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__IDOC_TYPE_EXTENSION);
        createEAttribute(camelSapIDocListDestinationTypeEClass, CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__SYSTEM_RELEASE);
        createEAttribute(camelSapIDocListDestinationTypeEClass, CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__APPLICATION_RELEASE);

        camelSapIDocListServerTypeEClass = createEClass(CAMEL_SAP_IDOC_LIST_SERVER_TYPE);
        createEAttribute(camelSapIDocListServerTypeEClass, CAMEL_SAP_IDOC_LIST_SERVER_TYPE__SERVER_NAME);
        createEAttribute(camelSapIDocListServerTypeEClass, CAMEL_SAP_IDOC_LIST_SERVER_TYPE__IDOC_TYPE);
        createEAttribute(camelSapIDocListServerTypeEClass, CAMEL_SAP_IDOC_LIST_SERVER_TYPE__IDOC_TYPE_EXTENSION);
        createEAttribute(camelSapIDocListServerTypeEClass, CAMEL_SAP_IDOC_LIST_SERVER_TYPE__SYSTEM_RELEASE);
        createEAttribute(camelSapIDocListServerTypeEClass, CAMEL_SAP_IDOC_LIST_SERVER_TYPE__APPLICATION_RELEASE);

        camelSapQIDocDestinationTypeEClass = createEClass(CAMEL_SAP_QI_DOC_DESTINATION_TYPE);
        createEAttribute(camelSapQIDocDestinationTypeEClass, CAMEL_SAP_QI_DOC_DESTINATION_TYPE__DESTINATION_NAME);
        createEAttribute(camelSapQIDocDestinationTypeEClass, CAMEL_SAP_QI_DOC_DESTINATION_TYPE__QUEUE_NAME);
        createEAttribute(camelSapQIDocDestinationTypeEClass, CAMEL_SAP_QI_DOC_DESTINATION_TYPE__IDOC_TYPE);
        createEAttribute(camelSapQIDocDestinationTypeEClass, CAMEL_SAP_QI_DOC_DESTINATION_TYPE__IDOC_TYPE_EXTENSION);
        createEAttribute(camelSapQIDocDestinationTypeEClass, CAMEL_SAP_QI_DOC_DESTINATION_TYPE__SYSTEM_RELEASE);
        createEAttribute(camelSapQIDocDestinationTypeEClass, CAMEL_SAP_QI_DOC_DESTINATION_TYPE__APPLICATION_RELEASE);

        camelSapQIDocListDestinationTypeEClass = createEClass(CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE);
        createEAttribute(camelSapQIDocListDestinationTypeEClass, CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__DESTINATION_NAME);
        createEAttribute(camelSapQIDocListDestinationTypeEClass, CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__QUEUE_NAME);
        createEAttribute(camelSapQIDocListDestinationTypeEClass, CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__IDOC_TYPE);
        createEAttribute(camelSapQIDocListDestinationTypeEClass, CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__IDOC_TYPE_EXTENSION);
        createEAttribute(camelSapQIDocListDestinationTypeEClass, CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__SYSTEM_RELEASE);
        createEAttribute(camelSapQIDocListDestinationTypeEClass, CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__APPLICATION_RELEASE);

        camelSapQRfcDestinationTypeEClass = createEClass(CAMEL_SAP_QRFC_DESTINATION_TYPE);
        createEAttribute(camelSapQRfcDestinationTypeEClass, CAMEL_SAP_QRFC_DESTINATION_TYPE__DESTINATION_NAME);
        createEAttribute(camelSapQRfcDestinationTypeEClass, CAMEL_SAP_QRFC_DESTINATION_TYPE__QUEUE_NAME);
        createEAttribute(camelSapQRfcDestinationTypeEClass, CAMEL_SAP_QRFC_DESTINATION_TYPE__RFC_NAME);
        createEAttribute(camelSapQRfcDestinationTypeEClass, CAMEL_SAP_QRFC_DESTINATION_TYPE__TRANSACTED);

        camelSapSRfcDestinationTypeEClass = createEClass(CAMEL_SAP_SRFC_DESTINATION_TYPE);
        createEAttribute(camelSapSRfcDestinationTypeEClass, CAMEL_SAP_SRFC_DESTINATION_TYPE__DESTINATION_NAME);
        createEAttribute(camelSapSRfcDestinationTypeEClass, CAMEL_SAP_SRFC_DESTINATION_TYPE__RFC_NAME);
        createEAttribute(camelSapSRfcDestinationTypeEClass, CAMEL_SAP_SRFC_DESTINATION_TYPE__TRANSACTED);

        camelSapSRfcServerTypeEClass = createEClass(CAMEL_SAP_SRFC_SERVER_TYPE);
        createEAttribute(camelSapSRfcServerTypeEClass, CAMEL_SAP_SRFC_SERVER_TYPE__SERVER_NAME);
        createEAttribute(camelSapSRfcServerTypeEClass, CAMEL_SAP_SRFC_SERVER_TYPE__RFC_NAME);

        camelSapTRfcDestinationTypeEClass = createEClass(CAMEL_SAP_TRFC_DESTINATION_TYPE);
        createEAttribute(camelSapTRfcDestinationTypeEClass, CAMEL_SAP_TRFC_DESTINATION_TYPE__DESTINATION_NAME);
        createEAttribute(camelSapTRfcDestinationTypeEClass, CAMEL_SAP_TRFC_DESTINATION_TYPE__RFC_NAME);
        createEAttribute(camelSapTRfcDestinationTypeEClass, CAMEL_SAP_TRFC_DESTINATION_TYPE__TRANSACTED);

        camelSapTRfcServerTypeEClass = createEClass(CAMEL_SAP_TRFC_SERVER_TYPE);
        createEAttribute(camelSapTRfcServerTypeEClass, CAMEL_SAP_TRFC_SERVER_TYPE__SERVER_NAME);
        createEAttribute(camelSapTRfcServerTypeEClass, CAMEL_SAP_TRFC_SERVER_TYPE__RFC_NAME);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_SAP);

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
        camelSapBindingTypeEClass.getESuperTypes().add(this.getBaseCamelBinding());

        // Initialize classes and features; add operations and parameters
        initEClass(additionalUriParametersTypeEClass, AdditionalUriParametersType.class, "AdditionalUriParametersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAdditionalUriParametersType_Parameter(), this.getParameterType(), null, "parameter", null, 0, -1, AdditionalUriParametersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(baseCamelBindingEClass, BaseCamelBinding.class, "BaseCamelBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBaseCamelBinding_ContextMapper(), theSwitchyardPackage.getContextMapperType(), null, "contextMapper", null, 0, 1, BaseCamelBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBaseCamelBinding_MessageComposer(), theSwitchyardPackage.getMessageComposerType(), null, "messageComposer", null, 0, 1, BaseCamelBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBaseCamelBinding_AdditionalUriParameters(), this.getAdditionalUriParametersType(), null, "additionalUriParameters", null, 0, 1, BaseCamelBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelSapBindingTypeEClass, CamelSapBindingType.class, "CamelSapBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCamelSapBindingType_IdoclistServer(), this.getCamelSapIDocListServerType(), null, "idoclistServer", null, 0, 1, CamelSapBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelSapBindingType_SrfcServer(), this.getCamelSapSRfcServerType(), null, "srfcServer", null, 0, 1, CamelSapBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelSapBindingType_TrfcServer(), this.getCamelSapTRfcServerType(), null, "trfcServer", null, 0, 1, CamelSapBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelSapBindingType_IdocDestination(), this.getCamelSapIDocDestinationType(), null, "idocDestination", null, 0, 1, CamelSapBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelSapBindingType_IdoclistDestination(), this.getCamelSapIDocListDestinationType(), null, "idoclistDestination", null, 0, 1, CamelSapBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelSapBindingType_QidocDestination(), this.getCamelSapQIDocDestinationType(), null, "qidocDestination", null, 0, 1, CamelSapBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelSapBindingType_QidoclistDestination(), this.getCamelSapQIDocListDestinationType(), null, "qidoclistDestination", null, 0, 1, CamelSapBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelSapBindingType_QrfcDestination(), this.getCamelSapQRfcDestinationType(), null, "qrfcDestination", null, 0, 1, CamelSapBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelSapBindingType_SrfcDestination(), this.getCamelSapSRfcDestinationType(), null, "srfcDestination", null, 0, 1, CamelSapBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelSapBindingType_TrfcDestination(), this.getCamelSapTRfcDestinationType(), null, "trfcDestination", null, 0, 1, CamelSapBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelSapIDocDestinationTypeEClass, CamelSapIDocDestinationType.class, "CamelSapIDocDestinationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelSapIDocDestinationType_DestinationName(), theXMLTypePackage.getString(), "destinationName", null, 1, 1, CamelSapIDocDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapIDocDestinationType_IdocType(), theXMLTypePackage.getString(), "idocType", null, 1, 1, CamelSapIDocDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapIDocDestinationType_IdocTypeExtension(), theXMLTypePackage.getString(), "idocTypeExtension", null, 0, 1, CamelSapIDocDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapIDocDestinationType_SystemRelease(), theXMLTypePackage.getString(), "systemRelease", null, 0, 1, CamelSapIDocDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapIDocDestinationType_ApplicationRelease(), theXMLTypePackage.getString(), "applicationRelease", null, 0, 1, CamelSapIDocDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelSapIDocListDestinationTypeEClass, CamelSapIDocListDestinationType.class, "CamelSapIDocListDestinationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelSapIDocListDestinationType_DestinationName(), theXMLTypePackage.getString(), "destinationName", null, 1, 1, CamelSapIDocListDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapIDocListDestinationType_IdocType(), theXMLTypePackage.getString(), "idocType", null, 1, 1, CamelSapIDocListDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapIDocListDestinationType_IdocTypeExtension(), theXMLTypePackage.getString(), "idocTypeExtension", null, 0, 1, CamelSapIDocListDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapIDocListDestinationType_SystemRelease(), theXMLTypePackage.getString(), "systemRelease", null, 0, 1, CamelSapIDocListDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapIDocListDestinationType_ApplicationRelease(), theXMLTypePackage.getString(), "applicationRelease", null, 0, 1, CamelSapIDocListDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelSapIDocListServerTypeEClass, CamelSapIDocListServerType.class, "CamelSapIDocListServerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelSapIDocListServerType_ServerName(), theXMLTypePackage.getString(), "serverName", null, 1, 1, CamelSapIDocListServerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapIDocListServerType_IdocType(), theXMLTypePackage.getString(), "idocType", null, 1, 1, CamelSapIDocListServerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapIDocListServerType_IdocTypeExtension(), theXMLTypePackage.getString(), "idocTypeExtension", null, 0, 1, CamelSapIDocListServerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapIDocListServerType_SystemRelease(), theXMLTypePackage.getString(), "systemRelease", null, 0, 1, CamelSapIDocListServerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapIDocListServerType_ApplicationRelease(), theXMLTypePackage.getString(), "applicationRelease", null, 0, 1, CamelSapIDocListServerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelSapQIDocDestinationTypeEClass, CamelSapQIDocDestinationType.class, "CamelSapQIDocDestinationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelSapQIDocDestinationType_DestinationName(), theXMLTypePackage.getString(), "destinationName", null, 1, 1, CamelSapQIDocDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapQIDocDestinationType_QueueName(), theXMLTypePackage.getString(), "queueName", null, 1, 1, CamelSapQIDocDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapQIDocDestinationType_IdocType(), theXMLTypePackage.getString(), "idocType", null, 1, 1, CamelSapQIDocDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapQIDocDestinationType_IdocTypeExtension(), theXMLTypePackage.getString(), "idocTypeExtension", null, 0, 1, CamelSapQIDocDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapQIDocDestinationType_SystemRelease(), theXMLTypePackage.getString(), "systemRelease", null, 0, 1, CamelSapQIDocDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapQIDocDestinationType_ApplicationRelease(), theXMLTypePackage.getString(), "applicationRelease", null, 0, 1, CamelSapQIDocDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelSapQIDocListDestinationTypeEClass, CamelSapQIDocListDestinationType.class, "CamelSapQIDocListDestinationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelSapQIDocListDestinationType_DestinationName(), theXMLTypePackage.getString(), "destinationName", null, 1, 1, CamelSapQIDocListDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapQIDocListDestinationType_QueueName(), theXMLTypePackage.getString(), "queueName", null, 1, 1, CamelSapQIDocListDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapQIDocListDestinationType_IdocType(), theXMLTypePackage.getString(), "idocType", null, 1, 1, CamelSapQIDocListDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapQIDocListDestinationType_IdocTypeExtension(), theXMLTypePackage.getString(), "idocTypeExtension", null, 0, 1, CamelSapQIDocListDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapQIDocListDestinationType_SystemRelease(), theXMLTypePackage.getString(), "systemRelease", null, 0, 1, CamelSapQIDocListDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapQIDocListDestinationType_ApplicationRelease(), theXMLTypePackage.getString(), "applicationRelease", null, 0, 1, CamelSapQIDocListDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelSapQRfcDestinationTypeEClass, CamelSapQRfcDestinationType.class, "CamelSapQRfcDestinationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelSapQRfcDestinationType_DestinationName(), theXMLTypePackage.getString(), "destinationName", null, 1, 1, CamelSapQRfcDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapQRfcDestinationType_QueueName(), theXMLTypePackage.getString(), "queueName", null, 1, 1, CamelSapQRfcDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapQRfcDestinationType_RfcName(), theXMLTypePackage.getString(), "rfcName", null, 1, 1, CamelSapQRfcDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapQRfcDestinationType_Transacted(), theSwitchyardPackage.getPropBoolean(), "transacted", null, 0, 1, CamelSapQRfcDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelSapSRfcDestinationTypeEClass, CamelSapSRfcDestinationType.class, "CamelSapSRfcDestinationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelSapSRfcDestinationType_DestinationName(), theXMLTypePackage.getString(), "destinationName", null, 1, 1, CamelSapSRfcDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapSRfcDestinationType_RfcName(), theXMLTypePackage.getString(), "rfcName", null, 1, 1, CamelSapSRfcDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapSRfcDestinationType_Transacted(), theSwitchyardPackage.getPropBoolean(), "transacted", null, 0, 1, CamelSapSRfcDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelSapSRfcServerTypeEClass, CamelSapSRfcServerType.class, "CamelSapSRfcServerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelSapSRfcServerType_ServerName(), theXMLTypePackage.getString(), "serverName", null, 1, 1, CamelSapSRfcServerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapSRfcServerType_RfcName(), theXMLTypePackage.getString(), "rfcName", null, 1, 1, CamelSapSRfcServerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelSapTRfcDestinationTypeEClass, CamelSapTRfcDestinationType.class, "CamelSapTRfcDestinationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelSapTRfcDestinationType_DestinationName(), theXMLTypePackage.getString(), "destinationName", null, 1, 1, CamelSapTRfcDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapTRfcDestinationType_RfcName(), theXMLTypePackage.getString(), "rfcName", null, 1, 1, CamelSapTRfcDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapTRfcDestinationType_Transacted(), theSwitchyardPackage.getPropBoolean(), "transacted", null, 0, 1, CamelSapTRfcDestinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelSapTRfcServerTypeEClass, CamelSapTRfcServerType.class, "CamelSapTRfcServerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelSapTRfcServerType_ServerName(), theXMLTypePackage.getString(), "serverName", null, 1, 1, CamelSapTRfcServerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSapTRfcServerType_RfcName(), theXMLTypePackage.getString(), "rfcName", null, 1, 1, CamelSapTRfcServerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingSap(), this.getCamelSapBindingType(), null, "bindingSap", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
          (camelSapBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelSapBindingType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getCamelSapBindingType_IdoclistServer(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idoclist-server",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapBindingType_SrfcServer(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "srfc-server",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapBindingType_TrfcServer(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "trfc-server",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapBindingType_IdocDestination(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idoc-destination",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapBindingType_IdoclistDestination(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idoclist-destination",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapBindingType_QidocDestination(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "qidoc-destination",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapBindingType_QidoclistDestination(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "qidoclist-destination",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapBindingType_QrfcDestination(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "qrfc-destination",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapBindingType_SrfcDestination(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "srfc-destination",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapBindingType_TrfcDestination(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "trfc-destination",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (camelSapIDocDestinationTypeEClass, 
           source, 
           new String[] {
             "name", "CamelSapIDocDestinationType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getCamelSapIDocDestinationType_DestinationName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "destinationName",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapIDocDestinationType_IdocType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idocType",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapIDocDestinationType_IdocTypeExtension(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idocTypeExtension",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapIDocDestinationType_SystemRelease(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "systemRelease",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapIDocDestinationType_ApplicationRelease(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "applicationRelease",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (camelSapIDocListDestinationTypeEClass, 
           source, 
           new String[] {
             "name", "CamelSapIDocListDestinationType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getCamelSapIDocListDestinationType_DestinationName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "destinationName",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapIDocListDestinationType_IdocType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idocType",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapIDocListDestinationType_IdocTypeExtension(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idocTypeExtension",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapIDocListDestinationType_SystemRelease(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "systemRelease",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapIDocListDestinationType_ApplicationRelease(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "applicationRelease",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (camelSapIDocListServerTypeEClass, 
           source, 
           new String[] {
             "name", "CamelSapIDocListServerType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getCamelSapIDocListServerType_ServerName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "serverName",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapIDocListServerType_IdocType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idocType",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapIDocListServerType_IdocTypeExtension(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idocTypeExtension",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapIDocListServerType_SystemRelease(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "systemRelease",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapIDocListServerType_ApplicationRelease(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "applicationRelease",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (camelSapQIDocDestinationTypeEClass, 
           source, 
           new String[] {
             "name", "CamelSapQIDocDestinationType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getCamelSapQIDocDestinationType_DestinationName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "destinationName",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapQIDocDestinationType_QueueName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "queueName",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapQIDocDestinationType_IdocType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idocType",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapQIDocDestinationType_IdocTypeExtension(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idocTypeExtension",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapQIDocDestinationType_SystemRelease(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "systemRelease",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapQIDocDestinationType_ApplicationRelease(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "applicationRelease",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (camelSapQIDocListDestinationTypeEClass, 
           source, 
           new String[] {
             "name", "CamelSapQIDocListDestinationType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getCamelSapQIDocListDestinationType_DestinationName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "destinationName",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapQIDocListDestinationType_QueueName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "queueName",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapQIDocListDestinationType_IdocType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idocType",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapQIDocListDestinationType_IdocTypeExtension(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idocTypeExtension",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapQIDocListDestinationType_SystemRelease(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "systemRelease",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapQIDocListDestinationType_ApplicationRelease(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "applicationRelease",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (camelSapQRfcDestinationTypeEClass, 
           source, 
           new String[] {
             "name", "CamelSapQRfcDestinationType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getCamelSapQRfcDestinationType_DestinationName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "destinationName",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapQRfcDestinationType_QueueName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "queueName",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapQRfcDestinationType_RfcName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "rfcName",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapQRfcDestinationType_Transacted(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "transacted",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (camelSapSRfcDestinationTypeEClass, 
           source, 
           new String[] {
             "name", "CamelSapSRfcDestinationType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getCamelSapSRfcDestinationType_DestinationName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "destinationName",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapSRfcDestinationType_RfcName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "rfcName",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapSRfcDestinationType_Transacted(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "transacted",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (camelSapSRfcServerTypeEClass, 
           source, 
           new String[] {
             "name", "CamelSapSRfcServerType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getCamelSapSRfcServerType_ServerName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "serverName",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapSRfcServerType_RfcName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "rfcName",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (camelSapTRfcDestinationTypeEClass, 
           source, 
           new String[] {
             "name", "CamelSapTRfcDestinationType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getCamelSapTRfcDestinationType_DestinationName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "destinationName",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapTRfcDestinationType_RfcName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "rfcName",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapTRfcDestinationType_Transacted(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "transacted",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (camelSapTRfcServerTypeEClass, 
           source, 
           new String[] {
             "name", "CamelSapTRfcServerType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getCamelSapTRfcServerType_ServerName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "serverName",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getCamelSapTRfcServerType_RfcName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "rfcName",
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
          (getDocumentRoot_BindingSap(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.sap",
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

} //SapPackageImpl
