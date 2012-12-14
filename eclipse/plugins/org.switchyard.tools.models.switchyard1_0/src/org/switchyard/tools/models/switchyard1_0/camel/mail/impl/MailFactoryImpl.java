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
            case MailPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case MailPackage.CAMEL_MAIL_CONSUMER_TYPE: return createCamelMailConsumerType();
            case MailPackage.CAMEL_MAIL_PRODUCER_TYPE: return createCamelMailProducerType();
            case MailPackage.CAMEL_MAIL_BINDING_TYPE: return createCamelMailBindingType();
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
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
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
