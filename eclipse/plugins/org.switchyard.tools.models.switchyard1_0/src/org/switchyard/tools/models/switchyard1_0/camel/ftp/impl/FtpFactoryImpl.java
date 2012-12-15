/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FtpFactoryImpl extends EFactoryImpl implements FtpFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static FtpFactory init() {
        try {
            FtpFactory theFtpFactory = (FtpFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-camel-ftp:config:1.0"); 
            if (theFtpFactory != null) {
                return theFtpFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new FtpFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FtpFactoryImpl() {
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
            case FtpPackage.CAMEL_FTP_BINDING_TYPE: return createCamelFtpBindingType();
            case FtpPackage.CAMEL_FTPS_BINDING_TYPE: return createCamelFtpsBindingType();
            case FtpPackage.CAMEL_SFTP_BINDING_TYPE: return createCamelSftpBindingType();
            case FtpPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE: return createRemoteFileConsumerType();
            case FtpPackage.REMOTE_FILE_PRODUCER_TYPE: return createRemoteFileProducerType();
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
            case FtpPackage.TIME_UNIT_TYPE:
                return createTimeUnitTypeFromString(eDataType, initialValue);
            case FtpPackage.TIME_UNIT_TYPE_OBJECT:
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
            case FtpPackage.TIME_UNIT_TYPE:
                return convertTimeUnitTypeToString(eDataType, instanceValue);
            case FtpPackage.TIME_UNIT_TYPE_OBJECT:
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
    public CamelFtpBindingType createCamelFtpBindingType() {
        CamelFtpBindingTypeImpl camelFtpBindingType = new CamelFtpBindingTypeImpl();
        return camelFtpBindingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelFtpsBindingType createCamelFtpsBindingType() {
        CamelFtpsBindingTypeImpl camelFtpsBindingType = new CamelFtpsBindingTypeImpl();
        return camelFtpsBindingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSftpBindingType createCamelSftpBindingType() {
        CamelSftpBindingTypeImpl camelSftpBindingType = new CamelSftpBindingTypeImpl();
        return camelSftpBindingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RemoteFileConsumerType createRemoteFileConsumerType() {
        RemoteFileConsumerTypeImpl remoteFileConsumerType = new RemoteFileConsumerTypeImpl();
        return remoteFileConsumerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RemoteFileProducerType createRemoteFileProducerType() {
        RemoteFileProducerTypeImpl remoteFileProducerType = new RemoteFileProducerTypeImpl();
        return remoteFileProducerType;
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
        return createTimeUnitTypeFromString(FtpPackage.Literals.TIME_UNIT_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTimeUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertTimeUnitTypeToString(FtpPackage.Literals.TIME_UNIT_TYPE, instanceValue);
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
    public FtpPackage getFtpPackage() {
        return (FtpPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static FtpPackage getPackage() {
        return FtpPackage.eINSTANCE;
    }

} //FtpFactoryImpl
