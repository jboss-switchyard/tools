/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.mail.impl;

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

import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.FtpPackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl;
import org.switchyard.tools.models.switchyard1_0.camel.jms.JmsPackage;

import org.switchyard.tools.models.switchyard1_0.camel.jms.impl.JmsPackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage;

import org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.mail.BaseCamelBinding;
import org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailProducerType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.camel.mail.MailConsumerAccountType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.MailFactory;
import org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage;

import org.switchyard.tools.models.switchyard1_0.camel.mail.TimeUnitType;
import org.switchyard.tools.models.switchyard1_0.camel.netty.NettyPackage;

import org.switchyard.tools.models.switchyard1_0.camel.netty.impl.NettyPackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzPackage;

import org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.QuartzPackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.sql.SqlPackage;

import org.switchyard.tools.models.switchyard1_0.camel.sql.impl.SqlPackageImpl;

import org.switchyard.tools.models.switchyard1_0.clojure.ClojurePackage;

import org.switchyard.tools.models.switchyard1_0.clojure.impl.ClojurePackageImpl;

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
public class MailPackageImpl extends EPackageImpl implements MailPackage {
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
    private EClass documentRootEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelMailConsumerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelMailProducerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelMailBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum mailConsumerAccountTypeEEnum = null;

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
    private EDataType mailConsumerAccountTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType timeUnitTypeObjectEDataType = null;

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private MailPackageImpl() {
        super(eNS_URI, MailFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link MailPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static MailPackage init() {
        if (isInited) return (MailPackage)EPackage.Registry.INSTANCE.getEPackage(MailPackage.eNS_URI);

        // Obtain or create and register package
        MailPackageImpl theMailPackage = (MailPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MailPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MailPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        ScaPackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        BeanPackageImpl theBeanPackage = (BeanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI) instanceof BeanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI) : BeanPackage.eINSTANCE);
        BPELPackageImpl theBPELPackage = (BPELPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPELPackage.eNS_URI) instanceof BPELPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPELPackage.eNS_URI) : BPELPackage.eINSTANCE);
        BPMPackageImpl theBPMPackage = (BPMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPMPackage.eNS_URI) instanceof BPMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPMPackage.eNS_URI) : BPMPackage.eINSTANCE);
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
        JmsPackageImpl theJmsPackage = (JmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JmsPackage.eNS_URI) instanceof JmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JmsPackage.eNS_URI) : JmsPackage.eINSTANCE);
        JpaPackageImpl theJpaPackage = (JpaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JpaPackage.eNS_URI) instanceof JpaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JpaPackage.eNS_URI) : JpaPackage.eINSTANCE);
        NettyPackageImpl theNettyPackage = (NettyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NettyPackage.eNS_URI) instanceof NettyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NettyPackage.eNS_URI) : NettyPackage.eINSTANCE);
        QuartzPackageImpl theQuartzPackage = (QuartzPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuartzPackage.eNS_URI) instanceof QuartzPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuartzPackage.eNS_URI) : QuartzPackage.eINSTANCE);
        SqlPackageImpl theSqlPackage = (SqlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SqlPackage.eNS_URI) instanceof SqlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SqlPackage.eNS_URI) : SqlPackage.eINSTANCE);

        // Load packages
        theSpringPackage.loadPackage();

        // Create package meta-data objects
        theMailPackage.createPackageContents();
        theBeanPackage.createPackageContents();
        theBPELPackage.createPackageContents();
        theBPMPackage.createPackageContents();
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
        theJmsPackage.createPackageContents();
        theJpaPackage.createPackageContents();
        theNettyPackage.createPackageContents();
        theQuartzPackage.createPackageContents();
        theSqlPackage.createPackageContents();

        // Initialize created meta-data
        theMailPackage.initializePackageContents();
        theBeanPackage.initializePackageContents();
        theBPELPackage.initializePackageContents();
        theBPMPackage.initializePackageContents();
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
        theJmsPackage.initializePackageContents();
        theJpaPackage.initializePackageContents();
        theNettyPackage.initializePackageContents();
        theQuartzPackage.initializePackageContents();
        theSqlPackage.initializePackageContents();

        // Fix loaded packages
        theSpringPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theMailPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(MailPackage.eNS_URI, theMailPackage);
        return theMailPackage;
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
    public EReference getBaseCamelBinding_CamelContextMapper() {
        return (EReference)baseCamelBindingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBaseCamelBinding_CamelMessageComposer() {
        return (EReference)baseCamelBindingEClass.getEStructuralFeatures().get(1);
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
    public EReference getDocumentRoot_BindingMail() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelMailConsumerType() {
        return camelMailConsumerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailConsumerType_InitialDelay() {
        return (EAttribute)camelMailConsumerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailConsumerType_Delay() {
        return (EAttribute)camelMailConsumerTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailConsumerType_UseFixedDelay() {
        return (EAttribute)camelMailConsumerTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailConsumerType_SendEmptyMessageWhenIdle() {
        return (EAttribute)camelMailConsumerTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailConsumerType_TimeUnit() {
        return (EAttribute)camelMailConsumerTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailConsumerType_MaxMessagesPerPoll() {
        return (EAttribute)camelMailConsumerTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailConsumerType_FolderName() {
        return (EAttribute)camelMailConsumerTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailConsumerType_FetchSize() {
        return (EAttribute)camelMailConsumerTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailConsumerType_Unseen() {
        return (EAttribute)camelMailConsumerTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailConsumerType_Delete() {
        return (EAttribute)camelMailConsumerTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailConsumerType_CopyTo() {
        return (EAttribute)camelMailConsumerTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailConsumerType_Disconnect() {
        return (EAttribute)camelMailConsumerTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailConsumerType_AccountType() {
        return (EAttribute)camelMailConsumerTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelMailProducerType() {
        return camelMailProducerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailProducerType_Subject() {
        return (EAttribute)camelMailProducerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailProducerType_From() {
        return (EAttribute)camelMailProducerTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailProducerType_To() {
        return (EAttribute)camelMailProducerTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailProducerType_CC() {
        return (EAttribute)camelMailProducerTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailProducerType_BCC() {
        return (EAttribute)camelMailProducerTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailProducerType_ReplyTo() {
        return (EAttribute)camelMailProducerTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelMailBindingType() {
        return camelMailBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailBindingType_Host() {
        return (EAttribute)camelMailBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailBindingType_Port() {
        return (EAttribute)camelMailBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailBindingType_Username() {
        return (EAttribute)camelMailBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailBindingType_Password() {
        return (EAttribute)camelMailBindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailBindingType_ConnectionTimeout() {
        return (EAttribute)camelMailBindingTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelMailBindingType_Consume() {
        return (EReference)camelMailBindingTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelMailBindingType_Produce() {
        return (EReference)camelMailBindingTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMailBindingType_Secure() {
        return (EAttribute)camelMailBindingTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getMailConsumerAccountType() {
        return mailConsumerAccountTypeEEnum;
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
    public EDataType getMailConsumerAccountTypeObject() {
        return mailConsumerAccountTypeObjectEDataType;
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
    public MailFactory getMailFactory() {
        return (MailFactory)getEFactoryInstance();
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
        createEReference(baseCamelBindingEClass, BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER);
        createEReference(baseCamelBindingEClass, BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER);

        camelMailBindingTypeEClass = createEClass(CAMEL_MAIL_BINDING_TYPE);
        createEAttribute(camelMailBindingTypeEClass, CAMEL_MAIL_BINDING_TYPE__HOST);
        createEAttribute(camelMailBindingTypeEClass, CAMEL_MAIL_BINDING_TYPE__PORT);
        createEAttribute(camelMailBindingTypeEClass, CAMEL_MAIL_BINDING_TYPE__USERNAME);
        createEAttribute(camelMailBindingTypeEClass, CAMEL_MAIL_BINDING_TYPE__PASSWORD);
        createEAttribute(camelMailBindingTypeEClass, CAMEL_MAIL_BINDING_TYPE__CONNECTION_TIMEOUT);
        createEReference(camelMailBindingTypeEClass, CAMEL_MAIL_BINDING_TYPE__CONSUME);
        createEReference(camelMailBindingTypeEClass, CAMEL_MAIL_BINDING_TYPE__PRODUCE);
        createEAttribute(camelMailBindingTypeEClass, CAMEL_MAIL_BINDING_TYPE__SECURE);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_MAIL);

        camelMailConsumerTypeEClass = createEClass(CAMEL_MAIL_CONSUMER_TYPE);
        createEAttribute(camelMailConsumerTypeEClass, CAMEL_MAIL_CONSUMER_TYPE__INITIAL_DELAY);
        createEAttribute(camelMailConsumerTypeEClass, CAMEL_MAIL_CONSUMER_TYPE__DELAY);
        createEAttribute(camelMailConsumerTypeEClass, CAMEL_MAIL_CONSUMER_TYPE__USE_FIXED_DELAY);
        createEAttribute(camelMailConsumerTypeEClass, CAMEL_MAIL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE);
        createEAttribute(camelMailConsumerTypeEClass, CAMEL_MAIL_CONSUMER_TYPE__TIME_UNIT);
        createEAttribute(camelMailConsumerTypeEClass, CAMEL_MAIL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL);
        createEAttribute(camelMailConsumerTypeEClass, CAMEL_MAIL_CONSUMER_TYPE__FOLDER_NAME);
        createEAttribute(camelMailConsumerTypeEClass, CAMEL_MAIL_CONSUMER_TYPE__FETCH_SIZE);
        createEAttribute(camelMailConsumerTypeEClass, CAMEL_MAIL_CONSUMER_TYPE__UNSEEN);
        createEAttribute(camelMailConsumerTypeEClass, CAMEL_MAIL_CONSUMER_TYPE__DELETE);
        createEAttribute(camelMailConsumerTypeEClass, CAMEL_MAIL_CONSUMER_TYPE__COPY_TO);
        createEAttribute(camelMailConsumerTypeEClass, CAMEL_MAIL_CONSUMER_TYPE__DISCONNECT);
        createEAttribute(camelMailConsumerTypeEClass, CAMEL_MAIL_CONSUMER_TYPE__ACCOUNT_TYPE);

        camelMailProducerTypeEClass = createEClass(CAMEL_MAIL_PRODUCER_TYPE);
        createEAttribute(camelMailProducerTypeEClass, CAMEL_MAIL_PRODUCER_TYPE__SUBJECT);
        createEAttribute(camelMailProducerTypeEClass, CAMEL_MAIL_PRODUCER_TYPE__FROM);
        createEAttribute(camelMailProducerTypeEClass, CAMEL_MAIL_PRODUCER_TYPE__TO);
        createEAttribute(camelMailProducerTypeEClass, CAMEL_MAIL_PRODUCER_TYPE__CC);
        createEAttribute(camelMailProducerTypeEClass, CAMEL_MAIL_PRODUCER_TYPE__BCC);
        createEAttribute(camelMailProducerTypeEClass, CAMEL_MAIL_PRODUCER_TYPE__REPLY_TO);

        // Create enums
        mailConsumerAccountTypeEEnum = createEEnum(MAIL_CONSUMER_ACCOUNT_TYPE);
        timeUnitTypeEEnum = createEEnum(TIME_UNIT_TYPE);

        // Create data types
        mailConsumerAccountTypeObjectEDataType = createEDataType(MAIL_CONSUMER_ACCOUNT_TYPE_OBJECT);
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
        camelMailBindingTypeEClass.getESuperTypes().add(this.getBaseCamelBinding());

        // Initialize classes and features; add operations and parameters
        initEClass(baseCamelBindingEClass, BaseCamelBinding.class, "BaseCamelBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBaseCamelBinding_CamelContextMapper(), theSwitchyardPackage.getContextMapperType(), null, "camelContextMapper", null, 0, 1, BaseCamelBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBaseCamelBinding_CamelMessageComposer(), theSwitchyardPackage.getMessageComposerType(), null, "camelMessageComposer", null, 0, 1, BaseCamelBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelMailBindingTypeEClass, CamelMailBindingType.class, "CamelMailBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelMailBindingType_Host(), theXMLTypePackage.getString(), "host", null, 1, 1, CamelMailBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailBindingType_Port(), theXMLTypePackage.getInt(), "port", null, 0, 1, CamelMailBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailBindingType_Username(), theXMLTypePackage.getString(), "username", null, 0, 1, CamelMailBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailBindingType_Password(), theXMLTypePackage.getString(), "password", null, 0, 1, CamelMailBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailBindingType_ConnectionTimeout(), theXMLTypePackage.getInt(), "connectionTimeout", "30000", 0, 1, CamelMailBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelMailBindingType_Consume(), this.getCamelMailConsumerType(), null, "consume", null, 0, 1, CamelMailBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelMailBindingType_Produce(), this.getCamelMailProducerType(), null, "produce", null, 0, 1, CamelMailBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailBindingType_Secure(), theXMLTypePackage.getBoolean(), "secure", "false", 0, 1, CamelMailBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingMail(), this.getCamelMailBindingType(), null, "bindingMail", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(camelMailConsumerTypeEClass, CamelMailConsumerType.class, "CamelMailConsumerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelMailConsumerType_InitialDelay(), theXMLTypePackage.getInt(), "initialDelay", "1000", 0, 1, CamelMailConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailConsumerType_Delay(), theXMLTypePackage.getInt(), "delay", "60000", 0, 1, CamelMailConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailConsumerType_UseFixedDelay(), theXMLTypePackage.getBoolean(), "useFixedDelay", "false", 0, 1, CamelMailConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailConsumerType_SendEmptyMessageWhenIdle(), theXMLTypePackage.getBoolean(), "sendEmptyMessageWhenIdle", "false", 0, 1, CamelMailConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailConsumerType_TimeUnit(), this.getTimeUnitType(), "timeUnit", "MILLISECONDS", 0, 1, CamelMailConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailConsumerType_MaxMessagesPerPoll(), theXMLTypePackage.getInt(), "maxMessagesPerPoll", "0", 0, 1, CamelMailConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailConsumerType_FolderName(), theXMLTypePackage.getString(), "folderName", null, 0, 1, CamelMailConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailConsumerType_FetchSize(), theXMLTypePackage.getInt(), "fetchSize", "-1", 0, 1, CamelMailConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailConsumerType_Unseen(), theXMLTypePackage.getBoolean(), "unseen", "true", 0, 1, CamelMailConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailConsumerType_Delete(), theXMLTypePackage.getBoolean(), "delete", "false", 0, 1, CamelMailConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailConsumerType_CopyTo(), theXMLTypePackage.getString(), "copyTo", null, 0, 1, CamelMailConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailConsumerType_Disconnect(), theXMLTypePackage.getBoolean(), "disconnect", "false", 0, 1, CamelMailConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailConsumerType_AccountType(), this.getMailConsumerAccountType(), "accountType", "imap", 0, 1, CamelMailConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelMailProducerTypeEClass, CamelMailProducerType.class, "CamelMailProducerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelMailProducerType_Subject(), theXMLTypePackage.getString(), "subject", null, 0, 1, CamelMailProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailProducerType_From(), theXMLTypePackage.getString(), "from", null, 0, 1, CamelMailProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailProducerType_To(), theXMLTypePackage.getString(), "to", null, 0, 1, CamelMailProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailProducerType_CC(), theXMLTypePackage.getString(), "cC", null, 0, 1, CamelMailProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailProducerType_BCC(), theXMLTypePackage.getString(), "bCC", null, 0, 1, CamelMailProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMailProducerType_ReplyTo(), theXMLTypePackage.getString(), "replyTo", null, 0, 1, CamelMailProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(mailConsumerAccountTypeEEnum, MailConsumerAccountType.class, "MailConsumerAccountType");
        addEEnumLiteral(mailConsumerAccountTypeEEnum, MailConsumerAccountType.IMAP);
        addEEnumLiteral(mailConsumerAccountTypeEEnum, MailConsumerAccountType.POP3);

        initEEnum(timeUnitTypeEEnum, TimeUnitType.class, "TimeUnitType");
        addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.NANOSECONDS);
        addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.MICROSECONDS);
        addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.MILLISECONDS);
        addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.SECONDS);
        addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.MINUTES);
        addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.HOURS);
        addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.DAYS);

        // Initialize data types
        initEDataType(mailConsumerAccountTypeObjectEDataType, MailConsumerAccountType.class, "MailConsumerAccountTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
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
          (getBaseCamelBinding_CamelContextMapper(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "contextMapper",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBaseCamelBinding_CamelMessageComposer(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "messageComposer",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelMailBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelMailBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelMailBindingType_Host(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "host",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailBindingType_Port(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "port",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailBindingType_Username(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "username",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailBindingType_Password(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "password",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailBindingType_ConnectionTimeout(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "connectionTimeout",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailBindingType_Consume(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "consume",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailBindingType_Produce(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "produce",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailBindingType_Secure(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "secure"
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
          (getDocumentRoot_BindingMail(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.mail",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (camelMailConsumerTypeEClass, 
           source, 
           new String[] {
             "name", "CamelMailConsumerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelMailConsumerType_InitialDelay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "initialDelay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailConsumerType_Delay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "delay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailConsumerType_UseFixedDelay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "useFixedDelay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailConsumerType_SendEmptyMessageWhenIdle(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sendEmptyMessageWhenIdle",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailConsumerType_TimeUnit(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "timeUnit",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailConsumerType_MaxMessagesPerPoll(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "maxMessagesPerPoll",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailConsumerType_FolderName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "folderName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailConsumerType_FetchSize(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "fetchSize",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailConsumerType_Unseen(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "unseen",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailConsumerType_Delete(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "delete",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailConsumerType_CopyTo(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "copyTo",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailConsumerType_Disconnect(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "disconnect",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailConsumerType_AccountType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "accountType"
           });		
        addAnnotation
          (camelMailProducerTypeEClass, 
           source, 
           new String[] {
             "name", "CamelMailProducerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelMailProducerType_Subject(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "subject",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailProducerType_From(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "from",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailProducerType_To(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "to",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailProducerType_CC(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "CC",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailProducerType_BCC(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "BCC",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMailProducerType_ReplyTo(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "replyTo",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (mailConsumerAccountTypeEEnum, 
           source, 
           new String[] {
             "name", "MailConsumerAccountType"
           });		
        addAnnotation
          (mailConsumerAccountTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "MailConsumerAccountType:Object",
             "baseType", "MailConsumerAccountType"
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

} //MailPackageImpl
