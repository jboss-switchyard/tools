/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core.impl;

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

import org.switchyard.tools.models.switchyard1_0.camel.amqp.AmqpPackage;

import org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.AmqpPackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage;

import org.switchyard.tools.models.switchyard1_0.camel.atom.impl.AtomPackageImpl;

import org.switchyard.tools.models.switchyard1_0.camel.core.BaseCamelBinding;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelDirectBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelRemoteBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType;
import org.switchyard.tools.models.switchyard1_0.camel.core.JmsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledBatchPollConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.core.TimeUnit;

import org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage;

import org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl;

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
public class CamelPackageImpl extends EPackageImpl implements CamelPackage {
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
    private EClass genericFileBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelRemoteBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scheduledPollConsumerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scheduledBatchPollConsumerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass genericFileConsumerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass genericFileProducerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jmsBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelDirectBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelTimerBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelSedaBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass camelMockBindingTypeEClass = null;

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
    private EEnum timeUnitEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType timeUnitObjectEDataType = null;

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private CamelPackageImpl() {
        super(eNS_URI, CamelFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link CamelPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static CamelPackage init() {
        if (isInited) return (CamelPackage)EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI);

        // Obtain or create and register package
        CamelPackageImpl theCamelPackage = (CamelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CamelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CamelPackageImpl());

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
        AmqpPackageImpl theAmqpPackage = (AmqpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AmqpPackage.eNS_URI) instanceof AmqpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AmqpPackage.eNS_URI) : AmqpPackage.eINSTANCE);
        AtomPackageImpl theAtomPackage = (AtomPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AtomPackage.eNS_URI) instanceof AtomPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AtomPackage.eNS_URI) : AtomPackage.eINSTANCE);
        FilePackageImpl theFilePackage = (FilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI) instanceof FilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI) : FilePackage.eINSTANCE);

        // Load packages
        theSpringPackage.loadPackage();

        // Create package meta-data objects
        theCamelPackage.createPackageContents();
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
        theAmqpPackage.createPackageContents();
        theAtomPackage.createPackageContents();
        theFilePackage.createPackageContents();

        // Initialize created meta-data
        theCamelPackage.initializePackageContents();
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
        theAmqpPackage.initializePackageContents();
        theAtomPackage.initializePackageContents();
        theFilePackage.initializePackageContents();

        // Fix loaded packages
        theSpringPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theCamelPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(CamelPackage.eNS_URI, theCamelPackage);
        return theCamelPackage;
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
    public EClass getGenericFileBindingType() {
        return genericFileBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileBindingType_Directory() {
        return (EAttribute)genericFileBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileBindingType_AutoCreate() {
        return (EAttribute)genericFileBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileBindingType_BufferSize() {
        return (EAttribute)genericFileBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileBindingType_FileName() {
        return (EAttribute)genericFileBindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileBindingType_Flatten() {
        return (EAttribute)genericFileBindingTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileBindingType_Charset() {
        return (EAttribute)genericFileBindingTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelRemoteBindingType() {
        return camelRemoteBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_Host() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_Port() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_Username() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_Password() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_Binary() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_ConnectTimeout() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_Disconnect() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_MaximumReconnectAttempts() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_ReconnectDelay() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_Separator() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_Stepwise() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelRemoteBindingType_ThrowExceptionOnConnectFailed() {
        return (EAttribute)camelRemoteBindingTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getScheduledPollConsumerType() {
        return scheduledPollConsumerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScheduledPollConsumerType_InitialDelay() {
        return (EAttribute)scheduledPollConsumerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScheduledPollConsumerType_Delay() {
        return (EAttribute)scheduledPollConsumerTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScheduledPollConsumerType_UseFixedDelay() {
        return (EAttribute)scheduledPollConsumerTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScheduledPollConsumerType_SendEmptyMessageWhenIdle() {
        return (EAttribute)scheduledPollConsumerTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScheduledPollConsumerType_TimeUnit() {
        return (EAttribute)scheduledPollConsumerTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getScheduledBatchPollConsumerType() {
        return scheduledBatchPollConsumerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScheduledBatchPollConsumerType_MaxMessagesPerPoll() {
        return (EAttribute)scheduledBatchPollConsumerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGenericFileConsumerType() {
        return genericFileConsumerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_Delete() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_Recursive() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_Noop() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_PreMove() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_Move() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_MoveFailed() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_Include() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_Exclude() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_Idempotent() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_IdempotentRepository() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_InProgressRepository() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_Filter() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_Sorter() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_SortBy() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_ReadLock() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_ReadLockTimeout() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_ReadLockCheckInterval() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_ExclusiveReadLockStrategy() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_ProcessStrategy() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_StartingDirectoryMustExist() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_DirectoryMustExist() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileConsumerType_DoneFileName() {
        return (EAttribute)genericFileConsumerTypeEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGenericFileProducerType() {
        return genericFileProducerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileProducerType_FileExist() {
        return (EAttribute)genericFileProducerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileProducerType_TempPrefix() {
        return (EAttribute)genericFileProducerTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileProducerType_TempFileName() {
        return (EAttribute)genericFileProducerTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileProducerType_KeepLastModified() {
        return (EAttribute)genericFileProducerTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileProducerType_EagerDeleteTargetFile() {
        return (EAttribute)genericFileProducerTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericFileProducerType_DoneFileName() {
        return (EAttribute)genericFileProducerTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJmsBindingType() {
        return jmsBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_Queue() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_Topic() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_ConnectionFactory() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_Username() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_Password() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_ClientId() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_DurableSubscriptionName() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_ConcurrentConsumers() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_MaxConcurrentConsumers() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_DisableReplyTo() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_PreserveMessageQos() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_DeliveryPersistent() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_Priority() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_ExplicitQosEnabled() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_ReplyTo() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_ReplyToType() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_RequestTimeout() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_Selector() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_TimeToLive() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_Transacted() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJmsBindingType_TransactionManager() {
        return (EAttribute)jmsBindingTypeEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelBindingType() {
        return camelBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelBindingType_ConfigURI() {
        return (EAttribute)camelBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelDirectBindingType() {
        return camelDirectBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelDirectBindingType_NameElement() {
        return (EAttribute)camelDirectBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelTimerBindingType() {
        return camelTimerBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelTimerBindingType_CamelBindingName() {
        return (EAttribute)camelTimerBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelTimerBindingType_Time() {
        return (EAttribute)camelTimerBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelTimerBindingType_Pattern() {
        return (EAttribute)camelTimerBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelTimerBindingType_Period() {
        return (EAttribute)camelTimerBindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelTimerBindingType_Delay() {
        return (EAttribute)camelTimerBindingTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelTimerBindingType_FixedRate() {
        return (EAttribute)camelTimerBindingTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelTimerBindingType_Daemon() {
        return (EAttribute)camelTimerBindingTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelSedaBindingType() {
        return camelSedaBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSedaBindingType_NameElement() {
        return (EAttribute)camelSedaBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSedaBindingType_Size() {
        return (EAttribute)camelSedaBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSedaBindingType_ConcurrentConsumers() {
        return (EAttribute)camelSedaBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSedaBindingType_WaitForTaskToComplete() {
        return (EAttribute)camelSedaBindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSedaBindingType_Timeout() {
        return (EAttribute)camelSedaBindingTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSedaBindingType_MultipleConsumers() {
        return (EAttribute)camelSedaBindingTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelSedaBindingType_LimitConcurrentConsumers() {
        return (EAttribute)camelSedaBindingTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCamelMockBindingType() {
        return camelMockBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMockBindingType_NameElement() {
        return (EAttribute)camelMockBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelMockBindingType_ReportGroup() {
        return (EAttribute)camelMockBindingTypeEClass.getEStructuralFeatures().get(1);
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
    public EReference getDocumentRoot_BindingCamel() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BindingDirect() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BindingJms() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BindingMock() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BindingSeda() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BindingTimer() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTimeUnit() {
        return timeUnitEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTimeUnitObject() {
        return timeUnitObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelFactory getCamelFactory() {
        return (CamelFactory)getEFactoryInstance();
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

        genericFileBindingTypeEClass = createEClass(GENERIC_FILE_BINDING_TYPE);
        createEAttribute(genericFileBindingTypeEClass, GENERIC_FILE_BINDING_TYPE__DIRECTORY);
        createEAttribute(genericFileBindingTypeEClass, GENERIC_FILE_BINDING_TYPE__AUTO_CREATE);
        createEAttribute(genericFileBindingTypeEClass, GENERIC_FILE_BINDING_TYPE__BUFFER_SIZE);
        createEAttribute(genericFileBindingTypeEClass, GENERIC_FILE_BINDING_TYPE__FILE_NAME);
        createEAttribute(genericFileBindingTypeEClass, GENERIC_FILE_BINDING_TYPE__FLATTEN);
        createEAttribute(genericFileBindingTypeEClass, GENERIC_FILE_BINDING_TYPE__CHARSET);

        camelRemoteBindingTypeEClass = createEClass(CAMEL_REMOTE_BINDING_TYPE);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__HOST);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__PORT);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__USERNAME);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__PASSWORD);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__BINARY);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__CONNECT_TIMEOUT);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__DISCONNECT);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__RECONNECT_DELAY);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__SEPARATOR);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__STEPWISE);
        createEAttribute(camelRemoteBindingTypeEClass, CAMEL_REMOTE_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED);

        scheduledPollConsumerTypeEClass = createEClass(SCHEDULED_POLL_CONSUMER_TYPE);
        createEAttribute(scheduledPollConsumerTypeEClass, SCHEDULED_POLL_CONSUMER_TYPE__INITIAL_DELAY);
        createEAttribute(scheduledPollConsumerTypeEClass, SCHEDULED_POLL_CONSUMER_TYPE__DELAY);
        createEAttribute(scheduledPollConsumerTypeEClass, SCHEDULED_POLL_CONSUMER_TYPE__USE_FIXED_DELAY);
        createEAttribute(scheduledPollConsumerTypeEClass, SCHEDULED_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE);
        createEAttribute(scheduledPollConsumerTypeEClass, SCHEDULED_POLL_CONSUMER_TYPE__TIME_UNIT);

        scheduledBatchPollConsumerTypeEClass = createEClass(SCHEDULED_BATCH_POLL_CONSUMER_TYPE);
        createEAttribute(scheduledBatchPollConsumerTypeEClass, SCHEDULED_BATCH_POLL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL);

        genericFileConsumerTypeEClass = createEClass(GENERIC_FILE_CONSUMER_TYPE);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__DELETE);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__RECURSIVE);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__NOOP);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__PRE_MOVE);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__MOVE);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__MOVE_FAILED);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__INCLUDE);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__EXCLUDE);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__FILTER);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__SORTER);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__SORT_BY);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__READ_LOCK);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__PROCESS_STRATEGY);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST);
        createEAttribute(genericFileConsumerTypeEClass, GENERIC_FILE_CONSUMER_TYPE__DONE_FILE_NAME);

        genericFileProducerTypeEClass = createEClass(GENERIC_FILE_PRODUCER_TYPE);
        createEAttribute(genericFileProducerTypeEClass, GENERIC_FILE_PRODUCER_TYPE__FILE_EXIST);
        createEAttribute(genericFileProducerTypeEClass, GENERIC_FILE_PRODUCER_TYPE__TEMP_PREFIX);
        createEAttribute(genericFileProducerTypeEClass, GENERIC_FILE_PRODUCER_TYPE__TEMP_FILE_NAME);
        createEAttribute(genericFileProducerTypeEClass, GENERIC_FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED);
        createEAttribute(genericFileProducerTypeEClass, GENERIC_FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE);
        createEAttribute(genericFileProducerTypeEClass, GENERIC_FILE_PRODUCER_TYPE__DONE_FILE_NAME);

        jmsBindingTypeEClass = createEClass(JMS_BINDING_TYPE);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__QUEUE);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__TOPIC);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__CONNECTION_FACTORY);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__USERNAME);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__PASSWORD);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__CLIENT_ID);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__DURABLE_SUBSCRIPTION_NAME);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__CONCURRENT_CONSUMERS);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__DISABLE_REPLY_TO);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__PRESERVE_MESSAGE_QOS);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__DELIVERY_PERSISTENT);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__PRIORITY);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__EXPLICIT_QOS_ENABLED);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__REPLY_TO);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__REPLY_TO_TYPE);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__REQUEST_TIMEOUT);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__SELECTOR);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__TIME_TO_LIVE);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__TRANSACTED);
        createEAttribute(jmsBindingTypeEClass, JMS_BINDING_TYPE__TRANSACTION_MANAGER);

        camelBindingTypeEClass = createEClass(CAMEL_BINDING_TYPE);
        createEAttribute(camelBindingTypeEClass, CAMEL_BINDING_TYPE__CONFIG_URI);

        camelDirectBindingTypeEClass = createEClass(CAMEL_DIRECT_BINDING_TYPE);
        createEAttribute(camelDirectBindingTypeEClass, CAMEL_DIRECT_BINDING_TYPE__NAME_ELEMENT);

        camelTimerBindingTypeEClass = createEClass(CAMEL_TIMER_BINDING_TYPE);
        createEAttribute(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__CAMEL_BINDING_NAME);
        createEAttribute(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__TIME);
        createEAttribute(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__PATTERN);
        createEAttribute(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__PERIOD);
        createEAttribute(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__DELAY);
        createEAttribute(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__FIXED_RATE);
        createEAttribute(camelTimerBindingTypeEClass, CAMEL_TIMER_BINDING_TYPE__DAEMON);

        camelSedaBindingTypeEClass = createEClass(CAMEL_SEDA_BINDING_TYPE);
        createEAttribute(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__NAME_ELEMENT);
        createEAttribute(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__SIZE);
        createEAttribute(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__CONCURRENT_CONSUMERS);
        createEAttribute(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__WAIT_FOR_TASK_TO_COMPLETE);
        createEAttribute(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__TIMEOUT);
        createEAttribute(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__MULTIPLE_CONSUMERS);
        createEAttribute(camelSedaBindingTypeEClass, CAMEL_SEDA_BINDING_TYPE__LIMIT_CONCURRENT_CONSUMERS);

        camelMockBindingTypeEClass = createEClass(CAMEL_MOCK_BINDING_TYPE);
        createEAttribute(camelMockBindingTypeEClass, CAMEL_MOCK_BINDING_TYPE__NAME_ELEMENT);
        createEAttribute(camelMockBindingTypeEClass, CAMEL_MOCK_BINDING_TYPE__REPORT_GROUP);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_CAMEL);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_DIRECT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_JMS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_MOCK);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_SEDA);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_TIMER);

        // Create enums
        timeUnitEEnum = createEEnum(TIME_UNIT);

        // Create data types
        timeUnitObjectEDataType = createEDataType(TIME_UNIT_OBJECT);
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
        genericFileBindingTypeEClass.getESuperTypes().add(this.getBaseCamelBinding());
        camelRemoteBindingTypeEClass.getESuperTypes().add(this.getGenericFileBindingType());
        scheduledBatchPollConsumerTypeEClass.getESuperTypes().add(this.getScheduledPollConsumerType());
        genericFileConsumerTypeEClass.getESuperTypes().add(this.getScheduledBatchPollConsumerType());
        jmsBindingTypeEClass.getESuperTypes().add(this.getBaseCamelBinding());
        camelBindingTypeEClass.getESuperTypes().add(this.getBaseCamelBinding());
        camelDirectBindingTypeEClass.getESuperTypes().add(this.getBaseCamelBinding());
        camelTimerBindingTypeEClass.getESuperTypes().add(this.getBaseCamelBinding());
        camelSedaBindingTypeEClass.getESuperTypes().add(this.getBaseCamelBinding());
        camelMockBindingTypeEClass.getESuperTypes().add(this.getBaseCamelBinding());

        // Initialize classes and features; add operations and parameters
        initEClass(baseCamelBindingEClass, BaseCamelBinding.class, "BaseCamelBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(genericFileBindingTypeEClass, GenericFileBindingType.class, "GenericFileBindingType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGenericFileBindingType_Directory(), theXMLTypePackage.getString(), "directory", null, 1, 1, GenericFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileBindingType_AutoCreate(), theXMLTypePackage.getBooleanObject(), "autoCreate", null, 0, 1, GenericFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileBindingType_BufferSize(), theXMLTypePackage.getIntObject(), "bufferSize", null, 0, 1, GenericFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileBindingType_FileName(), theXMLTypePackage.getString(), "fileName", null, 0, 1, GenericFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileBindingType_Flatten(), theXMLTypePackage.getBooleanObject(), "flatten", null, 0, 1, GenericFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileBindingType_Charset(), theXMLTypePackage.getString(), "charset", null, 0, 1, GenericFileBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelRemoteBindingTypeEClass, CamelRemoteBindingType.class, "CamelRemoteBindingType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelRemoteBindingType_Host(), theXMLTypePackage.getString(), "host", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_Port(), theXMLTypePackage.getIntObject(), "port", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_Username(), theXMLTypePackage.getString(), "username", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_Password(), theXMLTypePackage.getString(), "password", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_Binary(), theXMLTypePackage.getBooleanObject(), "binary", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_ConnectTimeout(), theXMLTypePackage.getIntObject(), "connectTimeout", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_Disconnect(), theXMLTypePackage.getBooleanObject(), "disconnect", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_MaximumReconnectAttempts(), theXMLTypePackage.getIntObject(), "maximumReconnectAttempts", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_ReconnectDelay(), theXMLTypePackage.getIntObject(), "reconnectDelay", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_Separator(), theXMLTypePackage.getString(), "separator", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_Stepwise(), theXMLTypePackage.getBooleanObject(), "stepwise", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelRemoteBindingType_ThrowExceptionOnConnectFailed(), theXMLTypePackage.getBooleanObject(), "throwExceptionOnConnectFailed", null, 0, 1, CamelRemoteBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(scheduledPollConsumerTypeEClass, ScheduledPollConsumerType.class, "ScheduledPollConsumerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getScheduledPollConsumerType_InitialDelay(), theXMLTypePackage.getIntObject(), "initialDelay", null, 0, 1, ScheduledPollConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getScheduledPollConsumerType_Delay(), theXMLTypePackage.getIntObject(), "delay", null, 0, 1, ScheduledPollConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getScheduledPollConsumerType_UseFixedDelay(), theXMLTypePackage.getBooleanObject(), "useFixedDelay", null, 0, 1, ScheduledPollConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getScheduledPollConsumerType_SendEmptyMessageWhenIdle(), theXMLTypePackage.getBooleanObject(), "sendEmptyMessageWhenIdle", null, 0, 1, ScheduledPollConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getScheduledPollConsumerType_TimeUnit(), this.getTimeUnit(), "timeUnit", null, 0, 1, ScheduledPollConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(scheduledBatchPollConsumerTypeEClass, ScheduledBatchPollConsumerType.class, "ScheduledBatchPollConsumerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getScheduledBatchPollConsumerType_MaxMessagesPerPoll(), theXMLTypePackage.getIntObject(), "maxMessagesPerPoll", null, 0, 1, ScheduledBatchPollConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(genericFileConsumerTypeEClass, GenericFileConsumerType.class, "GenericFileConsumerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGenericFileConsumerType_Delete(), theXMLTypePackage.getBooleanObject(), "delete", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_Recursive(), theXMLTypePackage.getBooleanObject(), "recursive", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_Noop(), theXMLTypePackage.getBooleanObject(), "noop", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_PreMove(), theXMLTypePackage.getString(), "preMove", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_Move(), theXMLTypePackage.getString(), "move", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_MoveFailed(), theXMLTypePackage.getString(), "moveFailed", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_Include(), theXMLTypePackage.getString(), "include", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_Exclude(), theXMLTypePackage.getString(), "exclude", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_Idempotent(), theXMLTypePackage.getBooleanObject(), "idempotent", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_IdempotentRepository(), theXMLTypePackage.getString(), "idempotentRepository", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_InProgressRepository(), theXMLTypePackage.getString(), "inProgressRepository", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_Filter(), theXMLTypePackage.getString(), "filter", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_Sorter(), theXMLTypePackage.getString(), "sorter", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_SortBy(), theXMLTypePackage.getString(), "sortBy", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_ReadLock(), theXMLTypePackage.getString(), "readLock", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_ReadLockTimeout(), theXMLTypePackage.getLongObject(), "readLockTimeout", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_ReadLockCheckInterval(), theXMLTypePackage.getInteger(), "readLockCheckInterval", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_ExclusiveReadLockStrategy(), theXMLTypePackage.getString(), "exclusiveReadLockStrategy", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_ProcessStrategy(), theXMLTypePackage.getString(), "processStrategy", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_StartingDirectoryMustExist(), theXMLTypePackage.getBooleanObject(), "startingDirectoryMustExist", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_DirectoryMustExist(), theXMLTypePackage.getBooleanObject(), "directoryMustExist", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileConsumerType_DoneFileName(), theXMLTypePackage.getString(), "doneFileName", null, 0, 1, GenericFileConsumerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(genericFileProducerTypeEClass, GenericFileProducerType.class, "GenericFileProducerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGenericFileProducerType_FileExist(), theXMLTypePackage.getString(), "fileExist", null, 0, 1, GenericFileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileProducerType_TempPrefix(), theXMLTypePackage.getString(), "tempPrefix", null, 0, 1, GenericFileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileProducerType_TempFileName(), theXMLTypePackage.getString(), "tempFileName", null, 0, 1, GenericFileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileProducerType_KeepLastModified(), theXMLTypePackage.getBooleanObject(), "keepLastModified", null, 0, 1, GenericFileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileProducerType_EagerDeleteTargetFile(), theXMLTypePackage.getBooleanObject(), "eagerDeleteTargetFile", null, 0, 1, GenericFileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericFileProducerType_DoneFileName(), theXMLTypePackage.getString(), "doneFileName", null, 0, 1, GenericFileProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(jmsBindingTypeEClass, JmsBindingType.class, "JmsBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getJmsBindingType_Queue(), theXMLTypePackage.getString(), "queue", null, 0, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJmsBindingType_Topic(), theXMLTypePackage.getString(), "topic", null, 0, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJmsBindingType_ConnectionFactory(), theXMLTypePackage.getString(), "connectionFactory", null, 1, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJmsBindingType_Username(), theXMLTypePackage.getString(), "username", null, 0, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJmsBindingType_Password(), theXMLTypePackage.getString(), "password", null, 0, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJmsBindingType_ClientId(), theXMLTypePackage.getString(), "clientId", null, 0, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJmsBindingType_DurableSubscriptionName(), theXMLTypePackage.getString(), "durableSubscriptionName", null, 0, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJmsBindingType_ConcurrentConsumers(), theXMLTypePackage.getIntObject(), "concurrentConsumers", null, 0, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJmsBindingType_MaxConcurrentConsumers(), theXMLTypePackage.getIntObject(), "maxConcurrentConsumers", null, 0, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJmsBindingType_DisableReplyTo(), theXMLTypePackage.getBooleanObject(), "disableReplyTo", null, 0, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJmsBindingType_PreserveMessageQos(), theXMLTypePackage.getBooleanObject(), "preserveMessageQos", null, 0, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJmsBindingType_DeliveryPersistent(), theXMLTypePackage.getBooleanObject(), "deliveryPersistent", null, 0, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJmsBindingType_Priority(), theXMLTypePackage.getIntObject(), "priority", null, 0, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJmsBindingType_ExplicitQosEnabled(), theXMLTypePackage.getBooleanObject(), "explicitQosEnabled", null, 0, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJmsBindingType_ReplyTo(), theXMLTypePackage.getString(), "replyTo", null, 0, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJmsBindingType_ReplyToType(), theXMLTypePackage.getString(), "replyToType", null, 0, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJmsBindingType_RequestTimeout(), theXMLTypePackage.getIntObject(), "requestTimeout", null, 0, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJmsBindingType_Selector(), theXMLTypePackage.getString(), "selector", null, 0, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJmsBindingType_TimeToLive(), theXMLTypePackage.getIntObject(), "timeToLive", null, 0, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJmsBindingType_Transacted(), theXMLTypePackage.getBooleanObject(), "transacted", null, 0, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJmsBindingType_TransactionManager(), theXMLTypePackage.getString(), "transactionManager", null, 0, 1, JmsBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelBindingTypeEClass, CamelBindingType.class, "CamelBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelBindingType_ConfigURI(), theXMLTypePackage.getAnyURI(), "configURI", null, 0, 1, CamelBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelDirectBindingTypeEClass, CamelDirectBindingType.class, "CamelDirectBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelDirectBindingType_NameElement(), theXMLTypePackage.getString(), "nameElement", null, 1, 1, CamelDirectBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelTimerBindingTypeEClass, CamelTimerBindingType.class, "CamelTimerBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelTimerBindingType_CamelBindingName(), theXMLTypePackage.getString(), "camelBindingName", null, 1, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelTimerBindingType_Time(), theXMLTypePackage.getDateTime(), "time", null, 0, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelTimerBindingType_Pattern(), theXMLTypePackage.getString(), "pattern", null, 0, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelTimerBindingType_Period(), theXMLTypePackage.getLongObject(), "period", null, 0, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelTimerBindingType_Delay(), theXMLTypePackage.getLongObject(), "delay", null, 0, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelTimerBindingType_FixedRate(), theXMLTypePackage.getBooleanObject(), "fixedRate", null, 0, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelTimerBindingType_Daemon(), theXMLTypePackage.getBooleanObject(), "daemon", null, 0, 1, CamelTimerBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelSedaBindingTypeEClass, CamelSedaBindingType.class, "CamelSedaBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelSedaBindingType_NameElement(), theXMLTypePackage.getString(), "nameElement", null, 1, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSedaBindingType_Size(), theXMLTypePackage.getInteger(), "size", null, 1, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSedaBindingType_ConcurrentConsumers(), theXMLTypePackage.getInteger(), "concurrentConsumers", null, 1, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSedaBindingType_WaitForTaskToComplete(), theXMLTypePackage.getString(), "waitForTaskToComplete", null, 1, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSedaBindingType_Timeout(), theXMLTypePackage.getLong(), "timeout", null, 1, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSedaBindingType_MultipleConsumers(), theXMLTypePackage.getBoolean(), "multipleConsumers", null, 1, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelSedaBindingType_LimitConcurrentConsumers(), theXMLTypePackage.getBoolean(), "limitConcurrentConsumers", null, 1, 1, CamelSedaBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(camelMockBindingTypeEClass, CamelMockBindingType.class, "CamelMockBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCamelMockBindingType_NameElement(), theXMLTypePackage.getString(), "nameElement", null, 1, 1, CamelMockBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCamelMockBindingType_ReportGroup(), theXMLTypePackage.getIntObject(), "reportGroup", null, 0, 1, CamelMockBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingCamel(), this.getCamelBindingType(), null, "bindingCamel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingDirect(), this.getCamelDirectBindingType(), null, "bindingDirect", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingJms(), this.getJmsBindingType(), null, "bindingJms", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingMock(), this.getCamelMockBindingType(), null, "bindingMock", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingSeda(), this.getCamelSedaBindingType(), null, "bindingSeda", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingTimer(), this.getCamelTimerBindingType(), null, "bindingTimer", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(timeUnitEEnum, TimeUnit.class, "TimeUnit");
        addEEnumLiteral(timeUnitEEnum, TimeUnit.NANOSECONDS);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.MICROSECONDS);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.MILLISECONDS);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.SECONDS);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.MINUTES);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.HOURS);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.DAYS);

        // Initialize data types
        initEDataType(timeUnitObjectEDataType, TimeUnit.class, "TimeUnitObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
          (genericFileBindingTypeEClass, 
           source, 
           new String[] {
             "name", "GenericFileBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getGenericFileBindingType_Directory(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "directory",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileBindingType_AutoCreate(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "autoCreate",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileBindingType_BufferSize(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "bufferSize",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileBindingType_FileName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "fileName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileBindingType_Flatten(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "flatten",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileBindingType_Charset(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "charset",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelRemoteBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelRemoteBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelRemoteBindingType_Host(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "host",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_Port(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "port",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_Username(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "username",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_Password(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "password",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_Binary(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binary",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_ConnectTimeout(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "connectTimeout",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_Disconnect(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "disconnect",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_MaximumReconnectAttempts(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "maximumReconnectAttempts",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_ReconnectDelay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "reconnectDelay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_Separator(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "separator",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_Stepwise(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "stepwise",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelRemoteBindingType_ThrowExceptionOnConnectFailed(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "throwExceptionOnConnectFailed",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (scheduledPollConsumerTypeEClass, 
           source, 
           new String[] {
             "name", "ScheduledPollConsumerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getScheduledPollConsumerType_InitialDelay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "initialDelay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getScheduledPollConsumerType_Delay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "delay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getScheduledPollConsumerType_UseFixedDelay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "useFixedDelay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getScheduledPollConsumerType_SendEmptyMessageWhenIdle(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sendEmptyMessageWhenIdle",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getScheduledPollConsumerType_TimeUnit(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "timeUnit",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (timeUnitEEnum, 
           source, 
           new String[] {
             "name", "TimeUnit"
           });		
        addAnnotation
          (timeUnitObjectEDataType, 
           source, 
           new String[] {
             "name", "TimeUnit:Object",
             "baseType", "TimeUnit"
           });		
        addAnnotation
          (scheduledBatchPollConsumerTypeEClass, 
           source, 
           new String[] {
             "name", "ScheduledBatchPollConsumerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getScheduledBatchPollConsumerType_MaxMessagesPerPoll(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "maxMessagesPerPoll",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (genericFileConsumerTypeEClass, 
           source, 
           new String[] {
             "name", "GenericFileConsumerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getGenericFileConsumerType_Delete(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "delete",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_Recursive(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "recursive",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_Noop(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "noop",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_PreMove(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "preMove",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_Move(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "move",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_MoveFailed(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "moveFailed",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_Include(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "include",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_Exclude(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "exclude",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_Idempotent(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idempotent",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_IdempotentRepository(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "idempotentRepository",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_InProgressRepository(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "inProgressRepository",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_Filter(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "filter",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_Sorter(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sorter",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_SortBy(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sortBy",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_ReadLock(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "readLock",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_ReadLockTimeout(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "readLockTimeout",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_ReadLockCheckInterval(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "readLockCheckInterval",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_ExclusiveReadLockStrategy(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "exclusiveReadLockStrategy",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_ProcessStrategy(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "processStrategy",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_StartingDirectoryMustExist(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "startingDirectoryMustExist",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_DirectoryMustExist(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "directoryMustExist",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileConsumerType_DoneFileName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doneFileName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (genericFileProducerTypeEClass, 
           source, 
           new String[] {
             "name", "GenericFileProducerType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getGenericFileProducerType_FileExist(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "fileExist",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileProducerType_TempPrefix(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "tempPrefix",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileProducerType_TempFileName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "tempFileName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileProducerType_KeepLastModified(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "keepLastModified",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileProducerType_EagerDeleteTargetFile(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "eagerDeleteTargetFile",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getGenericFileProducerType_DoneFileName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doneFileName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (jmsBindingTypeEClass, 
           source, 
           new String[] {
             "name", "JmsBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getJmsBindingType_Queue(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "queue",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJmsBindingType_Topic(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "topic",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJmsBindingType_ConnectionFactory(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "connectionFactory",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJmsBindingType_Username(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "username",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJmsBindingType_Password(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "password",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJmsBindingType_ClientId(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "clientId",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJmsBindingType_DurableSubscriptionName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "durableSubscriptionName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJmsBindingType_ConcurrentConsumers(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "concurrentConsumers",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJmsBindingType_MaxConcurrentConsumers(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "maxConcurrentConsumers",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJmsBindingType_DisableReplyTo(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "disableReplyTo",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJmsBindingType_PreserveMessageQos(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "preserveMessageQos",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJmsBindingType_DeliveryPersistent(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "deliveryPersistent",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJmsBindingType_Priority(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "priority",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJmsBindingType_ExplicitQosEnabled(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "explicitQosEnabled",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJmsBindingType_ReplyTo(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "replyTo",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJmsBindingType_ReplyToType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "replyToType",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJmsBindingType_RequestTimeout(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "requestTimeout",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJmsBindingType_Selector(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "selector",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJmsBindingType_TimeToLive(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "timeToLive",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJmsBindingType_Transacted(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "transacted",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getJmsBindingType_TransactionManager(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "transactionManager",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelBindingType_ConfigURI(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "configURI"
           });		
        addAnnotation
          (camelDirectBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelDirectBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelDirectBindingType_NameElement(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "name",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelTimerBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelTimerBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelTimerBindingType_CamelBindingName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "name",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelTimerBindingType_Time(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "time",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelTimerBindingType_Pattern(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "pattern",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelTimerBindingType_Period(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "period",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelTimerBindingType_Delay(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "delay",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelTimerBindingType_FixedRate(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "fixedRate",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelTimerBindingType_Daemon(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "daemon",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelSedaBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelSedaBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelSedaBindingType_NameElement(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "name",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSedaBindingType_Size(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "size",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSedaBindingType_ConcurrentConsumers(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "concurrentConsumers",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSedaBindingType_WaitForTaskToComplete(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "waitForTaskToComplete",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSedaBindingType_Timeout(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "timeout",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSedaBindingType_MultipleConsumers(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "multipleConsumers",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelSedaBindingType_LimitConcurrentConsumers(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "limitConcurrentConsumers",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (camelMockBindingTypeEClass, 
           source, 
           new String[] {
             "name", "CamelMockBindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getCamelMockBindingType_NameElement(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "name",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getCamelMockBindingType_ReportGroup(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "reportGroup",
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
          (getDocumentRoot_BindingCamel(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.uri",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (getDocumentRoot_BindingDirect(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.direct",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
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
        addAnnotation
          (getDocumentRoot_BindingMock(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.mock",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (getDocumentRoot_BindingSeda(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.seda",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (getDocumentRoot_BindingTimer(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.timer",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });
    }

} //CamelPackageImpl
