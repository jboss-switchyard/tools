/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.jpa.impl;

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

import org.switchyard.tools.models.switchyard1_0.camel.jpa.BaseCamelBinding;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJPABindingType;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaFactory;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType;

import org.switchyard.tools.models.switchyard1_0.camel.jpa.TimeUnitType;
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

import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage;

import org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl;

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
public class JpaPackageImpl extends EPackageImpl implements JpaPackage {
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
    private EClass jpaProducerTypeEClass = null;

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
    private EClass jpaConsumerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelJPABindingTypeEClass = null;

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private JpaPackageImpl() {
        super(eNS_URI, JpaFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link JpaPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static JpaPackage init() {
        if (isInited) return (JpaPackage)EPackage.Registry.INSTANCE.getEPackage(JpaPackage.eNS_URI);

        // Obtain or create and register package
        JpaPackageImpl theJpaPackage = (JpaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JpaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JpaPackageImpl());

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
        CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
        AmqpPackageImpl theAmqpPackage = (AmqpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AmqpPackage.eNS_URI) instanceof AmqpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AmqpPackage.eNS_URI) : AmqpPackage.eINSTANCE);
        AtomPackageImpl theAtomPackage = (AtomPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AtomPackage.eNS_URI) instanceof AtomPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AtomPackage.eNS_URI) : AtomPackage.eINSTANCE);
        FilePackageImpl theFilePackage = (FilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI) instanceof FilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI) : FilePackage.eINSTANCE);
        FtpPackageImpl theFtpPackage = (FtpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FtpPackage.eNS_URI) instanceof FtpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FtpPackage.eNS_URI) : FtpPackage.eINSTANCE);
        JmsPackageImpl theJmsPackage = (JmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JmsPackage.eNS_URI) instanceof JmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JmsPackage.eNS_URI) : JmsPackage.eINSTANCE);
        MailPackageImpl theMailPackage = (MailPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MailPackage.eNS_URI) instanceof MailPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MailPackage.eNS_URI) : MailPackage.eINSTANCE);
        NettyPackageImpl theNettyPackage = (NettyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NettyPackage.eNS_URI) instanceof NettyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NettyPackage.eNS_URI) : NettyPackage.eINSTANCE);
        QuartzPackageImpl theQuartzPackage = (QuartzPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuartzPackage.eNS_URI) instanceof QuartzPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuartzPackage.eNS_URI) : QuartzPackage.eINSTANCE);
        SqlPackageImpl theSqlPackage = (SqlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SqlPackage.eNS_URI) instanceof SqlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SqlPackage.eNS_URI) : SqlPackage.eINSTANCE);

        // Load packages
        theSpringPackage.loadPackage();

        // Create package meta-data objects
        theJpaPackage.createPackageContents();
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
        theCorePackage.createPackageContents();
        theAmqpPackage.createPackageContents();
        theAtomPackage.createPackageContents();
        theFilePackage.createPackageContents();
        theFtpPackage.createPackageContents();
        theJmsPackage.createPackageContents();
        theMailPackage.createPackageContents();
        theNettyPackage.createPackageContents();
        theQuartzPackage.createPackageContents();
        theSqlPackage.createPackageContents();

        // Initialize created meta-data
        theJpaPackage.initializePackageContents();
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
        theCorePackage.initializePackageContents();
        theAmqpPackage.initializePackageContents();
        theAtomPackage.initializePackageContents();
        theFilePackage.initializePackageContents();
        theFtpPackage.initializePackageContents();
        theJmsPackage.initializePackageContents();
        theMailPackage.initializePackageContents();
        theNettyPackage.initializePackageContents();
        theQuartzPackage.initializePackageContents();
        theSqlPackage.initializePackageContents();

        // Fix loaded packages
        theSpringPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theJpaPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(JpaPackage.eNS_URI, theJpaPackage);
        return theJpaPackage;
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
    public EReference getDocumentRoot_BindingJPA() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJpaProducerType() {
        return jpaProducerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJpaProducerType_FlushOnSend() {
        return (EAttribute)jpaProducerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJpaProducerType_UsePersist() {
        return (EAttribute)jpaProducerTypeEClass.getEStructuralFeatures().get(1);
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
    public EClass getJpaConsumerType() {
        return jpaConsumerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJpaConsumerType_ScheduledPollConsumerType() {
        return (EAttribute)jpaConsumerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJpaConsumerType_InitialDelay() {
        return (EAttribute)jpaConsumerTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJpaConsumerType_Delay() {
        return (EAttribute)jpaConsumerTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJpaConsumerType_UseFixedDelay() {
        return (EAttribute)jpaConsumerTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJpaConsumerType_SendEmptyMessageWhenIdle() {
        return (EAttribute)jpaConsumerTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJpaConsumerType_TimeUnit() {
        return (EAttribute)jpaConsumerTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJpaConsumerType_ScheduledBatchPollConsumerType() {
        return (EAttribute)jpaConsumerTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJpaConsumerType_MaxMessagesPerPoll() {
        return (EAttribute)jpaConsumerTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJpaConsumerType_ConsumeDelete() {
        return (EAttribute)jpaConsumerTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJpaConsumerType_ConsumeLockEntity() {
        return (EAttribute)jpaConsumerTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJpaConsumerType_MaximumResults() {
        return (EAttribute)jpaConsumerTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJpaConsumerType_ConsumerQuery() {
        return (EAttribute)jpaConsumerTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJpaConsumerType_ConsumerNamedQuery() {
        return (EAttribute)jpaConsumerTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJpaConsumerType_ConsumerNativeQuery() {
        return (EAttribute)jpaConsumerTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJpaConsumerType_ConsumerResultClass() {
        return (EAttribute)jpaConsumerTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJpaConsumerType_ConsumerTransacted() {
        return (EAttribute)jpaConsumerTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelJPABindingType() {
        return camelJPABindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJPABindingType_EntityClassName() {
        return (EAttribute)camelJPABindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJPABindingType_PersistenceUnit() {
        return (EAttribute)camelJPABindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelJPABindingType_TransactionManager() {
        return (EAttribute)camelJPABindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelJPABindingType_Consume() {
        return (EReference)camelJPABindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelJPABindingType_Produce() {
        return (EReference)camelJPABindingTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JpaFactory getJpaFactory() {
        return (JpaFactory)getEFactoryInstance();
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

        camelJPABindingTypeEClass = createEClass(CAMEL_JPA_BINDING_TYPE);
        createEAttribute(camelJPABindingTypeEClass, CAMEL_JPA_BINDING_TYPE__ENTITY_CLASS_NAME);
        createEAttribute(camelJPABindingTypeEClass, CAMEL_JPA_BINDING_TYPE__PERSISTENCE_UNIT);
        createEAttribute(camelJPABindingTypeEClass, CAMEL_JPA_BINDING_TYPE__TRANSACTION_MANAGER);
        createEReference(camelJPABindingTypeEClass, CAMEL_JPA_BINDING_TYPE__CONSUME);
        createEReference(camelJPABindingTypeEClass, CAMEL_JPA_BINDING_TYPE__PRODUCE);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_JPA);

        jpaConsumerTypeEClass = createEClass(JPA_CONSUMER_TYPE);
        createEAttribute(jpaConsumerTypeEClass, JPA_CONSUMER_TYPE__SCHEDULED_POLL_CONSUMER_TYPE);
        createEAttribute(jpaConsumerTypeEClass, JPA_CONSUMER_TYPE__INITIAL_DELAY);
        createEAttribute(jpaConsumerTypeEClass, JPA_CONSUMER_TYPE__DELAY);
        createEAttribute(jpaConsumerTypeEClass, JPA_CONSUMER_TYPE__USE_FIXED_DELAY);
        createEAttribute(jpaConsumerTypeEClass, JPA_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE);
        createEAttribute(jpaConsumerTypeEClass, JPA_CONSUMER_TYPE__TIME_UNIT);
        createEAttribute(jpaConsumerTypeEClass, JPA_CONSUMER_TYPE__SCHEDULED_BATCH_POLL_CONSUMER_TYPE);
        createEAttribute(jpaConsumerTypeEClass, JPA_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL);
        createEAttribute(jpaConsumerTypeEClass, JPA_CONSUMER_TYPE__CONSUME_DELETE);
        createEAttribute(jpaConsumerTypeEClass, JPA_CONSUMER_TYPE__CONSUME_LOCK_ENTITY);
        createEAttribute(jpaConsumerTypeEClass, JPA_CONSUMER_TYPE__MAXIMUM_RESULTS);
        createEAttribute(jpaConsumerTypeEClass, JPA_CONSUMER_TYPE__CONSUMER_QUERY);
        createEAttribute(jpaConsumerTypeEClass, JPA_CONSUMER_TYPE__CONSUMER_NAMED_QUERY);
        createEAttribute(jpaConsumerTypeEClass, JPA_CONSUMER_TYPE__CONSUMER_NATIVE_QUERY);
        createEAttribute(jpaConsumerTypeEClass, JPA_CONSUMER_TYPE__CONSUMER_RESULT_CLASS);
        createEAttribute(jpaConsumerTypeEClass, JPA_CONSUMER_TYPE__CONSUMER_TRANSACTED);

        jpaProducerTypeEClass = createEClass(JPA_PRODUCER_TYPE);
        createEAttribute(jpaProducerTypeEClass, JPA_PRODUCER_TYPE__FLUSH_ON_SEND);
        createEAttribute(jpaProducerTypeEClass, JPA_PRODUCER_TYPE__USE_PERSIST);

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
        camelJPABindingTypeEClass.getESuperTypes().add(this.getBaseCamelBinding());

        // Initialize classes and features; add operations and parameters
        initEClass(baseCamelBindingEClass, BaseCamelBinding.class, "BaseCamelBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBaseCamelBinding_CamelContextMapper(), theSwitchyardPackage.getContextMapperType(), null, "camelContextMapper", null, 0, 1, BaseCamelBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBaseCamelBinding_CamelMessageComposer(), theSwitchyardPackage.getMessageComposerType(), null, "camelMessageComposer", null, 0, 1, BaseCamelBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelJPABindingTypeEClass, CamelJPABindingType.class, "CamelJPABindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelJPABindingType_EntityClassName(), theXMLTypePackage.getString(), "entityClassName", null, 1, 1, CamelJPABindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJPABindingType_PersistenceUnit(), theXMLTypePackage.getString(), "persistenceUnit", null, 1, 1, CamelJPABindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelJPABindingType_TransactionManager(), theXMLTypePackage.getString(), "transactionManager", null, 0, 1, CamelJPABindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelJPABindingType_Consume(), this.getJpaConsumerType(), null, "consume", null, 0, 1, CamelJPABindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelJPABindingType_Produce(), this.getJpaProducerType(), null, "produce", null, 0, 1, CamelJPABindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingJPA(), this.getCamelJPABindingType(), null, "bindingJPA", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(jpaConsumerTypeEClass, JpaConsumerType.class, "JpaConsumerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getJpaConsumerType_ScheduledPollConsumerType(), ecorePackage.getEFeatureMapEntry(), "scheduledPollConsumerType", null, 0, -1, JpaConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJpaConsumerType_InitialDelay(), theXMLTypePackage.getInt(), "initialDelay", "1000", 0, -1, JpaConsumerType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getJpaConsumerType_Delay(), theXMLTypePackage.getInt(), "delay", "500", 0, -1, JpaConsumerType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getJpaConsumerType_UseFixedDelay(), theXMLTypePackage.getBoolean(), "useFixedDelay", "false", 0, -1, JpaConsumerType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getJpaConsumerType_SendEmptyMessageWhenIdle(), theXMLTypePackage.getBoolean(), "sendEmptyMessageWhenIdle", "false", 0, -1, JpaConsumerType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getJpaConsumerType_TimeUnit(), this.getTimeUnitType(), "timeUnit", "MILLISECONDS", 0, -1, JpaConsumerType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getJpaConsumerType_ScheduledBatchPollConsumerType(), ecorePackage.getEFeatureMapEntry(), "scheduledBatchPollConsumerType", null, 0, -1, JpaConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJpaConsumerType_MaxMessagesPerPoll(), theXMLTypePackage.getInt(), "maxMessagesPerPoll", "0", 0, -1, JpaConsumerType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getJpaConsumerType_ConsumeDelete(), theXMLTypePackage.getBoolean(), "consumeDelete", "true", 0, 1, JpaConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJpaConsumerType_ConsumeLockEntity(), theXMLTypePackage.getBoolean(), "consumeLockEntity", "true", 0, 1, JpaConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJpaConsumerType_MaximumResults(), theXMLTypePackage.getInt(), "maximumResults", "-1", 0, 1, JpaConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJpaConsumerType_ConsumerQuery(), theXMLTypePackage.getString(), "consumerQuery", null, 0, 1, JpaConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJpaConsumerType_ConsumerNamedQuery(), theXMLTypePackage.getString(), "consumerNamedQuery", null, 0, 1, JpaConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJpaConsumerType_ConsumerNativeQuery(), theXMLTypePackage.getString(), "consumerNativeQuery", null, 0, 1, JpaConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJpaConsumerType_ConsumerResultClass(), theXMLTypePackage.getString(), "consumerResultClass", null, 0, 1, JpaConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJpaConsumerType_ConsumerTransacted(), theXMLTypePackage.getBoolean(), "consumerTransacted", "false", 0, 1, JpaConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(jpaProducerTypeEClass, JpaProducerType.class, "JpaProducerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getJpaProducerType_FlushOnSend(), theXMLTypePackage.getBoolean(), "flushOnSend", "true", 0, 1, JpaProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJpaProducerType_UsePersist(), theXMLTypePackage.getBoolean(), "usePersist", "false", 0, 1, JpaProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
          (camelJPABindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelJPABindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelJPABindingType_EntityClassName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "entityClassName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJPABindingType_PersistenceUnit(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "persistenceUnit",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJPABindingType_TransactionManager(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "transactionManager",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJPABindingType_Consume(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "consume",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelJPABindingType_Produce(), 
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
          (getDocumentRoot_BindingJPA(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.jpa",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (jpaConsumerTypeEClass, 
           source, 
           new String[] {
             "name", "JpaConsumerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getJpaConsumerType_ScheduledPollConsumerType(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "ScheduledPollConsumerType:0"
           });		
        addAnnotation
          (getJpaConsumerType_InitialDelay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "initialDelay",
             "namespace", "##targetNamespace",
             "group", "#ScheduledPollConsumerType:0"
           });		
        addAnnotation
          (getJpaConsumerType_Delay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "delay",
             "namespace", "##targetNamespace",
             "group", "#ScheduledPollConsumerType:0"
           });		
        addAnnotation
          (getJpaConsumerType_UseFixedDelay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "useFixedDelay",
             "namespace", "##targetNamespace",
             "group", "#ScheduledPollConsumerType:0"
           });		
        addAnnotation
          (getJpaConsumerType_SendEmptyMessageWhenIdle(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sendEmptyMessageWhenIdle",
             "namespace", "##targetNamespace",
             "group", "#ScheduledPollConsumerType:0"
           });		
        addAnnotation
          (getJpaConsumerType_TimeUnit(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "timeUnit",
             "namespace", "##targetNamespace",
             "group", "#ScheduledPollConsumerType:0"
           });		
        addAnnotation
          (getJpaConsumerType_ScheduledBatchPollConsumerType(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "ScheduledBatchPollConsumerType:6"
           });		
        addAnnotation
          (getJpaConsumerType_MaxMessagesPerPoll(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "maxMessagesPerPoll",
             "namespace", "##targetNamespace",
             "group", "#ScheduledBatchPollConsumerType:6"
           });		
        addAnnotation
          (getJpaConsumerType_ConsumeDelete(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "consumeDelete",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJpaConsumerType_ConsumeLockEntity(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "consumeLockEntity",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJpaConsumerType_MaximumResults(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "maximumResults",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJpaConsumerType_ConsumerQuery(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "consumer.query",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJpaConsumerType_ConsumerNamedQuery(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "consumer.namedQuery",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJpaConsumerType_ConsumerNativeQuery(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "consumer.nativeQuery",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJpaConsumerType_ConsumerResultClass(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "consumer.resultClass",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJpaConsumerType_ConsumerTransacted(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "consumer.transacted",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (jpaProducerTypeEClass, 
           source, 
           new String[] {
             "name", "JpaProducerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getJpaProducerType_FlushOnSend(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "flushOnSend",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJpaProducerType_UsePersist(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "usePersist",
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

} //JpaPackageImpl
