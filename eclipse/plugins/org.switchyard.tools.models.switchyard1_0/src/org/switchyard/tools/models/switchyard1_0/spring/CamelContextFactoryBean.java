/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Context Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getPropertyPlaceholder <em>Property Placeholder</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getPackage <em>Package</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getPackageScan <em>Package Scan</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getContextScan <em>Context Scan</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getJmxAgent <em>Jmx Agent</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getGroup <em>Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getConsumerTemplate <em>Consumer Template</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getProxy <em>Proxy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getExport <em>Export</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getErrorHandler <em>Error Handler</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getRouteBuilder <em>Route Builder</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getRouteContextRef <em>Route Context Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getThreadPoolProfile <em>Thread Pool Profile</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getThreadPool <em>Thread Pool</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getDataFormats <em>Data Formats</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getRedeliveryPolicyProfile <em>Redelivery Policy Profile</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getInterceptSendToEndpoint <em>Intercept Send To Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getRoute <em>Route</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getAutoStartup <em>Auto Startup</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getDelayer <em>Delayer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getErrorHandlerRef <em>Error Handler Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getHandleFault <em>Handle Fault</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#isLazyLoadTypeConverters <em>Lazy Load Type Converters</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getShutdownRoute <em>Shutdown Route</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getShutdownRunningTask <em>Shutdown Running Task</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getStreamCache <em>Stream Cache</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getTrace <em>Trace</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getUseBreadcrumb <em>Use Breadcrumb</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getUseMDCLogging <em>Use MDC Logging</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean()
 * @model extendedMetaData="name='camelContextFactoryBean' kind='elementOnly'"
 * @generated
 */
public interface CamelContextFactoryBean extends AbstractCamelContextFactoryBean {
	/**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference.
     * @see #setProperties(PropertiesDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_Properties()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
     * @generated
     */
	PropertiesDefinition getProperties();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getProperties <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Properties</em>' containment reference.
     * @see #getProperties()
     * @generated
     */
	void setProperties(PropertiesDefinition value);

	/**
     * Returns the value of the '<em><b>Property Placeholder</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Property Placeholder</em>' containment reference.
     * @see #setPropertyPlaceholder(CamelPropertyPlaceholderDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_PropertyPlaceholder()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='propertyPlaceholder' namespace='##targetNamespace'"
     * @generated
     */
	CamelPropertyPlaceholderDefinition getPropertyPlaceholder();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getPropertyPlaceholder <em>Property Placeholder</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property Placeholder</em>' containment reference.
     * @see #getPropertyPlaceholder()
     * @generated
     */
	void setPropertyPlaceholder(CamelPropertyPlaceholderDefinition value);

	/**
     * Returns the value of the '<em><b>Package</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' attribute list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_Package()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='package' namespace='##targetNamespace'"
     * @generated
     */
	EList<String> getPackage();

	/**
     * Returns the value of the '<em><b>Package Scan</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Scan</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Package Scan</em>' containment reference.
     * @see #setPackageScan(PackageScanDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_PackageScan()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='packageScan' namespace='##targetNamespace'"
     * @generated
     */
	PackageScanDefinition getPackageScan();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getPackageScan <em>Package Scan</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package Scan</em>' containment reference.
     * @see #getPackageScan()
     * @generated
     */
	void setPackageScan(PackageScanDefinition value);

	/**
     * Returns the value of the '<em><b>Context Scan</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Scan</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Context Scan</em>' containment reference.
     * @see #setContextScan(ContextScanDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_ContextScan()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='contextScan' namespace='##targetNamespace'"
     * @generated
     */
	ContextScanDefinition getContextScan();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getContextScan <em>Context Scan</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Scan</em>' containment reference.
     * @see #getContextScan()
     * @generated
     */
	void setContextScan(ContextScanDefinition value);

	/**
     * Returns the value of the '<em><b>Jmx Agent</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jmx Agent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Jmx Agent</em>' containment reference.
     * @see #setJmxAgent(CamelJMXAgentDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_JmxAgent()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='jmxAgent' namespace='##targetNamespace'"
     * @generated
     */
	CamelJMXAgentDefinition getJmxAgent();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getJmxAgent <em>Jmx Agent</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Jmx Agent</em>' containment reference.
     * @see #getJmxAgent()
     * @generated
     */
	void setJmxAgent(CamelJMXAgentDefinition value);

	/**
     * Returns the value of the '<em><b>Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Group</em>' attribute list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:7'"
     * @generated
     */
	FeatureMap getGroup();

