/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.soa.sca.sca1_1.model.sca.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage
 * @generated
 */
public class ScaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ScaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScaSwitch<Adapter> modelSwitch =
		new ScaSwitch<Adapter>() {
			@Override
			public Adapter caseActivationSpec(ActivationSpec object) {
				return createActivationSpecAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter caseBindingProperty(BindingProperty object) {
				return createBindingPropertyAdapter();
			}
			@Override
			public Adapter caseBindingType(BindingType object) {
				return createBindingTypeAdapter();
			}
			@Override
			public Adapter caseBPELImplementation(BPELImplementation object) {
				return createBPELImplementationAdapter();
			}
			@Override
			public Adapter caseCallback(Callback object) {
				return createCallbackAdapter();
			}
			@Override
			public Adapter caseCExport(CExport object) {
				return createCExportAdapter();
			}
			@Override
			public Adapter caseCFunction(CFunction object) {
				return createCFunctionAdapter();
			}
			@Override
			public Adapter caseCImplementation(CImplementation object) {
				return createCImplementationAdapter();
			}
			@Override
			public Adapter caseCImplementationFunction(CImplementationFunction object) {
				return createCImplementationFunctionAdapter();
			}
			@Override
			public Adapter caseCImport(CImport object) {
				return createCImportAdapter();
			}
			@Override
			public Adapter caseCInterface(CInterface object) {
				return createCInterfaceAdapter();
			}
			@Override
			public Adapter caseCommonExtensionBase(CommonExtensionBase object) {
				return createCommonExtensionBaseAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseComponentReference(ComponentReference object) {
				return createComponentReferenceAdapter();
			}
			@Override
			public Adapter caseComponentService(ComponentService object) {
				return createComponentServiceAdapter();
			}
			@Override
			public Adapter caseComponentType(ComponentType object) {
				return createComponentTypeAdapter();
			}
			@Override
			public Adapter caseComponentTypeReference(ComponentTypeReference object) {
				return createComponentTypeReferenceAdapter();
			}
			@Override
			public Adapter caseComposite(Composite object) {
				return createCompositeAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseConnectionSpec(ConnectionSpec object) {
				return createConnectionSpecAdapter();
			}
			@Override
			public Adapter caseConstrainingProperty(ConstrainingProperty object) {
				return createConstrainingPropertyAdapter();
			}
			@Override
			public Adapter caseConstrainingReference(ConstrainingReference object) {
				return createConstrainingReferenceAdapter();
			}
			@Override
			public Adapter caseConstrainingService(ConstrainingService object) {
				return createConstrainingServiceAdapter();
			}
			@Override
			public Adapter caseConstrainingType(ConstrainingType object) {
				return createConstrainingTypeAdapter();
			}
			@Override
			public Adapter caseContract(Contract object) {
				return createContractAdapter();
			}
			@Override
			public Adapter caseContributionType(ContributionType object) {
				return createContributionTypeAdapter();
			}
			@Override
			public Adapter caseCPPExport(CPPExport object) {
				return createCPPExportAdapter();
			}
			@Override
			public Adapter caseCPPFunction(CPPFunction object) {
				return createCPPFunctionAdapter();
			}
			@Override
			public Adapter caseCPPImplementation(CPPImplementation object) {
				return createCPPImplementationAdapter();
			}
			@Override
			public Adapter caseCPPImplementationFunction(CPPImplementationFunction object) {
				return createCPPImplementationFunctionAdapter();
			}
			@Override
			public Adapter caseCPPImport(CPPImport object) {
				return createCPPImportAdapter();
			}
			@Override
			public Adapter caseCPPInterface(CPPInterface object) {
				return createCPPInterfaceAdapter();
			}
			@Override
			public Adapter caseDeployableType(DeployableType object) {
				return createDeployableTypeAdapter();
			}
			@Override
			public Adapter caseDocumentation(Documentation object) {
				return createDocumentationAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEJBImplementation(EJBImplementation object) {
				return createEJBImplementationAdapter();
			}
			@Override
			public Adapter caseEJBSessionBeanBinding(EJBSessionBeanBinding object) {
				return createEJBSessionBeanBindingAdapter();
			}
			@Override
			public Adapter caseExport(Export object) {
				return createExportAdapter();
			}
			@Override
			public Adapter caseExportType(ExportType object) {
				return createExportTypeAdapter();
			}
			@Override
			public Adapter caseImplementation(Implementation object) {
				return createImplementationAdapter();
			}
			@Override
			public Adapter caseImplementationType(ImplementationType object) {
				return createImplementationTypeAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseImportType(ImportType object) {
				return createImportTypeAdapter();
			}
			@Override
			public Adapter caseInboundOperation(InboundOperation object) {
				return createInboundOperationAdapter();
			}
			@Override
			public Adapter caseInclude(Include object) {
				return createIncludeAdapter();
			}
			@Override
			public Adapter caseIntent(Intent object) {
				return createIntentAdapter();
			}
			@Override
			public Adapter caseIntentMap(IntentMap object) {
				return createIntentMapAdapter();
			}
			@Override
			public Adapter caseIntentQualifier(IntentQualifier object) {
				return createIntentQualifierAdapter();
			}
			@Override
			public Adapter caseInteractionSpec(InteractionSpec object) {
				return createInteractionSpecAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseJavaExportType(JavaExportType object) {
				return createJavaExportTypeAdapter();
			}
			@Override
			public Adapter caseJavaImplementation(JavaImplementation object) {
				return createJavaImplementationAdapter();
			}
			@Override
			public Adapter caseJavaImportType(JavaImportType object) {
				return createJavaImportTypeAdapter();
			}
			@Override
			public Adapter caseJavaInterface(JavaInterface object) {
				return createJavaInterfaceAdapter();
			}
			@Override
			public Adapter caseJCABinding(JCABinding object) {
				return createJCABindingAdapter();
			}
			@Override
			public Adapter caseJCAInboundConnection(JCAInboundConnection object) {
				return createJCAInboundConnectionAdapter();
			}
			@Override
			public Adapter caseJCAInboundInteraction(JCAInboundInteraction object) {
				return createJCAInboundInteractionAdapter();
			}
			@Override
			public Adapter caseJCAOutboundConnection(JCAOutboundConnection object) {
				return createJCAOutboundConnectionAdapter();
			}
			@Override
			public Adapter caseJCAOutboundInteraction(JCAOutboundInteraction object) {
				return createJCAOutboundInteractionAdapter();
			}
			@Override
			public Adapter caseJEEImplementation(JEEImplementation object) {
				return createJEEImplementationAdapter();
			}
			@Override
			public Adapter caseJMSActivationSpec(JMSActivationSpec object) {
				return createJMSActivationSpecAdapter();
			}
			@Override
			public Adapter caseJMSBinding(JMSBinding object) {
				return createJMSBindingAdapter();
			}
			@Override
			public Adapter caseJMSConnectionFactory(JMSConnectionFactory object) {
				return createJMSConnectionFactoryAdapter();
			}
			@Override
			public Adapter caseJMSDestination(JMSDestination object) {
				return createJMSDestinationAdapter();
			}
			@Override
			public Adapter caseJMSHeaders(JMSHeaders object) {
				return createJMSHeadersAdapter();
			}
			@Override
			public Adapter caseJMSMessageSelection(JMSMessageSelection object) {
				return createJMSMessageSelectionAdapter();
			}
			@Override
			public Adapter caseJMSOperationProperties(JMSOperationProperties object) {
				return createJMSOperationPropertiesAdapter();
			}
			@Override
			public Adapter caseJMSResourceAdapter(JMSResourceAdapter object) {
				return createJMSResourceAdapterAdapter();
			}
			@Override
			public Adapter caseJMSResponse(JMSResponse object) {
				return createJMSResponseAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseOperationSelectorType(OperationSelectorType object) {
				return createOperationSelectorTypeAdapter();
			}
			@Override
			public Adapter casePolicySet(PolicySet object) {
				return createPolicySetAdapter();
			}
			@Override
			public Adapter casePolicySetAttachment(PolicySetAttachment object) {
				return createPolicySetAttachmentAdapter();
			}
			@Override
			public Adapter casePolicySetReference(PolicySetReference object) {
				return createPolicySetReferenceAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter casePropertyValue(PropertyValue object) {
				return createPropertyValueAdapter();
			}
			@Override
			public Adapter caseQualifier(Qualifier object) {
				return createQualifierAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseResourceAdapter(ResourceAdapter object) {
				return createResourceAdapterAdapter();
			}
			@Override
			public Adapter caseSCABinding(SCABinding object) {
				return createSCABindingAdapter();
			}
			@Override
			public Adapter caseSCAImplementation(SCAImplementation object) {
				return createSCAImplementationAdapter();
			}
			@Override
			public Adapter caseSCAPropertyBase(SCAPropertyBase object) {
				return createSCAPropertyBaseAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseSpringImplementation(SpringImplementation object) {
				return createSpringImplementationAdapter();
			}
			@Override
			public Adapter caseTDefinitions(TDefinitions object) {
				return createTDefinitionsAdapter();
			}
			@Override
			public Adapter caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			@Override
			public Adapter caseWebImplementation(WebImplementation object) {
				return createWebImplementationAdapter();
			}
			@Override
			public Adapter caseWebServiceBinding(WebServiceBinding object) {
				return createWebServiceBindingAdapter();
			}
			@Override
			public Adapter caseWire(Wire object) {
				return createWireAdapter();
			}
			@Override
			public Adapter caseWireFormatType(WireFormatType object) {
				return createWireFormatTypeAdapter();
			}
			@Override
			public Adapter caseWSCallbackType(WSCallbackType object) {
				return createWSCallbackTypeAdapter();
			}
			@Override
			public Adapter caseWSDLPortType(WSDLPortType object) {
				return createWSDLPortTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ActivationSpec <em>Activation Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ActivationSpec
	 * @generated
	 */
	public Adapter createActivationSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.BindingProperty <em>Binding Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.BindingProperty
	 * @generated
	 */
	public Adapter createBindingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.BindingType <em>Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.BindingType
	 * @generated
	 */
	public Adapter createBindingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.BPELImplementation <em>BPEL Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.BPELImplementation
	 * @generated
	 */
	public Adapter createBPELImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Callback <em>Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Callback
	 * @generated
	 */
	public Adapter createCallbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CExport <em>CExport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.CExport
	 * @generated
	 */
	public Adapter createCExportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CFunction <em>CFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.CFunction
	 * @generated
	 */
	public Adapter createCFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation <em>CImplementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementation
	 * @generated
	 */
	public Adapter createCImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction <em>CImplementation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction
	 * @generated
	 */
	public Adapter createCImplementationFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImport <em>CImport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.CImport
	 * @generated
	 */
	public Adapter createCImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CInterface <em>CInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.CInterface
	 * @generated
	 */
	public Adapter createCInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase <em>Common Extension Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase
	 * @generated
	 */
	public Adapter createCommonExtensionBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference <em>Component Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference
	 * @generated
	 */
	public Adapter createComponentReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentService <em>Component Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentService
	 * @generated
	 */
	public Adapter createComponentServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentType
	 * @generated
	 */
	public Adapter createComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentTypeReference <em>Component Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentTypeReference
	 * @generated
	 */
	public Adapter createComponentTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Composite
	 * @generated
	 */
	public Adapter createCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConnectionSpec <em>Connection Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ConnectionSpec
	 * @generated
	 */
	public Adapter createConnectionSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingProperty <em>Constraining Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingProperty
	 * @generated
	 */
	public Adapter createConstrainingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingReference <em>Constraining Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingReference
	 * @generated
	 */
	public Adapter createConstrainingReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingService <em>Constraining Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingService
	 * @generated
	 */
	public Adapter createConstrainingServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingType <em>Constraining Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingType
	 * @generated
	 */
	public Adapter createConstrainingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Contract
	 * @generated
	 */
	public Adapter createContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ContributionType <em>Contribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ContributionType
	 * @generated
	 */
	public Adapter createContributionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPExport <em>CPP Export</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPExport
	 * @generated
	 */
	public Adapter createCPPExportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction <em>CPP Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction
	 * @generated
	 */
	public Adapter createCPPFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation <em>CPP Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation
	 * @generated
	 */
	public Adapter createCPPImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationFunction <em>CPP Implementation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationFunction
	 * @generated
	 */
	public Adapter createCPPImplementationFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImport <em>CPP Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImport
	 * @generated
	 */
	public Adapter createCPPImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface <em>CPP Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface
	 * @generated
	 */
	public Adapter createCPPInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.DeployableType <em>Deployable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.DeployableType
	 * @generated
	 */
	public Adapter createDeployableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Documentation
	 * @generated
	 */
	public Adapter createDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.EJBImplementation <em>EJB Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.EJBImplementation
	 * @generated
	 */
	public Adapter createEJBImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding <em>EJB Session Bean Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding
	 * @generated
	 */
	public Adapter createEJBSessionBeanBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Export <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Export
	 * @generated
	 */
	public Adapter createExportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ExportType <em>Export Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ExportType
	 * @generated
	 */
	public Adapter createExportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Implementation
	 * @generated
	 */
	public Adapter createImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType <em>Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType
	 * @generated
	 */
	public Adapter createImplementationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ImportType
	 * @generated
	 */
	public Adapter createImportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.InboundOperation <em>Inbound Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.InboundOperation
	 * @generated
	 */
	public Adapter createInboundOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Include
	 * @generated
	 */
	public Adapter createIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Intent
	 * @generated
	 */
	public Adapter createIntentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.IntentMap <em>Intent Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.IntentMap
	 * @generated
	 */
	public Adapter createIntentMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.IntentQualifier <em>Intent Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.IntentQualifier
	 * @generated
	 */
	public Adapter createIntentQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.InteractionSpec <em>Interaction Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.InteractionSpec
	 * @generated
	 */
	public Adapter createInteractionSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaExportType <em>Java Export Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.JavaExportType
	 * @generated
	 */
	public Adapter createJavaExportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaImplementation <em>Java Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.JavaImplementation
	 * @generated
	 */
	public Adapter createJavaImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaImportType <em>Java Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.JavaImportType
	 * @generated
	 */
	public Adapter createJavaImportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface <em>Java Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface
	 * @generated
	 */
	public Adapter createJavaInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding <em>JCA Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.JCABinding
	 * @generated
	 */
	public Adapter createJCABindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundConnection <em>JCA Inbound Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundConnection
	 * @generated
	 */
	public Adapter createJCAInboundConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction <em>JCA Inbound Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction
	 * @generated
	 */
	public Adapter createJCAInboundInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundConnection <em>JCA Outbound Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundConnection
	 * @generated
	 */
	public Adapter createJCAOutboundConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction <em>JCA Outbound Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction
	 * @generated
	 */
	public Adapter createJCAOutboundInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JEEImplementation <em>JEE Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.JEEImplementation
	 * @generated
	 */
	public Adapter createJEEImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSActivationSpec <em>JMS Activation Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSActivationSpec
	 * @generated
	 */
	public Adapter createJMSActivationSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding <em>JMS Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding
	 * @generated
	 */
	public Adapter createJMSBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSConnectionFactory <em>JMS Connection Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSConnectionFactory
	 * @generated
	 */
	public Adapter createJMSConnectionFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination <em>JMS Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination
	 * @generated
	 */
	public Adapter createJMSDestinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders <em>JMS Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders
	 * @generated
	 */
	public Adapter createJMSHeadersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSMessageSelection <em>JMS Message Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSMessageSelection
	 * @generated
	 */
	public Adapter createJMSMessageSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSOperationProperties <em>JMS Operation Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSOperationProperties
	 * @generated
	 */
	public Adapter createJMSOperationPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSResourceAdapter <em>JMS Resource Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSResourceAdapter
	 * @generated
	 */
	public Adapter createJMSResourceAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse <em>JMS Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse
	 * @generated
	 */
	public Adapter createJMSResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType <em>Operation Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType
	 * @generated
	 */
	public Adapter createOperationSelectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet <em>Policy Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.PolicySet
	 * @generated
	 */
	public Adapter createPolicySetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySetAttachment <em>Policy Set Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.PolicySetAttachment
	 * @generated
	 */
	public Adapter createPolicySetAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySetReference <em>Policy Set Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.PolicySetReference
	 * @generated
	 */
	public Adapter createPolicySetReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue
	 * @generated
	 */
	public Adapter createPropertyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Qualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Qualifier
	 * @generated
	 */
	public Adapter createQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ResourceAdapter <em>Resource Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ResourceAdapter
	 * @generated
	 */
	public Adapter createResourceAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.SCABinding <em>SCA Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.SCABinding
	 * @generated
	 */
	public Adapter createSCABindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.SCAImplementation <em>SCA Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.SCAImplementation
	 * @generated
	 */
	public Adapter createSCAImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase <em>SCA Property Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase
	 * @generated
	 */
	public Adapter createSCAPropertyBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.SpringImplementation <em>Spring Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.SpringImplementation
	 * @generated
	 */
	public Adapter createSpringImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions <em>TDefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions
	 * @generated
	 */
	public Adapter createTDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.WebImplementation <em>Web Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.WebImplementation
	 * @generated
	 */
	public Adapter createWebImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.WebServiceBinding <em>Web Service Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.WebServiceBinding
	 * @generated
	 */
	public Adapter createWebServiceBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.Wire
	 * @generated
	 */
	public Adapter createWireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.WireFormatType <em>Wire Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.WireFormatType
	 * @generated
	 */
	public Adapter createWireFormatTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.WSCallbackType <em>WS Callback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.WSCallbackType
	 * @generated
	 */
	public Adapter createWSCallbackTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType <em>WSDL Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType
	 * @generated
	 */
	public Adapter createWSDLPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ScaAdapterFactory
