/**
 */
package org.switchyard.tools.models.switchyard1_0.rules.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;

import org.switchyard.tools.models.switchyard1_0.rules.LoggerType;
import org.switchyard.tools.models.switchyard1_0.rules.LoggerType1;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logger Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.LoggerType1Impl#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.LoggerType1Impl#getLog <em>Log</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.LoggerType1Impl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoggerType1Impl extends CommonExtensionBaseImpl implements LoggerType1 {
    /**
     * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterval()
     * @generated
     * @ordered
     */
    protected static final BigInteger INTERVAL_EDEFAULT = new BigInteger("1000");

    /**
     * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterval()
     * @generated
     * @ordered
     */
    protected BigInteger interval = INTERVAL_EDEFAULT;

    /**
     * The default value of the '{@link #getLog() <em>Log</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLog()
     * @generated
     * @ordered
     */
    protected static final String LOG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLog() <em>Log</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLog()
     * @generated
     * @ordered
     */
    protected String log = LOG_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final LoggerType TYPE_EDEFAULT = LoggerType.THREADEDFILE;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected LoggerType type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LoggerType1Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RulesPackage.Literals.LOGGER_TYPE1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getInterval() {
        return interval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInterval(BigInteger newInterval) {
        BigInteger oldInterval = interval;
        interval = newInterval;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.LOGGER_TYPE1__INTERVAL, oldInterval, interval));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLog() {
        return log;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLog(String newLog) {
        String oldLog = log;
        log = newLog;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.LOGGER_TYPE1__LOG, oldLog, log));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoggerType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(LoggerType newType) {
        LoggerType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.LOGGER_TYPE1__TYPE, oldType, type, !oldTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetType() {
        LoggerType oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, RulesPackage.LOGGER_TYPE1__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RulesPackage.LOGGER_TYPE1__INTERVAL:
                return getInterval();
            case RulesPackage.LOGGER_TYPE1__LOG:
                return getLog();
            case RulesPackage.LOGGER_TYPE1__TYPE:
                return getType();
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
            case RulesPackage.LOGGER_TYPE1__INTERVAL:
                setInterval((BigInteger)newValue);
                return;
            case RulesPackage.LOGGER_TYPE1__LOG:
                setLog((String)newValue);
                return;
            case RulesPackage.LOGGER_TYPE1__TYPE:
                setType((LoggerType)newValue);
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
            case RulesPackage.LOGGER_TYPE1__INTERVAL:
                setInterval(INTERVAL_EDEFAULT);
                return;
            case RulesPackage.LOGGER_TYPE1__LOG:
                setLog(LOG_EDEFAULT);
                return;
            case RulesPackage.LOGGER_TYPE1__TYPE:
                unsetType();
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
            case RulesPackage.LOGGER_TYPE1__INTERVAL:
                return INTERVAL_EDEFAULT == null ? interval != null : !INTERVAL_EDEFAULT.equals(interval);
            case RulesPackage.LOGGER_TYPE1__LOG:
                return LOG_EDEFAULT == null ? log != null : !LOG_EDEFAULT.equals(log);
            case RulesPackage.LOGGER_TYPE1__TYPE:
                return isSetType();
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
        result.append(" (interval: ");
        result.append(interval);
        result.append(", log: ");
        result.append(log);
        result.append(", type: ");
        if (typeESet) result.append(type); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //LoggerType1Impl
