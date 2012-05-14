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
 * A representation of the model object '<em><b>Delay Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DelayDefinition#isAsyncDelayed <em>Async Delayed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DelayDefinition#isCallerRunsWhenRejected <em>Caller Runs When Rejected</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DelayDefinition#getExecutorServiceRef <em>Executor Service Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DelayDefinition#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDelayDefinition()
 * @model extendedMetaData="name='delayDefinition' kind='elementOnly'"
 * @generated
 */
public interface DelayDefinition extends ExpressionNode {
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDelayDefinition_AsyncDelayed()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='asyncDelayed'"
     * @generated
     */
	boolean isAsyncDelayed();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DelayDefinition#isAsyncDelayed <em>Async Delayed</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DelayDefinition#isAsyncDelayed <em>Async Delayed</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetAsyncDelayed()
     * @see #isAsyncDelayed()
     * @see #setAsyncDelayed(boolean)
     * @generated
     */
	void unsetAsyncDelayed();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DelayDefinition#isAsyncDelayed <em>Async Delayed</em>}' attribute is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDelayDefinition_CallerRunsWhenRejected()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='callerRunsWhenRejected'"
     * @generated
     */
	boolean isCallerRunsWhenRejected();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DelayDefinition#isCallerRunsWhenRejected <em>Caller Runs When Rejected</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DelayDefinition#isCallerRunsWhenRejected <em>Caller Runs When Rejected</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetCallerRunsWhenRejected()
     * @see #isCallerRunsWhenRejected()
     * @see #setCallerRunsWhenRejected(boolean)
     * @generated
     */
	void unsetCallerRunsWhenRejected();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DelayDefinition#isCallerRunsWhenRejected <em>Caller Runs When Rejected</em>}' attribute is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDelayDefinition_ExecutorServiceRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='executorServiceRef'"
     * @generated
     */
	String getExecutorServiceRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DelayDefinition#getExecutorServiceRef <em>Executor Service Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Executor Service Ref</em>' attribute.
     * @see #getExecutorServiceRef()
     * @generated
     */
	void setExecutorServiceRef(String value);

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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDelayDefinition_AnyAttribute2()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':38' processing='skip'"
     * @generated
     */
	FeatureMap getAnyAttribute2();

} // DelayDefinition
