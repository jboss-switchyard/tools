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
 * A representation of the model object '<em><b>Aggregate Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCorrelationExpression <em>Correlation Expression</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCompletionPredicate <em>Completion Predicate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCompletionTimeout <em>Completion Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCompletionSize <em>Completion Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getAop <em>Aop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getBean <em>Bean</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getWhen <em>When</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getInOnly <em>In Only</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getInOut <em>In Out</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getInterceptToEndpoint <em>Intercept To Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getLog <em>Log</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getProcess <em>Process</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getRoute <em>Route</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getSample <em>Sample</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getSetFaultBody <em>Set Fault Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getSetOutHeader <em>Set Out Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getSort <em>Sort</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getSplit <em>Split</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getStop <em>Stop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getTo <em>To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getAggregationRepositoryRef <em>Aggregation Repository Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCloseCorrelationKeyOnCompletion <em>Close Correlation Key On Completion</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isCompletionFromBatchConsumer <em>Completion From Batch Consumer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCompletionInterval <em>Completion Interval</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCompletionSize1 <em>Completion Size1</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCompletionTimeout1 <em>Completion Timeout1</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isDiscardOnCompletionTimeout <em>Discard On Completion Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isEagerCheckCompletion <em>Eager Check Completion</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getExecutorServiceRef <em>Executor Service Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isGroupExchanges <em>Group Exchanges</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isIgnoreInvalidCorrelationKeys <em>Ignore Invalid Correlation Keys</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isParallelProcessing <em>Parallel Processing</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getStrategyRef <em>Strategy Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition()
 * @model extendedMetaData="name='aggregateDefinition' kind='elementOnly'"
 * @generated
 */
public interface AggregateDefinition extends ProcessorDefinition {
	/**
     * Returns the value of the '<em><b>Correlation Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Correlation Expression</em>' containment reference.
     * @see #setCorrelationExpression(ExpressionSubElementDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_CorrelationExpression()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='correlationExpression' namespace='##targetNamespace'"
     * @generated
     */
	ExpressionSubElementDefinition getCorrelationExpression();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCorrelationExpression <em>Correlation Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Correlation Expression</em>' containment reference.
     * @see #getCorrelationExpression()
     * @generated
     */
	void setCorrelationExpression(ExpressionSubElementDefinition value);

	/**
     * Returns the value of the '<em><b>Completion Predicate</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion Predicate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Completion Predicate</em>' containment reference.
     * @see #setCompletionPredicate(ExpressionSubElementDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_CompletionPredicate()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='completionPredicate' namespace='##targetNamespace'"
     * @generated
     */
	ExpressionSubElementDefinition getCompletionPredicate();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCompletionPredicate <em>Completion Predicate</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Completion Predicate</em>' containment reference.
     * @see #getCompletionPredicate()
     * @generated
     */
	void setCompletionPredicate(ExpressionSubElementDefinition value);

	/**
     * Returns the value of the '<em><b>Completion Timeout</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion Timeout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Completion Timeout</em>' containment reference.
     * @see #setCompletionTimeout(ExpressionSubElementDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_CompletionTimeout()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='completionTimeout' namespace='##targetNamespace'"
     * @generated
     */
	ExpressionSubElementDefinition getCompletionTimeout();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCompletionTimeout <em>Completion Timeout</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Completion Timeout</em>' containment reference.
     * @see #getCompletionTimeout()
     * @generated
     */
	void setCompletionTimeout(ExpressionSubElementDefinition value);

