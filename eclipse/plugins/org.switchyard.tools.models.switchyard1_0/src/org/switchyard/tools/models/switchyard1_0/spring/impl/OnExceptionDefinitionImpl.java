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
import org.switchyard.tools.models.switchyard1_0.spring.RedeliveryPolicyDefinition;
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
 * An implementation of the model object '<em><b>On Exception Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getException <em>Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getOnWhen <em>On When</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getRetryWhile <em>Retry While</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getRedeliveryPolicy <em>Redelivery Policy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getHandled <em>Handled</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getContinued <em>Continued</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getAop <em>Aop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getInOnly <em>In Only</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getInOut <em>In Out</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getInterceptToEndpoint <em>Intercept To Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getLog <em>Log</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getSample <em>Sample</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getSetFaultBody <em>Set Fault Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getSetOutHeader <em>Set Out Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getOnRedeliveryRef <em>On Redelivery Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getRedeliveryPolicyRef <em>Redelivery Policy Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#isUseOriginalMessage <em>Use Original Message</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnExceptionDefinitionImpl#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OnExceptionDefinitionImpl extends ProcessorDefinitionImpl implements OnExceptionDefinition {
	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected EList<String> exception;

	/**
	 * The cached value of the '{@link #getOnWhen() <em>On When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnWhen()
	 * @generated
	 * @ordered
	 */
	protected WhenDefinition onWhen;

	/**
	 * The cached value of the '{@link #getRetryWhile() <em>Retry While</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryWhile()
	 * @generated
	 * @ordered
	 */
	protected ExpressionSubElementDefinition retryWhile;

	/**
	 * The cached value of the '{@link #getRedeliveryPolicy() <em>Redelivery Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedeliveryPolicy()
	 * @generated
	 * @ordered
	 */
	protected RedeliveryPolicyDefinition redeliveryPolicy;

	/**
	 * The cached value of the '{@link #getHandled() <em>Handled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandled()
	 * @generated
	 * @ordered
	 */
	protected ExpressionSubElementDefinition handled;

	/**
	 * The cached value of the '{@link #getContinued() <em>Continued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinued()
	 * @generated
	 * @ordered
	 */
	protected ExpressionSubElementDefinition continued;

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
	 * The default value of the '{@link #getOnRedeliveryRef() <em>On Redelivery Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnRedeliveryRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_REDELIVERY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnRedeliveryRef() <em>On Redelivery Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnRedeliveryRef()
	 * @generated
	 * @ordered
	 */
	protected String onRedeliveryRef = ON_REDELIVERY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedeliveryPolicyRef() <em>Redelivery Policy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedeliveryPolicyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REDELIVERY_POLICY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedeliveryPolicyRef() <em>Redelivery Policy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedeliveryPolicyRef()
	 * @generated
	 * @ordered
	 */
	protected String redeliveryPolicyRef = REDELIVERY_POLICY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseOriginalMessage() <em>Use Original Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseOriginalMessage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_ORIGINAL_MESSAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseOriginalMessage() <em>Use Original Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseOriginalMessage()
	 * @generated
	 * @ordered
	 */
	protected boolean useOriginalMessage = USE_ORIGINAL_MESSAGE_EDEFAULT;

	/**
	 * This is true if the Use Original Message attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useOriginalMessageESet;

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
	protected OnExceptionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getOnExceptionDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getException() {
		if (exception == null) {
			exception = new EDataTypeEList<String>(String.class, this, SpringPackage.ON_EXCEPTION_DEFINITION__EXCEPTION);
		}
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhenDefinition getOnWhen() {
		return onWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnWhen(WhenDefinition newOnWhen, NotificationChain msgs) {
		WhenDefinition oldOnWhen = onWhen;
		onWhen = newOnWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.ON_EXCEPTION_DEFINITION__ON_WHEN, oldOnWhen, newOnWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnWhen(WhenDefinition newOnWhen) {
		if (newOnWhen != onWhen) {
			NotificationChain msgs = null;
			if (onWhen != null)
				msgs = ((InternalEObject)onWhen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.ON_EXCEPTION_DEFINITION__ON_WHEN, null, msgs);
			if (newOnWhen != null)
				msgs = ((InternalEObject)newOnWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.ON_EXCEPTION_DEFINITION__ON_WHEN, null, msgs);
			msgs = basicSetOnWhen(newOnWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ON_EXCEPTION_DEFINITION__ON_WHEN, newOnWhen, newOnWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionSubElementDefinition getRetryWhile() {
		return retryWhile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetryWhile(ExpressionSubElementDefinition newRetryWhile, NotificationChain msgs) {
		ExpressionSubElementDefinition oldRetryWhile = retryWhile;
		retryWhile = newRetryWhile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.ON_EXCEPTION_DEFINITION__RETRY_WHILE, oldRetryWhile, newRetryWhile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryWhile(ExpressionSubElementDefinition newRetryWhile) {
		if (newRetryWhile != retryWhile) {
			NotificationChain msgs = null;
			if (retryWhile != null)
				msgs = ((InternalEObject)retryWhile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.ON_EXCEPTION_DEFINITION__RETRY_WHILE, null, msgs);
			if (newRetryWhile != null)
				msgs = ((InternalEObject)newRetryWhile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.ON_EXCEPTION_DEFINITION__RETRY_WHILE, null, msgs);
			msgs = basicSetRetryWhile(newRetryWhile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ON_EXCEPTION_DEFINITION__RETRY_WHILE, newRetryWhile, newRetryWhile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedeliveryPolicyDefinition getRedeliveryPolicy() {
		return redeliveryPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedeliveryPolicy(RedeliveryPolicyDefinition newRedeliveryPolicy, NotificationChain msgs) {
		RedeliveryPolicyDefinition oldRedeliveryPolicy = redeliveryPolicy;
		redeliveryPolicy = newRedeliveryPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.ON_EXCEPTION_DEFINITION__REDELIVERY_POLICY, oldRedeliveryPolicy, newRedeliveryPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedeliveryPolicy(RedeliveryPolicyDefinition newRedeliveryPolicy) {
		if (newRedeliveryPolicy != redeliveryPolicy) {
			NotificationChain msgs = null;
			if (redeliveryPolicy != null)
				msgs = ((InternalEObject)redeliveryPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.ON_EXCEPTION_DEFINITION__REDELIVERY_POLICY, null, msgs);
			if (newRedeliveryPolicy != null)
				msgs = ((InternalEObject)newRedeliveryPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.ON_EXCEPTION_DEFINITION__REDELIVERY_POLICY, null, msgs);
			msgs = basicSetRedeliveryPolicy(newRedeliveryPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ON_EXCEPTION_DEFINITION__REDELIVERY_POLICY, newRedeliveryPolicy, newRedeliveryPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionSubElementDefinition getHandled() {
		return handled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHandled(ExpressionSubElementDefinition newHandled, NotificationChain msgs) {
		ExpressionSubElementDefinition oldHandled = handled;
		handled = newHandled;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.ON_EXCEPTION_DEFINITION__HANDLED, oldHandled, newHandled);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandled(ExpressionSubElementDefinition newHandled) {
		if (newHandled != handled) {
			NotificationChain msgs = null;
			if (handled != null)
				msgs = ((InternalEObject)handled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.ON_EXCEPTION_DEFINITION__HANDLED, null, msgs);
			if (newHandled != null)
				msgs = ((InternalEObject)newHandled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.ON_EXCEPTION_DEFINITION__HANDLED, null, msgs);
			msgs = basicSetHandled(newHandled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ON_EXCEPTION_DEFINITION__HANDLED, newHandled, newHandled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionSubElementDefinition getContinued() {
		return continued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContinued(ExpressionSubElementDefinition newContinued, NotificationChain msgs) {
		ExpressionSubElementDefinition oldContinued = continued;
		continued = newContinued;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.ON_EXCEPTION_DEFINITION__CONTINUED, oldContinued, newContinued);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinued(ExpressionSubElementDefinition newContinued) {
		if (newContinued != continued) {
			NotificationChain msgs = null;
			if (continued != null)
				msgs = ((InternalEObject)continued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.ON_EXCEPTION_DEFINITION__CONTINUED, null, msgs);
			if (newContinued != null)
				msgs = ((InternalEObject)newContinued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.ON_EXCEPTION_DEFINITION__CONTINUED, null, msgs);
			msgs = basicSetContinued(newContinued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ON_EXCEPTION_DEFINITION__CONTINUED, newContinued, newContinued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, SpringPackage.ON_EXCEPTION_DEFINITION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AopDefinition> getAop() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Aop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregateDefinition> getAggregate() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Aggregate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BeanDefinition> getBean() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Bean());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CatchDefinition> getDoCatch() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_DoCatch());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WhenDefinition> getWhen() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_When());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChoiceDefinition> getChoice() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Choice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherwiseDefinition> getOtherwise() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Otherwise());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConvertBodyDefinition> getConvertBodyTo() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_ConvertBodyTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelayDefinition> getDelay() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Delay());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicRouterDefinition> getDynamicRouter() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_DynamicRouter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnrichDefinition> getEnrich() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Enrich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterDefinition> getFilter() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Filter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FinallyDefinition> getDoFinally() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_DoFinally());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdempotentConsumerDefinition> getIdempotentConsumer() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_IdempotentConsumer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InOnlyDefinition> getInOnly() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_InOnly());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InOutDefinition> getInOut() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_InOut());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterceptDefinition> getIntercept() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Intercept());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterceptFromDefinition> getInterceptFrom() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_InterceptFrom());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterceptSendToEndpointDefinition> getInterceptToEndpoint() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_InterceptToEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadBalanceDefinition> getLoadBalance() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_LoadBalance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogDefinition> getLog() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Log());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoopDefinition> getLoop() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Loop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarshalDefinition> getMarshal() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Marshal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MulticastDefinition> getMulticast() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Multicast());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnCompletionDefinition> getOnCompletion() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_OnCompletion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnExceptionDefinition> getOnException() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_OnException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PipelineDefinition> getPipeline() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Pipeline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolicyDefinition> getPolicy() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Policy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PollEnrichDefinition> getPollEnrich() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_PollEnrich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessDefinition> getProcess() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Process());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecipientListDefinition> getRecipientList() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_RecipientList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemoveHeaderDefinition> getRemoveHeader() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_RemoveHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemoveHeadersDefinition> getRemoveHeaders() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_RemoveHeaders());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemovePropertyDefinition> getRemoveProperty() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_RemoveProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResequenceDefinition> getResequence() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Resequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RollbackDefinition> getRollback() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Rollback());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RouteDefinition> getRoute() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Route());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoutingSlipDefinition> getRoutingSlip() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_RoutingSlip());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SamplingDefinition> getSample() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Sample());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetBodyDefinition> getSetBody() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_SetBody());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetExchangePatternDefinition> getSetExchangePattern() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_SetExchangePattern());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetFaultBodyDefinition> getSetFaultBody() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_SetFaultBody());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetHeaderDefinition> getSetHeader() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_SetHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetOutHeaderDefinition> getSetOutHeader() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_SetOutHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetPropertyDefinition> getSetProperty() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_SetProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortDefinition> getSort() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Sort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SplitDefinition> getSplit() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Split());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StopDefinition> getStop() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Stop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThreadsDefinition> getThreads() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Threads());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThrottleDefinition> getThrottle() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Throttle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThrowExceptionDefinition> getThrowException() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_ThrowException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToDefinition> getTo() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_To());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransactedDefinition> getTransacted() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Transacted());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformDefinition> getTransform() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Transform());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TryDefinition> getDoTry() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_DoTry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnmarshalDefinition> getUnmarshal() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Unmarshal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValidateDefinition> getValidate() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_Validate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WireTapDefinition> getWireTap() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnExceptionDefinition_WireTap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnRedeliveryRef() {
		return onRedeliveryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnRedeliveryRef(String newOnRedeliveryRef) {
		String oldOnRedeliveryRef = onRedeliveryRef;
		onRedeliveryRef = newOnRedeliveryRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ON_EXCEPTION_DEFINITION__ON_REDELIVERY_REF, oldOnRedeliveryRef, onRedeliveryRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedeliveryPolicyRef() {
		return redeliveryPolicyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedeliveryPolicyRef(String newRedeliveryPolicyRef) {
		String oldRedeliveryPolicyRef = redeliveryPolicyRef;
		redeliveryPolicyRef = newRedeliveryPolicyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ON_EXCEPTION_DEFINITION__REDELIVERY_POLICY_REF, oldRedeliveryPolicyRef, redeliveryPolicyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseOriginalMessage() {
		return useOriginalMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseOriginalMessage(boolean newUseOriginalMessage) {
		boolean oldUseOriginalMessage = useOriginalMessage;
		useOriginalMessage = newUseOriginalMessage;
		boolean oldUseOriginalMessageESet = useOriginalMessageESet;
		useOriginalMessageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ON_EXCEPTION_DEFINITION__USE_ORIGINAL_MESSAGE, oldUseOriginalMessage, useOriginalMessage, !oldUseOriginalMessageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseOriginalMessage() {
		boolean oldUseOriginalMessage = useOriginalMessage;
		boolean oldUseOriginalMessageESet = useOriginalMessageESet;
		useOriginalMessage = USE_ORIGINAL_MESSAGE_EDEFAULT;
		useOriginalMessageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.ON_EXCEPTION_DEFINITION__USE_ORIGINAL_MESSAGE, oldUseOriginalMessage, USE_ORIGINAL_MESSAGE_EDEFAULT, oldUseOriginalMessageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseOriginalMessage() {
		return useOriginalMessageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute1() {
		if (anyAttribute1 == null) {
			anyAttribute1 = new BasicFeatureMap(this, SpringPackage.ON_EXCEPTION_DEFINITION__ANY_ATTRIBUTE1);
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
			case SpringPackage.ON_EXCEPTION_DEFINITION__ON_WHEN:
				return basicSetOnWhen(null, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__RETRY_WHILE:
				return basicSetRetryWhile(null, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__REDELIVERY_POLICY:
				return basicSetRedeliveryPolicy(null, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__HANDLED:
				return basicSetHandled(null, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__CONTINUED:
				return basicSetContinued(null, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__AOP:
				return ((InternalEList<?>)getAop()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__AGGREGATE:
				return ((InternalEList<?>)getAggregate()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__BEAN:
				return ((InternalEList<?>)getBean()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__DO_CATCH:
				return ((InternalEList<?>)getDoCatch()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__WHEN:
				return ((InternalEList<?>)getWhen()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__CHOICE:
				return ((InternalEList<?>)getChoice()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__OTHERWISE:
				return ((InternalEList<?>)getOtherwise()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__CONVERT_BODY_TO:
				return ((InternalEList<?>)getConvertBodyTo()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__DELAY:
				return ((InternalEList<?>)getDelay()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__DYNAMIC_ROUTER:
				return ((InternalEList<?>)getDynamicRouter()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__ENRICH:
				return ((InternalEList<?>)getEnrich()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__DO_FINALLY:
				return ((InternalEList<?>)getDoFinally()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__IDEMPOTENT_CONSUMER:
				return ((InternalEList<?>)getIdempotentConsumer()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__IN_ONLY:
				return ((InternalEList<?>)getInOnly()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__IN_OUT:
				return ((InternalEList<?>)getInOut()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__INTERCEPT:
				return ((InternalEList<?>)getIntercept()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__INTERCEPT_FROM:
				return ((InternalEList<?>)getInterceptFrom()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__INTERCEPT_TO_ENDPOINT:
				return ((InternalEList<?>)getInterceptToEndpoint()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__LOAD_BALANCE:
				return ((InternalEList<?>)getLoadBalance()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__LOG:
				return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__LOOP:
				return ((InternalEList<?>)getLoop()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__MARSHAL:
				return ((InternalEList<?>)getMarshal()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__MULTICAST:
				return ((InternalEList<?>)getMulticast()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__ON_COMPLETION:
				return ((InternalEList<?>)getOnCompletion()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__ON_EXCEPTION:
				return ((InternalEList<?>)getOnException()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__PIPELINE:
				return ((InternalEList<?>)getPipeline()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__POLICY:
				return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__POLL_ENRICH:
				return ((InternalEList<?>)getPollEnrich()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__RECIPIENT_LIST:
				return ((InternalEList<?>)getRecipientList()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__REMOVE_HEADER:
				return ((InternalEList<?>)getRemoveHeader()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__REMOVE_HEADERS:
				return ((InternalEList<?>)getRemoveHeaders()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__REMOVE_PROPERTY:
				return ((InternalEList<?>)getRemoveProperty()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__RESEQUENCE:
				return ((InternalEList<?>)getResequence()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__ROLLBACK:
				return ((InternalEList<?>)getRollback()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__ROUTE:
				return ((InternalEList<?>)getRoute()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__ROUTING_SLIP:
				return ((InternalEList<?>)getRoutingSlip()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__SAMPLE:
				return ((InternalEList<?>)getSample()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_BODY:
				return ((InternalEList<?>)getSetBody()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_EXCHANGE_PATTERN:
				return ((InternalEList<?>)getSetExchangePattern()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_FAULT_BODY:
				return ((InternalEList<?>)getSetFaultBody()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_HEADER:
				return ((InternalEList<?>)getSetHeader()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_OUT_HEADER:
				return ((InternalEList<?>)getSetOutHeader()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_PROPERTY:
				return ((InternalEList<?>)getSetProperty()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__SORT:
				return ((InternalEList<?>)getSort()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__SPLIT:
				return ((InternalEList<?>)getSplit()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__STOP:
				return ((InternalEList<?>)getStop()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__THREADS:
				return ((InternalEList<?>)getThreads()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__THROTTLE:
				return ((InternalEList<?>)getThrottle()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__THROW_EXCEPTION:
				return ((InternalEList<?>)getThrowException()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__TO:
				return ((InternalEList<?>)getTo()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__TRANSACTED:
				return ((InternalEList<?>)getTransacted()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__TRANSFORM:
				return ((InternalEList<?>)getTransform()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__DO_TRY:
				return ((InternalEList<?>)getDoTry()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__UNMARSHAL:
				return ((InternalEList<?>)getUnmarshal()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__VALIDATE:
				return ((InternalEList<?>)getValidate()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__WIRE_TAP:
				return ((InternalEList<?>)getWireTap()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_EXCEPTION_DEFINITION__ANY_ATTRIBUTE1:
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
			case SpringPackage.ON_EXCEPTION_DEFINITION__EXCEPTION:
				return getException();
			case SpringPackage.ON_EXCEPTION_DEFINITION__ON_WHEN:
				return getOnWhen();
			case SpringPackage.ON_EXCEPTION_DEFINITION__RETRY_WHILE:
				return getRetryWhile();
			case SpringPackage.ON_EXCEPTION_DEFINITION__REDELIVERY_POLICY:
				return getRedeliveryPolicy();
			case SpringPackage.ON_EXCEPTION_DEFINITION__HANDLED:
				return getHandled();
			case SpringPackage.ON_EXCEPTION_DEFINITION__CONTINUED:
				return getContinued();
			case SpringPackage.ON_EXCEPTION_DEFINITION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SpringPackage.ON_EXCEPTION_DEFINITION__AOP:
				return getAop();
			case SpringPackage.ON_EXCEPTION_DEFINITION__AGGREGATE:
				return getAggregate();
			case SpringPackage.ON_EXCEPTION_DEFINITION__BEAN:
				return getBean();
			case SpringPackage.ON_EXCEPTION_DEFINITION__DO_CATCH:
				return getDoCatch();
			case SpringPackage.ON_EXCEPTION_DEFINITION__WHEN:
				return getWhen();
			case SpringPackage.ON_EXCEPTION_DEFINITION__CHOICE:
				return getChoice();
			case SpringPackage.ON_EXCEPTION_DEFINITION__OTHERWISE:
				return getOtherwise();
			case SpringPackage.ON_EXCEPTION_DEFINITION__CONVERT_BODY_TO:
				return getConvertBodyTo();
			case SpringPackage.ON_EXCEPTION_DEFINITION__DELAY:
				return getDelay();
			case SpringPackage.ON_EXCEPTION_DEFINITION__DYNAMIC_ROUTER:
				return getDynamicRouter();
			case SpringPackage.ON_EXCEPTION_DEFINITION__ENRICH:
				return getEnrich();
			case SpringPackage.ON_EXCEPTION_DEFINITION__FILTER:
				return getFilter();
			case SpringPackage.ON_EXCEPTION_DEFINITION__DO_FINALLY:
				return getDoFinally();
			case SpringPackage.ON_EXCEPTION_DEFINITION__IDEMPOTENT_CONSUMER:
				return getIdempotentConsumer();
			case SpringPackage.ON_EXCEPTION_DEFINITION__IN_ONLY:
				return getInOnly();
			case SpringPackage.ON_EXCEPTION_DEFINITION__IN_OUT:
				return getInOut();
			case SpringPackage.ON_EXCEPTION_DEFINITION__INTERCEPT:
				return getIntercept();
			case SpringPackage.ON_EXCEPTION_DEFINITION__INTERCEPT_FROM:
				return getInterceptFrom();
			case SpringPackage.ON_EXCEPTION_DEFINITION__INTERCEPT_TO_ENDPOINT:
				return getInterceptToEndpoint();
			case SpringPackage.ON_EXCEPTION_DEFINITION__LOAD_BALANCE:
				return getLoadBalance();
			case SpringPackage.ON_EXCEPTION_DEFINITION__LOG:
				return getLog();
			case SpringPackage.ON_EXCEPTION_DEFINITION__LOOP:
				return getLoop();
			case SpringPackage.ON_EXCEPTION_DEFINITION__MARSHAL:
				return getMarshal();
			case SpringPackage.ON_EXCEPTION_DEFINITION__MULTICAST:
				return getMulticast();
			case SpringPackage.ON_EXCEPTION_DEFINITION__ON_COMPLETION:
				return getOnCompletion();
			case SpringPackage.ON_EXCEPTION_DEFINITION__ON_EXCEPTION:
				return getOnException();
			case SpringPackage.ON_EXCEPTION_DEFINITION__PIPELINE:
				return getPipeline();
			case SpringPackage.ON_EXCEPTION_DEFINITION__POLICY:
				return getPolicy();
			case SpringPackage.ON_EXCEPTION_DEFINITION__POLL_ENRICH:
				return getPollEnrich();
			case SpringPackage.ON_EXCEPTION_DEFINITION__PROCESS:
				return getProcess();
			case SpringPackage.ON_EXCEPTION_DEFINITION__RECIPIENT_LIST:
				return getRecipientList();
			case SpringPackage.ON_EXCEPTION_DEFINITION__REMOVE_HEADER:
				return getRemoveHeader();
			case SpringPackage.ON_EXCEPTION_DEFINITION__REMOVE_HEADERS:
				return getRemoveHeaders();
			case SpringPackage.ON_EXCEPTION_DEFINITION__REMOVE_PROPERTY:
				return getRemoveProperty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__RESEQUENCE:
				return getResequence();
			case SpringPackage.ON_EXCEPTION_DEFINITION__ROLLBACK:
				return getRollback();
			case SpringPackage.ON_EXCEPTION_DEFINITION__ROUTE:
				return getRoute();
			case SpringPackage.ON_EXCEPTION_DEFINITION__ROUTING_SLIP:
				return getRoutingSlip();
			case SpringPackage.ON_EXCEPTION_DEFINITION__SAMPLE:
				return getSample();
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_BODY:
				return getSetBody();
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_EXCHANGE_PATTERN:
				return getSetExchangePattern();
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_FAULT_BODY:
				return getSetFaultBody();
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_HEADER:
				return getSetHeader();
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_OUT_HEADER:
				return getSetOutHeader();
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_PROPERTY:
				return getSetProperty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__SORT:
				return getSort();
			case SpringPackage.ON_EXCEPTION_DEFINITION__SPLIT:
				return getSplit();
			case SpringPackage.ON_EXCEPTION_DEFINITION__STOP:
				return getStop();
			case SpringPackage.ON_EXCEPTION_DEFINITION__THREADS:
				return getThreads();
			case SpringPackage.ON_EXCEPTION_DEFINITION__THROTTLE:
				return getThrottle();
			case SpringPackage.ON_EXCEPTION_DEFINITION__THROW_EXCEPTION:
				return getThrowException();
			case SpringPackage.ON_EXCEPTION_DEFINITION__TO:
				return getTo();
			case SpringPackage.ON_EXCEPTION_DEFINITION__TRANSACTED:
				return getTransacted();
			case SpringPackage.ON_EXCEPTION_DEFINITION__TRANSFORM:
				return getTransform();
			case SpringPackage.ON_EXCEPTION_DEFINITION__DO_TRY:
				return getDoTry();
			case SpringPackage.ON_EXCEPTION_DEFINITION__UNMARSHAL:
				return getUnmarshal();
			case SpringPackage.ON_EXCEPTION_DEFINITION__VALIDATE:
				return getValidate();
			case SpringPackage.ON_EXCEPTION_DEFINITION__WIRE_TAP:
				return getWireTap();
			case SpringPackage.ON_EXCEPTION_DEFINITION__ON_REDELIVERY_REF:
				return getOnRedeliveryRef();
			case SpringPackage.ON_EXCEPTION_DEFINITION__REDELIVERY_POLICY_REF:
				return getRedeliveryPolicyRef();
			case SpringPackage.ON_EXCEPTION_DEFINITION__USE_ORIGINAL_MESSAGE:
				return isUseOriginalMessage();
			case SpringPackage.ON_EXCEPTION_DEFINITION__ANY_ATTRIBUTE1:
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
			case SpringPackage.ON_EXCEPTION_DEFINITION__EXCEPTION:
				getException().clear();
				getException().addAll((Collection<? extends String>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__ON_WHEN:
				setOnWhen((WhenDefinition)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__RETRY_WHILE:
				setRetryWhile((ExpressionSubElementDefinition)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__REDELIVERY_POLICY:
				setRedeliveryPolicy((RedeliveryPolicyDefinition)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__HANDLED:
				setHandled((ExpressionSubElementDefinition)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__CONTINUED:
				setContinued((ExpressionSubElementDefinition)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__AOP:
				getAop().clear();
				getAop().addAll((Collection<? extends AopDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__AGGREGATE:
				getAggregate().clear();
				getAggregate().addAll((Collection<? extends AggregateDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__BEAN:
				getBean().clear();
				getBean().addAll((Collection<? extends BeanDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__DO_CATCH:
				getDoCatch().clear();
				getDoCatch().addAll((Collection<? extends CatchDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__WHEN:
				getWhen().clear();
				getWhen().addAll((Collection<? extends WhenDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__CHOICE:
				getChoice().clear();
				getChoice().addAll((Collection<? extends ChoiceDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__OTHERWISE:
				getOtherwise().clear();
				getOtherwise().addAll((Collection<? extends OtherwiseDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__CONVERT_BODY_TO:
				getConvertBodyTo().clear();
				getConvertBodyTo().addAll((Collection<? extends ConvertBodyDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__DELAY:
				getDelay().clear();
				getDelay().addAll((Collection<? extends DelayDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__DYNAMIC_ROUTER:
				getDynamicRouter().clear();
				getDynamicRouter().addAll((Collection<? extends DynamicRouterDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__ENRICH:
				getEnrich().clear();
				getEnrich().addAll((Collection<? extends EnrichDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends FilterDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__DO_FINALLY:
				getDoFinally().clear();
				getDoFinally().addAll((Collection<? extends FinallyDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__IDEMPOTENT_CONSUMER:
				getIdempotentConsumer().clear();
				getIdempotentConsumer().addAll((Collection<? extends IdempotentConsumerDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__IN_ONLY:
				getInOnly().clear();
				getInOnly().addAll((Collection<? extends InOnlyDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__IN_OUT:
				getInOut().clear();
				getInOut().addAll((Collection<? extends InOutDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__INTERCEPT:
				getIntercept().clear();
				getIntercept().addAll((Collection<? extends InterceptDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				getInterceptFrom().addAll((Collection<? extends InterceptFromDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__INTERCEPT_TO_ENDPOINT:
				getInterceptToEndpoint().clear();
				getInterceptToEndpoint().addAll((Collection<? extends InterceptSendToEndpointDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__LOAD_BALANCE:
				getLoadBalance().clear();
				getLoadBalance().addAll((Collection<? extends LoadBalanceDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__LOG:
				getLog().clear();
				getLog().addAll((Collection<? extends LogDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__LOOP:
				getLoop().clear();
				getLoop().addAll((Collection<? extends LoopDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__MARSHAL:
				getMarshal().clear();
				getMarshal().addAll((Collection<? extends MarshalDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__MULTICAST:
				getMulticast().clear();
				getMulticast().addAll((Collection<? extends MulticastDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				getOnCompletion().addAll((Collection<? extends OnCompletionDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				getOnException().addAll((Collection<? extends OnExceptionDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__PIPELINE:
				getPipeline().clear();
				getPipeline().addAll((Collection<? extends PipelineDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__POLICY:
				getPolicy().clear();
				getPolicy().addAll((Collection<? extends PolicyDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__POLL_ENRICH:
				getPollEnrich().clear();
				getPollEnrich().addAll((Collection<? extends PollEnrichDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends ProcessDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__RECIPIENT_LIST:
				getRecipientList().clear();
				getRecipientList().addAll((Collection<? extends RecipientListDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__REMOVE_HEADER:
				getRemoveHeader().clear();
				getRemoveHeader().addAll((Collection<? extends RemoveHeaderDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__REMOVE_HEADERS:
				getRemoveHeaders().clear();
				getRemoveHeaders().addAll((Collection<? extends RemoveHeadersDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__REMOVE_PROPERTY:
				getRemoveProperty().clear();
				getRemoveProperty().addAll((Collection<? extends RemovePropertyDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__RESEQUENCE:
				getResequence().clear();
				getResequence().addAll((Collection<? extends ResequenceDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__ROLLBACK:
				getRollback().clear();
				getRollback().addAll((Collection<? extends RollbackDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__ROUTE:
				getRoute().clear();
				getRoute().addAll((Collection<? extends RouteDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__ROUTING_SLIP:
				getRoutingSlip().clear();
				getRoutingSlip().addAll((Collection<? extends RoutingSlipDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__SAMPLE:
				getSample().clear();
				getSample().addAll((Collection<? extends SamplingDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_BODY:
				getSetBody().clear();
				getSetBody().addAll((Collection<? extends SetBodyDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_EXCHANGE_PATTERN:
				getSetExchangePattern().clear();
				getSetExchangePattern().addAll((Collection<? extends SetExchangePatternDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_FAULT_BODY:
				getSetFaultBody().clear();
				getSetFaultBody().addAll((Collection<? extends SetFaultBodyDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				getSetHeader().addAll((Collection<? extends SetHeaderDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_OUT_HEADER:
				getSetOutHeader().clear();
				getSetOutHeader().addAll((Collection<? extends SetOutHeaderDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_PROPERTY:
				getSetProperty().clear();
				getSetProperty().addAll((Collection<? extends SetPropertyDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__SORT:
				getSort().clear();
				getSort().addAll((Collection<? extends SortDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__SPLIT:
				getSplit().clear();
				getSplit().addAll((Collection<? extends SplitDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__STOP:
				getStop().clear();
				getStop().addAll((Collection<? extends StopDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__THREADS:
				getThreads().clear();
				getThreads().addAll((Collection<? extends ThreadsDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__THROTTLE:
				getThrottle().clear();
				getThrottle().addAll((Collection<? extends ThrottleDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__THROW_EXCEPTION:
				getThrowException().clear();
				getThrowException().addAll((Collection<? extends ThrowExceptionDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__TO:
				getTo().clear();
				getTo().addAll((Collection<? extends ToDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__TRANSACTED:
				getTransacted().clear();
				getTransacted().addAll((Collection<? extends TransactedDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__TRANSFORM:
				getTransform().clear();
				getTransform().addAll((Collection<? extends TransformDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__DO_TRY:
				getDoTry().clear();
				getDoTry().addAll((Collection<? extends TryDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__UNMARSHAL:
				getUnmarshal().clear();
				getUnmarshal().addAll((Collection<? extends UnmarshalDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__VALIDATE:
				getValidate().clear();
				getValidate().addAll((Collection<? extends ValidateDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__WIRE_TAP:
				getWireTap().clear();
				getWireTap().addAll((Collection<? extends WireTapDefinition>)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__ON_REDELIVERY_REF:
				setOnRedeliveryRef((String)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__REDELIVERY_POLICY_REF:
				setRedeliveryPolicyRef((String)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__USE_ORIGINAL_MESSAGE:
				setUseOriginalMessage((Boolean)newValue);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__ANY_ATTRIBUTE1:
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
			case SpringPackage.ON_EXCEPTION_DEFINITION__EXCEPTION:
				getException().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__ON_WHEN:
				setOnWhen((WhenDefinition)null);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__RETRY_WHILE:
				setRetryWhile((ExpressionSubElementDefinition)null);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__REDELIVERY_POLICY:
				setRedeliveryPolicy((RedeliveryPolicyDefinition)null);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__HANDLED:
				setHandled((ExpressionSubElementDefinition)null);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__CONTINUED:
				setContinued((ExpressionSubElementDefinition)null);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__GROUP:
				getGroup().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__AOP:
				getAop().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__AGGREGATE:
				getAggregate().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__BEAN:
				getBean().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__DO_CATCH:
				getDoCatch().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__WHEN:
				getWhen().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__CHOICE:
				getChoice().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__OTHERWISE:
				getOtherwise().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__CONVERT_BODY_TO:
				getConvertBodyTo().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__DELAY:
				getDelay().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__DYNAMIC_ROUTER:
				getDynamicRouter().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__ENRICH:
				getEnrich().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__FILTER:
				getFilter().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__DO_FINALLY:
				getDoFinally().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__IDEMPOTENT_CONSUMER:
				getIdempotentConsumer().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__IN_ONLY:
				getInOnly().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__IN_OUT:
				getInOut().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__INTERCEPT:
				getIntercept().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__INTERCEPT_TO_ENDPOINT:
				getInterceptToEndpoint().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__LOAD_BALANCE:
				getLoadBalance().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__LOG:
				getLog().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__LOOP:
				getLoop().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__MARSHAL:
				getMarshal().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__MULTICAST:
				getMulticast().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__PIPELINE:
				getPipeline().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__POLICY:
				getPolicy().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__POLL_ENRICH:
				getPollEnrich().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__PROCESS:
				getProcess().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__RECIPIENT_LIST:
				getRecipientList().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__REMOVE_HEADER:
				getRemoveHeader().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__REMOVE_HEADERS:
				getRemoveHeaders().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__REMOVE_PROPERTY:
				getRemoveProperty().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__RESEQUENCE:
				getResequence().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__ROLLBACK:
				getRollback().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__ROUTE:
				getRoute().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__ROUTING_SLIP:
				getRoutingSlip().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__SAMPLE:
				getSample().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_BODY:
				getSetBody().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_EXCHANGE_PATTERN:
				getSetExchangePattern().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_FAULT_BODY:
				getSetFaultBody().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_OUT_HEADER:
				getSetOutHeader().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_PROPERTY:
				getSetProperty().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__SORT:
				getSort().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__SPLIT:
				getSplit().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__STOP:
				getStop().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__THREADS:
				getThreads().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__THROTTLE:
				getThrottle().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__THROW_EXCEPTION:
				getThrowException().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__TO:
				getTo().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__TRANSACTED:
				getTransacted().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__TRANSFORM:
				getTransform().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__DO_TRY:
				getDoTry().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__UNMARSHAL:
				getUnmarshal().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__VALIDATE:
				getValidate().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__WIRE_TAP:
				getWireTap().clear();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__ON_REDELIVERY_REF:
				setOnRedeliveryRef(ON_REDELIVERY_REF_EDEFAULT);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__REDELIVERY_POLICY_REF:
				setRedeliveryPolicyRef(REDELIVERY_POLICY_REF_EDEFAULT);
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__USE_ORIGINAL_MESSAGE:
				unsetUseOriginalMessage();
				return;
			case SpringPackage.ON_EXCEPTION_DEFINITION__ANY_ATTRIBUTE1:
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
			case SpringPackage.ON_EXCEPTION_DEFINITION__EXCEPTION:
				return exception != null && !exception.isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__ON_WHEN:
				return onWhen != null;
			case SpringPackage.ON_EXCEPTION_DEFINITION__RETRY_WHILE:
				return retryWhile != null;
			case SpringPackage.ON_EXCEPTION_DEFINITION__REDELIVERY_POLICY:
				return redeliveryPolicy != null;
			case SpringPackage.ON_EXCEPTION_DEFINITION__HANDLED:
				return handled != null;
			case SpringPackage.ON_EXCEPTION_DEFINITION__CONTINUED:
				return continued != null;
			case SpringPackage.ON_EXCEPTION_DEFINITION__GROUP:
				return group != null && !group.isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__AOP:
				return !getAop().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__AGGREGATE:
				return !getAggregate().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__BEAN:
				return !getBean().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__DO_CATCH:
				return !getDoCatch().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__WHEN:
				return !getWhen().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__CHOICE:
				return !getChoice().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__OTHERWISE:
				return !getOtherwise().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__CONVERT_BODY_TO:
				return !getConvertBodyTo().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__DELAY:
				return !getDelay().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__DYNAMIC_ROUTER:
				return !getDynamicRouter().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__ENRICH:
				return !getEnrich().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__FILTER:
				return !getFilter().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__DO_FINALLY:
				return !getDoFinally().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__IDEMPOTENT_CONSUMER:
				return !getIdempotentConsumer().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__IN_ONLY:
				return !getInOnly().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__IN_OUT:
				return !getInOut().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__INTERCEPT:
				return !getIntercept().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__INTERCEPT_FROM:
				return !getInterceptFrom().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__INTERCEPT_TO_ENDPOINT:
				return !getInterceptToEndpoint().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__LOAD_BALANCE:
				return !getLoadBalance().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__LOG:
				return !getLog().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__LOOP:
				return !getLoop().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__MARSHAL:
				return !getMarshal().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__MULTICAST:
				return !getMulticast().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__ON_COMPLETION:
				return !getOnCompletion().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__ON_EXCEPTION:
				return !getOnException().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__PIPELINE:
				return !getPipeline().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__POLICY:
				return !getPolicy().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__POLL_ENRICH:
				return !getPollEnrich().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__PROCESS:
				return !getProcess().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__RECIPIENT_LIST:
				return !getRecipientList().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__REMOVE_HEADER:
				return !getRemoveHeader().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__REMOVE_HEADERS:
				return !getRemoveHeaders().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__REMOVE_PROPERTY:
				return !getRemoveProperty().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__RESEQUENCE:
				return !getResequence().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__ROLLBACK:
				return !getRollback().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__ROUTE:
				return !getRoute().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__ROUTING_SLIP:
				return !getRoutingSlip().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__SAMPLE:
				return !getSample().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_BODY:
				return !getSetBody().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_EXCHANGE_PATTERN:
				return !getSetExchangePattern().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_FAULT_BODY:
				return !getSetFaultBody().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_HEADER:
				return !getSetHeader().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_OUT_HEADER:
				return !getSetOutHeader().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__SET_PROPERTY:
				return !getSetProperty().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__SORT:
				return !getSort().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__SPLIT:
				return !getSplit().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__STOP:
				return !getStop().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__THREADS:
				return !getThreads().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__THROTTLE:
				return !getThrottle().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__THROW_EXCEPTION:
				return !getThrowException().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__TO:
				return !getTo().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__TRANSACTED:
				return !getTransacted().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__TRANSFORM:
				return !getTransform().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__DO_TRY:
				return !getDoTry().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__UNMARSHAL:
				return !getUnmarshal().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__VALIDATE:
				return !getValidate().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__WIRE_TAP:
				return !getWireTap().isEmpty();
			case SpringPackage.ON_EXCEPTION_DEFINITION__ON_REDELIVERY_REF:
				return ON_REDELIVERY_REF_EDEFAULT == null ? onRedeliveryRef != null : !ON_REDELIVERY_REF_EDEFAULT.equals(onRedeliveryRef);
			case SpringPackage.ON_EXCEPTION_DEFINITION__REDELIVERY_POLICY_REF:
				return REDELIVERY_POLICY_REF_EDEFAULT == null ? redeliveryPolicyRef != null : !REDELIVERY_POLICY_REF_EDEFAULT.equals(redeliveryPolicyRef);
			case SpringPackage.ON_EXCEPTION_DEFINITION__USE_ORIGINAL_MESSAGE:
				return isSetUseOriginalMessage();
			case SpringPackage.ON_EXCEPTION_DEFINITION__ANY_ATTRIBUTE1:
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
		result.append(" (exception: ");
		result.append(exception);
		result.append(", group: ");
		result.append(group);
		result.append(", onRedeliveryRef: ");
		result.append(onRedeliveryRef);
		result.append(", redeliveryPolicyRef: ");
		result.append(redeliveryPolicyRef);
		result.append(", useOriginalMessage: ");
		if (useOriginalMessageESet) result.append(useOriginalMessage); else result.append("<unset>");
		result.append(", anyAttribute1: ");
		result.append(anyAttribute1);
		result.append(')');
		return result.toString();
	}

} //OnExceptionDefinitionImpl
