/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Camel Redelivery Policy Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getAsyncDelayedRedelivery <em>Async Delayed Redelivery</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getBackOffMultiplier <em>Back Off Multiplier</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getCollisionAvoidanceFactor <em>Collision Avoidance Factor</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getDelayPattern <em>Delay Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getDisableRedelivery <em>Disable Redelivery</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getLogContinued <em>Log Continued</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getLogExhausted <em>Log Exhausted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getLogHandled <em>Log Handled</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getLogRetryAttempted <em>Log Retry Attempted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getLogRetryStackTrace <em>Log Retry Stack Trace</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getLogStackTrace <em>Log Stack Trace</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getMaximumRedeliveries <em>Maximum Redeliveries</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getMaximumRedeliveryDelay <em>Maximum Redelivery Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getRedeliveryDelay <em>Redelivery Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getRetriesExhaustedLogLevel <em>Retries Exhausted Log Level</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getRetryAttemptedLogLevel <em>Retry Attempted Log Level</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getUseCollisionAvoidance <em>Use Collision Avoidance</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getUseExponentialBackOff <em>Use Exponential Back Off</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean()
 * @model abstract="true"
 *        extendedMetaData="name='abstractCamelRedeliveryPolicyFactoryBean' kind='empty'"
 * @generated
 */
public interface AbstractCamelRedeliveryPolicyFactoryBean extends AbstractCamelFactoryBean {
	/**
     * Returns the value of the '<em><b>Async Delayed Redelivery</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Async Delayed Redelivery</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Async Delayed Redelivery</em>' attribute.
     * @see #setAsyncDelayedRedelivery(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_AsyncDelayedRedelivery()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='asyncDelayedRedelivery'"
     * @generated
     */
	String getAsyncDelayedRedelivery();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getAsyncDelayedRedelivery <em>Async Delayed Redelivery</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Async Delayed Redelivery</em>' attribute.
     * @see #getAsyncDelayedRedelivery()
     * @generated
     */
	void setAsyncDelayedRedelivery(String value);

	/**
     * Returns the value of the '<em><b>Back Off Multiplier</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Back Off Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Back Off Multiplier</em>' attribute.
     * @see #setBackOffMultiplier(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_BackOffMultiplier()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='backOffMultiplier'"
     * @generated
     */
	String getBackOffMultiplier();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getBackOffMultiplier <em>Back Off Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Back Off Multiplier</em>' attribute.
     * @see #getBackOffMultiplier()
     * @generated
     */
	void setBackOffMultiplier(String value);

	/**
     * Returns the value of the '<em><b>Collision Avoidance Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collision Avoidance Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Collision Avoidance Factor</em>' attribute.
     * @see #setCollisionAvoidanceFactor(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_CollisionAvoidanceFactor()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='collisionAvoidanceFactor'"
     * @generated
     */
	String getCollisionAvoidanceFactor();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getCollisionAvoidanceFactor <em>Collision Avoidance Factor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Collision Avoidance Factor</em>' attribute.
     * @see #getCollisionAvoidanceFactor()
     * @generated
     */
	void setCollisionAvoidanceFactor(String value);

	/**
     * Returns the value of the '<em><b>Delay Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Delay Pattern</em>' attribute.
     * @see #setDelayPattern(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_DelayPattern()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='delayPattern'"
     * @generated
     */
	String getDelayPattern();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getDelayPattern <em>Delay Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delay Pattern</em>' attribute.
     * @see #getDelayPattern()
     * @generated
     */
	void setDelayPattern(String value);

	/**
     * Returns the value of the '<em><b>Disable Redelivery</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable Redelivery</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Disable Redelivery</em>' attribute.
     * @see #setDisableRedelivery(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_DisableRedelivery()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='disableRedelivery'"
     * @generated
     */
	String getDisableRedelivery();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getDisableRedelivery <em>Disable Redelivery</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Disable Redelivery</em>' attribute.
     * @see #getDisableRedelivery()
     * @generated
     */
	void setDisableRedelivery(String value);

	/**
     * Returns the value of the '<em><b>Log Continued</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Continued</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Log Continued</em>' attribute.
     * @see #setLogContinued(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_LogContinued()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='logContinued'"
     * @generated
     */
	String getLogContinued();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getLogContinued <em>Log Continued</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log Continued</em>' attribute.
     * @see #getLogContinued()
     * @generated
     */
	void setLogContinued(String value);