	/**
     * Returns the value of the '<em><b>Completion Size</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Completion Size</em>' containment reference.
     * @see #setCompletionSize(ExpressionSubElementDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_CompletionSize()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='completionSize' namespace='##targetNamespace'"
     * @generated
     */
	ExpressionSubElementDefinition getCompletionSize();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCompletionSize <em>Completion Size</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Completion Size</em>' containment reference.
     * @see #getCompletionSize()
     * @generated
     */
	void setCompletionSize(ExpressionSubElementDefinition value);

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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Aop()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='aop' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Aggregate()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='aggregate' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Bean()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='bean' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_DoCatch()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='doCatch' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_When()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Choice()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='choice' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Otherwise()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='otherwise' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_ConvertBodyTo()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='convertBodyTo' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Delay()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='delay' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_DynamicRouter()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dynamicRouter' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Enrich()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='enrich' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Filter()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_DoFinally()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='doFinally' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_IdempotentConsumer()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='idempotentConsumer' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_InOnly()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='inOnly' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_InOut()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='inOut' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Intercept()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='intercept' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_InterceptFrom()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='interceptFrom' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_InterceptToEndpoint()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='interceptToEndpoint' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_LoadBalance()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='loadBalance' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Log()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='log' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Loop()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='loop' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Marshal()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='marshal' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Multicast()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='multicast' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_OnCompletion()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='onCompletion' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_OnException()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='onException' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Pipeline()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='pipeline' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Policy()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='policy' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_PollEnrich()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='pollEnrich' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Process()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='process' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_RecipientList()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='recipientList' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_RemoveHeader()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='removeHeader' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_RemoveHeaders()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='removeHeaders' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_RemoveProperty()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='removeProperty' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Resequence()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='resequence' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Rollback()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='rollback' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Route()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_RoutingSlip()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='routingSlip' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Sample()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sample' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_SetBody()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='setBody' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_SetExchangePattern()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='setExchangePattern' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_SetFaultBody()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='setFaultBody' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_SetHeader()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='setHeader' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_SetOutHeader()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='setOutHeader' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_SetProperty()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='setProperty' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Sort()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sort' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Split()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='split' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Stop()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='stop' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Threads()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='threads' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Throttle()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='throttle' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_ThrowException()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='throwException' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_To()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='to' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Transacted()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='transacted' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Transform()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='transform' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_DoTry()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='doTry' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Unmarshal()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='unmarshal' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_Validate()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='validate' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_WireTap()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='wireTap' namespace='##targetNamespace' group='#group:8'"
     * @generated
     */
	EList<WireTapDefinition> getWireTap();

	/**
     * Returns the value of the '<em><b>Aggregation Repository Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation Repository Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Aggregation Repository Ref</em>' attribute.
     * @see #setAggregationRepositoryRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_AggregationRepositoryRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='aggregationRepositoryRef'"
     * @generated
     */
	String getAggregationRepositoryRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getAggregationRepositoryRef <em>Aggregation Repository Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aggregation Repository Ref</em>' attribute.
     * @see #getAggregationRepositoryRef()
     * @generated
     */
	void setAggregationRepositoryRef(String value);

