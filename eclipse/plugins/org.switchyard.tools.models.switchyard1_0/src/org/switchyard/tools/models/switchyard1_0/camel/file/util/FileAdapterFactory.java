/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.file.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType;
import org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledBatchPollConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType;

import org.switchyard.tools.models.switchyard1_0.camel.file.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage
 * @generated
 */
public class FileAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static FilePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FileAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = FilePackage.eINSTANCE;
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
    protected FileSwitch<Adapter> modelSwitch =
        new FileSwitch<Adapter>() {
            @Override
            public Adapter caseCamelFileBindingType(CamelFileBindingType object) {
                return createCamelFileBindingTypeAdapter();
            }
            @Override
            public Adapter caseFileConsumerType(FileConsumerType object) {
                return createFileConsumerTypeAdapter();
            }
            @Override
            public Adapter caseFileProducerType(FileProducerType object) {
                return createFileProducerTypeAdapter();
            }
            @Override
            public Adapter caseDocumentRoot(DocumentRoot object) {
                return createDocumentRootAdapter();
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
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType <em>Camel File Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType
     * @generated
     */
    public Adapter createCamelFileBindingTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType <em>Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType
     * @generated
     */
    public Adapter createFileConsumerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType <em>Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType
     * @generated
     */
    public Adapter createFileProducerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot
     * @generated
     */
    public Adapter createDocumentRootAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType <em>Scheduled Poll Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledPollConsumerType
     * @generated
     */
    public Adapter createScheduledPollConsumerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledBatchPollConsumerType <em>Scheduled Batch Poll Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledBatchPollConsumerType
     * @generated
     */
    public Adapter createScheduledBatchPollConsumerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType <em>Generic File Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileConsumerType
     * @generated
     */
    public Adapter createGenericFileConsumerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType <em>Generic File Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileProducerType
     * @generated
     */
    public Adapter createGenericFileProducerTypeAdapter() {
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

} //FileAdapterFactory
