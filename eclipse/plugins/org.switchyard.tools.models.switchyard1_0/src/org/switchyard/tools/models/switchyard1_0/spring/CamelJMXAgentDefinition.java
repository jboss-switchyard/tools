/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel JMX Agent Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getConnectorPort <em>Connector Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getCreateConnector <em>Create Connector</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getMbeanObjectDomainName <em>Mbean Object Domain Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getMbeanServerDefaultDomain <em>Mbean Server Default Domain</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getOnlyRegisterProcessorWithCustomId <em>Only Register Processor With Custom Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getRegisterAlways <em>Register Always</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getRegisterNewRoutes <em>Register New Routes</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getRegistryPort <em>Registry Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getServiceUrlPath <em>Service Url Path</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getStatisticsLevel <em>Statistics Level</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getUsePlatformMBeanServer <em>Use Platform MBean Server</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelJMXAgentDefinition()
 * @model extendedMetaData="name='camelJMXAgentDefinition' kind='empty'"
 * @generated
 */
public interface CamelJMXAgentDefinition extends IdentifiedType {
	/**
     * Returns the value of the '<em><b>Connector Port</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Connector Port</em>' attribute.
     * @see #setConnectorPort(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelJMXAgentDefinition_ConnectorPort()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='connectorPort'"
     * @generated
     */
	String getConnectorPort();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getConnectorPort <em>Connector Port</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connector Port</em>' attribute.
     * @see #getConnectorPort()
     * @generated
     */
	void setConnectorPort(String value);

	/**
     * Returns the value of the '<em><b>Create Connector</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Connector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Create Connector</em>' attribute.
     * @see #setCreateConnector(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelJMXAgentDefinition_CreateConnector()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='createConnector'"
     * @generated
     */
	String getCreateConnector();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getCreateConnector <em>Create Connector</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Create Connector</em>' attribute.
     * @see #getCreateConnector()
     * @generated
     */
	void setCreateConnector(String value);

	/**
     * Returns the value of the '<em><b>Disabled</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Disabled</em>' attribute.
     * @see #setDisabled(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelJMXAgentDefinition_Disabled()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='disabled'"
     * @generated
     */
	String getDisabled();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getDisabled <em>Disabled</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Disabled</em>' attribute.
     * @see #getDisabled()
     * @generated
     */
	void setDisabled(String value);

	/**
     * Returns the value of the '<em><b>Mbean Object Domain Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mbean Object Domain Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Mbean Object Domain Name</em>' attribute.
     * @see #setMbeanObjectDomainName(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelJMXAgentDefinition_MbeanObjectDomainName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='mbeanObjectDomainName'"
     * @generated
     */
	String getMbeanObjectDomainName();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getMbeanObjectDomainName <em>Mbean Object Domain Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mbean Object Domain Name</em>' attribute.
     * @see #getMbeanObjectDomainName()
     * @generated
     */
	void setMbeanObjectDomainName(String value);

	/**
     * Returns the value of the '<em><b>Mbean Server Default Domain</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mbean Server Default Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Mbean Server Default Domain</em>' attribute.
     * @see #setMbeanServerDefaultDomain(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelJMXAgentDefinition_MbeanServerDefaultDomain()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='mbeanServerDefaultDomain'"
     * @generated
     */
	String getMbeanServerDefaultDomain();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getMbeanServerDefaultDomain <em>Mbean Server Default Domain</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mbean Server Default Domain</em>' attribute.
     * @see #getMbeanServerDefaultDomain()
     * @generated
     */
	void setMbeanServerDefaultDomain(String value);

	/**
     * Returns the value of the '<em><b>Only Register Processor With Custom Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Only Register Processor With Custom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Only Register Processor With Custom Id</em>' attribute.
     * @see #setOnlyRegisterProcessorWithCustomId(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelJMXAgentDefinition_OnlyRegisterProcessorWithCustomId()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='onlyRegisterProcessorWithCustomId'"
     * @generated
     */
	String getOnlyRegisterProcessorWithCustomId();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getOnlyRegisterProcessorWithCustomId <em>Only Register Processor With Custom Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Only Register Processor With Custom Id</em>' attribute.
     * @see #getOnlyRegisterProcessorWithCustomId()
     * @generated
     */
	void setOnlyRegisterProcessorWithCustomId(String value);

