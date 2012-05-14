/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throttle Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition#isAsyncDelayed <em>Async Delayed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition#isCallerRunsWhenRejected <em>Caller Runs When Rejected</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition#getExecutorServiceRef <em>Executor Service Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition#getTimePeriodMillis <em>Time Period Millis</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getThrottleDefinition()
 * @model extendedMetaData="name='throttleDefinition' kind='elementOnly'"
 * @generated
 */
public interface ThrottleDefinition extends ExpressionNode {
	/**
     * Returns the value of the '<em><b>Async Delayed</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Async Delayed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Async Delayed</em>' attribute.
     * @see #isSetAsyncDelayed()
     * @see #unsetAsyncDelayed()
     * @see #setAsyncDelayed(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getThrottleDefinition_AsyncDelayed()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='asyncDelayed'"
     * @generated
     */
	boolean isAsyncDelayed();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition#isAsyncDelayed <em>Async Delayed</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Async Delayed</em>' attribute.
     * @see #isSetAsyncDelayed()
     * @see #unsetAsyncDelayed()
     * @see #isAsyncDelayed()
     * @generated
     */
	void setAsyncDelayed(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition#isAsyncDelayed <em>Async Delayed</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetAsyncDelayed()
     * @see #isAsyncDelayed()
     * @see #setAsyncDelayed(boolean)
     * @generated
     */
	void unsetAsyncDelayed();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition#isAsyncDelayed <em>Async Delayed</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Async Delayed</em>' attribute is set.
     * @see #unsetAsyncDelayed()
     * @see #isAsyncDelayed()
     * @see #setAsyncDelayed(boolean)
     * @generated
     */
	boolean isSetAsyncDelayed();

	/**
     * Returns the value of the '<em><b>Caller Runs When Rejected</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caller Runs When Rejected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Caller Runs When Rejected</em>' attribute.
     * @see #isSetCallerRunsWhenRejected()
     * @see #unsetCallerRunsWhenRejected()
     * @see #setCallerRunsWhenRejected(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getThrottleDefinition_CallerRunsWhenRejected()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='callerRunsWhenRejected'"
     * @generated
     */
	boolean isCallerRunsWhenRejected();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition#isCallerRunsWhenRejected <em>Caller Runs When Rejected</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Caller Runs When Rejected</em>' attribute.
     * @see #isSetCallerRunsWhenRejected()
     * @see #unsetCallerRunsWhenRejected()
     * @see #isCallerRunsWhenRejected()
     * @generated
     */
	void setCallerRunsWhenRejected(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition#isCallerRunsWhenRejected <em>Caller Runs When Rejected</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetCallerRunsWhenRejected()
     * @see #isCallerRunsWhenRejected()
     * @see #setCallerRunsWhenRejected(boolean)
     * @generated
     */
	void unsetCallerRunsWhenRejected();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition#isCallerRunsWhenRejected <em>Caller Runs When Rejected</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Caller Runs When Rejected</em>' attribute is set.
     * @see #unsetCallerRunsWhenRejected()
     * @see #isCallerRunsWhenRejected()
     * @see #setCallerRunsWhenRejected(boolean)
     * @generated
     */
	boolean isSetCallerRunsWhenRejected();

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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getThrottleDefinition_ExecutorServiceRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='executorServiceRef'"
     * @generated
     */
	String getExecutorServiceRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition#getExecutorServiceRef <em>Executor Service Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Executor Service Ref</em>' attribute.
     * @see #getExecutorServiceRef()
     * @generated
     */
	void setExecutorServiceRef(String value);

	/**
     * Returns the value of the '<em><b>Time Period Millis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Period Millis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Time Period Millis</em>' attribute.
     * @see #isSetTimePeriodMillis()
     * @see #unsetTimePeriodMillis()
     * @see #setTimePeriodMillis(long)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getThrottleDefinition_TimePeriodMillis()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
     *        extendedMetaData="kind='attribute' name='timePeriodMillis'"
     * @generated
     */
	long getTimePeriodMillis();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition#getTimePeriodMillis <em>Time Period Millis</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Period Millis</em>' attribute.
     * @see #isSetTimePeriodMillis()
     * @see #unsetTimePeriodMillis()
     * @see #getTimePeriodMillis()
     * @generated
     */
	void setTimePeriodMillis(long value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition#getTimePeriodMillis <em>Time Period Millis</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetTimePeriodMillis()
     * @see #getTimePeriodMillis()
     * @see #setTimePeriodMillis(long)
     * @generated
     */
	void unsetTimePeriodMillis();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition#getTimePeriodMillis <em>Time Period Millis</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Period Millis</em>' attribute is set.
     * @see #unsetTimePeriodMillis()
     * @see #getTimePeriodMillis()
     * @see #setTimePeriodMillis(long)
     * @generated
     */
	boolean isSetTimePeriodMillis();

	/**
     * Returns the value of the '<em><b>Any Attribute2</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Any Attribute2</em>' attribute list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getThrottleDefinition_AnyAttribute2()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':50' processing='skip'"
     * @generated
     */
	FeatureMap getAnyAttribute2();

} // ThrottleDefinition
