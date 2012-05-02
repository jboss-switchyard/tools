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
 * A representation of the model object '<em><b>Threads Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#isCallerRunsWhenRejected <em>Caller Runs When Rejected</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getExecutorServiceRef <em>Executor Service Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getKeepAliveTime <em>Keep Alive Time</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getMaxPoolSize <em>Max Pool Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getMaxQueueSize <em>Max Queue Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getPoolSize <em>Pool Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getRejectedPolicy <em>Rejected Policy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getThreadName <em>Thread Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getThreadsDefinition()
 * @model extendedMetaData="name='threadsDefinition' kind='elementOnly'"
 * @generated
 */
public interface ThreadsDefinition extends Output {
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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getThreadsDefinition_CallerRunsWhenRejected()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='callerRunsWhenRejected'"
	 * @generated
	 */
	boolean isCallerRunsWhenRejected();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#isCallerRunsWhenRejected <em>Caller Runs When Rejected</em>}' attribute.
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
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#isCallerRunsWhenRejected <em>Caller Runs When Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCallerRunsWhenRejected()
	 * @see #isCallerRunsWhenRejected()
	 * @see #setCallerRunsWhenRejected(boolean)
	 * @generated
	 */
	void unsetCallerRunsWhenRejected();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#isCallerRunsWhenRejected <em>Caller Runs When Rejected</em>}' attribute is set.
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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getThreadsDefinition_ExecutorServiceRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='executorServiceRef'"
	 * @generated
	 */
	String getExecutorServiceRef();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getExecutorServiceRef <em>Executor Service Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor Service Ref</em>' attribute.
	 * @see #getExecutorServiceRef()
	 * @generated
	 */
	void setExecutorServiceRef(String value);