	/**
     * Returns the value of the '<em><b>Template</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.CamelProducerTemplateFactoryBean}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Template</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_Template()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='template' namespace='##targetNamespace' group='#group:7'"
     * @generated
     */
	EList<CamelProducerTemplateFactoryBean> getTemplate();

	/**
     * Returns the value of the '<em><b>Consumer Template</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.CamelConsumerTemplateFactoryBean}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Consumer Template</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_ConsumerTemplate()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='consumerTemplate' namespace='##targetNamespace' group='#group:7'"
     * @generated
     */
	EList<CamelConsumerTemplateFactoryBean> getConsumerTemplate();

	/**
     * Returns the value of the '<em><b>Proxy</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.CamelProxyFactoryDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Proxy</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_Proxy()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='proxy' namespace='##targetNamespace' group='#group:7'"
     * @generated
     */
	EList<CamelProxyFactoryDefinition> getProxy();

	/**
     * Returns the value of the '<em><b>Export</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.CamelServiceExporterDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Export</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_Export()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='export' namespace='##targetNamespace' group='#group:7'"
     * @generated
     */
	EList<CamelServiceExporterDefinition> getExport();

	/**
     * Returns the value of the '<em><b>Error Handler</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Handler</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Error Handler</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_ErrorHandler()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='errorHandler' namespace='##targetNamespace' group='#group:7'"
     * @generated
     */
	EList<ErrorHandlerDefinition> getErrorHandler();

	/**
     * Returns the value of the '<em><b>Route Builder</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.RouteBuilderDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Builder</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Route Builder</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_RouteBuilder()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='routeBuilder' namespace='##targetNamespace'"
     * @generated
     */
	EList<RouteBuilderDefinition> getRouteBuilder();

	/**
     * Returns the value of the '<em><b>Route Context Ref</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.RouteContextRefDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Context Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Route Context Ref</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_RouteContextRef()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='routeContextRef' namespace='##targetNamespace'"
     * @generated
     */
	EList<RouteContextRefDefinition> getRouteContextRef();

	/**
     * Returns the value of the '<em><b>Thread Pool Profile</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ThreadPoolProfileDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Pool Profile</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Thread Pool Profile</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_ThreadPoolProfile()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='threadPoolProfile' namespace='##targetNamespace'"
     * @generated
     */
	EList<ThreadPoolProfileDefinition> getThreadPoolProfile();

	/**
     * Returns the value of the '<em><b>Thread Pool</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.CamelThreadPoolFactoryBean}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Pool</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Thread Pool</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_ThreadPool()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='threadPool' namespace='##targetNamespace'"
     * @generated
     */
	EList<CamelThreadPoolFactoryBean> getThreadPool();

	/**
     * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.CamelEndpointFactoryBean}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Endpoint</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_Endpoint()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace'"
     * @generated
     */
	EList<CamelEndpointFactoryBean> getEndpoint();

	/**
     * Returns the value of the '<em><b>Data Formats</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Formats</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Data Formats</em>' containment reference.
     * @see #setDataFormats(DataFormatsDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_DataFormats()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='dataFormats' namespace='##targetNamespace'"
     * @generated
     */
	DataFormatsDefinition getDataFormats();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getDataFormats <em>Data Formats</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Formats</em>' containment reference.
     * @see #getDataFormats()
     * @generated
     */
	void setDataFormats(DataFormatsDefinition value);

	/**
     * Returns the value of the '<em><b>Redelivery Policy Profile</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.CamelRedeliveryPolicyFactoryBean}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redelivery Policy Profile</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Redelivery Policy Profile</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_RedeliveryPolicyProfile()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='redeliveryPolicyProfile' namespace='##targetNamespace'"
     * @generated
     */
	EList<CamelRedeliveryPolicyFactoryBean> getRedeliveryPolicyProfile();

	/**
     * Returns the value of the '<em><b>On Exception</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.OnExceptionDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Exception</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>On Exception</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_OnException()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='onException' namespace='##targetNamespace'"
     * @generated
     */
	EList<OnExceptionDefinition> getOnException();

	/**
     * Returns the value of the '<em><b>On Completion</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.OnCompletionDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Completion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>On Completion</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_OnCompletion()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='onCompletion' namespace='##targetNamespace'"
     * @generated
     */
	EList<OnCompletionDefinition> getOnCompletion();

	/**
     * Returns the value of the '<em><b>Intercept</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.InterceptDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intercept</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Intercept</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_Intercept()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='intercept' namespace='##targetNamespace'"
     * @generated
     */
	EList<InterceptDefinition> getIntercept();

