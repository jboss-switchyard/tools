/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

import org.switchyard.tools.models.switchyard1_0.bean.BeanPackage;
import org.switchyard.tools.models.switchyard1_0.bean.impl.BeanPackageImpl;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMFactory;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMOperationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.ChannelType;
import org.switchyard.tools.models.switchyard1_0.bpm.ChannelsType;
import org.switchyard.tools.models.switchyard1_0.bpm.ContainerType;
import org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.bpm.ExtraJaxbClassesType;
import org.switchyard.tools.models.switchyard1_0.bpm.FaultsType;
import org.switchyard.tools.models.switchyard1_0.bpm.GlobalsType;
import org.switchyard.tools.models.switchyard1_0.bpm.InputMappingType;
import org.switchyard.tools.models.switchyard1_0.bpm.InputsType;
import org.switchyard.tools.models.switchyard1_0.bpm.ListenerType;
import org.switchyard.tools.models.switchyard1_0.bpm.ListenersType;
import org.switchyard.tools.models.switchyard1_0.bpm.LoggerType;
import org.switchyard.tools.models.switchyard1_0.bpm.LoggerType1;
import org.switchyard.tools.models.switchyard1_0.bpm.LoggersType;
import org.switchyard.tools.models.switchyard1_0.bpm.ManifestType;
import org.switchyard.tools.models.switchyard1_0.bpm.MappingType;
import org.switchyard.tools.models.switchyard1_0.bpm.OperationType;
import org.switchyard.tools.models.switchyard1_0.bpm.OperationsType;
import org.switchyard.tools.models.switchyard1_0.bpm.OutputsType;
import org.switchyard.tools.models.switchyard1_0.bpm.PropertiesType;
import org.switchyard.tools.models.switchyard1_0.bpm.PropertyType;
import org.switchyard.tools.models.switchyard1_0.bpm.RemoteJmsType;
import org.switchyard.tools.models.switchyard1_0.bpm.RemoteRestType;
import org.switchyard.tools.models.switchyard1_0.bpm.RemoteType;
import org.switchyard.tools.models.switchyard1_0.bpm.ResourceDetailType;
import org.switchyard.tools.models.switchyard1_0.bpm.ResourceType;
import org.switchyard.tools.models.switchyard1_0.bpm.ResourcesType;
import org.switchyard.tools.models.switchyard1_0.bpm.UserGroupCallbackType;
import org.switchyard.tools.models.switchyard1_0.bpm.WorkItemHandlerType;
import org.switchyard.tools.models.switchyard1_0.bpm.WorkItemHandlersType;
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
public class BPMPackageImpl extends EPackageImpl implements BPMPackage {
	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass operationsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bpmOperationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bpmImplementationTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass channelsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass channelTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass containerTypeEClass = null;

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
    private EClass extraJaxbClassesTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass globalsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass inputMappingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass inputsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass listenersTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass listenerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass loggersTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass loggerType1EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass manifestTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mappingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass outputsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertiesTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass remoteJmsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass remoteRestTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass remoteTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resourceDetailTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resourcesTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass resourceTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass workItemHandlersTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass workItemHandlerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass userGroupCallbackTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass faultsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum operationTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum loggerTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType operationTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType loggerTypeObjectEDataType = null;

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
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private BPMPackageImpl() {
        super(eNS_URI, BPMFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link BPMPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static BPMPackage init() {
        if (isInited) return (BPMPackage)EPackage.Registry.INSTANCE.getEPackage(BPMPackage.eNS_URI);

        // Obtain or create and register package
        BPMPackageImpl theBPMPackage = (BPMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BPMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BPMPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        ScaPackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        BeanPackageImpl theBeanPackage = (BeanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI) instanceof BeanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI) : BeanPackage.eINSTANCE);
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
        MqttPackageImpl theMqttPackage = (MqttPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MqttPackage.eNS_URI) instanceof MqttPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MqttPackage.eNS_URI) : MqttPackage.eINSTANCE);
        CxfPackageImpl theCxfPackage = (CxfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CxfPackage.eNS_URI) instanceof CxfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CxfPackage.eNS_URI) : CxfPackage.eINSTANCE);

        // Load packages
        theSpringPackage.loadPackage();

        // Create package meta-data objects
        theBPMPackage.createPackageContents();
        theBeanPackage.createPackageContents();
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
        theMqttPackage.createPackageContents();
        theCxfPackage.createPackageContents();

        // Initialize created meta-data
        theBPMPackage.initializePackageContents();
        theBeanPackage.initializePackageContents();
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
        theMqttPackage.initializePackageContents();
        theCxfPackage.initializePackageContents();

        // Fix loaded packages
        theSpringPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theBPMPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(BPMPackage.eNS_URI, theBPMPackage);
        return theBPMPackage;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOperationsType() {
        return operationsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperationsType_Operation() {
        return (EReference)operationsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBPMOperationType() {
        return bpmOperationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMOperationType_Globals() {
        return (EReference)bpmOperationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMOperationType_Inputs() {
        return (EReference)bpmOperationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMOperationType_Outputs() {
        return (EReference)bpmOperationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMOperationType_Faults() {
        return (EReference)bpmOperationTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBPMOperationType_EventId() {
        return (EAttribute)bpmOperationTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBPMOperationType_Name() {
        return (EAttribute)bpmOperationTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBPMOperationType_Type() {
        return (EAttribute)bpmOperationTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBPMImplementationType() {
        return bpmImplementationTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMImplementationType_Channels() {
        return (EReference)bpmImplementationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMImplementationType_Listeners() {
        return (EReference)bpmImplementationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMImplementationType_Loggers() {
        return (EReference)bpmImplementationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMImplementationType_Manifest() {
        return (EReference)bpmImplementationTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMImplementationType_Operations() {
        return (EReference)bpmImplementationTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMImplementationType_Properties() {
        return (EReference)bpmImplementationTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMImplementationType_UserGroupCallback() {
        return (EReference)bpmImplementationTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMImplementationType_WorkItemHandlers() {
        return (EReference)bpmImplementationTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBPMImplementationType_ProcessId() {
        return (EAttribute)bpmImplementationTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBPMImplementationType_Persistent() {
        return (EAttribute)bpmImplementationTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getChannelsType() {
        return channelsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChannelsType_Channel() {
        return (EReference)channelsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getChannelType() {
        return channelTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChannelType_Class() {
        return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChannelType_Name() {
        return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChannelType_Operation() {
        return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChannelType_Reference() {
        return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContainerType() {
        return containerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getContainerType_BaseName() {
        return (EAttribute)containerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getContainerType_ReleaseId() {
        return (EAttribute)containerTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getContainerType_Scan() {
        return (EAttribute)containerTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getContainerType_ScanInterval() {
        return (EAttribute)containerTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getContainerType_SessionName() {
        return (EAttribute)containerTypeEClass.getEStructuralFeatures().get(4);
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
    public EReference getDocumentRoot_Operation() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Operations() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Channel() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Channels() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Container() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ExtraJaxbClasses() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Global() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Globals() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ImplementationBpm() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Input() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Inputs() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Listener() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Listeners() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Logger() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Loggers() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Manifest() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Output() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Outputs() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Properties() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Property() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Remote() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_RemoteJms() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_RemoteRest() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Resource() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ResourceDetail() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Resources() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_WorkItemHandler() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_WorkItemHandlers() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExtraJaxbClassesType() {
        return extraJaxbClassesTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtraJaxbClassesType_ExtraJaxbClass() {
        return (EAttribute)extraJaxbClassesTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_UserGroupCallback() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Faults() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Fault() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGlobalsType() {
        return globalsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGlobalsType_Global() {
        return (EReference)globalsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInputMappingType() {
        return inputMappingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInputMappingType_Output() {
        return (EAttribute)inputMappingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInputsType() {
        return inputsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInputsType_Input() {
        return (EReference)inputsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getListenersType() {
        return listenersTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getListenersType_Listener() {
        return (EReference)listenersTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getListenerType() {
        return listenerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getListenerType_Class() {
        return (EAttribute)listenerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLoggersType() {
        return loggersTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLoggersType_Logger() {
        return (EReference)loggersTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLoggerType1() {
        return loggerType1EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLoggerType1_Interval() {
        return (EAttribute)loggerType1EClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLoggerType1_Log() {
        return (EAttribute)loggerType1EClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLoggerType1_Type() {
        return (EAttribute)loggerType1EClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getManifestType() {
        return manifestTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getManifestType_Container() {
        return (EReference)manifestTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getManifestType_Resources() {
        return (EReference)manifestTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getManifestType_RemoteJms() {
        return (EReference)manifestTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getManifestType_RemoteRest() {
        return (EReference)manifestTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMappingType() {
        return mappingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMappingType_From() {
        return (EAttribute)mappingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMappingType_To() {
        return (EAttribute)mappingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOutputsType() {
        return outputsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOutputsType_Output() {
        return (EReference)outputsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPropertiesType() {
        return propertiesTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPropertiesType_Property() {
        return (EReference)propertiesTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertiesType_Load() {
        return (EAttribute)propertiesTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPropertyType() {
        return propertyTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertyType_Name() {
        return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertyType_Value() {
        return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRemoteJmsType() {
        return remoteJmsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteJmsType_HostName() {
        return (EAttribute)remoteJmsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteJmsType_KeystoreLocation() {
        return (EAttribute)remoteJmsTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteJmsType_KeystorePassword() {
        return (EAttribute)remoteJmsTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteJmsType_MessagingPort() {
        return (EAttribute)remoteJmsTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteJmsType_RemotingPort() {
        return (EAttribute)remoteJmsTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteJmsType_TruststoreLocation() {
        return (EAttribute)remoteJmsTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteJmsType_TruststorePassword() {
        return (EAttribute)remoteJmsTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteJmsType_UseSsl() {
        return (EAttribute)remoteJmsTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRemoteRestType() {
        return remoteRestTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteRestType_Url() {
        return (EAttribute)remoteRestTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteRestType_UseFormBasedAuth() {
        return (EAttribute)remoteRestTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRemoteType() {
        return remoteTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRemoteType_ExtraJaxbClasses() {
        return (EReference)remoteTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteType_DeploymentId() {
        return (EAttribute)remoteTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteType_Password() {
        return (EAttribute)remoteTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteType_Timeout() {
        return (EAttribute)remoteTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteType_UserName() {
        return (EAttribute)remoteTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResourceDetailType() {
        return resourceDetailTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResourceDetailType_InputType() {
        return (EAttribute)resourceDetailTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResourceDetailType_UsingExternalTypes() {
        return (EAttribute)resourceDetailTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResourceDetailType_WorksheetName() {
        return (EAttribute)resourceDetailTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResourcesType() {
        return resourcesTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getResourcesType_Resource() {
        return (EReference)resourcesTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getResourceType() {
        return resourceTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getResourceType_ResourceDetail() {
        return (EReference)resourceTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResourceType_Location() {
        return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResourceType_Type() {
        return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWorkItemHandlersType() {
        return workItemHandlersTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWorkItemHandlersType_WorkItemHandler() {
        return (EReference)workItemHandlersTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWorkItemHandlerType() {
        return workItemHandlerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWorkItemHandlerType_Class() {
        return (EAttribute)workItemHandlerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWorkItemHandlerType_Name() {
        return (EAttribute)workItemHandlerTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUserGroupCallbackType() {
        return userGroupCallbackTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUserGroupCallbackType_Properties() {
        return (EReference)userGroupCallbackTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUserGroupCallbackType_Class() {
        return (EAttribute)userGroupCallbackTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFaultsType() {
        return faultsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFaultsType_Fault() {
        return (EReference)faultsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getOperationType() {
        return operationTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getLoggerType() {
        return loggerTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getOperationTypeObject() {
        return operationTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getLoggerTypeObject() {
        return loggerTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BPMFactory getBPMFactory() {
        return (BPMFactory)getEFactoryInstance();
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
        bpmImplementationTypeEClass = createEClass(BPM_IMPLEMENTATION_TYPE);
        createEReference(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__CHANNELS);
        createEReference(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__LISTENERS);
        createEReference(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__LOGGERS);
        createEReference(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__MANIFEST);
        createEReference(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__OPERATIONS);
        createEReference(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__PROPERTIES);
        createEReference(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__USER_GROUP_CALLBACK);
        createEReference(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__WORK_ITEM_HANDLERS);
        createEAttribute(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__PERSISTENT);
        createEAttribute(bpmImplementationTypeEClass, BPM_IMPLEMENTATION_TYPE__PROCESS_ID);

        channelsTypeEClass = createEClass(CHANNELS_TYPE);
        createEReference(channelsTypeEClass, CHANNELS_TYPE__CHANNEL);

        channelTypeEClass = createEClass(CHANNEL_TYPE);
        createEAttribute(channelTypeEClass, CHANNEL_TYPE__CLASS);
        createEAttribute(channelTypeEClass, CHANNEL_TYPE__NAME);
        createEAttribute(channelTypeEClass, CHANNEL_TYPE__OPERATION);
        createEAttribute(channelTypeEClass, CHANNEL_TYPE__REFERENCE);

        containerTypeEClass = createEClass(CONTAINER_TYPE);
        createEAttribute(containerTypeEClass, CONTAINER_TYPE__BASE_NAME);
        createEAttribute(containerTypeEClass, CONTAINER_TYPE__RELEASE_ID);
        createEAttribute(containerTypeEClass, CONTAINER_TYPE__SCAN);
        createEAttribute(containerTypeEClass, CONTAINER_TYPE__SCAN_INTERVAL);
        createEAttribute(containerTypeEClass, CONTAINER_TYPE__SESSION_NAME);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__CHANNEL);
        createEReference(documentRootEClass, DOCUMENT_ROOT__CHANNELS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__CONTAINER);
        createEReference(documentRootEClass, DOCUMENT_ROOT__EXTRA_JAXB_CLASSES);
        createEReference(documentRootEClass, DOCUMENT_ROOT__FAULT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__FAULTS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__GLOBAL);
        createEReference(documentRootEClass, DOCUMENT_ROOT__GLOBALS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__IMPLEMENTATION_BPM);
        createEReference(documentRootEClass, DOCUMENT_ROOT__INPUT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__INPUTS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__LISTENER);
        createEReference(documentRootEClass, DOCUMENT_ROOT__LISTENERS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__LOGGER);
        createEReference(documentRootEClass, DOCUMENT_ROOT__LOGGERS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__MANIFEST);
        createEReference(documentRootEClass, DOCUMENT_ROOT__OPERATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__OPERATIONS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__OUTPUT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__OUTPUTS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTIES);
        createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY);
        createEReference(documentRootEClass, DOCUMENT_ROOT__REMOTE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__REMOTE_JMS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__REMOTE_REST);
        createEReference(documentRootEClass, DOCUMENT_ROOT__RESOURCE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__RESOURCE_DETAIL);
        createEReference(documentRootEClass, DOCUMENT_ROOT__RESOURCES);
        createEReference(documentRootEClass, DOCUMENT_ROOT__USER_GROUP_CALLBACK);
        createEReference(documentRootEClass, DOCUMENT_ROOT__WORK_ITEM_HANDLER);
        createEReference(documentRootEClass, DOCUMENT_ROOT__WORK_ITEM_HANDLERS);

        extraJaxbClassesTypeEClass = createEClass(EXTRA_JAXB_CLASSES_TYPE);
        createEAttribute(extraJaxbClassesTypeEClass, EXTRA_JAXB_CLASSES_TYPE__EXTRA_JAXB_CLASS);

        faultsTypeEClass = createEClass(FAULTS_TYPE);
        createEReference(faultsTypeEClass, FAULTS_TYPE__FAULT);

        globalsTypeEClass = createEClass(GLOBALS_TYPE);
        createEReference(globalsTypeEClass, GLOBALS_TYPE__GLOBAL);

        inputMappingTypeEClass = createEClass(INPUT_MAPPING_TYPE);
        createEAttribute(inputMappingTypeEClass, INPUT_MAPPING_TYPE__OUTPUT);

        inputsTypeEClass = createEClass(INPUTS_TYPE);
        createEReference(inputsTypeEClass, INPUTS_TYPE__INPUT);

        listenersTypeEClass = createEClass(LISTENERS_TYPE);
        createEReference(listenersTypeEClass, LISTENERS_TYPE__LISTENER);

        listenerTypeEClass = createEClass(LISTENER_TYPE);
        createEAttribute(listenerTypeEClass, LISTENER_TYPE__CLASS);

        loggersTypeEClass = createEClass(LOGGERS_TYPE);
        createEReference(loggersTypeEClass, LOGGERS_TYPE__LOGGER);

        loggerType1EClass = createEClass(LOGGER_TYPE1);
        createEAttribute(loggerType1EClass, LOGGER_TYPE1__INTERVAL);
        createEAttribute(loggerType1EClass, LOGGER_TYPE1__LOG);
        createEAttribute(loggerType1EClass, LOGGER_TYPE1__TYPE);

        manifestTypeEClass = createEClass(MANIFEST_TYPE);
        createEReference(manifestTypeEClass, MANIFEST_TYPE__CONTAINER);
        createEReference(manifestTypeEClass, MANIFEST_TYPE__RESOURCES);
        createEReference(manifestTypeEClass, MANIFEST_TYPE__REMOTE_JMS);
        createEReference(manifestTypeEClass, MANIFEST_TYPE__REMOTE_REST);

        mappingTypeEClass = createEClass(MAPPING_TYPE);
        createEAttribute(mappingTypeEClass, MAPPING_TYPE__FROM);
        createEAttribute(mappingTypeEClass, MAPPING_TYPE__TO);

        operationsTypeEClass = createEClass(OPERATIONS_TYPE);
        createEReference(operationsTypeEClass, OPERATIONS_TYPE__OPERATION);

        bpmOperationTypeEClass = createEClass(BPM_OPERATION_TYPE);
        createEReference(bpmOperationTypeEClass, BPM_OPERATION_TYPE__GLOBALS);
        createEReference(bpmOperationTypeEClass, BPM_OPERATION_TYPE__INPUTS);
        createEReference(bpmOperationTypeEClass, BPM_OPERATION_TYPE__OUTPUTS);
        createEReference(bpmOperationTypeEClass, BPM_OPERATION_TYPE__FAULTS);
        createEAttribute(bpmOperationTypeEClass, BPM_OPERATION_TYPE__EVENT_ID);
        createEAttribute(bpmOperationTypeEClass, BPM_OPERATION_TYPE__NAME);
        createEAttribute(bpmOperationTypeEClass, BPM_OPERATION_TYPE__TYPE);

        outputsTypeEClass = createEClass(OUTPUTS_TYPE);
        createEReference(outputsTypeEClass, OUTPUTS_TYPE__OUTPUT);

        propertiesTypeEClass = createEClass(PROPERTIES_TYPE);
        createEReference(propertiesTypeEClass, PROPERTIES_TYPE__PROPERTY);
        createEAttribute(propertiesTypeEClass, PROPERTIES_TYPE__LOAD);

        propertyTypeEClass = createEClass(PROPERTY_TYPE);
        createEAttribute(propertyTypeEClass, PROPERTY_TYPE__NAME);
        createEAttribute(propertyTypeEClass, PROPERTY_TYPE__VALUE);

        remoteJmsTypeEClass = createEClass(REMOTE_JMS_TYPE);
        createEAttribute(remoteJmsTypeEClass, REMOTE_JMS_TYPE__HOST_NAME);
        createEAttribute(remoteJmsTypeEClass, REMOTE_JMS_TYPE__KEYSTORE_LOCATION);
        createEAttribute(remoteJmsTypeEClass, REMOTE_JMS_TYPE__KEYSTORE_PASSWORD);
        createEAttribute(remoteJmsTypeEClass, REMOTE_JMS_TYPE__MESSAGING_PORT);
        createEAttribute(remoteJmsTypeEClass, REMOTE_JMS_TYPE__REMOTING_PORT);
        createEAttribute(remoteJmsTypeEClass, REMOTE_JMS_TYPE__TRUSTSTORE_LOCATION);
        createEAttribute(remoteJmsTypeEClass, REMOTE_JMS_TYPE__TRUSTSTORE_PASSWORD);
        createEAttribute(remoteJmsTypeEClass, REMOTE_JMS_TYPE__USE_SSL);

        remoteRestTypeEClass = createEClass(REMOTE_REST_TYPE);
        createEAttribute(remoteRestTypeEClass, REMOTE_REST_TYPE__URL);
        createEAttribute(remoteRestTypeEClass, REMOTE_REST_TYPE__USE_FORM_BASED_AUTH);

        remoteTypeEClass = createEClass(REMOTE_TYPE);
        createEReference(remoteTypeEClass, REMOTE_TYPE__EXTRA_JAXB_CLASSES);
        createEAttribute(remoteTypeEClass, REMOTE_TYPE__DEPLOYMENT_ID);
        createEAttribute(remoteTypeEClass, REMOTE_TYPE__PASSWORD);
        createEAttribute(remoteTypeEClass, REMOTE_TYPE__TIMEOUT);
        createEAttribute(remoteTypeEClass, REMOTE_TYPE__USER_NAME);

        resourceDetailTypeEClass = createEClass(RESOURCE_DETAIL_TYPE);
        createEAttribute(resourceDetailTypeEClass, RESOURCE_DETAIL_TYPE__INPUT_TYPE);
        createEAttribute(resourceDetailTypeEClass, RESOURCE_DETAIL_TYPE__USING_EXTERNAL_TYPES);
        createEAttribute(resourceDetailTypeEClass, RESOURCE_DETAIL_TYPE__WORKSHEET_NAME);

        resourcesTypeEClass = createEClass(RESOURCES_TYPE);
        createEReference(resourcesTypeEClass, RESOURCES_TYPE__RESOURCE);

        resourceTypeEClass = createEClass(RESOURCE_TYPE);
        createEReference(resourceTypeEClass, RESOURCE_TYPE__RESOURCE_DETAIL);
        createEAttribute(resourceTypeEClass, RESOURCE_TYPE__LOCATION);
        createEAttribute(resourceTypeEClass, RESOURCE_TYPE__TYPE);

        userGroupCallbackTypeEClass = createEClass(USER_GROUP_CALLBACK_TYPE);
        createEReference(userGroupCallbackTypeEClass, USER_GROUP_CALLBACK_TYPE__PROPERTIES);
        createEAttribute(userGroupCallbackTypeEClass, USER_GROUP_CALLBACK_TYPE__CLASS);

        workItemHandlersTypeEClass = createEClass(WORK_ITEM_HANDLERS_TYPE);
        createEReference(workItemHandlersTypeEClass, WORK_ITEM_HANDLERS_TYPE__WORK_ITEM_HANDLER);

        workItemHandlerTypeEClass = createEClass(WORK_ITEM_HANDLER_TYPE);
        createEAttribute(workItemHandlerTypeEClass, WORK_ITEM_HANDLER_TYPE__CLASS);
        createEAttribute(workItemHandlerTypeEClass, WORK_ITEM_HANDLER_TYPE__NAME);

        // Create enums
        loggerTypeEEnum = createEEnum(LOGGER_TYPE);
        operationTypeEEnum = createEEnum(OPERATION_TYPE);

        // Create data types
        loggerTypeObjectEDataType = createEDataType(LOGGER_TYPE_OBJECT);
        operationTypeObjectEDataType = createEDataType(OPERATION_TYPE_OBJECT);
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
        ScaPackage theScaPackage = (ScaPackage)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI);
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
        SwitchyardPackage theSwitchyardPackage = (SwitchyardPackage)EPackage.Registry.INSTANCE.getEPackage(SwitchyardPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        bpmImplementationTypeEClass.getESuperTypes().add(theScaPackage.getImplementation());
        channelsTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        channelTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        containerTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        extraJaxbClassesTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        faultsTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        globalsTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        inputMappingTypeEClass.getESuperTypes().add(this.getMappingType());
        inputsTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        listenersTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        listenerTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        loggersTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        loggerType1EClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        manifestTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        mappingTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        operationsTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        bpmOperationTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        outputsTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        propertiesTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        propertyTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        remoteJmsTypeEClass.getESuperTypes().add(this.getRemoteType());
        remoteRestTypeEClass.getESuperTypes().add(this.getRemoteType());
        remoteTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        resourceDetailTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        resourcesTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        resourceTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        userGroupCallbackTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        workItemHandlersTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        workItemHandlerTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());

        // Initialize classes and features; add operations and parameters
        initEClass(bpmImplementationTypeEClass, BPMImplementationType.class, "BPMImplementationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBPMImplementationType_Channels(), this.getChannelsType(), null, "channels", null, 0, 1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBPMImplementationType_Listeners(), this.getListenersType(), null, "listeners", null, 0, 1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBPMImplementationType_Loggers(), this.getLoggersType(), null, "loggers", null, 0, 1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBPMImplementationType_Manifest(), this.getManifestType(), null, "manifest", null, 0, 1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBPMImplementationType_Operations(), this.getOperationsType(), null, "operations", null, 0, 1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBPMImplementationType_Properties(), this.getPropertiesType(), null, "properties", null, 0, 1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBPMImplementationType_UserGroupCallback(), this.getUserGroupCallbackType(), null, "userGroupCallback", null, 0, 1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBPMImplementationType_WorkItemHandlers(), this.getWorkItemHandlersType(), null, "workItemHandlers", null, 0, 1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBPMImplementationType_Persistent(), theXMLTypePackage.getBoolean(), "persistent", null, 0, 1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBPMImplementationType_ProcessId(), theXMLTypePackage.getString(), "processId", null, 0, 1, BPMImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(channelsTypeEClass, ChannelsType.class, "ChannelsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getChannelsType_Channel(), this.getChannelType(), null, "channel", null, 0, -1, ChannelsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(channelTypeEClass, ChannelType.class, "ChannelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getChannelType_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChannelType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChannelType_Operation(), theXMLTypePackage.getString(), "operation", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChannelType_Reference(), theXMLTypePackage.getString(), "reference", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(containerTypeEClass, ContainerType.class, "ContainerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getContainerType_BaseName(), theXMLTypePackage.getString(), "baseName", null, 0, 1, ContainerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getContainerType_ReleaseId(), theXMLTypePackage.getString(), "releaseId", null, 0, 1, ContainerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getContainerType_Scan(), theXMLTypePackage.getBoolean(), "scan", null, 0, 1, ContainerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getContainerType_ScanInterval(), theXMLTypePackage.getLong(), "scanInterval", "60000", 0, 1, ContainerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getContainerType_SessionName(), theXMLTypePackage.getString(), "sessionName", null, 0, 1, ContainerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Channel(), this.getChannelType(), null, "channel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Channels(), this.getChannelsType(), null, "channels", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Container(), this.getContainerType(), null, "container", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_ExtraJaxbClasses(), this.getExtraJaxbClassesType(), null, "extraJaxbClasses", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Fault(), this.getMappingType(), null, "fault", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Faults(), this.getFaultsType(), null, "faults", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Global(), this.getMappingType(), null, "global", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Globals(), this.getGlobalsType(), null, "globals", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_ImplementationBpm(), this.getBPMImplementationType(), null, "implementationBpm", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Input(), this.getInputMappingType(), null, "input", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Inputs(), this.getInputsType(), null, "inputs", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Listener(), this.getListenerType(), null, "listener", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Listeners(), this.getListenersType(), null, "listeners", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Logger(), this.getLoggerType1(), null, "logger", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Loggers(), this.getLoggersType(), null, "loggers", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Manifest(), this.getManifestType(), null, "manifest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Operation(), this.getBPMOperationType(), null, "operation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Operations(), this.getOperationsType(), null, "operations", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Output(), this.getMappingType(), null, "output", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Outputs(), this.getOutputsType(), null, "outputs", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Properties(), this.getPropertiesType(), null, "properties", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Property(), this.getPropertyType(), null, "property", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Remote(), this.getRemoteType(), null, "remote", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_RemoteJms(), this.getRemoteJmsType(), null, "remoteJms", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_RemoteRest(), this.getRemoteRestType(), null, "remoteRest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Resource(), this.getResourceType(), null, "resource", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_ResourceDetail(), this.getResourceDetailType(), null, "resourceDetail", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Resources(), this.getResourcesType(), null, "resources", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_UserGroupCallback(), this.getUserGroupCallbackType(), null, "userGroupCallback", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_WorkItemHandler(), this.getWorkItemHandlerType(), null, "workItemHandler", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_WorkItemHandlers(), this.getWorkItemHandlersType(), null, "workItemHandlers", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(extraJaxbClassesTypeEClass, ExtraJaxbClassesType.class, "ExtraJaxbClassesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getExtraJaxbClassesType_ExtraJaxbClass(), theXMLTypePackage.getString(), "extraJaxbClass", null, 0, -1, ExtraJaxbClassesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(faultsTypeEClass, FaultsType.class, "FaultsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFaultsType_Fault(), this.getMappingType(), null, "fault", null, 0, -1, FaultsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(globalsTypeEClass, GlobalsType.class, "GlobalsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getGlobalsType_Global(), this.getMappingType(), null, "global", null, 0, -1, GlobalsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(inputMappingTypeEClass, InputMappingType.class, "InputMappingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInputMappingType_Output(), theXMLTypePackage.getString(), "output", null, 0, 1, InputMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(inputsTypeEClass, InputsType.class, "InputsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInputsType_Input(), this.getInputMappingType(), null, "input", null, 0, -1, InputsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(listenersTypeEClass, ListenersType.class, "ListenersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getListenersType_Listener(), this.getListenerType(), null, "listener", null, 0, -1, ListenersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(listenerTypeEClass, ListenerType.class, "ListenerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getListenerType_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, ListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(loggersTypeEClass, LoggersType.class, "LoggersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLoggersType_Logger(), this.getLoggerType1(), null, "logger", null, 0, -1, LoggersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(loggerType1EClass, LoggerType1.class, "LoggerType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLoggerType1_Interval(), theSwitchyardPackage.getPropInteger(), "interval", "1000", 0, 1, LoggerType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLoggerType1_Log(), theXMLTypePackage.getString(), "log", null, 0, 1, LoggerType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLoggerType1_Type(), this.getLoggerType(), "type", "THREADED_FILE", 0, 1, LoggerType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(manifestTypeEClass, ManifestType.class, "ManifestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getManifestType_Container(), this.getContainerType(), null, "container", null, 0, 1, ManifestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getManifestType_Resources(), this.getResourcesType(), null, "resources", null, 0, 1, ManifestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getManifestType_RemoteJms(), this.getRemoteJmsType(), null, "remoteJms", null, 0, 1, ManifestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getManifestType_RemoteRest(), this.getRemoteRestType(), null, "remoteRest", null, 0, 1, ManifestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(mappingTypeEClass, MappingType.class, "MappingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMappingType_From(), theXMLTypePackage.getString(), "from", null, 0, 1, MappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMappingType_To(), theXMLTypePackage.getString(), "to", null, 0, 1, MappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(operationsTypeEClass, OperationsType.class, "OperationsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOperationsType_Operation(), this.getBPMOperationType(), null, "operation", null, 0, -1, OperationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(bpmOperationTypeEClass, BPMOperationType.class, "BPMOperationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBPMOperationType_Globals(), this.getGlobalsType(), null, "globals", null, 0, 1, BPMOperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBPMOperationType_Inputs(), this.getInputsType(), null, "inputs", null, 0, 1, BPMOperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBPMOperationType_Outputs(), this.getOutputsType(), null, "outputs", null, 0, 1, BPMOperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBPMOperationType_Faults(), this.getFaultsType(), null, "faults", null, 0, 1, BPMOperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBPMOperationType_EventId(), theXMLTypePackage.getString(), "eventId", null, 0, 1, BPMOperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBPMOperationType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, BPMOperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBPMOperationType_Type(), this.getOperationType(), "type", null, 0, 1, BPMOperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(outputsTypeEClass, OutputsType.class, "OutputsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOutputsType_Output(), this.getMappingType(), null, "output", null, 0, -1, OutputsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertiesTypeEClass, PropertiesType.class, "PropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPropertiesType_Property(), this.getPropertyType(), null, "property", null, 0, -1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPropertiesType_Load(), theXMLTypePackage.getString(), "load", null, 0, 1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyTypeEClass, PropertyType.class, "PropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPropertyType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPropertyType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(remoteJmsTypeEClass, RemoteJmsType.class, "RemoteJmsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRemoteJmsType_HostName(), theXMLTypePackage.getString(), "hostName", null, 0, 1, RemoteJmsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteJmsType_KeystoreLocation(), theXMLTypePackage.getString(), "keystoreLocation", null, 0, 1, RemoteJmsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteJmsType_KeystorePassword(), theXMLTypePackage.getString(), "keystorePassword", null, 0, 1, RemoteJmsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteJmsType_MessagingPort(), theSwitchyardPackage.getPropInteger(), "messagingPort", null, 0, 1, RemoteJmsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteJmsType_RemotingPort(), theSwitchyardPackage.getPropInteger(), "remotingPort", null, 0, 1, RemoteJmsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteJmsType_TruststoreLocation(), theXMLTypePackage.getString(), "truststoreLocation", null, 0, 1, RemoteJmsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteJmsType_TruststorePassword(), theXMLTypePackage.getString(), "truststorePassword", null, 0, 1, RemoteJmsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteJmsType_UseSsl(), theSwitchyardPackage.getPropBoolean(), "useSsl", null, 0, 1, RemoteJmsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(remoteRestTypeEClass, RemoteRestType.class, "RemoteRestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRemoteRestType_Url(), theXMLTypePackage.getString(), "url", null, 1, 1, RemoteRestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteRestType_UseFormBasedAuth(), theSwitchyardPackage.getPropBoolean(), "useFormBasedAuth", null, 0, 1, RemoteRestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(remoteTypeEClass, RemoteType.class, "RemoteType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRemoteType_ExtraJaxbClasses(), this.getExtraJaxbClassesType(), null, "extraJaxbClasses", null, 0, 1, RemoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteType_DeploymentId(), theXMLTypePackage.getString(), "deploymentId", null, 1, 1, RemoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteType_Password(), theXMLTypePackage.getString(), "password", null, 0, 1, RemoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteType_Timeout(), theSwitchyardPackage.getPropInteger(), "timeout", null, 0, 1, RemoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRemoteType_UserName(), theXMLTypePackage.getString(), "userName", null, 0, 1, RemoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(resourceDetailTypeEClass, ResourceDetailType.class, "ResourceDetailType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getResourceDetailType_InputType(), theXMLTypePackage.getString(), "inputType", null, 1, 1, ResourceDetailType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResourceDetailType_UsingExternalTypes(), theXMLTypePackage.getBoolean(), "usingExternalTypes", "false", 0, 1, ResourceDetailType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResourceDetailType_WorksheetName(), theXMLTypePackage.getString(), "worksheetName", null, 0, 1, ResourceDetailType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(resourcesTypeEClass, ResourcesType.class, "ResourcesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getResourcesType_Resource(), this.getResourceType(), null, "resource", null, 0, -1, ResourcesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(resourceTypeEClass, ResourceType.class, "ResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getResourceType_ResourceDetail(), this.getResourceDetailType(), null, "resourceDetail", null, 0, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResourceType_Location(), theXMLTypePackage.getString(), "location", null, 1, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResourceType_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(userGroupCallbackTypeEClass, UserGroupCallbackType.class, "UserGroupCallbackType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUserGroupCallbackType_Properties(), this.getPropertiesType(), null, "properties", null, 0, 1, UserGroupCallbackType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUserGroupCallbackType_Class(), theXMLTypePackage.getString(), "class", null, 0, 1, UserGroupCallbackType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(workItemHandlersTypeEClass, WorkItemHandlersType.class, "WorkItemHandlersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getWorkItemHandlersType_WorkItemHandler(), this.getWorkItemHandlerType(), null, "workItemHandler", null, 0, -1, WorkItemHandlersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(workItemHandlerTypeEClass, WorkItemHandlerType.class, "WorkItemHandlerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getWorkItemHandlerType_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, WorkItemHandlerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getWorkItemHandlerType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, WorkItemHandlerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(loggerTypeEEnum, LoggerType.class, "LoggerType");
        addEEnumLiteral(loggerTypeEEnum, LoggerType.CONSOLE);
        addEEnumLiteral(loggerTypeEEnum, LoggerType.FILE);
        addEEnumLiteral(loggerTypeEEnum, LoggerType.THREADEDFILE);

        initEEnum(operationTypeEEnum, OperationType.class, "OperationType");
        addEEnumLiteral(operationTypeEEnum, OperationType.STARTPROCESS);
        addEEnumLiteral(operationTypeEEnum, OperationType.SIGNALEVENT);
        addEEnumLiteral(operationTypeEEnum, OperationType.SIGNALEVENTALL);
        addEEnumLiteral(operationTypeEEnum, OperationType.ABORTPROCESSINSTANCE);

        // Initialize data types
        initEDataType(loggerTypeObjectEDataType, LoggerType.class, "LoggerTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(operationTypeObjectEDataType, OperationType.class, "OperationTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
          (bpmImplementationTypeEClass, 
           source, 
           new String[] {
             "name", "BPMImplementationType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getBPMImplementationType_Channels(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "channels",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBPMImplementationType_Listeners(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "listeners",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBPMImplementationType_Loggers(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "loggers",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBPMImplementationType_Manifest(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "manifest",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBPMImplementationType_Operations(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "operations",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBPMImplementationType_Properties(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "properties",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBPMImplementationType_UserGroupCallback(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "userGroupCallback",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBPMImplementationType_WorkItemHandlers(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "workItemHandlers",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBPMImplementationType_Persistent(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "persistent"
           });		
        addAnnotation
          (getBPMImplementationType_ProcessId(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "processId"
           });		
        addAnnotation
          (channelsTypeEClass, 
           source, 
           new String[] {
             "name", "ChannelsType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getChannelsType_Channel(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "channel",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (channelTypeEClass, 
           source, 
           new String[] {
             "name", "ChannelType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getChannelType_Class(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "class"
           });		
        addAnnotation
          (getChannelType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getChannelType_Operation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "operation"
           });		
        addAnnotation
          (getChannelType_Reference(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "reference"
           });		
        addAnnotation
          (containerTypeEClass, 
           source, 
           new String[] {
             "name", "ContainerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getContainerType_BaseName(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "baseName"
           });		
        addAnnotation
          (getContainerType_ReleaseId(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "releaseId"
           });		
        addAnnotation
          (getContainerType_Scan(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "scan"
           });		
        addAnnotation
          (getContainerType_ScanInterval(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "scanInterval"
           });		
        addAnnotation
          (getContainerType_SessionName(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "sessionName"
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
          (getDocumentRoot_Channel(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "channel",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Channels(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "channels",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Container(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "container",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_ExtraJaxbClasses(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "extraJaxbClasses",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Fault(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "fault",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Faults(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "faults",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Global(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "global",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Globals(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "globals",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_ImplementationBpm(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "implementation.bpm",
             "namespace", "##targetNamespace",
             "affiliation", "http://docs.oasis-open.org/ns/opencsa/sca/200912#implementation"
           });		
        addAnnotation
          (getDocumentRoot_Input(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "input",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Inputs(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "inputs",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Listener(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "listener",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Listeners(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "listeners",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Logger(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "logger",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Loggers(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "loggers",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Manifest(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "manifest",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Operation(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "operation",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Operations(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "operations",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Output(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "output",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Outputs(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "outputs",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Properties(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "properties",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Property(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "property",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Remote(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "remote",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_RemoteJms(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "remoteJms",
             "namespace", "##targetNamespace",
             "affiliation", "remote"
           });		
        addAnnotation
          (getDocumentRoot_RemoteRest(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "remoteRest",
             "namespace", "##targetNamespace",
             "affiliation", "remote"
           });		
        addAnnotation
          (getDocumentRoot_Resource(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "resource",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_ResourceDetail(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "resourceDetail",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Resources(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "resources",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_UserGroupCallback(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "userGroupCallback",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_WorkItemHandler(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "workItemHandler",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_WorkItemHandlers(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "workItemHandlers",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (extraJaxbClassesTypeEClass, 
           source, 
           new String[] {
             "name", "ExtraJaxbClassesType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getExtraJaxbClassesType_ExtraJaxbClass(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "extraJaxbClass",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (faultsTypeEClass, 
           source, 
           new String[] {
             "name", "FaultsType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getFaultsType_Fault(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "fault",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (globalsTypeEClass, 
           source, 
           new String[] {
             "name", "GlobalsType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getGlobalsType_Global(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "global",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (inputMappingTypeEClass, 
           source, 
           new String[] {
             "name", "InputMappingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getInputMappingType_Output(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "output"
           });		
        addAnnotation
          (inputsTypeEClass, 
           source, 
           new String[] {
             "name", "InputsType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getInputsType_Input(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "input",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (listenersTypeEClass, 
           source, 
           new String[] {
             "name", "ListenersType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getListenersType_Listener(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "listener",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (listenerTypeEClass, 
           source, 
           new String[] {
             "name", "ListenerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getListenerType_Class(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "class"
           });		
        addAnnotation
          (loggersTypeEClass, 
           source, 
           new String[] {
             "name", "LoggersType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getLoggersType_Logger(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "logger",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (loggerTypeEEnum, 
           source, 
           new String[] {
             "name", "loggerType"
           });		
        addAnnotation
          (loggerType1EClass, 
           source, 
           new String[] {
             "name", "LoggerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getLoggerType1_Interval(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "interval"
           });		
        addAnnotation
          (getLoggerType1_Log(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "log"
           });		
        addAnnotation
          (getLoggerType1_Type(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "type"
           });		
        addAnnotation
          (loggerTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "loggerType:Object",
             "baseType", "loggerType"
           });		
        addAnnotation
          (manifestTypeEClass, 
           source, 
           new String[] {
             "name", "ManifestType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getManifestType_Container(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "container",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getManifestType_Resources(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "resources",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getManifestType_RemoteJms(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "remoteJms",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getManifestType_RemoteRest(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "remoteRest",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (mappingTypeEClass, 
           source, 
           new String[] {
             "name", "MappingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getMappingType_From(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "from"
           });		
        addAnnotation
          (getMappingType_To(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "to"
           });		
        addAnnotation
          (operationsTypeEClass, 
           source, 
           new String[] {
             "name", "OperationsType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getOperationsType_Operation(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "operation",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (operationTypeEEnum, 
           source, 
           new String[] {
             "name", "operationType"
           });		
        addAnnotation
          (bpmOperationTypeEClass, 
           source, 
           new String[] {
             "name", "BPMOperationType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getBPMOperationType_Globals(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "globals",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBPMOperationType_Inputs(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "inputs",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBPMOperationType_Outputs(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "outputs",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBPMOperationType_Faults(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "faults",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBPMOperationType_EventId(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "eventId"
           });		
        addAnnotation
          (getBPMOperationType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getBPMOperationType_Type(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "type"
           });		
        addAnnotation
          (operationTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "operationType:Object",
             "baseType", "operationType"
           });		
        addAnnotation
          (outputsTypeEClass, 
           source, 
           new String[] {
             "name", "OutputsType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getOutputsType_Output(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "output",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (propertiesTypeEClass, 
           source, 
           new String[] {
             "name", "PropertiesType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getPropertiesType_Property(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "property",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getPropertiesType_Load(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "load"
           });		
        addAnnotation
          (propertyTypeEClass, 
           source, 
           new String[] {
             "name", "PropertyType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getPropertyType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getPropertyType_Value(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "value"
           });		
        addAnnotation
          (remoteJmsTypeEClass, 
           source, 
           new String[] {
             "name", "RemoteJmsType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getRemoteJmsType_HostName(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "hostName"
           });		
        addAnnotation
          (getRemoteJmsType_KeystoreLocation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "keystoreLocation"
           });		
        addAnnotation
          (getRemoteJmsType_KeystorePassword(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "keystorePassword"
           });		
        addAnnotation
          (getRemoteJmsType_MessagingPort(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "messagingPort"
           });		
        addAnnotation
          (getRemoteJmsType_RemotingPort(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "remotingPort"
           });		
        addAnnotation
          (getRemoteJmsType_TruststoreLocation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "truststoreLocation"
           });		
        addAnnotation
          (getRemoteJmsType_TruststorePassword(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "truststorePassword"
           });		
        addAnnotation
          (getRemoteJmsType_UseSsl(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "useSsl"
           });		
        addAnnotation
          (remoteRestTypeEClass, 
           source, 
           new String[] {
             "name", "RemoteRestType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getRemoteRestType_Url(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "url"
           });		
        addAnnotation
          (getRemoteRestType_UseFormBasedAuth(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "useFormBasedAuth"
           });		
        addAnnotation
          (remoteTypeEClass, 
           source, 
           new String[] {
             "name", "RemoteType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getRemoteType_ExtraJaxbClasses(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "extraJaxbClasses",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getRemoteType_DeploymentId(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "deploymentId"
           });		
        addAnnotation
          (getRemoteType_Password(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "password"
           });		
        addAnnotation
          (getRemoteType_Timeout(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "timeout"
           });		
        addAnnotation
          (getRemoteType_UserName(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "userName"
           });		
        addAnnotation
          (resourceDetailTypeEClass, 
           source, 
           new String[] {
             "name", "ResourceDetailType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getResourceDetailType_InputType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "inputType"
           });		
        addAnnotation
          (getResourceDetailType_UsingExternalTypes(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "usingExternalTypes"
           });		
        addAnnotation
          (getResourceDetailType_WorksheetName(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "worksheetName"
           });		
        addAnnotation
          (resourcesTypeEClass, 
           source, 
           new String[] {
             "name", "ResourcesType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getResourcesType_Resource(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "resource",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (resourceTypeEClass, 
           source, 
           new String[] {
             "name", "ResourceType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getResourceType_ResourceDetail(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "resourceDetail",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getResourceType_Location(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "location"
           });		
        addAnnotation
          (getResourceType_Type(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "type"
           });		
        addAnnotation
          (userGroupCallbackTypeEClass, 
           source, 
           new String[] {
             "name", "UserGroupCallbackType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getUserGroupCallbackType_Properties(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "properties",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getUserGroupCallbackType_Class(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "class"
           });		
        addAnnotation
          (workItemHandlersTypeEClass, 
           source, 
           new String[] {
             "name", "WorkItemHandlersType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getWorkItemHandlersType_WorkItemHandler(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "workItemHandler",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (workItemHandlerTypeEClass, 
           source, 
           new String[] {
             "name", "WorkItemHandlerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getWorkItemHandlerType_Class(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "class"
           });		
        addAnnotation
          (getWorkItemHandlerType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });
    }

} //BPMPackageImpl