	/**
	 * Returns the value of the '<em><b>Keep Alive Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keep Alive Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep Alive Time</em>' attribute.
	 * @see #isSetKeepAliveTime()
	 * @see #unsetKeepAliveTime()
	 * @see #setKeepAliveTime(int)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getThreadsDefinition_KeepAliveTime()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='keepAliveTime'"
	 * @generated
	 */
	int getKeepAliveTime();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getKeepAliveTime <em>Keep Alive Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Alive Time</em>' attribute.
	 * @see #isSetKeepAliveTime()
	 * @see #unsetKeepAliveTime()
	 * @see #getKeepAliveTime()
	 * @generated
	 */
	void setKeepAliveTime(int value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getKeepAliveTime <em>Keep Alive Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeepAliveTime()
	 * @see #getKeepAliveTime()
	 * @see #setKeepAliveTime(int)
	 * @generated
	 */
	void unsetKeepAliveTime();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getKeepAliveTime <em>Keep Alive Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Keep Alive Time</em>' attribute is set.
	 * @see #unsetKeepAliveTime()
	 * @see #getKeepAliveTime()
	 * @see #setKeepAliveTime(int)
	 * @generated
	 */
	boolean isSetKeepAliveTime();

	/**
	 * Returns the value of the '<em><b>Max Pool Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Pool Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Pool Size</em>' attribute.
	 * @see #isSetMaxPoolSize()
	 * @see #unsetMaxPoolSize()
	 * @see #setMaxPoolSize(int)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getThreadsDefinition_MaxPoolSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='maxPoolSize'"
	 * @generated
	 */
	int getMaxPoolSize();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getMaxPoolSize <em>Max Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Pool Size</em>' attribute.
	 * @see #isSetMaxPoolSize()
	 * @see #unsetMaxPoolSize()
	 * @see #getMaxPoolSize()
	 * @generated
	 */
	void setMaxPoolSize(int value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getMaxPoolSize <em>Max Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxPoolSize()
	 * @see #getMaxPoolSize()
	 * @see #setMaxPoolSize(int)
	 * @generated
	 */
	void unsetMaxPoolSize();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getMaxPoolSize <em>Max Pool Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Pool Size</em>' attribute is set.
	 * @see #unsetMaxPoolSize()
	 * @see #getMaxPoolSize()
	 * @see #setMaxPoolSize(int)
	 * @generated
	 */
	boolean isSetMaxPoolSize();

	/**
	 * Returns the value of the '<em><b>Max Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Queue Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Queue Size</em>' attribute.
	 * @see #isSetMaxQueueSize()
	 * @see #unsetMaxQueueSize()
	 * @see #setMaxQueueSize(int)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getThreadsDefinition_MaxQueueSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='maxQueueSize'"
	 * @generated
	 */
	int getMaxQueueSize();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getMaxQueueSize <em>Max Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Queue Size</em>' attribute.
	 * @see #isSetMaxQueueSize()
	 * @see #unsetMaxQueueSize()
	 * @see #getMaxQueueSize()
	 * @generated
	 */
	void setMaxQueueSize(int value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getMaxQueueSize <em>Max Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxQueueSize()
	 * @see #getMaxQueueSize()
	 * @see #setMaxQueueSize(int)
	 * @generated
	 */
	void unsetMaxQueueSize();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getMaxQueueSize <em>Max Queue Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Queue Size</em>' attribute is set.
	 * @see #unsetMaxQueueSize()
	 * @see #getMaxQueueSize()
	 * @see #setMaxQueueSize(int)
	 * @generated
	 */
	boolean isSetMaxQueueSize();

	/**
	 * Returns the value of the '<em><b>Pool Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pool Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool Size</em>' attribute.
	 * @see #isSetPoolSize()
	 * @see #unsetPoolSize()
	 * @see #setPoolSize(int)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getThreadsDefinition_PoolSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='poolSize'"
	 * @generated
	 */
	int getPoolSize();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getPoolSize <em>Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool Size</em>' attribute.
	 * @see #isSetPoolSize()
	 * @see #unsetPoolSize()
	 * @see #getPoolSize()
	 * @generated
	 */
	void setPoolSize(int value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getPoolSize <em>Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPoolSize()
	 * @see #getPoolSize()
	 * @see #setPoolSize(int)
	 * @generated
	 */
	void unsetPoolSize();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getPoolSize <em>Pool Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pool Size</em>' attribute is set.
	 * @see #unsetPoolSize()
	 * @see #getPoolSize()
	 * @see #setPoolSize(int)
	 * @generated
	 */
	boolean isSetPoolSize();

	/**
	 * Returns the value of the '<em><b>Rejected Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.spring.ThreadPoolRejectedPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rejected Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rejected Policy</em>' attribute.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.ThreadPoolRejectedPolicy
	 * @see #isSetRejectedPolicy()
	 * @see #unsetRejectedPolicy()
	 * @see #setRejectedPolicy(ThreadPoolRejectedPolicy)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getThreadsDefinition_RejectedPolicy()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='rejectedPolicy'"
	 * @generated
	 */
	ThreadPoolRejectedPolicy getRejectedPolicy();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getRejectedPolicy <em>Rejected Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rejected Policy</em>' attribute.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.ThreadPoolRejectedPolicy
	 * @see #isSetRejectedPolicy()
	 * @see #unsetRejectedPolicy()
	 * @see #getRejectedPolicy()
	 * @generated
	 */
	void setRejectedPolicy(ThreadPoolRejectedPolicy value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getRejectedPolicy <em>Rejected Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRejectedPolicy()
	 * @see #getRejectedPolicy()
	 * @see #setRejectedPolicy(ThreadPoolRejectedPolicy)
	 * @generated
	 */
	void unsetRejectedPolicy();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getRejectedPolicy <em>Rejected Policy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rejected Policy</em>' attribute is set.
	 * @see #unsetRejectedPolicy()
	 * @see #getRejectedPolicy()
	 * @see #setRejectedPolicy(ThreadPoolRejectedPolicy)
	 * @generated
	 */
	boolean isSetRejectedPolicy();

	/**
	 * Returns the value of the '<em><b>Thread Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Name</em>' attribute.
	 * @see #setThreadName(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getThreadsDefinition_ThreadName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='threadName'"
	 * @generated
	 */
	String getThreadName();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getThreadName <em>Thread Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Name</em>' attribute.
	 * @see #getThreadName()
	 * @generated
	 */
	void setThreadName(String value);

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see #setTimeUnit(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getThreadsDefinition_TimeUnit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timeUnit'"
	 * @generated
	 */
	String getTimeUnit();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(String value);

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getThreadsDefinition_AnyAttribute2()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':17' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute2();

} // ThreadsDefinition
