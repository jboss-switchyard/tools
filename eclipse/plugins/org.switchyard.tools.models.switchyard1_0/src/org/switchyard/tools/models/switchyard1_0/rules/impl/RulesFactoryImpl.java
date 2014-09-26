/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.rules.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.rules.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesFactoryImpl extends EFactoryImpl implements RulesFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static RulesFactory init() {
        try {
            RulesFactory theRulesFactory = (RulesFactory)EPackage.Registry.INSTANCE.getEFactory(RulesPackage.eNS_URI);
            if (theRulesFactory != null) {
                return theRulesFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new RulesFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RulesFactoryImpl() {
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
            case RulesPackage.OPERATIONS_TYPE: return createOperationsType();
            case RulesPackage.RULES_OPERATION_TYPE: return createRulesOperationType();
            case RulesPackage.CHANNELS_TYPE: return createChannelsType();
            case RulesPackage.CHANNEL_TYPE: return createChannelType();
            case RulesPackage.CONTAINER_TYPE: return createContainerType();
            case RulesPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case RulesPackage.GLOBALS_TYPE: return createGlobalsType();
            case RulesPackage.INPUT_MAPPING_TYPE: return createInputMappingType();
            case RulesPackage.INPUTS_TYPE: return createInputsType();
            case RulesPackage.LISTENERS_TYPE: return createListenersType();
            case RulesPackage.LISTENER_TYPE: return createListenerType();
            case RulesPackage.LOGGERS_TYPE: return createLoggersType();
            case RulesPackage.LOGGER_TYPE1: return createLoggerType1();
            case RulesPackage.MANIFEST_TYPE: return createManifestType();
            case RulesPackage.MAPPING_TYPE: return createMappingType();
            case RulesPackage.OUTPUTS_TYPE: return createOutputsType();
            case RulesPackage.PROPERTIES_TYPE: return createPropertiesType();
            case RulesPackage.PROPERTY_TYPE: return createPropertyType();
            case RulesPackage.RESOURCE_DETAIL_TYPE: return createResourceDetailType();
            case RulesPackage.RESOURCES_TYPE: return createResourcesType();
            case RulesPackage.RESOURCE_TYPE: return createResourceType();
            case RulesPackage.RULES_IMPLEMENTATION_TYPE: return createRulesImplementationType();
            case RulesPackage.FAULTS_TYPE: return createFaultsType();
            case RulesPackage.REMOTE_JMS_TYPE: return createRemoteJmsType();
            case RulesPackage.REMOTE_REST_TYPE: return createRemoteRestType();
            case RulesPackage.EXTRA_JAXB_CLASSES_TYPE: return createExtraJaxbClassesType();
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
            case RulesPackage.OPERATION_TYPE:
                return createOperationTypeFromString(eDataType, initialValue);
            case RulesPackage.EXPRESSION_TYPE:
                return createExpressionTypeFromString(eDataType, initialValue);
            case RulesPackage.LOGGER_TYPE:
                return createLoggerTypeFromString(eDataType, initialValue);
            case RulesPackage.SCOPE_TYPE:
                return createScopeTypeFromString(eDataType, initialValue);
            case RulesPackage.OPERATION_TYPE_OBJECT:
                return createOperationTypeObjectFromString(eDataType, initialValue);
            case RulesPackage.EXPRESSION_TYPE_OBJECT:
                return createExpressionTypeObjectFromString(eDataType, initialValue);
            case RulesPackage.LOGGER_TYPE_OBJECT:
                return createLoggerTypeObjectFromString(eDataType, initialValue);
            case RulesPackage.SCOPE_TYPE_OBJECT:
                return createScopeTypeObjectFromString(eDataType, initialValue);
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
            case RulesPackage.OPERATION_TYPE:
                return convertOperationTypeToString(eDataType, instanceValue);
            case RulesPackage.EXPRESSION_TYPE:
                return convertExpressionTypeToString(eDataType, instanceValue);
            case RulesPackage.LOGGER_TYPE:
                return convertLoggerTypeToString(eDataType, instanceValue);
            case RulesPackage.SCOPE_TYPE:
                return convertScopeTypeToString(eDataType, instanceValue);
            case RulesPackage.OPERATION_TYPE_OBJECT:
                return convertOperationTypeObjectToString(eDataType, instanceValue);
            case RulesPackage.EXPRESSION_TYPE_OBJECT:
                return convertExpressionTypeObjectToString(eDataType, instanceValue);
            case RulesPackage.LOGGER_TYPE_OBJECT:
                return convertLoggerTypeObjectToString(eDataType, instanceValue);
            case RulesPackage.SCOPE_TYPE_OBJECT:
                return convertScopeTypeObjectToString(eDataType, instanceValue);
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
    public RulesOperationType createRulesOperationType() {
        RulesOperationTypeImpl rulesOperationType = new RulesOperationTypeImpl();
        return rulesOperationType;
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
    public GlobalsType createGlobalsType() {
        GlobalsTypeImpl globalsType = new GlobalsTypeImpl();
        return globalsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputMappingType createInputMappingType() {
        InputMappingTypeImpl inputMappingType = new InputMappingTypeImpl();
        return inputMappingType;
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
	public RulesImplementationType createRulesImplementationType() {
        RulesImplementationTypeImpl rulesImplementationType = new RulesImplementationTypeImpl();
        return rulesImplementationType;
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
    public ExtraJaxbClassesType createExtraJaxbClassesType() {
        ExtraJaxbClassesTypeImpl extraJaxbClassesType = new ExtraJaxbClassesTypeImpl();
        return extraJaxbClassesType;
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
    public ExpressionType createExpressionTypeFromString(EDataType eDataType, String initialValue) {
        ExpressionType result = ExpressionType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExpressionTypeToString(EDataType eDataType, Object instanceValue) {
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
    public ScopeType createScopeTypeFromString(EDataType eDataType, String initialValue) {
        ScopeType result = ScopeType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertScopeTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationType createOperationTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createOperationTypeFromString(RulesPackage.Literals.OPERATION_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertOperationTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertOperationTypeToString(RulesPackage.Literals.OPERATION_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExpressionType createExpressionTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createExpressionTypeFromString(RulesPackage.Literals.EXPRESSION_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExpressionTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertExpressionTypeToString(RulesPackage.Literals.EXPRESSION_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoggerType createLoggerTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createLoggerTypeFromString(RulesPackage.Literals.LOGGER_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertLoggerTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertLoggerTypeToString(RulesPackage.Literals.LOGGER_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScopeType createScopeTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createScopeTypeFromString(RulesPackage.Literals.SCOPE_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertScopeTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertScopeTypeToString(RulesPackage.Literals.SCOPE_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RulesPackage getRulesPackage() {
        return (RulesPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static RulesPackage getPackage() {
        return RulesPackage.eINSTANCE;
    }

} //RulesFactoryImpl
