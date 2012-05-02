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
import org.switchyard.tools.models.switchyard1_0.spring.CustomLoadBalancerDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.DelayDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.DynamicRouterDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.EnrichDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.FailoverLoadBalancerDefinition;
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
import org.switchyard.tools.models.switchyard1_0.spring.RandomLoadBalancerDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RecipientListDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RemoveHeaderDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RemoveHeadersDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RemovePropertyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RollbackDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RoundRobinLoadBalancerDefinition;
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
import org.switchyard.tools.models.switchyard1_0.spring.StickyLoadBalancerDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.StopDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ThrowExceptionDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ToDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.TopicLoadBalancerDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.TransactedDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.TransformDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.TryDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.UnmarshalDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ValidateDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.WeightedLoadBalancerDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.WhenDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Balance Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getFailover <em>Failover</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getRandom <em>Random</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getCustom <em>Custom</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getRoundRobin <em>Round Robin</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getSticky <em>Sticky</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getWeighted <em>Weighted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getAop <em>Aop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getInOnly <em>In Only</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getInOut <em>In Out</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getInterceptToEndpoint <em>Intercept To Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getLog <em>Log</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getSample <em>Sample</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getSetFaultBody <em>Set Fault Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getSetOutHeader <em>Set Out Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.LoadBalanceDefinitionImpl#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadBalanceDefinitionImpl extends ProcessorDefinitionImpl implements LoadBalanceDefinition {
	/**
	 * The cached value of the '{@link #getFailover() <em>Failover</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailover()
	 * @generated
	 * @ordered
	 */
	protected FailoverLoadBalancerDefinition failover;

	/**
	 * The cached value of the '{@link #getRandom() <em>Random</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandom()
	 * @generated
	 * @ordered
	 */
	protected RandomLoadBalancerDefinition random;

	/**
	 * The cached value of the '{@link #getCustom() <em>Custom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom()
	 * @generated
	 * @ordered
	 */
	protected CustomLoadBalancerDefinition custom;

	/**
	 * The cached value of the '{@link #getRoundRobin() <em>Round Robin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundRobin()
	 * @generated
	 * @ordered
	 */
	protected RoundRobinLoadBalancerDefinition roundRobin;

	/**
	 * The cached value of the '{@link #getSticky() <em>Sticky</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSticky()
	 * @generated
	 * @ordered
	 */
	protected StickyLoadBalancerDefinition sticky;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected TopicLoadBalancerDefinition topic;

	/**
	 * The cached value of the '{@link #getWeighted() <em>Weighted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeighted()
	 * @generated
	 * @ordered
	 */
	protected WeightedLoadBalancerDefinition weighted;

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
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

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
	protected LoadBalanceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getLoadBalanceDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailoverLoadBalancerDefinition getFailover() {
		return failover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailover(FailoverLoadBalancerDefinition newFailover, NotificationChain msgs) {
		FailoverLoadBalancerDefinition oldFailover = failover;
		failover = newFailover;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.LOAD_BALANCE_DEFINITION__FAILOVER, oldFailover, newFailover);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailover(FailoverLoadBalancerDefinition newFailover) {
		if (newFailover != failover) {
			NotificationChain msgs = null;
			if (failover != null)
				msgs = ((InternalEObject)failover).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.LOAD_BALANCE_DEFINITION__FAILOVER, null, msgs);
			if (newFailover != null)
				msgs = ((InternalEObject)newFailover).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.LOAD_BALANCE_DEFINITION__FAILOVER, null, msgs);
			msgs = basicSetFailover(newFailover, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.LOAD_BALANCE_DEFINITION__FAILOVER, newFailover, newFailover));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RandomLoadBalancerDefinition getRandom() {
		return random;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRandom(RandomLoadBalancerDefinition newRandom, NotificationChain msgs) {
		RandomLoadBalancerDefinition oldRandom = random;
		random = newRandom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.LOAD_BALANCE_DEFINITION__RANDOM, oldRandom, newRandom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRandom(RandomLoadBalancerDefinition newRandom) {
		if (newRandom != random) {
			NotificationChain msgs = null;
			if (random != null)
				msgs = ((InternalEObject)random).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.LOAD_BALANCE_DEFINITION__RANDOM, null, msgs);
			if (newRandom != null)
				msgs = ((InternalEObject)newRandom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.LOAD_BALANCE_DEFINITION__RANDOM, null, msgs);
			msgs = basicSetRandom(newRandom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.LOAD_BALANCE_DEFINITION__RANDOM, newRandom, newRandom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomLoadBalancerDefinition getCustom() {
		return custom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustom(CustomLoadBalancerDefinition newCustom, NotificationChain msgs) {
		CustomLoadBalancerDefinition oldCustom = custom;
		custom = newCustom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.LOAD_BALANCE_DEFINITION__CUSTOM, oldCustom, newCustom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustom(CustomLoadBalancerDefinition newCustom) {
		if (newCustom != custom) {
			NotificationChain msgs = null;
			if (custom != null)
				msgs = ((InternalEObject)custom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.LOAD_BALANCE_DEFINITION__CUSTOM, null, msgs);
			if (newCustom != null)
				msgs = ((InternalEObject)newCustom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.LOAD_BALANCE_DEFINITION__CUSTOM, null, msgs);
			msgs = basicSetCustom(newCustom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.LOAD_BALANCE_DEFINITION__CUSTOM, newCustom, newCustom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundRobinLoadBalancerDefinition getRoundRobin() {
		return roundRobin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoundRobin(RoundRobinLoadBalancerDefinition newRoundRobin, NotificationChain msgs) {
		RoundRobinLoadBalancerDefinition oldRoundRobin = roundRobin;
		roundRobin = newRoundRobin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.LOAD_BALANCE_DEFINITION__ROUND_ROBIN, oldRoundRobin, newRoundRobin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoundRobin(RoundRobinLoadBalancerDefinition newRoundRobin) {
		if (newRoundRobin != roundRobin) {
			NotificationChain msgs = null;
			if (roundRobin != null)
				msgs = ((InternalEObject)roundRobin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.LOAD_BALANCE_DEFINITION__ROUND_ROBIN, null, msgs);
			if (newRoundRobin != null)
				msgs = ((InternalEObject)newRoundRobin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.LOAD_BALANCE_DEFINITION__ROUND_ROBIN, null, msgs);
			msgs = basicSetRoundRobin(newRoundRobin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.LOAD_BALANCE_DEFINITION__ROUND_ROBIN, newRoundRobin, newRoundRobin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StickyLoadBalancerDefinition getSticky() {
		return sticky;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSticky(StickyLoadBalancerDefinition newSticky, NotificationChain msgs) {
		StickyLoadBalancerDefinition oldSticky = sticky;
		sticky = newSticky;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.LOAD_BALANCE_DEFINITION__STICKY, oldSticky, newSticky);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSticky(StickyLoadBalancerDefinition newSticky) {
		if (newSticky != sticky) {
			NotificationChain msgs = null;
			if (sticky != null)
				msgs = ((InternalEObject)sticky).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.LOAD_BALANCE_DEFINITION__STICKY, null, msgs);
			if (newSticky != null)
				msgs = ((InternalEObject)newSticky).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.LOAD_BALANCE_DEFINITION__STICKY, null, msgs);
			msgs = basicSetSticky(newSticky, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.LOAD_BALANCE_DEFINITION__STICKY, newSticky, newSticky));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicLoadBalancerDefinition getTopic() {
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopic(TopicLoadBalancerDefinition newTopic, NotificationChain msgs) {
		TopicLoadBalancerDefinition oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.LOAD_BALANCE_DEFINITION__TOPIC, oldTopic, newTopic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopic(TopicLoadBalancerDefinition newTopic) {
		if (newTopic != topic) {
			NotificationChain msgs = null;
			if (topic != null)
				msgs = ((InternalEObject)topic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.LOAD_BALANCE_DEFINITION__TOPIC, null, msgs);
			if (newTopic != null)
				msgs = ((InternalEObject)newTopic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.LOAD_BALANCE_DEFINITION__TOPIC, null, msgs);
			msgs = basicSetTopic(newTopic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.LOAD_BALANCE_DEFINITION__TOPIC, newTopic, newTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeightedLoadBalancerDefinition getWeighted() {
		return weighted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeighted(WeightedLoadBalancerDefinition newWeighted, NotificationChain msgs) {
		WeightedLoadBalancerDefinition oldWeighted = weighted;
		weighted = newWeighted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.LOAD_BALANCE_DEFINITION__WEIGHTED, oldWeighted, newWeighted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeighted(WeightedLoadBalancerDefinition newWeighted) {
		if (newWeighted != weighted) {
			NotificationChain msgs = null;
			if (weighted != null)
				msgs = ((InternalEObject)weighted).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.LOAD_BALANCE_DEFINITION__WEIGHTED, null, msgs);
			if (newWeighted != null)
				msgs = ((InternalEObject)newWeighted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.LOAD_BALANCE_DEFINITION__WEIGHTED, null, msgs);
			msgs = basicSetWeighted(newWeighted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.LOAD_BALANCE_DEFINITION__WEIGHTED, newWeighted, newWeighted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, SpringPackage.LOAD_BALANCE_DEFINITION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AopDefinition> getAop() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Aop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregateDefinition> getAggregate() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Aggregate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BeanDefinition> getBean() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Bean());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CatchDefinition> getDoCatch() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_DoCatch());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WhenDefinition> getWhen() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_When());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChoiceDefinition> getChoice() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Choice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherwiseDefinition> getOtherwise() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Otherwise());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConvertBodyDefinition> getConvertBodyTo() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_ConvertBodyTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelayDefinition> getDelay() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Delay());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicRouterDefinition> getDynamicRouter() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_DynamicRouter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnrichDefinition> getEnrich() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Enrich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterDefinition> getFilter() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Filter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FinallyDefinition> getDoFinally() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_DoFinally());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdempotentConsumerDefinition> getIdempotentConsumer() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_IdempotentConsumer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InOnlyDefinition> getInOnly() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_InOnly());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InOutDefinition> getInOut() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_InOut());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterceptDefinition> getIntercept() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Intercept());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterceptFromDefinition> getInterceptFrom() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_InterceptFrom());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterceptSendToEndpointDefinition> getInterceptToEndpoint() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_InterceptToEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadBalanceDefinition> getLoadBalance() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_LoadBalance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogDefinition> getLog() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Log());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoopDefinition> getLoop() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Loop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarshalDefinition> getMarshal() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Marshal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MulticastDefinition> getMulticast() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Multicast());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnCompletionDefinition> getOnCompletion() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_OnCompletion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnExceptionDefinition> getOnException() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_OnException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PipelineDefinition> getPipeline() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Pipeline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolicyDefinition> getPolicy() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Policy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PollEnrichDefinition> getPollEnrich() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_PollEnrich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessDefinition> getProcess() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Process());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecipientListDefinition> getRecipientList() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_RecipientList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemoveHeaderDefinition> getRemoveHeader() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_RemoveHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemoveHeadersDefinition> getRemoveHeaders() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_RemoveHeaders());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemovePropertyDefinition> getRemoveProperty() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_RemoveProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResequenceDefinition> getResequence() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Resequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RollbackDefinition> getRollback() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Rollback());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RouteDefinition> getRoute() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Route());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoutingSlipDefinition> getRoutingSlip() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_RoutingSlip());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SamplingDefinition> getSample() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Sample());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetBodyDefinition> getSetBody() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_SetBody());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetExchangePatternDefinition> getSetExchangePattern() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_SetExchangePattern());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetFaultBodyDefinition> getSetFaultBody() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_SetFaultBody());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetHeaderDefinition> getSetHeader() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_SetHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetOutHeaderDefinition> getSetOutHeader() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_SetOutHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetPropertyDefinition> getSetProperty() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_SetProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortDefinition> getSort() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Sort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SplitDefinition> getSplit() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Split());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StopDefinition> getStop() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Stop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThreadsDefinition> getThreads() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Threads());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThrottleDefinition> getThrottle() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Throttle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThrowExceptionDefinition> getThrowException() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_ThrowException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToDefinition> getTo() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_To());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransactedDefinition> getTransacted() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Transacted());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformDefinition> getTransform() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Transform());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TryDefinition> getDoTry() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_DoTry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnmarshalDefinition> getUnmarshal() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Unmarshal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValidateDefinition> getValidate() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_Validate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WireTapDefinition> getWireTap() {
		return getGroup().list(SpringPackage.eINSTANCE.getLoadBalanceDefinition_WireTap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.LOAD_BALANCE_DEFINITION__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute1() {
		if (anyAttribute1 == null) {
			anyAttribute1 = new BasicFeatureMap(this, SpringPackage.LOAD_BALANCE_DEFINITION__ANY_ATTRIBUTE1);
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
			case SpringPackage.LOAD_BALANCE_DEFINITION__FAILOVER:
				return basicSetFailover(null, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__RANDOM:
				return basicSetRandom(null, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__CUSTOM:
				return basicSetCustom(null, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__ROUND_ROBIN:
				return basicSetRoundRobin(null, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__STICKY:
				return basicSetSticky(null, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__TOPIC:
				return basicSetTopic(null, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__WEIGHTED:
				return basicSetWeighted(null, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__AOP:
				return ((InternalEList<?>)getAop()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__AGGREGATE:
				return ((InternalEList<?>)getAggregate()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__BEAN:
				return ((InternalEList<?>)getBean()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__DO_CATCH:
				return ((InternalEList<?>)getDoCatch()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__WHEN:
				return ((InternalEList<?>)getWhen()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__CHOICE:
				return ((InternalEList<?>)getChoice()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__OTHERWISE:
				return ((InternalEList<?>)getOtherwise()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__CONVERT_BODY_TO:
				return ((InternalEList<?>)getConvertBodyTo()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__DELAY:
				return ((InternalEList<?>)getDelay()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__DYNAMIC_ROUTER:
				return ((InternalEList<?>)getDynamicRouter()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__ENRICH:
				return ((InternalEList<?>)getEnrich()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__DO_FINALLY:
				return ((InternalEList<?>)getDoFinally()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__IDEMPOTENT_CONSUMER:
				return ((InternalEList<?>)getIdempotentConsumer()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__IN_ONLY:
				return ((InternalEList<?>)getInOnly()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__IN_OUT:
				return ((InternalEList<?>)getInOut()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__INTERCEPT:
				return ((InternalEList<?>)getIntercept()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__INTERCEPT_FROM:
				return ((InternalEList<?>)getInterceptFrom()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__INTERCEPT_TO_ENDPOINT:
				return ((InternalEList<?>)getInterceptToEndpoint()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__LOAD_BALANCE:
				return ((InternalEList<?>)getLoadBalance()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__LOG:
				return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__LOOP:
				return ((InternalEList<?>)getLoop()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__MARSHAL:
				return ((InternalEList<?>)getMarshal()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__MULTICAST:
				return ((InternalEList<?>)getMulticast()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__ON_COMPLETION:
				return ((InternalEList<?>)getOnCompletion()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__ON_EXCEPTION:
				return ((InternalEList<?>)getOnException()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__PIPELINE:
				return ((InternalEList<?>)getPipeline()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__POLICY:
				return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__POLL_ENRICH:
				return ((InternalEList<?>)getPollEnrich()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__RECIPIENT_LIST:
				return ((InternalEList<?>)getRecipientList()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__REMOVE_HEADER:
				return ((InternalEList<?>)getRemoveHeader()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__REMOVE_HEADERS:
				return ((InternalEList<?>)getRemoveHeaders()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__REMOVE_PROPERTY:
				return ((InternalEList<?>)getRemoveProperty()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__RESEQUENCE:
				return ((InternalEList<?>)getResequence()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__ROLLBACK:
				return ((InternalEList<?>)getRollback()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__ROUTE:
				return ((InternalEList<?>)getRoute()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__ROUTING_SLIP:
				return ((InternalEList<?>)getRoutingSlip()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__SAMPLE:
				return ((InternalEList<?>)getSample()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_BODY:
				return ((InternalEList<?>)getSetBody()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_EXCHANGE_PATTERN:
				return ((InternalEList<?>)getSetExchangePattern()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_FAULT_BODY:
				return ((InternalEList<?>)getSetFaultBody()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_HEADER:
				return ((InternalEList<?>)getSetHeader()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_OUT_HEADER:
				return ((InternalEList<?>)getSetOutHeader()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_PROPERTY:
				return ((InternalEList<?>)getSetProperty()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__SORT:
				return ((InternalEList<?>)getSort()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__SPLIT:
				return ((InternalEList<?>)getSplit()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__STOP:
				return ((InternalEList<?>)getStop()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__THREADS:
				return ((InternalEList<?>)getThreads()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__THROTTLE:
				return ((InternalEList<?>)getThrottle()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__THROW_EXCEPTION:
				return ((InternalEList<?>)getThrowException()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__TO:
				return ((InternalEList<?>)getTo()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__TRANSACTED:
				return ((InternalEList<?>)getTransacted()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__TRANSFORM:
				return ((InternalEList<?>)getTransform()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__DO_TRY:
				return ((InternalEList<?>)getDoTry()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__UNMARSHAL:
				return ((InternalEList<?>)getUnmarshal()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__VALIDATE:
				return ((InternalEList<?>)getValidate()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__WIRE_TAP:
				return ((InternalEList<?>)getWireTap()).basicRemove(otherEnd, msgs);
			case SpringPackage.LOAD_BALANCE_DEFINITION__ANY_ATTRIBUTE1:
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
			case SpringPackage.LOAD_BALANCE_DEFINITION__FAILOVER:
				return getFailover();
			case SpringPackage.LOAD_BALANCE_DEFINITION__RANDOM:
				return getRandom();
			case SpringPackage.LOAD_BALANCE_DEFINITION__CUSTOM:
				return getCustom();
			case SpringPackage.LOAD_BALANCE_DEFINITION__ROUND_ROBIN:
				return getRoundRobin();
			case SpringPackage.LOAD_BALANCE_DEFINITION__STICKY:
				return getSticky();
			case SpringPackage.LOAD_BALANCE_DEFINITION__TOPIC:
				return getTopic();
			case SpringPackage.LOAD_BALANCE_DEFINITION__WEIGHTED:
				return getWeighted();
			case SpringPackage.LOAD_BALANCE_DEFINITION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SpringPackage.LOAD_BALANCE_DEFINITION__AOP:
				return getAop();
			case SpringPackage.LOAD_BALANCE_DEFINITION__AGGREGATE:
				return getAggregate();
			case SpringPackage.LOAD_BALANCE_DEFINITION__BEAN:
				return getBean();
			case SpringPackage.LOAD_BALANCE_DEFINITION__DO_CATCH:
				return getDoCatch();
			case SpringPackage.LOAD_BALANCE_DEFINITION__WHEN:
				return getWhen();
			case SpringPackage.LOAD_BALANCE_DEFINITION__CHOICE:
				return getChoice();
			case SpringPackage.LOAD_BALANCE_DEFINITION__OTHERWISE:
				return getOtherwise();
			case SpringPackage.LOAD_BALANCE_DEFINITION__CONVERT_BODY_TO:
				return getConvertBodyTo();
			case SpringPackage.LOAD_BALANCE_DEFINITION__DELAY:
				return getDelay();
			case SpringPackage.LOAD_BALANCE_DEFINITION__DYNAMIC_ROUTER:
				return getDynamicRouter();
			case SpringPackage.LOAD_BALANCE_DEFINITION__ENRICH:
				return getEnrich();
			case SpringPackage.LOAD_BALANCE_DEFINITION__FILTER:
				return getFilter();
			case SpringPackage.LOAD_BALANCE_DEFINITION__DO_FINALLY:
				return getDoFinally();
			case SpringPackage.LOAD_BALANCE_DEFINITION__IDEMPOTENT_CONSUMER:
				return getIdempotentConsumer();
			case SpringPackage.LOAD_BALANCE_DEFINITION__IN_ONLY:
				return getInOnly();
			case SpringPackage.LOAD_BALANCE_DEFINITION__IN_OUT:
				return getInOut();
			case SpringPackage.LOAD_BALANCE_DEFINITION__INTERCEPT:
				return getIntercept();
			case SpringPackage.LOAD_BALANCE_DEFINITION__INTERCEPT_FROM:
				return getInterceptFrom();
			case SpringPackage.LOAD_BALANCE_DEFINITION__INTERCEPT_TO_ENDPOINT:
				return getInterceptToEndpoint();
			case SpringPackage.LOAD_BALANCE_DEFINITION__LOAD_BALANCE:
				return getLoadBalance();
			case SpringPackage.LOAD_BALANCE_DEFINITION__LOG:
				return getLog();
			case SpringPackage.LOAD_BALANCE_DEFINITION__LOOP:
				return getLoop();
			case SpringPackage.LOAD_BALANCE_DEFINITION__MARSHAL:
				return getMarshal();
			case SpringPackage.LOAD_BALANCE_DEFINITION__MULTICAST:
				return getMulticast();
			case SpringPackage.LOAD_BALANCE_DEFINITION__ON_COMPLETION:
				return getOnCompletion();
			case SpringPackage.LOAD_BALANCE_DEFINITION__ON_EXCEPTION:
				return getOnException();
			case SpringPackage.LOAD_BALANCE_DEFINITION__PIPELINE:
				return getPipeline();
			case SpringPackage.LOAD_BALANCE_DEFINITION__POLICY:
				return getPolicy();
			case SpringPackage.LOAD_BALANCE_DEFINITION__POLL_ENRICH:
				return getPollEnrich();
			case SpringPackage.LOAD_BALANCE_DEFINITION__PROCESS:
				return getProcess();
			case SpringPackage.LOAD_BALANCE_DEFINITION__RECIPIENT_LIST:
				return getRecipientList();
			case SpringPackage.LOAD_BALANCE_DEFINITION__REMOVE_HEADER:
				return getRemoveHeader();
			case SpringPackage.LOAD_BALANCE_DEFINITION__REMOVE_HEADERS:
				return getRemoveHeaders();
			case SpringPackage.LOAD_BALANCE_DEFINITION__REMOVE_PROPERTY:
				return getRemoveProperty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__RESEQUENCE:
				return getResequence();
			case SpringPackage.LOAD_BALANCE_DEFINITION__ROLLBACK:
				return getRollback();
			case SpringPackage.LOAD_BALANCE_DEFINITION__ROUTE:
				return getRoute();
			case SpringPackage.LOAD_BALANCE_DEFINITION__ROUTING_SLIP:
				return getRoutingSlip();
			case SpringPackage.LOAD_BALANCE_DEFINITION__SAMPLE:
				return getSample();
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_BODY:
				return getSetBody();
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_EXCHANGE_PATTERN:
				return getSetExchangePattern();
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_FAULT_BODY:
				return getSetFaultBody();
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_HEADER:
				return getSetHeader();
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_OUT_HEADER:
				return getSetOutHeader();
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_PROPERTY:
				return getSetProperty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__SORT:
				return getSort();
			case SpringPackage.LOAD_BALANCE_DEFINITION__SPLIT:
				return getSplit();
			case SpringPackage.LOAD_BALANCE_DEFINITION__STOP:
				return getStop();
			case SpringPackage.LOAD_BALANCE_DEFINITION__THREADS:
				return getThreads();
			case SpringPackage.LOAD_BALANCE_DEFINITION__THROTTLE:
				return getThrottle();
			case SpringPackage.LOAD_BALANCE_DEFINITION__THROW_EXCEPTION:
				return getThrowException();
			case SpringPackage.LOAD_BALANCE_DEFINITION__TO:
				return getTo();
			case SpringPackage.LOAD_BALANCE_DEFINITION__TRANSACTED:
				return getTransacted();
			case SpringPackage.LOAD_BALANCE_DEFINITION__TRANSFORM:
				return getTransform();
			case SpringPackage.LOAD_BALANCE_DEFINITION__DO_TRY:
				return getDoTry();
			case SpringPackage.LOAD_BALANCE_DEFINITION__UNMARSHAL:
				return getUnmarshal();
			case SpringPackage.LOAD_BALANCE_DEFINITION__VALIDATE:
				return getValidate();
			case SpringPackage.LOAD_BALANCE_DEFINITION__WIRE_TAP:
				return getWireTap();
			case SpringPackage.LOAD_BALANCE_DEFINITION__REF:
				return getRef();
			case SpringPackage.LOAD_BALANCE_DEFINITION__ANY_ATTRIBUTE1:
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
			case SpringPackage.LOAD_BALANCE_DEFINITION__FAILOVER:
				setFailover((FailoverLoadBalancerDefinition)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__RANDOM:
				setRandom((RandomLoadBalancerDefinition)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__CUSTOM:
				setCustom((CustomLoadBalancerDefinition)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__ROUND_ROBIN:
				setRoundRobin((RoundRobinLoadBalancerDefinition)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__STICKY:
				setSticky((StickyLoadBalancerDefinition)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__TOPIC:
				setTopic((TopicLoadBalancerDefinition)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__WEIGHTED:
				setWeighted((WeightedLoadBalancerDefinition)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__AOP:
				getAop().clear();
				getAop().addAll((Collection<? extends AopDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__AGGREGATE:
				getAggregate().clear();
				getAggregate().addAll((Collection<? extends AggregateDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__BEAN:
				getBean().clear();
				getBean().addAll((Collection<? extends BeanDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__DO_CATCH:
				getDoCatch().clear();
				getDoCatch().addAll((Collection<? extends CatchDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__WHEN:
				getWhen().clear();
				getWhen().addAll((Collection<? extends WhenDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__CHOICE:
				getChoice().clear();
				getChoice().addAll((Collection<? extends ChoiceDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__OTHERWISE:
				getOtherwise().clear();
				getOtherwise().addAll((Collection<? extends OtherwiseDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__CONVERT_BODY_TO:
				getConvertBodyTo().clear();
				getConvertBodyTo().addAll((Collection<? extends ConvertBodyDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__DELAY:
				getDelay().clear();
				getDelay().addAll((Collection<? extends DelayDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__DYNAMIC_ROUTER:
				getDynamicRouter().clear();
				getDynamicRouter().addAll((Collection<? extends DynamicRouterDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__ENRICH:
				getEnrich().clear();
				getEnrich().addAll((Collection<? extends EnrichDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends FilterDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__DO_FINALLY:
				getDoFinally().clear();
				getDoFinally().addAll((Collection<? extends FinallyDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__IDEMPOTENT_CONSUMER:
				getIdempotentConsumer().clear();
				getIdempotentConsumer().addAll((Collection<? extends IdempotentConsumerDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__IN_ONLY:
				getInOnly().clear();
				getInOnly().addAll((Collection<? extends InOnlyDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__IN_OUT:
				getInOut().clear();
				getInOut().addAll((Collection<? extends InOutDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__INTERCEPT:
				getIntercept().clear();
				getIntercept().addAll((Collection<? extends InterceptDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				getInterceptFrom().addAll((Collection<? extends InterceptFromDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__INTERCEPT_TO_ENDPOINT:
				getInterceptToEndpoint().clear();
				getInterceptToEndpoint().addAll((Collection<? extends InterceptSendToEndpointDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__LOAD_BALANCE:
				getLoadBalance().clear();
				getLoadBalance().addAll((Collection<? extends LoadBalanceDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__LOG:
				getLog().clear();
				getLog().addAll((Collection<? extends LogDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__LOOP:
				getLoop().clear();
				getLoop().addAll((Collection<? extends LoopDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__MARSHAL:
				getMarshal().clear();
				getMarshal().addAll((Collection<? extends MarshalDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__MULTICAST:
				getMulticast().clear();
				getMulticast().addAll((Collection<? extends MulticastDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				getOnCompletion().addAll((Collection<? extends OnCompletionDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				getOnException().addAll((Collection<? extends OnExceptionDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__PIPELINE:
				getPipeline().clear();
				getPipeline().addAll((Collection<? extends PipelineDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__POLICY:
				getPolicy().clear();
				getPolicy().addAll((Collection<? extends PolicyDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__POLL_ENRICH:
				getPollEnrich().clear();
				getPollEnrich().addAll((Collection<? extends PollEnrichDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends ProcessDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__RECIPIENT_LIST:
				getRecipientList().clear();
				getRecipientList().addAll((Collection<? extends RecipientListDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__REMOVE_HEADER:
				getRemoveHeader().clear();
				getRemoveHeader().addAll((Collection<? extends RemoveHeaderDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__REMOVE_HEADERS:
				getRemoveHeaders().clear();
				getRemoveHeaders().addAll((Collection<? extends RemoveHeadersDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__REMOVE_PROPERTY:
				getRemoveProperty().clear();
				getRemoveProperty().addAll((Collection<? extends RemovePropertyDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__RESEQUENCE:
				getResequence().clear();
				getResequence().addAll((Collection<? extends ResequenceDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__ROLLBACK:
				getRollback().clear();
				getRollback().addAll((Collection<? extends RollbackDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__ROUTE:
				getRoute().clear();
				getRoute().addAll((Collection<? extends RouteDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__ROUTING_SLIP:
				getRoutingSlip().clear();
				getRoutingSlip().addAll((Collection<? extends RoutingSlipDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__SAMPLE:
				getSample().clear();
				getSample().addAll((Collection<? extends SamplingDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_BODY:
				getSetBody().clear();
				getSetBody().addAll((Collection<? extends SetBodyDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_EXCHANGE_PATTERN:
				getSetExchangePattern().clear();
				getSetExchangePattern().addAll((Collection<? extends SetExchangePatternDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_FAULT_BODY:
				getSetFaultBody().clear();
				getSetFaultBody().addAll((Collection<? extends SetFaultBodyDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				getSetHeader().addAll((Collection<? extends SetHeaderDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_OUT_HEADER:
				getSetOutHeader().clear();
				getSetOutHeader().addAll((Collection<? extends SetOutHeaderDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_PROPERTY:
				getSetProperty().clear();
				getSetProperty().addAll((Collection<? extends SetPropertyDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__SORT:
				getSort().clear();
				getSort().addAll((Collection<? extends SortDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__SPLIT:
				getSplit().clear();
				getSplit().addAll((Collection<? extends SplitDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__STOP:
				getStop().clear();
				getStop().addAll((Collection<? extends StopDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__THREADS:
				getThreads().clear();
				getThreads().addAll((Collection<? extends ThreadsDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__THROTTLE:
				getThrottle().clear();
				getThrottle().addAll((Collection<? extends ThrottleDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__THROW_EXCEPTION:
				getThrowException().clear();
				getThrowException().addAll((Collection<? extends ThrowExceptionDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__TO:
				getTo().clear();
				getTo().addAll((Collection<? extends ToDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__TRANSACTED:
				getTransacted().clear();
				getTransacted().addAll((Collection<? extends TransactedDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__TRANSFORM:
				getTransform().clear();
				getTransform().addAll((Collection<? extends TransformDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__DO_TRY:
				getDoTry().clear();
				getDoTry().addAll((Collection<? extends TryDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__UNMARSHAL:
				getUnmarshal().clear();
				getUnmarshal().addAll((Collection<? extends UnmarshalDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__VALIDATE:
				getValidate().clear();
				getValidate().addAll((Collection<? extends ValidateDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__WIRE_TAP:
				getWireTap().clear();
				getWireTap().addAll((Collection<? extends WireTapDefinition>)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__REF:
				setRef((String)newValue);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__ANY_ATTRIBUTE1:
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
			case SpringPackage.LOAD_BALANCE_DEFINITION__FAILOVER:
				setFailover((FailoverLoadBalancerDefinition)null);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__RANDOM:
				setRandom((RandomLoadBalancerDefinition)null);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__CUSTOM:
				setCustom((CustomLoadBalancerDefinition)null);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__ROUND_ROBIN:
				setRoundRobin((RoundRobinLoadBalancerDefinition)null);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__STICKY:
				setSticky((StickyLoadBalancerDefinition)null);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__TOPIC:
				setTopic((TopicLoadBalancerDefinition)null);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__WEIGHTED:
				setWeighted((WeightedLoadBalancerDefinition)null);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__GROUP:
				getGroup().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__AOP:
				getAop().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__AGGREGATE:
				getAggregate().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__BEAN:
				getBean().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__DO_CATCH:
				getDoCatch().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__WHEN:
				getWhen().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__CHOICE:
				getChoice().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__OTHERWISE:
				getOtherwise().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__CONVERT_BODY_TO:
				getConvertBodyTo().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__DELAY:
				getDelay().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__DYNAMIC_ROUTER:
				getDynamicRouter().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__ENRICH:
				getEnrich().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__FILTER:
				getFilter().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__DO_FINALLY:
				getDoFinally().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__IDEMPOTENT_CONSUMER:
				getIdempotentConsumer().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__IN_ONLY:
				getInOnly().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__IN_OUT:
				getInOut().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__INTERCEPT:
				getIntercept().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__INTERCEPT_TO_ENDPOINT:
				getInterceptToEndpoint().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__LOAD_BALANCE:
				getLoadBalance().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__LOG:
				getLog().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__LOOP:
				getLoop().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__MARSHAL:
				getMarshal().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__MULTICAST:
				getMulticast().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__PIPELINE:
				getPipeline().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__POLICY:
				getPolicy().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__POLL_ENRICH:
				getPollEnrich().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__PROCESS:
				getProcess().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__RECIPIENT_LIST:
				getRecipientList().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__REMOVE_HEADER:
				getRemoveHeader().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__REMOVE_HEADERS:
				getRemoveHeaders().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__REMOVE_PROPERTY:
				getRemoveProperty().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__RESEQUENCE:
				getResequence().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__ROLLBACK:
				getRollback().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__ROUTE:
				getRoute().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__ROUTING_SLIP:
				getRoutingSlip().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__SAMPLE:
				getSample().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_BODY:
				getSetBody().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_EXCHANGE_PATTERN:
				getSetExchangePattern().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_FAULT_BODY:
				getSetFaultBody().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_OUT_HEADER:
				getSetOutHeader().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_PROPERTY:
				getSetProperty().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__SORT:
				getSort().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__SPLIT:
				getSplit().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__STOP:
				getStop().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__THREADS:
				getThreads().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__THROTTLE:
				getThrottle().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__THROW_EXCEPTION:
				getThrowException().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__TO:
				getTo().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__TRANSACTED:
				getTransacted().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__TRANSFORM:
				getTransform().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__DO_TRY:
				getDoTry().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__UNMARSHAL:
				getUnmarshal().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__VALIDATE:
				getValidate().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__WIRE_TAP:
				getWireTap().clear();
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__REF:
				setRef(REF_EDEFAULT);
				return;
			case SpringPackage.LOAD_BALANCE_DEFINITION__ANY_ATTRIBUTE1:
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
			case SpringPackage.LOAD_BALANCE_DEFINITION__FAILOVER:
				return failover != null;
			case SpringPackage.LOAD_BALANCE_DEFINITION__RANDOM:
				return random != null;
			case SpringPackage.LOAD_BALANCE_DEFINITION__CUSTOM:
				return custom != null;
			case SpringPackage.LOAD_BALANCE_DEFINITION__ROUND_ROBIN:
				return roundRobin != null;
			case SpringPackage.LOAD_BALANCE_DEFINITION__STICKY:
				return sticky != null;
			case SpringPackage.LOAD_BALANCE_DEFINITION__TOPIC:
				return topic != null;
			case SpringPackage.LOAD_BALANCE_DEFINITION__WEIGHTED:
				return weighted != null;
			case SpringPackage.LOAD_BALANCE_DEFINITION__GROUP:
				return group != null && !group.isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__AOP:
				return !getAop().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__AGGREGATE:
				return !getAggregate().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__BEAN:
				return !getBean().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__DO_CATCH:
				return !getDoCatch().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__WHEN:
				return !getWhen().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__CHOICE:
				return !getChoice().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__OTHERWISE:
				return !getOtherwise().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__CONVERT_BODY_TO:
				return !getConvertBodyTo().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__DELAY:
				return !getDelay().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__DYNAMIC_ROUTER:
				return !getDynamicRouter().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__ENRICH:
				return !getEnrich().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__FILTER:
				return !getFilter().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__DO_FINALLY:
				return !getDoFinally().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__IDEMPOTENT_CONSUMER:
				return !getIdempotentConsumer().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__IN_ONLY:
				return !getInOnly().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__IN_OUT:
				return !getInOut().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__INTERCEPT:
				return !getIntercept().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__INTERCEPT_FROM:
				return !getInterceptFrom().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__INTERCEPT_TO_ENDPOINT:
				return !getInterceptToEndpoint().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__LOAD_BALANCE:
				return !getLoadBalance().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__LOG:
				return !getLog().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__LOOP:
				return !getLoop().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__MARSHAL:
				return !getMarshal().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__MULTICAST:
				return !getMulticast().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__ON_COMPLETION:
				return !getOnCompletion().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__ON_EXCEPTION:
				return !getOnException().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__PIPELINE:
				return !getPipeline().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__POLICY:
				return !getPolicy().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__POLL_ENRICH:
				return !getPollEnrich().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__PROCESS:
				return !getProcess().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__RECIPIENT_LIST:
				return !getRecipientList().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__REMOVE_HEADER:
				return !getRemoveHeader().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__REMOVE_HEADERS:
				return !getRemoveHeaders().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__REMOVE_PROPERTY:
				return !getRemoveProperty().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__RESEQUENCE:
				return !getResequence().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__ROLLBACK:
				return !getRollback().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__ROUTE:
				return !getRoute().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__ROUTING_SLIP:
				return !getRoutingSlip().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__SAMPLE:
				return !getSample().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_BODY:
				return !getSetBody().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_EXCHANGE_PATTERN:
				return !getSetExchangePattern().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_FAULT_BODY:
				return !getSetFaultBody().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_HEADER:
				return !getSetHeader().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_OUT_HEADER:
				return !getSetOutHeader().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__SET_PROPERTY:
				return !getSetProperty().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__SORT:
				return !getSort().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__SPLIT:
				return !getSplit().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__STOP:
				return !getStop().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__THREADS:
				return !getThreads().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__THROTTLE:
				return !getThrottle().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__THROW_EXCEPTION:
				return !getThrowException().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__TO:
				return !getTo().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__TRANSACTED:
				return !getTransacted().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__TRANSFORM:
				return !getTransform().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__DO_TRY:
				return !getDoTry().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__UNMARSHAL:
				return !getUnmarshal().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__VALIDATE:
				return !getValidate().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__WIRE_TAP:
				return !getWireTap().isEmpty();
			case SpringPackage.LOAD_BALANCE_DEFINITION__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case SpringPackage.LOAD_BALANCE_DEFINITION__ANY_ATTRIBUTE1:
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
		result.append(", ref: ");
		result.append(ref);
		result.append(", anyAttribute1: ");
		result.append(anyAttribute1);
		result.append(')');
		return result.toString();
	}

} //LoadBalanceDefinitionImpl