	/**
     * Returns the value of the '<em><b>Log Exhausted</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Exhausted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Log Exhausted</em>' attribute.
     * @see #setLogExhausted(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_LogExhausted()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='logExhausted'"
     * @generated
     */
	String getLogExhausted();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getLogExhausted <em>Log Exhausted</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log Exhausted</em>' attribute.
     * @see #getLogExhausted()
     * @generated
     */
	void setLogExhausted(String value);

	/**
     * Returns the value of the '<em><b>Log Handled</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Handled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Log Handled</em>' attribute.
     * @see #setLogHandled(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_LogHandled()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='logHandled'"
     * @generated
     */
	String getLogHandled();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getLogHandled <em>Log Handled</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log Handled</em>' attribute.
     * @see #getLogHandled()
     * @generated
     */
	void setLogHandled(String value);

	/**
     * Returns the value of the '<em><b>Log Retry Attempted</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Retry Attempted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Log Retry Attempted</em>' attribute.
     * @see #setLogRetryAttempted(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_LogRetryAttempted()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='logRetryAttempted'"
     * @generated
     */
	String getLogRetryAttempted();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getLogRetryAttempted <em>Log Retry Attempted</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log Retry Attempted</em>' attribute.
     * @see #getLogRetryAttempted()
     * @generated
     */
	void setLogRetryAttempted(String value);

	/**
     * Returns the value of the '<em><b>Log Retry Stack Trace</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Retry Stack Trace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Log Retry Stack Trace</em>' attribute.
     * @see #setLogRetryStackTrace(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_LogRetryStackTrace()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='logRetryStackTrace'"
     * @generated
     */
	String getLogRetryStackTrace();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getLogRetryStackTrace <em>Log Retry Stack Trace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log Retry Stack Trace</em>' attribute.
     * @see #getLogRetryStackTrace()
     * @generated
     */
	void setLogRetryStackTrace(String value);

	/**
     * Returns the value of the '<em><b>Log Stack Trace</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Stack Trace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Log Stack Trace</em>' attribute.
     * @see #setLogStackTrace(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_LogStackTrace()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='logStackTrace'"
     * @generated
     */
	String getLogStackTrace();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getLogStackTrace <em>Log Stack Trace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log Stack Trace</em>' attribute.
     * @see #getLogStackTrace()
     * @generated
     */
	void setLogStackTrace(String value);

	/**
     * Returns the value of the '<em><b>Maximum Redeliveries</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Redeliveries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Maximum Redeliveries</em>' attribute.
     * @see #setMaximumRedeliveries(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_MaximumRedeliveries()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='maximumRedeliveries'"
     * @generated
     */
	String getMaximumRedeliveries();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getMaximumRedeliveries <em>Maximum Redeliveries</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maximum Redeliveries</em>' attribute.
     * @see #getMaximumRedeliveries()
     * @generated
     */
	void setMaximumRedeliveries(String value);

	/**
     * Returns the value of the '<em><b>Maximum Redelivery Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Redelivery Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Maximum Redelivery Delay</em>' attribute.
     * @see #setMaximumRedeliveryDelay(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_MaximumRedeliveryDelay()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='maximumRedeliveryDelay'"
     * @generated
     */
	String getMaximumRedeliveryDelay();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getMaximumRedeliveryDelay <em>Maximum Redelivery Delay</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maximum Redelivery Delay</em>' attribute.
     * @see #getMaximumRedeliveryDelay()
     * @generated
     */
	void setMaximumRedeliveryDelay(String value);

	/**
     * Returns the value of the '<em><b>Redelivery Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redelivery Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Redelivery Delay</em>' attribute.
     * @see #setRedeliveryDelay(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_RedeliveryDelay()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='redeliveryDelay'"
     * @generated
     */
	String getRedeliveryDelay();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getRedeliveryDelay <em>Redelivery Delay</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Redelivery Delay</em>' attribute.
     * @see #getRedeliveryDelay()
     * @generated
     */
	void setRedeliveryDelay(String value);

