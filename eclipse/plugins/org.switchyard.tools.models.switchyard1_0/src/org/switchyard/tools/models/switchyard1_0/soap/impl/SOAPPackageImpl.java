/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.soap.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

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
import org.switchyard.tools.models.switchyard1_0.http.HttpPackage;
import org.switchyard.tools.models.switchyard1_0.http.impl.HttpPackageImpl;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage;
import org.switchyard.tools.models.switchyard1_0.resteasy.impl.ResteasyPackageImpl;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;
import org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl;
import org.switchyard.tools.models.switchyard1_0.soap.BasicAuthenticationType;
import org.switchyard.tools.models.switchyard1_0.soap.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.soap.EndpointConfigType;
import org.switchyard.tools.models.switchyard1_0.soap.InterceptorType;
import org.switchyard.tools.models.switchyard1_0.soap.InterceptorsType;
import org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.soap.MtomType;
import org.switchyard.tools.models.switchyard1_0.soap.NTLMAuthenticationType;
import org.switchyard.tools.models.switchyard1_0.soap.PropertiesType;
import org.switchyard.tools.models.switchyard1_0.soap.PropertyType;
import org.switchyard.tools.models.switchyard1_0.soap.ProxyType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;
import org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType;
import org.switchyard.tools.models.switchyard1_0.soap.util.SOAPValidator;
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
public class SOAPPackageImpl extends EPackageImpl implements SOAPPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contextMapperTypeEClass = null;

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
    private EClass soapBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass basicAuthenticationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ntlmAuthenticationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interceptorTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass messageComposerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interceptorsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mtomTypeEClass = null;

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
    private EClass propertiesTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass endpointConfigTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass proxyTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum soapHeadersTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType soapHeadersTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType wsdlPortTypeEDataType = null;

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
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SOAPPackageImpl() {
        super(eNS_URI, SOAPFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link SOAPPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SOAPPackage init() {
        if (isInited) return (SOAPPackage)EPackage.Registry.INSTANCE.getEPackage(SOAPPackage.eNS_URI);

        // Obtain or create and register package
        SOAPPackageImpl theSOAPPackage = (SOAPPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SOAPPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SOAPPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        ScaPackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        BeanPackageImpl theBeanPackage = (BeanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI) instanceof BeanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI) : BeanPackage.eINSTANCE);
        BPMPackageImpl theBPMPackage = (BPMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPMPackage.eNS_URI) instanceof BPMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPMPackage.eNS_URI) : BPMPackage.eINSTANCE);
        SwitchyardPackageImpl theSwitchyardPackage = (SwitchyardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SwitchyardPackage.eNS_URI) instanceof SwitchyardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SwitchyardPackage.eNS_URI) : SwitchyardPackage.eINSTANCE);
        ClojurePackageImpl theClojurePackage = (ClojurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClojurePackage.eNS_URI) instanceof ClojurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClojurePackage.eNS_URI) : ClojurePackage.eINSTANCE);
        RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
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

        // Load packages
        theSpringPackage.loadPackage();

        // Create package meta-data objects
        theSOAPPackage.createPackageContents();
        theBeanPackage.createPackageContents();
        theBPMPackage.createPackageContents();
        theSwitchyardPackage.createPackageContents();
        theClojurePackage.createPackageContents();
        theRulesPackage.createPackageContents();
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

        // Initialize created meta-data
        theSOAPPackage.initializePackageContents();
        theBeanPackage.initializePackageContents();
        theBPMPackage.initializePackageContents();
        theSwitchyardPackage.initializePackageContents();
        theClojurePackage.initializePackageContents();
        theRulesPackage.initializePackageContents();
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

        // Fix loaded packages
        theSpringPackage.fixPackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theSOAPPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return SOAPValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theSOAPPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SOAPPackage.eNS_URI, theSOAPPackage);
        return theSOAPPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContextMapperType() {
        return contextMapperTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getContextMapperType_SoapHeadersType() {
        return (EAttribute)contextMapperTypeEClass.getEStructuralFeatures().get(0);
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
    public EReference getDocumentRoot_BindingSoap() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Interceptor() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Properties() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Property() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSOAPBindingType() {
        return soapBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSOAPBindingType_ContextMapper() {
        return (EReference)soapBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSOAPBindingType_MessageComposer() {
        return (EReference)soapBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOAPBindingType_Wsdl() {
        return (EAttribute)soapBindingTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOAPBindingType_WsdlPort() {
        return (EAttribute)soapBindingTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOAPBindingType_SocketAddr() {
        return (EAttribute)soapBindingTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOAPBindingType_ContextPath() {
        return (EAttribute)soapBindingTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOAPBindingType_EndpointAddress() {
        return (EAttribute)soapBindingTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOAPBindingType_Timeout() {
        return (EAttribute)soapBindingTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSOAPBindingType_Basic() {
        return (EReference)soapBindingTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSOAPBindingType_Ntlm() {
        return (EReference)soapBindingTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSOAPBindingType_InInterceptors() {
        return (EReference)soapBindingTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSOAPBindingType_OutInterceptors() {
        return (EReference)soapBindingTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBasicAuthenticationType() {
        return basicAuthenticationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBasicAuthenticationType_User() {
        return (EAttribute)basicAuthenticationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBasicAuthenticationType_Password() {
        return (EAttribute)basicAuthenticationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNTLMAuthenticationType() {
        return ntlmAuthenticationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNTLMAuthenticationType_Domain() {
        return (EAttribute)ntlmAuthenticationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSOAPBindingType_Mtom() {
        return (EReference)soapBindingTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSOAPBindingType_EndpointConfig() {
        return (EReference)soapBindingTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSOAPBindingType_Proxy() {
        return (EReference)soapBindingTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInterceptorType() {
        return interceptorTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInterceptorType_Class() {
        return (EAttribute)interceptorTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMessageComposerType() {
        return messageComposerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMessageComposerType_Unwrapped() {
        return (EAttribute)messageComposerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInterceptorType_Properties() {
        return (EReference)interceptorTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInterceptorsType() {
        return interceptorsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInterceptorsType_Interceptor() {
        return (EReference)interceptorsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMtomType() {
        return mtomTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMtomType_Enabled() {
        return (EAttribute)mtomTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMtomType_Threshold() {
        return (EAttribute)mtomTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMtomType_XopExpand() {
        return (EAttribute)mtomTypeEClass.getEStructuralFeatures().get(2);
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
    public EClass getEndpointConfigType() {
        return endpointConfigTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEndpointConfigType_ConfigFile() {
        return (EAttribute)endpointConfigTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEndpointConfigType_ConfigName() {
        return (EAttribute)endpointConfigTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProxyType() {
        return proxyTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProxyType_Type() {
        return (EAttribute)proxyTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProxyType_Host() {
        return (EAttribute)proxyTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProxyType_Port() {
        return (EAttribute)proxyTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProxyType_User() {
        return (EAttribute)proxyTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProxyType_Password() {
        return (EAttribute)proxyTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSoapHeadersType() {
        return soapHeadersTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSoapHeadersTypeObject() {
        return soapHeadersTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getWsdlPortType() {
        return wsdlPortTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SOAPFactory getSOAPFactory() {
        return (SOAPFactory)getEFactoryInstance();
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
        contextMapperTypeEClass = createEClass(CONTEXT_MAPPER_TYPE);
        createEAttribute(contextMapperTypeEClass, CONTEXT_MAPPER_TYPE__SOAP_HEADERS_TYPE);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_SOAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__INTERCEPTOR);
        createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTIES);
        createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY);

        endpointConfigTypeEClass = createEClass(ENDPOINT_CONFIG_TYPE);
        createEAttribute(endpointConfigTypeEClass, ENDPOINT_CONFIG_TYPE__CONFIG_FILE);
        createEAttribute(endpointConfigTypeEClass, ENDPOINT_CONFIG_TYPE__CONFIG_NAME);

        interceptorsTypeEClass = createEClass(INTERCEPTORS_TYPE);
        createEReference(interceptorsTypeEClass, INTERCEPTORS_TYPE__INTERCEPTOR);

        interceptorTypeEClass = createEClass(INTERCEPTOR_TYPE);
        createEReference(interceptorTypeEClass, INTERCEPTOR_TYPE__PROPERTIES);
        createEAttribute(interceptorTypeEClass, INTERCEPTOR_TYPE__CLASS);

        messageComposerTypeEClass = createEClass(MESSAGE_COMPOSER_TYPE);
        createEAttribute(messageComposerTypeEClass, MESSAGE_COMPOSER_TYPE__UNWRAPPED);

        mtomTypeEClass = createEClass(MTOM_TYPE);
        createEAttribute(mtomTypeEClass, MTOM_TYPE__ENABLED);
        createEAttribute(mtomTypeEClass, MTOM_TYPE__THRESHOLD);
        createEAttribute(mtomTypeEClass, MTOM_TYPE__XOP_EXPAND);

        propertiesTypeEClass = createEClass(PROPERTIES_TYPE);
        createEReference(propertiesTypeEClass, PROPERTIES_TYPE__PROPERTY);

        propertyTypeEClass = createEClass(PROPERTY_TYPE);
        createEAttribute(propertyTypeEClass, PROPERTY_TYPE__NAME);
        createEAttribute(propertyTypeEClass, PROPERTY_TYPE__VALUE);

        proxyTypeEClass = createEClass(PROXY_TYPE);
        createEAttribute(proxyTypeEClass, PROXY_TYPE__TYPE);
        createEAttribute(proxyTypeEClass, PROXY_TYPE__HOST);
        createEAttribute(proxyTypeEClass, PROXY_TYPE__PORT);
        createEAttribute(proxyTypeEClass, PROXY_TYPE__USER);
        createEAttribute(proxyTypeEClass, PROXY_TYPE__PASSWORD);

        soapBindingTypeEClass = createEClass(SOAP_BINDING_TYPE);
        createEReference(soapBindingTypeEClass, SOAP_BINDING_TYPE__CONTEXT_MAPPER);
        createEReference(soapBindingTypeEClass, SOAP_BINDING_TYPE__MESSAGE_COMPOSER);
        createEAttribute(soapBindingTypeEClass, SOAP_BINDING_TYPE__WSDL);
        createEAttribute(soapBindingTypeEClass, SOAP_BINDING_TYPE__WSDL_PORT);
        createEAttribute(soapBindingTypeEClass, SOAP_BINDING_TYPE__SOCKET_ADDR);
        createEAttribute(soapBindingTypeEClass, SOAP_BINDING_TYPE__CONTEXT_PATH);
        createEReference(soapBindingTypeEClass, SOAP_BINDING_TYPE__ENDPOINT_CONFIG);
        createEAttribute(soapBindingTypeEClass, SOAP_BINDING_TYPE__ENDPOINT_ADDRESS);
        createEAttribute(soapBindingTypeEClass, SOAP_BINDING_TYPE__TIMEOUT);
        createEReference(soapBindingTypeEClass, SOAP_BINDING_TYPE__BASIC);
        createEReference(soapBindingTypeEClass, SOAP_BINDING_TYPE__NTLM);
        createEReference(soapBindingTypeEClass, SOAP_BINDING_TYPE__PROXY);
        createEReference(soapBindingTypeEClass, SOAP_BINDING_TYPE__MTOM);
        createEReference(soapBindingTypeEClass, SOAP_BINDING_TYPE__IN_INTERCEPTORS);
        createEReference(soapBindingTypeEClass, SOAP_BINDING_TYPE__OUT_INTERCEPTORS);

        basicAuthenticationTypeEClass = createEClass(BASIC_AUTHENTICATION_TYPE);
        createEAttribute(basicAuthenticationTypeEClass, BASIC_AUTHENTICATION_TYPE__USER);
        createEAttribute(basicAuthenticationTypeEClass, BASIC_AUTHENTICATION_TYPE__PASSWORD);

        ntlmAuthenticationTypeEClass = createEClass(NTLM_AUTHENTICATION_TYPE);
        createEAttribute(ntlmAuthenticationTypeEClass, NTLM_AUTHENTICATION_TYPE__DOMAIN);

        // Create enums
        soapHeadersTypeEEnum = createEEnum(SOAP_HEADERS_TYPE);

        // Create data types
        soapHeadersTypeObjectEDataType = createEDataType(SOAP_HEADERS_TYPE_OBJECT);
        wsdlPortTypeEDataType = createEDataType(WSDL_PORT_TYPE);
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
        ScaPackage theScaPackage = (ScaPackage)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI);
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        contextMapperTypeEClass.getESuperTypes().add(theSwitchyardPackage.getContextMapperType());
        endpointConfigTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        interceptorsTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        interceptorTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        messageComposerTypeEClass.getESuperTypes().add(theSwitchyardPackage.getMessageComposerType());
        mtomTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        propertiesTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        propertyTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        proxyTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        soapBindingTypeEClass.getESuperTypes().add(theSwitchyardPackage.getSwitchYardBindingType());
        basicAuthenticationTypeEClass.getESuperTypes().add(theScaPackage.getCommonExtensionBase());
        ntlmAuthenticationTypeEClass.getESuperTypes().add(this.getBasicAuthenticationType());

        // Initialize classes and features; add operations and parameters
        initEClass(contextMapperTypeEClass, ContextMapperType.class, "ContextMapperType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getContextMapperType_SoapHeadersType(), this.getSoapHeadersType(), "soapHeadersType", "VALUE", 0, 1, ContextMapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_BindingSoap(), this.getSOAPBindingType(), null, "bindingSoap", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Interceptor(), this.getInterceptorType(), null, "interceptor", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Properties(), this.getPropertiesType(), null, "properties", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Property(), this.getPropertyType(), null, "property", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(endpointConfigTypeEClass, EndpointConfigType.class, "EndpointConfigType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEndpointConfigType_ConfigFile(), theXMLTypePackage.getString(), "configFile", null, 0, 1, EndpointConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEndpointConfigType_ConfigName(), theXMLTypePackage.getString(), "configName", null, 0, 1, EndpointConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interceptorsTypeEClass, InterceptorsType.class, "InterceptorsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInterceptorsType_Interceptor(), this.getInterceptorType(), null, "interceptor", null, 0, -1, InterceptorsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interceptorTypeEClass, InterceptorType.class, "InterceptorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInterceptorType_Properties(), this.getPropertiesType(), null, "properties", null, 0, 1, InterceptorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInterceptorType_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, InterceptorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(messageComposerTypeEClass, MessageComposerType.class, "MessageComposerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMessageComposerType_Unwrapped(), theXMLTypePackage.getBoolean(), "unwrapped", null, 0, 1, MessageComposerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(mtomTypeEClass, MtomType.class, "MtomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMtomType_Enabled(), theSwitchyardPackage.getPropBoolean(), "enabled", null, 0, 1, MtomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMtomType_Threshold(), theSwitchyardPackage.getPropInteger(), "threshold", null, 0, 1, MtomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMtomType_XopExpand(), theSwitchyardPackage.getPropBoolean(), "xopExpand", null, 0, 1, MtomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertiesTypeEClass, PropertiesType.class, "PropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPropertiesType_Property(), this.getPropertyType(), null, "property", null, 0, -1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyTypeEClass, PropertyType.class, "PropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPropertyType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPropertyType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(proxyTypeEClass, ProxyType.class, "ProxyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProxyType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, ProxyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProxyType_Host(), theXMLTypePackage.getString(), "host", null, 0, 1, ProxyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProxyType_Port(), theSwitchyardPackage.getPropInteger(), "port", null, 0, 1, ProxyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProxyType_User(), theXMLTypePackage.getString(), "user", null, 1, 1, ProxyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProxyType_Password(), theXMLTypePackage.getString(), "password", null, 1, 1, ProxyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(soapBindingTypeEClass, SOAPBindingType.class, "SOAPBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSOAPBindingType_ContextMapper(), this.getContextMapperType(), null, "contextMapper", null, 0, 1, SOAPBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSOAPBindingType_MessageComposer(), this.getMessageComposerType(), null, "messageComposer", null, 0, 1, SOAPBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSOAPBindingType_Wsdl(), theXMLTypePackage.getString(), "wsdl", null, 1, 1, SOAPBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSOAPBindingType_WsdlPort(), this.getWsdlPortType(), "wsdlPort", null, 0, 1, SOAPBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSOAPBindingType_SocketAddr(), theXMLTypePackage.getString(), "socketAddr", null, 0, 1, SOAPBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSOAPBindingType_ContextPath(), theXMLTypePackage.getString(), "contextPath", null, 0, 1, SOAPBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSOAPBindingType_EndpointConfig(), this.getEndpointConfigType(), null, "endpointConfig", null, 0, 1, SOAPBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSOAPBindingType_EndpointAddress(), theXMLTypePackage.getString(), "endpointAddress", null, 0, 1, SOAPBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSOAPBindingType_Timeout(), theSwitchyardPackage.getPropInteger(), "timeout", null, 0, 1, SOAPBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSOAPBindingType_Basic(), this.getBasicAuthenticationType(), null, "basic", null, 0, 1, SOAPBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSOAPBindingType_Ntlm(), this.getNTLMAuthenticationType(), null, "ntlm", null, 0, 1, SOAPBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSOAPBindingType_Proxy(), this.getProxyType(), null, "proxy", null, 0, 1, SOAPBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSOAPBindingType_Mtom(), this.getMtomType(), null, "mtom", null, 0, 1, SOAPBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSOAPBindingType_InInterceptors(), this.getInterceptorsType(), null, "inInterceptors", null, 0, 1, SOAPBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSOAPBindingType_OutInterceptors(), this.getInterceptorsType(), null, "outInterceptors", null, 0, 1, SOAPBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(basicAuthenticationTypeEClass, BasicAuthenticationType.class, "BasicAuthenticationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBasicAuthenticationType_User(), theXMLTypePackage.getString(), "user", null, 1, 1, BasicAuthenticationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBasicAuthenticationType_Password(), theXMLTypePackage.getString(), "password", null, 1, 1, BasicAuthenticationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ntlmAuthenticationTypeEClass, NTLMAuthenticationType.class, "NTLMAuthenticationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNTLMAuthenticationType_Domain(), theXMLTypePackage.getString(), "domain", null, 1, 1, NTLMAuthenticationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(soapHeadersTypeEEnum, SoapHeadersType.class, "SoapHeadersType");
        addEEnumLiteral(soapHeadersTypeEEnum, SoapHeadersType.CONFIG);
        addEEnumLiteral(soapHeadersTypeEEnum, SoapHeadersType.DOM);
        addEEnumLiteral(soapHeadersTypeEEnum, SoapHeadersType.VALUE);
        addEEnumLiteral(soapHeadersTypeEEnum, SoapHeadersType.XML);

        // Initialize data types
        initEDataType(soapHeadersTypeObjectEDataType, SoapHeadersType.class, "SoapHeadersTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(wsdlPortTypeEDataType, String.class, "WsdlPortType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
          (contextMapperTypeEClass, 
           source, 
           new String[] {
             "name", "ContextMapperType",
             "kind", "empty"
           });		
        addAnnotation
          (getContextMapperType_SoapHeadersType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "soapHeadersType"
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
          (getDocumentRoot_BindingSoap(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "binding.soap",
             "namespace", "##targetNamespace",
             "affiliation", "urn:switchyard-config:switchyard:2.0#binding.switchyard"
           });		
        addAnnotation
          (getDocumentRoot_Interceptor(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "interceptor",
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
          (endpointConfigTypeEClass, 
           source, 
           new String[] {
             "name", "EndpointConfigType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getEndpointConfigType_ConfigFile(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "configFile"
           });		
        addAnnotation
          (getEndpointConfigType_ConfigName(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "configName"
           });		
        addAnnotation
          (interceptorsTypeEClass, 
           source, 
           new String[] {
             "name", "InterceptorsType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getInterceptorsType_Interceptor(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "interceptor",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (interceptorTypeEClass, 
           source, 
           new String[] {
             "name", "InterceptorType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getInterceptorType_Properties(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "properties",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getInterceptorType_Class(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "class"
           });		
        addAnnotation
          (messageComposerTypeEClass, 
           source, 
           new String[] {
             "name", "MessageComposerType",
             "kind", "empty"
           });		
        addAnnotation
          (getMessageComposerType_Unwrapped(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "unwrapped"
           });		
        addAnnotation
          (mtomTypeEClass, 
           source, 
           new String[] {
             "name", "MtomType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getMtomType_Enabled(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "enabled"
           });		
        addAnnotation
          (getMtomType_Threshold(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "threshold"
           });		
        addAnnotation
          (getMtomType_XopExpand(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "xopExpand"
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
          (proxyTypeEClass, 
           source, 
           new String[] {
             "name", "ProxyType",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getProxyType_Type(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "type",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProxyType_Host(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "host",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProxyType_Port(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "port",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProxyType_User(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "user",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProxyType_Password(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "password",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (soapBindingTypeEClass, 
           source, 
           new String[] {
             "name", "SOAPBindingType",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getSOAPBindingType_ContextMapper(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "contextMapper",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getSOAPBindingType_MessageComposer(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "messageComposer",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getSOAPBindingType_Wsdl(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "wsdl",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getSOAPBindingType_WsdlPort(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "wsdlPort",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getSOAPBindingType_SocketAddr(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "socketAddr",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getSOAPBindingType_ContextPath(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "contextPath",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getSOAPBindingType_EndpointConfig(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "endpointConfig",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getSOAPBindingType_EndpointAddress(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "endpointAddress",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getSOAPBindingType_Timeout(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "timeout",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getSOAPBindingType_Basic(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "basic",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getSOAPBindingType_Ntlm(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "ntlm",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getSOAPBindingType_Proxy(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "proxy",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getSOAPBindingType_Mtom(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "mtom",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getSOAPBindingType_InInterceptors(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "inInterceptors",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getSOAPBindingType_OutInterceptors(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "outInterceptors",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (soapHeadersTypeEEnum, 
           source, 
           new String[] {
             "name", "soapHeadersType"
           });		
        addAnnotation
          (soapHeadersTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "soapHeadersType:Object",
             "baseType", "soapHeadersType"
           });		
        addAnnotation
          (wsdlPortTypeEDataType, 
           source, 
           new String[] {
             "name", "wsdlPortType",
             "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
             "pattern", "\\{.+\\}.+:[^:]+|.+:[^:]+|[^:]+"
           });		
        addAnnotation
          (basicAuthenticationTypeEClass, 
           source, 
           new String[] {
             "name", "BasicAuthenticationType",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getBasicAuthenticationType_User(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "user",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBasicAuthenticationType_Password(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "password",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (ntlmAuthenticationTypeEClass, 
           source, 
           new String[] {
             "name", "NTLMAuthenticationType",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getNTLMAuthenticationType_Domain(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "domain",
             "namespace", "##targetNamespace"
           });
    }

} //SOAPPackageImpl
