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
 * An implementation of the model object '<em><b>On Completion Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getOnWhen <em>On When</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getAop <em>Aop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getInOnly <em>In Only</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getInOut <em>In Out</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getInterceptToEndpoint <em>Intercept To Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getLog <em>Log</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getSample <em>Sample</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getSetFaultBody <em>Set Fault Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getSetOutHeader <em>Set Out Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getExecutorServiceRef <em>Executor Service Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#isOnCompleteOnly <em>On Complete Only</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#isOnFailureOnly <em>On Failure Only</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#isUseOriginalMessage <em>Use Original Message</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OnCompletionDefinitionImpl#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OnCompletionDefinitionImpl extends ProcessorDefinitionImpl implements OnCompletionDefinition {
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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	 * The default value of the '{@link #isOnCompleteOnly() <em>On Complete Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnCompleteOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ON_COMPLETE_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnCompleteOnly() <em>On Complete Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnCompleteOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean onCompleteOnly = ON_COMPLETE_ONLY_EDEFAULT;

	/**
	 * This is true if the On Complete Only attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean onCompleteOnlyESet;

	/**
	 * The default value of the '{@link #isOnFailureOnly() <em>On Failure Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnFailureOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ON_FAILURE_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnFailureOnly() <em>On Failure Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnFailureOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean onFailureOnly = ON_FAILURE_ONLY_EDEFAULT;

	/**
	 * This is true if the On Failure Only attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean onFailureOnlyESet;

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
	protected OnCompletionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getOnCompletionDefinition();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.ON_COMPLETION_DEFINITION__ON_WHEN, oldOnWhen, newOnWhen);
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
				msgs = ((InternalEObject)onWhen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.ON_COMPLETION_DEFINITION__ON_WHEN, null, msgs);
			if (newOnWhen != null)
				msgs = ((InternalEObject)newOnWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.ON_COMPLETION_DEFINITION__ON_WHEN, null, msgs);
			msgs = basicSetOnWhen(newOnWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ON_COMPLETION_DEFINITION__ON_WHEN, newOnWhen, newOnWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, SpringPackage.ON_COMPLETION_DEFINITION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AopDefinition> getAop() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Aop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregateDefinition> getAggregate() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Aggregate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BeanDefinition> getBean() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Bean());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CatchDefinition> getDoCatch() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_DoCatch());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WhenDefinition> getWhen() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_When());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChoiceDefinition> getChoice() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Choice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherwiseDefinition> getOtherwise() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Otherwise());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConvertBodyDefinition> getConvertBodyTo() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_ConvertBodyTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelayDefinition> getDelay() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Delay());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicRouterDefinition> getDynamicRouter() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_DynamicRouter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnrichDefinition> getEnrich() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Enrich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterDefinition> getFilter() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Filter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FinallyDefinition> getDoFinally() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_DoFinally());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdempotentConsumerDefinition> getIdempotentConsumer() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_IdempotentConsumer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InOnlyDefinition> getInOnly() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_InOnly());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InOutDefinition> getInOut() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_InOut());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterceptDefinition> getIntercept() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Intercept());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterceptFromDefinition> getInterceptFrom() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_InterceptFrom());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterceptSendToEndpointDefinition> getInterceptToEndpoint() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_InterceptToEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadBalanceDefinition> getLoadBalance() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_LoadBalance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogDefinition> getLog() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Log());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoopDefinition> getLoop() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Loop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarshalDefinition> getMarshal() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Marshal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MulticastDefinition> getMulticast() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Multicast());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnCompletionDefinition> getOnCompletion() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_OnCompletion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnExceptionDefinition> getOnException() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_OnException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PipelineDefinition> getPipeline() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Pipeline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolicyDefinition> getPolicy() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Policy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PollEnrichDefinition> getPollEnrich() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_PollEnrich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessDefinition> getProcess() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Process());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecipientListDefinition> getRecipientList() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_RecipientList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemoveHeaderDefinition> getRemoveHeader() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_RemoveHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemoveHeadersDefinition> getRemoveHeaders() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_RemoveHeaders());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemovePropertyDefinition> getRemoveProperty() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_RemoveProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResequenceDefinition> getResequence() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Resequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RollbackDefinition> getRollback() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Rollback());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RouteDefinition> getRoute() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Route());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoutingSlipDefinition> getRoutingSlip() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_RoutingSlip());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SamplingDefinition> getSample() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Sample());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetBodyDefinition> getSetBody() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_SetBody());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetExchangePatternDefinition> getSetExchangePattern() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_SetExchangePattern());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetFaultBodyDefinition> getSetFaultBody() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_SetFaultBody());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetHeaderDefinition> getSetHeader() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_SetHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetOutHeaderDefinition> getSetOutHeader() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_SetOutHeader());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetPropertyDefinition> getSetProperty() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_SetProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortDefinition> getSort() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Sort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SplitDefinition> getSplit() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Split());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StopDefinition> getStop() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Stop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThreadsDefinition> getThreads() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Threads());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThrottleDefinition> getThrottle() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Throttle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThrowExceptionDefinition> getThrowException() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_ThrowException());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToDefinition> getTo() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_To());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransactedDefinition> getTransacted() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Transacted());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformDefinition> getTransform() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Transform());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TryDefinition> getDoTry() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_DoTry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnmarshalDefinition> getUnmarshal() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Unmarshal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValidateDefinition> getValidate() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_Validate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WireTapDefinition> getWireTap() {
		return getGroup().list(SpringPackage.eINSTANCE.getOnCompletionDefinition_WireTap());
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ON_COMPLETION_DEFINITION__EXECUTOR_SERVICE_REF, oldExecutorServiceRef, executorServiceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOnCompleteOnly() {
		return onCompleteOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnCompleteOnly(boolean newOnCompleteOnly) {
		boolean oldOnCompleteOnly = onCompleteOnly;
		onCompleteOnly = newOnCompleteOnly;
		boolean oldOnCompleteOnlyESet = onCompleteOnlyESet;
		onCompleteOnlyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ON_COMPLETION_DEFINITION__ON_COMPLETE_ONLY, oldOnCompleteOnly, onCompleteOnly, !oldOnCompleteOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOnCompleteOnly() {
		boolean oldOnCompleteOnly = onCompleteOnly;
		boolean oldOnCompleteOnlyESet = onCompleteOnlyESet;
		onCompleteOnly = ON_COMPLETE_ONLY_EDEFAULT;
		onCompleteOnlyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.ON_COMPLETION_DEFINITION__ON_COMPLETE_ONLY, oldOnCompleteOnly, ON_COMPLETE_ONLY_EDEFAULT, oldOnCompleteOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOnCompleteOnly() {
		return onCompleteOnlyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOnFailureOnly() {
		return onFailureOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnFailureOnly(boolean newOnFailureOnly) {
		boolean oldOnFailureOnly = onFailureOnly;
		onFailureOnly = newOnFailureOnly;
		boolean oldOnFailureOnlyESet = onFailureOnlyESet;
		onFailureOnlyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ON_COMPLETION_DEFINITION__ON_FAILURE_ONLY, oldOnFailureOnly, onFailureOnly, !oldOnFailureOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOnFailureOnly() {
		boolean oldOnFailureOnly = onFailureOnly;
		boolean oldOnFailureOnlyESet = onFailureOnlyESet;
		onFailureOnly = ON_FAILURE_ONLY_EDEFAULT;
		onFailureOnlyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.ON_COMPLETION_DEFINITION__ON_FAILURE_ONLY, oldOnFailureOnly, ON_FAILURE_ONLY_EDEFAULT, oldOnFailureOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOnFailureOnly() {
		return onFailureOnlyESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ON_COMPLETION_DEFINITION__USE_ORIGINAL_MESSAGE, oldUseOriginalMessage, useOriginalMessage, !oldUseOriginalMessageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.ON_COMPLETION_DEFINITION__USE_ORIGINAL_MESSAGE, oldUseOriginalMessage, USE_ORIGINAL_MESSAGE_EDEFAULT, oldUseOriginalMessageESet));
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
			anyAttribute1 = new BasicFeatureMap(this, SpringPackage.ON_COMPLETION_DEFINITION__ANY_ATTRIBUTE1);
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
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_WHEN:
				return basicSetOnWhen(null, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__AOP:
				return ((InternalEList<?>)getAop()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__AGGREGATE:
				return ((InternalEList<?>)getAggregate()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__BEAN:
				return ((InternalEList<?>)getBean()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__DO_CATCH:
				return ((InternalEList<?>)getDoCatch()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__WHEN:
				return ((InternalEList<?>)getWhen()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__CHOICE:
				return ((InternalEList<?>)getChoice()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__OTHERWISE:
				return ((InternalEList<?>)getOtherwise()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__CONVERT_BODY_TO:
				return ((InternalEList<?>)getConvertBodyTo()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__DELAY:
				return ((InternalEList<?>)getDelay()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__DYNAMIC_ROUTER:
				return ((InternalEList<?>)getDynamicRouter()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__ENRICH:
				return ((InternalEList<?>)getEnrich()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__DO_FINALLY:
				return ((InternalEList<?>)getDoFinally()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__IDEMPOTENT_CONSUMER:
				return ((InternalEList<?>)getIdempotentConsumer()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__IN_ONLY:
				return ((InternalEList<?>)getInOnly()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__IN_OUT:
				return ((InternalEList<?>)getInOut()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__INTERCEPT:
				return ((InternalEList<?>)getIntercept()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__INTERCEPT_FROM:
				return ((InternalEList<?>)getInterceptFrom()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__INTERCEPT_TO_ENDPOINT:
				return ((InternalEList<?>)getInterceptToEndpoint()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__LOAD_BALANCE:
				return ((InternalEList<?>)getLoadBalance()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__LOG:
				return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__LOOP:
				return ((InternalEList<?>)getLoop()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__MARSHAL:
				return ((InternalEList<?>)getMarshal()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__MULTICAST:
				return ((InternalEList<?>)getMulticast()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_COMPLETION:
				return ((InternalEList<?>)getOnCompletion()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_EXCEPTION:
				return ((InternalEList<?>)getOnException()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__PIPELINE:
				return ((InternalEList<?>)getPipeline()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__POLICY:
				return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__POLL_ENRICH:
				return ((InternalEList<?>)getPollEnrich()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__RECIPIENT_LIST:
				return ((InternalEList<?>)getRecipientList()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__REMOVE_HEADER:
				return ((InternalEList<?>)getRemoveHeader()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__REMOVE_HEADERS:
				return ((InternalEList<?>)getRemoveHeaders()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__REMOVE_PROPERTY:
				return ((InternalEList<?>)getRemoveProperty()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__RESEQUENCE:
				return ((InternalEList<?>)getResequence()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__ROLLBACK:
				return ((InternalEList<?>)getRollback()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__ROUTE:
				return ((InternalEList<?>)getRoute()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__ROUTING_SLIP:
				return ((InternalEList<?>)getRoutingSlip()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__SAMPLE:
				return ((InternalEList<?>)getSample()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_BODY:
				return ((InternalEList<?>)getSetBody()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_EXCHANGE_PATTERN:
				return ((InternalEList<?>)getSetExchangePattern()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_FAULT_BODY:
				return ((InternalEList<?>)getSetFaultBody()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_HEADER:
				return ((InternalEList<?>)getSetHeader()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_OUT_HEADER:
				return ((InternalEList<?>)getSetOutHeader()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_PROPERTY:
				return ((InternalEList<?>)getSetProperty()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__SORT:
				return ((InternalEList<?>)getSort()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__SPLIT:
				return ((InternalEList<?>)getSplit()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__STOP:
				return ((InternalEList<?>)getStop()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__THREADS:
				return ((InternalEList<?>)getThreads()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__THROTTLE:
				return ((InternalEList<?>)getThrottle()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__THROW_EXCEPTION:
				return ((InternalEList<?>)getThrowException()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__TO:
				return ((InternalEList<?>)getTo()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__TRANSACTED:
				return ((InternalEList<?>)getTransacted()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__TRANSFORM:
				return ((InternalEList<?>)getTransform()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__DO_TRY:
				return ((InternalEList<?>)getDoTry()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__UNMARSHAL:
				return ((InternalEList<?>)getUnmarshal()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__VALIDATE:
				return ((InternalEList<?>)getValidate()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__WIRE_TAP:
				return ((InternalEList<?>)getWireTap()).basicRemove(otherEnd, msgs);
			case SpringPackage.ON_COMPLETION_DEFINITION__ANY_ATTRIBUTE1:
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
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_WHEN:
				return getOnWhen();
			case SpringPackage.ON_COMPLETION_DEFINITION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SpringPackage.ON_COMPLETION_DEFINITION__AOP:
				return getAop();
			case SpringPackage.ON_COMPLETION_DEFINITION__AGGREGATE:
				return getAggregate();
			case SpringPackage.ON_COMPLETION_DEFINITION__BEAN:
				return getBean();
			case SpringPackage.ON_COMPLETION_DEFINITION__DO_CATCH:
				return getDoCatch();
			case SpringPackage.ON_COMPLETION_DEFINITION__WHEN:
				return getWhen();
			case SpringPackage.ON_COMPLETION_DEFINITION__CHOICE:
				return getChoice();
			case SpringPackage.ON_COMPLETION_DEFINITION__OTHERWISE:
				return getOtherwise();
			case SpringPackage.ON_COMPLETION_DEFINITION__CONVERT_BODY_TO:
				return getConvertBodyTo();
			case SpringPackage.ON_COMPLETION_DEFINITION__DELAY:
				return getDelay();
			case SpringPackage.ON_COMPLETION_DEFINITION__DYNAMIC_ROUTER:
				return getDynamicRouter();
			case SpringPackage.ON_COMPLETION_DEFINITION__ENRICH:
				return getEnrich();
			case SpringPackage.ON_COMPLETION_DEFINITION__FILTER:
				return getFilter();
			case SpringPackage.ON_COMPLETION_DEFINITION__DO_FINALLY:
				return getDoFinally();
			case SpringPackage.ON_COMPLETION_DEFINITION__IDEMPOTENT_CONSUMER:
				return getIdempotentConsumer();
			case SpringPackage.ON_COMPLETION_DEFINITION__IN_ONLY:
				return getInOnly();
			case SpringPackage.ON_COMPLETION_DEFINITION__IN_OUT:
				return getInOut();
			case SpringPackage.ON_COMPLETION_DEFINITION__INTERCEPT:
				return getIntercept();
			case SpringPackage.ON_COMPLETION_DEFINITION__INTERCEPT_FROM:
				return getInterceptFrom();
			case SpringPackage.ON_COMPLETION_DEFINITION__INTERCEPT_TO_ENDPOINT:
				return getInterceptToEndpoint();
			case SpringPackage.ON_COMPLETION_DEFINITION__LOAD_BALANCE:
				return getLoadBalance();
			case SpringPackage.ON_COMPLETION_DEFINITION__LOG:
				return getLog();
			case SpringPackage.ON_COMPLETION_DEFINITION__LOOP:
				return getLoop();
			case SpringPackage.ON_COMPLETION_DEFINITION__MARSHAL:
				return getMarshal();
			case SpringPackage.ON_COMPLETION_DEFINITION__MULTICAST:
				return getMulticast();
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_COMPLETION:
				return getOnCompletion();
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_EXCEPTION:
				return getOnException();
			case SpringPackage.ON_COMPLETION_DEFINITION__PIPELINE:
				return getPipeline();
			case SpringPackage.ON_COMPLETION_DEFINITION__POLICY:
				return getPolicy();
			case SpringPackage.ON_COMPLETION_DEFINITION__POLL_ENRICH:
				return getPollEnrich();
			case SpringPackage.ON_COMPLETION_DEFINITION__PROCESS:
				return getProcess();
			case SpringPackage.ON_COMPLETION_DEFINITION__RECIPIENT_LIST:
				return getRecipientList();
			case SpringPackage.ON_COMPLETION_DEFINITION__REMOVE_HEADER:
				return getRemoveHeader();
			case SpringPackage.ON_COMPLETION_DEFINITION__REMOVE_HEADERS:
				return getRemoveHeaders();
			case SpringPackage.ON_COMPLETION_DEFINITION__REMOVE_PROPERTY:
				return getRemoveProperty();
			case SpringPackage.ON_COMPLETION_DEFINITION__RESEQUENCE:
				return getResequence();
			case SpringPackage.ON_COMPLETION_DEFINITION__ROLLBACK:
				return getRollback();
			case SpringPackage.ON_COMPLETION_DEFINITION__ROUTE:
				return getRoute();
			case SpringPackage.ON_COMPLETION_DEFINITION__ROUTING_SLIP:
				return getRoutingSlip();
			case SpringPackage.ON_COMPLETION_DEFINITION__SAMPLE:
				return getSample();
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_BODY:
				return getSetBody();
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_EXCHANGE_PATTERN:
				return getSetExchangePattern();
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_FAULT_BODY:
				return getSetFaultBody();
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_HEADER:
				return getSetHeader();
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_OUT_HEADER:
				return getSetOutHeader();
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_PROPERTY:
				return getSetProperty();
			case SpringPackage.ON_COMPLETION_DEFINITION__SORT:
				return getSort();
			case SpringPackage.ON_COMPLETION_DEFINITION__SPLIT:
				return getSplit();
			case SpringPackage.ON_COMPLETION_DEFINITION__STOP:
				return getStop();
			case SpringPackage.ON_COMPLETION_DEFINITION__THREADS:
				return getThreads();
			case SpringPackage.ON_COMPLETION_DEFINITION__THROTTLE:
				return getThrottle();
			case SpringPackage.ON_COMPLETION_DEFINITION__THROW_EXCEPTION:
				return getThrowException();
			case SpringPackage.ON_COMPLETION_DEFINITION__TO:
				return getTo();
			case SpringPackage.ON_COMPLETION_DEFINITION__TRANSACTED:
				return getTransacted();
			case SpringPackage.ON_COMPLETION_DEFINITION__TRANSFORM:
				return getTransform();
			case SpringPackage.ON_COMPLETION_DEFINITION__DO_TRY:
				return getDoTry();
			case SpringPackage.ON_COMPLETION_DEFINITION__UNMARSHAL:
				return getUnmarshal();
			case SpringPackage.ON_COMPLETION_DEFINITION__VALIDATE:
				return getValidate();
			case SpringPackage.ON_COMPLETION_DEFINITION__WIRE_TAP:
				return getWireTap();
			case SpringPackage.ON_COMPLETION_DEFINITION__EXECUTOR_SERVICE_REF:
				return getExecutorServiceRef();
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_COMPLETE_ONLY:
				return isOnCompleteOnly();
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_FAILURE_ONLY:
				return isOnFailureOnly();
			case SpringPackage.ON_COMPLETION_DEFINITION__USE_ORIGINAL_MESSAGE:
				return isUseOriginalMessage();
			case SpringPackage.ON_COMPLETION_DEFINITION__ANY_ATTRIBUTE1:
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
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_WHEN:
				setOnWhen((WhenDefinition)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__AOP:
				getAop().clear();
				getAop().addAll((Collection<? extends AopDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__AGGREGATE:
				getAggregate().clear();
				getAggregate().addAll((Collection<? extends AggregateDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__BEAN:
				getBean().clear();
				getBean().addAll((Collection<? extends BeanDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__DO_CATCH:
				getDoCatch().clear();
				getDoCatch().addAll((Collection<? extends CatchDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__WHEN:
				getWhen().clear();
				getWhen().addAll((Collection<? extends WhenDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__CHOICE:
				getChoice().clear();
				getChoice().addAll((Collection<? extends ChoiceDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__OTHERWISE:
				getOtherwise().clear();
				getOtherwise().addAll((Collection<? extends OtherwiseDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__CONVERT_BODY_TO:
				getConvertBodyTo().clear();
				getConvertBodyTo().addAll((Collection<? extends ConvertBodyDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__DELAY:
				getDelay().clear();
				getDelay().addAll((Collection<? extends DelayDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__DYNAMIC_ROUTER:
				getDynamicRouter().clear();
				getDynamicRouter().addAll((Collection<? extends DynamicRouterDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__ENRICH:
				getEnrich().clear();
				getEnrich().addAll((Collection<? extends EnrichDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends FilterDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__DO_FINALLY:
				getDoFinally().clear();
				getDoFinally().addAll((Collection<? extends FinallyDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__IDEMPOTENT_CONSUMER:
				getIdempotentConsumer().clear();
				getIdempotentConsumer().addAll((Collection<? extends IdempotentConsumerDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__IN_ONLY:
				getInOnly().clear();
				getInOnly().addAll((Collection<? extends InOnlyDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__IN_OUT:
				getInOut().clear();
				getInOut().addAll((Collection<? extends InOutDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__INTERCEPT:
				getIntercept().clear();
				getIntercept().addAll((Collection<? extends InterceptDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				getInterceptFrom().addAll((Collection<? extends InterceptFromDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__INTERCEPT_TO_ENDPOINT:
				getInterceptToEndpoint().clear();
				getInterceptToEndpoint().addAll((Collection<? extends InterceptSendToEndpointDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__LOAD_BALANCE:
				getLoadBalance().clear();
				getLoadBalance().addAll((Collection<? extends LoadBalanceDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__LOG:
				getLog().clear();
				getLog().addAll((Collection<? extends LogDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__LOOP:
				getLoop().clear();
				getLoop().addAll((Collection<? extends LoopDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__MARSHAL:
				getMarshal().clear();
				getMarshal().addAll((Collection<? extends MarshalDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__MULTICAST:
				getMulticast().clear();
				getMulticast().addAll((Collection<? extends MulticastDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				getOnCompletion().addAll((Collection<? extends OnCompletionDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				getOnException().addAll((Collection<? extends OnExceptionDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__PIPELINE:
				getPipeline().clear();
				getPipeline().addAll((Collection<? extends PipelineDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__POLICY:
				getPolicy().clear();
				getPolicy().addAll((Collection<? extends PolicyDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__POLL_ENRICH:
				getPollEnrich().clear();
				getPollEnrich().addAll((Collection<? extends PollEnrichDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends ProcessDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__RECIPIENT_LIST:
				getRecipientList().clear();
				getRecipientList().addAll((Collection<? extends RecipientListDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__REMOVE_HEADER:
				getRemoveHeader().clear();
				getRemoveHeader().addAll((Collection<? extends RemoveHeaderDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__REMOVE_HEADERS:
				getRemoveHeaders().clear();
				getRemoveHeaders().addAll((Collection<? extends RemoveHeadersDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__REMOVE_PROPERTY:
				getRemoveProperty().clear();
				getRemoveProperty().addAll((Collection<? extends RemovePropertyDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__RESEQUENCE:
				getResequence().clear();
				getResequence().addAll((Collection<? extends ResequenceDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__ROLLBACK:
				getRollback().clear();
				getRollback().addAll((Collection<? extends RollbackDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__ROUTE:
				getRoute().clear();
				getRoute().addAll((Collection<? extends RouteDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__ROUTING_SLIP:
				getRoutingSlip().clear();
				getRoutingSlip().addAll((Collection<? extends RoutingSlipDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__SAMPLE:
				getSample().clear();
				getSample().addAll((Collection<? extends SamplingDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_BODY:
				getSetBody().clear();
				getSetBody().addAll((Collection<? extends SetBodyDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_EXCHANGE_PATTERN:
				getSetExchangePattern().clear();
				getSetExchangePattern().addAll((Collection<? extends SetExchangePatternDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_FAULT_BODY:
				getSetFaultBody().clear();
				getSetFaultBody().addAll((Collection<? extends SetFaultBodyDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				getSetHeader().addAll((Collection<? extends SetHeaderDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_OUT_HEADER:
				getSetOutHeader().clear();
				getSetOutHeader().addAll((Collection<? extends SetOutHeaderDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_PROPERTY:
				getSetProperty().clear();
				getSetProperty().addAll((Collection<? extends SetPropertyDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__SORT:
				getSort().clear();
				getSort().addAll((Collection<? extends SortDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__SPLIT:
				getSplit().clear();
				getSplit().addAll((Collection<? extends SplitDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__STOP:
				getStop().clear();
				getStop().addAll((Collection<? extends StopDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__THREADS:
				getThreads().clear();
				getThreads().addAll((Collection<? extends ThreadsDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__THROTTLE:
				getThrottle().clear();
				getThrottle().addAll((Collection<? extends ThrottleDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__THROW_EXCEPTION:
				getThrowException().clear();
				getThrowException().addAll((Collection<? extends ThrowExceptionDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__TO:
				getTo().clear();
				getTo().addAll((Collection<? extends ToDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__TRANSACTED:
				getTransacted().clear();
				getTransacted().addAll((Collection<? extends TransactedDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__TRANSFORM:
				getTransform().clear();
				getTransform().addAll((Collection<? extends TransformDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__DO_TRY:
				getDoTry().clear();
				getDoTry().addAll((Collection<? extends TryDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__UNMARSHAL:
				getUnmarshal().clear();
				getUnmarshal().addAll((Collection<? extends UnmarshalDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__VALIDATE:
				getValidate().clear();
				getValidate().addAll((Collection<? extends ValidateDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__WIRE_TAP:
				getWireTap().clear();
				getWireTap().addAll((Collection<? extends WireTapDefinition>)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__EXECUTOR_SERVICE_REF:
				setExecutorServiceRef((String)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_COMPLETE_ONLY:
				setOnCompleteOnly((Boolean)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_FAILURE_ONLY:
				setOnFailureOnly((Boolean)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__USE_ORIGINAL_MESSAGE:
				setUseOriginalMessage((Boolean)newValue);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__ANY_ATTRIBUTE1:
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
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_WHEN:
				setOnWhen((WhenDefinition)null);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__GROUP:
				getGroup().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__AOP:
				getAop().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__AGGREGATE:
				getAggregate().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__BEAN:
				getBean().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__DO_CATCH:
				getDoCatch().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__WHEN:
				getWhen().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__CHOICE:
				getChoice().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__OTHERWISE:
				getOtherwise().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__CONVERT_BODY_TO:
				getConvertBodyTo().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__DELAY:
				getDelay().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__DYNAMIC_ROUTER:
				getDynamicRouter().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__ENRICH:
				getEnrich().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__FILTER:
				getFilter().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__DO_FINALLY:
				getDoFinally().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__IDEMPOTENT_CONSUMER:
				getIdempotentConsumer().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__IN_ONLY:
				getInOnly().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__IN_OUT:
				getInOut().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__INTERCEPT:
				getIntercept().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__INTERCEPT_TO_ENDPOINT:
				getInterceptToEndpoint().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__LOAD_BALANCE:
				getLoadBalance().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__LOG:
				getLog().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__LOOP:
				getLoop().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__MARSHAL:
				getMarshal().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__MULTICAST:
				getMulticast().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__PIPELINE:
				getPipeline().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__POLICY:
				getPolicy().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__POLL_ENRICH:
				getPollEnrich().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__PROCESS:
				getProcess().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__RECIPIENT_LIST:
				getRecipientList().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__REMOVE_HEADER:
				getRemoveHeader().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__REMOVE_HEADERS:
				getRemoveHeaders().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__REMOVE_PROPERTY:
				getRemoveProperty().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__RESEQUENCE:
				getResequence().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__ROLLBACK:
				getRollback().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__ROUTE:
				getRoute().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__ROUTING_SLIP:
				getRoutingSlip().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__SAMPLE:
				getSample().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_BODY:
				getSetBody().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_EXCHANGE_PATTERN:
				getSetExchangePattern().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_FAULT_BODY:
				getSetFaultBody().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_OUT_HEADER:
				getSetOutHeader().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_PROPERTY:
				getSetProperty().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__SORT:
				getSort().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__SPLIT:
				getSplit().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__STOP:
				getStop().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__THREADS:
				getThreads().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__THROTTLE:
				getThrottle().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__THROW_EXCEPTION:
				getThrowException().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__TO:
				getTo().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__TRANSACTED:
				getTransacted().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__TRANSFORM:
				getTransform().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__DO_TRY:
				getDoTry().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__UNMARSHAL:
				getUnmarshal().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__VALIDATE:
				getValidate().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__WIRE_TAP:
				getWireTap().clear();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__EXECUTOR_SERVICE_REF:
				setExecutorServiceRef(EXECUTOR_SERVICE_REF_EDEFAULT);
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_COMPLETE_ONLY:
				unsetOnCompleteOnly();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_FAILURE_ONLY:
				unsetOnFailureOnly();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__USE_ORIGINAL_MESSAGE:
				unsetUseOriginalMessage();
				return;
			case SpringPackage.ON_COMPLETION_DEFINITION__ANY_ATTRIBUTE1:
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
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_WHEN:
				return onWhen != null;
			case SpringPackage.ON_COMPLETION_DEFINITION__GROUP:
				return group != null && !group.isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__AOP:
				return !getAop().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__AGGREGATE:
				return !getAggregate().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__BEAN:
				return !getBean().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__DO_CATCH:
				return !getDoCatch().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__WHEN:
				return !getWhen().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__CHOICE:
				return !getChoice().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__OTHERWISE:
				return !getOtherwise().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__CONVERT_BODY_TO:
				return !getConvertBodyTo().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__DELAY:
				return !getDelay().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__DYNAMIC_ROUTER:
				return !getDynamicRouter().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__ENRICH:
				return !getEnrich().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__FILTER:
				return !getFilter().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__DO_FINALLY:
				return !getDoFinally().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__IDEMPOTENT_CONSUMER:
				return !getIdempotentConsumer().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__IN_ONLY:
				return !getInOnly().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__IN_OUT:
				return !getInOut().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__INTERCEPT:
				return !getIntercept().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__INTERCEPT_FROM:
				return !getInterceptFrom().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__INTERCEPT_TO_ENDPOINT:
				return !getInterceptToEndpoint().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__LOAD_BALANCE:
				return !getLoadBalance().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__LOG:
				return !getLog().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__LOOP:
				return !getLoop().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__MARSHAL:
				return !getMarshal().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__MULTICAST:
				return !getMulticast().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_COMPLETION:
				return !getOnCompletion().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_EXCEPTION:
				return !getOnException().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__PIPELINE:
				return !getPipeline().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__POLICY:
				return !getPolicy().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__POLL_ENRICH:
				return !getPollEnrich().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__PROCESS:
				return !getProcess().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__RECIPIENT_LIST:
				return !getRecipientList().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__REMOVE_HEADER:
				return !getRemoveHeader().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__REMOVE_HEADERS:
				return !getRemoveHeaders().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__REMOVE_PROPERTY:
				return !getRemoveProperty().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__RESEQUENCE:
				return !getResequence().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__ROLLBACK:
				return !getRollback().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__ROUTE:
				return !getRoute().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__ROUTING_SLIP:
				return !getRoutingSlip().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__SAMPLE:
				return !getSample().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_BODY:
				return !getSetBody().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_EXCHANGE_PATTERN:
				return !getSetExchangePattern().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_FAULT_BODY:
				return !getSetFaultBody().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_HEADER:
				return !getSetHeader().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_OUT_HEADER:
				return !getSetOutHeader().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__SET_PROPERTY:
				return !getSetProperty().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__SORT:
				return !getSort().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__SPLIT:
				return !getSplit().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__STOP:
				return !getStop().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__THREADS:
				return !getThreads().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__THROTTLE:
				return !getThrottle().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__THROW_EXCEPTION:
				return !getThrowException().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__TO:
				return !getTo().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__TRANSACTED:
				return !getTransacted().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__TRANSFORM:
				return !getTransform().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__DO_TRY:
				return !getDoTry().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__UNMARSHAL:
				return !getUnmarshal().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__VALIDATE:
				return !getValidate().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__WIRE_TAP:
				return !getWireTap().isEmpty();
			case SpringPackage.ON_COMPLETION_DEFINITION__EXECUTOR_SERVICE_REF:
				return EXECUTOR_SERVICE_REF_EDEFAULT == null ? executorServiceRef != null : !EXECUTOR_SERVICE_REF_EDEFAULT.equals(executorServiceRef);
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_COMPLETE_ONLY:
				return isSetOnCompleteOnly();
			case SpringPackage.ON_COMPLETION_DEFINITION__ON_FAILURE_ONLY:
				return isSetOnFailureOnly();
			case SpringPackage.ON_COMPLETION_DEFINITION__USE_ORIGINAL_MESSAGE:
				return isSetUseOriginalMessage();
			case SpringPackage.ON_COMPLETION_DEFINITION__ANY_ATTRIBUTE1:
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
		result.append(", executorServiceRef: ");
		result.append(executorServiceRef);
		result.append(", onCompleteOnly: ");
		if (onCompleteOnlyESet) result.append(onCompleteOnly); else result.append("<unset>");
		result.append(", onFailureOnly: ");
		if (onFailureOnlyESet) result.append(onFailureOnly); else result.append("<unset>");
		result.append(", useOriginalMessage: ");
		if (useOriginalMessageESet) result.append(useOriginalMessage); else result.append("<unset>");
		result.append(", anyAttribute1: ");
		result.append(anyAttribute1);
		result.append(')');
		return result.toString();
	}

} //OnCompletionDefinitionImpl
