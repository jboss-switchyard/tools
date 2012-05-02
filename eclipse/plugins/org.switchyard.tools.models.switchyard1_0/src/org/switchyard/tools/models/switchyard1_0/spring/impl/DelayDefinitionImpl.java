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

import org.switchyard.tools.models.switchyard1_0.spring.DelayDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delay Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DelayDefinitionImpl#isAsyncDelayed <em>Async Delayed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DelayDefinitionImpl#isCallerRunsWhenRejected <em>Caller Runs When Rejected</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DelayDefinitionImpl#getExecutorServiceRef <em>Executor Service Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DelayDefinitionImpl#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelayDefinitionImpl extends ExpressionNodeImpl implements DelayDefinition {
	/**
	 * The default value of the '{@link #isAsyncDelayed() <em>Async Delayed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsyncDelayed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASYNC_DELAYED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAsyncDelayed() <em>Async Delayed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsyncDelayed()
	 * @generated
	 * @ordered
	 */
	protected boolean asyncDelayed = ASYNC_DELAYED_EDEFAULT;

	/**
	 * This is true if the Async Delayed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean asyncDelayedESet;

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
	protected DelayDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getDelayDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAsyncDelayed() {
		return asyncDelayed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsyncDelayed(boolean newAsyncDelayed) {
		boolean oldAsyncDelayed = asyncDelayed;
		asyncDelayed = newAsyncDelayed;
		boolean oldAsyncDelayedESet = asyncDelayedESet;
		asyncDelayedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.DELAY_DEFINITION__ASYNC_DELAYED, oldAsyncDelayed, asyncDelayed, !oldAsyncDelayedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAsyncDelayed() {
		boolean oldAsyncDelayed = asyncDelayed;
		boolean oldAsyncDelayedESet = asyncDelayedESet;
		asyncDelayed = ASYNC_DELAYED_EDEFAULT;
		asyncDelayedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.DELAY_DEFINITION__ASYNC_DELAYED, oldAsyncDelayed, ASYNC_DELAYED_EDEFAULT, oldAsyncDelayedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAsyncDelayed() {
		return asyncDelayedESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.DELAY_DEFINITION__CALLER_RUNS_WHEN_REJECTED, oldCallerRunsWhenRejected, callerRunsWhenRejected, !oldCallerRunsWhenRejectedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.DELAY_DEFINITION__CALLER_RUNS_WHEN_REJECTED, oldCallerRunsWhenRejected, CALLER_RUNS_WHEN_REJECTED_EDEFAULT, oldCallerRunsWhenRejectedESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.DELAY_DEFINITION__EXECUTOR_SERVICE_REF, oldExecutorServiceRef, executorServiceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute2() {
		if (anyAttribute2 == null) {
			anyAttribute2 = new BasicFeatureMap(this, SpringPackage.DELAY_DEFINITION__ANY_ATTRIBUTE2);
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
			case SpringPackage.DELAY_DEFINITION__ANY_ATTRIBUTE2:
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
			case SpringPackage.DELAY_DEFINITION__ASYNC_DELAYED:
				return isAsyncDelayed();
			case SpringPackage.DELAY_DEFINITION__CALLER_RUNS_WHEN_REJECTED:
				return isCallerRunsWhenRejected();
			case SpringPackage.DELAY_DEFINITION__EXECUTOR_SERVICE_REF:
				return getExecutorServiceRef();
			case SpringPackage.DELAY_DEFINITION__ANY_ATTRIBUTE2:
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
			case SpringPackage.DELAY_DEFINITION__ASYNC_DELAYED:
				setAsyncDelayed((Boolean)newValue);
				return;
			case SpringPackage.DELAY_DEFINITION__CALLER_RUNS_WHEN_REJECTED:
				setCallerRunsWhenRejected((Boolean)newValue);
				return;
			case SpringPackage.DELAY_DEFINITION__EXECUTOR_SERVICE_REF:
				setExecutorServiceRef((String)newValue);
				return;
			case SpringPackage.DELAY_DEFINITION__ANY_ATTRIBUTE2:
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
			case SpringPackage.DELAY_DEFINITION__ASYNC_DELAYED:
				unsetAsyncDelayed();
				return;
			case SpringPackage.DELAY_DEFINITION__CALLER_RUNS_WHEN_REJECTED:
				unsetCallerRunsWhenRejected();
				return;
			case SpringPackage.DELAY_DEFINITION__EXECUTOR_SERVICE_REF:
				setExecutorServiceRef(EXECUTOR_SERVICE_REF_EDEFAULT);
				return;
			case SpringPackage.DELAY_DEFINITION__ANY_ATTRIBUTE2:
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
			case SpringPackage.DELAY_DEFINITION__ASYNC_DELAYED:
				return isSetAsyncDelayed();
			case SpringPackage.DELAY_DEFINITION__CALLER_RUNS_WHEN_REJECTED:
				return isSetCallerRunsWhenRejected();
			case SpringPackage.DELAY_DEFINITION__EXECUTOR_SERVICE_REF:
				return EXECUTOR_SERVICE_REF_EDEFAULT == null ? executorServiceRef != null : !EXECUTOR_SERVICE_REF_EDEFAULT.equals(executorServiceRef);
			case SpringPackage.DELAY_DEFINITION__ANY_ATTRIBUTE2:
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
		result.append(" (asyncDelayed: ");
		if (asyncDelayedESet) result.append(asyncDelayed); else result.append("<unset>");
		result.append(", callerRunsWhenRejected: ");
		if (callerRunsWhenRejectedESet) result.append(callerRunsWhenRejected); else result.append("<unset>");
		result.append(", executorServiceRef: ");
		result.append(executorServiceRef);
		result.append(", anyAttribute2: ");
		result.append(anyAttribute2);
		result.append(')');
		return result.toString();
	}

} //DelayDefinitionImpl
