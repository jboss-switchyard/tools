/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.soa.sca.sca1_1.model.sca.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage
 * @generated
 */
public class ScaValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ScaValidator INSTANCE = new ScaValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.soa.sca.sca1_1.model.sca";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ScaPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ScaPackage.ACTIVATION_SPEC:
				return validateActivationSpec((ActivationSpec)value, diagnostics, context);
			case ScaPackage.BINDING:
				return validateBinding((Binding)value, diagnostics, context);
			case ScaPackage.BINDING_PROPERTY:
				return validateBindingProperty((BindingProperty)value, diagnostics, context);
			case ScaPackage.BINDING_TYPE:
				return validateBindingType((BindingType)value, diagnostics, context);
			case ScaPackage.BPEL_IMPLEMENTATION:
				return validateBPELImplementation((BPELImplementation)value, diagnostics, context);
			case ScaPackage.CALLBACK:
				return validateCallback((Callback)value, diagnostics, context);
			case ScaPackage.CEXPORT:
				return validateCExport((CExport)value, diagnostics, context);
			case ScaPackage.CFUNCTION:
				return validateCFunction((CFunction)value, diagnostics, context);
			case ScaPackage.CIMPLEMENTATION:
				return validateCImplementation((CImplementation)value, diagnostics, context);
			case ScaPackage.CIMPLEMENTATION_FUNCTION:
				return validateCImplementationFunction((CImplementationFunction)value, diagnostics, context);
			case ScaPackage.CIMPORT:
				return validateCImport((CImport)value, diagnostics, context);
			case ScaPackage.CINTERFACE:
				return validateCInterface((CInterface)value, diagnostics, context);
			case ScaPackage.COMMON_EXTENSION_BASE:
				return validateCommonExtensionBase((CommonExtensionBase)value, diagnostics, context);
			case ScaPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case ScaPackage.COMPONENT_REFERENCE:
				return validateComponentReference((ComponentReference)value, diagnostics, context);
			case ScaPackage.COMPONENT_SERVICE:
				return validateComponentService((ComponentService)value, diagnostics, context);
			case ScaPackage.COMPONENT_TYPE:
				return validateComponentType((ComponentType)value, diagnostics, context);
			case ScaPackage.COMPONENT_TYPE_REFERENCE:
				return validateComponentTypeReference((ComponentTypeReference)value, diagnostics, context);
			case ScaPackage.COMPOSITE:
				return validateComposite((Composite)value, diagnostics, context);
			case ScaPackage.CONNECTION:
				return validateConnection((Connection)value, diagnostics, context);
			case ScaPackage.CONNECTION_SPEC:
				return validateConnectionSpec((ConnectionSpec)value, diagnostics, context);
			case ScaPackage.CONSTRAINING_PROPERTY:
				return validateConstrainingProperty((ConstrainingProperty)value, diagnostics, context);
			case ScaPackage.CONSTRAINING_REFERENCE:
				return validateConstrainingReference((ConstrainingReference)value, diagnostics, context);
			case ScaPackage.CONSTRAINING_SERVICE:
				return validateConstrainingService((ConstrainingService)value, diagnostics, context);
			case ScaPackage.CONSTRAINING_TYPE:
				return validateConstrainingType((ConstrainingType)value, diagnostics, context);
			case ScaPackage.CONTRACT:
				return validateContract((Contract)value, diagnostics, context);
			case ScaPackage.CONTRIBUTION_TYPE:
				return validateContributionType((ContributionType)value, diagnostics, context);
			case ScaPackage.CPP_EXPORT:
				return validateCPPExport((CPPExport)value, diagnostics, context);
			case ScaPackage.CPP_FUNCTION:
				return validateCPPFunction((CPPFunction)value, diagnostics, context);
			case ScaPackage.CPP_IMPLEMENTATION:
				return validateCPPImplementation((CPPImplementation)value, diagnostics, context);
			case ScaPackage.CPP_IMPLEMENTATION_FUNCTION:
				return validateCPPImplementationFunction((CPPImplementationFunction)value, diagnostics, context);
			case ScaPackage.CPP_IMPORT:
				return validateCPPImport((CPPImport)value, diagnostics, context);
			case ScaPackage.CPP_INTERFACE:
				return validateCPPInterface((CPPInterface)value, diagnostics, context);
			case ScaPackage.DEPLOYABLE_TYPE:
				return validateDeployableType((DeployableType)value, diagnostics, context);
			case ScaPackage.DOCUMENTATION:
				return validateDocumentation((Documentation)value, diagnostics, context);
			case ScaPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case ScaPackage.EJB_IMPLEMENTATION:
				return validateEJBImplementation((EJBImplementation)value, diagnostics, context);
			case ScaPackage.EJB_SESSION_BEAN_BINDING:
				return validateEJBSessionBeanBinding((EJBSessionBeanBinding)value, diagnostics, context);
			case ScaPackage.EXPORT:
				return validateExport((Export)value, diagnostics, context);
			case ScaPackage.EXPORT_TYPE:
				return validateExportType((ExportType)value, diagnostics, context);
			case ScaPackage.IMPLEMENTATION:
				return validateImplementation((Implementation)value, diagnostics, context);
			case ScaPackage.IMPLEMENTATION_TYPE:
				return validateImplementationType((ImplementationType)value, diagnostics, context);
			case ScaPackage.IMPORT:
				return validateImport((Import)value, diagnostics, context);
			case ScaPackage.IMPORT_TYPE:
				return validateImportType((ImportType)value, diagnostics, context);
			case ScaPackage.INBOUND_OPERATION:
				return validateInboundOperation((InboundOperation)value, diagnostics, context);
			case ScaPackage.INCLUDE:
				return validateInclude((Include)value, diagnostics, context);
			case ScaPackage.INTENT:
				return validateIntent((Intent)value, diagnostics, context);
			case ScaPackage.INTENT_MAP:
				return validateIntentMap((IntentMap)value, diagnostics, context);
			case ScaPackage.INTENT_QUALIFIER:
				return validateIntentQualifier((IntentQualifier)value, diagnostics, context);
			case ScaPackage.INTERACTION_SPEC:
				return validateInteractionSpec((InteractionSpec)value, diagnostics, context);
			case ScaPackage.INTERFACE:
				return validateInterface((Interface)value, diagnostics, context);
			case ScaPackage.JAVA_EXPORT_TYPE:
				return validateJavaExportType((JavaExportType)value, diagnostics, context);
			case ScaPackage.JAVA_IMPLEMENTATION:
				return validateJavaImplementation((JavaImplementation)value, diagnostics, context);
			case ScaPackage.JAVA_IMPORT_TYPE:
				return validateJavaImportType((JavaImportType)value, diagnostics, context);
			case ScaPackage.JAVA_INTERFACE:
				return validateJavaInterface((JavaInterface)value, diagnostics, context);
			case ScaPackage.JCA_BINDING:
				return validateJCABinding((JCABinding)value, diagnostics, context);
			case ScaPackage.JCA_INBOUND_CONNECTION:
				return validateJCAInboundConnection((JCAInboundConnection)value, diagnostics, context);
			case ScaPackage.JCA_INBOUND_INTERACTION:
				return validateJCAInboundInteraction((JCAInboundInteraction)value, diagnostics, context);
			case ScaPackage.JCA_OUTBOUND_CONNECTION:
				return validateJCAOutboundConnection((JCAOutboundConnection)value, diagnostics, context);
			case ScaPackage.JCA_OUTBOUND_INTERACTION:
				return validateJCAOutboundInteraction((JCAOutboundInteraction)value, diagnostics, context);
			case ScaPackage.JEE_IMPLEMENTATION:
				return validateJEEImplementation((JEEImplementation)value, diagnostics, context);
			case ScaPackage.JMS_ACTIVATION_SPEC:
				return validateJMSActivationSpec((JMSActivationSpec)value, diagnostics, context);
			case ScaPackage.JMS_BINDING:
				return validateJMSBinding((JMSBinding)value, diagnostics, context);
			case ScaPackage.JMS_CONNECTION_FACTORY:
				return validateJMSConnectionFactory((JMSConnectionFactory)value, diagnostics, context);
			case ScaPackage.JMS_DESTINATION:
				return validateJMSDestination((JMSDestination)value, diagnostics, context);
			case ScaPackage.JMS_HEADERS:
				return validateJMSHeaders((JMSHeaders)value, diagnostics, context);
			case ScaPackage.JMS_MESSAGE_SELECTION:
				return validateJMSMessageSelection((JMSMessageSelection)value, diagnostics, context);
			case ScaPackage.JMS_OPERATION_PROPERTIES:
				return validateJMSOperationProperties((JMSOperationProperties)value, diagnostics, context);
			case ScaPackage.JMS_RESOURCE_ADAPTER:
				return validateJMSResourceAdapter((JMSResourceAdapter)value, diagnostics, context);
			case ScaPackage.JMS_RESPONSE:
				return validateJMSResponse((JMSResponse)value, diagnostics, context);
			case ScaPackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case ScaPackage.OPERATION_SELECTOR_TYPE:
				return validateOperationSelectorType((OperationSelectorType)value, diagnostics, context);
			case ScaPackage.POLICY_SET:
				return validatePolicySet((PolicySet)value, diagnostics, context);
			case ScaPackage.POLICY_SET_ATTACHMENT:
				return validatePolicySetAttachment((PolicySetAttachment)value, diagnostics, context);
			case ScaPackage.POLICY_SET_REFERENCE:
				return validatePolicySetReference((PolicySetReference)value, diagnostics, context);
			case ScaPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case ScaPackage.PROPERTY_VALUE:
				return validatePropertyValue((PropertyValue)value, diagnostics, context);
			case ScaPackage.QUALIFIER:
				return validateQualifier((Qualifier)value, diagnostics, context);
			case ScaPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case ScaPackage.RESOURCE_ADAPTER:
				return validateResourceAdapter((ResourceAdapter)value, diagnostics, context);
			case ScaPackage.SCA_BINDING:
				return validateSCABinding((SCABinding)value, diagnostics, context);
			case ScaPackage.SCA_IMPLEMENTATION:
				return validateSCAImplementation((SCAImplementation)value, diagnostics, context);
			case ScaPackage.SCA_PROPERTY_BASE:
				return validateSCAPropertyBase((SCAPropertyBase)value, diagnostics, context);
			case ScaPackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case ScaPackage.SPRING_IMPLEMENTATION:
				return validateSpringImplementation((SpringImplementation)value, diagnostics, context);
			case ScaPackage.TDEFINITIONS:
				return validateTDefinitions((TDefinitions)value, diagnostics, context);
			case ScaPackage.VALUE_TYPE:
				return validateValueType((ValueType)value, diagnostics, context);
			case ScaPackage.WEB_IMPLEMENTATION:
				return validateWebImplementation((WebImplementation)value, diagnostics, context);
			case ScaPackage.WEB_SERVICE_BINDING:
				return validateWebServiceBinding((WebServiceBinding)value, diagnostics, context);
			case ScaPackage.WIRE:
				return validateWire((Wire)value, diagnostics, context);
			case ScaPackage.WIRE_FORMAT_TYPE:
				return validateWireFormatType((WireFormatType)value, diagnostics, context);
			case ScaPackage.WS_CALLBACK_TYPE:
				return validateWSCallbackType((WSCallbackType)value, diagnostics, context);
			case ScaPackage.WSDL_PORT_TYPE:
				return validateWSDLPortType((WSDLPortType)value, diagnostics, context);
			case ScaPackage.CIMPLEMENTATION_SCOPE:
				return validateCImplementationScope((CImplementationScope)value, diagnostics, context);
			case ScaPackage.CPP_IMPLEMENTATION_SCOPE:
				return validateCPPImplementationScope((CPPImplementationScope)value, diagnostics, context);
			case ScaPackage.CREATE_RESOURCE:
				return validateCreateResource((CreateResource)value, diagnostics, context);
			case ScaPackage.DELIVERY_MODE_TYPE:
				return validateDeliveryModeType((DeliveryModeType)value, diagnostics, context);
			case ScaPackage.INTERACTION_OR_IMPLEMENTATION:
				return validateInteractionOrImplementation((InteractionOrImplementation)value, diagnostics, context);
			case ScaPackage.JCA_CREATE_RESOURCE:
				return validateJCACreateResource((JCACreateResource)value, diagnostics, context);
			case ScaPackage.JMS_CREATE_RESOURCE:
				return validateJMSCreateResource((JMSCreateResource)value, diagnostics, context);
			case ScaPackage.MULTIPLICITY:
				return validateMultiplicity((Multiplicity)value, diagnostics, context);
			case ScaPackage.OVERRIDE_OPTIONS:
				return validateOverrideOptions((OverrideOptions)value, diagnostics, context);
			case ScaPackage.PRIORITY_TYPE:
				return validatePriorityType((PriorityType)value, diagnostics, context);
			case ScaPackage.RES_AUTH:
				return validateResAuth((ResAuth)value, diagnostics, context);
			case ScaPackage.TYPE_TYPE:
				return validateTypeType((TypeType)value, diagnostics, context);
			case ScaPackage.VERSION_VALUE:
				return validateVersionValue((VersionValue)value, diagnostics, context);
			case ScaPackage.CIMPLEMENTATION_SCOPE_OBJECT:
				return validateCImplementationScopeObject((CImplementationScope)value, diagnostics, context);
			case ScaPackage.CPP_IMPLEMENTATION_SCOPE_OBJECT:
				return validateCPPImplementationScopeObject((CPPImplementationScope)value, diagnostics, context);
			case ScaPackage.CREATE_RESOURCE_OBJECT:
				return validateCreateResourceObject((CreateResource)value, diagnostics, context);
			case ScaPackage.DELIVERY_MODE_TYPE_OBJECT:
				return validateDeliveryModeTypeObject((DeliveryModeType)value, diagnostics, context);
			case ScaPackage.INTERACTION_OR_IMPLEMENTATION_OBJECT:
				return validateInteractionOrImplementationObject((InteractionOrImplementation)value, diagnostics, context);
			case ScaPackage.JCA_CREATE_RESOURCE_OBJECT:
				return validateJCACreateResourceObject((JCACreateResource)value, diagnostics, context);
			case ScaPackage.JMS_CREATE_RESOURCE_OBJECT:
				return validateJMSCreateResourceObject((JMSCreateResource)value, diagnostics, context);
			case ScaPackage.LIST_OF_ANY_UR_IS:
				return validateListOfAnyURIs((List<?>)value, diagnostics, context);
			case ScaPackage.LIST_OF_NC_NAMES:
				return validateListOfNCNames((List<?>)value, diagnostics, context);
			case ScaPackage.LIST_OF_QNAMES:
				return validateListOfQNames((List<?>)value, diagnostics, context);
			case ScaPackage.MULTIPLICITY_OBJECT:
				return validateMultiplicityObject((Multiplicity)value, diagnostics, context);
			case ScaPackage.OVERRIDE_OPTIONS_OBJECT:
				return validateOverrideOptionsObject((OverrideOptions)value, diagnostics, context);
			case ScaPackage.PRIORITY_TYPE_OBJECT:
				return validatePriorityTypeObject((PriorityType)value, diagnostics, context);
			case ScaPackage.RES_AUTH_OBJECT:
				return validateResAuthObject((ResAuth)value, diagnostics, context);
			case ScaPackage.TYPE_TYPE_OBJECT:
				return validateTypeTypeObject((TypeType)value, diagnostics, context);
			case ScaPackage.VERSION_VALUE_OBJECT:
				return validateVersionValueObject((VersionValue)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivationSpec(ActivationSpec activationSpec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activationSpec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinding(Binding binding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindingProperty(BindingProperty bindingProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bindingProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindingType(BindingType bindingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bindingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPELImplementation(BPELImplementation bpelImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bpelImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallback(Callback callback, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(callback, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCExport(CExport cExport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cExport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCFunction(CFunction cFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCImplementation(CImplementation cImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCImplementationFunction(CImplementationFunction cImplementationFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cImplementationFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCImport(CImport cImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cImport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCInterface(CInterface cInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommonExtensionBase(CommonExtensionBase commonExtensionBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commonExtensionBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentReference(ComponentReference componentReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentService(ComponentService componentService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentType(ComponentType componentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentTypeReference(ComponentTypeReference componentTypeReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentTypeReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposite(Composite composite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(composite, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionSpec(ConnectionSpec connectionSpec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionSpec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstrainingProperty(ConstrainingProperty constrainingProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constrainingProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstrainingReference(ConstrainingReference constrainingReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constrainingReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstrainingService(ConstrainingService constrainingService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constrainingService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstrainingType(ConstrainingType constrainingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constrainingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContract(Contract contract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contract, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContributionType(ContributionType contributionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contributionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPPExport(CPPExport cppExport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cppExport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPPFunction(CPPFunction cppFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cppFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPPImplementation(CPPImplementation cppImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cppImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPPImplementationFunction(CPPImplementationFunction cppImplementationFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cppImplementationFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPPImport(CPPImport cppImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cppImport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPPInterface(CPPInterface cppInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cppInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployableType(DeployableType deployableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deployableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentation(Documentation documentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEJBImplementation(EJBImplementation ejbImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ejbImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEJBSessionBeanBinding(EJBSessionBeanBinding ejbSessionBeanBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ejbSessionBeanBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExport(Export export, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(export, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExportType(ExportType exportType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exportType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementation(Implementation implementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationType(ImplementationType implementationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImport(Import import_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(import_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImportType(ImportType importType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(importType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInboundOperation(InboundOperation inboundOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inboundOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInclude(Include include, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(include, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntent(Intent intent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntentMap(IntentMap intentMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intentMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntentQualifier(IntentQualifier intentQualifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intentQualifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionSpec(InteractionSpec interactionSpec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interactionSpec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interface_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaExportType(JavaExportType javaExportType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaExportType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaImplementation(JavaImplementation javaImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaImportType(JavaImportType javaImportType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaImportType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaInterface(JavaInterface javaInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJCABinding(JCABinding jcaBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jcaBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJCAInboundConnection(JCAInboundConnection jcaInboundConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jcaInboundConnection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJCAInboundInteraction(JCAInboundInteraction jcaInboundInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jcaInboundInteraction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJCAOutboundConnection(JCAOutboundConnection jcaOutboundConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jcaOutboundConnection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJCAOutboundInteraction(JCAOutboundInteraction jcaOutboundInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jcaOutboundInteraction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJEEImplementation(JEEImplementation jeeImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jeeImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJMSActivationSpec(JMSActivationSpec jmsActivationSpec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jmsActivationSpec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJMSBinding(JMSBinding jmsBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jmsBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJMSConnectionFactory(JMSConnectionFactory jmsConnectionFactory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jmsConnectionFactory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJMSDestination(JMSDestination jmsDestination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jmsDestination, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJMSHeaders(JMSHeaders jmsHeaders, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jmsHeaders, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJMSMessageSelection(JMSMessageSelection jmsMessageSelection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jmsMessageSelection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJMSOperationProperties(JMSOperationProperties jmsOperationProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jmsOperationProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJMSResourceAdapter(JMSResourceAdapter jmsResourceAdapter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jmsResourceAdapter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJMSResponse(JMSResponse jmsResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jmsResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationSelectorType(OperationSelectorType operationSelectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationSelectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicySet(PolicySet policySet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(policySet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicySetAttachment(PolicySetAttachment policySetAttachment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(policySetAttachment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicySetReference(PolicySetReference policySetReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(policySetReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyValue(PropertyValue propertyValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifier(Qualifier qualifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qualifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceAdapter(ResourceAdapter resourceAdapter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceAdapter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCABinding(SCABinding scaBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scaBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCAImplementation(SCAImplementation scaImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scaImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCAPropertyBase(SCAPropertyBase scaPropertyBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scaPropertyBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(service, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpringImplementation(SpringImplementation springImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(springImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDefinitions(TDefinitions tDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDefinitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType(ValueType valueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebImplementation(WebImplementation webImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(webImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebServiceBinding(WebServiceBinding webServiceBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(webServiceBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWire(Wire wire, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wire, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWireFormatType(WireFormatType wireFormatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wireFormatType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWSCallbackType(WSCallbackType wsCallbackType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wsCallbackType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWSDLPortType(WSDLPortType wsdlPortType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wsdlPortType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCImplementationScope(CImplementationScope cImplementationScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPPImplementationScope(CPPImplementationScope cppImplementationScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateResource(CreateResource createResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeliveryModeType(DeliveryModeType deliveryModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionOrImplementation(InteractionOrImplementation interactionOrImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJCACreateResource(JCACreateResource jcaCreateResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJMSCreateResource(JMSCreateResource jmsCreateResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicity(Multiplicity multiplicity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverrideOptions(OverrideOptions overrideOptions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityType(PriorityType priorityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResAuth(ResAuth resAuth, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(TypeType typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionValue(VersionValue versionValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCImplementationScopeObject(CImplementationScope cImplementationScopeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPPImplementationScopeObject(CPPImplementationScope cppImplementationScopeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateResourceObject(CreateResource createResourceObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeliveryModeTypeObject(DeliveryModeType deliveryModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionOrImplementationObject(InteractionOrImplementation interactionOrImplementationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJCACreateResourceObject(JCACreateResource jcaCreateResourceObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJMSCreateResourceObject(JMSCreateResource jmsCreateResourceObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListOfAnyURIs(List<?> listOfAnyURIs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateListOfAnyURIs_ItemType(listOfAnyURIs, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>List Of Any UR Is</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListOfAnyURIs_ItemType(List<?> listOfAnyURIs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = listOfAnyURIs.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(item)) {
				result &= xmlTypeValidator.validateAnyURI((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.ANY_URI, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListOfNCNames(List<?> listOfNCNames, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateListOfNCNames_ItemType(listOfNCNames, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>List Of NC Names</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListOfNCNames_ItemType(List<?> listOfNCNames, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = listOfNCNames.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.NC_NAME.isInstance(item)) {
				result &= xmlTypeValidator.validateNCName((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.NC_NAME, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListOfQNames(List<?> listOfQNames, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateListOfQNames_ItemType(listOfQNames, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>List Of QNames</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListOfQNames_ItemType(List<?> listOfQNames, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = listOfQNames.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.QNAME.isInstance(item)) {
				result &= xmlTypeValidator.validateQName((QName)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.QNAME, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityObject(Multiplicity multiplicityObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverrideOptionsObject(OverrideOptions overrideOptionsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityTypeObject(PriorityType priorityTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResAuthObject(ResAuth resAuthObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject(TypeType typeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionValueObject(VersionValue versionValueObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ScaValidator
