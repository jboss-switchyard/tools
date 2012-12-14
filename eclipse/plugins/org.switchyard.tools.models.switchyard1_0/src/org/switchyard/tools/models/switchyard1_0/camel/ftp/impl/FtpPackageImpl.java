/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp.impl;

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

import org.switchyard.tools.models.switchyard1_0.camel.amqp.AmqpPackage;

import org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.AmqpPackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage;

import org.switchyard.tools.models.switchyard1_0.camel.atom.impl.AtomPackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.core.CamelPackage;

import org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelPackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage;

import org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpFactory;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType;

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
        SpringPackageImpl theSpringPackage = (SpringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI) instanceof SpringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI) : SpringPackage.eINSTANCE);
        JcaPackageImpl theJcaPackage = (JcaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JcaPackage.eNS_URI) instanceof JcaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JcaPackage.eNS_URI) : JcaPackage.eINSTANCE);
        ResteasyPackageImpl theResteasyPackage = (ResteasyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResteasyPackage.eNS_URI) instanceof ResteasyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResteasyPackage.eNS_URI) : ResteasyPackage.eINSTANCE);
        HttpPackageImpl theHttpPackage = (HttpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HttpPackage.eNS_URI) instanceof HttpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HttpPackage.eNS_URI) : HttpPackage.eINSTANCE);
        RemotePackageImpl theRemotePackage = (RemotePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RemotePackage.eNS_URI) instanceof RemotePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RemotePackage.eNS_URI) : RemotePackage.eINSTANCE);
        CamelPackageImpl theCamelPackage = (CamelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) instanceof CamelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) : CamelPackage.eINSTANCE);
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
        theJcaPackage.createPackageContents();
        theResteasyPackage.createPackageContents();
        theHttpPackage.createPackageContents();
        theRemotePackage.createPackageContents();
        theCamelPackage.createPackageContents();
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
        theJcaPackage.initializePackageContents();
        theResteasyPackage.initializePackageContents();
        theHttpPackage.initializePackageContents();
        theRemotePackage.initializePackageContents();
        theCamelPackage.initializePackageContents();
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
    public EReference getCamelFtpBindingType_Consume() {
        return (EReference)camelFtpBindingTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelFtpBindingType_Produce() {
        return (EReference)camelFtpBindingTypeEClass.getEStructuralFeatures().get(5);
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
    public EReference getCamelSftpBindingType_Consume() {
        return (EReference)camelSftpBindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelSftpBindingType_Produce() {
        return (EReference)camelSftpBindingTypeEClass.getEStructuralFeatures().get(4);
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
        camelFtpBindingTypeEClass = createEClass(CAMEL_FTP_BINDING_TYPE);
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
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__KNOWN_HOSTS_FILE);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE);
        createEAttribute(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE);
        createEReference(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__CONSUME);
        createEReference(camelSftpBindingTypeEClass, CAMEL_SFTP_BINDING_TYPE__PRODUCE);

        remoteFileConsumerTypeEClass = createEClass(REMOTE_FILE_CONSUMER_TYPE);

        remoteFileProducerTypeEClass = createEClass(REMOTE_FILE_PRODUCER_TYPE);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_FTP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_FTPS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_SFTP);
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
        CamelPackage theCamelPackage = (CamelPackage)EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI);
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        camelFtpBindingTypeEClass.getESuperTypes().add(theCamelPackage.getCamelRemoteBindingType());
        camelFtpsBindingTypeEClass.getESuperTypes().add(this.getCamelFtpBindingType());
        camelSftpBindingTypeEClass.getESuperTypes().add(theCamelPackage.getCamelRemoteBindingType());
        remoteFileConsumerTypeEClass.getESuperTypes().add(theCamelPackage.getGenericFileConsumerType());
        remoteFileProducerTypeEClass.getESuperTypes().add(theCamelPackage.getGenericFileProducerType());

        // Initialize classes and features; add operations and parameters
        initEClass(camelFtpBindingTypeEClass, CamelFtpBindingType.class, "CamelFtpBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelFtpBindingType_PassiveMode(), theXMLTypePackage.getBooleanObject(), "passiveMode", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_Timeout(), theXMLTypePackage.getIntObject(), "timeout", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_SoTimeout(), theXMLTypePackage.getIntObject(), "soTimeout", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpBindingType_SiteCommand(), theXMLTypePackage.getString(), "siteCommand", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelFtpBindingType_Consume(), this.getRemoteFileConsumerType(), null, "consume", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelFtpBindingType_Produce(), this.getRemoteFileProducerType(), null, "produce", null, 0, 1, CamelFtpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelFtpsBindingTypeEClass, CamelFtpsBindingType.class, "CamelFtpsBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelFtpsBindingType_SecurityProtocol(), theXMLTypePackage.getString(), "securityProtocol", null, 0, 1, CamelFtpsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpsBindingType_IsImplicit(), theXMLTypePackage.getBooleanObject(), "isImplicit", null, 0, 1, CamelFtpsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpsBindingType_ExecPbsz(), theXMLTypePackage.getLongObject(), "execPbsz", null, 0, 1, CamelFtpsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpsBindingType_ExecProt(), theXMLTypePackage.getString(), "execProt", null, 0, 1, CamelFtpsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFtpsBindingType_DisableSecureDataChannelDefaults(), theXMLTypePackage.getBooleanObject(), "disableSecureDataChannelDefaults", null, 0, 1, CamelFtpsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelSftpBindingTypeEClass, CamelSftpBindingType.class, "CamelSftpBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelSftpBindingType_KnownHostsFile(), theXMLTypePackage.getString(), "knownHostsFile", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_PrivateKeyFile(), theXMLTypePackage.getString(), "privateKeyFile", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSftpBindingType_PrivateKeyFilePassphrase(), theXMLTypePackage.getString(), "privateKeyFilePassphrase", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelSftpBindingType_Consume(), this.getRemoteFileConsumerType(), null, "consume", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelSftpBindingType_Produce(), this.getRemoteFileProducerType(), null, "produce", null, 0, 1, CamelSftpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(remoteFileConsumerTypeEClass, RemoteFileConsumerType.class, "RemoteFileConsumerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(remoteFileProducerTypeEClass, RemoteFileProducerType.class, "RemoteFileProducerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingFtp(), this.getCamelFtpBindingType(), null, "bindingFtp", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingFtps(), this.getCamelFtpsBindingType(), null, "bindingFtps", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingSftp(), this.getCamelSftpBindingType(), null, "bindingSftp", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
          (remoteFileConsumerTypeEClass, 
           source, 
           new String[] {
             "name", "RemoteFileConsumerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (remoteFileProducerTypeEClass, 
           source, 
           new String[] {
             "name", "RemoteFileProducerType",
             "kind", "elementOnly"
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
    }

} //FtpPackageImpl
