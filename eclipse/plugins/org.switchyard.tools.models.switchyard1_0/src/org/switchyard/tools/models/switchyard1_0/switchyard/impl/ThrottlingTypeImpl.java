/**
 */
package org.switchyard.tools.models.switchyard1_0.switchyard.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.ThrottlingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Throttling Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ThrottlingTypeImpl#getMaxRequests <em>Max Requests</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.ThrottlingTypeImpl#getTimePeriod <em>Time Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThrottlingTypeImpl extends EObjectImpl implements ThrottlingType {
    /**
     * The default value of the '{@link #getMaxRequests() <em>Max Requests</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxRequests()
     * @generated
     * @ordered
     */
    protected static final Object MAX_REQUESTS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxRequests() <em>Max Requests</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxRequests()
     * @generated
     * @ordered
     */
    protected Object maxRequests = MAX_REQUESTS_EDEFAULT;

    /**
     * The default value of the '{@link #getTimePeriod() <em>Time Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimePeriod()
     * @generated
     * @ordered
     */
    protected static final Object TIME_PERIOD_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropLong(), "1000");

    /**
     * The cached value of the '{@link #getTimePeriod() <em>Time Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimePeriod()
     * @generated
     * @ordered
     */
    protected Object timePeriod = TIME_PERIOD_EDEFAULT;

    /**
     * This is true if the Time Period attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timePeriodESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ThrottlingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SwitchyardPackage.Literals.THROTTLING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getMaxRequests() {
        return maxRequests;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxRequests(Object newMaxRequests) {
        Object oldMaxRequests = maxRequests;
        maxRequests = newMaxRequests;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.THROTTLING_TYPE__MAX_REQUESTS, oldMaxRequests, maxRequests));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTimePeriod() {
        return timePeriod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimePeriod(Object newTimePeriod) {
        Object oldTimePeriod = timePeriod;
        timePeriod = newTimePeriod;
        boolean oldTimePeriodESet = timePeriodESet;
        timePeriodESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.THROTTLING_TYPE__TIME_PERIOD, oldTimePeriod, timePeriod, !oldTimePeriodESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTimePeriod() {
        Object oldTimePeriod = timePeriod;
        boolean oldTimePeriodESet = timePeriodESet;
        timePeriod = TIME_PERIOD_EDEFAULT;
        timePeriodESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SwitchyardPackage.THROTTLING_TYPE__TIME_PERIOD, oldTimePeriod, TIME_PERIOD_EDEFAULT, oldTimePeriodESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTimePeriod() {
        return timePeriodESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SwitchyardPackage.THROTTLING_TYPE__MAX_REQUESTS:
                return getMaxRequests();
            case SwitchyardPackage.THROTTLING_TYPE__TIME_PERIOD:
                return getTimePeriod();
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
            case SwitchyardPackage.THROTTLING_TYPE__MAX_REQUESTS:
                setMaxRequests(newValue);
                return;
            case SwitchyardPackage.THROTTLING_TYPE__TIME_PERIOD:
                setTimePeriod(newValue);
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
            case SwitchyardPackage.THROTTLING_TYPE__MAX_REQUESTS:
                setMaxRequests(MAX_REQUESTS_EDEFAULT);
                return;
            case SwitchyardPackage.THROTTLING_TYPE__TIME_PERIOD:
                unsetTimePeriod();
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
            case SwitchyardPackage.THROTTLING_TYPE__MAX_REQUESTS:
                return MAX_REQUESTS_EDEFAULT == null ? maxRequests != null : !MAX_REQUESTS_EDEFAULT.equals(maxRequests);
            case SwitchyardPackage.THROTTLING_TYPE__TIME_PERIOD:
                return isSetTimePeriod();
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
        result.append(" (maxRequests: ");
        result.append(maxRequests);
        result.append(", timePeriod: ");
        if (timePeriodESet) result.append(timePeriod); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ThrottlingTypeImpl
