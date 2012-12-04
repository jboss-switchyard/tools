/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
            case CamelPackage.CAMEL_BINDING_TYPE: return createCamelBindingType();
            case CamelPackage.CAMEL_FILE_BINDING_TYPE: return createCamelFileBindingType();
            case CamelPackage.CAMEL_FTP_BINDING_TYPE: return createCamelFtpBindingType();
            case CamelPackage.CAMEL_FTPS_BINDING_TYPE: return createCamelFtpsBindingType();
            case CamelPackage.CAMEL_SFTP_BINDING_TYPE: return createCamelSftpBindingType();
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE: return createCamelAtomBindingType();
            case CamelPackage.CAMEL_DIRECT_BINDING_TYPE: return createCamelDirectBindingType();
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE: return createCamelTimerBindingType();
            case CamelPackage.CAMEL_SEDA_BINDING_TYPE: return createCamelSedaBindingType();
            case CamelPackage.CAMEL_MOCK_BINDING_TYPE: return createCamelMockBindingType();
            case CamelPackage.CAMEL_NETTY_TCP_BINDING_TYPE: return createCamelNettyTcpBindingType();
            case CamelPackage.CAMEL_NETTY_UDP_BINDING_TYPE: return createCamelNettyUdpBindingType();
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE: return createCamelQuartzBindingType();
            case CamelPackage.CAMEL_JMS_BINDING_TYPE: return createCamelJmsBindingType();
            case CamelPackage.CAMEL_SQL_BINDING_TYPE: return createCamelSqlBindingType();
            case CamelPackage.JAVA_DSL_TYPE: return createJavaDSLType();
            case CamelPackage.XMLDSL_TYPE: return createXMLDSLType();
            case CamelPackage.CAMEL_IMPLEMENTATION_TYPE: return createCamelImplementationType();
            case CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE: return createScheduledPollConsumerType();
            case CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE: return createScheduledBatchPollConsumerType();
            case CamelPackage.FILE_CONSUMER_TYPE: return createFileConsumerType();
            case CamelPackage.FILE_PRODUCER_TYPE: return createFileProducerType();
            case CamelPackage.REMOTE_FILE_CONSUMER_TYPE: return createRemoteFileConsumerType();
            case CamelPackage.REMOTE_FILE_PRODUCER_TYPE: return createRemoteFileProducerType();
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE: return createGenericFileConsumerType();
            case CamelPackage.GENERIC_FILE_PRODUCER_TYPE: return createGenericFileProducerType();
            case CamelPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case CamelPackage.CAMEL_CONTEXT_MAPPER_TYPE: return createCamelContextMapperType();
            case CamelPackage.CAMEL_MESSAGE_COMPOSER_TYPE: return createCamelMessageComposerType();
            case CamelPackage.CAMEL_MAIL_CONSUMER_TYPE: return createCamelMailConsumerType();
            case CamelPackage.CAMEL_MAIL_PRODUCER_TYPE: return createCamelMailProducerType();
            case CamelPackage.CAMEL_MAIL_BINDING_TYPE: return createCamelMailBindingType();
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
            case CamelPackage.MAIL_CONSUMER_ACCOUNT_TYPE:
                return createMailConsumerAccountTypeFromString(eDataType, initialValue);
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
            case CamelPackage.MAIL_CONSUMER_ACCOUNT_TYPE:
                return convertMailConsumerAccountTypeToString(eDataType, instanceValue);
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
     * @generated NOT
     */
	public CamelFileBindingType createCamelFileBindingType() {
        CamelFileBindingTypeImpl camelFileBindingType = new CamelFileBindingTypeImpl();
        camelFileBindingType.setDirectory("my/directory");
        return camelFileBindingType;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public CamelFtpBindingType createCamelFtpBindingType() {
        CamelFtpBindingTypeImpl camelFtpBindingType = new CamelFtpBindingTypeImpl();
        camelFtpBindingType.setDirectory("my/directory");
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
	public CamelImplementationType createCamelImplementationType() {
        CamelImplementationTypeImpl camelImplementationType = new CamelImplementationTypeImpl();
        return camelImplementationType;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelJmsBindingType createCamelJmsBindingType() {
        CamelJmsBindingTypeImpl camelJmsBindingType = new CamelJmsBindingTypeImpl();
        return camelJmsBindingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelNettyUdpBindingType createCamelNettyUdpBindingType() {
        CamelNettyUdpBindingTypeImpl camelNettyUdpBindingType = new CamelNettyUdpBindingTypeImpl();
        return camelNettyUdpBindingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelNettyTcpBindingType createCamelNettyTcpBindingType() {
        CamelNettyTcpBindingTypeImpl camelNettyTcpBindingType = new CamelNettyTcpBindingTypeImpl();
        return camelNettyTcpBindingType;
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
    public CamelSftpBindingType createCamelSftpBindingType() {
        CamelSftpBindingTypeImpl camelSftpBindingType = new CamelSftpBindingTypeImpl();
        return camelSftpBindingType;
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
    public CamelContextMapperType createCamelContextMapperType() {
        CamelContextMapperTypeImpl camelContextMapperType = new CamelContextMapperTypeImpl();
        return camelContextMapperType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelMessageComposerType createCamelMessageComposerType() {
        CamelMessageComposerTypeImpl camelMessageComposerType = new CamelMessageComposerTypeImpl();
        return camelMessageComposerType;
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
    public XMLDSLType createXMLDSLType() {
        XMLDSLTypeImpl xmldslType = new XMLDSLTypeImpl();
        return xmldslType;
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
    public CamelQuartzBindingType createCamelQuartzBindingType() {
        CamelQuartzBindingTypeImpl camelQuartzBindingType = new CamelQuartzBindingTypeImpl();
        return camelQuartzBindingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelSqlBindingType createCamelSqlBindingType() {
        CamelSqlBindingTypeImpl camelSqlBindingType = new CamelSqlBindingTypeImpl();
        return camelSqlBindingType;
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