	/**
     * Returns the value of the '<em><b>Register Always</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register Always</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Register Always</em>' attribute.
     * @see #setRegisterAlways(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelJMXAgentDefinition_RegisterAlways()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='registerAlways'"
     * @generated
     */
	String getRegisterAlways();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getRegisterAlways <em>Register Always</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Register Always</em>' attribute.
     * @see #getRegisterAlways()
     * @generated
     */
	void setRegisterAlways(String value);

	/**
     * Returns the value of the '<em><b>Register New Routes</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register New Routes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Register New Routes</em>' attribute.
     * @see #setRegisterNewRoutes(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelJMXAgentDefinition_RegisterNewRoutes()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='registerNewRoutes'"
     * @generated
     */
	String getRegisterNewRoutes();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getRegisterNewRoutes <em>Register New Routes</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Register New Routes</em>' attribute.
     * @see #getRegisterNewRoutes()
     * @generated
     */
	void setRegisterNewRoutes(String value);

	/**
     * Returns the value of the '<em><b>Registry Port</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Registry Port</em>' attribute.
     * @see #setRegistryPort(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelJMXAgentDefinition_RegistryPort()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='registryPort'"
     * @generated
     */
	String getRegistryPort();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getRegistryPort <em>Registry Port</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Registry Port</em>' attribute.
     * @see #getRegistryPort()
     * @generated
     */
	void setRegistryPort(String value);

	/**
     * Returns the value of the '<em><b>Service Url Path</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Url Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Service Url Path</em>' attribute.
     * @see #setServiceUrlPath(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelJMXAgentDefinition_ServiceUrlPath()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='serviceUrlPath'"
     * @generated
     */
	String getServiceUrlPath();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getServiceUrlPath <em>Service Url Path</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Url Path</em>' attribute.
     * @see #getServiceUrlPath()
     * @generated
     */
	void setServiceUrlPath(String value);

	/**
     * Returns the value of the '<em><b>Statistics Level</b></em>' attribute.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.spring.ManagementStatisticsLevel}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statistics Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Statistics Level</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.spring.ManagementStatisticsLevel
     * @see #isSetStatisticsLevel()
     * @see #unsetStatisticsLevel()
     * @see #setStatisticsLevel(ManagementStatisticsLevel)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelJMXAgentDefinition_StatisticsLevel()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='statisticsLevel'"
     * @generated
     */
	ManagementStatisticsLevel getStatisticsLevel();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getStatisticsLevel <em>Statistics Level</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Statistics Level</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.spring.ManagementStatisticsLevel
     * @see #isSetStatisticsLevel()
     * @see #unsetStatisticsLevel()
     * @see #getStatisticsLevel()
     * @generated
     */
	void setStatisticsLevel(ManagementStatisticsLevel value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getStatisticsLevel <em>Statistics Level</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetStatisticsLevel()
     * @see #getStatisticsLevel()
     * @see #setStatisticsLevel(ManagementStatisticsLevel)
     * @generated
     */
	void unsetStatisticsLevel();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getStatisticsLevel <em>Statistics Level</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Statistics Level</em>' attribute is set.
     * @see #unsetStatisticsLevel()
     * @see #getStatisticsLevel()
     * @see #setStatisticsLevel(ManagementStatisticsLevel)
     * @generated
     */
	boolean isSetStatisticsLevel();

	/**
     * Returns the value of the '<em><b>Use Platform MBean Server</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Platform MBean Server</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Use Platform MBean Server</em>' attribute.
     * @see #setUsePlatformMBeanServer(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelJMXAgentDefinition_UsePlatformMBeanServer()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='usePlatformMBeanServer'"
     * @generated
     */
	String getUsePlatformMBeanServer();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition#getUsePlatformMBeanServer <em>Use Platform MBean Server</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Platform MBean Server</em>' attribute.
     * @see #getUsePlatformMBeanServer()
     * @generated
     */
	void setUsePlatformMBeanServer(String value);

} // CamelJMXAgentDefinition
