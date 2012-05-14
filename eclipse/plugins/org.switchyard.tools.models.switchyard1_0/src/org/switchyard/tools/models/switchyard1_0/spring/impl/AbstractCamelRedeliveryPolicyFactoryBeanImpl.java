/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean;
import org.switchyard.tools.models.switchyard1_0.spring.LoggingLevel;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Camel Redelivery Policy Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelRedeliveryPolicyFactoryBeanImpl#getAsyncDelayedRedelivery <em>Async Delayed Redelivery</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelRedeliveryPolicyFactoryBeanImpl#getBackOffMultiplier <em>Back Off Multiplier</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelRedeliveryPolicyFactoryBeanImpl#getCollisionAvoidanceFactor <em>Collision Avoidance Factor</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelRedeliveryPolicyFactoryBeanImpl#getDelayPattern <em>Delay Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelRedeliveryPolicyFactoryBeanImpl#getDisableRedelivery <em>Disable Redelivery</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelRedeliveryPolicyFactoryBeanImpl#getLogContinued <em>Log Continued</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelRedeliveryPolicyFactoryBeanImpl#getLogExhausted <em>Log Exhausted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelRedeliveryPolicyFactoryBeanImpl#getLogHandled <em>Log Handled</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelRedeliveryPolicyFactoryBeanImpl#getLogRetryAttempted <em>Log Retry Attempted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelRedeliveryPolicyFactoryBeanImpl#getLogRetryStackTrace <em>Log Retry Stack Trace</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelRedeliveryPolicyFactoryBeanImpl#getLogStackTrace <em>Log Stack Trace</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelRedeliveryPolicyFactoryBeanImpl#getMaximumRedeliveries <em>Maximum Redeliveries</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelRedeliveryPolicyFactoryBeanImpl#getMaximumRedeliveryDelay <em>Maximum Redelivery Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelRedeliveryPolicyFactoryBeanImpl#getRedeliveryDelay <em>Redelivery Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelRedeliveryPolicyFactoryBeanImpl#getRetriesExhaustedLogLevel <em>Retries Exhausted Log Level</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelRedeliveryPolicyFactoryBeanImpl#getRetryAttemptedLogLevel <em>Retry Attempted Log Level</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelRedeliveryPolicyFactoryBeanImpl#getUseCollisionAvoidance <em>Use Collision Avoidance</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelRedeliveryPolicyFactoryBeanImpl#getUseExponentialBackOff <em>Use Exponential Back Off</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractCamelRedeliveryPolicyFactoryBeanImpl extends AbstractCamelFactoryBeanImpl implements AbstractCamelRedeliveryPolicyFactoryBean {
	/**
     * The default value of the '{@link #getAsyncDelayedRedelivery() <em>Async Delayed Redelivery</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAsyncDelayedRedelivery()
     * @generated
     * @ordered
     */
	protected static final String ASYNC_DELAYED_REDELIVERY_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getAsyncDelayedRedelivery() <em>Async Delayed Redelivery</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAsyncDelayedRedelivery()
     * @generated
     * @ordered
     */
	protected String asyncDelayedRedelivery = ASYNC_DELAYED_REDELIVERY_EDEFAULT;

	/**
     * The default value of the '{@link #getBackOffMultiplier() <em>Back Off Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBackOffMultiplier()
     * @generated
     * @ordered
     */
	protected static final String BACK_OFF_MULTIPLIER_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getBackOffMultiplier() <em>Back Off Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBackOffMultiplier()
     * @generated
     * @ordered
     */
	protected String backOffMultiplier = BACK_OFF_MULTIPLIER_EDEFAULT;

	/**
     * The default value of the '{@link #getCollisionAvoidanceFactor() <em>Collision Avoidance Factor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCollisionAvoidanceFactor()
     * @generated
     * @ordered
     */
	protected static final String COLLISION_AVOIDANCE_FACTOR_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getCollisionAvoidanceFactor() <em>Collision Avoidance Factor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCollisionAvoidanceFactor()
     * @generated
     * @ordered
     */
	protected String collisionAvoidanceFactor = COLLISION_AVOIDANCE_FACTOR_EDEFAULT;

	/**
     * The default value of the '{@link #getDelayPattern() <em>Delay Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDelayPattern()
     * @generated
     * @ordered
     */
	protected static final String DELAY_PATTERN_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDelayPattern() <em>Delay Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDelayPattern()
     * @generated
     * @ordered
     */
	protected String delayPattern = DELAY_PATTERN_EDEFAULT;

	/**
     * The default value of the '{@link #getDisableRedelivery() <em>Disable Redelivery</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDisableRedelivery()
     * @generated
     * @ordered
     */
	protected static final String DISABLE_REDELIVERY_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDisableRedelivery() <em>Disable Redelivery</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDisableRedelivery()
     * @generated
     * @ordered
     */
	protected String disableRedelivery = DISABLE_REDELIVERY_EDEFAULT;

	/**
     * The default value of the '{@link #getLogContinued() <em>Log Continued</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLogContinued()
     * @generated
     * @ordered
     */
	protected static final String LOG_CONTINUED_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getLogContinued() <em>Log Continued</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLogContinued()
     * @generated
     * @ordered
     */
	protected String logContinued = LOG_CONTINUED_EDEFAULT;

	/**
     * The default value of the '{@link #getLogExhausted() <em>Log Exhausted</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLogExhausted()
     * @generated
     * @ordered
     */
	protected static final String LOG_EXHAUSTED_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getLogExhausted() <em>Log Exhausted</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLogExhausted()
     * @generated
     * @ordered
     */
	protected String logExhausted = LOG_EXHAUSTED_EDEFAULT;

	/**
     * The default value of the '{@link #getLogHandled() <em>Log Handled</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLogHandled()
     * @generated
     * @ordered
     */
	protected static final String LOG_HANDLED_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getLogHandled() <em>Log Handled</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLogHandled()
     * @generated
     * @ordered
     */
	protected String logHandled = LOG_HANDLED_EDEFAULT;

	/**
     * The default value of the '{@link #getLogRetryAttempted() <em>Log Retry Attempted</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLogRetryAttempted()
     * @generated
     * @ordered
     */
	protected static final String LOG_RETRY_ATTEMPTED_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getLogRetryAttempted() <em>Log Retry Attempted</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLogRetryAttempted()
     * @generated
     * @ordered
     */
	protected String logRetryAttempted = LOG_RETRY_ATTEMPTED_EDEFAULT;

	/**
     * The default value of the '{@link #getLogRetryStackTrace() <em>Log Retry Stack Trace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLogRetryStackTrace()
     * @generated
     * @ordered
     */
	protected static final String LOG_RETRY_STACK_TRACE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getLogRetryStackTrace() <em>Log Retry Stack Trace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLogRetryStackTrace()
     * @generated
     * @ordered
     */
	protected String logRetryStackTrace = LOG_RETRY_STACK_TRACE_EDEFAULT;

	/**
     * The default value of the '{@link #getLogStackTrace() <em>Log Stack Trace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLogStackTrace()
     * @generated
     * @ordered
     */
	protected static final String LOG_STACK_TRACE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getLogStackTrace() <em>Log Stack Trace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLogStackTrace()
     * @generated
     * @ordered
     */
	protected String logStackTrace = LOG_STACK_TRACE_EDEFAULT;

	/**
     * The default value of the '{@link #getMaximumRedeliveries() <em>Maximum Redeliveries</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaximumRedeliveries()
     * @generated
     * @ordered
     */
	protected static final String MAXIMUM_REDELIVERIES_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMaximumRedeliveries() <em>Maximum Redeliveries</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaximumRedeliveries()
     * @generated
     * @ordered
     */
	protected String maximumRedeliveries = MAXIMUM_REDELIVERIES_EDEFAULT;

	/**
     * The default value of the '{@link #getMaximumRedeliveryDelay() <em>Maximum Redelivery Delay</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaximumRedeliveryDelay()
     * @generated
     * @ordered
     */
	protected static final String MAXIMUM_REDELIVERY_DELAY_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMaximumRedeliveryDelay() <em>Maximum Redelivery Delay</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaximumRedeliveryDelay()
     * @generated
     * @ordered
     */
	protected String maximumRedeliveryDelay = MAXIMUM_REDELIVERY_DELAY_EDEFAULT;

	/**
     * The default value of the '{@link #getRedeliveryDelay() <em>Redelivery Delay</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRedeliveryDelay()
     * @generated
     * @ordered
     */
	protected static final String REDELIVERY_DELAY_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRedeliveryDelay() <em>Redelivery Delay</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRedeliveryDelay()
     * @generated
     * @ordered
     */
	protected String redeliveryDelay = REDELIVERY_DELAY_EDEFAULT;

	/**
     * The default value of the '{@link #getRetriesExhaustedLogLevel() <em>Retries Exhausted Log Level</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRetriesExhaustedLogLevel()
     * @generated
     * @ordered
     */
	protected static final LoggingLevel RETRIES_EXHAUSTED_LOG_LEVEL_EDEFAULT = LoggingLevel.DEBUG;

	/**
     * The cached value of the '{@link #getRetriesExhaustedLogLevel() <em>Retries Exhausted Log Level</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRetriesExhaustedLogLevel()
     * @generated
     * @ordered
     */
	protected LoggingLevel retriesExhaustedLogLevel = RETRIES_EXHAUSTED_LOG_LEVEL_EDEFAULT;

	/**
     * This is true if the Retries Exhausted Log Level attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean retriesExhaustedLogLevelESet;

	/**
     * The default value of the '{@link #getRetryAttemptedLogLevel() <em>Retry Attempted Log Level</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRetryAttemptedLogLevel()
     * @generated
     * @ordered
     */
	protected static final LoggingLevel RETRY_ATTEMPTED_LOG_LEVEL_EDEFAULT = LoggingLevel.DEBUG;

	/**
     * The cached value of the '{@link #getRetryAttemptedLogLevel() <em>Retry Attempted Log Level</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRetryAttemptedLogLevel()
     * @generated
     * @ordered
     */
	protected LoggingLevel retryAttemptedLogLevel = RETRY_ATTEMPTED_LOG_LEVEL_EDEFAULT;

	/**
     * This is true if the Retry Attempted Log Level attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean retryAttemptedLogLevelESet;

	/**
     * The default value of the '{@link #getUseCollisionAvoidance() <em>Use Collision Avoidance</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUseCollisionAvoidance()
     * @generated
     * @ordered
     */
	protected static final String USE_COLLISION_AVOIDANCE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getUseCollisionAvoidance() <em>Use Collision Avoidance</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUseCollisionAvoidance()
     * @generated
     * @ordered
     */
	protected String useCollisionAvoidance = USE_COLLISION_AVOIDANCE_EDEFAULT;

	/**
     * The default value of the '{@link #getUseExponentialBackOff() <em>Use Exponential Back Off</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUseExponentialBackOff()
     * @generated
     * @ordered
     */
	protected static final String USE_EXPONENTIAL_BACK_OFF_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getUseExponentialBackOff() <em>Use Exponential Back Off</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUseExponentialBackOff()
     * @generated
     * @ordered
     */
	protected String useExponentialBackOff = USE_EXPONENTIAL_BACK_OFF_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AbstractCamelRedeliveryPolicyFactoryBeanImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getAbstractCamelRedeliveryPolicyFactoryBean();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getAsyncDelayedRedelivery() {
        return asyncDelayedRedelivery;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAsyncDelayedRedelivery(String newAsyncDelayedRedelivery) {
        String oldAsyncDelayedRedelivery = asyncDelayedRedelivery;
        asyncDelayedRedelivery = newAsyncDelayedRedelivery;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__ASYNC_DELAYED_REDELIVERY, oldAsyncDelayedRedelivery, asyncDelayedRedelivery));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getBackOffMultiplier() {
        return backOffMultiplier;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBackOffMultiplier(String newBackOffMultiplier) {
        String oldBackOffMultiplier = backOffMultiplier;
        backOffMultiplier = newBackOffMultiplier;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__BACK_OFF_MULTIPLIER, oldBackOffMultiplier, backOffMultiplier));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getCollisionAvoidanceFactor() {
        return collisionAvoidanceFactor;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCollisionAvoidanceFactor(String newCollisionAvoidanceFactor) {
        String oldCollisionAvoidanceFactor = collisionAvoidanceFactor;
        collisionAvoidanceFactor = newCollisionAvoidanceFactor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__COLLISION_AVOIDANCE_FACTOR, oldCollisionAvoidanceFactor, collisionAvoidanceFactor));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDelayPattern() {
        return delayPattern;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDelayPattern(String newDelayPattern) {
        String oldDelayPattern = delayPattern;
        delayPattern = newDelayPattern;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__DELAY_PATTERN, oldDelayPattern, delayPattern));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDisableRedelivery() {
        return disableRedelivery;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDisableRedelivery(String newDisableRedelivery) {
        String oldDisableRedelivery = disableRedelivery;
        disableRedelivery = newDisableRedelivery;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__DISABLE_REDELIVERY, oldDisableRedelivery, disableRedelivery));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getLogContinued() {
        return logContinued;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLogContinued(String newLogContinued) {
        String oldLogContinued = logContinued;
        logContinued = newLogContinued;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_CONTINUED, oldLogContinued, logContinued));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getLogExhausted() {
        return logExhausted;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLogExhausted(String newLogExhausted) {
        String oldLogExhausted = logExhausted;
        logExhausted = newLogExhausted;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_EXHAUSTED, oldLogExhausted, logExhausted));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getLogHandled() {
        return logHandled;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLogHandled(String newLogHandled) {
        String oldLogHandled = logHandled;
        logHandled = newLogHandled;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_HANDLED, oldLogHandled, logHandled));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getLogRetryAttempted() {
        return logRetryAttempted;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLogRetryAttempted(String newLogRetryAttempted) {
        String oldLogRetryAttempted = logRetryAttempted;
        logRetryAttempted = newLogRetryAttempted;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_RETRY_ATTEMPTED, oldLogRetryAttempted, logRetryAttempted));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getLogRetryStackTrace() {
        return logRetryStackTrace;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLogRetryStackTrace(String newLogRetryStackTrace) {
        String oldLogRetryStackTrace = logRetryStackTrace;
        logRetryStackTrace = newLogRetryStackTrace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_RETRY_STACK_TRACE, oldLogRetryStackTrace, logRetryStackTrace));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getLogStackTrace() {
        return logStackTrace;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLogStackTrace(String newLogStackTrace) {
        String oldLogStackTrace = logStackTrace;
        logStackTrace = newLogStackTrace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_STACK_TRACE, oldLogStackTrace, logStackTrace));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getMaximumRedeliveries() {
        return maximumRedeliveries;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMaximumRedeliveries(String newMaximumRedeliveries) {
        String oldMaximumRedeliveries = maximumRedeliveries;
        maximumRedeliveries = newMaximumRedeliveries;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__MAXIMUM_REDELIVERIES, oldMaximumRedeliveries, maximumRedeliveries));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getMaximumRedeliveryDelay() {
        return maximumRedeliveryDelay;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMaximumRedeliveryDelay(String newMaximumRedeliveryDelay) {
        String oldMaximumRedeliveryDelay = maximumRedeliveryDelay;
        maximumRedeliveryDelay = newMaximumRedeliveryDelay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__MAXIMUM_REDELIVERY_DELAY, oldMaximumRedeliveryDelay, maximumRedeliveryDelay));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getRedeliveryDelay() {
        return redeliveryDelay;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRedeliveryDelay(String newRedeliveryDelay) {
        String oldRedeliveryDelay = redeliveryDelay;
        redeliveryDelay = newRedeliveryDelay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__REDELIVERY_DELAY, oldRedeliveryDelay, redeliveryDelay));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LoggingLevel getRetriesExhaustedLogLevel() {
        return retriesExhaustedLogLevel;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRetriesExhaustedLogLevel(LoggingLevel newRetriesExhaustedLogLevel) {
        LoggingLevel oldRetriesExhaustedLogLevel = retriesExhaustedLogLevel;
        retriesExhaustedLogLevel = newRetriesExhaustedLogLevel == null ? RETRIES_EXHAUSTED_LOG_LEVEL_EDEFAULT : newRetriesExhaustedLogLevel;
        boolean oldRetriesExhaustedLogLevelESet = retriesExhaustedLogLevelESet;
        retriesExhaustedLogLevelESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__RETRIES_EXHAUSTED_LOG_LEVEL, oldRetriesExhaustedLogLevel, retriesExhaustedLogLevel, !oldRetriesExhaustedLogLevelESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetRetriesExhaustedLogLevel() {
        LoggingLevel oldRetriesExhaustedLogLevel = retriesExhaustedLogLevel;
        boolean oldRetriesExhaustedLogLevelESet = retriesExhaustedLogLevelESet;
        retriesExhaustedLogLevel = RETRIES_EXHAUSTED_LOG_LEVEL_EDEFAULT;
        retriesExhaustedLogLevelESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__RETRIES_EXHAUSTED_LOG_LEVEL, oldRetriesExhaustedLogLevel, RETRIES_EXHAUSTED_LOG_LEVEL_EDEFAULT, oldRetriesExhaustedLogLevelESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetRetriesExhaustedLogLevel() {
        return retriesExhaustedLogLevelESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LoggingLevel getRetryAttemptedLogLevel() {
        return retryAttemptedLogLevel;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRetryAttemptedLogLevel(LoggingLevel newRetryAttemptedLogLevel) {
        LoggingLevel oldRetryAttemptedLogLevel = retryAttemptedLogLevel;
        retryAttemptedLogLevel = newRetryAttemptedLogLevel == null ? RETRY_ATTEMPTED_LOG_LEVEL_EDEFAULT : newRetryAttemptedLogLevel;
        boolean oldRetryAttemptedLogLevelESet = retryAttemptedLogLevelESet;
        retryAttemptedLogLevelESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__RETRY_ATTEMPTED_LOG_LEVEL, oldRetryAttemptedLogLevel, retryAttemptedLogLevel, !oldRetryAttemptedLogLevelESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetRetryAttemptedLogLevel() {
        LoggingLevel oldRetryAttemptedLogLevel = retryAttemptedLogLevel;
        boolean oldRetryAttemptedLogLevelESet = retryAttemptedLogLevelESet;
        retryAttemptedLogLevel = RETRY_ATTEMPTED_LOG_LEVEL_EDEFAULT;
        retryAttemptedLogLevelESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__RETRY_ATTEMPTED_LOG_LEVEL, oldRetryAttemptedLogLevel, RETRY_ATTEMPTED_LOG_LEVEL_EDEFAULT, oldRetryAttemptedLogLevelESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetRetryAttemptedLogLevel() {
        return retryAttemptedLogLevelESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getUseCollisionAvoidance() {
        return useCollisionAvoidance;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUseCollisionAvoidance(String newUseCollisionAvoidance) {
        String oldUseCollisionAvoidance = useCollisionAvoidance;
        useCollisionAvoidance = newUseCollisionAvoidance;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__USE_COLLISION_AVOIDANCE, oldUseCollisionAvoidance, useCollisionAvoidance));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getUseExponentialBackOff() {
        return useExponentialBackOff;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUseExponentialBackOff(String newUseExponentialBackOff) {
        String oldUseExponentialBackOff = useExponentialBackOff;
        useExponentialBackOff = newUseExponentialBackOff;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__USE_EXPONENTIAL_BACK_OFF, oldUseExponentialBackOff, useExponentialBackOff));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__ASYNC_DELAYED_REDELIVERY:
                return getAsyncDelayedRedelivery();
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__BACK_OFF_MULTIPLIER:
                return getBackOffMultiplier();
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__COLLISION_AVOIDANCE_FACTOR:
                return getCollisionAvoidanceFactor();
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__DELAY_PATTERN:
                return getDelayPattern();
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__DISABLE_REDELIVERY:
                return getDisableRedelivery();
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_CONTINUED:
                return getLogContinued();
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_EXHAUSTED:
                return getLogExhausted();
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_HANDLED:
                return getLogHandled();
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_RETRY_ATTEMPTED:
                return getLogRetryAttempted();
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_RETRY_STACK_TRACE:
                return getLogRetryStackTrace();
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_STACK_TRACE:
                return getLogStackTrace();
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__MAXIMUM_REDELIVERIES:
                return getMaximumRedeliveries();
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__MAXIMUM_REDELIVERY_DELAY:
                return getMaximumRedeliveryDelay();
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__REDELIVERY_DELAY:
                return getRedeliveryDelay();
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__RETRIES_EXHAUSTED_LOG_LEVEL:
                return getRetriesExhaustedLogLevel();
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__RETRY_ATTEMPTED_LOG_LEVEL:
                return getRetryAttemptedLogLevel();
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__USE_COLLISION_AVOIDANCE:
                return getUseCollisionAvoidance();
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__USE_EXPONENTIAL_BACK_OFF:
                return getUseExponentialBackOff();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__ASYNC_DELAYED_REDELIVERY:
                setAsyncDelayedRedelivery((String)newValue);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__BACK_OFF_MULTIPLIER:
                setBackOffMultiplier((String)newValue);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__COLLISION_AVOIDANCE_FACTOR:
                setCollisionAvoidanceFactor((String)newValue);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__DELAY_PATTERN:
                setDelayPattern((String)newValue);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__DISABLE_REDELIVERY:
                setDisableRedelivery((String)newValue);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_CONTINUED:
                setLogContinued((String)newValue);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_EXHAUSTED:
                setLogExhausted((String)newValue);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_HANDLED:
                setLogHandled((String)newValue);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_RETRY_ATTEMPTED:
                setLogRetryAttempted((String)newValue);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_RETRY_STACK_TRACE:
                setLogRetryStackTrace((String)newValue);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_STACK_TRACE:
                setLogStackTrace((String)newValue);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__MAXIMUM_REDELIVERIES:
                setMaximumRedeliveries((String)newValue);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__MAXIMUM_REDELIVERY_DELAY:
                setMaximumRedeliveryDelay((String)newValue);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__REDELIVERY_DELAY:
                setRedeliveryDelay((String)newValue);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__RETRIES_EXHAUSTED_LOG_LEVEL:
                setRetriesExhaustedLogLevel((LoggingLevel)newValue);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__RETRY_ATTEMPTED_LOG_LEVEL:
                setRetryAttemptedLogLevel((LoggingLevel)newValue);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__USE_COLLISION_AVOIDANCE:
                setUseCollisionAvoidance((String)newValue);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__USE_EXPONENTIAL_BACK_OFF:
                setUseExponentialBackOff((String)newValue);
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
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__ASYNC_DELAYED_REDELIVERY:
                setAsyncDelayedRedelivery(ASYNC_DELAYED_REDELIVERY_EDEFAULT);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__BACK_OFF_MULTIPLIER:
                setBackOffMultiplier(BACK_OFF_MULTIPLIER_EDEFAULT);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__COLLISION_AVOIDANCE_FACTOR:
                setCollisionAvoidanceFactor(COLLISION_AVOIDANCE_FACTOR_EDEFAULT);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__DELAY_PATTERN:
                setDelayPattern(DELAY_PATTERN_EDEFAULT);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__DISABLE_REDELIVERY:
                setDisableRedelivery(DISABLE_REDELIVERY_EDEFAULT);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_CONTINUED:
                setLogContinued(LOG_CONTINUED_EDEFAULT);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_EXHAUSTED:
                setLogExhausted(LOG_EXHAUSTED_EDEFAULT);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_HANDLED:
                setLogHandled(LOG_HANDLED_EDEFAULT);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_RETRY_ATTEMPTED:
                setLogRetryAttempted(LOG_RETRY_ATTEMPTED_EDEFAULT);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_RETRY_STACK_TRACE:
                setLogRetryStackTrace(LOG_RETRY_STACK_TRACE_EDEFAULT);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_STACK_TRACE:
                setLogStackTrace(LOG_STACK_TRACE_EDEFAULT);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__MAXIMUM_REDELIVERIES:
                setMaximumRedeliveries(MAXIMUM_REDELIVERIES_EDEFAULT);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__MAXIMUM_REDELIVERY_DELAY:
                setMaximumRedeliveryDelay(MAXIMUM_REDELIVERY_DELAY_EDEFAULT);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__REDELIVERY_DELAY:
                setRedeliveryDelay(REDELIVERY_DELAY_EDEFAULT);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__RETRIES_EXHAUSTED_LOG_LEVEL:
                unsetRetriesExhaustedLogLevel();
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__RETRY_ATTEMPTED_LOG_LEVEL:
                unsetRetryAttemptedLogLevel();
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__USE_COLLISION_AVOIDANCE:
                setUseCollisionAvoidance(USE_COLLISION_AVOIDANCE_EDEFAULT);
                return;
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__USE_EXPONENTIAL_BACK_OFF:
                setUseExponentialBackOff(USE_EXPONENTIAL_BACK_OFF_EDEFAULT);
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
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__ASYNC_DELAYED_REDELIVERY:
                return ASYNC_DELAYED_REDELIVERY_EDEFAULT == null ? asyncDelayedRedelivery != null : !ASYNC_DELAYED_REDELIVERY_EDEFAULT.equals(asyncDelayedRedelivery);
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__BACK_OFF_MULTIPLIER:
                return BACK_OFF_MULTIPLIER_EDEFAULT == null ? backOffMultiplier != null : !BACK_OFF_MULTIPLIER_EDEFAULT.equals(backOffMultiplier);
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__COLLISION_AVOIDANCE_FACTOR:
                return COLLISION_AVOIDANCE_FACTOR_EDEFAULT == null ? collisionAvoidanceFactor != null : !COLLISION_AVOIDANCE_FACTOR_EDEFAULT.equals(collisionAvoidanceFactor);
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__DELAY_PATTERN:
                return DELAY_PATTERN_EDEFAULT == null ? delayPattern != null : !DELAY_PATTERN_EDEFAULT.equals(delayPattern);
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__DISABLE_REDELIVERY:
                return DISABLE_REDELIVERY_EDEFAULT == null ? disableRedelivery != null : !DISABLE_REDELIVERY_EDEFAULT.equals(disableRedelivery);
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_CONTINUED:
                return LOG_CONTINUED_EDEFAULT == null ? logContinued != null : !LOG_CONTINUED_EDEFAULT.equals(logContinued);
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_EXHAUSTED:
                return LOG_EXHAUSTED_EDEFAULT == null ? logExhausted != null : !LOG_EXHAUSTED_EDEFAULT.equals(logExhausted);
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_HANDLED:
                return LOG_HANDLED_EDEFAULT == null ? logHandled != null : !LOG_HANDLED_EDEFAULT.equals(logHandled);
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_RETRY_ATTEMPTED:
                return LOG_RETRY_ATTEMPTED_EDEFAULT == null ? logRetryAttempted != null : !LOG_RETRY_ATTEMPTED_EDEFAULT.equals(logRetryAttempted);
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_RETRY_STACK_TRACE:
                return LOG_RETRY_STACK_TRACE_EDEFAULT == null ? logRetryStackTrace != null : !LOG_RETRY_STACK_TRACE_EDEFAULT.equals(logRetryStackTrace);
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__LOG_STACK_TRACE:
                return LOG_STACK_TRACE_EDEFAULT == null ? logStackTrace != null : !LOG_STACK_TRACE_EDEFAULT.equals(logStackTrace);
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__MAXIMUM_REDELIVERIES:
                return MAXIMUM_REDELIVERIES_EDEFAULT == null ? maximumRedeliveries != null : !MAXIMUM_REDELIVERIES_EDEFAULT.equals(maximumRedeliveries);
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__MAXIMUM_REDELIVERY_DELAY:
                return MAXIMUM_REDELIVERY_DELAY_EDEFAULT == null ? maximumRedeliveryDelay != null : !MAXIMUM_REDELIVERY_DELAY_EDEFAULT.equals(maximumRedeliveryDelay);
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__REDELIVERY_DELAY:
                return REDELIVERY_DELAY_EDEFAULT == null ? redeliveryDelay != null : !REDELIVERY_DELAY_EDEFAULT.equals(redeliveryDelay);
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__RETRIES_EXHAUSTED_LOG_LEVEL:
                return isSetRetriesExhaustedLogLevel();
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__RETRY_ATTEMPTED_LOG_LEVEL:
                return isSetRetryAttemptedLogLevel();
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__USE_COLLISION_AVOIDANCE:
                return USE_COLLISION_AVOIDANCE_EDEFAULT == null ? useCollisionAvoidance != null : !USE_COLLISION_AVOIDANCE_EDEFAULT.equals(useCollisionAvoidance);
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN__USE_EXPONENTIAL_BACK_OFF:
                return USE_EXPONENTIAL_BACK_OFF_EDEFAULT == null ? useExponentialBackOff != null : !USE_EXPONENTIAL_BACK_OFF_EDEFAULT.equals(useExponentialBackOff);
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
        result.append(" (asyncDelayedRedelivery: ");
        result.append(asyncDelayedRedelivery);
        result.append(", backOffMultiplier: ");
        result.append(backOffMultiplier);
        result.append(", collisionAvoidanceFactor: ");
        result.append(collisionAvoidanceFactor);
        result.append(", delayPattern: ");
        result.append(delayPattern);
        result.append(", disableRedelivery: ");
        result.append(disableRedelivery);
        result.append(", logContinued: ");
        result.append(logContinued);
        result.append(", logExhausted: ");
        result.append(logExhausted);
        result.append(", logHandled: ");
        result.append(logHandled);
        result.append(", logRetryAttempted: ");
        result.append(logRetryAttempted);
        result.append(", logRetryStackTrace: ");
        result.append(logRetryStackTrace);
        result.append(", logStackTrace: ");
        result.append(logStackTrace);
        result.append(", maximumRedeliveries: ");
        result.append(maximumRedeliveries);
        result.append(", maximumRedeliveryDelay: ");
        result.append(maximumRedeliveryDelay);
        result.append(", redeliveryDelay: ");
        result.append(redeliveryDelay);
        result.append(", retriesExhaustedLogLevel: ");
        if (retriesExhaustedLogLevelESet) result.append(retriesExhaustedLogLevel); else result.append("<unset>");
        result.append(", retryAttemptedLogLevel: ");
        if (retryAttemptedLogLevelESet) result.append(retryAttemptedLogLevel); else result.append("<unset>");
        result.append(", useCollisionAvoidance: ");
        result.append(useCollisionAvoidance);
        result.append(", useExponentialBackOff: ");
        result.append(useExponentialBackOff);
        result.append(')');
        return result.toString();
    }

} //AbstractCamelRedeliveryPolicyFactoryBeanImpl
