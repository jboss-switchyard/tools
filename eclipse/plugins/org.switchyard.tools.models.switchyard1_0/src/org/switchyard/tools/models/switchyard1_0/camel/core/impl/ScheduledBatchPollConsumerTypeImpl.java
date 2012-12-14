/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.core.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.core.ScheduledBatchPollConsumerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduled Batch Poll Consumer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.ScheduledBatchPollConsumerTypeImpl#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScheduledBatchPollConsumerTypeImpl extends ScheduledPollConsumerTypeImpl implements ScheduledBatchPollConsumerType {
    /**
     * The default value of the '{@link #getMaxMessagesPerPoll() <em>Max Messages Per Poll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxMessagesPerPoll()
     * @generated
     * @ordered
     */
    protected static final Integer MAX_MESSAGES_PER_POLL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxMessagesPerPoll() <em>Max Messages Per Poll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxMessagesPerPoll()
     * @generated
     * @ordered
     */
    protected Integer maxMessagesPerPoll = MAX_MESSAGES_PER_POLL_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScheduledBatchPollConsumerTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CamelPackage.Literals.SCHEDULED_BATCH_POLL_CONSUMER_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getMaxMessagesPerPoll() {
        return maxMessagesPerPoll;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxMessagesPerPoll(Integer newMaxMessagesPerPoll) {
        Integer oldMaxMessagesPerPoll = maxMessagesPerPoll;
        maxMessagesPerPoll = newMaxMessagesPerPoll;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL, oldMaxMessagesPerPoll, maxMessagesPerPoll));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                return getMaxMessagesPerPoll();
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
            case CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                setMaxMessagesPerPoll((Integer)newValue);
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
            case CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                setMaxMessagesPerPoll(MAX_MESSAGES_PER_POLL_EDEFAULT);
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
            case CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
                return MAX_MESSAGES_PER_POLL_EDEFAULT == null ? maxMessagesPerPoll != null : !MAX_MESSAGES_PER_POLL_EDEFAULT.equals(maxMessagesPerPoll);
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
        result.append(" (maxMessagesPerPoll: ");
        result.append(maxMessagesPerPoll);
        result.append(')');
        return result.toString();
    }

} //ScheduledBatchPollConsumerTypeImpl
