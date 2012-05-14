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

import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.WeightedLoadBalancerDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weighted Load Balancer Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.WeightedLoadBalancerDefinitionImpl#getDistributionRatio <em>Distribution Ratio</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.WeightedLoadBalancerDefinitionImpl#getDistributionRatioDelimiter <em>Distribution Ratio Delimiter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.WeightedLoadBalancerDefinitionImpl#isRoundRobin <em>Round Robin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeightedLoadBalancerDefinitionImpl extends LoadBalancerImpl implements WeightedLoadBalancerDefinition {
	/**
     * The default value of the '{@link #getDistributionRatio() <em>Distribution Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDistributionRatio()
     * @generated
     * @ordered
     */
	protected static final String DISTRIBUTION_RATIO_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDistributionRatio() <em>Distribution Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDistributionRatio()
     * @generated
     * @ordered
     */
	protected String distributionRatio = DISTRIBUTION_RATIO_EDEFAULT;

	/**
     * The default value of the '{@link #getDistributionRatioDelimiter() <em>Distribution Ratio Delimiter</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDistributionRatioDelimiter()
     * @generated
     * @ordered
     */
	protected static final String DISTRIBUTION_RATIO_DELIMITER_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDistributionRatioDelimiter() <em>Distribution Ratio Delimiter</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDistributionRatioDelimiter()
     * @generated
     * @ordered
     */
	protected String distributionRatioDelimiter = DISTRIBUTION_RATIO_DELIMITER_EDEFAULT;

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
	protected WeightedLoadBalancerDefinitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getWeightedLoadBalancerDefinition();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDistributionRatio() {
        return distributionRatio;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDistributionRatio(String newDistributionRatio) {
        String oldDistributionRatio = distributionRatio;
        distributionRatio = newDistributionRatio;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__DISTRIBUTION_RATIO, oldDistributionRatio, distributionRatio));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDistributionRatioDelimiter() {
        return distributionRatioDelimiter;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDistributionRatioDelimiter(String newDistributionRatioDelimiter) {
        String oldDistributionRatioDelimiter = distributionRatioDelimiter;
        distributionRatioDelimiter = newDistributionRatioDelimiter;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__DISTRIBUTION_RATIO_DELIMITER, oldDistributionRatioDelimiter, distributionRatioDelimiter));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__ROUND_ROBIN, oldRoundRobin, roundRobin, !oldRoundRobinESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__ROUND_ROBIN, oldRoundRobin, ROUND_ROBIN_EDEFAULT, oldRoundRobinESet));
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
            case SpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__DISTRIBUTION_RATIO:
                return getDistributionRatio();
            case SpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__DISTRIBUTION_RATIO_DELIMITER:
                return getDistributionRatioDelimiter();
            case SpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__ROUND_ROBIN:
                return isRoundRobin();
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
            case SpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__DISTRIBUTION_RATIO:
                setDistributionRatio((String)newValue);
                return;
            case SpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__DISTRIBUTION_RATIO_DELIMITER:
                setDistributionRatioDelimiter((String)newValue);
                return;
            case SpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__ROUND_ROBIN:
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
            case SpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__DISTRIBUTION_RATIO:
                setDistributionRatio(DISTRIBUTION_RATIO_EDEFAULT);
                return;
            case SpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__DISTRIBUTION_RATIO_DELIMITER:
                setDistributionRatioDelimiter(DISTRIBUTION_RATIO_DELIMITER_EDEFAULT);
                return;
            case SpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__ROUND_ROBIN:
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
            case SpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__DISTRIBUTION_RATIO:
                return DISTRIBUTION_RATIO_EDEFAULT == null ? distributionRatio != null : !DISTRIBUTION_RATIO_EDEFAULT.equals(distributionRatio);
            case SpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__DISTRIBUTION_RATIO_DELIMITER:
                return DISTRIBUTION_RATIO_DELIMITER_EDEFAULT == null ? distributionRatioDelimiter != null : !DISTRIBUTION_RATIO_DELIMITER_EDEFAULT.equals(distributionRatioDelimiter);
            case SpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION__ROUND_ROBIN:
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
        result.append(" (distributionRatio: ");
        result.append(distributionRatio);
        result.append(", distributionRatioDelimiter: ");
        result.append(distributionRatioDelimiter);
        result.append(", roundRobin: ");
        if (roundRobinESet) result.append(roundRobin); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //WeightedLoadBalancerDefinitionImpl
