/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage
 * @generated
 */
public interface BPMFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	BPMFactory eINSTANCE = org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Operations Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operations Type</em>'.
     * @generated
     */
    OperationsType createOperationsType();

    /**
     * Returns a new object of class '<em>Operation Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operation Type</em>'.
     * @generated
     */
    BPMOperationType createBPMOperationType();

    /**
     * Returns a new object of class '<em>Implementation Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Implementation Type</em>'.
     * @generated
     */
	BPMImplementationType createBPMImplementationType();

	/**
     * Returns a new object of class '<em>Channels Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Channels Type</em>'.
     * @generated
     */
    ChannelsType createChannelsType();

    /**
     * Returns a new object of class '<em>Channel Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Channel Type</em>'.
     * @generated
     */
    ChannelType createChannelType();

    /**
     * Returns a new object of class '<em>Container Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Container Type</em>'.
     * @generated
     */
    ContainerType createContainerType();

    /**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
	DocumentRoot createDocumentRoot();

	/**
     * Returns a new object of class '<em>Extra Jaxb Classes Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Extra Jaxb Classes Type</em>'.
     * @generated
     */
    ExtraJaxbClassesType createExtraJaxbClassesType();

    /**
     * Returns a new object of class '<em>Globals Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Globals Type</em>'.
     * @generated
     */
    GlobalsType createGlobalsType();

    /**
     * Returns a new object of class '<em>Inputs Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Inputs Type</em>'.
     * @generated
     */
    InputsType createInputsType();

    /**
     * Returns a new object of class '<em>Listeners Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Listeners Type</em>'.
     * @generated
     */
    ListenersType createListenersType();

    /**
     * Returns a new object of class '<em>Listener Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Listener Type</em>'.
     * @generated
     */
    ListenerType createListenerType();

    /**
     * Returns a new object of class '<em>Loggers Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Loggers Type</em>'.
     * @generated
     */
    LoggersType createLoggersType();

    /**
     * Returns a new object of class '<em>Logger Type1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Logger Type1</em>'.
     * @generated
     */
    LoggerType1 createLoggerType1();

    /**
     * Returns a new object of class '<em>Manifest Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Manifest Type</em>'.
     * @generated
     */
    ManifestType createManifestType();

    /**
     * Returns a new object of class '<em>Mapping Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mapping Type</em>'.
     * @generated
     */
    MappingType createMappingType();

    /**
     * Returns a new object of class '<em>Outputs Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Outputs Type</em>'.
     * @generated
     */
    OutputsType createOutputsType();

    /**
     * Returns a new object of class '<em>Properties Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Properties Type</em>'.
     * @generated
     */
    PropertiesType createPropertiesType();

    /**
     * Returns a new object of class '<em>Property Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property Type</em>'.
     * @generated
     */
    PropertyType createPropertyType();

    /**
     * Returns a new object of class '<em>Remote Jms Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Remote Jms Type</em>'.
     * @generated
     */
    RemoteJmsType createRemoteJmsType();

    /**
     * Returns a new object of class '<em>Remote Rest Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Remote Rest Type</em>'.
     * @generated
     */
    RemoteRestType createRemoteRestType();

    /**
     * Returns a new object of class '<em>Resource Detail Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Resource Detail Type</em>'.
     * @generated
     */
    ResourceDetailType createResourceDetailType();

    /**
     * Returns a new object of class '<em>Resources Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Resources Type</em>'.
     * @generated
     */
    ResourcesType createResourcesType();

    /**
     * Returns a new object of class '<em>Resource Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Resource Type</em>'.
     * @generated
     */
	ResourceType createResourceType();

	/**
     * Returns a new object of class '<em>Work Item Handlers Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Work Item Handlers Type</em>'.
     * @generated
     */
    WorkItemHandlersType createWorkItemHandlersType();

    /**
     * Returns a new object of class '<em>Work Item Handler Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Work Item Handler Type</em>'.
     * @generated
     */
    WorkItemHandlerType createWorkItemHandlerType();

    /**
     * Returns a new object of class '<em>User Group Callback Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>User Group Callback Type</em>'.
     * @generated
     */
    UserGroupCallbackType createUserGroupCallbackType();

    /**
     * Returns a new object of class '<em>Faults Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Faults Type</em>'.
     * @generated
     */
    FaultsType createFaultsType();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	BPMPackage getBPMPackage();

} //BPMFactory
