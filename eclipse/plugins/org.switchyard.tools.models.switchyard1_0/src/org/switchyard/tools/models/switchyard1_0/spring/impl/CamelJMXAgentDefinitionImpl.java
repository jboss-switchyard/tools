/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ManagementStatisticsLevel;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel JMX Agent Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelJMXAgentDefinitionImpl#getConnectorPort <em>Connector Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelJMXAgentDefinitionImpl#getCreateConnector <em>Create Connector</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelJMXAgentDefinitionImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelJMXAgentDefinitionImpl#getMbeanObjectDomainName <em>Mbean Object Domain Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelJMXAgentDefinitionImpl#getMbeanServerDefaultDomain <em>Mbean Server Default Domain</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelJMXAgentDefinitionImpl#getOnlyRegisterProcessorWithCustomId <em>Only Register Processor With Custom Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelJMXAgentDefinitionImpl#getRegisterAlways <em>Register Always</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelJMXAgentDefinitionImpl#getRegisterNewRoutes <em>Register New Routes</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelJMXAgentDefinitionImpl#getRegistryPort <em>Registry Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelJMXAgentDefinitionImpl#getServiceUrlPath <em>Service Url Path</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelJMXAgentDefinitionImpl#getStatisticsLevel <em>Statistics Level</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelJMXAgentDefinitionImpl#getUsePlatformMBeanServer <em>Use Platform MBean Server</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelJMXAgentDefinitionImpl extends IdentifiedTypeImpl implements CamelJMXAgentDefinition {
	/**
     * The default value of the '{@link #getConnectorPort() <em>Connector Port</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getConnectorPort()
     * @generated
     * @ordered
     */
	protected static final String CONNECTOR_PORT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getConnectorPort() <em>Connector Port</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getConnectorPort()
     * @generated
     * @ordered
     */
	protected String connectorPort = CONNECTOR_PORT_EDEFAULT;

	/**
     * The default value of the '{@link #getCreateConnector() <em>Create Connector</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCreateConnector()
     * @generated
     * @ordered
     */
	protected static final String CREATE_CONNECTOR_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getCreateConnector() <em>Create Connector</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCreateConnector()
     * @generated
     * @ordered
     */
	protected String createConnector = CREATE_CONNECTOR_EDEFAULT;

	/**
     * The default value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDisabled()
     * @generated
     * @ordered
     */
	protected static final String DISABLED_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDisabled()
     * @generated
     * @ordered
     */
	protected String disabled = DISABLED_EDEFAULT;

	/**
     * The default value of the '{@link #getMbeanObjectDomainName() <em>Mbean Object Domain Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMbeanObjectDomainName()
     * @generated
     * @ordered
     */
	protected static final String MBEAN_OBJECT_DOMAIN_NAME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMbeanObjectDomainName() <em>Mbean Object Domain Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMbeanObjectDomainName()
     * @generated
     * @ordered
     */
	protected String mbeanObjectDomainName = MBEAN_OBJECT_DOMAIN_NAME_EDEFAULT;

	/**
     * The default value of the '{@link #getMbeanServerDefaultDomain() <em>Mbean Server Default Domain</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMbeanServerDefaultDomain()
     * @generated
     * @ordered
     */
	protected static final String MBEAN_SERVER_DEFAULT_DOMAIN_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMbeanServerDefaultDomain() <em>Mbean Server Default Domain</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMbeanServerDefaultDomain()
     * @generated
     * @ordered
     */
	protected String mbeanServerDefaultDomain = MBEAN_SERVER_DEFAULT_DOMAIN_EDEFAULT;

	/**
     * The default value of the '{@link #getOnlyRegisterProcessorWithCustomId() <em>Only Register Processor With Custom Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOnlyRegisterProcessorWithCustomId()
     * @generated
     * @ordered
     */
	protected static final String ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getOnlyRegisterProcessorWithCustomId() <em>Only Register Processor With Custom Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOnlyRegisterProcessorWithCustomId()
     * @generated
     * @ordered
     */
	protected String onlyRegisterProcessorWithCustomId = ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID_EDEFAULT;

	/**
     * The default value of the '{@link #getRegisterAlways() <em>Register Always</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRegisterAlways()
     * @generated
     * @ordered
     */
	protected static final String REGISTER_ALWAYS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRegisterAlways() <em>Register Always</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRegisterAlways()
     * @generated
     * @ordered
     */
	protected String registerAlways = REGISTER_ALWAYS_EDEFAULT;

	/**
     * The default value of the '{@link #getRegisterNewRoutes() <em>Register New Routes</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRegisterNewRoutes()
     * @generated
     * @ordered
     */
	protected static final String REGISTER_NEW_ROUTES_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRegisterNewRoutes() <em>Register New Routes</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRegisterNewRoutes()
     * @generated
     * @ordered
     */
	protected String registerNewRoutes = REGISTER_NEW_ROUTES_EDEFAULT;

	/**
     * The default value of the '{@link #getRegistryPort() <em>Registry Port</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRegistryPort()
     * @generated
     * @ordered
     */
	protected static final String REGISTRY_PORT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRegistryPort() <em>Registry Port</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRegistryPort()
     * @generated
     * @ordered
     */
	protected String registryPort = REGISTRY_PORT_EDEFAULT;

	/**
     * The default value of the '{@link #getServiceUrlPath() <em>Service Url Path</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getServiceUrlPath()
     * @generated
     * @ordered
     */
	protected static final String SERVICE_URL_PATH_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getServiceUrlPath() <em>Service Url Path</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getServiceUrlPath()
     * @generated
     * @ordered
     */
	protected String serviceUrlPath = SERVICE_URL_PATH_EDEFAULT;

	/**
     * The default value of the '{@link #getStatisticsLevel() <em>Statistics Level</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStatisticsLevel()
     * @generated
     * @ordered
     */
	protected static final ManagementStatisticsLevel STATISTICS_LEVEL_EDEFAULT = ManagementStatisticsLevel.ALL;

	/**
     * The cached value of the '{@link #getStatisticsLevel() <em>Statistics Level</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStatisticsLevel()
     * @generated
     * @ordered
     */
	protected ManagementStatisticsLevel statisticsLevel = STATISTICS_LEVEL_EDEFAULT;

	/**
     * This is true if the Statistics Level attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean statisticsLevelESet;

	/**
     * The default value of the '{@link #getUsePlatformMBeanServer() <em>Use Platform MBean Server</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUsePlatformMBeanServer()
     * @generated
     * @ordered
     */
	protected static final String USE_PLATFORM_MBEAN_SERVER_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getUsePlatformMBeanServer() <em>Use Platform MBean Server</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUsePlatformMBeanServer()
     * @generated
     * @ordered
     */
	protected String usePlatformMBeanServer = USE_PLATFORM_MBEAN_SERVER_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CamelJMXAgentDefinitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getCamelJMXAgentDefinition();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getConnectorPort() {
        return connectorPort;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setConnectorPort(String newConnectorPort) {
        String oldConnectorPort = connectorPort;
        connectorPort = newConnectorPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_JMX_AGENT_DEFINITION__CONNECTOR_PORT, oldConnectorPort, connectorPort));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getCreateConnector() {
        return createConnector;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCreateConnector(String newCreateConnector) {
        String oldCreateConnector = createConnector;
        createConnector = newCreateConnector;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_JMX_AGENT_DEFINITION__CREATE_CONNECTOR, oldCreateConnector, createConnector));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDisabled() {
        return disabled;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDisabled(String newDisabled) {
        String oldDisabled = disabled;
        disabled = newDisabled;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_JMX_AGENT_DEFINITION__DISABLED, oldDisabled, disabled));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getMbeanObjectDomainName() {
        return mbeanObjectDomainName;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMbeanObjectDomainName(String newMbeanObjectDomainName) {
        String oldMbeanObjectDomainName = mbeanObjectDomainName;
        mbeanObjectDomainName = newMbeanObjectDomainName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_OBJECT_DOMAIN_NAME, oldMbeanObjectDomainName, mbeanObjectDomainName));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getMbeanServerDefaultDomain() {
        return mbeanServerDefaultDomain;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMbeanServerDefaultDomain(String newMbeanServerDefaultDomain) {
        String oldMbeanServerDefaultDomain = mbeanServerDefaultDomain;
        mbeanServerDefaultDomain = newMbeanServerDefaultDomain;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_SERVER_DEFAULT_DOMAIN, oldMbeanServerDefaultDomain, mbeanServerDefaultDomain));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getOnlyRegisterProcessorWithCustomId() {
        return onlyRegisterProcessorWithCustomId;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOnlyRegisterProcessorWithCustomId(String newOnlyRegisterProcessorWithCustomId) {
        String oldOnlyRegisterProcessorWithCustomId = onlyRegisterProcessorWithCustomId;
        onlyRegisterProcessorWithCustomId = newOnlyRegisterProcessorWithCustomId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_JMX_AGENT_DEFINITION__ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID, oldOnlyRegisterProcessorWithCustomId, onlyRegisterProcessorWithCustomId));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getRegisterAlways() {
        return registerAlways;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRegisterAlways(String newRegisterAlways) {
        String oldRegisterAlways = registerAlways;
        registerAlways = newRegisterAlways;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_ALWAYS, oldRegisterAlways, registerAlways));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getRegisterNewRoutes() {
        return registerNewRoutes;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRegisterNewRoutes(String newRegisterNewRoutes) {
        String oldRegisterNewRoutes = registerNewRoutes;
        registerNewRoutes = newRegisterNewRoutes;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_NEW_ROUTES, oldRegisterNewRoutes, registerNewRoutes));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getRegistryPort() {
        return registryPort;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRegistryPort(String newRegistryPort) {
        String oldRegistryPort = registryPort;
        registryPort = newRegistryPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTRY_PORT, oldRegistryPort, registryPort));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getServiceUrlPath() {
        return serviceUrlPath;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setServiceUrlPath(String newServiceUrlPath) {
        String oldServiceUrlPath = serviceUrlPath;
        serviceUrlPath = newServiceUrlPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_JMX_AGENT_DEFINITION__SERVICE_URL_PATH, oldServiceUrlPath, serviceUrlPath));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ManagementStatisticsLevel getStatisticsLevel() {
        return statisticsLevel;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStatisticsLevel(ManagementStatisticsLevel newStatisticsLevel) {
        ManagementStatisticsLevel oldStatisticsLevel = statisticsLevel;
        statisticsLevel = newStatisticsLevel == null ? STATISTICS_LEVEL_EDEFAULT : newStatisticsLevel;
        boolean oldStatisticsLevelESet = statisticsLevelESet;
        statisticsLevelESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_JMX_AGENT_DEFINITION__STATISTICS_LEVEL, oldStatisticsLevel, statisticsLevel, !oldStatisticsLevelESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetStatisticsLevel() {
        ManagementStatisticsLevel oldStatisticsLevel = statisticsLevel;
        boolean oldStatisticsLevelESet = statisticsLevelESet;
        statisticsLevel = STATISTICS_LEVEL_EDEFAULT;
        statisticsLevelESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.CAMEL_JMX_AGENT_DEFINITION__STATISTICS_LEVEL, oldStatisticsLevel, STATISTICS_LEVEL_EDEFAULT, oldStatisticsLevelESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetStatisticsLevel() {
        return statisticsLevelESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getUsePlatformMBeanServer() {
        return usePlatformMBeanServer;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUsePlatformMBeanServer(String newUsePlatformMBeanServer) {
        String oldUsePlatformMBeanServer = usePlatformMBeanServer;
        usePlatformMBeanServer = newUsePlatformMBeanServer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_JMX_AGENT_DEFINITION__USE_PLATFORM_MBEAN_SERVER, oldUsePlatformMBeanServer, usePlatformMBeanServer));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__CONNECTOR_PORT:
                return getConnectorPort();
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__CREATE_CONNECTOR:
                return getCreateConnector();
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__DISABLED:
                return getDisabled();
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_OBJECT_DOMAIN_NAME:
                return getMbeanObjectDomainName();
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_SERVER_DEFAULT_DOMAIN:
                return getMbeanServerDefaultDomain();
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID:
                return getOnlyRegisterProcessorWithCustomId();
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_ALWAYS:
                return getRegisterAlways();
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_NEW_ROUTES:
                return getRegisterNewRoutes();
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTRY_PORT:
                return getRegistryPort();
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__SERVICE_URL_PATH:
                return getServiceUrlPath();
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__STATISTICS_LEVEL:
                return getStatisticsLevel();
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__USE_PLATFORM_MBEAN_SERVER:
                return getUsePlatformMBeanServer();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__CONNECTOR_PORT:
                setConnectorPort((String)newValue);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__CREATE_CONNECTOR:
                setCreateConnector((String)newValue);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__DISABLED:
                setDisabled((String)newValue);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_OBJECT_DOMAIN_NAME:
                setMbeanObjectDomainName((String)newValue);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_SERVER_DEFAULT_DOMAIN:
                setMbeanServerDefaultDomain((String)newValue);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID:
                setOnlyRegisterProcessorWithCustomId((String)newValue);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_ALWAYS:
                setRegisterAlways((String)newValue);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_NEW_ROUTES:
                setRegisterNewRoutes((String)newValue);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTRY_PORT:
                setRegistryPort((String)newValue);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__SERVICE_URL_PATH:
                setServiceUrlPath((String)newValue);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__STATISTICS_LEVEL:
                setStatisticsLevel((ManagementStatisticsLevel)newValue);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__USE_PLATFORM_MBEAN_SERVER:
                setUsePlatformMBeanServer((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__CONNECTOR_PORT:
                setConnectorPort(CONNECTOR_PORT_EDEFAULT);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__CREATE_CONNECTOR:
                setCreateConnector(CREATE_CONNECTOR_EDEFAULT);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__DISABLED:
                setDisabled(DISABLED_EDEFAULT);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_OBJECT_DOMAIN_NAME:
                setMbeanObjectDomainName(MBEAN_OBJECT_DOMAIN_NAME_EDEFAULT);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_SERVER_DEFAULT_DOMAIN:
                setMbeanServerDefaultDomain(MBEAN_SERVER_DEFAULT_DOMAIN_EDEFAULT);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID:
                setOnlyRegisterProcessorWithCustomId(ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID_EDEFAULT);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_ALWAYS:
                setRegisterAlways(REGISTER_ALWAYS_EDEFAULT);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_NEW_ROUTES:
                setRegisterNewRoutes(REGISTER_NEW_ROUTES_EDEFAULT);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTRY_PORT:
                setRegistryPort(REGISTRY_PORT_EDEFAULT);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__SERVICE_URL_PATH:
                setServiceUrlPath(SERVICE_URL_PATH_EDEFAULT);
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__STATISTICS_LEVEL:
                unsetStatisticsLevel();
                return;
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__USE_PLATFORM_MBEAN_SERVER:
                setUsePlatformMBeanServer(USE_PLATFORM_MBEAN_SERVER_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__CONNECTOR_PORT:
                return CONNECTOR_PORT_EDEFAULT == null ? connectorPort != null : !CONNECTOR_PORT_EDEFAULT.equals(connectorPort);
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__CREATE_CONNECTOR:
                return CREATE_CONNECTOR_EDEFAULT == null ? createConnector != null : !CREATE_CONNECTOR_EDEFAULT.equals(createConnector);
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__DISABLED:
                return DISABLED_EDEFAULT == null ? disabled != null : !DISABLED_EDEFAULT.equals(disabled);
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_OBJECT_DOMAIN_NAME:
                return MBEAN_OBJECT_DOMAIN_NAME_EDEFAULT == null ? mbeanObjectDomainName != null : !MBEAN_OBJECT_DOMAIN_NAME_EDEFAULT.equals(mbeanObjectDomainName);
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_SERVER_DEFAULT_DOMAIN:
                return MBEAN_SERVER_DEFAULT_DOMAIN_EDEFAULT == null ? mbeanServerDefaultDomain != null : !MBEAN_SERVER_DEFAULT_DOMAIN_EDEFAULT.equals(mbeanServerDefaultDomain);
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID:
                return ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID_EDEFAULT == null ? onlyRegisterProcessorWithCustomId != null : !ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID_EDEFAULT.equals(onlyRegisterProcessorWithCustomId);
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_ALWAYS:
                return REGISTER_ALWAYS_EDEFAULT == null ? registerAlways != null : !REGISTER_ALWAYS_EDEFAULT.equals(registerAlways);
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_NEW_ROUTES:
                return REGISTER_NEW_ROUTES_EDEFAULT == null ? registerNewRoutes != null : !REGISTER_NEW_ROUTES_EDEFAULT.equals(registerNewRoutes);
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTRY_PORT:
                return REGISTRY_PORT_EDEFAULT == null ? registryPort != null : !REGISTRY_PORT_EDEFAULT.equals(registryPort);
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__SERVICE_URL_PATH:
                return SERVICE_URL_PATH_EDEFAULT == null ? serviceUrlPath != null : !SERVICE_URL_PATH_EDEFAULT.equals(serviceUrlPath);
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__STATISTICS_LEVEL:
                return isSetStatisticsLevel();
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION__USE_PLATFORM_MBEAN_SERVER:
                return USE_PLATFORM_MBEAN_SERVER_EDEFAULT == null ? usePlatformMBeanServer != null : !USE_PLATFORM_MBEAN_SERVER_EDEFAULT.equals(usePlatformMBeanServer);
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (connectorPort: ");
        result.append(connectorPort);
        result.append(", createConnector: ");
        result.append(createConnector);
        result.append(", disabled: ");
        result.append(disabled);
        result.append(", mbeanObjectDomainName: ");
        result.append(mbeanObjectDomainName);
        result.append(", mbeanServerDefaultDomain: ");
        result.append(mbeanServerDefaultDomain);
        result.append(", onlyRegisterProcessorWithCustomId: ");
        result.append(onlyRegisterProcessorWithCustomId);
        result.append(", registerAlways: ");
        result.append(registerAlways);
        result.append(", registerNewRoutes: ");
        result.append(registerNewRoutes);
        result.append(", registryPort: ");
        result.append(registryPort);
        result.append(", serviceUrlPath: ");
        result.append(serviceUrlPath);
        result.append(", statisticsLevel: ");
        if (statisticsLevelESet) result.append(statisticsLevel); else result.append("<unset>");
        result.append(", usePlatformMBeanServer: ");
        result.append(usePlatformMBeanServer);
        result.append(')');
        return result.toString();
    }

} //CamelJMXAgentDefinitionImpl
