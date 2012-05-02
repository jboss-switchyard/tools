/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.soa.sca.sca1_1.model.sca.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScaFactoryImpl extends EFactoryImpl implements ScaFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ScaFactory init() {
        try {
            ScaFactory theScaFactory = (ScaFactory)EPackage.Registry.INSTANCE.getEFactory("http://docs.oasis-open.org/ns/opencsa/sca/200912"); 
            if (theScaFactory != null) {
                return theScaFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ScaFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ScaFactoryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ScaPackage.ACTIVATION_SPEC: return createActivationSpec();
            case ScaPackage.BINDING_PROPERTY: return createBindingProperty();
            case ScaPackage.BINDING_TYPE: return createBindingType();
            case ScaPackage.BPEL_IMPLEMENTATION: return createBPELImplementation();
            case ScaPackage.CALLBACK: return createCallback();
            case ScaPackage.CEXPORT: return createCExport();
            case ScaPackage.CFUNCTION: return createCFunction();
            case ScaPackage.CIMPLEMENTATION: return createCImplementation();
            case ScaPackage.CIMPLEMENTATION_FUNCTION: return createCImplementationFunction();
            case ScaPackage.CIMPORT: return createCImport();
            case ScaPackage.CINTERFACE: return createCInterface();
            case ScaPackage.COMMON_EXTENSION_BASE: return createCommonExtensionBase();
            case ScaPackage.COMPONENT: return createComponent();
            case ScaPackage.COMPONENT_REFERENCE: return createComponentReference();
            case ScaPackage.COMPONENT_SERVICE: return createComponentService();
            case ScaPackage.COMPONENT_TYPE: return createComponentType();
            case ScaPackage.COMPONENT_TYPE_REFERENCE: return createComponentTypeReference();
            case ScaPackage.COMPOSITE: return createComposite();
            case ScaPackage.CONNECTION: return createConnection();
            case ScaPackage.CONNECTION_SPEC: return createConnectionSpec();
            case ScaPackage.CONSTRAINING_PROPERTY: return createConstrainingProperty();
            case ScaPackage.CONSTRAINING_REFERENCE: return createConstrainingReference();
            case ScaPackage.CONSTRAINING_SERVICE: return createConstrainingService();
            case ScaPackage.CONSTRAINING_TYPE: return createConstrainingType();
            case ScaPackage.CONTRIBUTION_TYPE: return createContributionType();
            case ScaPackage.CPP_EXPORT: return createCPPExport();
            case ScaPackage.CPP_FUNCTION: return createCPPFunction();
            case ScaPackage.CPP_IMPLEMENTATION: return createCPPImplementation();
            case ScaPackage.CPP_IMPLEMENTATION_FUNCTION: return createCPPImplementationFunction();
            case ScaPackage.CPP_IMPORT: return createCPPImport();
            case ScaPackage.CPP_INTERFACE: return createCPPInterface();
            case ScaPackage.DEPLOYABLE_TYPE: return createDeployableType();
            case ScaPackage.DOCUMENTATION: return createDocumentation();
            case ScaPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case ScaPackage.EJB_IMPLEMENTATION: return createEJBImplementation();
            case ScaPackage.EJB_SESSION_BEAN_BINDING: return createEJBSessionBeanBinding();
            case ScaPackage.EXPORT_TYPE: return createExportType();
            case ScaPackage.IMPLEMENTATION_TYPE: return createImplementationType();
            case ScaPackage.IMPORT_TYPE: return createImportType();
            case ScaPackage.INBOUND_OPERATION: return createInboundOperation();
            case ScaPackage.INCLUDE: return createInclude();
            case ScaPackage.INTENT: return createIntent();
            case ScaPackage.INTENT_MAP: return createIntentMap();
            case ScaPackage.INTENT_QUALIFIER: return createIntentQualifier();
            case ScaPackage.INTERACTION_SPEC: return createInteractionSpec();
            case ScaPackage.JAVA_EXPORT_TYPE: return createJavaExportType();
            case ScaPackage.JAVA_IMPLEMENTATION: return createJavaImplementation();
            case ScaPackage.JAVA_IMPORT_TYPE: return createJavaImportType();
            case ScaPackage.JAVA_INTERFACE: return createJavaInterface();
            case ScaPackage.JCA_BINDING: return createJCABinding();
            case ScaPackage.JCA_INBOUND_CONNECTION: return createJCAInboundConnection();
            case ScaPackage.JCA_INBOUND_INTERACTION: return createJCAInboundInteraction();
            case ScaPackage.JCA_OUTBOUND_CONNECTION: return createJCAOutboundConnection();
            case ScaPackage.JCA_OUTBOUND_INTERACTION: return createJCAOutboundInteraction();
            case ScaPackage.JEE_IMPLEMENTATION: return createJEEImplementation();
            case ScaPackage.JMS_ACTIVATION_SPEC: return createJMSActivationSpec();
            case ScaPackage.JMS_BINDING: return createJMSBinding();
            case ScaPackage.JMS_CONNECTION_FACTORY: return createJMSConnectionFactory();
            case ScaPackage.JMS_DESTINATION: return createJMSDestination();
            case ScaPackage.JMS_HEADERS: return createJMSHeaders();
            case ScaPackage.JMS_MESSAGE_SELECTION: return createJMSMessageSelection();
            case ScaPackage.JMS_OPERATION_PROPERTIES: return createJMSOperationProperties();
            case ScaPackage.JMS_RESOURCE_ADAPTER: return createJMSResourceAdapter();
            case ScaPackage.JMS_RESPONSE: return createJMSResponse();
            case ScaPackage.OPERATION: return createOperation();
            case ScaPackage.POLICY_SET: return createPolicySet();
            case ScaPackage.POLICY_SET_ATTACHMENT: return createPolicySetAttachment();
            case ScaPackage.POLICY_SET_REFERENCE: return createPolicySetReference();
            case ScaPackage.PROPERTY: return createProperty();
            case ScaPackage.PROPERTY_VALUE: return createPropertyValue();
            case ScaPackage.QUALIFIER: return createQualifier();
            case ScaPackage.REFERENCE: return createReference();
            case ScaPackage.RESOURCE_ADAPTER: return createResourceAdapter();
            case ScaPackage.SCA_BINDING: return createSCABinding();
            case ScaPackage.SCA_IMPLEMENTATION: return createSCAImplementation();
            case ScaPackage.SCA_PROPERTY_BASE: return createSCAPropertyBase();
            case ScaPackage.SERVICE: return createService();
            case ScaPackage.SPRING_IMPLEMENTATION: return createSpringImplementation();
            case ScaPackage.TDEFINITIONS: return createTDefinitions();
            case ScaPackage.VALUE_TYPE: return createValueType();
            case ScaPackage.WEB_IMPLEMENTATION: return createWebImplementation();
            case ScaPackage.WEB_SERVICE_BINDING: return createWebServiceBinding();
            case ScaPackage.WIRE: return createWire();
            case ScaPackage.WS_CALLBACK_TYPE: return createWSCallbackType();
            case ScaPackage.WSDL_PORT_TYPE: return createWSDLPortType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case ScaPackage.CIMPLEMENTATION_SCOPE:
                return createCImplementationScopeFromString(eDataType, initialValue);
            case ScaPackage.CPP_IMPLEMENTATION_SCOPE:
                return createCPPImplementationScopeFromString(eDataType, initialValue);
            case ScaPackage.CREATE_RESOURCE:
                return createCreateResourceFromString(eDataType, initialValue);
            case ScaPackage.DELIVERY_MODE_TYPE:
                return createDeliveryModeTypeFromString(eDataType, initialValue);
            case ScaPackage.INTERACTION_OR_IMPLEMENTATION:
                return createInteractionOrImplementationFromString(eDataType, initialValue);
            case ScaPackage.JCA_CREATE_RESOURCE:
                return createJCACreateResourceFromString(eDataType, initialValue);
            case ScaPackage.JMS_CREATE_RESOURCE:
                return createJMSCreateResourceFromString(eDataType, initialValue);
            case ScaPackage.MULTIPLICITY:
                return createMultiplicityFromString(eDataType, initialValue);
            case ScaPackage.OVERRIDE_OPTIONS:
                return createOverrideOptionsFromString(eDataType, initialValue);
            case ScaPackage.PRIORITY_TYPE:
                return createPriorityTypeFromString(eDataType, initialValue);
            case ScaPackage.RES_AUTH:
                return createResAuthFromString(eDataType, initialValue);
            case ScaPackage.TYPE_TYPE:
                return createTypeTypeFromString(eDataType, initialValue);
            case ScaPackage.VERSION_VALUE:
                return createVersionValueFromString(eDataType, initialValue);
            case ScaPackage.CIMPLEMENTATION_SCOPE_OBJECT:
                return createCImplementationScopeObjectFromString(eDataType, initialValue);
            case ScaPackage.CPP_IMPLEMENTATION_SCOPE_OBJECT:
                return createCPPImplementationScopeObjectFromString(eDataType, initialValue);
            case ScaPackage.CREATE_RESOURCE_OBJECT:
                return createCreateResourceObjectFromString(eDataType, initialValue);
            case ScaPackage.DELIVERY_MODE_TYPE_OBJECT:
                return createDeliveryModeTypeObjectFromString(eDataType, initialValue);
            case ScaPackage.INTERACTION_OR_IMPLEMENTATION_OBJECT:
                return createInteractionOrImplementationObjectFromString(eDataType, initialValue);
            case ScaPackage.JCA_CREATE_RESOURCE_OBJECT:
                return createJCACreateResourceObjectFromString(eDataType, initialValue);
            case ScaPackage.JMS_CREATE_RESOURCE_OBJECT:
                return createJMSCreateResourceObjectFromString(eDataType, initialValue);
            case ScaPackage.LIST_OF_ANY_UR_IS:
                return createListOfAnyURIsFromString(eDataType, initialValue);
            case ScaPackage.LIST_OF_NC_NAMES:
                return createListOfNCNamesFromString(eDataType, initialValue);
            case ScaPackage.LIST_OF_QNAMES:
                return createListOfQNamesFromString(eDataType, initialValue);
            case ScaPackage.MULTIPLICITY_OBJECT:
                return createMultiplicityObjectFromString(eDataType, initialValue);
            case ScaPackage.OVERRIDE_OPTIONS_OBJECT:
                return createOverrideOptionsObjectFromString(eDataType, initialValue);
            case ScaPackage.PRIORITY_TYPE_OBJECT:
                return createPriorityTypeObjectFromString(eDataType, initialValue);
            case ScaPackage.RES_AUTH_OBJECT:
                return createResAuthObjectFromString(eDataType, initialValue);
            case ScaPackage.TYPE_TYPE_OBJECT:
                return createTypeTypeObjectFromString(eDataType, initialValue);
            case ScaPackage.VERSION_VALUE_OBJECT:
                return createVersionValueObjectFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case ScaPackage.CIMPLEMENTATION_SCOPE:
                return convertCImplementationScopeToString(eDataType, instanceValue);
            case ScaPackage.CPP_IMPLEMENTATION_SCOPE:
                return convertCPPImplementationScopeToString(eDataType, instanceValue);
            case ScaPackage.CREATE_RESOURCE:
                return convertCreateResourceToString(eDataType, instanceValue);
            case ScaPackage.DELIVERY_MODE_TYPE:
                return convertDeliveryModeTypeToString(eDataType, instanceValue);
            case ScaPackage.INTERACTION_OR_IMPLEMENTATION:
                return convertInteractionOrImplementationToString(eDataType, instanceValue);
            case ScaPackage.JCA_CREATE_RESOURCE:
                return convertJCACreateResourceToString(eDataType, instanceValue);
            case ScaPackage.JMS_CREATE_RESOURCE:
                return convertJMSCreateResourceToString(eDataType, instanceValue);
            case ScaPackage.MULTIPLICITY:
                return convertMultiplicityToString(eDataType, instanceValue);
            case ScaPackage.OVERRIDE_OPTIONS:
                return convertOverrideOptionsToString(eDataType, instanceValue);
            case ScaPackage.PRIORITY_TYPE:
                return convertPriorityTypeToString(eDataType, instanceValue);
            case ScaPackage.RES_AUTH:
                return convertResAuthToString(eDataType, instanceValue);
            case ScaPackage.TYPE_TYPE:
                return convertTypeTypeToString(eDataType, instanceValue);
            case ScaPackage.VERSION_VALUE:
                return convertVersionValueToString(eDataType, instanceValue);
            case ScaPackage.CIMPLEMENTATION_SCOPE_OBJECT:
                return convertCImplementationScopeObjectToString(eDataType, instanceValue);
            case ScaPackage.CPP_IMPLEMENTATION_SCOPE_OBJECT:
                return convertCPPImplementationScopeObjectToString(eDataType, instanceValue);
            case ScaPackage.CREATE_RESOURCE_OBJECT:
                return convertCreateResourceObjectToString(eDataType, instanceValue);
            case ScaPackage.DELIVERY_MODE_TYPE_OBJECT:
                return convertDeliveryModeTypeObjectToString(eDataType, instanceValue);
            case ScaPackage.INTERACTION_OR_IMPLEMENTATION_OBJECT:
                return convertInteractionOrImplementationObjectToString(eDataType, instanceValue);
            case ScaPackage.JCA_CREATE_RESOURCE_OBJECT:
                return convertJCACreateResourceObjectToString(eDataType, instanceValue);
            case ScaPackage.JMS_CREATE_RESOURCE_OBJECT:
                return convertJMSCreateResourceObjectToString(eDataType, instanceValue);
            case ScaPackage.LIST_OF_ANY_UR_IS:
                return convertListOfAnyURIsToString(eDataType, instanceValue);
            case ScaPackage.LIST_OF_NC_NAMES:
                return convertListOfNCNamesToString(eDataType, instanceValue);
            case ScaPackage.LIST_OF_QNAMES:
                return convertListOfQNamesToString(eDataType, instanceValue);
            case ScaPackage.MULTIPLICITY_OBJECT:
                return convertMultiplicityObjectToString(eDataType, instanceValue);
            case ScaPackage.OVERRIDE_OPTIONS_OBJECT:
                return convertOverrideOptionsObjectToString(eDataType, instanceValue);
            case ScaPackage.PRIORITY_TYPE_OBJECT:
                return convertPriorityTypeObjectToString(eDataType, instanceValue);
            case ScaPackage.RES_AUTH_OBJECT:
                return convertResAuthObjectToString(eDataType, instanceValue);
            case ScaPackage.TYPE_TYPE_OBJECT:
                return convertTypeTypeObjectToString(eDataType, instanceValue);
            case ScaPackage.VERSION_VALUE_OBJECT:
                return convertVersionValueObjectToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ActivationSpec createActivationSpec() {
        ActivationSpecImpl activationSpec = new ActivationSpecImpl();
        return activationSpec;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BindingProperty createBindingProperty() {
        BindingPropertyImpl bindingProperty = new BindingPropertyImpl();
        return bindingProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BindingType createBindingType() {
        BindingTypeImpl bindingType = new BindingTypeImpl();
        return bindingType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BPELImplementation createBPELImplementation() {
        BPELImplementationImpl bpelImplementation = new BPELImplementationImpl();
        return bpelImplementation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Callback createCallback() {
        CallbackImpl callback = new CallbackImpl();
        return callback;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CExport createCExport() {
        CExportImpl cExport = new CExportImpl();
        return cExport;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CFunction createCFunction() {
        CFunctionImpl cFunction = new CFunctionImpl();
        return cFunction;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CImplementation createCImplementation() {
        CImplementationImpl cImplementation = new CImplementationImpl();
        return cImplementation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CImplementationFunction createCImplementationFunction() {
        CImplementationFunctionImpl cImplementationFunction = new CImplementationFunctionImpl();
        return cImplementationFunction;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CImport createCImport() {
        CImportImpl cImport = new CImportImpl();
        return cImport;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CInterface createCInterface() {
        CInterfaceImpl cInterface = new CInterfaceImpl();
        return cInterface;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CommonExtensionBase createCommonExtensionBase() {
        CommonExtensionBaseImpl commonExtensionBase = new CommonExtensionBaseImpl();
        return commonExtensionBase;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Component createComponent() {
        ComponentImpl component = new ComponentImpl();
        return component;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ComponentReference createComponentReference() {
        ComponentReferenceImpl componentReference = new ComponentReferenceImpl();
        return componentReference;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ComponentService createComponentService() {
        ComponentServiceImpl componentService = new ComponentServiceImpl();
        return componentService;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ComponentType createComponentType() {
        ComponentTypeImpl componentType = new ComponentTypeImpl();
        return componentType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ComponentTypeReference createComponentTypeReference() {
        ComponentTypeReferenceImpl componentTypeReference = new ComponentTypeReferenceImpl();
        return componentTypeReference;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Composite createComposite() {
        CompositeImpl composite = new CompositeImpl();
        return composite;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Connection createConnection() {
        ConnectionImpl connection = new ConnectionImpl();
        return connection;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ConnectionSpec createConnectionSpec() {
        ConnectionSpecImpl connectionSpec = new ConnectionSpecImpl();
        return connectionSpec;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ConstrainingProperty createConstrainingProperty() {
        ConstrainingPropertyImpl constrainingProperty = new ConstrainingPropertyImpl();
        return constrainingProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ConstrainingReference createConstrainingReference() {
        ConstrainingReferenceImpl constrainingReference = new ConstrainingReferenceImpl();
        return constrainingReference;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ConstrainingService createConstrainingService() {
        ConstrainingServiceImpl constrainingService = new ConstrainingServiceImpl();
        return constrainingService;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ConstrainingType createConstrainingType() {
        ConstrainingTypeImpl constrainingType = new ConstrainingTypeImpl();
        return constrainingType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ContributionType createContributionType() {
        ContributionTypeImpl contributionType = new ContributionTypeImpl();
        return contributionType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CPPExport createCPPExport() {
        CPPExportImpl cppExport = new CPPExportImpl();
        return cppExport;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CPPFunction createCPPFunction() {
        CPPFunctionImpl cppFunction = new CPPFunctionImpl();
        return cppFunction;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CPPImplementation createCPPImplementation() {
        CPPImplementationImpl cppImplementation = new CPPImplementationImpl();
        return cppImplementation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CPPImplementationFunction createCPPImplementationFunction() {
        CPPImplementationFunctionImpl cppImplementationFunction = new CPPImplementationFunctionImpl();
        return cppImplementationFunction;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CPPImport createCPPImport() {
        CPPImportImpl cppImport = new CPPImportImpl();
        return cppImport;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CPPInterface createCPPInterface() {
        CPPInterfaceImpl cppInterface = new CPPInterfaceImpl();
        return cppInterface;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DeployableType createDeployableType() {
        DeployableTypeImpl deployableType = new DeployableTypeImpl();
        return deployableType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Documentation createDocumentation() {
        DocumentationImpl documentation = new DocumentationImpl();
        return documentation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EJBImplementation createEJBImplementation() {
        EJBImplementationImpl ejbImplementation = new EJBImplementationImpl();
        return ejbImplementation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EJBSessionBeanBinding createEJBSessionBeanBinding() {
        EJBSessionBeanBindingImpl ejbSessionBeanBinding = new EJBSessionBeanBindingImpl();
        return ejbSessionBeanBinding;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ExportType createExportType() {
        ExportTypeImpl exportType = new ExportTypeImpl();
        return exportType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ImplementationType createImplementationType() {
        ImplementationTypeImpl implementationType = new ImplementationTypeImpl();
        return implementationType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ImportType createImportType() {
        ImportTypeImpl importType = new ImportTypeImpl();
        return importType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public InboundOperation createInboundOperation() {
        InboundOperationImpl inboundOperation = new InboundOperationImpl();
        return inboundOperation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Include createInclude() {
        IncludeImpl include = new IncludeImpl();
        return include;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Intent createIntent() {
        IntentImpl intent = new IntentImpl();
        return intent;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public IntentMap createIntentMap() {
        IntentMapImpl intentMap = new IntentMapImpl();
        return intentMap;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public IntentQualifier createIntentQualifier() {
        IntentQualifierImpl intentQualifier = new IntentQualifierImpl();
        return intentQualifier;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public InteractionSpec createInteractionSpec() {
        InteractionSpecImpl interactionSpec = new InteractionSpecImpl();
        return interactionSpec;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JavaExportType createJavaExportType() {
        JavaExportTypeImpl javaExportType = new JavaExportTypeImpl();
        return javaExportType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JavaImplementation createJavaImplementation() {
        JavaImplementationImpl javaImplementation = new JavaImplementationImpl();
        return javaImplementation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JavaImportType createJavaImportType() {
        JavaImportTypeImpl javaImportType = new JavaImportTypeImpl();
        return javaImportType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JavaInterface createJavaInterface() {
        JavaInterfaceImpl javaInterface = new JavaInterfaceImpl();
        return javaInterface;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JCABinding createJCABinding() {
        JCABindingImpl jcaBinding = new JCABindingImpl();
        return jcaBinding;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JCAInboundConnection createJCAInboundConnection() {
        JCAInboundConnectionImpl jcaInboundConnection = new JCAInboundConnectionImpl();
        return jcaInboundConnection;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JCAInboundInteraction createJCAInboundInteraction() {
        JCAInboundInteractionImpl jcaInboundInteraction = new JCAInboundInteractionImpl();
        return jcaInboundInteraction;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JCAOutboundConnection createJCAOutboundConnection() {
        JCAOutboundConnectionImpl jcaOutboundConnection = new JCAOutboundConnectionImpl();
        return jcaOutboundConnection;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JCAOutboundInteraction createJCAOutboundInteraction() {
        JCAOutboundInteractionImpl jcaOutboundInteraction = new JCAOutboundInteractionImpl();
        return jcaOutboundInteraction;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JEEImplementation createJEEImplementation() {
        JEEImplementationImpl jeeImplementation = new JEEImplementationImpl();
        return jeeImplementation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JMSActivationSpec createJMSActivationSpec() {
        JMSActivationSpecImpl jmsActivationSpec = new JMSActivationSpecImpl();
        return jmsActivationSpec;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JMSBinding createJMSBinding() {
        JMSBindingImpl jmsBinding = new JMSBindingImpl();
        return jmsBinding;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JMSConnectionFactory createJMSConnectionFactory() {
        JMSConnectionFactoryImpl jmsConnectionFactory = new JMSConnectionFactoryImpl();
        return jmsConnectionFactory;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JMSDestination createJMSDestination() {
        JMSDestinationImpl jmsDestination = new JMSDestinationImpl();
        return jmsDestination;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JMSHeaders createJMSHeaders() {
        JMSHeadersImpl jmsHeaders = new JMSHeadersImpl();
        return jmsHeaders;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JMSMessageSelection createJMSMessageSelection() {
        JMSMessageSelectionImpl jmsMessageSelection = new JMSMessageSelectionImpl();
        return jmsMessageSelection;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JMSOperationProperties createJMSOperationProperties() {
        JMSOperationPropertiesImpl jmsOperationProperties = new JMSOperationPropertiesImpl();
        return jmsOperationProperties;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JMSResourceAdapter createJMSResourceAdapter() {
        JMSResourceAdapterImpl jmsResourceAdapter = new JMSResourceAdapterImpl();
        return jmsResourceAdapter;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JMSResponse createJMSResponse() {
        JMSResponseImpl jmsResponse = new JMSResponseImpl();
        return jmsResponse;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Operation createOperation() {
        OperationImpl operation = new OperationImpl();
        return operation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PolicySet createPolicySet() {
        PolicySetImpl policySet = new PolicySetImpl();
        return policySet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PolicySetAttachment createPolicySetAttachment() {
        PolicySetAttachmentImpl policySetAttachment = new PolicySetAttachmentImpl();
        return policySetAttachment;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PolicySetReference createPolicySetReference() {
        PolicySetReferenceImpl policySetReference = new PolicySetReferenceImpl();
        return policySetReference;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Property createProperty() {
        PropertyImpl property = new PropertyImpl();
        return property;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PropertyValue createPropertyValue() {
        PropertyValueImpl propertyValue = new PropertyValueImpl();
        return propertyValue;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Qualifier createQualifier() {
        QualifierImpl qualifier = new QualifierImpl();
        return qualifier;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Reference createReference() {
        ReferenceImpl reference = new ReferenceImpl();
        return reference;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResourceAdapter createResourceAdapter() {
        ResourceAdapterImpl resourceAdapter = new ResourceAdapterImpl();
        return resourceAdapter;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SCABinding createSCABinding() {
        SCABindingImpl scaBinding = new SCABindingImpl();
        return scaBinding;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SCAImplementation createSCAImplementation() {
        SCAImplementationImpl scaImplementation = new SCAImplementationImpl();
        return scaImplementation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SCAPropertyBase createSCAPropertyBase() {
        SCAPropertyBaseImpl scaPropertyBase = new SCAPropertyBaseImpl();
        return scaPropertyBase;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Service createService() {
        ServiceImpl service = new ServiceImpl();
        return service;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SpringImplementation createSpringImplementation() {
        SpringImplementationImpl springImplementation = new SpringImplementationImpl();
        return springImplementation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TDefinitions createTDefinitions() {
        TDefinitionsImpl tDefinitions = new TDefinitionsImpl();
        return tDefinitions;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ValueType createValueType() {
        ValueTypeImpl valueType = new ValueTypeImpl();
        return valueType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WebImplementation createWebImplementation() {
        WebImplementationImpl webImplementation = new WebImplementationImpl();
        return webImplementation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WebServiceBinding createWebServiceBinding() {
        WebServiceBindingImpl webServiceBinding = new WebServiceBindingImpl();
        return webServiceBinding;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Wire createWire() {
        WireImpl wire = new WireImpl();
        return wire;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WSCallbackType createWSCallbackType() {
        WSCallbackTypeImpl wsCallbackType = new WSCallbackTypeImpl();
        return wsCallbackType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WSDLPortType createWSDLPortType() {
        WSDLPortTypeImpl wsdlPortType = new WSDLPortTypeImpl();
        return wsdlPortType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CImplementationScope createCImplementationScopeFromString(EDataType eDataType, String initialValue) {
        CImplementationScope result = CImplementationScope.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertCImplementationScopeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CPPImplementationScope createCPPImplementationScopeFromString(EDataType eDataType, String initialValue) {
        CPPImplementationScope result = CPPImplementationScope.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertCPPImplementationScopeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CreateResource createCreateResourceFromString(EDataType eDataType, String initialValue) {
        CreateResource result = CreateResource.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertCreateResourceToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DeliveryModeType createDeliveryModeTypeFromString(EDataType eDataType, String initialValue) {
        DeliveryModeType result = DeliveryModeType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertDeliveryModeTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public InteractionOrImplementation createInteractionOrImplementationFromString(EDataType eDataType, String initialValue) {
        InteractionOrImplementation result = InteractionOrImplementation.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertInteractionOrImplementationToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JCACreateResource createJCACreateResourceFromString(EDataType eDataType, String initialValue) {
        JCACreateResource result = JCACreateResource.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertJCACreateResourceToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JMSCreateResource createJMSCreateResourceFromString(EDataType eDataType, String initialValue) {
        JMSCreateResource result = JMSCreateResource.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertJMSCreateResourceToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Multiplicity createMultiplicityFromString(EDataType eDataType, String initialValue) {
        Multiplicity result = Multiplicity.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertMultiplicityToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public OverrideOptions createOverrideOptionsFromString(EDataType eDataType, String initialValue) {
        OverrideOptions result = OverrideOptions.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertOverrideOptionsToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PriorityType createPriorityTypeFromString(EDataType eDataType, String initialValue) {
        PriorityType result = PriorityType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertPriorityTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResAuth createResAuthFromString(EDataType eDataType, String initialValue) {
        ResAuth result = ResAuth.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertResAuthToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
        TypeType result = TypeType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public VersionValue createVersionValueFromString(EDataType eDataType, String initialValue) {
        VersionValue result = VersionValue.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertVersionValueToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CImplementationScope createCImplementationScopeObjectFromString(EDataType eDataType, String initialValue) {
        return createCImplementationScopeFromString(ScaPackage.eINSTANCE.getCImplementationScope(), initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertCImplementationScopeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertCImplementationScopeToString(ScaPackage.eINSTANCE.getCImplementationScope(), instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CPPImplementationScope createCPPImplementationScopeObjectFromString(EDataType eDataType, String initialValue) {
        return createCPPImplementationScopeFromString(ScaPackage.eINSTANCE.getCPPImplementationScope(), initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertCPPImplementationScopeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertCPPImplementationScopeToString(ScaPackage.eINSTANCE.getCPPImplementationScope(), instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CreateResource createCreateResourceObjectFromString(EDataType eDataType, String initialValue) {
        return createCreateResourceFromString(ScaPackage.eINSTANCE.getCreateResource(), initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertCreateResourceObjectToString(EDataType eDataType, Object instanceValue) {
        return convertCreateResourceToString(ScaPackage.eINSTANCE.getCreateResource(), instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DeliveryModeType createDeliveryModeTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createDeliveryModeTypeFromString(ScaPackage.eINSTANCE.getDeliveryModeType(), initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertDeliveryModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertDeliveryModeTypeToString(ScaPackage.eINSTANCE.getDeliveryModeType(), instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public InteractionOrImplementation createInteractionOrImplementationObjectFromString(EDataType eDataType, String initialValue) {
        return createInteractionOrImplementationFromString(ScaPackage.eINSTANCE.getInteractionOrImplementation(), initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertInteractionOrImplementationObjectToString(EDataType eDataType, Object instanceValue) {
        return convertInteractionOrImplementationToString(ScaPackage.eINSTANCE.getInteractionOrImplementation(), instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JCACreateResource createJCACreateResourceObjectFromString(EDataType eDataType, String initialValue) {
        return createJCACreateResourceFromString(ScaPackage.eINSTANCE.getJCACreateResource(), initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertJCACreateResourceObjectToString(EDataType eDataType, Object instanceValue) {
        return convertJCACreateResourceToString(ScaPackage.eINSTANCE.getJCACreateResource(), instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JMSCreateResource createJMSCreateResourceObjectFromString(EDataType eDataType, String initialValue) {
        return createJMSCreateResourceFromString(ScaPackage.eINSTANCE.getJMSCreateResource(), initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertJMSCreateResourceObjectToString(EDataType eDataType, Object instanceValue) {
        return convertJMSCreateResourceToString(ScaPackage.eINSTANCE.getJMSCreateResource(), instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public List<String> createListOfAnyURIsFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        List<String> result = new ArrayList<String>();
        for (String item : split(initialValue)) {
            result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, item));
        }
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertListOfAnyURIsToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        List<?> list = (List<?>)instanceValue;
        if (list.isEmpty()) return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public List<String> createListOfNCNamesFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        List<String> result = new ArrayList<String>();
        for (String item : split(initialValue)) {
            result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, item));
        }
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertListOfNCNamesToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        List<?> list = (List<?>)instanceValue;
        if (list.isEmpty()) return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public List<QName> createListOfQNamesFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        List<QName> result = new ArrayList<QName>();
        for (String item : split(initialValue)) {
            result.add((QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, item));
        }
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertListOfQNamesToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        List<?> list = (List<?>)instanceValue;
        if (list.isEmpty()) return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Multiplicity createMultiplicityObjectFromString(EDataType eDataType, String initialValue) {
        return createMultiplicityFromString(ScaPackage.eINSTANCE.getMultiplicity(), initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertMultiplicityObjectToString(EDataType eDataType, Object instanceValue) {
        return convertMultiplicityToString(ScaPackage.eINSTANCE.getMultiplicity(), instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public OverrideOptions createOverrideOptionsObjectFromString(EDataType eDataType, String initialValue) {
        return createOverrideOptionsFromString(ScaPackage.eINSTANCE.getOverrideOptions(), initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertOverrideOptionsObjectToString(EDataType eDataType, Object instanceValue) {
        return convertOverrideOptionsToString(ScaPackage.eINSTANCE.getOverrideOptions(), instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PriorityType createPriorityTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createPriorityTypeFromString(ScaPackage.eINSTANCE.getPriorityType(), initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertPriorityTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertPriorityTypeToString(ScaPackage.eINSTANCE.getPriorityType(), instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResAuth createResAuthObjectFromString(EDataType eDataType, String initialValue) {
        return createResAuthFromString(ScaPackage.eINSTANCE.getResAuth(), initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertResAuthObjectToString(EDataType eDataType, Object instanceValue) {
        return convertResAuthToString(ScaPackage.eINSTANCE.getResAuth(), instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createTypeTypeFromString(ScaPackage.eINSTANCE.getTypeType(), initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertTypeTypeToString(ScaPackage.eINSTANCE.getTypeType(), instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public VersionValue createVersionValueObjectFromString(EDataType eDataType, String initialValue) {
        return createVersionValueFromString(ScaPackage.eINSTANCE.getVersionValue(), initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertVersionValueObjectToString(EDataType eDataType, Object instanceValue) {
        return convertVersionValueToString(ScaPackage.eINSTANCE.getVersionValue(), instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ScaPackage getScaPackage() {
        return (ScaPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static ScaPackage getPackage() {
        return ScaPackage.eINSTANCE;
    }

} //ScaFactoryImpl
