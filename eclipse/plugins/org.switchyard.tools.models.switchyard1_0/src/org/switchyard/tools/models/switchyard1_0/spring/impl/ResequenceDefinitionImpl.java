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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.AopDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.BatchResequencerConfig;
import org.switchyard.tools.models.switchyard1_0.spring.BeanDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.CatchDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ChoiceDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ConstantExpression;
import org.switchyard.tools.models.switchyard1_0.spring.ConvertBodyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.DelayDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.DynamicRouterDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ElExpression;
import org.switchyard.tools.models.switchyard1_0.spring.EnrichDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.Expression;
import org.switchyard.tools.models.switchyard1_0.spring.FilterDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.FinallyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.GroovyExpression;
import org.switchyard.tools.models.switchyard1_0.spring.HeaderExpression;
import org.switchyard.tools.models.switchyard1_0.spring.IdempotentConsumerDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.InOnlyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.InOutDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.InterceptDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.InterceptFromDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.InterceptSendToEndpointDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.JavaScriptExpression;
import org.switchyard.tools.models.switchyard1_0.spring.JxPathExpression;
import org.switchyard.tools.models.switchyard1_0.spring.LanguageExpression;
import org.switchyard.tools.models.switchyard1_0.spring.LoadBalanceDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.LogDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.LoopDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.MethodCallExpression;
import org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.MvelExpression;
import org.switchyard.tools.models.switchyard1_0.spring.OgnlExpression;
import org.switchyard.tools.models.switchyard1_0.spring.OnCompletionDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.OnExceptionDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.OtherwiseDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.PhpExpression;
import org.switchyard.tools.models.switchyard1_0.spring.PipelineDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.PolicyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.PollEnrichDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ProcessDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.PythonExpression;
import org.switchyard.tools.models.switchyard1_0.spring.RecipientListDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RefExpression;
import org.switchyard.tools.models.switchyard1_0.spring.RemoveHeaderDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RemoveHeadersDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RemovePropertyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RollbackDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RoutingSlipDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RubyExpression;
import org.switchyard.tools.models.switchyard1_0.spring.SamplingDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SetBodyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SetExchangePatternDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SetFaultBodyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SetHeaderDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SetOutHeaderDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SetPropertyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SimpleExpression;
import org.switchyard.tools.models.switchyard1_0.spring.SortDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpELExpression;
import org.switchyard.tools.models.switchyard1_0.spring.SplitDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.SqlExpression;
import org.switchyard.tools.models.switchyard1_0.spring.StopDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.StreamResequencerConfig;
import org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ThrowExceptionDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ToDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.TokenizerExpression;
import org.switchyard.tools.models.switchyard1_0.spring.TransactedDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.TransformDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.TryDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.UnmarshalDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ValidateDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.WhenDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.XPathExpression;
import org.switchyard.tools.models.switchyard1_0.spring.XQueryExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resequence Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getBatchConfig <em>Batch Config</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getStreamConfig <em>Stream Config</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getExpressionDefinition <em>Expression Definition</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getEl <em>El</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getGroovy <em>Groovy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getJxpath <em>Jxpath</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getJavaScript <em>Java Script</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getMvel <em>Mvel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getOgnl <em>Ognl</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getPhp <em>Php</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getPython <em>Python</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getSpel <em>Spel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getSql <em>Sql</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getTokenize <em>Tokenize</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getXquery <em>Xquery</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getAop <em>Aop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getInOnly <em>In Only</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getInOut <em>In Out</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getInterceptToEndpoint <em>Intercept To Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getLog <em>Log</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getSample <em>Sample</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getSetFaultBody <em>Set Fault Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getSetOutHeader <em>Set Out Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ResequenceDefinitionImpl#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResequenceDefinitionImpl extends ProcessorDefinitionImpl implements ResequenceDefinition {
	/**
     * The cached value of the '{@link #getBatchConfig() <em>Batch Config</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBatchConfig()
     * @generated
     * @ordered
     */
	protected BatchResequencerConfig batchConfig;

	/**
     * The cached value of the '{@link #getStreamConfig() <em>Stream Config</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStreamConfig()
     * @generated
     * @ordered
     */
	protected StreamResequencerConfig streamConfig;

	/**
     * The cached value of the '{@link #getExpressionDefinition() <em>Expression Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExpressionDefinition()
     * @generated
     * @ordered
     */
	protected Expression expressionDefinition;

	/**
     * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getConstant()
     * @generated
     * @ordered
     */
	protected ConstantExpression constant;

	/**
     * The cached value of the '{@link #getEl() <em>El</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEl()
     * @generated
     * @ordered
     */
	protected ElExpression el;

	/**
     * The cached value of the '{@link #getGroovy() <em>Groovy</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGroovy()
     * @generated
     * @ordered
     */
	protected GroovyExpression groovy;

	/**
     * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHeader()
     * @generated
     * @ordered
     */
	protected HeaderExpression header;

	/**
     * The cached value of the '{@link #getJxpath() <em>Jxpath</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getJxpath()
     * @generated
     * @ordered
     */
	protected JxPathExpression jxpath;

	/**
     * The cached value of the '{@link #getJavaScript() <em>Java Script</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getJavaScript()
     * @generated
     * @ordered
     */
	protected JavaScriptExpression javaScript;

	/**
     * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLanguage()
     * @generated
     * @ordered
     */
	protected LanguageExpression language;

	/**
     * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMethod()
     * @generated
     * @ordered
     */
	protected MethodCallExpression method;

	/**
     * The cached value of the '{@link #getMvel() <em>Mvel</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMvel()
     * @generated
     * @ordered
     */
	protected MvelExpression mvel;

	/**
     * The cached value of the '{@link #getOgnl() <em>Ognl</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOgnl()
     * @generated
     * @ordered
     */
	protected OgnlExpression ognl;

	/**
     * The cached value of the '{@link #getPhp() <em>Php</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPhp()
     * @generated
     * @ordered
     */
	protected PhpExpression php;

	/**
     * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProperty()
     * @generated
     * @ordered
     */
	protected EObject property;

	/**
     * This is true if the Property containment reference has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean propertyESet;

	/**
     * The cached value of the '{@link #getPython() <em>Python</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPython()
     * @generated
     * @ordered
     */
	protected PythonExpression python;

	/**
     * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRef()
     * @generated
     * @ordered
     */
	protected RefExpression ref;

	/**
     * The cached value of the '{@link #getRuby() <em>Ruby</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRuby()
     * @generated
     * @ordered
     */
	protected RubyExpression ruby;

	/**
     * The cached value of the '{@link #getSimple() <em>Simple</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSimple()
     * @generated
     * @ordered
     */
	protected SimpleExpression simple;

	/**
     * The cached value of the '{@link #getSpel() <em>Spel</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSpel()
     * @generated
     * @ordered
     */
	protected SpELExpression spel;

	/**
     * The cached value of the '{@link #getSql() <em>Sql</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSql()
     * @generated
     * @ordered
     */
	protected SqlExpression sql;

	/**
     * The cached value of the '{@link #getTokenize() <em>Tokenize</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTokenize()
     * @generated
     * @ordered
     */
	protected TokenizerExpression tokenize;

	/**
     * The cached value of the '{@link #getXpath() <em>Xpath</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXpath()
     * @generated
     * @ordered
     */
	protected XPathExpression xpath;

	/**
     * The cached value of the '{@link #getXquery() <em>Xquery</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXquery()
     * @generated
     * @ordered
     */
	protected XQueryExpression xquery;

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
	protected ResequenceDefinitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getResequenceDefinition();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BatchResequencerConfig getBatchConfig() {
        return batchConfig;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetBatchConfig(BatchResequencerConfig newBatchConfig, NotificationChain msgs) {
        BatchResequencerConfig oldBatchConfig = batchConfig;
        batchConfig = newBatchConfig;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__BATCH_CONFIG, oldBatchConfig, newBatchConfig);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBatchConfig(BatchResequencerConfig newBatchConfig) {
        if (newBatchConfig != batchConfig) {
            NotificationChain msgs = null;
            if (batchConfig != null)
                msgs = ((InternalEObject)batchConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__BATCH_CONFIG, null, msgs);
            if (newBatchConfig != null)
                msgs = ((InternalEObject)newBatchConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__BATCH_CONFIG, null, msgs);
            msgs = basicSetBatchConfig(newBatchConfig, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__BATCH_CONFIG, newBatchConfig, newBatchConfig));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StreamResequencerConfig getStreamConfig() {
        return streamConfig;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetStreamConfig(StreamResequencerConfig newStreamConfig, NotificationChain msgs) {
        StreamResequencerConfig oldStreamConfig = streamConfig;
        streamConfig = newStreamConfig;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__STREAM_CONFIG, oldStreamConfig, newStreamConfig);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStreamConfig(StreamResequencerConfig newStreamConfig) {
        if (newStreamConfig != streamConfig) {
            NotificationChain msgs = null;
            if (streamConfig != null)
                msgs = ((InternalEObject)streamConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__STREAM_CONFIG, null, msgs);
            if (newStreamConfig != null)
                msgs = ((InternalEObject)newStreamConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__STREAM_CONFIG, null, msgs);
            msgs = basicSetStreamConfig(newStreamConfig, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__STREAM_CONFIG, newStreamConfig, newStreamConfig));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Expression getExpressionDefinition() {
        return expressionDefinition;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetExpressionDefinition(Expression newExpressionDefinition, NotificationChain msgs) {
        Expression oldExpressionDefinition = expressionDefinition;
        expressionDefinition = newExpressionDefinition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__EXPRESSION_DEFINITION, oldExpressionDefinition, newExpressionDefinition);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setExpressionDefinition(Expression newExpressionDefinition) {
        if (newExpressionDefinition != expressionDefinition) {
            NotificationChain msgs = null;
            if (expressionDefinition != null)
                msgs = ((InternalEObject)expressionDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__EXPRESSION_DEFINITION, null, msgs);
            if (newExpressionDefinition != null)
                msgs = ((InternalEObject)newExpressionDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__EXPRESSION_DEFINITION, null, msgs);
            msgs = basicSetExpressionDefinition(newExpressionDefinition, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__EXPRESSION_DEFINITION, newExpressionDefinition, newExpressionDefinition));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ConstantExpression getConstant() {
        return constant;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetConstant(ConstantExpression newConstant, NotificationChain msgs) {
        ConstantExpression oldConstant = constant;
        constant = newConstant;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__CONSTANT, oldConstant, newConstant);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setConstant(ConstantExpression newConstant) {
        if (newConstant != constant) {
            NotificationChain msgs = null;
            if (constant != null)
                msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__CONSTANT, null, msgs);
            if (newConstant != null)
                msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__CONSTANT, null, msgs);
            msgs = basicSetConstant(newConstant, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__CONSTANT, newConstant, newConstant));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ElExpression getEl() {
        return el;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetEl(ElExpression newEl, NotificationChain msgs) {
        ElExpression oldEl = el;
        el = newEl;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__EL, oldEl, newEl);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setEl(ElExpression newEl) {
        if (newEl != el) {
            NotificationChain msgs = null;
            if (el != null)
                msgs = ((InternalEObject)el).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__EL, null, msgs);
            if (newEl != null)
                msgs = ((InternalEObject)newEl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__EL, null, msgs);
            msgs = basicSetEl(newEl, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__EL, newEl, newEl));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public GroovyExpression getGroovy() {
        return groovy;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetGroovy(GroovyExpression newGroovy, NotificationChain msgs) {
        GroovyExpression oldGroovy = groovy;
        groovy = newGroovy;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__GROOVY, oldGroovy, newGroovy);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setGroovy(GroovyExpression newGroovy) {
        if (newGroovy != groovy) {
            NotificationChain msgs = null;
            if (groovy != null)
                msgs = ((InternalEObject)groovy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__GROOVY, null, msgs);
            if (newGroovy != null)
                msgs = ((InternalEObject)newGroovy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__GROOVY, null, msgs);
            msgs = basicSetGroovy(newGroovy, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__GROOVY, newGroovy, newGroovy));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HeaderExpression getHeader() {
        return header;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetHeader(HeaderExpression newHeader, NotificationChain msgs) {
        HeaderExpression oldHeader = header;
        header = newHeader;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__HEADER, oldHeader, newHeader);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHeader(HeaderExpression newHeader) {
        if (newHeader != header) {
            NotificationChain msgs = null;
            if (header != null)
                msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__HEADER, null, msgs);
            if (newHeader != null)
                msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__HEADER, null, msgs);
            msgs = basicSetHeader(newHeader, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__HEADER, newHeader, newHeader));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JxPathExpression getJxpath() {
        return jxpath;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetJxpath(JxPathExpression newJxpath, NotificationChain msgs) {
        JxPathExpression oldJxpath = jxpath;
        jxpath = newJxpath;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__JXPATH, oldJxpath, newJxpath);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setJxpath(JxPathExpression newJxpath) {
        if (newJxpath != jxpath) {
            NotificationChain msgs = null;
            if (jxpath != null)
                msgs = ((InternalEObject)jxpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__JXPATH, null, msgs);
            if (newJxpath != null)
                msgs = ((InternalEObject)newJxpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__JXPATH, null, msgs);
            msgs = basicSetJxpath(newJxpath, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__JXPATH, newJxpath, newJxpath));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JavaScriptExpression getJavaScript() {
        return javaScript;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetJavaScript(JavaScriptExpression newJavaScript, NotificationChain msgs) {
        JavaScriptExpression oldJavaScript = javaScript;
        javaScript = newJavaScript;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__JAVA_SCRIPT, oldJavaScript, newJavaScript);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setJavaScript(JavaScriptExpression newJavaScript) {
        if (newJavaScript != javaScript) {
            NotificationChain msgs = null;
            if (javaScript != null)
                msgs = ((InternalEObject)javaScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__JAVA_SCRIPT, null, msgs);
            if (newJavaScript != null)
                msgs = ((InternalEObject)newJavaScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__JAVA_SCRIPT, null, msgs);
            msgs = basicSetJavaScript(newJavaScript, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__JAVA_SCRIPT, newJavaScript, newJavaScript));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LanguageExpression getLanguage() {
        return language;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetLanguage(LanguageExpression newLanguage, NotificationChain msgs) {
        LanguageExpression oldLanguage = language;
        language = newLanguage;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__LANGUAGE, oldLanguage, newLanguage);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLanguage(LanguageExpression newLanguage) {
        if (newLanguage != language) {
            NotificationChain msgs = null;
            if (language != null)
                msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__LANGUAGE, null, msgs);
            if (newLanguage != null)
                msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__LANGUAGE, null, msgs);
            msgs = basicSetLanguage(newLanguage, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__LANGUAGE, newLanguage, newLanguage));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MethodCallExpression getMethod() {
        return method;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetMethod(MethodCallExpression newMethod, NotificationChain msgs) {
        MethodCallExpression oldMethod = method;
        method = newMethod;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__METHOD, oldMethod, newMethod);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMethod(MethodCallExpression newMethod) {
        if (newMethod != method) {
            NotificationChain msgs = null;
            if (method != null)
                msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__METHOD, null, msgs);
            if (newMethod != null)
                msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__METHOD, null, msgs);
            msgs = basicSetMethod(newMethod, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__METHOD, newMethod, newMethod));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MvelExpression getMvel() {
        return mvel;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetMvel(MvelExpression newMvel, NotificationChain msgs) {
        MvelExpression oldMvel = mvel;
        mvel = newMvel;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__MVEL, oldMvel, newMvel);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMvel(MvelExpression newMvel) {
        if (newMvel != mvel) {
            NotificationChain msgs = null;
            if (mvel != null)
                msgs = ((InternalEObject)mvel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__MVEL, null, msgs);
            if (newMvel != null)
                msgs = ((InternalEObject)newMvel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__MVEL, null, msgs);
            msgs = basicSetMvel(newMvel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__MVEL, newMvel, newMvel));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public OgnlExpression getOgnl() {
        return ognl;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetOgnl(OgnlExpression newOgnl, NotificationChain msgs) {
        OgnlExpression oldOgnl = ognl;
        ognl = newOgnl;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__OGNL, oldOgnl, newOgnl);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOgnl(OgnlExpression newOgnl) {
        if (newOgnl != ognl) {
            NotificationChain msgs = null;
            if (ognl != null)
                msgs = ((InternalEObject)ognl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__OGNL, null, msgs);
            if (newOgnl != null)
                msgs = ((InternalEObject)newOgnl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__OGNL, null, msgs);
            msgs = basicSetOgnl(newOgnl, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__OGNL, newOgnl, newOgnl));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PhpExpression getPhp() {
        return php;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetPhp(PhpExpression newPhp, NotificationChain msgs) {
        PhpExpression oldPhp = php;
        php = newPhp;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__PHP, oldPhp, newPhp);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPhp(PhpExpression newPhp) {
        if (newPhp != php) {
            NotificationChain msgs = null;
            if (php != null)
                msgs = ((InternalEObject)php).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__PHP, null, msgs);
            if (newPhp != null)
                msgs = ((InternalEObject)newPhp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__PHP, null, msgs);
            msgs = basicSetPhp(newPhp, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__PHP, newPhp, newPhp));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EObject getProperty() {
        return property;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetProperty(EObject newProperty, NotificationChain msgs) {
        EObject oldProperty = property;
        property = newProperty;
        boolean oldPropertyESet = propertyESet;
        propertyESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__PROPERTY, oldProperty, newProperty, !oldPropertyESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setProperty(EObject newProperty) {
        if (newProperty != property) {
            NotificationChain msgs = null;
            if (property != null)
                msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__PROPERTY, null, msgs);
            if (newProperty != null)
                msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__PROPERTY, null, msgs);
            msgs = basicSetProperty(newProperty, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldPropertyESet = propertyESet;
            propertyESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__PROPERTY, newProperty, newProperty, !oldPropertyESet));
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicUnsetProperty(NotificationChain msgs) {
        EObject oldProperty = property;
        property = null;
        boolean oldPropertyESet = propertyESet;
        propertyESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SpringPackage.RESEQUENCE_DEFINITION__PROPERTY, oldProperty, null, oldPropertyESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetProperty() {
        if (property != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__PROPERTY, null, msgs);
            msgs = basicUnsetProperty(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldPropertyESet = propertyESet;
            propertyESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.RESEQUENCE_DEFINITION__PROPERTY, null, null, oldPropertyESet));
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetProperty() {
        return propertyESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PythonExpression getPython() {
        return python;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetPython(PythonExpression newPython, NotificationChain msgs) {
        PythonExpression oldPython = python;
        python = newPython;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__PYTHON, oldPython, newPython);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPython(PythonExpression newPython) {
        if (newPython != python) {
            NotificationChain msgs = null;
            if (python != null)
                msgs = ((InternalEObject)python).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__PYTHON, null, msgs);
            if (newPython != null)
                msgs = ((InternalEObject)newPython).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__PYTHON, null, msgs);
            msgs = basicSetPython(newPython, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__PYTHON, newPython, newPython));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RefExpression getRef() {
        return ref;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetRef(RefExpression newRef, NotificationChain msgs) {
        RefExpression oldRef = ref;
        ref = newRef;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__REF, oldRef, newRef);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRef(RefExpression newRef) {
        if (newRef != ref) {
            NotificationChain msgs = null;
            if (ref != null)
                msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__REF, null, msgs);
            if (newRef != null)
                msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__REF, null, msgs);
            msgs = basicSetRef(newRef, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__REF, newRef, newRef));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RubyExpression getRuby() {
        return ruby;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetRuby(RubyExpression newRuby, NotificationChain msgs) {
        RubyExpression oldRuby = ruby;
        ruby = newRuby;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__RUBY, oldRuby, newRuby);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRuby(RubyExpression newRuby) {
        if (newRuby != ruby) {
            NotificationChain msgs = null;
            if (ruby != null)
                msgs = ((InternalEObject)ruby).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__RUBY, null, msgs);
            if (newRuby != null)
                msgs = ((InternalEObject)newRuby).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__RUBY, null, msgs);
            msgs = basicSetRuby(newRuby, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__RUBY, newRuby, newRuby));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SimpleExpression getSimple() {
        return simple;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetSimple(SimpleExpression newSimple, NotificationChain msgs) {
        SimpleExpression oldSimple = simple;
        simple = newSimple;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__SIMPLE, oldSimple, newSimple);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSimple(SimpleExpression newSimple) {
        if (newSimple != simple) {
            NotificationChain msgs = null;
            if (simple != null)
                msgs = ((InternalEObject)simple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__SIMPLE, null, msgs);
            if (newSimple != null)
                msgs = ((InternalEObject)newSimple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__SIMPLE, null, msgs);
            msgs = basicSetSimple(newSimple, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__SIMPLE, newSimple, newSimple));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SpELExpression getSpel() {
        return spel;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetSpel(SpELExpression newSpel, NotificationChain msgs) {
        SpELExpression oldSpel = spel;
        spel = newSpel;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__SPEL, oldSpel, newSpel);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSpel(SpELExpression newSpel) {
        if (newSpel != spel) {
            NotificationChain msgs = null;
            if (spel != null)
                msgs = ((InternalEObject)spel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__SPEL, null, msgs);
            if (newSpel != null)
                msgs = ((InternalEObject)newSpel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__SPEL, null, msgs);
            msgs = basicSetSpel(newSpel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__SPEL, newSpel, newSpel));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SqlExpression getSql() {
        return sql;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetSql(SqlExpression newSql, NotificationChain msgs) {
        SqlExpression oldSql = sql;
        sql = newSql;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__SQL, oldSql, newSql);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSql(SqlExpression newSql) {
        if (newSql != sql) {
            NotificationChain msgs = null;
            if (sql != null)
                msgs = ((InternalEObject)sql).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__SQL, null, msgs);
            if (newSql != null)
                msgs = ((InternalEObject)newSql).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__SQL, null, msgs);
            msgs = basicSetSql(newSql, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__SQL, newSql, newSql));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TokenizerExpression getTokenize() {
        return tokenize;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetTokenize(TokenizerExpression newTokenize, NotificationChain msgs) {
        TokenizerExpression oldTokenize = tokenize;
        tokenize = newTokenize;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__TOKENIZE, oldTokenize, newTokenize);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTokenize(TokenizerExpression newTokenize) {
        if (newTokenize != tokenize) {
            NotificationChain msgs = null;
            if (tokenize != null)
                msgs = ((InternalEObject)tokenize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__TOKENIZE, null, msgs);
            if (newTokenize != null)
                msgs = ((InternalEObject)newTokenize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__TOKENIZE, null, msgs);
            msgs = basicSetTokenize(newTokenize, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__TOKENIZE, newTokenize, newTokenize));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public XPathExpression getXpath() {
        return xpath;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetXpath(XPathExpression newXpath, NotificationChain msgs) {
        XPathExpression oldXpath = xpath;
        xpath = newXpath;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__XPATH, oldXpath, newXpath);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXpath(XPathExpression newXpath) {
        if (newXpath != xpath) {
            NotificationChain msgs = null;
            if (xpath != null)
                msgs = ((InternalEObject)xpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__XPATH, null, msgs);
            if (newXpath != null)
                msgs = ((InternalEObject)newXpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__XPATH, null, msgs);
            msgs = basicSetXpath(newXpath, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__XPATH, newXpath, newXpath));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public XQueryExpression getXquery() {
        return xquery;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetXquery(XQueryExpression newXquery, NotificationChain msgs) {
        XQueryExpression oldXquery = xquery;
        xquery = newXquery;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__XQUERY, oldXquery, newXquery);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXquery(XQueryExpression newXquery) {
        if (newXquery != xquery) {
            NotificationChain msgs = null;
            if (xquery != null)
                msgs = ((InternalEObject)xquery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__XQUERY, null, msgs);
            if (newXquery != null)
                msgs = ((InternalEObject)newXquery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.RESEQUENCE_DEFINITION__XQUERY, null, msgs);
            msgs = basicSetXquery(newXquery, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.RESEQUENCE_DEFINITION__XQUERY, newXquery, newXquery));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, SpringPackage.RESEQUENCE_DEFINITION__GROUP);
        }
        return group;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<AopDefinition> getAop() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Aop());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<AggregateDefinition> getAggregate() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Aggregate());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<BeanDefinition> getBean() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Bean());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<CatchDefinition> getDoCatch() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_DoCatch());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<WhenDefinition> getWhen() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_When());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ChoiceDefinition> getChoice() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Choice());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<OtherwiseDefinition> getOtherwise() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Otherwise());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ConvertBodyDefinition> getConvertBodyTo() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_ConvertBodyTo());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<DelayDefinition> getDelay() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Delay());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<DynamicRouterDefinition> getDynamicRouter() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_DynamicRouter());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<EnrichDefinition> getEnrich() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Enrich());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<FilterDefinition> getFilter() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Filter());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<FinallyDefinition> getDoFinally() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_DoFinally());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<IdempotentConsumerDefinition> getIdempotentConsumer() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_IdempotentConsumer());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<InOnlyDefinition> getInOnly() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_InOnly());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<InOutDefinition> getInOut() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_InOut());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<InterceptDefinition> getIntercept() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Intercept());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<InterceptFromDefinition> getInterceptFrom() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_InterceptFrom());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<InterceptSendToEndpointDefinition> getInterceptToEndpoint() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_InterceptToEndpoint());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<LoadBalanceDefinition> getLoadBalance() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_LoadBalance());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<LogDefinition> getLog() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Log());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<LoopDefinition> getLoop() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Loop());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<MarshalDefinition> getMarshal() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Marshal());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<MulticastDefinition> getMulticast() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Multicast());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<OnCompletionDefinition> getOnCompletion() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_OnCompletion());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<OnExceptionDefinition> getOnException() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_OnException());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PipelineDefinition> getPipeline() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Pipeline());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PolicyDefinition> getPolicy() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Policy());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PollEnrichDefinition> getPollEnrich() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_PollEnrich());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ProcessDefinition> getProcess() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Process());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RecipientListDefinition> getRecipientList() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_RecipientList());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RemoveHeaderDefinition> getRemoveHeader() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_RemoveHeader());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RemoveHeadersDefinition> getRemoveHeaders() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_RemoveHeaders());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RemovePropertyDefinition> getRemoveProperty() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_RemoveProperty());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ResequenceDefinition> getResequence() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Resequence());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RollbackDefinition> getRollback() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Rollback());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RouteDefinition> getRoute() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Route());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RoutingSlipDefinition> getRoutingSlip() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_RoutingSlip());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SamplingDefinition> getSample() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Sample());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SetBodyDefinition> getSetBody() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_SetBody());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SetExchangePatternDefinition> getSetExchangePattern() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_SetExchangePattern());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SetFaultBodyDefinition> getSetFaultBody() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_SetFaultBody());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SetHeaderDefinition> getSetHeader() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_SetHeader());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SetOutHeaderDefinition> getSetOutHeader() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_SetOutHeader());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SetPropertyDefinition> getSetProperty() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_SetProperty());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SortDefinition> getSort() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Sort());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SplitDefinition> getSplit() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Split());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<StopDefinition> getStop() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Stop());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ThreadsDefinition> getThreads() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Threads());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ThrottleDefinition> getThrottle() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Throttle());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ThrowExceptionDefinition> getThrowException() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_ThrowException());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ToDefinition> getTo() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_To());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<TransactedDefinition> getTransacted() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Transacted());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<TransformDefinition> getTransform() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Transform());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<TryDefinition> getDoTry() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_DoTry());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<UnmarshalDefinition> getUnmarshal() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Unmarshal());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ValidateDefinition> getValidate() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_Validate());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<WireTapDefinition> getWireTap() {
        return getGroup().list(SpringPackage.eINSTANCE.getResequenceDefinition_WireTap());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute1() {
        if (anyAttribute1 == null) {
            anyAttribute1 = new BasicFeatureMap(this, SpringPackage.RESEQUENCE_DEFINITION__ANY_ATTRIBUTE1);
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
            case SpringPackage.RESEQUENCE_DEFINITION__BATCH_CONFIG:
                return basicSetBatchConfig(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__STREAM_CONFIG:
                return basicSetStreamConfig(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__EXPRESSION_DEFINITION:
                return basicSetExpressionDefinition(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__CONSTANT:
                return basicSetConstant(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__EL:
                return basicSetEl(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__GROOVY:
                return basicSetGroovy(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__HEADER:
                return basicSetHeader(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__JXPATH:
                return basicSetJxpath(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__JAVA_SCRIPT:
                return basicSetJavaScript(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__LANGUAGE:
                return basicSetLanguage(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__METHOD:
                return basicSetMethod(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__MVEL:
                return basicSetMvel(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__OGNL:
                return basicSetOgnl(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__PHP:
                return basicSetPhp(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__PROPERTY:
                return basicUnsetProperty(msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__PYTHON:
                return basicSetPython(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__REF:
                return basicSetRef(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__RUBY:
                return basicSetRuby(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__SIMPLE:
                return basicSetSimple(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__SPEL:
                return basicSetSpel(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__SQL:
                return basicSetSql(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__TOKENIZE:
                return basicSetTokenize(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__XPATH:
                return basicSetXpath(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__XQUERY:
                return basicSetXquery(null, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__AOP:
                return ((InternalEList<?>)getAop()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__AGGREGATE:
                return ((InternalEList<?>)getAggregate()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__BEAN:
                return ((InternalEList<?>)getBean()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__DO_CATCH:
                return ((InternalEList<?>)getDoCatch()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__WHEN:
                return ((InternalEList<?>)getWhen()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__CHOICE:
                return ((InternalEList<?>)getChoice()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__OTHERWISE:
                return ((InternalEList<?>)getOtherwise()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__CONVERT_BODY_TO:
                return ((InternalEList<?>)getConvertBodyTo()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__DELAY:
                return ((InternalEList<?>)getDelay()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__DYNAMIC_ROUTER:
                return ((InternalEList<?>)getDynamicRouter()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__ENRICH:
                return ((InternalEList<?>)getEnrich()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__FILTER:
                return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__DO_FINALLY:
                return ((InternalEList<?>)getDoFinally()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__IDEMPOTENT_CONSUMER:
                return ((InternalEList<?>)getIdempotentConsumer()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__IN_ONLY:
                return ((InternalEList<?>)getInOnly()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__IN_OUT:
                return ((InternalEList<?>)getInOut()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__INTERCEPT:
                return ((InternalEList<?>)getIntercept()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__INTERCEPT_FROM:
                return ((InternalEList<?>)getInterceptFrom()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__INTERCEPT_TO_ENDPOINT:
                return ((InternalEList<?>)getInterceptToEndpoint()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__LOAD_BALANCE:
                return ((InternalEList<?>)getLoadBalance()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__LOG:
                return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__LOOP:
                return ((InternalEList<?>)getLoop()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__MARSHAL:
                return ((InternalEList<?>)getMarshal()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__MULTICAST:
                return ((InternalEList<?>)getMulticast()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__ON_COMPLETION:
                return ((InternalEList<?>)getOnCompletion()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__ON_EXCEPTION:
                return ((InternalEList<?>)getOnException()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__PIPELINE:
                return ((InternalEList<?>)getPipeline()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__POLICY:
                return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__POLL_ENRICH:
                return ((InternalEList<?>)getPollEnrich()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__PROCESS:
                return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__RECIPIENT_LIST:
                return ((InternalEList<?>)getRecipientList()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__REMOVE_HEADER:
                return ((InternalEList<?>)getRemoveHeader()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__REMOVE_HEADERS:
                return ((InternalEList<?>)getRemoveHeaders()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__REMOVE_PROPERTY:
                return ((InternalEList<?>)getRemoveProperty()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__RESEQUENCE:
                return ((InternalEList<?>)getResequence()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__ROLLBACK:
                return ((InternalEList<?>)getRollback()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__ROUTE:
                return ((InternalEList<?>)getRoute()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__ROUTING_SLIP:
                return ((InternalEList<?>)getRoutingSlip()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__SAMPLE:
                return ((InternalEList<?>)getSample()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__SET_BODY:
                return ((InternalEList<?>)getSetBody()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__SET_EXCHANGE_PATTERN:
                return ((InternalEList<?>)getSetExchangePattern()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__SET_FAULT_BODY:
                return ((InternalEList<?>)getSetFaultBody()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__SET_HEADER:
                return ((InternalEList<?>)getSetHeader()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__SET_OUT_HEADER:
                return ((InternalEList<?>)getSetOutHeader()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__SET_PROPERTY:
                return ((InternalEList<?>)getSetProperty()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__SORT:
                return ((InternalEList<?>)getSort()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__SPLIT:
                return ((InternalEList<?>)getSplit()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__STOP:
                return ((InternalEList<?>)getStop()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__THREADS:
                return ((InternalEList<?>)getThreads()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__THROTTLE:
                return ((InternalEList<?>)getThrottle()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__THROW_EXCEPTION:
                return ((InternalEList<?>)getThrowException()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__TO:
                return ((InternalEList<?>)getTo()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__TRANSACTED:
                return ((InternalEList<?>)getTransacted()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__TRANSFORM:
                return ((InternalEList<?>)getTransform()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__DO_TRY:
                return ((InternalEList<?>)getDoTry()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__UNMARSHAL:
                return ((InternalEList<?>)getUnmarshal()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__VALIDATE:
                return ((InternalEList<?>)getValidate()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__WIRE_TAP:
                return ((InternalEList<?>)getWireTap()).basicRemove(otherEnd, msgs);
            case SpringPackage.RESEQUENCE_DEFINITION__ANY_ATTRIBUTE1:
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
            case SpringPackage.RESEQUENCE_DEFINITION__BATCH_CONFIG:
                return getBatchConfig();
            case SpringPackage.RESEQUENCE_DEFINITION__STREAM_CONFIG:
                return getStreamConfig();
            case SpringPackage.RESEQUENCE_DEFINITION__EXPRESSION_DEFINITION:
                return getExpressionDefinition();
            case SpringPackage.RESEQUENCE_DEFINITION__CONSTANT:
                return getConstant();
            case SpringPackage.RESEQUENCE_DEFINITION__EL:
                return getEl();
            case SpringPackage.RESEQUENCE_DEFINITION__GROOVY:
                return getGroovy();
            case SpringPackage.RESEQUENCE_DEFINITION__HEADER:
                return getHeader();
            case SpringPackage.RESEQUENCE_DEFINITION__JXPATH:
                return getJxpath();
            case SpringPackage.RESEQUENCE_DEFINITION__JAVA_SCRIPT:
                return getJavaScript();
            case SpringPackage.RESEQUENCE_DEFINITION__LANGUAGE:
                return getLanguage();
            case SpringPackage.RESEQUENCE_DEFINITION__METHOD:
                return getMethod();
            case SpringPackage.RESEQUENCE_DEFINITION__MVEL:
                return getMvel();
            case SpringPackage.RESEQUENCE_DEFINITION__OGNL:
                return getOgnl();
            case SpringPackage.RESEQUENCE_DEFINITION__PHP:
                return getPhp();
            case SpringPackage.RESEQUENCE_DEFINITION__PROPERTY:
                return getProperty();
            case SpringPackage.RESEQUENCE_DEFINITION__PYTHON:
                return getPython();
            case SpringPackage.RESEQUENCE_DEFINITION__REF:
                return getRef();
            case SpringPackage.RESEQUENCE_DEFINITION__RUBY:
                return getRuby();
            case SpringPackage.RESEQUENCE_DEFINITION__SIMPLE:
                return getSimple();
            case SpringPackage.RESEQUENCE_DEFINITION__SPEL:
                return getSpel();
            case SpringPackage.RESEQUENCE_DEFINITION__SQL:
                return getSql();
            case SpringPackage.RESEQUENCE_DEFINITION__TOKENIZE:
                return getTokenize();
            case SpringPackage.RESEQUENCE_DEFINITION__XPATH:
                return getXpath();
            case SpringPackage.RESEQUENCE_DEFINITION__XQUERY:
                return getXquery();
            case SpringPackage.RESEQUENCE_DEFINITION__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case SpringPackage.RESEQUENCE_DEFINITION__AOP:
                return getAop();
            case SpringPackage.RESEQUENCE_DEFINITION__AGGREGATE:
                return getAggregate();
            case SpringPackage.RESEQUENCE_DEFINITION__BEAN:
                return getBean();
            case SpringPackage.RESEQUENCE_DEFINITION__DO_CATCH:
                return getDoCatch();
            case SpringPackage.RESEQUENCE_DEFINITION__WHEN:
                return getWhen();
            case SpringPackage.RESEQUENCE_DEFINITION__CHOICE:
                return getChoice();
            case SpringPackage.RESEQUENCE_DEFINITION__OTHERWISE:
                return getOtherwise();
            case SpringPackage.RESEQUENCE_DEFINITION__CONVERT_BODY_TO:
                return getConvertBodyTo();
            case SpringPackage.RESEQUENCE_DEFINITION__DELAY:
                return getDelay();
            case SpringPackage.RESEQUENCE_DEFINITION__DYNAMIC_ROUTER:
                return getDynamicRouter();
            case SpringPackage.RESEQUENCE_DEFINITION__ENRICH:
                return getEnrich();
            case SpringPackage.RESEQUENCE_DEFINITION__FILTER:
                return getFilter();
            case SpringPackage.RESEQUENCE_DEFINITION__DO_FINALLY:
                return getDoFinally();
            case SpringPackage.RESEQUENCE_DEFINITION__IDEMPOTENT_CONSUMER:
                return getIdempotentConsumer();
            case SpringPackage.RESEQUENCE_DEFINITION__IN_ONLY:
                return getInOnly();
            case SpringPackage.RESEQUENCE_DEFINITION__IN_OUT:
                return getInOut();
            case SpringPackage.RESEQUENCE_DEFINITION__INTERCEPT:
                return getIntercept();
            case SpringPackage.RESEQUENCE_DEFINITION__INTERCEPT_FROM:
                return getInterceptFrom();
            case SpringPackage.RESEQUENCE_DEFINITION__INTERCEPT_TO_ENDPOINT:
                return getInterceptToEndpoint();
            case SpringPackage.RESEQUENCE_DEFINITION__LOAD_BALANCE:
                return getLoadBalance();
            case SpringPackage.RESEQUENCE_DEFINITION__LOG:
                return getLog();
            case SpringPackage.RESEQUENCE_DEFINITION__LOOP:
                return getLoop();
            case SpringPackage.RESEQUENCE_DEFINITION__MARSHAL:
                return getMarshal();
            case SpringPackage.RESEQUENCE_DEFINITION__MULTICAST:
                return getMulticast();
            case SpringPackage.RESEQUENCE_DEFINITION__ON_COMPLETION:
                return getOnCompletion();
            case SpringPackage.RESEQUENCE_DEFINITION__ON_EXCEPTION:
                return getOnException();
            case SpringPackage.RESEQUENCE_DEFINITION__PIPELINE:
                return getPipeline();
            case SpringPackage.RESEQUENCE_DEFINITION__POLICY:
                return getPolicy();
            case SpringPackage.RESEQUENCE_DEFINITION__POLL_ENRICH:
                return getPollEnrich();
            case SpringPackage.RESEQUENCE_DEFINITION__PROCESS:
                return getProcess();
            case SpringPackage.RESEQUENCE_DEFINITION__RECIPIENT_LIST:
                return getRecipientList();
            case SpringPackage.RESEQUENCE_DEFINITION__REMOVE_HEADER:
                return getRemoveHeader();
            case SpringPackage.RESEQUENCE_DEFINITION__REMOVE_HEADERS:
                return getRemoveHeaders();
            case SpringPackage.RESEQUENCE_DEFINITION__REMOVE_PROPERTY:
                return getRemoveProperty();
            case SpringPackage.RESEQUENCE_DEFINITION__RESEQUENCE:
                return getResequence();
            case SpringPackage.RESEQUENCE_DEFINITION__ROLLBACK:
                return getRollback();
            case SpringPackage.RESEQUENCE_DEFINITION__ROUTE:
                return getRoute();
            case SpringPackage.RESEQUENCE_DEFINITION__ROUTING_SLIP:
                return getRoutingSlip();
            case SpringPackage.RESEQUENCE_DEFINITION__SAMPLE:
                return getSample();
            case SpringPackage.RESEQUENCE_DEFINITION__SET_BODY:
                return getSetBody();
            case SpringPackage.RESEQUENCE_DEFINITION__SET_EXCHANGE_PATTERN:
                return getSetExchangePattern();
            case SpringPackage.RESEQUENCE_DEFINITION__SET_FAULT_BODY:
                return getSetFaultBody();
            case SpringPackage.RESEQUENCE_DEFINITION__SET_HEADER:
                return getSetHeader();
            case SpringPackage.RESEQUENCE_DEFINITION__SET_OUT_HEADER:
                return getSetOutHeader();
            case SpringPackage.RESEQUENCE_DEFINITION__SET_PROPERTY:
                return getSetProperty();
            case SpringPackage.RESEQUENCE_DEFINITION__SORT:
                return getSort();
            case SpringPackage.RESEQUENCE_DEFINITION__SPLIT:
                return getSplit();
            case SpringPackage.RESEQUENCE_DEFINITION__STOP:
                return getStop();
            case SpringPackage.RESEQUENCE_DEFINITION__THREADS:
                return getThreads();
            case SpringPackage.RESEQUENCE_DEFINITION__THROTTLE:
                return getThrottle();
            case SpringPackage.RESEQUENCE_DEFINITION__THROW_EXCEPTION:
                return getThrowException();
            case SpringPackage.RESEQUENCE_DEFINITION__TO:
                return getTo();
            case SpringPackage.RESEQUENCE_DEFINITION__TRANSACTED:
                return getTransacted();
            case SpringPackage.RESEQUENCE_DEFINITION__TRANSFORM:
                return getTransform();
            case SpringPackage.RESEQUENCE_DEFINITION__DO_TRY:
                return getDoTry();
            case SpringPackage.RESEQUENCE_DEFINITION__UNMARSHAL:
                return getUnmarshal();
            case SpringPackage.RESEQUENCE_DEFINITION__VALIDATE:
                return getValidate();
            case SpringPackage.RESEQUENCE_DEFINITION__WIRE_TAP:
                return getWireTap();
            case SpringPackage.RESEQUENCE_DEFINITION__ANY_ATTRIBUTE1:
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
            case SpringPackage.RESEQUENCE_DEFINITION__BATCH_CONFIG:
                setBatchConfig((BatchResequencerConfig)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__STREAM_CONFIG:
                setStreamConfig((StreamResequencerConfig)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__EXPRESSION_DEFINITION:
                setExpressionDefinition((Expression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__CONSTANT:
                setConstant((ConstantExpression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__EL:
                setEl((ElExpression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__GROOVY:
                setGroovy((GroovyExpression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__HEADER:
                setHeader((HeaderExpression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__JXPATH:
                setJxpath((JxPathExpression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__JAVA_SCRIPT:
                setJavaScript((JavaScriptExpression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__LANGUAGE:
                setLanguage((LanguageExpression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__METHOD:
                setMethod((MethodCallExpression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__MVEL:
                setMvel((MvelExpression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__OGNL:
                setOgnl((OgnlExpression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__PHP:
                setPhp((PhpExpression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__PROPERTY:
                setProperty((EObject)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__PYTHON:
                setPython((PythonExpression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__REF:
                setRef((RefExpression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__RUBY:
                setRuby((RubyExpression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SIMPLE:
                setSimple((SimpleExpression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SPEL:
                setSpel((SpELExpression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SQL:
                setSql((SqlExpression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__TOKENIZE:
                setTokenize((TokenizerExpression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__XPATH:
                setXpath((XPathExpression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__XQUERY:
                setXquery((XQueryExpression)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__AOP:
                getAop().clear();
                getAop().addAll((Collection<? extends AopDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__AGGREGATE:
                getAggregate().clear();
                getAggregate().addAll((Collection<? extends AggregateDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__BEAN:
                getBean().clear();
                getBean().addAll((Collection<? extends BeanDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__DO_CATCH:
                getDoCatch().clear();
                getDoCatch().addAll((Collection<? extends CatchDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__WHEN:
                getWhen().clear();
                getWhen().addAll((Collection<? extends WhenDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__CHOICE:
                getChoice().clear();
                getChoice().addAll((Collection<? extends ChoiceDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__OTHERWISE:
                getOtherwise().clear();
                getOtherwise().addAll((Collection<? extends OtherwiseDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__CONVERT_BODY_TO:
                getConvertBodyTo().clear();
                getConvertBodyTo().addAll((Collection<? extends ConvertBodyDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__DELAY:
                getDelay().clear();
                getDelay().addAll((Collection<? extends DelayDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__DYNAMIC_ROUTER:
                getDynamicRouter().clear();
                getDynamicRouter().addAll((Collection<? extends DynamicRouterDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__ENRICH:
                getEnrich().clear();
                getEnrich().addAll((Collection<? extends EnrichDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__FILTER:
                getFilter().clear();
                getFilter().addAll((Collection<? extends FilterDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__DO_FINALLY:
                getDoFinally().clear();
                getDoFinally().addAll((Collection<? extends FinallyDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__IDEMPOTENT_CONSUMER:
                getIdempotentConsumer().clear();
                getIdempotentConsumer().addAll((Collection<? extends IdempotentConsumerDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__IN_ONLY:
                getInOnly().clear();
                getInOnly().addAll((Collection<? extends InOnlyDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__IN_OUT:
                getInOut().clear();
                getInOut().addAll((Collection<? extends InOutDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__INTERCEPT:
                getIntercept().clear();
                getIntercept().addAll((Collection<? extends InterceptDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__INTERCEPT_FROM:
                getInterceptFrom().clear();
                getInterceptFrom().addAll((Collection<? extends InterceptFromDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__INTERCEPT_TO_ENDPOINT:
                getInterceptToEndpoint().clear();
                getInterceptToEndpoint().addAll((Collection<? extends InterceptSendToEndpointDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__LOAD_BALANCE:
                getLoadBalance().clear();
                getLoadBalance().addAll((Collection<? extends LoadBalanceDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__LOG:
                getLog().clear();
                getLog().addAll((Collection<? extends LogDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__LOOP:
                getLoop().clear();
                getLoop().addAll((Collection<? extends LoopDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__MARSHAL:
                getMarshal().clear();
                getMarshal().addAll((Collection<? extends MarshalDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__MULTICAST:
                getMulticast().clear();
                getMulticast().addAll((Collection<? extends MulticastDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__ON_COMPLETION:
                getOnCompletion().clear();
                getOnCompletion().addAll((Collection<? extends OnCompletionDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__ON_EXCEPTION:
                getOnException().clear();
                getOnException().addAll((Collection<? extends OnExceptionDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__PIPELINE:
                getPipeline().clear();
                getPipeline().addAll((Collection<? extends PipelineDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__POLICY:
                getPolicy().clear();
                getPolicy().addAll((Collection<? extends PolicyDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__POLL_ENRICH:
                getPollEnrich().clear();
                getPollEnrich().addAll((Collection<? extends PollEnrichDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__PROCESS:
                getProcess().clear();
                getProcess().addAll((Collection<? extends ProcessDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__RECIPIENT_LIST:
                getRecipientList().clear();
                getRecipientList().addAll((Collection<? extends RecipientListDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__REMOVE_HEADER:
                getRemoveHeader().clear();
                getRemoveHeader().addAll((Collection<? extends RemoveHeaderDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__REMOVE_HEADERS:
                getRemoveHeaders().clear();
                getRemoveHeaders().addAll((Collection<? extends RemoveHeadersDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__REMOVE_PROPERTY:
                getRemoveProperty().clear();
                getRemoveProperty().addAll((Collection<? extends RemovePropertyDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__RESEQUENCE:
                getResequence().clear();
                getResequence().addAll((Collection<? extends ResequenceDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__ROLLBACK:
                getRollback().clear();
                getRollback().addAll((Collection<? extends RollbackDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__ROUTE:
                getRoute().clear();
                getRoute().addAll((Collection<? extends RouteDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__ROUTING_SLIP:
                getRoutingSlip().clear();
                getRoutingSlip().addAll((Collection<? extends RoutingSlipDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SAMPLE:
                getSample().clear();
                getSample().addAll((Collection<? extends SamplingDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SET_BODY:
                getSetBody().clear();
                getSetBody().addAll((Collection<? extends SetBodyDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SET_EXCHANGE_PATTERN:
                getSetExchangePattern().clear();
                getSetExchangePattern().addAll((Collection<? extends SetExchangePatternDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SET_FAULT_BODY:
                getSetFaultBody().clear();
                getSetFaultBody().addAll((Collection<? extends SetFaultBodyDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SET_HEADER:
                getSetHeader().clear();
                getSetHeader().addAll((Collection<? extends SetHeaderDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SET_OUT_HEADER:
                getSetOutHeader().clear();
                getSetOutHeader().addAll((Collection<? extends SetOutHeaderDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SET_PROPERTY:
                getSetProperty().clear();
                getSetProperty().addAll((Collection<? extends SetPropertyDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SORT:
                getSort().clear();
                getSort().addAll((Collection<? extends SortDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SPLIT:
                getSplit().clear();
                getSplit().addAll((Collection<? extends SplitDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__STOP:
                getStop().clear();
                getStop().addAll((Collection<? extends StopDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__THREADS:
                getThreads().clear();
                getThreads().addAll((Collection<? extends ThreadsDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__THROTTLE:
                getThrottle().clear();
                getThrottle().addAll((Collection<? extends ThrottleDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__THROW_EXCEPTION:
                getThrowException().clear();
                getThrowException().addAll((Collection<? extends ThrowExceptionDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__TO:
                getTo().clear();
                getTo().addAll((Collection<? extends ToDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__TRANSACTED:
                getTransacted().clear();
                getTransacted().addAll((Collection<? extends TransactedDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__TRANSFORM:
                getTransform().clear();
                getTransform().addAll((Collection<? extends TransformDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__DO_TRY:
                getDoTry().clear();
                getDoTry().addAll((Collection<? extends TryDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__UNMARSHAL:
                getUnmarshal().clear();
                getUnmarshal().addAll((Collection<? extends UnmarshalDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__VALIDATE:
                getValidate().clear();
                getValidate().addAll((Collection<? extends ValidateDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__WIRE_TAP:
                getWireTap().clear();
                getWireTap().addAll((Collection<? extends WireTapDefinition>)newValue);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__ANY_ATTRIBUTE1:
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
            case SpringPackage.RESEQUENCE_DEFINITION__BATCH_CONFIG:
                setBatchConfig((BatchResequencerConfig)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__STREAM_CONFIG:
                setStreamConfig((StreamResequencerConfig)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__EXPRESSION_DEFINITION:
                setExpressionDefinition((Expression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__CONSTANT:
                setConstant((ConstantExpression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__EL:
                setEl((ElExpression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__GROOVY:
                setGroovy((GroovyExpression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__HEADER:
                setHeader((HeaderExpression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__JXPATH:
                setJxpath((JxPathExpression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__JAVA_SCRIPT:
                setJavaScript((JavaScriptExpression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__LANGUAGE:
                setLanguage((LanguageExpression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__METHOD:
                setMethod((MethodCallExpression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__MVEL:
                setMvel((MvelExpression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__OGNL:
                setOgnl((OgnlExpression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__PHP:
                setPhp((PhpExpression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__PROPERTY:
                unsetProperty();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__PYTHON:
                setPython((PythonExpression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__REF:
                setRef((RefExpression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__RUBY:
                setRuby((RubyExpression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SIMPLE:
                setSimple((SimpleExpression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SPEL:
                setSpel((SpELExpression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SQL:
                setSql((SqlExpression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__TOKENIZE:
                setTokenize((TokenizerExpression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__XPATH:
                setXpath((XPathExpression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__XQUERY:
                setXquery((XQueryExpression)null);
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__GROUP:
                getGroup().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__AOP:
                getAop().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__AGGREGATE:
                getAggregate().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__BEAN:
                getBean().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__DO_CATCH:
                getDoCatch().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__WHEN:
                getWhen().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__CHOICE:
                getChoice().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__OTHERWISE:
                getOtherwise().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__CONVERT_BODY_TO:
                getConvertBodyTo().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__DELAY:
                getDelay().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__DYNAMIC_ROUTER:
                getDynamicRouter().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__ENRICH:
                getEnrich().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__FILTER:
                getFilter().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__DO_FINALLY:
                getDoFinally().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__IDEMPOTENT_CONSUMER:
                getIdempotentConsumer().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__IN_ONLY:
                getInOnly().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__IN_OUT:
                getInOut().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__INTERCEPT:
                getIntercept().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__INTERCEPT_FROM:
                getInterceptFrom().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__INTERCEPT_TO_ENDPOINT:
                getInterceptToEndpoint().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__LOAD_BALANCE:
                getLoadBalance().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__LOG:
                getLog().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__LOOP:
                getLoop().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__MARSHAL:
                getMarshal().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__MULTICAST:
                getMulticast().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__ON_COMPLETION:
                getOnCompletion().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__ON_EXCEPTION:
                getOnException().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__PIPELINE:
                getPipeline().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__POLICY:
                getPolicy().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__POLL_ENRICH:
                getPollEnrich().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__PROCESS:
                getProcess().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__RECIPIENT_LIST:
                getRecipientList().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__REMOVE_HEADER:
                getRemoveHeader().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__REMOVE_HEADERS:
                getRemoveHeaders().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__REMOVE_PROPERTY:
                getRemoveProperty().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__RESEQUENCE:
                getResequence().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__ROLLBACK:
                getRollback().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__ROUTE:
                getRoute().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__ROUTING_SLIP:
                getRoutingSlip().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SAMPLE:
                getSample().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SET_BODY:
                getSetBody().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SET_EXCHANGE_PATTERN:
                getSetExchangePattern().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SET_FAULT_BODY:
                getSetFaultBody().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SET_HEADER:
                getSetHeader().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SET_OUT_HEADER:
                getSetOutHeader().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SET_PROPERTY:
                getSetProperty().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SORT:
                getSort().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__SPLIT:
                getSplit().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__STOP:
                getStop().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__THREADS:
                getThreads().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__THROTTLE:
                getThrottle().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__THROW_EXCEPTION:
                getThrowException().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__TO:
                getTo().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__TRANSACTED:
                getTransacted().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__TRANSFORM:
                getTransform().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__DO_TRY:
                getDoTry().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__UNMARSHAL:
                getUnmarshal().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__VALIDATE:
                getValidate().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__WIRE_TAP:
                getWireTap().clear();
                return;
            case SpringPackage.RESEQUENCE_DEFINITION__ANY_ATTRIBUTE1:
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
            case SpringPackage.RESEQUENCE_DEFINITION__BATCH_CONFIG:
                return batchConfig != null;
            case SpringPackage.RESEQUENCE_DEFINITION__STREAM_CONFIG:
                return streamConfig != null;
            case SpringPackage.RESEQUENCE_DEFINITION__EXPRESSION_DEFINITION:
                return expressionDefinition != null;
            case SpringPackage.RESEQUENCE_DEFINITION__CONSTANT:
                return constant != null;
            case SpringPackage.RESEQUENCE_DEFINITION__EL:
                return el != null;
            case SpringPackage.RESEQUENCE_DEFINITION__GROOVY:
                return groovy != null;
            case SpringPackage.RESEQUENCE_DEFINITION__HEADER:
                return header != null;
            case SpringPackage.RESEQUENCE_DEFINITION__JXPATH:
                return jxpath != null;
            case SpringPackage.RESEQUENCE_DEFINITION__JAVA_SCRIPT:
                return javaScript != null;
            case SpringPackage.RESEQUENCE_DEFINITION__LANGUAGE:
                return language != null;
            case SpringPackage.RESEQUENCE_DEFINITION__METHOD:
                return method != null;
            case SpringPackage.RESEQUENCE_DEFINITION__MVEL:
                return mvel != null;
            case SpringPackage.RESEQUENCE_DEFINITION__OGNL:
                return ognl != null;
            case SpringPackage.RESEQUENCE_DEFINITION__PHP:
                return php != null;
            case SpringPackage.RESEQUENCE_DEFINITION__PROPERTY:
                return isSetProperty();
            case SpringPackage.RESEQUENCE_DEFINITION__PYTHON:
                return python != null;
            case SpringPackage.RESEQUENCE_DEFINITION__REF:
                return ref != null;
            case SpringPackage.RESEQUENCE_DEFINITION__RUBY:
                return ruby != null;
            case SpringPackage.RESEQUENCE_DEFINITION__SIMPLE:
                return simple != null;
            case SpringPackage.RESEQUENCE_DEFINITION__SPEL:
                return spel != null;
            case SpringPackage.RESEQUENCE_DEFINITION__SQL:
                return sql != null;
            case SpringPackage.RESEQUENCE_DEFINITION__TOKENIZE:
                return tokenize != null;
            case SpringPackage.RESEQUENCE_DEFINITION__XPATH:
                return xpath != null;
            case SpringPackage.RESEQUENCE_DEFINITION__XQUERY:
                return xquery != null;
            case SpringPackage.RESEQUENCE_DEFINITION__GROUP:
                return group != null && !group.isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__AOP:
                return !getAop().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__AGGREGATE:
                return !getAggregate().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__BEAN:
                return !getBean().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__DO_CATCH:
                return !getDoCatch().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__WHEN:
                return !getWhen().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__CHOICE:
                return !getChoice().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__OTHERWISE:
                return !getOtherwise().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__CONVERT_BODY_TO:
                return !getConvertBodyTo().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__DELAY:
                return !getDelay().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__DYNAMIC_ROUTER:
                return !getDynamicRouter().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__ENRICH:
                return !getEnrich().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__FILTER:
                return !getFilter().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__DO_FINALLY:
                return !getDoFinally().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__IDEMPOTENT_CONSUMER:
                return !getIdempotentConsumer().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__IN_ONLY:
                return !getInOnly().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__IN_OUT:
                return !getInOut().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__INTERCEPT:
                return !getIntercept().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__INTERCEPT_FROM:
                return !getInterceptFrom().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__INTERCEPT_TO_ENDPOINT:
                return !getInterceptToEndpoint().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__LOAD_BALANCE:
                return !getLoadBalance().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__LOG:
                return !getLog().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__LOOP:
                return !getLoop().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__MARSHAL:
                return !getMarshal().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__MULTICAST:
                return !getMulticast().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__ON_COMPLETION:
                return !getOnCompletion().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__ON_EXCEPTION:
                return !getOnException().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__PIPELINE:
                return !getPipeline().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__POLICY:
                return !getPolicy().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__POLL_ENRICH:
                return !getPollEnrich().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__PROCESS:
                return !getProcess().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__RECIPIENT_LIST:
                return !getRecipientList().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__REMOVE_HEADER:
                return !getRemoveHeader().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__REMOVE_HEADERS:
                return !getRemoveHeaders().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__REMOVE_PROPERTY:
                return !getRemoveProperty().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__RESEQUENCE:
                return !getResequence().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__ROLLBACK:
                return !getRollback().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__ROUTE:
                return !getRoute().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__ROUTING_SLIP:
                return !getRoutingSlip().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__SAMPLE:
                return !getSample().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__SET_BODY:
                return !getSetBody().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__SET_EXCHANGE_PATTERN:
                return !getSetExchangePattern().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__SET_FAULT_BODY:
                return !getSetFaultBody().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__SET_HEADER:
                return !getSetHeader().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__SET_OUT_HEADER:
                return !getSetOutHeader().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__SET_PROPERTY:
                return !getSetProperty().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__SORT:
                return !getSort().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__SPLIT:
                return !getSplit().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__STOP:
                return !getStop().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__THREADS:
                return !getThreads().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__THROTTLE:
                return !getThrottle().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__THROW_EXCEPTION:
                return !getThrowException().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__TO:
                return !getTo().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__TRANSACTED:
                return !getTransacted().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__TRANSFORM:
                return !getTransform().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__DO_TRY:
                return !getDoTry().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__UNMARSHAL:
                return !getUnmarshal().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__VALIDATE:
                return !getValidate().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__WIRE_TAP:
                return !getWireTap().isEmpty();
            case SpringPackage.RESEQUENCE_DEFINITION__ANY_ATTRIBUTE1:
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
        result.append(", anyAttribute1: ");
        result.append(anyAttribute1);
        result.append(')');
        return result.toString();
    }

} //ResequenceDefinitionImpl