	/**
     * Returns the value of the '<em><b>Close Correlation Key On Completion</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Close Correlation Key On Completion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Close Correlation Key On Completion</em>' attribute.
     * @see #isSetCloseCorrelationKeyOnCompletion()
     * @see #unsetCloseCorrelationKeyOnCompletion()
     * @see #setCloseCorrelationKeyOnCompletion(int)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_CloseCorrelationKeyOnCompletion()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='closeCorrelationKeyOnCompletion'"
     * @generated
     */
	int getCloseCorrelationKeyOnCompletion();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCloseCorrelationKeyOnCompletion <em>Close Correlation Key On Completion</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Close Correlation Key On Completion</em>' attribute.
     * @see #isSetCloseCorrelationKeyOnCompletion()
     * @see #unsetCloseCorrelationKeyOnCompletion()
     * @see #getCloseCorrelationKeyOnCompletion()
     * @generated
     */
	void setCloseCorrelationKeyOnCompletion(int value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCloseCorrelationKeyOnCompletion <em>Close Correlation Key On Completion</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetCloseCorrelationKeyOnCompletion()
     * @see #getCloseCorrelationKeyOnCompletion()
     * @see #setCloseCorrelationKeyOnCompletion(int)
     * @generated
     */
	void unsetCloseCorrelationKeyOnCompletion();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCloseCorrelationKeyOnCompletion <em>Close Correlation Key On Completion</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Close Correlation Key On Completion</em>' attribute is set.
     * @see #unsetCloseCorrelationKeyOnCompletion()
     * @see #getCloseCorrelationKeyOnCompletion()
     * @see #setCloseCorrelationKeyOnCompletion(int)
     * @generated
     */
	boolean isSetCloseCorrelationKeyOnCompletion();

	/**
     * Returns the value of the '<em><b>Completion From Batch Consumer</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion From Batch Consumer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Completion From Batch Consumer</em>' attribute.
     * @see #isSetCompletionFromBatchConsumer()
     * @see #unsetCompletionFromBatchConsumer()
     * @see #setCompletionFromBatchConsumer(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_CompletionFromBatchConsumer()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='completionFromBatchConsumer'"
     * @generated
     */
	boolean isCompletionFromBatchConsumer();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isCompletionFromBatchConsumer <em>Completion From Batch Consumer</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Completion From Batch Consumer</em>' attribute.
     * @see #isSetCompletionFromBatchConsumer()
     * @see #unsetCompletionFromBatchConsumer()
     * @see #isCompletionFromBatchConsumer()
     * @generated
     */
	void setCompletionFromBatchConsumer(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isCompletionFromBatchConsumer <em>Completion From Batch Consumer</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetCompletionFromBatchConsumer()
     * @see #isCompletionFromBatchConsumer()
     * @see #setCompletionFromBatchConsumer(boolean)
     * @generated
     */
	void unsetCompletionFromBatchConsumer();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isCompletionFromBatchConsumer <em>Completion From Batch Consumer</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Completion From Batch Consumer</em>' attribute is set.
     * @see #unsetCompletionFromBatchConsumer()
     * @see #isCompletionFromBatchConsumer()
     * @see #setCompletionFromBatchConsumer(boolean)
     * @generated
     */
	boolean isSetCompletionFromBatchConsumer();

	/**
     * Returns the value of the '<em><b>Completion Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Completion Interval</em>' attribute.
     * @see #isSetCompletionInterval()
     * @see #unsetCompletionInterval()
     * @see #setCompletionInterval(long)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_CompletionInterval()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
     *        extendedMetaData="kind='attribute' name='completionInterval'"
     * @generated
     */
	long getCompletionInterval();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCompletionInterval <em>Completion Interval</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Completion Interval</em>' attribute.
     * @see #isSetCompletionInterval()
     * @see #unsetCompletionInterval()
     * @see #getCompletionInterval()
     * @generated
     */
	void setCompletionInterval(long value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCompletionInterval <em>Completion Interval</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetCompletionInterval()
     * @see #getCompletionInterval()
     * @see #setCompletionInterval(long)
     * @generated
     */
	void unsetCompletionInterval();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCompletionInterval <em>Completion Interval</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Completion Interval</em>' attribute is set.
     * @see #unsetCompletionInterval()
     * @see #getCompletionInterval()
     * @see #setCompletionInterval(long)
     * @generated
     */
	boolean isSetCompletionInterval();

	/**
     * Returns the value of the '<em><b>Completion Size1</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion Size1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Completion Size1</em>' attribute.
     * @see #isSetCompletionSize1()
     * @see #unsetCompletionSize1()
     * @see #setCompletionSize1(int)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_CompletionSize1()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='completionSize'"
     * @generated
     */
	int getCompletionSize1();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCompletionSize1 <em>Completion Size1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Completion Size1</em>' attribute.
     * @see #isSetCompletionSize1()
     * @see #unsetCompletionSize1()
     * @see #getCompletionSize1()
     * @generated
     */
	void setCompletionSize1(int value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCompletionSize1 <em>Completion Size1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetCompletionSize1()
     * @see #getCompletionSize1()
     * @see #setCompletionSize1(int)
     * @generated
     */
	void unsetCompletionSize1();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCompletionSize1 <em>Completion Size1</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Completion Size1</em>' attribute is set.
     * @see #unsetCompletionSize1()
     * @see #getCompletionSize1()
     * @see #setCompletionSize1(int)
     * @generated
     */
	boolean isSetCompletionSize1();

	/**
     * Returns the value of the '<em><b>Completion Timeout1</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion Timeout1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Completion Timeout1</em>' attribute.
     * @see #isSetCompletionTimeout1()
     * @see #unsetCompletionTimeout1()
     * @see #setCompletionTimeout1(long)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_CompletionTimeout1()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
     *        extendedMetaData="kind='attribute' name='completionTimeout'"
     * @generated
     */
	long getCompletionTimeout1();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCompletionTimeout1 <em>Completion Timeout1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Completion Timeout1</em>' attribute.
     * @see #isSetCompletionTimeout1()
     * @see #unsetCompletionTimeout1()
     * @see #getCompletionTimeout1()
     * @generated
     */
	void setCompletionTimeout1(long value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCompletionTimeout1 <em>Completion Timeout1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetCompletionTimeout1()
     * @see #getCompletionTimeout1()
     * @see #setCompletionTimeout1(long)
     * @generated
     */
	void unsetCompletionTimeout1();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getCompletionTimeout1 <em>Completion Timeout1</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Completion Timeout1</em>' attribute is set.
     * @see #unsetCompletionTimeout1()
     * @see #getCompletionTimeout1()
     * @see #setCompletionTimeout1(long)
     * @generated
     */
	boolean isSetCompletionTimeout1();

	/**
     * Returns the value of the '<em><b>Discard On Completion Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discard On Completion Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Discard On Completion Timeout</em>' attribute.
     * @see #isSetDiscardOnCompletionTimeout()
     * @see #unsetDiscardOnCompletionTimeout()
     * @see #setDiscardOnCompletionTimeout(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_DiscardOnCompletionTimeout()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='discardOnCompletionTimeout'"
     * @generated
     */
	boolean isDiscardOnCompletionTimeout();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isDiscardOnCompletionTimeout <em>Discard On Completion Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Discard On Completion Timeout</em>' attribute.
     * @see #isSetDiscardOnCompletionTimeout()
     * @see #unsetDiscardOnCompletionTimeout()
     * @see #isDiscardOnCompletionTimeout()
     * @generated
     */
	void setDiscardOnCompletionTimeout(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isDiscardOnCompletionTimeout <em>Discard On Completion Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetDiscardOnCompletionTimeout()
     * @see #isDiscardOnCompletionTimeout()
     * @see #setDiscardOnCompletionTimeout(boolean)
     * @generated
     */
	void unsetDiscardOnCompletionTimeout();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isDiscardOnCompletionTimeout <em>Discard On Completion Timeout</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Discard On Completion Timeout</em>' attribute is set.
     * @see #unsetDiscardOnCompletionTimeout()
     * @see #isDiscardOnCompletionTimeout()
     * @see #setDiscardOnCompletionTimeout(boolean)
     * @generated
     */
	boolean isSetDiscardOnCompletionTimeout();

	/**
     * Returns the value of the '<em><b>Eager Check Completion</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eager Check Completion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Eager Check Completion</em>' attribute.
     * @see #isSetEagerCheckCompletion()
     * @see #unsetEagerCheckCompletion()
     * @see #setEagerCheckCompletion(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_EagerCheckCompletion()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='eagerCheckCompletion'"
     * @generated
     */
	boolean isEagerCheckCompletion();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isEagerCheckCompletion <em>Eager Check Completion</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Eager Check Completion</em>' attribute.
     * @see #isSetEagerCheckCompletion()
     * @see #unsetEagerCheckCompletion()
     * @see #isEagerCheckCompletion()
     * @generated
     */
	void setEagerCheckCompletion(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isEagerCheckCompletion <em>Eager Check Completion</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetEagerCheckCompletion()
     * @see #isEagerCheckCompletion()
     * @see #setEagerCheckCompletion(boolean)
     * @generated
     */
	void unsetEagerCheckCompletion();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isEagerCheckCompletion <em>Eager Check Completion</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eager Check Completion</em>' attribute is set.
     * @see #unsetEagerCheckCompletion()
     * @see #isEagerCheckCompletion()
     * @see #setEagerCheckCompletion(boolean)
     * @generated
     */
	boolean isSetEagerCheckCompletion();

	/**
     * Returns the value of the '<em><b>Executor Service Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor Service Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Executor Service Ref</em>' attribute.
     * @see #setExecutorServiceRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_ExecutorServiceRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='executorServiceRef'"
     * @generated
     */
	String getExecutorServiceRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getExecutorServiceRef <em>Executor Service Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Executor Service Ref</em>' attribute.
     * @see #getExecutorServiceRef()
     * @generated
     */
	void setExecutorServiceRef(String value);

	/**
     * Returns the value of the '<em><b>Group Exchanges</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Exchanges</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Group Exchanges</em>' attribute.
     * @see #isSetGroupExchanges()
     * @see #unsetGroupExchanges()
     * @see #setGroupExchanges(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_GroupExchanges()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='groupExchanges'"
     * @generated
     */
	boolean isGroupExchanges();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isGroupExchanges <em>Group Exchanges</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Group Exchanges</em>' attribute.
     * @see #isSetGroupExchanges()
     * @see #unsetGroupExchanges()
     * @see #isGroupExchanges()
     * @generated
     */
	void setGroupExchanges(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isGroupExchanges <em>Group Exchanges</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetGroupExchanges()
     * @see #isGroupExchanges()
     * @see #setGroupExchanges(boolean)
     * @generated
     */
	void unsetGroupExchanges();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isGroupExchanges <em>Group Exchanges</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Group Exchanges</em>' attribute is set.
     * @see #unsetGroupExchanges()
     * @see #isGroupExchanges()
     * @see #setGroupExchanges(boolean)
     * @generated
     */
	boolean isSetGroupExchanges();

	/**
     * Returns the value of the '<em><b>Ignore Invalid Correlation Keys</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Invalid Correlation Keys</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Ignore Invalid Correlation Keys</em>' attribute.
     * @see #isSetIgnoreInvalidCorrelationKeys()
     * @see #unsetIgnoreInvalidCorrelationKeys()
     * @see #setIgnoreInvalidCorrelationKeys(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_IgnoreInvalidCorrelationKeys()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='ignoreInvalidCorrelationKeys'"
     * @generated
     */
	boolean isIgnoreInvalidCorrelationKeys();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isIgnoreInvalidCorrelationKeys <em>Ignore Invalid Correlation Keys</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ignore Invalid Correlation Keys</em>' attribute.
     * @see #isSetIgnoreInvalidCorrelationKeys()
     * @see #unsetIgnoreInvalidCorrelationKeys()
     * @see #isIgnoreInvalidCorrelationKeys()
     * @generated
     */
	void setIgnoreInvalidCorrelationKeys(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isIgnoreInvalidCorrelationKeys <em>Ignore Invalid Correlation Keys</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetIgnoreInvalidCorrelationKeys()
     * @see #isIgnoreInvalidCorrelationKeys()
     * @see #setIgnoreInvalidCorrelationKeys(boolean)
     * @generated
     */
	void unsetIgnoreInvalidCorrelationKeys();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isIgnoreInvalidCorrelationKeys <em>Ignore Invalid Correlation Keys</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ignore Invalid Correlation Keys</em>' attribute is set.
     * @see #unsetIgnoreInvalidCorrelationKeys()
     * @see #isIgnoreInvalidCorrelationKeys()
     * @see #setIgnoreInvalidCorrelationKeys(boolean)
     * @generated
     */
	boolean isSetIgnoreInvalidCorrelationKeys();

	/**
     * Returns the value of the '<em><b>Parallel Processing</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallel Processing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Parallel Processing</em>' attribute.
     * @see #isSetParallelProcessing()
     * @see #unsetParallelProcessing()
     * @see #setParallelProcessing(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_ParallelProcessing()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='parallelProcessing'"
     * @generated
     */
	boolean isParallelProcessing();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isParallelProcessing <em>Parallel Processing</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parallel Processing</em>' attribute.
     * @see #isSetParallelProcessing()
     * @see #unsetParallelProcessing()
     * @see #isParallelProcessing()
     * @generated
     */
	void setParallelProcessing(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isParallelProcessing <em>Parallel Processing</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetParallelProcessing()
     * @see #isParallelProcessing()
     * @see #setParallelProcessing(boolean)
     * @generated
     */
	void unsetParallelProcessing();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#isParallelProcessing <em>Parallel Processing</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Parallel Processing</em>' attribute is set.
     * @see #unsetParallelProcessing()
     * @see #isParallelProcessing()
     * @see #setParallelProcessing(boolean)
     * @generated
     */
	boolean isSetParallelProcessing();

	/**
     * Returns the value of the '<em><b>Strategy Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Strategy Ref</em>' attribute.
     * @see #setStrategyRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_StrategyRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='strategyRef'"
     * @generated
     */
	String getStrategyRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition#getStrategyRef <em>Strategy Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Strategy Ref</em>' attribute.
     * @see #getStrategyRef()
     * @generated
     */
	void setStrategyRef(String value);

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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAggregateDefinition_AnyAttribute1()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':80' processing='skip'"
     * @generated
     */
	FeatureMap getAnyAttribute1();

} // AggregateDefinition
