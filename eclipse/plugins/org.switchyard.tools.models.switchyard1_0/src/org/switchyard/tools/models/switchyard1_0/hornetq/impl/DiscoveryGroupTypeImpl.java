/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.hornetq.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.switchyard.tools.models.switchyard1_0.hornetq.DiscoveryGroupType;
import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discovery Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.DiscoveryGroupTypeImpl#getLocalBindAddress <em>Local Bind Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.DiscoveryGroupTypeImpl#getGroupAddress <em>Group Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.DiscoveryGroupTypeImpl#getGroupPort <em>Group Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.DiscoveryGroupTypeImpl#getRefreshTimeout <em>Refresh Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.DiscoveryGroupTypeImpl#getInitialWaitTimeout <em>Initial Wait Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscoveryGroupTypeImpl extends EObjectImpl implements DiscoveryGroupType {
	/**
     * The default value of the '{@link #getLocalBindAddress() <em>Local Bind Address</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLocalBindAddress()
     * @generated
     * @ordered
     */
	protected static final String LOCAL_BIND_ADDRESS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getLocalBindAddress() <em>Local Bind Address</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLocalBindAddress()
     * @generated
     * @ordered
     */
	protected String localBindAddress = LOCAL_BIND_ADDRESS_EDEFAULT;

	/**
     * The default value of the '{@link #getGroupAddress() <em>Group Address</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGroupAddress()
     * @generated
     * @ordered
     */
	protected static final String GROUP_ADDRESS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getGroupAddress() <em>Group Address</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGroupAddress()
     * @generated
     * @ordered
     */
	protected String groupAddress = GROUP_ADDRESS_EDEFAULT;

	/**
     * The default value of the '{@link #getGroupPort() <em>Group Port</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGroupPort()
     * @generated
     * @ordered
     */
	protected static final int GROUP_PORT_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getGroupPort() <em>Group Port</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGroupPort()
     * @generated
     * @ordered
     */
	protected int groupPort = GROUP_PORT_EDEFAULT;

	/**
     * This is true if the Group Port attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean groupPortESet;

	/**
     * The default value of the '{@link #getRefreshTimeout() <em>Refresh Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRefreshTimeout()
     * @generated
     * @ordered
     */
	protected static final long REFRESH_TIMEOUT_EDEFAULT = 0L;

	/**
     * The cached value of the '{@link #getRefreshTimeout() <em>Refresh Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRefreshTimeout()
     * @generated
     * @ordered
     */
	protected long refreshTimeout = REFRESH_TIMEOUT_EDEFAULT;

	/**
     * This is true if the Refresh Timeout attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean refreshTimeoutESet;

	/**
     * The default value of the '{@link #getInitialWaitTimeout() <em>Initial Wait Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInitialWaitTimeout()
     * @generated
     * @ordered
     */
	protected static final long INITIAL_WAIT_TIMEOUT_EDEFAULT = 0L;

	/**
     * The cached value of the '{@link #getInitialWaitTimeout() <em>Initial Wait Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInitialWaitTimeout()
     * @generated
     * @ordered
     */
	protected long initialWaitTimeout = INITIAL_WAIT_TIMEOUT_EDEFAULT;

	/**
     * This is true if the Initial Wait Timeout attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean initialWaitTimeoutESet;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected DiscoveryGroupTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return HornetQPackage.Literals.DISCOVERY_GROUP_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getLocalBindAddress() {
        return localBindAddress;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLocalBindAddress(String newLocalBindAddress) {
        String oldLocalBindAddress = localBindAddress;
        localBindAddress = newLocalBindAddress;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.DISCOVERY_GROUP_TYPE__LOCAL_BIND_ADDRESS, oldLocalBindAddress, localBindAddress));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getGroupAddress() {
        return groupAddress;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setGroupAddress(String newGroupAddress) {
        String oldGroupAddress = groupAddress;
        groupAddress = newGroupAddress;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.DISCOVERY_GROUP_TYPE__GROUP_ADDRESS, oldGroupAddress, groupAddress));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getGroupPort() {
        return groupPort;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setGroupPort(int newGroupPort) {
        int oldGroupPort = groupPort;
        groupPort = newGroupPort;
        boolean oldGroupPortESet = groupPortESet;
        groupPortESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.DISCOVERY_GROUP_TYPE__GROUP_PORT, oldGroupPort, groupPort, !oldGroupPortESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetGroupPort() {
        int oldGroupPort = groupPort;
        boolean oldGroupPortESet = groupPortESet;
        groupPort = GROUP_PORT_EDEFAULT;
        groupPortESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.DISCOVERY_GROUP_TYPE__GROUP_PORT, oldGroupPort, GROUP_PORT_EDEFAULT, oldGroupPortESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetGroupPort() {
        return groupPortESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public long getRefreshTimeout() {
        return refreshTimeout;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRefreshTimeout(long newRefreshTimeout) {
        long oldRefreshTimeout = refreshTimeout;
        refreshTimeout = newRefreshTimeout;
        boolean oldRefreshTimeoutESet = refreshTimeoutESet;
        refreshTimeoutESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.DISCOVERY_GROUP_TYPE__REFRESH_TIMEOUT, oldRefreshTimeout, refreshTimeout, !oldRefreshTimeoutESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetRefreshTimeout() {
        long oldRefreshTimeout = refreshTimeout;
        boolean oldRefreshTimeoutESet = refreshTimeoutESet;
        refreshTimeout = REFRESH_TIMEOUT_EDEFAULT;
        refreshTimeoutESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.DISCOVERY_GROUP_TYPE__REFRESH_TIMEOUT, oldRefreshTimeout, REFRESH_TIMEOUT_EDEFAULT, oldRefreshTimeoutESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetRefreshTimeout() {
        return refreshTimeoutESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public long getInitialWaitTimeout() {
        return initialWaitTimeout;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setInitialWaitTimeout(long newInitialWaitTimeout) {
        long oldInitialWaitTimeout = initialWaitTimeout;
        initialWaitTimeout = newInitialWaitTimeout;
        boolean oldInitialWaitTimeoutESet = initialWaitTimeoutESet;
        initialWaitTimeoutESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.DISCOVERY_GROUP_TYPE__INITIAL_WAIT_TIMEOUT, oldInitialWaitTimeout, initialWaitTimeout, !oldInitialWaitTimeoutESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetInitialWaitTimeout() {
        long oldInitialWaitTimeout = initialWaitTimeout;
        boolean oldInitialWaitTimeoutESet = initialWaitTimeoutESet;
        initialWaitTimeout = INITIAL_WAIT_TIMEOUT_EDEFAULT;
        initialWaitTimeoutESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HornetQPackage.DISCOVERY_GROUP_TYPE__INITIAL_WAIT_TIMEOUT, oldInitialWaitTimeout, INITIAL_WAIT_TIMEOUT_EDEFAULT, oldInitialWaitTimeoutESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetInitialWaitTimeout() {
        return initialWaitTimeoutESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case HornetQPackage.DISCOVERY_GROUP_TYPE__LOCAL_BIND_ADDRESS:
                return getLocalBindAddress();
            case HornetQPackage.DISCOVERY_GROUP_TYPE__GROUP_ADDRESS:
                return getGroupAddress();
            case HornetQPackage.DISCOVERY_GROUP_TYPE__GROUP_PORT:
                return getGroupPort();
            case HornetQPackage.DISCOVERY_GROUP_TYPE__REFRESH_TIMEOUT:
                return getRefreshTimeout();
            case HornetQPackage.DISCOVERY_GROUP_TYPE__INITIAL_WAIT_TIMEOUT:
                return getInitialWaitTimeout();
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
            case HornetQPackage.DISCOVERY_GROUP_TYPE__LOCAL_BIND_ADDRESS:
                setLocalBindAddress((String)newValue);
                return;
            case HornetQPackage.DISCOVERY_GROUP_TYPE__GROUP_ADDRESS:
                setGroupAddress((String)newValue);
                return;
            case HornetQPackage.DISCOVERY_GROUP_TYPE__GROUP_PORT:
                setGroupPort((Integer)newValue);
                return;
            case HornetQPackage.DISCOVERY_GROUP_TYPE__REFRESH_TIMEOUT:
                setRefreshTimeout((Long)newValue);
                return;
            case HornetQPackage.DISCOVERY_GROUP_TYPE__INITIAL_WAIT_TIMEOUT:
                setInitialWaitTimeout((Long)newValue);
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
            case HornetQPackage.DISCOVERY_GROUP_TYPE__LOCAL_BIND_ADDRESS:
                setLocalBindAddress(LOCAL_BIND_ADDRESS_EDEFAULT);
                return;
            case HornetQPackage.DISCOVERY_GROUP_TYPE__GROUP_ADDRESS:
                setGroupAddress(GROUP_ADDRESS_EDEFAULT);
                return;
            case HornetQPackage.DISCOVERY_GROUP_TYPE__GROUP_PORT:
                unsetGroupPort();
                return;
            case HornetQPackage.DISCOVERY_GROUP_TYPE__REFRESH_TIMEOUT:
                unsetRefreshTimeout();
                return;
            case HornetQPackage.DISCOVERY_GROUP_TYPE__INITIAL_WAIT_TIMEOUT:
                unsetInitialWaitTimeout();
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
            case HornetQPackage.DISCOVERY_GROUP_TYPE__LOCAL_BIND_ADDRESS:
                return LOCAL_BIND_ADDRESS_EDEFAULT == null ? localBindAddress != null : !LOCAL_BIND_ADDRESS_EDEFAULT.equals(localBindAddress);
            case HornetQPackage.DISCOVERY_GROUP_TYPE__GROUP_ADDRESS:
                return GROUP_ADDRESS_EDEFAULT == null ? groupAddress != null : !GROUP_ADDRESS_EDEFAULT.equals(groupAddress);
            case HornetQPackage.DISCOVERY_GROUP_TYPE__GROUP_PORT:
                return isSetGroupPort();
            case HornetQPackage.DISCOVERY_GROUP_TYPE__REFRESH_TIMEOUT:
                return isSetRefreshTimeout();
            case HornetQPackage.DISCOVERY_GROUP_TYPE__INITIAL_WAIT_TIMEOUT:
                return isSetInitialWaitTimeout();
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
        result.append(" (localBindAddress: ");
        result.append(localBindAddress);
        result.append(", groupAddress: ");
        result.append(groupAddress);
        result.append(", groupPort: ");
        if (groupPortESet) result.append(groupPort); else result.append("<unset>");
        result.append(", refreshTimeout: ");
        if (refreshTimeoutESet) result.append(refreshTimeout); else result.append("<unset>");
        result.append(", initialWaitTimeout: ");
        if (initialWaitTimeoutESet) result.append(initialWaitTimeout); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //DiscoveryGroupTypeImpl
