/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.bpm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMFactoryImpl extends EFactoryImpl implements BPMFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static BPMFactory init() {
        try {
            BPMFactory theBPMFactory = (BPMFactory)EPackage.Registry.INSTANCE.getEFactory(BPMPackage.eNS_URI);
            if (theBPMFactory != null) {
                return theBPMFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new BPMFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BPMFactoryImpl() {
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
            case BPMPackage.BPM_IMPLEMENTATION_TYPE: return createBPMImplementationType();
            case BPMPackage.CHANNELS_TYPE: return createChannelsType();
            case BPMPackage.CHANNEL_TYPE: return createChannelType();
            case BPMPackage.CONTAINER_TYPE: return createContainerType();
            case BPMPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case BPMPackage.EXTRA_JAXB_CLASSES_TYPE: return createExtraJaxbClassesType();
            case BPMPackage.FAULTS_TYPE: return createFaultsType();
            case BPMPackage.GLOBALS_TYPE: return createGlobalsType();
            case BPMPackage.INPUTS_TYPE: return createInputsType();
            case BPMPackage.LISTENERS_TYPE: return createListenersType();
            case BPMPackage.LISTENER_TYPE: return createListenerType();
            case BPMPackage.LOGGERS_TYPE: return createLoggersType();
            case BPMPackage.LOGGER_TYPE1: return createLoggerType1();
            case BPMPackage.MANIFEST_TYPE: return createManifestType();
            case BPMPackage.MAPPING_TYPE: return createMappingType();
            case BPMPackage.OPERATIONS_TYPE: return createOperationsType();
            case BPMPackage.BPM_OPERATION_TYPE: return createBPMOperationType();
            case BPMPackage.OUTPUTS_TYPE: return createOutputsType();
            case BPMPackage.PROPERTIES_TYPE: return createPropertiesType();
            case BPMPackage.PROPERTY_TYPE: return createPropertyType();
            case BPMPackage.REMOTE_JMS_TYPE: return createRemoteJmsType();
            case BPMPackage.REMOTE_REST_TYPE: return createRemoteRestType();
            case BPMPackage.RESOURCE_DETAIL_TYPE: return createResourceDetailType();
            case BPMPackage.RESOURCES_TYPE: return createResourcesType();
            case BPMPackage.RESOURCE_TYPE: return createResourceType();
            case BPMPackage.USER_GROUP_CALLBACK_TYPE: return createUserGroupCallbackType();
            case BPMPackage.WORK_ITEM_HANDLERS_TYPE: return createWorkItemHandlersType();
            case BPMPackage.WORK_ITEM_HANDLER_TYPE: return createWorkItemHandlerType();
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
            case BPMPackage.LOGGER_TYPE:
                return createLoggerTypeFromString(eDataType, initialValue);
            case BPMPackage.OPERATION_TYPE:
                return createOperationTypeFromString(eDataType, initialValue);
            case BPMPackage.LOGGER_TYPE_OBJECT:
                return createLoggerTypeObjectFromString(eDataType, initialValue);
            case BPMPackage.OPERATION_TYPE_OBJECT:
                return createOperationTypeObjectFromString(eDataType, initialValue);
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
            case BPMPackage.LOGGER_TYPE:
                return convertLoggerTypeToString(eDataType, instanceValue);
            case BPMPackage.OPERATION_TYPE:
                return convertOperationTypeToString(eDataType, instanceValue);
            case BPMPackage.LOGGER_TYPE_OBJECT:
                return convertLoggerTypeObjectToString(eDataType, instanceValue);
            case BPMPackage.OPERATION_TYPE_OBJECT:
                return convertOperationTypeObjectToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationsType createOperationsType() {
        OperationsTypeImpl operationsType = new OperationsTypeImpl();
        return operationsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BPMOperationType createBPMOperationType() {
        BPMOperationTypeImpl bpmOperationType = new BPMOperationTypeImpl();
        return bpmOperationType;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BPMImplementationType createBPMImplementationType() {
        BPMImplementationTypeImpl bpmImplementationType = new BPMImplementationTypeImpl();
        return bpmImplementationType;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChannelsType createChannelsType() {
        ChannelsTypeImpl channelsType = new ChannelsTypeImpl();
        return channelsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChannelType createChannelType() {
        ChannelTypeImpl channelType = new ChannelTypeImpl();
        return channelType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContainerType createContainerType() {
        ContainerTypeImpl containerType = new ContainerTypeImpl();
        return containerType;
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
    public ExtraJaxbClassesType createExtraJaxbClassesType() {
        ExtraJaxbClassesTypeImpl extraJaxbClassesType = new ExtraJaxbClassesTypeImpl();
        return extraJaxbClassesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalsType createGlobalsType() {
        GlobalsTypeImpl globalsType = new GlobalsTypeImpl();
        return globalsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputsType createInputsType() {
        InputsTypeImpl inputsType = new InputsTypeImpl();
        return inputsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ListenersType createListenersType() {
        ListenersTypeImpl listenersType = new ListenersTypeImpl();
        return listenersType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ListenerType createListenerType() {
        ListenerTypeImpl listenerType = new ListenerTypeImpl();
        return listenerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoggersType createLoggersType() {
        LoggersTypeImpl loggersType = new LoggersTypeImpl();
        return loggersType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoggerType1 createLoggerType1() {
        LoggerType1Impl loggerType1 = new LoggerType1Impl();
        return loggerType1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ManifestType createManifestType() {
        ManifestTypeImpl manifestType = new ManifestTypeImpl();
        return manifestType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MappingType createMappingType() {
        MappingTypeImpl mappingType = new MappingTypeImpl();
        return mappingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputsType createOutputsType() {
        OutputsTypeImpl outputsType = new OutputsTypeImpl();
        return outputsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertiesType createPropertiesType() {
        PropertiesTypeImpl propertiesType = new PropertiesTypeImpl();
        return propertiesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertyType createPropertyType() {
        PropertyTypeImpl propertyType = new PropertyTypeImpl();
        return propertyType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RemoteJmsType createRemoteJmsType() {
        RemoteJmsTypeImpl remoteJmsType = new RemoteJmsTypeImpl();
        return remoteJmsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RemoteRestType createRemoteRestType() {
        RemoteRestTypeImpl remoteRestType = new RemoteRestTypeImpl();
        return remoteRestType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceDetailType createResourceDetailType() {
        ResourceDetailTypeImpl resourceDetailType = new ResourceDetailTypeImpl();
        return resourceDetailType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourcesType createResourcesType() {
        ResourcesTypeImpl resourcesType = new ResourcesTypeImpl();
        return resourcesType;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResourceType createResourceType() {
        ResourceTypeImpl resourceType = new ResourceTypeImpl();
        return resourceType;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkItemHandlersType createWorkItemHandlersType() {
        WorkItemHandlersTypeImpl workItemHandlersType = new WorkItemHandlersTypeImpl();
        return workItemHandlersType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkItemHandlerType createWorkItemHandlerType() {
        WorkItemHandlerTypeImpl workItemHandlerType = new WorkItemHandlerTypeImpl();
        return workItemHandlerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UserGroupCallbackType createUserGroupCallbackType() {
        UserGroupCallbackTypeImpl userGroupCallbackType = new UserGroupCallbackTypeImpl();
        return userGroupCallbackType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FaultsType createFaultsType() {
        FaultsTypeImpl faultsType = new FaultsTypeImpl();
        return faultsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationType createOperationTypeFromString(EDataType eDataType, String initialValue) {
        OperationType result = OperationType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertOperationTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoggerType createLoggerTypeFromString(EDataType eDataType, String initialValue) {
        LoggerType result = LoggerType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertLoggerTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationType createOperationTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createOperationTypeFromString(BPMPackage.Literals.OPERATION_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertOperationTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertOperationTypeToString(BPMPackage.Literals.OPERATION_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoggerType createLoggerTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createLoggerTypeFromString(BPMPackage.Literals.LOGGER_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertLoggerTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertLoggerTypeToString(BPMPackage.Literals.LOGGER_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BPMPackage getBPMPackage() {
        return (BPMPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static BPMPackage getPackage() {
        return BPMPackage.eINSTANCE;
    }

} //BPMFactoryImpl
