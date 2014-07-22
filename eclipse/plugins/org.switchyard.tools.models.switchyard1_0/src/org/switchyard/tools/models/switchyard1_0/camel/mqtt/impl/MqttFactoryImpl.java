/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.camel.mqtt.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MqttFactoryImpl extends EFactoryImpl implements MqttFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MqttFactory init() {
        try {
            MqttFactory theMqttFactory = (MqttFactory)EPackage.Registry.INSTANCE.getEFactory(MqttPackage.eNS_URI);
            if (theMqttFactory != null) {
                return theMqttFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new MqttFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MqttFactoryImpl() {
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
            case MqttPackage.ADDITIONAL_URI_PARAMETERS_TYPE: return createAdditionalUriParametersType();
            case MqttPackage.BASE_CAMEL_BINDING: return createBaseCamelBinding();
            case MqttPackage.CAMEL_MQTT_BINDING_TYPE: return createCamelMqttBindingType();
            case MqttPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case MqttPackage.PARAMETER_TYPE: return createParameterType();
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
            case MqttPackage.QUALITY_OF_SERVICE_TYPE:
                return createQualityOfServiceTypeFromString(eDataType, initialValue);
            case MqttPackage.QUALITY_OF_SERVICE_TYPE_OBJECT:
                return createQualityOfServiceTypeObjectFromString(eDataType, initialValue);
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
            case MqttPackage.QUALITY_OF_SERVICE_TYPE:
                return convertQualityOfServiceTypeToString(eDataType, instanceValue);
            case MqttPackage.QUALITY_OF_SERVICE_TYPE_OBJECT:
                return convertQualityOfServiceTypeObjectToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdditionalUriParametersType createAdditionalUriParametersType() {
        AdditionalUriParametersTypeImpl additionalUriParametersType = new AdditionalUriParametersTypeImpl();
        return additionalUriParametersType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BaseCamelBinding createBaseCamelBinding() {
        BaseCamelBindingImpl baseCamelBinding = new BaseCamelBindingImpl();
        return baseCamelBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelMqttBindingType createCamelMqttBindingType() {
        CamelMqttBindingTypeImpl camelMqttBindingType = new CamelMqttBindingTypeImpl();
        return camelMqttBindingType;
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
    public ParameterType createParameterType() {
        ParameterTypeImpl parameterType = new ParameterTypeImpl();
        return parameterType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QualityOfServiceType createQualityOfServiceTypeFromString(EDataType eDataType, String initialValue) {
        QualityOfServiceType result = QualityOfServiceType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertQualityOfServiceTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QualityOfServiceType createQualityOfServiceTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createQualityOfServiceTypeFromString(MqttPackage.Literals.QUALITY_OF_SERVICE_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertQualityOfServiceTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertQualityOfServiceTypeToString(MqttPackage.Literals.QUALITY_OF_SERVICE_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MqttPackage getMqttPackage() {
        return (MqttPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MqttPackage getPackage() {
        return MqttPackage.eINSTANCE;
    }

} //MqttFactoryImpl
