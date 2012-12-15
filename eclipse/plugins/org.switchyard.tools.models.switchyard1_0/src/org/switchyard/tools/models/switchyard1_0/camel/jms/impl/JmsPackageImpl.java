/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.jms.impl;

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
import org.switchyard.tools.models.switchyard1_0.camel.jms.BaseCamelBinding;
import org.switchyard.tools.models.switchyard1_0.camel.jms.CamelJmsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.jms.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.camel.jms.JmsFactory;
import org.switchyard.tools.models.switchyard1_0.camel.jms.JmsPackage;

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

import org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage;

import org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl;

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
public class JmsPackageImpl extends EPackageImpl implements JmsPackage {
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
    private EClass camelJmsBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentRootEClass = null;

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.jms.JmsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private JmsPackageImpl() {
        super(eNS_URI, JmsFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link JmsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static JmsPackage init() {
        if (isInited) return (JmsPackage)EPackage.Registry.INSTANCE.getEPackage(JmsPackage.eNS_URI);

        // Obtain or create and register package
        JmsPackageImpl theJmsPackage = (JmsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JmsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JmsPackageImpl());

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
        CamelPackageImpl theCamelPackage = (CamelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) instanceof CamelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) : CamelPackage.eINSTANCE);
        SpringPackageImpl theSpringPackage = (SpringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI) instanceof SpringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI) : SpringPackage.eINSTANCE);
        JcaPackageImpl theJcaPackage = (JcaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JcaPackage.eNS_URI) instanceof JcaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JcaPackage.eNS_URI) : JcaPackage.eINSTANCE);
        ResteasyPackageImpl theResteasyPackage = (ResteasyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResteasyPackage.eNS_URI) instanceof ResteasyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResteasyPackage.eNS_URI) : ResteasyPackage.eINSTANCE);
        HttpPackageImpl theHttpPackage = (HttpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HttpPackage.eNS_URI) instanceof HttpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HttpPackage.eNS_URI) : HttpPackage.eINSTANCE);
        RemotePackageImpl theRemotePackage = (RemotePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RemotePackage.eNS_URI) instanceof RemotePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RemotePackage.eNS_URI) : RemotePackage.eINSTANCE);
        CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
        AmqpPackageImpl theAmqpPackage = (AmqpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AmqpPackage.eNS_URI) instanceof AmqpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AmqpPackage.eNS_URI) : AmqpPackage.eINSTANCE);
        AtomPackageImpl theAtomPackage = (AtomPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AtomPackage.eNS_URI) instanceof AtomPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AtomPackage.eNS_URI) : AtomPackage.eINSTANCE);
        FilePackageImpl theFilePackage = (FilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI) instanceof FilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI) : FilePackage.eINSTANCE);
        FtpPackageImpl theFtpPackage = (FtpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FtpPackage.eNS_URI) instanceof FtpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FtpPackage.eNS_URI) : FtpPackage.eINSTANCE);
        JpaPackageImpl theJpaPackage = (JpaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JpaPackage.eNS_URI) instanceof JpaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JpaPackage.eNS_URI) : JpaPackage.eINSTANCE);
        MailPackageImpl theMailPackage = (MailPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MailPackage.eNS_URI) instanceof MailPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MailPackage.eNS_URI) : MailPackage.eINSTANCE);
        NettyPackageImpl theNettyPackage = (NettyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NettyPackage.eNS_URI) instanceof NettyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NettyPackage.eNS_URI) : NettyPackage.eINSTANCE);
        QuartzPackageImpl theQuartzPackage = (QuartzPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuartzPackage.eNS_URI) instanceof QuartzPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuartzPackage.eNS_URI) : QuartzPackage.eINSTANCE);
        SqlPackageImpl theSqlPackage = (SqlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SqlPackage.eNS_URI) instanceof SqlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SqlPackage.eNS_URI) : SqlPackage.eINSTANCE);

        // Load packages
        theSpringPackage.loadPackage();

        // Create package meta-data objects
        theJmsPackage.createPackageContents();
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
        theCamelPackage.createPackageContents();
        theJcaPackage.createPackageContents();
        theResteasyPackage.createPackageContents();
        theHttpPackage.createPackageContents();
        theRemotePackage.createPackageContents();
        theCorePackage.createPackageContents();
        theAmqpPackage.createPackageContents();
        theAtomPackage.createPackageContents();
        theFilePackage.createPackageContents();
        theFtpPackage.createPackageContents();
        theJpaPackage.createPackageContents();
        theMailPackage.createPackageContents();
        theNettyPackage.createPackageContents();
        theQuartzPackage.createPackageContents();
        theSqlPackage.createPackageContents();

        // Initialize created meta-data
        theJmsPackage.initializePackageContents();
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
        theCamelPackage.initializePackageContents();
        theJcaPackage.initializePackageContents();
        theResteasyPackage.initializePackageContents();
        theHttpPackage.initializePackageContents();
        theRemotePackage.initializePackageContents();
        theCorePackage.initializePackageContents();
        theAmqpPackage.initializePackageContents();
        theAtomPackage.initializePackageContents();
        theFilePackage.initializePackageContents();
        theFtpPackage.initializePackageContents();
        theJpaPackage.initializePackageContents();
        theMailPackage.initializePackageContents();
        theNettyPackage.initializePackageContents();
        theQuartzPackage.initializePackageContents();
        theSqlPackage.initializePackageContents();

        // Fix loaded packages
        theSpringPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theJmsPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(JmsPackage.eNS_URI, theJmsPackage);
        return theJmsPackage;
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
    public EReference getDocumentRoot_BindingJms() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JmsFactory getJmsFactory() {
        return (JmsFactory)getEFactoryInstance();
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

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_JMS);
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
        camelJmsBindingTypeEClass.getESuperTypes().add(this.getBaseCamelBinding());

        // Initialize classes and features; add operations and parameters
        initEClass(baseCamelBindingEClass, BaseCamelBinding.class, "BaseCamelBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(camelJmsBindingTypeEClass, CamelJmsBindingType.class, "CamelJmsBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelJmsBindingType_Queue(), theXMLTypePackage.getString(), "queue", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_Topic(), theXMLTypePackage.getString(), "topic", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_ConnectionFactory(), theXMLTypePackage.getString(), "connectionFactory", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_Username(), theXMLTypePackage.getString(), "username", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_Password(), theXMLTypePackage.getString(), "password", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_ClientId(), theXMLTypePackage.getString(), "clientId", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_DurableSubscriptionName(), theXMLTypePackage.getString(), "durableSubscriptionName", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_ConcurrentConsumers(), theXMLTypePackage.getIntObject(), "concurrentConsumers", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_MaxConcurrentConsumers(), theXMLTypePackage.getIntObject(), "maxConcurrentConsumers", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_DisableReplyTo(), theXMLTypePackage.getBooleanObject(), "disableReplyTo", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_PreserveMessageQos(), theXMLTypePackage.getBooleanObject(), "preserveMessageQos", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_DeliveryPersistent(), theXMLTypePackage.getBooleanObject(), "deliveryPersistent", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_Priority(), theXMLTypePackage.getIntObject(), "priority", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_ExplicitQosEnabled(), theXMLTypePackage.getBooleanObject(), "explicitQosEnabled", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_ReplyTo(), theXMLTypePackage.getString(), "replyTo", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_ReplyToType(), theXMLTypePackage.getString(), "replyToType", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_RequestTimeout(), theXMLTypePackage.getIntObject(), "requestTimeout", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_Selector(), theXMLTypePackage.getString(), "selector", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_TimeToLive(), theXMLTypePackage.getIntObject(), "timeToLive", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_Transacted(), theXMLTypePackage.getBooleanObject(), "transacted", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJmsBindingType_TransactionManager(), theXMLTypePackage.getString(), "transactionManager", null, 0, 1, CamelJmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingJms(), this.getCamelJmsBindingType(), null, "bindingJms", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
          (getDocumentRoot_BindingJms(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.jms",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });
    }

} //JmsPackageImpl