	/**
     * Returns the value of the '<em><b>Intercept From</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.InterceptFromDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intercept From</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Intercept From</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_InterceptFrom()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='interceptFrom' namespace='##targetNamespace'"
     * @generated
     */
	EList<InterceptFromDefinition> getInterceptFrom();

	/**
     * Returns the value of the '<em><b>Intercept Send To Endpoint</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.InterceptSendToEndpointDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intercept Send To Endpoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Intercept Send To Endpoint</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_InterceptSendToEndpoint()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='interceptSendToEndpoint' namespace='##targetNamespace'"
     * @generated
     */
	EList<InterceptSendToEndpointDefinition> getInterceptSendToEndpoint();

	/**
     * Returns the value of the '<em><b>Route</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Route</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_Route()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace'"
     * @generated
     */
	EList<RouteDefinition> getRoute();

	/**
     * Returns the value of the '<em><b>Auto Startup</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Startup</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Auto Startup</em>' attribute.
     * @see #setAutoStartup(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_AutoStartup()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='autoStartup'"
     * @generated
     */
	String getAutoStartup();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getAutoStartup <em>Auto Startup</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Auto Startup</em>' attribute.
     * @see #getAutoStartup()
     * @generated
     */
	void setAutoStartup(String value);

	/**
     * Returns the value of the '<em><b>Delayer</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delayer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Delayer</em>' attribute.
     * @see #setDelayer(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_Delayer()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='delayer'"
     * @generated
     */
	String getDelayer();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getDelayer <em>Delayer</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delayer</em>' attribute.
     * @see #getDelayer()
     * @generated
     */
	void setDelayer(String value);

	/**
     * Returns the value of the '<em><b>Depends On</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Depends On</em>' attribute.
     * @see #setDependsOn(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_DependsOn()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='depends-on'"
     * @generated
     */
	String getDependsOn();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getDependsOn <em>Depends On</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Depends On</em>' attribute.
     * @see #getDependsOn()
     * @generated
     */
	void setDependsOn(String value);

	/**
     * Returns the value of the '<em><b>Error Handler Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Handler Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Error Handler Ref</em>' attribute.
     * @see #setErrorHandlerRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_ErrorHandlerRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='errorHandlerRef'"
     * @generated
     */
	String getErrorHandlerRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getErrorHandlerRef <em>Error Handler Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Error Handler Ref</em>' attribute.
     * @see #getErrorHandlerRef()
     * @generated
     */
	void setErrorHandlerRef(String value);

	/**
     * Returns the value of the '<em><b>Handle Fault</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Fault</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Handle Fault</em>' attribute.
     * @see #setHandleFault(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_HandleFault()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='handleFault'"
     * @generated
     */
	String getHandleFault();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getHandleFault <em>Handle Fault</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Handle Fault</em>' attribute.
     * @see #getHandleFault()
     * @generated
     */
	void setHandleFault(String value);

