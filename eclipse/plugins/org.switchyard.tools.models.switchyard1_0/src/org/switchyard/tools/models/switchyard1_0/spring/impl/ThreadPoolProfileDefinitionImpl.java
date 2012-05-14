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
import org.switchyard.tools.models.switchyard1_0.spring.ThreadPoolProfileDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ThreadPoolRejectedPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thread Pool Profile Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ThreadPoolProfileDefinitionImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ThreadPoolProfileDefinitionImpl#isDefaultProfile <em>Default Profile</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ThreadPoolProfileDefinitionImpl#getKeepAliveTime <em>Keep Alive Time</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ThreadPoolProfileDefinitionImpl#getMaxPoolSize <em>Max Pool Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ThreadPoolProfileDefinitionImpl#getMaxQueueSize <em>Max Queue Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ThreadPoolProfileDefinitionImpl#getPoolSize <em>Pool Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ThreadPoolProfileDefinitionImpl#getRejectedPolicy <em>Rejected Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThreadPoolProfileDefinitionImpl extends OptionalIdentifiedDefinitionImpl implements ThreadPoolProfileDefinition {
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
     * The default value of the '{@link #isDefaultProfile() <em>Default Profile</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isDefaultProfile()
     * @generated
     * @ordered
     */
	protected static final boolean DEFAULT_PROFILE_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isDefaultProfile() <em>Default Profile</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isDefaultProfile()
     * @generated
     * @ordered
     */
	protected boolean defaultProfile = DEFAULT_PROFILE_EDEFAULT;

	/**
     * This is true if the Default Profile attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean defaultProfileESet;

	/**
     * The default value of the '{@link #getKeepAliveTime() <em>Keep Alive Time</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKeepAliveTime()
     * @generated
     * @ordered
     */
	protected static final String KEEP_ALIVE_TIME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getKeepAliveTime() <em>Keep Alive Time</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKeepAliveTime()
     * @generated
     * @ordered
     */
	protected String keepAliveTime = KEEP_ALIVE_TIME_EDEFAULT;

	/**
     * The default value of the '{@link #getMaxPoolSize() <em>Max Pool Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxPoolSize()
     * @generated
     * @ordered
     */
	protected static final String MAX_POOL_SIZE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMaxPoolSize() <em>Max Pool Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxPoolSize()
     * @generated
     * @ordered
     */
	protected String maxPoolSize = MAX_POOL_SIZE_EDEFAULT;

	/**
     * The default value of the '{@link #getMaxQueueSize() <em>Max Queue Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxQueueSize()
     * @generated
     * @ordered
     */
	protected static final String MAX_QUEUE_SIZE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMaxQueueSize() <em>Max Queue Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxQueueSize()
     * @generated
     * @ordered
     */
	protected String maxQueueSize = MAX_QUEUE_SIZE_EDEFAULT;

	/**
     * The default value of the '{@link #getPoolSize() <em>Pool Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPoolSize()
     * @generated
     * @ordered
     */
	protected static final String POOL_SIZE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getPoolSize() <em>Pool Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPoolSize()
     * @generated
     * @ordered
     */
	protected String poolSize = POOL_SIZE_EDEFAULT;

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
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ThreadPoolProfileDefinitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getThreadPoolProfileDefinition();
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
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.THREAD_POOL_PROFILE_DEFINITION__TIME_UNIT, oldTimeUnit, timeUnit));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isDefaultProfile() {
        return defaultProfile;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDefaultProfile(boolean newDefaultProfile) {
        boolean oldDefaultProfile = defaultProfile;
        defaultProfile = newDefaultProfile;
        boolean oldDefaultProfileESet = defaultProfileESet;
        defaultProfileESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.THREAD_POOL_PROFILE_DEFINITION__DEFAULT_PROFILE, oldDefaultProfile, defaultProfile, !oldDefaultProfileESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetDefaultProfile() {
        boolean oldDefaultProfile = defaultProfile;
        boolean oldDefaultProfileESet = defaultProfileESet;
        defaultProfile = DEFAULT_PROFILE_EDEFAULT;
        defaultProfileESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.THREAD_POOL_PROFILE_DEFINITION__DEFAULT_PROFILE, oldDefaultProfile, DEFAULT_PROFILE_EDEFAULT, oldDefaultProfileESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetDefaultProfile() {
        return defaultProfileESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getKeepAliveTime() {
        return keepAliveTime;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setKeepAliveTime(String newKeepAliveTime) {
        String oldKeepAliveTime = keepAliveTime;
        keepAliveTime = newKeepAliveTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.THREAD_POOL_PROFILE_DEFINITION__KEEP_ALIVE_TIME, oldKeepAliveTime, keepAliveTime));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getMaxPoolSize() {
        return maxPoolSize;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMaxPoolSize(String newMaxPoolSize) {
        String oldMaxPoolSize = maxPoolSize;
        maxPoolSize = newMaxPoolSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_POOL_SIZE, oldMaxPoolSize, maxPoolSize));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getMaxQueueSize() {
        return maxQueueSize;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMaxQueueSize(String newMaxQueueSize) {
        String oldMaxQueueSize = maxQueueSize;
        maxQueueSize = newMaxQueueSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_QUEUE_SIZE, oldMaxQueueSize, maxQueueSize));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getPoolSize() {
        return poolSize;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPoolSize(String newPoolSize) {
        String oldPoolSize = poolSize;
        poolSize = newPoolSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.THREAD_POOL_PROFILE_DEFINITION__POOL_SIZE, oldPoolSize, poolSize));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.THREAD_POOL_PROFILE_DEFINITION__REJECTED_POLICY, oldRejectedPolicy, rejectedPolicy, !oldRejectedPolicyESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.THREAD_POOL_PROFILE_DEFINITION__REJECTED_POLICY, oldRejectedPolicy, REJECTED_POLICY_EDEFAULT, oldRejectedPolicyESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__TIME_UNIT:
                return getTimeUnit();
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__DEFAULT_PROFILE:
                return isDefaultProfile();
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__KEEP_ALIVE_TIME:
                return getKeepAliveTime();
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_POOL_SIZE:
                return getMaxPoolSize();
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_QUEUE_SIZE:
                return getMaxQueueSize();
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__POOL_SIZE:
                return getPoolSize();
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__REJECTED_POLICY:
                return getRejectedPolicy();
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
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__TIME_UNIT:
                setTimeUnit((String)newValue);
                return;
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__DEFAULT_PROFILE:
                setDefaultProfile((Boolean)newValue);
                return;
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__KEEP_ALIVE_TIME:
                setKeepAliveTime((String)newValue);
                return;
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_POOL_SIZE:
                setMaxPoolSize((String)newValue);
                return;
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_QUEUE_SIZE:
                setMaxQueueSize((String)newValue);
                return;
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__POOL_SIZE:
                setPoolSize((String)newValue);
                return;
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__REJECTED_POLICY:
                setRejectedPolicy((ThreadPoolRejectedPolicy)newValue);
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
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__TIME_UNIT:
                setTimeUnit(TIME_UNIT_EDEFAULT);
                return;
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__DEFAULT_PROFILE:
                unsetDefaultProfile();
                return;
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__KEEP_ALIVE_TIME:
                setKeepAliveTime(KEEP_ALIVE_TIME_EDEFAULT);
                return;
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_POOL_SIZE:
                setMaxPoolSize(MAX_POOL_SIZE_EDEFAULT);
                return;
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_QUEUE_SIZE:
                setMaxQueueSize(MAX_QUEUE_SIZE_EDEFAULT);
                return;
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__POOL_SIZE:
                setPoolSize(POOL_SIZE_EDEFAULT);
                return;
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__REJECTED_POLICY:
                unsetRejectedPolicy();
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
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__TIME_UNIT:
                return TIME_UNIT_EDEFAULT == null ? timeUnit != null : !TIME_UNIT_EDEFAULT.equals(timeUnit);
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__DEFAULT_PROFILE:
                return isSetDefaultProfile();
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__KEEP_ALIVE_TIME:
                return KEEP_ALIVE_TIME_EDEFAULT == null ? keepAliveTime != null : !KEEP_ALIVE_TIME_EDEFAULT.equals(keepAliveTime);
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_POOL_SIZE:
                return MAX_POOL_SIZE_EDEFAULT == null ? maxPoolSize != null : !MAX_POOL_SIZE_EDEFAULT.equals(maxPoolSize);
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_QUEUE_SIZE:
                return MAX_QUEUE_SIZE_EDEFAULT == null ? maxQueueSize != null : !MAX_QUEUE_SIZE_EDEFAULT.equals(maxQueueSize);
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__POOL_SIZE:
                return POOL_SIZE_EDEFAULT == null ? poolSize != null : !POOL_SIZE_EDEFAULT.equals(poolSize);
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION__REJECTED_POLICY:
                return isSetRejectedPolicy();
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
        result.append(" (timeUnit: ");
        result.append(timeUnit);
        result.append(", defaultProfile: ");
        if (defaultProfileESet) result.append(defaultProfile); else result.append("<unset>");
        result.append(", keepAliveTime: ");
        result.append(keepAliveTime);
        result.append(", maxPoolSize: ");
        result.append(maxPoolSize);
        result.append(", maxQueueSize: ");
        result.append(maxQueueSize);
        result.append(", poolSize: ");
        result.append(poolSize);
        result.append(", rejectedPolicy: ");
        if (rejectedPolicyESet) result.append(rejectedPolicy); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ThreadPoolProfileDefinitionImpl
