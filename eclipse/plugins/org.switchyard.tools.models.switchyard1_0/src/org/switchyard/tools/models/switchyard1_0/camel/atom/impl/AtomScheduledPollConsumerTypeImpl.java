/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.atom.impl;

import java.math.BigInteger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage;
import org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType;

import org.switchyard.tools.models.switchyard1_0.camel.atom.TimeUnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduled Poll Consumer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.impl.AtomScheduledPollConsumerTypeImpl#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.impl.AtomScheduledPollConsumerTypeImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.impl.AtomScheduledPollConsumerTypeImpl#getUseFixedDelay <em>Use Fixed Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.impl.AtomScheduledPollConsumerTypeImpl#getSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.atom.impl.AtomScheduledPollConsumerTypeImpl#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomScheduledPollConsumerTypeImpl extends EObjectImpl implements AtomScheduledPollConsumerType {
    /**
     * The default value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialDelay()
     * @generated
     * @ordered
     */
    protected static final Integer INITIAL_DELAY_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialDelay()
     * @generated
     * @ordered
     */
    protected Integer initialDelay = INITIAL_DELAY_EDEFAULT;
    /**
     * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
    protected static final Integer DELAY_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
    protected Integer delay = DELAY_EDEFAULT;
    /**
     * The default value of the '{@link #getUseFixedDelay() <em>Use Fixed Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUseFixedDelay()
     * @generated
     * @ordered
     */
    protected static final Boolean USE_FIXED_DELAY_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getUseFixedDelay() <em>Use Fixed Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUseFixedDelay()
     * @generated
     * @ordered
     */
    protected Boolean useFixedDelay = USE_FIXED_DELAY_EDEFAULT;
    /**
     * This is true if the Use Fixed Delay attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean useFixedDelayESet;
    /**
     * The default value of the '{@link #getSendEmptyMessageWhenIdle() <em>Send Empty Message When Idle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSendEmptyMessageWhenIdle()
     * @generated
     * @ordered
     */
    protected static final Boolean SEND_EMPTY_MESSAGE_WHEN_IDLE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getSendEmptyMessageWhenIdle() <em>Send Empty Message When Idle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSendEmptyMessageWhenIdle()
     * @generated
     * @ordered
     */
    protected Boolean sendEmptyMessageWhenIdle = SEND_EMPTY_MESSAGE_WHEN_IDLE_EDEFAULT;
    /**
     * This is true if the Send Empty Message When Idle attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sendEmptyMessageWhenIdleESet;
    /**
     * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeUnit()
     * @generated
     * @ordered
     */
    protected static final TimeUnitType TIME_UNIT_EDEFAULT = TimeUnitType.NANOSECONDS;
    /**
     * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeUnit()
     * @generated
     * @ordered
     */
    protected TimeUnitType timeUnit = TIME_UNIT_EDEFAULT;
    /**
     * This is true if the Time Unit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeUnitESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AtomScheduledPollConsumerTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AtomPackage.Literals.ATOM_SCHEDULED_POLL_CONSUMER_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getInitialDelay() {
        return initialDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitialDelay(Integer newInitialDelay) {
        Integer oldInitialDelay = initialDelay;
        initialDelay = newInitialDelay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__INITIAL_DELAY, oldInitialDelay, initialDelay));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getDelay() {
        return delay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDelay(Integer newDelay) {
        Integer oldDelay = delay;
        delay = newDelay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__DELAY, oldDelay, delay));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getUseFixedDelay() {
        return useFixedDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUseFixedDelay(Boolean newUseFixedDelay) {
        Boolean oldUseFixedDelay = useFixedDelay;
        useFixedDelay = newUseFixedDelay;
        boolean oldUseFixedDelayESet = useFixedDelayESet;
        useFixedDelayESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__USE_FIXED_DELAY, oldUseFixedDelay, useFixedDelay, !oldUseFixedDelayESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetUseFixedDelay() {
        Boolean oldUseFixedDelay = useFixedDelay;
        boolean oldUseFixedDelayESet = useFixedDelayESet;
        useFixedDelay = USE_FIXED_DELAY_EDEFAULT;
        useFixedDelayESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__USE_FIXED_DELAY, oldUseFixedDelay, USE_FIXED_DELAY_EDEFAULT, oldUseFixedDelayESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetUseFixedDelay() {
        return useFixedDelayESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getSendEmptyMessageWhenIdle() {
        return sendEmptyMessageWhenIdle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSendEmptyMessageWhenIdle(Boolean newSendEmptyMessageWhenIdle) {
        Boolean oldSendEmptyMessageWhenIdle = sendEmptyMessageWhenIdle;
        sendEmptyMessageWhenIdle = newSendEmptyMessageWhenIdle;
        boolean oldSendEmptyMessageWhenIdleESet = sendEmptyMessageWhenIdleESet;
        sendEmptyMessageWhenIdleESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE, oldSendEmptyMessageWhenIdle, sendEmptyMessageWhenIdle, !oldSendEmptyMessageWhenIdleESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSendEmptyMessageWhenIdle() {
        Boolean oldSendEmptyMessageWhenIdle = sendEmptyMessageWhenIdle;
        boolean oldSendEmptyMessageWhenIdleESet = sendEmptyMessageWhenIdleESet;
        sendEmptyMessageWhenIdle = SEND_EMPTY_MESSAGE_WHEN_IDLE_EDEFAULT;
        sendEmptyMessageWhenIdleESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE, oldSendEmptyMessageWhenIdle, SEND_EMPTY_MESSAGE_WHEN_IDLE_EDEFAULT, oldSendEmptyMessageWhenIdleESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSendEmptyMessageWhenIdle() {
        return sendEmptyMessageWhenIdleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeUnitType getTimeUnit() {
        return timeUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeUnit(TimeUnitType newTimeUnit) {
        TimeUnitType oldTimeUnit = timeUnit;
        timeUnit = newTimeUnit == null ? TIME_UNIT_EDEFAULT : newTimeUnit;
        boolean oldTimeUnitESet = timeUnitESet;
        timeUnitESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__TIME_UNIT, oldTimeUnit, timeUnit, !oldTimeUnitESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTimeUnit() {
        TimeUnitType oldTimeUnit = timeUnit;
        boolean oldTimeUnitESet = timeUnitESet;
        timeUnit = TIME_UNIT_EDEFAULT;
        timeUnitESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__TIME_UNIT, oldTimeUnit, TIME_UNIT_EDEFAULT, oldTimeUnitESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTimeUnit() {
        return timeUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__INITIAL_DELAY:
                return getInitialDelay();
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__DELAY:
                return getDelay();
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__USE_FIXED_DELAY:
                return getUseFixedDelay();
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
                return getSendEmptyMessageWhenIdle();
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__TIME_UNIT:
                return getTimeUnit();
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
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__INITIAL_DELAY:
                setInitialDelay((Integer)newValue);
                return;
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__DELAY:
                setDelay((Integer)newValue);
                return;
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__USE_FIXED_DELAY:
                setUseFixedDelay((Boolean)newValue);
                return;
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
                setSendEmptyMessageWhenIdle((Boolean)newValue);
                return;
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__TIME_UNIT:
                setTimeUnit((TimeUnitType)newValue);
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
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__INITIAL_DELAY:
                setInitialDelay(INITIAL_DELAY_EDEFAULT);
                return;
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__DELAY:
                setDelay(DELAY_EDEFAULT);
                return;
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__USE_FIXED_DELAY:
                unsetUseFixedDelay();
                return;
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
                unsetSendEmptyMessageWhenIdle();
                return;
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__TIME_UNIT:
                unsetTimeUnit();
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
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__INITIAL_DELAY:
                return INITIAL_DELAY_EDEFAULT == null ? initialDelay != null : !INITIAL_DELAY_EDEFAULT.equals(initialDelay);
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__DELAY:
                return DELAY_EDEFAULT == null ? delay != null : !DELAY_EDEFAULT.equals(delay);
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__USE_FIXED_DELAY:
                return isSetUseFixedDelay();
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
                return isSetSendEmptyMessageWhenIdle();
            case AtomPackage.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__TIME_UNIT:
                return isSetTimeUnit();
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
        result.append(" (initialDelay: ");
        result.append(initialDelay);
        result.append(", delay: ");
        result.append(delay);
        result.append(", useFixedDelay: ");
        if (useFixedDelayESet) result.append(useFixedDelay); else result.append("<unset>");
        result.append(", sendEmptyMessageWhenIdle: ");
        if (sendEmptyMessageWhenIdleESet) result.append(sendEmptyMessageWhenIdle); else result.append("<unset>");
        result.append(", timeUnit: ");
        if (timeUnitESet) result.append(timeUnit); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //AtomScheduledPollConsumerTypeImpl
