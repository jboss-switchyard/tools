/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp.impl;

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
import org.switchyard.tools.models.switchyard1_0.camel.amqp.AmqpPackage;

import org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.AmqpPackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage;

import org.switchyard.tools.models.switchyard1_0.camel.atom.impl.AtomPackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage;
import org.switchyard.tools.models.switchyard1_0.camel.core.impl.CorePackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage;

import org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.BaseCamelBinding;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpFactory;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.TimeUnitType;
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
public class FtpPackageImpl extends EPackageImpl implements FtpPackage {
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
    private EClass camelSftpBindingTypeEClass = null;

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
    private EEnum timeUnitTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType timeUnitTypeObjectEDataType = null;

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private FtpPackageImpl() {
        super(eNS_URI, FtpFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link FtpPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static FtpPackage init() {
        if (isInited) return (FtpPackage)EPackage.Registry.INSTANCE.getEPackage(FtpPackage.eNS_URI);

        // Obtain or create and register package
        FtpPackageImpl theFtpPackage = (FtpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FtpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FtpPackageImpl());

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
        JmsPackageImpl theJmsPackage = (JmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JmsPackage.eNS_URI) instanceof JmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JmsPackage.eNS_URI) : JmsPackage.eINSTANCE);
        JpaPackageImpl theJpaPackage = (JpaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JpaPackage.eNS_URI) instanceof JpaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JpaPackage.eNS_URI) : JpaPackage.eINSTANCE);
        MailPackageImpl theMailPackage = (MailPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MailPackage.eNS_URI) instanceof MailPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MailPackage.eNS_URI) : MailPackage.eINSTANCE);
        NettyPackageImpl theNettyPackage = (NettyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NettyPackage.eNS_URI) instanceof NettyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NettyPackage.eNS_URI) : NettyPackage.eINSTANCE);
        QuartzPackageImpl theQuartzPackage = (QuartzPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuartzPackage.eNS_URI) instanceof QuartzPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuartzPackage.eNS_URI) : QuartzPackage.eINSTANCE);
        SqlPackageImpl theSqlPackage = (SqlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SqlPackage.eNS_URI) instanceof SqlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SqlPackage.eNS_URI) : SqlPackage.eINSTANCE);

        // Load packages
        theSpringPackage.loadPackage();

        // Create package meta-data objects
        theFtpPackage.createPackageContents();
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
        theJmsPackage.createPackageContents();
        theJpaPackage.createPackageContents();
        theMailPackage.createPackageContents();
        theNettyPackage.createPackageContents();
        theQuartzPackage.createPackageContents();
        theSqlPackage.createPackageContents();

        // Initialize created meta-data
        theFtpPackage.initializePackageContents();
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
        theJmsPackage.initializePackageContents();
        theJpaPackage.initializePackageContents();
        theMailPackage.initializePackageContents();
        theNettyPackage.initializePackageContents();
        theQuartzPackage.initializePackageContents();
        theSqlPackage.initializePackageContents();

        // Fix loaded packages
        theSpringPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theFtpPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(FtpPackage.eNS_URI, theFtpPackage);
        return theFtpPackage;
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
    public EClass getCamelFtpBindingType() {
        return camelFtpBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_Directory() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_AutoCreate() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_BufferSize() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_FileName() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_Flatten() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_Charset() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_Host() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_Port() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_Username() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_Password() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_Binary() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_ConnectTimeout() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_Disconnect() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_MaximumReconnectAttempts() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_ReconnectDelay() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_Separator() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_Stepwise() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_ThrowExceptionOnConnectFailed() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_PassiveMode() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_Timeout() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_SoTimeout() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFtpBindingType_SiteCommand() {
        return (EAttribute)camelFtpBindingTypeEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelFtpBindingType_Consume() {
        return (EReference)camelFtpBindingTypeEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelFtpBindingType_Produce() {
        return (EReference)camelFtpBindingTypeEClass.getEStructuralFeatures().get(23);
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
    public EClass getCamelSftpBindingType() {
        return camelSftpBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_Directory() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_AutoCreate() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_BufferSize() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_FileName() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_Flatten() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_Charset() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_Host() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_Port() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_Username() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_Password() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_Binary() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_ConnectTimeout() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_Disconnect() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_MaximumReconnectAttempts() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_ReconnectDelay() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_Separator() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_Stepwise() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_ThrowExceptionOnConnectFailed() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_KnownHostsFile() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_PrivateKeyFile() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSftpBindingType_PrivateKeyFilePassphrase() {
        return (EAttribute)camelSftpBindingTypeEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelSftpBindingType_Consume() {
        return (EReference)camelSftpBindingTypeEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelSftpBindingType_Produce() {
        return (EReference)camelSftpBindingTypeEClass.getEStructuralFeatures().get(22);
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
    public EAttribute getRemoteFileConsumerType_Delete() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_Recursive() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_Noop() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_PreMove() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_Move() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_MoveFailed() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_Include() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_Exclude() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_Idempotent() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_IdempotentRepository() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_InProgressRepository() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_Filter() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_Sorter() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_SortBy() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_ReadLock() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_ReadLockTimeout() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_ReadLockCheckInterval() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_ExclusiveReadLockStrategy() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_ProcessStrategy() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_StartingDirectoryMustExist() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_DirectoryMustExist() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_DoneFileName() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_MaxMessagesPerPoll() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_InitialDelay() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_Delay() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_UseFixedDelay() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_SendEmptyMessageWhenIdle() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileConsumerType_TimeUnit() {
        return (EAttribute)remoteFileConsumerTypeEClass.getEStructuralFeatures().get(27);
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
    public EAttribute getRemoteFileProducerType_FileExist() {
        return (EAttribute)remoteFileProducerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileProducerType_TempPrefix() {
        return (EAttribute)remoteFileProducerTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileProducerType_TempFileName() {
        return (EAttribute)remoteFileProducerTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileProducerType_KeepLastModified() {
        return (EAttribute)remoteFileProducerTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileProducerType_EagerDeleteTargetFile() {
        return (EAttribute)remoteFileProducerTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteFileProducerType_DoneFileName() {
        return (EAttribute)remoteFileProducerTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTimeUnitType() {
        return timeUnitTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTimeUnitTypeObject() {
        return timeUnitTypeObjectEDataType;
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
    public EReference getDocumentRoot_BindingFtp() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BindingFtps() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BindingSftp() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FtpFactory getFtpFactory() {
        return (FtpFactory)getEFactoryInstance();
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

        camelFtpBindingTypeEClass = createEClass(CAMEL_FTP_BINDING_TYPE);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__DIRECTORY);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__AUTO_CREATE);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__BUFFER_SIZE);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__FILE_NAME);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__FLATTEN);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__CHARSET);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__HOST);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__PORT);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__USERNAME);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__PASSWORD);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__BINARY);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__CONNECT_TIMEOUT);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__DISCONNECT);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__RECONNECT_DELAY);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__SEPARATOR);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__STEPWISE);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__TIMEOUT);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT);
        createEAttribute(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__SITE_COMMAND);
        createEReference(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__CONSUME);
        createEReference(camelFtpBindingTypeEClass, CAMEL_FTP_BINDING_TYPE__PRODUCE);

        camelFtpsBindingTypeEClass = createEClass(CAMEL_FTPS_BINDING_TYPE);
        createEAttribute(camelFtpsBindingTypeEClass, CAMEL_FTPS_BINDING_TYPE__SECURITY_PROTOCOL);
        createEAttribute(camelFtpsBindingTypeEClass, CAMEL_FTPS_BINDING_TYPE__IS_IMPLICIT);
        createEAttribute(camelFtpsBindingTypeEClass, CAMEL_FTPS_BINDING_TYPE__EXEC_PBSZ);
        createEAttribute(camelFtpsBindingTypeEClass, CAMEL_FTPS_BINDING_TYPE__EXEC_PROT);
        createEAttribute(camelFtpsBindingTypeEClass, CAMEL_FTPS_BINDING_TYPE__DISABLE_SECURE_DATA_CHANNEL_DEFAULTS);

        camelSftpBindingTypeEClass = createEClass(CAMEL_SFTP_BINDING_TYPE);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__DIRECTORY);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__AUTO_CREATE);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__BUFFER_SIZE);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__FILE_NAME);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__FLATTEN);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__CHARSET);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__HOST);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__PORT);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__USERNAME);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__PASSWORD);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__BINARY);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__CONNECT_TIMEOUT);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__DISCONNECT);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__RECONNECT_DELAY);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__SEPARATOR);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__STEPWISE);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__KNOWN_HOSTS_FILE);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE);
        createEReference(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__CONSUME);
        createEReference(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__PRODUCE);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_FTP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_FTPS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_SFTP);

        remoteFileConsumerTypeEClass = createEClass(REMOTE_FILE_CONSUMER_TYPE);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__DELETE);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__RECURSIVE);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__NOOP);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__PRE_MOVE);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__MOVE);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__MOVE_FAILED);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__INCLUDE);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__EXCLUDE);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__FILTER);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__SORTER);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__SORT_BY);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__READ_LOCK);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__PROCESS_STRATEGY);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__DONE_FILE_NAME);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__INITIAL_DELAY);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__DELAY);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__USE_FIXED_DELAY);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE);
        createEAttribute(remoteFileConsumerTypeEClass, REMOTE_FILE_CONSUMER_TYPE__TIME_UNIT);

        remoteFileProducerTypeEClass = createEClass(REMOTE_FILE_PRODUCER_TYPE);
        createEAttribute(remoteFileProducerTypeEClass, REMOTE_FILE_PRODUCER_TYPE__FILE_EXIST);
        createEAttribute(remoteFileProducerTypeEClass, REMOTE_FILE_PRODUCER_TYPE__TEMP_PREFIX);
        createEAttribute(remoteFileProducerTypeEClass, REMOTE_FILE_PRODUCER_TYPE__TEMP_FILE_NAME);
        createEAttribute(remoteFileProducerTypeEClass, REMOTE_FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED);
        createEAttribute(remoteFileProducerTypeEClass, REMOTE_FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE);
        createEAttribute(remoteFileProducerTypeEClass, REMOTE_FILE_PRODUCER_TYPE__DONE_FILE_NAME);

        // Create enums
        timeUnitTypeEEnum = createEEnum(TIME_UNIT_TYPE);

        // Create data types
        timeUnitTypeObjectEDataType = createEDataType(TIME_UNIT_TYPE_OBJECT);
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
        camelFtpBindingTypeEClass.getESuperTypes().add(this.getBaseCamelBinding());
        camelFtpsBindingTypeEClass.getESuperTypes().add(this.getCamelFtpBindingType());
        camelSftpBindingTypeEClass.getESuperTypes().add(this.getBaseCamelBinding());

        // Initialize classes and features; add operations and parameters
        initEClass(baseCamelBindingEClass, BaseCamelBinding.class, "BaseCamelBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(camelFtpBindingTypeEClass, CamelFtpBindingType.class, "CamelFtpBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelFtpBindingType_Directory(), theXMLTypePackage.getString(), "directory", null, 1, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_AutoCreate(), theXMLTypePackage.getBooleanObject(), "autoCreate", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_BufferSize(), theXMLTypePackage.getIntObject(), "bufferSize", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_FileName(), theXMLTypePackage.getString(), "fileName", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_Flatten(), theXMLTypePackage.getBooleanObject(), "flatten", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_Charset(), theXMLTypePackage.getString(), "charset", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_Host(), theXMLTypePackage.getString(), "host", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_Port(), theXMLTypePackage.getIntObject(), "port", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_Username(), theXMLTypePackage.getString(), "username", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_Password(), theXMLTypePackage.getString(), "password", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_Binary(), theXMLTypePackage.getBooleanObject(), "binary", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_ConnectTimeout(), theXMLTypePackage.getIntObject(), "connectTimeout", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_Disconnect(), theXMLTypePackage.getBooleanObject(), "disconnect", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_MaximumReconnectAttempts(), theXMLTypePackage.getIntObject(), "maximumReconnectAttempts", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_ReconnectDelay(), theXMLTypePackage.getIntObject(), "reconnectDelay", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_Separator(), theXMLTypePackage.getString(), "separator", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_Stepwise(), theXMLTypePackage.getBooleanObject(), "stepwise", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_ThrowExceptionOnConnectFailed(), theXMLTypePackage.getBooleanObject(), "throwExceptionOnConnectFailed", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_PassiveMode(), theXMLTypePackage.getBooleanObject(), "passiveMode", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_Timeout(), theXMLTypePackage.getIntObject(), "timeout", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_SoTimeout(), theXMLTypePackage.getIntObject(), "soTimeout", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_SiteCommand(), theXMLTypePackage.getString(), "siteCommand", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelFtpBindingType_Consume(), this.getRemoteFileConsumerType(), null, "consume", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelFtpBindingType_Produce(), this.getRemoteFileProducerType(), null, "produce", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelFtpsBindingTypeEClass, CamelFtpsBindingType.class, "CamelFtpsBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelFtpsBindingType_SecurityProtocol(), theXMLTypePackage.getString(), "securityProtocol", null, 0, 1, CamelFtpsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpsBindingType_IsImplicit(), theXMLTypePackage.getBooleanObject(), "isImplicit", null, 0, 1, CamelFtpsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpsBindingType_ExecPbsz(), theXMLTypePackage.getLongObject(), "execPbsz", null, 0, 1, CamelFtpsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpsBindingType_ExecProt(), theXMLTypePackage.getString(), "execProt", null, 0, 1, CamelFtpsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpsBindingType_DisableSecureDataChannelDefaults(), theXMLTypePackage.getBooleanObject(), "disableSecureDataChannelDefaults", null, 0, 1, CamelFtpsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelSftpBindingTypeEClass, CamelSftpBindingType.class, "CamelSftpBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelSftpBindingType_Directory(), theXMLTypePackage.getString(), "directory", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_AutoCreate(), theXMLTypePackage.getBooleanObject(), "autoCreate", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_BufferSize(), theXMLTypePackage.getIntObject(), "bufferSize", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_FileName(), theXMLTypePackage.getString(), "fileName", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_Flatten(), theXMLTypePackage.getBooleanObject(), "flatten", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_Charset(), theXMLTypePackage.getString(), "charset", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_Host(), theXMLTypePackage.getString(), "host", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_Port(), theXMLTypePackage.getIntObject(), "port", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_Username(), theXMLTypePackage.getString(), "username", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_Password(), theXMLTypePackage.getString(), "password", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_Binary(), theXMLTypePackage.getBooleanObject(), "binary", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_ConnectTimeout(), theXMLTypePackage.getIntObject(), "connectTimeout", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_Disconnect(), theXMLTypePackage.getBooleanObject(), "disconnect", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_MaximumReconnectAttempts(), theXMLTypePackage.getIntObject(), "maximumReconnectAttempts", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_ReconnectDelay(), theXMLTypePackage.getIntObject(), "reconnectDelay", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_Separator(), theXMLTypePackage.getString(), "separator", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_Stepwise(), theXMLTypePackage.getBooleanObject(), "stepwise", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_ThrowExceptionOnConnectFailed(), theXMLTypePackage.getBooleanObject(), "throwExceptionOnConnectFailed", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_KnownHostsFile(), theXMLTypePackage.getString(), "knownHostsFile", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_PrivateKeyFile(), theXMLTypePackage.getString(), "privateKeyFile", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_PrivateKeyFilePassphrase(), theXMLTypePackage.getString(), "privateKeyFilePassphrase", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelSftpBindingType_Consume(), this.getRemoteFileConsumerType(), null, "consume", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelSftpBindingType_Produce(), this.getRemoteFileProducerType(), null, "produce", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingFtp(), this.getCamelFtpBindingType(), null, "bindingFtp", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingFtps(), this.getCamelFtpsBindingType(), null, "bindingFtps", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingSftp(), this.getCamelSftpBindingType(), null, "bindingSftp", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(remoteFileConsumerTypeEClass, RemoteFileConsumerType.class, "RemoteFileConsumerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRemoteFileConsumerType_Delete(), theXMLTypePackage.getBooleanObject(), "delete", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_Recursive(), theXMLTypePackage.getBooleanObject(), "recursive", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_Noop(), theXMLTypePackage.getBooleanObject(), "noop", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_PreMove(), theXMLTypePackage.getString(), "preMove", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_Move(), theXMLTypePackage.getString(), "move", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_MoveFailed(), theXMLTypePackage.getString(), "moveFailed", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_Include(), theXMLTypePackage.getString(), "include", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_Exclude(), theXMLTypePackage.getString(), "exclude", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_Idempotent(), theXMLTypePackage.getBooleanObject(), "idempotent", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_IdempotentRepository(), theXMLTypePackage.getString(), "idempotentRepository", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_InProgressRepository(), theXMLTypePackage.getString(), "inProgressRepository", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_Filter(), theXMLTypePackage.getString(), "filter", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_Sorter(), theXMLTypePackage.getString(), "sorter", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_SortBy(), theXMLTypePackage.getString(), "sortBy", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_ReadLock(), theXMLTypePackage.getString(), "readLock", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_ReadLockTimeout(), theXMLTypePackage.getLongObject(), "readLockTimeout", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_ReadLockCheckInterval(), theXMLTypePackage.getIntObject(), "readLockCheckInterval", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_ExclusiveReadLockStrategy(), theXMLTypePackage.getString(), "exclusiveReadLockStrategy", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_ProcessStrategy(), theXMLTypePackage.getString(), "processStrategy", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_StartingDirectoryMustExist(), theXMLTypePackage.getBooleanObject(), "startingDirectoryMustExist", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_DirectoryMustExist(), theXMLTypePackage.getBooleanObject(), "directoryMustExist", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_DoneFileName(), theXMLTypePackage.getString(), "doneFileName", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_MaxMessagesPerPoll(), theXMLTypePackage.getIntObject(), "maxMessagesPerPoll", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_InitialDelay(), theXMLTypePackage.getIntObject(), "initialDelay", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_Delay(), theXMLTypePackage.getIntObject(), "delay", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_UseFixedDelay(), theXMLTypePackage.getBooleanObject(), "useFixedDelay", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_SendEmptyMessageWhenIdle(), theXMLTypePackage.getBooleanObject(), "sendEmptyMessageWhenIdle", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileConsumerType_TimeUnit(), this.getTimeUnitType(), "timeUnit", null, 0, 1, RemoteFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(remoteFileProducerTypeEClass, RemoteFileProducerType.class, "RemoteFileProducerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRemoteFileProducerType_FileExist(), theXMLTypePackage.getString(), "fileExist", null, 0, 1, RemoteFileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileProducerType_TempPrefix(), theXMLTypePackage.getString(), "tempPrefix", null, 0, 1, RemoteFileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileProducerType_TempFileName(), theXMLTypePackage.getString(), "tempFileName", null, 0, 1, RemoteFileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileProducerType_KeepLastModified(), theXMLTypePackage.getBooleanObject(), "keepLastModified", null, 0, 1, RemoteFileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileProducerType_EagerDeleteTargetFile(), theXMLTypePackage.getBooleanObject(), "eagerDeleteTargetFile", null, 0, 1, RemoteFileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteFileProducerType_DoneFileName(), theXMLTypePackage.getString(), "doneFileName", null, 0, 1, RemoteFileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(timeUnitTypeEEnum, TimeUnitType.class, "TimeUnitType");
        addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.NANOSECONDS);
        addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.MICROSECONDS);
        addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.MILLISECONDS);
        addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.SECONDS);
        addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.MINUTES);
        addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.HOURS);
        addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.DAYS);

        // Initialize data types
        initEDataType(timeUnitTypeObjectEDataType, TimeUnitType.class, "TimeUnitTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
          (camelFtpBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelFtpBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelFtpBindingType_Directory(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "directory",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_AutoCreate(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "autoCreate",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_BufferSize(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "bufferSize",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_FileName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "fileName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_Flatten(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "flatten",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_Charset(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "charset",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_Host(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "host",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_Port(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "port",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_Username(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "username",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_Password(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "password",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_Binary(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binary",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_ConnectTimeout(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "connectTimeout",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_Disconnect(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "disconnect",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_MaximumReconnectAttempts(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "maximumReconnectAttempts",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_ReconnectDelay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "reconnectDelay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_Separator(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "separator",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_Stepwise(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "stepwise",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_ThrowExceptionOnConnectFailed(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "throwExceptionOnConnectFailed",
             "namespace", "##targetNamespace"
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
          (getCamelFtpBindingType_Consume(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "consume",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFtpBindingType_Produce(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "produce",
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
          (camelSftpBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelSftpBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelSftpBindingType_Directory(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "directory",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSftpBindingType_AutoCreate(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "autoCreate",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSftpBindingType_BufferSize(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "bufferSize",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSftpBindingType_FileName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "fileName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSftpBindingType_Flatten(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "flatten",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSftpBindingType_Charset(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "charset",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSftpBindingType_Host(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "host",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSftpBindingType_Port(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "port",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSftpBindingType_Username(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "username",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSftpBindingType_Password(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "password",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSftpBindingType_Binary(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binary",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSftpBindingType_ConnectTimeout(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "connectTimeout",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSftpBindingType_Disconnect(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "disconnect",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSftpBindingType_MaximumReconnectAttempts(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "maximumReconnectAttempts",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSftpBindingType_ReconnectDelay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "reconnectDelay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSftpBindingType_Separator(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "separator",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSftpBindingType_Stepwise(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "stepwise",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSftpBindingType_ThrowExceptionOnConnectFailed(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "throwExceptionOnConnectFailed",
             "namespace", "##targetNamespace"
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
          (getCamelSftpBindingType_Consume(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "consume",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSftpBindingType_Produce(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "produce",
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
          (getDocumentRoot_BindingSftp(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.sftp",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (remoteFileConsumerTypeEClass, 
           source, 
           new String[] {
             "name", "RemoteFileConsumerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getRemoteFileConsumerType_Delete(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "delete",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_Recursive(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "recursive",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_Noop(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "noop",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_PreMove(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "preMove",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_Move(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "move",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_MoveFailed(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "moveFailed",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_Include(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "include",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_Exclude(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "exclude",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_Idempotent(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idempotent",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_IdempotentRepository(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idempotentRepository",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_InProgressRepository(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "inProgressRepository",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_Filter(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "filter",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_Sorter(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sorter",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_SortBy(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sortBy",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_ReadLock(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "readLock",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_ReadLockTimeout(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "readLockTimeout",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_ReadLockCheckInterval(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "readLockCheckInterval",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_ExclusiveReadLockStrategy(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "exclusiveReadLockStrategy",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_ProcessStrategy(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "processStrategy",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_StartingDirectoryMustExist(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "startingDirectoryMustExist",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_DirectoryMustExist(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "directoryMustExist",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_DoneFileName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doneFileName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_MaxMessagesPerPoll(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "maxMessagesPerPoll",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_InitialDelay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "initialDelay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_Delay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "delay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_UseFixedDelay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "useFixedDelay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_SendEmptyMessageWhenIdle(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sendEmptyMessageWhenIdle",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileConsumerType_TimeUnit(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "timeUnit",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (remoteFileProducerTypeEClass, 
           source, 
           new String[] {
             "name", "RemoteFileProducerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getRemoteFileProducerType_FileExist(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "fileExist",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileProducerType_TempPrefix(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "tempPrefix",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileProducerType_TempFileName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "tempFileName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileProducerType_KeepLastModified(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "keepLastModified",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileProducerType_EagerDeleteTargetFile(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "eagerDeleteTargetFile",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteFileProducerType_DoneFileName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doneFileName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (timeUnitTypeEEnum, 
           source, 
           new String[] {
             "name", "timeUnit_._type"
           });		
        addAnnotation
          (timeUnitTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "timeUnit_._type:Object",
             "baseType", "timeUnit_._type"
           });
    }

} //FtpPackageImpl
