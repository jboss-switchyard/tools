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
 * A representation of the model object '<em><b>Route Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getFrom <em>From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getAop <em>Aop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getBean <em>Bean</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getWhen <em>When</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getInOnly <em>In Only</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getInOut <em>In Out</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getInterceptToEndpoint <em>Intercept To Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getLog <em>Log</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getProcess <em>Process</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getRoute <em>Route</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getSample <em>Sample</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getSetFaultBody <em>Set Fault Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getSetOutHeader <em>Set Out Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getSort <em>Sort</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getSplit <em>Split</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getStop <em>Stop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getTo <em>To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getAutoStartup <em>Auto Startup</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getDelayer <em>Delayer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getErrorHandlerRef <em>Error Handler Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getHandleFault <em>Handle Fault</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getRoutePolicyRef <em>Route Policy Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getShutdownRoute <em>Shutdown Route</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getShutdownRunningTask <em>Shutdown Running Task</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getStartupOrder <em>Startup Order</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getStreamCache <em>Stream Cache</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getTrace <em>Trace</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition()
 * @model extendedMetaData="name='routeDefinition' kind='elementOnly'"
 * @generated
 */
public interface RouteDefinition extends ProcessorDefinition {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.FromDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_From()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='from' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FromDefinition> getFrom();

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:5'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Aop</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.AopDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aop</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Aop()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aop' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<AopDefinition> getAop();

	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Aggregate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aggregate' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<AggregateDefinition> getAggregate();

