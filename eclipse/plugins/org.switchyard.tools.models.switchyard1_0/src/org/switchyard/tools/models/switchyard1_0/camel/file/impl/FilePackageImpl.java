/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.file.impl;

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
import org.switchyard.tools.models.switchyard1_0.camel.file.AdditionalUriParametersType;
import org.switchyard.tools.models.switchyard1_0.camel.file.BaseCamelBinding;

import org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.file.FileFactory;
import org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage;
import org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType;

import org.switchyard.tools.models.switchyard1_0.camel.file.ParameterType;
import org.switchyard.tools.models.switchyard1_0.camel.file.TimeUnitType;
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
public class FilePackageImpl extends EPackageImpl implements FilePackage {
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
    private EClass camelFileBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fileConsumerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fileProducerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass parameterTypeEClass = null;

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private FilePackageImpl() {
        super(eNS_URI, FileFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link FilePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static FilePackage init() {
        if (isInited) return (FilePackage)EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI);

        // Obtain or create and register package
        FilePackageImpl theFilePackage = (FilePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FilePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FilePackageImpl());

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
        theFilePackage.createPackageContents();
        theBeanPackage.createPackageContents();
        theBPELPackage.createPackageContents();
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
        theFtpPackage.createPackageContents();
        theJmsPackage.createPackageContents();
        theJpaPackage.createPackageContents();
        theMailPackage.createPackageContents();
        theNettyPackage.createPackageContents();
        theQuartzPackage.createPackageContents();
        theSqlPackage.createPackageContents();

        // Initialize created meta-data
        theFilePackage.initializePackageContents();
        theBeanPackage.initializePackageContents();
        theBPELPackage.initializePackageContents();
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
        theFtpPackage.initializePackageContents();
        theJmsPackage.initializePackageContents();
        theJpaPackage.initializePackageContents();
        theMailPackage.initializePackageContents();
        theNettyPackage.initializePackageContents();
        theQuartzPackage.initializePackageContents();
        theSqlPackage.initializePackageContents();

        // Fix loaded packages
        theSpringPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theFilePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(FilePackage.eNS_URI, theFilePackage);
        return theFilePackage;
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
    public EClass getCamelFileBindingType() {
        return camelFileBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFileBindingType_Directory() {
        return (EAttribute)camelFileBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFileBindingType_AutoCreate() {
        return (EAttribute)camelFileBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFileBindingType_BufferSize() {
        return (EAttribute)camelFileBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFileBindingType_FileName() {
        return (EAttribute)camelFileBindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFileBindingType_Flatten() {
        return (EAttribute)camelFileBindingTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelFileBindingType_Charset() {
        return (EAttribute)camelFileBindingTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelFileBindingType_Consume() {
        return (EReference)camelFileBindingTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCamelFileBindingType_Produce() {
        return (EReference)camelFileBindingTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFileConsumerType() {
        return fileConsumerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_InitialDelay() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_Delay() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_UseFixedDelay() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_SendEmptyMessageWhenIdle() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_TimeUnit() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_MaxMessagesPerPoll() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_Delete() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_Recursive() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_Noop() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_PreMove() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_Move() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_MoveFailed() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_Include() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_Exclude() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_Idempotent() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_IdempotentRepository() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_InProgressRepository() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_Filter() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_Sorter() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_SortBy() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_ReadLock() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_ReadLockTimeout() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_ReadLockCheckInterval() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_ExclusiveReadLockStrategy() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_ProcessStrategy() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_StartingDirectoryMustExist() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_DirectoryMustExist() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileConsumerType_DoneFileName() {
        return (EAttribute)fileConsumerTypeEClass.getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFileProducerType() {
        return fileProducerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileProducerType_FileExist() {
        return (EAttribute)fileProducerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileProducerType_TempPrefix() {
        return (EAttribute)fileProducerTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileProducerType_TempFileName() {
        return (EAttribute)fileProducerTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileProducerType_KeepLastModified() {
        return (EAttribute)fileProducerTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileProducerType_EagerDeleteTargetFile() {
        return (EAttribute)fileProducerTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFileProducerType_DoneFileName() {
        return (EAttribute)fileProducerTypeEClass.getEStructuralFeatures().get(5);
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
    public EReference getDocumentRoot_BindingFile() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FileFactory getFileFactory() {
        return (FileFactory)getEFactoryInstance();
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

        camelFileBindingTypeEClass = createEClass(CAMEL_FILE_BINDING_TYPE);
        createEAttribute(camelFileBindingTypeEClass, CAMEL_FILE_BINDING_TYPE__DIRECTORY);
        createEAttribute(camelFileBindingTypeEClass, CAMEL_FILE_BINDING_TYPE__AUTO_CREATE);
        createEAttribute(camelFileBindingTypeEClass, CAMEL_FILE_BINDING_TYPE__BUFFER_SIZE);
        createEAttribute(camelFileBindingTypeEClass, CAMEL_FILE_BINDING_TYPE__FILE_NAME);
        createEAttribute(camelFileBindingTypeEClass, CAMEL_FILE_BINDING_TYPE__FLATTEN);
        createEAttribute(camelFileBindingTypeEClass, CAMEL_FILE_BINDING_TYPE__CHARSET);
        createEReference(camelFileBindingTypeEClass, CAMEL_FILE_BINDING_TYPE__CONSUME);
        createEReference(camelFileBindingTypeEClass, CAMEL_FILE_BINDING_TYPE__PRODUCE);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_FILE);

        fileConsumerTypeEClass = createEClass(FILE_CONSUMER_TYPE);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__INITIAL_DELAY);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__DELAY);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__USE_FIXED_DELAY);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__TIME_UNIT);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__DELETE);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__RECURSIVE);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__NOOP);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__PRE_MOVE);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__MOVE);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__MOVE_FAILED);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__INCLUDE);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__EXCLUDE);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__IDEMPOTENT);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__FILTER);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__SORTER);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__SORT_BY);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__READ_LOCK);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__PROCESS_STRATEGY);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST);
        createEAttribute(fileConsumerTypeEClass, FILE_CONSUMER_TYPE__DONE_FILE_NAME);

        fileProducerTypeEClass = createEClass(FILE_PRODUCER_TYPE);
        createEAttribute(fileProducerTypeEClass, FILE_PRODUCER_TYPE__FILE_EXIST);
        createEAttribute(fileProducerTypeEClass, FILE_PRODUCER_TYPE__TEMP_PREFIX);
        createEAttribute(fileProducerTypeEClass, FILE_PRODUCER_TYPE__TEMP_FILE_NAME);
        createEAttribute(fileProducerTypeEClass, FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED);
        createEAttribute(fileProducerTypeEClass, FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE);
        createEAttribute(fileProducerTypeEClass, FILE_PRODUCER_TYPE__DONE_FILE_NAME);

        parameterTypeEClass = createEClass(PARAMETER_TYPE);
        createEAttribute(parameterTypeEClass, PARAMETER_TYPE__NAME);
        createEAttribute(parameterTypeEClass, PARAMETER_TYPE__VALUE);

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
        camelFileBindingTypeEClass.getESuperTypes().add(this.getBaseCamelBinding());

        // Initialize classes and features; add operations and parameters
        initEClass(additionalUriParametersTypeEClass, AdditionalUriParametersType.class, "AdditionalUriParametersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAdditionalUriParametersType_Parameter(), this.getParameterType(), null, "parameter", null, 0, -1, AdditionalUriParametersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(baseCamelBindingEClass, BaseCamelBinding.class, "BaseCamelBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBaseCamelBinding_ContextMapper(), theSwitchyardPackage.getContextMapperType(), null, "contextMapper", null, 0, 1, BaseCamelBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBaseCamelBinding_MessageComposer(), theSwitchyardPackage.getMessageComposerType(), null, "messageComposer", null, 0, 1, BaseCamelBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBaseCamelBinding_AdditionalUriParameters(), this.getAdditionalUriParametersType(), null, "additionalUriParameters", null, 0, 1, BaseCamelBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelFileBindingTypeEClass, CamelFileBindingType.class, "CamelFileBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelFileBindingType_Directory(), theXMLTypePackage.getString(), "directory", null, 1, 1, CamelFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFileBindingType_AutoCreate(), theXMLTypePackage.getBoolean(), "autoCreate", "true", 0, 1, CamelFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFileBindingType_BufferSize(), theSwitchyardPackage.getPropInteger(), "bufferSize", "131072", 0, 1, CamelFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFileBindingType_FileName(), theXMLTypePackage.getString(), "fileName", null, 0, 1, CamelFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFileBindingType_Flatten(), theXMLTypePackage.getBoolean(), "flatten", "false", 0, 1, CamelFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelFileBindingType_Charset(), theXMLTypePackage.getString(), "charset", null, 0, 1, CamelFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelFileBindingType_Consume(), this.getFileConsumerType(), null, "consume", null, 0, 1, CamelFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCamelFileBindingType_Produce(), this.getFileProducerType(), null, "produce", null, 0, 1, CamelFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingFile(), this.getCamelFileBindingType(), null, "bindingFile", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(fileConsumerTypeEClass, FileConsumerType.class, "FileConsumerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFileConsumerType_InitialDelay(), theSwitchyardPackage.getPropInteger(), "initialDelay", "1000", 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_Delay(), theSwitchyardPackage.getPropInteger(), "delay", "500", 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_UseFixedDelay(), theXMLTypePackage.getBoolean(), "useFixedDelay", "true", 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_SendEmptyMessageWhenIdle(), theXMLTypePackage.getBoolean(), "sendEmptyMessageWhenIdle", "false", 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_TimeUnit(), this.getTimeUnitType(), "timeUnit", "MILLISECONDS", 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_MaxMessagesPerPoll(), theSwitchyardPackage.getPropInteger(), "maxMessagesPerPoll", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_Delete(), theXMLTypePackage.getBoolean(), "delete", "false", 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_Recursive(), theXMLTypePackage.getBoolean(), "recursive", "false", 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_Noop(), theXMLTypePackage.getBoolean(), "noop", "false", 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_PreMove(), theXMLTypePackage.getString(), "preMove", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_Move(), theXMLTypePackage.getString(), "move", "", 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_MoveFailed(), theXMLTypePackage.getString(), "moveFailed", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_Include(), theXMLTypePackage.getString(), "include", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_Exclude(), theXMLTypePackage.getString(), "exclude", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_Idempotent(), theXMLTypePackage.getBoolean(), "idempotent", "false", 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_IdempotentRepository(), theXMLTypePackage.getString(), "idempotentRepository", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_InProgressRepository(), theXMLTypePackage.getString(), "inProgressRepository", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_Filter(), theXMLTypePackage.getString(), "filter", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_Sorter(), theXMLTypePackage.getString(), "sorter", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_SortBy(), theXMLTypePackage.getString(), "sortBy", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_ReadLock(), theXMLTypePackage.getString(), "readLock", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_ReadLockTimeout(), theSwitchyardPackage.getPropLong(), "readLockTimeout", "10000", 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_ReadLockCheckInterval(), theSwitchyardPackage.getPropInteger(), "readLockCheckInterval", "1000", 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_ExclusiveReadLockStrategy(), theXMLTypePackage.getString(), "exclusiveReadLockStrategy", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_ProcessStrategy(), theXMLTypePackage.getString(), "processStrategy", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_StartingDirectoryMustExist(), theXMLTypePackage.getBoolean(), "startingDirectoryMustExist", "false", 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_DirectoryMustExist(), theXMLTypePackage.getBoolean(), "directoryMustExist", "false", 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileConsumerType_DoneFileName(), theXMLTypePackage.getString(), "doneFileName", null, 0, 1, FileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fileProducerTypeEClass, FileProducerType.class, "FileProducerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFileProducerType_FileExist(), theXMLTypePackage.getString(), "fileExist", null, 0, 1, FileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileProducerType_TempPrefix(), theXMLTypePackage.getString(), "tempPrefix", null, 0, 1, FileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileProducerType_TempFileName(), theXMLTypePackage.getString(), "tempFileName", null, 0, 1, FileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileProducerType_KeepLastModified(), theXMLTypePackage.getBoolean(), "keepLastModified", "false", 0, 1, FileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileProducerType_EagerDeleteTargetFile(), theXMLTypePackage.getBoolean(), "eagerDeleteTargetFile", "true", 0, 1, FileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFileProducerType_DoneFileName(), theXMLTypePackage.getString(), "doneFileName", null, 0, 1, FileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getParameterType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameterType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
          (camelFileBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelFileBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelFileBindingType_Directory(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "directory",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFileBindingType_AutoCreate(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "autoCreate",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFileBindingType_BufferSize(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "bufferSize",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFileBindingType_FileName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "fileName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFileBindingType_Flatten(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "flatten",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFileBindingType_Charset(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "charset",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFileBindingType_Consume(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "consume",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelFileBindingType_Produce(), 
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
          (getDocumentRoot_BindingFile(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.file",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (fileConsumerTypeEClass, 
           source, 
           new String[] {
             "name", "FileConsumerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getFileConsumerType_InitialDelay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "initialDelay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_Delay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "delay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_UseFixedDelay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "useFixedDelay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_SendEmptyMessageWhenIdle(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sendEmptyMessageWhenIdle",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_TimeUnit(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "timeUnit",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_MaxMessagesPerPoll(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "maxMessagesPerPoll",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_Delete(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "delete",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_Recursive(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "recursive",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_Noop(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "noop",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_PreMove(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "preMove",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_Move(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "move",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_MoveFailed(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "moveFailed",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_Include(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "include",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_Exclude(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "exclude",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_Idempotent(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idempotent",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_IdempotentRepository(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idempotentRepository",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_InProgressRepository(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "inProgressRepository",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_Filter(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "filter",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_Sorter(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sorter",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_SortBy(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sortBy",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_ReadLock(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "readLock",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_ReadLockTimeout(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "readLockTimeout",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_ReadLockCheckInterval(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "readLockCheckInterval",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_ExclusiveReadLockStrategy(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "exclusiveReadLockStrategy",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_ProcessStrategy(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "processStrategy",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_StartingDirectoryMustExist(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "startingDirectoryMustExist",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_DirectoryMustExist(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "directoryMustExist",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileConsumerType_DoneFileName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doneFileName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (fileProducerTypeEClass, 
           source, 
           new String[] {
             "name", "FileProducerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getFileProducerType_FileExist(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "fileExist",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileProducerType_TempPrefix(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "tempPrefix",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileProducerType_TempFileName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "tempFileName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileProducerType_KeepLastModified(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "keepLastModified",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileProducerType_EagerDeleteTargetFile(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "eagerDeleteTargetFile",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getFileProducerType_DoneFileName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doneFileName",
             "namespace", "##targetNamespace"
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

} //FilePackageImpl
