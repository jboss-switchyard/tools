/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.hornetq.impl;

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

import org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl;

import org.switchyard.tools.models.switchyard1_0.clojure.ClojurePackage;

import org.switchyard.tools.models.switchyard1_0.clojure.impl.ClojurePackageImpl;

import org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage;

import org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl;

import org.switchyard.tools.models.switchyard1_0.hornetq.BindingType;
import org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType;
import org.switchyard.tools.models.switchyard1_0.hornetq.ConnectorType;
import org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType;
import org.switchyard.tools.models.switchyard1_0.hornetq.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQFactory;
import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage;
import org.switchyard.tools.models.switchyard1_0.hornetq.PropertiesType;
import org.switchyard.tools.models.switchyard1_0.hornetq.PropertyType;
import org.switchyard.tools.models.switchyard1_0.hornetq.hqOperationSelectorType;

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
public class HornetQPackageImpl extends EPackageImpl implements HornetQPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass configTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass connectorTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass discoveryGroupTypeEClass = null;

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
    private EClass hqOperationSelectorTypeEClass = null;

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
     * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private HornetQPackageImpl() {
        super(eNS_URI, HornetQFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link HornetQPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static HornetQPackage init() {
        if (isInited) return (HornetQPackage)EPackage.Registry.INSTANCE.getEPackage(HornetQPackage.eNS_URI);

        // Obtain or create and register package
        HornetQPackageImpl theHornetQPackage = (HornetQPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HornetQPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HornetQPackageImpl());

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
        RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
        SOAPPackageImpl theSOAPPackage = (SOAPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SOAPPackage.eNS_URI) instanceof SOAPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SOAPPackage.eNS_URI) : SOAPPackage.eINSTANCE);
        TransformPackageImpl theTransformPackage = (TransformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransformPackage.eNS_URI) instanceof TransformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransformPackage.eNS_URI) : TransformPackage.eINSTANCE);
        ValidatePackageImpl theValidatePackage = (ValidatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValidatePackage.eNS_URI) instanceof ValidatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValidatePackage.eNS_URI) : ValidatePackage.eINSTANCE);
        CamelPackageImpl theCamelPackage = (CamelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) instanceof CamelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) : CamelPackage.eINSTANCE);
        SpringPackageImpl theSpringPackage = (SpringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI) instanceof SpringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI) : SpringPackage.eINSTANCE);

        // Load packages
        theSpringPackage.loadPackage();

        // Create package meta-data objects
        theHornetQPackage.createPackageContents();
        theBeanPackage.createPackageContents();
        theBPELPackage.createPackageContents();
        theBPMPackage.createPackageContents();
        theCommonRulesPackage.createPackageContents();
        theSwitchyardPackage.createPackageContents();
        theClojurePackage.createPackageContents();
        theRulesPackage.createPackageContents();
        theSOAPPackage.createPackageContents();
        theTransformPackage.createPackageContents();
        theValidatePackage.createPackageContents();
        theCamelPackage.createPackageContents();

        // Initialize created meta-data
        theHornetQPackage.initializePackageContents();
        theBeanPackage.initializePackageContents();
        theBPELPackage.initializePackageContents();
        theBPMPackage.initializePackageContents();
        theCommonRulesPackage.initializePackageContents();
        theSwitchyardPackage.initializePackageContents();
        theClojurePackage.initializePackageContents();
        theRulesPackage.initializePackageContents();
        theSOAPPackage.initializePackageContents();
        theTransformPackage.initializePackageContents();
        theValidatePackage.initializePackageContents();
        theCamelPackage.initializePackageContents();

        // Fix loaded packages
        theSpringPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theHornetQPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(HornetQPackage.eNS_URI, theHornetQPackage);
        return theHornetQPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBindingType() {
        return bindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBindingType_ContextMapper() {
        return (EReference)bindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBindingType_MessageComposer() {
        return (EReference)bindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBindingType_HqOperationSelector() {
        return (EReference)bindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBindingType_Config() {
        return (EReference)bindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConfigType() {
        return configTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_AckBatchSize() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_AutoGroup() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_BlockOnAcknowledge() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_BlockOnDurableSend() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_BlockOnNonDurableSend() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_CacheLargeMessagesOnConsumer() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_CallTimeout() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_ClientFailureCheckPeriod() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_CompressLargeMessages() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_ConnectionLoadBalancingPolicyClassName() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_ConnectionTTL() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_ConfirmationWindowSize() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConfigType_Connector() {
        return (EReference)configTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_ConsumerMaxRate() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_ConsumerWindowSize() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_DisableFinalizeCheck() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConfigType_DiscoveryGroup() {
        return (EReference)configTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_FailoverOnInitialConnection() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_GroupID() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_InitialMessagePacketSize() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_InitialReconnectAttempts() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_MaxRetryInterval() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_MinLargeMessageSize() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_PreAcknowledge() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_ProducerMaxRate() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_ProducerWindowSize() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_Queue() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_ReconnectAttempts() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_RetryInterval() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(28);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_RetryIntervalMultiplier() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(29);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_ScheduledThreadPoolMaxSize() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(30);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_ThreadPoolMaxSize() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(31);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_UseGlobalPools() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(32);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_UseHA() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(33);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfigType_XaSession() {
        return (EAttribute)configTypeEClass.getEStructuralFeatures().get(34);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConnectorType() {
        return connectorTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorType_FactoryClass() {
        return (EAttribute)connectorTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnectorType_Properties() {
        return (EReference)connectorTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorType_Name() {
        return (EAttribute)connectorTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDiscoveryGroupType() {
        return discoveryGroupTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiscoveryGroupType_LocalBindAddress() {
        return (EAttribute)discoveryGroupTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiscoveryGroupType_GroupAddress() {
        return (EAttribute)discoveryGroupTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiscoveryGroupType_GroupPort() {
        return (EAttribute)discoveryGroupTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiscoveryGroupType_RefreshTimeout() {
        return (EAttribute)discoveryGroupTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiscoveryGroupType_InitialWaitTimeout() {
        return (EAttribute)discoveryGroupTypeEClass.getEStructuralFeatures().get(4);
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
    public EReference getDocumentRoot_BindingHornetq() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Config() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass gethqOperationSelectorType() {
        return hqOperationSelectorTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute gethqOperationSelectorType_OperationName() {
        return (EAttribute)hqOperationSelectorTypeEClass.getEStructuralFeatures().get(0);
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
    public HornetQFactory getHornetQFactory() {
        return (HornetQFactory)getEFactoryInstance();
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
        bindingTypeEClass = createEClass(BINDING_TYPE);
        createEReference(bindingTypeEClass, BINDING_TYPE__CONTEXT_MAPPER);
        createEReference(bindingTypeEClass, BINDING_TYPE__MESSAGE_COMPOSER);
        createEReference(bindingTypeEClass, BINDING_TYPE__HQ_OPERATION_SELECTOR);
        createEReference(bindingTypeEClass, BINDING_TYPE__CONFIG);

        configTypeEClass = createEClass(CONFIG_TYPE);
        createEAttribute(configTypeEClass, CONFIG_TYPE__ACK_BATCH_SIZE);
        createEAttribute(configTypeEClass, CONFIG_TYPE__AUTO_GROUP);
        createEAttribute(configTypeEClass, CONFIG_TYPE__BLOCK_ON_ACKNOWLEDGE);
        createEAttribute(configTypeEClass, CONFIG_TYPE__BLOCK_ON_DURABLE_SEND);
        createEAttribute(configTypeEClass, CONFIG_TYPE__BLOCK_ON_NON_DURABLE_SEND);
        createEAttribute(configTypeEClass, CONFIG_TYPE__CACHE_LARGE_MESSAGES_ON_CONSUMER);
        createEAttribute(configTypeEClass, CONFIG_TYPE__CALL_TIMEOUT);
        createEAttribute(configTypeEClass, CONFIG_TYPE__CLIENT_FAILURE_CHECK_PERIOD);
        createEAttribute(configTypeEClass, CONFIG_TYPE__COMPRESS_LARGE_MESSAGES);
        createEAttribute(configTypeEClass, CONFIG_TYPE__CONNECTION_LOAD_BALANCING_POLICY_CLASS_NAME);
        createEAttribute(configTypeEClass, CONFIG_TYPE__CONNECTION_TTL);
        createEAttribute(configTypeEClass, CONFIG_TYPE__CONFIRMATION_WINDOW_SIZE);
        createEReference(configTypeEClass, CONFIG_TYPE__CONNECTOR);
        createEAttribute(configTypeEClass, CONFIG_TYPE__CONSUMER_MAX_RATE);
        createEAttribute(configTypeEClass, CONFIG_TYPE__CONSUMER_WINDOW_SIZE);
        createEAttribute(configTypeEClass, CONFIG_TYPE__DISABLE_FINALIZE_CHECK);
        createEReference(configTypeEClass, CONFIG_TYPE__DISCOVERY_GROUP);
        createEAttribute(configTypeEClass, CONFIG_TYPE__FAILOVER_ON_INITIAL_CONNECTION);
        createEAttribute(configTypeEClass, CONFIG_TYPE__GROUP_ID);
        createEAttribute(configTypeEClass, CONFIG_TYPE__INITIAL_MESSAGE_PACKET_SIZE);
        createEAttribute(configTypeEClass, CONFIG_TYPE__INITIAL_RECONNECT_ATTEMPTS);
        createEAttribute(configTypeEClass, CONFIG_TYPE__MAX_RETRY_INTERVAL);
        createEAttribute(configTypeEClass, CONFIG_TYPE__MIN_LARGE_MESSAGE_SIZE);
        createEAttribute(configTypeEClass, CONFIG_TYPE__PRE_ACKNOWLEDGE);
        createEAttribute(configTypeEClass, CONFIG_TYPE__PRODUCER_MAX_RATE);
        createEAttribute(configTypeEClass, CONFIG_TYPE__PRODUCER_WINDOW_SIZE);
        createEAttribute(configTypeEClass, CONFIG_TYPE__QUEUE);
        createEAttribute(configTypeEClass, CONFIG_TYPE__RECONNECT_ATTEMPTS);
        createEAttribute(configTypeEClass, CONFIG_TYPE__RETRY_INTERVAL);
        createEAttribute(configTypeEClass, CONFIG_TYPE__RETRY_INTERVAL_MULTIPLIER);
        createEAttribute(configTypeEClass, CONFIG_TYPE__SCHEDULED_THREAD_POOL_MAX_SIZE);
        createEAttribute(configTypeEClass, CONFIG_TYPE__THREAD_POOL_MAX_SIZE);
        createEAttribute(configTypeEClass, CONFIG_TYPE__USE_GLOBAL_POOLS);
        createEAttribute(configTypeEClass, CONFIG_TYPE__USE_HA);
        createEAttribute(configTypeEClass, CONFIG_TYPE__XA_SESSION);

        connectorTypeEClass = createEClass(CONNECTOR_TYPE);
        createEAttribute(connectorTypeEClass, CONNECTOR_TYPE__FACTORY_CLASS);
        createEReference(connectorTypeEClass, CONNECTOR_TYPE__PROPERTIES);
        createEAttribute(connectorTypeEClass, CONNECTOR_TYPE__NAME);

        discoveryGroupTypeEClass = createEClass(DISCOVERY_GROUP_TYPE);
        createEAttribute(discoveryGroupTypeEClass, DISCOVERY_GROUP_TYPE__LOCAL_BIND_ADDRESS);
        createEAttribute(discoveryGroupTypeEClass, DISCOVERY_GROUP_TYPE__GROUP_ADDRESS);
        createEAttribute(discoveryGroupTypeEClass, DISCOVERY_GROUP_TYPE__GROUP_PORT);
        createEAttribute(discoveryGroupTypeEClass, DISCOVERY_GROUP_TYPE__REFRESH_TIMEOUT);
        createEAttribute(discoveryGroupTypeEClass, DISCOVERY_GROUP_TYPE__INITIAL_WAIT_TIMEOUT);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_HORNETQ);
        createEReference(documentRootEClass, DOCUMENT_ROOT__CONFIG);

        hqOperationSelectorTypeEClass = createEClass(HQ_OPERATION_SELECTOR_TYPE);
        createEAttribute(hqOperationSelectorTypeEClass, HQ_OPERATION_SELECTOR_TYPE__OPERATION_NAME);

        propertiesTypeEClass = createEClass(PROPERTIES_TYPE);
        createEReference(propertiesTypeEClass, PROPERTIES_TYPE__PROPERTY);

        propertyTypeEClass = createEClass(PROPERTY_TYPE);
        createEAttribute(propertyTypeEClass, PROPERTY_TYPE__NAME);
        createEAttribute(propertyTypeEClass, PROPERTY_TYPE__VALUE);
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
        ScaPackage theScaPackage = (ScaPackage)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        bindingTypeEClass.getESuperTypes().add(theSwitchyardPackage.getSwitchYardBindingType());
        hqOperationSelectorTypeEClass.getESuperTypes().add(theScaPackage.getOperationSelectorType());

        // Initialize classes and features; add operations and parameters
        initEClass(bindingTypeEClass, BindingType.class, "BindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBindingType_ContextMapper(), theSwitchyardPackage.getContextMapperType(), null, "contextMapper", null, 0, 1, BindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBindingType_MessageComposer(), theSwitchyardPackage.getMessageComposerType(), null, "messageComposer", null, 0, 1, BindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBindingType_HqOperationSelector(), this.gethqOperationSelectorType(), null, "hqOperationSelector", null, 0, 1, BindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBindingType_Config(), this.getConfigType(), null, "config", null, 1, 1, BindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(configTypeEClass, ConfigType.class, "ConfigType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getConfigType_AckBatchSize(), theXMLTypePackage.getLong(), "ackBatchSize", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_AutoGroup(), theXMLTypePackage.getBoolean(), "autoGroup", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_BlockOnAcknowledge(), theXMLTypePackage.getBoolean(), "blockOnAcknowledge", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_BlockOnDurableSend(), theXMLTypePackage.getBoolean(), "blockOnDurableSend", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_BlockOnNonDurableSend(), theXMLTypePackage.getBoolean(), "blockOnNonDurableSend", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_CacheLargeMessagesOnConsumer(), theXMLTypePackage.getBoolean(), "cacheLargeMessagesOnConsumer", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_CallTimeout(), theXMLTypePackage.getLong(), "callTimeout", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_ClientFailureCheckPeriod(), theXMLTypePackage.getLong(), "clientFailureCheckPeriod", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_CompressLargeMessages(), theXMLTypePackage.getBoolean(), "compressLargeMessages", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_ConnectionLoadBalancingPolicyClassName(), theXMLTypePackage.getString(), "connectionLoadBalancingPolicyClassName", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_ConnectionTTL(), theXMLTypePackage.getLong(), "connectionTTL", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_ConfirmationWindowSize(), theXMLTypePackage.getInt(), "confirmationWindowSize", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConfigType_Connector(), this.getConnectorType(), null, "connector", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_ConsumerMaxRate(), theXMLTypePackage.getInt(), "consumerMaxRate", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_ConsumerWindowSize(), theXMLTypePackage.getInt(), "consumerWindowSize", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_DisableFinalizeCheck(), theXMLTypePackage.getBoolean(), "disableFinalizeCheck", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConfigType_DiscoveryGroup(), this.getDiscoveryGroupType(), null, "discoveryGroup", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_FailoverOnInitialConnection(), theXMLTypePackage.getBoolean(), "failoverOnInitialConnection", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_GroupID(), theXMLTypePackage.getString(), "groupID", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_InitialMessagePacketSize(), theXMLTypePackage.getInt(), "initialMessagePacketSize", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_InitialReconnectAttempts(), theXMLTypePackage.getInt(), "initialReconnectAttempts", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_MaxRetryInterval(), theXMLTypePackage.getLong(), "maxRetryInterval", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_MinLargeMessageSize(), theXMLTypePackage.getLong(), "minLargeMessageSize", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_PreAcknowledge(), theXMLTypePackage.getBoolean(), "preAcknowledge", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_ProducerMaxRate(), theXMLTypePackage.getInt(), "producerMaxRate", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_ProducerWindowSize(), theXMLTypePackage.getInt(), "producerWindowSize", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_Queue(), theXMLTypePackage.getString(), "queue", null, 1, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_ReconnectAttempts(), theXMLTypePackage.getInt(), "reconnectAttempts", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_RetryInterval(), theXMLTypePackage.getLong(), "retryInterval", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_RetryIntervalMultiplier(), theXMLTypePackage.getFloat(), "retryIntervalMultiplier", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_ScheduledThreadPoolMaxSize(), theXMLTypePackage.getInt(), "scheduledThreadPoolMaxSize", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_ThreadPoolMaxSize(), theXMLTypePackage.getInt(), "threadPoolMaxSize", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_UseGlobalPools(), theXMLTypePackage.getBoolean(), "useGlobalPools", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_UseHA(), theXMLTypePackage.getBoolean(), "useHA", null, 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConfigType_XaSession(), theXMLTypePackage.getBoolean(), "xaSession", "false", 0, 1, ConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(connectorTypeEClass, ConnectorType.class, "ConnectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getConnectorType_FactoryClass(), theXMLTypePackage.getString(), "factoryClass", null, 1, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConnectorType_Properties(), this.getPropertiesType(), null, "properties", null, 0, -1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectorType_Name(), theXMLTypePackage.getID(), "name", null, 0, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(discoveryGroupTypeEClass, DiscoveryGroupType.class, "DiscoveryGroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDiscoveryGroupType_LocalBindAddress(), theXMLTypePackage.getString(), "localBindAddress", null, 0, 1, DiscoveryGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiscoveryGroupType_GroupAddress(), theXMLTypePackage.getString(), "groupAddress", null, 1, 1, DiscoveryGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiscoveryGroupType_GroupPort(), theXMLTypePackage.getInt(), "groupPort", null, 1, 1, DiscoveryGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiscoveryGroupType_RefreshTimeout(), theXMLTypePackage.getLong(), "refreshTimeout", null, 0, 1, DiscoveryGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiscoveryGroupType_InitialWaitTimeout(), theXMLTypePackage.getLong(), "initialWaitTimeout", null, 0, 1, DiscoveryGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingHornetq(), this.getBindingType(), null, "bindingHornetq", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Config(), this.getConfigType(), null, "config", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(hqOperationSelectorTypeEClass, hqOperationSelectorType.class, "hqOperationSelectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(gethqOperationSelectorType_OperationName(), theXMLTypePackage.getString(), "operationName", null, 0, 1, hqOperationSelectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertiesTypeEClass, PropertiesType.class, "PropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPropertiesType_Property(), this.getPropertyType(), null, "property", null, 0, -1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyTypeEClass, PropertyType.class, "PropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPropertyType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPropertyType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
          (bindingTypeEClass, 
           source, 
           new String[] {
             "name", "BindingType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getBindingType_ContextMapper(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "contextMapper",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBindingType_MessageComposer(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "messageComposer",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBindingType_HqOperationSelector(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "operationSelector",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBindingType_Config(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "config",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (configTypeEClass, 
           source, 
           new String[] {
             "name", "ConfigType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getConfigType_AckBatchSize(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ackBatchSize",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_AutoGroup(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "autoGroup",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_BlockOnAcknowledge(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "blockOnAcknowledge",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_BlockOnDurableSend(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "blockOnDurableSend",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_BlockOnNonDurableSend(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "blockOnNonDurableSend",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_CacheLargeMessagesOnConsumer(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "cacheLargeMessagesOnConsumer",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_CallTimeout(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "callTimeout",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_ClientFailureCheckPeriod(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "clientFailureCheckPeriod",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_CompressLargeMessages(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "compressLargeMessages",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_ConnectionLoadBalancingPolicyClassName(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "connectionLoadBalancingPolicyClassName",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_ConnectionTTL(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "connectionTTL",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_ConfirmationWindowSize(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "confirmationWindowSize",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_Connector(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "connector",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_ConsumerMaxRate(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "consumerMaxRate",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_ConsumerWindowSize(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "consumerWindowSize",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_DisableFinalizeCheck(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "disableFinalizeCheck",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_DiscoveryGroup(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "discoveryGroup",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_FailoverOnInitialConnection(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "failoverOnInitialConnection",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_GroupID(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "groupID",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_InitialMessagePacketSize(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "initialMessagePacketSize",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_InitialReconnectAttempts(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "initialReconnectAttempts",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_MaxRetryInterval(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "maxRetryInterval",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_MinLargeMessageSize(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "minLargeMessageSize",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_PreAcknowledge(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "preAcknowledge",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_ProducerMaxRate(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "producerMaxRate",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_ProducerWindowSize(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "producerWindowSize",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_Queue(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "queue",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_ReconnectAttempts(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "reconnectAttempts",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_RetryInterval(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "retryInterval",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_RetryIntervalMultiplier(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "retryIntervalMultiplier",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_ScheduledThreadPoolMaxSize(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "scheduledThreadPoolMaxSize",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_ThreadPoolMaxSize(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "threadPoolMaxSize",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_UseGlobalPools(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "useGlobalPools",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_UseHA(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "useHA",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConfigType_XaSession(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "xaSession",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (connectorTypeEClass, 
           source, 
           new String[] {
             "name", "connectorType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getConnectorType_FactoryClass(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "factoryClass",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConnectorType_Properties(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "properties",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConnectorType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (discoveryGroupTypeEClass, 
           source, 
           new String[] {
             "name", "discoveryGroupType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getDiscoveryGroupType_LocalBindAddress(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "localBindAddress",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDiscoveryGroupType_GroupAddress(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "groupAddress",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDiscoveryGroupType_GroupPort(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "groupPort",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDiscoveryGroupType_RefreshTimeout(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "refreshTimeout",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDiscoveryGroupType_InitialWaitTimeout(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "initialWaitTimeout",
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
          (getDocumentRoot_BindingHornetq(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.hornetq",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
           });		
        addAnnotation
          (getDocumentRoot_Config(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "config",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (hqOperationSelectorTypeEClass, 
           source, 
           new String[] {
             "name", "OperationSelectorType",
             "kind", "empty"
           });		
        addAnnotation
          (propertiesTypeEClass, 
           source, 
           new String[] {
             "name", "propertiesType",
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
          (propertyTypeEClass, 
           source, 
           new String[] {
             "name", "propertyType",
             "kind", "empty"
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
    }

} //HornetQPackageImpl
