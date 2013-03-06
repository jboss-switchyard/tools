/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca.impl;

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
import org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec;
import org.switchyard.tools.models.switchyard1_0.jca.BatchCommit;
import org.switchyard.tools.models.switchyard1_0.jca.Connection;
import org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec;
import org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.jca.Endpoint;
import org.switchyard.tools.models.switchyard1_0.jca.InboundOperation;
import org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JCAContextMapperType;
import org.switchyard.tools.models.switchyard1_0.jca.JCACreateResource;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction;
import org.switchyard.tools.models.switchyard1_0.jca.JCAMessageComposerType;
import org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection;
import org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.models.switchyard1_0.jca.Operation;
import org.switchyard.tools.models.switchyard1_0.jca.Processor;
import org.switchyard.tools.models.switchyard1_0.jca.Property;
import org.switchyard.tools.models.switchyard1_0.jca.ResAuth;
import org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter;

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
public class JcaPackageImpl extends EPackageImpl implements JcaPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass activationSpecEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass connectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass connectionSpecEClass = null;

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
    private EClass jcaContextMapperTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jcaMessageComposerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass batchCommitEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass inboundOperationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionSpecEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jcaBindingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jcaInboundConnectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jcaInboundInteractionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jcaOutboundConnectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jcaOutboundInteractionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass operationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resourceAdapterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass endpointEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum jcaCreateResourceEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum resAuthEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType jcaCreateResourceObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType resAuthObjectEDataType = null;

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
     * @see org.switchyard.tools.models.switchyard1_0.jca.JcaPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private JcaPackageImpl() {
        super(eNS_URI, JcaFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link JcaPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static JcaPackage init() {
        if (isInited) return (JcaPackage)EPackage.Registry.INSTANCE.getEPackage(JcaPackage.eNS_URI);

        // Obtain or create and register package
        JcaPackageImpl theJcaPackage = (JcaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JcaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JcaPackageImpl());

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
        theJcaPackage.createPackageContents();
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
        theJcaPackage.initializePackageContents();
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

        // Mark meta-data to indicate it can't be changed
        theJcaPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(JcaPackage.eNS_URI, theJcaPackage);
        return theJcaPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActivationSpec() {
        return activationSpecEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivationSpec_Property() {
        return (EReference)activationSpecEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActivationSpec_Any() {
        return (EAttribute)activationSpecEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActivationSpec_Create() {
        return (EAttribute)activationSpecEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActivationSpec_JndiName() {
        return (EAttribute)activationSpecEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActivationSpec_Type() {
        return (EAttribute)activationSpecEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActivationSpec_AnyAttribute() {
        return (EAttribute)activationSpecEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConnection() {
        return connectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnection_Property() {
        return (EReference)connectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnection_Any() {
        return (EAttribute)connectionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnection_Create() {
        return (EAttribute)connectionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnection_JndiName() {
        return (EAttribute)connectionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnection_Type() {
        return (EAttribute)connectionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnection_AnyAttribute() {
        return (EAttribute)connectionEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConnectionSpec() {
        return connectionSpecEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnectionSpec_Property() {
        return (EReference)connectionSpecEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectionSpec_Any() {
        return (EAttribute)connectionSpecEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectionSpec_Type() {
        return (EAttribute)connectionSpecEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectionSpec_AnyAttribute() {
        return (EAttribute)connectionSpecEClass.getEStructuralFeatures().get(3);
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
    public EReference getDocumentRoot_BindingJca() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ContextMapper() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_MessageComposer() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJCAContextMapperType() {
        return jcaContextMapperTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJCAMessageComposerType() {
        return jcaMessageComposerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBatchCommit() {
        return batchCommitEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBatchCommit_BatchSize() {
        return (EAttribute)batchCommitEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBatchCommit_BatchTimeout() {
        return (EAttribute)batchCommitEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInboundOperation() {
        return inboundOperationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInboundOperation_Any() {
        return (EAttribute)inboundOperationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInboundOperation_Name() {
        return (EAttribute)inboundOperationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInboundOperation_SelectedOperation() {
        return (EAttribute)inboundOperationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInboundOperation_AnyAttribute() {
        return (EAttribute)inboundOperationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteractionSpec() {
        return interactionSpecEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionSpec_Property() {
        return (EReference)interactionSpecEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInteractionSpec_Any() {
        return (EAttribute)interactionSpecEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInteractionSpec_Type() {
        return (EAttribute)interactionSpecEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInteractionSpec_AnyAttribute() {
        return (EAttribute)interactionSpecEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJCABinding() {
        return jcaBindingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJCABinding_JndiURL() {
        return (EAttribute)jcaBindingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJCABinding_InitialContextFactory() {
        return (EAttribute)jcaBindingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJCABinding_OutboundConnection() {
        return (EReference)jcaBindingEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJCABinding_InboundConnection() {
        return (EReference)jcaBindingEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJCABinding_InboundInteraction() {
        return (EReference)jcaBindingEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJCABinding_OutboundInteraction() {
        return (EReference)jcaBindingEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJCABinding_Property() {
        return (EReference)jcaBindingEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJCABinding_Extensions() {
        return (EAttribute)jcaBindingEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJCAInboundConnection() {
        return jcaInboundConnectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJCAInboundConnection_ResourceAdapter() {
        return (EReference)jcaInboundConnectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJCAInboundConnection_ActivationSpec() {
        return (EReference)jcaInboundConnectionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJCAInboundConnection_Any() {
        return (EAttribute)jcaInboundConnectionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJCAInboundConnection_AnyAttribute() {
        return (EAttribute)jcaInboundConnectionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJCAInboundInteraction() {
        return jcaInboundInteractionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJCAInboundInteraction_Listener() {
        return (EAttribute)jcaInboundInteractionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJCAInboundInteraction_Endpoint() {
        return (EReference)jcaInboundInteractionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJCAInboundInteraction_Transacted() {
        return (EAttribute)jcaInboundInteractionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJCAInboundInteraction_BatchCommit() {
        return (EReference)jcaInboundInteractionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJCAInboundInteraction_Any() {
        return (EAttribute)jcaInboundInteractionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJCAInboundInteraction_AnyAttribute() {
        return (EAttribute)jcaInboundInteractionEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJCAOutboundConnection() {
        return jcaOutboundConnectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJCAOutboundConnection_ResourceAdapter() {
        return (EReference)jcaOutboundConnectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJCAOutboundConnection_Connection() {
        return (EReference)jcaOutboundConnectionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJCAOutboundConnection_ResAuth() {
        return (EAttribute)jcaOutboundConnectionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJCAOutboundConnection_Any() {
        return (EAttribute)jcaOutboundConnectionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJCAOutboundConnection_Managed() {
        return (EAttribute)jcaOutboundConnectionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJCAOutboundConnection_AnyAttribute() {
        return (EAttribute)jcaOutboundConnectionEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJCAOutboundInteraction() {
        return jcaOutboundInteractionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJCAOutboundInteraction_ConnectionSpec() {
        return (EReference)jcaOutboundInteractionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJCAOutboundInteraction_InteractionSpec() {
        return (EReference)jcaOutboundInteractionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJCAOutboundInteraction_Operation() {
        return (EReference)jcaOutboundInteractionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJCAOutboundInteraction_Processor() {
        return (EReference)jcaOutboundInteractionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJCAOutboundInteraction_Any() {
        return (EAttribute)jcaOutboundInteractionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJCAOutboundInteraction_AnyAttribute() {
        return (EAttribute)jcaOutboundInteractionEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOperation() {
        return operationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperation_InteractionSpec() {
        return (EReference)operationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperation_Any() {
        return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperation_Name() {
        return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperation_AnyAttribute() {
        return (EAttribute)operationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProperty() {
        return propertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_Name() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_Value() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResourceAdapter() {
        return resourceAdapterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getResourceAdapter_Property() {
        return (EReference)resourceAdapterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResourceAdapter_Any() {
        return (EAttribute)resourceAdapterEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResourceAdapter_Name() {
        return (EAttribute)resourceAdapterEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResourceAdapter_Type() {
        return (EAttribute)resourceAdapterEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResourceAdapter_AnyAttribute() {
        return (EAttribute)resourceAdapterEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcessor() {
        return processorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcessor_Property() {
        return (EReference)processorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProcessor_Any() {
        return (EAttribute)processorEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProcessor_Type() {
        return (EAttribute)processorEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProcessor_AnyAttribute() {
        return (EAttribute)processorEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEndpoint() {
        return endpointEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEndpoint_Property() {
        return (EReference)endpointEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEndpoint_Any() {
        return (EAttribute)endpointEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEndpoint_Type() {
        return (EAttribute)endpointEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEndpoint_AnyAttribute() {
        return (EAttribute)endpointEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getJCACreateResource() {
        return jcaCreateResourceEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getResAuth() {
        return resAuthEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getJCACreateResourceObject() {
        return jcaCreateResourceObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getResAuthObject() {
        return resAuthObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JcaFactory getJcaFactory() {
        return (JcaFactory)getEFactoryInstance();
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
        activationSpecEClass = createEClass(ACTIVATION_SPEC);
        createEReference(activationSpecEClass, ACTIVATION_SPEC__PROPERTY);
        createEAttribute(activationSpecEClass, ACTIVATION_SPEC__ANY);
        createEAttribute(activationSpecEClass, ACTIVATION_SPEC__CREATE);
        createEAttribute(activationSpecEClass, ACTIVATION_SPEC__JNDI_NAME);
        createEAttribute(activationSpecEClass, ACTIVATION_SPEC__TYPE);
        createEAttribute(activationSpecEClass, ACTIVATION_SPEC__ANY_ATTRIBUTE);

        connectionEClass = createEClass(CONNECTION);
        createEReference(connectionEClass, CONNECTION__PROPERTY);
        createEAttribute(connectionEClass, CONNECTION__ANY);
        createEAttribute(connectionEClass, CONNECTION__CREATE);
        createEAttribute(connectionEClass, CONNECTION__JNDI_NAME);
        createEAttribute(connectionEClass, CONNECTION__TYPE);
        createEAttribute(connectionEClass, CONNECTION__ANY_ATTRIBUTE);

        connectionSpecEClass = createEClass(CONNECTION_SPEC);
        createEReference(connectionSpecEClass, CONNECTION_SPEC__PROPERTY);
        createEAttribute(connectionSpecEClass, CONNECTION_SPEC__ANY);
        createEAttribute(connectionSpecEClass, CONNECTION_SPEC__TYPE);
        createEAttribute(connectionSpecEClass, CONNECTION_SPEC__ANY_ATTRIBUTE);

        endpointEClass = createEClass(ENDPOINT);
        createEReference(endpointEClass, ENDPOINT__PROPERTY);
        createEAttribute(endpointEClass, ENDPOINT__ANY);
        createEAttribute(endpointEClass, ENDPOINT__TYPE);
        createEAttribute(endpointEClass, ENDPOINT__ANY_ATTRIBUTE);

        inboundOperationEClass = createEClass(INBOUND_OPERATION);
        createEAttribute(inboundOperationEClass, INBOUND_OPERATION__ANY);
        createEAttribute(inboundOperationEClass, INBOUND_OPERATION__NAME);
        createEAttribute(inboundOperationEClass, INBOUND_OPERATION__SELECTED_OPERATION);
        createEAttribute(inboundOperationEClass, INBOUND_OPERATION__ANY_ATTRIBUTE);

        interactionSpecEClass = createEClass(INTERACTION_SPEC);
        createEReference(interactionSpecEClass, INTERACTION_SPEC__PROPERTY);
        createEAttribute(interactionSpecEClass, INTERACTION_SPEC__ANY);
        createEAttribute(interactionSpecEClass, INTERACTION_SPEC__TYPE);
        createEAttribute(interactionSpecEClass, INTERACTION_SPEC__ANY_ATTRIBUTE);

        jcaBindingEClass = createEClass(JCA_BINDING);
        createEAttribute(jcaBindingEClass, JCA_BINDING__JNDI_URL);
        createEAttribute(jcaBindingEClass, JCA_BINDING__INITIAL_CONTEXT_FACTORY);
        createEReference(jcaBindingEClass, JCA_BINDING__OUTBOUND_CONNECTION);
        createEReference(jcaBindingEClass, JCA_BINDING__INBOUND_CONNECTION);
        createEReference(jcaBindingEClass, JCA_BINDING__INBOUND_INTERACTION);
        createEReference(jcaBindingEClass, JCA_BINDING__OUTBOUND_INTERACTION);
        createEReference(jcaBindingEClass, JCA_BINDING__PROPERTY);
        createEAttribute(jcaBindingEClass, JCA_BINDING__EXTENSIONS);

        jcaInboundConnectionEClass = createEClass(JCA_INBOUND_CONNECTION);
        createEReference(jcaInboundConnectionEClass, JCA_INBOUND_CONNECTION__RESOURCE_ADAPTER);
        createEReference(jcaInboundConnectionEClass, JCA_INBOUND_CONNECTION__ACTIVATION_SPEC);
        createEAttribute(jcaInboundConnectionEClass, JCA_INBOUND_CONNECTION__ANY);
        createEAttribute(jcaInboundConnectionEClass, JCA_INBOUND_CONNECTION__ANY_ATTRIBUTE);

        jcaInboundInteractionEClass = createEClass(JCA_INBOUND_INTERACTION);
        createEAttribute(jcaInboundInteractionEClass, JCA_INBOUND_INTERACTION__LISTENER);
        createEReference(jcaInboundInteractionEClass, JCA_INBOUND_INTERACTION__ENDPOINT);
        createEAttribute(jcaInboundInteractionEClass, JCA_INBOUND_INTERACTION__TRANSACTED);
        createEReference(jcaInboundInteractionEClass, JCA_INBOUND_INTERACTION__BATCH_COMMIT);
        createEAttribute(jcaInboundInteractionEClass, JCA_INBOUND_INTERACTION__ANY);
        createEAttribute(jcaInboundInteractionEClass, JCA_INBOUND_INTERACTION__ANY_ATTRIBUTE);

        jcaOutboundConnectionEClass = createEClass(JCA_OUTBOUND_CONNECTION);
        createEReference(jcaOutboundConnectionEClass, JCA_OUTBOUND_CONNECTION__RESOURCE_ADAPTER);
        createEReference(jcaOutboundConnectionEClass, JCA_OUTBOUND_CONNECTION__CONNECTION);
        createEAttribute(jcaOutboundConnectionEClass, JCA_OUTBOUND_CONNECTION__RES_AUTH);
        createEAttribute(jcaOutboundConnectionEClass, JCA_OUTBOUND_CONNECTION__ANY);
        createEAttribute(jcaOutboundConnectionEClass, JCA_OUTBOUND_CONNECTION__MANAGED);
        createEAttribute(jcaOutboundConnectionEClass, JCA_OUTBOUND_CONNECTION__ANY_ATTRIBUTE);

        jcaOutboundInteractionEClass = createEClass(JCA_OUTBOUND_INTERACTION);
        createEReference(jcaOutboundInteractionEClass, JCA_OUTBOUND_INTERACTION__CONNECTION_SPEC);
        createEReference(jcaOutboundInteractionEClass, JCA_OUTBOUND_INTERACTION__INTERACTION_SPEC);
        createEReference(jcaOutboundInteractionEClass, JCA_OUTBOUND_INTERACTION__OPERATION);
        createEReference(jcaOutboundInteractionEClass, JCA_OUTBOUND_INTERACTION__PROCESSOR);
        createEAttribute(jcaOutboundInteractionEClass, JCA_OUTBOUND_INTERACTION__ANY);
        createEAttribute(jcaOutboundInteractionEClass, JCA_OUTBOUND_INTERACTION__ANY_ATTRIBUTE);

        operationEClass = createEClass(OPERATION);
        createEReference(operationEClass, OPERATION__INTERACTION_SPEC);
        createEAttribute(operationEClass, OPERATION__ANY);
        createEAttribute(operationEClass, OPERATION__NAME);
        createEAttribute(operationEClass, OPERATION__ANY_ATTRIBUTE);

        processorEClass = createEClass(PROCESSOR);
        createEReference(processorEClass, PROCESSOR__PROPERTY);
        createEAttribute(processorEClass, PROCESSOR__ANY);
        createEAttribute(processorEClass, PROCESSOR__TYPE);
        createEAttribute(processorEClass, PROCESSOR__ANY_ATTRIBUTE);

        propertyEClass = createEClass(PROPERTY);
        createEAttribute(propertyEClass, PROPERTY__NAME);
        createEAttribute(propertyEClass, PROPERTY__VALUE);

        resourceAdapterEClass = createEClass(RESOURCE_ADAPTER);
        createEReference(resourceAdapterEClass, RESOURCE_ADAPTER__PROPERTY);
        createEAttribute(resourceAdapterEClass, RESOURCE_ADAPTER__ANY);
        createEAttribute(resourceAdapterEClass, RESOURCE_ADAPTER__NAME);
        createEAttribute(resourceAdapterEClass, RESOURCE_ADAPTER__TYPE);
        createEAttribute(resourceAdapterEClass, RESOURCE_ADAPTER__ANY_ATTRIBUTE);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_JCA);
        createEReference(documentRootEClass, DOCUMENT_ROOT__CONTEXT_MAPPER);
        createEReference(documentRootEClass, DOCUMENT_ROOT__MESSAGE_COMPOSER);

        jcaContextMapperTypeEClass = createEClass(JCA_CONTEXT_MAPPER_TYPE);

        jcaMessageComposerTypeEClass = createEClass(JCA_MESSAGE_COMPOSER_TYPE);

        batchCommitEClass = createEClass(BATCH_COMMIT);
        createEAttribute(batchCommitEClass, BATCH_COMMIT__BATCH_SIZE);
        createEAttribute(batchCommitEClass, BATCH_COMMIT__BATCH_TIMEOUT);

        // Create enums
        jcaCreateResourceEEnum = createEEnum(JCA_CREATE_RESOURCE);
        resAuthEEnum = createEEnum(RES_AUTH);

        // Create data types
        jcaCreateResourceObjectEDataType = createEDataType(JCA_CREATE_RESOURCE_OBJECT);
        resAuthObjectEDataType = createEDataType(RES_AUTH_OBJECT);
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
        SwitchyardPackage theSwitchyardPackage = (SwitchyardPackage)EPackage.Registry.INSTANCE.getEPackage(SwitchyardPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        jcaBindingEClass.getESuperTypes().add(theSwitchyardPackage.getSwitchYardBindingType());
        jcaContextMapperTypeEClass.getESuperTypes().add(theSwitchyardPackage.getContextMapperType());
        jcaMessageComposerTypeEClass.getESuperTypes().add(theSwitchyardPackage.getMessageComposerType());

        // Initialize classes and features; add operations and parameters
        initEClass(activationSpecEClass, ActivationSpec.class, "ActivationSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getActivationSpec_Property(), this.getProperty(), null, "property", null, 0, -1, ActivationSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActivationSpec_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ActivationSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActivationSpec_Create(), this.getJCACreateResource(), "create", "ifNotExist", 0, 1, ActivationSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActivationSpec_JndiName(), theXMLTypePackage.getAnyURI(), "jndiName", null, 0, 1, ActivationSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActivationSpec_Type(), theXMLTypePackage.getNMTOKEN(), "type", null, 0, 1, ActivationSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActivationSpec_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ActivationSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConnection_Property(), this.getProperty(), null, "property", null, 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnection_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnection_Create(), this.getJCACreateResource(), "create", "ifNotExist", 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnection_JndiName(), theXMLTypePackage.getAnyURI(), "jndiName", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnection_Type(), theXMLTypePackage.getNMTOKEN(), "type", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnection_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(connectionSpecEClass, ConnectionSpec.class, "ConnectionSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConnectionSpec_Property(), this.getProperty(), null, "property", null, 0, -1, ConnectionSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectionSpec_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ConnectionSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectionSpec_Type(), theXMLTypePackage.getNMTOKEN(), "type", null, 0, 1, ConnectionSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectionSpec_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ConnectionSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(endpointEClass, Endpoint.class, "Endpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEndpoint_Property(), this.getProperty(), null, "property", null, 0, -1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEndpoint_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEndpoint_Type(), theXMLTypePackage.getNMTOKEN(), "type", null, 1, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEndpoint_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(inboundOperationEClass, InboundOperation.class, "InboundOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInboundOperation_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, InboundOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInboundOperation_Name(), theXMLTypePackage.getNMTOKEN(), "name", null, 1, 1, InboundOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInboundOperation_SelectedOperation(), theXMLTypePackage.getString(), "selectedOperation", null, 1, 1, InboundOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInboundOperation_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, InboundOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interactionSpecEClass, InteractionSpec.class, "InteractionSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInteractionSpec_Property(), this.getProperty(), null, "property", null, 0, -1, InteractionSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInteractionSpec_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, InteractionSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInteractionSpec_Type(), theXMLTypePackage.getNMTOKEN(), "type", null, 1, 1, InteractionSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInteractionSpec_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, InteractionSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(jcaBindingEClass, JCABinding.class, "JCABinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getJCABinding_JndiURL(), theXMLTypePackage.getAnyURI(), "jndiURL", null, 0, 1, JCABinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJCABinding_InitialContextFactory(), theXMLTypePackage.getAnyURI(), "initialContextFactory", null, 0, 1, JCABinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJCABinding_OutboundConnection(), this.getJCAOutboundConnection(), null, "outboundConnection", null, 0, 1, JCABinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJCABinding_InboundConnection(), this.getJCAInboundConnection(), null, "inboundConnection", null, 0, 1, JCABinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJCABinding_InboundInteraction(), this.getJCAInboundInteraction(), null, "inboundInteraction", null, 0, 1, JCABinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJCABinding_OutboundInteraction(), this.getJCAOutboundInteraction(), null, "outboundInteraction", null, 0, 1, JCABinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJCABinding_Property(), this.getProperty(), null, "property", null, 0, -1, JCABinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJCABinding_Extensions(), theXMLTypePackage.getAnySimpleType(), "extensions", null, 0, 1, JCABinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(jcaInboundConnectionEClass, JCAInboundConnection.class, "JCAInboundConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getJCAInboundConnection_ResourceAdapter(), this.getResourceAdapter(), null, "resourceAdapter", null, 1, 1, JCAInboundConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJCAInboundConnection_ActivationSpec(), this.getActivationSpec(), null, "activationSpec", null, 1, 1, JCAInboundConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJCAInboundConnection_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, JCAInboundConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJCAInboundConnection_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, JCAInboundConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(jcaInboundInteractionEClass, JCAInboundInteraction.class, "JCAInboundInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getJCAInboundInteraction_Listener(), theXMLTypePackage.getString(), "listener", null, 0, 1, JCAInboundInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJCAInboundInteraction_Endpoint(), this.getEndpoint(), null, "endpoint", null, 0, 1, JCAInboundInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJCAInboundInteraction_Transacted(), theXMLTypePackage.getBoolean(), "transacted", null, 0, 1, JCAInboundInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJCAInboundInteraction_BatchCommit(), this.getBatchCommit(), null, "batchCommit", null, 0, 1, JCAInboundInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJCAInboundInteraction_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, JCAInboundInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJCAInboundInteraction_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, JCAInboundInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(jcaOutboundConnectionEClass, JCAOutboundConnection.class, "JCAOutboundConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getJCAOutboundConnection_ResourceAdapter(), this.getResourceAdapter(), null, "resourceAdapter", null, 0, 1, JCAOutboundConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJCAOutboundConnection_Connection(), this.getConnection(), null, "connection", null, 1, 1, JCAOutboundConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJCAOutboundConnection_ResAuth(), this.getResAuth(), "resAuth", null, 0, 1, JCAOutboundConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJCAOutboundConnection_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, JCAOutboundConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJCAOutboundConnection_Managed(), theXMLTypePackage.getBooleanObject(), "managed", "true", 0, 1, JCAOutboundConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJCAOutboundConnection_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, JCAOutboundConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(jcaOutboundInteractionEClass, JCAOutboundInteraction.class, "JCAOutboundInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getJCAOutboundInteraction_ConnectionSpec(), this.getConnectionSpec(), null, "connectionSpec", null, 0, 1, JCAOutboundInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJCAOutboundInteraction_InteractionSpec(), this.getInteractionSpec(), null, "interactionSpec", null, 0, 1, JCAOutboundInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJCAOutboundInteraction_Operation(), this.getOperation(), null, "operation", null, 0, 1, JCAOutboundInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJCAOutboundInteraction_Processor(), this.getProcessor(), null, "processor", null, 0, 1, JCAOutboundInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJCAOutboundInteraction_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, JCAOutboundInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJCAOutboundInteraction_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, JCAOutboundInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOperation_InteractionSpec(), this.getInteractionSpec(), null, "interactionSpec", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperation_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperation_Name(), theXMLTypePackage.getNMTOKEN(), "name", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperation_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProcessor_Property(), this.getProperty(), null, "property", null, 0, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcessor_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcessor_Type(), theXMLTypePackage.getNMTOKEN(), "type", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcessor_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProperty_Name(), theXMLTypePackage.getNCName(), "name", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProperty_Value(), theXMLTypePackage.getAnySimpleType(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(resourceAdapterEClass, ResourceAdapter.class, "ResourceAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getResourceAdapter_Property(), this.getProperty(), null, "property", null, 0, -1, ResourceAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResourceAdapter_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ResourceAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResourceAdapter_Name(), theXMLTypePackage.getNMTOKEN(), "name", null, 0, 1, ResourceAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResourceAdapter_Type(), theXMLTypePackage.getNMTOKEN(), "type", null, 0, 1, ResourceAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResourceAdapter_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ResourceAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingJca(), this.getJCABinding(), null, "bindingJca", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_ContextMapper(), this.getJCAContextMapperType(), null, "contextMapper", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_MessageComposer(), this.getJCAMessageComposerType(), null, "messageComposer", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(jcaContextMapperTypeEClass, JCAContextMapperType.class, "JCAContextMapperType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(jcaMessageComposerTypeEClass, JCAMessageComposerType.class, "JCAMessageComposerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(batchCommitEClass, BatchCommit.class, "BatchCommit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBatchCommit_BatchSize(), theXMLTypePackage.getString(), "batchSize", null, 1, 1, BatchCommit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBatchCommit_BatchTimeout(), theXMLTypePackage.getString(), "batchTimeout", null, 1, 1, BatchCommit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(jcaCreateResourceEEnum, JCACreateResource.class, "JCACreateResource");
        addEEnumLiteral(jcaCreateResourceEEnum, JCACreateResource.ALWAYS);
        addEEnumLiteral(jcaCreateResourceEEnum, JCACreateResource.NEVER);
        addEEnumLiteral(jcaCreateResourceEEnum, JCACreateResource.IF_NOT_EXIST);

        initEEnum(resAuthEEnum, ResAuth.class, "ResAuth");
        addEEnumLiteral(resAuthEEnum, ResAuth.CONTAINER);
        addEEnumLiteral(resAuthEEnum, ResAuth.APPLICATION);

        // Initialize data types
        initEDataType(jcaCreateResourceObjectEDataType, JCACreateResource.class, "JCACreateResourceObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(resAuthObjectEDataType, ResAuth.class, "ResAuthObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
          (activationSpecEClass, 
           source, 
           new String[] {
             "name", "ActivationSpec",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getActivationSpec_Property(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "property",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getActivationSpec_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##other",
             "name", ":1",
             "processing", "lax"
           });		
        addAnnotation
          (getActivationSpec_Create(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "create"
           });		
        addAnnotation
          (getActivationSpec_JndiName(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "jndiName"
           });		
        addAnnotation
          (getActivationSpec_Type(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "type"
           });		
        addAnnotation
          (getActivationSpec_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##other",
             "name", ":5",
             "processing", "lax"
           });		
        addAnnotation
          (connectionEClass, 
           source, 
           new String[] {
             "name", "Connection",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getConnection_Property(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "property",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConnection_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##other",
             "name", ":1",
             "processing", "lax"
           });		
        addAnnotation
          (getConnection_Create(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "create"
           });		
        addAnnotation
          (getConnection_JndiName(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "jndiName"
           });		
        addAnnotation
          (getConnection_Type(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "type"
           });		
        addAnnotation
          (getConnection_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##other",
             "name", ":5",
             "processing", "lax"
           });		
        addAnnotation
          (connectionSpecEClass, 
           source, 
           new String[] {
             "name", "ConnectionSpec",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getConnectionSpec_Property(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "property",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConnectionSpec_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##other",
             "name", ":1",
             "processing", "lax"
           });		
        addAnnotation
          (getConnectionSpec_Type(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "type"
           });		
        addAnnotation
          (getConnectionSpec_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##other",
             "name", ":3",
             "processing", "lax"
           });		
        addAnnotation
          (endpointEClass, 
           source, 
           new String[] {
             "name", "Endpoint",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getEndpoint_Property(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "property",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getEndpoint_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##other",
             "name", ":1",
             "processing", "lax"
           });		
        addAnnotation
          (getEndpoint_Type(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "type"
           });		
        addAnnotation
          (getEndpoint_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##other",
             "name", ":5",
             "processing", "lax"
           });		
        addAnnotation
          (inboundOperationEClass, 
           source, 
           new String[] {
             "name", "InboundOperation",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getInboundOperation_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##other",
             "name", ":0",
             "processing", "lax"
           });		
        addAnnotation
          (getInboundOperation_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getInboundOperation_SelectedOperation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "selectedOperation"
           });		
        addAnnotation
          (getInboundOperation_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##other",
             "name", ":3",
             "processing", "lax"
           });		
        addAnnotation
          (interactionSpecEClass, 
           source, 
           new String[] {
             "name", "InteractionSpec",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getInteractionSpec_Property(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "property",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getInteractionSpec_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##other",
             "name", ":1",
             "processing", "lax"
           });		
        addAnnotation
          (getInteractionSpec_Type(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "type"
           });		
        addAnnotation
          (getInteractionSpec_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##other",
             "name", ":3",
             "processing", "lax"
           });		
        addAnnotation
          (jcaBindingEClass, 
           source, 
           new String[] {
             "name", "JCABinding",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getJCABinding_JndiURL(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "jndiURL"
           });		
        addAnnotation
          (getJCABinding_InitialContextFactory(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "initialContextFactory"
           });		
        addAnnotation
          (getJCABinding_OutboundConnection(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "outboundConnection",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJCABinding_InboundConnection(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "inboundConnection",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJCABinding_InboundInteraction(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "inboundInteraction",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJCABinding_OutboundInteraction(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "outboundInteraction",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJCABinding_Property(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "property",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJCABinding_Extensions(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "extensions",
             "namespace", "http://docs.oasis-open.org/ns/opencsa/sca/200912"
           });		
        addAnnotation
          (jcaInboundConnectionEClass, 
           source, 
           new String[] {
             "name", "JCAInboundConnection",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getJCAInboundConnection_ResourceAdapter(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "resourceAdapter",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJCAInboundConnection_ActivationSpec(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "activationSpec",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJCAInboundConnection_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##other",
             "name", ":2",
             "processing", "lax"
           });		
        addAnnotation
          (getJCAInboundConnection_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##other",
             "name", ":3",
             "processing", "lax"
           });		
        addAnnotation
          (jcaInboundInteractionEClass, 
           source, 
           new String[] {
             "name", "JCAInboundInteraction",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getJCAInboundInteraction_Listener(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "listener",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJCAInboundInteraction_Endpoint(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "endpoint",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJCAInboundInteraction_Transacted(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "transacted",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJCAInboundInteraction_BatchCommit(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "batchCommit",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJCAInboundInteraction_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##other",
             "name", ":4",
             "processing", "lax"
           });		
        addAnnotation
          (getJCAInboundInteraction_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##other",
             "name", ":5",
             "processing", "lax"
           });		
        addAnnotation
          (jcaOutboundConnectionEClass, 
           source, 
           new String[] {
             "name", "JCAOutboundConnection",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getJCAOutboundConnection_ResourceAdapter(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "resourceAdapter",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJCAOutboundConnection_Connection(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "connection",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJCAOutboundConnection_ResAuth(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "resAuth",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJCAOutboundConnection_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##other",
             "name", ":3",
             "processing", "lax"
           });		
        addAnnotation
          (getJCAOutboundConnection_Managed(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "managed"
           });		
        addAnnotation
          (getJCAOutboundConnection_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##other",
             "name", ":5",
             "processing", "lax"
           });		
        addAnnotation
          (jcaOutboundInteractionEClass, 
           source, 
           new String[] {
             "name", "JCAOutboundInteraction",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getJCAOutboundInteraction_ConnectionSpec(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "connectionSpec",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJCAOutboundInteraction_InteractionSpec(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "interactionSpec",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJCAOutboundInteraction_Operation(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "operation",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJCAOutboundInteraction_Processor(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "processor",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJCAOutboundInteraction_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##other",
             "name", ":3",
             "processing", "lax"
           });		
        addAnnotation
          (getJCAOutboundInteraction_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##other",
             "name", ":4",
             "processing", "lax"
           });		
        addAnnotation
          (operationEClass, 
           source, 
           new String[] {
             "name", "Operation",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getOperation_InteractionSpec(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "interactionSpec",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getOperation_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##other",
             "name", ":1",
             "processing", "lax"
           });		
        addAnnotation
          (getOperation_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getOperation_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##other",
             "name", ":3",
             "processing", "lax"
           });		
        addAnnotation
          (processorEClass, 
           source, 
           new String[] {
             "name", "Processor",
             "kind", "empty"
           });		
        addAnnotation
          (getProcessor_Property(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "property",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getProcessor_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##other",
             "name", ":1",
             "processing", "lax"
           });		
        addAnnotation
          (getProcessor_Type(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "type"
           });		
        addAnnotation
          (getProcessor_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##other",
             "name", ":3",
             "processing", "lax"
           });		
        addAnnotation
          (propertyEClass, 
           source, 
           new String[] {
             "name", "Property",
             "kind", "empty"
           });		
        addAnnotation
          (getProperty_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getProperty_Value(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "value"
           });		
        addAnnotation
          (resourceAdapterEClass, 
           source, 
           new String[] {
             "name", "ResourceAdapter",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getResourceAdapter_Property(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "property",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getResourceAdapter_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##other",
             "name", ":1",
             "processing", "lax"
           });		
        addAnnotation
          (getResourceAdapter_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getResourceAdapter_Type(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "type"
           });		
        addAnnotation
          (getResourceAdapter_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##other",
             "name", ":4",
             "processing", "lax"
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
          (getDocumentRoot_BindingJca(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.jca",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (getDocumentRoot_ContextMapper(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "contextMapper",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#contextMapper"
           });		
        addAnnotation
          (getDocumentRoot_MessageComposer(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "messageComposer",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#messageComposer"
           });		
        addAnnotation
          (jcaCreateResourceEEnum, 
           source, 
           new String[] {
             "name", "JCACreateResource"
           });		
        addAnnotation
          (jcaCreateResourceObjectEDataType, 
           source, 
           new String[] {
             "name", "JCACreateResource:Object",
             "baseType", "JCACreateResource"
           });		
        addAnnotation
          (resAuthEEnum, 
           source, 
           new String[] {
             "name", "ResAuth"
           });		
        addAnnotation
          (resAuthObjectEDataType, 
           source, 
           new String[] {
             "name", "ResAuth:Object",
             "baseType", "ResAuth"
           });		
        addAnnotation
          (jcaContextMapperTypeEClass, 
           source, 
           new String[] {
             "name", "ContextMapperType",
             "kind", "empty",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (jcaMessageComposerTypeEClass, 
           source, 
           new String[] {
             "name", "MessageComposerType",
             "kind", "empty",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (batchCommitEClass, 
           source, 
           new String[] {
             "name", "batchCommit",
             "kind", "empty"
           });		
        addAnnotation
          (getBatchCommit_BatchSize(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "batchSize"
           });		
        addAnnotation
          (getBatchCommit_BatchTimeout(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "batchTimeout"
           });
    }

} //JcaPackageImpl