	/**
     * Returns the value of the '<em><b>Retries Exhausted Log Level</b></em>' attribute.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.spring.LoggingLevel}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retries Exhausted Log Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Retries Exhausted Log Level</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.spring.LoggingLevel
     * @see #isSetRetriesExhaustedLogLevel()
     * @see #unsetRetriesExhaustedLogLevel()
     * @see #setRetriesExhaustedLogLevel(LoggingLevel)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_RetriesExhaustedLogLevel()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='retriesExhaustedLogLevel'"
     * @generated
     */
	LoggingLevel getRetriesExhaustedLogLevel();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getRetriesExhaustedLogLevel <em>Retries Exhausted Log Level</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Retries Exhausted Log Level</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.spring.LoggingLevel
     * @see #isSetRetriesExhaustedLogLevel()
     * @see #unsetRetriesExhaustedLogLevel()
     * @see #getRetriesExhaustedLogLevel()
     * @generated
     */
	void setRetriesExhaustedLogLevel(LoggingLevel value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getRetriesExhaustedLogLevel <em>Retries Exhausted Log Level</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetRetriesExhaustedLogLevel()
     * @see #getRetriesExhaustedLogLevel()
     * @see #setRetriesExhaustedLogLevel(LoggingLevel)
     * @generated
     */
	void unsetRetriesExhaustedLogLevel();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getRetriesExhaustedLogLevel <em>Retries Exhausted Log Level</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Retries Exhausted Log Level</em>' attribute is set.
     * @see #unsetRetriesExhaustedLogLevel()
     * @see #getRetriesExhaustedLogLevel()
     * @see #setRetriesExhaustedLogLevel(LoggingLevel)
     * @generated
     */
	boolean isSetRetriesExhaustedLogLevel();

	/**
     * Returns the value of the '<em><b>Retry Attempted Log Level</b></em>' attribute.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.spring.LoggingLevel}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry Attempted Log Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Retry Attempted Log Level</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.spring.LoggingLevel
     * @see #isSetRetryAttemptedLogLevel()
     * @see #unsetRetryAttemptedLogLevel()
     * @see #setRetryAttemptedLogLevel(LoggingLevel)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_RetryAttemptedLogLevel()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='retryAttemptedLogLevel'"
     * @generated
     */
	LoggingLevel getRetryAttemptedLogLevel();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getRetryAttemptedLogLevel <em>Retry Attempted Log Level</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Retry Attempted Log Level</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.spring.LoggingLevel
     * @see #isSetRetryAttemptedLogLevel()
     * @see #unsetRetryAttemptedLogLevel()
     * @see #getRetryAttemptedLogLevel()
     * @generated
     */
	void setRetryAttemptedLogLevel(LoggingLevel value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getRetryAttemptedLogLevel <em>Retry Attempted Log Level</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetRetryAttemptedLogLevel()
     * @see #getRetryAttemptedLogLevel()
     * @see #setRetryAttemptedLogLevel(LoggingLevel)
     * @generated
     */
	void unsetRetryAttemptedLogLevel();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getRetryAttemptedLogLevel <em>Retry Attempted Log Level</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Retry Attempted Log Level</em>' attribute is set.
     * @see #unsetRetryAttemptedLogLevel()
     * @see #getRetryAttemptedLogLevel()
     * @see #setRetryAttemptedLogLevel(LoggingLevel)
     * @generated
     */
	boolean isSetRetryAttemptedLogLevel();

	/**
     * Returns the value of the '<em><b>Use Collision Avoidance</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Collision Avoidance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Use Collision Avoidance</em>' attribute.
     * @see #setUseCollisionAvoidance(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_UseCollisionAvoidance()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='useCollisionAvoidance'"
     * @generated
     */
	String getUseCollisionAvoidance();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getUseCollisionAvoidance <em>Use Collision Avoidance</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Collision Avoidance</em>' attribute.
     * @see #getUseCollisionAvoidance()
     * @generated
     */
	void setUseCollisionAvoidance(String value);

	/**
     * Returns the value of the '<em><b>Use Exponential Back Off</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Exponential Back Off</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Use Exponential Back Off</em>' attribute.
     * @see #setUseExponentialBackOff(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_UseExponentialBackOff()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='useExponentialBackOff'"
     * @generated
     */
	String getUseExponentialBackOff();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelRedeliveryPolicyFactoryBean#getUseExponentialBackOff <em>Use Exponential Back Off</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Exponential Back Off</em>' attribute.
     * @see #getUseExponentialBackOff()
     * @generated
     */
	void setUseExponentialBackOff(String value);

} // AbstractCamelRedeliveryPolicyFactoryBean
