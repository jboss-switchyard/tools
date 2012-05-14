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
import org.switchyard.tools.models.switchyard1_0.spring.ExpressionSubElementDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.FilterDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.FinallyDefinition;
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
 * An implementation of the model object '<em><b>Aggregate Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getCorrelationExpression <em>Correlation Expression</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getCompletionPredicate <em>Completion Predicate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getCompletionTimeout <em>Completion Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getCompletionSize <em>Completion Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getAop <em>Aop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getInOnly <em>In Only</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getInOut <em>In Out</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getInterceptToEndpoint <em>Intercept To Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getLog <em>Log</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getSample <em>Sample</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getSetFaultBody <em>Set Fault Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getSetOutHeader <em>Set Out Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getAggregationRepositoryRef <em>Aggregation Repository Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getCloseCorrelationKeyOnCompletion <em>Close Correlation Key On Completion</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#isCompletionFromBatchConsumer <em>Completion From Batch Consumer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getCompletionInterval <em>Completion Interval</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getCompletionSize1 <em>Completion Size1</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getCompletionTimeout1 <em>Completion Timeout1</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#isDiscardOnCompletionTimeout <em>Discard On Completion Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#isEagerCheckCompletion <em>Eager Check Completion</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getExecutorServiceRef <em>Executor Service Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#isGroupExchanges <em>Group Exchanges</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#isIgnoreInvalidCorrelationKeys <em>Ignore Invalid Correlation Keys</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#isParallelProcessing <em>Parallel Processing</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getStrategyRef <em>Strategy Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AggregateDefinitionImpl#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregateDefinitionImpl extends ProcessorDefinitionImpl implements AggregateDefinition {
	/**
     * The cached value of the '{@link #getCorrelationExpression() <em>Correlation Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCorrelationExpression()
     * @generated
     * @ordered
     */
	protected ExpressionSubElementDefinition correlationExpression;

	/**
     * The cached value of the '{@link #getCompletionPredicate() <em>Completion Predicate</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCompletionPredicate()
     * @generated
     * @ordered
     */
	protected ExpressionSubElementDefinition completionPredicate;

	/**
     * The cached value of the '{@link #getCompletionTimeout() <em>Completion Timeout</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCompletionTimeout()
     * @generated
     * @ordered
     */
	protected ExpressionSubElementDefinition completionTimeout;

	/**
     * The cached value of the '{@link #getCompletionSize() <em>Completion Size</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCompletionSize()
     * @generated
     * @ordered
     */
	protected ExpressionSubElementDefinition completionSize;

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
     * The default value of the '{@link #getAggregationRepositoryRef() <em>Aggregation Repository Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAggregationRepositoryRef()
     * @generated
     * @ordered
     */
	protected static final String AGGREGATION_REPOSITORY_REF_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getAggregationRepositoryRef() <em>Aggregation Repository Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAggregationRepositoryRef()
     * @generated
     * @ordered
     */
	protected String aggregationRepositoryRef = AGGREGATION_REPOSITORY_REF_EDEFAULT;

	/**
     * The default value of the '{@link #getCloseCorrelationKeyOnCompletion() <em>Close Correlation Key On Completion</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCloseCorrelationKeyOnCompletion()
     * @generated
     * @ordered
     */
	protected static final int CLOSE_CORRELATION_KEY_ON_COMPLETION_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getCloseCorrelationKeyOnCompletion() <em>Close Correlation Key On Completion</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCloseCorrelationKeyOnCompletion()
     * @generated
     * @ordered
     */
	protected int closeCorrelationKeyOnCompletion = CLOSE_CORRELATION_KEY_ON_COMPLETION_EDEFAULT;

	/**
     * This is true if the Close Correlation Key On Completion attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean closeCorrelationKeyOnCompletionESet;

	/**
     * The default value of the '{@link #isCompletionFromBatchConsumer() <em>Completion From Batch Consumer</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isCompletionFromBatchConsumer()
     * @generated
     * @ordered
     */
	protected static final boolean COMPLETION_FROM_BATCH_CONSUMER_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isCompletionFromBatchConsumer() <em>Completion From Batch Consumer</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isCompletionFromBatchConsumer()
     * @generated
     * @ordered
     */
	protected boolean completionFromBatchConsumer = COMPLETION_FROM_BATCH_CONSUMER_EDEFAULT;

	/**
     * This is true if the Completion From Batch Consumer attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean completionFromBatchConsumerESet;

	/**
     * The default value of the '{@link #getCompletionInterval() <em>Completion Interval</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCompletionInterval()
     * @generated
     * @ordered
     */
	protected static final long COMPLETION_INTERVAL_EDEFAULT = 0L;

	/**
     * The cached value of the '{@link #getCompletionInterval() <em>Completion Interval</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCompletionInterval()
     * @generated
     * @ordered
     */
	protected long completionInterval = COMPLETION_INTERVAL_EDEFAULT;

	/**
     * This is true if the Completion Interval attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean completionIntervalESet;

	/**
     * The default value of the '{@link #getCompletionSize1() <em>Completion Size1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCompletionSize1()
     * @generated
     * @ordered
     */
	protected static final int COMPLETION_SIZE1_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getCompletionSize1() <em>Completion Size1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCompletionSize1()
     * @generated
     * @ordered
     */
	protected int completionSize1 = COMPLETION_SIZE1_EDEFAULT;

	/**
     * This is true if the Completion Size1 attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean completionSize1ESet;

	/**
     * The default value of the '{@link #getCompletionTimeout1() <em>Completion Timeout1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCompletionTimeout1()
     * @generated
     * @ordered
     */
	protected static final long COMPLETION_TIMEOUT1_EDEFAULT = 0L;

	/**
     * The cached value of the '{@link #getCompletionTimeout1() <em>Completion Timeout1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCompletionTimeout1()
     * @generated
     * @ordered
     */
	protected long completionTimeout1 = COMPLETION_TIMEOUT1_EDEFAULT;

	/**
     * This is true if the Completion Timeout1 attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean completionTimeout1ESet;

	/**
     * The default value of the '{@link #isDiscardOnCompletionTimeout() <em>Discard On Completion Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isDiscardOnCompletionTimeout()
     * @generated
     * @ordered
     */
	protected static final boolean DISCARD_ON_COMPLETION_TIMEOUT_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isDiscardOnCompletionTimeout() <em>Discard On Completion Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isDiscardOnCompletionTimeout()
     * @generated
     * @ordered
     */
	protected boolean discardOnCompletionTimeout = DISCARD_ON_COMPLETION_TIMEOUT_EDEFAULT;

	/**
     * This is true if the Discard On Completion Timeout attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean discardOnCompletionTimeoutESet;

	/**
     * The default value of the '{@link #isEagerCheckCompletion() <em>Eager Check Completion</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isEagerCheckCompletion()
     * @generated
     * @ordered
     */
	protected static final boolean EAGER_CHECK_COMPLETION_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isEagerCheckCompletion() <em>Eager Check Completion</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isEagerCheckCompletion()
     * @generated
     * @ordered
     */
	protected boolean eagerCheckCompletion = EAGER_CHECK_COMPLETION_EDEFAULT;

	/**
     * This is true if the Eager Check Completion attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean eagerCheckCompletionESet;

	/**
     * The default value of the '{@link #getExecutorServiceRef() <em>Executor Service Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExecutorServiceRef()
     * @generated
     * @ordered
     */
	protected static final String EXECUTOR_SERVICE_REF_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getExecutorServiceRef() <em>Executor Service Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExecutorServiceRef()
     * @generated
     * @ordered
     */
	protected String executorServiceRef = EXECUTOR_SERVICE_REF_EDEFAULT;

	/**
     * The default value of the '{@link #isGroupExchanges() <em>Group Exchanges</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isGroupExchanges()
     * @generated
     * @ordered
     */
	protected static final boolean GROUP_EXCHANGES_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isGroupExchanges() <em>Group Exchanges</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isGroupExchanges()
     * @generated
     * @ordered
     */
	protected boolean groupExchanges = GROUP_EXCHANGES_EDEFAULT;

	/**
     * This is true if the Group Exchanges attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean groupExchangesESet;

	/**
     * The default value of the '{@link #isIgnoreInvalidCorrelationKeys() <em>Ignore Invalid Correlation Keys</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isIgnoreInvalidCorrelationKeys()
     * @generated
     * @ordered
     */
	protected static final boolean IGNORE_INVALID_CORRELATION_KEYS_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isIgnoreInvalidCorrelationKeys() <em>Ignore Invalid Correlation Keys</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isIgnoreInvalidCorrelationKeys()
     * @generated
     * @ordered
     */
	protected boolean ignoreInvalidCorrelationKeys = IGNORE_INVALID_CORRELATION_KEYS_EDEFAULT;

	/**
     * This is true if the Ignore Invalid Correlation Keys attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean ignoreInvalidCorrelationKeysESet;

	/**
     * The default value of the '{@link #isParallelProcessing() <em>Parallel Processing</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isParallelProcessing()
     * @generated
     * @ordered
     */
	protected static final boolean PARALLEL_PROCESSING_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isParallelProcessing() <em>Parallel Processing</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isParallelProcessing()
     * @generated
     * @ordered
     */
	protected boolean parallelProcessing = PARALLEL_PROCESSING_EDEFAULT;

	/**
     * This is true if the Parallel Processing attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean parallelProcessingESet;

	/**
     * The default value of the '{@link #getStrategyRef() <em>Strategy Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStrategyRef()
     * @generated
     * @ordered
     */
	protected static final String STRATEGY_REF_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getStrategyRef() <em>Strategy Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStrategyRef()
     * @generated
     * @ordered
     */
	protected String strategyRef = STRATEGY_REF_EDEFAULT;

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
	protected AggregateDefinitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getAggregateDefinition();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ExpressionSubElementDefinition getCorrelationExpression() {
        return correlationExpression;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetCorrelationExpression(ExpressionSubElementDefinition newCorrelationExpression, NotificationChain msgs) {
        ExpressionSubElementDefinition oldCorrelationExpression = correlationExpression;
        correlationExpression = newCorrelationExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__CORRELATION_EXPRESSION, oldCorrelationExpression, newCorrelationExpression);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCorrelationExpression(ExpressionSubElementDefinition newCorrelationExpression) {
        if (newCorrelationExpression != correlationExpression) {
            NotificationChain msgs = null;
            if (correlationExpression != null)
                msgs = ((InternalEObject)correlationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.AGGREGATE_DEFINITION__CORRELATION_EXPRESSION, null, msgs);
            if (newCorrelationExpression != null)
                msgs = ((InternalEObject)newCorrelationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.AGGREGATE_DEFINITION__CORRELATION_EXPRESSION, null, msgs);
            msgs = basicSetCorrelationExpression(newCorrelationExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__CORRELATION_EXPRESSION, newCorrelationExpression, newCorrelationExpression));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ExpressionSubElementDefinition getCompletionPredicate() {
        return completionPredicate;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetCompletionPredicate(ExpressionSubElementDefinition newCompletionPredicate, NotificationChain msgs) {
        ExpressionSubElementDefinition oldCompletionPredicate = completionPredicate;
        completionPredicate = newCompletionPredicate;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__COMPLETION_PREDICATE, oldCompletionPredicate, newCompletionPredicate);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCompletionPredicate(ExpressionSubElementDefinition newCompletionPredicate) {
        if (newCompletionPredicate != completionPredicate) {
            NotificationChain msgs = null;
            if (completionPredicate != null)
                msgs = ((InternalEObject)completionPredicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.AGGREGATE_DEFINITION__COMPLETION_PREDICATE, null, msgs);
            if (newCompletionPredicate != null)
                msgs = ((InternalEObject)newCompletionPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.AGGREGATE_DEFINITION__COMPLETION_PREDICATE, null, msgs);
            msgs = basicSetCompletionPredicate(newCompletionPredicate, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__COMPLETION_PREDICATE, newCompletionPredicate, newCompletionPredicate));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ExpressionSubElementDefinition getCompletionTimeout() {
        return completionTimeout;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetCompletionTimeout(ExpressionSubElementDefinition newCompletionTimeout, NotificationChain msgs) {
        ExpressionSubElementDefinition oldCompletionTimeout = completionTimeout;
        completionTimeout = newCompletionTimeout;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT, oldCompletionTimeout, newCompletionTimeout);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCompletionTimeout(ExpressionSubElementDefinition newCompletionTimeout) {
        if (newCompletionTimeout != completionTimeout) {
            NotificationChain msgs = null;
            if (completionTimeout != null)
                msgs = ((InternalEObject)completionTimeout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT, null, msgs);
            if (newCompletionTimeout != null)
                msgs = ((InternalEObject)newCompletionTimeout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT, null, msgs);
            msgs = basicSetCompletionTimeout(newCompletionTimeout, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT, newCompletionTimeout, newCompletionTimeout));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ExpressionSubElementDefinition getCompletionSize() {
        return completionSize;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetCompletionSize(ExpressionSubElementDefinition newCompletionSize, NotificationChain msgs) {
        ExpressionSubElementDefinition oldCompletionSize = completionSize;
        completionSize = newCompletionSize;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE, oldCompletionSize, newCompletionSize);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCompletionSize(ExpressionSubElementDefinition newCompletionSize) {
        if (newCompletionSize != completionSize) {
            NotificationChain msgs = null;
            if (completionSize != null)
                msgs = ((InternalEObject)completionSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE, null, msgs);
            if (newCompletionSize != null)
                msgs = ((InternalEObject)newCompletionSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE, null, msgs);
            msgs = basicSetCompletionSize(newCompletionSize, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE, newCompletionSize, newCompletionSize));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, SpringPackage.AGGREGATE_DEFINITION__GROUP);
        }
        return group;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<AopDefinition> getAop() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Aop());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<AggregateDefinition> getAggregate() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Aggregate());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<BeanDefinition> getBean() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Bean());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<CatchDefinition> getDoCatch() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_DoCatch());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<WhenDefinition> getWhen() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_When());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ChoiceDefinition> getChoice() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Choice());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<OtherwiseDefinition> getOtherwise() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Otherwise());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ConvertBodyDefinition> getConvertBodyTo() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_ConvertBodyTo());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<DelayDefinition> getDelay() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Delay());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<DynamicRouterDefinition> getDynamicRouter() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_DynamicRouter());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<EnrichDefinition> getEnrich() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Enrich());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<FilterDefinition> getFilter() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Filter());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<FinallyDefinition> getDoFinally() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_DoFinally());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<IdempotentConsumerDefinition> getIdempotentConsumer() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_IdempotentConsumer());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<InOnlyDefinition> getInOnly() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_InOnly());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<InOutDefinition> getInOut() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_InOut());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<InterceptDefinition> getIntercept() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Intercept());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<InterceptFromDefinition> getInterceptFrom() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_InterceptFrom());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<InterceptSendToEndpointDefinition> getInterceptToEndpoint() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_InterceptToEndpoint());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<LoadBalanceDefinition> getLoadBalance() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_LoadBalance());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<LogDefinition> getLog() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Log());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<LoopDefinition> getLoop() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Loop());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<MarshalDefinition> getMarshal() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Marshal());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<MulticastDefinition> getMulticast() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Multicast());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<OnCompletionDefinition> getOnCompletion() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_OnCompletion());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<OnExceptionDefinition> getOnException() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_OnException());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PipelineDefinition> getPipeline() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Pipeline());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PolicyDefinition> getPolicy() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Policy());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PollEnrichDefinition> getPollEnrich() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_PollEnrich());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ProcessDefinition> getProcess() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Process());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RecipientListDefinition> getRecipientList() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_RecipientList());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RemoveHeaderDefinition> getRemoveHeader() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_RemoveHeader());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RemoveHeadersDefinition> getRemoveHeaders() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_RemoveHeaders());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RemovePropertyDefinition> getRemoveProperty() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_RemoveProperty());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ResequenceDefinition> getResequence() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Resequence());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RollbackDefinition> getRollback() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Rollback());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RouteDefinition> getRoute() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Route());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RoutingSlipDefinition> getRoutingSlip() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_RoutingSlip());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SamplingDefinition> getSample() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Sample());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SetBodyDefinition> getSetBody() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_SetBody());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SetExchangePatternDefinition> getSetExchangePattern() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_SetExchangePattern());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SetFaultBodyDefinition> getSetFaultBody() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_SetFaultBody());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SetHeaderDefinition> getSetHeader() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_SetHeader());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SetOutHeaderDefinition> getSetOutHeader() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_SetOutHeader());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SetPropertyDefinition> getSetProperty() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_SetProperty());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SortDefinition> getSort() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Sort());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SplitDefinition> getSplit() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Split());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<StopDefinition> getStop() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Stop());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ThreadsDefinition> getThreads() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Threads());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ThrottleDefinition> getThrottle() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Throttle());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ThrowExceptionDefinition> getThrowException() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_ThrowException());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ToDefinition> getTo() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_To());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<TransactedDefinition> getTransacted() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Transacted());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<TransformDefinition> getTransform() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Transform());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<TryDefinition> getDoTry() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_DoTry());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<UnmarshalDefinition> getUnmarshal() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Unmarshal());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ValidateDefinition> getValidate() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_Validate());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<WireTapDefinition> getWireTap() {
        return getGroup().list(SpringPackage.eINSTANCE.getAggregateDefinition_WireTap());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getAggregationRepositoryRef() {
        return aggregationRepositoryRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAggregationRepositoryRef(String newAggregationRepositoryRef) {
        String oldAggregationRepositoryRef = aggregationRepositoryRef;
        aggregationRepositoryRef = newAggregationRepositoryRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__AGGREGATION_REPOSITORY_REF, oldAggregationRepositoryRef, aggregationRepositoryRef));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getCloseCorrelationKeyOnCompletion() {
        return closeCorrelationKeyOnCompletion;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCloseCorrelationKeyOnCompletion(int newCloseCorrelationKeyOnCompletion) {
        int oldCloseCorrelationKeyOnCompletion = closeCorrelationKeyOnCompletion;
        closeCorrelationKeyOnCompletion = newCloseCorrelationKeyOnCompletion;
        boolean oldCloseCorrelationKeyOnCompletionESet = closeCorrelationKeyOnCompletionESet;
        closeCorrelationKeyOnCompletionESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__CLOSE_CORRELATION_KEY_ON_COMPLETION, oldCloseCorrelationKeyOnCompletion, closeCorrelationKeyOnCompletion, !oldCloseCorrelationKeyOnCompletionESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetCloseCorrelationKeyOnCompletion() {
        int oldCloseCorrelationKeyOnCompletion = closeCorrelationKeyOnCompletion;
        boolean oldCloseCorrelationKeyOnCompletionESet = closeCorrelationKeyOnCompletionESet;
        closeCorrelationKeyOnCompletion = CLOSE_CORRELATION_KEY_ON_COMPLETION_EDEFAULT;
        closeCorrelationKeyOnCompletionESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.AGGREGATE_DEFINITION__CLOSE_CORRELATION_KEY_ON_COMPLETION, oldCloseCorrelationKeyOnCompletion, CLOSE_CORRELATION_KEY_ON_COMPLETION_EDEFAULT, oldCloseCorrelationKeyOnCompletionESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetCloseCorrelationKeyOnCompletion() {
        return closeCorrelationKeyOnCompletionESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isCompletionFromBatchConsumer() {
        return completionFromBatchConsumer;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCompletionFromBatchConsumer(boolean newCompletionFromBatchConsumer) {
        boolean oldCompletionFromBatchConsumer = completionFromBatchConsumer;
        completionFromBatchConsumer = newCompletionFromBatchConsumer;
        boolean oldCompletionFromBatchConsumerESet = completionFromBatchConsumerESet;
        completionFromBatchConsumerESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__COMPLETION_FROM_BATCH_CONSUMER, oldCompletionFromBatchConsumer, completionFromBatchConsumer, !oldCompletionFromBatchConsumerESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetCompletionFromBatchConsumer() {
        boolean oldCompletionFromBatchConsumer = completionFromBatchConsumer;
        boolean oldCompletionFromBatchConsumerESet = completionFromBatchConsumerESet;
        completionFromBatchConsumer = COMPLETION_FROM_BATCH_CONSUMER_EDEFAULT;
        completionFromBatchConsumerESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.AGGREGATE_DEFINITION__COMPLETION_FROM_BATCH_CONSUMER, oldCompletionFromBatchConsumer, COMPLETION_FROM_BATCH_CONSUMER_EDEFAULT, oldCompletionFromBatchConsumerESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetCompletionFromBatchConsumer() {
        return completionFromBatchConsumerESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public long getCompletionInterval() {
        return completionInterval;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCompletionInterval(long newCompletionInterval) {
        long oldCompletionInterval = completionInterval;
        completionInterval = newCompletionInterval;
        boolean oldCompletionIntervalESet = completionIntervalESet;
        completionIntervalESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__COMPLETION_INTERVAL, oldCompletionInterval, completionInterval, !oldCompletionIntervalESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetCompletionInterval() {
        long oldCompletionInterval = completionInterval;
        boolean oldCompletionIntervalESet = completionIntervalESet;
        completionInterval = COMPLETION_INTERVAL_EDEFAULT;
        completionIntervalESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.AGGREGATE_DEFINITION__COMPLETION_INTERVAL, oldCompletionInterval, COMPLETION_INTERVAL_EDEFAULT, oldCompletionIntervalESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetCompletionInterval() {
        return completionIntervalESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getCompletionSize1() {
        return completionSize1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCompletionSize1(int newCompletionSize1) {
        int oldCompletionSize1 = completionSize1;
        completionSize1 = newCompletionSize1;
        boolean oldCompletionSize1ESet = completionSize1ESet;
        completionSize1ESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE1, oldCompletionSize1, completionSize1, !oldCompletionSize1ESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetCompletionSize1() {
        int oldCompletionSize1 = completionSize1;
        boolean oldCompletionSize1ESet = completionSize1ESet;
        completionSize1 = COMPLETION_SIZE1_EDEFAULT;
        completionSize1ESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE1, oldCompletionSize1, COMPLETION_SIZE1_EDEFAULT, oldCompletionSize1ESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetCompletionSize1() {
        return completionSize1ESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public long getCompletionTimeout1() {
        return completionTimeout1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCompletionTimeout1(long newCompletionTimeout1) {
        long oldCompletionTimeout1 = completionTimeout1;
        completionTimeout1 = newCompletionTimeout1;
        boolean oldCompletionTimeout1ESet = completionTimeout1ESet;
        completionTimeout1ESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT1, oldCompletionTimeout1, completionTimeout1, !oldCompletionTimeout1ESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetCompletionTimeout1() {
        long oldCompletionTimeout1 = completionTimeout1;
        boolean oldCompletionTimeout1ESet = completionTimeout1ESet;
        completionTimeout1 = COMPLETION_TIMEOUT1_EDEFAULT;
        completionTimeout1ESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT1, oldCompletionTimeout1, COMPLETION_TIMEOUT1_EDEFAULT, oldCompletionTimeout1ESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetCompletionTimeout1() {
        return completionTimeout1ESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isDiscardOnCompletionTimeout() {
        return discardOnCompletionTimeout;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDiscardOnCompletionTimeout(boolean newDiscardOnCompletionTimeout) {
        boolean oldDiscardOnCompletionTimeout = discardOnCompletionTimeout;
        discardOnCompletionTimeout = newDiscardOnCompletionTimeout;
        boolean oldDiscardOnCompletionTimeoutESet = discardOnCompletionTimeoutESet;
        discardOnCompletionTimeoutESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__DISCARD_ON_COMPLETION_TIMEOUT, oldDiscardOnCompletionTimeout, discardOnCompletionTimeout, !oldDiscardOnCompletionTimeoutESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetDiscardOnCompletionTimeout() {
        boolean oldDiscardOnCompletionTimeout = discardOnCompletionTimeout;
        boolean oldDiscardOnCompletionTimeoutESet = discardOnCompletionTimeoutESet;
        discardOnCompletionTimeout = DISCARD_ON_COMPLETION_TIMEOUT_EDEFAULT;
        discardOnCompletionTimeoutESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.AGGREGATE_DEFINITION__DISCARD_ON_COMPLETION_TIMEOUT, oldDiscardOnCompletionTimeout, DISCARD_ON_COMPLETION_TIMEOUT_EDEFAULT, oldDiscardOnCompletionTimeoutESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetDiscardOnCompletionTimeout() {
        return discardOnCompletionTimeoutESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isEagerCheckCompletion() {
        return eagerCheckCompletion;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setEagerCheckCompletion(boolean newEagerCheckCompletion) {
        boolean oldEagerCheckCompletion = eagerCheckCompletion;
        eagerCheckCompletion = newEagerCheckCompletion;
        boolean oldEagerCheckCompletionESet = eagerCheckCompletionESet;
        eagerCheckCompletionESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__EAGER_CHECK_COMPLETION, oldEagerCheckCompletion, eagerCheckCompletion, !oldEagerCheckCompletionESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetEagerCheckCompletion() {
        boolean oldEagerCheckCompletion = eagerCheckCompletion;
        boolean oldEagerCheckCompletionESet = eagerCheckCompletionESet;
        eagerCheckCompletion = EAGER_CHECK_COMPLETION_EDEFAULT;
        eagerCheckCompletionESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.AGGREGATE_DEFINITION__EAGER_CHECK_COMPLETION, oldEagerCheckCompletion, EAGER_CHECK_COMPLETION_EDEFAULT, oldEagerCheckCompletionESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetEagerCheckCompletion() {
        return eagerCheckCompletionESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getExecutorServiceRef() {
        return executorServiceRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setExecutorServiceRef(String newExecutorServiceRef) {
        String oldExecutorServiceRef = executorServiceRef;
        executorServiceRef = newExecutorServiceRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__EXECUTOR_SERVICE_REF, oldExecutorServiceRef, executorServiceRef));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isGroupExchanges() {
        return groupExchanges;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setGroupExchanges(boolean newGroupExchanges) {
        boolean oldGroupExchanges = groupExchanges;
        groupExchanges = newGroupExchanges;
        boolean oldGroupExchangesESet = groupExchangesESet;
        groupExchangesESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__GROUP_EXCHANGES, oldGroupExchanges, groupExchanges, !oldGroupExchangesESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetGroupExchanges() {
        boolean oldGroupExchanges = groupExchanges;
        boolean oldGroupExchangesESet = groupExchangesESet;
        groupExchanges = GROUP_EXCHANGES_EDEFAULT;
        groupExchangesESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.AGGREGATE_DEFINITION__GROUP_EXCHANGES, oldGroupExchanges, GROUP_EXCHANGES_EDEFAULT, oldGroupExchangesESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetGroupExchanges() {
        return groupExchangesESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isIgnoreInvalidCorrelationKeys() {
        return ignoreInvalidCorrelationKeys;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIgnoreInvalidCorrelationKeys(boolean newIgnoreInvalidCorrelationKeys) {
        boolean oldIgnoreInvalidCorrelationKeys = ignoreInvalidCorrelationKeys;
        ignoreInvalidCorrelationKeys = newIgnoreInvalidCorrelationKeys;
        boolean oldIgnoreInvalidCorrelationKeysESet = ignoreInvalidCorrelationKeysESet;
        ignoreInvalidCorrelationKeysESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__IGNORE_INVALID_CORRELATION_KEYS, oldIgnoreInvalidCorrelationKeys, ignoreInvalidCorrelationKeys, !oldIgnoreInvalidCorrelationKeysESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetIgnoreInvalidCorrelationKeys() {
        boolean oldIgnoreInvalidCorrelationKeys = ignoreInvalidCorrelationKeys;
        boolean oldIgnoreInvalidCorrelationKeysESet = ignoreInvalidCorrelationKeysESet;
        ignoreInvalidCorrelationKeys = IGNORE_INVALID_CORRELATION_KEYS_EDEFAULT;
        ignoreInvalidCorrelationKeysESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.AGGREGATE_DEFINITION__IGNORE_INVALID_CORRELATION_KEYS, oldIgnoreInvalidCorrelationKeys, IGNORE_INVALID_CORRELATION_KEYS_EDEFAULT, oldIgnoreInvalidCorrelationKeysESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetIgnoreInvalidCorrelationKeys() {
        return ignoreInvalidCorrelationKeysESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isParallelProcessing() {
        return parallelProcessing;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setParallelProcessing(boolean newParallelProcessing) {
        boolean oldParallelProcessing = parallelProcessing;
        parallelProcessing = newParallelProcessing;
        boolean oldParallelProcessingESet = parallelProcessingESet;
        parallelProcessingESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__PARALLEL_PROCESSING, oldParallelProcessing, parallelProcessing, !oldParallelProcessingESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetParallelProcessing() {
        boolean oldParallelProcessing = parallelProcessing;
        boolean oldParallelProcessingESet = parallelProcessingESet;
        parallelProcessing = PARALLEL_PROCESSING_EDEFAULT;
        parallelProcessingESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.AGGREGATE_DEFINITION__PARALLEL_PROCESSING, oldParallelProcessing, PARALLEL_PROCESSING_EDEFAULT, oldParallelProcessingESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetParallelProcessing() {
        return parallelProcessingESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getStrategyRef() {
        return strategyRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStrategyRef(String newStrategyRef) {
        String oldStrategyRef = strategyRef;
        strategyRef = newStrategyRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.AGGREGATE_DEFINITION__STRATEGY_REF, oldStrategyRef, strategyRef));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute1() {
        if (anyAttribute1 == null) {
            anyAttribute1 = new BasicFeatureMap(this, SpringPackage.AGGREGATE_DEFINITION__ANY_ATTRIBUTE1);
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
            case SpringPackage.AGGREGATE_DEFINITION__CORRELATION_EXPRESSION:
                return basicSetCorrelationExpression(null, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_PREDICATE:
                return basicSetCompletionPredicate(null, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT:
                return basicSetCompletionTimeout(null, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE:
                return basicSetCompletionSize(null, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__AOP:
                return ((InternalEList<?>)getAop()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__AGGREGATE:
                return ((InternalEList<?>)getAggregate()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__BEAN:
                return ((InternalEList<?>)getBean()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__DO_CATCH:
                return ((InternalEList<?>)getDoCatch()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__WHEN:
                return ((InternalEList<?>)getWhen()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__CHOICE:
                return ((InternalEList<?>)getChoice()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__OTHERWISE:
                return ((InternalEList<?>)getOtherwise()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__CONVERT_BODY_TO:
                return ((InternalEList<?>)getConvertBodyTo()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__DELAY:
                return ((InternalEList<?>)getDelay()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__DYNAMIC_ROUTER:
                return ((InternalEList<?>)getDynamicRouter()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__ENRICH:
                return ((InternalEList<?>)getEnrich()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__FILTER:
                return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__DO_FINALLY:
                return ((InternalEList<?>)getDoFinally()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__IDEMPOTENT_CONSUMER:
                return ((InternalEList<?>)getIdempotentConsumer()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__IN_ONLY:
                return ((InternalEList<?>)getInOnly()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__IN_OUT:
                return ((InternalEList<?>)getInOut()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__INTERCEPT:
                return ((InternalEList<?>)getIntercept()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__INTERCEPT_FROM:
                return ((InternalEList<?>)getInterceptFrom()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__INTERCEPT_TO_ENDPOINT:
                return ((InternalEList<?>)getInterceptToEndpoint()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__LOAD_BALANCE:
                return ((InternalEList<?>)getLoadBalance()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__LOG:
                return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__LOOP:
                return ((InternalEList<?>)getLoop()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__MARSHAL:
                return ((InternalEList<?>)getMarshal()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__MULTICAST:
                return ((InternalEList<?>)getMulticast()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__ON_COMPLETION:
                return ((InternalEList<?>)getOnCompletion()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__ON_EXCEPTION:
                return ((InternalEList<?>)getOnException()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__PIPELINE:
                return ((InternalEList<?>)getPipeline()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__POLICY:
                return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__POLL_ENRICH:
                return ((InternalEList<?>)getPollEnrich()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__PROCESS:
                return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__RECIPIENT_LIST:
                return ((InternalEList<?>)getRecipientList()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__REMOVE_HEADER:
                return ((InternalEList<?>)getRemoveHeader()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__REMOVE_HEADERS:
                return ((InternalEList<?>)getRemoveHeaders()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__REMOVE_PROPERTY:
                return ((InternalEList<?>)getRemoveProperty()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__RESEQUENCE:
                return ((InternalEList<?>)getResequence()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__ROLLBACK:
                return ((InternalEList<?>)getRollback()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__ROUTE:
                return ((InternalEList<?>)getRoute()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__ROUTING_SLIP:
                return ((InternalEList<?>)getRoutingSlip()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__SAMPLE:
                return ((InternalEList<?>)getSample()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__SET_BODY:
                return ((InternalEList<?>)getSetBody()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__SET_EXCHANGE_PATTERN:
                return ((InternalEList<?>)getSetExchangePattern()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__SET_FAULT_BODY:
                return ((InternalEList<?>)getSetFaultBody()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__SET_HEADER:
                return ((InternalEList<?>)getSetHeader()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__SET_OUT_HEADER:
                return ((InternalEList<?>)getSetOutHeader()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__SET_PROPERTY:
                return ((InternalEList<?>)getSetProperty()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__SORT:
                return ((InternalEList<?>)getSort()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__SPLIT:
                return ((InternalEList<?>)getSplit()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__STOP:
                return ((InternalEList<?>)getStop()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__THREADS:
                return ((InternalEList<?>)getThreads()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__THROTTLE:
                return ((InternalEList<?>)getThrottle()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__THROW_EXCEPTION:
                return ((InternalEList<?>)getThrowException()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__TO:
                return ((InternalEList<?>)getTo()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__TRANSACTED:
                return ((InternalEList<?>)getTransacted()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__TRANSFORM:
                return ((InternalEList<?>)getTransform()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__DO_TRY:
                return ((InternalEList<?>)getDoTry()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__UNMARSHAL:
                return ((InternalEList<?>)getUnmarshal()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__VALIDATE:
                return ((InternalEList<?>)getValidate()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__WIRE_TAP:
                return ((InternalEList<?>)getWireTap()).basicRemove(otherEnd, msgs);
            case SpringPackage.AGGREGATE_DEFINITION__ANY_ATTRIBUTE1:
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
            case SpringPackage.AGGREGATE_DEFINITION__CORRELATION_EXPRESSION:
                return getCorrelationExpression();
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_PREDICATE:
                return getCompletionPredicate();
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT:
                return getCompletionTimeout();
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE:
                return getCompletionSize();
            case SpringPackage.AGGREGATE_DEFINITION__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case SpringPackage.AGGREGATE_DEFINITION__AOP:
                return getAop();
            case SpringPackage.AGGREGATE_DEFINITION__AGGREGATE:
                return getAggregate();
            case SpringPackage.AGGREGATE_DEFINITION__BEAN:
                return getBean();
            case SpringPackage.AGGREGATE_DEFINITION__DO_CATCH:
                return getDoCatch();
            case SpringPackage.AGGREGATE_DEFINITION__WHEN:
                return getWhen();
            case SpringPackage.AGGREGATE_DEFINITION__CHOICE:
                return getChoice();
            case SpringPackage.AGGREGATE_DEFINITION__OTHERWISE:
                return getOtherwise();
            case SpringPackage.AGGREGATE_DEFINITION__CONVERT_BODY_TO:
                return getConvertBodyTo();
            case SpringPackage.AGGREGATE_DEFINITION__DELAY:
                return getDelay();
            case SpringPackage.AGGREGATE_DEFINITION__DYNAMIC_ROUTER:
                return getDynamicRouter();
            case SpringPackage.AGGREGATE_DEFINITION__ENRICH:
                return getEnrich();
            case SpringPackage.AGGREGATE_DEFINITION__FILTER:
                return getFilter();
            case SpringPackage.AGGREGATE_DEFINITION__DO_FINALLY:
                return getDoFinally();
            case SpringPackage.AGGREGATE_DEFINITION__IDEMPOTENT_CONSUMER:
                return getIdempotentConsumer();
            case SpringPackage.AGGREGATE_DEFINITION__IN_ONLY:
                return getInOnly();
            case SpringPackage.AGGREGATE_DEFINITION__IN_OUT:
                return getInOut();
            case SpringPackage.AGGREGATE_DEFINITION__INTERCEPT:
                return getIntercept();
            case SpringPackage.AGGREGATE_DEFINITION__INTERCEPT_FROM:
                return getInterceptFrom();
            case SpringPackage.AGGREGATE_DEFINITION__INTERCEPT_TO_ENDPOINT:
                return getInterceptToEndpoint();
            case SpringPackage.AGGREGATE_DEFINITION__LOAD_BALANCE:
                return getLoadBalance();
            case SpringPackage.AGGREGATE_DEFINITION__LOG:
                return getLog();
            case SpringPackage.AGGREGATE_DEFINITION__LOOP:
                return getLoop();
            case SpringPackage.AGGREGATE_DEFINITION__MARSHAL:
                return getMarshal();
            case SpringPackage.AGGREGATE_DEFINITION__MULTICAST:
                return getMulticast();
            case SpringPackage.AGGREGATE_DEFINITION__ON_COMPLETION:
                return getOnCompletion();
            case SpringPackage.AGGREGATE_DEFINITION__ON_EXCEPTION:
                return getOnException();
            case SpringPackage.AGGREGATE_DEFINITION__PIPELINE:
                return getPipeline();
            case SpringPackage.AGGREGATE_DEFINITION__POLICY:
                return getPolicy();
            case SpringPackage.AGGREGATE_DEFINITION__POLL_ENRICH:
                return getPollEnrich();
            case SpringPackage.AGGREGATE_DEFINITION__PROCESS:
                return getProcess();
            case SpringPackage.AGGREGATE_DEFINITION__RECIPIENT_LIST:
                return getRecipientList();
            case SpringPackage.AGGREGATE_DEFINITION__REMOVE_HEADER:
                return getRemoveHeader();
            case SpringPackage.AGGREGATE_DEFINITION__REMOVE_HEADERS:
                return getRemoveHeaders();
            case SpringPackage.AGGREGATE_DEFINITION__REMOVE_PROPERTY:
                return getRemoveProperty();
            case SpringPackage.AGGREGATE_DEFINITION__RESEQUENCE:
                return getResequence();
            case SpringPackage.AGGREGATE_DEFINITION__ROLLBACK:
                return getRollback();
            case SpringPackage.AGGREGATE_DEFINITION__ROUTE:
                return getRoute();
            case SpringPackage.AGGREGATE_DEFINITION__ROUTING_SLIP:
                return getRoutingSlip();
            case SpringPackage.AGGREGATE_DEFINITION__SAMPLE:
                return getSample();
            case SpringPackage.AGGREGATE_DEFINITION__SET_BODY:
                return getSetBody();
            case SpringPackage.AGGREGATE_DEFINITION__SET_EXCHANGE_PATTERN:
                return getSetExchangePattern();
            case SpringPackage.AGGREGATE_DEFINITION__SET_FAULT_BODY:
                return getSetFaultBody();
            case SpringPackage.AGGREGATE_DEFINITION__SET_HEADER:
                return getSetHeader();
            case SpringPackage.AGGREGATE_DEFINITION__SET_OUT_HEADER:
                return getSetOutHeader();
            case SpringPackage.AGGREGATE_DEFINITION__SET_PROPERTY:
                return getSetProperty();
            case SpringPackage.AGGREGATE_DEFINITION__SORT:
                return getSort();
            case SpringPackage.AGGREGATE_DEFINITION__SPLIT:
                return getSplit();
            case SpringPackage.AGGREGATE_DEFINITION__STOP:
                return getStop();
            case SpringPackage.AGGREGATE_DEFINITION__THREADS:
                return getThreads();
            case SpringPackage.AGGREGATE_DEFINITION__THROTTLE:
                return getThrottle();
            case SpringPackage.AGGREGATE_DEFINITION__THROW_EXCEPTION:
                return getThrowException();
            case SpringPackage.AGGREGATE_DEFINITION__TO:
                return getTo();
            case SpringPackage.AGGREGATE_DEFINITION__TRANSACTED:
                return getTransacted();
            case SpringPackage.AGGREGATE_DEFINITION__TRANSFORM:
                return getTransform();
            case SpringPackage.AGGREGATE_DEFINITION__DO_TRY:
                return getDoTry();
            case SpringPackage.AGGREGATE_DEFINITION__UNMARSHAL:
                return getUnmarshal();
            case SpringPackage.AGGREGATE_DEFINITION__VALIDATE:
                return getValidate();
            case SpringPackage.AGGREGATE_DEFINITION__WIRE_TAP:
                return getWireTap();
            case SpringPackage.AGGREGATE_DEFINITION__AGGREGATION_REPOSITORY_REF:
                return getAggregationRepositoryRef();
            case SpringPackage.AGGREGATE_DEFINITION__CLOSE_CORRELATION_KEY_ON_COMPLETION:
                return getCloseCorrelationKeyOnCompletion();
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_FROM_BATCH_CONSUMER:
                return isCompletionFromBatchConsumer();
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_INTERVAL:
                return getCompletionInterval();
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE1:
                return getCompletionSize1();
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT1:
                return getCompletionTimeout1();
            case SpringPackage.AGGREGATE_DEFINITION__DISCARD_ON_COMPLETION_TIMEOUT:
                return isDiscardOnCompletionTimeout();
            case SpringPackage.AGGREGATE_DEFINITION__EAGER_CHECK_COMPLETION:
                return isEagerCheckCompletion();
            case SpringPackage.AGGREGATE_DEFINITION__EXECUTOR_SERVICE_REF:
                return getExecutorServiceRef();
            case SpringPackage.AGGREGATE_DEFINITION__GROUP_EXCHANGES:
                return isGroupExchanges();
            case SpringPackage.AGGREGATE_DEFINITION__IGNORE_INVALID_CORRELATION_KEYS:
                return isIgnoreInvalidCorrelationKeys();
            case SpringPackage.AGGREGATE_DEFINITION__PARALLEL_PROCESSING:
                return isParallelProcessing();
            case SpringPackage.AGGREGATE_DEFINITION__STRATEGY_REF:
                return getStrategyRef();
            case SpringPackage.AGGREGATE_DEFINITION__ANY_ATTRIBUTE1:
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
            case SpringPackage.AGGREGATE_DEFINITION__CORRELATION_EXPRESSION:
                setCorrelationExpression((ExpressionSubElementDefinition)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_PREDICATE:
                setCompletionPredicate((ExpressionSubElementDefinition)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT:
                setCompletionTimeout((ExpressionSubElementDefinition)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE:
                setCompletionSize((ExpressionSubElementDefinition)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__AOP:
                getAop().clear();
                getAop().addAll((Collection<? extends AopDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__AGGREGATE:
                getAggregate().clear();
                getAggregate().addAll((Collection<? extends AggregateDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__BEAN:
                getBean().clear();
                getBean().addAll((Collection<? extends BeanDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__DO_CATCH:
                getDoCatch().clear();
                getDoCatch().addAll((Collection<? extends CatchDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__WHEN:
                getWhen().clear();
                getWhen().addAll((Collection<? extends WhenDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__CHOICE:
                getChoice().clear();
                getChoice().addAll((Collection<? extends ChoiceDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__OTHERWISE:
                getOtherwise().clear();
                getOtherwise().addAll((Collection<? extends OtherwiseDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__CONVERT_BODY_TO:
                getConvertBodyTo().clear();
                getConvertBodyTo().addAll((Collection<? extends ConvertBodyDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__DELAY:
                getDelay().clear();
                getDelay().addAll((Collection<? extends DelayDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__DYNAMIC_ROUTER:
                getDynamicRouter().clear();
                getDynamicRouter().addAll((Collection<? extends DynamicRouterDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__ENRICH:
                getEnrich().clear();
                getEnrich().addAll((Collection<? extends EnrichDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__FILTER:
                getFilter().clear();
                getFilter().addAll((Collection<? extends FilterDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__DO_FINALLY:
                getDoFinally().clear();
                getDoFinally().addAll((Collection<? extends FinallyDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__IDEMPOTENT_CONSUMER:
                getIdempotentConsumer().clear();
                getIdempotentConsumer().addAll((Collection<? extends IdempotentConsumerDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__IN_ONLY:
                getInOnly().clear();
                getInOnly().addAll((Collection<? extends InOnlyDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__IN_OUT:
                getInOut().clear();
                getInOut().addAll((Collection<? extends InOutDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__INTERCEPT:
                getIntercept().clear();
                getIntercept().addAll((Collection<? extends InterceptDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__INTERCEPT_FROM:
                getInterceptFrom().clear();
                getInterceptFrom().addAll((Collection<? extends InterceptFromDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__INTERCEPT_TO_ENDPOINT:
                getInterceptToEndpoint().clear();
                getInterceptToEndpoint().addAll((Collection<? extends InterceptSendToEndpointDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__LOAD_BALANCE:
                getLoadBalance().clear();
                getLoadBalance().addAll((Collection<? extends LoadBalanceDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__LOG:
                getLog().clear();
                getLog().addAll((Collection<? extends LogDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__LOOP:
                getLoop().clear();
                getLoop().addAll((Collection<? extends LoopDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__MARSHAL:
                getMarshal().clear();
                getMarshal().addAll((Collection<? extends MarshalDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__MULTICAST:
                getMulticast().clear();
                getMulticast().addAll((Collection<? extends MulticastDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__ON_COMPLETION:
                getOnCompletion().clear();
                getOnCompletion().addAll((Collection<? extends OnCompletionDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__ON_EXCEPTION:
                getOnException().clear();
                getOnException().addAll((Collection<? extends OnExceptionDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__PIPELINE:
                getPipeline().clear();
                getPipeline().addAll((Collection<? extends PipelineDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__POLICY:
                getPolicy().clear();
                getPolicy().addAll((Collection<? extends PolicyDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__POLL_ENRICH:
                getPollEnrich().clear();
                getPollEnrich().addAll((Collection<? extends PollEnrichDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__PROCESS:
                getProcess().clear();
                getProcess().addAll((Collection<? extends ProcessDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__RECIPIENT_LIST:
                getRecipientList().clear();
                getRecipientList().addAll((Collection<? extends RecipientListDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__REMOVE_HEADER:
                getRemoveHeader().clear();
                getRemoveHeader().addAll((Collection<? extends RemoveHeaderDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__REMOVE_HEADERS:
                getRemoveHeaders().clear();
                getRemoveHeaders().addAll((Collection<? extends RemoveHeadersDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__REMOVE_PROPERTY:
                getRemoveProperty().clear();
                getRemoveProperty().addAll((Collection<? extends RemovePropertyDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__RESEQUENCE:
                getResequence().clear();
                getResequence().addAll((Collection<? extends ResequenceDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__ROLLBACK:
                getRollback().clear();
                getRollback().addAll((Collection<? extends RollbackDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__ROUTE:
                getRoute().clear();
                getRoute().addAll((Collection<? extends RouteDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__ROUTING_SLIP:
                getRoutingSlip().clear();
                getRoutingSlip().addAll((Collection<? extends RoutingSlipDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__SAMPLE:
                getSample().clear();
                getSample().addAll((Collection<? extends SamplingDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__SET_BODY:
                getSetBody().clear();
                getSetBody().addAll((Collection<? extends SetBodyDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__SET_EXCHANGE_PATTERN:
                getSetExchangePattern().clear();
                getSetExchangePattern().addAll((Collection<? extends SetExchangePatternDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__SET_FAULT_BODY:
                getSetFaultBody().clear();
                getSetFaultBody().addAll((Collection<? extends SetFaultBodyDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__SET_HEADER:
                getSetHeader().clear();
                getSetHeader().addAll((Collection<? extends SetHeaderDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__SET_OUT_HEADER:
                getSetOutHeader().clear();
                getSetOutHeader().addAll((Collection<? extends SetOutHeaderDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__SET_PROPERTY:
                getSetProperty().clear();
                getSetProperty().addAll((Collection<? extends SetPropertyDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__SORT:
                getSort().clear();
                getSort().addAll((Collection<? extends SortDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__SPLIT:
                getSplit().clear();
                getSplit().addAll((Collection<? extends SplitDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__STOP:
                getStop().clear();
                getStop().addAll((Collection<? extends StopDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__THREADS:
                getThreads().clear();
                getThreads().addAll((Collection<? extends ThreadsDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__THROTTLE:
                getThrottle().clear();
                getThrottle().addAll((Collection<? extends ThrottleDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__THROW_EXCEPTION:
                getThrowException().clear();
                getThrowException().addAll((Collection<? extends ThrowExceptionDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__TO:
                getTo().clear();
                getTo().addAll((Collection<? extends ToDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__TRANSACTED:
                getTransacted().clear();
                getTransacted().addAll((Collection<? extends TransactedDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__TRANSFORM:
                getTransform().clear();
                getTransform().addAll((Collection<? extends TransformDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__DO_TRY:
                getDoTry().clear();
                getDoTry().addAll((Collection<? extends TryDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__UNMARSHAL:
                getUnmarshal().clear();
                getUnmarshal().addAll((Collection<? extends UnmarshalDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__VALIDATE:
                getValidate().clear();
                getValidate().addAll((Collection<? extends ValidateDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__WIRE_TAP:
                getWireTap().clear();
                getWireTap().addAll((Collection<? extends WireTapDefinition>)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__AGGREGATION_REPOSITORY_REF:
                setAggregationRepositoryRef((String)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__CLOSE_CORRELATION_KEY_ON_COMPLETION:
                setCloseCorrelationKeyOnCompletion((Integer)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_FROM_BATCH_CONSUMER:
                setCompletionFromBatchConsumer((Boolean)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_INTERVAL:
                setCompletionInterval((Long)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE1:
                setCompletionSize1((Integer)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT1:
                setCompletionTimeout1((Long)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__DISCARD_ON_COMPLETION_TIMEOUT:
                setDiscardOnCompletionTimeout((Boolean)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__EAGER_CHECK_COMPLETION:
                setEagerCheckCompletion((Boolean)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__EXECUTOR_SERVICE_REF:
                setExecutorServiceRef((String)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__GROUP_EXCHANGES:
                setGroupExchanges((Boolean)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__IGNORE_INVALID_CORRELATION_KEYS:
                setIgnoreInvalidCorrelationKeys((Boolean)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__PARALLEL_PROCESSING:
                setParallelProcessing((Boolean)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__STRATEGY_REF:
                setStrategyRef((String)newValue);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__ANY_ATTRIBUTE1:
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
            case SpringPackage.AGGREGATE_DEFINITION__CORRELATION_EXPRESSION:
                setCorrelationExpression((ExpressionSubElementDefinition)null);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_PREDICATE:
                setCompletionPredicate((ExpressionSubElementDefinition)null);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT:
                setCompletionTimeout((ExpressionSubElementDefinition)null);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE:
                setCompletionSize((ExpressionSubElementDefinition)null);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__GROUP:
                getGroup().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__AOP:
                getAop().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__AGGREGATE:
                getAggregate().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__BEAN:
                getBean().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__DO_CATCH:
                getDoCatch().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__WHEN:
                getWhen().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__CHOICE:
                getChoice().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__OTHERWISE:
                getOtherwise().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__CONVERT_BODY_TO:
                getConvertBodyTo().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__DELAY:
                getDelay().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__DYNAMIC_ROUTER:
                getDynamicRouter().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__ENRICH:
                getEnrich().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__FILTER:
                getFilter().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__DO_FINALLY:
                getDoFinally().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__IDEMPOTENT_CONSUMER:
                getIdempotentConsumer().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__IN_ONLY:
                getInOnly().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__IN_OUT:
                getInOut().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__INTERCEPT:
                getIntercept().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__INTERCEPT_FROM:
                getInterceptFrom().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__INTERCEPT_TO_ENDPOINT:
                getInterceptToEndpoint().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__LOAD_BALANCE:
                getLoadBalance().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__LOG:
                getLog().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__LOOP:
                getLoop().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__MARSHAL:
                getMarshal().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__MULTICAST:
                getMulticast().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__ON_COMPLETION:
                getOnCompletion().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__ON_EXCEPTION:
                getOnException().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__PIPELINE:
                getPipeline().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__POLICY:
                getPolicy().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__POLL_ENRICH:
                getPollEnrich().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__PROCESS:
                getProcess().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__RECIPIENT_LIST:
                getRecipientList().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__REMOVE_HEADER:
                getRemoveHeader().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__REMOVE_HEADERS:
                getRemoveHeaders().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__REMOVE_PROPERTY:
                getRemoveProperty().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__RESEQUENCE:
                getResequence().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__ROLLBACK:
                getRollback().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__ROUTE:
                getRoute().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__ROUTING_SLIP:
                getRoutingSlip().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__SAMPLE:
                getSample().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__SET_BODY:
                getSetBody().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__SET_EXCHANGE_PATTERN:
                getSetExchangePattern().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__SET_FAULT_BODY:
                getSetFaultBody().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__SET_HEADER:
                getSetHeader().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__SET_OUT_HEADER:
                getSetOutHeader().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__SET_PROPERTY:
                getSetProperty().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__SORT:
                getSort().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__SPLIT:
                getSplit().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__STOP:
                getStop().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__THREADS:
                getThreads().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__THROTTLE:
                getThrottle().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__THROW_EXCEPTION:
                getThrowException().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__TO:
                getTo().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__TRANSACTED:
                getTransacted().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__TRANSFORM:
                getTransform().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__DO_TRY:
                getDoTry().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__UNMARSHAL:
                getUnmarshal().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__VALIDATE:
                getValidate().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__WIRE_TAP:
                getWireTap().clear();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__AGGREGATION_REPOSITORY_REF:
                setAggregationRepositoryRef(AGGREGATION_REPOSITORY_REF_EDEFAULT);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__CLOSE_CORRELATION_KEY_ON_COMPLETION:
                unsetCloseCorrelationKeyOnCompletion();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_FROM_BATCH_CONSUMER:
                unsetCompletionFromBatchConsumer();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_INTERVAL:
                unsetCompletionInterval();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE1:
                unsetCompletionSize1();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT1:
                unsetCompletionTimeout1();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__DISCARD_ON_COMPLETION_TIMEOUT:
                unsetDiscardOnCompletionTimeout();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__EAGER_CHECK_COMPLETION:
                unsetEagerCheckCompletion();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__EXECUTOR_SERVICE_REF:
                setExecutorServiceRef(EXECUTOR_SERVICE_REF_EDEFAULT);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__GROUP_EXCHANGES:
                unsetGroupExchanges();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__IGNORE_INVALID_CORRELATION_KEYS:
                unsetIgnoreInvalidCorrelationKeys();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__PARALLEL_PROCESSING:
                unsetParallelProcessing();
                return;
            case SpringPackage.AGGREGATE_DEFINITION__STRATEGY_REF:
                setStrategyRef(STRATEGY_REF_EDEFAULT);
                return;
            case SpringPackage.AGGREGATE_DEFINITION__ANY_ATTRIBUTE1:
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
            case SpringPackage.AGGREGATE_DEFINITION__CORRELATION_EXPRESSION:
                return correlationExpression != null;
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_PREDICATE:
                return completionPredicate != null;
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT:
                return completionTimeout != null;
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE:
                return completionSize != null;
            case SpringPackage.AGGREGATE_DEFINITION__GROUP:
                return group != null && !group.isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__AOP:
                return !getAop().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__AGGREGATE:
                return !getAggregate().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__BEAN:
                return !getBean().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__DO_CATCH:
                return !getDoCatch().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__WHEN:
                return !getWhen().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__CHOICE:
                return !getChoice().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__OTHERWISE:
                return !getOtherwise().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__CONVERT_BODY_TO:
                return !getConvertBodyTo().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__DELAY:
                return !getDelay().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__DYNAMIC_ROUTER:
                return !getDynamicRouter().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__ENRICH:
                return !getEnrich().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__FILTER:
                return !getFilter().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__DO_FINALLY:
                return !getDoFinally().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__IDEMPOTENT_CONSUMER:
                return !getIdempotentConsumer().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__IN_ONLY:
                return !getInOnly().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__IN_OUT:
                return !getInOut().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__INTERCEPT:
                return !getIntercept().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__INTERCEPT_FROM:
                return !getInterceptFrom().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__INTERCEPT_TO_ENDPOINT:
                return !getInterceptToEndpoint().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__LOAD_BALANCE:
                return !getLoadBalance().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__LOG:
                return !getLog().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__LOOP:
                return !getLoop().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__MARSHAL:
                return !getMarshal().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__MULTICAST:
                return !getMulticast().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__ON_COMPLETION:
                return !getOnCompletion().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__ON_EXCEPTION:
                return !getOnException().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__PIPELINE:
                return !getPipeline().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__POLICY:
                return !getPolicy().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__POLL_ENRICH:
                return !getPollEnrich().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__PROCESS:
                return !getProcess().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__RECIPIENT_LIST:
                return !getRecipientList().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__REMOVE_HEADER:
                return !getRemoveHeader().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__REMOVE_HEADERS:
                return !getRemoveHeaders().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__REMOVE_PROPERTY:
                return !getRemoveProperty().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__RESEQUENCE:
                return !getResequence().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__ROLLBACK:
                return !getRollback().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__ROUTE:
                return !getRoute().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__ROUTING_SLIP:
                return !getRoutingSlip().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__SAMPLE:
                return !getSample().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__SET_BODY:
                return !getSetBody().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__SET_EXCHANGE_PATTERN:
                return !getSetExchangePattern().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__SET_FAULT_BODY:
                return !getSetFaultBody().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__SET_HEADER:
                return !getSetHeader().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__SET_OUT_HEADER:
                return !getSetOutHeader().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__SET_PROPERTY:
                return !getSetProperty().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__SORT:
                return !getSort().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__SPLIT:
                return !getSplit().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__STOP:
                return !getStop().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__THREADS:
                return !getThreads().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__THROTTLE:
                return !getThrottle().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__THROW_EXCEPTION:
                return !getThrowException().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__TO:
                return !getTo().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__TRANSACTED:
                return !getTransacted().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__TRANSFORM:
                return !getTransform().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__DO_TRY:
                return !getDoTry().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__UNMARSHAL:
                return !getUnmarshal().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__VALIDATE:
                return !getValidate().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__WIRE_TAP:
                return !getWireTap().isEmpty();
            case SpringPackage.AGGREGATE_DEFINITION__AGGREGATION_REPOSITORY_REF:
                return AGGREGATION_REPOSITORY_REF_EDEFAULT == null ? aggregationRepositoryRef != null : !AGGREGATION_REPOSITORY_REF_EDEFAULT.equals(aggregationRepositoryRef);
            case SpringPackage.AGGREGATE_DEFINITION__CLOSE_CORRELATION_KEY_ON_COMPLETION:
                return isSetCloseCorrelationKeyOnCompletion();
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_FROM_BATCH_CONSUMER:
                return isSetCompletionFromBatchConsumer();
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_INTERVAL:
                return isSetCompletionInterval();
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_SIZE1:
                return isSetCompletionSize1();
            case SpringPackage.AGGREGATE_DEFINITION__COMPLETION_TIMEOUT1:
                return isSetCompletionTimeout1();
            case SpringPackage.AGGREGATE_DEFINITION__DISCARD_ON_COMPLETION_TIMEOUT:
                return isSetDiscardOnCompletionTimeout();
            case SpringPackage.AGGREGATE_DEFINITION__EAGER_CHECK_COMPLETION:
                return isSetEagerCheckCompletion();
            case SpringPackage.AGGREGATE_DEFINITION__EXECUTOR_SERVICE_REF:
                return EXECUTOR_SERVICE_REF_EDEFAULT == null ? executorServiceRef != null : !EXECUTOR_SERVICE_REF_EDEFAULT.equals(executorServiceRef);
            case SpringPackage.AGGREGATE_DEFINITION__GROUP_EXCHANGES:
                return isSetGroupExchanges();
            case SpringPackage.AGGREGATE_DEFINITION__IGNORE_INVALID_CORRELATION_KEYS:
                return isSetIgnoreInvalidCorrelationKeys();
            case SpringPackage.AGGREGATE_DEFINITION__PARALLEL_PROCESSING:
                return isSetParallelProcessing();
            case SpringPackage.AGGREGATE_DEFINITION__STRATEGY_REF:
                return STRATEGY_REF_EDEFAULT == null ? strategyRef != null : !STRATEGY_REF_EDEFAULT.equals(strategyRef);
            case SpringPackage.AGGREGATE_DEFINITION__ANY_ATTRIBUTE1:
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
        result.append(", aggregationRepositoryRef: ");
        result.append(aggregationRepositoryRef);
        result.append(", closeCorrelationKeyOnCompletion: ");
        if (closeCorrelationKeyOnCompletionESet) result.append(closeCorrelationKeyOnCompletion); else result.append("<unset>");
        result.append(", completionFromBatchConsumer: ");
        if (completionFromBatchConsumerESet) result.append(completionFromBatchConsumer); else result.append("<unset>");
        result.append(", completionInterval: ");
        if (completionIntervalESet) result.append(completionInterval); else result.append("<unset>");
        result.append(", completionSize1: ");
        if (completionSize1ESet) result.append(completionSize1); else result.append("<unset>");
        result.append(", completionTimeout1: ");
        if (completionTimeout1ESet) result.append(completionTimeout1); else result.append("<unset>");
        result.append(", discardOnCompletionTimeout: ");
        if (discardOnCompletionTimeoutESet) result.append(discardOnCompletionTimeout); else result.append("<unset>");
        result.append(", eagerCheckCompletion: ");
        if (eagerCheckCompletionESet) result.append(eagerCheckCompletion); else result.append("<unset>");
        result.append(", executorServiceRef: ");
        result.append(executorServiceRef);
        result.append(", groupExchanges: ");
        if (groupExchangesESet) result.append(groupExchanges); else result.append("<unset>");
        result.append(", ignoreInvalidCorrelationKeys: ");
        if (ignoreInvalidCorrelationKeysESet) result.append(ignoreInvalidCorrelationKeys); else result.append("<unset>");
        result.append(", parallelProcessing: ");
        if (parallelProcessingESet) result.append(parallelProcessing); else result.append("<unset>");
        result.append(", strategyRef: ");
        result.append(strategyRef);
        result.append(", anyAttribute1: ");
        result.append(anyAttribute1);
        result.append(')');
        return result.toString();
    }

} //AggregateDefinitionImpl
