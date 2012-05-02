/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.camel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelFactoryImpl extends EFactoryImpl implements CamelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CamelFactory init() {
		try {
			CamelFactory theCamelFactory = (CamelFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-camel:config:1.0"); 
			if (theCamelFactory != null) {
				return theCamelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CamelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelFactoryImpl() {
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
			case CamelPackage.CAMEL_ATOM_BINDING_TYPE: return createCamelAtomBindingType();
			case CamelPackage.CAMEL_BINDING_TYPE: return createCamelBindingType();
			case CamelPackage.CAMEL_DIRECT_BINDING_TYPE: return createCamelDirectBindingType();
			case CamelPackage.CAMEL_FILE_BINDING_TYPE: return createCamelFileBindingType();
			case CamelPackage.CAMEL_IMPLEMENTATION_TYPE: return createCamelImplementationType();
			case CamelPackage.CAMEL_MOCK_BINDING_TYPE: return createCamelMockBindingType();
			case CamelPackage.CAMEL_OPERATION_SELECTOR_TYPE: return createCamelOperationSelectorType();
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE: return createCamelSedaBindingType();
			case CamelPackage.CAMEL_TIMER_BINDING_TYPE: return createCamelTimerBindingType();
			case CamelPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case CamelPackage.FILE_CONSUMER_TYPE: return createFileConsumerType();
			case CamelPackage.FILE_PRODUCER_TYPE: return createFileProducerType();
			case CamelPackage.JAVA_DSL_TYPE: return createJavaDSLType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelAtomBindingType createCamelAtomBindingType() {
		CamelAtomBindingTypeImpl camelAtomBindingType = new CamelAtomBindingTypeImpl();
		return camelAtomBindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelBindingType createCamelBindingType() {
		CamelBindingTypeImpl camelBindingType = new CamelBindingTypeImpl();
		return camelBindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelDirectBindingType createCamelDirectBindingType() {
		CamelDirectBindingTypeImpl camelDirectBindingType = new CamelDirectBindingTypeImpl();
		return camelDirectBindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelFileBindingType createCamelFileBindingType() {
		CamelFileBindingTypeImpl camelFileBindingType = new CamelFileBindingTypeImpl();
		return camelFileBindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelImplementationType createCamelImplementationType() {
		CamelImplementationTypeImpl camelImplementationType = new CamelImplementationTypeImpl();
		return camelImplementationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelMockBindingType createCamelMockBindingType() {
		CamelMockBindingTypeImpl camelMockBindingType = new CamelMockBindingTypeImpl();
		return camelMockBindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelOperationSelectorType createCamelOperationSelectorType() {
		CamelOperationSelectorTypeImpl camelOperationSelectorType = new CamelOperationSelectorTypeImpl();
		return camelOperationSelectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelSedaBindingType createCamelSedaBindingType() {
		CamelSedaBindingTypeImpl camelSedaBindingType = new CamelSedaBindingTypeImpl();
		return camelSedaBindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelTimerBindingType createCamelTimerBindingType() {
		CamelTimerBindingTypeImpl camelTimerBindingType = new CamelTimerBindingTypeImpl();
		return camelTimerBindingType;
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
	public FileConsumerType createFileConsumerType() {
		FileConsumerTypeImpl fileConsumerType = new FileConsumerTypeImpl();
		return fileConsumerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileProducerType createFileProducerType() {
		FileProducerTypeImpl fileProducerType = new FileProducerTypeImpl();
		return fileProducerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaDSLType createJavaDSLType() {
		JavaDSLTypeImpl javaDSLType = new JavaDSLTypeImpl();
		return javaDSLType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelPackage getCamelPackage() {
		return (CamelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CamelPackage getPackage() {
		return CamelPackage.eINSTANCE;
	}

} //CamelFactoryImpl
