/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.soa.sca.core.model.addressing.AddressingPackage;
import org.eclipse.soa.sca.core.model.instance.InstancePackage;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.util.ScaValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScaPackageImpl extends EPackageImpl implements ScaPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected String packageFilename = "sca.ecore";

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
	private EClass bindingEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bindingPropertyEClass = null;

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
	private EClass bpelImplementationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass callbackEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cExportEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cFunctionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cImplementationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cImplementationFunctionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cImportEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cInterfaceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass commonExtensionBaseEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass componentEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass componentReferenceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass componentServiceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass componentTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass componentTypeReferenceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass compositeEClass = null;

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
	private EClass constrainingPropertyEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass constrainingReferenceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass constrainingServiceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass constrainingTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass contractEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass contributionTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cppExportEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cppFunctionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cppImplementationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cppImplementationFunctionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cppImportEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cppInterfaceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass deployableTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass documentationEClass = null;

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
	private EClass ejbImplementationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ejbSessionBeanBindingEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass exportEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass exportTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass implementationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass implementationTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass importEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass importTypeEClass = null;

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
	private EClass includeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass intentEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass intentMapEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass intentQualifierEClass = null;

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
	private EClass interfaceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass javaExportTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass javaImplementationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass javaImportTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass javaInterfaceEClass = null;

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
	private EClass jeeImplementationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass jmsActivationSpecEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass jmsBindingEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass jmsConnectionFactoryEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass jmsDestinationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass jmsHeadersEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass jmsMessageSelectionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass jmsOperationPropertiesEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass jmsResourceAdapterEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass jmsResponseEClass = null;

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
	private EClass operationSelectorTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass policySetEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass policySetAttachmentEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass policySetReferenceEClass = null;

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
	private EClass propertyValueEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass qualifierEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass referenceEClass = null;

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
	private EClass scaBindingEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass scaImplementationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass scaPropertyBaseEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass serviceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass springImplementationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tDefinitionsEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass valueTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass webImplementationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass webServiceBindingEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass wireEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass wireFormatTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass wsCallbackTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass wsdlPortTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass extendableTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum cImplementationScopeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum cppImplementationScopeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum createResourceEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum deliveryModeTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum interactionOrImplementationEEnum = null;

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
	private EEnum jmsCreateResourceEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum multiplicityEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum overrideOptionsEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum priorityTypeEEnum = null;

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
	private EEnum typeTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum versionValueEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType cImplementationScopeObjectEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType cppImplementationScopeObjectEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType createResourceObjectEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType deliveryModeTypeObjectEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType interactionOrImplementationObjectEDataType = null;

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
	private EDataType jmsCreateResourceObjectEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType listOfAnyURIsEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType listOfNCNamesEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType listOfQNamesEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType multiplicityObjectEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType overrideOptionsObjectEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType priorityTypeObjectEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType resAuthObjectEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType typeTypeObjectEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType versionValueObjectEDataType = null;

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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private ScaPackageImpl() {
        super(eNS_URI, ScaFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ScaPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @generated
     */
	public static ScaPackage init() {
        if (isInited) return (ScaPackage)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI);

        // Obtain or create and register package
        ScaPackageImpl theScaPackage = (ScaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScaPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        AddressingPackage.eINSTANCE.eClass();
        InstancePackage.eINSTANCE.eClass();
        XMLNamespacePackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

        // Load packages
        theScaPackage.loadPackage();

        // Fix loaded packages
        theScaPackage.fixPackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theScaPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return ScaValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theScaPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ScaPackage.eNS_URI, theScaPackage);
        return theScaPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getActivationSpec() {
        if (activationSpecEClass == null) {
            activationSpecEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(0);
        }
        return activationSpecEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getActivationSpec_Property() {
        return (EReference)getActivationSpec().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getActivationSpec_Any() {
        return (EAttribute)getActivationSpec().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getActivationSpec_Create() {
        return (EAttribute)getActivationSpec().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getActivationSpec_Name() {
        return (EAttribute)getActivationSpec().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getActivationSpec_Type() {
        return (EAttribute)getActivationSpec().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getActivationSpec_AnyAttribute() {
        return (EAttribute)getActivationSpec().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBinding() {
        if (bindingEClass == null) {
            bindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(1);
        }
        return bindingEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBinding_WireFormatGroup() {
        return (EAttribute)getBinding().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBinding_WireFormat() {
        return (EReference)getBinding().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBinding_OperationSelectorGroup() {
        return (EAttribute)getBinding().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBinding_OperationSelector() {
        return (EReference)getBinding().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBinding_Name() {
        return (EAttribute)getBinding().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBinding_PolicySets() {
        return (EAttribute)getBinding().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBinding_Requires() {
        return (EAttribute)getBinding().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBinding_Uri() {
        return (EAttribute)getBinding().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBindingProperty() {
        if (bindingPropertyEClass == null) {
            bindingPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(2);
        }
        return bindingPropertyEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBindingProperty_Value() {
        return (EAttribute)getBindingProperty().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBindingProperty_Name() {
        return (EAttribute)getBindingProperty().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBindingProperty_Type() {
        return (EAttribute)getBindingProperty().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBindingType() {
        if (bindingTypeEClass == null) {
            bindingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(3);
        }
        return bindingTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBindingType_Any() {
        return (EAttribute)getBindingType().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBindingType_AlwaysProvides() {
        return (EAttribute)getBindingType().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBindingType_MayProvide() {
        return (EAttribute)getBindingType().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBindingType_Type() {
        return (EAttribute)getBindingType().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBPELImplementation() {
        if (bpelImplementationEClass == null) {
            bpelImplementationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(4);
        }
        return bpelImplementationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBPELImplementation_Any() {
        return (EAttribute)getBPELImplementation().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBPELImplementation_Process() {
        return (EAttribute)getBPELImplementation().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBPELImplementation_AnyAttribute1() {
        return (EAttribute)getBPELImplementation().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCallback() {
        if (callbackEClass == null) {
            callbackEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(5);
        }
        return callbackEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCallback_Group() {
        return (EAttribute)getCallback().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCallback_BindingGroup() {
        return (EAttribute)getCallback().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCallback_Binding() {
        return (EReference)getCallback().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCallback_Any() {
        return (EAttribute)getCallback().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCallback_PolicySets() {
        return (EAttribute)getCallback().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCallback_Requires() {
        return (EAttribute)getCallback().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCExport() {
        if (cExportEClass == null) {
            cExportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(6);
        }
        return cExportEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCExport_Name() {
        return (EAttribute)getCExport().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCExport_Path() {
        return (EAttribute)getCExport().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCFunction() {
        if (cFunctionEClass == null) {
            cFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(7);
        }
        return cFunctionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCFunction_Input() {
        return (EAttribute)getCFunction().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCFunction_Name() {
        return (EAttribute)getCFunction().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCFunction_OneWay() {
        return (EAttribute)getCFunction().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCFunction_Output() {
        return (EAttribute)getCFunction().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCFunction_Requires() {
        return (EAttribute)getCFunction().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCFunction_AnyAttribute() {
        return (EAttribute)getCFunction().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCImplementation() {
        if (cImplementationEClass == null) {
            cImplementationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(8);
        }
        return cImplementationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCImplementation_Operation() {
        return (EReference)getCImplementation().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCImplementation_Any() {
        return (EAttribute)getCImplementation().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCImplementation_AllowsPassByReference() {
        return (EAttribute)getCImplementation().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCImplementation_ComponentType() {
        return (EAttribute)getCImplementation().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCImplementation_Destoy() {
        return (EAttribute)getCImplementation().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCImplementation_EagerInit() {
        return (EAttribute)getCImplementation().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCImplementation_Init() {
        return (EAttribute)getCImplementation().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCImplementation_Library() {
        return (EAttribute)getCImplementation().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCImplementation_Module() {
        return (EAttribute)getCImplementation().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCImplementation_Path() {
        return (EAttribute)getCImplementation().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCImplementation_Scope() {
        return (EAttribute)getCImplementation().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCImplementation_AnyAttribute1() {
        return (EAttribute)getCImplementation().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCImplementationFunction() {
        if (cImplementationFunctionEClass == null) {
            cImplementationFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(9);
        }
        return cImplementationFunctionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCImplementationFunction_AllowsPassByReference() {
        return (EAttribute)getCImplementationFunction().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCImplementationFunction_Destoy() {
        return (EAttribute)getCImplementationFunction().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCImplementationFunction_Init() {
        return (EAttribute)getCImplementationFunction().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCImplementationFunction_Name() {
        return (EAttribute)getCImplementationFunction().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCImplementationFunction_AnyAttribute() {
        return (EAttribute)getCImplementationFunction().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCImport() {
        if (cImportEClass == null) {
            cImportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(12);
        }
        return cImportEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCImport_Location() {
        return (EAttribute)getCImport().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCImport_Name() {
        return (EAttribute)getCImport().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCInterface() {
        if (cInterfaceEClass == null) {
            cInterfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(13);
        }
        return cInterfaceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCInterface_Function() {
        return (EReference)getCInterface().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCInterface_CallbackFunction() {
        return (EReference)getCInterface().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCInterface_Any() {
        return (EAttribute)getCInterface().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCInterface_CallbackHeader() {
        return (EAttribute)getCInterface().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCInterface_Header() {
        return (EAttribute)getCInterface().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCInterface_AnyAttribute1() {
        return (EAttribute)getCInterface().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCommonExtensionBase() {
        if (commonExtensionBaseEClass == null) {
            commonExtensionBaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(14);
        }
        return commonExtensionBaseEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCommonExtensionBase_Documentation() {
        return (EReference)getCommonExtensionBase().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCommonExtensionBase_AnyAttribute() {
        return (EAttribute)getCommonExtensionBase().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getComponent() {
        if (componentEClass == null) {
            componentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(15);
        }
        return componentEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComponent_ImplementationGroup() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getComponent_Implementation() {
        return (EReference)getComponent().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComponent_Group() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getComponent_Service() {
        return (EReference)getComponent().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getComponent_Reference() {
        return (EReference)getComponent().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getComponent_Property() {
        return (EReference)getComponent().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComponent_Any() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComponent_Autowire() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComponent_ConstrainingType() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComponent_Name() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComponent_PolicySets() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComponent_Requires() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getComponentReference() {
        if (componentReferenceEClass == null) {
            componentReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(16);
        }
        return componentReferenceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComponentReference_Autowire() {
        return (EAttribute)getComponentReference().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComponentReference_Multiplicity() {
        return (EAttribute)getComponentReference().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComponentReference_NonOverridable() {
        return (EAttribute)getComponentReference().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComponentReference_WiredByImpl() {
        return (EAttribute)getComponentReference().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getComponentReference_Target() {
        return (EReference)getComponentReference().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComponentReference_Id() {
        return (EAttribute)getComponentReference().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getComponentService() {
        if (componentServiceEClass == null) {
            componentServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(17);
        }
        return componentServiceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComponentService_Id() {
        return (EAttribute)getComponentService().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getComponentType() {
        if (componentTypeEClass == null) {
            componentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(18);
        }
        return componentTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComponentType_Group() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getComponentType_Service() {
        return (EReference)getComponentType().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getComponentType_Reference() {
        return (EReference)getComponentType().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getComponentType_Property() {
        return (EReference)getComponentType().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComponentType_Any() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComponentType_ConstrainingType() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getComponentTypeReference() {
        if (componentTypeReferenceEClass == null) {
            componentTypeReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(19);
        }
        return componentTypeReferenceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getComposite() {
        if (compositeEClass == null) {
            compositeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(20);
        }
        return compositeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getComposite_Include() {
        return (EReference)getComposite().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComposite_Group() {
        return (EAttribute)getComposite().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getComposite_Service() {
        return (EReference)getComposite().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getComposite_Property() {
        return (EReference)getComposite().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getComposite_Component() {
        return (EReference)getComposite().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getComposite_Reference() {
        return (EReference)getComposite().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getComposite_Wire() {
        return (EReference)getComposite().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComposite_Any() {
        return (EAttribute)getComposite().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComposite_Autowire() {
        return (EAttribute)getComposite().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComposite_ConstrainingType() {
        return (EAttribute)getComposite().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComposite_Local() {
        return (EAttribute)getComposite().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComposite_Name() {
        return (EAttribute)getComposite().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComposite_PolicySets() {
        return (EAttribute)getComposite().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComposite_Requires() {
        return (EAttribute)getComposite().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getComposite_TargetNamespace() {
        return (EAttribute)getComposite().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getConnection() {
        if (connectionEClass == null) {
            connectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(21);
        }
        return connectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getConnection_Property() {
        return (EReference)getConnection().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getConnection_Any() {
        return (EAttribute)getConnection().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getConnection_Create() {
        return (EAttribute)getConnection().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getConnection_Name() {
        return (EAttribute)getConnection().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getConnection_Type() {
        return (EAttribute)getConnection().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getConnection_AnyAttribute() {
        return (EAttribute)getConnection().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getConnectionSpec() {
        if (connectionSpecEClass == null) {
            connectionSpecEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(22);
        }
        return connectionSpecEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getConnectionSpec_Property() {
        return (EReference)getConnectionSpec().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getConnectionSpec_Any() {
        return (EAttribute)getConnectionSpec().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getConnectionSpec_Type() {
        return (EAttribute)getConnectionSpec().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getConnectionSpec_AnyAttribute() {
        return (EAttribute)getConnectionSpec().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getConstrainingProperty() {
        if (constrainingPropertyEClass == null) {
            constrainingPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(23);
        }
        return constrainingPropertyEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getConstrainingReference() {
        if (constrainingReferenceEClass == null) {
            constrainingReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(24);
        }
        return constrainingReferenceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getConstrainingService() {
        if (constrainingServiceEClass == null) {
            constrainingServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(25);
        }
        return constrainingServiceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getConstrainingType() {
        if (constrainingTypeEClass == null) {
            constrainingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(26);
        }
        return constrainingTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getConstrainingType_Group() {
        return (EAttribute)getConstrainingType().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getConstrainingType_Service() {
        return (EReference)getConstrainingType().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getConstrainingType_Reference() {
        return (EReference)getConstrainingType().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getConstrainingType_Property() {
        return (EReference)getConstrainingType().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getConstrainingType_Any() {
        return (EAttribute)getConstrainingType().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getConstrainingType_Name() {
        return (EAttribute)getConstrainingType().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getConstrainingType_TargetNamespace() {
        return (EAttribute)getConstrainingType().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getContract() {
        if (contractEClass == null) {
            contractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(27);
        }
        return contractEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getContract_InterfaceGroup() {
        return (EAttribute)getContract().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getContract_Interface() {
        return (EReference)getContract().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getContract_BindingGroup() {
        return (EAttribute)getContract().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getContract_Binding() {
        return (EReference)getContract().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getContract_Callback() {
        return (EReference)getContract().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getContract_Any() {
        return (EAttribute)getContract().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getContract_Name() {
        return (EAttribute)getContract().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getContract_PolicySets() {
        return (EAttribute)getContract().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getContract_Requires() {
        return (EAttribute)getContract().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getContributionType() {
        if (contributionTypeEClass == null) {
            contributionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(28);
        }
        return contributionTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getContributionType_Deployable() {
        return (EReference)getContributionType().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getContributionType_ImportBaseGroup() {
        return (EAttribute)getContributionType().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getContributionType_ImportBase() {
        return (EReference)getContributionType().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getContributionType_ExportBaseGroup() {
        return (EAttribute)getContributionType().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getContributionType_ExportBase() {
        return (EReference)getContributionType().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getContributionType_Any() {
        return (EAttribute)getContributionType().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCPPExport() {
        if (cppExportEClass == null) {
            cppExportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(29);
        }
        return cppExportEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPExport_Name() {
        return (EAttribute)getCPPExport().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPExport_Path() {
        return (EAttribute)getCPPExport().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCPPFunction() {
        if (cppFunctionEClass == null) {
            cppFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(30);
        }
        return cppFunctionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPFunction_Name() {
        return (EAttribute)getCPPFunction().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPFunction_OneWay() {
        return (EAttribute)getCPPFunction().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPFunction_Requires() {
        return (EAttribute)getCPPFunction().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPFunction_AnyAttribute() {
        return (EAttribute)getCPPFunction().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCPPImplementation() {
        if (cppImplementationEClass == null) {
            cppImplementationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(31);
        }
        return cppImplementationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCPPImplementation_Function() {
        return (EReference)getCPPImplementation().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPImplementation_Any() {
        return (EAttribute)getCPPImplementation().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPImplementation_AllowsPassByReference() {
        return (EAttribute)getCPPImplementation().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPImplementation_Class() {
        return (EAttribute)getCPPImplementation().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPImplementation_ComponentType() {
        return (EAttribute)getCPPImplementation().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPImplementation_EagerInit() {
        return (EAttribute)getCPPImplementation().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPImplementation_Header() {
        return (EAttribute)getCPPImplementation().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPImplementation_Library() {
        return (EAttribute)getCPPImplementation().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPImplementation_Path() {
        return (EAttribute)getCPPImplementation().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPImplementation_Scope() {
        return (EAttribute)getCPPImplementation().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPImplementation_AnyAttribute1() {
        return (EAttribute)getCPPImplementation().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCPPImplementationFunction() {
        if (cppImplementationFunctionEClass == null) {
            cppImplementationFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(32);
        }
        return cppImplementationFunctionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPImplementationFunction_AllowsPassByReference() {
        return (EAttribute)getCPPImplementationFunction().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPImplementationFunction_Name() {
        return (EAttribute)getCPPImplementationFunction().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPImplementationFunction_AnyAttribute() {
        return (EAttribute)getCPPImplementationFunction().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCPPImport() {
        if (cppImportEClass == null) {
            cppImportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(35);
        }
        return cppImportEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPImport_Location() {
        return (EAttribute)getCPPImport().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPImport_Name() {
        return (EAttribute)getCPPImport().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCPPInterface() {
        if (cppInterfaceEClass == null) {
            cppInterfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(36);
        }
        return cppInterfaceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCPPInterface_Function() {
        return (EReference)getCPPInterface().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCPPInterface_CallbackFunction() {
        return (EReference)getCPPInterface().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPInterface_Any() {
        return (EAttribute)getCPPInterface().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPInterface_CallbackClass() {
        return (EAttribute)getCPPInterface().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPInterface_CallbackHeader() {
        return (EAttribute)getCPPInterface().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPInterface_Class() {
        return (EAttribute)getCPPInterface().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPInterface_Header() {
        return (EAttribute)getCPPInterface().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCPPInterface_AnyAttribute1() {
        return (EAttribute)getCPPInterface().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDeployableType() {
        if (deployableTypeEClass == null) {
            deployableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(41);
        }
        return deployableTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDeployableType_Any() {
        return (EAttribute)getDeployableType().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDeployableType_Composite() {
        return (EAttribute)getDeployableType().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDocumentation() {
        if (documentationEClass == null) {
            documentationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(42);
        }
        return documentationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDocumentation_Mixed() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDocumentation_Any() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDocumentation_Lang() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDocumentRoot() {
        if (documentRootEClass == null) {
            documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(43);
        }
        return documentRootEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Binding() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_BindingEjb() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_BindingJca() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_BindingJms() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_BindingSca() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_BindingWs() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_BindingType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Callback() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ComponentType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Composite() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ConstrainingType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Contribution() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Definitions() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Documentation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Export() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ExportBase() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ExportC() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ExportCpp() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(20);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ExportJava() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(21);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Implementation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(22);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ImplementationBpel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(23);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ImplementationC() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(24);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ImplementationComposite() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(25);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ImplementationCpp() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(26);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ImplementationEjb() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(27);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ImplementationJava() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(28);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ImplementationJee() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(29);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ImplementationSpring() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(30);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ImplementationWeb() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(31);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ImplementationType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(32);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Import() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(33);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ImportBase() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(34);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ImportC() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(35);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ImportCpp() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(36);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ImportJava() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(37);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Include() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(38);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Intent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(39);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Interface() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(40);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_InterfaceC() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(41);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_InterfaceCpp() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(42);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_InterfaceJava() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(43);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_InterfaceWsdl() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(44);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_OperationSelector() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(45);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_OperationSelectorJmsDefault() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(46);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_PolicySet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(47);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_PolicySetAttachment() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(48);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Value() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(49);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_WireFormat() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(50);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_WireFormatJmsDefault() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(51);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_WSCallback() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(52);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDocumentRoot_Callback1() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(53);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDocumentRoot_Requires() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(54);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEJBImplementation() {
        if (ejbImplementationEClass == null) {
            ejbImplementationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(44);
        }
        return ejbImplementationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEJBImplementation_Any() {
        return (EAttribute)getEJBImplementation().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEJBImplementation_EjbLink() {
        return (EAttribute)getEJBImplementation().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEJBImplementation_AnyAttribute1() {
        return (EAttribute)getEJBImplementation().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEJBSessionBeanBinding() {
        if (ejbSessionBeanBindingEClass == null) {
            ejbSessionBeanBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(45);
        }
        return ejbSessionBeanBindingEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEJBSessionBeanBinding_Any() {
        return (EAttribute)getEJBSessionBeanBinding().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEJBSessionBeanBinding_EjbLinkName() {
        return (EAttribute)getEJBSessionBeanBinding().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEJBSessionBeanBinding_EjbVersion() {
        return (EAttribute)getEJBSessionBeanBinding().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEJBSessionBeanBinding_HomeInterface() {
        return (EAttribute)getEJBSessionBeanBinding().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getExport() {
        if (exportEClass == null) {
            exportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(46);
        }
        return exportEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getExport_Any() {
        return (EAttribute)getExport().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getExportType() {
        if (exportTypeEClass == null) {
            exportTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(47);
        }
        return exportTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getExportType_Namespace() {
        return (EAttribute)getExportType().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getImplementation() {
        if (implementationEClass == null) {
            implementationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(48);
        }
        return implementationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImplementation_PolicySets() {
        return (EAttribute)getImplementation().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImplementation_Requires() {
        return (EAttribute)getImplementation().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getImplementationType() {
        if (implementationTypeEClass == null) {
            implementationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(49);
        }
        return implementationTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImplementationType_Any() {
        return (EAttribute)getImplementationType().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImplementationType_AlwaysProvides() {
        return (EAttribute)getImplementationType().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImplementationType_MayProvide() {
        return (EAttribute)getImplementationType().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImplementationType_Type() {
        return (EAttribute)getImplementationType().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getImport() {
        if (importEClass == null) {
            importEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(50);
        }
        return importEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImport_Any() {
        return (EAttribute)getImport().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getImportType() {
        if (importTypeEClass == null) {
            importTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(51);
        }
        return importTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImportType_Location() {
        return (EAttribute)getImportType().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImportType_Namespace() {
        return (EAttribute)getImportType().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getInboundOperation() {
        if (inboundOperationEClass == null) {
            inboundOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(52);
        }
        return inboundOperationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getInboundOperation_Any() {
        return (EAttribute)getInboundOperation().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getInboundOperation_Name() {
        return (EAttribute)getInboundOperation().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getInboundOperation_NativeOperation() {
        return (EAttribute)getInboundOperation().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getInboundOperation_AnyAttribute() {
        return (EAttribute)getInboundOperation().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getInclude() {
        if (includeEClass == null) {
            includeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(53);
        }
        return includeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getInclude_Name() {
        return (EAttribute)getInclude().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIntent() {
        if (intentEClass == null) {
            intentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(54);
        }
        return intentEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIntent_Description() {
        return (EAttribute)getIntent().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getIntent_Qualifier() {
        return (EReference)getIntent().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIntent_Any() {
        return (EAttribute)getIntent().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIntent_Constrains() {
        return (EAttribute)getIntent().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIntent_Excludes() {
        return (EAttribute)getIntent().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIntent_IntentType() {
        return (EAttribute)getIntent().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIntent_MutuallyExclusive() {
        return (EAttribute)getIntent().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIntent_Name() {
        return (EAttribute)getIntent().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIntent_Requires() {
        return (EAttribute)getIntent().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIntent_AnyAttribute() {
        return (EAttribute)getIntent().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIntentMap() {
        if (intentMapEClass == null) {
            intentMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(55);
        }
        return intentMapEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIntentMap_Group() {
        return (EAttribute)getIntentMap().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getIntentMap_Qualifier() {
        return (EReference)getIntentMap().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIntentMap_Any() {
        return (EAttribute)getIntentMap().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIntentMap_Provides() {
        return (EAttribute)getIntentMap().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIntentMap_AnyAttribute() {
        return (EAttribute)getIntentMap().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIntentQualifier() {
        if (intentQualifierEClass == null) {
            intentQualifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(56);
        }
        return intentQualifierEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIntentQualifier_Description() {
        return (EAttribute)getIntentQualifier().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIntentQualifier_Default() {
        return (EAttribute)getIntentQualifier().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIntentQualifier_Name() {
        return (EAttribute)getIntentQualifier().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getInteractionSpec() {
        if (interactionSpecEClass == null) {
            interactionSpecEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(59);
        }
        return interactionSpecEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getInteractionSpec_Property() {
        return (EReference)getInteractionSpec().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getInteractionSpec_Any() {
        return (EAttribute)getInteractionSpec().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getInteractionSpec_Type() {
        return (EAttribute)getInteractionSpec().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getInteractionSpec_AnyAttribute() {
        return (EAttribute)getInteractionSpec().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getInterface() {
        if (interfaceEClass == null) {
            interfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(60);
        }
        return interfaceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getInterface_PolicySets() {
        return (EAttribute)getInterface().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getInterface_Remotable() {
        return (EAttribute)getInterface().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getInterface_Requires() {
        return (EAttribute)getInterface().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJavaExportType() {
        if (javaExportTypeEClass == null) {
            javaExportTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(61);
        }
        return javaExportTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJavaExportType_Package() {
        return (EAttribute)getJavaExportType().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJavaImplementation() {
        if (javaImplementationEClass == null) {
            javaImplementationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(62);
        }
        return javaImplementationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJavaImplementation_Any() {
        return (EAttribute)getJavaImplementation().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJavaImplementation_Class() {
        return (EAttribute)getJavaImplementation().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJavaImplementation_AnyAttribute1() {
        return (EAttribute)getJavaImplementation().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJavaImportType() {
        if (javaImportTypeEClass == null) {
            javaImportTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(63);
        }
        return javaImportTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJavaImportType_Location() {
        return (EAttribute)getJavaImportType().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJavaImportType_Package() {
        return (EAttribute)getJavaImportType().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJavaInterface() {
        if (javaInterfaceEClass == null) {
            javaInterfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(64);
        }
        return javaInterfaceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJavaInterface_Any() {
        return (EAttribute)getJavaInterface().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJavaInterface_CallbackInterface() {
        return (EAttribute)getJavaInterface().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJavaInterface_Interface() {
        return (EAttribute)getJavaInterface().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJavaInterface_AnyAttribute1() {
        return (EAttribute)getJavaInterface().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJCABinding() {
        if (jcaBindingEClass == null) {
            jcaBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(65);
        }
        return jcaBindingEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJCABinding_OutboundConnection() {
        return (EReference)getJCABinding().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJCABinding_InboundConnection() {
        return (EReference)getJCABinding().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJCABinding_OutboundInteraction() {
        return (EReference)getJCABinding().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJCABinding_InboundInteraction() {
        return (EReference)getJCABinding().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJCABinding_Property() {
        return (EReference)getJCABinding().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJCABinding_Any() {
        return (EAttribute)getJCABinding().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJCABinding_ConnectionInfo() {
        return (EAttribute)getJCABinding().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJCABinding_InitialContextFactory() {
        return (EAttribute)getJCABinding().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJCABinding_JndiURL() {
        return (EAttribute)getJCABinding().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJCAInboundConnection() {
        if (jcaInboundConnectionEClass == null) {
            jcaInboundConnectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(68);
        }
        return jcaInboundConnectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJCAInboundConnection_ResourceAdapter() {
        return (EReference)getJCAInboundConnection().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJCAInboundConnection_ActivationSpec() {
        return (EReference)getJCAInboundConnection().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJCAInboundConnection_Any() {
        return (EAttribute)getJCAInboundConnection().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJCAInboundConnection_AnyAttribute() {
        return (EAttribute)getJCAInboundConnection().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJCAInboundInteraction() {
        if (jcaInboundInteractionEClass == null) {
            jcaInboundInteractionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(69);
        }
        return jcaInboundInteractionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJCAInboundInteraction_Listener() {
        return (EAttribute)getJCAInboundInteraction().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJCAInboundInteraction_InboundOperation() {
        return (EReference)getJCAInboundInteraction().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJCAInboundInteraction_Any() {
        return (EAttribute)getJCAInboundInteraction().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJCAInboundInteraction_AnyAttribute() {
        return (EAttribute)getJCAInboundInteraction().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJCAOutboundConnection() {
        if (jcaOutboundConnectionEClass == null) {
            jcaOutboundConnectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(70);
        }
        return jcaOutboundConnectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJCAOutboundConnection_ResourceAdapter() {
        return (EReference)getJCAOutboundConnection().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJCAOutboundConnection_Connection() {
        return (EReference)getJCAOutboundConnection().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJCAOutboundConnection_ResAuth() {
        return (EAttribute)getJCAOutboundConnection().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJCAOutboundConnection_Any() {
        return (EAttribute)getJCAOutboundConnection().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJCAOutboundConnection_Managed() {
        return (EAttribute)getJCAOutboundConnection().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJCAOutboundConnection_AnyAttribute() {
        return (EAttribute)getJCAOutboundConnection().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJCAOutboundInteraction() {
        if (jcaOutboundInteractionEClass == null) {
            jcaOutboundInteractionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(71);
        }
        return jcaOutboundInteractionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJCAOutboundInteraction_ConnectionSpec() {
        return (EReference)getJCAOutboundInteraction().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJCAOutboundInteraction_InteractionSpec() {
        return (EReference)getJCAOutboundInteraction().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJCAOutboundInteraction_Operation() {
        return (EReference)getJCAOutboundInteraction().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJCAOutboundInteraction_Any() {
        return (EAttribute)getJCAOutboundInteraction().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJCAOutboundInteraction_AnyAttribute() {
        return (EAttribute)getJCAOutboundInteraction().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJEEImplementation() {
        if (jeeImplementationEClass == null) {
            jeeImplementationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(72);
        }
        return jeeImplementationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJEEImplementation_Any() {
        return (EAttribute)getJEEImplementation().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJEEImplementation_Archive() {
        return (EAttribute)getJEEImplementation().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJEEImplementation_AnyAttribute1() {
        return (EAttribute)getJEEImplementation().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJMSActivationSpec() {
        if (jmsActivationSpecEClass == null) {
            jmsActivationSpecEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(73);
        }
        return jmsActivationSpecEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJMSActivationSpec_Property() {
        return (EReference)getJMSActivationSpec().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSActivationSpec_Create() {
        return (EAttribute)getJMSActivationSpec().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSActivationSpec_JndiName() {
        return (EAttribute)getJMSActivationSpec().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJMSBinding() {
        if (jmsBindingEClass == null) {
            jmsBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(74);
        }
        return jmsBindingEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJMSBinding_Destination() {
        return (EReference)getJMSBinding().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJMSBinding_ConnectionFactory() {
        return (EReference)getJMSBinding().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJMSBinding_ActivationSpec() {
        return (EReference)getJMSBinding().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJMSBinding_Response() {
        return (EReference)getJMSBinding().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJMSBinding_Headers() {
        return (EReference)getJMSBinding().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJMSBinding_MessageSelection() {
        return (EReference)getJMSBinding().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJMSBinding_ResourceAdapter() {
        return (EReference)getJMSBinding().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJMSBinding_OperationProperties() {
        return (EReference)getJMSBinding().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSBinding_Any() {
        return (EAttribute)getJMSBinding().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSBinding_CorrelationScheme() {
        return (EAttribute)getJMSBinding().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSBinding_InitialContextFactory() {
        return (EAttribute)getJMSBinding().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSBinding_JndiURL() {
        return (EAttribute)getJMSBinding().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSBinding_OperationProperties1() {
        return (EAttribute)getJMSBinding().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSBinding_RequestConnection() {
        return (EAttribute)getJMSBinding().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSBinding_ResponseConnection() {
        return (EAttribute)getJMSBinding().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJMSConnectionFactory() {
        if (jmsConnectionFactoryEClass == null) {
            jmsConnectionFactoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(75);
        }
        return jmsConnectionFactoryEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJMSConnectionFactory_Property() {
        return (EReference)getJMSConnectionFactory().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSConnectionFactory_Create() {
        return (EAttribute)getJMSConnectionFactory().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSConnectionFactory_JndiName() {
        return (EAttribute)getJMSConnectionFactory().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJMSDestination() {
        if (jmsDestinationEClass == null) {
            jmsDestinationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(78);
        }
        return jmsDestinationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJMSDestination_Property() {
        return (EReference)getJMSDestination().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSDestination_Create() {
        return (EAttribute)getJMSDestination().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSDestination_JndiName() {
        return (EAttribute)getJMSDestination().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSDestination_Type() {
        return (EAttribute)getJMSDestination().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJMSHeaders() {
        if (jmsHeadersEClass == null) {
            jmsHeadersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(79);
        }
        return jmsHeadersEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJMSHeaders_Property() {
        return (EReference)getJMSHeaders().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSHeaders_DeliveryMode() {
        return (EAttribute)getJMSHeaders().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSHeaders_Priority() {
        return (EAttribute)getJMSHeaders().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSHeaders_TimeToLive() {
        return (EAttribute)getJMSHeaders().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSHeaders_Type() {
        return (EAttribute)getJMSHeaders().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJMSMessageSelection() {
        if (jmsMessageSelectionEClass == null) {
            jmsMessageSelectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(80);
        }
        return jmsMessageSelectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJMSMessageSelection_Property() {
        return (EReference)getJMSMessageSelection().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSMessageSelection_Selector() {
        return (EAttribute)getJMSMessageSelection().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJMSOperationProperties() {
        if (jmsOperationPropertiesEClass == null) {
            jmsOperationPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(81);
        }
        return jmsOperationPropertiesEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJMSOperationProperties_Property() {
        return (EReference)getJMSOperationProperties().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJMSOperationProperties_Headers() {
        return (EReference)getJMSOperationProperties().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSOperationProperties_Name() {
        return (EAttribute)getJMSOperationProperties().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSOperationProperties_NativeOperation() {
        return (EAttribute)getJMSOperationProperties().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJMSResourceAdapter() {
        if (jmsResourceAdapterEClass == null) {
            jmsResourceAdapterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(82);
        }
        return jmsResourceAdapterEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJMSResourceAdapter_Property() {
        return (EReference)getJMSResourceAdapter().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSResourceAdapter_Name() {
        return (EAttribute)getJMSResourceAdapter().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJMSResponse() {
        if (jmsResponseEClass == null) {
            jmsResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(83);
        }
        return jmsResponseEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJMSResponse_WireFormat() {
        return (EReference)getJMSResponse().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJMSResponse_Destination() {
        return (EReference)getJMSResponse().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJMSResponse_ConnectionFactory() {
        return (EReference)getJMSResponse().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJMSResponse_ActivationSpec() {
        return (EReference)getJMSResponse().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJMSResponse_Any() {
        return (EAttribute)getJMSResponse().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getOperation() {
        if (operationEClass == null) {
            operationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(89);
        }
        return operationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOperation_InteractionSpec() {
        return (EReference)getOperation().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOperation_Any() {
        return (EAttribute)getOperation().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOperation_Name() {
        return (EAttribute)getOperation().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOperation_AnyAttribute() {
        return (EAttribute)getOperation().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getOperationSelectorType() {
        if (operationSelectorTypeEClass == null) {
            operationSelectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(90);
        }
        return operationSelectorTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOperationSelectorType_Any() {
        return (EAttribute)getOperationSelectorType().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOperationSelectorType_AnyAttribute() {
        return (EAttribute)getOperationSelectorType().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPolicySet() {
        if (policySetEClass == null) {
            policySetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(93);
        }
        return policySetEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicySet_Group() {
        return (EAttribute)getPolicySet().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPolicySet_PolicySetReference() {
        return (EReference)getPolicySet().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPolicySet_IntentMap() {
        return (EReference)getPolicySet().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicySet_Any() {
        return (EAttribute)getPolicySet().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicySet_AppliesTo() {
        return (EAttribute)getPolicySet().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicySet_AttachTo() {
        return (EAttribute)getPolicySet().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicySet_Name() {
        return (EAttribute)getPolicySet().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicySet_Provides() {
        return (EAttribute)getPolicySet().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicySet_AnyAttribute() {
        return (EAttribute)getPolicySet().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPolicySetAttachment() {
        if (policySetAttachmentEClass == null) {
            policySetAttachmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(94);
        }
        return policySetAttachmentEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicySetAttachment_Name() {
        return (EAttribute)getPolicySetAttachment().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicySetAttachment_AnyAttribute() {
        return (EAttribute)getPolicySetAttachment().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPolicySetReference() {
        if (policySetReferenceEClass == null) {
            policySetReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(95);
        }
        return policySetReferenceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicySetReference_Name() {
        return (EAttribute)getPolicySetReference().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicySetReference_AnyAttribute() {
        return (EAttribute)getPolicySetReference().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getProperty() {
        if (propertyEClass == null) {
            propertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(98);
        }
        return propertyEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getProperty_Element() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getProperty_Many() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getProperty_MustSupply() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getProperty_Name() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getProperty_Type() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getProperty_AnyAttribute() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPropertyValue() {
        if (propertyValueEClass == null) {
            propertyValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(99);
        }
        return propertyValueEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPropertyValue_Element() {
        return (EAttribute)getPropertyValue().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPropertyValue_File() {
        return (EAttribute)getPropertyValue().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPropertyValue_Many() {
        return (EAttribute)getPropertyValue().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPropertyValue_Name() {
        return (EAttribute)getPropertyValue().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPropertyValue_Source() {
        return (EAttribute)getPropertyValue().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPropertyValue_Type() {
        return (EAttribute)getPropertyValue().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPropertyValue_Value() {
        return (EAttribute)getPropertyValue().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPropertyValue_AnyAttribute() {
        return (EAttribute)getPropertyValue().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getQualifier() {
        if (qualifierEClass == null) {
            qualifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(100);
        }
        return qualifierEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getQualifier_Group() {
        return (EAttribute)getQualifier().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getQualifier_Any() {
        return (EAttribute)getQualifier().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getQualifier_Name() {
        return (EAttribute)getQualifier().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getQualifier_AnyAttribute() {
        return (EAttribute)getQualifier().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getReference() {
        if (referenceEClass == null) {
            referenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(101);
        }
        return referenceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getReference_Autowire() {
        return (EAttribute)getReference().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getReference_Multiplicity() {
        return (EAttribute)getReference().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getReference_Target() {
        return (EAttribute)getReference().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getReference_WiredByImpl() {
        return (EAttribute)getReference().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getReference_Promote() {
        return (EReference)getReference().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getResourceAdapter() {
        if (resourceAdapterEClass == null) {
            resourceAdapterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(104);
        }
        return resourceAdapterEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResourceAdapter_Property() {
        return (EReference)getResourceAdapter().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResourceAdapter_Any() {
        return (EAttribute)getResourceAdapter().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResourceAdapter_Name() {
        return (EAttribute)getResourceAdapter().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResourceAdapter_Type() {
        return (EAttribute)getResourceAdapter().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResourceAdapter_AnyAttribute() {
        return (EAttribute)getResourceAdapter().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSCABinding() {
        if (scaBindingEClass == null) {
            scaBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(105);
        }
        return scaBindingEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSCAImplementation() {
        if (scaImplementationEClass == null) {
            scaImplementationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(106);
        }
        return scaImplementationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSCAImplementation_Any() {
        return (EAttribute)getSCAImplementation().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSCAImplementation_Name() {
        return (EAttribute)getSCAImplementation().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSCAPropertyBase() {
        if (scaPropertyBaseEClass == null) {
            scaPropertyBaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(107);
        }
        return scaPropertyBaseEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSCAPropertyBase_Mixed() {
        return (EAttribute)getSCAPropertyBase().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSCAPropertyBase_Any() {
        return (EAttribute)getSCAPropertyBase().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSCAPropertyBase_PolicySets() {
        return (EAttribute)getSCAPropertyBase().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSCAPropertyBase_Requires() {
        return (EAttribute)getSCAPropertyBase().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getService() {
        if (serviceEClass == null) {
            serviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(108);
        }
        return serviceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getService_Promote() {
        return (EReference)getService().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSpringImplementation() {
        if (springImplementationEClass == null) {
            springImplementationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(109);
        }
        return springImplementationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpringImplementation_Any() {
        return (EAttribute)getSpringImplementation().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpringImplementation_Location() {
        return (EAttribute)getSpringImplementation().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTDefinitions() {
        if (tDefinitionsEClass == null) {
            tDefinitionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(110);
        }
        return tDefinitionsEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTDefinitions_Group() {
        return (EAttribute)getTDefinitions().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getTDefinitions_Intent() {
        return (EReference)getTDefinitions().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getTDefinitions_PolicySet() {
        return (EReference)getTDefinitions().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTDefinitions_BindingGroup() {
        return (EAttribute)getTDefinitions().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getTDefinitions_Binding() {
        return (EReference)getTDefinitions().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getTDefinitions_BindingType() {
        return (EReference)getTDefinitions().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getTDefinitions_ImplementationType() {
        return (EReference)getTDefinitions().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTDefinitions_Any() {
        return (EAttribute)getTDefinitions().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTDefinitions_TargetNamespace() {
        return (EAttribute)getTDefinitions().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getValueType() {
        if (valueTypeEClass == null) {
            valueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(113);
        }
        return valueTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getValueType_Mixed() {
        return (EAttribute)getValueType().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getValueType_Any() {
        return (EAttribute)getValueType().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getValueType_AnyAttribute() {
        return (EAttribute)getValueType().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getWebImplementation() {
        if (webImplementationEClass == null) {
            webImplementationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(116);
        }
        return webImplementationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWebImplementation_Any() {
        return (EAttribute)getWebImplementation().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWebImplementation_WebUri() {
        return (EAttribute)getWebImplementation().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWebImplementation_AnyAttribute1() {
        return (EAttribute)getWebImplementation().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getWebServiceBinding() {
        if (webServiceBindingEClass == null) {
            webServiceBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(117);
        }
        return webServiceBindingEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getWebServiceBinding_EndpointReference() {
        return (EReference)getWebServiceBinding().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWebServiceBinding_Any() {
        return (EAttribute)getWebServiceBinding().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWebServiceBinding_WsdlElement() {
        return (EAttribute)getWebServiceBinding().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWebServiceBinding_WsdlLocation() {
        return (EAttribute)getWebServiceBinding().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getWire() {
        if (wireEClass == null) {
            wireEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(118);
        }
        return wireEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWire_Any() {
        return (EAttribute)getWire().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWire_Replace() {
        return (EAttribute)getWire().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWire_Source() {
        return (EAttribute)getWire().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWire_Target() {
        return (EAttribute)getWire().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getWire_Source2() {
        return (EReference)getWire().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getWire_Target2() {
        return (EReference)getWire().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getWireFormatType() {
        if (wireFormatTypeEClass == null) {
            wireFormatTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(119);
        }
        return wireFormatTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWireFormatType_Any() {
        return (EAttribute)getWireFormatType().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWireFormatType_AnyAttribute() {
        return (EAttribute)getWireFormatType().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getWSCallbackType() {
        if (wsCallbackTypeEClass == null) {
            wsCallbackTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(120);
        }
        return wsCallbackTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWSCallbackType_Any() {
        return (EAttribute)getWSCallbackType().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWSCallbackType_AnyAttribute() {
        return (EAttribute)getWSCallbackType().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getWSDLPortType() {
        if (wsdlPortTypeEClass == null) {
            wsdlPortTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(121);
        }
        return wsdlPortTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWSDLPortType_Any() {
        return (EAttribute)getWSDLPortType().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWSDLPortType_CallbackInterface() {
        return (EAttribute)getWSDLPortType().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWSDLPortType_Interface() {
        return (EAttribute)getWSDLPortType().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWSDLPortType_AnyAttribute1() {
        return (EAttribute)getWSDLPortType().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExtendableType() {
        if (extendableTypeEClass == null) {
            extendableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(122);
        }
        return extendableTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getCImplementationScope() {
        if (cImplementationScopeEEnum == null) {
            cImplementationScopeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(10);
        }
        return cImplementationScopeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getCPPImplementationScope() {
        if (cppImplementationScopeEEnum == null) {
            cppImplementationScopeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(33);
        }
        return cppImplementationScopeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getCreateResource() {
        if (createResourceEEnum == null) {
            createResourceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(37);
        }
        return createResourceEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getDeliveryModeType() {
        if (deliveryModeTypeEEnum == null) {
            deliveryModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(39);
        }
        return deliveryModeTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getInteractionOrImplementation() {
        if (interactionOrImplementationEEnum == null) {
            interactionOrImplementationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(57);
        }
        return interactionOrImplementationEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getJCACreateResource() {
        if (jcaCreateResourceEEnum == null) {
            jcaCreateResourceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(66);
        }
        return jcaCreateResourceEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getJMSCreateResource() {
        if (jmsCreateResourceEEnum == null) {
            jmsCreateResourceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(76);
        }
        return jmsCreateResourceEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMultiplicity() {
        if (multiplicityEEnum == null) {
            multiplicityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(87);
        }
        return multiplicityEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getOverrideOptions() {
        if (overrideOptionsEEnum == null) {
            overrideOptionsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(91);
        }
        return overrideOptionsEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getPriorityType() {
        if (priorityTypeEEnum == null) {
            priorityTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(96);
        }
        return priorityTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getResAuth() {
        if (resAuthEEnum == null) {
            resAuthEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(102);
        }
        return resAuthEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getTypeType() {
        if (typeTypeEEnum == null) {
            typeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(111);
        }
        return typeTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getVersionValue() {
        if (versionValueEEnum == null) {
            versionValueEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(114);
        }
        return versionValueEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getCImplementationScopeObject() {
        if (cImplementationScopeObjectEDataType == null) {
            cImplementationScopeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(11);
        }
        return cImplementationScopeObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getCPPImplementationScopeObject() {
        if (cppImplementationScopeObjectEDataType == null) {
            cppImplementationScopeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(34);
        }
        return cppImplementationScopeObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getCreateResourceObject() {
        if (createResourceObjectEDataType == null) {
            createResourceObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(38);
        }
        return createResourceObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getDeliveryModeTypeObject() {
        if (deliveryModeTypeObjectEDataType == null) {
            deliveryModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(40);
        }
        return deliveryModeTypeObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getInteractionOrImplementationObject() {
        if (interactionOrImplementationObjectEDataType == null) {
            interactionOrImplementationObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(58);
        }
        return interactionOrImplementationObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getJCACreateResourceObject() {
        if (jcaCreateResourceObjectEDataType == null) {
            jcaCreateResourceObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(67);
        }
        return jcaCreateResourceObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getJMSCreateResourceObject() {
        if (jmsCreateResourceObjectEDataType == null) {
            jmsCreateResourceObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(77);
        }
        return jmsCreateResourceObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getListOfAnyURIs() {
        if (listOfAnyURIsEDataType == null) {
            listOfAnyURIsEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(84);
        }
        return listOfAnyURIsEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getListOfNCNames() {
        if (listOfNCNamesEDataType == null) {
            listOfNCNamesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(85);
        }
        return listOfNCNamesEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getListOfQNames() {
        if (listOfQNamesEDataType == null) {
            listOfQNamesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(86);
        }
        return listOfQNamesEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getMultiplicityObject() {
        if (multiplicityObjectEDataType == null) {
            multiplicityObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(88);
        }
        return multiplicityObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getOverrideOptionsObject() {
        if (overrideOptionsObjectEDataType == null) {
            overrideOptionsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(92);
        }
        return overrideOptionsObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getPriorityTypeObject() {
        if (priorityTypeObjectEDataType == null) {
            priorityTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(97);
        }
        return priorityTypeObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getResAuthObject() {
        if (resAuthObjectEDataType == null) {
            resAuthObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(103);
        }
        return resAuthObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getTypeTypeObject() {
        if (typeTypeObjectEDataType == null) {
            typeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(112);
        }
        return typeTypeObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getVersionValueObject() {
        if (versionValueObjectEDataType == null) {
            versionValueObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ScaPackage.eNS_URI).getEClassifiers().get(115);
        }
        return versionValueObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ScaFactory getScaFactory() {
        return (ScaFactory)getEFactoryInstance();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isLoaded = false;

	/**
     * Laods the package and any sub-packages from their serialized form.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void loadPackage() {
        if (isLoaded) return;
        isLoaded = true;

        URL url = getClass().getResource(packageFilename);
        if (url == null) {
            throw new RuntimeException("Missing serialized package: " + packageFilename);
        }
        URI uri = URI.createURI(url.toString());
        Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
        try {
            resource.load(null);
        }
        catch (IOException exception) {
            throw new WrappedException(exception);
        }
        initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
        createResource(eNS_URI);
    }


	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isFixed = false;

	/**
     * Fixes up the loaded package, to make it appear as if it had been programmatically built.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void fixPackageContents() {
        if (isFixed) return;
        isFixed = true;
        fixEClassifiers();
    }

	/**
     * Sets the instance class on the given classifier.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
        if (eClassifier.getInstanceClassName() == null) {
            eClassifier.setInstanceClassName("org.eclipse.soa.sca.sca1_1.model.sca." + eClassifier.getName());
            setGeneratedClassName(eClassifier);
        }
    }

} //ScaPackageImpl
