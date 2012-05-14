/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.spring.CamelConsumerTemplateFactoryBean;
import org.switchyard.tools.models.switchyard1_0.spring.CamelContextFactoryBean;
import org.switchyard.tools.models.switchyard1_0.spring.CamelEndpointFactoryBean;
import org.switchyard.tools.models.switchyard1_0.spring.CamelJMXAgentDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.CamelProducerTemplateFactoryBean;
import org.switchyard.tools.models.switchyard1_0.spring.CamelPropertyPlaceholderDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.CamelProxyFactoryDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.CamelRedeliveryPolicyFactoryBean;
import org.switchyard.tools.models.switchyard1_0.spring.CamelServiceExporterDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.CamelThreadPoolFactoryBean;
import org.switchyard.tools.models.switchyard1_0.spring.ContextScanDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.DataFormatsDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.InterceptDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.InterceptFromDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.InterceptSendToEndpointDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.OnCompletionDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.OnExceptionDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.PackageScanDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.PropertiesDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RouteBuilderDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RouteContextRefDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ShutdownRoute;
import org.switchyard.tools.models.switchyard1_0.spring.ShutdownRunningTask;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.ThreadPoolProfileDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Context Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getPropertyPlaceholder <em>Property Placeholder</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getPackageScan <em>Package Scan</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getContextScan <em>Context Scan</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getJmxAgent <em>Jmx Agent</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getConsumerTemplate <em>Consumer Template</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getProxy <em>Proxy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getExport <em>Export</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getErrorHandler <em>Error Handler</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getRouteBuilder <em>Route Builder</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getRouteContextRef <em>Route Context Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getThreadPoolProfile <em>Thread Pool Profile</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getThreadPool <em>Thread Pool</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getDataFormats <em>Data Formats</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getRedeliveryPolicyProfile <em>Redelivery Policy Profile</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getInterceptSendToEndpoint <em>Intercept Send To Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getAutoStartup <em>Auto Startup</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getDelayer <em>Delayer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getErrorHandlerRef <em>Error Handler Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getHandleFault <em>Handle Fault</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#isLazyLoadTypeConverters <em>Lazy Load Type Converters</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getShutdownRoute <em>Shutdown Route</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getShutdownRunningTask <em>Shutdown Running Task</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getStreamCache <em>Stream Cache</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getTrace <em>Trace</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getUseBreadcrumb <em>Use Breadcrumb</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelContextFactoryBeanImpl#getUseMDCLogging <em>Use MDC Logging</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelContextFactoryBeanImpl extends AbstractCamelContextFactoryBeanImpl implements CamelContextFactoryBean {
	/**
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
	protected PropertiesDefinition properties;

	/**
     * The cached value of the '{@link #getPropertyPlaceholder() <em>Property Placeholder</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPropertyPlaceholder()
     * @generated
     * @ordered
     */
	protected CamelPropertyPlaceholderDefinition propertyPlaceholder;

	/**
     * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPackage()
     * @generated
     * @ordered
     */
	protected EList<String> package_;

	/**
     * The cached value of the '{@link #getPackageScan() <em>Package Scan</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPackageScan()
     * @generated
     * @ordered
     */
	protected PackageScanDefinition packageScan;

	/**
     * The cached value of the '{@link #getContextScan() <em>Context Scan</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getContextScan()
     * @generated
     * @ordered
     */
	protected ContextScanDefinition contextScan;

	/**
     * The cached value of the '{@link #getJmxAgent() <em>Jmx Agent</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getJmxAgent()
     * @generated
     * @ordered
     */
	protected CamelJMXAgentDefinition jmxAgent;

	/**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
	protected FeatureMap group;

	/**
     * The cached value of the '{@link #getRouteBuilder() <em>Route Builder</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRouteBuilder()
     * @generated
     * @ordered
     */
	protected EList<RouteBuilderDefinition> routeBuilder;

	/**
     * The cached value of the '{@link #getRouteContextRef() <em>Route Context Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRouteContextRef()
     * @generated
     * @ordered
     */
	protected EList<RouteContextRefDefinition> routeContextRef;

	/**
     * The cached value of the '{@link #getThreadPoolProfile() <em>Thread Pool Profile</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getThreadPoolProfile()
     * @generated
     * @ordered
     */
	protected EList<ThreadPoolProfileDefinition> threadPoolProfile;

	/**
     * The cached value of the '{@link #getThreadPool() <em>Thread Pool</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getThreadPool()
     * @generated
     * @ordered
     */
	protected EList<CamelThreadPoolFactoryBean> threadPool;

	/**
     * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEndpoint()
     * @generated
     * @ordered
     */
	protected EList<CamelEndpointFactoryBean> endpoint;

	/**
     * The cached value of the '{@link #getDataFormats() <em>Data Formats</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDataFormats()
     * @generated
     * @ordered
     */
	protected DataFormatsDefinition dataFormats;

	/**
     * The cached value of the '{@link #getRedeliveryPolicyProfile() <em>Redelivery Policy Profile</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRedeliveryPolicyProfile()
     * @generated
     * @ordered
     */
	protected EList<CamelRedeliveryPolicyFactoryBean> redeliveryPolicyProfile;

	/**
     * The cached value of the '{@link #getOnException() <em>On Exception</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOnException()
     * @generated
     * @ordered
     */
	protected EList<OnExceptionDefinition> onException;

	/**
     * The cached value of the '{@link #getOnCompletion() <em>On Completion</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOnCompletion()
     * @generated
     * @ordered
     */
	protected EList<OnCompletionDefinition> onCompletion;

	/**
     * The cached value of the '{@link #getIntercept() <em>Intercept</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIntercept()
     * @generated
     * @ordered
     */
	protected EList<InterceptDefinition> intercept;

	/**
     * The cached value of the '{@link #getInterceptFrom() <em>Intercept From</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInterceptFrom()
     * @generated
     * @ordered
     */
	protected EList<InterceptFromDefinition> interceptFrom;

	/**
     * The cached value of the '{@link #getInterceptSendToEndpoint() <em>Intercept Send To Endpoint</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInterceptSendToEndpoint()
     * @generated
     * @ordered
     */
	protected EList<InterceptSendToEndpointDefinition> interceptSendToEndpoint;

	/**
     * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRoute()
     * @generated
     * @ordered
     */
	protected EList<RouteDefinition> route;

	/**
     * The default value of the '{@link #getAutoStartup() <em>Auto Startup</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAutoStartup()
     * @generated
     * @ordered
     */
	protected static final String AUTO_STARTUP_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getAutoStartup() <em>Auto Startup</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAutoStartup()
     * @generated
     * @ordered
     */
	protected String autoStartup = AUTO_STARTUP_EDEFAULT;

	/**
     * The default value of the '{@link #getDelayer() <em>Delayer</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDelayer()
     * @generated
     * @ordered
     */
	protected static final String DELAYER_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDelayer() <em>Delayer</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDelayer()
     * @generated
     * @ordered
     */
	protected String delayer = DELAYER_EDEFAULT;

	/**
     * The default value of the '{@link #getDependsOn() <em>Depends On</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDependsOn()
     * @generated
     * @ordered
     */
	protected static final String DEPENDS_ON_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDependsOn()
     * @generated
     * @ordered
     */
	protected String dependsOn = DEPENDS_ON_EDEFAULT;

	/**
     * The default value of the '{@link #getErrorHandlerRef() <em>Error Handler Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getErrorHandlerRef()
     * @generated
     * @ordered
     */
	protected static final String ERROR_HANDLER_REF_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getErrorHandlerRef() <em>Error Handler Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getErrorHandlerRef()
     * @generated
     * @ordered
     */
	protected String errorHandlerRef = ERROR_HANDLER_REF_EDEFAULT;

	/**
     * The default value of the '{@link #getHandleFault() <em>Handle Fault</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHandleFault()
     * @generated
     * @ordered
     */
	protected static final String HANDLE_FAULT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getHandleFault() <em>Handle Fault</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHandleFault()
     * @generated
     * @ordered
     */
	protected String handleFault = HANDLE_FAULT_EDEFAULT;

	/**
     * The default value of the '{@link #isLazyLoadTypeConverters() <em>Lazy Load Type Converters</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isLazyLoadTypeConverters()
     * @generated
     * @ordered
     */
	protected static final boolean LAZY_LOAD_TYPE_CONVERTERS_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isLazyLoadTypeConverters() <em>Lazy Load Type Converters</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isLazyLoadTypeConverters()
     * @generated
     * @ordered
     */
	protected boolean lazyLoadTypeConverters = LAZY_LOAD_TYPE_CONVERTERS_EDEFAULT;

	/**
     * This is true if the Lazy Load Type Converters attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean lazyLoadTypeConvertersESet;

	/**
     * The default value of the '{@link #getShutdownRoute() <em>Shutdown Route</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getShutdownRoute()
     * @generated
     * @ordered
     */
	protected static final ShutdownRoute SHUTDOWN_ROUTE_EDEFAULT = ShutdownRoute.DEFAULT;

	/**
     * The cached value of the '{@link #getShutdownRoute() <em>Shutdown Route</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getShutdownRoute()
     * @generated
     * @ordered
     */
	protected ShutdownRoute shutdownRoute = SHUTDOWN_ROUTE_EDEFAULT;

	/**
     * This is true if the Shutdown Route attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean shutdownRouteESet;

	/**
     * The default value of the '{@link #getShutdownRunningTask() <em>Shutdown Running Task</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getShutdownRunningTask()
     * @generated
     * @ordered
     */
	protected static final ShutdownRunningTask SHUTDOWN_RUNNING_TASK_EDEFAULT = ShutdownRunningTask.COMPLETE_CURRENT_TASK_ONLY;

	/**
     * The cached value of the '{@link #getShutdownRunningTask() <em>Shutdown Running Task</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getShutdownRunningTask()
     * @generated
     * @ordered
     */
	protected ShutdownRunningTask shutdownRunningTask = SHUTDOWN_RUNNING_TASK_EDEFAULT;

	/**
     * This is true if the Shutdown Running Task attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean shutdownRunningTaskESet;

	/**
     * The default value of the '{@link #getStreamCache() <em>Stream Cache</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStreamCache()
     * @generated
     * @ordered
     */
	protected static final String STREAM_CACHE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getStreamCache() <em>Stream Cache</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStreamCache()
     * @generated
     * @ordered
     */
	protected String streamCache = STREAM_CACHE_EDEFAULT;

	/**
     * The default value of the '{@link #getTrace() <em>Trace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTrace()
     * @generated
     * @ordered
     */
	protected static final String TRACE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getTrace() <em>Trace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTrace()
     * @generated
     * @ordered
     */
	protected String trace = TRACE_EDEFAULT;

	/**
     * The default value of the '{@link #getUseBreadcrumb() <em>Use Breadcrumb</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUseBreadcrumb()
     * @generated
     * @ordered
     */
	protected static final String USE_BREADCRUMB_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getUseBreadcrumb() <em>Use Breadcrumb</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUseBreadcrumb()
     * @generated
     * @ordered
     */
	protected String useBreadcrumb = USE_BREADCRUMB_EDEFAULT;

	/**
     * The default value of the '{@link #getUseMDCLogging() <em>Use MDC Logging</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUseMDCLogging()
     * @generated
     * @ordered
     */
	protected static final String USE_MDC_LOGGING_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getUseMDCLogging() <em>Use MDC Logging</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUseMDCLogging()
     * @generated
     * @ordered
     */
	protected String useMDCLogging = USE_MDC_LOGGING_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CamelContextFactoryBeanImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getCamelContextFactoryBean();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PropertiesDefinition getProperties() {
        return properties;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetProperties(PropertiesDefinition newProperties, NotificationChain msgs) {
        PropertiesDefinition oldProperties = properties;
        properties = newProperties;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTIES, oldProperties, newProperties);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setProperties(PropertiesDefinition newProperties) {
        if (newProperties != properties) {
            NotificationChain msgs = null;
            if (properties != null)
                msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTIES, null, msgs);
            if (newProperties != null)
                msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTIES, null, msgs);
            msgs = basicSetProperties(newProperties, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTIES, newProperties, newProperties));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CamelPropertyPlaceholderDefinition getPropertyPlaceholder() {
        return propertyPlaceholder;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetPropertyPlaceholder(CamelPropertyPlaceholderDefinition newPropertyPlaceholder, NotificationChain msgs) {
        CamelPropertyPlaceholderDefinition oldPropertyPlaceholder = propertyPlaceholder;
        propertyPlaceholder = newPropertyPlaceholder;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTY_PLACEHOLDER, oldPropertyPlaceholder, newPropertyPlaceholder);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPropertyPlaceholder(CamelPropertyPlaceholderDefinition newPropertyPlaceholder) {
        if (newPropertyPlaceholder != propertyPlaceholder) {
            NotificationChain msgs = null;
            if (propertyPlaceholder != null)
                msgs = ((InternalEObject)propertyPlaceholder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTY_PLACEHOLDER, null, msgs);
            if (newPropertyPlaceholder != null)
                msgs = ((InternalEObject)newPropertyPlaceholder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTY_PLACEHOLDER, null, msgs);
            msgs = basicSetPropertyPlaceholder(newPropertyPlaceholder, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTY_PLACEHOLDER, newPropertyPlaceholder, newPropertyPlaceholder));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<String> getPackage() {
        if (package_ == null) {
            package_ = new EDataTypeEList<String>(String.class, this, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE);
        }
        return package_;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PackageScanDefinition getPackageScan() {
        return packageScan;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetPackageScan(PackageScanDefinition newPackageScan, NotificationChain msgs) {
        PackageScanDefinition oldPackageScan = packageScan;
        packageScan = newPackageScan;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE_SCAN, oldPackageScan, newPackageScan);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPackageScan(PackageScanDefinition newPackageScan) {
        if (newPackageScan != packageScan) {
            NotificationChain msgs = null;
            if (packageScan != null)
                msgs = ((InternalEObject)packageScan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE_SCAN, null, msgs);
            if (newPackageScan != null)
                msgs = ((InternalEObject)newPackageScan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE_SCAN, null, msgs);
            msgs = basicSetPackageScan(newPackageScan, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE_SCAN, newPackageScan, newPackageScan));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ContextScanDefinition getContextScan() {
        return contextScan;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetContextScan(ContextScanDefinition newContextScan, NotificationChain msgs) {
        ContextScanDefinition oldContextScan = contextScan;
        contextScan = newContextScan;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONTEXT_SCAN, oldContextScan, newContextScan);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setContextScan(ContextScanDefinition newContextScan) {
        if (newContextScan != contextScan) {
            NotificationChain msgs = null;
            if (contextScan != null)
                msgs = ((InternalEObject)contextScan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONTEXT_SCAN, null, msgs);
            if (newContextScan != null)
                msgs = ((InternalEObject)newContextScan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONTEXT_SCAN, null, msgs);
            msgs = basicSetContextScan(newContextScan, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONTEXT_SCAN, newContextScan, newContextScan));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CamelJMXAgentDefinition getJmxAgent() {
        return jmxAgent;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetJmxAgent(CamelJMXAgentDefinition newJmxAgent, NotificationChain msgs) {
        CamelJMXAgentDefinition oldJmxAgent = jmxAgent;
        jmxAgent = newJmxAgent;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__JMX_AGENT, oldJmxAgent, newJmxAgent);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setJmxAgent(CamelJMXAgentDefinition newJmxAgent) {
        if (newJmxAgent != jmxAgent) {
            NotificationChain msgs = null;
            if (jmxAgent != null)
                msgs = ((InternalEObject)jmxAgent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__JMX_AGENT, null, msgs);
            if (newJmxAgent != null)
                msgs = ((InternalEObject)newJmxAgent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__JMX_AGENT, null, msgs);
            msgs = basicSetJmxAgent(newJmxAgent, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__JMX_AGENT, newJmxAgent, newJmxAgent));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GROUP);
        }
        return group;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<CamelProducerTemplateFactoryBean> getTemplate() {
        return getGroup().list(SpringPackage.eINSTANCE.getCamelContextFactoryBean_Template());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<CamelConsumerTemplateFactoryBean> getConsumerTemplate() {
        return getGroup().list(SpringPackage.eINSTANCE.getCamelContextFactoryBean_ConsumerTemplate());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<CamelProxyFactoryDefinition> getProxy() {
        return getGroup().list(SpringPackage.eINSTANCE.getCamelContextFactoryBean_Proxy());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<CamelServiceExporterDefinition> getExport() {
        return getGroup().list(SpringPackage.eINSTANCE.getCamelContextFactoryBean_Export());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ErrorHandlerDefinition> getErrorHandler() {
        return getGroup().list(SpringPackage.eINSTANCE.getCamelContextFactoryBean_ErrorHandler());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RouteBuilderDefinition> getRouteBuilder() {
        if (routeBuilder == null) {
            routeBuilder = new EObjectContainmentEList<RouteBuilderDefinition>(RouteBuilderDefinition.class, this, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_BUILDER);
        }
        return routeBuilder;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RouteContextRefDefinition> getRouteContextRef() {
        if (routeContextRef == null) {
            routeContextRef = new EObjectContainmentEList<RouteContextRefDefinition>(RouteContextRefDefinition.class, this, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTEXT_REF);
        }
        return routeContextRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ThreadPoolProfileDefinition> getThreadPoolProfile() {
        if (threadPoolProfile == null) {
            threadPoolProfile = new EObjectContainmentEList<ThreadPoolProfileDefinition>(ThreadPoolProfileDefinition.class, this, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL_PROFILE);
        }
        return threadPoolProfile;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<CamelThreadPoolFactoryBean> getThreadPool() {
        if (threadPool == null) {
            threadPool = new EObjectContainmentEList<CamelThreadPoolFactoryBean>(CamelThreadPoolFactoryBean.class, this, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL);
        }
        return threadPool;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<CamelEndpointFactoryBean> getEndpoint() {
        if (endpoint == null) {
            endpoint = new EObjectContainmentEList<CamelEndpointFactoryBean>(CamelEndpointFactoryBean.class, this, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ENDPOINT);
        }
        return endpoint;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DataFormatsDefinition getDataFormats() {
        return dataFormats;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetDataFormats(DataFormatsDefinition newDataFormats, NotificationChain msgs) {
        DataFormatsDefinition oldDataFormats = dataFormats;
        dataFormats = newDataFormats;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DATA_FORMATS, oldDataFormats, newDataFormats);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDataFormats(DataFormatsDefinition newDataFormats) {
        if (newDataFormats != dataFormats) {
            NotificationChain msgs = null;
            if (dataFormats != null)
                msgs = ((InternalEObject)dataFormats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DATA_FORMATS, null, msgs);
            if (newDataFormats != null)
                msgs = ((InternalEObject)newDataFormats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DATA_FORMATS, null, msgs);
            msgs = basicSetDataFormats(newDataFormats, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DATA_FORMATS, newDataFormats, newDataFormats));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<CamelRedeliveryPolicyFactoryBean> getRedeliveryPolicyProfile() {
        if (redeliveryPolicyProfile == null) {
            redeliveryPolicyProfile = new EObjectContainmentEList<CamelRedeliveryPolicyFactoryBean>(CamelRedeliveryPolicyFactoryBean.class, this, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REDELIVERY_POLICY_PROFILE);
        }
        return redeliveryPolicyProfile;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<OnExceptionDefinition> getOnException() {
        if (onException == null) {
            onException = new EObjectContainmentEList<OnExceptionDefinition>(OnExceptionDefinition.class, this, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_EXCEPTION);
        }
        return onException;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<OnCompletionDefinition> getOnCompletion() {
        if (onCompletion == null) {
            onCompletion = new EObjectContainmentEList<OnCompletionDefinition>(OnCompletionDefinition.class, this, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_COMPLETION);
        }
        return onCompletion;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<InterceptDefinition> getIntercept() {
        if (intercept == null) {
            intercept = new EObjectContainmentEList<InterceptDefinition>(InterceptDefinition.class, this, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT);
        }
        return intercept;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<InterceptFromDefinition> getInterceptFrom() {
        if (interceptFrom == null) {
            interceptFrom = new EObjectContainmentEList<InterceptFromDefinition>(InterceptFromDefinition.class, this, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_FROM);
        }
        return interceptFrom;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<InterceptSendToEndpointDefinition> getInterceptSendToEndpoint() {
        if (interceptSendToEndpoint == null) {
            interceptSendToEndpoint = new EObjectContainmentEList<InterceptSendToEndpointDefinition>(InterceptSendToEndpointDefinition.class, this, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_SEND_TO_ENDPOINT);
        }
        return interceptSendToEndpoint;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RouteDefinition> getRoute() {
        if (route == null) {
            route = new EObjectContainmentEList<RouteDefinition>(RouteDefinition.class, this, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE);
        }
        return route;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getAutoStartup() {
        return autoStartup;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAutoStartup(String newAutoStartup) {
        String oldAutoStartup = autoStartup;
        autoStartup = newAutoStartup;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__AUTO_STARTUP, oldAutoStartup, autoStartup));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDelayer() {
        return delayer;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDelayer(String newDelayer) {
        String oldDelayer = delayer;
        delayer = newDelayer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DELAYER, oldDelayer, delayer));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDependsOn() {
        return dependsOn;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDependsOn(String newDependsOn) {
        String oldDependsOn = dependsOn;
        dependsOn = newDependsOn;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEPENDS_ON, oldDependsOn, dependsOn));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getErrorHandlerRef() {
        return errorHandlerRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setErrorHandlerRef(String newErrorHandlerRef) {
        String oldErrorHandlerRef = errorHandlerRef;
        errorHandlerRef = newErrorHandlerRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER_REF, oldErrorHandlerRef, errorHandlerRef));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getHandleFault() {
        return handleFault;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHandleFault(String newHandleFault) {
        String oldHandleFault = handleFault;
        handleFault = newHandleFault;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__HANDLE_FAULT, oldHandleFault, handleFault));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isLazyLoadTypeConverters() {
        return lazyLoadTypeConverters;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLazyLoadTypeConverters(boolean newLazyLoadTypeConverters) {
        boolean oldLazyLoadTypeConverters = lazyLoadTypeConverters;
        lazyLoadTypeConverters = newLazyLoadTypeConverters;
        boolean oldLazyLoadTypeConvertersESet = lazyLoadTypeConvertersESet;
        lazyLoadTypeConvertersESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LAZY_LOAD_TYPE_CONVERTERS, oldLazyLoadTypeConverters, lazyLoadTypeConverters, !oldLazyLoadTypeConvertersESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetLazyLoadTypeConverters() {
        boolean oldLazyLoadTypeConverters = lazyLoadTypeConverters;
        boolean oldLazyLoadTypeConvertersESet = lazyLoadTypeConvertersESet;
        lazyLoadTypeConverters = LAZY_LOAD_TYPE_CONVERTERS_EDEFAULT;
        lazyLoadTypeConvertersESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LAZY_LOAD_TYPE_CONVERTERS, oldLazyLoadTypeConverters, LAZY_LOAD_TYPE_CONVERTERS_EDEFAULT, oldLazyLoadTypeConvertersESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetLazyLoadTypeConverters() {
        return lazyLoadTypeConvertersESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ShutdownRoute getShutdownRoute() {
        return shutdownRoute;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setShutdownRoute(ShutdownRoute newShutdownRoute) {
        ShutdownRoute oldShutdownRoute = shutdownRoute;
        shutdownRoute = newShutdownRoute == null ? SHUTDOWN_ROUTE_EDEFAULT : newShutdownRoute;
        boolean oldShutdownRouteESet = shutdownRouteESet;
        shutdownRouteESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_ROUTE, oldShutdownRoute, shutdownRoute, !oldShutdownRouteESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetShutdownRoute() {
        ShutdownRoute oldShutdownRoute = shutdownRoute;
        boolean oldShutdownRouteESet = shutdownRouteESet;
        shutdownRoute = SHUTDOWN_ROUTE_EDEFAULT;
        shutdownRouteESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_ROUTE, oldShutdownRoute, SHUTDOWN_ROUTE_EDEFAULT, oldShutdownRouteESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetShutdownRoute() {
        return shutdownRouteESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ShutdownRunningTask getShutdownRunningTask() {
        return shutdownRunningTask;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setShutdownRunningTask(ShutdownRunningTask newShutdownRunningTask) {
        ShutdownRunningTask oldShutdownRunningTask = shutdownRunningTask;
        shutdownRunningTask = newShutdownRunningTask == null ? SHUTDOWN_RUNNING_TASK_EDEFAULT : newShutdownRunningTask;
        boolean oldShutdownRunningTaskESet = shutdownRunningTaskESet;
        shutdownRunningTaskESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_RUNNING_TASK, oldShutdownRunningTask, shutdownRunningTask, !oldShutdownRunningTaskESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetShutdownRunningTask() {
        ShutdownRunningTask oldShutdownRunningTask = shutdownRunningTask;
        boolean oldShutdownRunningTaskESet = shutdownRunningTaskESet;
        shutdownRunningTask = SHUTDOWN_RUNNING_TASK_EDEFAULT;
        shutdownRunningTaskESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_RUNNING_TASK, oldShutdownRunningTask, SHUTDOWN_RUNNING_TASK_EDEFAULT, oldShutdownRunningTaskESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetShutdownRunningTask() {
        return shutdownRunningTaskESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getStreamCache() {
        return streamCache;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStreamCache(String newStreamCache) {
        String oldStreamCache = streamCache;
        streamCache = newStreamCache;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STREAM_CACHE, oldStreamCache, streamCache));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getTrace() {
        return trace;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTrace(String newTrace) {
        String oldTrace = trace;
        trace = newTrace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE, oldTrace, trace));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getUseBreadcrumb() {
        return useBreadcrumb;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUseBreadcrumb(String newUseBreadcrumb) {
        String oldUseBreadcrumb = useBreadcrumb;
        useBreadcrumb = newUseBreadcrumb;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_BREADCRUMB, oldUseBreadcrumb, useBreadcrumb));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getUseMDCLogging() {
        return useMDCLogging;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUseMDCLogging(String newUseMDCLogging) {
        String oldUseMDCLogging = useMDCLogging;
        useMDCLogging = newUseMDCLogging;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_MDC_LOGGING, oldUseMDCLogging, useMDCLogging));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTIES:
                return basicSetProperties(null, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTY_PLACEHOLDER:
                return basicSetPropertyPlaceholder(null, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE_SCAN:
                return basicSetPackageScan(null, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONTEXT_SCAN:
                return basicSetContextScan(null, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__JMX_AGENT:
                return basicSetJmxAgent(null, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TEMPLATE:
                return ((InternalEList<?>)getTemplate()).basicRemove(otherEnd, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONSUMER_TEMPLATE:
                return ((InternalEList<?>)getConsumerTemplate()).basicRemove(otherEnd, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROXY:
                return ((InternalEList<?>)getProxy()).basicRemove(otherEnd, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__EXPORT:
                return ((InternalEList<?>)getExport()).basicRemove(otherEnd, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER:
                return ((InternalEList<?>)getErrorHandler()).basicRemove(otherEnd, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_BUILDER:
                return ((InternalEList<?>)getRouteBuilder()).basicRemove(otherEnd, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTEXT_REF:
                return ((InternalEList<?>)getRouteContextRef()).basicRemove(otherEnd, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL_PROFILE:
                return ((InternalEList<?>)getThreadPoolProfile()).basicRemove(otherEnd, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL:
                return ((InternalEList<?>)getThreadPool()).basicRemove(otherEnd, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ENDPOINT:
                return ((InternalEList<?>)getEndpoint()).basicRemove(otherEnd, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DATA_FORMATS:
                return basicSetDataFormats(null, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REDELIVERY_POLICY_PROFILE:
                return ((InternalEList<?>)getRedeliveryPolicyProfile()).basicRemove(otherEnd, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_EXCEPTION:
                return ((InternalEList<?>)getOnException()).basicRemove(otherEnd, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_COMPLETION:
                return ((InternalEList<?>)getOnCompletion()).basicRemove(otherEnd, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT:
                return ((InternalEList<?>)getIntercept()).basicRemove(otherEnd, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_FROM:
                return ((InternalEList<?>)getInterceptFrom()).basicRemove(otherEnd, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_SEND_TO_ENDPOINT:
                return ((InternalEList<?>)getInterceptSendToEndpoint()).basicRemove(otherEnd, msgs);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE:
                return ((InternalEList<?>)getRoute()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTIES:
                return getProperties();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTY_PLACEHOLDER:
                return getPropertyPlaceholder();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE:
                return getPackage();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE_SCAN:
                return getPackageScan();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONTEXT_SCAN:
                return getContextScan();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__JMX_AGENT:
                return getJmxAgent();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TEMPLATE:
                return getTemplate();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONSUMER_TEMPLATE:
                return getConsumerTemplate();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROXY:
                return getProxy();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__EXPORT:
                return getExport();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER:
                return getErrorHandler();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_BUILDER:
                return getRouteBuilder();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTEXT_REF:
                return getRouteContextRef();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL_PROFILE:
                return getThreadPoolProfile();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL:
                return getThreadPool();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ENDPOINT:
                return getEndpoint();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DATA_FORMATS:
                return getDataFormats();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REDELIVERY_POLICY_PROFILE:
                return getRedeliveryPolicyProfile();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_EXCEPTION:
                return getOnException();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_COMPLETION:
                return getOnCompletion();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT:
                return getIntercept();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_FROM:
                return getInterceptFrom();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_SEND_TO_ENDPOINT:
                return getInterceptSendToEndpoint();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE:
                return getRoute();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__AUTO_STARTUP:
                return getAutoStartup();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DELAYER:
                return getDelayer();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEPENDS_ON:
                return getDependsOn();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER_REF:
                return getErrorHandlerRef();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__HANDLE_FAULT:
                return getHandleFault();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LAZY_LOAD_TYPE_CONVERTERS:
                return isLazyLoadTypeConverters();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_ROUTE:
                return getShutdownRoute();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_RUNNING_TASK:
                return getShutdownRunningTask();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STREAM_CACHE:
                return getStreamCache();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE:
                return getTrace();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_BREADCRUMB:
                return getUseBreadcrumb();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_MDC_LOGGING:
                return getUseMDCLogging();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTIES:
                setProperties((PropertiesDefinition)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTY_PLACEHOLDER:
                setPropertyPlaceholder((CamelPropertyPlaceholderDefinition)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE:
                getPackage().clear();
                getPackage().addAll((Collection<? extends String>)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE_SCAN:
                setPackageScan((PackageScanDefinition)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONTEXT_SCAN:
                setContextScan((ContextScanDefinition)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__JMX_AGENT:
                setJmxAgent((CamelJMXAgentDefinition)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TEMPLATE:
                getTemplate().clear();
                getTemplate().addAll((Collection<? extends CamelProducerTemplateFactoryBean>)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONSUMER_TEMPLATE:
                getConsumerTemplate().clear();
                getConsumerTemplate().addAll((Collection<? extends CamelConsumerTemplateFactoryBean>)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROXY:
                getProxy().clear();
                getProxy().addAll((Collection<? extends CamelProxyFactoryDefinition>)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__EXPORT:
                getExport().clear();
                getExport().addAll((Collection<? extends CamelServiceExporterDefinition>)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER:
                getErrorHandler().clear();
                getErrorHandler().addAll((Collection<? extends ErrorHandlerDefinition>)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_BUILDER:
                getRouteBuilder().clear();
                getRouteBuilder().addAll((Collection<? extends RouteBuilderDefinition>)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTEXT_REF:
                getRouteContextRef().clear();
                getRouteContextRef().addAll((Collection<? extends RouteContextRefDefinition>)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL_PROFILE:
                getThreadPoolProfile().clear();
                getThreadPoolProfile().addAll((Collection<? extends ThreadPoolProfileDefinition>)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL:
                getThreadPool().clear();
                getThreadPool().addAll((Collection<? extends CamelThreadPoolFactoryBean>)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ENDPOINT:
                getEndpoint().clear();
                getEndpoint().addAll((Collection<? extends CamelEndpointFactoryBean>)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DATA_FORMATS:
                setDataFormats((DataFormatsDefinition)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REDELIVERY_POLICY_PROFILE:
                getRedeliveryPolicyProfile().clear();
                getRedeliveryPolicyProfile().addAll((Collection<? extends CamelRedeliveryPolicyFactoryBean>)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_EXCEPTION:
                getOnException().clear();
                getOnException().addAll((Collection<? extends OnExceptionDefinition>)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_COMPLETION:
                getOnCompletion().clear();
                getOnCompletion().addAll((Collection<? extends OnCompletionDefinition>)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT:
                getIntercept().clear();
                getIntercept().addAll((Collection<? extends InterceptDefinition>)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_FROM:
                getInterceptFrom().clear();
                getInterceptFrom().addAll((Collection<? extends InterceptFromDefinition>)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_SEND_TO_ENDPOINT:
                getInterceptSendToEndpoint().clear();
                getInterceptSendToEndpoint().addAll((Collection<? extends InterceptSendToEndpointDefinition>)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE:
                getRoute().clear();
                getRoute().addAll((Collection<? extends RouteDefinition>)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__AUTO_STARTUP:
                setAutoStartup((String)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DELAYER:
                setDelayer((String)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEPENDS_ON:
                setDependsOn((String)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER_REF:
                setErrorHandlerRef((String)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__HANDLE_FAULT:
                setHandleFault((String)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LAZY_LOAD_TYPE_CONVERTERS:
                setLazyLoadTypeConverters((Boolean)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_ROUTE:
                setShutdownRoute((ShutdownRoute)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_RUNNING_TASK:
                setShutdownRunningTask((ShutdownRunningTask)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STREAM_CACHE:
                setStreamCache((String)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE:
                setTrace((String)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_BREADCRUMB:
                setUseBreadcrumb((String)newValue);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_MDC_LOGGING:
                setUseMDCLogging((String)newValue);
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
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTIES:
                setProperties((PropertiesDefinition)null);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTY_PLACEHOLDER:
                setPropertyPlaceholder((CamelPropertyPlaceholderDefinition)null);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE:
                getPackage().clear();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE_SCAN:
                setPackageScan((PackageScanDefinition)null);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONTEXT_SCAN:
                setContextScan((ContextScanDefinition)null);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__JMX_AGENT:
                setJmxAgent((CamelJMXAgentDefinition)null);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GROUP:
                getGroup().clear();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TEMPLATE:
                getTemplate().clear();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONSUMER_TEMPLATE:
                getConsumerTemplate().clear();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROXY:
                getProxy().clear();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__EXPORT:
                getExport().clear();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER:
                getErrorHandler().clear();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_BUILDER:
                getRouteBuilder().clear();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTEXT_REF:
                getRouteContextRef().clear();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL_PROFILE:
                getThreadPoolProfile().clear();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL:
                getThreadPool().clear();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ENDPOINT:
                getEndpoint().clear();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DATA_FORMATS:
                setDataFormats((DataFormatsDefinition)null);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REDELIVERY_POLICY_PROFILE:
                getRedeliveryPolicyProfile().clear();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_EXCEPTION:
                getOnException().clear();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_COMPLETION:
                getOnCompletion().clear();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT:
                getIntercept().clear();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_FROM:
                getInterceptFrom().clear();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_SEND_TO_ENDPOINT:
                getInterceptSendToEndpoint().clear();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE:
                getRoute().clear();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__AUTO_STARTUP:
                setAutoStartup(AUTO_STARTUP_EDEFAULT);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DELAYER:
                setDelayer(DELAYER_EDEFAULT);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEPENDS_ON:
                setDependsOn(DEPENDS_ON_EDEFAULT);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER_REF:
                setErrorHandlerRef(ERROR_HANDLER_REF_EDEFAULT);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__HANDLE_FAULT:
                setHandleFault(HANDLE_FAULT_EDEFAULT);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LAZY_LOAD_TYPE_CONVERTERS:
                unsetLazyLoadTypeConverters();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_ROUTE:
                unsetShutdownRoute();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_RUNNING_TASK:
                unsetShutdownRunningTask();
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STREAM_CACHE:
                setStreamCache(STREAM_CACHE_EDEFAULT);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE:
                setTrace(TRACE_EDEFAULT);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_BREADCRUMB:
                setUseBreadcrumb(USE_BREADCRUMB_EDEFAULT);
                return;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_MDC_LOGGING:
                setUseMDCLogging(USE_MDC_LOGGING_EDEFAULT);
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
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTIES:
                return properties != null;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROPERTY_PLACEHOLDER:
                return propertyPlaceholder != null;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE:
                return package_ != null && !package_.isEmpty();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PACKAGE_SCAN:
                return packageScan != null;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONTEXT_SCAN:
                return contextScan != null;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__JMX_AGENT:
                return jmxAgent != null;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__GROUP:
                return group != null && !group.isEmpty();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TEMPLATE:
                return !getTemplate().isEmpty();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__CONSUMER_TEMPLATE:
                return !getConsumerTemplate().isEmpty();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__PROXY:
                return !getProxy().isEmpty();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__EXPORT:
                return !getExport().isEmpty();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER:
                return !getErrorHandler().isEmpty();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_BUILDER:
                return routeBuilder != null && !routeBuilder.isEmpty();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE_CONTEXT_REF:
                return routeContextRef != null && !routeContextRef.isEmpty();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL_PROFILE:
                return threadPoolProfile != null && !threadPoolProfile.isEmpty();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__THREAD_POOL:
                return threadPool != null && !threadPool.isEmpty();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ENDPOINT:
                return endpoint != null && !endpoint.isEmpty();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DATA_FORMATS:
                return dataFormats != null;
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__REDELIVERY_POLICY_PROFILE:
                return redeliveryPolicyProfile != null && !redeliveryPolicyProfile.isEmpty();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_EXCEPTION:
                return onException != null && !onException.isEmpty();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ON_COMPLETION:
                return onCompletion != null && !onCompletion.isEmpty();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT:
                return intercept != null && !intercept.isEmpty();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_FROM:
                return interceptFrom != null && !interceptFrom.isEmpty();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__INTERCEPT_SEND_TO_ENDPOINT:
                return interceptSendToEndpoint != null && !interceptSendToEndpoint.isEmpty();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ROUTE:
                return route != null && !route.isEmpty();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__AUTO_STARTUP:
                return AUTO_STARTUP_EDEFAULT == null ? autoStartup != null : !AUTO_STARTUP_EDEFAULT.equals(autoStartup);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DELAYER:
                return DELAYER_EDEFAULT == null ? delayer != null : !DELAYER_EDEFAULT.equals(delayer);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__DEPENDS_ON:
                return DEPENDS_ON_EDEFAULT == null ? dependsOn != null : !DEPENDS_ON_EDEFAULT.equals(dependsOn);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__ERROR_HANDLER_REF:
                return ERROR_HANDLER_REF_EDEFAULT == null ? errorHandlerRef != null : !ERROR_HANDLER_REF_EDEFAULT.equals(errorHandlerRef);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__HANDLE_FAULT:
                return HANDLE_FAULT_EDEFAULT == null ? handleFault != null : !HANDLE_FAULT_EDEFAULT.equals(handleFault);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__LAZY_LOAD_TYPE_CONVERTERS:
                return isSetLazyLoadTypeConverters();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_ROUTE:
                return isSetShutdownRoute();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__SHUTDOWN_RUNNING_TASK:
                return isSetShutdownRunningTask();
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__STREAM_CACHE:
                return STREAM_CACHE_EDEFAULT == null ? streamCache != null : !STREAM_CACHE_EDEFAULT.equals(streamCache);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__TRACE:
                return TRACE_EDEFAULT == null ? trace != null : !TRACE_EDEFAULT.equals(trace);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_BREADCRUMB:
                return USE_BREADCRUMB_EDEFAULT == null ? useBreadcrumb != null : !USE_BREADCRUMB_EDEFAULT.equals(useBreadcrumb);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN__USE_MDC_LOGGING:
                return USE_MDC_LOGGING_EDEFAULT == null ? useMDCLogging != null : !USE_MDC_LOGGING_EDEFAULT.equals(useMDCLogging);
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
        result.append(" (package: ");
        result.append(package_);
        result.append(", group: ");
        result.append(group);
        result.append(", autoStartup: ");
        result.append(autoStartup);
        result.append(", delayer: ");
        result.append(delayer);
        result.append(", dependsOn: ");
        result.append(dependsOn);
        result.append(", errorHandlerRef: ");
        result.append(errorHandlerRef);
        result.append(", handleFault: ");
        result.append(handleFault);
        result.append(", lazyLoadTypeConverters: ");
        if (lazyLoadTypeConvertersESet) result.append(lazyLoadTypeConverters); else result.append("<unset>");
        result.append(", shutdownRoute: ");
        if (shutdownRouteESet) result.append(shutdownRoute); else result.append("<unset>");
        result.append(", shutdownRunningTask: ");
        if (shutdownRunningTaskESet) result.append(shutdownRunningTask); else result.append("<unset>");
        result.append(", streamCache: ");
        result.append(streamCache);
        result.append(", trace: ");
        result.append(trace);
        result.append(", useBreadcrumb: ");
        result.append(useBreadcrumb);
        result.append(", useMDCLogging: ");
        result.append(useMDCLogging);
        result.append(')');
        return result.toString();
    }

} //CamelContextFactoryBeanImpl
