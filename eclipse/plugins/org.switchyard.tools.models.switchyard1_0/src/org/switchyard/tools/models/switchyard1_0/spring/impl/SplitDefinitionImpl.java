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

import org.switchyard.tools.models.switchyard1_0.spring.SplitDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Split Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.SplitDefinitionImpl#getExecutorServiceRef <em>Executor Service Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.SplitDefinitionImpl#getOnPrepareRef <em>On Prepare Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.SplitDefinitionImpl#isParallelProcessing <em>Parallel Processing</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.SplitDefinitionImpl#isShareUnitOfWork <em>Share Unit Of Work</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.SplitDefinitionImpl#isStopOnException <em>Stop On Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.SplitDefinitionImpl#getStrategyRef <em>Strategy Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.SplitDefinitionImpl#isStreaming <em>Streaming</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.SplitDefinitionImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.SplitDefinitionImpl#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SplitDefinitionImpl extends ExpressionNodeImpl implements SplitDefinition {
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
     * The default value of the '{@link #getOnPrepareRef() <em>On Prepare Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOnPrepareRef()
     * @generated
     * @ordered
     */
	protected static final String ON_PREPARE_REF_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getOnPrepareRef() <em>On Prepare Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOnPrepareRef()
     * @generated
     * @ordered
     */
	protected String onPrepareRef = ON_PREPARE_REF_EDEFAULT;

	/**
     * The default value of the '{@link #isParallelProcessing() <em>Parallel Processing</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isParallelProcessing()
     * @generated
     * @ordered
     */
	protected static final boolean PARALLEL_PROCESSING_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isParallelProcessing() <em>Parallel Processing</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isParallelProcessing()
     * @generated
     * @ordered
     */
	protected boolean parallelProcessing = PARALLEL_PROCESSING_EDEFAULT;

	/**
     * This is true if the Parallel Processing attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean parallelProcessingESet;

	/**
     * The default value of the '{@link #isShareUnitOfWork() <em>Share Unit Of Work</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isShareUnitOfWork()
     * @generated
     * @ordered
     */
	protected static final boolean SHARE_UNIT_OF_WORK_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isShareUnitOfWork() <em>Share Unit Of Work</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isShareUnitOfWork()
     * @generated
     * @ordered
     */
	protected boolean shareUnitOfWork = SHARE_UNIT_OF_WORK_EDEFAULT;

	/**
     * This is true if the Share Unit Of Work attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean shareUnitOfWorkESet;

	/**
     * The default value of the '{@link #isStopOnException() <em>Stop On Exception</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isStopOnException()
     * @generated
     * @ordered
     */
	protected static final boolean STOP_ON_EXCEPTION_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isStopOnException() <em>Stop On Exception</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isStopOnException()
     * @generated
     * @ordered
     */
	protected boolean stopOnException = STOP_ON_EXCEPTION_EDEFAULT;

	/**
     * This is true if the Stop On Exception attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean stopOnExceptionESet;

	/**
     * The default value of the '{@link #getStrategyRef() <em>Strategy Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStrategyRef()
     * @generated
     * @ordered
     */
	protected static final String STRATEGY_REF_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getStrategyRef() <em>Strategy Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStrategyRef()
     * @generated
     * @ordered
     */
	protected String strategyRef = STRATEGY_REF_EDEFAULT;

	/**
     * The default value of the '{@link #isStreaming() <em>Streaming</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isStreaming()
     * @generated
     * @ordered
     */
	protected static final boolean STREAMING_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isStreaming() <em>Streaming</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isStreaming()
     * @generated
     * @ordered
     */
	protected boolean streaming = STREAMING_EDEFAULT;

	/**
     * This is true if the Streaming attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean streamingESet;

	/**
     * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTimeout()
     * @generated
     * @ordered
     */
	protected static final long TIMEOUT_EDEFAULT = 0L;

	/**
     * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTimeout()
     * @generated
     * @ordered
     */
	protected long timeout = TIMEOUT_EDEFAULT;

	/**
     * This is true if the Timeout attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean timeoutESet;

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
	protected SplitDefinitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getSplitDefinition();
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
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.SPLIT_DEFINITION__EXECUTOR_SERVICE_REF, oldExecutorServiceRef, executorServiceRef));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getOnPrepareRef() {
        return onPrepareRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOnPrepareRef(String newOnPrepareRef) {
        String oldOnPrepareRef = onPrepareRef;
        onPrepareRef = newOnPrepareRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.SPLIT_DEFINITION__ON_PREPARE_REF, oldOnPrepareRef, onPrepareRef));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isParallelProcessing() {
        return parallelProcessing;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setParallelProcessing(boolean newParallelProcessing) {
        boolean oldParallelProcessing = parallelProcessing;
        parallelProcessing = newParallelProcessing;
        boolean oldParallelProcessingESet = parallelProcessingESet;
        parallelProcessingESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.SPLIT_DEFINITION__PARALLEL_PROCESSING, oldParallelProcessing, parallelProcessing, !oldParallelProcessingESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetParallelProcessing() {
        boolean oldParallelProcessing = parallelProcessing;
        boolean oldParallelProcessingESet = parallelProcessingESet;
        parallelProcessing = PARALLEL_PROCESSING_EDEFAULT;
        parallelProcessingESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.SPLIT_DEFINITION__PARALLEL_PROCESSING, oldParallelProcessing, PARALLEL_PROCESSING_EDEFAULT, oldParallelProcessingESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetParallelProcessing() {
        return parallelProcessingESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isShareUnitOfWork() {
        return shareUnitOfWork;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setShareUnitOfWork(boolean newShareUnitOfWork) {
        boolean oldShareUnitOfWork = shareUnitOfWork;
        shareUnitOfWork = newShareUnitOfWork;
        boolean oldShareUnitOfWorkESet = shareUnitOfWorkESet;
        shareUnitOfWorkESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.SPLIT_DEFINITION__SHARE_UNIT_OF_WORK, oldShareUnitOfWork, shareUnitOfWork, !oldShareUnitOfWorkESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetShareUnitOfWork() {
        boolean oldShareUnitOfWork = shareUnitOfWork;
        boolean oldShareUnitOfWorkESet = shareUnitOfWorkESet;
        shareUnitOfWork = SHARE_UNIT_OF_WORK_EDEFAULT;
        shareUnitOfWorkESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.SPLIT_DEFINITION__SHARE_UNIT_OF_WORK, oldShareUnitOfWork, SHARE_UNIT_OF_WORK_EDEFAULT, oldShareUnitOfWorkESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetShareUnitOfWork() {
        return shareUnitOfWorkESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isStopOnException() {
        return stopOnException;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStopOnException(boolean newStopOnException) {
        boolean oldStopOnException = stopOnException;
        stopOnException = newStopOnException;
        boolean oldStopOnExceptionESet = stopOnExceptionESet;
        stopOnExceptionESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.SPLIT_DEFINITION__STOP_ON_EXCEPTION, oldStopOnException, stopOnException, !oldStopOnExceptionESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetStopOnException() {
        boolean oldStopOnException = stopOnException;
        boolean oldStopOnExceptionESet = stopOnExceptionESet;
        stopOnException = STOP_ON_EXCEPTION_EDEFAULT;
        stopOnExceptionESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.SPLIT_DEFINITION__STOP_ON_EXCEPTION, oldStopOnException, STOP_ON_EXCEPTION_EDEFAULT, oldStopOnExceptionESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetStopOnException() {
        return stopOnExceptionESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getStrategyRef() {
        return strategyRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStrategyRef(String newStrategyRef) {
        String oldStrategyRef = strategyRef;
        strategyRef = newStrategyRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.SPLIT_DEFINITION__STRATEGY_REF, oldStrategyRef, strategyRef));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isStreaming() {
        return streaming;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStreaming(boolean newStreaming) {
        boolean oldStreaming = streaming;
        streaming = newStreaming;
        boolean oldStreamingESet = streamingESet;
        streamingESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.SPLIT_DEFINITION__STREAMING, oldStreaming, streaming, !oldStreamingESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetStreaming() {
        boolean oldStreaming = streaming;
        boolean oldStreamingESet = streamingESet;
        streaming = STREAMING_EDEFAULT;
        streamingESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.SPLIT_DEFINITION__STREAMING, oldStreaming, STREAMING_EDEFAULT, oldStreamingESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetStreaming() {
        return streamingESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public long getTimeout() {
        return timeout;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTimeout(long newTimeout) {
        long oldTimeout = timeout;
        timeout = newTimeout;
        boolean oldTimeoutESet = timeoutESet;
        timeoutESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.SPLIT_DEFINITION__TIMEOUT, oldTimeout, timeout, !oldTimeoutESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetTimeout() {
        long oldTimeout = timeout;
        boolean oldTimeoutESet = timeoutESet;
        timeout = TIMEOUT_EDEFAULT;
        timeoutESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.SPLIT_DEFINITION__TIMEOUT, oldTimeout, TIMEOUT_EDEFAULT, oldTimeoutESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetTimeout() {
        return timeoutESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute2() {
        if (anyAttribute2 == null) {
            anyAttribute2 = new BasicFeatureMap(this, SpringPackage.SPLIT_DEFINITION__ANY_ATTRIBUTE2);
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
            case SpringPackage.SPLIT_DEFINITION__ANY_ATTRIBUTE2:
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
            case SpringPackage.SPLIT_DEFINITION__EXECUTOR_SERVICE_REF:
                return getExecutorServiceRef();
            case SpringPackage.SPLIT_DEFINITION__ON_PREPARE_REF:
                return getOnPrepareRef();
            case SpringPackage.SPLIT_DEFINITION__PARALLEL_PROCESSING:
                return isParallelProcessing();
            case SpringPackage.SPLIT_DEFINITION__SHARE_UNIT_OF_WORK:
                return isShareUnitOfWork();
            case SpringPackage.SPLIT_DEFINITION__STOP_ON_EXCEPTION:
                return isStopOnException();
            case SpringPackage.SPLIT_DEFINITION__STRATEGY_REF:
                return getStrategyRef();
            case SpringPackage.SPLIT_DEFINITION__STREAMING:
                return isStreaming();
            case SpringPackage.SPLIT_DEFINITION__TIMEOUT:
                return getTimeout();
            case SpringPackage.SPLIT_DEFINITION__ANY_ATTRIBUTE2:
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
            case SpringPackage.SPLIT_DEFINITION__EXECUTOR_SERVICE_REF:
                setExecutorServiceRef((String)newValue);
                return;
            case SpringPackage.SPLIT_DEFINITION__ON_PREPARE_REF:
                setOnPrepareRef((String)newValue);
                return;
            case SpringPackage.SPLIT_DEFINITION__PARALLEL_PROCESSING:
                setParallelProcessing((Boolean)newValue);
                return;
            case SpringPackage.SPLIT_DEFINITION__SHARE_UNIT_OF_WORK:
                setShareUnitOfWork((Boolean)newValue);
                return;
            case SpringPackage.SPLIT_DEFINITION__STOP_ON_EXCEPTION:
                setStopOnException((Boolean)newValue);
                return;
            case SpringPackage.SPLIT_DEFINITION__STRATEGY_REF:
                setStrategyRef((String)newValue);
                return;
            case SpringPackage.SPLIT_DEFINITION__STREAMING:
                setStreaming((Boolean)newValue);
                return;
            case SpringPackage.SPLIT_DEFINITION__TIMEOUT:
                setTimeout((Long)newValue);
                return;
            case SpringPackage.SPLIT_DEFINITION__ANY_ATTRIBUTE2:
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
            case SpringPackage.SPLIT_DEFINITION__EXECUTOR_SERVICE_REF:
                setExecutorServiceRef(EXECUTOR_SERVICE_REF_EDEFAULT);
                return;
            case SpringPackage.SPLIT_DEFINITION__ON_PREPARE_REF:
                setOnPrepareRef(ON_PREPARE_REF_EDEFAULT);
                return;
            case SpringPackage.SPLIT_DEFINITION__PARALLEL_PROCESSING:
                unsetParallelProcessing();
                return;
            case SpringPackage.SPLIT_DEFINITION__SHARE_UNIT_OF_WORK:
                unsetShareUnitOfWork();
                return;
            case SpringPackage.SPLIT_DEFINITION__STOP_ON_EXCEPTION:
                unsetStopOnException();
                return;
            case SpringPackage.SPLIT_DEFINITION__STRATEGY_REF:
                setStrategyRef(STRATEGY_REF_EDEFAULT);
                return;
            case SpringPackage.SPLIT_DEFINITION__STREAMING:
                unsetStreaming();
                return;
            case SpringPackage.SPLIT_DEFINITION__TIMEOUT:
                unsetTimeout();
                return;
            case SpringPackage.SPLIT_DEFINITION__ANY_ATTRIBUTE2:
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
            case SpringPackage.SPLIT_DEFINITION__EXECUTOR_SERVICE_REF:
                return EXECUTOR_SERVICE_REF_EDEFAULT == null ? executorServiceRef != null : !EXECUTOR_SERVICE_REF_EDEFAULT.equals(executorServiceRef);
            case SpringPackage.SPLIT_DEFINITION__ON_PREPARE_REF:
                return ON_PREPARE_REF_EDEFAULT == null ? onPrepareRef != null : !ON_PREPARE_REF_EDEFAULT.equals(onPrepareRef);
            case SpringPackage.SPLIT_DEFINITION__PARALLEL_PROCESSING:
                return isSetParallelProcessing();
            case SpringPackage.SPLIT_DEFINITION__SHARE_UNIT_OF_WORK:
                return isSetShareUnitOfWork();
            case SpringPackage.SPLIT_DEFINITION__STOP_ON_EXCEPTION:
                return isSetStopOnException();
            case SpringPackage.SPLIT_DEFINITION__STRATEGY_REF:
                return STRATEGY_REF_EDEFAULT == null ? strategyRef != null : !STRATEGY_REF_EDEFAULT.equals(strategyRef);
            case SpringPackage.SPLIT_DEFINITION__STREAMING:
                return isSetStreaming();
            case SpringPackage.SPLIT_DEFINITION__TIMEOUT:
                return isSetTimeout();
            case SpringPackage.SPLIT_DEFINITION__ANY_ATTRIBUTE2:
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
        result.append(" (executorServiceRef: ");
        result.append(executorServiceRef);
        result.append(", onPrepareRef: ");
        result.append(onPrepareRef);
        result.append(", parallelProcessing: ");
        if (parallelProcessingESet) result.append(parallelProcessing); else result.append("<unset>");
        result.append(", shareUnitOfWork: ");
        if (shareUnitOfWorkESet) result.append(shareUnitOfWork); else result.append("<unset>");
        result.append(", stopOnException: ");
        if (stopOnExceptionESet) result.append(stopOnException); else result.append("<unset>");
        result.append(", strategyRef: ");
        result.append(strategyRef);
        result.append(", streaming: ");
        if (streamingESet) result.append(streaming); else result.append("<unset>");
        result.append(", timeout: ");
        if (timeoutESet) result.append(timeout); else result.append("<unset>");
        result.append(", anyAttribute2: ");
        result.append(anyAttribute2);
        result.append(')');
        return result.toString();
    }

} //SplitDefinitionImpl
