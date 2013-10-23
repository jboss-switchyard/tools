/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.file.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.camel.file.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FileFactoryImpl extends EFactoryImpl implements FileFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static FileFactory init() {
        try {
            FileFactory theFileFactory = (FileFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-camel-file:config:1.0"); 
            if (theFileFactory != null) {
                return theFileFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new FileFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FileFactoryImpl() {
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
            case FilePackage.ADDITIONAL_URI_PARAMETERS_TYPE: return createAdditionalUriParametersType();
            case FilePackage.BASE_CAMEL_BINDING: return createBaseCamelBinding();
            case FilePackage.CAMEL_FILE_BINDING_TYPE: return createCamelFileBindingType();
            case FilePackage.DOCUMENT_ROOT: return createDocumentRoot();
            case FilePackage.FILE_CONSUMER_TYPE: return createFileConsumerType();
            case FilePackage.FILE_PRODUCER_TYPE: return createFileProducerType();
            case FilePackage.PARAMETER_TYPE: return createParameterType();
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
            case FilePackage.TIME_UNIT_TYPE:
                return createTimeUnitTypeFromString(eDataType, initialValue);
            case FilePackage.TIME_UNIT_TYPE_OBJECT:
                return createTimeUnitTypeObjectFromString(eDataType, initialValue);
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
            case FilePackage.TIME_UNIT_TYPE:
                return convertTimeUnitTypeToString(eDataType, instanceValue);
            case FilePackage.TIME_UNIT_TYPE_OBJECT:
                return convertTimeUnitTypeObjectToString(eDataType, instanceValue);
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
    public CamelFileBindingType createCamelFileBindingType() {
        CamelFileBindingTypeImpl camelFileBindingType = new CamelFileBindingTypeImpl();
        return camelFileBindingType;
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
    public ParameterType createParameterType() {
        ParameterTypeImpl parameterType = new ParameterTypeImpl();
        return parameterType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeUnitType createTimeUnitTypeFromString(EDataType eDataType, String initialValue) {
        TimeUnitType result = TimeUnitType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTimeUnitTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeUnitType createTimeUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createTimeUnitTypeFromString(FilePackage.Literals.TIME_UNIT_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTimeUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertTimeUnitTypeToString(FilePackage.Literals.TIME_UNIT_TYPE, instanceValue);
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
    public FilePackage getFilePackage() {
        return (FilePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static FilePackage getPackage() {
        return FilePackage.eINSTANCE;
    }

} //FileFactoryImpl
