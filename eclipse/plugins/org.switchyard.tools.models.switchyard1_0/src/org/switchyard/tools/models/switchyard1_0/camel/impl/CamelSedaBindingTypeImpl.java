/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;


import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardBindingTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seda Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSedaBindingTypeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSedaBindingTypeImpl#getConcurrentConsumers <em>Concurrent Consumers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSedaBindingTypeImpl#getWaitForTaskToComplete <em>Wait For Task To Complete</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSedaBindingTypeImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSedaBindingTypeImpl#isMultipleConsumers <em>Multiple Consumers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSedaBindingTypeImpl#isLimitConcurrentConsumers <em>Limit Concurrent Consumers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelSedaBindingTypeImpl extends SwitchYardBindingTypeImpl implements CamelSedaBindingType {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConcurrentConsumers() <em>Concurrent Consumers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrentConsumers()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CONCURRENT_CONSUMERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConcurrentConsumers() <em>Concurrent Consumers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrentConsumers()
	 * @generated
	 * @ordered
	 */
	protected BigInteger concurrentConsumers = CONCURRENT_CONSUMERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaitForTaskToComplete() <em>Wait For Task To Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitForTaskToComplete()
	 * @generated
	 * @ordered
	 */
	protected static final String WAIT_FOR_TASK_TO_COMPLETE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaitForTaskToComplete() <em>Wait For Task To Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitForTaskToComplete()
	 * @generated
	 * @ordered
	 */
	protected String waitForTaskToComplete = WAIT_FOR_TASK_TO_COMPLETE_EDEFAULT;

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
	 * The default value of the '{@link #isMultipleConsumers() <em>Multiple Consumers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleConsumers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_CONSUMERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultipleConsumers() <em>Multiple Consumers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleConsumers()
	 * @generated
	 * @ordered
	 */
	protected boolean multipleConsumers = MULTIPLE_CONSUMERS_EDEFAULT;

	/**
	 * This is true if the Multiple Consumers attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multipleConsumersESet;

	/**
	 * The default value of the '{@link #isLimitConcurrentConsumers() <em>Limit Concurrent Consumers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLimitConcurrentConsumers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LIMIT_CONCURRENT_CONSUMERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLimitConcurrentConsumers() <em>Limit Concurrent Consumers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLimitConcurrentConsumers()
	 * @generated
	 * @ordered
	 */
	protected boolean limitConcurrentConsumers = LIMIT_CONCURRENT_CONSUMERS_EDEFAULT;

	/**
	 * This is true if the Limit Concurrent Consumers attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean limitConcurrentConsumersESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CamelSedaBindingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelPackage.Literals.CAMEL_SEDA_BINDING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(BigInteger newSize) {
		BigInteger oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_SEDA_BINDING_TYPE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getConcurrentConsumers() {
		return concurrentConsumers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrentConsumers(BigInteger newConcurrentConsumers) {
		BigInteger oldConcurrentConsumers = concurrentConsumers;
		concurrentConsumers = newConcurrentConsumers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_SEDA_BINDING_TYPE__CONCURRENT_CONSUMERS, oldConcurrentConsumers, concurrentConsumers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWaitForTaskToComplete() {
		return waitForTaskToComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitForTaskToComplete(String newWaitForTaskToComplete) {
		String oldWaitForTaskToComplete = waitForTaskToComplete;
		waitForTaskToComplete = newWaitForTaskToComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_SEDA_BINDING_TYPE__WAIT_FOR_TASK_TO_COMPLETE, oldWaitForTaskToComplete, waitForTaskToComplete));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_SEDA_BINDING_TYPE__TIMEOUT, oldTimeout, timeout, !oldTimeoutESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_SEDA_BINDING_TYPE__TIMEOUT, oldTimeout, TIMEOUT_EDEFAULT, oldTimeoutESet));
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
	public boolean isMultipleConsumers() {
		return multipleConsumers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleConsumers(boolean newMultipleConsumers) {
		boolean oldMultipleConsumers = multipleConsumers;
		multipleConsumers = newMultipleConsumers;
		boolean oldMultipleConsumersESet = multipleConsumersESet;
		multipleConsumersESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_SEDA_BINDING_TYPE__MULTIPLE_CONSUMERS, oldMultipleConsumers, multipleConsumers, !oldMultipleConsumersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMultipleConsumers() {
		boolean oldMultipleConsumers = multipleConsumers;
		boolean oldMultipleConsumersESet = multipleConsumersESet;
		multipleConsumers = MULTIPLE_CONSUMERS_EDEFAULT;
		multipleConsumersESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_SEDA_BINDING_TYPE__MULTIPLE_CONSUMERS, oldMultipleConsumers, MULTIPLE_CONSUMERS_EDEFAULT, oldMultipleConsumersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMultipleConsumers() {
		return multipleConsumersESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLimitConcurrentConsumers() {
		return limitConcurrentConsumers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitConcurrentConsumers(boolean newLimitConcurrentConsumers) {
		boolean oldLimitConcurrentConsumers = limitConcurrentConsumers;
		limitConcurrentConsumers = newLimitConcurrentConsumers;
		boolean oldLimitConcurrentConsumersESet = limitConcurrentConsumersESet;
		limitConcurrentConsumersESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_SEDA_BINDING_TYPE__LIMIT_CONCURRENT_CONSUMERS, oldLimitConcurrentConsumers, limitConcurrentConsumers, !oldLimitConcurrentConsumersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLimitConcurrentConsumers() {
		boolean oldLimitConcurrentConsumers = limitConcurrentConsumers;
		boolean oldLimitConcurrentConsumersESet = limitConcurrentConsumersESet;
		limitConcurrentConsumers = LIMIT_CONCURRENT_CONSUMERS_EDEFAULT;
		limitConcurrentConsumersESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_SEDA_BINDING_TYPE__LIMIT_CONCURRENT_CONSUMERS, oldLimitConcurrentConsumers, LIMIT_CONCURRENT_CONSUMERS_EDEFAULT, oldLimitConcurrentConsumersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLimitConcurrentConsumers() {
		return limitConcurrentConsumersESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__SIZE:
				return getSize();
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__CONCURRENT_CONSUMERS:
				return getConcurrentConsumers();
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__WAIT_FOR_TASK_TO_COMPLETE:
				return getWaitForTaskToComplete();
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__TIMEOUT:
				return getTimeout();
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__MULTIPLE_CONSUMERS:
				return isMultipleConsumers();
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__LIMIT_CONCURRENT_CONSUMERS:
				return isLimitConcurrentConsumers();
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
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__SIZE:
				setSize((BigInteger)newValue);
				return;
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__CONCURRENT_CONSUMERS:
				setConcurrentConsumers((BigInteger)newValue);
				return;
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__WAIT_FOR_TASK_TO_COMPLETE:
				setWaitForTaskToComplete((String)newValue);
				return;
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__TIMEOUT:
				setTimeout((Long)newValue);
				return;
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__MULTIPLE_CONSUMERS:
				setMultipleConsumers((Boolean)newValue);
				return;
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__LIMIT_CONCURRENT_CONSUMERS:
				setLimitConcurrentConsumers((Boolean)newValue);
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
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__CONCURRENT_CONSUMERS:
				setConcurrentConsumers(CONCURRENT_CONSUMERS_EDEFAULT);
				return;
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__WAIT_FOR_TASK_TO_COMPLETE:
				setWaitForTaskToComplete(WAIT_FOR_TASK_TO_COMPLETE_EDEFAULT);
				return;
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__TIMEOUT:
				unsetTimeout();
				return;
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__MULTIPLE_CONSUMERS:
				unsetMultipleConsumers();
				return;
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__LIMIT_CONCURRENT_CONSUMERS:
				unsetLimitConcurrentConsumers();
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
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__CONCURRENT_CONSUMERS:
				return CONCURRENT_CONSUMERS_EDEFAULT == null ? concurrentConsumers != null : !CONCURRENT_CONSUMERS_EDEFAULT.equals(concurrentConsumers);
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__WAIT_FOR_TASK_TO_COMPLETE:
				return WAIT_FOR_TASK_TO_COMPLETE_EDEFAULT == null ? waitForTaskToComplete != null : !WAIT_FOR_TASK_TO_COMPLETE_EDEFAULT.equals(waitForTaskToComplete);
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__TIMEOUT:
				return isSetTimeout();
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__MULTIPLE_CONSUMERS:
				return isSetMultipleConsumers();
			case CamelPackage.CAMEL_SEDA_BINDING_TYPE__LIMIT_CONCURRENT_CONSUMERS:
				return isSetLimitConcurrentConsumers();
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
		result.append(" (size: ");
		result.append(size);
		result.append(", concurrentConsumers: ");
		result.append(concurrentConsumers);
		result.append(", waitForTaskToComplete: ");
		result.append(waitForTaskToComplete);
		result.append(", timeout: ");
		if (timeoutESet) result.append(timeout); else result.append("<unset>");
		result.append(", multipleConsumers: ");
		if (multipleConsumersESet) result.append(multipleConsumers); else result.append("<unset>");
		result.append(", limitConcurrentConsumers: ");
		if (limitConcurrentConsumersESet) result.append(limitConcurrentConsumers); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CamelSedaBindingTypeImpl