	/**
     * Returns the value of the '<em><b>Lazy Load Type Converters</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lazy Load Type Converters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Lazy Load Type Converters</em>' attribute.
     * @see #isSetLazyLoadTypeConverters()
     * @see #unsetLazyLoadTypeConverters()
     * @see #setLazyLoadTypeConverters(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_LazyLoadTypeConverters()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='lazyLoadTypeConverters'"
     * @generated
     */
	boolean isLazyLoadTypeConverters();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#isLazyLoadTypeConverters <em>Lazy Load Type Converters</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lazy Load Type Converters</em>' attribute.
     * @see #isSetLazyLoadTypeConverters()
     * @see #unsetLazyLoadTypeConverters()
     * @see #isLazyLoadTypeConverters()
     * @generated
     */
	void setLazyLoadTypeConverters(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#isLazyLoadTypeConverters <em>Lazy Load Type Converters</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetLazyLoadTypeConverters()
     * @see #isLazyLoadTypeConverters()
     * @see #setLazyLoadTypeConverters(boolean)
     * @generated
     */
	void unsetLazyLoadTypeConverters();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#isLazyLoadTypeConverters <em>Lazy Load Type Converters</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lazy Load Type Converters</em>' attribute is set.
     * @see #unsetLazyLoadTypeConverters()
     * @see #isLazyLoadTypeConverters()
     * @see #setLazyLoadTypeConverters(boolean)
     * @generated
     */
	boolean isSetLazyLoadTypeConverters();

	/**
     * Returns the value of the '<em><b>Shutdown Route</b></em>' attribute.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.spring.ShutdownRoute}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shutdown Route</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Shutdown Route</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.spring.ShutdownRoute
     * @see #isSetShutdownRoute()
     * @see #unsetShutdownRoute()
     * @see #setShutdownRoute(ShutdownRoute)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_ShutdownRoute()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='shutdownRoute'"
     * @generated
     */
	ShutdownRoute getShutdownRoute();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getShutdownRoute <em>Shutdown Route</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shutdown Route</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.spring.ShutdownRoute
     * @see #isSetShutdownRoute()
     * @see #unsetShutdownRoute()
     * @see #getShutdownRoute()
     * @generated
     */
	void setShutdownRoute(ShutdownRoute value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getShutdownRoute <em>Shutdown Route</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetShutdownRoute()
     * @see #getShutdownRoute()
     * @see #setShutdownRoute(ShutdownRoute)
     * @generated
     */
	void unsetShutdownRoute();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getShutdownRoute <em>Shutdown Route</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Shutdown Route</em>' attribute is set.
     * @see #unsetShutdownRoute()
     * @see #getShutdownRoute()
     * @see #setShutdownRoute(ShutdownRoute)
     * @generated
     */
	boolean isSetShutdownRoute();

	/**
     * Returns the value of the '<em><b>Shutdown Running Task</b></em>' attribute.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.spring.ShutdownRunningTask}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shutdown Running Task</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Shutdown Running Task</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.spring.ShutdownRunningTask
     * @see #isSetShutdownRunningTask()
     * @see #unsetShutdownRunningTask()
     * @see #setShutdownRunningTask(ShutdownRunningTask)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_ShutdownRunningTask()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='shutdownRunningTask'"
     * @generated
     */
	ShutdownRunningTask getShutdownRunningTask();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getShutdownRunningTask <em>Shutdown Running Task</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shutdown Running Task</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.spring.ShutdownRunningTask
     * @see #isSetShutdownRunningTask()
     * @see #unsetShutdownRunningTask()
     * @see #getShutdownRunningTask()
     * @generated
     */
	void setShutdownRunningTask(ShutdownRunningTask value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getShutdownRunningTask <em>Shutdown Running Task</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetShutdownRunningTask()
     * @see #getShutdownRunningTask()
     * @see #setShutdownRunningTask(ShutdownRunningTask)
     * @generated
     */
	void unsetShutdownRunningTask();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getShutdownRunningTask <em>Shutdown Running Task</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Shutdown Running Task</em>' attribute is set.
     * @see #unsetShutdownRunningTask()
     * @see #getShutdownRunningTask()
     * @see #setShutdownRunningTask(ShutdownRunningTask)
     * @generated
     */
	boolean isSetShutdownRunningTask();

	/**
     * Returns the value of the '<em><b>Stream Cache</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stream Cache</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Stream Cache</em>' attribute.
     * @see #setStreamCache(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_StreamCache()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='streamCache'"
     * @generated
     */
	String getStreamCache();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getStreamCache <em>Stream Cache</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stream Cache</em>' attribute.
     * @see #getStreamCache()
     * @generated
     */
	void setStreamCache(String value);

	/**
     * Returns the value of the '<em><b>Trace</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Trace</em>' attribute.
     * @see #setTrace(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_Trace()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='trace'"
     * @generated
     */
	String getTrace();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getTrace <em>Trace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trace</em>' attribute.
     * @see #getTrace()
     * @generated
     */
	void setTrace(String value);

	/**
     * Returns the value of the '<em><b>Use Breadcrumb</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Breadcrumb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Use Breadcrumb</em>' attribute.
     * @see #setUseBreadcrumb(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_UseBreadcrumb()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='useBreadcrumb'"
     * @generated
     */
	String getUseBreadcrumb();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getUseBreadcrumb <em>Use Breadcrumb</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Breadcrumb</em>' attribute.
     * @see #getUseBreadcrumb()
     * @generated
     */
	void setUseBreadcrumb(String value);

	/**
     * Returns the value of the '<em><b>Use MDC Logging</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use MDC Logging</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Use MDC Logging</em>' attribute.
     * @see #setUseMDCLogging(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelContextFactoryBean_UseMDCLogging()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='useMDCLogging'"
     * @generated
     */
	String getUseMDCLogging();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean#getUseMDCLogging <em>Use MDC Logging</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use MDC Logging</em>' attribute.
     * @see #getUseMDCLogging()
     * @generated
     */
	void setUseMDCLogging(String value);

} // CamelContextFactoryBean
