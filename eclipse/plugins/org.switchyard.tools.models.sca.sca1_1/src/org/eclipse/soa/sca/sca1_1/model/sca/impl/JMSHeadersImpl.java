/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.BindingProperty;
import org.eclipse.soa.sca.sca1_1.model.sca.DeliveryModeType;
import org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders;
import org.eclipse.soa.sca.sca1_1.model.sca.PriorityType;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JMS Headers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSHeadersImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSHeadersImpl#getDeliveryMode <em>Delivery Mode</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSHeadersImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSHeadersImpl#getTimeToLive <em>Time To Live</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSHeadersImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JMSHeadersImpl extends EObjectImpl implements JMSHeaders {
	/**
     * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProperty()
     * @generated
     * @ordered
     */
	protected EList<BindingProperty> property;

	/**
     * The default value of the '{@link #getDeliveryMode() <em>Delivery Mode</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDeliveryMode()
     * @generated
     * @ordered
     */
	protected static final DeliveryModeType DELIVERY_MODE_EDEFAULT = DeliveryModeType.PERSISTENT;

	/**
     * The cached value of the '{@link #getDeliveryMode() <em>Delivery Mode</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDeliveryMode()
     * @generated
     * @ordered
     */
	protected DeliveryModeType deliveryMode = DELIVERY_MODE_EDEFAULT;

	/**
     * This is true if the Delivery Mode attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean deliveryModeESet;

	/**
     * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
	protected static final PriorityType PRIORITY_EDEFAULT = PriorityType._0;

	/**
     * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
	protected PriorityType priority = PRIORITY_EDEFAULT;

	/**
     * This is true if the Priority attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean priorityESet;

	/**
     * The default value of the '{@link #getTimeToLive() <em>Time To Live</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTimeToLive()
     * @generated
     * @ordered
     */
	protected static final long TIME_TO_LIVE_EDEFAULT = 0L;

	/**
     * The cached value of the '{@link #getTimeToLive() <em>Time To Live</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTimeToLive()
     * @generated
     * @ordered
     */
	protected long timeToLive = TIME_TO_LIVE_EDEFAULT;

	/**
     * This is true if the Time To Live attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean timeToLiveESet;

	/**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected static final String TYPE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected String type = TYPE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected JMSHeadersImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getJMSHeaders();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<BindingProperty> getProperty() {
        if (property == null) {
            property = new EObjectContainmentEList<BindingProperty>(BindingProperty.class, this, ScaPackage.JMS_HEADERS__PROPERTY);
        }
        return property;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DeliveryModeType getDeliveryMode() {
        return deliveryMode;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDeliveryMode(DeliveryModeType newDeliveryMode) {
        DeliveryModeType oldDeliveryMode = deliveryMode;
        deliveryMode = newDeliveryMode == null ? DELIVERY_MODE_EDEFAULT : newDeliveryMode;
        boolean oldDeliveryModeESet = deliveryModeESet;
        deliveryModeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_HEADERS__DELIVERY_MODE, oldDeliveryMode, deliveryMode, !oldDeliveryModeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetDeliveryMode() {
        DeliveryModeType oldDeliveryMode = deliveryMode;
        boolean oldDeliveryModeESet = deliveryModeESet;
        deliveryMode = DELIVERY_MODE_EDEFAULT;
        deliveryModeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.JMS_HEADERS__DELIVERY_MODE, oldDeliveryMode, DELIVERY_MODE_EDEFAULT, oldDeliveryModeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetDeliveryMode() {
        return deliveryModeESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PriorityType getPriority() {
        return priority;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPriority(PriorityType newPriority) {
        PriorityType oldPriority = priority;
        priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
        boolean oldPriorityESet = priorityESet;
        priorityESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_HEADERS__PRIORITY, oldPriority, priority, !oldPriorityESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetPriority() {
        PriorityType oldPriority = priority;
        boolean oldPriorityESet = priorityESet;
        priority = PRIORITY_EDEFAULT;
        priorityESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.JMS_HEADERS__PRIORITY, oldPriority, PRIORITY_EDEFAULT, oldPriorityESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetPriority() {
        return priorityESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public long getTimeToLive() {
        return timeToLive;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTimeToLive(long newTimeToLive) {
        long oldTimeToLive = timeToLive;
        timeToLive = newTimeToLive;
        boolean oldTimeToLiveESet = timeToLiveESet;
        timeToLiveESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_HEADERS__TIME_TO_LIVE, oldTimeToLive, timeToLive, !oldTimeToLiveESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetTimeToLive() {
        long oldTimeToLive = timeToLive;
        boolean oldTimeToLiveESet = timeToLiveESet;
        timeToLive = TIME_TO_LIVE_EDEFAULT;
        timeToLiveESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.JMS_HEADERS__TIME_TO_LIVE, oldTimeToLive, TIME_TO_LIVE_EDEFAULT, oldTimeToLiveESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetTimeToLive() {
        return timeToLiveESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getType() {
        return type;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_HEADERS__TYPE, oldType, type));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScaPackage.JMS_HEADERS__PROPERTY:
                return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScaPackage.JMS_HEADERS__PROPERTY:
                return getProperty();
            case ScaPackage.JMS_HEADERS__DELIVERY_MODE:
                return getDeliveryMode();
            case ScaPackage.JMS_HEADERS__PRIORITY:
                return getPriority();
            case ScaPackage.JMS_HEADERS__TIME_TO_LIVE:
                return getTimeToLive();
            case ScaPackage.JMS_HEADERS__TYPE:
                return getType();
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
            case ScaPackage.JMS_HEADERS__PROPERTY:
                getProperty().clear();
                getProperty().addAll((Collection<? extends BindingProperty>)newValue);
                return;
            case ScaPackage.JMS_HEADERS__DELIVERY_MODE:
                setDeliveryMode((DeliveryModeType)newValue);
                return;
            case ScaPackage.JMS_HEADERS__PRIORITY:
                setPriority((PriorityType)newValue);
                return;
            case ScaPackage.JMS_HEADERS__TIME_TO_LIVE:
                setTimeToLive((Long)newValue);
                return;
            case ScaPackage.JMS_HEADERS__TYPE:
                setType((String)newValue);
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
            case ScaPackage.JMS_HEADERS__PROPERTY:
                getProperty().clear();
                return;
            case ScaPackage.JMS_HEADERS__DELIVERY_MODE:
                unsetDeliveryMode();
                return;
            case ScaPackage.JMS_HEADERS__PRIORITY:
                unsetPriority();
                return;
            case ScaPackage.JMS_HEADERS__TIME_TO_LIVE:
                unsetTimeToLive();
                return;
            case ScaPackage.JMS_HEADERS__TYPE:
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
            case ScaPackage.JMS_HEADERS__PROPERTY:
                return property != null && !property.isEmpty();
            case ScaPackage.JMS_HEADERS__DELIVERY_MODE:
                return isSetDeliveryMode();
            case ScaPackage.JMS_HEADERS__PRIORITY:
                return isSetPriority();
            case ScaPackage.JMS_HEADERS__TIME_TO_LIVE:
                return isSetTimeToLive();
            case ScaPackage.JMS_HEADERS__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
        result.append(" (deliveryMode: ");
        if (deliveryModeESet) result.append(deliveryMode); else result.append("<unset>");
        result.append(", priority: ");
        if (priorityESet) result.append(priority); else result.append("<unset>");
        result.append(", timeToLive: ");
        if (timeToLiveESet) result.append(timeToLive); else result.append("<unset>");
        result.append(", type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //JMSHeadersImpl
