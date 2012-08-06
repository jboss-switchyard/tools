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
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardBindingTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl#getNameElement <em>Name Element</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl#isFixedRate <em>Fixed Rate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl#isDaemon <em>Daemon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelTimerBindingTypeImpl extends SwitchYardBindingTypeImpl implements CamelTimerBindingType {
	/**
     * The default value of the '{@link #getNameElement() <em>Name Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNameElement()
     * @generated
     * @ordered
     */
    protected static final String NAME_ELEMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNameElement() <em>Name Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNameElement()
     * @generated
     * @ordered
     */
    protected String nameElement = NAME_ELEMENT_EDEFAULT;

    /**
     * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTime()
     * @generated
     * @ordered
     */
	protected static final XMLGregorianCalendar TIME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTime()
     * @generated
     * @ordered
     */
	protected XMLGregorianCalendar time = TIME_EDEFAULT;

	/**
     * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPattern()
     * @generated
     * @ordered
     */
	protected static final String PATTERN_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPattern()
     * @generated
     * @ordered
     */
	protected String pattern = PATTERN_EDEFAULT;

	/**
     * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPeriod()
     * @generated
     * @ordered
     */
	protected static final long PERIOD_EDEFAULT = 0L;

	/**
     * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPeriod()
     * @generated
     * @ordered
     */
	protected long period = PERIOD_EDEFAULT;

	/**
     * This is true if the Period attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean periodESet;

	/**
     * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
	protected static final long DELAY_EDEFAULT = 0L;

	/**
     * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
	protected long delay = DELAY_EDEFAULT;

	/**
     * This is true if the Delay attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean delayESet;

	/**
     * The default value of the '{@link #isFixedRate() <em>Fixed Rate</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isFixedRate()
     * @generated
     * @ordered
     */
	protected static final boolean FIXED_RATE_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isFixedRate() <em>Fixed Rate</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isFixedRate()
     * @generated
     * @ordered
     */
	protected boolean fixedRate = FIXED_RATE_EDEFAULT;

	/**
     * This is true if the Fixed Rate attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean fixedRateESet;

	/**
     * The default value of the '{@link #isDaemon() <em>Daemon</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isDaemon()
     * @generated
     * @ordered
     */
	protected static final boolean DAEMON_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isDaemon() <em>Daemon</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isDaemon()
     * @generated
     * @ordered
     */
	protected boolean daemon = DAEMON_EDEFAULT;

	/**
     * This is true if the Daemon attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean daemonESet;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CamelTimerBindingTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return CamelPackage.Literals.CAMEL_TIMER_BINDING_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNameElement() {
        return nameElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNameElement(String newNameElement) {
        String oldNameElement = nameElement;
        nameElement = newNameElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_TIMER_BINDING_TYPE__NAME_ELEMENT, oldNameElement, nameElement));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public XMLGregorianCalendar getTime() {
        return time;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTime(XMLGregorianCalendar newTime) {
        XMLGregorianCalendar oldTime = time;
        time = newTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_TIMER_BINDING_TYPE__TIME, oldTime, time));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getPattern() {
        return pattern;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPattern(String newPattern) {
        String oldPattern = pattern;
        pattern = newPattern;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_TIMER_BINDING_TYPE__PATTERN, oldPattern, pattern));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public long getPeriod() {
        return period;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPeriod(long newPeriod) {
        long oldPeriod = period;
        period = newPeriod;
        boolean oldPeriodESet = periodESet;
        periodESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_TIMER_BINDING_TYPE__PERIOD, oldPeriod, period, !oldPeriodESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetPeriod() {
        long oldPeriod = period;
        boolean oldPeriodESet = periodESet;
        period = PERIOD_EDEFAULT;
        periodESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_TIMER_BINDING_TYPE__PERIOD, oldPeriod, PERIOD_EDEFAULT, oldPeriodESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetPeriod() {
        return periodESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public long getDelay() {
        return delay;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDelay(long newDelay) {
        long oldDelay = delay;
        delay = newDelay;
        boolean oldDelayESet = delayESet;
        delayESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_TIMER_BINDING_TYPE__DELAY, oldDelay, delay, !oldDelayESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetDelay() {
        long oldDelay = delay;
        boolean oldDelayESet = delayESet;
        delay = DELAY_EDEFAULT;
        delayESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_TIMER_BINDING_TYPE__DELAY, oldDelay, DELAY_EDEFAULT, oldDelayESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetDelay() {
        return delayESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isFixedRate() {
        return fixedRate;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFixedRate(boolean newFixedRate) {
        boolean oldFixedRate = fixedRate;
        fixedRate = newFixedRate;
        boolean oldFixedRateESet = fixedRateESet;
        fixedRateESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_TIMER_BINDING_TYPE__FIXED_RATE, oldFixedRate, fixedRate, !oldFixedRateESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetFixedRate() {
        boolean oldFixedRate = fixedRate;
        boolean oldFixedRateESet = fixedRateESet;
        fixedRate = FIXED_RATE_EDEFAULT;
        fixedRateESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_TIMER_BINDING_TYPE__FIXED_RATE, oldFixedRate, FIXED_RATE_EDEFAULT, oldFixedRateESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetFixedRate() {
        return fixedRateESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isDaemon() {
        return daemon;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDaemon(boolean newDaemon) {
        boolean oldDaemon = daemon;
        daemon = newDaemon;
        boolean oldDaemonESet = daemonESet;
        daemonESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.CAMEL_TIMER_BINDING_TYPE__DAEMON, oldDaemon, daemon, !oldDaemonESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetDaemon() {
        boolean oldDaemon = daemon;
        boolean oldDaemonESet = daemonESet;
        daemon = DAEMON_EDEFAULT;
        daemonESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.CAMEL_TIMER_BINDING_TYPE__DAEMON, oldDaemon, DAEMON_EDEFAULT, oldDaemonESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetDaemon() {
        return daemonESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__NAME_ELEMENT:
                return getNameElement();
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__TIME:
                return getTime();
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__PATTERN:
                return getPattern();
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__PERIOD:
                return getPeriod();
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__DELAY:
                return getDelay();
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__FIXED_RATE:
                return isFixedRate();
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__DAEMON:
                return isDaemon();
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
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__NAME_ELEMENT:
                setNameElement((String)newValue);
                return;
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__TIME:
                setTime((XMLGregorianCalendar)newValue);
                return;
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__PATTERN:
                setPattern((String)newValue);
                return;
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__PERIOD:
                setPeriod((Long)newValue);
                return;
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__DELAY:
                setDelay((Long)newValue);
                return;
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__FIXED_RATE:
                setFixedRate((Boolean)newValue);
                return;
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__DAEMON:
                setDaemon((Boolean)newValue);
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
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__NAME_ELEMENT:
                setNameElement(NAME_ELEMENT_EDEFAULT);
                return;
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__TIME:
                setTime(TIME_EDEFAULT);
                return;
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__PATTERN:
                setPattern(PATTERN_EDEFAULT);
                return;
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__PERIOD:
                unsetPeriod();
                return;
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__DELAY:
                unsetDelay();
                return;
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__FIXED_RATE:
                unsetFixedRate();
                return;
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__DAEMON:
                unsetDaemon();
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
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__NAME_ELEMENT:
                return NAME_ELEMENT_EDEFAULT == null ? nameElement != null : !NAME_ELEMENT_EDEFAULT.equals(nameElement);
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__TIME:
                return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__PATTERN:
                return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__PERIOD:
                return isSetPeriod();
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__DELAY:
                return isSetDelay();
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__FIXED_RATE:
                return isSetFixedRate();
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE__DAEMON:
                return isSetDaemon();
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
        result.append(" (nameElement: ");
        result.append(nameElement);
        result.append(", time: ");
        result.append(time);
        result.append(", pattern: ");
        result.append(pattern);
        result.append(", period: ");
        if (periodESet) result.append(period); else result.append("<unset>");
        result.append(", delay: ");
        if (delayESet) result.append(delay); else result.append("<unset>");
        result.append(", fixedRate: ");
        if (fixedRateESet) result.append(fixedRate); else result.append("<unset>");
        result.append(", daemon: ");
        if (daemonESet) result.append(daemon); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

    @Override
    public EStructuralFeature getDocumentFeature() {
        return CamelPackage.eINSTANCE.getDocumentRoot_BindingTimer();
    }

} //CamelTimerBindingTypeImpl
