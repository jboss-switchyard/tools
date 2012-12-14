/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;


import org.switchyard.tools.models.switchyard1_0.camel.*;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage
 * @generated
 */
public class CamelAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static CamelPackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CamelAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = CamelPackage.eINSTANCE;
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
	protected CamelSwitch<Adapter> modelSwitch =
		new CamelSwitch<Adapter>() {
            @Override
            public Adapter caseBaseCamelBinding(BaseCamelBinding object) {
                return createBaseCamelBindingAdapter();
            }
            @Override
            public Adapter caseGenericFileBindingType(GenericFileBindingType object) {
                return createGenericFileBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelRemoteBindingType(CamelRemoteBindingType object) {
                return createCamelRemoteBindingTypeAdapter();
            }
            @Override
            public Adapter caseScheduledPollConsumerType(ScheduledPollConsumerType object) {
                return createScheduledPollConsumerTypeAdapter();
            }
            @Override
            public Adapter caseScheduledBatchPollConsumerType(ScheduledBatchPollConsumerType object) {
                return createScheduledBatchPollConsumerTypeAdapter();
            }
            @Override
            public Adapter caseGenericFileConsumerType(GenericFileConsumerType object) {
                return createGenericFileConsumerTypeAdapter();
            }
            @Override
            public Adapter caseGenericFileProducerType(GenericFileProducerType object) {
                return createGenericFileProducerTypeAdapter();
            }
            @Override
            public Adapter caseJmsBindingType(JmsBindingType object) {
                return createJmsBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelBindingType(CamelBindingType object) {
                return createCamelBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelDirectBindingType(CamelDirectBindingType object) {
                return createCamelDirectBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelTimerBindingType(CamelTimerBindingType object) {
                return createCamelTimerBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelSedaBindingType(CamelSedaBindingType object) {
                return createCamelSedaBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelMockBindingType(CamelMockBindingType object) {
                return createCamelMockBindingTypeAdapter();
            }
            @Override
            public Adapter caseDocumentRoot(DocumentRoot object) {
                return createDocumentRootAdapter();
            }
            @Override
            public Adapter caseCommonExtensionBase(CommonExtensionBase object) {
                return createCommonExtensionBaseAdapter();
            }
            @Override
            public Adapter caseBinding(Binding object) {
                return createBindingAdapter();
            }
            @Override
            public Adapter caseSwitchYardBindingType(SwitchYardBindingType object) {
                return createSwitchYardBindingTypeAdapter();
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
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding <em>Base Camel Binding</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding
     * @generated
     */
    public Adapter createBaseCamelBindingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelBindingType <em>Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelBindingType
     * @generated
     */
	public Adapter createCamelBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelDirectBindingType <em>Direct Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelDirectBindingType
     * @generated
     */
	public Adapter createCamelDirectBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType <em>Mock Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType
     * @generated
     */
	public Adapter createCamelMockBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType <em>Seda Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType
     * @generated
     */
	public Adapter createCamelSedaBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType <em>Timer Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType
     * @generated
     */
	public Adapter createCamelTimerBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot
     * @generated
     */
	public Adapter createDocumentRootAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType <em>Remote Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType
     * @generated
     */
    public Adapter createCamelRemoteBindingTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.ScheduledPollConsumerType <em>Scheduled Poll Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ScheduledPollConsumerType
     * @generated
     */
    public Adapter createScheduledPollConsumerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType <em>Generic File Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType
     * @generated
     */
    public Adapter createGenericFileBindingTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.ScheduledBatchPollConsumerType <em>Scheduled Batch Poll Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ScheduledBatchPollConsumerType
     * @generated
     */
    public Adapter createScheduledBatchPollConsumerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType <em>Generic File Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType
     * @generated
     */
    public Adapter createGenericFileConsumerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileProducerType <em>Generic File Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileProducerType
     * @generated
     */
    public Adapter createGenericFileProducerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.JmsBindingType <em>Jms Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.JmsBindingType
     * @generated
     */
    public Adapter createJmsBindingTypeAdapter() {
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
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType <em>Switch Yard Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType
     * @generated
     */
	public Adapter createSwitchYardBindingTypeAdapter() {
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

} //CamelAdapterFactory
