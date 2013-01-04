/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.mail.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.camel.mail.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MailFactoryImpl extends EFactoryImpl implements MailFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MailFactory init() {
        try {
            MailFactory theMailFactory = (MailFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-camel-mail:config:1.0"); 
            if (theMailFactory != null) {
                return theMailFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new MailFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MailFactoryImpl() {
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
            case MailPackage.BASE_CAMEL_BINDING: return createBaseCamelBinding();
            case MailPackage.CAMEL_MAIL_BINDING_TYPE: return createCamelMailBindingType();
            case MailPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE: return createCamelMailConsumerType();
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE: return createCamelMailProducerType();
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
            case MailPackage.MAIL_CONSUMER_ACCOUNT_TYPE:
                return createMailConsumerAccountTypeFromString(eDataType, initialValue);
            case MailPackage.TIME_UNIT_TYPE:
                return createTimeUnitTypeFromString(eDataType, initialValue);
            case MailPackage.MAIL_CONSUMER_ACCOUNT_TYPE_OBJECT:
                return createMailConsumerAccountTypeObjectFromString(eDataType, initialValue);
            case MailPackage.TIME_UNIT_TYPE_OBJECT:
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
            case MailPackage.MAIL_CONSUMER_ACCOUNT_TYPE:
                return convertMailConsumerAccountTypeToString(eDataType, instanceValue);
            case MailPackage.TIME_UNIT_TYPE:
                return convertTimeUnitTypeToString(eDataType, instanceValue);
            case MailPackage.MAIL_CONSUMER_ACCOUNT_TYPE_OBJECT:
                return convertMailConsumerAccountTypeObjectToString(eDataType, instanceValue);
            case MailPackage.TIME_UNIT_TYPE_OBJECT:
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
    public BaseCamelBinding createBaseCamelBinding() {
        BaseCamelBindingImpl baseCamelBinding = new BaseCamelBindingImpl();
        return baseCamelBinding;
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
    public CamelMailConsumerType createCamelMailConsumerType() {
        CamelMailConsumerTypeImpl camelMailConsumerType = new CamelMailConsumerTypeImpl();
        return camelMailConsumerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelMailProducerType createCamelMailProducerType() {
        CamelMailProducerTypeImpl camelMailProducerType = new CamelMailProducerTypeImpl();
        return camelMailProducerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelMailBindingType createCamelMailBindingType() {
        CamelMailBindingTypeImpl camelMailBindingType = new CamelMailBindingTypeImpl();
        return camelMailBindingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MailConsumerAccountType createMailConsumerAccountTypeFromString(EDataType eDataType, String initialValue) {
        MailConsumerAccountType result = MailConsumerAccountType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMailConsumerAccountTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
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
    public MailConsumerAccountType createMailConsumerAccountTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createMailConsumerAccountTypeFromString(MailPackage.Literals.MAIL_CONSUMER_ACCOUNT_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMailConsumerAccountTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertMailConsumerAccountTypeToString(MailPackage.Literals.MAIL_CONSUMER_ACCOUNT_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeUnitType createTimeUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createTimeUnitTypeFromString(MailPackage.Literals.TIME_UNIT_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTimeUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertTimeUnitTypeToString(MailPackage.Literals.TIME_UNIT_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MailPackage getMailPackage() {
        return (MailPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MailPackage getPackage() {
        return MailPackage.eINSTANCE;
    }

} //MailFactoryImpl
