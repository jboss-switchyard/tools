/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.ThreadPoolRejectedPolicy;
import org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threads Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ThreadsDefinitionImpl#isCallerRunsWhenRejected <em>Caller Runs When Rejected</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ThreadsDefinitionImpl#getExecutorServiceRef <em>Executor Service Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ThreadsDefinitionImpl#getKeepAliveTime <em>Keep Alive Time</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ThreadsDefinitionImpl#getMaxPoolSize <em>Max Pool Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ThreadsDefinitionImpl#getMaxQueueSize <em>Max Queue Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ThreadsDefinitionImpl#getPoolSize <em>Pool Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ThreadsDefinitionImpl#getRejectedPolicy <em>Rejected Policy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ThreadsDefinitionImpl#getThreadName <em>Thread Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ThreadsDefinitionImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ThreadsDefinitionImpl#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThreadsDefinitionImpl extends OutputImpl implements ThreadsDefinition {
	/**
     * The default value of the '{@link #isCallerRunsWhenRejected() <em>Caller Runs When Rejected</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isCallerRunsWhenRejected()
     * @generated
     * @ordered
     */
	protected static final boolean CALLER_RUNS_WHEN_REJECTED_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isCallerRunsWhenRejected() <em>Caller Runs When Rejected</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isCallerRunsWhenRejected()
     * @generated
     * @ordered
     */
	protected boolean callerRunsWhenRejected = CALLER_RUNS_WHEN_REJECTED_EDEFAULT;

	/**
     * This is true if the Caller Runs When Rejected attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean callerRunsWhenRejectedESet;

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
     * The default value of the '{@link #getKeepAliveTime() <em>Keep Alive Time</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKeepAliveTime()
     * @generated
     * @ordered
     */
	protected static final int KEEP_ALIVE_TIME_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getKeepAliveTime() <em>Keep Alive Time</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKeepAliveTime()
     * @generated
     * @ordered
     */
	protected int keepAliveTime = KEEP_ALIVE_TIME_EDEFAULT;

	/**
     * This is true if the Keep Alive Time attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean keepAliveTimeESet;

	/**
     * The default value of the '{@link #getMaxPoolSize() <em>Max Pool Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxPoolSize()
     * @generated
     * @ordered
     */
	protected static final int MAX_POOL_SIZE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getMaxPoolSize() <em>Max Pool Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxPoolSize()
     * @generated
     * @ordered
     */
	protected int maxPoolSize = MAX_POOL_SIZE_EDEFAULT;

	/**
     * This is true if the Max Pool Size attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean maxPoolSizeESet;

	/**
     * The default value of the '{@link #getMaxQueueSize() <em>Max Queue Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxQueueSize()
     * @generated
     * @ordered
     */
	protected static final int MAX_QUEUE_SIZE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getMaxQueueSize() <em>Max Queue Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxQueueSize()
     * @generated
     * @ordered
     */
	protected int maxQueueSize = MAX_QUEUE_SIZE_EDEFAULT;

	/**
     * This is true if the Max Queue Size attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean maxQueueSizeESet;

	/**
     * The default value of the '{@link #getPoolSize() <em>Pool Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPoolSize()
     * @generated
     * @ordered
     */
	protected static final int POOL_SIZE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getPoolSize() <em>Pool Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPoolSize()
     * @generated
     * @ordered
     */
	protected int poolSize = POOL_SIZE_EDEFAULT;

	/**
     * This is true if the Pool Size attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean poolSizeESet;

	/**
     * The default value of the '{@link #getRejectedPolicy() <em>Rejected Policy</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRejectedPolicy()
     * @generated
     * @ordered
     */
	protected static final ThreadPoolRejectedPolicy REJECTED_POLICY_EDEFAULT = ThreadPoolRejectedPolicy.ABORT;

	/**
     * The cached value of the '{@link #getRejectedPolicy() <em>Rejected Policy</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRejectedPolicy()
     * @generated
     * @ordered
     */
	protected ThreadPoolRejectedPolicy rejectedPolicy = REJECTED_POLICY_EDEFAULT;

	/**
     * This is true if the Rejected Policy attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean rejectedPolicyESet;

	/**
     * The default value of the '{@link #getThreadName() <em>Thread Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getThreadName()
     * @generated
     * @ordered
     */
	protected static final String THREAD_NAME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getThreadName() <em>Thread Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getThreadName()
     * @generated
     * @ordered
     */
	protected String threadName = THREAD_NAME_EDEFAULT;

	/**
     * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTimeUnit()
     * @generated
     * @ordered
     */
	protected static final String TIME_UNIT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTimeUnit()
     * @generated
     * @ordered
     */
	protected String timeUnit = TIME_UNIT_EDEFAULT;

	/**
     * The cached value of the '{@link #getAnyAttribute2() <em>Any Attribute2</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAnyAttribute2()
     * @generated
     * @ordered
     */
	protected FeatureMap anyAttribute2;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ThreadsDefinitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getThreadsDefinition();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isCallerRunsWhenRejected() {
        return callerRunsWhenRejected;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCallerRunsWhenRejected(boolean newCallerRunsWhenRejected) {
        boolean oldCallerRunsWhenRejected = callerRunsWhenRejected;
        callerRunsWhenRejected = newCallerRunsWhenRejected;
        boolean oldCallerRunsWhenRejectedESet = callerRunsWhenRejectedESet;
        callerRunsWhenRejectedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.THREADS_DEFINITION__CALLER_RUNS_WHEN_REJECTED, oldCallerRunsWhenRejected, callerRunsWhenRejected, !oldCallerRunsWhenRejectedESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetCallerRunsWhenRejected() {
        boolean oldCallerRunsWhenRejected = callerRunsWhenRejected;
        boolean oldCallerRunsWhenRejectedESet = callerRunsWhenRejectedESet;
        callerRunsWhenRejected = CALLER_RUNS_WHEN_REJECTED_EDEFAULT;
        callerRunsWhenRejectedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.THREADS_DEFINITION__CALLER_RUNS_WHEN_REJECTED, oldCallerRunsWhenRejected, CALLER_RUNS_WHEN_REJECTED_EDEFAULT, oldCallerRunsWhenRejectedESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetCallerRunsWhenRejected() {
        return callerRunsWhenRejectedESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.THREADS_DEFINITION__EXECUTOR_SERVICE_REF, oldExecutorServiceRef, executorServiceRef));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getKeepAliveTime() {
        return keepAliveTime;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setKeepAliveTime(int newKeepAliveTime) {
        int oldKeepAliveTime = keepAliveTime;
        keepAliveTime = newKeepAliveTime;
        boolean oldKeepAliveTimeESet = keepAliveTimeESet;
        keepAliveTimeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.THREADS_DEFINITION__KEEP_ALIVE_TIME, oldKeepAliveTime, keepAliveTime, !oldKeepAliveTimeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetKeepAliveTime() {
        int oldKeepAliveTime = keepAliveTime;
        boolean oldKeepAliveTimeESet = keepAliveTimeESet;
        keepAliveTime = KEEP_ALIVE_TIME_EDEFAULT;
        keepAliveTimeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.THREADS_DEFINITION__KEEP_ALIVE_TIME, oldKeepAliveTime, KEEP_ALIVE_TIME_EDEFAULT, oldKeepAliveTimeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetKeepAliveTime() {
        return keepAliveTimeESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getMaxPoolSize() {
        return maxPoolSize;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMaxPoolSize(int newMaxPoolSize) {
        int oldMaxPoolSize = maxPoolSize;
        maxPoolSize = newMaxPoolSize;
        boolean oldMaxPoolSizeESet = maxPoolSizeESet;
        maxPoolSizeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.THREADS_DEFINITION__MAX_POOL_SIZE, oldMaxPoolSize, maxPoolSize, !oldMaxPoolSizeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetMaxPoolSize() {
        int oldMaxPoolSize = maxPoolSize;
        boolean oldMaxPoolSizeESet = maxPoolSizeESet;
        maxPoolSize = MAX_POOL_SIZE_EDEFAULT;
        maxPoolSizeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.THREADS_DEFINITION__MAX_POOL_SIZE, oldMaxPoolSize, MAX_POOL_SIZE_EDEFAULT, oldMaxPoolSizeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetMaxPoolSize() {
        return maxPoolSizeESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getMaxQueueSize() {
        return maxQueueSize;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMaxQueueSize(int newMaxQueueSize) {
        int oldMaxQueueSize = maxQueueSize;
        maxQueueSize = newMaxQueueSize;
        boolean oldMaxQueueSizeESet = maxQueueSizeESet;
        maxQueueSizeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.THREADS_DEFINITION__MAX_QUEUE_SIZE, oldMaxQueueSize, maxQueueSize, !oldMaxQueueSizeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetMaxQueueSize() {
        int oldMaxQueueSize = maxQueueSize;
        boolean oldMaxQueueSizeESet = maxQueueSizeESet;
        maxQueueSize = MAX_QUEUE_SIZE_EDEFAULT;
        maxQueueSizeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.THREADS_DEFINITION__MAX_QUEUE_SIZE, oldMaxQueueSize, MAX_QUEUE_SIZE_EDEFAULT, oldMaxQueueSizeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetMaxQueueSize() {
        return maxQueueSizeESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getPoolSize() {
        return poolSize;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPoolSize(int newPoolSize) {
        int oldPoolSize = poolSize;
        poolSize = newPoolSize;
        boolean oldPoolSizeESet = poolSizeESet;
        poolSizeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.THREADS_DEFINITION__POOL_SIZE, oldPoolSize, poolSize, !oldPoolSizeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetPoolSize() {
        int oldPoolSize = poolSize;
        boolean oldPoolSizeESet = poolSizeESet;
        poolSize = POOL_SIZE_EDEFAULT;
        poolSizeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.THREADS_DEFINITION__POOL_SIZE, oldPoolSize, POOL_SIZE_EDEFAULT, oldPoolSizeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetPoolSize() {
        return poolSizeESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ThreadPoolRejectedPolicy getRejectedPolicy() {
        return rejectedPolicy;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRejectedPolicy(ThreadPoolRejectedPolicy newRejectedPolicy) {
        ThreadPoolRejectedPolicy oldRejectedPolicy = rejectedPolicy;
        rejectedPolicy = newRejectedPolicy == null ? REJECTED_POLICY_EDEFAULT : newRejectedPolicy;
        boolean oldRejectedPolicyESet = rejectedPolicyESet;
        rejectedPolicyESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.THREADS_DEFINITION__REJECTED_POLICY, oldRejectedPolicy, rejectedPolicy, !oldRejectedPolicyESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetRejectedPolicy() {
        ThreadPoolRejectedPolicy oldRejectedPolicy = rejectedPolicy;
        boolean oldRejectedPolicyESet = rejectedPolicyESet;
        rejectedPolicy = REJECTED_POLICY_EDEFAULT;
        rejectedPolicyESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.THREADS_DEFINITION__REJECTED_POLICY, oldRejectedPolicy, REJECTED_POLICY_EDEFAULT, oldRejectedPolicyESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetRejectedPolicy() {
        return rejectedPolicyESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getThreadName() {
        return threadName;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setThreadName(String newThreadName) {
        String oldThreadName = threadName;
        threadName = newThreadName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.THREADS_DEFINITION__THREAD_NAME, oldThreadName, threadName));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getTimeUnit() {
        return timeUnit;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTimeUnit(String newTimeUnit) {
        String oldTimeUnit = timeUnit;
        timeUnit = newTimeUnit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.THREADS_DEFINITION__TIME_UNIT, oldTimeUnit, timeUnit));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute2() {
        if (anyAttribute2 == null) {
            anyAttribute2 = new BasicFeatureMap(this, SpringPackage.THREADS_DEFINITION__ANY_ATTRIBUTE2);
        }
        return anyAttribute2;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SpringPackage.THREADS_DEFINITION__ANY_ATTRIBUTE2:
                return ((InternalEList<?>)getAnyAttribute2()).basicRemove(otherEnd, msgs);
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
            case SpringPackage.THREADS_DEFINITION__CALLER_RUNS_WHEN_REJECTED:
                return isCallerRunsWhenRejected();
            case SpringPackage.THREADS_DEFINITION__EXECUTOR_SERVICE_REF:
                return getExecutorServiceRef();
            case SpringPackage.THREADS_DEFINITION__KEEP_ALIVE_TIME:
                return getKeepAliveTime();
            case SpringPackage.THREADS_DEFINITION__MAX_POOL_SIZE:
                return getMaxPoolSize();
            case SpringPackage.THREADS_DEFINITION__MAX_QUEUE_SIZE:
                return getMaxQueueSize();
            case SpringPackage.THREADS_DEFINITION__POOL_SIZE:
                return getPoolSize();
            case SpringPackage.THREADS_DEFINITION__REJECTED_POLICY:
                return getRejectedPolicy();
            case SpringPackage.THREADS_DEFINITION__THREAD_NAME:
                return getThreadName();
            case SpringPackage.THREADS_DEFINITION__TIME_UNIT:
                return getTimeUnit();
            case SpringPackage.THREADS_DEFINITION__ANY_ATTRIBUTE2:
                if (coreType) return getAnyAttribute2();
                return ((FeatureMap.Internal)getAnyAttribute2()).getWrapper();
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
            case SpringPackage.THREADS_DEFINITION__CALLER_RUNS_WHEN_REJECTED:
                setCallerRunsWhenRejected((Boolean)newValue);
                return;
            case SpringPackage.THREADS_DEFINITION__EXECUTOR_SERVICE_REF:
                setExecutorServiceRef((String)newValue);
                return;
            case SpringPackage.THREADS_DEFINITION__KEEP_ALIVE_TIME:
                setKeepAliveTime((Integer)newValue);
                return;
            case SpringPackage.THREADS_DEFINITION__MAX_POOL_SIZE:
                setMaxPoolSize((Integer)newValue);
                return;
            case SpringPackage.THREADS_DEFINITION__MAX_QUEUE_SIZE:
                setMaxQueueSize((Integer)newValue);
                return;
            case SpringPackage.THREADS_DEFINITION__POOL_SIZE:
                setPoolSize((Integer)newValue);
                return;
            case SpringPackage.THREADS_DEFINITION__REJECTED_POLICY:
                setRejectedPolicy((ThreadPoolRejectedPolicy)newValue);
                return;
            case SpringPackage.THREADS_DEFINITION__THREAD_NAME:
                setThreadName((String)newValue);
                return;
            case SpringPackage.THREADS_DEFINITION__TIME_UNIT:
                setTimeUnit((String)newValue);
                return;
            case SpringPackage.THREADS_DEFINITION__ANY_ATTRIBUTE2:
                ((FeatureMap.Internal)getAnyAttribute2()).set(newValue);
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
            case SpringPackage.THREADS_DEFINITION__CALLER_RUNS_WHEN_REJECTED:
                unsetCallerRunsWhenRejected();
                return;
            case SpringPackage.THREADS_DEFINITION__EXECUTOR_SERVICE_REF:
                setExecutorServiceRef(EXECUTOR_SERVICE_REF_EDEFAULT);
                return;
            case SpringPackage.THREADS_DEFINITION__KEEP_ALIVE_TIME:
                unsetKeepAliveTime();
                return;
            case SpringPackage.THREADS_DEFINITION__MAX_POOL_SIZE:
                unsetMaxPoolSize();
                return;
            case SpringPackage.THREADS_DEFINITION__MAX_QUEUE_SIZE:
                unsetMaxQueueSize();
                return;
            case SpringPackage.THREADS_DEFINITION__POOL_SIZE:
                unsetPoolSize();
                return;
            case SpringPackage.THREADS_DEFINITION__REJECTED_POLICY:
                unsetRejectedPolicy();
                return;
            case SpringPackage.THREADS_DEFINITION__THREAD_NAME:
                setThreadName(THREAD_NAME_EDEFAULT);
                return;
            case SpringPackage.THREADS_DEFINITION__TIME_UNIT:
                setTimeUnit(TIME_UNIT_EDEFAULT);
                return;
            case SpringPackage.THREADS_DEFINITION__ANY_ATTRIBUTE2:
                getAnyAttribute2().clear();
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
            case SpringPackage.THREADS_DEFINITION__CALLER_RUNS_WHEN_REJECTED:
                return isSetCallerRunsWhenRejected();
            case SpringPackage.THREADS_DEFINITION__EXECUTOR_SERVICE_REF:
                return EXECUTOR_SERVICE_REF_EDEFAULT == null ? executorServiceRef != null : !EXECUTOR_SERVICE_REF_EDEFAULT.equals(executorServiceRef);
            case SpringPackage.THREADS_DEFINITION__KEEP_ALIVE_TIME:
                return isSetKeepAliveTime();
            case SpringPackage.THREADS_DEFINITION__MAX_POOL_SIZE:
                return isSetMaxPoolSize();
            case SpringPackage.THREADS_DEFINITION__MAX_QUEUE_SIZE:
                return isSetMaxQueueSize();
            case SpringPackage.THREADS_DEFINITION__POOL_SIZE:
                return isSetPoolSize();
            case SpringPackage.THREADS_DEFINITION__REJECTED_POLICY:
                return isSetRejectedPolicy();
            case SpringPackage.THREADS_DEFINITION__THREAD_NAME:
                return THREAD_NAME_EDEFAULT == null ? threadName != null : !THREAD_NAME_EDEFAULT.equals(threadName);
            case SpringPackage.THREADS_DEFINITION__TIME_UNIT:
                return TIME_UNIT_EDEFAULT == null ? timeUnit != null : !TIME_UNIT_EDEFAULT.equals(timeUnit);
            case SpringPackage.THREADS_DEFINITION__ANY_ATTRIBUTE2:
                return anyAttribute2 != null && !anyAttribute2.isEmpty();
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
        result.append(" (callerRunsWhenRejected: ");
        if (callerRunsWhenRejectedESet) result.append(callerRunsWhenRejected); else result.append("<unset>");
        result.append(", executorServiceRef: ");
        result.append(executorServiceRef);
        result.append(", keepAliveTime: ");
        if (keepAliveTimeESet) result.append(keepAliveTime); else result.append("<unset>");
        result.append(", maxPoolSize: ");
        if (maxPoolSizeESet) result.append(maxPoolSize); else result.append("<unset>");
        result.append(", maxQueueSize: ");
        if (maxQueueSizeESet) result.append(maxQueueSize); else result.append("<unset>");
        result.append(", poolSize: ");
        if (poolSizeESet) result.append(poolSize); else result.append("<unset>");
        result.append(", rejectedPolicy: ");
        if (rejectedPolicyESet) result.append(rejectedPolicy); else result.append("<unset>");
        result.append(", threadName: ");
        result.append(threadName);
        result.append(", timeUnit: ");
        result.append(timeUnit);
        result.append(", anyAttribute2: ");
        result.append(anyAttribute2);
        result.append(')');
        return result.toString();
    }

} //ThreadsDefinitionImpl
