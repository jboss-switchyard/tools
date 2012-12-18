/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.rules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage
 * @generated
 */
public interface RulesFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	RulesFactory eINSTANCE = org.switchyard.tools.models.switchyard1_0.rules.impl.RulesFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Actions Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Actions Type</em>'.
     * @generated
     */
    ActionsType createActionsType();

    /**
     * Returns a new object of class '<em>Action Type1</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Action Type1</em>'.
     * @generated
     */
	ActionType1 createActionType1();

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
     * Returns a new object of class '<em>Mappings Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mappings Type</em>'.
     * @generated
     */
    MappingsType createMappingsType();

    /**
     * Returns a new object of class '<em>Mapping Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mapping Type</em>'.
     * @generated
     */
    MappingType createMappingType();

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
     * Returns a new object of class '<em>Implementation Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Implementation Type</em>'.
     * @generated
     */
	RulesImplementationType createRulesImplementationType();

	/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	RulesPackage getRulesPackage();

} //RulesFactory
