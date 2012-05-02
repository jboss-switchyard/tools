/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.switchyard.tools.models.switchyard1_0.spring.FailoverLoadBalancerDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failover Load Balancer Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.FailoverLoadBalancerDefinitionImpl#getException <em>Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.FailoverLoadBalancerDefinitionImpl#getMaximumFailoverAttempts <em>Maximum Failover Attempts</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.FailoverLoadBalancerDefinitionImpl#isRoundRobin <em>Round Robin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FailoverLoadBalancerDefinitionImpl extends LoadBalancerImpl implements FailoverLoadBalancerDefinition {
	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected EList<String> exception;

	/**
	 * The default value of the '{@link #getMaximumFailoverAttempts() <em>Maximum Failover Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumFailoverAttempts()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_FAILOVER_ATTEMPTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaximumFailoverAttempts() <em>Maximum Failover Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumFailoverAttempts()
	 * @generated
	 * @ordered
	 */
	protected int maximumFailoverAttempts = MAXIMUM_FAILOVER_ATTEMPTS_EDEFAULT;

	/**
	 * This is true if the Maximum Failover Attempts attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumFailoverAttemptsESet;

	/**
	 * The default value of the '{@link #isRoundRobin() <em>Round Robin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoundRobin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROUND_ROBIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRoundRobin() <em>Round Robin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoundRobin()
	 * @generated
	 * @ordered
	 */
	protected boolean roundRobin = ROUND_ROBIN_EDEFAULT;

	/**
	 * This is true if the Round Robin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean roundRobinESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailoverLoadBalancerDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getFailoverLoadBalancerDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getException() {
		if (exception == null) {
			exception = new EDataTypeEList<String>(String.class, this, SpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__EXCEPTION);
		}
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaximumFailoverAttempts() {
		return maximumFailoverAttempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumFailoverAttempts(int newMaximumFailoverAttempts) {
		int oldMaximumFailoverAttempts = maximumFailoverAttempts;
		maximumFailoverAttempts = newMaximumFailoverAttempts;
		boolean oldMaximumFailoverAttemptsESet = maximumFailoverAttemptsESet;
		maximumFailoverAttemptsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__MAXIMUM_FAILOVER_ATTEMPTS, oldMaximumFailoverAttempts, maximumFailoverAttempts, !oldMaximumFailoverAttemptsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumFailoverAttempts() {
		int oldMaximumFailoverAttempts = maximumFailoverAttempts;
		boolean oldMaximumFailoverAttemptsESet = maximumFailoverAttemptsESet;
		maximumFailoverAttempts = MAXIMUM_FAILOVER_ATTEMPTS_EDEFAULT;
		maximumFailoverAttemptsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__MAXIMUM_FAILOVER_ATTEMPTS, oldMaximumFailoverAttempts, MAXIMUM_FAILOVER_ATTEMPTS_EDEFAULT, oldMaximumFailoverAttemptsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumFailoverAttempts() {
		return maximumFailoverAttemptsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRoundRobin() {
		return roundRobin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoundRobin(boolean newRoundRobin) {
		boolean oldRoundRobin = roundRobin;
		roundRobin = newRoundRobin;
		boolean oldRoundRobinESet = roundRobinESet;
		roundRobinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__ROUND_ROBIN, oldRoundRobin, roundRobin, !oldRoundRobinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRoundRobin() {
		boolean oldRoundRobin = roundRobin;
		boolean oldRoundRobinESet = roundRobinESet;
		roundRobin = ROUND_ROBIN_EDEFAULT;
		roundRobinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__ROUND_ROBIN, oldRoundRobin, ROUND_ROBIN_EDEFAULT, oldRoundRobinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRoundRobin() {
		return roundRobinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__EXCEPTION:
				return getException();
			case SpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__MAXIMUM_FAILOVER_ATTEMPTS:
				return getMaximumFailoverAttempts();
			case SpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__ROUND_ROBIN:
				return isRoundRobin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__EXCEPTION:
				getException().clear();
				getException().addAll((Collection<? extends String>)newValue);
				return;
			case SpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__MAXIMUM_FAILOVER_ATTEMPTS:
				setMaximumFailoverAttempts((Integer)newValue);
				return;
			case SpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__ROUND_ROBIN:
				setRoundRobin((Boolean)newValue);
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
			case SpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__EXCEPTION:
				getException().clear();
				return;
			case SpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__MAXIMUM_FAILOVER_ATTEMPTS:
				unsetMaximumFailoverAttempts();
				return;
			case SpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__ROUND_ROBIN:
				unsetRoundRobin();
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
			case SpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__EXCEPTION:
				return exception != null && !exception.isEmpty();
			case SpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__MAXIMUM_FAILOVER_ATTEMPTS:
				return isSetMaximumFailoverAttempts();
			case SpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION__ROUND_ROBIN:
				return isSetRoundRobin();
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
		result.append(" (exception: ");
		result.append(exception);
		result.append(", maximumFailoverAttempts: ");
		if (maximumFailoverAttemptsESet) result.append(maximumFailoverAttempts); else result.append("<unset>");
		result.append(", roundRobin: ");
		if (roundRobinESet) result.append(roundRobin); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FailoverLoadBalancerDefinitionImpl
