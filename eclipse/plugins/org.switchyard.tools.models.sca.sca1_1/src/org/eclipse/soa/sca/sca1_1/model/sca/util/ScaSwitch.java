/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.util;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.soa.sca.sca1_1.model.sca.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage
 * @generated
 */
public class ScaSwitch<T> extends Switch<T> {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static ScaPackage modelPackage;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ScaSwitch() {
        if (modelPackage == null) {
            modelPackage = ScaPackage.eINSTANCE;
        }
    }

	/**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	@Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case ScaPackage.ACTIVATION_SPEC: {
                ActivationSpec activationSpec = (ActivationSpec)theEObject;
                T result = caseActivationSpec(activationSpec);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.BINDING: {
                Binding binding = (Binding)theEObject;
                T result = caseBinding(binding);
                if (result == null) result = caseCommonExtensionBase(binding);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.BINDING_PROPERTY: {
                BindingProperty bindingProperty = (BindingProperty)theEObject;
                T result = caseBindingProperty(bindingProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.BINDING_TYPE: {
                BindingType bindingType = (BindingType)theEObject;
                T result = caseBindingType(bindingType);
                if (result == null) result = caseCommonExtensionBase(bindingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.BPEL_IMPLEMENTATION: {
                BPELImplementation bpelImplementation = (BPELImplementation)theEObject;
                T result = caseBPELImplementation(bpelImplementation);
                if (result == null) result = caseImplementation(bpelImplementation);
                if (result == null) result = caseCommonExtensionBase(bpelImplementation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CALLBACK: {
                Callback callback = (Callback)theEObject;
                T result = caseCallback(callback);
                if (result == null) result = caseCommonExtensionBase(callback);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CEXPORT: {
                CExport cExport = (CExport)theEObject;
                T result = caseCExport(cExport);
                if (result == null) result = caseExport(cExport);
                if (result == null) result = caseCommonExtensionBase(cExport);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CFUNCTION: {
                CFunction cFunction = (CFunction)theEObject;
                T result = caseCFunction(cFunction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CIMPLEMENTATION: {
                CImplementation cImplementation = (CImplementation)theEObject;
                T result = caseCImplementation(cImplementation);
                if (result == null) result = caseImplementation(cImplementation);
                if (result == null) result = caseCommonExtensionBase(cImplementation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CIMPLEMENTATION_FUNCTION: {
                CImplementationFunction cImplementationFunction = (CImplementationFunction)theEObject;
                T result = caseCImplementationFunction(cImplementationFunction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CIMPORT: {
                CImport cImport = (CImport)theEObject;
                T result = caseCImport(cImport);
                if (result == null) result = caseImport(cImport);
                if (result == null) result = caseCommonExtensionBase(cImport);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CINTERFACE: {
                CInterface cInterface = (CInterface)theEObject;
                T result = caseCInterface(cInterface);
                if (result == null) result = caseInterface(cInterface);
                if (result == null) result = caseCommonExtensionBase(cInterface);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.COMMON_EXTENSION_BASE: {
                CommonExtensionBase commonExtensionBase = (CommonExtensionBase)theEObject;
                T result = caseCommonExtensionBase(commonExtensionBase);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.COMPONENT: {
                Component component = (Component)theEObject;
                T result = caseComponent(component);
                if (result == null) result = caseCommonExtensionBase(component);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.COMPONENT_REFERENCE: {
                ComponentReference componentReference = (ComponentReference)theEObject;
                T result = caseComponentReference(componentReference);
                if (result == null) result = caseContract(componentReference);
                if (result == null) result = caseCommonExtensionBase(componentReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.COMPONENT_SERVICE: {
                ComponentService componentService = (ComponentService)theEObject;
                T result = caseComponentService(componentService);
                if (result == null) result = caseContract(componentService);
                if (result == null) result = caseCommonExtensionBase(componentService);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.COMPONENT_TYPE: {
                ComponentType componentType = (ComponentType)theEObject;
                T result = caseComponentType(componentType);
                if (result == null) result = caseCommonExtensionBase(componentType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.COMPONENT_TYPE_REFERENCE: {
                ComponentTypeReference componentTypeReference = (ComponentTypeReference)theEObject;
                T result = caseComponentTypeReference(componentTypeReference);
                if (result == null) result = caseComponentReference(componentTypeReference);
                if (result == null) result = caseContract(componentTypeReference);
                if (result == null) result = caseCommonExtensionBase(componentTypeReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.COMPOSITE: {
                Composite composite = (Composite)theEObject;
                T result = caseComposite(composite);
                if (result == null) result = caseCommonExtensionBase(composite);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CONNECTION: {
                Connection connection = (Connection)theEObject;
                T result = caseConnection(connection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CONNECTION_SPEC: {
                ConnectionSpec connectionSpec = (ConnectionSpec)theEObject;
                T result = caseConnectionSpec(connectionSpec);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CONSTRAINING_PROPERTY: {
                ConstrainingProperty constrainingProperty = (ConstrainingProperty)theEObject;
                T result = caseConstrainingProperty(constrainingProperty);
                if (result == null) result = caseProperty(constrainingProperty);
                if (result == null) result = caseSCAPropertyBase(constrainingProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CONSTRAINING_REFERENCE: {
                ConstrainingReference constrainingReference = (ConstrainingReference)theEObject;
                T result = caseConstrainingReference(constrainingReference);
                if (result == null) result = caseComponentReference(constrainingReference);
                if (result == null) result = caseContract(constrainingReference);
                if (result == null) result = caseCommonExtensionBase(constrainingReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CONSTRAINING_SERVICE: {
                ConstrainingService constrainingService = (ConstrainingService)theEObject;
                T result = caseConstrainingService(constrainingService);
                if (result == null) result = caseComponentService(constrainingService);
                if (result == null) result = caseContract(constrainingService);
                if (result == null) result = caseCommonExtensionBase(constrainingService);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CONSTRAINING_TYPE: {
                ConstrainingType constrainingType = (ConstrainingType)theEObject;
                T result = caseConstrainingType(constrainingType);
                if (result == null) result = caseCommonExtensionBase(constrainingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CONTRACT: {
                Contract contract = (Contract)theEObject;
                T result = caseContract(contract);
                if (result == null) result = caseCommonExtensionBase(contract);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CONTRIBUTION_TYPE: {
                ContributionType contributionType = (ContributionType)theEObject;
                T result = caseContributionType(contributionType);
                if (result == null) result = caseCommonExtensionBase(contributionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CPP_EXPORT: {
                CPPExport cppExport = (CPPExport)theEObject;
                T result = caseCPPExport(cppExport);
                if (result == null) result = caseExport(cppExport);
                if (result == null) result = caseCommonExtensionBase(cppExport);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CPP_FUNCTION: {
                CPPFunction cppFunction = (CPPFunction)theEObject;
                T result = caseCPPFunction(cppFunction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CPP_IMPLEMENTATION: {
                CPPImplementation cppImplementation = (CPPImplementation)theEObject;
                T result = caseCPPImplementation(cppImplementation);
                if (result == null) result = caseImplementation(cppImplementation);
                if (result == null) result = caseCommonExtensionBase(cppImplementation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CPP_IMPLEMENTATION_FUNCTION: {
                CPPImplementationFunction cppImplementationFunction = (CPPImplementationFunction)theEObject;
                T result = caseCPPImplementationFunction(cppImplementationFunction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CPP_IMPORT: {
                CPPImport cppImport = (CPPImport)theEObject;
                T result = caseCPPImport(cppImport);
                if (result == null) result = caseImport(cppImport);
                if (result == null) result = caseCommonExtensionBase(cppImport);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.CPP_INTERFACE: {
                CPPInterface cppInterface = (CPPInterface)theEObject;
                T result = caseCPPInterface(cppInterface);
                if (result == null) result = caseInterface(cppInterface);
                if (result == null) result = caseCommonExtensionBase(cppInterface);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.DEPLOYABLE_TYPE: {
                DeployableType deployableType = (DeployableType)theEObject;
                T result = caseDeployableType(deployableType);
                if (result == null) result = caseCommonExtensionBase(deployableType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.DOCUMENTATION: {
                Documentation documentation = (Documentation)theEObject;
                T result = caseDocumentation(documentation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.EJB_IMPLEMENTATION: {
                EJBImplementation ejbImplementation = (EJBImplementation)theEObject;
                T result = caseEJBImplementation(ejbImplementation);
                if (result == null) result = caseImplementation(ejbImplementation);
                if (result == null) result = caseCommonExtensionBase(ejbImplementation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.EJB_SESSION_BEAN_BINDING: {
                EJBSessionBeanBinding ejbSessionBeanBinding = (EJBSessionBeanBinding)theEObject;
                T result = caseEJBSessionBeanBinding(ejbSessionBeanBinding);
                if (result == null) result = caseBinding(ejbSessionBeanBinding);
                if (result == null) result = caseCommonExtensionBase(ejbSessionBeanBinding);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.EXPORT: {
                Export export = (Export)theEObject;
                T result = caseExport(export);
                if (result == null) result = caseCommonExtensionBase(export);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.EXPORT_TYPE: {
                ExportType exportType = (ExportType)theEObject;
                T result = caseExportType(exportType);
                if (result == null) result = caseExport(exportType);
                if (result == null) result = caseCommonExtensionBase(exportType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.IMPLEMENTATION: {
                Implementation implementation = (Implementation)theEObject;
                T result = caseImplementation(implementation);
                if (result == null) result = caseCommonExtensionBase(implementation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.IMPLEMENTATION_TYPE: {
                ImplementationType implementationType = (ImplementationType)theEObject;
                T result = caseImplementationType(implementationType);
                if (result == null) result = caseCommonExtensionBase(implementationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.IMPORT: {
                Import import_ = (Import)theEObject;
                T result = caseImport(import_);
                if (result == null) result = caseCommonExtensionBase(import_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.IMPORT_TYPE: {
                ImportType importType = (ImportType)theEObject;
                T result = caseImportType(importType);
                if (result == null) result = caseImport(importType);
                if (result == null) result = caseCommonExtensionBase(importType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.INBOUND_OPERATION: {
                InboundOperation inboundOperation = (InboundOperation)theEObject;
                T result = caseInboundOperation(inboundOperation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.INCLUDE: {
                Include include = (Include)theEObject;
                T result = caseInclude(include);
                if (result == null) result = caseCommonExtensionBase(include);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.INTENT: {
                Intent intent = (Intent)theEObject;
                T result = caseIntent(intent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.INTENT_MAP: {
                IntentMap intentMap = (IntentMap)theEObject;
                T result = caseIntentMap(intentMap);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.INTENT_QUALIFIER: {
                IntentQualifier intentQualifier = (IntentQualifier)theEObject;
                T result = caseIntentQualifier(intentQualifier);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.INTERACTION_SPEC: {
                InteractionSpec interactionSpec = (InteractionSpec)theEObject;
                T result = caseInteractionSpec(interactionSpec);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.INTERFACE: {
                Interface interface_ = (Interface)theEObject;
                T result = caseInterface(interface_);
                if (result == null) result = caseCommonExtensionBase(interface_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.JAVA_EXPORT_TYPE: {
                JavaExportType javaExportType = (JavaExportType)theEObject;
                T result = caseJavaExportType(javaExportType);
                if (result == null) result = caseExport(javaExportType);
                if (result == null) result = caseCommonExtensionBase(javaExportType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.JAVA_IMPLEMENTATION: {
                JavaImplementation javaImplementation = (JavaImplementation)theEObject;
                T result = caseJavaImplementation(javaImplementation);
                if (result == null) result = caseImplementation(javaImplementation);
                if (result == null) result = caseCommonExtensionBase(javaImplementation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.JAVA_IMPORT_TYPE: {
                JavaImportType javaImportType = (JavaImportType)theEObject;
                T result = caseJavaImportType(javaImportType);
                if (result == null) result = caseImport(javaImportType);
                if (result == null) result = caseCommonExtensionBase(javaImportType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.JAVA_INTERFACE: {
                JavaInterface javaInterface = (JavaInterface)theEObject;
                T result = caseJavaInterface(javaInterface);
                if (result == null) result = caseInterface(javaInterface);
                if (result == null) result = caseCommonExtensionBase(javaInterface);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.JCA_BINDING: {
                JCABinding jcaBinding = (JCABinding)theEObject;
                T result = caseJCABinding(jcaBinding);
                if (result == null) result = caseBinding(jcaBinding);
                if (result == null) result = caseCommonExtensionBase(jcaBinding);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.JCA_INBOUND_CONNECTION: {
                JCAInboundConnection jcaInboundConnection = (JCAInboundConnection)theEObject;
                T result = caseJCAInboundConnection(jcaInboundConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.JCA_INBOUND_INTERACTION: {
                JCAInboundInteraction jcaInboundInteraction = (JCAInboundInteraction)theEObject;
                T result = caseJCAInboundInteraction(jcaInboundInteraction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.JCA_OUTBOUND_CONNECTION: {
                JCAOutboundConnection jcaOutboundConnection = (JCAOutboundConnection)theEObject;
                T result = caseJCAOutboundConnection(jcaOutboundConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.JCA_OUTBOUND_INTERACTION: {
                JCAOutboundInteraction jcaOutboundInteraction = (JCAOutboundInteraction)theEObject;
                T result = caseJCAOutboundInteraction(jcaOutboundInteraction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.JEE_IMPLEMENTATION: {
                JEEImplementation jeeImplementation = (JEEImplementation)theEObject;
                T result = caseJEEImplementation(jeeImplementation);
                if (result == null) result = caseImplementation(jeeImplementation);
                if (result == null) result = caseCommonExtensionBase(jeeImplementation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.JMS_ACTIVATION_SPEC: {
                JMSActivationSpec jmsActivationSpec = (JMSActivationSpec)theEObject;
                T result = caseJMSActivationSpec(jmsActivationSpec);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.JMS_BINDING: {
                JMSBinding jmsBinding = (JMSBinding)theEObject;
                T result = caseJMSBinding(jmsBinding);
                if (result == null) result = caseBinding(jmsBinding);
                if (result == null) result = caseCommonExtensionBase(jmsBinding);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.JMS_CONNECTION_FACTORY: {
                JMSConnectionFactory jmsConnectionFactory = (JMSConnectionFactory)theEObject;
                T result = caseJMSConnectionFactory(jmsConnectionFactory);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.JMS_DESTINATION: {
                JMSDestination jmsDestination = (JMSDestination)theEObject;
                T result = caseJMSDestination(jmsDestination);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.JMS_HEADERS: {
                JMSHeaders jmsHeaders = (JMSHeaders)theEObject;
                T result = caseJMSHeaders(jmsHeaders);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.JMS_MESSAGE_SELECTION: {
                JMSMessageSelection jmsMessageSelection = (JMSMessageSelection)theEObject;
                T result = caseJMSMessageSelection(jmsMessageSelection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.JMS_OPERATION_PROPERTIES: {
                JMSOperationProperties jmsOperationProperties = (JMSOperationProperties)theEObject;
                T result = caseJMSOperationProperties(jmsOperationProperties);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.JMS_RESOURCE_ADAPTER: {
                JMSResourceAdapter jmsResourceAdapter = (JMSResourceAdapter)theEObject;
                T result = caseJMSResourceAdapter(jmsResourceAdapter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.JMS_RESPONSE: {
                JMSResponse jmsResponse = (JMSResponse)theEObject;
                T result = caseJMSResponse(jmsResponse);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.OPERATION: {
                Operation operation = (Operation)theEObject;
                T result = caseOperation(operation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.OPERATION_SELECTOR_TYPE: {
                OperationSelectorType operationSelectorType = (OperationSelectorType)theEObject;
                T result = caseOperationSelectorType(operationSelectorType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.POLICY_SET: {
                PolicySet policySet = (PolicySet)theEObject;
                T result = casePolicySet(policySet);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.POLICY_SET_ATTACHMENT: {
                PolicySetAttachment policySetAttachment = (PolicySetAttachment)theEObject;
                T result = casePolicySetAttachment(policySetAttachment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.POLICY_SET_REFERENCE: {
                PolicySetReference policySetReference = (PolicySetReference)theEObject;
                T result = casePolicySetReference(policySetReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.PROPERTY: {
                Property property = (Property)theEObject;
                T result = caseProperty(property);
                if (result == null) result = caseSCAPropertyBase(property);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.PROPERTY_VALUE: {
                PropertyValue propertyValue = (PropertyValue)theEObject;
                T result = casePropertyValue(propertyValue);
                if (result == null) result = caseSCAPropertyBase(propertyValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.QUALIFIER: {
                Qualifier qualifier = (Qualifier)theEObject;
                T result = caseQualifier(qualifier);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.REFERENCE: {
                Reference reference = (Reference)theEObject;
                T result = caseReference(reference);
                if (result == null) result = caseContract(reference);
                if (result == null) result = caseCommonExtensionBase(reference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.RESOURCE_ADAPTER: {
                ResourceAdapter resourceAdapter = (ResourceAdapter)theEObject;
                T result = caseResourceAdapter(resourceAdapter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.SCA_BINDING: {
                SCABinding scaBinding = (SCABinding)theEObject;
                T result = caseSCABinding(scaBinding);
                if (result == null) result = caseBinding(scaBinding);
                if (result == null) result = caseCommonExtensionBase(scaBinding);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.SCA_IMPLEMENTATION: {
                SCAImplementation scaImplementation = (SCAImplementation)theEObject;
                T result = caseSCAImplementation(scaImplementation);
                if (result == null) result = caseImplementation(scaImplementation);
                if (result == null) result = caseCommonExtensionBase(scaImplementation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.SCA_PROPERTY_BASE: {
                SCAPropertyBase scaPropertyBase = (SCAPropertyBase)theEObject;
                T result = caseSCAPropertyBase(scaPropertyBase);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.SERVICE: {
                Service service = (Service)theEObject;
                T result = caseService(service);
                if (result == null) result = caseContract(service);
                if (result == null) result = caseCommonExtensionBase(service);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.SPRING_IMPLEMENTATION: {
                SpringImplementation springImplementation = (SpringImplementation)theEObject;
                T result = caseSpringImplementation(springImplementation);
                if (result == null) result = caseImplementation(springImplementation);
                if (result == null) result = caseCommonExtensionBase(springImplementation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.TDEFINITIONS: {
                TDefinitions tDefinitions = (TDefinitions)theEObject;
                T result = caseTDefinitions(tDefinitions);
                if (result == null) result = caseCommonExtensionBase(tDefinitions);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.VALUE_TYPE: {
                ValueType valueType = (ValueType)theEObject;
                T result = caseValueType(valueType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.WEB_IMPLEMENTATION: {
                WebImplementation webImplementation = (WebImplementation)theEObject;
                T result = caseWebImplementation(webImplementation);
                if (result == null) result = caseImplementation(webImplementation);
                if (result == null) result = caseCommonExtensionBase(webImplementation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.WEB_SERVICE_BINDING: {
                WebServiceBinding webServiceBinding = (WebServiceBinding)theEObject;
                T result = caseWebServiceBinding(webServiceBinding);
                if (result == null) result = caseBinding(webServiceBinding);
                if (result == null) result = caseCommonExtensionBase(webServiceBinding);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.WIRE: {
                Wire wire = (Wire)theEObject;
                T result = caseWire(wire);
                if (result == null) result = caseCommonExtensionBase(wire);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.WIRE_FORMAT_TYPE: {
                WireFormatType wireFormatType = (WireFormatType)theEObject;
                T result = caseWireFormatType(wireFormatType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.WS_CALLBACK_TYPE: {
                WSCallbackType wsCallbackType = (WSCallbackType)theEObject;
                T result = caseWSCallbackType(wsCallbackType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.WSDL_PORT_TYPE: {
                WSDLPortType wsdlPortType = (WSDLPortType)theEObject;
                T result = caseWSDLPortType(wsdlPortType);
                if (result == null) result = caseInterface(wsdlPortType);
                if (result == null) result = caseCommonExtensionBase(wsdlPortType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScaPackage.EXTENDABLE_TYPE: {
                ExtendableType extendableType = (ExtendableType)theEObject;
                T result = caseExtendableType(extendableType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Activation Spec</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activation Spec</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseActivationSpec(ActivationSpec object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBinding(Binding object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Binding Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Binding Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBindingProperty(BindingProperty object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Binding Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBindingType(BindingType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>BPEL Implementation</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>BPEL Implementation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBPELImplementation(BPELImplementation object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Callback</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Callback</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCallback(Callback object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>CExport</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CExport</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCExport(CExport object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>CFunction</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CFunction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCFunction(CFunction object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>CImplementation</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CImplementation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCImplementation(CImplementation object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>CImplementation Function</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CImplementation Function</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCImplementationFunction(CImplementationFunction object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>CImport</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CImport</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCImport(CImport object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>CInterface</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CInterface</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCInterface(CInterface object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Common Extension Base</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Common Extension Base</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCommonExtensionBase(CommonExtensionBase object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Component</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseComponent(Component object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Component Reference</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Component Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseComponentReference(ComponentReference object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Component Service</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Component Service</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseComponentService(ComponentService object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Component Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Component Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseComponentType(ComponentType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Component Type Reference</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Component Type Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseComponentTypeReference(ComponentTypeReference object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseComposite(Composite object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseConnection(Connection object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Connection Spec</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connection Spec</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseConnectionSpec(ConnectionSpec object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Constraining Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constraining Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseConstrainingProperty(ConstrainingProperty object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Constraining Reference</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constraining Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseConstrainingReference(ConstrainingReference object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Constraining Service</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constraining Service</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseConstrainingService(ConstrainingService object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Constraining Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constraining Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseConstrainingType(ConstrainingType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Contract</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Contract</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseContract(Contract object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Contribution Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Contribution Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseContributionType(ContributionType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>CPP Export</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CPP Export</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCPPExport(CPPExport object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>CPP Function</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CPP Function</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCPPFunction(CPPFunction object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>CPP Implementation</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CPP Implementation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCPPImplementation(CPPImplementation object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>CPP Implementation Function</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CPP Implementation Function</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCPPImplementationFunction(CPPImplementationFunction object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>CPP Import</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CPP Import</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCPPImport(CPPImport object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>CPP Interface</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CPP Interface</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCPPInterface(CPPInterface object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Deployable Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Deployable Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDeployableType(DeployableType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Documentation</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Documentation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDocumentation(Documentation object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDocumentRoot(DocumentRoot object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>EJB Implementation</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EJB Implementation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseEJBImplementation(EJBImplementation object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>EJB Session Bean Binding</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EJB Session Bean Binding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseEJBSessionBeanBinding(EJBSessionBeanBinding object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Export</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Export</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseExport(Export object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Export Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Export Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseExportType(ExportType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Implementation</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Implementation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseImplementation(Implementation object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Implementation Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Implementation Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseImplementationType(ImplementationType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Import</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseImport(Import object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Import Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Import Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseImportType(ImportType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Inbound Operation</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Inbound Operation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseInboundOperation(InboundOperation object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Include</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseInclude(Include object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Intent</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Intent</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseIntent(Intent object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Intent Map</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Intent Map</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseIntentMap(IntentMap object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Intent Qualifier</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Intent Qualifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseIntentQualifier(IntentQualifier object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Interaction Spec</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Spec</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseInteractionSpec(InteractionSpec object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseInterface(Interface object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Java Export Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Java Export Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJavaExportType(JavaExportType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Java Implementation</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Java Implementation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJavaImplementation(JavaImplementation object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Java Import Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Java Import Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJavaImportType(JavaImportType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Java Interface</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Java Interface</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJavaInterface(JavaInterface object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>JCA Binding</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>JCA Binding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJCABinding(JCABinding object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>JCA Inbound Connection</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>JCA Inbound Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJCAInboundConnection(JCAInboundConnection object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>JCA Inbound Interaction</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>JCA Inbound Interaction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJCAInboundInteraction(JCAInboundInteraction object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>JCA Outbound Connection</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>JCA Outbound Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJCAOutboundConnection(JCAOutboundConnection object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>JCA Outbound Interaction</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>JCA Outbound Interaction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJCAOutboundInteraction(JCAOutboundInteraction object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>JEE Implementation</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>JEE Implementation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJEEImplementation(JEEImplementation object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>JMS Activation Spec</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>JMS Activation Spec</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJMSActivationSpec(JMSActivationSpec object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>JMS Binding</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>JMS Binding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJMSBinding(JMSBinding object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>JMS Connection Factory</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>JMS Connection Factory</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJMSConnectionFactory(JMSConnectionFactory object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>JMS Destination</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>JMS Destination</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJMSDestination(JMSDestination object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>JMS Headers</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>JMS Headers</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJMSHeaders(JMSHeaders object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>JMS Message Selection</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>JMS Message Selection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJMSMessageSelection(JMSMessageSelection object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>JMS Operation Properties</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>JMS Operation Properties</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJMSOperationProperties(JMSOperationProperties object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>JMS Resource Adapter</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>JMS Resource Adapter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJMSResourceAdapter(JMSResourceAdapter object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>JMS Response</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>JMS Response</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJMSResponse(JMSResponse object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseOperation(Operation object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Operation Selector Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operation Selector Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseOperationSelectorType(OperationSelectorType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Policy Set</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Policy Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePolicySet(PolicySet object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Policy Set Attachment</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Policy Set Attachment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePolicySetAttachment(PolicySetAttachment object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Policy Set Reference</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Policy Set Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePolicySetReference(PolicySetReference object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseProperty(Property object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Property Value</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePropertyValue(PropertyValue object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Qualifier</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Qualifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseQualifier(Qualifier object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseReference(Reference object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Resource Adapter</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource Adapter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseResourceAdapter(ResourceAdapter object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>SCA Binding</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SCA Binding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSCABinding(SCABinding object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>SCA Implementation</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SCA Implementation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSCAImplementation(SCAImplementation object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>SCA Property Base</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SCA Property Base</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSCAPropertyBase(SCAPropertyBase object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseService(Service object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Spring Implementation</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spring Implementation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSpringImplementation(SpringImplementation object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>TDefinitions</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDefinitions</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseTDefinitions(TDefinitions object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseValueType(ValueType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Web Implementation</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Web Implementation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseWebImplementation(WebImplementation object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Web Service Binding</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Web Service Binding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseWebServiceBinding(WebServiceBinding object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Wire</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wire</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseWire(Wire object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Wire Format Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wire Format Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseWireFormatType(WireFormatType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>WS Callback Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WS Callback Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseWSCallbackType(WSCallbackType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>WSDL Port Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WSDL Port Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseWSDLPortType(WSDLPortType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Extendable Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Extendable Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExtendableType(ExtendableType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
	@Override
    public T defaultCase(EObject object) {
        return null;
    }

} //ScaSwitch
