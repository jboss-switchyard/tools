/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.CamelQuartzBindingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quartz Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelQuartzBindingTypeImpl#getCamelBindingName <em>Camel Binding Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelQuartzBindingTypeImpl#getCron <em>Cron</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelQuartzBindingTypeImpl#getStateful <em>Stateful</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelQuartzBindingTypeImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelQuartzBindingTypeImpl#getEndTime <em>End Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelQuartzBindingTypeImpl extends BaseCamelBindingImpl implements CamelQuartzBindingType {
    /**
     * The default value of the '{@link #getCamelBindingName() <em>Camel Binding Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCamelBindingName()
     * @generated
     * @ordered
     */
    protected static final String CAMEL_BINDING_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCamelBindingName() <em>Camel Binding Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCamelBindingName()
     * @generated
     * @ordered
     */
    protected String camelBindingName = CAMEL_BINDING_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getCron() <em>Cron</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCron()
     * @generated
     * @ordered
     */
    protected static final String CRON_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCron() <em>Cron</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCron()
     * @generated
     * @ordered
     */
    protected String cron = CRON_EDEFAULT;

    /**
     * The default value of the '{@link #getStateful() <em>Stateful</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStateful()
     * @generated
     * @ordered
     */
    protected static final Boolean STATEFUL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStateful() <em>Stateful</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStateful()
     * @generated
     * @ordered
     */
    protected Boolean stateful = STATEFUL_EDEFAULT;

    /**
     * This is true if the Stateful attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean statefulESet;

    /**
     * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartTime()
     * @generated
     * @ordered
     */
    protected static final XMLGregorianCalendar START_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartTime()
     * @generated
     * @ordered
     */
    protected XMLGregorianCalendar startTime = START_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndTime()
     * @generated
     * @ordered
     */
    protected static final XMLGregorianCalendar END_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndTime()
     * @generated
     * @ordered
     */
    protected XMLGregorianCalendar endTime = END_TIME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelQuartzBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CamelPackage.Literals.CAMEL_QUARTZ_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCamelBindingName() {
        return camelBindingName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCamelBindingName(String newCamelBindingName) {
        String oldCamelBindingName = camelBindingName;
        camelBindingName = newCamelBindingName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__CAMEL_BINDING_NAME, oldCamelBindingName, camelBindingName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCron() {
        return cron;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCron(String newCron) {
        String oldCron = cron;
        cron = newCron;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__CRON, oldCron, cron));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getStateful() {
        return stateful;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStateful(Boolean newStateful) {
        Boolean oldStateful = stateful;
        stateful = newStateful;
        boolean oldStatefulESet = statefulESet;
        statefulESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__STATEFUL, oldStateful, stateful, !oldStatefulESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetStateful() {
        Boolean oldStateful = stateful;
        boolean oldStatefulESet = statefulESet;
        stateful = STATEFUL_EDEFAULT;
        statefulESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__STATEFUL, oldStateful, STATEFUL_EDEFAULT, oldStatefulESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetStateful() {
        return statefulESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStartTime(XMLGregorianCalendar newStartTime) {
        XMLGregorianCalendar oldStartTime = startTime;
        startTime = newStartTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__START_TIME, oldStartTime, startTime));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEndTime(XMLGregorianCalendar newEndTime) {
        XMLGregorianCalendar oldEndTime = endTime;
        endTime = newEndTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__END_TIME, oldEndTime, endTime));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__CAMEL_BINDING_NAME:
                return getCamelBindingName();
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__CRON:
                return getCron();
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__STATEFUL:
                return getStateful();
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__START_TIME:
                return getStartTime();
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__END_TIME:
                return getEndTime();
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
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__CAMEL_BINDING_NAME:
                setCamelBindingName((String)newValue);
                return;
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__CRON:
                setCron((String)newValue);
                return;
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__STATEFUL:
                setStateful((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__START_TIME:
                setStartTime((XMLGregorianCalendar)newValue);
                return;
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__END_TIME:
                setEndTime((XMLGregorianCalendar)newValue);
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
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__CAMEL_BINDING_NAME:
                setCamelBindingName(CAMEL_BINDING_NAME_EDEFAULT);
                return;
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__CRON:
                setCron(CRON_EDEFAULT);
                return;
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__STATEFUL:
                unsetStateful();
                return;
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__START_TIME:
                setStartTime(START_TIME_EDEFAULT);
                return;
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__END_TIME:
                setEndTime(END_TIME_EDEFAULT);
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
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__CAMEL_BINDING_NAME:
                return CAMEL_BINDING_NAME_EDEFAULT == null ? camelBindingName != null : !CAMEL_BINDING_NAME_EDEFAULT.equals(camelBindingName);
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__CRON:
                return CRON_EDEFAULT == null ? cron != null : !CRON_EDEFAULT.equals(cron);
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__STATEFUL:
                return isSetStateful();
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__START_TIME:
                return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
            case CamelPackage.CAMEL_QUARTZ_BINDING_TYPE__END_TIME:
                return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
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
        result.append(" (camelBindingName: ");
        result.append(camelBindingName);
        result.append(", cron: ");
        result.append(cron);
        result.append(", stateful: ");
        if (statefulESet) result.append(stateful); else result.append("<unset>");
        result.append(", startTime: ");
        result.append(startTime);
        result.append(", endTime: ");
        result.append(endTime);
        result.append(')');
        return result.toString();
    }

} //CamelQuartzBindingTypeImpl
