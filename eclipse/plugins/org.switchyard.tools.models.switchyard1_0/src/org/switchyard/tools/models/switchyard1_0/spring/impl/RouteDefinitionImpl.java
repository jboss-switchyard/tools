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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.AopDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.BeanDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.CatchDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ChoiceDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ConvertBodyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.DelayDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.DynamicRouterDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.EnrichDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.FilterDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.FinallyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.FromDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.IdempotentConsumerDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.InOnlyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.InOutDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.InterceptDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.InterceptFromDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.InterceptSendToEndpointDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.LoadBalanceDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.LogDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.LoopDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.OnCompletionDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.OnExceptionDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.OtherwiseDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.PipelineDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.PolicyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.PollEnrichDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ProcessDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RecipientListDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RemoveHeaderDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RemoveHeadersDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RemovePropertyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RollbackDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RoutingSlipDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SamplingDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SetBodyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SetExchangePatternDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SetFaultBodyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SetHeaderDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SetOutHeaderDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SetPropertyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ShutdownRoute;
import org.switchyard.tools.models.switchyard1_0.spring.ShutdownRunningTask;
import org.switchyard.tools.models.switchyard1_0.spring.SortDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SplitDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.StopDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ThrowExceptionDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ToDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.TransactedDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.TransformDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.TryDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.UnmarshalDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ValidateDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.WhenDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getAop <em>Aop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getInOnly <em>In Only</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getInOut <em>In Out</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getInterceptToEndpoint <em>Intercept To Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getLog <em>Log</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getSample <em>Sample</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getSetFaultBody <em>Set Fault Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getSetOutHeader <em>Set Out Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getAutoStartup <em>Auto Startup</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getDelayer <em>Delayer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getErrorHandlerRef <em>Error Handler Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getHandleFault <em>Handle Fault</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getRoutePolicyRef <em>Route Policy Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getShutdownRoute <em>Shutdown Route</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getShutdownRunningTask <em>Shutdown Running Task</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getStartupOrder <em>Startup Order</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getStreamCache <em>Stream Cache</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getTrace <em>Trace</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteDefinitionImpl#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouteDefinitionImpl extends ProcessorDefinitionImpl implements RouteDefinition {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<FromDefinition> from;

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
	 * The default value of the '{@link #getGroup1() <em>Group1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup1()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup1() <em>Group1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup1()
	 * @generated
	 * @ordered
	 */
	protected String group1 = GROUP1_EDEFAULT;

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
	 * The default value of the '{@link #getRoutePolicyRef() <em>Route Policy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutePolicyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTE_POLICY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoutePolicyRef() <em>Route Policy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutePolicyRef()
	 * @generated
	 * @ordered
	 */
	protected String routePolicyRef = ROUTE_POLICY_REF_EDEFAULT;

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
	 * The default value of the '{@link #getStartupOrder() <em>Startup Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int STARTUP_ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartupOrder() <em>Startup Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupOrder()
	 * @generated
	 * @ordered
	 */
	protected int startupOrder = STARTUP_ORDER_EDEFAULT;

	/**
	 * This is true if the Startup Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startupOrderESet;

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
	 * The cached value of the '{@link #getAnyAttribute1() <em>Any Attribute1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getRouteDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FromDefinition> getFrom() {
		if (from == null) {
			from = new EObjectContainmentEList<FromDefinition>(FromDefinition.class, this, SpringPackage.ROUTE_DEFINITION__FROM);
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, SpringPackage.ROUTE_DEFINITION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AopDefinition> getAop() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Aop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregateDefinition> getAggregate() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Aggregate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BeanDefinition> getBean() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Bean());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CatchDefinition> getDoCatch() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_DoCatch());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WhenDefinition> getWhen() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_When());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChoiceDefinition> getChoice() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Choice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherwiseDefinition> getOtherwise() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Otherwise());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConvertBodyDefinition> getConvertBodyTo() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_ConvertBodyTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelayDefinition> getDelay() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Delay());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicRouterDefinition> getDynamicRouter() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_DynamicRouter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnrichDefinition> getEnrich() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Enrich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterDefinition> getFilter() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Filter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FinallyDefinition> getDoFinally() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_DoFinally());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdempotentConsumerDefinition> getIdempotentConsumer() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_IdempotentConsumer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InOnlyDefinition> getInOnly() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_InOnly());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InOutDefinition> getInOut() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_InOut());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterceptDefinition> getIntercept() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Intercept());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterceptFromDefinition> getInterceptFrom() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_InterceptFrom());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterceptSendToEndpointDefinition> getInterceptToEndpoint() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_InterceptToEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadBalanceDefinition> getLoadBalance() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_LoadBalance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogDefinition> getLog() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Log());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoopDefinition> getLoop() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Loop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarshalDefinition> getMarshal() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Marshal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MulticastDefinition> getMulticast() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Multicast());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnCompletionDefinition> getOnCompletion() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_OnCompletion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnExceptionDefinition> getOnException() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_OnException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PipelineDefinition> getPipeline() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Pipeline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolicyDefinition> getPolicy() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Policy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PollEnrichDefinition> getPollEnrich() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_PollEnrich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessDefinition> getProcess() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Process());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecipientListDefinition> getRecipientList() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_RecipientList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemoveHeaderDefinition> getRemoveHeader() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_RemoveHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemoveHeadersDefinition> getRemoveHeaders() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_RemoveHeaders());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemovePropertyDefinition> getRemoveProperty() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_RemoveProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResequenceDefinition> getResequence() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Resequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RollbackDefinition> getRollback() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Rollback());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RouteDefinition> getRoute() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Route());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoutingSlipDefinition> getRoutingSlip() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_RoutingSlip());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SamplingDefinition> getSample() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Sample());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetBodyDefinition> getSetBody() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_SetBody());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetExchangePatternDefinition> getSetExchangePattern() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_SetExchangePattern());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetFaultBodyDefinition> getSetFaultBody() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_SetFaultBody());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetHeaderDefinition> getSetHeader() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_SetHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetOutHeaderDefinition> getSetOutHeader() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_SetOutHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetPropertyDefinition> getSetProperty() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_SetProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortDefinition> getSort() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Sort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SplitDefinition> getSplit() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Split());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StopDefinition> getStop() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Stop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThreadsDefinition> getThreads() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Threads());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThrottleDefinition> getThrottle() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Throttle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThrowExceptionDefinition> getThrowException() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_ThrowException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToDefinition> getTo() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_To());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransactedDefinition> getTransacted() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Transacted());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformDefinition> getTransform() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Transform());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TryDefinition> getDoTry() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_DoTry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnmarshalDefinition> getUnmarshal() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Unmarshal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValidateDefinition> getValidate() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_Validate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WireTapDefinition> getWireTap() {
		return getGroup().list(SpringPackage.eINSTANCE.getRouteDefinition_WireTap());
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ROUTE_DEFINITION__AUTO_STARTUP, oldAutoStartup, autoStartup));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ROUTE_DEFINITION__DELAYER, oldDelayer, delayer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ROUTE_DEFINITION__ERROR_HANDLER_REF, oldErrorHandlerRef, errorHandlerRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroup1() {
		return group1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup1(String newGroup1) {
		String oldGroup1 = group1;
		group1 = newGroup1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ROUTE_DEFINITION__GROUP1, oldGroup1, group1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ROUTE_DEFINITION__HANDLE_FAULT, oldHandleFault, handleFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoutePolicyRef() {
		return routePolicyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutePolicyRef(String newRoutePolicyRef) {
		String oldRoutePolicyRef = routePolicyRef;
		routePolicyRef = newRoutePolicyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ROUTE_DEFINITION__ROUTE_POLICY_REF, oldRoutePolicyRef, routePolicyRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ROUTE_DEFINITION__SHUTDOWN_ROUTE, oldShutdownRoute, shutdownRoute, !oldShutdownRouteESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.ROUTE_DEFINITION__SHUTDOWN_ROUTE, oldShutdownRoute, SHUTDOWN_ROUTE_EDEFAULT, oldShutdownRouteESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ROUTE_DEFINITION__SHUTDOWN_RUNNING_TASK, oldShutdownRunningTask, shutdownRunningTask, !oldShutdownRunningTaskESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.ROUTE_DEFINITION__SHUTDOWN_RUNNING_TASK, oldShutdownRunningTask, SHUTDOWN_RUNNING_TASK_EDEFAULT, oldShutdownRunningTaskESet));
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
	public int getStartupOrder() {
		return startupOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartupOrder(int newStartupOrder) {
		int oldStartupOrder = startupOrder;
		startupOrder = newStartupOrder;
		boolean oldStartupOrderESet = startupOrderESet;
		startupOrderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ROUTE_DEFINITION__STARTUP_ORDER, oldStartupOrder, startupOrder, !oldStartupOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartupOrder() {
		int oldStartupOrder = startupOrder;
		boolean oldStartupOrderESet = startupOrderESet;
		startupOrder = STARTUP_ORDER_EDEFAULT;
		startupOrderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.ROUTE_DEFINITION__STARTUP_ORDER, oldStartupOrder, STARTUP_ORDER_EDEFAULT, oldStartupOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartupOrder() {
		return startupOrderESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ROUTE_DEFINITION__STREAM_CACHE, oldStreamCache, streamCache));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ROUTE_DEFINITION__TRACE, oldTrace, trace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute1() {
		if (anyAttribute1 == null) {
			anyAttribute1 = new BasicFeatureMap(this, SpringPackage.ROUTE_DEFINITION__ANY_ATTRIBUTE1);
		}
		return anyAttribute1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpringPackage.ROUTE_DEFINITION__FROM:
				return ((InternalEList<?>)getFrom()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__AOP:
				return ((InternalEList<?>)getAop()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__AGGREGATE:
				return ((InternalEList<?>)getAggregate()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__BEAN:
				return ((InternalEList<?>)getBean()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__DO_CATCH:
				return ((InternalEList<?>)getDoCatch()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__WHEN:
				return ((InternalEList<?>)getWhen()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__CHOICE:
				return ((InternalEList<?>)getChoice()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__OTHERWISE:
				return ((InternalEList<?>)getOtherwise()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__CONVERT_BODY_TO:
				return ((InternalEList<?>)getConvertBodyTo()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__DELAY:
				return ((InternalEList<?>)getDelay()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__DYNAMIC_ROUTER:
				return ((InternalEList<?>)getDynamicRouter()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__ENRICH:
				return ((InternalEList<?>)getEnrich()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__DO_FINALLY:
				return ((InternalEList<?>)getDoFinally()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__IDEMPOTENT_CONSUMER:
				return ((InternalEList<?>)getIdempotentConsumer()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__IN_ONLY:
				return ((InternalEList<?>)getInOnly()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__IN_OUT:
				return ((InternalEList<?>)getInOut()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__INTERCEPT:
				return ((InternalEList<?>)getIntercept()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__INTERCEPT_FROM:
				return ((InternalEList<?>)getInterceptFrom()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__INTERCEPT_TO_ENDPOINT:
				return ((InternalEList<?>)getInterceptToEndpoint()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__LOAD_BALANCE:
				return ((InternalEList<?>)getLoadBalance()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__LOG:
				return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__LOOP:
				return ((InternalEList<?>)getLoop()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__MARSHAL:
				return ((InternalEList<?>)getMarshal()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__MULTICAST:
				return ((InternalEList<?>)getMulticast()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__ON_COMPLETION:
				return ((InternalEList<?>)getOnCompletion()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__ON_EXCEPTION:
				return ((InternalEList<?>)getOnException()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__PIPELINE:
				return ((InternalEList<?>)getPipeline()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__POLICY:
				return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__POLL_ENRICH:
				return ((InternalEList<?>)getPollEnrich()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__RECIPIENT_LIST:
				return ((InternalEList<?>)getRecipientList()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__REMOVE_HEADER:
				return ((InternalEList<?>)getRemoveHeader()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__REMOVE_HEADERS:
				return ((InternalEList<?>)getRemoveHeaders()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__REMOVE_PROPERTY:
				return ((InternalEList<?>)getRemoveProperty()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__RESEQUENCE:
				return ((InternalEList<?>)getResequence()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__ROLLBACK:
				return ((InternalEList<?>)getRollback()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__ROUTE:
				return ((InternalEList<?>)getRoute()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__ROUTING_SLIP:
				return ((InternalEList<?>)getRoutingSlip()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__SAMPLE:
				return ((InternalEList<?>)getSample()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__SET_BODY:
				return ((InternalEList<?>)getSetBody()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__SET_EXCHANGE_PATTERN:
				return ((InternalEList<?>)getSetExchangePattern()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__SET_FAULT_BODY:
				return ((InternalEList<?>)getSetFaultBody()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__SET_HEADER:
				return ((InternalEList<?>)getSetHeader()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__SET_OUT_HEADER:
				return ((InternalEList<?>)getSetOutHeader()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__SET_PROPERTY:
				return ((InternalEList<?>)getSetProperty()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__SORT:
				return ((InternalEList<?>)getSort()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__SPLIT:
				return ((InternalEList<?>)getSplit()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__STOP:
				return ((InternalEList<?>)getStop()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__THREADS:
				return ((InternalEList<?>)getThreads()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__THROTTLE:
				return ((InternalEList<?>)getThrottle()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__THROW_EXCEPTION:
				return ((InternalEList<?>)getThrowException()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__TO:
				return ((InternalEList<?>)getTo()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__TRANSACTED:
				return ((InternalEList<?>)getTransacted()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__TRANSFORM:
				return ((InternalEList<?>)getTransform()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__DO_TRY:
				return ((InternalEList<?>)getDoTry()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__UNMARSHAL:
				return ((InternalEList<?>)getUnmarshal()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__VALIDATE:
				return ((InternalEList<?>)getValidate()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__WIRE_TAP:
				return ((InternalEList<?>)getWireTap()).basicRemove(otherEnd, msgs);
			case SpringPackage.ROUTE_DEFINITION__ANY_ATTRIBUTE1:
				return ((InternalEList<?>)getAnyAttribute1()).basicRemove(otherEnd, msgs);
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
			case SpringPackage.ROUTE_DEFINITION__FROM:
				return getFrom();
			case SpringPackage.ROUTE_DEFINITION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SpringPackage.ROUTE_DEFINITION__AOP:
				return getAop();
			case SpringPackage.ROUTE_DEFINITION__AGGREGATE:
				return getAggregate();
			case SpringPackage.ROUTE_DEFINITION__BEAN:
				return getBean();
			case SpringPackage.ROUTE_DEFINITION__DO_CATCH:
				return getDoCatch();
			case SpringPackage.ROUTE_DEFINITION__WHEN:
				return getWhen();
			case SpringPackage.ROUTE_DEFINITION__CHOICE:
				return getChoice();
			case SpringPackage.ROUTE_DEFINITION__OTHERWISE:
				return getOtherwise();
			case SpringPackage.ROUTE_DEFINITION__CONVERT_BODY_TO:
				return getConvertBodyTo();
			case SpringPackage.ROUTE_DEFINITION__DELAY:
				return getDelay();
			case SpringPackage.ROUTE_DEFINITION__DYNAMIC_ROUTER:
				return getDynamicRouter();
			case SpringPackage.ROUTE_DEFINITION__ENRICH:
				return getEnrich();
			case SpringPackage.ROUTE_DEFINITION__FILTER:
				return getFilter();
			case SpringPackage.ROUTE_DEFINITION__DO_FINALLY:
				return getDoFinally();
			case SpringPackage.ROUTE_DEFINITION__IDEMPOTENT_CONSUMER:
				return getIdempotentConsumer();
			case SpringPackage.ROUTE_DEFINITION__IN_ONLY:
				return getInOnly();
			case SpringPackage.ROUTE_DEFINITION__IN_OUT:
				return getInOut();
			case SpringPackage.ROUTE_DEFINITION__INTERCEPT:
				return getIntercept();
			case SpringPackage.ROUTE_DEFINITION__INTERCEPT_FROM:
				return getInterceptFrom();
			case SpringPackage.ROUTE_DEFINITION__INTERCEPT_TO_ENDPOINT:
				return getInterceptToEndpoint();
			case SpringPackage.ROUTE_DEFINITION__LOAD_BALANCE:
				return getLoadBalance();
			case SpringPackage.ROUTE_DEFINITION__LOG:
				return getLog();
			case SpringPackage.ROUTE_DEFINITION__LOOP:
				return getLoop();
			case SpringPackage.ROUTE_DEFINITION__MARSHAL:
				return getMarshal();
			case SpringPackage.ROUTE_DEFINITION__MULTICAST:
				return getMulticast();
			case SpringPackage.ROUTE_DEFINITION__ON_COMPLETION:
				return getOnCompletion();
			case SpringPackage.ROUTE_DEFINITION__ON_EXCEPTION:
				return getOnException();
			case SpringPackage.ROUTE_DEFINITION__PIPELINE:
				return getPipeline();
			case SpringPackage.ROUTE_DEFINITION__POLICY:
				return getPolicy();
			case SpringPackage.ROUTE_DEFINITION__POLL_ENRICH:
				return getPollEnrich();
			case SpringPackage.ROUTE_DEFINITION__PROCESS:
				return getProcess();
			case SpringPackage.ROUTE_DEFINITION__RECIPIENT_LIST:
				return getRecipientList();
			case SpringPackage.ROUTE_DEFINITION__REMOVE_HEADER:
				return getRemoveHeader();
			case SpringPackage.ROUTE_DEFINITION__REMOVE_HEADERS:
				return getRemoveHeaders();
			case SpringPackage.ROUTE_DEFINITION__REMOVE_PROPERTY:
				return getRemoveProperty();
			case SpringPackage.ROUTE_DEFINITION__RESEQUENCE:
				return getResequence();
			case SpringPackage.ROUTE_DEFINITION__ROLLBACK:
				return getRollback();
			case SpringPackage.ROUTE_DEFINITION__ROUTE:
				return getRoute();
			case SpringPackage.ROUTE_DEFINITION__ROUTING_SLIP:
				return getRoutingSlip();
			case SpringPackage.ROUTE_DEFINITION__SAMPLE:
				return getSample();
			case SpringPackage.ROUTE_DEFINITION__SET_BODY:
				return getSetBody();
			case SpringPackage.ROUTE_DEFINITION__SET_EXCHANGE_PATTERN:
				return getSetExchangePattern();
			case SpringPackage.ROUTE_DEFINITION__SET_FAULT_BODY:
				return getSetFaultBody();
			case SpringPackage.ROUTE_DEFINITION__SET_HEADER:
				return getSetHeader();
			case SpringPackage.ROUTE_DEFINITION__SET_OUT_HEADER:
				return getSetOutHeader();
			case SpringPackage.ROUTE_DEFINITION__SET_PROPERTY:
				return getSetProperty();
			case SpringPackage.ROUTE_DEFINITION__SORT:
				return getSort();
			case SpringPackage.ROUTE_DEFINITION__SPLIT:
				return getSplit();
			case SpringPackage.ROUTE_DEFINITION__STOP:
				return getStop();
			case SpringPackage.ROUTE_DEFINITION__THREADS:
				return getThreads();
			case SpringPackage.ROUTE_DEFINITION__THROTTLE:
				return getThrottle();
			case SpringPackage.ROUTE_DEFINITION__THROW_EXCEPTION:
				return getThrowException();
			case SpringPackage.ROUTE_DEFINITION__TO:
				return getTo();
			case SpringPackage.ROUTE_DEFINITION__TRANSACTED:
				return getTransacted();
			case SpringPackage.ROUTE_DEFINITION__TRANSFORM:
				return getTransform();
			case SpringPackage.ROUTE_DEFINITION__DO_TRY:
				return getDoTry();
			case SpringPackage.ROUTE_DEFINITION__UNMARSHAL:
				return getUnmarshal();
			case SpringPackage.ROUTE_DEFINITION__VALIDATE:
				return getValidate();
			case SpringPackage.ROUTE_DEFINITION__WIRE_TAP:
				return getWireTap();
			case SpringPackage.ROUTE_DEFINITION__AUTO_STARTUP:
				return getAutoStartup();
			case SpringPackage.ROUTE_DEFINITION__DELAYER:
				return getDelayer();
			case SpringPackage.ROUTE_DEFINITION__ERROR_HANDLER_REF:
				return getErrorHandlerRef();
			case SpringPackage.ROUTE_DEFINITION__GROUP1:
				return getGroup1();
			case SpringPackage.ROUTE_DEFINITION__HANDLE_FAULT:
				return getHandleFault();
			case SpringPackage.ROUTE_DEFINITION__ROUTE_POLICY_REF:
				return getRoutePolicyRef();
			case SpringPackage.ROUTE_DEFINITION__SHUTDOWN_ROUTE:
				return getShutdownRoute();
			case SpringPackage.ROUTE_DEFINITION__SHUTDOWN_RUNNING_TASK:
				return getShutdownRunningTask();
			case SpringPackage.ROUTE_DEFINITION__STARTUP_ORDER:
				return getStartupOrder();
			case SpringPackage.ROUTE_DEFINITION__STREAM_CACHE:
				return getStreamCache();
			case SpringPackage.ROUTE_DEFINITION__TRACE:
				return getTrace();
			case SpringPackage.ROUTE_DEFINITION__ANY_ATTRIBUTE1:
				if (coreType) return getAnyAttribute1();
				return ((FeatureMap.Internal)getAnyAttribute1()).getWrapper();
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
			case SpringPackage.ROUTE_DEFINITION__FROM:
				getFrom().clear();
				getFrom().addAll((Collection<? extends FromDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__AOP:
				getAop().clear();
				getAop().addAll((Collection<? extends AopDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__AGGREGATE:
				getAggregate().clear();
				getAggregate().addAll((Collection<? extends AggregateDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__BEAN:
				getBean().clear();
				getBean().addAll((Collection<? extends BeanDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__DO_CATCH:
				getDoCatch().clear();
				getDoCatch().addAll((Collection<? extends CatchDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__WHEN:
				getWhen().clear();
				getWhen().addAll((Collection<? extends WhenDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__CHOICE:
				getChoice().clear();
				getChoice().addAll((Collection<? extends ChoiceDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__OTHERWISE:
				getOtherwise().clear();
				getOtherwise().addAll((Collection<? extends OtherwiseDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__CONVERT_BODY_TO:
				getConvertBodyTo().clear();
				getConvertBodyTo().addAll((Collection<? extends ConvertBodyDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__DELAY:
				getDelay().clear();
				getDelay().addAll((Collection<? extends DelayDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__DYNAMIC_ROUTER:
				getDynamicRouter().clear();
				getDynamicRouter().addAll((Collection<? extends DynamicRouterDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__ENRICH:
				getEnrich().clear();
				getEnrich().addAll((Collection<? extends EnrichDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends FilterDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__DO_FINALLY:
				getDoFinally().clear();
				getDoFinally().addAll((Collection<? extends FinallyDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__IDEMPOTENT_CONSUMER:
				getIdempotentConsumer().clear();
				getIdempotentConsumer().addAll((Collection<? extends IdempotentConsumerDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__IN_ONLY:
				getInOnly().clear();
				getInOnly().addAll((Collection<? extends InOnlyDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__IN_OUT:
				getInOut().clear();
				getInOut().addAll((Collection<? extends InOutDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__INTERCEPT:
				getIntercept().clear();
				getIntercept().addAll((Collection<? extends InterceptDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				getInterceptFrom().addAll((Collection<? extends InterceptFromDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__INTERCEPT_TO_ENDPOINT:
				getInterceptToEndpoint().clear();
				getInterceptToEndpoint().addAll((Collection<? extends InterceptSendToEndpointDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__LOAD_BALANCE:
				getLoadBalance().clear();
				getLoadBalance().addAll((Collection<? extends LoadBalanceDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__LOG:
				getLog().clear();
				getLog().addAll((Collection<? extends LogDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__LOOP:
				getLoop().clear();
				getLoop().addAll((Collection<? extends LoopDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__MARSHAL:
				getMarshal().clear();
				getMarshal().addAll((Collection<? extends MarshalDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__MULTICAST:
				getMulticast().clear();
				getMulticast().addAll((Collection<? extends MulticastDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				getOnCompletion().addAll((Collection<? extends OnCompletionDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				getOnException().addAll((Collection<? extends OnExceptionDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__PIPELINE:
				getPipeline().clear();
				getPipeline().addAll((Collection<? extends PipelineDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__POLICY:
				getPolicy().clear();
				getPolicy().addAll((Collection<? extends PolicyDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__POLL_ENRICH:
				getPollEnrich().clear();
				getPollEnrich().addAll((Collection<? extends PollEnrichDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends ProcessDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__RECIPIENT_LIST:
				getRecipientList().clear();
				getRecipientList().addAll((Collection<? extends RecipientListDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__REMOVE_HEADER:
				getRemoveHeader().clear();
				getRemoveHeader().addAll((Collection<? extends RemoveHeaderDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__REMOVE_HEADERS:
				getRemoveHeaders().clear();
				getRemoveHeaders().addAll((Collection<? extends RemoveHeadersDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__REMOVE_PROPERTY:
				getRemoveProperty().clear();
				getRemoveProperty().addAll((Collection<? extends RemovePropertyDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__RESEQUENCE:
				getResequence().clear();
				getResequence().addAll((Collection<? extends ResequenceDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__ROLLBACK:
				getRollback().clear();
				getRollback().addAll((Collection<? extends RollbackDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__ROUTE:
				getRoute().clear();
				getRoute().addAll((Collection<? extends RouteDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__ROUTING_SLIP:
				getRoutingSlip().clear();
				getRoutingSlip().addAll((Collection<? extends RoutingSlipDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__SAMPLE:
				getSample().clear();
				getSample().addAll((Collection<? extends SamplingDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__SET_BODY:
				getSetBody().clear();
				getSetBody().addAll((Collection<? extends SetBodyDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__SET_EXCHANGE_PATTERN:
				getSetExchangePattern().clear();
				getSetExchangePattern().addAll((Collection<? extends SetExchangePatternDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__SET_FAULT_BODY:
				getSetFaultBody().clear();
				getSetFaultBody().addAll((Collection<? extends SetFaultBodyDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				getSetHeader().addAll((Collection<? extends SetHeaderDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__SET_OUT_HEADER:
				getSetOutHeader().clear();
				getSetOutHeader().addAll((Collection<? extends SetOutHeaderDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__SET_PROPERTY:
				getSetProperty().clear();
				getSetProperty().addAll((Collection<? extends SetPropertyDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__SORT:
				getSort().clear();
				getSort().addAll((Collection<? extends SortDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__SPLIT:
				getSplit().clear();
				getSplit().addAll((Collection<? extends SplitDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__STOP:
				getStop().clear();
				getStop().addAll((Collection<? extends StopDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__THREADS:
				getThreads().clear();
				getThreads().addAll((Collection<? extends ThreadsDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__THROTTLE:
				getThrottle().clear();
				getThrottle().addAll((Collection<? extends ThrottleDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__THROW_EXCEPTION:
				getThrowException().clear();
				getThrowException().addAll((Collection<? extends ThrowExceptionDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__TO:
				getTo().clear();
				getTo().addAll((Collection<? extends ToDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__TRANSACTED:
				getTransacted().clear();
				getTransacted().addAll((Collection<? extends TransactedDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__TRANSFORM:
				getTransform().clear();
				getTransform().addAll((Collection<? extends TransformDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__DO_TRY:
				getDoTry().clear();
				getDoTry().addAll((Collection<? extends TryDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__UNMARSHAL:
				getUnmarshal().clear();
				getUnmarshal().addAll((Collection<? extends UnmarshalDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__VALIDATE:
				getValidate().clear();
				getValidate().addAll((Collection<? extends ValidateDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__WIRE_TAP:
				getWireTap().clear();
				getWireTap().addAll((Collection<? extends WireTapDefinition>)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__AUTO_STARTUP:
				setAutoStartup((String)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__DELAYER:
				setDelayer((String)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__ERROR_HANDLER_REF:
				setErrorHandlerRef((String)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__GROUP1:
				setGroup1((String)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__HANDLE_FAULT:
				setHandleFault((String)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__ROUTE_POLICY_REF:
				setRoutePolicyRef((String)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__SHUTDOWN_ROUTE:
				setShutdownRoute((ShutdownRoute)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__SHUTDOWN_RUNNING_TASK:
				setShutdownRunningTask((ShutdownRunningTask)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__STARTUP_ORDER:
				setStartupOrder((Integer)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__STREAM_CACHE:
				setStreamCache((String)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__TRACE:
				setTrace((String)newValue);
				return;
			case SpringPackage.ROUTE_DEFINITION__ANY_ATTRIBUTE1:
				((FeatureMap.Internal)getAnyAttribute1()).set(newValue);
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
			case SpringPackage.ROUTE_DEFINITION__FROM:
				getFrom().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__GROUP:
				getGroup().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__AOP:
				getAop().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__AGGREGATE:
				getAggregate().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__BEAN:
				getBean().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__DO_CATCH:
				getDoCatch().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__WHEN:
				getWhen().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__CHOICE:
				getChoice().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__OTHERWISE:
				getOtherwise().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__CONVERT_BODY_TO:
				getConvertBodyTo().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__DELAY:
				getDelay().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__DYNAMIC_ROUTER:
				getDynamicRouter().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__ENRICH:
				getEnrich().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__FILTER:
				getFilter().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__DO_FINALLY:
				getDoFinally().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__IDEMPOTENT_CONSUMER:
				getIdempotentConsumer().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__IN_ONLY:
				getInOnly().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__IN_OUT:
				getInOut().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__INTERCEPT:
				getIntercept().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__INTERCEPT_TO_ENDPOINT:
				getInterceptToEndpoint().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__LOAD_BALANCE:
				getLoadBalance().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__LOG:
				getLog().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__LOOP:
				getLoop().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__MARSHAL:
				getMarshal().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__MULTICAST:
				getMulticast().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__PIPELINE:
				getPipeline().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__POLICY:
				getPolicy().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__POLL_ENRICH:
				getPollEnrich().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__PROCESS:
				getProcess().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__RECIPIENT_LIST:
				getRecipientList().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__REMOVE_HEADER:
				getRemoveHeader().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__REMOVE_HEADERS:
				getRemoveHeaders().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__REMOVE_PROPERTY:
				getRemoveProperty().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__RESEQUENCE:
				getResequence().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__ROLLBACK:
				getRollback().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__ROUTE:
				getRoute().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__ROUTING_SLIP:
				getRoutingSlip().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__SAMPLE:
				getSample().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__SET_BODY:
				getSetBody().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__SET_EXCHANGE_PATTERN:
				getSetExchangePattern().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__SET_FAULT_BODY:
				getSetFaultBody().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__SET_OUT_HEADER:
				getSetOutHeader().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__SET_PROPERTY:
				getSetProperty().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__SORT:
				getSort().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__SPLIT:
				getSplit().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__STOP:
				getStop().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__THREADS:
				getThreads().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__THROTTLE:
				getThrottle().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__THROW_EXCEPTION:
				getThrowException().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__TO:
				getTo().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__TRANSACTED:
				getTransacted().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__TRANSFORM:
				getTransform().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__DO_TRY:
				getDoTry().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__UNMARSHAL:
				getUnmarshal().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__VALIDATE:
				getValidate().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__WIRE_TAP:
				getWireTap().clear();
				return;
			case SpringPackage.ROUTE_DEFINITION__AUTO_STARTUP:
				setAutoStartup(AUTO_STARTUP_EDEFAULT);
				return;
			case SpringPackage.ROUTE_DEFINITION__DELAYER:
				setDelayer(DELAYER_EDEFAULT);
				return;
			case SpringPackage.ROUTE_DEFINITION__ERROR_HANDLER_REF:
				setErrorHandlerRef(ERROR_HANDLER_REF_EDEFAULT);
				return;
			case SpringPackage.ROUTE_DEFINITION__GROUP1:
				setGroup1(GROUP1_EDEFAULT);
				return;
			case SpringPackage.ROUTE_DEFINITION__HANDLE_FAULT:
				setHandleFault(HANDLE_FAULT_EDEFAULT);
				return;
			case SpringPackage.ROUTE_DEFINITION__ROUTE_POLICY_REF:
				setRoutePolicyRef(ROUTE_POLICY_REF_EDEFAULT);
				return;
			case SpringPackage.ROUTE_DEFINITION__SHUTDOWN_ROUTE:
				unsetShutdownRoute();
				return;
			case SpringPackage.ROUTE_DEFINITION__SHUTDOWN_RUNNING_TASK:
				unsetShutdownRunningTask();
				return;
			case SpringPackage.ROUTE_DEFINITION__STARTUP_ORDER:
				unsetStartupOrder();
				return;
			case SpringPackage.ROUTE_DEFINITION__STREAM_CACHE:
				setStreamCache(STREAM_CACHE_EDEFAULT);
				return;
			case SpringPackage.ROUTE_DEFINITION__TRACE:
				setTrace(TRACE_EDEFAULT);
				return;
			case SpringPackage.ROUTE_DEFINITION__ANY_ATTRIBUTE1:
				getAnyAttribute1().clear();
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
			case SpringPackage.ROUTE_DEFINITION__FROM:
				return from != null && !from.isEmpty();
			case SpringPackage.ROUTE_DEFINITION__GROUP:
				return group != null && !group.isEmpty();
			case SpringPackage.ROUTE_DEFINITION__AOP:
				return !getAop().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__AGGREGATE:
				return !getAggregate().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__BEAN:
				return !getBean().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__DO_CATCH:
				return !getDoCatch().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__WHEN:
				return !getWhen().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__CHOICE:
				return !getChoice().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__OTHERWISE:
				return !getOtherwise().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__CONVERT_BODY_TO:
				return !getConvertBodyTo().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__DELAY:
				return !getDelay().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__DYNAMIC_ROUTER:
				return !getDynamicRouter().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__ENRICH:
				return !getEnrich().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__FILTER:
				return !getFilter().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__DO_FINALLY:
				return !getDoFinally().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__IDEMPOTENT_CONSUMER:
				return !getIdempotentConsumer().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__IN_ONLY:
				return !getInOnly().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__IN_OUT:
				return !getInOut().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__INTERCEPT:
				return !getIntercept().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__INTERCEPT_FROM:
				return !getInterceptFrom().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__INTERCEPT_TO_ENDPOINT:
				return !getInterceptToEndpoint().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__LOAD_BALANCE:
				return !getLoadBalance().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__LOG:
				return !getLog().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__LOOP:
				return !getLoop().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__MARSHAL:
				return !getMarshal().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__MULTICAST:
				return !getMulticast().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__ON_COMPLETION:
				return !getOnCompletion().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__ON_EXCEPTION:
				return !getOnException().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__PIPELINE:
				return !getPipeline().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__POLICY:
				return !getPolicy().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__POLL_ENRICH:
				return !getPollEnrich().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__PROCESS:
				return !getProcess().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__RECIPIENT_LIST:
				return !getRecipientList().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__REMOVE_HEADER:
				return !getRemoveHeader().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__REMOVE_HEADERS:
				return !getRemoveHeaders().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__REMOVE_PROPERTY:
				return !getRemoveProperty().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__RESEQUENCE:
				return !getResequence().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__ROLLBACK:
				return !getRollback().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__ROUTE:
				return !getRoute().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__ROUTING_SLIP:
				return !getRoutingSlip().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__SAMPLE:
				return !getSample().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__SET_BODY:
				return !getSetBody().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__SET_EXCHANGE_PATTERN:
				return !getSetExchangePattern().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__SET_FAULT_BODY:
				return !getSetFaultBody().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__SET_HEADER:
				return !getSetHeader().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__SET_OUT_HEADER:
				return !getSetOutHeader().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__SET_PROPERTY:
				return !getSetProperty().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__SORT:
				return !getSort().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__SPLIT:
				return !getSplit().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__STOP:
				return !getStop().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__THREADS:
				return !getThreads().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__THROTTLE:
				return !getThrottle().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__THROW_EXCEPTION:
				return !getThrowException().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__TO:
				return !getTo().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__TRANSACTED:
				return !getTransacted().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__TRANSFORM:
				return !getTransform().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__DO_TRY:
				return !getDoTry().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__UNMARSHAL:
				return !getUnmarshal().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__VALIDATE:
				return !getValidate().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__WIRE_TAP:
				return !getWireTap().isEmpty();
			case SpringPackage.ROUTE_DEFINITION__AUTO_STARTUP:
				return AUTO_STARTUP_EDEFAULT == null ? autoStartup != null : !AUTO_STARTUP_EDEFAULT.equals(autoStartup);
			case SpringPackage.ROUTE_DEFINITION__DELAYER:
				return DELAYER_EDEFAULT == null ? delayer != null : !DELAYER_EDEFAULT.equals(delayer);
			case SpringPackage.ROUTE_DEFINITION__ERROR_HANDLER_REF:
				return ERROR_HANDLER_REF_EDEFAULT == null ? errorHandlerRef != null : !ERROR_HANDLER_REF_EDEFAULT.equals(errorHandlerRef);
			case SpringPackage.ROUTE_DEFINITION__GROUP1:
				return GROUP1_EDEFAULT == null ? group1 != null : !GROUP1_EDEFAULT.equals(group1);
			case SpringPackage.ROUTE_DEFINITION__HANDLE_FAULT:
				return HANDLE_FAULT_EDEFAULT == null ? handleFault != null : !HANDLE_FAULT_EDEFAULT.equals(handleFault);
			case SpringPackage.ROUTE_DEFINITION__ROUTE_POLICY_REF:
				return ROUTE_POLICY_REF_EDEFAULT == null ? routePolicyRef != null : !ROUTE_POLICY_REF_EDEFAULT.equals(routePolicyRef);
			case SpringPackage.ROUTE_DEFINITION__SHUTDOWN_ROUTE:
				return isSetShutdownRoute();
			case SpringPackage.ROUTE_DEFINITION__SHUTDOWN_RUNNING_TASK:
				return isSetShutdownRunningTask();
			case SpringPackage.ROUTE_DEFINITION__STARTUP_ORDER:
				return isSetStartupOrder();
			case SpringPackage.ROUTE_DEFINITION__STREAM_CACHE:
				return STREAM_CACHE_EDEFAULT == null ? streamCache != null : !STREAM_CACHE_EDEFAULT.equals(streamCache);
			case SpringPackage.ROUTE_DEFINITION__TRACE:
				return TRACE_EDEFAULT == null ? trace != null : !TRACE_EDEFAULT.equals(trace);
			case SpringPackage.ROUTE_DEFINITION__ANY_ATTRIBUTE1:
				return anyAttribute1 != null && !anyAttribute1.isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", autoStartup: ");
		result.append(autoStartup);
		result.append(", delayer: ");
		result.append(delayer);
		result.append(", errorHandlerRef: ");
		result.append(errorHandlerRef);
		result.append(", group1: ");
		result.append(group1);
		result.append(", handleFault: ");
		result.append(handleFault);
		result.append(", routePolicyRef: ");
		result.append(routePolicyRef);
		result.append(", shutdownRoute: ");
		if (shutdownRouteESet) result.append(shutdownRoute); else result.append("<unset>");
		result.append(", shutdownRunningTask: ");
		if (shutdownRunningTaskESet) result.append(shutdownRunningTask); else result.append("<unset>");
		result.append(", startupOrder: ");
		if (startupOrderESet) result.append(startupOrder); else result.append("<unset>");
		result.append(", streamCache: ");
		result.append(streamCache);
		result.append(", trace: ");
		result.append(trace);
		result.append(", anyAttribute1: ");
		result.append(anyAttribute1);
		result.append(')');
		return result.toString();
	}

} //RouteDefinitionImpl
