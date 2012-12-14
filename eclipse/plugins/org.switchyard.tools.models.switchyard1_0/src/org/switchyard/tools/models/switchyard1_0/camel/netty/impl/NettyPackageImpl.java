/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.netty.impl;

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

import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.jms.JmsPackage;

import org.switchyard.tools.models.switchyard1_0.camel.jms.impl.JmsPackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage;

import org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage;

import org.switchyard.tools.models.switchyard1_0.camel.mail.impl.MailPackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyUdpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.netty.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.camel.netty.NettyFactory;
import org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage;

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
public class NettyPackageImpl extends EPackageImpl implements NettyPackage {
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
    private EClass camelNettyUdpBindingTypeEClass = null;

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private NettyPackageImpl() {
        super(eNS_URI, NettyFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link NettyPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static NettyPackage init() {
        if (isInited) return (NettyPackage)EPackage.Registry.INSTANCE.getEPackage(NettyPackage.eNS_URI);

        // Obtain or create and register package
        NettyPackageImpl theNettyPackage = (NettyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NettyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NettyPackageImpl());

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
        FtpPackageImpl theFtpPackage = (FtpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FtpPackage.eNS_URI) instanceof FtpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FtpPackage.eNS_URI) : FtpPackage.eINSTANCE);
        JmsPackageImpl theJmsPackage = (JmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JmsPackage.eNS_URI) instanceof JmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JmsPackage.eNS_URI) : JmsPackage.eINSTANCE);
        JpaPackageImpl theJpaPackage = (JpaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JpaPackage.eNS_URI) instanceof JpaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JpaPackage.eNS_URI) : JpaPackage.eINSTANCE);
        MailPackageImpl theMailPackage = (MailPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MailPackage.eNS_URI) instanceof MailPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MailPackage.eNS_URI) : MailPackage.eINSTANCE);
        QuartzPackageImpl theQuartzPackage = (QuartzPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuartzPackage.eNS_URI) instanceof QuartzPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuartzPackage.eNS_URI) : QuartzPackage.eINSTANCE);
        SqlPackageImpl theSqlPackage = (SqlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SqlPackage.eNS_URI) instanceof SqlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SqlPackage.eNS_URI) : SqlPackage.eINSTANCE);

        // Load packages
        theSpringPackage.loadPackage();

        // Create package meta-data objects
        theNettyPackage.createPackageContents();
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
        theFtpPackage.createPackageContents();
        theJmsPackage.createPackageContents();
        theJpaPackage.createPackageContents();
        theMailPackage.createPackageContents();
        theQuartzPackage.createPackageContents();
        theSqlPackage.createPackageContents();

        // Initialize created meta-data
        theNettyPackage.initializePackageContents();
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
        theFtpPackage.initializePackageContents();
        theJmsPackage.initializePackageContents();
        theJpaPackage.initializePackageContents();
        theMailPackage.initializePackageContents();
        theQuartzPackage.initializePackageContents();
        theSqlPackage.initializePackageContents();

        // Fix loaded packages
        theSpringPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theNettyPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(NettyPackage.eNS_URI, theNettyPackage);
        return theNettyPackage;
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
    public EReference getDocumentRoot_BindingNettyUDP() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BindingNettyTCP() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NettyFactory getNettyFactory() {
        return (NettyFactory)getEFactoryInstance();
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
        camelNettyTcpBindingTypeEClass = createEClass(CAMEL_NETTY_TCP_BINDING_TYPE);
        createEAttribute(camelNettyTcpBindingTypeEClass, CAMEL_NETTY_TCP_BINDING_TYPE__TEXTLINE);
        createEAttribute(camelNettyTcpBindingTypeEClass, CAMEL_NETTY_TCP_BINDING_TYPE__TCP_NO_DELAY);
        createEAttribute(camelNettyTcpBindingTypeEClass, CAMEL_NETTY_TCP_BINDING_TYPE__KEEP_ALIVE);

        camelNettyUdpBindingTypeEClass = createEClass(CAMEL_NETTY_UDP_BINDING_TYPE);
        createEAttribute(camelNettyUdpBindingTypeEClass, CAMEL_NETTY_UDP_BINDING_TYPE__BROADCAST);

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

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_NETTY_UDP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_NETTY_TCP);
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
        CamelPackage theCamelPackage = (CamelPackage)EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        camelNettyTcpBindingTypeEClass.getESuperTypes().add(this.getCamelNettyBindingType());
        camelNettyUdpBindingTypeEClass.getESuperTypes().add(this.getCamelNettyBindingType());
        camelNettyBindingTypeEClass.getESuperTypes().add(theCamelPackage.getBaseCamelBinding());

        // Initialize classes and features; add operations and parameters
        initEClass(camelNettyTcpBindingTypeEClass, CamelNettyTcpBindingType.class, "CamelNettyTcpBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelNettyTcpBindingType_Textline(), theXMLTypePackage.getBooleanObject(), "textline", null, 0, 1, CamelNettyTcpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyTcpBindingType_TcpNoDelay(), theXMLTypePackage.getBooleanObject(), "tcpNoDelay", null, 0, 1, CamelNettyTcpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyTcpBindingType_KeepAlive(), theXMLTypePackage.getBooleanObject(), "keepAlive", null, 0, 1, CamelNettyTcpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelNettyUdpBindingTypeEClass, CamelNettyUdpBindingType.class, "CamelNettyUdpBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelNettyUdpBindingType_Broadcast(), theXMLTypePackage.getBooleanObject(), "broadcast", null, 0, 1, CamelNettyUdpBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelNettyBindingTypeEClass, CamelNettyBindingType.class, "CamelNettyBindingType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelNettyBindingType_Host(), theXMLTypePackage.getString(), "host", null, 1, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyBindingType_Port(), theXMLTypePackage.getInt(), "port", null, 1, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyBindingType_ReceiveBufferSize(), theXMLTypePackage.getLongObject(), "receiveBufferSize", null, 0, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyBindingType_SendBufferSize(), theXMLTypePackage.getLongObject(), "sendBufferSize", null, 0, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyBindingType_ReuseAddress(), theXMLTypePackage.getBooleanObject(), "reuseAddress", null, 0, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyBindingType_Encoders(), theXMLTypePackage.getString(), "encoders", null, 0, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyBindingType_Decoders(), theXMLTypePackage.getString(), "decoders", null, 0, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyBindingType_AllowDefaultCodec(), theXMLTypePackage.getBooleanObject(), "allowDefaultCodec", null, 0, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyBindingType_WorkerCount(), theXMLTypePackage.getIntObject(), "workerCount", null, 0, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyBindingType_Sync(), theXMLTypePackage.getBoolean(), "sync", null, 0, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelNettyBindingType_Disconnect(), theXMLTypePackage.getBooleanObject(), "disconnect", null, 0, 1, CamelNettyBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingNettyUDP(), this.getCamelNettyUdpBindingType(), null, "bindingNettyUDP", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingNettyTCP(), this.getCamelNettyTcpBindingType(), null, "bindingNettyTCP", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
    }

} //NettyPackageImpl
