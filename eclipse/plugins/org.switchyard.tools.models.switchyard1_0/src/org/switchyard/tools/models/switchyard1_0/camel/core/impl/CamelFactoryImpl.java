/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.camel.core.*;

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
            CamelFactory theCamelFactory = (CamelFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-camel-core:config:1.0"); 
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
            case CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE: return createScheduledPollConsumerType();
            case CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE: return createScheduledBatchPollConsumerType();
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE: return createGenericFileConsumerType();
            case CamelPackage.GENERIC_FILE_PRODUCER_TYPE: return createGenericFileProducerType();
            case CamelPackage.JMS_BINDING_TYPE: return createJmsBindingType();
            case CamelPackage.CAMEL_BINDING_TYPE: return createCamelBindingType();
            case CamelPackage.CAMEL_DIRECT_BINDING_TYPE: return createCamelDirectBindingType();
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE: return createCamelTimerBindingType();
            case CamelPackage.CAMEL_SEDA_BINDING_TYPE: return createCamelSedaBindingType();
            case CamelPackage.CAMEL_MOCK_BINDING_TYPE: return createCamelMockBindingType();
            case CamelPackage.DOCUMENT_ROOT: return createDocumentRoot();
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
            case CamelPackage.TIME_UNIT:
                return createTimeUnitFromString(eDataType, initialValue);
            case CamelPackage.TIME_UNIT_OBJECT:
                return createTimeUnitObjectFromString(eDataType, initialValue);
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
            case CamelPackage.TIME_UNIT:
                return convertTimeUnitToString(eDataType, instanceValue);
            case CamelPackage.TIME_UNIT_OBJECT:
                return convertTimeUnitObjectToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScheduledPollConsumerType createScheduledPollConsumerType() {
        ScheduledPollConsumerTypeImpl scheduledPollConsumerType = new ScheduledPollConsumerTypeImpl();
        return scheduledPollConsumerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScheduledBatchPollConsumerType createScheduledBatchPollConsumerType() {
        ScheduledBatchPollConsumerTypeImpl scheduledBatchPollConsumerType = new ScheduledBatchPollConsumerTypeImpl();
        return scheduledBatchPollConsumerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenericFileConsumerType createGenericFileConsumerType() {
        GenericFileConsumerTypeImpl genericFileConsumerType = new GenericFileConsumerTypeImpl();
        return genericFileConsumerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenericFileProducerType createGenericFileProducerType() {
        GenericFileProducerTypeImpl genericFileProducerType = new GenericFileProducerTypeImpl();
        return genericFileProducerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JmsBindingType createJmsBindingType() {
        JmsBindingTypeImpl jmsBindingType = new JmsBindingTypeImpl();
        return jmsBindingType;
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
    public CamelTimerBindingType createCamelTimerBindingType() {
        CamelTimerBindingTypeImpl camelTimerBindingType = new CamelTimerBindingTypeImpl();
        return camelTimerBindingType;
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
    public CamelMockBindingType createCamelMockBindingType() {
        CamelMockBindingTypeImpl camelMockBindingType = new CamelMockBindingTypeImpl();
        return camelMockBindingType;
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
    public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue) {
        TimeUnit result = TimeUnit.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTimeUnitToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeUnit createTimeUnitObjectFromString(EDataType eDataType, String initialValue) {
        return createTimeUnitFromString(CamelPackage.Literals.TIME_UNIT, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTimeUnitObjectToString(EDataType eDataType, Object instanceValue) {
        return convertTimeUnitToString(CamelPackage.Literals.TIME_UNIT, instanceValue);
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
