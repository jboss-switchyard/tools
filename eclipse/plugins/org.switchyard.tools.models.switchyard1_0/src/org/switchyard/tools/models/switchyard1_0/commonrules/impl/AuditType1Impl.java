/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.commonrules.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;
import org.switchyard.tools.models.switchyard1_0.commonrules.AuditType;

import org.switchyard.tools.models.switchyard1_0.commonrules.AuditType1;
import org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.AuditType1Impl#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.AuditType1Impl#getLog <em>Log</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.AuditType1Impl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AuditType1Impl extends CommonExtensionBaseImpl implements AuditType1 {
    /**
     * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterval()
     * @generated
     * @ordered
     */
    protected static final int INTERVAL_EDEFAULT = 1000;
    /**
     * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterval()
     * @generated
     * @ordered
     */
    protected int interval = INTERVAL_EDEFAULT;
    /**
     * The default value of the '{@link #getLog() <em>Log</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLog()
     * @generated
     * @ordered
     */
    protected static final String LOG_EDEFAULT = "event";
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
    protected static final AuditType TYPE_EDEFAULT = AuditType.THREADEDFILE;
    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected AuditType type = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AuditType1Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CommonRulesPackage.Literals.AUDIT_TYPE1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getInterval() {
        return interval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInterval(int newInterval) {
        int oldInterval = interval;
        interval = newInterval;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CommonRulesPackage.AUDIT_TYPE1__INTERVAL, oldInterval, interval));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CommonRulesPackage.AUDIT_TYPE1__LOG, oldLog, log));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AuditType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(AuditType newType) {
        AuditType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CommonRulesPackage.AUDIT_TYPE1__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CommonRulesPackage.AUDIT_TYPE1__INTERVAL:
                return getInterval();
            case CommonRulesPackage.AUDIT_TYPE1__LOG:
                return getLog();
            case CommonRulesPackage.AUDIT_TYPE1__TYPE:
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
            case CommonRulesPackage.AUDIT_TYPE1__INTERVAL:
                setInterval((Integer)newValue);
                return;
            case CommonRulesPackage.AUDIT_TYPE1__LOG:
                setLog((String)newValue);
                return;
            case CommonRulesPackage.AUDIT_TYPE1__TYPE:
                setType((AuditType)newValue);
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
            case CommonRulesPackage.AUDIT_TYPE1__INTERVAL:
                setInterval(INTERVAL_EDEFAULT);
                return;
            case CommonRulesPackage.AUDIT_TYPE1__LOG:
                setLog(LOG_EDEFAULT);
                return;
            case CommonRulesPackage.AUDIT_TYPE1__TYPE:
                setType(TYPE_EDEFAULT);
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
            case CommonRulesPackage.AUDIT_TYPE1__INTERVAL:
                return interval != INTERVAL_EDEFAULT;
            case CommonRulesPackage.AUDIT_TYPE1__LOG:
                return LOG_EDEFAULT == null ? log != null : !LOG_EDEFAULT.equals(log);
            case CommonRulesPackage.AUDIT_TYPE1__TYPE:
                return type != TYPE_EDEFAULT;
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
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //AuditType1Impl