	/**
	 * Returns the value of the '<em><b>Bean</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.BeanDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bean</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Bean()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bean' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<BeanDefinition> getBean();

	/**
	 * Returns the value of the '<em><b>Do Catch</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.CatchDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Catch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Catch</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_DoCatch()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doCatch' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<CatchDefinition> getDoCatch();

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.WhenDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_When()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<WhenDefinition> getWhen();

	/**
	 * Returns the value of the '<em><b>Choice</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ChoiceDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Choice()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='choice' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<ChoiceDefinition> getChoice();

	/**
	 * Returns the value of the '<em><b>Otherwise</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.OtherwiseDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Otherwise</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otherwise</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Otherwise()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='otherwise' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<OtherwiseDefinition> getOtherwise();

	/**
	 * Returns the value of the '<em><b>Convert Body To</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ConvertBodyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Convert Body To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Convert Body To</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_ConvertBodyTo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='convertBodyTo' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<ConvertBodyDefinition> getConvertBodyTo();

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.DelayDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Delay()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='delay' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<DelayDefinition> getDelay();

	/**
	 * Returns the value of the '<em><b>Dynamic Router</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.DynamicRouterDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Router</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Router</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_DynamicRouter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dynamicRouter' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<DynamicRouterDefinition> getDynamicRouter();

	/**
	 * Returns the value of the '<em><b>Enrich</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.EnrichDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enrich</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrich</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Enrich()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='enrich' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<EnrichDefinition> getEnrich();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.FilterDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Filter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<FilterDefinition> getFilter();

	/**
	 * Returns the value of the '<em><b>Do Finally</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.FinallyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Finally</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Finally</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_DoFinally()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doFinally' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<FinallyDefinition> getDoFinally();

	/**
	 * Returns the value of the '<em><b>Idempotent Consumer</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.IdempotentConsumerDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idempotent Consumer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idempotent Consumer</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_IdempotentConsumer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='idempotentConsumer' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<IdempotentConsumerDefinition> getIdempotentConsumer();

	/**
	 * Returns the value of the '<em><b>In Only</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.InOnlyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Only</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Only</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_InOnly()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inOnly' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<InOnlyDefinition> getInOnly();

	/**
	 * Returns the value of the '<em><b>In Out</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.InOutDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Out</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Out</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_InOut()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inOut' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<InOutDefinition> getInOut();

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Intercept()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='intercept' namespace='##targetNamespace' group='#group:5'"
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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_InterceptFrom()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interceptFrom' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<InterceptFromDefinition> getInterceptFrom();

	/**
	 * Returns the value of the '<em><b>Intercept To Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.InterceptSendToEndpointDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intercept To Endpoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intercept To Endpoint</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_InterceptToEndpoint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interceptToEndpoint' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<InterceptSendToEndpointDefinition> getInterceptToEndpoint();

	/**
	 * Returns the value of the '<em><b>Load Balance</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.LoadBalanceDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Balance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Balance</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_LoadBalance()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loadBalance' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<LoadBalanceDefinition> getLoadBalance();

	/**
	 * Returns the value of the '<em><b>Log</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.LogDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Log()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='log' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<LogDefinition> getLog();

	/**
	 * Returns the value of the '<em><b>Loop</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.LoopDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Loop()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loop' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<LoopDefinition> getLoop();

	/**
	 * Returns the value of the '<em><b>Marshal</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marshal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marshal</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Marshal()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='marshal' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<MarshalDefinition> getMarshal();

	/**
	 * Returns the value of the '<em><b>Multicast</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multicast</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multicast</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Multicast()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multicast' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<MulticastDefinition> getMulticast();

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_OnCompletion()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='onCompletion' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<OnCompletionDefinition> getOnCompletion();

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_OnException()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='onException' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<OnExceptionDefinition> getOnException();

	/**
	 * Returns the value of the '<em><b>Pipeline</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.PipelineDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pipeline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pipeline</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Pipeline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pipeline' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<PipelineDefinition> getPipeline();

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.PolicyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Policy()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='policy' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<PolicyDefinition> getPolicy();

	/**
	 * Returns the value of the '<em><b>Poll Enrich</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.PollEnrichDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poll Enrich</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poll Enrich</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_PollEnrich()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pollEnrich' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<PollEnrichDefinition> getPollEnrich();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ProcessDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Process()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='process' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<ProcessDefinition> getProcess();

	/**
	 * Returns the value of the '<em><b>Recipient List</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.RecipientListDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient List</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_RecipientList()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='recipientList' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<RecipientListDefinition> getRecipientList();

	/**
	 * Returns the value of the '<em><b>Remove Header</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.RemoveHeaderDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Header</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_RemoveHeader()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeHeader' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<RemoveHeaderDefinition> getRemoveHeader();

	/**
	 * Returns the value of the '<em><b>Remove Headers</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.RemoveHeadersDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Headers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Headers</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_RemoveHeaders()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeHeaders' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<RemoveHeadersDefinition> getRemoveHeaders();

	/**
	 * Returns the value of the '<em><b>Remove Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.RemovePropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Property</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_RemoveProperty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeProperty' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<RemovePropertyDefinition> getRemoveProperty();

	/**
	 * Returns the value of the '<em><b>Resequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resequence</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Resequence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resequence' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<ResequenceDefinition> getResequence();

	/**
	 * Returns the value of the '<em><b>Rollback</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.RollbackDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rollback</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rollback</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Rollback()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rollback' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<RollbackDefinition> getRollback();

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Route()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<RouteDefinition> getRoute();

	/**
	 * Returns the value of the '<em><b>Routing Slip</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.RoutingSlipDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Slip</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Slip</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_RoutingSlip()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='routingSlip' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<RoutingSlipDefinition> getRoutingSlip();

	/**
	 * Returns the value of the '<em><b>Sample</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SamplingDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Sample()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sample' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<SamplingDefinition> getSample();

	/**
	 * Returns the value of the '<em><b>Set Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SetBodyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Body</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_SetBody()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setBody' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<SetBodyDefinition> getSetBody();

	/**
	 * Returns the value of the '<em><b>Set Exchange Pattern</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SetExchangePatternDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Exchange Pattern</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Exchange Pattern</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_SetExchangePattern()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setExchangePattern' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<SetExchangePatternDefinition> getSetExchangePattern();

	/**
	 * Returns the value of the '<em><b>Set Fault Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SetFaultBodyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Fault Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Fault Body</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_SetFaultBody()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setFaultBody' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<SetFaultBodyDefinition> getSetFaultBody();

	/**
	 * Returns the value of the '<em><b>Set Header</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SetHeaderDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Header</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_SetHeader()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setHeader' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<SetHeaderDefinition> getSetHeader();

	/**
	 * Returns the value of the '<em><b>Set Out Header</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SetOutHeaderDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Out Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Out Header</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_SetOutHeader()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setOutHeader' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<SetOutHeaderDefinition> getSetOutHeader();

	/**
	 * Returns the value of the '<em><b>Set Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SetPropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Property</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_SetProperty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setProperty' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<SetPropertyDefinition> getSetProperty();

	/**
	 * Returns the value of the '<em><b>Sort</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SortDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Sort()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sort' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<SortDefinition> getSort();

	/**
	 * Returns the value of the '<em><b>Split</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SplitDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Split()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='split' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<SplitDefinition> getSplit();

	/**
	 * Returns the value of the '<em><b>Stop</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.StopDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Stop()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stop' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<StopDefinition> getStop();

	/**
	 * Returns the value of the '<em><b>Threads</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threads</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Threads()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='threads' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<ThreadsDefinition> getThreads();

	/**
	 * Returns the value of the '<em><b>Throttle</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throttle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throttle</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Throttle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='throttle' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<ThrottleDefinition> getThrottle();

	/**
	 * Returns the value of the '<em><b>Throw Exception</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ThrowExceptionDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throw Exception</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throw Exception</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_ThrowException()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='throwException' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<ThrowExceptionDefinition> getThrowException();

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ToDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_To()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='to' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<ToDefinition> getTo();

	/**
	 * Returns the value of the '<em><b>Transacted</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.TransactedDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transacted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transacted</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Transacted()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transacted' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<TransactedDefinition> getTransacted();

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.TransformDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Transform()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transform' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<TransformDefinition> getTransform();

	/**
	 * Returns the value of the '<em><b>Do Try</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.TryDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Try</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Try</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_DoTry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doTry' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<TryDefinition> getDoTry();

	/**
	 * Returns the value of the '<em><b>Unmarshal</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.UnmarshalDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unmarshal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unmarshal</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Unmarshal()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unmarshal' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<UnmarshalDefinition> getUnmarshal();

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ValidateDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Validate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='validate' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<ValidateDefinition> getValidate();

	/**
	 * Returns the value of the '<em><b>Wire Tap</b></em>' containment reference list.
	 * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire Tap</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire Tap</em>' containment reference list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_WireTap()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='wireTap' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<WireTapDefinition> getWireTap();

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_AutoStartup()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='autoStartup'"
	 * @generated
	 */
	String getAutoStartup();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getAutoStartup <em>Auto Startup</em>}' attribute.
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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Delayer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='delayer'"
	 * @generated
	 */
	String getDelayer();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getDelayer <em>Delayer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delayer</em>' attribute.
	 * @see #getDelayer()
	 * @generated
	 */
	void setDelayer(String value);

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_ErrorHandlerRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='errorHandlerRef'"
	 * @generated
	 */
	String getErrorHandlerRef();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getErrorHandlerRef <em>Error Handler Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Handler Ref</em>' attribute.
	 * @see #getErrorHandlerRef()
	 * @generated
	 */
	void setErrorHandlerRef(String value);

	/**
	 * Returns the value of the '<em><b>Group1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group1</em>' attribute.
	 * @see #setGroup1(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Group1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='group'"
	 * @generated
	 */
	String getGroup1();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getGroup1 <em>Group1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group1</em>' attribute.
	 * @see #getGroup1()
	 * @generated
	 */
	void setGroup1(String value);

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_HandleFault()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='handleFault'"
	 * @generated
	 */
	String getHandleFault();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getHandleFault <em>Handle Fault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Fault</em>' attribute.
	 * @see #getHandleFault()
	 * @generated
	 */
	void setHandleFault(String value);

	/**
	 * Returns the value of the '<em><b>Route Policy Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Policy Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Policy Ref</em>' attribute.
	 * @see #setRoutePolicyRef(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_RoutePolicyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='routePolicyRef'"
	 * @generated
	 */
	String getRoutePolicyRef();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getRoutePolicyRef <em>Route Policy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Policy Ref</em>' attribute.
	 * @see #getRoutePolicyRef()
	 * @generated
	 */
	void setRoutePolicyRef(String value);

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_ShutdownRoute()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='shutdownRoute'"
	 * @generated
	 */
	ShutdownRoute getShutdownRoute();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getShutdownRoute <em>Shutdown Route</em>}' attribute.
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
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getShutdownRoute <em>Shutdown Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShutdownRoute()
	 * @see #getShutdownRoute()
	 * @see #setShutdownRoute(ShutdownRoute)
	 * @generated
	 */
	void unsetShutdownRoute();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getShutdownRoute <em>Shutdown Route</em>}' attribute is set.
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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_ShutdownRunningTask()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='shutdownRunningTask'"
	 * @generated
	 */
	ShutdownRunningTask getShutdownRunningTask();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getShutdownRunningTask <em>Shutdown Running Task</em>}' attribute.
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
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getShutdownRunningTask <em>Shutdown Running Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShutdownRunningTask()
	 * @see #getShutdownRunningTask()
	 * @see #setShutdownRunningTask(ShutdownRunningTask)
	 * @generated
	 */
	void unsetShutdownRunningTask();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getShutdownRunningTask <em>Shutdown Running Task</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Startup Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Order</em>' attribute.
	 * @see #isSetStartupOrder()
	 * @see #unsetStartupOrder()
	 * @see #setStartupOrder(int)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_StartupOrder()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='startupOrder'"
	 * @generated
	 */
	int getStartupOrder();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getStartupOrder <em>Startup Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Order</em>' attribute.
	 * @see #isSetStartupOrder()
	 * @see #unsetStartupOrder()
	 * @see #getStartupOrder()
	 * @generated
	 */
	void setStartupOrder(int value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getStartupOrder <em>Startup Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartupOrder()
	 * @see #getStartupOrder()
	 * @see #setStartupOrder(int)
	 * @generated
	 */
	void unsetStartupOrder();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getStartupOrder <em>Startup Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Startup Order</em>' attribute is set.
	 * @see #unsetStartupOrder()
	 * @see #getStartupOrder()
	 * @see #setStartupOrder(int)
	 * @generated
	 */
	boolean isSetStartupOrder();

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_StreamCache()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='streamCache'"
	 * @generated
	 */
	String getStreamCache();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getStreamCache <em>Stream Cache</em>}' attribute.
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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_Trace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='trace'"
	 * @generated
	 */
	String getTrace();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition#getTrace <em>Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' attribute.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute1</em>' attribute list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getRouteDefinition_AnyAttribute1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':75' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute1();

} // RouteDefinition
